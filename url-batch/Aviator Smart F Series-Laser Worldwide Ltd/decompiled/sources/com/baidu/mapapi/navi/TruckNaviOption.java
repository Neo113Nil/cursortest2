package com.baidu.mapapi.navi;

import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.navi.NaviParaOption;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public class TruckNaviOption extends NaviParaOption {

    /* renamed from: i, reason: collision with root package name */
    int f6592i;

    /* renamed from: j, reason: collision with root package name */
    double f6593j;

    /* renamed from: k, reason: collision with root package name */
    double f6594k;

    /* renamed from: l, reason: collision with root package name */
    double f6595l;

    /* renamed from: m, reason: collision with root package name */
    double f6596m;

    /* renamed from: n, reason: collision with root package name */
    double f6597n;

    /* renamed from: o, reason: collision with root package name */
    int f6598o;

    /* renamed from: p, reason: collision with root package name */
    boolean f6599p;

    /* renamed from: q, reason: collision with root package name */
    String f6600q;

    /* renamed from: r, reason: collision with root package name */
    int f6601r;

    /* renamed from: s, reason: collision with root package name */
    int f6602s;

    /* renamed from: t, reason: collision with root package name */
    int f6603t;

    /* renamed from: u, reason: collision with root package name */
    int f6604u;

    /* renamed from: v, reason: collision with root package name */
    int f6605v;

    public int getAxleCount() {
        return this.f6598o;
    }

    public double getAxleWeight() {
        return this.f6597n;
    }

    public int getDisplacement() {
        return this.f6602s;
    }

    public int getEmissionLimit() {
        return this.f6604u;
    }

    @Override // com.baidu.mapapi.navi.NaviParaOption
    public String getEndName() {
        return super.getEndName();
    }

    @Override // com.baidu.mapapi.navi.NaviParaOption
    public LatLng getEndPoint() {
        return super.getEndPoint();
    }

    public double getHeight() {
        return this.f6593j;
    }

    public boolean getIsTrailer() {
        return this.f6599p;
    }

    public double getLength() {
        return this.f6596m;
    }

    public int getLoadWeight() {
        return this.f6605v;
    }

    @Override // com.baidu.mapapi.navi.NaviParaOption
    public String getNaviRoutePolicy() {
        return super.getNaviRoutePolicy();
    }

    public int getPlateColor() {
        return this.f6601r;
    }

    public String getPlateNumber() {
        return this.f6600q;
    }

    public int getPowerType() {
        return this.f6603t;
    }

    public int getTruckType() {
        return this.f6592i;
    }

    @Override // com.baidu.mapapi.navi.NaviParaOption
    public JSONArray getWayPoint() {
        return super.getWayPoint();
    }

    public double getWeight() {
        return this.f6595l;
    }

    public double getWidth() {
        return this.f6594k;
    }

    public TruckNaviOption setAxleCount(int i8) {
        this.f6598o = i8;
        return this;
    }

    public TruckNaviOption setAxleWeight(double d8) {
        this.f6597n = d8;
        return this;
    }

    public TruckNaviOption setDisplacement(int i8) {
        this.f6602s = i8;
        return this;
    }

    public TruckNaviOption setEmissionLimit(int i8) {
        this.f6604u = i8;
        return this;
    }

    public TruckNaviOption setHeight(double d8) {
        this.f6593j = d8;
        return this;
    }

    public TruckNaviOption setIsTrailer(boolean z7) {
        this.f6599p = z7;
        return this;
    }

    public TruckNaviOption setLength(double d8) {
        this.f6596m = d8;
        return this;
    }

    public TruckNaviOption setLoadWeight(int i8) {
        this.f6605v = i8;
        return this;
    }

    public TruckNaviOption setPlateColor(int i8) {
        this.f6601r = i8;
        return this;
    }

    public TruckNaviOption setPlateNumber(String str) {
        this.f6600q = str;
        return this;
    }

    public TruckNaviOption setPowerType(int i8) {
        this.f6603t = i8;
        return this;
    }

    public TruckNaviOption setTruckType(int i8) {
        this.f6592i = i8;
        return this;
    }

    public TruckNaviOption setWeight(double d8) {
        this.f6595l = d8;
        return this;
    }

    public TruckNaviOption setWidth(double d8) {
        this.f6594k = d8;
        return this;
    }

    @Override // com.baidu.mapapi.navi.NaviParaOption
    public TruckNaviOption endName(String str) {
        return (TruckNaviOption) super.endName(str);
    }

    @Override // com.baidu.mapapi.navi.NaviParaOption
    public TruckNaviOption endPoint(LatLng latLng) {
        return (TruckNaviOption) super.endPoint(latLng);
    }

    @Override // com.baidu.mapapi.navi.NaviParaOption
    public TruckNaviOption setNaviRoutePolicy(NaviParaOption.NaviRoutePolicy naviRoutePolicy) {
        return (TruckNaviOption) super.setNaviRoutePolicy(naviRoutePolicy);
    }

    @Override // com.baidu.mapapi.navi.NaviParaOption
    public TruckNaviOption setWayPoint(WayPoint wayPoint) {
        return (TruckNaviOption) super.setWayPoint(wayPoint);
    }
}
