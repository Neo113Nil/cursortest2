package com.baidu.mapapi.search.core;

import java.util.List;

/* loaded from: classes2.dex */
public class RecommendStationStopInfo {

    /* renamed from: a, reason: collision with root package name */
    private String f6806a;

    /* renamed from: b, reason: collision with root package name */
    private List<RecommendStopInfo> f6807b;

    public List<RecommendStopInfo> getRecommendStopInfoList() {
        return this.f6807b;
    }

    public String getStationName() {
        return this.f6806a;
    }

    public void setRecommendStopInfoList(List<RecommendStopInfo> list) {
        this.f6807b = list;
    }

    public void setStationName(String str) {
        this.f6806a = str;
    }
}
