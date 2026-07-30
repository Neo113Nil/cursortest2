package com.baidu.mapapi.search.poi.v3.bean;

import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;

/* loaded from: classes2.dex */
public class ChildrenPoi extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(desc = "poi子点ID", name = "uid")
    private String f7044a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(desc = "poi子点简称", name = "show_name")
    private String f7045b;

    /* renamed from: c, reason: collision with root package name */
    @Properties(desc = "poi子点全称", name = "name")
    private String f7046c;

    /* renamed from: d, reason: collision with root package name */
    @Properties(desc = "poi子点分类标签", name = "classified_poi_tag")
    private String f7047d;

    /* renamed from: e, reason: collision with root package name */
    @Properties(desc = "poi子点坐标", name = "location")
    private String f7048e;

    /* renamed from: f, reason: collision with root package name */
    @Properties(desc = "poi子点地址", name = "address")
    private String f7049f;

    public String getAddress() {
        return this.f7049f;
    }

    public String getClassifiedPoiTag() {
        return this.f7047d;
    }

    public LatLng getLocation() {
        String decodeCoordHash = AppMD5.decodeCoordHash(this.f7048e);
        if (decodeCoordHash.isEmpty()) {
            return null;
        }
        String[] split = decodeCoordHash.split(SystemInfoUtil.COMMA);
        return new LatLng(Double.parseDouble(split[1]), Double.parseDouble(split[0]));
    }

    public String getName() {
        return this.f7046c;
    }

    public String getShowName() {
        return this.f7045b;
    }

    public String getUid() {
        return this.f7044a;
    }

    public void setAddress(String str) {
        this.f7049f = str;
    }

    public void setClassifiedPoiTag(String str) {
        this.f7047d = str;
    }

    public void setLocation(LatLng latLng) {
        if (latLng != null) {
            this.f7048e = AppMD5.encodeCoordHash(latLng.longitude, latLng.latitude);
        }
    }

    public void setName(String str) {
        this.f7046c = str;
    }

    public void setShowName(String str) {
        this.f7045b = str;
    }

    public void setUid(String str) {
        this.f7044a = str;
    }
}
