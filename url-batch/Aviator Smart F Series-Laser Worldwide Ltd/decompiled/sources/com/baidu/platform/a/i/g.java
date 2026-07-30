package com.baidu.platform.a.i;

import com.baidu.mapapi.search.share.LocationShareURLOption;
import com.baidu.mapapi.search.share.OnGetShareUrlResultListener;
import com.baidu.mapapi.search.share.PoiDetailShareURLOption;
import com.baidu.mapapi.search.share.RouteShareURLOption;
import com.baidu.platform.base.SearchType;

/* loaded from: classes2.dex */
public class g extends com.baidu.platform.base.b implements a {

    /* renamed from: g, reason: collision with root package name */
    OnGetShareUrlResultListener f8625g = null;

    @Override // com.baidu.platform.a.i.a
    public boolean a(PoiDetailShareURLOption poiDetailShareURLOption) {
        f fVar = new f();
        fVar.a(SearchType.POI_DETAIL_SHARE);
        return a(new c(poiDetailShareURLOption), this.f8625g, fVar);
    }

    @Override // com.baidu.platform.a.i.a
    public void destroy() {
        this.f8690c.lock();
        this.f8625g = null;
        this.f8690c.unlock();
    }

    @Override // com.baidu.platform.a.i.a
    public boolean a(LocationShareURLOption locationShareURLOption) {
        f fVar = new f();
        fVar.a(SearchType.LOCATION_SEARCH_SHARE);
        return a(new b(locationShareURLOption), this.f8625g, fVar);
    }

    @Override // com.baidu.platform.a.i.a
    public boolean a(RouteShareURLOption routeShareURLOption) {
        d dVar = new d();
        dVar.a(SearchType.ROUTE_PLAN_SHARE);
        return a(new e(routeShareURLOption), this.f8625g, dVar);
    }

    @Override // com.baidu.platform.a.i.a
    public void a(OnGetShareUrlResultListener onGetShareUrlResultListener) {
        this.f8690c.lock();
        this.f8625g = onGetShareUrlResultListener;
        this.f8690c.unlock();
    }
}
