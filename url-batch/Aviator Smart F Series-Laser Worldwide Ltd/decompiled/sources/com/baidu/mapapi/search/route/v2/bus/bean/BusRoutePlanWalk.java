package com.baidu.mapapi.search.route.v2.bus.bean;

import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class BusRoutePlanWalk extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "is_better")
    private int f7436a;

    public int getIsBetter() {
        return this.f7436a;
    }

    public void setIsBetter(int i8) {
        this.f7436a = i8;
    }
}
