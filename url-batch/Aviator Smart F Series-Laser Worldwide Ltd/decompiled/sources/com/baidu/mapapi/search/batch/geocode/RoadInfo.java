package com.baidu.mapapi.search.batch.geocode;

import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class RoadInfo extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "name")
    private String f6712a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(name = "distance")
    private String f6713b;

    public String getDistance() {
        return this.f6713b;
    }

    public String getName() {
        return this.f6712a;
    }

    public void setDistance(String str) {
        this.f6713b = str;
    }

    public void setName(String str) {
        this.f6712a = str;
    }
}
