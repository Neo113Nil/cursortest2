package com.baidu.mapapi.search.share;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.search.core.a;
import com.baidu.mapapi.search.route.PlanNode;
import com.baidu.mapapi.search.share.RouteShareURLOption;
import com.baidu.platform.a.i.g;

/* loaded from: classes2.dex */
public class ShareUrlSearch extends a {

    /* renamed from: b, reason: collision with root package name */
    private boolean f7442b = false;

    /* renamed from: a, reason: collision with root package name */
    com.baidu.platform.a.i.a f7441a = new g();

    ShareUrlSearch() {
    }

    private boolean a(String str) {
        return true;
    }

    public static ShareUrlSearch newInstance() {
        BMapManager.init();
        return new ShareUrlSearch();
    }

    public void destroy() {
        if (this.f7442b) {
            return;
        }
        this.f7442b = true;
        this.f7441a.destroy();
        BMapManager.destroy();
    }

    public boolean requestLocationShareUrl(LocationShareURLOption locationShareURLOption) {
        com.baidu.platform.a.i.a aVar = this.f7441a;
        if (aVar == null) {
            throw new IllegalStateException("BDMapSDKException: searcher has been destroyed");
        }
        if (locationShareURLOption == null || locationShareURLOption.mLocation == null || locationShareURLOption.mName == null || locationShareURLOption.mSnippet == null) {
            throw new IllegalArgumentException("BDMapSDKException: option or name or snippet  can not be null");
        }
        return aVar.a(locationShareURLOption);
    }

    public boolean requestPoiDetailShareUrl(PoiDetailShareURLOption poiDetailShareURLOption) {
        com.baidu.platform.a.i.a aVar = this.f7441a;
        if (aVar == null) {
            throw new IllegalStateException("BDMapSDKException: searcher has been destroyed");
        }
        if (poiDetailShareURLOption == null || poiDetailShareURLOption.mUid == null) {
            throw new IllegalArgumentException("BDMapSDKException: option or uid can not be null");
        }
        return aVar.a(poiDetailShareURLOption);
    }

    public boolean requestRouteShareUrl(RouteShareURLOption routeShareURLOption) {
        if (this.f7441a == null) {
            throw new IllegalStateException("BDMapSDKException: searcher has been destroyed");
        }
        if (routeShareURLOption == null) {
            throw new IllegalArgumentException("BDMapSDKException: option is null");
        }
        if (routeShareURLOption.getmMode().ordinal() < 0) {
            return false;
        }
        PlanNode planNode = routeShareURLOption.mFrom;
        if (planNode == null || routeShareURLOption.mTo == null) {
            throw new IllegalArgumentException("BDMapSDKException: start or end point can not be null");
        }
        if (routeShareURLOption.mMode == RouteShareURLOption.RouteShareMode.BUS_ROUTE_SHARE_MODE) {
            if ((planNode.getLocation() == null || routeShareURLOption.mTo.getLocation() == null) && routeShareURLOption.mCityCode < 0) {
                throw new IllegalArgumentException("BDMapSDKException: city code can not be null if don't set start or end point");
            }
        } else {
            if (planNode.getLocation() == null && !a(routeShareURLOption.mFrom.getCity())) {
                throw new IllegalArgumentException("BDMapSDKException: start cityCode must be set if not set start location");
            }
            if (routeShareURLOption.mTo.getLocation() == null && !a(routeShareURLOption.mTo.getCity())) {
                throw new IllegalArgumentException("BDMapSDKException: end cityCode must be set if not set end location");
            }
        }
        return this.f7441a.a(routeShareURLOption);
    }

    public void setOnGetShareUrlResultListener(OnGetShareUrlResultListener onGetShareUrlResultListener) {
        com.baidu.platform.a.i.a aVar = this.f7441a;
        if (aVar == null) {
            throw new IllegalStateException("BDMapSDKException: searcher has been destroyed");
        }
        if (onGetShareUrlResultListener == null) {
            throw new IllegalArgumentException("BDMapSDKException: listener can not be null");
        }
        aVar.a(onGetShareUrlResultListener);
    }
}
