package com.baidu.mapapi.walknavi.controllers.b;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.baidu.entity.pb.WalkPlan;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.PermissionUtils;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.bikenavi.controllers.BNavigatorWrapper;
import com.baidu.mapapi.common.BaiduMapSDKException;
import com.baidu.mapapi.map.AbsBackgroundDrawNaviLayer;
import com.baidu.mapapi.map.BackgroundDrawNaviLayer;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BitmapDescriptor;
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
import com.baidu.mapapi.walknavi.adapter.IWAuthListener;
import com.baidu.mapapi.walknavi.adapter.IWEngineInitListener;
import com.baidu.mapapi.walknavi.adapter.IWMoreNPCModelOnClickListener;
import com.baidu.mapapi.walknavi.adapter.IWNPCLoadAndInitListener;
import com.baidu.mapapi.walknavi.adapter.IWNaviCalcRouteListener;
import com.baidu.mapapi.walknavi.adapter.IWRouteGuidanceListener;
import com.baidu.mapapi.walknavi.adapter.IWTTSPlayer;
import com.baidu.mapapi.walknavi.adapter.IWalkNaviLocationListener;
import com.baidu.mapapi.walknavi.controllers.WNavigatorWrapper;
import com.baidu.mapapi.walknavi.model.BaseNpcModel;
import com.baidu.mapapi.walknavi.model.MultiRouteDisplayOption;
import com.baidu.mapapi.walknavi.model.WalkNaviDisplayOption;
import com.baidu.mapapi.walknavi.model.WalkNaviLocationResult;
import com.baidu.mapapi.walknavi.model.WalkNaviRotateMode;
import com.baidu.mapapi.walknavi.model.WalkRoutePlanError;
import com.baidu.mapapi.walknavi.model.WalkRouteResult;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.h.j.a;
import com.baidu.platform.comapi.license.ILicenseAuthManager;
import com.baidu.platform.comapi.license.ILicenseAuthManagerListener;
import com.baidu.platform.comapi.license.LicenseAuthManagerProvider;
import com.baidu.platform.comapi.walknavi.WalkNaviModeSwitchListener;
import com.baidu.platform.comapi.walknavi.b;
import com.baidu.platform.comapi.walknavi.widget.ArCameraView;
import com.baidu.platform.comapi.walknavi.widget.d.b;
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

    /* renamed from: b, reason: collision with root package name */
    private FrameLayout f7589b;

    /* renamed from: c, reason: collision with root package name */
    private FrameLayout f7590c;

    /* renamed from: d, reason: collision with root package name */
    private FrameLayout f7591d;

    /* renamed from: e, reason: collision with root package name */
    private RelativeLayout f7592e;

    /* renamed from: f, reason: collision with root package name */
    private RelativeLayout f7593f;

    /* renamed from: g, reason: collision with root package name */
    private ArCameraView f7594g;

    /* renamed from: i, reason: collision with root package name */
    private IWAuthListener f7596i;

    /* renamed from: j, reason: collision with root package name */
    private BackgroundDrawNaviLayer f7597j;

    /* renamed from: k, reason: collision with root package name */
    private g f7598k;

    /* renamed from: l, reason: collision with root package name */
    private h f7599l;

    /* renamed from: m, reason: collision with root package name */
    private IWalkNaviLocationListener f7600m;

    /* renamed from: n, reason: collision with root package name */
    private i f7601n;

    /* renamed from: r, reason: collision with root package name */
    private WalkNaviModeSwitchListener f7605r;

    /* renamed from: s, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.f.a f7606s;

    /* renamed from: a, reason: collision with root package name */
    private MapView f7588a = null;

    /* renamed from: h, reason: collision with root package name */
    private final ILicenseAuthManager f7595h = LicenseAuthManagerProvider.getInstance().getMultiScreenWalkingNaviAuthManager();

    /* renamed from: o, reason: collision with root package name */
    private View f7602o = null;

    /* renamed from: p, reason: collision with root package name */
    private View f7603p = null;

    /* renamed from: q, reason: collision with root package name */
    private Context f7604q = null;

    /* renamed from: com.baidu.mapapi.walknavi.controllers.b.a$a, reason: collision with other inner class name */
    class C0064a implements com.baidu.platform.comapi.walknavi.e.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IWEngineInitListener f7607a;

        C0064a(IWEngineInitListener iWEngineInitListener) {
            this.f7607a = iWEngineInitListener;
        }

        @Override // com.baidu.platform.comapi.walknavi.e.a
        public void engineInitFail() {
            this.f7607a.engineInitFail();
        }

        @Override // com.baidu.platform.comapi.walknavi.e.a
        public void engineInitSuccess() {
            a.this.b();
            this.f7607a.engineInitSuccess();
        }
    }

    class b implements b.n {
        b() {
        }

        @Override // com.baidu.platform.comapi.walknavi.widget.d.b.n
        public void a() {
            if (a.this.f7606s != null) {
                a.this.f7606s.b();
            }
        }

        @Override // com.baidu.platform.comapi.walknavi.widget.d.b.n
        public void b() {
            if (a.this.f7606s != null) {
                a.this.f7606s.c();
            }
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RelativeLayout f7610a;

        c(RelativeLayout relativeLayout) {
            this.f7610a = relativeLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = (-this.f7610a.getHeight()) * 2;
            a.this.f7606s.setLayoutParams(layoutParams);
        }
    }

    class d implements com.baidu.platform.comapi.h.n.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IWNaviCalcRouteListener f7612a;

        d(IWNaviCalcRouteListener iWNaviCalcRouteListener) {
            this.f7612a = iWNaviCalcRouteListener;
        }

        @Override // com.baidu.platform.comapi.h.n.f
        public void a() {
        }

        @Override // com.baidu.platform.comapi.h.n.f
        public void onRoutePlanStart() {
        }

        @Override // com.baidu.platform.comapi.h.n.f
        public void onRoutePlanSuccess() {
            IWNaviCalcRouteListener iWNaviCalcRouteListener = this.f7612a;
            if (iWNaviCalcRouteListener != null) {
                iWNaviCalcRouteListener.onNaviCalcRouteSuccess();
            }
        }

        @Override // com.baidu.platform.comapi.h.n.f
        public void a(int i8) {
            IWNaviCalcRouteListener iWNaviCalcRouteListener = this.f7612a;
            if (iWNaviCalcRouteListener != null) {
                iWNaviCalcRouteListener.onNaviCalcRouteFail(WalkRoutePlanError.PARSE_FAIL);
            }
        }
    }

    class e implements BaiduMap.OnMapLoadedCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaiduMap f7614a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f7615b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MapView f7616c;

        e(BaiduMap baiduMap, float f8, MapView mapView) {
            this.f7614a = baiduMap;
            this.f7615b = f8;
            this.f7616c = mapView;
        }

        @Override // com.baidu.mapapi.map.BaiduMap.OnMapLoadedCallback
        public void onMapLoaded() {
            BaiduMap baiduMap = this.f7614a;
            baiduMap.setMaxAndMinZoomLevel(this.f7615b, baiduMap.getMinZoomLevel());
            this.f7614a.setMapStatus(MapStatusUpdateFactory.zoomTo(Math.min(this.f7616c.getMapLevel(), this.f7615b)));
        }
    }

    static /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7618a;

        static {
            int[] iArr = new int[WalkNaviRotateMode.values().length];
            f7618a = iArr;
            try {
                iArr[WalkNaviRotateMode.EN_Rotate_Mode_Map.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7618a[WalkNaviRotateMode.EN_Rotate_Mode_Car.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private class g implements com.baidu.platform.comapi.h.m.a {

        /* renamed from: a, reason: collision with root package name */
        private final Bundle f7619a = new Bundle();

        g() {
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
            BackgroundDrawNaviLayer backgroundDrawNaviLayer = a.this.f7597j;
            if (backgroundDrawNaviLayer == null || (wNavigator = BNavigatorWrapper.getWNavigator()) == null || (s7 = wNavigator.s()) == null) {
                return;
            }
            this.f7619a.clear();
            if (s7.k(this.f7619a) != 0) {
                return;
            }
            com.baidu.platform.comapi.wnplatform.model.f fVar = new com.baidu.platform.comapi.wnplatform.model.f(this.f7619a);
            BackgroundNaviRealTimeInfoEntity backgroundNaviRealTimeInfoEntity = new BackgroundNaviRealTimeInfoEntity();
            LatLng i8 = fVar.i();
            if (i8 != null) {
                backgroundNaviRealTimeInfoEntity.setStPosX(i8.longitude);
                backgroundNaviRealTimeInfoEntity.setStPosY(i8.latitude);
            }
            LatLng h8 = fVar.h();
            if (h8 != null) {
                backgroundNaviRealTimeInfoEntity.setStCurStartPosX(h8.longitude);
                backgroundNaviRealTimeInfoEntity.setStCurStartPosY(h8.latitude);
            }
            LatLng g8 = fVar.g();
            if (g8 != null) {
                backgroundNaviRealTimeInfoEntity.setStCurRouteProjectPosX(g8.longitude);
                backgroundNaviRealTimeInfoEntity.setStCurRouteProjectPosY(g8.latitude);
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
            WalkNaviLocationResult g9 = a.this.g();
            BackgroundNaviLocEntity backgroundNaviLocEntity = new BackgroundNaviLocEntity();
            backgroundNaviLocEntity.setCurRouteShapeIdx(g9.getCurRouteShapeIdx());
            backgroundNaviLocEntity.setGpsSpeed(g9.getGpsSpeed());
            backgroundNaviLocEntity.setGpsDirection(g9.getGpsDirection());
            GeoPoint a8 = a(g9.getGpsLatitude(), g9.getGpsLongitude());
            backgroundNaviLocEntity.setGpsLatitude(a8.getLatitude());
            backgroundNaviLocEntity.setGpsLongitude(a8.getLongitude());
            backgroundNaviLocEntity.setPostSpeed(g9.getPostSpeed());
            backgroundNaviLocEntity.setPostDirection(g9.getPostDirection());
            GeoPoint a9 = a(g9.getPostLatitude(), g9.getPostLongitude());
            backgroundNaviLocEntity.setPostLatitude(a9.getLatitude());
            backgroundNaviLocEntity.setPostLongitude(a9.getLongitude());
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
    }

    private class h implements com.baidu.platform.comapi.h.o.b {
        private h() {
        }

        @Override // com.baidu.platform.comapi.h.o.b
        public void a(com.baidu.platform.comapi.wnplatform.model.datastruct.a aVar) {
            BackgroundDrawNaviLayer backgroundDrawNaviLayer = a.this.f7597j;
            if (backgroundDrawNaviLayer == null) {
                return;
            }
            backgroundDrawNaviLayer.updateHeading(aVar.f10498d);
        }

        /* synthetic */ h(a aVar, C0064a c0064a) {
            this();
        }
    }

    private class i implements com.baidu.platform.comapi.h.m.b {
        private i() {
        }

        @Override // com.baidu.platform.comapi.h.m.b
        public void a(com.baidu.platform.comapi.wnplatform.model.b bVar) {
            if (a.this.f7600m != null) {
                a.this.f7600m.onNaviLocationUpdate(a.this.g());
            }
        }

        /* synthetic */ i(a aVar, C0064a c0064a) {
            this();
        }

        @Override // com.baidu.platform.comapi.h.m.b
        public void a(com.baidu.platform.comapi.wnplatform.model.d dVar) {
            if (a.this.f7600m != null) {
                a.this.f7600m.onNaviLocationUpdate(a.this.g());
            }
        }
    }

    private static class j implements ILicenseAuthManagerListener {

        /* renamed from: a, reason: collision with root package name */
        private final IWAuthListener f7623a;

        public j(IWAuthListener iWAuthListener) {
            this.f7623a = iWAuthListener;
        }

        @Override // com.baidu.platform.comapi.license.ILicenseAuthManagerListener
        public void onError(String str, String str2, int i8, int i9, String str3) {
            IWAuthListener iWAuthListener = this.f7623a;
            if (iWAuthListener == null) {
                return;
            }
            iWAuthListener.auth(1, i9);
        }

        @Override // com.baidu.platform.comapi.license.ILicenseAuthManagerListener
        public void onSuccess(String str, String str2, int i8, Map<String, Integer> map) {
            Integer num;
            IWAuthListener iWAuthListener = this.f7623a;
            if (iWAuthListener == null) {
                return;
            }
            iWAuthListener.auth(1, (map == null || (num = map.get(str2)) == null || num.intValue() != 0) ? 201 : 0);
        }
    }

    private void k() {
        RelativeLayout a8;
        if (this.f7606s == null && (a8 = com.baidu.platform.comapi.walknavi.b.n().a(new b())) != null) {
            com.baidu.platform.comapi.walknavi.f.a aVar = new com.baidu.platform.comapi.walknavi.f.a(this.f7604q);
            this.f7606s = aVar;
            aVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.baidu.mapapi.walknavi.controllers.b.d
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean a9;
                    a9 = a.a(view, motionEvent);
                    return a9;
                }
            });
            a8.addView(this.f7606s, new RelativeLayout.LayoutParams(-1, -1));
            a8.post(new c(a8));
        }
    }

    public void a(IWAuthListener iWAuthListener) {
        this.f7596i = iWAuthListener;
    }

    public AbsBackgroundDrawNaviLayer c() {
        return this.f7597j;
    }

    public MapView e() {
        return this.f7588a;
    }

    public boolean f() {
        return WNavigatorWrapper.getWNavigator().r();
    }

    public WalkNaviLocationResult g() {
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
        WalkNaviLocationResult walkNaviLocationResult = new WalkNaviLocationResult();
        walkNaviLocationResult.setCurRouteShapeIdx(b8.a());
        walkNaviLocationResult.setGpsDirection(c8.a());
        walkNaviLocationResult.setGpsSpeed(c8.d());
        walkNaviLocationResult.setGpsLatitude(c8.b());
        walkNaviLocationResult.setGpsLongitude(c8.c());
        walkNaviLocationResult.setPostDirection(c8.e());
        walkNaviLocationResult.setPostSpeed(c8.h());
        walkNaviLocationResult.setPostLatitude(c8.f());
        walkNaviLocationResult.setPostLongitude(c8.g());
        return walkNaviLocationResult;
    }

    public WalkRouteResult h() {
        com.baidu.platform.comapi.wnplatform.model.c g8;
        com.baidu.platform.comapi.wnplatform.model.g d8;
        com.baidu.platform.comapi.walknavi.b wNavigator = WNavigatorWrapper.getWNavigator();
        if (wNavigator == null || (g8 = wNavigator.g()) == null || (d8 = g8.d()) == null) {
            return null;
        }
        WalkRouteResult walkRouteResult = new WalkRouteResult();
        walkRouteResult.setDistance(d8.c());
        walkRouteResult.setDuration(d8.d());
        walkRouteResult.setLightCount(d());
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
            walkRouteResult.setPositions(b8);
        }
        return walkRouteResult;
    }

    public ArrayList<BaseNpcModel> i() {
        return com.baidu.platform.comapi.walknavi.b.n().L();
    }

    public List<WalkRouteResult> j() {
        List<com.baidu.platform.comapi.h.n.j.a> b8;
        WalkPlan N = com.baidu.platform.comapi.walknavi.b.n().N();
        if (N == null || (b8 = com.baidu.platform.comapi.h.t.g.b(N)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(b8.size());
        for (com.baidu.platform.comapi.h.n.j.a aVar : b8) {
            WalkRouteResult walkRouteResult = new WalkRouteResult();
            walkRouteResult.setDistance(aVar.a());
            walkRouteResult.setDuration(aVar.b());
            walkRouteResult.setLightCount(aVar.c());
            walkRouteResult.setPositions(aVar.d());
            walkRouteResult.setRouteIndex(aVar.e());
            arrayList.add(walkRouteResult);
        }
        return arrayList;
    }

    public void l() {
        com.baidu.platform.comapi.walknavi.b.n().T();
    }

    public void m() {
        MapView mapView;
        com.baidu.platform.comapi.h.n.g.c().b();
        if (this.f7601n != null) {
            BNavigatorWrapper.getWNavigator().z().b(this.f7601n);
        }
        if (com.baidu.platform.comapi.h.c.b().d() && com.baidu.platform.comapi.h.a.a() != null) {
            com.baidu.platform.comapi.h.a.a().i();
            com.baidu.platform.comapi.h.a.a().f();
        }
        MapView mapView2 = this.f7588a;
        if (mapView2 != null) {
            mapView2.getMap().clear();
            this.f7588a.onDestroy();
            this.f7588a = null;
        }
        FrameLayout frameLayout = this.f7591d;
        if (frameLayout != null && (mapView = this.f7588a) != null) {
            frameLayout.removeView(mapView);
        }
        FrameLayout frameLayout2 = this.f7591d;
        if (frameLayout2 != null && frameLayout2.getParent() != null) {
            ((ViewGroup) this.f7591d.getParent()).removeAllViews();
        }
        this.f7591d = null;
        FrameLayout frameLayout3 = this.f7589b;
        if (frameLayout3 != null && frameLayout3.getParent() != null) {
            ((ViewGroup) this.f7589b.getParent()).removeAllViews();
        }
        this.f7589b = null;
        FrameLayout frameLayout4 = this.f7590c;
        if (frameLayout4 != null && frameLayout4.getParent() != null) {
            ((ViewGroup) this.f7590c.getParent()).removeAllViews();
        }
        this.f7590c = null;
    }

    public void n() {
        if (com.baidu.platform.comapi.h.c.b().d() && com.baidu.platform.comapi.h.a.a() != null) {
            com.baidu.platform.comapi.h.a.a().g();
        }
        MapView mapView = this.f7588a;
        if (mapView != null) {
            mapView.onPause();
        }
    }

    public void o() {
        RelativeLayout relativeLayout = this.f7593f;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        MapView mapView = this.f7588a;
        if (mapView == null || this.f7591d == null) {
            return;
        }
        if (mapView.getParent() != null) {
            ((ViewGroup) this.f7588a.getParent()).removeView(this.f7588a);
        }
        this.f7588a.getMap().showSDKLayer();
        this.f7588a.getMap().setPixelFormatTransparent(false);
        com.baidu.platform.comapi.walknavi.b.n().t().j();
        com.baidu.platform.comapi.walknavi.b.n().t().b(true);
        com.baidu.platform.comapi.walknavi.b.n().t().k();
        this.f7588a.getMap().setMapStatus(MapStatusUpdateFactory.zoomTo(19.0f));
        this.f7588a.getMap().setBaiduHeatMapEnabled(false);
        this.f7588a.getMap().setTrafficEnabled(false);
        this.f7591d.addView(this.f7588a);
        this.f7591d.setVisibility(0);
    }

    public void p() {
        ArCameraView arCameraView;
        RelativeLayout relativeLayout = this.f7592e;
        if (relativeLayout == null || (arCameraView = this.f7594g) == null) {
            return;
        }
        relativeLayout.removeView(arCameraView);
        this.f7594g.releaseCamera();
        this.f7594g = null;
        this.f7592e = null;
    }

    public void q() {
        if (com.baidu.platform.comapi.h.c.b().d() && com.baidu.platform.comapi.h.a.a() != null) {
            com.baidu.platform.comapi.h.a.a().h();
        }
        MapView mapView = this.f7588a;
        if (mapView != null) {
            mapView.onResume();
        }
    }

    public void a(IWalkNaviLocationListener iWalkNaviLocationListener) {
        this.f7600m = iWalkNaviLocationListener;
    }

    public void d(boolean z7) {
        if (!z7) {
            MapView mapView = this.f7588a;
            if (mapView != null && mapView.getParent() != null) {
                ((ViewGroup) this.f7588a.getParent()).removeView(this.f7588a);
            }
            FrameLayout frameLayout = this.f7590c;
            if (frameLayout != null) {
                frameLayout.addView(this.f7588a);
            }
            com.baidu.platform.comapi.walknavi.b n8 = com.baidu.platform.comapi.walknavi.b.n();
            b.j jVar = b.j.LIGHT;
            n8.d(jVar.a());
            com.baidu.platform.comapi.walknavi.b.n().c(jVar.a());
        }
        com.baidu.platform.comapi.walknavi.b.n().a(z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    public View b(Activity activity) {
        C0064a c0064a = null;
        if (activity == null) {
            return null;
        }
        this.f7604q = activity;
        BaseTTSPlayer.f10535b = activity;
        if (com.baidu.platform.comapi.h.c.b().d() && !PermissionUtils.getInstance().isWalkARNaviAuthorized()) {
            return null;
        }
        this.f7601n = new i(this, c0064a);
        BNavigatorWrapper.getWNavigator().z().a(this.f7601n);
        activity.getWindow().setFlags(128, 128);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (com.baidu.platform.comapi.walknavi.b.n().k() == b.j.LIGHT.a()) {
            FrameLayout frameLayout = new FrameLayout(activity);
            this.f7590c = frameLayout;
            frameLayout.setLayoutParams(layoutParams);
            this.f7603p = com.baidu.platform.comapi.walknavi.b.n().c(activity);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            FrameLayout frameLayout2 = new FrameLayout(activity);
            this.f7591d = frameLayout2;
            frameLayout2.setLayoutParams(layoutParams2);
            com.baidu.platform.comapi.walknavi.b.n().a(this.f7591d);
            MapView mapView = this.f7588a;
            if (mapView != null && mapView.getParent() != null) {
                ((ViewGroup) this.f7588a.getParent()).removeView(this.f7588a);
            }
            this.f7591d.addView(this.f7588a);
            FrameLayout frameLayout3 = this.f7591d;
            if (frameLayout3 != null && frameLayout3.getParent() != null) {
                ((ViewGroup) this.f7591d.getParent()).removeView(this.f7591d);
            }
            this.f7590c.addView(this.f7591d);
            View view = this.f7603p;
            if (view != null && view.getParent() != null) {
                ((ViewGroup) this.f7603p.getParent()).removeView(this.f7603p);
            }
            this.f7590c.addView(this.f7603p);
            return this.f7590c;
        }
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.f7589b = frameLayout4;
        frameLayout4.setLayoutParams(layoutParams);
        this.f7602o = com.baidu.platform.comapi.walknavi.b.n().b(activity);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout relativeLayout = new RelativeLayout(activity);
        this.f7593f = relativeLayout;
        relativeLayout.setLayoutParams(layoutParams3);
        FrameLayout frameLayout5 = new FrameLayout(activity);
        this.f7591d = frameLayout5;
        frameLayout5.setLayoutParams(layoutParams3);
        com.baidu.platform.comapi.walknavi.b.n().a(this.f7591d);
        MapView mapView2 = this.f7588a;
        if (mapView2 != null && mapView2.getParent() != null) {
            ((ViewGroup) this.f7588a.getParent()).removeView(this.f7588a);
        }
        this.f7591d.addView(this.f7588a);
        RelativeLayout relativeLayout2 = this.f7593f;
        if (relativeLayout2 != null && relativeLayout2.getParent() != null) {
            ((ViewGroup) this.f7593f.getParent()).removeView(this.f7593f);
        }
        this.f7589b.addView(this.f7593f);
        FrameLayout frameLayout6 = this.f7591d;
        if (frameLayout6 != null && frameLayout6.getParent() != null) {
            ((ViewGroup) this.f7591d.getParent()).removeView(this.f7591d);
        }
        this.f7589b.addView(this.f7591d);
        View view2 = this.f7602o;
        if (view2 != null && view2.getParent() != null) {
            ((ViewGroup) this.f7602o.getParent()).removeView(this.f7602o);
        }
        this.f7589b.addView(this.f7602o);
        return this.f7589b;
    }

    public void c(Activity activity) {
        com.baidu.platform.comapi.h.a.a().a(activity, this.f7593f, true);
        k();
        a(activity);
    }

    public void a(Context context, com.baidu.platform.comapi.h.j.a aVar, IWEngineInitListener iWEngineInitListener) {
        if (iWEngineInitListener != null) {
            if (SDKInitializer.getAgreePrivacy()) {
                this.f7595h.loadAuth(context, new j(this.f7596i));
                if (this.f7588a == null) {
                    this.f7588a = new MapView(context);
                }
                com.baidu.platform.comapi.walknavi.b.n().a(context, this.f7588a);
                long id = WNaviBaiduMap.getId();
                if (aVar == null || aVar.e() == null) {
                    aVar = new a.b().a(MapLanguage.CHINESE).a();
                }
                MapLanguage d8 = com.baidu.platform.comapi.e.b.e().d();
                if (aVar.e() == MapLanguage.ENGLISH && !PermissionUtils.getInstance().isEnglishWalkBikeNaviAuthorized()) {
                    aVar = aVar.l().a(MapLanguage.CHINESE).a();
                }
                com.baidu.platform.comapi.h.j.a aVar2 = aVar;
                if (d8 != aVar2.e()) {
                    this.f7588a.getMap().setMapLanguage(aVar2.e(), true);
                }
                com.baidu.platform.comapi.walknavi.b.n().a(context, id, aVar2, new C0064a(iWEngineInitListener));
                return;
            }
            iWEngineInitListener.engineInitFail();
            throw new BaiduMapSDKException("not agree privacyMode, if you want to use walk navigation please invoke SDKInitializer.setAgreePrivacy(Context, boolean) function");
        }
        throw new com.baidu.mapapi.walknavi.controllers.a("BDMapSDKException: engine init listener cannot be null");
    }

    public void c(boolean z7) {
        BNavigatorWrapper.getWNavigator().d(z7);
    }

    public int d() {
        Bundle[] p8;
        com.baidu.platform.comapi.walknavi.b wNavigator = WNavigatorWrapper.getWNavigator();
        if (wNavigator == null || (p8 = wNavigator.p()) == null) {
            return -1;
        }
        return p8.length;
    }

    public void a(Activity activity, IWRouteGuidanceListener iWRouteGuidanceListener) {
        WNavigatorWrapper.getWNavigator().a(activity, iWRouteGuidanceListener);
    }

    public void a(IWTTSPlayer iWTTSPlayer) {
        com.baidu.platform.comapi.h.n.g.c().a(iWTTSPlayer);
    }

    public void a(WLocData wLocData) {
        com.baidu.platform.comapi.walknavi.b.n().a(wLocData);
    }

    public void a(WalkNaviDisplayOption walkNaviDisplayOption) {
        com.baidu.platform.comapi.walknavi.b.n().a(walkNaviDisplayOption);
    }

    public void a(ArrayList<BaseNpcModel> arrayList) {
        com.baidu.platform.comapi.walknavi.b.n().c(arrayList);
    }

    public void a(BaseNpcModel baseNpcModel) {
        com.baidu.platform.comapi.walknavi.b.n().a(baseNpcModel);
    }

    public void a(IWMoreNPCModelOnClickListener iWMoreNPCModelOnClickListener) {
        com.baidu.platform.comapi.walknavi.b.n().a(iWMoreNPCModelOnClickListener);
    }

    public void a(IWNPCLoadAndInitListener iWNPCLoadAndInitListener) {
        com.baidu.platform.comapi.walknavi.b.n().a(iWNPCLoadAndInitListener);
    }

    public void a(int i8) {
        com.baidu.platform.comapi.walknavi.b.n().d(i8);
    }

    public void a(Activity activity, int i8, WalkNaviModeSwitchListener walkNaviModeSwitchListener) {
        int checkSelfPermission;
        this.f7605r = walkNaviModeSwitchListener;
        if (com.baidu.platform.comapi.h.c.b().h()) {
            o();
            this.f7605r.onSuccess();
            com.baidu.platform.comapi.h.j.a j8 = com.baidu.platform.comapi.walknavi.b.n().j();
            float f8 = (j8 == null || j8.e() != MapLanguage.ENGLISH) ? 22.0f : 19.0f;
            this.f7588a.getMap().setMaxAndMinZoomLevel(f8, this.f7588a.getMap().getMinZoomLevel());
            this.f7588a.getMap().setMapStatus(MapStatusUpdateFactory.zoomTo(Math.min(f8, this.f7588a.getMapLevel())));
            return;
        }
        if (com.baidu.platform.comapi.h.c.b().d()) {
            if (!PermissionUtils.getInstance().isWalkARNaviAuthorized()) {
                this.f7605r.onFailed();
                return;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                checkSelfPermission = activity.checkSelfPermission("android.permission.CAMERA");
                if (checkSelfPermission != 0) {
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 3001);
                    return;
                } else {
                    c(activity);
                    return;
                }
            }
            c(activity);
        }
    }

    private void a(Activity activity) {
        MapView mapView;
        FrameLayout frameLayout = this.f7591d;
        if (frameLayout != null && (mapView = this.f7588a) != null) {
            frameLayout.removeView(mapView);
            this.f7591d.setVisibility(8);
        }
        this.f7605r.onSuccess();
    }

    public boolean b(boolean z7) {
        if (PermissionUtils.getInstance().isBWNaviTrafficLightAuthorized()) {
            return BNavigatorWrapper.getWNavigator().c(z7);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        BaiduMap map;
        MapView mapView = this.f7588a;
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
        map.setMapStatus(MapStatusUpdateFactory.zoomTo(Math.min(mapView.getMapLevel(), f8)));
        map.setOnMapLoadedCallback(new e(map, f8, mapView));
        map.showOperateLayer(mapLanguage != mapLanguage2);
        map.showOperatePoiLayer(mapLanguage != mapLanguage2);
    }

    public void a(com.baidu.platform.comapi.walknavi.h.c cVar, int i8, IWNaviCalcRouteListener iWNaviCalcRouteListener) {
        WNavigatorWrapper.getWNavigator().B().a(new d(iWNaviCalcRouteListener));
        MapLanguage mapLanguage = MapLanguage.CHINESE;
        com.baidu.platform.comapi.h.j.a j8 = WNavigatorWrapper.getWNavigator().j();
        if (j8 != null) {
            mapLanguage = j8.e();
        }
        WNavigatorWrapper.getWNavigator().B().a(13, cVar.getInt("route_data_mode", 0), i8, 0, cVar.c("route_buff"), mapLanguage, cVar.getString("road_prefer", "0"));
    }

    public List<Polyline> a(MapView mapView, int i8, MultiRouteDisplayOption multiRouteDisplayOption) {
        BaiduMap map;
        List<WalkRouteResult> j8;
        PolylineOptions a8;
        if (mapView == null || (map = mapView.getMap()) == null || (j8 = j()) == null) {
            return null;
        }
        int size = j8.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size * 2);
        WalkRouteResult walkRouteResult = null;
        for (WalkRouteResult walkRouteResult2 : j8) {
            List<LatLng> positions = walkRouteResult2.getPositions();
            if (positions != null && positions.size() >= 2) {
                arrayList2.addAll(positions);
                int routeIndex = walkRouteResult2.getRouteIndex();
                if (routeIndex == i8) {
                    walkRouteResult = walkRouteResult2;
                } else {
                    PolylineOptions a9 = a(positions, routeIndex, false, multiRouteDisplayOption);
                    if (a9 != null) {
                        arrayList.add((Polyline) map.addOverlay(a9));
                    }
                }
            }
        }
        if (walkRouteResult != null && (a8 = a(walkRouteResult.getPositions(), walkRouteResult.getRouteIndex(), true, multiRouteDisplayOption)) != null) {
            arrayList.add((Polyline) map.addOverlay(a8));
        }
        if (arrayList2.size() < 2) {
            return null;
        }
        map.setMapStatus(MapStatusUpdateFactory.newLatLngBounds(new LatLngBounds.Builder().include(arrayList2).build(), 100, 100, 100, 100));
        return arrayList;
    }

    public List<Polyline> a(MapView mapView, MultiRouteDisplayOption multiRouteDisplayOption) {
        return a(mapView, 0, multiRouteDisplayOption);
    }

    public void a(WalkNaviRotateMode walkNaviRotateMode) {
        int i8 = f.f7618a[walkNaviRotateMode.ordinal()];
        int i9 = 1;
        if (i8 == 1) {
            i9 = 0;
        } else if (i8 != 2) {
            return;
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
        if (this.f7597j != null) {
            return true;
        }
        this.f7597j = new BackgroundDrawNaviLayer(context);
        BackgroundNaviEntity backgroundNaviEntity = new BackgroundNaviEntity();
        backgroundNaviEntity.setRouteShapePoints(wNavigator.g().e().a());
        this.f7597j.updateEntity(backgroundNaviEntity);
        this.f7598k = new g();
        wNavigator.z().a(this.f7598k);
        this.f7599l = new h(this, null);
        wNavigator.C().a(this.f7599l);
        return true;
    }

    public void a() {
        com.baidu.platform.comapi.walknavi.b wNavigator = BNavigatorWrapper.getWNavigator();
        if (wNavigator == null) {
            return;
        }
        if (this.f7598k != null) {
            wNavigator.z().b(this.f7598k);
            this.f7598k = null;
        }
        if (this.f7599l != null) {
            wNavigator.C().b(this.f7599l);
            this.f7599l = null;
        }
        this.f7597j = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r8 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        r6 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r8 != 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private PolylineOptions a(List<LatLng> list, int i8, boolean z7, MultiRouteDisplayOption multiRouteDisplayOption) {
        int noFocusRouteWidth;
        BitmapDescriptor bitmapDescriptor = null;
        if (list == null || list.size() < 2) {
            return null;
        }
        PolylineOptions polylineOptions = new PolylineOptions();
        Bundle bundle = new Bundle();
        bundle.putInt("routeIndex", i8);
        polylineOptions.points(list);
        polylineOptions.extraInfo(bundle);
        int i9 = z7 ? -11950337 : -12883501;
        int i10 = 20;
        if (multiRouteDisplayOption != null) {
            if (z7) {
                bitmapDescriptor = multiRouteDisplayOption.getFocusRouteBitmapDescriptor();
                int focusColor = multiRouteDisplayOption.getFocusColor();
                noFocusRouteWidth = multiRouteDisplayOption.getFocusRouteWidth();
                if (focusColor != 0) {
                    i9 = focusColor;
                }
            } else {
                bitmapDescriptor = multiRouteDisplayOption.getNoFocusRouteBitmapDescriptor();
                int noFocusColor = multiRouteDisplayOption.getNoFocusColor();
                noFocusRouteWidth = multiRouteDisplayOption.getNoFocusRouteWidth();
                if (noFocusColor != 0) {
                    i9 = noFocusColor;
                }
            }
        }
        if (bitmapDescriptor != null) {
            polylineOptions.customTexture(bitmapDescriptor).dottedLine(true);
        } else {
            polylineOptions.color(i9);
        }
        polylineOptions.width(i10);
        return polylineOptions;
    }
}
