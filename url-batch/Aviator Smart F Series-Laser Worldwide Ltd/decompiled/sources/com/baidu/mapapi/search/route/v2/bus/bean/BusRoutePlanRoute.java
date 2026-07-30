package com.baidu.mapapi.search.route.v2.bus.bean;

import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class BusRoutePlanRoute extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "legs")
    private List<BusRoutePlanLegs> f7373a;

    public List<BusRoutePlanLegs> getLegs() {
        return this.f7373a;
    }

    public void setLegs(List<BusRoutePlanLegs> list) {
        this.f7373a = list;
    }
}
