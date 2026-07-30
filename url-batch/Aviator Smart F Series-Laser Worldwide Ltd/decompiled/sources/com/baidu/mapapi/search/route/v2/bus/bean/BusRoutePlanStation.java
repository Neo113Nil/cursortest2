package com.baidu.mapapi.search.route.v2.bus.bean;

import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class BusRoutePlanStation extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "fuzzy")
    private String f7374a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(name = "station_name")
    private String f7375b;

    /* renamed from: c, reason: collision with root package name */
    @Properties(name = "station_location")
    private List<Double> f7376c;

    /* renamed from: d, reason: collision with root package name */
    @Properties(name = "station_uid")
    private String f7377d;

    /* renamed from: e, reason: collision with root package name */
    @Properties(name = "type")
    private int f7378e;

    public String getFuzzy() {
        return this.f7374a;
    }

    public LatLng getStationLocation() {
        List<Double> list = this.f7376c;
        if (list == null || list.size() < 2) {
            return null;
        }
        LatLng latLng = new LatLng(this.f7376c.get(1).doubleValue(), this.f7376c.get(0).doubleValue());
        return SDKInitializer.getCoordType() == CoordType.GCJ02 ? CoordTrans.baiduToGcj(latLng) : latLng;
    }

    public String getStationName() {
        return this.f7375b;
    }

    public String getStationUid() {
        return this.f7377d;
    }

    public int getType() {
        return this.f7378e;
    }

    public void setFuzzy(String str) {
        this.f7374a = str;
    }

    public void setStationLocation(List<Double> list) {
        this.f7376c = list;
    }

    public void setStationName(String str) {
        this.f7375b = str;
    }

    public void setStationUid(String str) {
        this.f7377d = str;
    }

    public void setType(int i8) {
        this.f7378e = i8;
    }
}
