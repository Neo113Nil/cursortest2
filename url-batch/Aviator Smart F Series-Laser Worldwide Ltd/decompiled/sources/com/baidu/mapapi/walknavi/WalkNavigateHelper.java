package com.baidu.mapapi.walknavi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.baidu.entity.pb.WalkPlan;
import com.baidu.mapapi.PermissionUtils;
import com.baidu.mapapi.map.AbsBackgroundDrawNaviLayer;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.Polyline;
import com.baidu.mapapi.walknavi.adapter.IWAuthListener;
import com.baidu.mapapi.walknavi.adapter.IWEngineInitListener;
import com.baidu.mapapi.walknavi.adapter.IWMoreNPCModelOnClickListener;
import com.baidu.mapapi.walknavi.adapter.IWNPCLoadAndInitListener;
import com.baidu.mapapi.walknavi.adapter.IWNaviCalcRouteListener;
import com.baidu.mapapi.walknavi.adapter.IWNaviStatusListener;
import com.baidu.mapapi.walknavi.adapter.IWRouteGuidanceListener;
import com.baidu.mapapi.walknavi.adapter.IWRoutePlanListener;
import com.baidu.mapapi.walknavi.adapter.IWTTSPlayer;
import com.baidu.mapapi.walknavi.adapter.IWalkArInitListener;
import com.baidu.mapapi.walknavi.adapter.IWalkNaviLocationListener;
import com.baidu.mapapi.walknavi.controllers.WNavigatorWrapper;
import com.baidu.mapapi.walknavi.model.BaseNpcModel;
import com.baidu.mapapi.walknavi.model.MultiRouteDisplayOption;
import com.baidu.mapapi.walknavi.model.WalkExtraNaviMode;
import com.baidu.mapapi.walknavi.model.WalkLightNaviManager;
import com.baidu.mapapi.walknavi.model.WalkNaviDisplayOption;
import com.baidu.mapapi.walknavi.model.WalkNaviLocationResult;
import com.baidu.mapapi.walknavi.model.WalkNaviRotateMode;
import com.baidu.mapapi.walknavi.model.WalkNormalNaviManager;
import com.baidu.mapapi.walknavi.model.WalkRoutePlanError;
import com.baidu.mapapi.walknavi.model.WalkRouteResult;
import com.baidu.mapapi.walknavi.params.RouteNodeType;
import com.baidu.mapapi.walknavi.params.WalkNaviLaunchParam;
import com.baidu.platform.comapi.h.b;
import com.baidu.platform.comapi.h.n.e;
import com.baidu.platform.comapi.h.t.g;
import com.baidu.platform.comapi.walknavi.WalkNaviModeSwitchListener;
import com.baidu.platform.comapi.walknavi.h.c;
import com.baidu.platform.comapi.wnplatform.model.OverLookingMode;
import com.baidu.platform.comapi.wnplatform.model.datastruct.WLocData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class WalkNavigateHelper {

    /* renamed from: a, reason: collision with root package name */
    private static WalkNavigateHelper f7569a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f7570b;

    /* renamed from: f, reason: collision with root package name */
    private Activity f7574f;

    /* renamed from: h, reason: collision with root package name */
    private c f7576h;

    /* renamed from: j, reason: collision with root package name */
    private WalkLightNaviManager f7578j;

    /* renamed from: k, reason: collision with root package name */
    private WalkNormalNaviManager f7579k;

    /* renamed from: l, reason: collision with root package name */
    private e f7580l;

    /* renamed from: m, reason: collision with root package name */
    private IWalkArInitListener f7581m;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7571c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7572d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f7573e = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7575g = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7577i = false;
    public com.baidu.mapapi.walknavi.controllers.b.a walkNaviManager = new com.baidu.mapapi.walknavi.controllers.b.a();

    class a implements e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IWRoutePlanListener f7582a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ WalkNaviLaunchParam f7583b;

        /* renamed from: com.baidu.mapapi.walknavi.WalkNavigateHelper$a$a, reason: collision with other inner class name */
        class C0063a implements IWNaviCalcRouteListener {
            C0063a() {
            }

            @Override // com.baidu.mapapi.walknavi.adapter.IWNaviCalcRouteListener
            public void onNaviCalcRouteFail(WalkRoutePlanError walkRoutePlanError) {
                a.this.f7582a.onRoutePlanFail(walkRoutePlanError);
            }

            @Override // com.baidu.mapapi.walknavi.adapter.IWNaviCalcRouteListener
            public void onNaviCalcRouteSuccess() {
                a.this.f7582a.onRoutePlanSuccess();
            }
        }

        a(IWRoutePlanListener iWRoutePlanListener, WalkNaviLaunchParam walkNaviLaunchParam) {
            this.f7582a = iWRoutePlanListener;
            this.f7583b = walkNaviLaunchParam;
        }

        @Override // com.baidu.platform.comapi.h.n.e
        public void a() {
            this.f7582a.onRoutePlanStart();
        }

        @Override // com.baidu.platform.comapi.h.n.e
        public void b() {
            WalkPlan N = com.baidu.platform.comapi.walknavi.b.n().N();
            if (N == null || !N.hasOption() || N.getOption() == null || !N.getOption().hasStart() || N.getOption().getStart() == null || N.getOption().getStart().getSptCount() != 2 || !N.getOption().getStart().hasWd() || N.getOption().getStart().getWd() == null) {
                this.f7582a.onRoutePlanFail(WalkRoutePlanError.PARSE_FAIL);
                return;
            }
            if (g.c()) {
                WalkNavigateHelper.this.f7577i = true;
            }
            if (!g.e()) {
                com.baidu.platform.comapi.h.c.b().a(false);
                if (g.d()) {
                    this.f7582a.onRoutePlanFail(WalkRoutePlanError.IS_NOT_SUPPORT_INDOOR_NAVI);
                    return;
                }
            } else {
                if (!WalkNavigateHelper.this.a()) {
                    IWRoutePlanListener iWRoutePlanListener = this.f7582a;
                    if (iWRoutePlanListener != null) {
                        iWRoutePlanListener.onRoutePlanFail(WalkRoutePlanError.INVAILD_PERMISSION);
                        return;
                    }
                    return;
                }
                com.baidu.platform.comapi.h.c.b().a(true);
            }
            com.baidu.platform.comapi.h.n.g.c().a(N);
            WNavigatorWrapper.getWNavigator().f(1);
            WNavigatorWrapper.getWNavigator().d(this.f7583b.getExtraNaviMode());
            WalkNavigateHelper.this.f7576h = com.baidu.platform.comapi.h.n.g.c().a(N, this.f7583b);
            if (!com.baidu.platform.comapi.h.n.g.c().a(WalkNavigateHelper.this.f7576h)) {
                this.f7582a.onRoutePlanFail(WalkRoutePlanError.PARSE_FAIL);
                return;
            }
            RouteNodeType type = this.f7583b.getStartNodeInfo().getType();
            RouteNodeType routeNodeType = RouteNodeType.LOCATION;
            if (type == routeNodeType && this.f7583b.getEndNodeInfo().getType() == routeNodeType) {
                WalkNavigateHelper.getInstance().naviCalcRoute(0, new C0063a());
            } else {
                this.f7582a.onRoutePlanSuccess();
            }
        }

        @Override // com.baidu.platform.comapi.h.n.e
        public void a(int i8) {
            if (i8 == 16777214) {
                this.f7582a.onRoutePlanFail(WalkRoutePlanError.FORWARD_AK_ERROR);
                return;
            }
            if (i8 == 16777216) {
                this.f7582a.onRoutePlanFail(WalkRoutePlanError.SERVER_UNUSUAL);
            } else if (i8 != 805306368) {
                this.f7582a.onRoutePlanFail(WalkRoutePlanError.PARSE_FAIL);
            } else {
                this.f7582a.onRoutePlanFail(WalkRoutePlanError.NET_ERR);
            }
        }
    }

    class b implements b.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f7586a;

        b(Activity activity) {
            this.f7586a = activity;
        }

        @Override // com.baidu.platform.comapi.h.b.d
        public void onDownLoadError() {
            if (WalkNavigateHelper.this.f7581m != null) {
                WalkNavigateHelper.this.f7581m.onDownLoadError();
            }
        }

        @Override // com.baidu.platform.comapi.h.b.d
        public void onDownLoadFinish() {
            WalkNavigateHelper.this.f7571c = com.baidu.platform.comapi.walknavi.b.n().a(this.f7586a, (Bundle) null);
            if (WalkNavigateHelper.this.f7571c) {
                com.baidu.platform.comapi.walknavi.b.n().g0();
            }
            if (WalkNavigateHelper.this.f7581m != null) {
                WalkNavigateHelper.this.f7581m.onDownLoadFinish();
            }
        }

        @Override // com.baidu.platform.comapi.h.b.d
        public void onDownLoadProcess(int i8) {
            if (WalkNavigateHelper.this.f7581m != null) {
                WalkNavigateHelper.this.f7581m.onDownLoadProcess(i8);
            }
        }
    }

    private WalkNavigateHelper() {
    }

    public static WalkNavigateHelper getInstance() {
        if (f7569a == null) {
            f7569a = new WalkNavigateHelper();
        }
        return f7569a;
    }

    public void addMoreNPCModelOnClickListener(IWMoreNPCModelOnClickListener iWMoreNPCModelOnClickListener) {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null) {
            aVar.a(iWMoreNPCModelOnClickListener);
        }
    }

    public void addNPCLoadAndInitListener(IWNPCLoadAndInitListener iWNPCLoadAndInitListener) {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null) {
            aVar.a(iWNPCLoadAndInitListener);
        }
    }

    public void closeBackgroundDrawNavi() {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }

    public List<Polyline> displayRoutePlanResult(MapView mapView, MultiRouteDisplayOption multiRouteDisplayOption) {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null) {
            return aVar.a(mapView, multiRouteDisplayOption);
        }
        return null;
    }

    public AbsBackgroundDrawNaviLayer getBackgroundDrawNaviLayer() {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar == null) {
            return null;
        }
        return aVar.c();
    }

    public WalkLightNaviManager getLightNaviManager() {
        if (this.f7578j == null) {
            this.f7578j = new WalkLightNaviManager(this.walkNaviManager);
        }
        return this.f7578j;
    }

    public MapView getNaviMap() {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null) {
            return aVar.e();
        }
        return null;
    }

    public WalkNormalNaviManager getNormalNaviManager() {
        if (this.f7579k == null) {
            this.f7579k = new WalkNormalNaviManager(this.walkNaviManager);
        }
        return this.f7579k;
    }

    public WalkNaviLocationResult getWalkNaviLocationInfo() {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar == null) {
            return null;
        }
        return aVar.g();
    }

    public WalkRouteResult getWalkNaviRouteInfo() {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar == null) {
            return null;
        }
        return aVar.h();
    }

    public ArrayList<BaseNpcModel> getWalkNpcModelInfoList() {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null) {
            return aVar.i();
        }
        return null;
    }

    public List<WalkRouteResult> getWalkPlanRoute() {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar == null) {
            return null;
        }
        return aVar.j();
    }

    public boolean hasIndoorRoute() {
        return this.f7577i;
    }

    public void initNaviEngine(Context context, IWEngineInitListener iWEngineInitListener) {
        initNaviEngine(context, null, iWEngineInitListener);
    }

    public boolean isInit() {
        return this.f7570b;
    }

    public boolean isInitEngine() {
        return this.f7575g;
    }

    public void naviCalcRoute(int i8, IWNaviCalcRouteListener iWNaviCalcRouteListener) {
        com.baidu.platform.comapi.walknavi.b.n().i(i8);
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null) {
            aVar.a(this.f7576h, i8, iWNaviCalcRouteListener);
        }
    }

    public void naviToOverView() {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null) {
            aVar.l();
        }
    }

    public View onCreate(Activity activity) {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar == null) {
            return null;
        }
        this.f7574f = activity;
        return aVar.b(activity);
    }

    public void onDestroy(boolean z7) {
        if (z7) {
            if (this.f7581m != null) {
                this.f7581m = null;
                com.baidu.platform.comapi.walknavi.b.n().a((IWalkArInitListener) null);
            }
            if (this.f7580l != null) {
                com.baidu.platform.comapi.walknavi.b.n().b(this.f7580l);
            }
            this.f7579k = null;
            this.f7578j = null;
            this.f7570b = false;
            this.f7576h = null;
            if (f7569a != null) {
                f7569a = null;
            }
        }
    }

    public boolean openBackgroundDrawNavi(Context context) {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar == null) {
            return false;
        }
        return aVar.a(context);
    }

    public void pause() {
        com.baidu.platform.comapi.walknavi.b.n().W();
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null) {
            aVar.n();
        }
    }

    public void quit() {
        if (com.baidu.platform.comapi.walknavi.b.n().H() != null) {
            com.baidu.platform.comapi.walknavi.b.n().H().e();
        }
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null && this.f7570b) {
            aVar.o();
            this.walkNaviManager.p();
        }
        com.baidu.platform.comapi.h.b.a().b();
        com.baidu.platform.comapi.walknavi.b.n().c();
        com.baidu.platform.comapi.walknavi.b.n().Y();
        com.baidu.platform.comapi.walknavi.b.n().j0();
        com.baidu.mapapi.walknavi.controllers.b.a aVar2 = this.walkNaviManager;
        if (aVar2 != null) {
            aVar2.m();
            this.walkNaviManager = null;
        }
        this.f7570b = false;
        this.f7574f = null;
        this.f7576h = null;
        if (f7569a != null) {
            f7569a = null;
        }
    }

    public void resume() {
        Activity activity = this.f7574f;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        com.baidu.platform.comapi.walknavi.b.n().c0();
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null) {
            aVar.q();
        }
    }

    public void routePlanWithParams(WalkNaviLaunchParam walkNaviLaunchParam, IWRoutePlanListener iWRoutePlanListener) {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null) {
            if (!aVar.f()) {
                throw new com.baidu.mapapi.walknavi.controllers.a("BDMapSDKException: naviengine init failed, please init naviengine first");
            }
            if (walkNaviLaunchParam == null || walkNaviLaunchParam.getStartPt() == null || walkNaviLaunchParam.getEndPt() == null) {
                throw new com.baidu.mapapi.walknavi.controllers.a("BDMapSDKException: launch param or startPt or endPt cannot be null");
            }
            if (walkNaviLaunchParam.getExtraNaviMode() == 1 && !b()) {
                if (iWRoutePlanListener != null) {
                    iWRoutePlanListener.onRoutePlanFail(WalkRoutePlanError.INVAILD_PERMISSION);
                }
            } else if ((walkNaviLaunchParam.getStartNodeInfo().getBuildingID().isEmpty() && walkNaviLaunchParam.getEndNodeInfo().getBuildingID().isEmpty()) || a()) {
                com.baidu.platform.comapi.h.n.g.c().a(walkNaviLaunchParam, iWRoutePlanListener, false);
            } else if (iWRoutePlanListener != null) {
                iWRoutePlanListener.onRoutePlanFail(WalkRoutePlanError.INVAILD_PERMISSION);
            }
        }
    }

    public void routePlanWithRouteNode(WalkNaviLaunchParam walkNaviLaunchParam, IWRoutePlanListener iWRoutePlanListener) {
        if (walkNaviLaunchParam == null) {
            iWRoutePlanListener.onRoutePlanFail(WalkRoutePlanError.PARAM_ERROR);
            return;
        }
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar == null) {
            iWRoutePlanListener.onRoutePlanFail(WalkRoutePlanError.NAVI_STATUS_ERROR);
            return;
        }
        if (com.baidu.platform.comapi.walknavi.b.n().s().t()) {
            iWRoutePlanListener.onRoutePlanFail(WalkRoutePlanError.NAVI_STATUS_ERROR);
            return;
        }
        if (!aVar.f()) {
            iWRoutePlanListener.onRoutePlanFail(WalkRoutePlanError.ENGINE_STATUS_ERROR);
            return;
        }
        this.f7573e = walkNaviLaunchParam.getExtraNaviMode();
        if (walkNaviLaunchParam.getExtraNaviMode() == 1 && !b()) {
            if (iWRoutePlanListener != null) {
                iWRoutePlanListener.onRoutePlanFail(WalkRoutePlanError.INVAILD_PERMISSION);
                return;
            }
            return;
        }
        WalkNaviLaunchParam copy = walkNaviLaunchParam.copy();
        com.baidu.mapapi.walknavi.params.a startNodeInfo = copy.getStartNodeInfo();
        com.baidu.mapapi.walknavi.params.a endNodeInfo = copy.getEndNodeInfo();
        if (startNodeInfo == null || endNodeInfo == null) {
            iWRoutePlanListener.onRoutePlanFail(WalkRoutePlanError.PARAM_ERROR);
            return;
        }
        RouteNodeType type = startNodeInfo.getType();
        if (type != endNodeInfo.getType()) {
            iWRoutePlanListener.onRoutePlanFail(WalkRoutePlanError.PARAM_ERROR);
            return;
        }
        RouteNodeType routeNodeType = RouteNodeType.LOCATION;
        if (type != routeNodeType && type != RouteNodeType.KEYWORD) {
            iWRoutePlanListener.onRoutePlanFail(WalkRoutePlanError.PARAM_ERROR);
            return;
        }
        if (type == routeNodeType) {
            if (endNodeInfo.getLocation() == null) {
                iWRoutePlanListener.onRoutePlanFail(WalkRoutePlanError.PARAM_ERROR);
                return;
            } else if (startNodeInfo.getLocation() == null) {
                com.baidu.platform.comapi.h.n.g.c().a(copy, iWRoutePlanListener);
                return;
            } else {
                com.baidu.platform.comapi.h.n.g.c().a(copy, iWRoutePlanListener, true);
                return;
            }
        }
        String keyword = startNodeInfo.getKeyword();
        String keyword2 = endNodeInfo.getKeyword();
        if (keyword == null || keyword2 == null || keyword.isEmpty() || keyword2.isEmpty()) {
            iWRoutePlanListener.onRoutePlanFail(WalkRoutePlanError.PARAM_ERROR);
            return;
        }
        if ((!copy.getStartNodeInfo().getBuildingID().isEmpty() || !copy.getEndNodeInfo().getBuildingID().isEmpty()) && !a()) {
            if (iWRoutePlanListener != null) {
                iWRoutePlanListener.onRoutePlanFail(WalkRoutePlanError.INVAILD_PERMISSION);
            }
        } else {
            WNavigatorWrapper.getWNavigator().a(0, 0);
            if (this.f7580l == null) {
                this.f7580l = new a(iWRoutePlanListener, copy);
            }
            com.baidu.platform.comapi.walknavi.b.n().a(this.f7580l);
            com.baidu.platform.comapi.walknavi.b.n().B().a(copy);
        }
    }

    public void setArInitListener(IWalkArInitListener iWalkArInitListener) {
        this.f7581m = iWalkArInitListener;
        com.baidu.platform.comapi.walknavi.b.n().a(iWalkArInitListener);
    }

    public void setAuthListener(IWAuthListener iWAuthListener) {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null) {
            aVar.a(iWAuthListener);
        }
    }

    public void setBrowseStatus(boolean z7) {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null) {
            aVar.a(z7);
        }
    }

    public void setExtraNaviMode(WalkExtraNaviMode walkExtraNaviMode) {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null) {
            aVar.a(walkExtraNaviMode.getValue());
        }
    }

    public void setIsSwitchNavi(boolean z7) {
        this.f7572d = z7;
    }

    public void setNaviLocationListener(IWalkNaviLocationListener iWalkNaviLocationListener) {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar == null) {
            return;
        }
        aVar.a(iWalkNaviLocationListener);
    }

    public void setOriNaviOverlooking(OverLookingMode overLookingMode) {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null) {
            aVar.a(overLookingMode);
        }
    }

    public void setRotateMode(WalkNaviRotateMode walkNaviRotateMode) {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null) {
            aVar.a(walkNaviRotateMode);
        }
    }

    public void setRouteGuidanceListener(Activity activity, IWRouteGuidanceListener iWRouteGuidanceListener) {
        if (iWRouteGuidanceListener != null) {
            this.walkNaviManager.a(activity, iWRouteGuidanceListener);
        }
    }

    public boolean setShowLight(boolean z7) {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null) {
            return aVar.b(z7);
        }
        return false;
    }

    public void setTTsPlayer(IWTTSPlayer iWTTSPlayer) {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null) {
            aVar.a(iWTTSPlayer);
        }
    }

    public void setViewAllStatus(boolean z7) {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null) {
            aVar.c(z7);
        }
    }

    public void setWalkNaviDisplayOption(WalkNaviDisplayOption walkNaviDisplayOption) {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null) {
            aVar.a(walkNaviDisplayOption);
        }
    }

    public void setWalkNaviStatusListener(IWNaviStatusListener iWNaviStatusListener) {
        com.baidu.platform.comapi.walknavi.b.n().a(iWNaviStatusListener);
    }

    public void setWalkNpcModelInfoList(ArrayList<BaseNpcModel> arrayList) {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null) {
            aVar.a(arrayList);
        }
    }

    public void startCameraAndSetMapView(Activity activity) {
        this.walkNaviManager.c(activity);
    }

    public boolean startWalkNavi(Activity activity) {
        if (activity == null) {
            return false;
        }
        if (this.f7573e != 1) {
            this.f7571c = com.baidu.platform.comapi.walknavi.b.n().a(activity, (Bundle) null);
        } else {
            if (com.baidu.platform.comapi.h.c.b().d() && !PermissionUtils.getInstance().isWalkARNaviAuthorized()) {
                return false;
            }
            com.baidu.platform.comapi.h.b.a().a(activity, new b(activity));
        }
        if (!this.f7571c) {
            return false;
        }
        if (this.f7570b) {
            if (this.f7572d) {
                if (!com.baidu.platform.comapi.walknavi.b.n().g0()) {
                    return false;
                }
                this.f7572d = false;
            }
        } else {
            if (!com.baidu.platform.comapi.walknavi.b.n().g0()) {
                return false;
            }
            this.f7570b = true;
        }
        return true;
    }

    public void switchNPCModel(BaseNpcModel baseNpcModel) {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null) {
            aVar.a(baseNpcModel);
        }
    }

    public void switchWalkNaviMode(Activity activity, int i8, WalkNaviModeSwitchListener walkNaviModeSwitchListener) {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null) {
            aVar.a(activity, i8, walkNaviModeSwitchListener);
        }
    }

    public void triggerLocation(WLocData wLocData) {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null) {
            aVar.a(wLocData);
        }
    }

    public void unInitNaviEngine() {
        com.baidu.platform.comapi.walknavi.b.n().Y();
        com.baidu.platform.comapi.walknavi.b.n().j0();
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null) {
            aVar.m();
            this.walkNaviManager = null;
        }
        this.f7570b = false;
        this.f7575g = false;
        this.f7574f = null;
        this.f7576h = null;
        if (f7569a != null) {
            f7569a = null;
        }
    }

    public List<Polyline> displayRoutePlanResult(MapView mapView, int i8, MultiRouteDisplayOption multiRouteDisplayOption) {
        com.baidu.mapapi.walknavi.controllers.b.a aVar = this.walkNaviManager;
        if (aVar != null) {
            return aVar.a(mapView, i8, multiRouteDisplayOption);
        }
        return null;
    }

    public void initNaviEngine(Context context, com.baidu.platform.comapi.h.j.a aVar, IWEngineInitListener iWEngineInitListener) {
        com.baidu.mapapi.walknavi.controllers.b.a aVar2 = this.walkNaviManager;
        if (aVar2 != null) {
            aVar2.a(context, aVar, iWEngineInitListener);
            this.f7575g = true;
        }
    }

    private boolean b() {
        return PermissionUtils.getInstance().isWalkARNaviAuthorized();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        return PermissionUtils.getInstance().isIndoorNaviAuthorized();
    }
}
