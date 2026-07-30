package com.baidu.platform.comapi.map;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.core.text.util.LocalePreferences;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.mapapi.OpenLogUtil;
import com.baidu.mapapi.map.OverlayUtil;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.JNIInitializer;
import com.baidu.platform.comapi.UIMsg;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.location.CoordinateUtil;
import com.baidu.platform.comapi.logstatistics.SDKLogFactory;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.baidu.platform.comapi.map.MapStatus;
import com.baidu.platform.comapi.util.SysOSUtil;
import com.baidu.platform.comjni.engine.MessageProxy;
import com.baidu.platform.comjni.map.basemap.AppBaseMap;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.util.GmsVersion;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MapController {
    public static final String ANDROID_SDK_LAYER_TAG = "android_sdk";
    public static final String CITY_AREA_TAG = "cityarea";
    public static final String COMPASS_LAYER_TAG = "compass";
    public static final String DEFAULT_LAYER_TAG = "default";
    public static final String DYNAMIC_MAP_LAYER_TAG = "dynamicmap";
    public static final String FOOTSURFACE_LAYER_TAG = "footsurface";
    public static final String HEATMAP_LAYER_TAG = "heatmap";
    public static final String ITEM_LAYER_TAG = "item";
    public static final String ITSROUTE_LAYER_TAG = "itsroute";
    public static final String LOCAL_LIMIT_MAP_LAYER_TAG = "dynamiclimit";
    public static final String LOCATION_LAYER_TAG = "location";
    public static final int MSG_LONGLINK_CONNECT = 1;
    public static final int MSG_LONGLINK_DISCONNECT = 2;
    public static final String POISON_LAYER_TAG = "poison";
    public static final String POPUP_LAYER_TAG = "popup";
    public static final String RTPOPUP_LAYER_TAG = "rtpopup";
    public static final String RT_POPUP_LAYER_TAG = "rtpopup";
    public static final String SHARELOCATION_BUBBLE = "smshare";
    public static final String STREETPOPUP_LAYER_TAG = "streetpopup";
    public static final String STREETROUTE_LAYER_TAG = "streetroute";

    /* renamed from: a, reason: collision with root package name */
    private static final String f9447a = "MapController";

    /* renamed from: b, reason: collision with root package name */
    private static boolean f9448b = true;

    /* renamed from: c, reason: collision with root package name */
    private static float f9449c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    private static float f9450d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f9451e = false;

    /* renamed from: f, reason: collision with root package name */
    private static long f9452f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static List<AppBaseMap> f9453g = new ArrayList();
    public static boolean isCompass = false;
    public static boolean mLocIconOnScreen = true;
    public static boolean m_registered_SENSOR_ORIENTATION;
    private long N;

    /* renamed from: d0, reason: collision with root package name */
    SoftReference<MapViewInterface> f9457d0;

    /* renamed from: e0, reason: collision with root package name */
    NaviMapViewListener f9458e0;

    /* renamed from: f0, reason: collision with root package name */
    private long f9459f0;

    /* renamed from: h, reason: collision with root package name */
    private com.baidu.platform.comapi.map.d0.c f9461h;
    public boolean mHasBmDrawItemDraging;
    public boolean mHasMapObjDraging;
    public boolean mIsMapLoadFinish;
    public boolean mIsMapLoadStart;
    public x mOverlayListener;

    /* renamed from: o, reason: collision with root package name */
    private MapFirstFrameCallback f9471o;

    /* renamed from: q, reason: collision with root package name */
    private Point f9473q;

    /* renamed from: r, reason: collision with root package name */
    private LatLng f9474r;

    /* renamed from: x, reason: collision with root package name */
    private Handler f9480x;

    /* renamed from: i, reason: collision with root package name */
    private boolean f9463i = true;

    /* renamed from: j, reason: collision with root package name */
    private boolean f9465j = true;

    /* renamed from: k, reason: collision with root package name */
    int f9467k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f9468l = 1;

    /* renamed from: m, reason: collision with root package name */
    private int f9469m = 1;

    /* renamed from: n, reason: collision with root package name */
    private boolean f9470n = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f9472p = false;

    /* renamed from: s, reason: collision with root package name */
    private boolean f9475s = false;

    /* renamed from: t, reason: collision with root package name */
    private boolean f9476t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f9477u = false;

    /* renamed from: v, reason: collision with root package name */
    private AppBaseMap f9478v = null;

    /* renamed from: w, reason: collision with root package name */
    private long f9479w = 0;
    public int nearlyRadius = 20;
    private boolean A = false;
    private boolean B = false;
    private boolean C = false;
    private boolean D = false;
    private a E = new a();
    private boolean F = true;
    private boolean G = false;
    private boolean H = true;
    private boolean I = true;
    private boolean J = false;
    private float K = -1.0f;
    private float L = -1.0f;
    private float M = 0.0f;
    private boolean O = false;
    private boolean P = false;
    private boolean Q = false;
    private boolean R = true;
    private boolean S = true;
    private boolean T = true;
    private boolean U = true;
    public boolean mIsInertialAnimation = true;
    private boolean V = false;
    MapViewListener W = null;
    CaptureMapListener X = null;
    h Y = null;
    z Z = null;

    /* renamed from: a0, reason: collision with root package name */
    MapRenderModeChangeListener f9454a0 = null;

    /* renamed from: b0, reason: collision with root package name */
    EngineMsgListener f9455b0 = null;

    /* renamed from: c0, reason: collision with root package name */
    MapViewSurfaceListener f9456c0 = null;
    public float mMaxZoomLevel = 22.0f;
    public float mMinZoomLevel = 4.0f;
    public boolean mIsMoving = false;
    public boolean mIsAnimating = false;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f9460g0 = false;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f9462h0 = false;

    /* renamed from: i0, reason: collision with root package name */
    private com.baidu.platform.comapi.map.d0.b f9464i0 = new com.baidu.platform.comapi.map.d0.b(this);

    /* renamed from: j0, reason: collision with root package name */
    private MapControlMode f9466j0 = MapControlMode.DEFAULT;
    public List<w> mListeners = new CopyOnWriteArrayList();

    /* renamed from: y, reason: collision with root package name */
    private int f9481y = SysOSUtil.getInstance().getScreenWidth();

    /* renamed from: z, reason: collision with root package name */
    private int f9482z = SysOSUtil.getInstance().getScreenHeight();

    public enum HeatMapType {
        CITY(0),
        SCENERY(1),
        CEMETERY(2);


        /* renamed from: b, reason: collision with root package name */
        private final int f9484b;

        HeatMapType(int i8) {
            this.f9484b = i8;
        }

        public int getId() {
            return this.f9484b;
        }
    }

    public enum MapControlMode {
        DEFAULT(1),
        INDOOR(2),
        STREET(3),
        STREET_WAITING(4);


        /* renamed from: b, reason: collision with root package name */
        private final int f9486b;

        MapControlMode(int i8) {
            this.f9486b = i8;
        }
    }

    public interface MapFirstFrameCallback {
        void onFirstFrameDrawing(MapController mapController);
    }

    public enum MapLayerType {
        DEFAULT(1),
        SATELLITE(2),
        INDOOR(3),
        STREET(5);


        /* renamed from: b, reason: collision with root package name */
        private final int f9488b;

        MapLayerType(int i8) {
            this.f9488b = i8;
        }
    }

    public enum MapSceneMode {
        DEFAULT(0),
        POI(1),
        ROUTE(2),
        INTERNAL(3),
        INDOOR(7);


        /* renamed from: b, reason: collision with root package name */
        private final int f9490b;

        MapSceneMode(int i8) {
            this.f9490b = i8;
        }

        public int getMode() {
            return this.f9490b;
        }
    }

    public enum MapStyleMode {
        DEFAULT(1),
        SEARCH_POI(2),
        SEARCH_ROUTE(3),
        NAV_DAY(4),
        NAV_NIGHT(5),
        WALK_DAY(6),
        INTERNAL(7),
        INTERNAL_SPECIAL(8),
        FOOT_PRINT(9);


        /* renamed from: b, reason: collision with root package name */
        private final int f9492b;

        MapStyleMode(int i8) {
            this.f9492b = i8;
        }

        public int getMode() {
            return this.f9492b;
        }
    }

    public enum RecommendPoiScene {
        BASE(0),
        INTERNATIONAL(1);

        public int value;

        RecommendPoiScene(int i8) {
            this.value = i8;
        }
    }

    public enum RecycleMemoryLevel {
        NORMAL(0),
        FULL(1);


        /* renamed from: b, reason: collision with root package name */
        private final int f9495b;

        RecycleMemoryLevel(int i8) {
            this.f9495b = i8;
        }

        public int getLevel() {
            return this.f9495b;
        }
    }

    class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f9496a = false;

        /* renamed from: b, reason: collision with root package name */
        float f9497b = 0.0f;

        /* renamed from: c, reason: collision with root package name */
        GeoPoint f9498c;

        /* renamed from: d, reason: collision with root package name */
        com.baidu.platform.comapi.basestruct.Point f9499d;

        a() {
        }

        public void a() {
            this.f9496a = false;
            this.f9497b = 0.0f;
            this.f9498c = null;
            this.f9499d = null;
        }
    }

    @SuppressLint({"HandlerLeak"})
    class b extends com.baidu.platform.comapi.util.i {

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ MapStatus f9502a;

            a(MapStatus mapStatus) {
                this.f9502a = mapStatus;
            }

            @Override // java.lang.Runnable
            public void run() {
                GeoPoint fromPixels = (MapController.this.getMapView() == null || MapController.this.getMapView().getProjection() == null) ? null : MapController.this.f9457d0.get().getProjection().fromPixels(this.f9502a.winRound.left + (MapController.this.getScreenWidth() / 2), this.f9502a.winRound.top + (MapController.this.getScreenHeight() / 2));
                if (fromPixels != null) {
                    MapController.CleanAfterDBClick(MapController.this.f9479w, (float) fromPixels.getLongitudeE6(), (float) fromPixels.getLatitudeE6());
                }
                MapController.this.P = false;
            }
        }

        /* renamed from: com.baidu.platform.comapi.map.MapController$b$b, reason: collision with other inner class name */
        class RunnableC0114b implements Runnable {
            RunnableC0114b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                com.baidu.mapsdkplatform.comapi.map.s mapStatusInner = MapController.this.getMapStatusInner();
                if (MapController.this.mListeners != null) {
                    for (int i8 = 0; i8 < MapController.this.mListeners.size(); i8++) {
                        w wVar = MapController.this.mListeners.get(i8);
                        if (wVar != null) {
                            wVar.c();
                            MapController.this.O = true;
                            wVar.b(mapStatusInner);
                        }
                    }
                }
            }
        }

        b() {
            super(Looper.getMainLooper());
        }

        @Override // com.baidu.platform.comapi.util.i
        public void a(Message message) {
            boolean z7;
            NaviMapViewListener naviMapViewListener;
            NaviMapViewListener naviMapViewListener2;
            x xVar;
            h hVar;
            CaptureMapListener captureMapListener;
            if (message.what == 4000 && (captureMapListener = MapController.this.X) != null) {
                captureMapListener.onGetCaptureMap(message.arg2 == 1);
            }
            if (message.what == 519 && (hVar = MapController.this.Y) != null) {
                hVar.a();
            }
            if (message.what == 65304 && (xVar = MapController.this.mOverlayListener) != null) {
                xVar.a(message.arg2);
            }
            int i8 = message.what;
            if (i8 == 39) {
                if (((Long) message.obj).longValue() != MapController.this.f9479w) {
                    return;
                }
                int i9 = message.arg1;
                if (i9 == 2) {
                    if (MapController.this.mListeners == null) {
                        return;
                    }
                    for (int i10 = 0; i10 < MapController.this.mListeners.size(); i10++) {
                        w wVar = MapController.this.mListeners.get(i10);
                        if (wVar != null) {
                            wVar.a();
                        }
                    }
                    MapController mapController = MapController.this;
                    mapController.mIsMoving = false;
                    mapController.mIsAnimating = false;
                } else if (i9 == 100) {
                    if (MapController.this.P) {
                        SoftReference<MapViewInterface> softReference = MapController.this.f9457d0;
                        if (softReference == null || softReference.get() == null) {
                            return;
                        } else {
                            com.baidu.platform.comapi.util.j.a().execute(new a(MapController.this.getMapStatus()));
                        }
                    }
                    if (MapController.this.Q) {
                        MapController.this.Q = false;
                    }
                    MapController.this.B = false;
                    MapController mapController2 = MapController.this;
                    mapController2.mIsMoving = false;
                    mapController2.mIsAnimating = false;
                    if (mapController2.getMapViewListener() != null) {
                        MapController.this.getMapViewListener().onMapAnimationFinish();
                    }
                    if (MapController.this.isNaviMode() && (naviMapViewListener = MapController.this.f9458e0) != null) {
                        naviMapViewListener.onMapAnimationFinish();
                    }
                    MapController mapController3 = MapController.this;
                    if (mapController3.mListeners != null && mapController3.O) {
                        com.baidu.mapsdkplatform.comapi.map.s mapStatusInner = MapController.this.getMapStatusInner();
                        for (int i11 = 0; i11 < MapController.this.mListeners.size(); i11++) {
                            w wVar2 = MapController.this.mListeners.get(i11);
                            if (wVar2 != null) {
                                wVar2.b(mapStatusInner);
                            }
                        }
                    }
                } else if (i9 == 200) {
                    MapController.this.mIsMoving = false;
                } else if (i9 != 300) {
                    if (i9 != 400) {
                        MapRenderModeChangeListener mapRenderModeChangeListener = MapController.this.f9454a0;
                        if (mapRenderModeChangeListener != null) {
                            mapRenderModeChangeListener.onMapRenderModeChange(i9);
                        }
                        if (MapController.this.isNaviMode() && (naviMapViewListener2 = MapController.this.f9458e0) != null) {
                            naviMapViewListener2.onMapRenderModeChange(message.arg1);
                        }
                    } else {
                        for (int i12 = 0; i12 < MapController.this.mListeners.size(); i12++) {
                            w wVar3 = MapController.this.mListeners.get(i12);
                            if (wVar3 != null) {
                                wVar3.onFirstMapTileLoaded();
                            }
                        }
                    }
                } else if (MapController.this.f9471o != null) {
                    MapController.this.f9471o.onFirstFrameDrawing(MapController.this);
                }
                MapController mapController4 = MapController.this;
                if (!mapController4.mIsMapLoadFinish && mapController4.f9482z > 0 && MapController.this.f9481y > 0 && MapController.this.getMapView() != null && MapController.this.getMapView().getProjection() != null && MapController.this.getMapView().getProjection().fromPixels(0, 0) != null) {
                    MapController.this.mIsMapLoadFinish = true;
                    com.baidu.platform.comapi.util.j.a(new RunnableC0114b(), 0L);
                }
                if (MapController.this.mListeners != null) {
                    for (int i13 = 0; i13 < MapController.this.mListeners.size(); i13++) {
                        w wVar4 = MapController.this.mListeners.get(i13);
                        if (wVar4 != null) {
                            wVar4.b();
                        }
                    }
                }
            } else if (i8 == 41) {
                if (((Long) message.obj).longValue() != MapController.this.f9479w) {
                    return;
                }
                MapController mapController5 = MapController.this;
                if (mapController5.mListeners == null) {
                    return;
                }
                if (mapController5.mIsMoving || mapController5.mIsAnimating) {
                    com.baidu.mapsdkplatform.comapi.map.s mapStatusInner2 = mapController5.getMapStatusInner();
                    for (int i14 = 0; i14 < MapController.this.mListeners.size(); i14++) {
                        w wVar5 = MapController.this.mListeners.get(i14);
                        if (wVar5 != null) {
                            wVar5.a(mapStatusInner2);
                        }
                    }
                }
            } else if (i8 == 2082) {
                int i15 = message.arg1;
                if (i15 == 1003) {
                    i15 = 0;
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (OpenLogUtil.isMapLogEnable()) {
                    com.baidu.mapsdkplatform.comapi.commonutils.b.a().a("onMapRenderValidFrame isValid = " + z7 + "; errorCode = " + i15);
                }
                if (MapController.this.mListeners != null) {
                    for (int i16 = 0; i16 < MapController.this.mListeners.size(); i16++) {
                        w wVar6 = MapController.this.mListeners.get(i16);
                        if (wVar6 != null) {
                            wVar6.a(z7, i15);
                        }
                    }
                }
            }
            if (message.what == 512) {
                int i17 = message.arg1;
                if (MapController.this.getMapViewListener() != null) {
                    MapController.this.getMapViewListener().onClickedPopup(i17);
                }
            }
            if (message.what == 50) {
                if (OpenLogUtil.isMapLogEnable()) {
                    com.baidu.mapsdkplatform.comapi.commonutils.b.a().a("EngineMeassage IndoorMap msg.what = " + message.what + "; msg.arg1 = " + message.arg1);
                }
                MapController mapController6 = MapController.this;
                EngineMsgListener engineMsgListener = mapController6.f9455b0;
                if (engineMsgListener != null) {
                    int i18 = message.arg1;
                    if (i18 == 1) {
                        MapController.this.f9455b0.onEnterIndoorMapMode(mapController6.getFocusedBaseIndoorMapInfo());
                    } else if (i18 == 0) {
                        engineMsgListener.onExitIndoorMapMode();
                    }
                }
                MapController mapController7 = MapController.this;
                if (mapController7.mListeners == null) {
                    return;
                }
                IndoorMapInfo focusedBaseIndoorMapInfo = mapController7.getFocusedBaseIndoorMapInfo();
                for (int i19 = 0; i19 < MapController.this.mListeners.size(); i19++) {
                    w wVar7 = MapController.this.mListeners.get(i19);
                    if (wVar7 != null) {
                        int i20 = message.arg1;
                        if (i20 == 0) {
                            wVar7.a(false);
                            MapController.this.mMaxZoomLevel = 22.0f;
                        } else if (i20 == 1) {
                            if (MapController.this.getMapStatus().level < 18.0f || focusedBaseIndoorMapInfo == null) {
                                wVar7.a(false);
                                MapController.this.mMaxZoomLevel = 22.0f;
                            } else {
                                wVar7.a(true);
                                MapController.this.mMaxZoomLevel = 22.0f;
                            }
                        }
                    }
                }
            }
            if (message.what == 51) {
                MapController.this.setNetStatus(message.arg1);
            }
            if (message.what == 65301) {
                MapController mapController8 = MapController.this;
                if (mapController8.f9455b0 != null) {
                    int i21 = message.arg1;
                    if (i21 == 1) {
                        mapController8.getMapBarData();
                    } else if (i21 == 0) {
                        com.baidu.platform.comapi.util.a.a().a(new com.baidu.platform.comapi.map.a());
                    }
                }
            }
        }
    }

    public MapController() {
        this.f9480x = null;
        this.f9480x = new b();
        b();
    }

    public static native int CleanAfterDBClick(long j8, float f8, float f9);

    public static int GetAdaptKeyCode(int i8) {
        switch (i8) {
            case 19:
                return 17;
            case 20:
                return 19;
            case 21:
                return 16;
            case 22:
                return 18;
            default:
                return 0;
        }
    }

    public static native int MapProc(long j8, int i8, int i9, int i10, int i11, int i12, double d8, double d9, double d10, double d11);

    private boolean a() {
        return this.C && this.f9478v != null;
    }

    private void c() {
        this.G = false;
        this.M = 0.0f;
        this.K = -1.0f;
        this.L = -1.0f;
    }

    public static int getScaleDis(int i8) {
        switch (i8) {
            case 1:
                return 10000000;
            case 2:
                return GmsVersion.VERSION_LONGHORN;
            case 3:
                return 2000000;
            case 4:
                return 1000000;
            case 5:
                return 500000;
            case 6:
                return 200000;
            case 7:
                return AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND;
            case 8:
                return 50000;
            case 9:
                return 25000;
            case 10:
                return 20000;
            case 11:
                return 10000;
            case 12:
                return 5000;
            case 13:
                return 2000;
            case 14:
                return 1000;
            case 15:
                return 500;
            case 16:
                return 200;
            case 17:
                return 100;
            case 18:
                return 50;
            case 19:
                return 20;
            case 20:
                return 10;
            case 21:
                return 5;
            case 22:
                return 2;
            default:
                return 0;
        }
    }

    public float GetFZoomToBoundF(Bundle bundle, Bundle bundle2) {
        if (a()) {
            return this.f9478v.GetFZoomToBoundF(bundle, bundle2);
        }
        return 0.0f;
    }

    public int MapMsgProc(int i8, int i9, int i10) {
        return MapMsgProc(i8, i9, i10, 0, 0, com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, com.github.mikephil.charting.utils.i.DOUBLE_EPSILON);
    }

    public void SetStyleMode(int i8) {
        setMapScene(i8);
    }

    public void addOneOverlayItem(Bundle bundle) {
        this.f9478v.addOneOverlayItem(bundle);
    }

    public void addStreetCustomMarker(Bundle bundle, Bitmap bitmap) {
        if (a()) {
            this.f9478v.AddStreetCustomMarker(bundle, bitmap);
        }
    }

    public void animateTo(GeoPoint geoPoint, int i8) {
        if (a()) {
            MapStatus mapStatus = getMapStatus();
            mapStatus.centerPtX = geoPoint.getLongitude();
            mapStatus.centerPtY = geoPoint.getLatitude();
            setMapStatusWithAnimation(mapStatus, i8);
        }
    }

    public boolean cleanCache(MapLayerType mapLayerType) {
        AppBaseMap appBaseMap = this.f9478v;
        return appBaseMap != null && appBaseMap.cleanCache(mapLayerType.f9488b, false);
    }

    public void clearUniversalLayer() {
        if (a()) {
            this.f9478v.clearUniversalLayer();
        }
    }

    public boolean createByDuplicateAppBaseMap(long j8) {
        AppBaseMap appBaseMap = new AppBaseMap();
        this.f9478v = appBaseMap;
        if (!appBaseMap.CreateByDuplicate(j8)) {
            this.f9478v = null;
            this.f9479w = 0L;
            return false;
        }
        this.f9462h0 = true;
        this.f9479w = this.f9478v.GetId();
        List<AppBaseMap> list = f9453g;
        if (list != null) {
            list.add(this.f9478v);
        }
        return true;
    }

    public void enablePOIAnimation(boolean z7) {
        if (a()) {
            this.f9478v.enablePOIAnimation(z7);
        }
    }

    public void forceSetMapScene(int i8) {
        this.f9468l = i8;
        if (a()) {
            this.f9478v.setMapScene(this.f9468l);
        }
    }

    public boolean forceSetMapThemeScene(int i8, int i9, Bundle bundle) {
        this.f9469m = i8;
        this.f9468l = i9;
        if (a()) {
            return this.f9478v.setMapThemeScene(i8, i9, bundle);
        }
        return false;
    }

    public float getAdapterZoomUnitsEx() {
        if (a()) {
            return this.f9478v.GetAdapterZoomUnitsEx();
        }
        return 0.0f;
    }

    public AppBaseMap getBaseMap() {
        return this.f9478v;
    }

    public int getCacheSize(MapLayerType mapLayerType) {
        AppBaseMap appBaseMap = this.f9478v;
        if (appBaseMap == null) {
            return 0;
        }
        return appBaseMap.GetCacheSize(mapLayerType.f9488b);
    }

    public CaptureMapListener getCaptureMapListener() {
        return this.X;
    }

    public String getCityInfoByID(int i8) {
        AppBaseMap appBaseMap = this.f9478v;
        if (appBaseMap != null) {
            return appBaseMap.GetCityInfoByID(i8);
        }
        return null;
    }

    public MapStatus getCurrentMapStatus() {
        return a(false);
    }

    public float getCurrentZoomLevel() {
        Bundle GetMapStatus;
        AppBaseMap appBaseMap = this.f9478v;
        if (appBaseMap == null || (GetMapStatus = appBaseMap.GetMapStatus(false)) == null) {
            return 4.0f;
        }
        return (float) GetMapStatus.getDouble("level");
    }

    public IndoorMapInfo getFocusedBaseIndoorMapInfo() {
        String[] strArr;
        int[] iArr;
        if (!a()) {
            return null;
        }
        String GetFocusedBaseIndoorMapInfo = this.f9478v.GetFocusedBaseIndoorMapInfo();
        if (!TextUtils.isEmpty(GetFocusedBaseIndoorMapInfo)) {
            try {
                JSONObject jSONObject = new JSONObject(GetFocusedBaseIndoorMapInfo);
                String optString = jSONObject.optString("focusindoorid");
                String optString2 = jSONObject.optString("curfloor");
                int optInt = jSONObject.optInt("idrtype");
                JSONArray optJSONArray = jSONObject.optJSONArray("floorlist");
                if (optJSONArray != null) {
                    strArr = new String[optJSONArray.length()];
                    ArrayList arrayList = new ArrayList();
                    for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                        arrayList.add(optJSONArray.getString(i8));
                    }
                    arrayList.toArray(strArr);
                } else {
                    strArr = null;
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("floorattribute");
                if (optJSONArray2 != null) {
                    iArr = new int[optJSONArray2.length()];
                    for (int i9 = 0; i9 < optJSONArray2.length(); i9++) {
                        iArr[i9] = optJSONArray2.optInt(i9);
                    }
                } else {
                    iArr = null;
                }
                return new IndoorMapInfo(optString, optString2, strArr, iArr, optInt, jSONObject.optInt("idrguide"), jSONObject.optString("idrsearch"));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public com.baidu.platform.comapi.map.d0.c getGestureMonitor() {
        if (this.f9461h == null) {
            this.f9461h = new com.baidu.platform.comapi.map.d0.c(this);
        }
        return this.f9461h;
    }

    public Bundle getGestureOptInfoForLog() {
        Bundle bundle = null;
        if (!this.E.f9496a) {
            return null;
        }
        MapStatus mapStatus = getMapStatus();
        int intX = this.E.f9499d.getIntX();
        int intY = this.E.f9499d.getIntY();
        boolean z7 = false;
        boolean z8 = Math.sqrt((double) ((intX * intX) + (intY * intY))) > 100.0d;
        if (this.E.f9497b > 0.0f && Math.abs(mapStatus.level - r3) >= 0.5d) {
            z7 = true;
        }
        if (z8 || z7) {
            bundle = new Bundle();
            bundle.putDouble("pre_x", this.E.f9498c.getLongitude());
            bundle.putDouble("pre_y", this.E.f9498c.getLatitude());
            bundle.putFloat("pre_level", this.E.f9497b);
        }
        this.E.a();
        return bundle;
    }

    public h getHideIndoorPopupListener() {
        return this.Y;
    }

    public EngineMsgListener getIndoorMapListener() {
        return this.f9455b0;
    }

    public LatLng getLatLngGesturesCenter() {
        return this.f9474r;
    }

    public List<w> getListeners() {
        return this.mListeners;
    }

    public boolean getMapBarData() {
        if (!a()) {
            return false;
        }
        Bundle bundle = new Bundle();
        this.f9478v.getMapBarData(bundle);
        byte[] bArr = new byte[0];
        String string = bundle.containsKey("uid") ? bundle.getString("uid") : null;
        String string2 = bundle.containsKey("searchbound") ? bundle.getString("searchbound") : null;
        String string3 = bundle.containsKey("curfloor") ? bundle.getString("curfloor") : null;
        if (bundle.containsKey("barinfo")) {
            bArr = bundle.getByteArray("barinfo");
        }
        com.baidu.platform.comapi.util.a.a().a(new com.baidu.platform.comapi.map.b(string, string2, string3, bArr));
        return true;
    }

    public boolean getMapBarShowData() {
        if (!a()) {
            return false;
        }
        return this.f9478v.getMapBarData(new Bundle());
    }

    public boolean getMapClickEnable() {
        return this.A;
    }

    public MapControlMode getMapControlMode() {
        return this.f9466j0;
    }

    public long getMapId() {
        return this.f9479w;
    }

    public MapRenderModeChangeListener getMapRenderModeChangeListener() {
        return this.f9454a0;
    }

    public int getMapScene() {
        if (a()) {
            return this.f9478v.getMapScene();
        }
        return 0;
    }

    public MapStatus getMapStatus() {
        return a(true);
    }

    public com.baidu.mapsdkplatform.comapi.map.s getMapStatusInner() {
        if (!a()) {
            return null;
        }
        Bundle GetMapStatus = this.f9478v.GetMapStatus();
        com.baidu.mapsdkplatform.comapi.map.s sVar = new com.baidu.mapsdkplatform.comapi.map.s();
        sVar.a(GetMapStatus);
        return sVar;
    }

    public int getMapTheme() {
        if (a()) {
            return this.f9478v.getMapTheme();
        }
        return 0;
    }

    public MapViewInterface getMapView() {
        SoftReference<MapViewInterface> softReference = this.f9457d0;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public MapViewListener getMapViewListener() {
        return this.W;
    }

    public MapViewSurfaceListener getMapViewSurfaceListener() {
        return this.f9456c0;
    }

    public NaviMapViewListener getNaviMapViewListener() {
        return this.f9458e0;
    }

    public Point getPointGesturesCenter() {
        return this.f9473q;
    }

    public String getProjectionPt(String str) {
        if (a()) {
            return this.f9478v.getProjectionPt(str);
        }
        return null;
    }

    public int getScaleLevel(int i8, int i9) {
        if (a()) {
            return this.f9478v.getScaleLevel(i8, i9);
        }
        return 0;
    }

    public int getSceneLayerScene() {
        return this.f9468l;
    }

    public int getSceneLayerTheme() {
        return this.f9469m;
    }

    public int getScreenHeight() {
        MapStatus.WinRound winRound = getMapStatus().winRound;
        int i8 = winRound.bottom - winRound.top;
        this.f9482z = i8;
        return i8;
    }

    public int getScreenWidth() {
        MapStatus.WinRound winRound = getMapStatus().winRound;
        int i8 = winRound.right - winRound.left;
        this.f9481y = i8;
        return i8;
    }

    public z getStreetArrowClickListener() {
        return this.Z;
    }

    public int getVMPMapCityCode() {
        if (this.f9478v == null) {
            return 0;
        }
        Bundle bundle = new Bundle();
        bundle.putString("querytype", "map");
        this.f9478v.GetVMPMapCityInfo(bundle);
        return bundle.getInt("code");
    }

    public int getVMPMapCityItsInfo() {
        if (this.f9478v == null) {
            return 0;
        }
        Bundle bundle = new Bundle();
        bundle.putString("querytype", "its");
        this.f9478v.GetVMPMapCityInfo(bundle);
        return bundle.getInt("rst");
    }

    public int getVMPMapCityLevel() {
        if (this.f9478v == null) {
            return 0;
        }
        Bundle bundle = new Bundle();
        bundle.putString("querytype", "map");
        this.f9478v.GetVMPMapCityInfo(bundle);
        return bundle.getInt("level");
    }

    public int getVMPMapCitySatInfo() {
        if (this.f9478v == null) {
            return 0;
        }
        Bundle bundle = new Bundle();
        bundle.putString("querytype", LocalePreferences.FirstDayOfWeek.SATURDAY);
        this.f9478v.GetVMPMapCityInfo(bundle);
        return bundle.getInt("rst");
    }

    public float getZoomLevel() {
        Bundle GetMapStatus;
        AppBaseMap appBaseMap = this.f9478v;
        if (appBaseMap == null || (GetMapStatus = appBaseMap.GetMapStatus()) == null) {
            return 4.0f;
        }
        return (float) GetMapStatus.getDouble("level");
    }

    public float getZoomToBound(Bundle bundle, int i8, int i9) {
        if (a()) {
            return this.f9478v.GetZoomToBound(bundle, i8, i9);
        }
        return 0.0f;
    }

    public float getZoomToBoundF(Bundle bundle) {
        if (a()) {
            return this.f9478v.GetZoomToBoundF(bundle);
        }
        return 0.0f;
    }

    public double getZoomUnitsInMeter() {
        Bundle GetMapStatus;
        AppBaseMap baseMap = getBaseMap();
        if (baseMap != null && (GetMapStatus = baseMap.GetMapStatus()) != null) {
            double d8 = GetMapStatus.getFloat("adapterZoomUnits");
            if (d8 > 1.0E-4d) {
                return d8;
            }
        }
        return Math.pow(2.0d, 18.0f - getZoomLevel());
    }

    public void handleClick(MotionEvent motionEvent) {
        MapMsgProc(UIMsg.KEvent.V_WM_LBUTTONCLICK, 0, ((int) motionEvent.getX()) | (((int) motionEvent.getY()) << 16));
    }

    public void handleDoubleClickZoom(MotionEvent motionEvent) {
        if (this.H && System.currentTimeMillis() - this.N >= 100) {
            mapStatusChangeStart();
            this.mIsAnimating = true;
            float y7 = motionEvent.getY();
            float f8 = this.L - y7;
            MapMsgProc(8193, 3, (int) ((f8 / (getScreenHeight() / 9.0f)) * 10000.0f));
            this.M = f8;
            this.L = y7;
            com.baidu.platform.comapi.util.a.a().a(new com.baidu.platform.comapi.map.c0.d());
            if (!isNaviMode() || getNaviMapViewListener() == null) {
                return;
            }
            getNaviMapViewListener().onAction(521, null);
        }
    }

    public void handleDoubleDownClick(MotionEvent motionEvent) {
        this.G = true;
        this.K = motionEvent.getX();
        this.L = motionEvent.getY();
        this.N = System.currentTimeMillis();
        com.baidu.platform.comapi.util.a.a().a(new com.baidu.platform.comapi.map.c0.d());
    }

    public void handleDoubleTouch(MotionEvent motionEvent) {
        SoftReference<MapViewInterface> softReference;
        GeoPoint fromPixels;
        float f8;
        NaviMapViewListener naviMapViewListener;
        if (System.currentTimeMillis() - this.N > 150) {
            return;
        }
        if (isNaviMode() && (naviMapViewListener = this.f9458e0) != null) {
            naviMapViewListener.onAction(513, motionEvent);
            return;
        }
        if (!this.F || (softReference = this.f9457d0) == null || softReference.get() == null || this.f9457d0.get().getProjection() == null) {
            return;
        }
        MapStatus mapStatus = getMapStatus();
        float x7 = motionEvent.getX() - (mapStatus.winRound.left + (getScreenWidth() / 2));
        float y7 = (motionEvent.getY() - (mapStatus.winRound.top + (getScreenHeight() / 2))) * (-1.0f);
        float f9 = 0.0f;
        if (isCompass || this.J) {
            fromPixels = this.f9457d0.get().getProjection().fromPixels(mapStatus.winRound.left + (getScreenWidth() / 2), mapStatus.winRound.top + (getScreenHeight() / 2));
            x7 = 0.0f;
            y7 = 0.0f;
        } else if (this.f9473q == null || !this.f9475s) {
            LatLng latLng = this.f9474r;
            fromPixels = (latLng == null || !this.f9475s) ? this.f9457d0.get().getProjection().fromPixels((int) motionEvent.getX(), (int) motionEvent.getY()) : CoordUtil.ll2mc(latLng);
        } else {
            Projection projection = this.f9457d0.get().getProjection();
            Point point = this.f9473q;
            fromPixels = projection.fromPixels(point.x, point.y);
        }
        if (fromPixels != null) {
            f9 = (float) fromPixels.getLongitudeE6();
            f8 = (float) fromPixels.getLatitudeE6();
        } else {
            f8 = 0.0f;
        }
        this.P = true;
        Point point2 = new Point((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        if (fromPixels != null && this.mListeners != null) {
            for (int i8 = 0; i8 < this.mListeners.size(); i8++) {
                w wVar = this.mListeners.get(i8);
                if (wVar != null) {
                    wVar.b(fromPixels);
                    if (wVar.a(point2, getMapStatusInner())) {
                        return;
                    }
                }
            }
        }
        getGestureMonitor().a(this.f9457d0.get().getZoomLevel() + 1.0f);
        mapStatusChangeStart();
        MapMsgProc(8195, ((int) motionEvent.getX()) | (((int) motionEvent.getY()) << 16), (this.f9481y / 2) | ((this.f9482z / 2) << 16), 0, 0, f9, f8, x7, y7);
        f9452f = System.currentTimeMillis();
        procGestureForLog(false, null);
    }

    @SuppressLint({"FloatMath"})
    public boolean handleFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
        if (!f9448b || !this.U || !this.f9465j) {
            return false;
        }
        float sqrt = (float) ((((float) Math.sqrt((f8 * f8) + (f9 * f9))) / (SysOSUtil.getInstance().getDensityDPI() / 310.0f)) * 1.3d);
        if (getMapControlMode() != MapControlMode.STREET && sqrt < 300.0f) {
            this.B = false;
            return false;
        }
        this.B = true;
        if (this.mListeners != null) {
            com.baidu.mapsdkplatform.comapi.map.s mapStatusInner = getMapStatusInner();
            for (int i8 = 0; i8 < this.mListeners.size(); i8++) {
                w wVar = this.mListeners.get(i8);
                if (wVar != null && wVar.a(motionEvent2, f8, f9, mapStatusInner)) {
                    this.f9460g0 = false;
                    return false;
                }
            }
        }
        getGestureMonitor().a();
        mapStatusChangeStart();
        MapMsgProc(34, (int) sqrt, (((int) motionEvent2.getY()) << 16) | ((int) motionEvent2.getX()));
        if (getMapViewListener() != null) {
            com.baidu.platform.comapi.util.a.a().a(new com.baidu.platform.comapi.map.c0.c());
        }
        this.f9460g0 = false;
        if (this.mListeners != null) {
            for (int i9 = 0; i9 < this.mListeners.size(); i9++) {
                w wVar2 = this.mListeners.get(i9);
                if (wVar2 != null) {
                    wVar2.a(motionEvent2);
                }
            }
        }
        return true;
    }

    public boolean handleKeyEvent(int i8, KeyEvent keyEvent) {
        int GetAdaptKeyCode = GetAdaptKeyCode(i8);
        if (GetAdaptKeyCode == 0) {
            return false;
        }
        MapMsgProc(1, GetAdaptKeyCode, 0);
        return true;
    }

    public void handleLongClick(MotionEvent motionEvent) {
        MapMsgProc(UIMsg.KEvent.V_WM_LBUTTONLONGCLICK, 0, ((int) motionEvent.getX()) | (((int) motionEvent.getY()) << 16));
    }

    public int handleMapModeGet() {
        return MapMsgProc(4113, 0, 0);
    }

    public boolean handlePopupClick(int i8, int i9) {
        return false;
    }

    public void handleRightClick() {
        MapMsgProc(UIMsg.KEvent.V_WM_RBUTTONCLICK, 0, 0);
    }

    public void handleStreetscapeDoubleTouch(MotionEvent motionEvent) {
        float f8;
        float f9;
        SoftReference<MapViewInterface> softReference = this.f9457d0;
        if (softReference == null || softReference.get() == null || this.f9457d0.get().getProjection() == null) {
            return;
        }
        MapStatus mapStatus = getMapStatus();
        Projection projection = this.f9457d0.get().getProjection();
        MapStatus.WinRound winRound = mapStatus.winRound;
        GeoPoint fromPixels = projection.fromPixels(winRound.left + (this.f9481y / 2), winRound.top + (this.f9482z / 2));
        if (fromPixels != null) {
            f8 = (float) fromPixels.getLongitudeE6();
            f9 = (float) fromPixels.getLatitudeE6();
        } else {
            f8 = 0.0f;
            f9 = 0.0f;
        }
        MapMsgProc(8195, (((int) motionEvent.getY()) << 16) | ((int) motionEvent.getX()), ((this.f9482z / 2) << 16) | (this.f9481y / 2), 0, 0, f8, f9, com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, com.github.mikephil.charting.utils.i.DOUBLE_EPSILON);
    }

    public boolean handleTouchEvent(MotionEvent motionEvent) {
        if (!a()) {
            return false;
        }
        if (!this.B) {
            this.f9464i0.a(motionEvent);
        }
        if (motionEvent.getPointerCount() == 2) {
            this.f9463i = true;
            f9448b = false;
            c();
            procGestureForLog(false, null);
        }
        if (motionEvent.getAction() != 2 && this.G) {
            this.f9463i = true;
            c();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f9463i = true;
            a(motionEvent);
        } else if (action == 1) {
            f9448b = true;
            this.f9463i = true;
            handleTouchUp(motionEvent);
        } else {
            if (action != 2) {
                return false;
            }
            if (this.G) {
                handleDoubleClickZoom(motionEvent);
            } else if (this.U) {
                handleTouchMove(motionEvent);
            }
        }
        if (this.mListeners != null) {
            for (int i8 = 0; i8 < this.mListeners.size(); i8++) {
                w wVar = this.mListeners.get(i8);
                if (wVar != null) {
                    wVar.a(motionEvent);
                }
            }
        }
        return true;
    }

    public boolean handleTouchMove(MotionEvent motionEvent) {
        if (!f9448b || System.currentTimeMillis() - f9452f < 300) {
            return true;
        }
        int i8 = 0;
        if (this.mHasMapObjDraging) {
            if (getMapView() != null && getMapView().getProjection() != null) {
                GeoPoint fromPixels = getMapView().getProjection().fromPixels((int) motionEvent.getX(), (int) motionEvent.getY());
                if (this.mListeners != null) {
                    while (i8 < this.mListeners.size()) {
                        w wVar = this.mListeners.get(i8);
                        if (wVar != null && fromPixels != null) {
                            wVar.d(fromPixels);
                        }
                        i8++;
                    }
                }
            }
            return true;
        }
        if (this.mHasBmDrawItemDraging) {
            if (getMapView() != null && getMapView().getProjection() != null) {
                GeoPoint fromPixels2 = getMapView().getProjection().fromPixels((int) motionEvent.getX(), (int) motionEvent.getY());
                if (this.mListeners != null) {
                    while (i8 < this.mListeners.size()) {
                        w wVar2 = this.mListeners.get(i8);
                        if (wVar2 != null && fromPixels2 != null) {
                            wVar2.a(fromPixels2);
                        }
                        i8++;
                    }
                }
            }
            return true;
        }
        float abs = Math.abs(motionEvent.getX() - f9449c);
        float abs2 = Math.abs(motionEvent.getY() - f9450d);
        double density = SysOSUtil.getInstance().getDensity();
        if (density > 1.5d) {
            density *= 1.5d;
        }
        float f8 = (float) density;
        if (f9451e && abs / f8 <= 3.0f && abs2 / f8 <= 3.0f) {
            return true;
        }
        f9451e = false;
        if (isCompass) {
            com.baidu.platform.comapi.util.a.a().a(new com.baidu.platform.comapi.map.c0.a());
        }
        procGestureForLog(true, new com.baidu.platform.comapi.basestruct.Point(abs, abs2));
        int x7 = (int) motionEvent.getX();
        int y7 = (int) motionEvent.getY();
        float x8 = f9449c - motionEvent.getX();
        float y8 = f9450d - motionEvent.getY();
        Point point = new Point((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        Point point2 = new Point((int) (motionEvent.getRawX() + x8), (int) (motionEvent.getRawY() + y8));
        if (x7 < 0) {
            x7 = 0;
        }
        if (y7 < 0) {
            y7 = 0;
        }
        if (this.mListeners != null) {
            com.baidu.mapsdkplatform.comapi.map.s mapStatusInner = getMapStatusInner();
            for (int i9 = 0; i9 < this.mListeners.size(); i9++) {
                w wVar3 = this.mListeners.get(i9);
                if (wVar3 != null && wVar3.c(point2, point, mapStatusInner)) {
                    this.B = false;
                    this.f9472p = true;
                    this.f9460g0 = true;
                    return false;
                }
            }
        }
        if (this.f9463i) {
            getGestureMonitor().d();
            this.f9463i = false;
        }
        mapStatusChangeStart();
        MapMsgProc(3, 0, (y7 << 16) | x7);
        com.baidu.platform.comapi.util.a.a().a(new com.baidu.platform.comapi.map.c0.b(false, true));
        this.B = false;
        this.f9472p = true;
        this.f9460g0 = true;
        return false;
    }

    public boolean handleTouchSingleClick(MotionEvent motionEvent) {
        NaviMapViewListener naviMapViewListener;
        int x7 = (int) motionEvent.getX();
        int y7 = (int) motionEvent.getY();
        if (b(x7, y7) || handlePopupClick(x7, y7)) {
            return true;
        }
        if (OverlayUtil.isOverlayUpgrade() && a(x7, y7, this.f9477u)) {
            return true;
        }
        this.f9477u = c(x7, y7);
        if (a(1, x7, y7)) {
            return true;
        }
        if (this.A && a(x7, y7)) {
            return true;
        }
        if (isNaviMode() && (naviMapViewListener = this.f9458e0) != null) {
            naviMapViewListener.onAction(514, motionEvent);
        }
        if (getMapViewListener() == null) {
            return false;
        }
        getMapViewListener().onClickedBackground((int) motionEvent.getX(), (int) motionEvent.getY());
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0113, code lost:
    
        if (r7.f9460g0 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x010f, code lost:
    
        if (r8 >= r7.mMinZoomLevel) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0117, code lost:
    
        if (r7.P != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x011b, code lost:
    
        if (r7.Q != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x011f, code lost:
    
        if (r7.mIsAnimating != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0123, code lost:
    
        if (r7.mListeners == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0125, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x012c, code lost:
    
        if (r8 >= r7.mListeners.size()) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x012e, code lost:
    
        r1 = r7.mListeners.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0136, code lost:
    
        if (r1 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0138, code lost:
    
        r1.b(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x013b, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x013e, code lost:
    
        r7.mIsMoving = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean handleTouchUp(MotionEvent motionEvent) {
        int x7 = (int) motionEvent.getX();
        int y7 = (int) motionEvent.getY();
        if (x7 < 0) {
            x7 = 0;
        }
        if (y7 < 0) {
            y7 = 0;
        }
        if (this.mHasMapObjDraging) {
            if (this.mListeners != null && getMapView() != null && getMapView().getProjection() != null) {
                GeoPoint fromPixels = getMapView().getProjection().fromPixels(x7, y7);
                for (int i8 = 0; i8 < this.mListeners.size(); i8++) {
                    w wVar = this.mListeners.get(i8);
                    if (wVar != null && fromPixels != null) {
                        wVar.e(fromPixels);
                    }
                }
            }
            this.mHasMapObjDraging = false;
            return true;
        }
        if (this.mHasBmDrawItemDraging) {
            if (this.mListeners != null && getMapView() != null && getMapView().getProjection() != null) {
                GeoPoint fromPixels2 = getMapView().getProjection().fromPixels(x7, y7);
                for (int i9 = 0; i9 < this.mListeners.size(); i9++) {
                    w wVar2 = this.mListeners.get(i9);
                    if (wVar2 != null && fromPixels2 != null) {
                        wVar2.c(fromPixels2);
                    }
                }
            }
            this.mHasBmDrawItemDraging = false;
            return true;
        }
        if (f9448b) {
            MapMsgProc(5, 0, x7 | (y7 << 16));
        }
        if (!this.B && getMapViewListener() != null) {
            getMapViewListener().onMapAnimationFinish();
        }
        if (!this.B && isNaviMode() && getNaviMapViewListener() != null) {
            getNaviMapViewListener().onMapAnimationFinish();
        }
        boolean z7 = motionEvent.getEventTime() - this.f9459f0 < 300 && Math.abs(motionEvent.getX() - f9449c) < 10.0f && Math.abs(motionEvent.getY() - f9450d) < 10.0f;
        com.baidu.mapsdkplatform.comapi.map.s mapStatusInner = getMapStatusInner();
        if (!this.B) {
            if (!z7) {
                float f8 = mapStatusInner.f8148a;
                if (f8 < this.mMaxZoomLevel) {
                }
            }
        }
        this.f9460g0 = false;
        this.B = false;
        com.baidu.platform.comapi.util.a.a().a(new com.baidu.platform.comapi.map.c0.b(true, false));
        com.baidu.platform.comapi.util.a.a().a(new com.baidu.platform.comapi.map.c0.c());
        return true;
    }

    public boolean handleTrackballEvent(MotionEvent motionEvent) {
        if (!a()) {
            return false;
        }
        if (motionEvent.getAction() == 2) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            int i8 = rawX > 0.0f ? 18 : rawX < 0.0f ? 16 : 0;
            if (rawY > 0.0f) {
                i8 = 19;
            } else if (rawY < 0.0f) {
                i8 = 17;
            }
            if (i8 == 0) {
                return false;
            }
            MapMsgProc(1, i8, 0);
        }
        return true;
    }

    public boolean handleZoomTo(int i8) {
        if (i8 == 0) {
            MapMsgProc(4097, -1, 0);
        } else if (i8 == 1) {
            MapMsgProc(4096, -1, 0);
        }
        return false;
    }

    public boolean importMapTheme(int i8) {
        if (a()) {
            return this.f9478v.importMapTheme(i8);
        }
        return false;
    }

    public void initAppBaseMap() {
        if (f9453g.size() == 0) {
            initBaseMap();
        } else {
            createByDuplicateAppBaseMap(f9453g.get(0).GetId());
        }
    }

    public void initBaseMap() {
        AppBaseMap appBaseMap = new AppBaseMap();
        this.f9478v = appBaseMap;
        appBaseMap.Create();
        this.f9479w = this.f9478v.GetId();
        List<AppBaseMap> list = f9453g;
        if (list != null) {
            list.add(this.f9478v);
        }
    }

    public void initMapResources(Bundle bundle) {
        if (this.C || bundle == null || this.f9478v == null) {
            return;
        }
        boolean z7 = SysOSUtil.getInstance().getDensityDPI() >= 180;
        this.nearlyRadius = (SysOSUtil.getInstance().getDensityDPI() * 25) / 240;
        String string = bundle.getString("modulePath");
        String string2 = bundle.getString("appSdcardPath");
        String string3 = bundle.getString("appCachePath");
        String string4 = bundle.getString("appSecondCachePath");
        String string5 = bundle.getString("engineErrorPath");
        int i8 = bundle.getInt("mapTmpMax");
        int i9 = bundle.getInt("domTmpMax");
        int i10 = bundle.getInt("itsTmpMax");
        int i11 = bundle.getInt("ssgTmpMax");
        String str = z7 ? "/h/" : "/l/";
        String str2 = string + "/cfg";
        String str3 = string2 + "/vmp";
        String str4 = str2 + "/a/";
        String str5 = str3 + str;
        String str6 = str3 + str;
        String str7 = string3 + "/tmp/";
        String str8 = string4 + "/tmp/";
        Bundle bundle2 = new Bundle();
        bundle2.putString("cfgdataroot", str4);
        bundle2.putString("vmpdataroot", str5);
        bundle2.putString("tmpdataroot", str7);
        bundle2.putString("tmpdatapast", str8);
        bundle2.putString("importroot", str6);
        bundle2.putString("stylerespath", str2 + "/a/");
        if (string5 != null && string5.length() > 0) {
            bundle2.putString("engineerrorpath", string5);
        }
        if (this.f9481y <= 0 || this.f9482z <= 0) {
            this.f9481y = SysOSUtil.getInstance().getScreenWidth();
            this.f9482z = SysOSUtil.getInstance().getScreenWidth();
        }
        if (OpenLogUtil.isMapLogEnable()) {
            com.baidu.mapsdkplatform.comapi.commonutils.b.a().a("MapControl init screenWidth: " + this.f9481y + "; screenHeight: " + this.f9482z);
        }
        bundle2.putInt("cx", this.f9481y);
        bundle2.putInt("cy", this.f9482z);
        bundle2.putInt("ndpi", SysOSUtil.getInstance().getDensityDPI());
        bundle2.putFloat("fdpi", SysOSUtil.getInstance().getDensityDPI());
        bundle2.putInt("maptmpmax", i8);
        bundle2.putInt("domtmpmax", i9);
        bundle2.putInt("itstmpmax", i10);
        bundle2.putInt("ssgtmpmax", i11);
        bundle2.putInt("pathchange", 0);
        if (bundle.containsKey("maptheme")) {
            bundle2.putInt("maptheme", bundle.getInt("maptheme"));
        }
        if (bundle.containsKey("mapscene")) {
            bundle2.putInt("mapscene", bundle.getInt("mapscene"));
        }
        if (bundle.containsKey("fontsizelevel")) {
            bundle2.putInt("fontsizelevel", bundle.getInt("fontsizelevel"));
        }
        if (!JNIInitializer.isUserTest()) {
            JNIInitializer.isDebug();
        }
        if (this.f9478v.initWithOptions(bundle2, false)) {
            this.f9478v.SetMapStatus(bundle);
            this.C = true;
            return;
        }
        Log.e(f9447a, "MapControl init fail!");
        if (OpenLogUtil.isMapLogEnable()) {
            com.baidu.mapsdkplatform.comapi.commonutils.b.a().a("MapControl init fail");
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ExifInterface.LONGITUDE_EAST, "0");
        SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "M", "0.2", hashMap);
    }

    public boolean is3DGestureEnable() {
        return this.R;
    }

    public boolean isBaseIndoorMapMode() {
        if (a()) {
            return this.f9478v.IsBaseIndoorMapMode();
        }
        return false;
    }

    public boolean isCanTouchMove() {
        return this.U;
    }

    public boolean isDoubleClickMoveZoom() {
        return this.H;
    }

    public boolean isDoubleClickZoom() {
        return this.F;
    }

    public boolean isDuplicate() {
        return this.f9462h0;
    }

    public boolean isEnableDMoveZoom() {
        return this.G;
    }

    public boolean isEnableIndoor3D() {
        if (a()) {
            return this.f9478v.isEnableIndoor3D();
        }
        return true;
    }

    public boolean isEnableZoom() {
        return this.T;
    }

    public boolean isEnlargeCenterWithDoubleClickEnabled() {
        return this.J;
    }

    public boolean isFlingEnabled() {
        return this.f9465j;
    }

    public boolean isInFocusBarBorder(GeoPoint geoPoint, double d8) {
        return a() && geoPoint != null && this.f9478v.IsPointInFocusBarBorder(geoPoint.getLongitude(), geoPoint.getLatitude(), d8);
    }

    public boolean isInFocusIndoorBuilding(GeoPoint geoPoint) {
        return a() && geoPoint != null && this.f9478v.IsPointInFocusIDRBorder(geoPoint.getLongitude(), geoPoint.getLatitude());
    }

    public boolean isMapAnimationRunning() {
        if (a()) {
            return this.f9478v.isAnimationRunning();
        }
        return false;
    }

    public boolean isMovedMap() {
        return this.f9472p;
    }

    public boolean isNaviMode() {
        if (a()) {
            return this.f9478v.isNaviMode();
        }
        return false;
    }

    public boolean isOverlookGestureEnable() {
        return this.S;
    }

    public boolean isPressedOnPopup(int i8, int i9) {
        return false;
    }

    public boolean isSetBackgroundDraw() {
        AppBaseMap appBaseMap = this.f9478v;
        if (appBaseMap == null) {
            return false;
        }
        return appBaseMap.isSupBackgroundDraw();
    }

    public boolean isStreetArrowShown() {
        if (a()) {
            return this.f9478v.IsStreetArrowShown();
        }
        return false;
    }

    public boolean isStreetCustomMarkerShown() {
        if (a()) {
            return this.f9478v.IsStreetCustomMarkerShown();
        }
        return false;
    }

    public boolean isStreetPOIMarkerShown() {
        if (a()) {
            return this.f9478v.IsStreetPOIMarkerShown();
        }
        return false;
    }

    public boolean isStreetRoadClickable() {
        if (a()) {
            return this.f9478v.IsStreetRoadClickable();
        }
        return false;
    }

    public boolean isTwoTouchClickZoomEnabled() {
        return this.I;
    }

    public void mapStatusChangeStart() {
        if (this.mIsMoving) {
            return;
        }
        this.mIsMoving = true;
        this.mIsAnimating = false;
        if (this.mListeners != null) {
            com.baidu.mapsdkplatform.comapi.map.s mapStatusInner = getMapStatusInner();
            for (int i8 = 0; i8 < this.mListeners.size(); i8++) {
                w wVar = this.mListeners.get(i8);
                if (wVar != null) {
                    wVar.c(mapStatusInner);
                }
            }
        }
    }

    public void onPause() {
        if (a()) {
            this.f9478v.OnPause();
        }
    }

    public void onResume() {
        if (a()) {
            this.f9478v.OnResume();
        }
    }

    public void procGestureForLog(boolean z7, com.baidu.platform.comapi.basestruct.Point point) {
        if (!this.E.f9496a) {
            MapStatus mapStatus = getMapStatus();
            a aVar = this.E;
            aVar.f9496a = true;
            aVar.f9497b = mapStatus.level;
            aVar.f9498c = new GeoPoint(mapStatus.centerPtX, mapStatus.centerPtY);
            this.E.f9499d = new com.baidu.platform.comapi.basestruct.Point(0, 0);
        }
        if (z7) {
            int abs = Math.abs(point.getIntX());
            int abs2 = Math.abs(point.getIntY());
            com.baidu.platform.comapi.basestruct.Point point2 = this.E.f9499d;
            point2.setIntX(point2.getIntX() + abs);
            com.baidu.platform.comapi.basestruct.Point point3 = this.E.f9499d;
            point3.setIntY(point3.getIntY() + abs2);
        }
    }

    public void recycleMemory(RecycleMemoryLevel recycleMemoryLevel) {
        if (a()) {
            this.f9478v.recycleMemory(recycleMemoryLevel.getLevel());
        }
    }

    public void registMapViewListener(w wVar) {
        List<w> list;
        if (wVar == null || (list = this.mListeners) == null) {
            return;
        }
        list.add(wVar);
    }

    public void removeOneOverlayItem(Bundle bundle) {
        this.f9478v.removeOneOverlayItem(bundle);
    }

    public void removeStreetAllCustomMarker() {
        if (a()) {
            this.f9478v.RemoveStreetAllCustomMarker();
        }
    }

    public void removeStreetCustomMarker(String str) {
        if (a()) {
            this.f9478v.RemoveStreetCustomMaker(str);
        }
    }

    public void saveScreenToLocal(String str, int i8, int i9, int i10, int i11) {
        if (!a() || TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = null;
        if (i10 != 0 && i11 != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("x", i8);
                jSONObject.put("y", i9);
                jSONObject.put(com.arthenica.ffmpegkit.x.KEY_WIDTH, i10);
                jSONObject.put(com.arthenica.ffmpegkit.x.KEY_HEIGHT, i11);
                str2 = jSONObject.toString();
            } catch (Exception unused) {
            }
        }
        this.f9478v.SaveScreenToLocal(str, str2);
    }

    public void scrollBy(int i8, int i9) {
        if (i8 == 0 && i9 == 0) {
            return;
        }
        MapStatus.WinRound winRound = getMapStatus().winRound;
        d(winRound.left + (this.f9481y / 2) + i8, winRound.top + (this.f9482z / 2) + i9);
    }

    public void set3DGestureEnable(boolean z7) {
        this.R = z7;
    }

    public void setActingTwoClickZoom(boolean z7) {
        this.Q = z7;
    }

    public void setAllStreetCustomMarkerVisibility(boolean z7) {
        if (a()) {
            this.f9478v.SetAllStreetCustomMarkerVisibility(z7);
        }
    }

    public void setCanTouchMove(boolean z7) {
        this.U = z7;
    }

    public void setCaptureMapListener(CaptureMapListener captureMapListener) {
        this.X = captureMapListener;
    }

    public void setDoubleClickGesturesCenter(boolean z7) {
        this.f9475s = z7;
    }

    public void setDoubleClickMoveZoomEnable(boolean z7) {
        this.H = z7;
    }

    public void setDoubleClickZoom(boolean z7) {
        this.F = z7;
    }

    public void setEnableIndoor3D(boolean z7) {
        if (a()) {
            this.f9478v.setEnableIndoor3D(z7);
        }
    }

    public void setEnableZoom(boolean z7) {
        this.T = z7;
    }

    public void setEngineMsgListener(EngineMsgListener engineMsgListener) {
        this.f9455b0 = engineMsgListener;
    }

    public void setEnlargeCenterWithDoubleClickEnable(boolean z7) {
        this.J = z7;
    }

    public void setFlingEnable(boolean z7) {
        this.f9465j = z7;
    }

    public void setHideIndoorPopupListener(h hVar) {
        this.Y = hVar;
    }

    public void setInertialAnimation(boolean z7) {
        this.mIsInertialAnimation = z7;
        this.P = z7;
        this.Q = z7;
    }

    public void setLatLngGesturesCenter(LatLng latLng) {
        this.f9474r = latLng;
    }

    public boolean setLayerSceneMode(long j8, MapSceneMode mapSceneMode) {
        if (a()) {
            return this.f9478v.SetLayerSceneMode(j8, mapSceneMode.getMode());
        }
        return false;
    }

    public void setMapClickEnable(boolean z7) {
        this.A = z7;
    }

    public int setMapControlMode(MapControlMode mapControlMode) {
        if (!a()) {
            return -1;
        }
        this.f9466j0 = mapControlMode;
        return this.f9478v.SetMapControlMode(mapControlMode.f9486b);
    }

    public void setMapFirstFrameCallback(MapFirstFrameCallback mapFirstFrameCallback) {
        this.f9471o = mapFirstFrameCallback;
    }

    public void setMapRenderModeChangeListener(MapRenderModeChangeListener mapRenderModeChangeListener) {
        this.f9454a0 = mapRenderModeChangeListener;
    }

    public void setMapScene(int i8) {
        if (i8 == getMapScene()) {
            return;
        }
        this.f9468l = i8;
        if (a()) {
            this.f9478v.setMapScene(this.f9468l);
        }
    }

    public void setMapStatus(MapStatus mapStatus, boolean z7) {
        if (!a() || mapStatus == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putDouble("level", mapStatus.level);
        bundle.putDouble("rotation", mapStatus.rotation);
        bundle.putDouble("overlooking", mapStatus.overlooking);
        bundle.putDouble("centerptx", mapStatus.centerPtX);
        bundle.putDouble("centerpty", mapStatus.centerPtY);
        bundle.putDouble("centerptz", mapStatus.centerPtZ);
        bundle.putInt(TtmlNode.LEFT, mapStatus.winRound.left);
        bundle.putInt(TtmlNode.RIGHT, mapStatus.winRound.right);
        bundle.putInt("top", mapStatus.winRound.top);
        bundle.putInt("bottom", mapStatus.winRound.bottom);
        bundle.putLong("gleft", mapStatus.geoRound.left);
        bundle.putLong("gbottom", mapStatus.geoRound.bottom);
        bundle.putLong("gtop", mapStatus.geoRound.top);
        bundle.putLong("gright", mapStatus.geoRound.right);
        bundle.putFloat("yoffset", mapStatus.yOffset);
        bundle.putFloat("xoffset", mapStatus.xOffset);
        bundle.putInt("animation", 0);
        bundle.putInt("animatime", 0);
        bundle.putInt("bfpp", mapStatus.bfpp ? 1 : 0);
        bundle.putString("panoid", mapStatus.panoId);
        bundle.putInt("autolink", z7 ? 1 : 0);
        bundle.putFloat("siangle", mapStatus.streetIndicateAngle);
        bundle.putInt("isbirdeye", mapStatus.isBirdEye ? 1 : 0);
        bundle.putInt("ssext", mapStatus.streetExt);
        bundle.putFloat("adapterZoomUnits", mapStatus.adapterZoomUnits);
        this.f9478v.SetMapStatus(bundle);
    }

    public void setMapStatusWithAnimation(MapStatus mapStatus, int i8, boolean z7) {
        if (!a() || this.f9478v == null || mapStatus == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putDouble("level", mapStatus.level);
        bundle.putDouble("rotation", mapStatus.rotation);
        bundle.putDouble("overlooking", mapStatus.overlooking);
        bundle.putDouble("centerptx", mapStatus.centerPtX);
        bundle.putDouble("centerpty", mapStatus.centerPtY);
        bundle.putDouble("centerptz", mapStatus.centerPtZ);
        bundle.putInt(TtmlNode.LEFT, mapStatus.winRound.left);
        bundle.putInt(TtmlNode.RIGHT, mapStatus.winRound.right);
        bundle.putInt("top", mapStatus.winRound.top);
        bundle.putInt("bottom", mapStatus.winRound.bottom);
        bundle.putLong("gleft", mapStatus.geoRound.left);
        bundle.putLong("gright", mapStatus.geoRound.right);
        bundle.putLong("gbottom", mapStatus.geoRound.bottom);
        bundle.putLong("gtop", mapStatus.geoRound.top);
        bundle.putFloat("xoffset", mapStatus.xOffset);
        bundle.putFloat("yoffset", mapStatus.yOffset);
        bundle.putInt("animation", 1);
        bundle.putInt("animatime", i8);
        bundle.putInt("bfpp", mapStatus.bfpp ? 1 : 0);
        bundle.putString("panoid", mapStatus.panoId);
        bundle.putInt("autolink", z7 ? 1 : 0);
        bundle.putFloat("siangle", mapStatus.streetIndicateAngle);
        bundle.putInt("isbirdeye", mapStatus.isBirdEye ? 1 : 0);
        bundle.putInt("ssext", mapStatus.streetExt);
        bundle.putFloat("roadOffsetX", mapStatus.roadOffsetX);
        bundle.putFloat("roadOffsetY", mapStatus.roadOffsetY);
        bundle.putFloat("adapterZoomUnits", mapStatus.adapterZoomUnits);
        this.f9478v.SetMapStatus(bundle);
    }

    public boolean setMapTheme(int i8, Bundle bundle) {
        if (!a()) {
            return false;
        }
        if (this.f9478v.getMapTheme() == i8) {
            return true;
        }
        this.f9469m = i8;
        return this.f9478v.setMapTheme(i8, bundle);
    }

    public boolean setMapThemeScene(int i8, int i9, Bundle bundle) {
        if (!a()) {
            return false;
        }
        if (this.f9478v.getMapTheme() == i8 && this.f9478v.getMapScene() == i9) {
            return true;
        }
        this.f9469m = i8;
        this.f9468l = i9;
        return this.f9478v.setMapThemeScene(i8, i9, bundle);
    }

    public void setMapViewInterface(MapViewInterface mapViewInterface) {
        this.f9457d0 = new SoftReference<>(mapViewInterface);
    }

    public void setMapViewListener(MapViewListener mapViewListener) {
        this.W = mapViewListener;
    }

    public void setMapViewSurfaceListener(MapViewSurfaceListener mapViewSurfaceListener) {
        this.f9456c0 = mapViewSurfaceListener;
    }

    public void setMaxAndMinZoomLevel(float f8, float f9) {
        this.mMaxZoomLevel = f8;
        this.mMinZoomLevel = f9;
    }

    public void setNaviMapViewListener(NaviMapViewListener naviMapViewListener) {
        this.f9458e0 = naviMapViewListener;
    }

    public void setNetStatus(int i8) {
        EngineMsgListener engineMsgListener = this.f9455b0;
        if (engineMsgListener == null) {
            return;
        }
        if (i8 == 1) {
            engineMsgListener.onLongLinkConnect();
        } else if (i8 == 2 && this.f9467k != i8) {
            engineMsgListener.onLongLinkDisConnect();
        }
        this.f9467k = i8;
    }

    public void setOverlayListener(x xVar) {
        this.mOverlayListener = xVar;
    }

    public void setOverlayMapCallBack(q qVar) {
        AppBaseMap appBaseMap;
        if (qVar == null || (appBaseMap = this.f9478v) == null) {
            return;
        }
        appBaseMap.SetCallback(qVar);
    }

    public void setOverlookGestureEnable(boolean z7) {
        this.S = z7;
    }

    public void setPointGesturesCenter(Point point) {
        this.f9473q = point;
    }

    public void setRecommendPOIScene(RecommendPoiScene recommendPoiScene) {
        if (a()) {
            this.f9478v.setRecommendPOIScene(recommendPoiScene.value);
        }
    }

    public void setSDKLayerBelowBmLayer(boolean z7) {
        this.V = z7;
    }

    public void setScreenSize(int i8, int i9) {
        this.f9481y = i8;
        this.f9482z = i9;
    }

    public void setStreetArrowClickListener(z zVar) {
        this.Z = zVar;
    }

    public void setStreetArrowShow(boolean z7) {
        if (a()) {
            this.f9478v.SetStreetArrowShow(z7);
        }
    }

    public void setStreetMarkerClickable(String str, boolean z7) {
        if (a()) {
            this.f9478v.SetStreetMarkerClickable(str, z7);
        }
    }

    public void setStreetRoadClickable(boolean z7) {
        if (a()) {
            this.f9478v.SetStreetRoadClickable(z7);
        }
    }

    public void setStyleMode(MapStyleMode mapStyleMode) {
        if (a()) {
            this.f9478v.SetStyleMode(mapStyleMode.getMode());
        }
    }

    public void setSupBackgroundDraw(boolean z7) {
        AppBaseMap appBaseMap = this.f9478v;
        if (appBaseMap == null) {
            return;
        }
        appBaseMap.setSupBackgroundDraw(z7);
    }

    public void setTargetStreetCustomMarkerVisibility(boolean z7, String str) {
        if (a()) {
            this.f9478v.SetTargetStreetCustomMarkerVisibility(z7, str);
        }
    }

    public void setTravelMode(boolean z7) {
        this.f9470n = z7;
    }

    public void setTwoTouchClickZoomEnabled(boolean z7) {
        this.I = z7;
    }

    public void setUniversalFilter(String str) {
        if (a()) {
            this.f9478v.setUniversalFilter(str);
        }
    }

    public void showBaseIndoorMap(boolean z7) {
        if (a()) {
            this.f9478v.ShowBaseIndoorMap(z7);
        }
    }

    public void showStreetPOIMarker(boolean z7) {
        if (a()) {
            this.f9478v.ShowStreetPOIMarker(z7);
        }
    }

    public void showUniversalLayer(Bundle bundle) {
        if (a()) {
            this.f9478v.showUniversalLayer(bundle);
        }
    }

    public void startIndoorAnimation() {
        if (a()) {
            this.f9478v.StartIndoorAnimation();
        }
    }

    public boolean switchBaseIndoorMapFloor(String str, String str2) {
        if (a()) {
            return this.f9478v.SwitchBaseIndoorMapFloor(str, str2);
        }
        return false;
    }

    public void unInit() {
        AppBaseMap appBaseMap;
        d();
        Handler handler = this.f9480x;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f9480x = null;
        }
        List<AppBaseMap> list = f9453g;
        if (list != null) {
            list.remove(this.f9478v);
        }
        List<w> list2 = this.mListeners;
        if (list2 != null) {
            list2.clear();
        }
        if (this.C && (appBaseMap = this.f9478v) != null) {
            appBaseMap.Release();
            this.f9478v = null;
            this.C = false;
        }
        if (this.f9454a0 != null) {
            this.f9454a0 = null;
        }
    }

    public void unInitForMultiTextureView() {
        AppBaseMap appBaseMap;
        if (!this.C || (appBaseMap = this.f9478v) == null) {
            return;
        }
        appBaseMap.Release();
        this.f9478v = null;
        this.C = false;
    }

    public void updateDrawFPS() {
        if (a()) {
            this.f9478v.updateDrawFPS();
        }
    }

    public void updateOneOverlayItem(Bundle bundle) {
        this.f9478v.updateOneOverlayItem(bundle);
    }

    public int MapMsgProc(int i8, int i9, int i10, int i11, int i12, double d8, double d9, double d10, double d11) {
        if (a()) {
            return MapProc(this.f9479w, i8, i9, i10, i11, i12, d8, d9, d10, d11);
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02a8 A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02bb A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02cf A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e3 A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ee A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d9 A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c4 A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b1 A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x029e A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x028b A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0278 A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0265 A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0175 A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0181 A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018d A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019c A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01aa A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b8 A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c4 A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d2 A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e0 A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f7 A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0216 A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0224 A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023b A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024b A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x025c A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x026f A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0282 A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0295 A[Catch: JSONException -> 0x031d, TryCatch #1 {JSONException -> 0x031d, blocks: (B:13:0x006b, B:15:0x0085, B:16:0x008b, B:24:0x02f4, B:25:0x00bd, B:28:0x00cc, B:32:0x00dd, B:33:0x00e8, B:35:0x00f7, B:36:0x010e, B:38:0x0114, B:43:0x0144, B:45:0x016f, B:47:0x0175, B:48:0x017b, B:50:0x0181, B:51:0x0187, B:53:0x018d, B:54:0x0193, B:56:0x019c, B:57:0x01a2, B:59:0x01aa, B:60:0x01b0, B:62:0x01b8, B:63:0x01be, B:65:0x01c4, B:66:0x01ca, B:68:0x01d2, B:69:0x01d8, B:71:0x01e0, B:72:0x01ef, B:74:0x01f7, B:76:0x0210, B:78:0x0216, B:79:0x021c, B:81:0x0224, B:82:0x0233, B:84:0x023b, B:85:0x0243, B:87:0x024b, B:88:0x0253, B:90:0x025c, B:91:0x0267, B:93:0x026f, B:94:0x027a, B:96:0x0282, B:97:0x028d, B:99:0x0295, B:100:0x02a0, B:102:0x02a8, B:103:0x02b3, B:105:0x02bb, B:106:0x02c6, B:108:0x02cf, B:109:0x02db, B:111:0x02e3, B:113:0x02f1, B:115:0x02ee, B:116:0x02d9, B:117:0x02c4, B:118:0x02b1, B:119:0x029e, B:120:0x028b, B:121:0x0278, B:122:0x0265, B:125:0x013d, B:126:0x012b, B:127:0x0149, B:129:0x0157, B:131:0x015d, B:132:0x00fe, B:134:0x0104, B:135:0x010b, B:136:0x00e4, B:141:0x0313, B:139:0x0099, B:19:0x0091), top: B:12:0x006b, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean b(int i8, int i9) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        String str;
        int i10;
        ArrayList arrayList;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        ArrayList arrayList2;
        double intX;
        double intY;
        String str18 = MapBundleKey.MapObjKey.OBJ_SS_POINAME;
        String str19 = MapBundleKey.MapObjKey.OBJ_OFFSET;
        String str20 = MapBundleKey.MapObjKey.OBJ_GEO;
        String str21 = "index";
        String str22 = "in";
        String str23 = "rotation";
        String str24 = MapBundleKey.MapObjKey.OBJ_TYPE;
        String str25 = MapBundleKey.MapObjKey.OBJ_SS_ARROW_Z;
        String str26 = "y";
        String str27 = "x";
        String str28 = "ud";
        boolean a8 = a();
        String str29 = MapBundleKey.MapObjKey.OBJ_DIS;
        if (!a8 || getMapViewListener() == null) {
            return false;
        }
        int i11 = this.nearlyRadius;
        String str30 = MapBundleKey.MapObjKey.OBJ_SS_INDOOR_ID;
        String GetNearlyObjID = this.f9478v.GetNearlyObjID(-1L, i8, i9, (int) (i11 * getZoomUnitsInMeter()));
        if (GetNearlyObjID == null) {
            return false;
        }
        new ArrayList();
        try {
            JSONArray jSONArray2 = new JSONObject(GetNearlyObjID).getJSONArray("dataset");
            if (((JSONObject) jSONArray2.get(0)).getInt(MapBundleKey.MapObjKey.OBJ_TYPE) != 7000) {
                return false;
            }
            ArrayList arrayList3 = new ArrayList();
            int i12 = 0;
            while (i12 < jSONArray2.length()) {
                try {
                    jSONObject = (JSONObject) jSONArray2.get(i12);
                } catch (JSONException e8) {
                    e8.printStackTrace();
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    i10 = i12;
                    str = str24;
                    jSONArray = jSONArray2;
                } else {
                    jSONArray = jSONArray2;
                    int i13 = jSONObject.getInt(str24);
                    str = str24;
                    if (i13 == 26) {
                        i10 = i12;
                    } else {
                        MapObj mapObj = new MapObj();
                        i10 = i12;
                        if (jSONObject.has(str28)) {
                            arrayList = arrayList3;
                            mapObj.strUid = jSONObject.getString(str28);
                        } else {
                            arrayList = arrayList3;
                            mapObj.strUid = "";
                        }
                        mapObj.strText = jSONObject.optString(MapBundleKey.MapObjKey.OBJ_TEXT);
                        if (jSONObject.has(str22)) {
                            mapObj.nIndex = jSONObject.getInt(str22);
                        } else if (jSONObject.has(str21)) {
                            mapObj.nIndex = jSONObject.getInt(str21);
                        } else {
                            mapObj.nIndex = 0;
                        }
                        if (jSONObject.has(str20)) {
                            com.baidu.platform.comapi.basestruct.Point complexPtToPoint = CoordinateUtil.complexPtToPoint(jSONObject.getString(str20));
                            str3 = str20;
                            com.baidu.platform.comapi.basestruct.Point point = mapObj.geoPt;
                            if (complexPtToPoint == null) {
                                str4 = str21;
                                str5 = str22;
                                intX = 0.0d;
                            } else {
                                str4 = str21;
                                str5 = str22;
                                intX = complexPtToPoint.getIntX();
                            }
                            if (complexPtToPoint == null) {
                                str2 = str18;
                                intY = 0.0d;
                            } else {
                                str2 = str18;
                                intY = complexPtToPoint.getIntY();
                            }
                            point.setTo(intX, intY);
                        } else {
                            str2 = str18;
                            str3 = str20;
                            str4 = str21;
                            str5 = str22;
                            if (jSONObject.has(MapBundleKey.MapObjKey.OBJ_SL_PTX) && jSONObject.has(MapBundleKey.MapObjKey.OBJ_SL_PTY)) {
                                str6 = str19;
                                mapObj.geoPt.setTo((int) jSONObject.getDouble(MapBundleKey.MapObjKey.OBJ_SL_PTX), (int) jSONObject.getDouble(MapBundleKey.MapObjKey.OBJ_SL_PTY));
                                if (jSONObject.has(MapBundleKey.MapObjKey.OBJ_SL_TIME)) {
                                    mapObj.sltime = jSONObject.getInt(MapBundleKey.MapObjKey.OBJ_SL_TIME);
                                }
                                if (jSONObject.has(MapBundleKey.MapObjKey.OBJ_SL_OBJ)) {
                                    mapObj.slobj = jSONObject.getInt(MapBundleKey.MapObjKey.OBJ_SL_OBJ);
                                }
                                if (jSONObject.has(MapBundleKey.MapObjKey.OBJ_SL_VISI)) {
                                    mapObj.slvisi = jSONObject.getInt(MapBundleKey.MapObjKey.OBJ_SL_VISI);
                                }
                                mapObj.nType = i13;
                                str7 = str6;
                                if (jSONObject.has(str7)) {
                                    mapObj.offset = jSONObject.getInt(str7);
                                }
                                str8 = str2;
                                if (jSONObject.has(str8)) {
                                    mapObj.ssName = jSONObject.getString(str8);
                                }
                                str9 = str30;
                                if (jSONObject.has(str9)) {
                                    mapObj.ssIndoorId = jSONObject.getString(str9);
                                }
                                if (jSONObject.has(str28)) {
                                    mapObj.ssPoiUid = jSONObject.getString(str28);
                                }
                                str10 = str29;
                                if (jSONObject.has(str10)) {
                                    mapObj.offset = jSONObject.getInt(str10);
                                }
                                str11 = str27;
                                if (jSONObject.has(str11)) {
                                    mapObj.geoPt.setIntX(jSONObject.getInt(str11));
                                    mapObj.streetArrowCenterX = jSONObject.getDouble(str11);
                                }
                                str12 = str26;
                                if (jSONObject.has(str12)) {
                                    str13 = str28;
                                    str14 = str7;
                                } else {
                                    str13 = str28;
                                    mapObj.geoPt.setIntY(jSONObject.getInt(str12));
                                    str14 = str7;
                                    mapObj.streetArrowCenterY = jSONObject.getDouble(str12);
                                }
                                str15 = str25;
                                if (jSONObject.has(str15)) {
                                    mapObj.ssZ = jSONObject.getInt(str15);
                                }
                                str16 = str23;
                                if (jSONObject.has(str16)) {
                                    str17 = str8;
                                    str30 = str9;
                                } else {
                                    str17 = str8;
                                    str30 = str9;
                                    mapObj.ssRotation = jSONObject.getDouble(str16);
                                }
                                if (jSONObject.has(MapBundleKey.MapObjKey.OBJ_SS_ARROW_PANOID)) {
                                    mapObj.ssPanoId = jSONObject.getString(MapBundleKey.MapObjKey.OBJ_SS_ARROW_PANOID);
                                }
                                if (jSONObject.has(MapBundleKey.MapObjKey.OBJ_SS_DATA)) {
                                    mapObj.ssData = jSONObject.getString(MapBundleKey.MapObjKey.OBJ_SS_DATA);
                                }
                                if (jSONObject.has(MapBundleKey.MapObjKey.OBJ_SRC)) {
                                    mapObj.dynamicSrc = -1;
                                } else {
                                    mapObj.dynamicSrc = jSONObject.getInt(MapBundleKey.MapObjKey.OBJ_SRC);
                                }
                                if (jSONObject.has(MapBundleKey.MapObjKey.OBJ_AD)) {
                                    mapObj.ad = -1;
                                } else {
                                    mapObj.ad = jSONObject.getInt(MapBundleKey.MapObjKey.OBJ_AD);
                                }
                                if (jSONObject.has(MapBundleKey.MapObjKey.OBJ_AD_STYLE)) {
                                    mapObj.adstyle = -1;
                                } else {
                                    mapObj.adstyle = jSONObject.getInt(MapBundleKey.MapObjKey.OBJ_AD_STYLE);
                                }
                                if (jSONObject.has(MapBundleKey.MapObjKey.OBJ_QID)) {
                                    mapObj.qid = "";
                                } else {
                                    mapObj.qid = jSONObject.getString(MapBundleKey.MapObjKey.OBJ_QID);
                                }
                                if (jSONObject.has(MapBundleKey.MapObjKey.OBJ_PUID)) {
                                    mapObj.puid = "";
                                } else {
                                    mapObj.puid = jSONObject.getString(MapBundleKey.MapObjKey.OBJ_PUID);
                                }
                                if (jSONObject.has(MapBundleKey.MapObjKey.AD_LOG)) {
                                    mapObj.adLog = "";
                                } else {
                                    mapObj.adLog = jSONObject.getString(MapBundleKey.MapObjKey.AD_LOG);
                                }
                                if (jSONObject.has("url")) {
                                    mapObj.url = "";
                                } else {
                                    mapObj.url = jSONObject.getString("url");
                                }
                                if (jSONObject.has("level")) {
                                    mapObj.level = -1;
                                } else {
                                    mapObj.level = jSONObject.getInt("level");
                                }
                                arrayList2 = arrayList;
                                arrayList2.add(mapObj);
                                arrayList3 = arrayList2;
                                str25 = str15;
                                str23 = str16;
                                str29 = str10;
                                str27 = str11;
                                str19 = str14;
                                str28 = str13;
                                str24 = str;
                                str20 = str3;
                                str18 = str17;
                                str22 = str5;
                                jSONArray2 = jSONArray;
                                i12 = i10 + 1;
                                str26 = str12;
                                str21 = str4;
                            }
                        }
                        str6 = str19;
                        if (jSONObject.has(MapBundleKey.MapObjKey.OBJ_SL_TIME)) {
                        }
                        if (jSONObject.has(MapBundleKey.MapObjKey.OBJ_SL_OBJ)) {
                        }
                        if (jSONObject.has(MapBundleKey.MapObjKey.OBJ_SL_VISI)) {
                        }
                        mapObj.nType = i13;
                        str7 = str6;
                        if (jSONObject.has(str7)) {
                        }
                        str8 = str2;
                        if (jSONObject.has(str8)) {
                        }
                        str9 = str30;
                        if (jSONObject.has(str9)) {
                        }
                        if (jSONObject.has(str28)) {
                        }
                        str10 = str29;
                        if (jSONObject.has(str10)) {
                        }
                        str11 = str27;
                        if (jSONObject.has(str11)) {
                        }
                        str12 = str26;
                        if (jSONObject.has(str12)) {
                        }
                        str15 = str25;
                        if (jSONObject.has(str15)) {
                        }
                        str16 = str23;
                        if (jSONObject.has(str16)) {
                        }
                        if (jSONObject.has(MapBundleKey.MapObjKey.OBJ_SS_ARROW_PANOID)) {
                        }
                        if (jSONObject.has(MapBundleKey.MapObjKey.OBJ_SS_DATA)) {
                        }
                        if (jSONObject.has(MapBundleKey.MapObjKey.OBJ_SRC)) {
                        }
                        if (jSONObject.has(MapBundleKey.MapObjKey.OBJ_AD)) {
                        }
                        if (jSONObject.has(MapBundleKey.MapObjKey.OBJ_AD_STYLE)) {
                        }
                        if (jSONObject.has(MapBundleKey.MapObjKey.OBJ_QID)) {
                        }
                        if (jSONObject.has(MapBundleKey.MapObjKey.OBJ_PUID)) {
                        }
                        if (jSONObject.has(MapBundleKey.MapObjKey.AD_LOG)) {
                        }
                        if (jSONObject.has("url")) {
                        }
                        if (jSONObject.has("level")) {
                        }
                        arrayList2 = arrayList;
                        arrayList2.add(mapObj);
                        arrayList3 = arrayList2;
                        str25 = str15;
                        str23 = str16;
                        str29 = str10;
                        str27 = str11;
                        str19 = str14;
                        str28 = str13;
                        str24 = str;
                        str20 = str3;
                        str18 = str17;
                        str22 = str5;
                        jSONArray2 = jSONArray;
                        i12 = i10 + 1;
                        str26 = str12;
                        str21 = str4;
                    }
                }
                arrayList2 = arrayList3;
                str17 = str18;
                str3 = str20;
                str4 = str21;
                str5 = str22;
                str16 = str23;
                str12 = str26;
                str11 = str27;
                str13 = str28;
                str14 = str19;
                str15 = str25;
                str10 = str29;
                arrayList3 = arrayList2;
                str25 = str15;
                str23 = str16;
                str29 = str10;
                str27 = str11;
                str19 = str14;
                str28 = str13;
                str24 = str;
                str20 = str3;
                str18 = str17;
                str22 = str5;
                jSONArray2 = jSONArray;
                i12 = i10 + 1;
                str26 = str12;
                str21 = str4;
            }
            getMapViewListener().onClickedParticleEventMapObj(arrayList3);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    void d(int i8, int i9) {
        if (a()) {
            this.f9478v.MoveToScrPoint(i8, i9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02e2 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02f5 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0305 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0315 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0323 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0331 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0341 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0352 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0370 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x038e A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x039f A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03af A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03bf A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03cf A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03e5 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03f9 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x040d A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0420 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0433 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0447 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x045b A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x046b A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x047f A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0493 A[Catch: JSONException -> 0x009d, TRY_LEAVE, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04a7 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04bc A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04cf A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04e2 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04ee A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x078b A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x04d8 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:393:0x04c5 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x04b1 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0489 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0474 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0450 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x043c A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0429 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0416 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0402 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x03ee A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x03da A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0198 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027e A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x028f A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x029f A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02af A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c0 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d1 A[Catch: JSONException -> 0x009d, TryCatch #1 {JSONException -> 0x009d, blocks: (B:28:0x0068, B:31:0x007a, B:33:0x0080, B:35:0x0094, B:36:0x00a0, B:38:0x00a8, B:39:0x00b0, B:41:0x00b6, B:42:0x00bc, B:44:0x00c5, B:46:0x00cd, B:48:0x00f2, B:55:0x0192, B:57:0x0198, B:61:0x068e, B:62:0x01bb, B:64:0x01c8, B:65:0x01d5, B:68:0x01dd, B:69:0x01e6, B:71:0x01f5, B:72:0x0210, B:74:0x0218, B:79:0x0244, B:81:0x0276, B:83:0x027e, B:84:0x0287, B:86:0x028f, B:87:0x0297, B:89:0x029f, B:90:0x02a7, B:92:0x02af, B:93:0x02b7, B:95:0x02c0, B:96:0x02c9, B:98:0x02d1, B:99:0x02d9, B:101:0x02e2, B:102:0x02eb, B:104:0x02f5, B:105:0x02fd, B:107:0x0305, B:108:0x030d, B:110:0x0315, B:111:0x031d, B:113:0x0323, B:114:0x0329, B:116:0x0331, B:117:0x0339, B:119:0x0341, B:120:0x0349, B:122:0x0352, B:123:0x0367, B:125:0x0370, B:126:0x0385, B:128:0x038e, B:129:0x0397, B:131:0x039f, B:132:0x03a7, B:134:0x03af, B:135:0x03b7, B:137:0x03bf, B:138:0x03c7, B:140:0x03cf, B:141:0x03dd, B:143:0x03e5, B:144:0x03f1, B:146:0x03f9, B:147:0x0405, B:149:0x040d, B:150:0x0418, B:152:0x0420, B:153:0x042b, B:155:0x0433, B:156:0x043f, B:158:0x0447, B:159:0x0453, B:161:0x045b, B:162:0x0463, B:164:0x046b, B:165:0x0476, B:167:0x047f, B:168:0x048b, B:170:0x0493, B:171:0x049f, B:173:0x04a7, B:174:0x04b4, B:176:0x04bc, B:177:0x04c7, B:179:0x04cf, B:180:0x04da, B:182:0x04e2, B:185:0x04ee, B:187:0x050f, B:221:0x068b, B:234:0x057d, B:240:0x058f, B:379:0x05b5, B:381:0x05bb, B:329:0x06f9, B:332:0x06ff, B:334:0x0705, B:335:0x070e, B:337:0x0714, B:338:0x071c, B:340:0x0722, B:341:0x072a, B:343:0x0730, B:344:0x0738, B:346:0x073e, B:347:0x0746, B:349:0x074c, B:350:0x0754, B:354:0x075e, B:355:0x0766, B:356:0x076e, B:358:0x0774, B:359:0x077c, B:361:0x0782, B:362:0x078b, B:364:0x0791, B:374:0x05ce, B:377:0x05d4, B:369:0x05e4, B:370:0x05e7, B:372:0x05ed, B:289:0x05fb, B:365:0x0601, B:262:0x0612, B:266:0x061f, B:268:0x0625, B:281:0x0654, B:285:0x065c, B:287:0x0662, B:384:0x066a, B:390:0x0679, B:392:0x04d8, B:393:0x04c5, B:394:0x04b1, B:401:0x0489, B:402:0x0474, B:403:0x0450, B:404:0x043c, B:405:0x0429, B:406:0x0416, B:407:0x0402, B:408:0x03ee, B:409:0x03da, B:410:0x023e, B:411:0x022f, B:412:0x024b, B:414:0x0256, B:416:0x025e, B:417:0x01fc, B:419:0x0204, B:420:0x020d, B:421:0x01e4, B:422:0x01d2, B:453:0x0138, B:456:0x0149, B:459:0x015c, B:463:0x016b, B:465:0x017f, B:466:0x0185), top: B:27:0x0068 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(int i8, int i9) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        int i11;
        ArrayList arrayList8;
        String str;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        ArrayList arrayList12;
        JSONArray jSONArray;
        String str2;
        ArrayList arrayList13;
        ArrayList arrayList14;
        ArrayList arrayList15;
        ArrayList arrayList16;
        ArrayList arrayList17;
        double intX;
        double d8;
        JSONObject jSONObject;
        NaviMapViewListener naviMapViewListener;
        NaviMapViewListener naviMapViewListener2;
        if (!a()) {
            return false;
        }
        if (getMapViewListener() == null && this.f9458e0 == null) {
            return false;
        }
        int zoomUnitsInMeter = (int) (this.nearlyRadius * getZoomUnitsInMeter());
        int i12 = i8;
        com.baidu.platform.comapi.basestruct.Point onTapInterception = (!isNaviMode() || (naviMapViewListener2 = this.f9458e0) == null) ? null : naviMapViewListener2.onTapInterception(new com.baidu.platform.comapi.basestruct.Point(i12, i9));
        if (onTapInterception != null) {
            i12 = onTapInterception.getIntX();
            i10 = onTapInterception.getIntY();
        } else {
            i10 = i9;
        }
        String GetNearlyObjID = this.f9478v.GetNearlyObjID(-1L, i12, i10, zoomUnitsInMeter);
        if (GetNearlyObjID == null) {
            return false;
        }
        if (isNaviMode() && (naviMapViewListener = this.f9458e0) != null && naviMapViewListener.onItemClick(GetNearlyObjID, i12, i10)) {
            return true;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(GetNearlyObjID);
            ArrayList arrayList18 = new ArrayList();
            String str3 = "in";
            if (jSONObject2.has(MapBundleKey.MapObjKey.OBJ_MCAR) && (jSONObject = jSONObject2.getJSONObject(MapBundleKey.MapObjKey.OBJ_MCAR)) != null) {
                ArrayList arrayList19 = new ArrayList();
                MapObj mapObj = new MapObj();
                mapObj.routeType = MapBundleKey.MapObjKey.OBJ_MCAR;
                if (jSONObject.has("id")) {
                    mapObj.routeId = jSONObject.getInt("id");
                }
                if (jSONObject.has("status")) {
                    mapObj.status = jSONObject.getInt("status");
                }
                if (jSONObject.has("in")) {
                    mapObj.index = jSONObject.getInt("in");
                }
                arrayList19.add(mapObj);
                if (getMapViewListener() != null) {
                    getMapViewListener().onClickedRouteObj(arrayList19);
                }
                return true;
            }
            JSONArray jSONArray2 = jSONObject2.getJSONArray("dataset");
            int i13 = ((JSONObject) jSONArray2.get(0)).getInt(MapBundleKey.MapObjKey.OBJ_TYPE);
            if (i13 == 22) {
                arrayList2 = new ArrayList();
            } else {
                if (i13 != 3 && i13 != 13 && i13 != 14 && i13 != 16 && i13 != 15 && i13 != 4 && i13 != 103 && i13 != 25 && i13 != 31 && i13 != 104 && i13 != 5000 && i13 != 6018 && i13 != 6019) {
                    if (i13 != 8 && i13 != 1 && i13 != 2) {
                        if (i13 == 6) {
                            arrayList6 = new ArrayList();
                            arrayList2 = null;
                            arrayList = null;
                            arrayList4 = null;
                            arrayList7 = null;
                            arrayList5 = null;
                            i11 = 0;
                            int i14 = -1;
                            while (i11 < jSONArray2.length()) {
                                JSONObject jSONObject3 = (JSONObject) jSONArray2.get(i11);
                                int i15 = jSONObject3.getInt(MapBundleKey.MapObjKey.OBJ_TYPE);
                                if (i15 == 26) {
                                    jSONArray = jSONArray2;
                                    arrayList16 = arrayList18;
                                    str = GetNearlyObjID;
                                    str2 = str3;
                                    arrayList17 = arrayList;
                                    arrayList10 = arrayList4;
                                    arrayList11 = arrayList6;
                                    arrayList14 = arrayList7;
                                    arrayList15 = arrayList5;
                                } else {
                                    MapObj mapObj2 = new MapObj();
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_LAYER_ID)) {
                                        mapObj2.layer_id = (int) jSONObject3.getLong(MapBundleKey.MapObjKey.OBJ_LAYER_ID);
                                    } else {
                                        mapObj2.layer_id = 0;
                                    }
                                    if (jSONObject3.has("ud")) {
                                        mapObj2.strUid = jSONObject3.getString("ud");
                                    } else {
                                        mapObj2.strUid = "";
                                    }
                                    mapObj2.strText = jSONObject3.optString(MapBundleKey.MapObjKey.OBJ_TEXT);
                                    if (jSONObject3.has(str3)) {
                                        mapObj2.nIndex = jSONObject3.getInt(str3);
                                    } else if (jSONObject3.has("index")) {
                                        mapObj2.nIndex = jSONObject3.getInt("index");
                                    } else {
                                        mapObj2.nIndex = 0;
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_GEO)) {
                                        com.baidu.platform.comapi.basestruct.Point complexPtToPoint = CoordinateUtil.complexPtToPoint(jSONObject3.getString(MapBundleKey.MapObjKey.OBJ_GEO));
                                        com.baidu.platform.comapi.basestruct.Point point = mapObj2.geoPt;
                                        if (complexPtToPoint == null) {
                                            jSONArray = jSONArray2;
                                            intX = 0.0d;
                                        } else {
                                            jSONArray = jSONArray2;
                                            intX = complexPtToPoint.getIntX();
                                        }
                                        if (complexPtToPoint == null) {
                                            str2 = str3;
                                            d8 = 0.0d;
                                        } else {
                                            int intY = complexPtToPoint.getIntY();
                                            str2 = str3;
                                            d8 = intY;
                                        }
                                        point.setTo(intX, d8);
                                    } else {
                                        jSONArray = jSONArray2;
                                        str2 = str3;
                                        if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_SL_PTX) && jSONObject3.has(MapBundleKey.MapObjKey.OBJ_SL_PTY)) {
                                            arrayList13 = arrayList18;
                                            str = GetNearlyObjID;
                                            mapObj2.geoPt.setTo((int) jSONObject3.getDouble(MapBundleKey.MapObjKey.OBJ_SL_PTX), (int) jSONObject3.getDouble(MapBundleKey.MapObjKey.OBJ_SL_PTY));
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_GEO_Z)) {
                                                mapObj2.geoZ = (float) jSONObject3.getDouble(MapBundleKey.MapObjKey.OBJ_GEO_Z);
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_INDOOR_POI)) {
                                                mapObj2.indoorpoi = jSONObject3.getBoolean(MapBundleKey.MapObjKey.OBJ_INDOOR_POI);
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_POI_ONLINETYPE)) {
                                                mapObj2.poiOnlineType = jSONObject3.getInt(MapBundleKey.MapObjKey.OBJ_POI_ONLINETYPE);
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_BID)) {
                                                mapObj2.bid = jSONObject3.getString(MapBundleKey.MapObjKey.OBJ_BID);
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_SL_TIME)) {
                                                mapObj2.sltime = jSONObject3.getInt(MapBundleKey.MapObjKey.OBJ_SL_TIME);
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_SL_OBJ)) {
                                                mapObj2.slobj = jSONObject3.getInt(MapBundleKey.MapObjKey.OBJ_SL_OBJ);
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_SL_VISI)) {
                                                mapObj2.slvisi = jSONObject3.getInt(MapBundleKey.MapObjKey.OBJ_SL_VISI);
                                            }
                                            mapObj2.nType = i15;
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_OFFSET)) {
                                                mapObj2.offset = jSONObject3.getInt(MapBundleKey.MapObjKey.OBJ_OFFSET);
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_SS_POINAME)) {
                                                mapObj2.ssName = jSONObject3.getString(MapBundleKey.MapObjKey.OBJ_SS_POINAME);
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_SS_INDOOR_ID)) {
                                                mapObj2.ssIndoorId = jSONObject3.getString(MapBundleKey.MapObjKey.OBJ_SS_INDOOR_ID);
                                            }
                                            if (jSONObject3.has("ud")) {
                                                mapObj2.ssPoiUid = jSONObject3.getString("ud");
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.STREET_TYPE)) {
                                                mapObj2.ssType = jSONObject3.getString(MapBundleKey.MapObjKey.STREET_TYPE);
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_DIS)) {
                                                mapObj2.offset = jSONObject3.getInt(MapBundleKey.MapObjKey.OBJ_DIS);
                                            }
                                            if (jSONObject3.has("x")) {
                                                mapObj2.geoPt.setIntX(jSONObject3.getInt("x"));
                                                mapObj2.streetArrowCenterX = jSONObject3.getDouble("x");
                                            }
                                            if (jSONObject3.has("y")) {
                                                mapObj2.geoPt.setIntY(jSONObject3.getInt("y"));
                                                mapObj2.streetArrowCenterY = jSONObject3.getDouble("y");
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_SS_ARROW_Z)) {
                                                mapObj2.ssZ = jSONObject3.getInt(MapBundleKey.MapObjKey.OBJ_SS_ARROW_Z);
                                            }
                                            if (jSONObject3.has("rotation")) {
                                                mapObj2.ssRotation = jSONObject3.getDouble("rotation");
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_SS_ARROW_PANOID)) {
                                                mapObj2.ssPanoId = jSONObject3.getString(MapBundleKey.MapObjKey.OBJ_SS_ARROW_PANOID);
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_SS_DATA)) {
                                                mapObj2.ssData = jSONObject3.getString(MapBundleKey.MapObjKey.OBJ_SS_DATA);
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_SRC)) {
                                                mapObj2.dynamicSrc = -1;
                                            } else {
                                                int i16 = jSONObject3.getInt(MapBundleKey.MapObjKey.OBJ_SRC);
                                                mapObj2.dynamicSrc = i16;
                                                i14 = i16;
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_AD)) {
                                                mapObj2.ad = -1;
                                            } else {
                                                mapObj2.ad = jSONObject3.getInt(MapBundleKey.MapObjKey.OBJ_AD);
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_AD_STYLE)) {
                                                mapObj2.adstyle = -1;
                                            } else {
                                                mapObj2.adstyle = jSONObject3.getInt(MapBundleKey.MapObjKey.OBJ_AD_STYLE);
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_QID)) {
                                                mapObj2.qid = "";
                                            } else {
                                                mapObj2.qid = jSONObject3.getString(MapBundleKey.MapObjKey.OBJ_QID);
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_PUID)) {
                                                mapObj2.puid = "";
                                            } else {
                                                mapObj2.puid = jSONObject3.getString(MapBundleKey.MapObjKey.OBJ_PUID);
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_DY_SRC)) {
                                                mapObj2.dysrc = -1;
                                            } else {
                                                mapObj2.dysrc = jSONObject3.getInt(MapBundleKey.MapObjKey.OBJ_DY_SRC);
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_DY_STGE)) {
                                                mapObj2.dystge = -1;
                                            } else {
                                                mapObj2.dystge = jSONObject3.getInt(MapBundleKey.MapObjKey.OBJ_DY_STGE);
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_DY_ISAGG)) {
                                                mapObj2.isAgg = jSONObject3.getBoolean(MapBundleKey.MapObjKey.OBJ_DY_ISAGG);
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.AD_LOG)) {
                                                mapObj2.adLog = "";
                                            } else {
                                                mapObj2.adLog = jSONObject3.getString(MapBundleKey.MapObjKey.AD_LOG);
                                            }
                                            if (jSONObject3.has("url")) {
                                                mapObj2.url = "";
                                            } else {
                                                mapObj2.url = jSONObject3.getString("url");
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_STYLE_ID)) {
                                                try {
                                                    mapObj2.style_id = 0;
                                                } catch (JSONException unused) {
                                                    return false;
                                                }
                                            } else {
                                                mapObj2.style_id = jSONObject3.getInt(MapBundleKey.MapObjKey.OBJ_STYLE_ID);
                                            }
                                            if (jSONObject3.has("level")) {
                                                mapObj2.level = -1;
                                            } else {
                                                mapObj2.level = jSONObject3.getInt("level");
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.CLICK_ACTION)) {
                                                mapObj2.clickAction = "";
                                            } else {
                                                mapObj2.clickAction = jSONObject3.getString(MapBundleKey.MapObjKey.CLICK_ACTION);
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.EX_JSON)) {
                                                mapObj2.exJson = "";
                                            } else {
                                                mapObj2.exJson = jSONObject3.getString(MapBundleKey.MapObjKey.EX_JSON);
                                            }
                                            if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_STATISTIC_VALUE)) {
                                                mapObj2.statisticValue = jSONObject3.getInt(MapBundleKey.MapObjKey.OBJ_STATISTIC_VALUE);
                                            }
                                            if (i13 != 22) {
                                                ItsMapObj itsMapObj = new ItsMapObj();
                                                itsMapObj.baseMapObj = mapObj2;
                                                itsMapObj.tTrafficStart = jSONObject3.getLong(MapBundleKey.MapObjKey.OBJ_TRAFFIC_EVENT_START);
                                                itsMapObj.tTrafficEnd = jSONObject3.getLong(MapBundleKey.MapObjKey.OBJ_TRAFFIC_EVENT_END);
                                                itsMapObj.strTrafficDetail = jSONObject3.getString(MapBundleKey.MapObjKey.OBJ_TRAFFIC_EVENT_DETAIL);
                                                if (arrayList2 != null) {
                                                    arrayList2.add(itsMapObj);
                                                }
                                                arrayList17 = arrayList;
                                                arrayList10 = arrayList4;
                                                arrayList11 = arrayList6;
                                            } else {
                                                if (i13 == 3 || i13 == 13 || i13 == 14 || i13 == 16 || i13 == 15 || i13 == 4 || i13 == 103 || i13 == 25 || i13 == 31 || i13 == 104 || i13 == 5000 || i13 == 6018) {
                                                    arrayList10 = arrayList4;
                                                    arrayList11 = arrayList6;
                                                    arrayList14 = arrayList7;
                                                    arrayList15 = arrayList5;
                                                    arrayList16 = arrayList13;
                                                    arrayList17 = arrayList;
                                                } else if (i13 == 6019) {
                                                    arrayList17 = arrayList;
                                                    arrayList10 = arrayList4;
                                                    arrayList11 = arrayList6;
                                                    arrayList14 = arrayList7;
                                                    arrayList15 = arrayList5;
                                                    arrayList16 = arrayList13;
                                                } else {
                                                    if (i13 != 8 && i13 != 1 && i13 != 2) {
                                                        if (i13 != 6) {
                                                            arrayList11 = arrayList6;
                                                            if (i13 != 24) {
                                                                arrayList14 = arrayList7;
                                                                if (i13 == 1234 || i13 == 1236 || i13 == 2000 || i13 == 2001) {
                                                                    arrayList10 = arrayList4;
                                                                    arrayList12 = arrayList5;
                                                                    arrayList8 = arrayList13;
                                                                    getMapViewListener().onClickedStreetIndoorPoi(mapObj2);
                                                                } else {
                                                                    if (i13 == 1235) {
                                                                        if (getMapViewListener() != null) {
                                                                            getMapViewListener().onClickStreetArrow(mapObj2);
                                                                        }
                                                                    } else if (i13 != 2002) {
                                                                        if (i13 == 1239) {
                                                                            arrayList10 = arrayList4;
                                                                            if (arrayList10 != null) {
                                                                                arrayList10.add(mapObj2);
                                                                            }
                                                                            if (getMapViewListener() != null) {
                                                                                getMapViewListener().onClickedRouteLabelObj(arrayList10);
                                                                            }
                                                                        } else {
                                                                            arrayList10 = arrayList4;
                                                                            if (i13 != 6000) {
                                                                                if (i13 == 7000) {
                                                                                    arrayList15 = arrayList5;
                                                                                    if (arrayList15 != null) {
                                                                                        arrayList15.add(mapObj2);
                                                                                    }
                                                                                } else {
                                                                                    arrayList15 = arrayList5;
                                                                                    if (i13 == 6002) {
                                                                                        if (getMapViewListener() != null) {
                                                                                            getMapViewListener().onClickedTrafficUgcEventMapObj(mapObj2, jSONObject3.optBoolean("bchecked"));
                                                                                        }
                                                                                    } else if (i13 != 90909 && i13 != 90910 && i13 != 90914 && i13 != 90912 && i13 != 90915 && i13 != 90916) {
                                                                                        arrayList16 = arrayList13;
                                                                                        arrayList16.add(mapObj2);
                                                                                    } else {
                                                                                        arrayList16 = arrayList13;
                                                                                        if (getMapViewListener() != null) {
                                                                                            getMapViewListener().onClickSdkMapObj(i13, jSONObject3);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                arrayList17 = arrayList;
                                                                                arrayList16 = arrayList13;
                                                                            } else if (getMapViewListener() != null) {
                                                                                getMapViewListener().onClickedTrafficUgcEventMapObj(mapObj2, true);
                                                                            }
                                                                        }
                                                                        arrayList12 = arrayList5;
                                                                        arrayList8 = arrayList13;
                                                                    } else if (getMapViewListener() != null) {
                                                                        getMapViewListener().onClickStreetSurface(mapObj2);
                                                                    }
                                                                    arrayList10 = arrayList4;
                                                                    arrayList12 = arrayList5;
                                                                    arrayList8 = arrayList13;
                                                                }
                                                                arrayList9 = arrayList;
                                                                break;
                                                            }
                                                            arrayList14 = arrayList7;
                                                            if (arrayList14 != null) {
                                                                arrayList14.add(mapObj2);
                                                            }
                                                            arrayList17 = arrayList;
                                                            arrayList10 = arrayList4;
                                                            arrayList15 = arrayList5;
                                                            arrayList16 = arrayList13;
                                                        } else {
                                                            arrayList11 = arrayList6;
                                                            if (arrayList11 != null) {
                                                                arrayList11.add(mapObj2);
                                                            }
                                                            arrayList17 = arrayList;
                                                            arrayList10 = arrayList4;
                                                        }
                                                    } else {
                                                        arrayList10 = arrayList4;
                                                        arrayList11 = arrayList6;
                                                        arrayList14 = arrayList7;
                                                        arrayList15 = arrayList5;
                                                        arrayList16 = arrayList13;
                                                        if (arrayList10 != null) {
                                                            arrayList10.add(mapObj2);
                                                        }
                                                    }
                                                    arrayList17 = arrayList;
                                                }
                                                if (arrayList17 != null) {
                                                    arrayList17.add(mapObj2);
                                                }
                                            }
                                            arrayList14 = arrayList7;
                                            arrayList15 = arrayList5;
                                            arrayList16 = arrayList13;
                                        }
                                    }
                                    arrayList13 = arrayList18;
                                    str = GetNearlyObjID;
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_GEO_Z)) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_INDOOR_POI)) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_POI_ONLINETYPE)) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_BID)) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_SL_TIME)) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_SL_OBJ)) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_SL_VISI)) {
                                    }
                                    mapObj2.nType = i15;
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_OFFSET)) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_SS_POINAME)) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_SS_INDOOR_ID)) {
                                    }
                                    if (jSONObject3.has("ud")) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.STREET_TYPE)) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_DIS)) {
                                    }
                                    if (jSONObject3.has("x")) {
                                    }
                                    if (jSONObject3.has("y")) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_SS_ARROW_Z)) {
                                    }
                                    if (jSONObject3.has("rotation")) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_SS_ARROW_PANOID)) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_SS_DATA)) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_SRC)) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_AD)) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_AD_STYLE)) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_QID)) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_PUID)) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_DY_SRC)) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_DY_STGE)) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_DY_ISAGG)) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.AD_LOG)) {
                                    }
                                    if (jSONObject3.has("url")) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_STYLE_ID)) {
                                    }
                                    if (jSONObject3.has("level")) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.CLICK_ACTION)) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.EX_JSON)) {
                                    }
                                    if (jSONObject3.has(MapBundleKey.MapObjKey.OBJ_STATISTIC_VALUE)) {
                                    }
                                    if (i13 != 22) {
                                    }
                                    arrayList14 = arrayList7;
                                    arrayList15 = arrayList5;
                                    arrayList16 = arrayList13;
                                }
                                i11++;
                                arrayList6 = arrayList11;
                                arrayList = arrayList17;
                                arrayList7 = arrayList14;
                                arrayList4 = arrayList10;
                                arrayList5 = arrayList15;
                                arrayList18 = arrayList16;
                                str3 = str2;
                                GetNearlyObjID = str;
                                jSONArray2 = jSONArray;
                            }
                            arrayList8 = arrayList18;
                            str = GetNearlyObjID;
                            arrayList9 = arrayList;
                            arrayList10 = arrayList4;
                            arrayList11 = arrayList6;
                            arrayList12 = arrayList5;
                            int i17 = i14;
                            if (i13 != 6) {
                                if (i13 != 8) {
                                    if (i13 != 25 && i13 != 31) {
                                        if (i13 != 5000) {
                                            if (i13 != 7000) {
                                                if (i13 != 22) {
                                                    if (i13 != 23) {
                                                        if (i13 != 103 && i13 != 104) {
                                                            if (i13 != 6018 && i13 != 6019) {
                                                                if (i13 != 6060 && i13 != 6061) {
                                                                    if (i13 != 1 && i13 != 2) {
                                                                        if (i13 != 3 && i13 != 4) {
                                                                            switch (i13) {
                                                                                case 20:
                                                                                    if (getMapViewListener() != null) {
                                                                                        getMapViewListener().onClickedStreetPopup(str);
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (getMapViewListener() != null) {
                                                                    getMapViewListener().onClickedMapObj(arrayList8);
                                                                }
                                                            } else if (getMapViewListener() != null) {
                                                                getMapViewListener().onClickedUniversalLayerPoiEventMapObj(arrayList9);
                                                            }
                                                        }
                                                    } else if (getMapViewListener() != null) {
                                                        getMapViewListener().onClickedMapObj(arrayList8);
                                                    }
                                                } else if (getMapViewListener() != null) {
                                                    getMapViewListener().onClickedItsMapObj(arrayList2);
                                                }
                                            } else if (getMapViewListener() != null) {
                                                getMapViewListener().onClickedParticleEventMapObj(arrayList12);
                                            }
                                        } else if (getMapViewListener() != null) {
                                            if (i17 == 27) {
                                                getMapViewListener().onClickPolymericMapObj(arrayList9);
                                            } else {
                                                getMapViewListener().onClickedPoiObj(arrayList9);
                                            }
                                        }
                                    }
                                    if (getMapViewListener() != null) {
                                        getMapViewListener().onClickedPoiObj(arrayList9);
                                    }
                                }
                                if (getMapViewListener() != null) {
                                    getMapViewListener().onClickedRouteObj(arrayList10);
                                }
                            } else if (getMapViewListener() != null) {
                                getMapViewListener().onClickedMapObj(arrayList11);
                            }
                            return true;
                        }
                        if (i13 == 24) {
                            arrayList7 = new ArrayList();
                            arrayList2 = null;
                            arrayList = null;
                            arrayList4 = null;
                            arrayList6 = null;
                            arrayList5 = null;
                            i11 = 0;
                            int i142 = -1;
                            while (i11 < jSONArray2.length()) {
                            }
                            arrayList8 = arrayList18;
                            str = GetNearlyObjID;
                            arrayList9 = arrayList;
                            arrayList10 = arrayList4;
                            arrayList11 = arrayList6;
                            arrayList12 = arrayList5;
                            int i172 = i142;
                            if (i13 != 6) {
                            }
                            return true;
                        }
                        if (i13 == 1239) {
                            arrayList3 = new ArrayList();
                            arrayList4 = arrayList3;
                            arrayList2 = null;
                            arrayList = null;
                            arrayList6 = null;
                            arrayList7 = null;
                            arrayList5 = null;
                            i11 = 0;
                            int i1422 = -1;
                            while (i11 < jSONArray2.length()) {
                            }
                            arrayList8 = arrayList18;
                            str = GetNearlyObjID;
                            arrayList9 = arrayList;
                            arrayList10 = arrayList4;
                            arrayList11 = arrayList6;
                            arrayList12 = arrayList5;
                            int i1722 = i1422;
                            if (i13 != 6) {
                            }
                            return true;
                        }
                        if (i13 == 7000) {
                            arrayList5 = new ArrayList();
                            arrayList2 = null;
                            arrayList = null;
                            arrayList4 = null;
                            arrayList6 = null;
                            arrayList7 = null;
                            i11 = 0;
                            int i14222 = -1;
                            while (i11 < jSONArray2.length()) {
                            }
                            arrayList8 = arrayList18;
                            str = GetNearlyObjID;
                            arrayList9 = arrayList;
                            arrayList10 = arrayList4;
                            arrayList11 = arrayList6;
                            arrayList12 = arrayList5;
                            int i17222 = i14222;
                            if (i13 != 6) {
                            }
                            return true;
                        }
                        arrayList2 = null;
                    }
                    arrayList3 = new ArrayList();
                    arrayList4 = arrayList3;
                    arrayList2 = null;
                    arrayList = null;
                    arrayList6 = null;
                    arrayList7 = null;
                    arrayList5 = null;
                    i11 = 0;
                    int i142222 = -1;
                    while (i11 < jSONArray2.length()) {
                    }
                    arrayList8 = arrayList18;
                    str = GetNearlyObjID;
                    arrayList9 = arrayList;
                    arrayList10 = arrayList4;
                    arrayList11 = arrayList6;
                    arrayList12 = arrayList5;
                    int i172222 = i142222;
                    if (i13 != 6) {
                    }
                    return true;
                }
                arrayList = new ArrayList();
                arrayList2 = null;
                arrayList4 = null;
                arrayList6 = null;
                arrayList7 = null;
                arrayList5 = null;
                i11 = 0;
                int i1422222 = -1;
                while (i11 < jSONArray2.length()) {
                }
                arrayList8 = arrayList18;
                str = GetNearlyObjID;
                arrayList9 = arrayList;
                arrayList10 = arrayList4;
                arrayList11 = arrayList6;
                arrayList12 = arrayList5;
                int i1722222 = i1422222;
                if (i13 != 6) {
                }
                return true;
            }
            arrayList = null;
            arrayList4 = null;
            arrayList6 = null;
            arrayList7 = null;
            arrayList5 = null;
            i11 = 0;
            int i14222222 = -1;
            while (i11 < jSONArray2.length()) {
            }
            arrayList8 = arrayList18;
            str = GetNearlyObjID;
            arrayList9 = arrayList;
            arrayList10 = arrayList4;
            arrayList11 = arrayList6;
            arrayList12 = arrayList5;
            int i17222222 = i14222222;
            if (i13 != 6) {
            }
            return true;
        } catch (JSONException unused2) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean c(int i8, int i9) {
        SoftReference<MapViewInterface> softReference;
        JSONObject jSONObject;
        JSONObject optJSONObject;
        if (!a() || (softReference = this.f9457d0) == null || softReference.get() == null) {
            return false;
        }
        String GetNearlyObjID = this.f9478v.GetNearlyObjID(-1L, i8, i9, this.nearlyRadius);
        if (GetNearlyObjID != null && !GetNearlyObjID.equals("")) {
            try {
                jSONObject = new JSONObject(GetNearlyObjID);
                try {
                    jSONObject.put("px", i8);
                    jSONObject.put("py", i9);
                } catch (JSONException e8) {
                    e = e8;
                    e.printStackTrace();
                    if (this.mListeners != null) {
                    }
                }
            } catch (JSONException e9) {
                e = e9;
                jSONObject = null;
            }
            if (this.mListeners != null) {
                return false;
            }
            boolean z7 = false;
            for (int i10 = 0; i10 < this.mListeners.size(); i10++) {
                w wVar = this.mListeners.get(i10);
                if (jSONObject != null && wVar != null) {
                    wVar.b(jSONObject.toString());
                    JSONArray optJSONArray = jSONObject.optJSONArray("dataset");
                    if (optJSONArray != null && (optJSONObject = optJSONArray.optJSONObject(0)) != null && optJSONObject.optInt(MapBundleKey.MapObjKey.OBJ_TYPE) >= 90909) {
                        z7 = true;
                    }
                }
            }
            return z7;
        }
        if (this.f9476t || this.mListeners == null || getMapView() == null || getMapView().getProjection() == null) {
            return false;
        }
        GeoPoint fromPixels = getMapView().getProjection().fromPixels(i8, i9);
        for (int i11 = 0; i11 < this.mListeners.size(); i11++) {
            w wVar2 = this.mListeners.get(i11);
            if (wVar2 != null) {
                wVar2.f(fromPixels);
            }
        }
        return false;
    }

    private void d() {
        MessageProxy.unRegisterMessageHandler(4000, this.f9480x);
        MessageProxy.unRegisterMessageHandler(519, this.f9480x);
        MessageProxy.unRegisterMessageHandler(39, this.f9480x);
        MessageProxy.unRegisterMessageHandler(512, this.f9480x);
        MessageProxy.unRegisterMessageHandler(65297, this.f9480x);
        MessageProxy.unRegisterMessageHandler(UIMsg.MsgDefine.V_WM_VSTREETCLICKBACKGROUND, this.f9480x);
        MessageProxy.unRegisterMessageHandler(50, this.f9480x);
        MessageProxy.unRegisterMessageHandler(51, this.f9480x);
        MessageProxy.unRegisterMessageHandler(65301, this.f9480x);
        MessageProxy.unRegisterMessageHandler(41, this.f9480x);
        MessageProxy.unRegisterMessageHandler(UIMsg.MsgDefine.MSG_MAP_DATA_NET_RESPONSE, this.f9480x);
        MessageProxy.unRegisterMessageHandler(UIMsg.MsgDefine.V_WM_PRISM_FLOOR_ANIMATE_STOP, this.f9480x);
    }

    public void saveScreenToLocal(String str) {
        saveScreenToLocal(str, 0, 0, 0, 0);
    }

    public void setMapStatus(Bundle bundle) {
        if (a()) {
            this.f9478v.SetMapStatus(bundle);
        }
    }

    public void setMapStatus(MapStatus mapStatus) {
        if (!a() || mapStatus == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putDouble("level", mapStatus.level);
        bundle.putDouble("rotation", mapStatus.rotation);
        bundle.putDouble("overlooking", mapStatus.overlooking);
        bundle.putDouble("centerptx", mapStatus.centerPtX);
        bundle.putDouble("centerpty", mapStatus.centerPtY);
        bundle.putDouble("centerptz", mapStatus.centerPtZ);
        bundle.putInt(TtmlNode.LEFT, mapStatus.winRound.left);
        bundle.putInt(TtmlNode.RIGHT, mapStatus.winRound.right);
        bundle.putInt("top", mapStatus.winRound.top);
        bundle.putInt("bottom", mapStatus.winRound.bottom);
        bundle.putLong("gleft", mapStatus.geoRound.left);
        bundle.putLong("gbottom", mapStatus.geoRound.bottom);
        bundle.putLong("gtop", mapStatus.geoRound.top);
        bundle.putLong("gright", mapStatus.geoRound.right);
        bundle.putFloat("yoffset", mapStatus.yOffset);
        bundle.putFloat("xoffset", mapStatus.xOffset);
        bundle.putInt("animatime", mapStatus.animationTime);
        bundle.putInt("animation", mapStatus.hasAnimation);
        bundle.putInt("animationType", mapStatus.animationType);
        bundle.putInt("bfpp", mapStatus.bfpp ? 1 : 0);
        bundle.putString("panoid", mapStatus.panoId);
        bundle.putInt("autolink", 0);
        bundle.putFloat("siangle", mapStatus.streetIndicateAngle);
        bundle.putInt("isbirdeye", mapStatus.isBirdEye ? 1 : 0);
        bundle.putInt("ssext", mapStatus.streetExt);
        bundle.putFloat("roadOffsetX", mapStatus.roadOffsetX);
        bundle.putFloat("roadOffsetY", mapStatus.roadOffsetY);
        bundle.putFloat("adapterZoomUnits", mapStatus.adapterZoomUnits);
        mapStatusChangeStart();
        this.f9478v.SetMapStatus(bundle);
    }

    public void setMapStatusWithAnimation(MapStatus mapStatus, int i8) {
        if (!a() || this.f9478v == null || mapStatus == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putDouble("level", mapStatus.level);
        bundle.putDouble("rotation", mapStatus.rotation);
        bundle.putDouble("overlooking", mapStatus.overlooking);
        if (isCompass || this.J) {
            bundle.putDouble("centerptx", mapStatus.centerPtX);
            bundle.putDouble("centerpty", mapStatus.centerPtY);
        } else if (this.f9473q == null || !this.f9475s) {
            LatLng latLng = this.f9474r;
            if (latLng != null && this.f9475s) {
                GeoPoint ll2mc = CoordUtil.ll2mc(latLng);
                bundle.putDouble("centerptx", ll2mc.getLongitudeE6());
                bundle.putDouble("centerpty", ll2mc.getLatitudeE6());
            } else {
                bundle.putDouble("centerptx", mapStatus.centerPtX);
                bundle.putDouble("centerpty", mapStatus.centerPtY);
            }
        } else {
            Projection projection = this.f9457d0.get().getProjection();
            Point point = this.f9473q;
            GeoPoint fromPixels = projection.fromPixels(point.x, point.y);
            bundle.putDouble("centerptx", fromPixels.getLongitudeE6());
            bundle.putDouble("centerpty", fromPixels.getLatitudeE6());
        }
        bundle.putDouble("centerptz", mapStatus.centerPtZ);
        bundle.putInt(TtmlNode.LEFT, mapStatus.winRound.left);
        bundle.putInt(TtmlNode.RIGHT, mapStatus.winRound.right);
        bundle.putInt("top", mapStatus.winRound.top);
        bundle.putInt("bottom", mapStatus.winRound.bottom);
        bundle.putLong("gleft", mapStatus.geoRound.left);
        bundle.putLong("gright", mapStatus.geoRound.right);
        bundle.putLong("gbottom", mapStatus.geoRound.bottom);
        bundle.putLong("gtop", mapStatus.geoRound.top);
        bundle.putFloat("xoffset", mapStatus.xOffset);
        bundle.putFloat("yoffset", mapStatus.yOffset);
        bundle.putInt("animation", 1);
        bundle.putInt("animatime", i8);
        bundle.putInt("bfpp", mapStatus.bfpp ? 1 : 0);
        bundle.putString("panoid", mapStatus.panoId);
        bundle.putInt("autolink", 0);
        bundle.putFloat("siangle", mapStatus.streetIndicateAngle);
        bundle.putInt("isbirdeye", mapStatus.isBirdEye ? 1 : 0);
        bundle.putInt("ssext", mapStatus.streetExt);
        bundle.putFloat("roadOffsetX", mapStatus.roadOffsetX);
        bundle.putFloat("roadOffsetY", mapStatus.roadOffsetY);
        bundle.putFloat("adapterZoomUnits", mapStatus.adapterZoomUnits);
        mapStatusChangeStart();
        this.mIsAnimating = true;
        this.f9478v.SetMapStatus(bundle);
    }

    public void setMapStatusWithAnimation(MapStatus mapStatus, int i8, int i9) {
        if (!a() || this.f9478v == null || mapStatus == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("animationType", i8);
        bundle.putInt("animatime", i9);
        bundle.putInt(TtmlNode.LEFT, mapStatus.winRound.left);
        bundle.putInt(TtmlNode.RIGHT, mapStatus.winRound.right);
        bundle.putInt("top", mapStatus.winRound.top);
        bundle.putInt("bottom", mapStatus.winRound.bottom);
        if (i8 != 4) {
            bundle.putDouble("level", mapStatus.level);
            bundle.putDouble("rotation", mapStatus.rotation);
            bundle.putDouble("overlooking", mapStatus.overlooking);
            bundle.putDouble("centerptx", mapStatus.centerPtX);
            bundle.putDouble("centerpty", mapStatus.centerPtY);
            bundle.putDouble("centerptz", mapStatus.centerPtZ);
            bundle.putLong("gleft", mapStatus.geoRound.left);
            bundle.putLong("gright", mapStatus.geoRound.right);
            bundle.putLong("gbottom", mapStatus.geoRound.bottom);
            bundle.putLong("gtop", mapStatus.geoRound.top);
            bundle.putFloat("xoffset", mapStatus.xOffset);
            bundle.putFloat("yoffset", mapStatus.yOffset);
            bundle.putInt("bfpp", mapStatus.bfpp ? 1 : 0);
            bundle.putString("panoid", mapStatus.panoId);
            bundle.putInt("autolink", 0);
            bundle.putFloat("siangle", mapStatus.streetIndicateAngle);
            bundle.putInt("isbirdeye", mapStatus.isBirdEye ? 1 : 0);
            bundle.putInt("ssext", mapStatus.streetExt);
            bundle.putFloat("roadOffsetX", mapStatus.roadOffsetX);
            bundle.putFloat("roadOffsetY", mapStatus.roadOffsetY);
            bundle.putFloat("adapterZoomUnits", mapStatus.adapterZoomUnits);
        }
        this.f9478v.SetNewMapStatus(bundle);
    }

    private void b() {
        MessageProxy.registerMessageHandler(4000, this.f9480x);
        MessageProxy.registerMessageHandler(519, this.f9480x);
        MessageProxy.registerMessageHandler(39, this.f9480x);
        MessageProxy.registerMessageHandler(512, this.f9480x);
        MessageProxy.registerMessageHandler(65297, this.f9480x);
        MessageProxy.registerMessageHandler(UIMsg.MsgDefine.V_WM_VSTREETCLICKBACKGROUND, this.f9480x);
        MessageProxy.registerMessageHandler(50, this.f9480x);
        MessageProxy.registerMessageHandler(51, this.f9480x);
        MessageProxy.registerMessageHandler(65301, this.f9480x);
        MessageProxy.registerMessageHandler(41, this.f9480x);
        MessageProxy.registerMessageHandler(UIMsg.MsgDefine.MSG_MAP_DATA_NET_RESPONSE, this.f9480x);
        MessageProxy.registerMessageHandler(UIMsg.MsgDefine.V_WM_PRISM_FLOOR_ANIMATE_STOP, this.f9480x);
    }

    private void a(MotionEvent motionEvent) {
        int x7 = (int) motionEvent.getX();
        int y7 = (int) motionEvent.getY();
        f9449c = x7;
        f9450d = y7;
        MapMsgProc(4, 0, x7 | (y7 << 16));
        f9451e = true;
        this.f9459f0 = motionEvent.getDownTime();
    }

    private boolean a(int i8, int i9, boolean z7) {
        SoftReference<MapViewInterface> softReference = this.f9457d0;
        if (softReference != null && softReference.get() != null) {
            int zoomUnitsInMeter = (int) (this.nearlyRadius * getZoomUnitsInMeter());
            MapViewInterface mapViewInterface = this.f9457d0.get();
            for (int size = mapViewInterface.getBmlayers().size() - 1; size >= 0; size--) {
                if (mapViewInterface.getBmlayers().get(size).a(i8, i9, zoomUnitsInMeter, z7, this.V)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean a(int i8, int i9, int i10) {
        int i11;
        long j8;
        int i12;
        int i13;
        String GetNearlyObjID;
        boolean z7 = false;
        if (!a()) {
            return false;
        }
        SoftReference<MapViewInterface> softReference = this.f9457d0;
        if (softReference != null && softReference.get() != null) {
            MapViewInterface mapViewInterface = this.f9457d0.get();
            long j9 = 0;
            try {
                for (int size = mapViewInterface.getOverlays().size() - 1; size >= 0; size--) {
                    Overlay overlay = mapViewInterface.getOverlays().get(size);
                    if (overlay.mType == 27) {
                        j9 = overlay.mLayerID;
                        int zoomUnitsInMeter = (int) (this.nearlyRadius * getZoomUnitsInMeter());
                        AppBaseMap appBaseMap = this.f9478v;
                        if (appBaseMap != null && (GetNearlyObjID = appBaseMap.GetNearlyObjID(j9, i9, i10, zoomUnitsInMeter)) != null && !GetNearlyObjID.equals("")) {
                            JSONObject jSONObject = (JSONObject) new JSONObject(GetNearlyObjID).getJSONArray("dataset").get(0);
                            i11 = jSONObject.getInt("itemindex");
                            try {
                                i13 = jSONObject.optInt("clickindex", -1);
                                j8 = j9;
                                i12 = i11;
                                z7 = true;
                                break;
                            } catch (JSONException unused) {
                                j8 = j9;
                                i12 = i11;
                                i13 = -1;
                                if (i8 == 1) {
                                    GeoPoint fromPixels = mapViewInterface.getProjection().fromPixels(i9, i10);
                                    if (i13 == -1) {
                                    }
                                }
                                return z7;
                            }
                        }
                    }
                }
                j8 = j9;
                i12 = -1;
            } catch (JSONException unused2) {
                i11 = -1;
            }
            i13 = -1;
            if (i8 == 1 && getMapViewListener() != null && getMapView() != null && getMapView().getProjection() != null) {
                GeoPoint fromPixels2 = mapViewInterface.getProjection().fromPixels(i9, i10);
                if (i13 == -1) {
                    getMapViewListener().onClickedItem(i12, i13, fromPixels2, j8);
                } else {
                    getMapViewListener().onClickedItem(i12, fromPixels2, j8);
                }
            }
        }
        return z7;
    }

    private MapStatus a(boolean z7) {
        if (!a()) {
            return new MapStatus();
        }
        Bundle GetMapStatus = this.f9478v.GetMapStatus(z7);
        if (GetMapStatus == null) {
            return new MapStatus();
        }
        MapStatus mapStatus = new MapStatus();
        mapStatus.level = (float) GetMapStatus.getDouble("level");
        mapStatus.rotation = (int) GetMapStatus.getDouble("rotation");
        mapStatus.overlooking = (int) GetMapStatus.getDouble("overlooking");
        mapStatus.centerPtX = GetMapStatus.getDouble("centerptx");
        mapStatus.centerPtY = GetMapStatus.getDouble("centerpty");
        mapStatus.centerPtZ = GetMapStatus.getDouble("centerptz");
        mapStatus.winRound.left = GetMapStatus.getInt(TtmlNode.LEFT);
        mapStatus.winRound.right = GetMapStatus.getInt(TtmlNode.RIGHT);
        mapStatus.winRound.top = GetMapStatus.getInt("top");
        mapStatus.winRound.bottom = GetMapStatus.getInt("bottom");
        mapStatus.geoRound.left = GetMapStatus.getLong("gleft");
        mapStatus.geoRound.right = GetMapStatus.getLong("gright");
        mapStatus.geoRound.top = GetMapStatus.getLong("gtop");
        mapStatus.geoRound.bottom = GetMapStatus.getLong("gbottom");
        mapStatus.xOffset = GetMapStatus.getFloat("xoffset");
        mapStatus.yOffset = GetMapStatus.getFloat("yoffset");
        mapStatus.bfpp = GetMapStatus.getInt("bfpp") == 1;
        mapStatus.panoId = GetMapStatus.getString("panoid");
        mapStatus.streetIndicateAngle = GetMapStatus.getFloat("siangle");
        mapStatus.isBirdEye = GetMapStatus.getInt("isbirdeye") == 1;
        mapStatus.streetExt = GetMapStatus.getInt("ssext");
        mapStatus.roadOffsetX = GetMapStatus.getFloat("roadOffsetX");
        mapStatus.roadOffsetY = GetMapStatus.getFloat("roadOffsetY");
        mapStatus.bOverlookSpringback = GetMapStatus.getInt("boverlookback") == 1;
        mapStatus.minOverlooking = (int) GetMapStatus.getFloat("minoverlook");
        mapStatus.xScreenOffset = GetMapStatus.getFloat("xScreenOffset");
        mapStatus.yScreenOffset = GetMapStatus.getFloat("yScreenOffset");
        mapStatus.adapterZoomUnits = GetMapStatus.getFloat("adapterZoomUnits");
        MapStatus.GeoBound geoBound = mapStatus.geoRound;
        if (geoBound.left <= -20037508) {
            geoBound.left = -20037508L;
        }
        if (geoBound.right >= 20037508) {
            geoBound.right = 20037508L;
        }
        if (geoBound.top >= 20037508) {
            geoBound.top = 20037508L;
        }
        if (geoBound.bottom <= -20037508) {
            geoBound.bottom = -20037508L;
        }
        return mapStatus;
    }
}
