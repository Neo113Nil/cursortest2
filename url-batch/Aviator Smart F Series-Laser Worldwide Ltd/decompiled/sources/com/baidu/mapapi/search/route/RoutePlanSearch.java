package com.baidu.mapapi.search.route;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.search.core.a;
import com.baidu.platform.a.h.e;
import com.baidu.platform.a.h.l;

/* loaded from: classes2.dex */
public class RoutePlanSearch extends a {

    /* renamed from: b, reason: collision with root package name */
    private boolean f7290b = false;

    /* renamed from: a, reason: collision with root package name */
    private e f7289a = new l();

    RoutePlanSearch() {
    }

    public static RoutePlanSearch newInstance() {
        BMapManager.init();
        return new RoutePlanSearch();
    }

    public boolean bikingSearch(BikingRoutePlanOption bikingRoutePlanOption) {
        PlanNode planNode;
        if (this.f7289a == null) {
            throw new IllegalStateException("BDMapSDKException: RoutePlanSearch is null, please call newInstance() first.");
        }
        if (bikingRoutePlanOption == null || bikingRoutePlanOption.mTo == null || (planNode = bikingRoutePlanOption.mFrom) == null) {
            throw new IllegalArgumentException("BDMapSDKException: route plan option , origin or destination can not be null");
        }
        if (planNode.getLocation() == null && (bikingRoutePlanOption.mFrom.getName() == null || bikingRoutePlanOption.mFrom.getName().length() <= 0 || bikingRoutePlanOption.mFrom.getCity() == null || bikingRoutePlanOption.mFrom.getCity().length() <= 0)) {
            throw new IllegalArgumentException("BDMapSDKException: route plan option , origin is illegal");
        }
        if (bikingRoutePlanOption.mTo.getLocation() != null || (bikingRoutePlanOption.mTo.getName() != null && bikingRoutePlanOption.mTo.getName().length() > 0 && bikingRoutePlanOption.mTo.getCity() != null && bikingRoutePlanOption.mTo.getCity().length() > 0)) {
            return this.f7289a.a(bikingRoutePlanOption);
        }
        throw new IllegalArgumentException("BDMapSDKException: route plan option , destination is illegal");
    }

    public void destroy() {
        if (this.f7290b) {
            return;
        }
        this.f7290b = true;
        this.f7289a.destroy();
        BMapManager.destroy();
    }

    public boolean drivingSearch(DrivingRoutePlanOption drivingRoutePlanOption) {
        e eVar = this.f7289a;
        if (eVar == null) {
            throw new IllegalStateException("BDMapSDKException: RoutePlanSearch is null, please call newInstance() first.");
        }
        if (drivingRoutePlanOption == null || drivingRoutePlanOption.mTo == null || drivingRoutePlanOption.mFrom == null) {
            throw new IllegalArgumentException("BDMapSDKException: route plan option , origin or destination can not be null");
        }
        return eVar.a(drivingRoutePlanOption);
    }

    public boolean masstransitSearch(MassTransitRoutePlanOption massTransitRoutePlanOption) {
        PlanNode planNode;
        if (this.f7289a == null) {
            throw new IllegalStateException("BDMapSDKException: RoutePlanSearch is null, please call newInstance() first.");
        }
        if (massTransitRoutePlanOption == null || massTransitRoutePlanOption.mTo == null || (planNode = massTransitRoutePlanOption.mFrom) == null) {
            throw new IllegalArgumentException("BDMapSDKException: route plan option,origin or destination can not be null");
        }
        if (planNode.getLocation() == null && (massTransitRoutePlanOption.mFrom.getName() == null || massTransitRoutePlanOption.mFrom.getCity() == null)) {
            throw new IllegalArgumentException("BDMapSDKException: route plan option,origin is illegal");
        }
        if (massTransitRoutePlanOption.mTo.getLocation() == null && (massTransitRoutePlanOption.mTo.getName() == null || massTransitRoutePlanOption.mTo.getCity() == null)) {
            throw new IllegalArgumentException("BDMapSDKException: route plan option,destination is illegal");
        }
        return this.f7289a.a(massTransitRoutePlanOption);
    }

    public void setOnGetRoutePlanResultListener(OnGetRoutePlanResultListener onGetRoutePlanResultListener) {
        e eVar = this.f7289a;
        if (eVar == null) {
            throw new IllegalStateException("BDMapSDKException: RoutePlanSearch is null, please call newInstance() first.");
        }
        if (onGetRoutePlanResultListener == null) {
            throw new IllegalArgumentException("BDMapSDKException: listener can not be null");
        }
        eVar.a(onGetRoutePlanResultListener);
    }

    public boolean transitSearch(TransitRoutePlanOption transitRoutePlanOption) {
        e eVar = this.f7289a;
        if (eVar == null) {
            throw new IllegalStateException("BDMapSDKException: RoutePlanSearch is null, please call newInstance() first.");
        }
        if (transitRoutePlanOption == null || transitRoutePlanOption.mCityName == null || transitRoutePlanOption.mTo == null || transitRoutePlanOption.mFrom == null) {
            throw new IllegalArgumentException("BDMapSDKException: route plan option,origin or destination or city can not be null");
        }
        return eVar.a(transitRoutePlanOption);
    }

    public boolean walkingIndoorSearch(IndoorRoutePlanOption indoorRoutePlanOption) {
        e eVar = this.f7289a;
        if (eVar == null) {
            throw new IllegalStateException("BDMapSDKException: RoutePlanSearch is null, please call newInstance() first.");
        }
        if (indoorRoutePlanOption == null || indoorRoutePlanOption.mTo == null || indoorRoutePlanOption.mFrom == null) {
            throw new IllegalArgumentException("BDMapSDKException: option , origin or destination can not be null");
        }
        return eVar.a(indoorRoutePlanOption);
    }

    public boolean walkingIntegralSearch(WalkingRoutePlanOption walkingRoutePlanOption) {
        e eVar = this.f7289a;
        if (eVar == null) {
            throw new IllegalStateException("BDMapSDKException: RoutePlanSearch is null, please call newInstance() first.");
        }
        if (walkingRoutePlanOption == null || walkingRoutePlanOption.mTo == null || walkingRoutePlanOption.mFrom == null) {
            throw new IllegalArgumentException("BDMapSDKException: option , origin or destination can not be null");
        }
        return eVar.a(walkingRoutePlanOption);
    }

    public boolean walkingSearch(WalkingRoutePlanOption walkingRoutePlanOption) {
        e eVar = this.f7289a;
        if (eVar == null) {
            throw new IllegalStateException("BDMapSDKException: RoutePlanSearch is null, please call newInstance() first.");
        }
        if (walkingRoutePlanOption == null || walkingRoutePlanOption.mTo == null || walkingRoutePlanOption.mFrom == null) {
            throw new IllegalArgumentException("BDMapSDKException: option , origin or destination can not be null");
        }
        return eVar.b(walkingRoutePlanOption);
    }
}
