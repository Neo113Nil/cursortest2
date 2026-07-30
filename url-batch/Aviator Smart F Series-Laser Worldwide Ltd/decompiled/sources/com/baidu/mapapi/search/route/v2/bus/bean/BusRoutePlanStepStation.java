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
public class BusRoutePlanStepStation extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "duration")
    private int f7397a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(name = "uid")
    private String f7398b;

    /* renamed from: c, reason: collision with root package name */
    @Properties(name = "name")
    private String f7399c;

    /* renamed from: d, reason: collision with root package name */
    @Properties(name = "underground")
    private int f7400d;

    /* renamed from: e, reason: collision with root package name */
    @Properties(name = "location")
    private List<Double> f7401e;

    public int getDuration() {
        return this.f7397a;
    }

    public LatLng getLocation() {
        List<Double> list = this.f7401e;
        if (list == null || list.size() < 2) {
            return null;
        }
        LatLng latLng = new LatLng(this.f7401e.get(1).doubleValue(), this.f7401e.get(0).doubleValue());
        return SDKInitializer.getCoordType() == CoordType.GCJ02 ? CoordTrans.baiduToGcj(latLng) : latLng;
    }

    public String getName() {
        return this.f7399c;
    }

    public String getUid() {
        return this.f7398b;
    }

    public int getUnderground() {
        return this.f7400d;
    }

    public void setDuration(int i8) {
        this.f7397a = i8;
    }

    public void setLocation(List<Double> list) {
        this.f7401e = list;
    }

    public void setName(String str) {
        this.f7399c = str;
    }

    public void setUid(String str) {
        this.f7398b = str;
    }

    public void setUnderground(int i8) {
        this.f7400d = i8;
    }
}
