package com.baidu.mapapi.search.route.v2.bus.bean;

import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class BusRoutePlanStepVehiclePortInfo extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "name")
    private String f7425a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(name = "uid")
    private String f7426b;

    /* renamed from: c, reason: collision with root package name */
    @Properties(name = "x")
    private double f7427c;

    /* renamed from: d, reason: collision with root package name */
    @Properties(name = "y")
    private double f7428d;

    public String getName() {
        return this.f7425a;
    }

    public String getUid() {
        return this.f7426b;
    }

    public double getX() {
        return this.f7427c;
    }

    public double getY() {
        return this.f7428d;
    }

    public void setName(String str) {
        this.f7425a = str;
    }

    public void setUid(String str) {
        this.f7426b = str;
    }

    public void setX(double d8) {
        this.f7427c = d8;
    }

    public void setY(double d8) {
        this.f7428d = d8;
    }
}
