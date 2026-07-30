package com.baidu.mapapi.search.batch.geocode;

import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class Location extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "lat")
    private double f6665a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(name = "lng")
    private double f6666b;

    public double getLat() {
        return this.f6665a;
    }

    public double getLng() {
        return this.f6666b;
    }

    public void setLat(double d8) {
        this.f6665a = d8;
    }

    public void setLng(double d8) {
        this.f6666b = d8;
    }
}
