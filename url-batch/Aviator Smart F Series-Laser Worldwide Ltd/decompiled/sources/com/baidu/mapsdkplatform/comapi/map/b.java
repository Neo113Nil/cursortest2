package com.baidu.mapsdkplatform.comapi.map;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.mapapi.OpenLogUtil;
import com.baidu.mapapi.common.EnvironmentUtilities;
import com.baidu.mapapi.map.EncodePointType;
import com.baidu.mapapi.map.MapBaseIndoorMapInfo;
import com.baidu.mapapi.map.MapLanguage;
import com.baidu.mapapi.map.MapLayer;
import com.baidu.mapapi.map.MapStatusUpdate;
import com.baidu.mapapi.map.ParticleEffectType;
import com.baidu.mapapi.map.PoiTagType;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;
import com.baidu.platform.comapi.JNIInitializer;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.bmsdk.BmLayer;
import com.baidu.platform.comapi.map.LocationOverlay;
import com.baidu.platform.comapi.map.MapController;
import com.baidu.platform.comapi.map.MapSurfaceView;
import com.baidu.platform.comapi.map.MapTextureView;
import com.baidu.platform.comapi.map.MapViewInterface;
import com.baidu.platform.comapi.map.OverlayLocationData;
import com.baidu.platform.comapi.util.SysOSUtil;
import com.baidu.platform.comjni.map.basemap.AppBaseMap;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
public class b implements com.baidu.mapsdkplatform.a.a.a.a {

    /* renamed from: a, reason: collision with root package name */
    public static float f8048a = 1096.0f;

    /* renamed from: b, reason: collision with root package name */
    private static int f8049b;

    /* renamed from: c, reason: collision with root package name */
    private static int f8050c;
    private BmLayer A;
    private com.baidu.mapsdkplatform.comapi.map.z.a B;
    private g D;
    private i E;
    private h F;
    private int G;
    private int H;
    private MapController S;
    private LocationOverlay T;
    private com.baidu.platform.comapi.map.d U;
    public Point W;
    public Point X;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8054g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8055h;

    /* renamed from: t, reason: collision with root package name */
    private x f8067t;

    /* renamed from: u, reason: collision with root package name */
    private w f8068u;

    /* renamed from: w, reason: collision with root package name */
    AppBaseMap f8070w;

    /* renamed from: x, reason: collision with root package name */
    private List<com.baidu.mapsdkplatform.comapi.map.a> f8071x;

    /* renamed from: y, reason: collision with root package name */
    private HashMap<MapLayer, com.baidu.mapsdkplatform.comapi.map.a> f8072y;

    /* renamed from: z, reason: collision with root package name */
    private v f8073z;

    /* renamed from: d, reason: collision with root package name */
    public float f8051d = 22.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f8052e = 4.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f8053f = 22.0f;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8056i = true;

    /* renamed from: j, reason: collision with root package name */
    private boolean f8057j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f8058k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f8059l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f8060m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f8061n = true;

    /* renamed from: o, reason: collision with root package name */
    boolean f8062o = true;

    /* renamed from: p, reason: collision with root package name */
    boolean f8063p = true;

    /* renamed from: q, reason: collision with root package name */
    boolean f8064q = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f8065r = true;

    /* renamed from: s, reason: collision with root package name */
    private boolean f8066s = false;
    private boolean C = false;
    private boolean I = false;
    private boolean J = false;
    private long K = 0;
    private long L = 0;
    private boolean M = false;
    private Queue<C0077b> N = new LinkedList();
    public MapStatusUpdate O = null;
    private boolean P = false;
    private boolean Q = false;
    private boolean R = false;
    private boolean V = false;
    private boolean Y = false;

    /* renamed from: v, reason: collision with root package name */
    public List<com.baidu.platform.comapi.map.w> f8069v = new CopyOnWriteArrayList();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8074a;

