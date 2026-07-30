package com.baidu.mapapi.search.route;

import com.baidu.mapapi.model.LatLng;

/* loaded from: classes2.dex */
public class IndoorPlanNode {

    /* renamed from: a, reason: collision with root package name */
    private LatLng f7236a;

    /* renamed from: b, reason: collision with root package name */
    private String f7237b;

    public IndoorPlanNode(LatLng latLng, String str) {
        this.f7236a = latLng;
        this.f7237b = str;
    }

    public String getFloor() {
        return this.f7237b;
    }

    public LatLng getLocation() {
        return this.f7236a;
    }
}
