package com.baidu.mapapi.bikenavi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.baidu.entity.pb.WalkPlan;
import com.baidu.mapapi.bikenavi.adapter.IBAuthListener;
import com.baidu.mapapi.bikenavi.adapter.IBEngineInitListener;
import com.baidu.mapapi.bikenavi.adapter.IBNaviCalcRouteListener;
import com.baidu.mapapi.bikenavi.adapter.IBNaviStatusListener;
import com.baidu.mapapi.bikenavi.adapter.IBRouteGuidanceListener;
import com.baidu.mapapi.bikenavi.adapter.IBRoutePlanListener;
import com.baidu.mapapi.bikenavi.adapter.IBTTSPlayer;
import com.baidu.mapapi.bikenavi.adapter.IBikeNaviLocationListener;
import com.baidu.mapapi.bikenavi.controllers.BNavigatorWrapper;
import com.baidu.mapapi.bikenavi.controllers.UnsupportedBikeNaviException;
import com.baidu.mapapi.bikenavi.model.BikeExtraNaviMode;
import com.baidu.mapapi.bikenavi.model.BikeLightNaviManager;
import com.baidu.mapapi.bikenavi.model.BikeNaviDisplayOption;
import com.baidu.mapapi.bikenavi.model.BikeNaviLocationResult;
import com.baidu.mapapi.bikenavi.model.BikeNaviRotateMode;
import com.baidu.mapapi.bikenavi.model.BikeNormalNaviManager;
import com.baidu.mapapi.bikenavi.model.BikeRoutePlanError;
import com.baidu.mapapi.bikenavi.model.BikeRouteResult;
import com.baidu.mapapi.bikenavi.model.d;
import com.baidu.mapapi.bikenavi.params.BikeNaviLaunchParam;
import com.baidu.mapapi.bikenavi.params.BikeRouteNodeInfo;
import com.baidu.mapapi.map.AbsBackgroundDrawNaviLayer;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.Polyline;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.h.c;
import com.baidu.platform.comapi.h.n.b;
import com.baidu.platform.comapi.walknavi.b;
import com.baidu.platform.comapi.wnplatform.model.OverLookingMode;
import com.baidu.platform.comapi.wnplatform.model.datastruct.WLocData;
import java.util.List;

/* loaded from: classes2.dex */
public class BikeNavigateHelper {

    /* renamed from: a, reason: collision with root package name */
    private static BikeNavigateHelper f5357a;

    /* renamed from: d, reason: collision with root package name */
    boolean f5360d;

    /* renamed from: e, reason: collision with root package name */
    Activity f5361e;

    /* renamed from: f, reason: collision with root package name */
    Activity f5362f;

    /* renamed from: h, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.h.a f5364h;

    /* renamed from: i, reason: collision with root package name */
    private BikeLightNaviManager f5365i;

    /* renamed from: j, reason: collision with root package name */
    private BikeNormalNaviManager f5366j;

    /* renamed from: k, reason: collision with root package name */
    private b f5367k;

    /* renamed from: c, reason: collision with root package name */
    private boolean f5359c = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5363g = false;

    /* renamed from: b, reason: collision with root package name */
    private com.baidu.mapapi.bikenavi.controllers.a.a f5358b = new com.baidu.mapapi.bikenavi.controllers.a.a();

    class a implements b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IBRoutePlanListener f5368a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BikeNaviLaunchParam f5369b;

        a(IBRoutePlanListener iBRoutePlanListener, BikeNaviLaunchParam bikeNaviLaunchParam) {
            this.f5368a = iBRoutePlanListener;
            this.f5369b = bikeNaviLaunchParam;
        }

        @Override // com.baidu.platform.comapi.h.n.b
        public void a() {
            this.f5368a.onRoutePlanStart();
        }

        @Override // com.baidu.platform.comapi.h.n.b
        public void b() {
            WalkPlan N = com.baidu.platform.comapi.walknavi.b.n().N();
            if (N == null || !N.hasOption() || N.getOption() == null || !N.getOption().hasStart() || N.getOption().getStart() == null || N.getOption().getStart().getSptCount() != 2 || !N.getOption().getStart().hasWd() || N.getOption().getStart().getWd() == null) {
                this.f5368a.onRoutePlanFail(BikeRoutePlanError.PARSE_FAIL);
                return;
            }
            c.b().a(false);
            com.baidu.platform.comapi.h.n.c.c().a(N);
            BNavigatorWrapper.getWNavigator().d(this.f5369b.getExtraNaviMode());
            BNavigatorWrapper.getWNavigator().f(1);
            BikeNavigateHelper.this.f5364h = com.baidu.platform.comapi.h.n.c.c().a(N, this.f5369b);
            if (com.baidu.platform.comapi.h.n.c.c().a(BikeNavigateHelper.this.f5364h)) {
                this.f5368a.onRoutePlanSuccess();
            } else {
                this.f5368a.onRoutePlanFail(BikeRoutePlanError.PARSE_FAIL);
            }
        }

