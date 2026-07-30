package com.baidu.mapapi.search.poi.v3.bean;

import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import java.util.List;

/* loaded from: classes2.dex */
public class SugResult extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(desc = "poi名称", name = "name")
    private String f7164a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(desc = "poi经纬度坐标", name = "location")
    private String f7165b;

    /* renamed from: c, reason: collision with root package name */
    @Properties(desc = "poi的唯一标示", name = "uid")
    private String f7166c;

    /* renamed from: d, reason: collision with root package name */
    @Properties(desc = "poi所属省份", name = "province")
    private String f7167d;

    /* renamed from: e, reason: collision with root package name */
    @Properties(desc = "poi所属城市", name = "city")
    private String f7168e;

    /* renamed from: f, reason: collision with root package name */
    @Properties(name = "district")
    private String f7169f;

    /* renamed from: g, reason: collision with root package name */
    @Properties(desc = "poi所属乡镇街道", name = "town")
    private String f7170g;

    /* renamed from: h, reason: collision with root package name */
    @Properties(desc = "poi所属乡镇街道编码", name = "town_code")
    private int f7171h;

    /* renamed from: i, reason: collision with root package name */
    @Properties(desc = "poi所属区域代码", name = "adcode")
    private int f7172i;

    /* renamed from: j, reason: collision with root package name */
    @Properties(desc = "poi所在地址", name = "address")
    private String f7173j;

    /* renamed from: k, reason: collision with root package name */
    @Properties(desc = "poi分类标签", name = "tag")
    private String f7174k;

    /* renamed from: l, reason: collision with root package name */
    @Properties(desc = "poi子点", name = "children")
    private List<ChildrenPoi> f7175l;

    public int getAdcode() {
        return this.f7172i;
    }

    public String getAddress() {
        return this.f7173j;
    }

    public List<ChildrenPoi> getChildren() {
        return this.f7175l;
    }

    public String getCity() {
        return this.f7168e;
    }

    public String getDistrict() {
        return this.f7169f;
    }

    public LatLng getLocation() {
        String decodeCoordHash = AppMD5.decodeCoordHash(this.f7165b);
        if (decodeCoordHash.isEmpty()) {
            return null;
        }
        String[] split = decodeCoordHash.split(SystemInfoUtil.COMMA);
        return new LatLng(Double.parseDouble(split[1]), Double.parseDouble(split[0]));
    }

    public String getName() {
        return this.f7164a;
    }

    public String getProvince() {
        return this.f7167d;
    }

    public String getTag() {
        return this.f7174k;
    }

    public String getTown() {
        return this.f7170g;
    }

    public int getTownCode() {
        return this.f7171h;
    }

    public String getUid() {
        return this.f7166c;
    }

    public void setAdcode(int i8) {
        this.f7172i = i8;
    }

    public void setAddress(String str) {
        this.f7173j = str;
    }

    public void setChildren(List<ChildrenPoi> list) {
        this.f7175l = list;
    }

    public void setCity(String str) {
        this.f7168e = str;
    }

    public void setDistrict(String str) {
        this.f7169f = str;
    }

    public void setLocation(LatLng latLng) {
        if (latLng != null) {
            this.f7165b = AppMD5.encodeCoordHash(latLng.longitude, latLng.latitude);
        }
    }

    public void setName(String str) {
        this.f7164a = str;
    }

    public void setProvince(String str) {
        this.f7167d = str;
    }

    public void setTag(String str) {
        this.f7174k = str;
    }

    public void setTown(String str) {
        this.f7170g = str;
    }

    public void setTownCode(int i8) {
        this.f7171h = i8;
    }

    public void setUid(String str) {
        this.f7166c = str;
    }
}
