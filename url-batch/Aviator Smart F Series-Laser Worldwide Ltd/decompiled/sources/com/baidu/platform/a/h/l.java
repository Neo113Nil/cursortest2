package com.baidu.platform.a.h;

import com.baidu.mapapi.search.route.BikingRoutePlanOption;
import com.baidu.mapapi.search.route.DrivingRoutePlanOption;
import com.baidu.mapapi.search.route.IndoorRoutePlanOption;
import com.baidu.mapapi.search.route.MassTransitRoutePlanOption;
import com.baidu.mapapi.search.route.OnGetRoutePlanResultListener;
import com.baidu.mapapi.search.route.TransitRoutePlanOption;
import com.baidu.mapapi.search.route.WalkingRoutePlanOption;
import com.baidu.platform.base.SearchType;

/* loaded from: classes2.dex */
public class l extends com.baidu.platform.base.b implements e {

    /* renamed from: g, reason: collision with root package name */
    private OnGetRoutePlanResultListener f8620g = null;

    @Override // com.baidu.platform.a.h.e
    public void a(OnGetRoutePlanResultListener onGetRoutePlanResultListener) {
        this.f8690c.lock();
        this.f8620g = onGetRoutePlanResultListener;
        this.f8690c.unlock();
    }

    @Override // com.baidu.platform.a.h.e
    public boolean b(WalkingRoutePlanOption walkingRoutePlanOption) {
        p pVar = new p();
        pVar.a(SearchType.WALK_ROUTE);
        return a(new q(walkingRoutePlanOption), this.f8620g, pVar);
    }

    @Override // com.baidu.platform.a.h.e
    public void destroy() {
        this.f8690c.lock();
        this.f8620g = null;
        this.f8690c.unlock();
    }

    @Override // com.baidu.platform.a.h.e
    public boolean a(TransitRoutePlanOption transitRoutePlanOption) {
        n nVar = new n();
        nVar.a(SearchType.TRANSIT_ROUTE);
        return a(new o(transitRoutePlanOption), this.f8620g, nVar);
    }

    @Override // com.baidu.platform.a.h.e
    public boolean a(MassTransitRoutePlanOption massTransitRoutePlanOption) {
        j jVar = new j();
        jVar.a(SearchType.MASS_TRANSIT_ROUTE);
        return a(new k(massTransitRoutePlanOption), this.f8620g, jVar);
    }

    @Override // com.baidu.platform.a.h.e
    public boolean a(IndoorRoutePlanOption indoorRoutePlanOption) {
        f fVar = new f();
        fVar.a(SearchType.INDOOR_ROUTE);
        return a(new g(indoorRoutePlanOption), this.f8620g, fVar);
    }

    @Override // com.baidu.platform.a.h.e
    public boolean a(WalkingRoutePlanOption walkingRoutePlanOption) {
        h hVar = new h();
        hVar.a(SearchType.INTEGRAL_ROUTE);
        return a(new i(walkingRoutePlanOption), this.f8620g, hVar);
    }

    @Override // com.baidu.platform.a.h.e
    public boolean a(DrivingRoutePlanOption drivingRoutePlanOption) {
        c cVar = new c();
        cVar.a(SearchType.DRIVE_ROUTE);
        return a(new d(drivingRoutePlanOption), this.f8620g, cVar);
    }

    @Override // com.baidu.platform.a.h.e
    public boolean a(BikingRoutePlanOption bikingRoutePlanOption) {
        a aVar = new a();
        aVar.a(SearchType.BIKE_ROUTE);
        return a(new b(bikingRoutePlanOption), this.f8620g, aVar);
    }
}
