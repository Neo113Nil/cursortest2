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
public class BusRoutePlanStepVehicleLineStation extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "name")
    private String f7422a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(name = "start_time")
    private String f7423b;

    /* renamed from: c, reason: collision with root package name */
    @Properties(name = "location")
    private List<Double> f7424c;

    public LatLng getLocation() {
        List<Double> list = this.f7424c;
        if (list == null || list.size() < 2) {
            return null;
        }
        LatLng latLng = new LatLng(this.f7424c.get(1).doubleValue(), this.f7424c.get(0).doubleValue());
        return SDKInitializer.getCoordType() == CoordType.GCJ02 ? CoordTrans.baiduToGcj(latLng) : latLng;
    }

    public String getName() {
        return this.f7422a;
    }

    public String getStartTime() {
        return this.f7423b;
    }

    public void setLocation(List<Double> list) {
        this.f7424c = list;
    }

    public void setName(String str) {
        this.f7422a = str;
    }

    public void setStartTime(String str) {
        this.f7423b = str;
    }
}
