package com.baidu.mapapi.utils.route;

import com.baidu.mapapi.model.LatLng;

/* loaded from: classes2.dex */
public class RouteParaOption {

    /* renamed from: a, reason: collision with root package name */
    LatLng f7560a;

    /* renamed from: b, reason: collision with root package name */
    LatLng f7561b;

    /* renamed from: c, reason: collision with root package name */
    String f7562c;

    /* renamed from: d, reason: collision with root package name */
    String f7563d;

    /* renamed from: e, reason: collision with root package name */
    String f7564e;

    /* renamed from: f, reason: collision with root package name */
    String f7565f;

    /* renamed from: g, reason: collision with root package name */
    String f7566g;

    /* renamed from: h, reason: collision with root package name */
    EBusStrategyType f7567h = EBusStrategyType.bus_recommend_way;

    public enum EBusStrategyType {
        bus_time_first,
        bus_transfer_little,
        bus_walk_little,
        bus_no_subway,
        bus_recommend_way
    }

    public RouteParaOption busStrategyType(EBusStrategyType eBusStrategyType) {
        this.f7567h = eBusStrategyType;
        return this;
    }

    public RouteParaOption cityName(String str) {
        this.f7564e = str;
        return this;
    }

    public RouteParaOption endName(String str) {
        this.f7563d = str;
        return this;
    }

    public RouteParaOption endPoiId(String str) {
        this.f7566g = str;
        return this;
    }

    public RouteParaOption endPoint(LatLng latLng) {
        this.f7561b = latLng;
        return this;
    }

    public EBusStrategyType getBusStrategyType() {
        return this.f7567h;
    }

    public String getCityName() {
        return this.f7564e;
    }

    public String getEndName() {
        return this.f7563d;
    }

    public String getEndPoiId() {
        return this.f7566g;
    }

    public LatLng getEndPoint() {
        return this.f7561b;
    }

    public String getStartName() {
        return this.f7562c;
    }

    public String getStartPoiId() {
        return this.f7565f;
    }

    public LatLng getStartPoint() {
        return this.f7560a;
    }

    public RouteParaOption startName(String str) {
        this.f7562c = str;
        return this;
    }

    public RouteParaOption startPoiId(String str) {
        this.f7565f = str;
        return this;
    }

    public RouteParaOption startPoint(LatLng latLng) {
        this.f7560a = latLng;
        return this;
    }
}