        static {
            int[] iArr = new int[MapLayer.values().length];
            f8074a = iArr;
            try {
                iArr[MapLayer.MAP_LAYER_LOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8074a[MapLayer.MAP_LAYER_OVERLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8074a[MapLayer.BM_LAYER_OVERLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8074a[MapLayer.MAP_LAYER_HEATMAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8074a[MapLayer.MAP_LAYER_HEXAGONMAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8074a[MapLayer.MAP_LAYER_TRACE_OVERLAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: com.baidu.mapsdkplatform.comapi.map.b$b, reason: collision with other inner class name */
    public static class C0077b {

        /* renamed from: a, reason: collision with root package name */
        public Bundle f8075a;

        public C0077b(Bundle bundle) {
            this.f8075a = bundle;
        }
    }

    public b(Context context, MapTextureView mapTextureView, q qVar, String str, int i8) {
        MapController mapController = new MapController();
        this.S = mapController;
        mapController.initAppBaseMap();
        a(this.S);
        mapTextureView.attachBaseMapController(this.S);
        this.f8070w = this.S.getBaseMap();
        I();
        a(qVar);
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap != null) {
            appBaseMap.SetSDKLayerCallback(this);
        }
        this.S.onResume();
    }

    private void H() {
        try {
            f8049b = (int) (SysOSUtil.getInstance().getDensity() * 40.0f);
            f8050c = (int) (SysOSUtil.getInstance().getDensity() * 40.0f);
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("x", f8049b);
            jSONObject2.put("y", f8049b);
            jSONObject2.put("hidetime", 1000);
            jSONArray.put(jSONObject2);
            jSONObject.put("dataset", jSONArray);
            com.baidu.platform.comapi.map.d dVar = this.U;
            if (dVar != null) {
                dVar.setData(jSONObject.toString());
                this.U.UpdateOverlay();
            }
        } catch (JSONException e8) {
            throw new RuntimeException(e8);
        }
    }

    private void I() {
        this.f8071x = new CopyOnWriteArrayList();
        this.f8072y = new HashMap<>();
        v vVar = new v();
        this.f8073z = vVar;
        a(vVar);
        this.f8072y.put(MapLayer.MAP_LAYER_OVERLAY, this.f8073z);
        D(false);
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap != null) {
            appBaseMap.setDEMEnable(false);
        }
    }

    private void T() {
        MapController mapController = this.S;
        if (mapController == null || mapController.mIsMoving) {
            return;
        }
        mapController.mIsMoving = true;
        mapController.mIsAnimating = false;
        if (this.f8069v != null) {
            s y7 = y();
            for (int i8 = 0; i8 < this.f8069v.size(); i8++) {
                com.baidu.platform.comapi.map.w wVar = this.f8069v.get(i8);
                if (wVar != null) {
                    wVar.c(y7);
                }
            }
        }
    }

    public float A() {
        MapController mapController = this.S;
        return mapController != null ? mapController.mMaxZoomLevel : this.f8051d;
    }

    public void B(boolean z7) {
        MapController mapController = this.S;
        if (mapController == null) {
            return;
        }
        mapController.setEnableZoom(z7);
        this.f8063p = z7;
    }

    public void C(boolean z7) {
        x xVar;
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null || (xVar = this.f8067t) == null) {
            return;
        }
        appBaseMap.ShowLayers(xVar.f8044a, z7);
    }

    public int D() {
        return this.G;
    }

    public void E(boolean z7) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap != null) {
            appBaseMap.ShowLayers(appBaseMap.getLayerIDByTag("poiindoormarklayer"), z7);
        }
    }

    public void F() {
        if (this.f8070w == null) {
            return;
        }
        synchronized (this.f8071x) {
            try {
                Iterator<com.baidu.mapsdkplatform.comapi.map.a> it = this.f8071x.iterator();
                while (it.hasNext()) {
                    this.f8070w.ShowLayers(it.next().f8044a, false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void G(boolean z7) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return;
        }
        appBaseMap.ShowLayers(6L, z7);
    }

    public boolean J() {
        return this.f8060m;
    }

    public boolean K() {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return false;
        }
        return appBaseMap.IsBaseIndoorMapMode();
    }

    public boolean L() {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return false;
        }
        return appBaseMap.LayersIsShow(appBaseMap.getLayerIDByTag("basemap"));
    }

    public boolean M() {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return false;
        }
        return appBaseMap.getDrawHouseHeightEnable();
    }

    public boolean N() {
        return this.f8061n;
    }

    public boolean O() {
        return this.f8065r;
    }

    public boolean P() {
        return this.f8055h;
    }

    public boolean Q() {
        return this.f8062o;
    }

    public boolean R() {
        return this.f8054g;
    }

    public boolean S() {
        return this.f8063p;
    }

    public boolean U() {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap != null) {
            return appBaseMap.LayersIsShow(appBaseMap.getLayerIDByTag("basepoi"));
        }
        return false;
    }

    public void V() {
        x xVar;
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null || (xVar = this.f8067t) == null) {
            return;
        }
        appBaseMap.RemoveLayer(xVar.f8044a);
        this.f8071x.remove(this.f8067t);
    }

    public void W() {
        if (this.f8070w == null) {
            return;
        }
        synchronized (this.f8071x) {
            try {
                for (com.baidu.mapsdkplatform.comapi.map.a aVar : this.f8071x) {
                    if (aVar instanceof g) {
                        this.f8070w.ShowLayers(aVar.f8044a, false);
                    } else {
                        this.f8070w.ShowLayers(aVar.f8044a, true);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f8070w.ShowTrafficMap(false);
    }

    public void X() {
        g gVar;
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null || (gVar = this.D) == null) {
            return;
        }
        appBaseMap.startHeatMapFrameAnimation(gVar.f8044a);
    }

    public void Y() {
        g gVar;
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null || (gVar = this.D) == null) {
            return;
        }
        appBaseMap.stopHeatMapFrameAnimation(gVar.f8044a);
    }

    public void Z() {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap != null) {
            appBaseMap.updateBaseLayers();
        }
    }

    public void a(MapStatusUpdate mapStatusUpdate) {
        this.O = mapStatusUpdate;
    }

    public void b(int i8, int i9) {
        this.G = i8;
        this.H = i9;
    }

    public void c(boolean z7) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return;
        }
        if (this.U == null) {
            this.U = new com.baidu.platform.comapi.map.d(appBaseMap);
            MapViewInterface mapView = this.S.getMapView();
            if (mapView != null) {
                mapView.addOverlay(this.U);
                H();
            }
        }
        this.f8070w.ShowLayers(this.U.mLayerID, z7);
    }

