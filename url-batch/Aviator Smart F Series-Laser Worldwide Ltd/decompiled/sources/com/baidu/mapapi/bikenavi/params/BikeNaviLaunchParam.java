package com.baidu.mapapi.bikenavi.params;

import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.walknavi.h.b;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class BikeNaviLaunchParam {

    /* renamed from: a, reason: collision with root package name */
    private LatLng f5415a;

    /* renamed from: b, reason: collision with root package name */
    private LatLng f5416b;

    /* renamed from: c, reason: collision with root package name */
    private BikeRouteNodeInfo f5417c;

    /* renamed from: d, reason: collision with root package name */
    private BikeRouteNodeInfo f5418d;

    /* renamed from: f, reason: collision with root package name */
    private int f5420f;

    /* renamed from: e, reason: collision with root package name */
    private int f5419e = 0;
    public String mRoadPrefer = "0";

    /* renamed from: g, reason: collision with root package name */
    private List<BikeRouteNodeInfo> f5421g = new LinkedList();

    public static com.baidu.platform.comapi.walknavi.h.a create() {
        return new b();
    }

    public BikeNaviLaunchParam copy() {
        BikeNaviLaunchParam bikeNaviLaunchParam = new BikeNaviLaunchParam();
        bikeNaviLaunchParam.f5417c = this.f5417c;
        bikeNaviLaunchParam.f5418d = this.f5418d;
        bikeNaviLaunchParam.f5419e = this.f5419e;
        bikeNaviLaunchParam.f5415a = this.f5415a;
        bikeNaviLaunchParam.f5416b = this.f5416b;
        bikeNaviLaunchParam.f5420f = this.f5420f;
        bikeNaviLaunchParam.mRoadPrefer = this.mRoadPrefer;
        bikeNaviLaunchParam.f5421g = this.f5421g;
        return bikeNaviLaunchParam;
    }

    public BikeNaviLaunchParam endNodeInfo(BikeRouteNodeInfo bikeRouteNodeInfo) {
        this.f5418d = bikeRouteNodeInfo;
        return this;
    }

    public BikeNaviLaunchParam endPt(LatLng latLng) {
        this.f5416b = latLng;
        return this;
    }

    public BikeNaviLaunchParam extraNaviMode(int i8) {
        this.f5420f = i8;
        return this;
    }

    public BikeRouteNodeInfo getEndNodeInfo() {
        return this.f5418d;
    }

    public LatLng getEndPt() {
        return this.f5416b;
    }

    public int getExtraNaviMode() {
        return this.f5420f;
    }

    public BikeRouteNodeInfo getStartNodeInfo() {
        return this.f5417c;
    }

    public LatLng getStartPt() {
        return this.f5415a;
    }

    public int getVehicle() {
        return this.f5419e;
    }

    public List<BikeRouteNodeInfo> getViaNodes() {
        return this.f5421g;
    }

    public BikeNaviLaunchParam roadPrefer(String str) {
        this.mRoadPrefer = str;
        return this;
    }

    public void setViaNodes(List<BikeRouteNodeInfo> list) {
        this.f5421g.addAll(list);
    }

    public BikeNaviLaunchParam stPt(LatLng latLng) {
        this.f5415a = latLng;
        return this;
    }

    public BikeNaviLaunchParam startNodeInfo(BikeRouteNodeInfo bikeRouteNodeInfo) {
        this.f5417c = bikeRouteNodeInfo;
        return this;
    }

    public BikeNaviLaunchParam vehicle(int i8) {
        this.f5419e = i8;
        return this;
    }
}
