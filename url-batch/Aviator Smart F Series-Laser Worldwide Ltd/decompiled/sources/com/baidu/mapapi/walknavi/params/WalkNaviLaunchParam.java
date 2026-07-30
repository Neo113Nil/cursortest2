package com.baidu.mapapi.walknavi.params;

import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.walknavi.h.c;
import com.baidu.platform.comapi.walknavi.h.d;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public class WalkNaviLaunchParam {

    /* renamed from: a, reason: collision with root package name */
    private LatLng f7690a;

    /* renamed from: b, reason: collision with root package name */
    private LatLng f7691b;

    /* renamed from: c, reason: collision with root package name */
    private a f7692c;

    /* renamed from: d, reason: collision with root package name */
    private a f7693d;

    /* renamed from: e, reason: collision with root package name */
    private List<a> f7694e = new LinkedList();

    /* renamed from: f, reason: collision with root package name */
    private int f7695f;

    public static c create() {
        return new d();
    }

    public WalkNaviLaunchParam copy() {
        WalkNaviLaunchParam walkNaviLaunchParam = new WalkNaviLaunchParam();
        walkNaviLaunchParam.f7692c = this.f7692c;
        walkNaviLaunchParam.f7693d = this.f7693d;
        walkNaviLaunchParam.f7690a = this.f7690a;
        walkNaviLaunchParam.f7691b = this.f7691b;
        walkNaviLaunchParam.f7695f = this.f7695f;
        walkNaviLaunchParam.f7694e = this.f7694e;
        return walkNaviLaunchParam;
    }

    public WalkNaviLaunchParam endNodeInfo(WalkRouteNodeInfo walkRouteNodeInfo) {
        this.f7693d = walkRouteNodeInfo;
        return this;
    }

    public WalkNaviLaunchParam endPt(LatLng latLng) {
        this.f7691b = latLng;
        return this;
    }

    public WalkNaviLaunchParam extraNaviMode(int i8) {
        this.f7695f = i8;
        return this;
    }

    public a getEndNodeInfo() {
        return this.f7693d;
    }

    public LatLng getEndPt() {
        return this.f7691b;
    }

    public int getExtraNaviMode() {
        return this.f7695f;
    }

    public a getStartNodeInfo() {
        return this.f7692c;
    }

    public LatLng getStartPt() {
        return this.f7690a;
    }

    public List<a> getViaNodes() {
        return this.f7694e;
    }

    public void setViaNodes(List<a> list) {
        this.f7694e.addAll(list);
    }

    public WalkNaviLaunchParam stPt(LatLng latLng) {
        this.f7690a = latLng;
        return this;
    }

    public WalkNaviLaunchParam startNodeInfo(WalkRouteNodeInfo walkRouteNodeInfo) {
        this.f7692c = walkRouteNodeInfo;
        return this;
    }
}
