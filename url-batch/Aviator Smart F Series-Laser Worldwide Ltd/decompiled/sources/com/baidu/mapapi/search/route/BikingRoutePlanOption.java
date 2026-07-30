package com.baidu.mapapi.search.route;

import java.util.List;

/* loaded from: classes2.dex */
public class BikingRoutePlanOption {
    public PlanNode mFrom = null;
    public PlanNode mTo = null;

    /* renamed from: a, reason: collision with root package name */
    private List<PlanNode> f7207a = null;
    public String mRoadPrefer = "0";
    public int mRidingType = 0;

    public BikingRoutePlanOption from(PlanNode planNode) {
        this.mFrom = planNode;
        return this;
    }

    public List<PlanNode> getWayPoints() {
        return this.f7207a;
    }

    public BikingRoutePlanOption passBy(List<PlanNode> list) {
        this.f7207a = list;
        return this;
    }

    public BikingRoutePlanOption ridingType(int i8) {
        this.mRidingType = i8;
        return this;
    }

    public BikingRoutePlanOption roadPrefer(String str) {
        this.mRoadPrefer = str;
        return this;
    }

    public BikingRoutePlanOption to(PlanNode planNode) {
        this.mTo = planNode;
        return this;
    }
}
