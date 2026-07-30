package com.baidu.mapapi.search.route.v2.bus.bean;

import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class BusRoutePlanResponse extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "status")
    private int f7363a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(name = "message")
    private String f7364b;

    /* renamed from: c, reason: collision with root package name */
    @Properties(name = "result")
    private BusRoutePlanResult f7365c;

    public String getMessage() {
        return this.f7364b;
    }

    public BusRoutePlanResult getResult() {
        return this.f7365c;
    }

    public int getStatus() {
        return this.f7363a;
    }

    public void setMessage(String str) {
        this.f7364b = str;
    }

    public void setResult(BusRoutePlanResult busRoutePlanResult) {
        this.f7365c = busRoutePlanResult;
    }

    public void setStatus(int i8) {
        this.f7363a = i8;
    }
}
