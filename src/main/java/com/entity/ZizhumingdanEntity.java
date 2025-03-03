package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 资助名单
 *
 * @author 
 * @email
 */
@TableName("zizhumingdan")
public class ZizhumingdanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZizhumingdanEntity() {

	}

	public ZizhumingdanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 家庭
     */
    @TableField(value = "jiatingjingji_id")

    private Integer jiatingjingjiId;


    /**
     * 发放资金
     */
    @TableField(value = "zizhumingdan_money")

    private Double zizhumingdanMoney;


    /**
     * 资助详情
     */
    @TableField(value = "zizhumingdan_content")

    private String zizhumingdanContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：家庭
	 */
    public Integer getJiatingjingjiId() {
        return jiatingjingjiId;
    }


    /**
	 * 获取：家庭
	 */

    public void setJiatingjingjiId(Integer jiatingjingjiId) {
        this.jiatingjingjiId = jiatingjingjiId;
    }
    /**
	 * 设置：发放资金
	 */
    public Double getZizhumingdanMoney() {
        return zizhumingdanMoney;
    }


    /**
	 * 获取：发放资金
	 */

    public void setZizhumingdanMoney(Double zizhumingdanMoney) {
        this.zizhumingdanMoney = zizhumingdanMoney;
    }
    /**
	 * 设置：资助详情
	 */
    public String getZizhumingdanContent() {
        return zizhumingdanContent;
    }


    /**
	 * 获取：资助详情
	 */

    public void setZizhumingdanContent(String zizhumingdanContent) {
        this.zizhumingdanContent = zizhumingdanContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Zizhumingdan{" +
            "id=" + id +
            ", jiatingjingjiId=" + jiatingjingjiId +
            ", zizhumingdanMoney=" + zizhumingdanMoney +
            ", zizhumingdanContent=" + zizhumingdanContent +
            ", createTime=" + createTime +
        "}";
    }
}