        @Override // com.baidu.platform.comapi.h.n.b
        public void a(int i8) {
            if (i8 == 16777214) {
                this.f5368a.onRoutePlanFail(BikeRoutePlanError.FORWARD_AK_ERROR);
                return;
            }
            if (i8 == 16777216) {
                this.f5368a.onRoutePlanFail(BikeRoutePlanError.SERVER_UNUSUAL);
            } else if (i8 != 805306368) {
                this.f5368a.onRoutePlanFail(BikeRoutePlanError.PARSE_FAIL);
            } else {
                this.f5368a.onRoutePlanFail(BikeRoutePlanError.NET_ERR);
            }
        }
    }

    private BikeNavigateHelper() {
    }

    public static BikeNavigateHelper getInstance() {
        if (f5357a == null) {
            f5357a = new BikeNavigateHelper();
        }
        return f5357a;
    }

    public void closeBackgroundDrawNavi() {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    public List<Polyline> displayRoutePlanResult(MapView mapView, d dVar) {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar == null) {
            return null;
        }
        return aVar.a(mapView, dVar);
    }

    public AbsBackgroundDrawNaviLayer getBackgroundDrawNaviLayer() {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar == null) {
            return null;
        }
        return aVar.c();
    }

    public BikeNaviLocationResult getBikeNaviLocationInfo() {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar == null) {
            return null;
        }
        return aVar.d();
    }

    public BikeRouteResult getBikeNaviRouteInfo() {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar == null) {
            return null;
        }
        return aVar.e();
    }

    public List<BikeRouteResult> getBikePlanRoute() {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar == null) {
            return null;
        }
        return aVar.f();
    }

    public BikeLightNaviManager getLightNaviManager() {
        if (this.f5365i == null) {
            this.f5365i = new BikeLightNaviManager(this.f5358b);
        }
        return this.f5365i;
    }

    public MapView getNaviMap() {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar != null) {
            return aVar.h();
        }
        return null;
    }

    public BikeNormalNaviManager getNormalNaviManager() {
        if (this.f5366j == null) {
            this.f5366j = new BikeNormalNaviManager(this.f5358b);
        }
        return this.f5366j;
    }

    public void initNaviEngine(Context context, IBEngineInitListener iBEngineInitListener) {
        initNaviEngine(context, null, iBEngineInitListener);
    }

    public boolean isInitEngine() {
        return this.f5359c;
    }

    public void naviCalcRoute(int i8, IBNaviCalcRouteListener iBNaviCalcRouteListener) {
        if (this.f5358b == null) {
            return;
        }
        com.baidu.platform.comapi.walknavi.b.n().i(i8);
        this.f5358b.a(this.f5364h, i8, iBNaviCalcRouteListener);
    }

    public void naviToOverView() {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar != null) {
            aVar.j();
        }
    }

    public View onCreate(Activity activity) {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar == null) {
            return null;
        }
        this.f5361e = activity;
        return aVar.a(activity);
    }

    public void onDestroy(boolean z7) {
        if (z7) {
            if (this.f5367k != null) {
                com.baidu.platform.comapi.walknavi.b.n().b(this.f5367k);
            }
            this.f5365i = null;
            this.f5366j = null;
            this.f5360d = false;
            this.f5364h = null;
            if (f5357a != null) {
                f5357a = null;
            }
        }
    }

    public boolean openBackgroundDrawNavi(Context context) {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar == null) {
            return false;
        }
        return aVar.a(context);
    }

    public void pause() {
        com.baidu.platform.comapi.walknavi.b.n().W();
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar != null) {
            aVar.l();
        }
    }

    public void quit() {
        if (com.baidu.platform.comapi.walknavi.b.n().H() != null) {
            com.baidu.platform.comapi.walknavi.b.n().H().e();
        }
        com.baidu.platform.comapi.walknavi.b.n().c();
        com.baidu.platform.comapi.walknavi.b.n().Y();
        com.baidu.platform.comapi.walknavi.b.n().j0();
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar != null) {
            aVar.k();
            this.f5358b = null;
        }
        this.f5360d = false;
        this.f5361e = null;
        this.f5364h = null;
        if (f5357a != null) {
            f5357a = null;
        }
    }

    public void resume() {
        Activity activity = this.f5361e;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        com.baidu.platform.comapi.walknavi.b.n().c0();
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar != null) {
            aVar.m();
        }
    }

    public void routePlanWithParams(BikeNaviLaunchParam bikeNaviLaunchParam, IBRoutePlanListener iBRoutePlanListener) {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar != null) {
            if (!aVar.i()) {
                throw new UnsupportedBikeNaviException("BDMapSDKException: naviengine init failed, please init naviengine first");
            }
            if (bikeNaviLaunchParam == null || bikeNaviLaunchParam.getStartPt() == null || bikeNaviLaunchParam.getEndPt() == null) {
                throw new UnsupportedBikeNaviException("BDMapSDKException: launch param or startPt or endPt cannot be null");
            }
            GeoPoint ll2mc = CoordUtil.ll2mc(bikeNaviLaunchParam.getStartPt());
            GeoPoint ll2mc2 = CoordUtil.ll2mc(bikeNaviLaunchParam.getEndPt());
            com.baidu.platform.comapi.walknavi.h.a create = BikeNaviLaunchParam.create();
            if (bikeNaviLaunchParam.getVehicle() == 1) {
                create.c(bikeNaviLaunchParam.getVehicle());
            }
            create.a(1);
            BNavigatorWrapper.getWNavigator().f(1);
            BNavigatorWrapper.getWNavigator().d(bikeNaviLaunchParam.getExtraNaviMode());
            com.baidu.platform.comapi.walknavi.b.n().b(bikeNaviLaunchParam.getStartPt());
            com.baidu.platform.comapi.walknavi.b.n().a(bikeNaviLaunchParam.getEndPt());
            create.a((int) ll2mc.getLongitudeE6(), (int) ll2mc.getLatitudeE6(), 131, "");
            create.b(0);
            create.a(new int[]{(int) ll2mc2.getLongitudeE6()}, new int[]{(int) ll2mc2.getLatitudeE6()}, new int[]{131}, (String[]) null);
            com.baidu.platform.comapi.h.n.c.c().b(create, iBRoutePlanListener);
        }
    }

    public void routePlanWithRouteNode(BikeNaviLaunchParam bikeNaviLaunchParam, IBRoutePlanListener iBRoutePlanListener) {
        if (bikeNaviLaunchParam == null) {
            iBRoutePlanListener.onRoutePlanFail(BikeRoutePlanError.PARAM_ERROR);
            return;
        }
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar == null) {
            iBRoutePlanListener.onRoutePlanFail(BikeRoutePlanError.NAVI_STATUS_ERROR);
            return;
        }
        if (com.baidu.platform.comapi.walknavi.b.n().s().t()) {
            iBRoutePlanListener.onRoutePlanFail(BikeRoutePlanError.NAVI_STATUS_ERROR);
            return;
        }
        if (!aVar.i()) {
            iBRoutePlanListener.onRoutePlanFail(BikeRoutePlanError.ENGINE_STATUS_ERROR);
            return;
        }
        BikeNaviLaunchParam copy = bikeNaviLaunchParam.copy();
        BikeRouteNodeInfo startNodeInfo = copy.getStartNodeInfo();
        BikeRouteNodeInfo endNodeInfo = copy.getEndNodeInfo();
        if (startNodeInfo == null || endNodeInfo == null) {
            iBRoutePlanListener.onRoutePlanFail(BikeRoutePlanError.PARAM_ERROR);
            return;
        }
        com.baidu.mapapi.bikenavi.params.a type = startNodeInfo.getType();
        if (type != endNodeInfo.getType()) {
            iBRoutePlanListener.onRoutePlanFail(BikeRoutePlanError.PARAM_ERROR);
            return;
        }
        com.baidu.mapapi.bikenavi.params.a aVar2 = com.baidu.mapapi.bikenavi.params.a.LOCATION;
        if (type != aVar2 && type != com.baidu.mapapi.bikenavi.params.a.KEYWORD) {
            iBRoutePlanListener.onRoutePlanFail(BikeRoutePlanError.PARAM_ERROR);
            return;
        }
        BNavigatorWrapper.getWNavigator().d(copy.getExtraNaviMode());
        if (b.j.LIGHT.a() == copy.getExtraNaviMode()) {
            c.b().a(16);
        } else {
            c.b().a(1);
        }
        if (type == aVar2) {
            if (endNodeInfo.getLocation() == null) {
                iBRoutePlanListener.onRoutePlanFail(BikeRoutePlanError.PARAM_ERROR);
                return;
            } else if (startNodeInfo.getLocation() == null) {
                com.baidu.platform.comapi.h.n.c.c().b(copy, iBRoutePlanListener);
                return;
            } else {
                com.baidu.platform.comapi.h.n.c.c().a(copy, iBRoutePlanListener);
                return;
            }
        }
        String keyword = startNodeInfo.getKeyword();
        String keyword2 = endNodeInfo.getKeyword();
        if (keyword == null || keyword2 == null || keyword.isEmpty() || keyword2.isEmpty()) {
            iBRoutePlanListener.onRoutePlanFail(BikeRoutePlanError.PARAM_ERROR);
            return;
        }
        int vehicle = copy.getVehicle();
        if (vehicle == 0) {
            BNavigatorWrapper.getWNavigator().a(1, 1);
        } else if (vehicle == 1) {
            BNavigatorWrapper.getWNavigator().a(2, 1);
        }
        if (this.f5367k == null) {
            this.f5367k = new a(iBRoutePlanListener, copy);
        }
        com.baidu.platform.comapi.walknavi.b.n().a(this.f5367k);
        com.baidu.platform.comapi.walknavi.b.n().B().a(copy);
    }

    public void setAuthListener(IBAuthListener iBAuthListener) {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar != null) {
            aVar.a(iBAuthListener);
        }
    }

    public void setBikeNaviDisplayOption(BikeNaviDisplayOption bikeNaviDisplayOption) {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar != null) {
            aVar.a(bikeNaviDisplayOption);
        }
    }

    public void setBikeNaviStatusListener(IBNaviStatusListener iBNaviStatusListener) {
        com.baidu.platform.comapi.walknavi.b.n().a(iBNaviStatusListener);
    }

    public void setBrowseStatus(boolean z7) {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar != null) {
            aVar.a(z7);
        }
    }

    public void setExtraNaviMode(BikeExtraNaviMode bikeExtraNaviMode) {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar != null) {
            aVar.a(bikeExtraNaviMode.getValue());
        }
    }

    public void setIsSwitchNavi(boolean z7) {
        this.f5363g = z7;
    }

    public void setNaviLocationListener(IBikeNaviLocationListener iBikeNaviLocationListener) {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar == null) {
            return;
        }
        aVar.a(iBikeNaviLocationListener);
    }

    public boolean setNaviMapUp() {
        MapView h8 = this.f5358b.h();
        if (h8 == null) {
            return false;
        }
        h8.setZOrderMediaOverlay(true);
        return true;
    }

    public void setOriNaviOverlooking(OverLookingMode overLookingMode) {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar != null) {
            aVar.a(overLookingMode);
        }
    }

    public void setRotateMode(BikeNaviRotateMode bikeNaviRotateMode) {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar != null) {
            aVar.a(bikeNaviRotateMode);
        }
    }

    public void setRouteGuidanceListener(Activity activity, IBRouteGuidanceListener iBRouteGuidanceListener) {
        if (iBRouteGuidanceListener != null) {
            this.f5358b.a(activity, iBRouteGuidanceListener);
        }
    }

    public boolean setShowLight(boolean z7) {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar != null) {
            return aVar.b(z7);
        }
        return false;
    }

    public void setTTsPlayer(IBTTSPlayer iBTTSPlayer) {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar != null) {
            aVar.a(iBTTSPlayer);
        }
    }

    public void setViewAllStatus(boolean z7) {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar != null) {
            aVar.c(z7);
        }
    }

    public void showUIDebuggable(String str) {
        this.f5358b.a(str);
    }

    public boolean startBikeNavi(Activity activity) {
        if (!com.baidu.platform.comapi.walknavi.b.n().a(activity, (Bundle) null)) {
            return false;
        }
        if (this.f5360d) {
            if (this.f5363g) {
                if (!com.baidu.platform.comapi.walknavi.b.n().g0()) {
                    return false;
                }
                this.f5363g = false;
            }
        } else {
            if (!com.baidu.platform.comapi.walknavi.b.n().g0()) {
                return false;
            }
            this.f5360d = true;
        }
        return true;
    }

    public void triggerLocation(WLocData wLocData) {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar != null) {
            aVar.a(wLocData);
        }
    }

    public void unInitNaviEngine() {
        com.baidu.platform.comapi.walknavi.b.n().Y();
        com.baidu.platform.comapi.walknavi.b.n().j0();
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar != null) {
            aVar.k();
            this.f5358b = null;
        }
        this.f5360d = false;
        this.f5359c = false;
        this.f5361e = null;
        this.f5362f = null;
        this.f5364h = null;
        if (f5357a != null) {
            f5357a = null;
        }
    }

    public List<Polyline> displayRoutePlanResult(MapView mapView, int i8, d dVar) {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar = this.f5358b;
        if (aVar == null) {
            return null;
        }
        return aVar.a(mapView, i8, dVar);
    }

    public void initNaviEngine(Context context, com.baidu.platform.comapi.h.j.a aVar, IBEngineInitListener iBEngineInitListener) {
        com.baidu.mapapi.bikenavi.controllers.a.a aVar2 = this.f5358b;
        if (aVar2 != null) {
            aVar2.a(context, aVar, iBEngineInitListener);
            this.f5359c = true;
        }
    }
}
