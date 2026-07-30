package com.baidu.mapapi.search.route.v2.bus.bean;

import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class BusRoutePlanStep extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "type")
    private int f7379a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(name = "instruction")
    private String f7380b;

    /* renamed from: c, reason: collision with root package name */
    @Properties(name = "distance")
    private int f7381c;

    /* renamed from: d, reason: collision with root package name */
    @Properties(name = "duration")
    private int f7382d;

    /* renamed from: e, reason: collision with root package name */
    @Properties(name = "start_name")
    private String f7383e;

    /* renamed from: f, reason: collision with root package name */
    @Properties(name = "start_address")
    private String f7384f;

    /* renamed from: g, reason: collision with root package name */
    @Properties(name = "start_location")
    private List<Double> f7385g;

    /* renamed from: h, reason: collision with root package name */
    @Properties(name = "end_name")
    private String f7386h;

    /* renamed from: i, reason: collision with root package name */
    @Properties(name = "end_address")
    private String f7387i;

    /* renamed from: j, reason: collision with root package name */
    @Properties(name = "end_location")
    private List<Double> f7388j;

    /* renamed from: k, reason: collision with root package name */
    @Properties(name = "can_ride")
    private int f7389k;

    /* renamed from: l, reason: collision with root package name */
    @Properties(name = "walk_type")
    private int f7390l;

    /* renamed from: m, reason: collision with root package name */
    @Properties(name = "trans_type")
    private int f7391m;

    /* renamed from: n, reason: collision with root package name */
    @Properties(name = "path")
    private String f7392n;

    /* renamed from: o, reason: collision with root package name */
    @Properties(name = FirebaseAnalytics.Param.PRICE)
    private int f7393o;

    /* renamed from: p, reason: collision with root package name */
    @Properties(name = "station")
    private List<BusRoutePlanStepStation> f7394p;

    /* renamed from: q, reason: collision with root package name */
    @Properties(name = "vehicle")
    private BusRoutePlanStepVehicle f7395q;

    /* renamed from: r, reason: collision with root package name */
    @Properties(name = "lower_steps")
    private List<List<BusRoutePlanStep>> f7396r;

    public int getCanRide() {
        return this.f7389k;
    }

    public int getDistance() {
        return this.f7381c;
    }

    public int getDuration() {
        return this.f7382d;
    }

    public String getEndAddress() {
        return this.f7387i;
    }

    public LatLng getEndLocation() {
        List<Double> list = this.f7388j;
        if (list == null || list.size() < 2) {
            return null;
        }
        LatLng latLng = new LatLng(this.f7388j.get(1).doubleValue(), this.f7388j.get(0).doubleValue());
        return SDKInitializer.getCoordType() == CoordType.GCJ02 ? CoordTrans.baiduToGcj(latLng) : latLng;
    }

    public String getEndName() {
        return this.f7386h;
    }

    public String getInstruction() {
        return this.f7380b;
    }

    public List<List<BusRoutePlanStep>> getLowerSteps() {
        return this.f7396r;
    }

    public String getPath() {
        return this.f7392n;
    }

    public int getPrice() {
        return this.f7393o;
    }

    public String getStartAddress() {
        return this.f7384f;
    }

    public LatLng getStartLocation() {
        List<Double> list = this.f7385g;
        if (list == null || list.size() < 2) {
            return null;
        }
        LatLng latLng = new LatLng(this.f7385g.get(1).doubleValue(), this.f7385g.get(0).doubleValue());
        return SDKInitializer.getCoordType() == CoordType.GCJ02 ? CoordTrans.baiduToGcj(latLng) : latLng;
    }

    public String getStartName() {
        return this.f7383e;
    }

    public List<BusRoutePlanStepStation> getStation() {
        return this.f7394p;
    }

    public int getTransType() {
        return this.f7391m;
    }

    public int getType() {
        return this.f7379a;
    }

    public BusRoutePlanStepVehicle getVehicle() {
        return this.f7395q;
    }

    public int getWalkType() {
        return this.f7390l;
    }

    public void setCanRide(int i8) {
        this.f7389k = i8;
    }

    public void setDistance(int i8) {
        this.f7381c = i8;
    }

    public void setDuration(int i8) {
        this.f7382d = i8;
    }

    public void setEndAddress(String str) {
        this.f7387i = str;
    }

    public void setEndLocation(List<Double> list) {
        this.f7388j = list;
    }

    public void setEndName(String str) {
        this.f7386h = str;
    }

    public void setInstruction(String str) {
        this.f7380b = str;
    }

    public void setLowerSteps(List<List<BusRoutePlanStep>> list) {
        this.f7396r = list;
    }

    public void setPath(String str) {
        this.f7392n = str;
    }

    public void setPrice(int i8) {
        this.f7393o = i8;
    }

    public void setStartAddress(String str) {
        this.f7384f = str;
    }

    public void setStartLocation(List<Double> list) {
        this.f7385g = list;
    }

    public void setStartName(String str) {
        this.f7383e = str;
    }

    public void setStation(List<BusRoutePlanStepStation> list) {
        this.f7394p = list;
    }

    public void setTransType(int i8) {
        this.f7391m = i8;
    }

    public void setType(int i8) {
        this.f7379a = i8;
    }

    public void setVehicle(BusRoutePlanStepVehicle busRoutePlanStepVehicle) {
        this.f7395q = busRoutePlanStepVehicle;
    }

    public void setWalkType(int i8) {
        this.f7390l = i8;
    }
}
