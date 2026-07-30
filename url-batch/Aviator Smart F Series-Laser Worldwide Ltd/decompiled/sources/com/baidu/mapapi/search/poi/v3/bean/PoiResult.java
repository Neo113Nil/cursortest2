package com.baidu.mapapi.search.poi.v3.bean;

import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;

/* loaded from: classes2.dex */
public class PoiResult extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(desc = "poi的唯一标示", name = "uid")
    private String f7094a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(desc = "poi名称", name = "name")
    private String f7095b;

    /* renamed from: c, reason: collision with root package name */
    @Properties(desc = "poi经纬度坐标", name = "location")
    private String f7096c;

    /* renamed from: d, reason: collision with root package name */
    @Properties(desc = "poi所属省份", name = "province")
    private String f7097d;

    /* renamed from: e, reason: collision with root package name */
    @Properties(desc = "poi所属城市", name = "city")
    private String f7098e;

    /* renamed from: f, reason: collision with root package name */
    @Properties(desc = "poi所属区县", name = "area")
    private String f7099f;

    /* renamed from: g, reason: collision with root package name */
    @Properties(desc = "poi所属乡镇街道", name = "town")
    private String f7100g;

    /* renamed from: h, reason: collision with root package name */
    @Properties(desc = "poi所属乡镇街道编码", name = "town_code")
    private int f7101h;

    /* renamed from: i, reason: collision with root package name */
    @Properties(desc = "poi所属区域代码", name = "adcode")
    private int f7102i;

    /* renamed from: j, reason: collision with root package name */
    @Properties(desc = "poi所属商圈", name = "business")
    private String f7103j;

    /* renamed from: k, reason: collision with root package name */
    @Properties(desc = "poi所在地址", name = "address")
    private String f7104k;

    /* renamed from: l, reason: collision with root package name */
    @Properties(desc = "poi营业状态", name = "status")
    private String f7105l;

    /* renamed from: m, reason: collision with root package name */
    @Properties(desc = "poi的电话", name = "telephone")
    private String f7106m;

    /* renamed from: n, reason: collision with root package name */
    @Properties(desc = "poi所在街景图id", name = "street_id")
    private String f7107n;

    /* renamed from: o, reason: collision with root package name */
    @Properties(desc = "是否有详情页", name = "detail")
    private String f7108o;

    /* renamed from: p, reason: collision with root package name */
    @Properties(desc = "详细信息", name = "detail_info")
    private PoiDetailInfo f7109p;

    /* renamed from: q, reason: collision with root package name */
    @Properties(desc = "poi分类标签", name = "tag")
    private String f7110q;

    /* renamed from: r, reason: collision with root package name */
    @Properties(name = "district")
    private String f7111r;

    public int getAdcode() {
        return this.f7102i;
    }

    public String getAddress() {
        return this.f7104k;
    }

    public String getArea() {
        return this.f7099f;
    }

    public String getBusiness() {
        return this.f7103j;
    }

    public String getCity() {
        return this.f7098e;
    }

    public String getDetail() {
        return this.f7108o;
    }

    public PoiDetailInfo getDetailInfo() {
        return this.f7109p;
    }

    public String getDistrict() {
        return this.f7111r;
    }

    public LatLng getLocation() {
        String decodeCoordHash = AppMD5.decodeCoordHash(this.f7096c);
        if (decodeCoordHash.isEmpty()) {
            return null;
        }
        String[] split = decodeCoordHash.split(SystemInfoUtil.COMMA);
        return new LatLng(Double.parseDouble(split[1]), Double.parseDouble(split[0]));
    }

    public String getName() {
        return this.f7095b;
    }

    public String getProvince() {
        return this.f7097d;
    }

    public String getStatus() {
        return this.f7105l;
    }

    public String getStreetId() {
        return this.f7107n;
    }

    public String getTag() {
        return this.f7110q;
    }

    public String getTelephone() {
        return this.f7106m;
    }

    public String getTown() {
        return this.f7100g;
    }

    public int getTownCode() {
        return this.f7101h;
    }

    public String getUid() {
        return this.f7094a;
    }

    public void setAdcode(int i8) {
        this.f7102i = i8;
    }

    public void setAddress(String str) {
        this.f7104k = str;
    }

    public void setArea(String str) {
        this.f7099f = str;
    }

    public void setBusiness(String str) {
        this.f7103j = str;
    }

    public void setCity(String str) {
        this.f7098e = str;
    }

    public void setDetail(String str) {
        this.f7108o = str;
    }

    public void setDetailInfo(PoiDetailInfo poiDetailInfo) {
        this.f7109p = poiDetailInfo;
    }

    public void setDistrict(String str) {
        this.f7111r = str;
    }

    public void setLocation(LatLng latLng) {
        if (latLng != null) {
            this.f7096c = AppMD5.encodeCoordHash(latLng.longitude, latLng.latitude);
        }
    }

    public void setName(String str) {
        this.f7095b = str;
    }

    public void setProvince(String str) {
        this.f7097d = str;
    }

    public void setStatus(String str) {
        this.f7105l = str;
    }

    public void setStreetId(String str) {
        this.f7107n = str;
    }

    public void setTag(String str) {
        this.f7110q = str;
    }

    public void setTelephone(String str) {
        this.f7106m = str;
    }

    public void setTown(String str) {
        this.f7100g = str;
    }

    public void setTownCode(int i8) {
        this.f7101h = i8;
    }

    public void setUid(String str) {
        this.f7094a = str;
    }
}
