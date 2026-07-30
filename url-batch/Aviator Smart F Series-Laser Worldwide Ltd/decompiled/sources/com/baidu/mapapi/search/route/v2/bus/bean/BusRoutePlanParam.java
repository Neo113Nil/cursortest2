package com.baidu.mapapi.search.route.v2.bus.bean;

import com.baidu.ar.constants.HttpConstants;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.route.v2.bus.BusRoutePlanOption;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class BusRoutePlanParam extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(desc = "起点坐标", name = "origin", require = true)
    private String f7346a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(desc = "终点坐标", name = FirebaseAnalytics.Param.DESTINATION, require = true)
    private String f7347b;

    /* renamed from: c, reason: collision with root package name */
    @Properties(desc = "起点POI的uid", name = "origin_uid")
    private String f7348c;

    /* renamed from: d, reason: collision with root package name */
    @Properties(desc = "终点POI的uid", name = "destination_uid")
    private String f7349d;

    /* renamed from: e, reason: collision with root package name */
    @Properties(desc = "开发者密钥", name = BaseParamNames.TOKEN)
    private String f7350e;

    /* renamed from: f, reason: collision with root package name */
    @Properties(desc = "用户的权限签名，当AK设置为SN校验时，该参数必填SN计算方法", name = HttpConstants.SIGN)
    private String f7351f;

    /* renamed from: g, reason: collision with root package name */
    @Properties(desc = "时间戳，与SN配合使用", name = "timestamp")
    private Long f7352g;

    /* renamed from: h, reason: collision with root package name */
    @Properties(desc = "城市内路线偏好", name = "urban_route_prefer")
    private Integer f7353h;

    /* renamed from: i, reason: collision with root package name */
    @Properties(desc = "跨城路线偏好", name = "intercity_route_prefer")
    private Integer f7354i;

    /* renamed from: j, reason: collision with root package name */
    @Properties(desc = "跨城交通方式偏好", name = "intercity_vehicle_prefer")
    private Integer f7355j;

    /* renamed from: k, reason: collision with root package name */
    @Properties(desc = "输入坐标类型", name = "in_coordtype")
    private String f7356k;

    /* renamed from: l, reason: collision with root package name */
    @Properties(desc = "输出坐标类型", name = "ret_coordtype")
    private String f7357l;

    /* renamed from: m, reason: collision with root package name */
    @Properties(desc = "出发日期", name = "departure_date")
    private String f7358m;

    /* renamed from: n, reason: collision with root package name */
    @Properties(desc = "出发时间区间", name = "departure_time")
    private String f7359n;

    /* renamed from: o, reason: collision with root package name */
    @Properties(desc = "返回字体的语言", name = "language")
    private String f7360o;

    /* renamed from: p, reason: collision with root package name */
    @Properties(name = "page_size")
    private int f7361p = 10;

    /* renamed from: q, reason: collision with root package name */
    @Properties(name = "page_num")
    private int f7362q = 1;

    public void apply(BusRoutePlanOption busRoutePlanOption) {
        if (busRoutePlanOption == null) {
            return;
        }
        if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
            LatLng gcjToBaidu = CoordTrans.gcjToBaidu(busRoutePlanOption.getOrigin());
            LatLng gcjToBaidu2 = CoordTrans.gcjToBaidu(busRoutePlanOption.getDestination());
            this.f7346a = gcjToBaidu.latitude + SystemInfoUtil.COMMA + gcjToBaidu.longitude;
            this.f7347b = gcjToBaidu2.latitude + SystemInfoUtil.COMMA + gcjToBaidu2.longitude;
        } else {
            this.f7346a = busRoutePlanOption.getOrigin().latitude + SystemInfoUtil.COMMA + busRoutePlanOption.getOrigin().longitude;
            this.f7347b = busRoutePlanOption.getDestination().latitude + SystemInfoUtil.COMMA + busRoutePlanOption.getDestination().longitude;
        }
        this.f7348c = busRoutePlanOption.getOriginUid();
        this.f7349d = busRoutePlanOption.getDestinationUid();
        this.f7353h = busRoutePlanOption.getUrbanRoutePrefer();
        this.f7354i = busRoutePlanOption.getIntercityRoutePrefer();
        this.f7355j = busRoutePlanOption.getIntercityVehiclePrefer();
        this.f7356k = "bd09ll";
        this.f7357l = "bd09ll";
        this.f7358m = busRoutePlanOption.getDepartureDate();
        this.f7359n = busRoutePlanOption.getDepartureTime();
        this.f7360o = busRoutePlanOption.getLanguage();
        this.f7361p = busRoutePlanOption.getPageSize();
        this.f7362q = busRoutePlanOption.getPageNum();
        if (this.f7361p == 0) {
            this.f7362q = 10;
        }
        if (this.f7362q == 0) {
            this.f7362q = 1;
        }
    }

    public String getDepartureDate() {
        return this.f7358m;
    }

    public String getDepartureTime() {
        return this.f7359n;
    }

    public String getDestination() {
        return this.f7347b;
    }

    public String getDestinationUid() {
        return this.f7349d;
    }

    public String getInCoordType() {
        return this.f7356k;
    }

    public Integer getIntercityRoutePrefer() {
        return this.f7354i;
    }

    public Integer getIntercityVehiclePrefer() {
        return this.f7355j;
    }

    public String getLanguage() {
        return this.f7360o;
    }

    public String getOrigin() {
        return this.f7346a;
    }

    public String getOriginUid() {
        return this.f7348c;
    }

    public int getPageNum() {
        return this.f7362q;
    }

    public int getPageSize() {
        return this.f7361p;
    }

    public String getRetCoordType() {
        return this.f7357l;
    }

    public String getSign() {
        return this.f7351f;
    }

    public Long getTimestamp() {
        return this.f7352g;
    }

    public String getToken() {
        return this.f7350e;
    }

    public Integer getUrbanRoutePrefer() {
        return this.f7353h;
    }

    public void setDepartureDate(String str) {
        this.f7358m = str;
    }

    public void setDepartureTime(String str) {
        this.f7359n = str;
    }

    public void setDestination(String str) {
        this.f7347b = str;
    }

    public void setDestinationUid(String str) {
        this.f7349d = str;
    }

    public void setInCoordType(String str) {
        this.f7356k = str;
    }

    public void setIntercityRoutePrefer(Integer num) {
        this.f7354i = num;
    }

    public void setIntercityVehiclePrefer(Integer num) {
        this.f7355j = num;
    }

    public void setLanguage(String str) {
        this.f7360o = str;
    }

    public void setOrigin(String str) {
        this.f7346a = str;
    }

    public void setOriginUid(String str) {
        this.f7348c = str;
    }

    public void setPageNum(int i8) {
        this.f7362q = i8;
    }

    public void setPageSize(int i8) {
        this.f7361p = i8;
    }

    public void setRetCoordType(String str) {
        this.f7357l = str;
    }

    public void setSign(String str) {
        this.f7351f = str;
    }

    public void setTimestamp(Long l8) {
        this.f7352g = l8;
    }

    public void setToken(String str) {
        this.f7350e = str;
    }

    public void setUrbanRoutePrefer(Integer num) {
        this.f7353h = num;
    }
}
