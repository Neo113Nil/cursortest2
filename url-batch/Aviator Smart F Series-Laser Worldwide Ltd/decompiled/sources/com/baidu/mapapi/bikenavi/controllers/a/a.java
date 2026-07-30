package com.baidu.mapapi.bikenavi.controllers.a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.baidu.entity.pb.WalkPlan;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.PermissionUtils;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.bikenavi.adapter.IBAuthListener;
import com.baidu.mapapi.bikenavi.adapter.IBEngineInitListener;
import com.baidu.mapapi.bikenavi.adapter.IBNaviCalcRouteListener;
import com.baidu.mapapi.bikenavi.adapter.IBRouteGuidanceListener;
import com.baidu.mapapi.bikenavi.adapter.IBTTSPlayer;
import com.baidu.mapapi.bikenavi.adapter.IBikeNaviLocationListener;
import com.baidu.mapapi.bikenavi.controllers.BNavigatorWrapper;
import com.baidu.mapapi.bikenavi.controllers.UnsupportedBikeNaviException;
import com.baidu.mapapi.bikenavi.model.BikeNaviDisplayOption;
import com.baidu.mapapi.bikenavi.model.BikeNaviLocationResult;
import com.baidu.mapapi.bikenavi.model.BikeNaviRotateMode;
import com.baidu.mapapi.bikenavi.model.BikeRoutePlanError;
import com.baidu.mapapi.bikenavi.model.BikeRouteResult;
import com.baidu.mapapi.common.BaiduMapSDKException;
import com.baidu.mapapi.map.AbsBackgroundDrawNaviLayer;
import com.baidu.mapapi.map.BackgroundDrawNaviLayer;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapLanguage;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.map.Polyline;
import com.baidu.mapapi.map.PolylineOptions;
import com.baidu.mapapi.map.entity.BackgroundNaviEntity;
import com.baidu.mapapi.map.entity.BackgroundNaviLocEntity;
import com.baidu.mapapi.map.entity.BackgroundNaviRealTimeInfoEntity;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;
import com.baidu.mapapi.walknavi.controllers.WNavigatorWrapper;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.h.j.a;
import com.baidu.platform.comapi.license.ILicenseAuthManager;
import com.baidu.platform.comapi.license.ILicenseAuthManagerListener;
import com.baidu.platform.comapi.license.LicenseAuthManagerProvider;
import com.baidu.platform.comapi.walknavi.b;
import com.baidu.platform.comapi.wnplatform.model.OverLookingMode;
import com.baidu.platform.comapi.wnplatform.model.datastruct.WLocData;
import com.baidu.platform.comapi.wnplatform.tts.BaseTTSPlayer;
import com.baidu.platform.comapi.wnplatform.walkmap.WNaviBaiduMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    FrameLayout f5374d;

    /* renamed from: e, reason: collision with root package name */
    FrameLayout f5375e;

    /* renamed from: g, reason: collision with root package name */
    private IBAuthListener f5377g;

    /* renamed from: h, reason: collision with root package name */
    private BackgroundDrawNaviLayer f5378h;

    /* renamed from: i, reason: collision with root package name */
    private e f5379i;

    /* renamed from: j, reason: collision with root package name */
    private f f5380j;

    /* renamed from: k, reason: collision with root package name */
    private IBikeNaviLocationListener f5381k;

    /* renamed from: l, reason: collision with root package name */
    private g f5382l;

    /* renamed from: a, reason: collision with root package name */
    private MapView f5371a = null;

    /* renamed from: b, reason: collision with root package name */
    private View f5372b = null;

    /* renamed from: c, reason: collision with root package name */
    private View f5373c = null;

    /* renamed from: f, reason: collision with root package name */
    private final ILicenseAuthManager f5376f = LicenseAuthManagerProvider.getInstance().getMultiScreenRidingNaviAuthManager();

    /* renamed from: com.baidu.mapapi.bikenavi.controllers.a.a$a, reason: collision with other inner class name */
    class C0058a implements com.baidu.platform.comapi.walknavi.e.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IBEngineInitListener f5383a;

        C0058a(IBEngineInitListener iBEngineInitListener) {
            this.f5383a = iBEngineInitListener;
        }

        @Override // com.baidu.platform.comapi.walknavi.e.a
        public void engineInitFail() {
            this.f5383a.engineInitFail();
        }

        @Override // com.baidu.platform.comapi.walknavi.e.a
        public void engineInitSuccess() {
            a.this.b();
            this.f5383a.engineInitSuccess();
        }
    }

    class b implements com.baidu.platform.comapi.h.n.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IBNaviCalcRouteListener f5385a;

        b(IBNaviCalcRouteListener iBNaviCalcRouteListener) {
            this.f5385a = iBNaviCalcRouteListener;
        }

        @Override // com.baidu.platform.comapi.h.n.f
        public void a() {
        }

        @Override // com.baidu.platform.comapi.h.n.f
        public void onRoutePlanStart() {
        }

        @Override // com.baidu.platform.comapi.h.n.f
        public void onRoutePlanSuccess() {
            IBNaviCalcRouteListener iBNaviCalcRouteListener = this.f5385a;
            if (iBNaviCalcRouteListener != null) {
                iBNaviCalcRouteListener.onNaviCalcRouteSuccess();
            }
        }

        @Override // com.baidu.platform.comapi.h.n.f
        public void a(int i8) {
            IBNaviCalcRouteListener iBNaviCalcRouteListener = this.f5385a;
            if (iBNaviCalcRouteListener != null) {
                iBNaviCalcRouteListener.onNaviCalcRouteFail(BikeRoutePlanError.PARSE_FAIL);
            }
        }
    }

    class c implements BaiduMap.OnMapLoadedCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaiduMap f5387a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f5388b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MapView f5389c;

        c(BaiduMap baiduMap, float f8, MapView mapView) {
            this.f5387a = baiduMap;
            this.f5388b = f8;
            this.f5389c = mapView;
        }

        @Override // com.baidu.mapapi.map.BaiduMap.OnMapLoadedCallback
        public void onMapLoaded() {
            BaiduMap baiduMap = this.f5387a;
            baiduMap.setMaxAndMinZoomLevel(this.f5388b, baiduMap.getMinZoomLevel());
            this.f5387a.setMapStatus(MapStatusUpdateFactory.zoomTo(this.f5389c.getMapLevel()));
        }
    }

    static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5391a;

        static {
            int[] iArr = new int[BikeNaviRotateMode.values().length];
            f5391a = iArr;
            try {
                iArr[BikeNaviRotateMode.EN_Rotate_Mode_Car.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5391a[BikeNaviRotateMode.EN_Rotate_Mode_Map.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private class e implements com.baidu.platform.comapi.h.m.a {

        /* renamed from: a, reason: collision with root package name */
        private final Bundle f5392a = new Bundle();

        e() {
            onNaviLocationUpdate();
        }

        @Override // com.baidu.platform.comapi.h.m.a
        public void a(Bundle bundle) {
        }

        @Override // com.baidu.platform.comapi.h.m.a
        public void b(Bundle bundle) {
        }

        @Override // com.baidu.platform.comapi.h.m.a
        public void c(Bundle bundle) {
        }

        @Override // com.baidu.platform.comapi.h.m.a
        public void d(Bundle bundle) {
        }

        @Override // com.baidu.platform.comapi.h.m.a
        public void e(Bundle bundle) {
        }

        @Override // com.baidu.platform.comapi.h.m.a
        public void f(Bundle bundle) {
        }

        @Override // com.baidu.platform.comapi.h.m.a
        public void onNaviLocationUpdate() {
            com.baidu.platform.comapi.walknavi.b wNavigator;
            com.baidu.platform.comapi.h.e.a s7;
            BackgroundDrawNaviLayer backgroundDrawNaviLayer = a.this.f5378h;
            if (backgroundDrawNaviLayer == null || (wNavigator = BNavigatorWrapper.getWNavigator()) == null || (s7 = wNavigator.s()) == null) {
                return;
            }
            this.f5392a.clear();
            if (s7.k(this.f5392a) != 0) {
                return;
            }
            com.baidu.platform.comapi.wnplatform.model.f fVar = new com.baidu.platform.comapi.wnplatform.model.f(this.f5392a);
            BackgroundNaviRealTimeInfoEntity backgroundNaviRealTimeInfoEntity = new BackgroundNaviRealTimeInfoEntity();
            LatLng i8 = fVar.i();
            if (i8 != null) {
                GeoPoint a8 = a(i8);
                backgroundNaviRealTimeInfoEntity.setStPosX(a8.getLongitude());
                backgroundNaviRealTimeInfoEntity.setStPosY(a8.getLatitude());
            }
            LatLng h8 = fVar.h();
            if (h8 != null) {
                GeoPoint a9 = a(h8);
                backgroundNaviRealTimeInfoEntity.setStCurStartPosX(a9.getLongitude());
                backgroundNaviRealTimeInfoEntity.setStCurStartPosY(a9.getLatitude());
            }
            LatLng g8 = fVar.g();
            if (g8 != null) {
                GeoPoint a10 = a(g8);
                backgroundNaviRealTimeInfoEntity.setStCurRouteProjectPosX(a10.getLongitude());
                backgroundNaviRealTimeInfoEntity.setStCurRouteProjectPosY(a10.getLatitude());
            }
            backgroundNaviRealTimeInfoEntity.setnCurRouteShapeIdx(fVar.a());
            backgroundNaviRealTimeInfoEntity.setRotateAngle(fVar.e());
            backgroundNaviRealTimeInfoEntity.setRouteAngle(fVar.f());
            backgroundNaviRealTimeInfoEntity.setbIsNearOrFarawayStatus(fVar.l());
            backgroundNaviRealTimeInfoEntity.setbMatchPosLinkIsUnverified(fVar.k());
            backgroundNaviRealTimeInfoEntity.setbGuide(fVar.j());
            backgroundNaviRealTimeInfoEntity.setMapLevel(fVar.b());
            backgroundNaviRealTimeInfoEntity.setbRedLine(fVar.m());
            backgroundNaviRealTimeInfoEntity.setNaviType(fVar.d());
            backgroundNaviRealTimeInfoEntity.setNaviScene(fVar.c());
            BikeNaviLocationResult d8 = a.this.d();
            BackgroundNaviLocEntity backgroundNaviLocEntity = new BackgroundNaviLocEntity();
            backgroundNaviLocEntity.setCurRouteShapeIdx(d8.getCurRouteShapeIdx());
            backgroundNaviLocEntity.setGpsSpeed(d8.getGpsSpeed());
            backgroundNaviLocEntity.setGpsDirection(d8.getGpsDirection());
            GeoPoint a11 = a(d8.getGpsLatitude(), d8.getGpsLongitude());
            backgroundNaviLocEntity.setGpsLatitude(a11.getLatitude());
            backgroundNaviLocEntity.setGpsLongitude(a11.getLongitude());
            backgroundNaviLocEntity.setPostSpeed(d8.getPostSpeed());
            backgroundNaviLocEntity.setPostDirection(d8.getPostDirection());
            GeoPoint a12 = a(d8.getPostLatitude(), d8.getPostLongitude());
            backgroundNaviLocEntity.setPostLatitude(a12.getLatitude());
            backgroundNaviLocEntity.setPostLongitude(a12.getLongitude());
            backgroundDrawNaviLayer.updateNaviRealTimeInfo(backgroundNaviRealTimeInfoEntity, backgroundNaviLocEntity);
        }

        @Override // com.baidu.platform.comapi.h.m.a
        public void a(byte[] bArr) {
        }

        private GeoPoint a(double d8, double d9) {
            LatLng latLng = new LatLng(d8, d9);
            if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
                latLng = CoordTrans.gcjToBaidu(latLng);
            }
            return CoordUtil.ll2mcDirect(latLng);
        }

        private GeoPoint a(LatLng latLng) {
            return CoordUtil.ll2mcDirect(CoordTrans.wgsToBaidu(latLng));
        }
    }

    private class f implements com.baidu.platform.comapi.h.o.b {
        private f() {
        }

        @Override // com.baidu.platform.comapi.h.o.b
        public void a(com.baidu.platform.comapi.wnplatform.model.datastruct.a aVar) {
            BackgroundDrawNaviLayer backgroundDrawNaviLayer = a.this.f5378h;
            if (backgroundDrawNaviLayer == null) {
                return;
            }
            backgroundDrawNaviLayer.updateHeading(aVar.f10498d);
        }

        /* synthetic */ f(a aVar, C0058a c0058a) {
            this();
        }
    }

    private class g implements com.baidu.platform.comapi.h.m.b {
        private g() {
        }

        @Override // com.baidu.platform.comapi.h.m.b
        public void a(com.baidu.platform.comapi.wnplatform.model.b bVar) {
            if (a.this.f5381k != null) {
                a.this.f5381k.onNaviLocationUpdate(a.this.d());
            }
        }

        /* synthetic */ g(a aVar, C0058a c0058a) {
            this();
        }

        @Override // com.baidu.platform.comapi.h.m.b
        public void a(com.baidu.platform.comapi.wnplatform.model.d dVar) {
            if (a.this.f5381k != null) {
                a.this.f5381k.onNaviLocationUpdate(a.this.d());
            }
        }
    }

    private static class h implements ILicenseAuthManagerListener {

        /* renamed from: a, reason: collision with root package name */
        private final IBAuthListener f5396a;

        public h(IBAuthListener iBAuthListener) {
            this.f5396a = iBAuthListener;
        }

        @Override // com.baidu.platform.comapi.license.ILicenseAuthManagerListener
        public void onError(String str, String str2, int i8, int i9, String str3) {
            IBAuthListener iBAuthListener = this.f5396a;
            if (iBAuthListener == null) {
                return;
            }
            iBAuthListener.auth(1, i9);
        }

        @Override // com.baidu.platform.comapi.license.ILicenseAuthManagerListener
        public void onSuccess(String str, String str2, int i8, Map<String, Integer> map) {
            Integer num;
            IBAuthListener iBAuthListener = this.f5396a;
            if (iBAuthListener == null) {
                return;
            }
            iBAuthListener.auth(1, (map == null || (num = map.get(str2)) == null || num.intValue() != 0) ? 201 : 0);
        }
    }

    public void a(IBAuthListener iBAuthListener) {
        this.f5377g = iBAuthListener;
    }

    public AbsBackgroundDrawNaviLayer c() {
        return this.f5378h;
    }

    public void d(boolean z7) {
        if (!z7) {
            MapView mapView = this.f5371a;
            if (mapView != null && mapView.getParent() != null) {
                ((ViewGroup) this.f5371a.getParent()).removeView(this.f5371a);
            }
            FrameLayout frameLayout = this.f5375e;
            if (frameLayout != null) {
                frameLayout.addView(this.f5371a);
            }
            com.baidu.platform.comapi.walknavi.b n8 = com.baidu.platform.comapi.walknavi.b.n();
            b.j jVar = b.j.LIGHT;
            n8.d(jVar.a());
            com.baidu.platform.comapi.walknavi.b.n().c(jVar.a());
        }
        com.baidu.platform.comapi.walknavi.b.n().a(z7);
    }

    public BikeRouteResult e() {
        com.baidu.platform.comapi.wnplatform.model.c g8;
        com.baidu.platform.comapi.wnplatform.model.g d8;
        com.baidu.platform.comapi.walknavi.b wNavigator = BNavigatorWrapper.getWNavigator();
        if (wNavigator == null || (g8 = wNavigator.g()) == null || (d8 = g8.d()) == null) {
            return null;
        }
        BikeRouteResult bikeRouteResult = new BikeRouteResult();
        bikeRouteResult.setDistance(d8.c());
        bikeRouteResult.setDuration(d8.d());
        bikeRouteResult.setLightCount(g());
        ArrayList<LatLng> b8 = d8.b();
        if (b8 != null) {
            if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
                ArrayList<LatLng> arrayList = new ArrayList<>(b8.size());
                Iterator<LatLng> it = b8.iterator();
                while (it.hasNext()) {
                    LatLng baiduToGcj = CoordTrans.baiduToGcj(it.next());
                    if (baiduToGcj != null) {
                        arrayList.add(baiduToGcj);
                    }
                }
                b8 = arrayList;
            }
            bikeRouteResult.setPositions(b8);
        }
        return bikeRouteResult;
    }

    public List<BikeRouteResult> f() {
        List<com.baidu.platform.comapi.h.n.j.a> b8;
        WalkPlan N = com.baidu.platform.comapi.walknavi.b.n().N();
        if (N == null || (b8 = com.baidu.platform.comapi.h.t.g.b(N)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(b8.size());
        for (com.baidu.platform.comapi.h.n.j.a aVar : b8) {
            BikeRouteResult bikeRouteResult = new BikeRouteResult();
            bikeRouteResult.setDistance(aVar.a());
            bikeRouteResult.setDuration(aVar.b());
            bikeRouteResult.setLightCount(aVar.c());
            bikeRouteResult.setPositions(aVar.d());
            bikeRouteResult.setRouteIndex(aVar.e());
            arrayList.add(bikeRouteResult);
        }
        return arrayList;
    }

    public int g() {
        Bundle[] p8;
        com.baidu.platform.comapi.walknavi.b wNavigator = BNavigatorWrapper.getWNavigator();
        if (wNavigator == null || (p8 = wNavigator.p()) == null) {
            return -1;
        }
        return p8.length;
    }

    public MapView h() {
        return this.f5371a;
    }

    public boolean i() {
        return BNavigatorWrapper.getWNavigator().r();
    }

    public void j() {
        BNavigatorWrapper.getWNavigator().T();
    }

    public void k() {
        com.baidu.platform.comapi.h.n.c.c().b();
        if (this.f5382l != null) {
            BNavigatorWrapper.getWNavigator().z().b(this.f5382l);
            this.f5382l = null;
        }
        MapView mapView = this.f5371a;
        if (mapView != null) {
            mapView.getMap().clear();
            this.f5371a.onDestroy();
        }
        this.f5371a = null;
        FrameLayout frameLayout = this.f5374d;
        if (frameLayout != null && frameLayout.getParent() != null) {
            ((ViewGroup) this.f5374d.getParent()).removeAllViews();
        }
        this.f5374d = null;
        FrameLayout frameLayout2 = this.f5375e;
        if (frameLayout2 != null && frameLayout2.getParent() != null) {
            ((ViewGroup) this.f5375e.getParent()).removeAllViews();
        }
        this.f5375e = null;
    }

    public void l() {
        MapView mapView = this.f5371a;
        if (mapView != null) {
            mapView.onPause();
        }
    }

    public void m() {
        MapView mapView = this.f5371a;
        if (mapView != null) {
            mapView.onResume();
        }
    }

    public void a(IBikeNaviLocationListener iBikeNaviLocationListener) {
        this.f5381k = iBikeNaviLocationListener;
    }

    public boolean b(boolean z7) {
        if (PermissionUtils.getInstance().isBWNaviTrafficLightAuthorized()) {
            return BNavigatorWrapper.getWNavigator().c(z7);
        }
        return false;
    }

    public void c(boolean z7) {
        BNavigatorWrapper.getWNavigator().d(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        BaiduMap map;
        MapView mapView = this.f5371a;
        if (mapView == null || (map = mapView.getMap()) == null) {
            return;
        }
        com.baidu.platform.comapi.h.j.a j8 = com.baidu.platform.comapi.walknavi.b.n().j();
        MapLanguage mapLanguage = MapLanguage.CHINESE;
        if (j8 != null) {
            mapLanguage = j8.e();
        }
        map.setMapLanguage(mapLanguage);
        MapLanguage mapLanguage2 = MapLanguage.ENGLISH;
        float f8 = mapLanguage == mapLanguage2 ? 19.0f : 22.0f;
        map.setMaxAndMinZoomLevel(f8, map.getMinZoomLevel());
        map.setMapStatus(MapStatusUpdateFactory.zoomTo(mapView.getMapLevel()));
        map.setOnMapLoadedCallback(new c(map, f8, mapView));
        map.showOperateLayer(mapLanguage != mapLanguage2);
        map.showOperatePoiLayer(mapLanguage != mapLanguage2);
    }

    public void a(Context context, com.baidu.platform.comapi.h.j.a aVar, IBEngineInitListener iBEngineInitListener) {
        if (iBEngineInitListener != null) {
            if (SDKInitializer.getAgreePrivacy()) {
                this.f5376f.loadAuth(context, new h(this.f5377g));
                if (this.f5371a == null) {
                    this.f5371a = new MapView(context);
                }
                com.baidu.platform.comapi.walknavi.b.n().a(context);
                com.baidu.platform.comapi.walknavi.b.n().a(context, this.f5371a);
                long id = WNaviBaiduMap.getId();
                com.baidu.platform.comapi.h.g.a.b("mapHandle", "mapHandle " + id);
                if (aVar == null || aVar.e() == null) {
                    aVar = new a.b().a(MapLanguage.CHINESE).a();
                }
                MapLanguage d8 = com.baidu.platform.comapi.e.b.e().d();
                if (aVar.e() == MapLanguage.ENGLISH && !PermissionUtils.getInstance().isEnglishWalkBikeNaviAuthorized()) {
                    aVar = aVar.l().a(MapLanguage.CHINESE).a();
                }
                com.baidu.platform.comapi.h.j.a aVar2 = aVar;
                if (d8 != aVar2.e()) {
                    this.f5371a.getMap().setMapLanguage(aVar2.e(), true);
                }
                com.baidu.platform.comapi.walknavi.b.n().a(context, id, aVar2, new C0058a(iBEngineInitListener));
                return;
            }
            iBEngineInitListener.engineInitFail();
            throw new BaiduMapSDKException("not agree privacyMode, if you want to use bike navigation, please invoke SDKInitializer.setAgreePrivacy(Context, boolean) function");
        }
        throw new UnsupportedBikeNaviException("BDMapSDKException: engine init listener cannot be null");
    }

    public BikeNaviLocationResult d() {
        com.baidu.platform.comapi.wnplatform.model.c g8;
        com.baidu.platform.comapi.walknavi.b wNavigator = BNavigatorWrapper.getWNavigator();
        if (wNavigator == null || (g8 = wNavigator.g()) == null) {
            return null;
        }
        com.baidu.platform.comapi.wnplatform.model.b b8 = g8.b();
        com.baidu.platform.comapi.wnplatform.model.d c8 = g8.c();
        if (b8 == null || c8 == null) {
            return null;
        }
        BikeNaviLocationResult bikeNaviLocationResult = new BikeNaviLocationResult();
        bikeNaviLocationResult.setCurRouteShapeIdx(b8.a());
        bikeNaviLocationResult.setGpsDirection(c8.a());
        bikeNaviLocationResult.setGpsSpeed(c8.d());
        bikeNaviLocationResult.setGpsLatitude(c8.b());
        bikeNaviLocationResult.setGpsLongitude(c8.c());
        bikeNaviLocationResult.setPostDirection(c8.e());
        bikeNaviLocationResult.setPostSpeed(c8.h());
        bikeNaviLocationResult.setPostLatitude(c8.f());
        bikeNaviLocationResult.setPostLongitude(c8.g());
        return bikeNaviLocationResult;
    }

    public void a(Activity activity, IBRouteGuidanceListener iBRouteGuidanceListener) {
        BNavigatorWrapper.getWNavigator().a(activity, iBRouteGuidanceListener);
    }

    public void a(IBTTSPlayer iBTTSPlayer) {
        com.baidu.platform.comapi.h.n.c.c().a(iBTTSPlayer);
    }

    public void a(WLocData wLocData) {
        com.baidu.platform.comapi.walknavi.b.n().a(wLocData);
    }

    public void a(BikeNaviDisplayOption bikeNaviDisplayOption) {
        com.baidu.platform.comapi.walknavi.b.n().a(bikeNaviDisplayOption);
    }

    public View a(Activity activity) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        BaseTTSPlayer.f10535b = activity;
        this.f5382l = new g(this, null);
        BNavigatorWrapper.getWNavigator().z().a(this.f5382l);
        if (com.baidu.platform.comapi.walknavi.b.n().k() == b.j.LIGHT.a()) {
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f5375e = frameLayout;
            frameLayout.setLayoutParams(layoutParams);
            this.f5373c = BNavigatorWrapper.getWNavigator().c(activity);
            MapView mapView = this.f5371a;
            if (mapView != null && mapView.getParent() != null) {
                ((ViewGroup) this.f5371a.getParent()).removeView(this.f5371a);
            }
            this.f5375e.addView(this.f5371a);
            View view = this.f5373c;
            if (view != null && view.getParent() != null) {
                ((ViewGroup) this.f5373c.getParent()).removeView(this.f5373c);
            }
            this.f5375e.addView(this.f5373c);
            return this.f5375e;
        }
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f5374d = frameLayout2;
        frameLayout2.setLayoutParams(layoutParams);
        this.f5372b = BNavigatorWrapper.getWNavigator().b(activity);
        MapView mapView2 = this.f5371a;
        if (mapView2 != null && mapView2.getParent() != null) {
            ((ViewGroup) this.f5371a.getParent()).removeView(this.f5371a);
        }
        this.f5374d.addView(this.f5371a);
        View view2 = this.f5372b;
        if (view2 != null && view2.getParent() != null) {
            ((ViewGroup) this.f5372b.getParent()).removeView(this.f5372b);
        }
        this.f5374d.addView(this.f5372b);
        return this.f5374d;
    }

    public void a(String str) {
        BNavigatorWrapper.getWNavigator().H().a(str);
    }

    public void a(int i8) {
        com.baidu.platform.comapi.walknavi.b.n().d(i8);
    }

    public void a(BikeNaviRotateMode bikeNaviRotateMode) {
        int i8 = d.f5391a[bikeNaviRotateMode.ordinal()];
        int i9 = 1;
        if (i8 != 1) {
            if (i8 != 2) {
                return;
            } else {
                i9 = 0;
            }
        }
        BNavigatorWrapper.getWNavigator().h(i9);
    }

    public void a(boolean z7) {
        BNavigatorWrapper.getWNavigator().b(z7);
    }

    public void a(OverLookingMode overLookingMode) {
        BNavigatorWrapper.getWNavigator().a(overLookingMode);
    }

    public boolean a(Context context) {
        com.baidu.platform.comapi.walknavi.b wNavigator = BNavigatorWrapper.getWNavigator();
        if (wNavigator == null) {
            return false;
        }
        if (this.f5378h != null) {
            return true;
        }
        this.f5378h = new BackgroundDrawNaviLayer(context);
        BackgroundNaviEntity backgroundNaviEntity = new BackgroundNaviEntity();
        backgroundNaviEntity.setRouteShapePoints(wNavigator.g().e().a());
        this.f5378h.updateEntity(backgroundNaviEntity);
        this.f5379i = new e();
        wNavigator.z().a(this.f5379i);
        this.f5380j = new f(this, null);
        wNavigator.C().a(this.f5380j);
        return true;
    }

    public void a() {
        com.baidu.platform.comapi.walknavi.b wNavigator = BNavigatorWrapper.getWNavigator();
        if (wNavigator == null) {
            return;
        }
        if (this.f5379i != null) {
            wNavigator.z().b(this.f5379i);
            this.f5379i = null;
        }
        if (this.f5380j != null) {
            wNavigator.C().b(this.f5380j);
            this.f5380j = null;
        }
        this.f5378h = null;
    }

    public List<Polyline> a(MapView mapView, com.baidu.mapapi.bikenavi.model.d dVar) {
        return a(mapView, 0, dVar);
    }

    public List<Polyline> a(MapView mapView, int i8, com.baidu.mapapi.bikenavi.model.d dVar) {
        BaiduMap map;
        List<BikeRouteResult> f8;
        PolylineOptions a8;
        if (mapView == null || (map = mapView.getMap()) == null || (f8 = f()) == null) {
            return null;
        }
        int size = f8.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size * 2);
        BikeRouteResult bikeRouteResult = null;
        for (BikeRouteResult bikeRouteResult2 : f8) {
            List<LatLng> positions = bikeRouteResult2.getPositions();
            if (positions != null && positions.size() >= 2) {
                arrayList2.addAll(positions);
                int routeIndex = bikeRouteResult2.getRouteIndex();
                if (routeIndex == i8) {
                    bikeRouteResult = bikeRouteResult2;
                } else {
                    PolylineOptions a9 = a(positions, routeIndex, false, dVar);
                    if (a9 != null) {
                        arrayList.add((Polyline) map.addOverlay(a9));
                    }
                }
            }
        }
        if (bikeRouteResult != null && (a8 = a(bikeRouteResult.getPositions(), bikeRouteResult.getRouteIndex(), true, dVar)) != null) {
            arrayList.add((Polyline) map.addOverlay(a8));
        }
        if (arrayList2.size() < 2) {
            return null;
        }
        map.setMapStatus(MapStatusUpdateFactory.newLatLngBounds(new LatLngBounds.Builder().include(arrayList2).build(), 100, 100, 100, 100));
        return arrayList;
    }

    public void a(com.baidu.platform.comapi.walknavi.h.a aVar, int i8, IBNaviCalcRouteListener iBNaviCalcRouteListener) {
        WNavigatorWrapper.getWNavigator().B().a(new b(iBNaviCalcRouteListener));
        MapLanguage mapLanguage = MapLanguage.CHINESE;
        com.baidu.platform.comapi.h.j.a j8 = WNavigatorWrapper.getWNavigator().j();
        if (j8 != null) {
            mapLanguage = j8.e();
        }
        WNavigatorWrapper.getWNavigator().B().a(14, aVar.getInt("route_data_mode", 0), i8, 0, aVar.c("route_buff"), mapLanguage, aVar.getString("road_prefer", "0"));
    }

    private PolylineOptions a(List<LatLng> list, int i8, boolean z7, com.baidu.mapapi.bikenavi.model.d dVar) {
        if (list == null || list.size() < 2) {
            return null;
        }
        PolylineOptions polylineOptions = new PolylineOptions();
        Bundle bundle = new Bundle();
        bundle.putInt("routeIndex", i8);
        polylineOptions.points(list);
        polylineOptions.extraInfo(bundle);
        int i9 = z7 ? -11950337 : -12883501;
        if (dVar != null) {
            if (z7) {
                throw null;
            }
            throw null;
        }
        polylineOptions.color(i9);
        polylineOptions.width(20);
        return polylineOptions;
    }
}
