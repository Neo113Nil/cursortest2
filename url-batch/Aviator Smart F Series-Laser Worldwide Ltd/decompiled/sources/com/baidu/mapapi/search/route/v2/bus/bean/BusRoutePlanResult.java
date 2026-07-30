package com.baidu.mapapi.search.route.v2.bus.bean;

import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class BusRoutePlanResult extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "result_type")
    private int f7366a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(name = FileDownloadModel.TOTAL)
    private int f7367b;

    /* renamed from: c, reason: collision with root package name */
    @Properties(name = "origin")
    private BusRoutePlanNode f7368c;

    /* renamed from: d, reason: collision with root package name */
    @Properties(name = FirebaseAnalytics.Param.DESTINATION)
    private BusRoutePlanNode f7369d;

    /* renamed from: e, reason: collision with root package name */
    @Properties(name = "routes")
    private List<BusRoutePlanRoute> f7370e;

    /* renamed from: f, reason: collision with root package name */
    @Properties(name = "taxi")
    private BusRoutePlanTaxi f7371f;

    /* renamed from: g, reason: collision with root package name */
    @Properties(name = "walk")
    private BusRoutePlanWalk f7372g;

    public BusRoutePlanNode getDestination() {
        return this.f7369d;
    }

    public BusRoutePlanNode getOrigin() {
        return this.f7368c;
    }

    public int getResultType() {
        return this.f7366a;
    }

    public List<BusRoutePlanRoute> getRoutes() {
        return this.f7370e;
    }

    public BusRoutePlanTaxi getTaxi() {
        return this.f7371f;
    }

    public int getTotal() {
        return this.f7367b;
    }

    public BusRoutePlanWalk getWalk() {
        return this.f7372g;
    }

    public void setDestination(BusRoutePlanNode busRoutePlanNode) {
        this.f7369d = busRoutePlanNode;
    }

    public void setOrigin(BusRoutePlanNode busRoutePlanNode) {
        this.f7368c = busRoutePlanNode;
    }

    public void setResultType(int i8) {
        this.f7366a = i8;
    }

    public void setRoutes(List<BusRoutePlanRoute> list) {
        this.f7370e = list;
    }

    public void setTaxi(BusRoutePlanTaxi busRoutePlanTaxi) {
        this.f7371f = busRoutePlanTaxi;
    }

    public void setTotal(int i8) {
        this.f7367b = i8;
    }

    public void setWalk(BusRoutePlanWalk busRoutePlanWalk) {
        this.f7372g = busRoutePlanWalk;
    }
}
