package com.baidu.mapapi.search.recommendstop;

import com.baidu.mapapi.model.LatLng;

/* loaded from: classes2.dex */
public class RecommendStopSearchOption {

    /* renamed from: a, reason: collision with root package name */
    private boolean f7196a = false;
    public LatLng mLocation;

    public LatLng getLocation() {
        return this.mLocation;
    }

    public boolean isNeedStationInfo() {
        return this.f7196a;
    }

    public RecommendStopSearchOption location(LatLng latLng) {
        this.mLocation = latLng;
        return this;
    }

    public RecommendStopSearchOption setNeedStationInfo(boolean z7) {
        this.f7196a = z7;
        return this;
    }
}
