package com.baidu.mapapi.search.route.v2.bus.bean;

import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class BusRoutePlanTaxiDetail extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "desc")
    private String f7432a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(name = "km_price")
    private String f7433b;

    /* renamed from: c, reason: collision with root package name */
    @Properties(name = "start_price")
    private String f7434c;

    /* renamed from: d, reason: collision with root package name */
    @Properties(name = "total_price")
    private String f7435d;

    public String getDesc() {
        return this.f7432a;
    }

    public String getKmPrice() {
        return this.f7433b;
    }

    public String getStartPrice() {
        return this.f7434c;
    }

    public String getTotalPrice() {
        return this.f7435d;
    }

    public void setDesc(String str) {
        this.f7432a = str;
    }

    public void setKmPrice(String str) {
        this.f7433b = str;
    }

    public void setStartPrice(String str) {
        this.f7434c = str;
    }

    public void setTotalPrice(String str) {
        this.f7435d = str;
    }
}
