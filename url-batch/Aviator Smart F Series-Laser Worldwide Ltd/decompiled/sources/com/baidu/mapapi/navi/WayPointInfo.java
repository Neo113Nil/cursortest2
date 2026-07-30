package com.baidu.mapapi.navi;

import com.baidu.mapapi.model.LatLng;

/* loaded from: classes2.dex */
public class WayPointInfo {

    /* renamed from: a, reason: collision with root package name */
    private String f6607a;

    /* renamed from: b, reason: collision with root package name */
    private LatLng f6608b;

    public LatLng getLatLng() {
        return this.f6608b;
    }

    public String getWayPointName() {
        return this.f6607a;
    }

    public WayPointInfo setLatLng(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalStateException("BDMapSDKException: The latitude and longitude of the waypoint cannot be null");
        }
        this.f6608b = latLng;
        return this;
    }

    public WayPointInfo setWayPointName(String str) {
        this.f6607a = str;
        return this;
    }
}
