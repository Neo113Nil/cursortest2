package com.baidu.mapapi.search.batch.geocode;

import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class LocationXY extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "y")
    private double f6667a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(name = "x")
    private double f6668b;

    public double getLat() {
        return this.f6667a;
    }

    public double getLng() {
        return this.f6668b;
    }

    public void setLat(double d8) {
        this.f6667a = d8;
    }

    public void setLng(double d8) {
        this.f6668b = d8;
    }
}
