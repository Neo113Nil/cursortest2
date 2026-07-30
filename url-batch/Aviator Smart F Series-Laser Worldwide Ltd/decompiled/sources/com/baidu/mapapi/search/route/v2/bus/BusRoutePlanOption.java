package com.baidu.mapapi.search.route.v2.bus;

import com.baidu.mapapi.model.LatLng;

/* loaded from: classes2.dex */
public class BusRoutePlanOption {

    /* renamed from: a, reason: collision with root package name */
    private LatLng f7319a;

    /* renamed from: b, reason: collision with root package name */
    private LatLng f7320b;

    /* renamed from: c, reason: collision with root package name */
    private String f7321c;

    /* renamed from: d, reason: collision with root package name */
    private String f7322d;

    /* renamed from: e, reason: collision with root package name */
    private Integer f7323e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f7324f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f7325g;

    /* renamed from: h, reason: collision with root package name */
    private String f7326h;

    /* renamed from: i, reason: collision with root package name */
    private String f7327i;

    /* renamed from: j, reason: collision with root package name */
    private String f7328j;

    /* renamed from: k, reason: collision with root package name */
    private int f7329k = 10;

    /* renamed from: l, reason: collision with root package name */
    private int f7330l = 1;

    public String getDepartureDate() {
        return this.f7326h;
    }

    public String getDepartureTime() {
        return this.f7327i;
    }

    public LatLng getDestination() {
        return this.f7320b;
    }

    public String getDestinationUid() {
        return this.f7322d;
    }

    public Integer getIntercityRoutePrefer() {
        return this.f7324f;
    }

    public Integer getIntercityVehiclePrefer() {
        return this.f7325g;
    }

    public String getLanguage() {
        return this.f7328j;
    }

    public LatLng getOrigin() {
        return this.f7319a;
    }

    public String getOriginUid() {
        return this.f7321c;
    }

    public int getPageNum() {
        return this.f7330l;
    }

    public int getPageSize() {
        return this.f7329k;
    }

    public Integer getUrbanRoutePrefer() {
        return this.f7323e;
    }

    public BusRoutePlanOption setDepartureDate(String str) {
        this.f7326h = str;
        return this;
    }

    public BusRoutePlanOption setDepartureTime(String str) {
        this.f7327i = str;
        return this;
    }

    public BusRoutePlanOption setDestination(LatLng latLng) {
        this.f7320b = latLng;
        return this;
    }

    public BusRoutePlanOption setDestinationUid(String str) {
        this.f7322d = str;
        return this;
    }

    public BusRoutePlanOption setIntercityRoutePrefer(Integer num) {
        this.f7324f = num;
        return this;
    }

    public BusRoutePlanOption setIntercityVehiclePrefer(Integer num) {
        this.f7325g = num;
        return this;
    }

    public BusRoutePlanOption setLanguage(String str) {
        this.f7328j = str;
        return this;
    }

    public BusRoutePlanOption setOrigin(LatLng latLng) {
        this.f7319a = latLng;
        return this;
    }

    public BusRoutePlanOption setOriginUid(String str) {
        this.f7321c = str;
        return this;
    }

    public BusRoutePlanOption setPageNum(int i8) {
        this.f7330l = i8;
        return this;
    }

    public BusRoutePlanOption setPageSize(int i8) {
        this.f7329k = i8;
        return this;
    }

    public BusRoutePlanOption setUrbanRoutePrefer(Integer num) {
        this.f7323e = num;
        return this;
    }
}
