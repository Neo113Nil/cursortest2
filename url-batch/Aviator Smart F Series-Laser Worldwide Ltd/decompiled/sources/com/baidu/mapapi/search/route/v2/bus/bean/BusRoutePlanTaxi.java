package com.baidu.mapapi.search.route.v2.bus.bean;

import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class BusRoutePlanTaxi extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "detail")
    private List<BusRoutePlanTaxiDetail> f7429a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(name = "distance")
    private int f7430b;

    /* renamed from: c, reason: collision with root package name */
    @Properties(name = "duration")
    private int f7431c;

    @Properties(name = "remark")
    public String remark;

    public List<BusRoutePlanTaxiDetail> getDetail() {
        return this.f7429a;
    }

    public int getDistance() {
        return this.f7430b;
    }

    public int getDuration() {
        return this.f7431c;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setDetail(List<BusRoutePlanTaxiDetail> list) {
        this.f7429a = list;
    }

    public void setDistance(int i8) {
        this.f7430b = i8;
    }

    public void setDuration(int i8) {
        this.f7431c = i8;
    }

    public void setRemark(String str) {
        this.remark = str;
    }
}
