package com.huagongwuliu.waybillelectronic.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Transient;

//@Table(name = "tb_eway")
@Data
public class Waybill {

    @Id
    private String id;
    private String shipperName;//托运方
    private String shipperContact;//托运方联系人
    private String shipperPhone;//托运方 联系电话


    private String shiptoName;//收货方
    private String shiptoPhone;//收货方联系电话


    private String shipmentName; //装货人名称
    private String shipmentPhone;//装货人电话
    private String shipmentStarttime; //起运日期
    private String shipmentFromAddress; //起运地
    private String shipmentFromDetails; //起运地详细地址
    private String cityExpress; //城市配送
    private String shipmentToAddress;//目的地
    private String shipmentToDetails;//目的地详细地址


    private String carriageName;//承运人单位名称
    private String carriagePhone;//承运人联系电话
    private String carriageLicensekey;//承运人许可证号


    private String licensePlateNum;//车牌号码
    private String licensePlateColor;//车牌颜色
    private String roadTransportPermitNum;//车辆道路运输许可证号
    private String trailerNum;//挂车号
    private String trailerRoadRansportPermit;//挂车道路运输许可证
    private String canbodyNum;//罐体编号
    private String canbodyVolume;//罐体容积


    private String driverName;//司机姓名
    private String driverCertificate;//司机从业资格证
    private String driverPhone;//司机电话
    private String escortName;//押运员姓名
    private String escortPhone;//押运员电话
    private String escortCertificate;//押运员从业资格证


    private String goodsName;//危险货物名称
    private String unNum;//UN编号
    private String goodsType;//货物类别
    private String goodsPackingNorms;//包装规格
    private String goodsPackingType;//包装分类
    private String goodsNum;//货物数量
    private String goodsCompany;//货物单位


    private String dispatcherName;//调度人
    private String dispatcherDate;//调度日期
    private String remarks;//备注

    private String userId;//
    private String waybillCode;//电子运单编号
    private String status;//状态值


    private Integer shipperStatus;// = "0";//托运人状态
    private Integer shiptoStatus;// = "0";//收货人状态S
    private Integer carriageStatus ;//= "0";//承运人
    private Integer shipmentStatus ;//= "0";//装货人状态
    private Integer vehicleStatus;// = "0";//车辆状态
    private Integer goodsStatus ;//= "0";//货物状态
    private Integer addTime;//插入时间
    private Integer updateTime;//更新时间


    @Transient
    private String userCompanyName;// 认证用户公司名称

    @Transient
    private Long startTime;
    @Transient
    private Long endTime;
    @Transient
    public Integer pageNum;
    @Transient
    public Integer pageSize = 20;
    private String userPhone;

    @Transient
    @Column(name = "`type`")
    private  String isAuth;// 是否认证
    @Transient
    private  String isOfficeSealLicense;//是否上传公章授权书

    @Transient
    private  String electronicSealId;// 电子公章的id
    @Transient
    private  String electronicSealImage; //电子公章图片




}