    public void d(boolean z7) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return;
        }
        this.f8060m = z7;
        appBaseMap.ShowHotMap(z7, 0);
    }

    public boolean e(Bundle bundle) {
        if (this.f8070w == null) {
            return false;
        }
        x xVar = new x();
        this.f8067t = xVar;
        long AddLayer = this.f8070w.AddLayer(xVar.f8046c, xVar.f8047d, xVar.f8045b);
        if (AddLayer != 0) {
            this.f8067t.f8044a = AddLayer;
            synchronized (this.f8071x) {
                this.f8071x.add(this.f8067t);
            }
            bundle.putLong("sdktileaddr", AddLayer);
            if (h(bundle) && m(bundle)) {
                return true;
            }
        }
        return false;
    }

    public void f(boolean z7) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return;
        }
        this.f8056i = z7;
        if (this.U == null) {
            this.U = new com.baidu.platform.comapi.map.d(appBaseMap);
            MapViewInterface mapView = this.S.getMapView();
            if (mapView != null) {
                mapView.addOverlay(this.U);
                H();
            }
        }
        this.f8070w.ShowLayers(this.U.mLayerID, z7);
    }

    public void g(boolean z7) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap != null) {
            appBaseMap.setCustomTrafficColorEnable(z7);
        }
    }

    public void h(boolean z7) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap != null) {
            appBaseMap.setDEMEnable(z7);
        }
    }

    public AppBaseMap i() {
        return this.f8070w;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this.f8056i;
    }

    public String l() {
        return null;
    }

    public boolean m() {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap != null) {
            return appBaseMap.getCustomTrafficColorEnable();
        }
        return false;
    }

    public void n(boolean z7) {
        if (this.f8070w == null) {
            return;
        }
        if (this.D == null) {
            g gVar = new g();
            this.D = gVar;
            a(gVar);
        }
        this.f8058k = z7;
        this.f8070w.ShowLayers(this.D.f8044a, z7);
    }

    public MapBaseIndoorMapInfo o() {
        String GetFocusedBaseIndoorMapInfo;
        String str;
        String str2;
        String str3 = "";
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null || (GetFocusedBaseIndoorMapInfo = appBaseMap.GetFocusedBaseIndoorMapInfo()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        try {
            JSONObject jSONObject = new JSONObject(GetFocusedBaseIndoorMapInfo);
            str2 = jSONObject.optString("focusindoorid");
            try {
                str3 = jSONObject.optString("curfloor");
                JSONArray optJSONArray = jSONObject.optJSONArray("floorlist");
                if (optJSONArray != null) {
                    for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                        arrayList.add(optJSONArray.get(i8).toString());
                    }
                }
            } catch (JSONException e8) {
                e = e8;
                str = str3;
                str3 = str2;
                e.printStackTrace();
                String str4 = str;
                str2 = str3;
                str3 = str4;
                return new MapBaseIndoorMapInfo(str2, str3, arrayList);
            }
        } catch (JSONException e9) {
            e = e9;
            str = "";
        }
        return new MapBaseIndoorMapInfo(str2, str3, arrayList);
    }

    public void p(boolean z7) {
        this.S.setInertialAnimation(z7);
    }

    public int q() {
        return this.H;
    }

    public MapStatusUpdate r() {
        return this.O;
    }

    public void s(boolean z7) {
        this.f8066s = z7;
    }

    public String t() {
        return this.V ? "" : "GS(2022)460号";
    }

    public String u() {
        return this.V ? "" : "长地万方\nMapbox\nMapKin\n樂客LocalKing PalmCit\nESO DigitalGlobal spaceview\nOSRM Copyright ©2017, Project OSRMcontributors, all rights reserved\nHERE© 2019 HERE, all rights reserved\nOpenStreetMap© OpenStreetMapContributor;(OSMF)";
    }

    public boolean v() {
        return this.V;
    }

    public void w(boolean z7) {
        MapController mapController = this.S;
        if (mapController != null) {
            mapController.setSDKLayerBelowBmLayer(z7);
        }
    }

    public String x() {
        return this.V ? "" : "甲测资字11111342";
    }

    public void y(boolean z7) {
        MapController mapController = this.S;
        if (mapController == null) {
            return;
        }
        mapController.setCanTouchMove(z7);
        this.f8062o = z7;
    }

    public void z(boolean z7) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return;
        }
        this.f8054g = z7;
        appBaseMap.ShowTrafficMap(z7);
    }

    private boolean h(Bundle bundle) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return false;
        }
        return appBaseMap.addSDKTileData(bundle);
    }

    private boolean m(Bundle bundle) {
        AppBaseMap appBaseMap;
        if (bundle == null || (appBaseMap = this.f8070w) == null) {
            return false;
        }
        boolean updateSDKTile = appBaseMap.updateSDKTile(bundle);
        if (updateSDKTile) {
            C(updateSDKTile);
            this.f8070w.UpdateLayers(this.f8067t.f8044a);
        }
        return updateSDKTile;
    }

    public void A(boolean z7) {
        MapController mapController = this.S;
        if (mapController == null) {
            return;
        }
        mapController.setTwoTouchClickZoomEnabled(z7);
    }

    public float[] B() {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return null;
        }
        return appBaseMap.getProjectionMatrix();
    }

    public float[] C() {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return null;
        }
        return appBaseMap.getViewMatrix();
    }

    public void D(boolean z7) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return;
        }
        if (z7) {
            this.f8051d = 22.0f;
            this.f8053f = 22.0f;
            MapController mapController = this.S;
            if (mapController != null) {
                mapController.mMaxZoomLevel = 22.0f;
            }
        } else {
            this.f8051d = 22.0f;
            this.f8053f = 22.0f;
            MapController mapController2 = this.S;
            if (mapController2 != null) {
                mapController2.mMaxZoomLevel = 22.0f;
            }
        }
        appBaseMap.ShowBaseIndoorMap(z7);
    }

    public double E() {
        return y().f8160m;
    }

    public boolean G() {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap != null) {
            return appBaseMap.LayersIsShow(appBaseMap.getLayerIDByTag("poiindoormarklayer"));
        }
        return false;
    }

    public boolean J(boolean z7) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return false;
        }
        long layerIDByTag = appBaseMap.getLayerIDByTag("carnavinode");
        long layerIDByTag2 = this.f8070w.getLayerIDByTag(MapController.ANDROID_SDK_LAYER_TAG);
        if (layerIDByTag == 0 || layerIDByTag2 == 0) {
            return false;
        }
        if (z7) {
            if (this.R) {
                return false;
            }
            boolean SwitchLayer = this.f8070w.SwitchLayer(layerIDByTag, layerIDByTag2);
            this.R = true;
            return SwitchLayer;
        }
        if (!this.R) {
            return false;
        }
        boolean SwitchLayer2 = this.f8070w.SwitchLayer(layerIDByTag2, layerIDByTag);
        this.R = false;
        return SwitchLayer2;
    }

    public void a(h hVar) {
        this.F = hVar;
    }

    public boolean b(ParticleEffectType particleEffectType) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap != null) {
            return appBaseMap.showParticleEffectByType(particleEffectType.getType());
        }
        return false;
    }

    public void d() {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return;
        }
        appBaseMap.ClearSDKLayer(this.f8073z.f8044a);
    }

    public void g(Bundle bundle) {
        g gVar;
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null || (gVar = this.D) == null) {
            return;
        }
        appBaseMap.initHeatMapData(gVar.f8044a, bundle);
    }

    public void i(Bundle bundle) {
        if (this.f8070w == null) {
            return;
        }
        c(bundle);
        this.f8070w.removeOneOverlayItem(bundle);
    }

    public void j(Bundle bundle) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return;
        }
        appBaseMap.setMapBackgroundImage(bundle);
    }

    public void k(Bundle bundle) {
        g gVar;
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null || (gVar = this.D) == null) {
            return;
        }
        appBaseMap.updateHeatMapData(gVar.f8044a, bundle);
    }

    public void l(Bundle bundle) {
        if (this.f8070w == null || bundle == null) {
            return;
        }
        c(bundle);
        a(bundle);
        this.f8070w.updateOneOverlayItem(bundle);
    }

    public int p() {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return 1;
        }
        appBaseMap.getFontSizeLevel();
        return 1;
    }

    public void q(boolean z7) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return;
        }
        this.f8057j = z7;
        LocationOverlay locationOverlay = this.T;
        if (locationOverlay != null) {
            appBaseMap.ShowLayers(locationOverlay.mLayerID, z7);
            return;
        }
        MapViewInterface mapView = this.S.getMapView();
        if (mapView != null) {
            LocationOverlay locationOverlay2 = new LocationOverlay(this.f8070w);
            this.T = locationOverlay2;
            mapView.addOverlay(locationOverlay2);
        }
    }

    public synchronized void r(boolean z7) {
        if (this.f8070w != null && w() != MapLanguage.ENGLISH.ordinal() && !this.Y) {
            this.V = z7;
            this.f8070w.setCustomStyleEnable(z7);
            if (OpenLogUtil.isMapLogEnable()) {
                com.baidu.mapsdkplatform.comapi.commonutils.b.a().a("CustomMap setMapCustomEnable enable = " + z7);
            }
            return;
        }
        Log.e("baidumapsdk", "Opening custom map is not support after setting English map , or map has been destroyed");
    }

    public boolean s() {
        return this.f8057j;
    }

    public void t(boolean z7) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return;
        }
        if (z7) {
            if (this.P) {
                return;
            }
            appBaseMap.SwitchLayer(appBaseMap.getLayerIDByTag("traffic"), this.f8073z.f8044a);
            this.P = true;
            return;
        }
        if (this.P) {
            appBaseMap.SwitchLayer(this.f8073z.f8044a, appBaseMap.getLayerIDByTag("indoorlayer"));
            this.P = false;
        }
    }

    public void u(boolean z7) {
        MapController mapController = this.S;
        if (mapController == null) {
            return;
        }
        mapController.setOverlookGestureEnable(z7);
        this.f8061n = z7;
    }

    public void v(boolean z7) {
        MapController mapController = this.S;
        if (mapController == null) {
            return;
        }
        mapController.set3DGestureEnable(z7);
        this.f8065r = z7;
    }

    public int w() {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return 0;
        }
        return appBaseMap.getMapLanguage();
    }

    public void x(boolean z7) {
        if (this.f8070w == null) {
            return;
        }
        this.f8055h = z7;
        a();
        this.f8070w.ShowSatelliteMap(this.f8055h);
        MapController mapController = this.S;
        if (mapController != null) {
            if (z7) {
                mapController.setMapTheme(2, new Bundle());
            } else {
                mapController.setMapTheme(1, new Bundle());
            }
        }
    }

    public s y() {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return null;
        }
        Bundle GetMapStatus = appBaseMap.GetMapStatus();
        s sVar = new s();
        sVar.a(GetMapStatus);
        return sVar;
    }

    public LatLngBounds z() {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return null;
        }
        Bundle mapStatusLimits = appBaseMap.getMapStatusLimits();
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        int i8 = mapStatusLimits.getInt("maxCoorx");
        int i9 = mapStatusLimits.getInt("minCoorx");
        builder.include(CoordUtil.mc2ll(new GeoPoint(mapStatusLimits.getInt("minCoory"), i8))).include(CoordUtil.mc2ll(new GeoPoint(mapStatusLimits.getInt("maxCoory"), i9)));
        return builder.build();
    }

    public void a(w wVar) {
        this.f8068u = wVar;
    }

    public void b(int i8) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return;
        }
        appBaseMap.setBackgroundColor(i8);
    }

    public void d(Bundle bundle) {
        if (this.f8070w == null) {
            return;
        }
        c(bundle);
        a(bundle);
        this.f8070w.addOneOverlayItem(bundle);
    }

    public void g() {
        LocationOverlay locationOverlay = this.T;
        if (locationOverlay != null) {
            locationOverlay.clearLocationLayerData(null);
        }
    }

    public synchronized void h() {
        this.Y = true;
    }

    public void j(boolean z7) {
        MapController mapController = this.S;
        if (mapController == null) {
            return;
        }
        mapController.setDoubleClickMoveZoomEnable(z7);
    }

    public void k(boolean z7) {
        MapController mapController = this.S;
        if (mapController == null) {
            return;
        }
        mapController.setDoubleClickZoom(z7);
    }

    public void a(com.baidu.mapsdkplatform.comapi.map.z.a aVar) {
        this.B = aVar;
    }

    public void b(boolean z7) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return;
        }
        appBaseMap.setDrawHouseHeightEnable(z7);
    }

    public void i(boolean z7) {
        MapController mapController = this.S;
        if (mapController == null) {
            return;
        }
        mapController.setDoubleClickGesturesCenter(z7);
    }

    public s n() {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return null;
        }
        Bundle GetMapStatus = appBaseMap.GetMapStatus(false);
        s sVar = new s();
        sVar.a(GetMapStatus);
        return sVar;
    }

    public void F(boolean z7) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return;
        }
        appBaseMap.ShowLayers(10L, z7);
    }

    public void a(BmLayer bmLayer) {
        this.A = bmLayer;
    }

    public void b(Bundle[] bundleArr) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return;
        }
        appBaseMap.removeOverlayItems(bundleArr);
    }

    public void l(boolean z7) {
        MapController mapController = this.S;
        if (mapController == null) {
            return;
        }
        mapController.setEnlargeCenterWithDoubleClickEnable(z7);
    }

    public void m(boolean z7) {
        MapController mapController = this.S;
        if (mapController == null) {
            return;
        }
        mapController.setFlingEnable(z7);
    }

    public boolean a(String str) {
        return this.f8070w.downloadMapStyle(str);
    }

    public boolean b(String str, String str2) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return false;
        }
        return appBaseMap.SwitchBaseIndoorMapFloor(str, str2);
    }

    public boolean c() {
        AppBaseMap appBaseMap;
        x xVar = this.f8067t;
        if (xVar == null || (appBaseMap = this.f8070w) == null) {
            return false;
        }
        return appBaseMap.cleanSDKTileDataCache(xVar.f8044a);
    }

    public void d(int i8) {
        g gVar;
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null || (gVar = this.D) == null) {
            return;
        }
        appBaseMap.setHeatMapFrameAnimationIndex(gVar.f8044a, i8);
    }

    public LatLngBounds f(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        int i8 = bundle.getInt("type");
        String string = bundle.getString("encodedPoints");
        LatLngBounds build = new LatLngBounds.Builder().build();
        int i9 = bundle.getInt("encodePointType");
        if (string == null || string.length() <= 0) {
            return build;
        }
        if (i8 != d.prism.ordinal() && i8 != d.polygon.ordinal()) {
            return build;
        }
        ArrayList<LatLng> a8 = com.baidu.platform.comapi.util.g.a().a(string, i9);
        if (a8 == null || a8.size() <= 0) {
            return null;
        }
        int size = a8.size();
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            GeoPoint ll2mcDirect = CoordUtil.ll2mcDirect(a8.get(i10));
            dArr[i10] = ll2mcDirect.getLongitudeE6();
            dArr2[i10] = ll2mcDirect.getLatitudeE6();
        }
        Point point = new Point();
        GeoPoint ll2mc = CoordUtil.ll2mc(a8.get(0));
        Rect rect = new Rect((int) ll2mc.getLongitudeE6(), (int) ll2mc.getLatitudeE6(), (int) ll2mc.getLongitudeE6(), (int) ll2mc.getLatitudeE6());
        for (int i11 = 1; i11 < size; i11++) {
            int i12 = (int) dArr[i11];
            point.x = i12;
            point.y = (int) dArr2[i11];
            rect.set(Math.min(rect.left, i12), Math.max(rect.top, point.y), Math.max(rect.right, point.x), Math.min(rect.bottom, point.y));
        }
        GeoPoint geoPoint = new GeoPoint(rect.bottom, rect.left);
        GeoPoint geoPoint2 = new GeoPoint(rect.top, rect.right);
        LatLng mc2ll = CoordUtil.mc2ll(geoPoint);
        return new LatLngBounds.Builder().include(mc2ll).include(CoordUtil.mc2ll(geoPoint2)).build();
    }

    private void a(MapController mapController) {
        if (!JNIInitializer.isResourceInited()) {
            synchronized (JNIInitializer.class) {
            }
        }
        Bundle bundle = new Bundle();
        bundle.putInt("animation", 1);
        bundle.putDouble("level", 12.0d);
        bundle.putDouble("centerptx", 1.295815798E7d);
        bundle.putDouble("centerpty", 4825999.74d);
        bundle.putDouble("centerptz", com.github.mikephil.charting.utils.i.DOUBLE_EPSILON);
        bundle.putInt(TtmlNode.LEFT, 0);
        bundle.putInt("top", 0);
        int screenHeight = SysOSUtil.getInstance().getScreenHeight();
        bundle.putInt(TtmlNode.RIGHT, SysOSUtil.getInstance().getScreenWidth());
        bundle.putInt("bottom", screenHeight);
        bundle.putString("modulePath", SysOSUtil.getInstance().getOutputDirPath());
        bundle.putString("appSdcardPath", SysOSUtil.getInstance().getExternalFilesDir());
        bundle.putString("appCachePath", SysOSUtil.getInstance().getOutputCache());
        bundle.putString("appSecondCachePath", SysOSUtil.getInstance().getOutputCache());
        bundle.putInt("mapTmpMax", EnvironmentUtilities.getMapTmpStgMax());
        bundle.putInt("domTmpMax", EnvironmentUtilities.getDomTmpStgMax());
        bundle.putInt("itsTmpMax", EnvironmentUtilities.getItsTmpStgMax());
        bundle.putInt("ssgTmpMax", EnvironmentUtilities.getSsgTmpStgMax());
        mapController.initMapResources(bundle);
    }

    public void b(Bundle bundle) {
        i iVar;
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null || (iVar = this.E) == null) {
            return;
        }
        appBaseMap.addHexagonMapData(iVar.f8044a, bundle);
    }

    public void c(Bundle bundle) {
        if (bundle.get("param") != null) {
            Bundle bundle2 = (Bundle) bundle.get("param");
            int i8 = bundle2.getInt("type");
            if (i8 == d.ground.ordinal()) {
                bundle2.putLong("layer_addr", this.f8073z.f8044a);
                return;
            }
            if (i8 >= d.arc.ordinal()) {
                bundle2.putLong("layer_addr", this.f8073z.f8044a);
                return;
            } else if (i8 == d.popup.ordinal()) {
                bundle2.putLong("layer_addr", this.f8073z.f8044a);
                return;
            } else {
                bundle2.putLong("layer_addr", this.f8073z.f8044a);
                return;
            }
        }
        int i9 = bundle.getInt("type");
        if (i9 == d.ground.ordinal()) {
            bundle.putLong("layer_addr", this.f8073z.f8044a);
            return;
        }
        if (i9 >= d.arc.ordinal()) {
            bundle.putLong("layer_addr", this.f8073z.f8044a);
        } else if (i9 == d.popup.ordinal()) {
            bundle.putLong("layer_addr", this.f8073z.f8044a);
        } else {
            bundle.putLong("layer_addr", this.f8073z.f8044a);
        }
    }

    public void I(boolean z7) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap != null) {
            appBaseMap.showTrafficUGCMap(z7);
        }
    }

    public void b(Point point) {
        MapController mapController = this.S;
        if (mapController == null || point == null) {
            return;
        }
        mapController.setPointGesturesCenter(point);
    }

    void b() {
        MapController mapController = this.S;
        if (mapController == null || mapController.mIsMoving || mapController.mIsAnimating) {
            return;
        }
        mapController.mIsAnimating = true;
        if (this.f8069v == null) {
            return;
        }
        s y7 = y();
        for (int i8 = 0; i8 < this.f8069v.size(); i8++) {
            com.baidu.platform.comapi.map.w wVar = this.f8069v.get(i8);
            if (wVar != null) {
                wVar.c(y7);
            }
        }
    }

    public void e(boolean z7) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return;
        }
        appBaseMap.ShowLayers(appBaseMap.getLayerIDByTag("basemap"), z7);
    }

    public void e() {
        g gVar;
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null || (gVar = this.D) == null) {
            return;
        }
        appBaseMap.clearHeatMapLayerCache(gVar.f8044a);
        this.f8070w.UpdateLayers(this.D.f8044a);
    }

    public void o(boolean z7) {
        if (this.f8070w == null) {
            return;
        }
        if (this.E == null) {
            i iVar = new i();
            this.E = iVar;
            a(iVar);
        }
        this.f8059l = z7;
        this.f8070w.ShowLayers(this.E.f8044a, z7);
    }

    public b(Context context, MapSurfaceView mapSurfaceView, q qVar, String str, int i8) {
        MapController mapController = new MapController();
        this.S = mapController;
        mapController.initAppBaseMap();
        a(this.S);
        mapSurfaceView.setMapController(this.S);
        this.f8070w = this.S.getBaseMap();
        a("com.baidu.platform.comapi.wnplatform.walkmap.WNaviBaiduMap", "setId", this.S.getMapId());
        I();
        a(qVar);
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap != null) {
            appBaseMap.SetSDKLayerCallback(this);
        }
        this.S.onResume();
    }

    public void H(boolean z7) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap != null) {
            appBaseMap.ShowLayers(appBaseMap.getLayerIDByTag("basepoi"), z7);
        }
    }

    public void c(int i8) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap != null) {
            appBaseMap.setFontSizeLevel(i8);
        }
    }

    private void a(String str, String str2, long j8) {
        try {
            Class<?> cls = Class.forName(str);
            cls.getMethod(str2, Long.TYPE).invoke(cls.newInstance(), Long.valueOf(j8));
        } catch (Exception unused) {
        }
    }

    private void a(q qVar) {
        if (qVar == null) {
            qVar = new q();
        }
        s sVar = qVar.f8137a;
        boolean z7 = qVar.f8142f;
        this.f8061n = z7;
        this.f8065r = qVar.f8140d;
        this.f8062o = qVar.f8141e;
        this.f8063p = qVar.f8143g;
        u(z7);
        v(this.f8065r);
        y(this.f8062o);
        B(this.f8063p);
        this.f8070w.SetMapStatus(sVar.a(this));
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return;
        }
        appBaseMap.SetMapControlMode(p.DEFAULT.ordinal());
        boolean z8 = qVar.f8138b;
        this.f8056i = z8;
        if (z8) {
            if (this.U == null) {
                this.U = new com.baidu.platform.comapi.map.d(this.f8070w);
                MapViewInterface mapView = this.S.getMapView();
                if (mapView != null) {
                    mapView.addOverlay(this.U);
                    H();
                }
            }
            this.f8070w.ShowLayers(this.U.mLayerID, true);
            this.f8070w.ResetImageRes();
        }
        int i8 = qVar.f8139c;
        if (i8 == 2) {
            x(true);
        }
        if (i8 == 3) {
            if (U()) {
                H(false);
            }
            if (G()) {
                E(false);
            }
            e(false);
            D(false);
        }
    }

    public void f() {
        i iVar;
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null || (iVar = this.E) == null) {
            return;
        }
        appBaseMap.clearHexagonLayerCache(iVar.f8044a);
        this.f8070w.UpdateLayers(this.E.f8044a);
    }

    public boolean a(Point point) {
        int i8;
        int i9;
        if (point != null && this.f8070w != null && (i8 = point.x) >= 0 && (i9 = point.y) >= 0) {
            f8049b = i8;
            f8050c = i9;
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("x", f8049b);
                jSONObject2.put("y", f8050c);
                jSONObject2.put("hidetime", 1000);
                jSONArray.put(jSONObject2);
                jSONObject.put("dataset", jSONArray);
            } catch (JSONException e8) {
                e8.printStackTrace();
            }
            if (this.U != null) {
                if (!TextUtils.isEmpty(jSONObject.toString())) {
                    this.U.setData(jSONObject.toString());
                }
                this.U.UpdateOverlay();
                return true;
            }
        }
        return false;
    }

    public void a(Bitmap bitmap) {
        Bundle bundle;
        if (this.f8070w == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("type", 0);
            jSONObject2.put("x", f8049b);
            jSONObject2.put("y", f8050c);
            jSONObject2.put("hidetime", 1000);
            jSONArray.put(jSONObject2);
            jSONObject.put("dataset", jSONArray);
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        if (bitmap == null) {
            bundle = null;
        } else {
            Bundle bundle2 = new Bundle();
            Bundle bundle3 = new Bundle();
            ByteBuffer allocate = ByteBuffer.allocate(bitmap.getWidth() * bitmap.getHeight() * 4);
            bitmap.copyPixelsToBuffer(allocate);
            bundle3.putByteArray("imgData", allocate.array());
            bundle3.putString("imgKey", bitmap.hashCode() + "_" + System.currentTimeMillis());
            bundle3.putInt("imgH", bitmap.getHeight());
            bundle3.putInt("imgW", bitmap.getWidth());
            bundle3.putInt("hasIcon", 1);
            bundle2.putBundle("iconData", bundle3);
            bundle = bundle2;
        }
        if (this.U != null) {
            if (!TextUtils.isEmpty(jSONObject.toString())) {
                this.U.setData(jSONObject.toString());
            }
            if (bundle != null) {
                this.U.setParam(bundle);
            }
            this.U.UpdateOverlay();
        }
    }

    public void a(float f8, float f9) {
        this.f8051d = f8;
        this.f8053f = f8;
        this.f8052e = f9;
        MapController mapController = this.S;
        if (mapController != null) {
            mapController.setMaxAndMinZoomLevel(f8, f9);
        }
        if (this.f8070w != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("maxLevel", (int) f8);
            bundle.putInt("minLevel", (int) f9);
            this.f8070w.setMaxAndMinZoomLevel(bundle);
        }
    }

    private void a() {
        if (!this.f8058k && !this.f8055h && !this.f8054g && !this.f8060m) {
            float f8 = this.f8053f;
            this.f8051d = f8;
            MapController mapController = this.S;
            if (mapController != null) {
                mapController.mMaxZoomLevel = f8;
                return;
            }
            return;
        }
        if (this.f8051d > 20.0f) {
            this.f8051d = 20.0f;
            MapController mapController2 = this.S;
            if (mapController2 != null) {
                mapController2.mMaxZoomLevel = 20.0f;
            }
        }
        if (y().f8148a > 20.0f) {
            s y7 = y();
            y7.f8148a = 20.0f;
            a(y7);
        }
    }

    public void a(int i8, int i9, int i10, int i11) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap != null) {
            appBaseMap.setCustomTrafficColor(i8, i9, i10, i11);
        }
    }

    public void a(PoiTagType poiTagType, boolean z7) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap != null) {
            appBaseMap.setPoiTagEnable(poiTagType.ordinal(), z7);
        }
    }

    public boolean a(PoiTagType poiTagType) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap != null) {
            return appBaseMap.getPoiTagEnable(poiTagType.ordinal());
        }
        return false;
    }

    public void a(ParticleEffectType particleEffectType) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap != null) {
            appBaseMap.closeParticleEffectByType(particleEffectType.getType());
        }
    }

    public boolean a(ParticleEffectType particleEffectType, Bundle bundle) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap != null) {
            return appBaseMap.customParticleEffectByType(particleEffectType.getType(), bundle);
        }
        return false;
    }

    private void a(com.baidu.mapsdkplatform.comapi.map.a aVar) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return;
        }
        aVar.f8044a = appBaseMap.AddLayer(aVar.f8046c, aVar.f8047d, aVar.f8045b);
        synchronized (this.f8071x) {
            this.f8071x.add(aVar);
        }
    }

    public void a(boolean z7) {
        LocationOverlay locationOverlay;
        LocationOverlay locationOverlay2;
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return;
        }
        if (z7) {
            if (this.Q || (locationOverlay2 = this.T) == null) {
                return;
            }
            appBaseMap.SwitchLayer(this.f8073z.f8044a, locationOverlay2.mLayerID);
            this.Q = true;
            return;
        }
        if (!this.Q || (locationOverlay = this.T) == null) {
            return;
        }
        appBaseMap.SwitchLayer(locationOverlay.mLayerID, this.f8073z.f8044a);
        this.Q = false;
    }

    public boolean a(MapLayer mapLayer, MapLayer mapLayer2) {
        if (this.f8070w == null) {
            return false;
        }
        long a8 = a(mapLayer);
        long a9 = a(mapLayer2);
        if (a8 == -1 || a9 == -1) {
            return false;
        }
        boolean SwitchLayer = this.f8070w.SwitchLayer(a8, a9);
        this.f8070w.UpdateLayers(a9);
        return SwitchLayer;
    }

    public void a(MapLayer mapLayer, boolean z7) {
        if (this.f8070w == null) {
            return;
        }
        long a8 = a(mapLayer);
        if (a8 == -1) {
            return;
        }
        this.f8070w.SetLayersClickable(a8, z7);
    }

    private long a(MapLayer mapLayer) {
        if (this.f8070w == null) {
            return -1L;
        }
        switch (a.f8074a[mapLayer.ordinal()]) {
            case 1:
                LocationOverlay locationOverlay = this.T;
                if (locationOverlay != null) {
                    return locationOverlay.mLayerID;
                }
                return -1L;
            case 2:
                v vVar = this.f8073z;
                if (vVar != null) {
                    return vVar.f8044a;
                }
                return -1L;
            case 3:
                BmLayer bmLayer = this.A;
                if (bmLayer != null) {
                    return bmLayer.c();
                }
                return -1L;
            case 4:
                if (this.f8073z != null) {
                    return this.D.f8044a;
                }
                return -1L;
            case 5:
                if (this.f8073z != null) {
                    return this.E.f8044a;
                }
                return -1L;
            case 6:
                com.baidu.mapsdkplatform.comapi.map.z.a aVar = this.B;
                if (aVar != null) {
                    return aVar.mLayerID;
                }
                return -1L;
            default:
                return -1L;
        }
    }

    public void a(int i8) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return;
        }
        appBaseMap.cleanCache(i8, true);
    }

    public GeoPoint a(int i8, int i9) {
        return this.S.getMapView().getProjection().fromPixels(i8, i9);
    }

    public Point a(GeoPoint geoPoint) {
        com.baidu.platform.comapi.basestruct.Point pixels = this.S.getMapView().getProjection().toPixels(geoPoint, null);
        if (pixels != null) {
            return new Point(pixels.getIntX(), pixels.getIntY());
        }
        return new Point();
    }

    public Point a(GeoPoint geoPoint, int i8) {
        com.baidu.platform.comapi.basestruct.Point pixels = this.S.getMapView().getProjection().toPixels(geoPoint, i8, null);
        if (pixels != null) {
            return new Point(pixels.getIntX(), pixels.getIntY());
        }
        return new Point();
    }

    public void a(Bundle bundle) {
        if (bundle != null && bundle.containsKey("encodedPoints") && bundle.containsKey("encodePointType")) {
            int i8 = bundle.getInt("encodePointType");
            if (i8 == EncodePointType.BUILDINGINFO.ordinal() || i8 == EncodePointType.AOI.ordinal() || i8 == EncodePointType.RECOGNIZE_AOI.ordinal()) {
                a(bundle, bundle.getString("encodedPoints"));
            }
        }
    }

    public void a(Bundle bundle, String str) {
        if (bundle == null || str == null || str.length() <= 0) {
            return;
        }
        ArrayList<LatLng> a8 = com.baidu.platform.comapi.util.g.a().a(str, bundle.getInt("encodePointType"));
        if (a8 == null || a8.size() <= 0) {
            return;
        }
        int size = a8.size();
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        for (int i8 = 0; i8 < size; i8++) {
            GeoPoint ll2mcDirect = CoordUtil.ll2mcDirect(a8.get(i8));
            dArr[i8] = ll2mcDirect.getLongitudeE6();
            dArr2[i8] = ll2mcDirect.getLatitudeE6();
        }
        bundle.putDoubleArray("x_array", dArr);
        bundle.putDoubleArray("y_array", dArr2);
        GeoPoint ll2mcDirect2 = CoordUtil.ll2mcDirect(a8.get(0));
        bundle.putDouble("location_x", ll2mcDirect2.getLongitudeE6());
        bundle.putDouble("location_y", ll2mcDirect2.getLatitudeE6());
        if (bundle.getInt("has_dotted_stroke") == 1) {
            bundle.putDouble("dotted_stroke_location_x", ll2mcDirect2.getLongitudeE6());
            bundle.putDouble("dotted_stroke_location_y", ll2mcDirect2.getLatitudeE6());
        }
    }

    public void a(Bundle[] bundleArr) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null || bundleArr == null) {
            return;
        }
        appBaseMap.addOverlayItems(bundleArr, bundleArr.length);
    }

    public synchronized void a(String str, String str2) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap != null && !this.Y) {
            appBaseMap.initCustomStyle(str, str2);
        }
    }

    public void a(int i8, int i9, int i10, int i11, boolean z7) {
        AppBaseMap appBaseMap = this.f8070w;
        if (appBaseMap == null) {
            return;
        }
        appBaseMap.setCustomTrafficColor(i8, i9, i10, i11, z7);
    }

    public float a(int i8, int i9, int i10, int i11, int i12, int i13) {
        if (!this.S.mIsMapLoadFinish) {
            return 12.0f;
        }
        if (this.f8070w == null) {
            return 0.0f;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(TtmlNode.LEFT, i8);
        bundle.putInt(TtmlNode.RIGHT, i10);
        bundle.putInt("bottom", i11);
        bundle.putInt("top", i9);
        bundle.putInt("hasHW", 1);
        bundle.putInt(com.arthenica.ffmpegkit.x.KEY_WIDTH, i12);
        bundle.putInt(com.arthenica.ffmpegkit.x.KEY_HEIGHT, i13);
        Bundle bundle2 = new Bundle();
        bundle2.putInt(TtmlNode.LEFT, 0);
        bundle2.putInt("bottom", i13);
        bundle2.putInt(TtmlNode.RIGHT, i12);
        bundle2.putInt("top", 0);
        return this.f8070w.GetFZoomToBoundF(bundle, bundle2);
    }

    public void a(List<OverlayLocationData> list) {
        LocationOverlay locationOverlay = this.T;
        if (locationOverlay == null) {
            return;
        }
        locationOverlay.setLocationLayerData(list);
        this.T.UpdateOverlay();
    }

    public void a(String str, Bundle bundle) {
        LocationOverlay locationOverlay = this.T;
        if (locationOverlay == null) {
            return;
        }
        locationOverlay.setData(str);
        this.T.setParam(bundle);
        this.T.UpdateOverlay();
    }

    public void a(LatLng latLng) {
        MapController mapController = this.S;
        if (mapController == null || latLng == null) {
            return;
        }
        mapController.setLatLngGesturesCenter(latLng);
    }

    public void a(com.baidu.platform.comapi.map.w wVar) {
        if (wVar == null || this.f8069v == null) {
            return;
        }
        this.S.registMapViewListener(wVar);
        this.f8069v.add(wVar);
    }

    public void a(com.baidu.platform.comapi.map.x xVar) {
        if (xVar == null) {
            return;
        }
        this.S.setOverlayListener(xVar);
    }

    public void a(s sVar) {
        if (this.f8070w == null || sVar == null) {
            return;
        }
        Bundle a8 = sVar.a(this);
        a8.putInt("animation", 0);
        a8.putInt("animatime", 0);
        T();
        this.f8070w.SetMapStatus(a8);
    }

    public void a(s sVar, int i8) {
        if (this.f8070w == null || sVar == null) {
            return;
        }
        Bundle a8 = sVar.a(this);
        a8.putInt("animation", 1);
        a8.putInt("animatime", i8);
        if (this.M) {
            this.N.add(new C0077b(a8));
        } else {
            b();
            this.f8070w.SetMapStatus(a8);
        }
    }

    public void a(LatLngBounds latLngBounds) {
        if (latLngBounds == null || this.f8070w == null) {
            return;
        }
        LatLng latLng = latLngBounds.northeast;
        LatLng latLng2 = latLngBounds.southwest;
        GeoPoint ll2mc = CoordUtil.ll2mc(latLng);
        GeoPoint ll2mc2 = CoordUtil.ll2mc(latLng2);
        int longitudeE6 = (int) ll2mc.getLongitudeE6();
        int latitudeE6 = (int) ll2mc2.getLatitudeE6();
        int longitudeE62 = (int) ll2mc2.getLongitudeE6();
        int latitudeE62 = (int) ll2mc.getLatitudeE6();
        Bundle bundle = new Bundle();
        bundle.putInt("maxCoorx", longitudeE6);
        bundle.putInt("minCoory", latitudeE6);
        bundle.putInt("minCoorx", longitudeE62);
        bundle.putInt("maxCoory", latitudeE62);
        this.f8070w.setMapStatusLimits(bundle);
    }

    @Override // com.baidu.mapsdkplatform.a.a.a.a, com.baidu.platform.comjni.map.basemap.a
    public int a(Bundle bundle, long j8, int i8) {
        g gVar = this.D;
        if (gVar != null && j8 == gVar.f8044a && this.F != null) {
            int i9 = bundle.getInt("zoom");
            bundle.putBundle("param", this.F.a(bundle.getInt("index"), i9));
            return this.D.f8176e;
        }
        x xVar = this.f8067t;
        if (xVar == null || j8 != xVar.f8044a) {
            return 0;
        }
        bundle.putBundle("param", this.f8068u.a(bundle.getInt("x"), bundle.getInt("y"), bundle.getInt("zoom"), null));
        return this.f8067t.f8176e;
    }

    @Override // com.baidu.mapsdkplatform.a.a.a.a, com.baidu.platform.comjni.map.basemap.a
    public boolean a(long j8) {
        synchronized (this.f8071x) {
            try {
                Iterator<com.baidu.mapsdkplatform.comapi.map.a> it = this.f8071x.iterator();
                while (it.hasNext()) {
                    if (it.next().f8044a == j8) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i8, boolean z7) {
        if (this.f8070w != null && (!this.V || i8 != MapLanguage.ENGLISH.ordinal())) {
            this.f8070w.setMapLanguage(i8, z7);
        } else {
            Log.e("baidumapsdk", "Opening English map is not supported after setting custom map");
        }
    }
}
