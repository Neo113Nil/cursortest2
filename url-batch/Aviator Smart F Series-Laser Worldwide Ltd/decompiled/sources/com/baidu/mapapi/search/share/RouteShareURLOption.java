package com.baidu.mapapi.search.share;

import com.baidu.mapapi.search.route.PlanNode;

/* loaded from: classes2.dex */
public class RouteShareURLOption {
    public RouteShareMode mMode;
    public PlanNode mFrom = null;
    public PlanNode mTo = null;
    public int mPn = 0;
    public int mCityCode = -1;

    public enum RouteShareMode {
        CAR_ROUTE_SHARE_MODE(0),
        FOOT_ROUTE_SHARE_MODE(1),
        CYCLE_ROUTE_SHARE_MODE(2),
        BUS_ROUTE_SHARE_MODE(3);


        /* renamed from: b, reason: collision with root package name */
        private int f7438b;

        RouteShareMode(int i8) {
            this.f7438b = i8;
        }

        public int getRouteShareMode() {
            return this.f7438b;
        }
    }

    public RouteShareURLOption cityCode(int i8) {
        this.mCityCode = i8;
        return this;
    }

    public RouteShareURLOption from(PlanNode planNode) {
        this.mFrom = planNode;
        return this;
    }

    public RouteShareMode getmMode() {
        return this.mMode;
    }

    public RouteShareURLOption pn(int i8) {
        this.mPn = i8;
        return this;
    }

    public RouteShareURLOption routMode(RouteShareMode routeShareMode) {
        this.mMode = routeShareMode;
        return this;
    }

    public RouteShareURLOption to(PlanNode planNode) {
        this.mTo = planNode;
        return this;
    }
}
