package com.baidu.mapapi.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.NetworkUtil;
import com.baidu.mapapi.OpenLogUtil;
import com.baidu.mapapi.PermissionUtils;
import com.baidu.mapapi.common.SysOSUtil;
import com.baidu.mapapi.map.HexagonMap;
import com.baidu.mapapi.map.InfoWindow;
import com.baidu.mapapi.map.MapBaseIndoorMapInfo;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapViewLayoutParams;
import com.baidu.mapapi.map.MyLocationConfiguration;
import com.baidu.mapapi.map.Overlay;
import com.baidu.mapapi.map.bmsdk.ui.BaseUI;
import com.baidu.mapapi.map.track.TraceAnimationListener;
import com.baidu.mapapi.map.track.TraceOptions;
import com.baidu.mapapi.map.track.TraceOverlay;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;
import com.baidu.mapsdkplatform.comapi.map.q;
import com.baidu.mapsdkplatform.comapi.map.r;
import com.baidu.mapsdkplatform.comapi.map.s;
import com.baidu.platform.comapi.JNIInitializer;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.bmsdk.Bm3DModel;
import com.baidu.platform.comapi.bmsdk.BmArc;
import com.baidu.platform.comapi.bmsdk.BmBaseLine;
import com.baidu.platform.comapi.bmsdk.BmCircle;
import com.baidu.platform.comapi.bmsdk.BmDrawItem;
import com.baidu.platform.comapi.bmsdk.BmGround;
import com.baidu.platform.comapi.bmsdk.BmIconMarker;
import com.baidu.platform.comapi.bmsdk.BmLayer;
import com.baidu.platform.comapi.bmsdk.BmMultiPoint;
import com.baidu.platform.comapi.bmsdk.BmPolygon;
import com.baidu.platform.comapi.bmsdk.BmPrism;
import com.baidu.platform.comapi.bmsdk.BmTextMarker;
import com.baidu.platform.comapi.bmsdk.ui.BmBaseUI;
import com.baidu.platform.comapi.logstatistics.SDKLogFactory;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.baidu.platform.comapi.map.MapSurfaceView;
import com.baidu.platform.comapi.map.MapTextureView;
import com.baidu.platform.comapi.map.OverlayLocationData;
import com.baidu.platform.comapi.map.w;
import com.baidu.platform.comapi.map.x;
import com.baidu.platform.comjni.map.basemap.AppBaseMap;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.my.lib.data.ErrorCode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class BaiduMap implements com.baidu.mapsdkplatform.comapi.util.c {
    public static final int MAP_TYPE_NONE = 3;
    public static final int MAP_TYPE_NORMAL = 1;
    public static final int MAP_TYPE_SATELLITE = 2;
    public static final float REAL_MAX_ZOOM_LEVEL = 22.0f;
    public static final float REAL_MIN_ZOOM_LEVEL = 4.0f;

    /* renamed from: a, reason: collision with root package name */
    private static final String f5626a = "BaiduMap";
    public static int mapStatusReason = 256;
    private OnMarkerDragListener J;
    private OnMyLocationClickListener K;
    private SnapshotReadyCallback L;
    private Building3DListener M;
    private CopyOnWriteArrayList<Building> N;
    private OnMapDrawFrameCallback O;
    private OnBaseIndoorMapListener P;
    private OnMapRenderValidDataListener Q;
    private OnHeatMapDrawFrameCallBack R;
    private OnSynchronizationListener S;
    com.baidu.mapapi.c T;
    private TileOverlay U;
    private HeatMap V;
    private HexagonMap W;

    /* renamed from: a0, reason: collision with root package name */
    private Map<String, InfoWindow> f5627a0;

    /* renamed from: b, reason: collision with root package name */
    private Projection f5628b;

    /* renamed from: b0, reason: collision with root package name */
    private Map<InfoWindow, Marker> f5629b0;

    /* renamed from: c, reason: collision with root package name */
    private UiSettings f5630c;

    /* renamed from: c0, reason: collision with root package name */
    private Marker f5631c0;

    /* renamed from: d, reason: collision with root package name */
    private MapSurfaceView f5632d;

    /* renamed from: d0, reason: collision with root package name */
    private MyLocationData f5633d0;

    /* renamed from: e, reason: collision with root package name */
    private MapTextureView f5634e;

    /* renamed from: e0, reason: collision with root package name */
    private MyLocationConfiguration f5635e0;

    /* renamed from: f, reason: collision with root package name */
    private NaviMapExpand f5636f;

    /* renamed from: f0, reason: collision with root package name */
    private OnLocationModeChangeListener f5637f0;

    /* renamed from: g, reason: collision with root package name */
    private final com.baidu.mapsdkplatform.comapi.map.b f5638g;

    /* renamed from: g0, reason: collision with root package name */
    MapView f5639g0;

    /* renamed from: h, reason: collision with root package name */
    private BmLayer f5640h;

    /* renamed from: h0, reason: collision with root package name */
    TextureMapView f5641h0;

    /* renamed from: i, reason: collision with root package name */
    private List<Overlay> f5642i;

    /* renamed from: i0, reason: collision with root package name */
    WearMapView f5643i0;

    /* renamed from: j, reason: collision with root package name */
    private List<Marker> f5644j;

    /* renamed from: j0, reason: collision with root package name */
    r f5645j0;

    /* renamed from: k, reason: collision with root package name */
    private List<Marker> f5646k;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f5647k0;

    /* renamed from: l, reason: collision with root package name */
    private List<InfoWindow> f5648l;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f5649l0;

    /* renamed from: m, reason: collision with root package name */
    private Overlay.a f5650m;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f5651m0;

    /* renamed from: n, reason: collision with root package name */
    private BaseUI.onBaseUIListener f5652n;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f5653n0;

    /* renamed from: o, reason: collision with root package name */
    private HexagonMap.b f5654o;

    /* renamed from: o0, reason: collision with root package name */
    private Point f5655o0;

    /* renamed from: p, reason: collision with root package name */
    private InfoWindow.a f5656p;

    /* renamed from: q, reason: collision with root package name */
    private InfoWindowAdapter f5658q;

    /* renamed from: r, reason: collision with root package name */
    private OnMapStatusChangeListener f5660r;

    /* renamed from: r0, reason: collision with root package name */
    private com.baidu.mapsdkplatform.comapi.map.z.c f5661r0;

    /* renamed from: s, reason: collision with root package name */
    private OnMapTouchListener f5662s;

    /* renamed from: t, reason: collision with root package name */
    private onMapGestureListener f5664t;

    /* renamed from: u, reason: collision with root package name */
    private OnMapClickListener f5665u;

    /* renamed from: v, reason: collision with root package name */
    private OnMapLoadedCallback f5666v;

    /* renamed from: w, reason: collision with root package name */
    private OnMapTileLoadedCallback f5667w;

    /* renamed from: x, reason: collision with root package name */
    private OnMapRenderCallback f5668x;

    /* renamed from: y, reason: collision with root package name */
    private OnMapDoubleClickListener f5669y;

    /* renamed from: z, reason: collision with root package name */
    private OnMapLongClickListener f5670z;
    private CopyOnWriteArrayList<OnMarkerClickListener> A = new CopyOnWriteArrayList<>();
    private CopyOnWriteArrayList<OnMarkerWithBaseUIClickListener> B = new CopyOnWriteArrayList<>();
    private CopyOnWriteArrayList<OnPolylineClickListener> C = new CopyOnWriteArrayList<>();
    private CopyOnWriteArrayList<OnMultiPointClickListener> D = new CopyOnWriteArrayList<>();
    private CopyOnWriteArrayList<OnCircleClickListener> E = new CopyOnWriteArrayList<>();
    private CopyOnWriteArrayList<OnPolygonClickListener> F = new CopyOnWriteArrayList<>();
    private CopyOnWriteArrayList<OnGroundOverlayClickListener> G = new CopyOnWriteArrayList<>();
    private CopyOnWriteArrayList<OnTextClickListener> H = new CopyOnWriteArrayList<>();
    private CopyOnWriteArrayList<OnArcClickListener> I = new CopyOnWriteArrayList<>();
    private Lock X = new ReentrantLock();
    private Lock Y = new ReentrantLock();
    private Lock Z = new ReentrantLock();

    /* renamed from: p0, reason: collision with root package name */
    private volatile boolean f5657p0 = false;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f5659q0 = false;

    /* renamed from: s0, reason: collision with root package name */
    private boolean f5663s0 = false;

    public interface OnArcClickListener {
        boolean onArcClick(Arc arc);
    }

    public interface OnBaseIndoorMapListener {
        void onBaseIndoorMapMode(boolean z7, MapBaseIndoorMapInfo mapBaseIndoorMapInfo);
    }

    public interface OnCircleClickListener {
        boolean onCircleClick(Circle circle);
    }

    public interface OnGroundOverlayClickListener {
        boolean onGroundOverlayClick(GroundOverlay groundOverlay);
    }

    public interface OnHeatMapDrawFrameCallBack {
        void frameIndex(int i8);
    }

    public interface OnLocationModeChangeListener {
        void onLocationModeChange(MyLocationConfiguration.LocationMode locationMode);
    }

    public interface OnMapClickListener {
        void onMapClick(LatLng latLng);

        void onMapPoiClick(MapPoi mapPoi);
    }

    public interface OnMapDoubleClickListener {
        void onMapDoubleClick(LatLng latLng);
    }

    public interface OnMapDrawFrameCallback {
        void onMapDrawFrame(MapStatus mapStatus);

        @Deprecated
        void onMapDrawFrame(GL10 gl10, MapStatus mapStatus);
    }

    public interface OnMapLoadedCallback {
        void onMapLoaded();
    }

    public interface OnMapLongClickListener {
        void onMapLongClick(LatLng latLng);
    }

    public interface OnMapRenderCallback {
        void onMapRenderFinished();
    }

    public interface OnMapRenderValidDataListener {
        void onMapRenderValidData(boolean z7, int i8, String str);
    }

    public interface OnMapStatusChangeListener {
        public static final int REASON_API_ANIMATION = 2;
        public static final int REASON_DEVELOPER_ANIMATION = 3;
        public static final int REASON_GESTURE = 1;

        void onMapStatusChange(MapStatus mapStatus);

        void onMapStatusChangeFinish(MapStatus mapStatus);

        void onMapStatusChangeStart(MapStatus mapStatus);

        void onMapStatusChangeStart(MapStatus mapStatus, int i8);
    }

    public interface OnMapTileLoadedCallback {
        void onFirstMapTileLoaded();
    }

    public interface OnMapTouchListener {
        void onTouch(MotionEvent motionEvent);
    }

    public interface OnMarkerClickListener {
        boolean onMarkerClick(Marker marker);
    }

    public interface OnMarkerDragListener {
        void onMarkerDrag(Marker marker);

        void onMarkerDragEnd(Marker marker);

        void onMarkerDragStart(Marker marker);
    }

    public interface OnMarkerWithBaseUIClickListener {
        void onMarkerClick(Marker marker);

        void onMarkerClick(Marker marker, BaseUI baseUI);
    }

    public interface OnMultiPointClickListener {
        boolean onMultiPointClick(MultiPoint multiPoint, MultiPointItem multiPointItem);
    }

    public interface OnMyLocationClickListener {
        boolean onMyLocationClick();
    }

    public interface OnPolygonClickListener {
        boolean onPolygonClick(Polygon polygon);
    }

    public interface OnPolylineClickListener {
        boolean onPolylineClick(Polyline polyline);
    }

    public interface OnSynchronizationListener {
        void onMapStatusChangeReason(int i8);
    }

    public interface OnTextClickListener {
        boolean onTextClick(Text text);
    }

    public interface SnapshotReadyCallback {
        void onSnapshotReady(Bitmap bitmap);
    }

    class a implements BaseUI.onBaseUIListener {
        a() {
        }

        @Override // com.baidu.mapapi.map.bmsdk.ui.BaseUI.onBaseUIListener
        public void onBaseUIRemove(BaseUI baseUI) {
            if (BaiduMap.this.f5640h != null) {
                BaiduMap.this.f5640h.b();
            }
        }

        @Override // com.baidu.mapapi.map.bmsdk.ui.BaseUI.onBaseUIListener
        public void onBaseUIUpdate(BaseUI baseUI) {
            if (BaiduMap.this.f5640h != null) {
                BaiduMap.this.f5640h.b();
            }
        }
    }

    class b implements com.baidu.platform.comapi.map.c {
        b() {
        }

        @Override // com.baidu.platform.comapi.map.c
        public void a(Bitmap bitmap) {
            BaiduMap.this.L.onSnapshotReady(bitmap);
        }
    }

    class c implements com.baidu.platform.comapi.map.c {
        c() {
        }

        @Override // com.baidu.platform.comapi.map.c
        public void a(Bitmap bitmap) {
            BaiduMap.this.L.onSnapshotReady(bitmap);
        }
    }

    class d implements com.baidu.platform.comapi.map.c {
        d() {
        }

        @Override // com.baidu.platform.comapi.map.c
        public void a(Bitmap bitmap) {
            BaiduMap.this.L.onSnapshotReady(bitmap);
        }
    }

    class e implements com.baidu.platform.comapi.map.c {
        e() {
        }

        @Override // com.baidu.platform.comapi.map.c
        public void a(Bitmap bitmap) {
            BaiduMap.this.L.onSnapshotReady(bitmap);
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i8 = g.f5678b[BaiduMap.this.f5645j0.ordinal()];
            if (i8 == 1) {
                if (BaiduMap.this.f5634e != null) {
                    BaiduMap.this.f5634e.requestRender();
                }
            } else if (i8 == 2 && BaiduMap.this.f5632d != null) {
                BaiduMap.this.f5632d.requestRender();
            }
        }
    }

    static /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5677a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f5678b;

        static {
            int[] iArr = new int[r.values().length];
            f5678b = iArr;
            try {
                iArr[r.TextureView.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5678b[r.GLSurfaceView.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[MyLocationConfiguration.LocationMode.values().length];
            f5677a = iArr2;
            try {
                iArr2[MyLocationConfiguration.LocationMode.COMPASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5677a[MyLocationConfiguration.LocationMode.FOLLOWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5677a[MyLocationConfiguration.LocationMode.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    class h implements com.baidu.mapapi.c {
        h() {
        }

        @Override // com.baidu.mapapi.c
        public void a() {
            if (BaiduMap.this.f5638g == null || !BaiduMap.this.f5638g.L()) {
                return;
            }
            BaiduMap.this.f5638g.Z();
        }
    }

    class j implements Overlay.a {
        j() {
        }

        @Override // com.baidu.mapapi.map.Overlay.a
        public LatLngBounds a(Overlay overlay) {
            if (BaiduMap.this.f5638g == null || overlay == null) {
                return null;
            }
            Bundle bundle = new Bundle();
            overlay.a(bundle);
            return BaiduMap.this.f5638g.f(bundle);
        }

        @Override // com.baidu.mapapi.map.Overlay.a
        public boolean b(Overlay overlay) {
            return (BaiduMap.this.f5642i == null || BaiduMap.this.f5642i.contains(overlay)) ? false : true;
        }

        @Override // com.baidu.mapapi.map.Overlay.a
        public void c(Overlay overlay) {
            if (BaiduMap.this.f5657p0) {
                return;
            }
            if (overlay != null && BaiduMap.this.f5642i.contains(overlay)) {
                if (!OverlayUtil.isOverlayUpgrade() || (overlay instanceof Dot)) {
                    Bundle a8 = overlay.a();
                    if (BaiduMap.this.f5638g != null) {
                        BaiduMap.this.f5638g.i(a8);
                    }
                }
                BaiduMap.this.f5642i.remove(overlay);
            }
            if (overlay != null && BaiduMap.this.f5646k.contains(overlay)) {
                BaiduMap.this.f5646k.remove(overlay);
            }
            if (overlay != null && BaiduMap.this.N.contains(overlay)) {
                BaiduMap.this.N.remove(overlay);
            }
            if (overlay == null || !BaiduMap.this.f5644j.contains(overlay)) {
                return;
            }
            Marker marker = (Marker) overlay;
            if (marker.G != null) {
                BaiduMap.this.f5644j.remove(marker);
                if (BaiduMap.this.f5644j.size() != 0 || BaiduMap.this.f5638g == null) {
                    return;
                }
                BaiduMap.this.f5638g.s(false);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
        @Override // com.baidu.mapapi.map.Overlay.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void d(Overlay overlay) {
            boolean z7;
            if (BaiduMap.this.f5657p0) {
                return;
            }
            if (overlay != null && BaiduMap.this.f5642i.contains(overlay)) {
                if (overlay instanceof Marker) {
                    Marker marker = (Marker) overlay;
                    z7 = true;
                    if (marker.f6025h != null) {
                        ArrayList<BitmapDescriptor> arrayList = marker.G;
                        if (arrayList != null && arrayList.size() > 1) {
                            Bundle bundle = new Bundle();
                            if (BaiduMap.this.f5638g != null && !BaiduMap.this.f5657p0) {
                                marker.remove();
                                marker.G.clear();
                                BaiduMap.this.f5638g.d(overlay.a(bundle));
                                BaiduMap.this.f5642i.add(overlay);
                                if (BaiduMap.this.f5638g != null && !z7 && !BaiduMap.this.f5657p0) {
                                    if (OverlayUtil.isOverlayUpgrade()) {
                                        BaiduMap.this.f5638g.l(overlay.a(new Bundle()));
                                    } else if (overlay instanceof Polyline) {
                                        BaiduMap.this.c(overlay);
                                    } else {
                                        BaiduMap.this.f5638g.l(overlay.a(new Bundle()));
                                    }
                                }
                            }
                        }
                    } else {
                        ArrayList<BitmapDescriptor> arrayList2 = marker.G;
                        if (arrayList2 != null && arrayList2.size() != 0) {
                            if (BaiduMap.this.f5644j.contains(marker)) {
                                BaiduMap.this.f5644j.remove(marker);
                            }
                            BaiduMap.this.f5644j.add(marker);
                            if (BaiduMap.this.f5638g != null) {
                                BaiduMap.this.f5638g.s(true);
                            }
                        }
                    }
                }
                z7 = false;
                if (BaiduMap.this.f5638g != null) {
                    if (OverlayUtil.isOverlayUpgrade()) {
                    }
                }
            }
            if (BaiduMap.this.f5646k.contains(overlay)) {
                BaiduMap.this.f5646k.remove(overlay);
            }
            if (BaiduMap.this.N.contains(overlay)) {
                BaiduMap.this.N.remove(overlay);
            }
            if (overlay instanceof Marker) {
                BaiduMap.this.f5646k.add((Marker) overlay);
            }
            if (overlay instanceof Building) {
                BaiduMap.this.N.add((Building) overlay);
            }
        }
    }

    class k implements InfoWindow.a {
        k() {
        }

        @Override // com.baidu.mapapi.map.InfoWindow.a
        public void a(InfoWindow infoWindow) {
            BaiduMap.this.hideInfoWindow(infoWindow);
        }

        @Override // com.baidu.mapapi.map.InfoWindow.a
        public void b(InfoWindow infoWindow) {
            BaiduMap.this.b(infoWindow);
        }
    }

    class l implements x {
        l() {
        }

        @Override // com.baidu.platform.comapi.map.x
        public void a(int i8) {
            for (int i9 = 0; i9 < BaiduMap.this.N.size(); i9++) {
                if (((Building) BaiduMap.this.N.get(i9)).getBuildingId() == i8) {
                    BaiduMap.this.M.onBuildingFloorAnimationStop((Building) BaiduMap.this.N.get(i9));
                }
            }
        }
    }

    class m implements w {

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InfoWindow f5685a;

            a(InfoWindow infoWindow) {
                this.f5685a = infoWindow;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f5685a.f5909c.setLayoutParams(new MapViewLayoutParams.Builder().layoutMode(MapViewLayoutParams.ELayoutMode.mapMode).position(this.f5685a.f5910d).yOffset(this.f5685a.f5916j).build());
            }
        }

        m() {
        }

        @Override // com.baidu.platform.comapi.map.w
        public void a(s sVar) {
            if (BaiduMap.this.f5660r != null) {
                BaiduMap.this.f5660r.onMapStatusChange(MapStatus.a(sVar));
            }
        }

        @Override // com.baidu.platform.comapi.map.w
        public void b() {
        }

        @Override // com.baidu.platform.comapi.map.w
        public void c(s sVar) {
            int i8 = BaiduMap.mapStatusReason;
            int i9 = (i8 & 256) == 256 ? 3 : (i8 & 16) == 16 ? 2 : 1;
            if (BaiduMap.this.f5660r != null) {
                MapStatus a8 = MapStatus.a(sVar);
                BaiduMap.this.f5660r.onMapStatusChangeStart(a8);
                BaiduMap.this.f5660r.onMapStatusChangeStart(a8, i9);
            }
            if (BaiduMap.this.S != null) {
                BaiduMap.this.S.onMapStatusChangeReason(i9);
            }
            BaiduMap.mapStatusReason = 0;
        }

        @Override // com.baidu.platform.comapi.map.w
        public boolean d(Point point, Point point2, s sVar) {
            MapStatus a8 = MapStatus.a(sVar);
            if (BaiduMap.this.f5664t == null) {
                return false;
            }
            BaiduMap.mapStatusReason = 1;
            return BaiduMap.this.f5664t.onMapOverLooking(point, point2, a8);
        }

        @Override // com.baidu.platform.comapi.map.w
        public void e(GeoPoint geoPoint) {
            if (BaiduMap.this.f5631c0 == null || !BaiduMap.this.f5631c0.f6032o) {
                return;
            }
            BaiduMap.this.f5631c0.setPosition(BaiduMap.this.f5628b.fromScreenLocation(new Point(BaiduMap.this.f5628b.toScreenLocation(CoordUtil.mc2ll(geoPoint)).x, r3.y - 60)));
            if (BaiduMap.this.J != null && BaiduMap.this.f5631c0.f6032o) {
                BaiduMap.this.J.onMarkerDragEnd(BaiduMap.this.f5631c0);
            }
            BaiduMap.this.f5631c0 = null;
        }

        @Override // com.baidu.platform.comapi.map.w
        public void f(GeoPoint geoPoint) {
            if (BaiduMap.this.f5665u != null) {
                BaiduMap.this.f5665u.onMapClick(CoordUtil.mc2ll(geoPoint));
            }
        }

        @Override // com.baidu.platform.comapi.map.w
        public void g(GeoPoint geoPoint) {
            if (BaiduMap.this.f5670z != null) {
                BaiduMap.this.f5670z.onMapLongClick(CoordUtil.mc2ll(geoPoint));
            }
        }

        @Override // com.baidu.platform.comapi.map.w
        public void onFirstMapTileLoaded() {
            if (BaiduMap.this.f5667w != null) {
                BaiduMap.this.f5667w.onFirstMapTileLoaded();
            }
        }

        @Override // com.baidu.platform.comapi.map.w
        public void b(s sVar) {
            MapStatus a8 = MapStatus.a(sVar);
            if (BaiduMap.this.f5660r != null) {
                BaiduMap.this.f5660r.onMapStatusChangeFinish(a8);
            }
            if (BaiduMap.this.f5664t != null) {
                BaiduMap.this.f5664t.onMapStatusChangeFinish(a8);
            }
            BaiduMap.mapStatusReason = 0;
        }

        @Override // com.baidu.platform.comapi.map.w
        public void a(MotionEvent motionEvent) {
            if (BaiduMap.this.f5662s != null) {
                BaiduMap.this.f5662s.onTouch(motionEvent);
            }
        }

        @Override // com.baidu.platform.comapi.map.w
        public void d(GeoPoint geoPoint) {
            if (BaiduMap.this.f5631c0 == null || !BaiduMap.this.f5631c0.f6032o) {
                return;
            }
            BaiduMap.this.f5631c0.setPosition(BaiduMap.this.f5628b.fromScreenLocation(new Point(BaiduMap.this.f5628b.toScreenLocation(CoordUtil.mc2ll(geoPoint)).x, r3.y - 60)));
            if (BaiduMap.this.J == null || !BaiduMap.this.f5631c0.f6032o) {
                return;
            }
            BaiduMap.this.J.onMarkerDrag(BaiduMap.this.f5631c0);
        }

        @Override // com.baidu.platform.comapi.map.w
        public boolean a(Point point, Point point2, s sVar) {
            MapStatus a8 = MapStatus.a(sVar);
            if (BaiduMap.this.f5664t == null) {
                return false;
            }
            BaiduMap.mapStatusReason = 1;
            return BaiduMap.this.f5664t.onMapTwoClick(point, point2, a8);
        }

        @Override // com.baidu.platform.comapi.map.w
        public boolean b(Point point, Point point2, s sVar) {
            MapStatus a8 = MapStatus.a(sVar);
            if (BaiduMap.this.f5664t == null) {
                return false;
            }
            BaiduMap.mapStatusReason = 1;
            return BaiduMap.this.f5664t.onMapKneading(point, point2, a8);
        }

        @Override // com.baidu.platform.comapi.map.w
        public boolean c(Point point, Point point2, s sVar) {
            MapStatus a8 = MapStatus.a(sVar);
            if (BaiduMap.this.f5664t == null) {
                return false;
            }
            BaiduMap.mapStatusReason = 1;
            return BaiduMap.this.f5664t.onMapScroll(point, point2, a8);
        }

        @Override // com.baidu.platform.comapi.map.w
        public boolean a(MotionEvent motionEvent, float f8, float f9, s sVar) {
            MapStatus a8 = MapStatus.a(sVar);
            if (BaiduMap.this.f5664t == null) {
                return false;
            }
            BaiduMap.mapStatusReason = 1;
            return BaiduMap.this.f5664t.onMapFling(motionEvent, f8, f9, a8);
        }

        @Override // com.baidu.platform.comapi.map.w
        public void b(GeoPoint geoPoint) {
            if (BaiduMap.this.f5669y != null) {
                LatLng mc2ll = CoordUtil.mc2ll(geoPoint);
                BaiduMap.mapStatusReason |= 1;
                BaiduMap.this.f5669y.onMapDoubleClick(mc2ll);
            }
        }

        @Override // com.baidu.platform.comapi.map.w
        public void c() {
            BaiduMap baiduMap = BaiduMap.this;
            baiduMap.f5628b = new Projection(baiduMap.f5638g);
            BaiduMap.this.f5653n0 = true;
            if (BaiduMap.this.f5666v != null) {
                BaiduMap.this.f5666v.onMapLoaded();
            }
        }

        @Override // com.baidu.platform.comapi.map.w
        public void d() {
            if (BaiduMap.this.f5638g != null) {
                BaiduMap.this.f5638g.s(false);
            }
            BaiduMap.this.X.lock();
            try {
                if (BaiduMap.this.V != null) {
                    BaiduMap baiduMap = BaiduMap.this;
                    baiduMap.a(baiduMap.V);
                }
            } finally {
                BaiduMap.this.X.unlock();
            }
        }

        @Override // com.baidu.platform.comapi.map.w
        public boolean a(Point point, s sVar) {
            MapStatus a8 = MapStatus.a(sVar);
            if (BaiduMap.this.f5664t == null) {
                return false;
            }
            BaiduMap.mapStatusReason = 1;
            return BaiduMap.this.f5664t.onMapDoubleTouch(point, a8);
        }

        @Override // com.baidu.platform.comapi.map.w
        public void b(String str) {
            JSONObject jSONObject;
            String optString;
            InfoWindow.OnInfoWindowClickListener onInfoWindowClickListener;
            s y7;
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                GeoPoint a8 = BaiduMap.this.f5638g.a(jSONObject2.optInt("px"), jSONObject2.optInt("py"));
                JSONArray optJSONArray = jSONObject2.optJSONArray("dataset");
                int i8 = -1;
                if (optJSONArray != null) {
                    jSONObject = optJSONArray.optJSONObject(0);
                    if (jSONObject != null) {
                        i8 = jSONObject.optInt(MapBundleKey.MapObjKey.OBJ_TYPE);
                    }
                } else {
                    jSONObject = null;
                }
                if (i8 == 17) {
                    if (BaiduMap.this.f5665u != null) {
                        MapPoi mapPoi = new MapPoi();
                        mapPoi.a(jSONObject);
                        BaiduMap.this.f5665u.onMapPoiClick(mapPoi);
                        return;
                    }
                    return;
                }
                if (i8 == 18) {
                    if (BaiduMap.this.K != null) {
                        BaiduMap.this.K.onMyLocationClick();
                        return;
                    } else {
                        f(a8);
                        return;
                    }
                }
                if (i8 == 19) {
                    if (BaiduMap.this.f5638g == null || (y7 = BaiduMap.this.f5638g.y()) == null) {
                        return;
                    }
                    y7.f8150c = 0;
                    y7.f8149b = 0;
                    BaiduMap.mapStatusReason |= 16;
                    BaiduMap.this.f5638g.a(y7, 300);
                    return;
                }
                if (i8 == 6002) {
                    if (BaiduMap.this.f5665u != null) {
                        MapPoi mapPoi2 = new MapPoi();
                        mapPoi2.a(jSONObject);
                        BaiduMap.this.f5665u.onMapPoiClick(mapPoi2);
                        return;
                    }
                    return;
                }
                if (i8 == 90909) {
                    optString = jSONObject != null ? jSONObject.optString("marker_id") : "";
                    Set<String> keySet = BaiduMap.this.f5627a0.keySet();
                    if (keySet.isEmpty() || !keySet.contains(optString)) {
                        for (Overlay overlay : BaiduMap.this.f5642i) {
                            if ((overlay instanceof Marker) && overlay.f6117a.equals(optString)) {
                                if (!BaiduMap.this.A.isEmpty()) {
                                    Iterator it = BaiduMap.this.A.iterator();
                                    while (it.hasNext()) {
                                        ((OnMarkerClickListener) it.next()).onMarkerClick((Marker) overlay);
                                    }
                                    return;
                                }
                                f(a8);
                            }
                        }
                        return;
                    }
                    for (String str2 : keySet) {
                        if (str2 != null && str2.equals(optString)) {
                            InfoWindow infoWindow = (InfoWindow) BaiduMap.this.f5627a0.get(str2);
                            if (infoWindow != null && (onInfoWindowClickListener = infoWindow.f5914h) != null) {
                                onInfoWindowClickListener.onInfoWindowClick();
                                return;
                            } else {
                                f(a8);
                                return;
                            }
                        }
                    }
                    return;
                }
                if (i8 == 90910) {
                    optString = jSONObject != null ? jSONObject.optString("polyline_id") : "";
                    for (Overlay overlay2 : BaiduMap.this.f5642i) {
                        if ((overlay2 instanceof Polyline) && overlay2.f6117a.equals(optString)) {
                            if (!BaiduMap.this.C.isEmpty()) {
                                Iterator it2 = BaiduMap.this.C.iterator();
                                while (it2.hasNext()) {
                                    ((OnPolylineClickListener) it2.next()).onPolylineClick((Polyline) overlay2);
                                }
                            } else {
                                f(a8);
                            }
                        }
                    }
                    return;
                }
                if (i8 == 90911) {
                    optString = jSONObject != null ? jSONObject.optString("multipoint_id") : "";
                    for (Overlay overlay3 : BaiduMap.this.f5642i) {
                        if ((overlay3 instanceof MultiPoint) && overlay3.f6117a.equals(optString)) {
                            if (!BaiduMap.this.D.isEmpty()) {
                                Iterator it3 = BaiduMap.this.D.iterator();
                                while (it3.hasNext()) {
                                    OnMultiPointClickListener onMultiPointClickListener = (OnMultiPointClickListener) it3.next();
                                    MultiPoint multiPoint = (MultiPoint) overlay3;
                                    List<MultiPointItem> multiPointItems = multiPoint.getMultiPointItems();
                                    if (jSONObject != null) {
                                        int optInt = jSONObject.optInt("multipoint_index");
                                        if (multiPointItems != null && optInt >= 0 && multiPointItems.size() > optInt) {
                                            onMultiPointClickListener.onMultiPointClick(multiPoint, multiPointItems.get(optInt));
                                        }
                                    }
                                }
                            } else {
                                f(a8);
                            }
                        }
                    }
                    return;
                }
                if (i8 == 90912) {
                    optString = jSONObject != null ? jSONObject.optString("overlay_id") : "";
                    for (Overlay overlay4 : BaiduMap.this.f5642i) {
                        if ((overlay4 instanceof Polygon) && overlay4.f6117a.equals(optString)) {
                            if (!BaiduMap.this.F.isEmpty()) {
                                Iterator it4 = BaiduMap.this.F.iterator();
                                while (it4.hasNext()) {
                                    OnPolygonClickListener onPolygonClickListener = (OnPolygonClickListener) it4.next();
                                    if (jSONObject != null && jSONObject.has("hole_clicked_index")) {
                                        ((Polygon) overlay4).f6145w = jSONObject.optInt("hole_clicked_index");
                                    }
                                    onPolygonClickListener.onPolygonClick((Polygon) overlay4);
                                }
                            } else {
                                f(a8);
                            }
                        }
                    }
                    return;
                }
                if (i8 == 90914) {
                    if (jSONObject != null) {
                        String optString2 = jSONObject.optString("overlay_id");
                        for (Overlay overlay5 : BaiduMap.this.f5642i) {
                            if ((overlay5 instanceof Circle) && overlay5.f6117a.equals(optString2)) {
                                if (!BaiduMap.this.E.isEmpty()) {
                                    Iterator it5 = BaiduMap.this.E.iterator();
                                    while (it5.hasNext()) {
                                        OnCircleClickListener onCircleClickListener = (OnCircleClickListener) it5.next();
                                        if (jSONObject.has("hole_clicked_index")) {
                                            ((Circle) overlay5).f5737q = jSONObject.optInt("hole_clicked_index");
                                        }
                                        onCircleClickListener.onCircleClick((Circle) overlay5);
                                    }
                                }
                            } else {
                                f(a8);
                            }
                        }
                        return;
                    }
                    return;
                }
                if (i8 == 90915) {
                    optString = jSONObject != null ? jSONObject.optString("overlay_id") : "";
                    for (Overlay overlay6 : BaiduMap.this.f5642i) {
                        if ((overlay6 instanceof GroundOverlay) && overlay6.f6117a.equals(optString)) {
                            if (!BaiduMap.this.G.isEmpty()) {
                                Iterator it6 = BaiduMap.this.G.iterator();
                                while (it6.hasNext()) {
                                    ((OnGroundOverlayClickListener) it6.next()).onGroundOverlayClick((GroundOverlay) overlay6);
                                }
                            } else {
                                f(a8);
                            }
                        }
                    }
                    return;
                }
                if (i8 == 90916) {
                    optString = jSONObject != null ? jSONObject.optString("overlay_id") : "";
                    for (Overlay overlay7 : BaiduMap.this.f5642i) {
                        if ((overlay7 instanceof Text) && overlay7.f6117a.equals(optString)) {
                            if (!BaiduMap.this.H.isEmpty()) {
                                Iterator it7 = BaiduMap.this.H.iterator();
                                while (it7.hasNext()) {
                                    ((OnTextClickListener) it7.next()).onTextClick((Text) overlay7);
                                }
                            } else {
                                f(a8);
                            }
                        }
                    }
                    return;
                }
                if (i8 == 90917) {
                    optString = jSONObject != null ? jSONObject.optString("overlay_id") : "";
                    for (Overlay overlay8 : BaiduMap.this.f5642i) {
                        if ((overlay8 instanceof Arc) && overlay8.f6117a.equals(optString)) {
                            if (!BaiduMap.this.I.isEmpty()) {
                                Iterator it8 = BaiduMap.this.I.iterator();
                                while (it8.hasNext()) {
                                    ((OnArcClickListener) it8.next()).onArcClick((Arc) overlay8);
                                }
                            } else {
                                f(a8);
                            }
                        }
                    }
                    return;
                }
                if (i8 == 90918) {
                    optString = jSONObject != null ? jSONObject.optString("overlay_id") : "";
                    for (Overlay overlay9 : BaiduMap.this.f5642i) {
                        if ((overlay9 instanceof Polyline) && overlay9.f6117a.equals(optString)) {
                            if (!BaiduMap.this.C.isEmpty()) {
                                Iterator it9 = BaiduMap.this.C.iterator();
                                while (it9.hasNext()) {
                                    ((OnPolylineClickListener) it9.next()).onPolylineClick((Polyline) overlay9);
                                }
                            } else {
                                f(a8);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // com.baidu.platform.comapi.map.w
        public void c(GeoPoint geoPoint) {
            if (BaiduMap.this.f5631c0 == null || !BaiduMap.this.f5631c0.f6032o) {
                return;
            }
            BaiduMap.this.f5631c0.setPosition(BaiduMap.this.f5628b.fromScreenLocation(new Point(BaiduMap.this.f5628b.toScreenLocation(CoordUtil.mc2ll(geoPoint)).x, r3.y - 60)));
            if (BaiduMap.this.J != null && BaiduMap.this.f5631c0.f6032o) {
                BaiduMap.this.J.onMarkerDragEnd(BaiduMap.this.f5631c0);
            }
            BaiduMap.this.f5631c0 = null;
        }

        @Override // com.baidu.platform.comapi.map.w
        public void a() {
            if (BaiduMap.this.f5668x != null) {
                BaiduMap.this.f5668x.onMapRenderFinished();
            }
        }

        @Override // com.baidu.platform.comapi.map.w
        public void a(GeoPoint geoPoint) {
            if (BaiduMap.this.f5631c0 == null || !BaiduMap.this.f5631c0.f6032o) {
                return;
            }
            BaiduMap.this.f5631c0.setPosition(BaiduMap.this.f5628b.fromScreenLocation(new Point(BaiduMap.this.f5628b.toScreenLocation(CoordUtil.mc2ll(geoPoint)).x, r3.y - 60)));
            if (BaiduMap.this.J == null || !BaiduMap.this.f5631c0.f6032o) {
                return;
            }
            BaiduMap.this.J.onMarkerDrag(BaiduMap.this.f5631c0);
        }

        @Override // com.baidu.platform.comapi.map.w
        public boolean a(BmDrawItem bmDrawItem) {
            if (bmDrawItem == null) {
                return false;
            }
            Boolean bool = Boolean.FALSE;
            Iterator it = BaiduMap.this.f5642i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Overlay overlay = (Overlay) it.next();
                if ((overlay instanceof Marker) && overlay.getName().equals(bmDrawItem.getName())) {
                    Marker marker = (Marker) overlay;
                    if (marker.f6032o) {
                        BaiduMap.this.f5631c0 = marker;
                        BaiduMap.this.f5631c0.setAnimateType(0);
                        BaiduMap.this.f5631c0.setPosition(BaiduMap.this.f5628b.fromScreenLocation(new Point(BaiduMap.this.f5628b.toScreenLocation(BaiduMap.this.f5631c0.f6024g).x, r7.y - 60)));
                        if (BaiduMap.this.J != null) {
                            BaiduMap.this.J.onMarkerDragStart(BaiduMap.this.f5631c0);
                        }
                        bool = Boolean.TRUE;
                    }
                }
            }
            return bool.booleanValue();
        }

        @Override // com.baidu.platform.comapi.map.w
        public boolean a(String str) {
            JSONObject optJSONObject;
            try {
                JSONArray optJSONArray = new JSONObject(str).optJSONArray("dataset");
                if (optJSONArray == null || (optJSONObject = optJSONArray.optJSONObject(0)) == null || optJSONObject.optInt(MapBundleKey.MapObjKey.OBJ_TYPE) != 90909) {
                    return false;
                }
                String optString = optJSONObject.optString("marker_id");
                Set keySet = BaiduMap.this.f5627a0.keySet();
                if (!keySet.isEmpty() && keySet.contains(optString)) {
                    return false;
                }
                for (Overlay overlay : BaiduMap.this.f5642i) {
                    if ((overlay instanceof Marker) && overlay.f6117a.equals(optString)) {
                        Marker marker = (Marker) overlay;
                        if (!marker.f6032o) {
                            return false;
                        }
                        BaiduMap.this.f5631c0 = marker;
                        BaiduMap.this.f5631c0.setPosition(BaiduMap.this.f5628b.fromScreenLocation(new Point(BaiduMap.this.f5628b.toScreenLocation(BaiduMap.this.f5631c0.f6024g).x, r5.y - 60)));
                        if (BaiduMap.this.J != null) {
                            BaiduMap.this.J.onMarkerDragStart(BaiduMap.this.f5631c0);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // com.baidu.platform.comapi.map.w
        public void a(GL10 gl10, s sVar) {
            View view;
            if (BaiduMap.this.f5627a0 != null && !BaiduMap.this.f5627a0.values().isEmpty()) {
                for (InfoWindow infoWindow : BaiduMap.this.f5627a0.values()) {
                    if (infoWindow != null && (view = infoWindow.f5909c) != null) {
                        view.post(new a(infoWindow));
                    }
                }
            }
            if (BaiduMap.this.O != null) {
                BaiduMap.this.O.onMapDrawFrame(MapStatus.a(sVar));
            }
        }

        @Override // com.baidu.platform.comapi.map.w
        public void a(boolean z7) {
            if (BaiduMap.this.P != null) {
                if (!z7) {
                    if (BaiduMap.this.f5663s0) {
                        BaiduMap.this.P.onBaseIndoorMapMode(z7, null);
                        BaiduMap.this.f5663s0 = false;
                        return;
                    }
                    return;
                }
                BaiduMap.this.P.onBaseIndoorMapMode(z7, BaiduMap.this.getFocusedBaseIndoorMapInfo());
                BaiduMap.this.f5663s0 = true;
            }
        }

        @Override // com.baidu.platform.comapi.map.w
        public void a(boolean z7, int i8) {
            if (BaiduMap.this.Q != null) {
                BaiduMap.this.Q.onMapRenderValidData(z7, i8, BaiduMap.this.a(i8));
            }
        }
    }

    class n implements com.baidu.mapsdkplatform.comapi.map.h {
        n() {
        }

        @Override // com.baidu.mapsdkplatform.comapi.map.h
        public Bundle a(int i8, int i9) {
            BaiduMap.this.X.lock();
            try {
                if (BaiduMap.this.V == null) {
                    BaiduMap.this.X.unlock();
                    return null;
                }
                if (BaiduMap.this.R != null) {
                    BaiduMap.this.R.frameIndex(i8);
                }
                HeatMapData data = BaiduMap.this.V.getData(i8, i9);
                if (data == null) {
                    BaiduMap.this.X.unlock();
                    return null;
                }
                Bundle bundle = data.toBundle();
                BaiduMap.this.X.unlock();
                return bundle;
            } catch (Throwable th) {
                BaiduMap.this.X.unlock();
                throw th;
            }
        }
    }

    class o implements com.baidu.mapsdkplatform.comapi.map.w {
        o() {
        }

        @Override // com.baidu.mapsdkplatform.comapi.map.w
        public Bundle a(int i8, int i9, int i10, Context context) {
            BaiduMap.this.Z.lock();
            try {
                if (BaiduMap.this.U != null) {
                    Tile a8 = BaiduMap.this.U.a(i8, i9, i10);
                    StringBuilder sb = new StringBuilder();
                    sb.append("mapLayerDataReq tile t == null = ");
                    sb.append(a8 == null);
                    Log.e("SDKTileLayer", sb.toString());
                    if (a8 != null) {
                        return a8.toBundle();
                    }
                }
                BaiduMap.this.Z.unlock();
                return null;
            } finally {
                BaiduMap.this.Z.unlock();
            }
        }
    }

    public interface onMapGestureListener {
        boolean onMapDoubleTouch(Point point, MapStatus mapStatus);

        boolean onMapFling(MotionEvent motionEvent, float f8, float f9, MapStatus mapStatus);

        boolean onMapKneading(Point point, Point point2, MapStatus mapStatus);

        boolean onMapOverLooking(Point point, Point point2, MapStatus mapStatus);

        boolean onMapScroll(Point point, Point point2, MapStatus mapStatus);

        void onMapStatusChangeFinish(MapStatus mapStatus);

        boolean onMapTwoClick(Point point, Point point2, MapStatus mapStatus);
    }

    BaiduMap(Context context, MapTextureView mapTextureView, q qVar) {
        this.f5634e = mapTextureView;
        com.baidu.mapsdkplatform.comapi.map.b bVar = new com.baidu.mapsdkplatform.comapi.map.b(context, mapTextureView, qVar, (String) null, 0);
        this.f5638g = bVar;
        mapTextureView.setBaseMap(bVar);
        r rVar = r.TextureView;
        this.f5645j0 = rVar;
        this.f5636f = new NaviMapExpand(bVar, rVar, this.f5639g0, null, this.f5641h0, this.f5634e);
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(int i8) {
        if (i8 == 0) {
            return "数据请求成功";
        }
        switch (i8) {
            case 1004:
                return "网络连接错误";
            case 1005:
                return "请求发送错误";
            case 1006:
                return "响应数据读取失败";
            case 1007:
                return "返回响应数据过大，数据溢出";
            case 1008:
                return "当前网络类型有问题";
            case 1009:
                return "数据不一致";
            case 1010:
                return "请求取消";
            case 1011:
                return "网络超时错误";
            case 1012:
                return "网络连接超时";
            case 1013:
                return "网络发送超时";
            case 1014:
                return "网络接收超时";
            case 1015:
                return "DNS解析错误";
            case 1016:
                return "DNS解析超时";
            case 1017:
                return "网络写错误";
            case 1018:
                return "SSL握手错误";
            case 1019:
                return "SSL握手超时";
            default:
                return "";
        }
    }

    public void addHeatMap(HeatMap heatMap) {
        if (heatMap == null || this.f5638g == null) {
            return;
        }
        this.X.lock();
        try {
            HeatMap heatMap2 = this.V;
            if (heatMap == heatMap2) {
                this.X.unlock();
                return;
            }
            if (heatMap2 != null) {
                heatMap2.a();
                this.V.c();
                this.V.C = null;
                this.f5638g.e();
            }
            this.V = heatMap;
            heatMap.C = this;
            Bundle bundle = heatMap.toBundle();
            this.f5638g.n(true);
            this.f5638g.g(bundle);
            HashMap hashMap = new HashMap();
            HeatMap heatMap3 = this.V;
            if (heatMap3 != null) {
                hashMap.put("H", Integer.valueOf(heatMap3.getMaxHigh()));
                hashMap.put("I", Integer.valueOf(this.V.isInitAnimation() ? 1 : 0));
                hashMap.put("F", Integer.valueOf(this.V.isFrameAnimation() ? 1 : 0));
            }
            SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "H", "0", hashMap);
            this.X.unlock();
        } catch (Throwable th) {
            this.X.unlock();
            throw th;
        }
    }

    public void addHexagonMap(HexagonMap hexagonMap) {
        if (hexagonMap == null || this.f5638g == null) {
            return;
        }
        this.Y.lock();
        if (this.W != null) {
            this.f5638g.f();
        }
        this.W = hexagonMap;
        hexagonMap.hexagonMapLayerListener = this.f5654o;
        Bundle bundle = hexagonMap.toBundle();
        this.f5638g.o(true);
        this.f5638g.b(bundle);
        this.Y.unlock();
    }

    public final Overlay addOverlay(OverlayOptions overlayOptions) {
        if (overlayOptions != null && !this.f5657p0) {
            if (OverlayUtil.isOverlayUpgrade()) {
                c();
            }
            Overlay overlay = overlayOptions.getOverlay();
            if (overlay != null) {
                overlay.listener = this.f5650m;
                if (OverlayUtil.isOverlayUpgrade() && !(overlay instanceof Dot)) {
                    a(overlay);
                    if (overlay instanceof Marker) {
                        Marker marker = (Marker) overlay;
                        marker.Q = this.f5656p;
                        InfoWindowAdapter infoWindowAdapter = this.f5658q;
                        if (infoWindowAdapter != null) {
                            marker.X = infoWindowAdapter;
                        }
                        ArrayList<BitmapDescriptor> arrayList = marker.G;
                        if (arrayList != null && arrayList.size() != 0) {
                            this.f5644j.add(marker);
                            com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
                            if (bVar != null) {
                                bVar.s(true);
                            }
                        }
                        this.f5646k.add(marker);
                        InfoWindow infoWindow = marker.P;
                        if (infoWindow != null) {
                            showInfoWindow(infoWindow, false);
                        }
                    }
                    if (overlay instanceof Building) {
                        this.N.add((Building) overlay);
                    }
                    return overlay;
                }
                if (overlay instanceof Marker) {
                    Marker marker2 = (Marker) overlay;
                    marker2.Q = this.f5656p;
                    ArrayList<BitmapDescriptor> arrayList2 = marker2.G;
                    if (arrayList2 != null && arrayList2.size() != 0) {
                        this.f5644j.add(marker2);
                        com.baidu.mapsdkplatform.comapi.map.b bVar2 = this.f5638g;
                        if (bVar2 != null) {
                            bVar2.s(true);
                        }
                    }
                    this.f5646k.add(marker2);
                    InfoWindow infoWindow2 = marker2.P;
                    if (infoWindow2 != null) {
                        showInfoWindow(infoWindow2, false);
                    }
                } else if (overlay instanceof Building) {
                    this.N.add((Building) overlay);
                }
                Bundle bundle = new Bundle();
                overlay.a(bundle);
                if (this.f5638g != null && !this.f5657p0) {
                    this.f5638g.d(bundle);
                }
                this.f5642i.add(overlay);
                return overlay;
            }
        }
        return null;
    }

    public final List<Overlay> addOverlays(List<OverlayOptions> list) {
        if (list == null || this.f5657p0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        if (OverlayUtil.isOverlayUpgrade()) {
            c();
            for (int i8 = 0; i8 < size; i8++) {
                OverlayOptions overlayOptions = list.get(i8);
                if (overlayOptions != null) {
                    Overlay overlay = overlayOptions.getOverlay();
                    overlay.listener = this.f5650m;
                    if (!(overlay instanceof Dot)) {
                        if (overlay instanceof Marker) {
                            Marker marker = (Marker) overlay;
                            marker.Q = this.f5656p;
                            InfoWindowAdapter infoWindowAdapter = this.f5658q;
                            if (infoWindowAdapter != null) {
                                marker.X = infoWindowAdapter;
                            }
                            ArrayList<BitmapDescriptor> arrayList2 = marker.G;
                            if (arrayList2 != null && arrayList2.size() != 0) {
                                this.f5644j.add(marker);
                                com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
                                if (bVar != null) {
                                    bVar.s(true);
                                }
                            }
                            this.f5646k.add(marker);
                            InfoWindow infoWindow = marker.P;
                            if (infoWindow != null) {
                                showInfoWindow(infoWindow, false);
                            }
                        }
                        if (overlay instanceof Building) {
                            this.N.add((Building) overlay);
                        }
                        this.f5642i.add(overlay);
                        arrayList.add(overlay);
                        overlay.setBmLayer(this.f5640h);
                        BmDrawItem drawItem = overlay.toDrawItem();
                        this.f5640h.a(drawItem, drawItem.b());
                    }
                }
            }
            this.f5640h.b();
        } else {
            Bundle[] bundleArr = new Bundle[size];
            for (int i9 = 0; i9 < size; i9++) {
                OverlayOptions overlayOptions2 = list.get(i9);
                if (overlayOptions2 != null) {
                    Overlay overlay2 = overlayOptions2.getOverlay();
                    overlay2.listener = this.f5650m;
                    if (overlay2 instanceof Marker) {
                        Marker marker2 = (Marker) overlay2;
                        marker2.Q = this.f5656p;
                        InfoWindowAdapter infoWindowAdapter2 = this.f5658q;
                        if (infoWindowAdapter2 != null) {
                            marker2.X = infoWindowAdapter2;
                        }
                        ArrayList<BitmapDescriptor> arrayList3 = marker2.G;
                        if (arrayList3 != null && arrayList3.size() != 0) {
                            this.f5644j.add(marker2);
                            com.baidu.mapsdkplatform.comapi.map.b bVar2 = this.f5638g;
                            if (bVar2 != null) {
                                bVar2.s(true);
                            }
                        }
                        this.f5646k.add(marker2);
                        InfoWindow infoWindow2 = marker2.P;
                        if (infoWindow2 != null) {
                            showInfoWindow(infoWindow2, false);
                        }
                    }
                    if (overlay2 instanceof Building) {
                        this.N.add((Building) overlay2);
                    }
                    this.f5642i.add(overlay2);
                    arrayList.add(overlay2);
                    Bundle bundle = new Bundle();
                    com.baidu.mapsdkplatform.comapi.map.b bVar3 = this.f5638g;
                    if (bVar3 != null) {
                        bVar3.c(bundle);
                        this.f5638g.a(bundle);
                    }
                    overlay2.a(bundle);
                    bundleArr[i9] = bundle;
                }
            }
            com.baidu.mapsdkplatform.comapi.map.b bVar4 = this.f5638g;
            if (bVar4 != null) {
                bVar4.a(bundleArr);
            }
        }
        return arrayList;
    }

    public TileOverlay addTileLayer(TileOverlayOptions tileOverlayOptions) {
        if (tileOverlayOptions == null) {
            return null;
        }
        TileOverlay tileOverlay = this.U;
        if (tileOverlay != null) {
            tileOverlay.c();
            this.U.f6376c = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ExifInterface.GPS_DIRECTION_TRUE, Integer.valueOf(tileOverlayOptions.datasource));
        SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", ExifInterface.GPS_DIRECTION_TRUE, "0", hashMap);
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null || !bVar.e(tileOverlayOptions.a())) {
            return null;
        }
        TileOverlay a8 = tileOverlayOptions.a(this);
        this.U = a8;
        return a8;
    }

    public final TraceOverlay addTraceOverlay(TraceOptions traceOptions, TraceAnimationListener traceAnimationListener) {
        if (traceOptions == null) {
            return null;
        }
        SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "TO", "0", null);
        com.baidu.mapsdkplatform.comapi.map.z.c cVar = this.f5661r0;
        if (cVar == null || cVar.d()) {
            r rVar = this.f5645j0;
            if (rVar == r.GLSurfaceView) {
                this.f5661r0 = new com.baidu.mapsdkplatform.comapi.map.z.c(this.f5632d);
            } else {
                if (rVar != r.TextureView) {
                    return null;
                }
                this.f5661r0 = new com.baidu.mapsdkplatform.comapi.map.z.c(this.f5634e);
            }
            this.f5661r0.c();
            this.f5638g.a(this.f5661r0.b());
        }
        this.f5661r0.a(traceAnimationListener);
        return this.f5661r0.a(traceOptions);
    }

    public final void animateMapStatus(MapStatusUpdate mapStatusUpdate, int i8) {
        if (mapStatusUpdate == null || i8 < 0) {
            return;
        }
        s a8 = a(mapStatusUpdate);
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return;
        }
        mapStatusReason |= 256;
        if (this.f5653n0) {
            bVar.a(a8, i8);
        } else {
            bVar.a(a8);
        }
    }

    public void changeLocationLayerOrder(boolean z7) {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return;
        }
        bVar.a(z7);
    }

    public void cleanCache(int i8) {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return;
        }
        bVar.a(i8);
    }

    public final void clear() {
        if (this.f5657p0) {
            return;
        }
        BmLayer bmLayer = this.f5640h;
        if (bmLayer != null) {
            bmLayer.a();
            this.f5640h.b();
            Iterator<Overlay> it = this.f5642i.iterator();
            while (it.hasNext()) {
                try {
                    it.next().mDrawItem.close();
                } catch (Exception unused) {
                    Log.e("DrawItem", "DrawItem close failed");
                }
            }
        }
        this.f5642i.clear();
        this.f5644j.clear();
        this.f5646k.clear();
        this.N.clear();
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar != null) {
            bVar.s(false);
            this.f5638g.d();
        }
        hideInfoWindow();
        if (this.f5636f != null) {
            this.f5636f = null;
        }
    }

    public void closeParticleEffectByType(ParticleEffectType particleEffectType) {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar != null) {
            bVar.a(particleEffectType);
        }
    }

    public boolean customParticleEffectByType(ParticleEffectType particleEffectType, ParticleOptions particleOptions) {
        if (this.f5638g == null) {
            return false;
        }
        Bundle bundle = new Bundle();
        if (particleOptions != null) {
            if (particleOptions.getParticleImgs() != null) {
                int size = particleOptions.getParticleImgs().size();
                bundle.putInt(FileDownloadModel.TOTAL, size);
                for (int i8 = 0; i8 < size; i8++) {
                    if (particleOptions.getParticleImgs().get(i8) != null) {
                        bundle.putBundle(String.format("texture_%d", Integer.valueOf(i8)), particleOptions.getParticleImgs().get(i8).a());
                    }
                }
            }
            if (particleOptions.getParticlePos() != null) {
                GeoPoint ll2mc = CoordUtil.ll2mc(particleOptions.getParticlePos());
                bundle.putDouble("location_x", ll2mc.getLongitudeE6());
                bundle.putDouble("location_y", ll2mc.getLatitudeE6());
            }
        }
        return this.f5638g.a(particleEffectType, bundle);
    }

    public boolean downloadMapStyle(String str) {
        return this.f5638g.a(str);
    }

    public List<InfoWindow> getAllInfoWindows() {
        return this.f5648l;
    }

    public final Point getCompassPosition() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar != null) {
            return a(bVar.l());
        }
        return null;
    }

    public boolean getCustomTrafficColorEnable() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return false;
        }
        return bVar.m();
    }

    public MapBaseIndoorMapInfo getFocusedBaseIndoorMapInfo() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return null;
        }
        return bVar.o();
    }

    public final int getFontSizeLevel() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar != null) {
            return bVar.p();
        }
        return 1;
    }

    public MapSurfaceView getGLMapView() {
        return this.f5632d;
    }

    public OnHeatMapDrawFrameCallBack getHeatMapDrawFrameCallBack() {
        return this.R;
    }

    public boolean getIsSDKLayerBelowBmLayer() {
        return this.f5659q0;
    }

    @Deprecated
    public final MyLocationConfiguration getLocationConfigeration() {
        return getLocationConfiguration();
    }

    public final MyLocationConfiguration getLocationConfiguration() {
        return this.f5635e0;
    }

    public final MyLocationData getLocationData() {
        return this.f5633d0;
    }

    public final String getMapApprovalNumber() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        return bVar == null ? "" : bVar.t();
    }

    public final String getMapCopyrightInfo() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        return bVar == null ? "" : bVar.u();
    }

    public MapLanguage getMapLanguage() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return MapLanguage.CHINESE;
        }
        return MapLanguage.values()[bVar.w()];
    }

    public final String getMapMappingQualificationInfo() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        return bVar == null ? "" : bVar.x();
    }

    public final MapStatus getMapStatus() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return null;
        }
        return MapStatus.a(bVar.y());
    }

    public final LatLngBounds getMapStatusLimit() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return null;
        }
        return bVar.z();
    }

    public MapTextureView getMapTextureView() {
        return this.f5634e;
    }

    public final int getMapType() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return 1;
        }
        if (bVar.L()) {
            return this.f5638g.P() ? 2 : 1;
        }
        return 3;
    }

    public List<Marker> getMarkersInBounds(LatLngBounds latLngBounds) {
        if (getMapStatus() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f5646k.size() == 0) {
            return null;
        }
        for (Marker marker : this.f5646k) {
            if (latLngBounds.contains(marker.getPosition())) {
                arrayList.add(marker);
            }
        }
        return arrayList;
    }

    public final float getMaxZoomLevel() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return 0.0f;
        }
        return bVar.A();
    }

    public final float getMinZoomLevel() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return 0.0f;
        }
        return bVar.f8052e;
    }

    public NaviMapExpand getNaviMap() {
        return this.f5636f;
    }

    public LatLngBounds getOverlayLatLngBounds(OverlayOptions overlayOptions) {
        if (overlayOptions == null || this.f5638g == null) {
            return null;
        }
        Overlay overlay = overlayOptions.getOverlay();
        Bundle bundle = new Bundle();
        overlay.a(bundle);
        return this.f5638g.f(bundle);
    }

    public boolean getPoiTagEnable(PoiTagType poiTagType) {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar != null) {
            return bVar.a(poiTagType);
        }
        return false;
    }

    public final Projection getProjection() {
        return this.f5628b;
    }

    public float[] getProjectionMatrix() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return null;
        }
        return bVar.B();
    }

    public final UiSettings getUiSettings() {
        return this.f5630c;
    }

    public float[] getViewMatrix() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return null;
        }
        return bVar.C();
    }

    public float getZoomToBound(int i8, int i9, int i10, int i11, int i12, int i13) {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return 0.0f;
        }
        return bVar.a(i8, i9, i10, i11, i12, i13);
    }

    @Deprecated
    public MapSurfaceView getmGLMapView() {
        return this.f5632d;
    }

    public void hideInfoWindow() {
        View view;
        MapView mapView;
        Collection<InfoWindow> values = this.f5627a0.values();
        if (!values.isEmpty()) {
            for (InfoWindow infoWindow : values) {
                if (infoWindow != null && (view = infoWindow.f5909c) != null) {
                    int i8 = g.f5678b[this.f5645j0.ordinal()];
                    if (i8 == 1) {
                        TextureMapView textureMapView = this.f5641h0;
                        if (textureMapView != null) {
                            textureMapView.removeView(view);
                        }
                    } else if (i8 == 2 && (mapView = this.f5639g0) != null) {
                        mapView.removeView(view);
                    }
                }
            }
        }
        for (Overlay overlay : this.f5642i) {
            Set<String> keySet = this.f5627a0.keySet();
            String str = overlay.f6117a;
            if ((overlay instanceof Marker) && !keySet.isEmpty() && keySet.contains(str)) {
                overlay.remove();
            }
        }
        this.f5627a0.clear();
        this.f5629b0.clear();
        this.f5648l.clear();
    }

    public void hideSDKLayer() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return;
        }
        bVar.F();
    }

    public final boolean isBaiduHeatMapEnabled() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return false;
        }
        return bVar.J();
    }

    public boolean isBaseIndoorMapMode() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return false;
        }
        return bVar.K();
    }

    public final boolean isBuildingsEnabled() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return false;
        }
        return bVar.M();
    }

    public final boolean isMyLocationEnabled() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return false;
        }
        return bVar.s();
    }

    public final boolean isShowMapPoi() {
        return this.f5647k0;
    }

    public final boolean isSupportBaiduHeatMap() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return false;
        }
        return bVar.j();
    }

    public final boolean isTrafficEnabled() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return false;
        }
        return bVar.R();
    }

    public final void mapRefresh(int i8) {
        if (i8 < 0) {
            return;
        }
        com.baidu.platform.comapi.util.j.a(new f(), i8);
    }

    @Override // com.baidu.mapsdkplatform.comapi.util.c
    public void onAdvPermissionUpdate(int i8) {
        if (com.baidu.platform.comapi.e.b.e().d() == MapLanguage.ENGLISH && !PermissionUtils.getInstance().isEnglishMapAuthorized()) {
            setMapLanguage(MapLanguage.CHINESE, true);
        }
        com.baidu.mapsdkplatform.comapi.util.d.b().b(this);
    }

    public final void removeMarkerClickListener(OnMarkerClickListener onMarkerClickListener) {
        if (this.A.contains(onMarkerClickListener)) {
            this.A.remove(onMarkerClickListener);
        }
    }

    public final void removeMarkerWithBaseUIClickListener(OnMarkerWithBaseUIClickListener onMarkerWithBaseUIClickListener) {
        if (this.B.contains(onMarkerWithBaseUIClickListener)) {
            this.B.remove(onMarkerWithBaseUIClickListener);
        }
    }

    public void removeOverLays(List<Overlay> list) {
        int i8;
        com.baidu.mapsdkplatform.comapi.map.b bVar;
        if (list == null || this.f5657p0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i9 = size / 400;
        for (int i10 = 0; i10 < i9 + 1; i10++) {
            for (int i11 = 0; i11 < 400 && (i8 = (i10 * 400) + i11) < size; i11++) {
                if (this.f5657p0) {
                    return;
                }
                Overlay overlay = list.get(i8);
                if (overlay != null) {
                    if (OverlayUtil.isOverlayUpgrade()) {
                        b(overlay);
                    } else {
                        Bundle a8 = overlay.a();
                        com.baidu.mapsdkplatform.comapi.map.b bVar2 = this.f5638g;
                        if (bVar2 != null) {
                            bVar2.c(a8);
                        }
                        arrayList.add(a8);
                    }
                    List<Marker> list2 = this.f5646k;
                    if (list2 != null && list2.contains(overlay)) {
                        this.f5646k.remove(overlay);
                    }
                    CopyOnWriteArrayList<Building> copyOnWriteArrayList = this.N;
                    if (copyOnWriteArrayList != null && copyOnWriteArrayList.contains(overlay)) {
                        this.N.remove(overlay);
                    }
                    if (this.f5644j.contains(overlay)) {
                        Marker marker = (Marker) overlay;
                        if (marker.G != null) {
                            this.f5644j.remove(marker);
                            if (this.f5644j.size() == 0 && (bVar = this.f5638g) != null) {
                                bVar.s(false);
                            }
                        }
                    }
                }
            }
            if (this.f5638g != null && !arrayList.isEmpty()) {
                int size2 = arrayList.size();
                Bundle[] bundleArr = new Bundle[size2];
                for (int i12 = 0; i12 < size2; i12++) {
                    bundleArr[i12] = (Bundle) arrayList.get(i12);
                }
                this.f5638g.b(bundleArr);
            }
        }
        this.f5642i.removeAll(list);
    }

    public final void setBaiduHeatMapEnabled(boolean z7) {
        if (this.f5638g != null) {
            SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "H", "0", null);
            this.f5638g.d(z7);
        }
    }

    public final void setBuildingsEnabled(boolean z7) {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar != null) {
            bVar.b(z7);
        }
    }

    public void setCompassEnable(boolean z7) {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return;
        }
        bVar.c(z7);
    }

    public void setCompassIcon(Bitmap bitmap) {
        if (bitmap == null) {
            throw new IllegalArgumentException("BDMapSDKException: compass's icon can not be null");
        }
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return;
        }
        bVar.a(bitmap);
    }

    public void setCompassPosition(Point point) {
        if (this.f5638g == null) {
            return;
        }
        if (this.f5638g.a(new Point(point.x, point.y))) {
            this.f5655o0 = point;
        }
    }

    @Deprecated
    public boolean setCustomTrafficColor(String str, String str2, String str3, String str4) {
        if (this.f5638g == null) {
            return false;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str4)) {
                return true;
            }
            this.f5638g.a(Color.parseColor("#ffffffff"), Color.parseColor("#ffffffff"), Color.parseColor("#ffffffff"), Color.parseColor("#ffffffff"), false);
            return true;
        }
        if (str.matches("^#[0-9a-fA-F]{8}$") && str2.matches("^#[0-9a-fA-F]{8}$") && str3.matches("^#[0-9a-fA-F]{8}$") && str4.matches("^#[0-9a-fA-F]{8}$")) {
            this.f5638g.a(Color.parseColor(str), Color.parseColor(str2), Color.parseColor(str3), Color.parseColor(str4), true);
            return true;
        }
        Log.e(f5626a, "the string of the input customTrafficColor is error");
        return false;
    }

    public void setCustomTrafficColorEnable(boolean z7) {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return;
        }
        bVar.g(z7);
    }

    public void setDEMEnable(boolean z7) {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar != null) {
            bVar.h(z7);
        }
    }

    public final void setFontSizeLevel(int i8) {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar != null) {
            bVar.c(i8);
        }
    }

    public void setHeatMapFrameAnimationIndex(int i8) {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return;
        }
        bVar.d(i8);
    }

    public final void setIndoorEnable(boolean z7) {
        if (this.f5638g != null) {
            SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "C", ExifInterface.GPS_MEASUREMENT_3D, null);
            this.f5651m0 = z7;
            this.f5638g.D(z7);
        }
        OnBaseIndoorMapListener onBaseIndoorMapListener = this.P;
        if (onBaseIndoorMapListener == null || z7) {
            return;
        }
        onBaseIndoorMapListener.onBaseIndoorMapMode(false, null);
    }

    public final void setInfoWindowAdapter(InfoWindowAdapter infoWindowAdapter) {
        this.f5658q = infoWindowAdapter;
    }

    public void setLayerClickable(MapLayer mapLayer, boolean z7) {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return;
        }
        bVar.a(mapLayer, z7);
    }

    public void setMapBackgroundColor(int i8) {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return;
        }
        bVar.b(i8);
    }

    public void setMapBackgroundImage(BitmapDescriptor bitmapDescriptor) {
        if (this.f5638g == null) {
            return;
        }
        if (bitmapDescriptor == null) {
            Bundle bundle = new Bundle();
            bundle.putInt("reset", 1);
            this.f5638g.j(bundle);
        } else {
            if (bitmapDescriptor.getBitmap().getByteCount() > 10240000) {
                return;
            }
            Bundle a8 = bitmapDescriptor.a();
            a8.putInt("reset", 0);
            this.f5638g.j(a8);
        }
    }

    public final void setMapLanguage(MapLanguage mapLanguage) {
        setMapLanguage(mapLanguage, com.baidu.platform.comapi.e.b.e().d() != mapLanguage);
    }

    public final void setMapStatus(MapStatusUpdate mapStatusUpdate) {
        if (mapStatusUpdate == null) {
            return;
        }
        s a8 = a(mapStatusUpdate);
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return;
        }
        mapStatusReason |= 256;
        bVar.a(a8);
        OnMapStatusChangeListener onMapStatusChangeListener = this.f5660r;
        if (onMapStatusChangeListener != null) {
            onMapStatusChangeListener.onMapStatusChange(getMapStatus());
        }
    }

    public final void setMapStatusLimits(LatLngBounds latLngBounds) {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return;
        }
        bVar.a(latLngBounds);
        setMapStatus(MapStatusUpdateFactory.newLatLngBounds(latLngBounds));
    }

    public final void setMapType(int i8) {
        if (this.f5638g == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(ExifInterface.GPS_DIRECTION_TRUE, Integer.valueOf(i8));
        SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "M", "4", hashMap);
        if (i8 == 1) {
            this.f5638g.x(false);
            this.f5638g.H(this.f5647k0);
            this.f5638g.E(this.f5649l0);
            this.f5638g.e(true);
            this.f5638g.D(this.f5651m0);
        } else if (i8 == 2) {
            this.f5638g.x(true);
            this.f5638g.H(this.f5647k0);
            this.f5638g.E(this.f5649l0);
            this.f5638g.e(true);
        } else if (i8 == 3) {
            if (this.f5638g.U()) {
                this.f5638g.H(false);
            }
            if (this.f5638g.G()) {
                this.f5638g.E(false);
            }
            this.f5638g.e(false);
            this.f5638g.D(false);
        }
        if (OpenLogUtil.isMapLogEnable()) {
            com.baidu.mapsdkplatform.comapi.commonutils.b.a().a("BasicMap setMapType type = " + i8);
        }
    }

    public final void setMaxAndMinZoomLevel(float f8, float f9) {
        com.baidu.mapsdkplatform.comapi.map.b bVar;
        if (f8 <= 22.0f && f9 >= 4.0f && f8 >= f9 && (bVar = this.f5638g) != null) {
            bVar.a(f8, f9);
        }
    }

    @Deprecated
    public final void setMyLocationConfigeration(MyLocationConfiguration myLocationConfiguration) {
        setMyLocationConfiguration(myLocationConfiguration);
    }

    public final void setMyLocationConfiguration(MyLocationConfiguration myLocationConfiguration) {
        OnLocationModeChangeListener onLocationModeChangeListener;
        this.f5635e0 = myLocationConfiguration;
        a(this.f5633d0, myLocationConfiguration);
        a(this.f5635e0);
        if (myLocationConfiguration == null || !isMyLocationEnabled() || (onLocationModeChangeListener = this.f5637f0) == null) {
            return;
        }
        onLocationModeChangeListener.onLocationModeChange(myLocationConfiguration.locationMode);
    }

    public final void setMyLocationData(MyLocationData myLocationData) {
        this.f5633d0 = myLocationData;
        if (this.f5635e0 == null) {
            this.f5635e0 = new MyLocationConfiguration(MyLocationConfiguration.LocationMode.NORMAL, false, null);
        }
        a(myLocationData, this.f5635e0);
    }

    public final void setMyLocationEnabled(boolean z7) {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar != null) {
            bVar.q(z7);
        }
    }

    public final void setOn3DBuildingListener(Building3DListener building3DListener) {
        this.M = building3DListener;
    }

    public final void setOnArcClickListener(OnArcClickListener onArcClickListener) {
        if (onArcClickListener != null) {
            this.I.add(onArcClickListener);
        }
    }

    public final void setOnBaseIndoorMapListener(OnBaseIndoorMapListener onBaseIndoorMapListener) {
        SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "C", "3.2", null);
        this.P = onBaseIndoorMapListener;
    }

    public final void setOnCircleClickListener(OnCircleClickListener onCircleClickListener) {
        if (onCircleClickListener != null) {
            this.E.add(onCircleClickListener);
        }
    }

    public final void setOnGroundOverlayClickListener(OnGroundOverlayClickListener onGroundOverlayClickListener) {
        if (onGroundOverlayClickListener != null) {
            this.G.add(onGroundOverlayClickListener);
        }
    }

    public void setOnHeatMapDrawFrameCallBack(OnHeatMapDrawFrameCallBack onHeatMapDrawFrameCallBack) {
        this.R = onHeatMapDrawFrameCallBack;
    }

    public final void setOnLocationModeChangeListener(OnLocationModeChangeListener onLocationModeChangeListener) {
        this.f5637f0 = onLocationModeChangeListener;
    }

    public final void setOnMapClickListener(OnMapClickListener onMapClickListener) {
        this.f5665u = onMapClickListener;
    }

    public final void setOnMapDoubleClickListener(OnMapDoubleClickListener onMapDoubleClickListener) {
        this.f5669y = onMapDoubleClickListener;
    }

    public final void setOnMapDrawFrameCallback(OnMapDrawFrameCallback onMapDrawFrameCallback) {
        this.O = onMapDrawFrameCallback;
    }

    public final void setOnMapGestureListener(onMapGestureListener onmapgesturelistener) {
        SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "GD", "0", null);
        this.f5664t = onmapgesturelistener;
    }

    public void setOnMapLoadedCallback(OnMapLoadedCallback onMapLoadedCallback) {
        this.f5666v = onMapLoadedCallback;
    }

    public final void setOnMapLongClickListener(OnMapLongClickListener onMapLongClickListener) {
        this.f5670z = onMapLongClickListener;
    }

    public void setOnMapRenderCallbadk(OnMapRenderCallback onMapRenderCallback) {
        this.f5668x = onMapRenderCallback;
    }

    public final void setOnMapRenderValidDataListener(OnMapRenderValidDataListener onMapRenderValidDataListener) {
        this.Q = onMapRenderValidDataListener;
    }

    public final void setOnMapStatusChangeListener(OnMapStatusChangeListener onMapStatusChangeListener) {
        this.f5660r = onMapStatusChangeListener;
    }

    public void setOnMapTileLoadedCallback(OnMapTileLoadedCallback onMapTileLoadedCallback) {
        this.f5667w = onMapTileLoadedCallback;
    }

    public final void setOnMapTouchListener(OnMapTouchListener onMapTouchListener) {
        this.f5662s = onMapTouchListener;
    }

    public final void setOnMarkerClickListener(OnMarkerClickListener onMarkerClickListener) {
        if (onMarkerClickListener == null || this.A.contains(onMarkerClickListener)) {
            return;
        }
        this.A.add(onMarkerClickListener);
    }

    public final void setOnMarkerDragListener(OnMarkerDragListener onMarkerDragListener) {
        this.J = onMarkerDragListener;
    }

    public final void setOnMarkerWithBaseUIClickListener(OnMarkerWithBaseUIClickListener onMarkerWithBaseUIClickListener) {
        if (onMarkerWithBaseUIClickListener == null || this.B.contains(onMarkerWithBaseUIClickListener)) {
            return;
        }
        this.B.add(onMarkerWithBaseUIClickListener);
    }

    public final void setOnMultiPointClickListener(OnMultiPointClickListener onMultiPointClickListener) {
        if (onMultiPointClickListener != null) {
            this.D.add(onMultiPointClickListener);
        }
    }

    public final void setOnMyLocationClickListener(OnMyLocationClickListener onMyLocationClickListener) {
        this.K = onMyLocationClickListener;
    }

    public final void setOnPolygonClickListener(OnPolygonClickListener onPolygonClickListener) {
        if (onPolygonClickListener != null) {
            this.F.add(onPolygonClickListener);
        }
    }

    public final void setOnPolylineClickListener(OnPolylineClickListener onPolylineClickListener) {
        if (onPolylineClickListener != null) {
            this.C.add(onPolylineClickListener);
        }
    }

    public final void setOnSynchronizationListener(OnSynchronizationListener onSynchronizationListener) {
        this.S = onSynchronizationListener;
    }

    public final void setOnTextClickListener(OnTextClickListener onTextClickListener) {
        if (onTextClickListener != null) {
            this.H.add(onTextClickListener);
        }
    }

    public void setOverlayUnderPoi(boolean z7) {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return;
        }
        bVar.t(z7);
    }

    @Deprecated
    public final void setPadding(int i8, int i9, int i10, int i11) {
        setViewPadding(i8, i9, i10, i11);
    }

    public void setPixelFormatTransparent(boolean z7) {
        MapSurfaceView mapSurfaceView = this.f5632d;
        if (mapSurfaceView == null) {
            return;
        }
        if (z7) {
            mapSurfaceView.setPixelFormatTransparent(true);
        } else {
            mapSurfaceView.setPixelFormatTransparent(false);
        }
    }

    public void setPoiTagEnable(PoiTagType poiTagType, boolean z7) {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar != null) {
            bVar.a(poiTagType, z7);
        }
    }

    public final void setTrafficEnabled(boolean z7) {
        if (this.f5638g != null) {
            SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "C", "1", null);
            this.f5638g.z(z7);
        }
    }

    public final void setViewPadding(int i8, int i9, int i10, int i11) {
        MapView mapView;
        if (i8 < 0 || i9 < 0 || i10 < 0 || i11 < 0 || this.f5638g == null) {
            return;
        }
        int i12 = g.f5678b[this.f5645j0.ordinal()];
        if (i12 != 1) {
            if (i12 == 2 && (mapView = this.f5639g0) != null) {
                com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
                Point point = this.f5655o0;
                bVar.a(new Point((int) (i8 + (point.x * (((mapView.getWidth() - i8) - i10) / this.f5639g0.getWidth()))), (int) (i9 + (point.y * (((this.f5639g0.getHeight() - i9) - i11) / this.f5639g0.getHeight())))));
                this.f5639g0.setPadding(i8, i9, i10, i11);
                this.f5639g0.invalidate();
                return;
            }
            return;
        }
        if (this.f5641h0 == null) {
            return;
        }
        com.baidu.mapsdkplatform.comapi.map.b bVar2 = this.f5638g;
        Point point2 = this.f5655o0;
        bVar2.a(new Point((int) (i8 + (point2.x * (((r0.getWidth() - i8) - i10) / this.f5641h0.getWidth()))), (int) (i9 + (point2.y * (((this.f5641h0.getHeight() - i9) - i11) / this.f5641h0.getHeight())))));
        this.f5641h0.setPadding(i8, i9, i10, i11);
        this.f5641h0.invalidate();
    }

    public void showInfoWindow(InfoWindow infoWindow) {
        showInfoWindow(infoWindow, true);
    }

    public void showInfoWindows(List<InfoWindow> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<InfoWindow> it = list.iterator();
        while (it.hasNext()) {
            showInfoWindow(it.next(), false);
        }
    }

    public final void showMapIndoorPoi(boolean z7) {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar != null) {
            bVar.E(z7);
            this.f5649l0 = z7;
        }
    }

    public final void showMapPoi(boolean z7) {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar != null) {
            bVar.H(z7);
            this.f5647k0 = z7;
        }
    }

    public void showOperateLayer(boolean z7) {
        if (this.f5638g == null) {
            return;
        }
        SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "C", "2", null);
        this.f5638g.F(z7);
    }

    public void showOperatePoiLayer(boolean z7) {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return;
        }
        bVar.G(z7);
    }

    public boolean showParticleEffectByType(ParticleEffectType particleEffectType) {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar != null) {
            return bVar.b(particleEffectType);
        }
        return false;
    }

    public void showSDKLayer() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return;
        }
        bVar.W();
    }

    public void showTrafficUGCMap(boolean z7) {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar != null) {
            bVar.I(z7);
        }
    }

    public final void snapshot(SnapshotReadyCallback snapshotReadyCallback) {
        MapSurfaceView mapSurfaceView;
        this.L = snapshotReadyCallback;
        int i8 = g.f5678b[this.f5645j0.ordinal()];
        if (i8 != 1) {
            if (i8 != 2 || (mapSurfaceView = this.f5632d) == null || mapSurfaceView.getController() == null) {
                return;
            }
            this.f5632d.doCaptureMapView(new c(), new Rect(0, 0, this.f5632d.getController().getScreenWidth(), this.f5632d.getController().getScreenHeight()), Bitmap.Config.ARGB_8888);
            this.f5632d.requestRender();
            return;
        }
        MapTextureView mapTextureView = this.f5634e;
        if (mapTextureView == null || mapTextureView.getController() == null) {
            return;
        }
        this.f5634e.doCaptureMapView(new b(), new Rect(0, 0, this.f5634e.getController().getScreenWidth(), this.f5634e.getController().getScreenHeight()), Bitmap.Config.ARGB_8888);
        this.f5634e.requestRender();
    }

    public final void snapshotScope(Rect rect, SnapshotReadyCallback snapshotReadyCallback) {
        MapSurfaceView mapSurfaceView;
        if (this.f5638g == null) {
            return;
        }
        this.L = snapshotReadyCallback;
        int i8 = g.f5678b[this.f5645j0.ordinal()];
        if (i8 != 1) {
            if (i8 == 2 && (mapSurfaceView = this.f5632d) != null) {
                mapSurfaceView.doCaptureMapView(new e(), rect, Bitmap.Config.ARGB_8888);
                this.f5632d.requestRender();
                return;
            }
            return;
        }
        MapTextureView mapTextureView = this.f5634e;
        if (mapTextureView != null) {
            mapTextureView.doCaptureMapView(new d(), rect, Bitmap.Config.ARGB_8888);
            this.f5634e.requestRender();
        }
    }

    public void startHeatMapFrameAnimation() {
        if (this.f5638g == null) {
            return;
        }
        SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "H", "1", null);
        this.f5638g.X();
    }

    public void stopHeatMapFrameAnimation() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return;
        }
        bVar.Y();
    }

    public MapBaseIndoorMapInfo.SwitchFloorError switchBaseIndoorMapFloor(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            MapBaseIndoorMapInfo.SwitchFloorError switchFloorError = MapBaseIndoorMapInfo.SwitchFloorError.FLOOR_INFO_ERROR;
            hashMap.put(ExifInterface.LATITUDE_SOUTH, switchFloorError.name());
            SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "C", "3.1", hashMap);
            return switchFloorError;
        }
        MapBaseIndoorMapInfo focusedBaseIndoorMapInfo = getFocusedBaseIndoorMapInfo();
        if (focusedBaseIndoorMapInfo == null) {
            MapBaseIndoorMapInfo.SwitchFloorError switchFloorError2 = MapBaseIndoorMapInfo.SwitchFloorError.SWITCH_ERROR;
            hashMap.put(ExifInterface.LATITUDE_SOUTH, switchFloorError2.name());
            SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "C", "3.1", hashMap);
            return switchFloorError2;
        }
        if (!str2.equals(focusedBaseIndoorMapInfo.f5930a)) {
            MapBaseIndoorMapInfo.SwitchFloorError switchFloorError3 = MapBaseIndoorMapInfo.SwitchFloorError.FOCUSED_ID_ERROR;
            hashMap.put(ExifInterface.LATITUDE_SOUTH, switchFloorError3.name());
            SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "C", "3.1", hashMap);
            return switchFloorError3;
        }
        ArrayList<String> floors = focusedBaseIndoorMapInfo.getFloors();
        if (floors == null || !floors.contains(str)) {
            MapBaseIndoorMapInfo.SwitchFloorError switchFloorError4 = MapBaseIndoorMapInfo.SwitchFloorError.FLOOR_OVERLFLOW;
            hashMap.put(ExifInterface.LATITUDE_SOUTH, switchFloorError4.name());
            SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "C", "3.1", hashMap);
            return switchFloorError4;
        }
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null || !bVar.b(str, str2)) {
            MapBaseIndoorMapInfo.SwitchFloorError switchFloorError5 = MapBaseIndoorMapInfo.SwitchFloorError.SWITCH_ERROR;
            hashMap.put(ExifInterface.LATITUDE_SOUTH, switchFloorError5.name());
            SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "C", "3.1", hashMap);
            return switchFloorError5;
        }
        MapBaseIndoorMapInfo.SwitchFloorError switchFloorError6 = MapBaseIndoorMapInfo.SwitchFloorError.SWITCH_OK;
        hashMap.put(ExifInterface.LATITUDE_SOUTH, switchFloorError6.name());
        SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "C", "3.1", hashMap);
        return switchFloorError6;
    }

    public void switchLayerOrder(MapLayer mapLayer, MapLayer mapLayer2) {
        if (this.f5638g == null) {
            return;
        }
        SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "C", ErrorCode.PARAMETER_ERROR, null);
        if ((this.f5638g.a(mapLayer, mapLayer2) && mapLayer == MapLayer.BM_LAYER_OVERLAY && mapLayer2 == MapLayer.MAP_LAYER_OVERLAY) || (mapLayer == MapLayer.MAP_LAYER_OVERLAY && mapLayer2 == MapLayer.BM_LAYER_OVERLAY)) {
            boolean z7 = !this.f5659q0;
            this.f5659q0 = z7;
            this.f5638g.w(z7);
        }
    }

    public boolean switchOverlayLayerAndNavigationLayer(boolean z7) {
        if (this.f5638g == null) {
            return false;
        }
        SDKLogFactory.getLogUsrActStatistics().addLogWithLowLevel("B", "C", "4", null);
        return this.f5638g.J(z7);
    }

    public void updateBaseLayers() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null || !bVar.L()) {
            return;
        }
        this.f5638g.Z();
    }

    public void updateHeatMap(HeatMap heatMap) {
        if (heatMap == null || this.f5638g == null) {
            return;
        }
        this.X.lock();
        try {
            this.V = heatMap;
            heatMap.C = this;
            this.f5638g.k(heatMap.toBundle());
        } finally {
            this.X.unlock();
        }
    }

    private synchronized void c() {
        if (OverlayUtil.isOverlayUpgrade()) {
            if (this.f5640h != null) {
                return;
            }
            r rVar = this.f5645j0;
            r rVar2 = r.GLSurfaceView;
            if (rVar == rVar2 && this.f5632d == null) {
                return;
            }
            r rVar3 = r.TextureView;
            if (rVar == rVar3 && this.f5634e == null) {
                return;
            }
            if (this.f5638g != null) {
                BmLayer bmLayer = new BmLayer(true);
                this.f5640h = bmLayer;
                bmLayer.setLayerTag("DefaultBmLayer");
                r rVar4 = this.f5645j0;
                if (rVar4 == rVar2) {
                    this.f5632d.addBmLayer(this.f5640h);
                } else if (rVar4 == rVar3) {
                    this.f5634e.addBmLayer(this.f5640h);
                }
                this.f5638g.a(this.f5640h);
                this.f5640h.a(new p());
                this.f5652n = new a();
            }
        }
    }

    private void e() {
        if (getMapLanguage() != MapLanguage.ENGLISH) {
            com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
            if (bVar == null || bVar.v()) {
                return;
            }
            this.f5638g.r(false);
            return;
        }
        Context cachedContext = JNIInitializer.getCachedContext();
        if (cachedContext == null || this.f5638g == null) {
            return;
        }
        this.f5638g.a(cachedContext.getFilesDir().getAbsolutePath() + "/cfg/a/mode_1/englishmap.sty", "");
        AppBaseMap i8 = this.f5638g.i();
        if (i8 == null) {
            return;
        }
        i8.setCustomStyleEnable(true);
    }

    void d() {
        this.f5657p0 = true;
        com.baidu.mapsdkplatform.comapi.map.z.c cVar = this.f5661r0;
        if (cVar != null) {
            cVar.e();
            this.f5661r0 = null;
        }
        NetworkUtil.unregisterNetworkCallback();
        NetworkUtil.setNetworkUpdate2MapListener(null);
        hideInfoWindow();
        BmLayer bmLayer = this.f5640h;
        if (bmLayer != null) {
            try {
                bmLayer.close();
            } catch (Exception unused) {
                Log.i("BmLayer", "BmLayer close failed");
            }
            this.f5640h = null;
        }
    }

    public final void setMapLanguage(MapLanguage mapLanguage, boolean z7) {
        TextureMapView textureMapView;
        MapTextureView mapTextureView;
        MapView mapView;
        MapSurfaceView mapSurfaceView;
        MapLanguage mapLanguage2 = MapLanguage.ENGLISH;
        if (mapLanguage == mapLanguage2 && !PermissionUtils.getInstance().isEnglishMapAuthorized()) {
            Log.e("baidumapsdk", " No advanced permission to set English map");
            if (com.baidu.platform.comapi.e.b.e().d() == mapLanguage2) {
                if (PermissionUtils.getInstance().getAdvancedPermission() != -1 && !PermissionUtils.getInstance().isEnglishMapAuthorized()) {
                    this.f5638g.a(mapLanguage2.ordinal(), true);
                    setMapLanguage(MapLanguage.CHINESE, true);
                    com.baidu.platform.comapi.e.b.e().c();
                    return;
                } else if (PermissionUtils.getInstance().getAdvancedPermission() == -1) {
                    com.baidu.mapsdkplatform.comapi.util.d.b().a(this);
                }
            }
        }
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar != null) {
            bVar.a(mapLanguage.ordinal(), z7);
            showOperatePoiLayer(mapLanguage != mapLanguage2);
            r rVar = this.f5645j0;
            if (rVar == r.GLSurfaceView && (mapView = this.f5639g0) != null && (mapSurfaceView = this.f5632d) != null) {
                mapView.updateScaleUI(mapSurfaceView.getZoomLevel());
            } else if (rVar == r.TextureView && (textureMapView = this.f5641h0) != null && (mapTextureView = this.f5634e) != null) {
                textureMapView.updateScaleUI(mapTextureView.getZoomLevel());
            }
            com.baidu.platform.comapi.e.b.e().a(mapLanguage);
        }
        e();
    }

    public void showInfoWindow(InfoWindow infoWindow, boolean z7) {
        boolean z8;
        MapView mapView;
        Set<InfoWindow> keySet = this.f5629b0.keySet();
        if (infoWindow == null || keySet.contains(infoWindow) || this.f5657p0) {
            return;
        }
        if (z7) {
            hideInfoWindow();
        }
        infoWindow.f5915i = this.f5656p;
        View view = infoWindow.f5909c;
        if (view == null || !infoWindow.f5920n) {
            z8 = true;
        } else {
            view.destroyDrawingCache();
            MapViewLayoutParams build = new MapViewLayoutParams.Builder().layoutMode(MapViewLayoutParams.ELayoutMode.mapMode).position(infoWindow.f5910d).yOffset(infoWindow.f5916j).build();
            int i8 = g.f5678b[this.f5645j0.ordinal()];
            if (i8 == 1) {
                TextureMapView textureMapView = this.f5641h0;
                if (textureMapView != null) {
                    textureMapView.addView(view, build);
                }
            } else if (i8 == 2 && (mapView = this.f5639g0) != null) {
                mapView.addView(view, build);
            }
            z8 = false;
        }
        BitmapDescriptor a8 = a(infoWindow);
        if (a8 == null) {
            return;
        }
        Overlay overlay = (!infoWindow.f5911e ? new MarkerOptions().perspective(false).icon(a8).position(infoWindow.f5910d).zIndex(Integer.MAX_VALUE).yOffset(infoWindow.f5916j).infoWindow(infoWindow) : new MarkerOptions().perspective(false).icon(a8).position(infoWindow.f5910d).fixedScreenPosition(new Point(infoWindow.f5912f, infoWindow.f5913g)).zIndex(Integer.MAX_VALUE).yOffset(infoWindow.f5916j).infoWindow(infoWindow)).getOverlay();
        overlay.listener = this.f5650m;
        if (!infoWindow.f5911e) {
            overlay.type = com.baidu.mapsdkplatform.comapi.map.d.popup;
        }
        overlay.f6119c = 32767;
        Bundle bundle = new Bundle();
        overlay.a(bundle);
        if (infoWindow.f5909c != null) {
            bundle.putInt("draw_with_view", 1);
        } else {
            bundle.putInt("draw_with_view", 0);
        }
        Marker marker = (Marker) overlay;
        if (this.f5638g != null && z8 && !this.f5657p0) {
            if (OverlayUtil.isOverlayUpgrade()) {
                a(marker);
            } else {
                this.f5638g.d(bundle);
            }
            this.f5642i.add(overlay);
        }
        marker.Q = this.f5656p;
        this.f5627a0.put(marker.f6117a, infoWindow);
        this.f5629b0.put(infoWindow, marker);
        this.f5648l.add(infoWindow);
    }

    private void b() {
        this.f5657p0 = false;
        this.f5642i = new CopyOnWriteArrayList();
        this.f5644j = new CopyOnWriteArrayList();
        this.f5646k = new CopyOnWriteArrayList();
        this.N = new CopyOnWriteArrayList<>();
        this.f5627a0 = new ConcurrentHashMap();
        this.f5629b0 = new ConcurrentHashMap();
        this.f5648l = new CopyOnWriteArrayList();
        this.f5655o0 = new Point((int) (SysOSUtil.getDensity() * 40.0f), (int) (SysOSUtil.getDensity() * 40.0f));
        h hVar = new h();
        this.T = hVar;
        NetworkUtil.setNetworkUpdate2MapListener(hVar);
        this.f5630c = new UiSettings(this.f5638g);
        this.f5654o = new i();
        this.f5650m = new j();
        this.f5656p = new k();
        this.f5638g.a(new l());
        this.f5638g.a(new m());
        this.f5638g.a(new n());
        this.f5638g.a(new o());
        this.f5647k0 = this.f5638g.U();
        this.f5649l0 = this.f5638g.G();
    }

    public final void animateMapStatus(MapStatusUpdate mapStatusUpdate) {
        animateMapStatus(mapStatusUpdate, 300);
    }

    class i implements HexagonMap.b {
        i() {
        }

        @Override // com.baidu.mapapi.map.HexagonMap.b
        public void a(HexagonMap hexagonMap) {
            if (BaiduMap.this.f5638g == null || hexagonMap == null) {
                return;
            }
            BaiduMap.this.Y.lock();
            if (BaiduMap.this.W != null && hexagonMap == BaiduMap.this.W) {
                BaiduMap.this.f5638g.f();
                BaiduMap.this.W = null;
                BaiduMap.this.f5638g.n(false);
            }
            BaiduMap.this.Y.unlock();
        }

        @Override // com.baidu.mapapi.map.HexagonMap.b
        public void a(HexagonMap hexagonMap, boolean z7) {
            if (BaiduMap.this.f5638g == null || hexagonMap == null) {
                return;
            }
            BaiduMap.this.Y.lock();
            BaiduMap.this.f5638g.o(z7);
            BaiduMap.this.Y.unlock();
        }
    }

    public void setCustomTrafficColor(int i8, int i9, int i10, int i11) {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar != null) {
            bVar.a(i8, i9, i10, i11);
        }
    }

    private Overlay a(Overlay overlay) {
        if (overlay == null || this.f5657p0 || this.f5640h == null || this.f5638g == null) {
            return null;
        }
        this.f5642i.add(overlay);
        overlay.setBmLayer(this.f5640h);
        BmDrawItem drawItem = overlay.toDrawItem();
        this.f5640h.a(drawItem, drawItem.b());
        this.f5640h.b();
        return overlay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Overlay overlay) {
        BmLayer bmLayer;
        BmDrawItem bmDrawItem;
        if (overlay == null || this.f5657p0 || (bmLayer = this.f5640h) == null || (bmDrawItem = overlay.mDrawItem) == null) {
            return;
        }
        bmLayer.a(bmDrawItem);
        try {
            bmDrawItem.close();
        } catch (Exception unused) {
            Log.e("DrawItem", "DrawItem close failed");
        }
        BmDrawItem drawItem = overlay.toDrawItem();
        this.f5640h.a(drawItem, drawItem.b());
        this.f5640h.b();
    }

    private s a(MapStatusUpdate mapStatusUpdate) {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return null;
        }
        s y7 = bVar.y();
        MapStatus a8 = mapStatusUpdate.a(this.f5638g, getMapStatus());
        if (a8 == null) {
            return null;
        }
        return a8.b(y7);
    }

    public void hideInfoWindow(InfoWindow infoWindow) {
        MapView mapView;
        Set<InfoWindow> keySet = this.f5629b0.keySet();
        if (infoWindow == null || keySet.isEmpty() || !keySet.contains(infoWindow)) {
            return;
        }
        View view = infoWindow.f5909c;
        if (view != null) {
            int i8 = g.f5678b[this.f5645j0.ordinal()];
            if (i8 == 1) {
                TextureMapView textureMapView = this.f5641h0;
                if (textureMapView != null) {
                    textureMapView.removeView(view);
                }
            } else if (i8 == 2 && (mapView = this.f5639g0) != null) {
                mapView.removeView(view);
            }
        }
        Marker marker = this.f5629b0.get(infoWindow);
        if (marker != null) {
            marker.remove();
            this.f5627a0.remove(marker.f6117a);
        }
        this.f5629b0.remove(infoWindow);
        this.f5648l.remove(infoWindow);
    }

    private final void a(MyLocationConfiguration myLocationConfiguration) {
        Bitmap bitmap;
        com.baidu.mapsdkplatform.comapi.map.b bVar;
        Bitmap bitmap2;
        Bitmap bitmap3;
        com.baidu.mapsdkplatform.comapi.map.b bVar2 = this.f5638g;
        if (bVar2 != null) {
            bVar2.g();
        }
        ArrayList arrayList = new ArrayList();
        if (myLocationConfiguration.isEnableCustom()) {
            if (myLocationConfiguration.getArrow() != null && (bitmap3 = myLocationConfiguration.getArrow().getBitmap()) != null && !bitmap3.isRecycled()) {
                OverlayLocationData overlayLocationData = new OverlayLocationData();
                overlayLocationData.setImage(bitmap3);
                overlayLocationData.setImgHeight(bitmap3.getHeight());
                overlayLocationData.setImgWidth(bitmap3.getWidth());
                overlayLocationData.setImgType("arrowicon");
                overlayLocationData.setImgName("arrowicon_" + bitmap3.hashCode());
                overlayLocationData.setArrowSize(myLocationConfiguration.getArrowSize());
                overlayLocationData.setRotation(1);
                arrayList.add(overlayLocationData);
            }
            if (myLocationConfiguration.getCustomMarker() != null && (bitmap2 = myLocationConfiguration.getCustomMarker().getBitmap()) != null && !bitmap2.isRecycled()) {
                OverlayLocationData overlayLocationData2 = new OverlayLocationData();
                overlayLocationData2.setImage(bitmap2);
                overlayLocationData2.setImgHeight(bitmap2.getHeight());
                overlayLocationData2.setImgWidth(bitmap2.getWidth());
                overlayLocationData2.setImgType("icon");
                overlayLocationData2.setImgName("icon_" + bitmap2.hashCode());
                overlayLocationData2.setMarkerSize(myLocationConfiguration.getMarkerSize());
                overlayLocationData2.setRotation(myLocationConfiguration.isEnableRotation() ? 1 : 0);
                overlayLocationData2.setAnimation(myLocationConfiguration.isNeedAnimation() ? 1 : 0);
                arrayList.add(overlayLocationData2);
            }
            if (myLocationConfiguration.getGifMarker() != null) {
                OverlayLocationData overlayLocationData3 = new OverlayLocationData();
                overlayLocationData3.setImgType("gificon");
                overlayLocationData3.setImgName("gificon");
                overlayLocationData3.setGIFImgPath(myLocationConfiguration.getGifMarker());
                overlayLocationData3.setMarkerSize(myLocationConfiguration.getMarkerSize());
                overlayLocationData3.setRotation(myLocationConfiguration.isEnableRotation() ? 1 : 0);
                overlayLocationData3.setAnimation(myLocationConfiguration.isNeedAnimation() ? 1 : 0);
                arrayList.add(overlayLocationData3);
            }
        } else if (myLocationConfiguration.getCustomMarker() != null && (bitmap = myLocationConfiguration.getCustomMarker().getBitmap()) != null && !bitmap.isRecycled()) {
            OverlayLocationData overlayLocationData4 = new OverlayLocationData();
            overlayLocationData4.setImage(bitmap);
            overlayLocationData4.setImgHeight(bitmap.getHeight());
            overlayLocationData4.setImgWidth(bitmap.getWidth());
            overlayLocationData4.setImgName("icon");
            overlayLocationData4.setRotation(myLocationConfiguration.enableDirection ? 1 : 0);
            arrayList.add(overlayLocationData4);
        }
        if (arrayList.size() <= 0 || (bVar = this.f5638g) == null) {
            return;
        }
        bVar.a(arrayList);
    }

    BaiduMap(Context context, MapSurfaceView mapSurfaceView, q qVar) {
        this.f5632d = mapSurfaceView;
        com.baidu.mapsdkplatform.comapi.map.b bVar = new com.baidu.mapsdkplatform.comapi.map.b(context, mapSurfaceView, qVar, (String) null, 0);
        this.f5638g = bVar;
        mapSurfaceView.setBaseMap(bVar);
        r rVar = r.GLSurfaceView;
        this.f5645j0 = rVar;
        this.f5636f = new NaviMapExpand(bVar, rVar, this.f5639g0, mapSurfaceView, null, this.f5634e);
        b();
    }

    private void b(Overlay overlay) {
        BmLayer bmLayer;
        BmDrawItem bmDrawItem;
        if (overlay == null || this.f5657p0 || (bmLayer = this.f5640h) == null || (bmDrawItem = overlay.mDrawItem) == null) {
            return;
        }
        bmLayer.a(bmDrawItem);
        this.f5640h.b();
        try {
            bmDrawItem.close();
        } catch (Exception unused) {
            Log.e("DrawItem", "DrawItem close failed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(InfoWindow infoWindow) {
        boolean z7;
        Marker marker;
        MapView mapView;
        if (infoWindow == null || this.f5657p0) {
            return;
        }
        Set<InfoWindow> keySet = this.f5629b0.keySet();
        if (!keySet.isEmpty() && keySet.contains(infoWindow)) {
            View view = infoWindow.f5909c;
            if (view != null && infoWindow.f5920n) {
                view.destroyDrawingCache();
                MapViewLayoutParams build = new MapViewLayoutParams.Builder().layoutMode(MapViewLayoutParams.ELayoutMode.mapMode).position(infoWindow.f5910d).yOffset(infoWindow.f5916j).build();
                int i8 = g.f5678b[this.f5645j0.ordinal()];
                if (i8 == 1) {
                    TextureMapView textureMapView = this.f5641h0;
                    if (textureMapView != null) {
                        textureMapView.addView(view, build);
                        view.setLayoutParams(build);
                    }
                } else if (i8 == 2 && (mapView = this.f5639g0) != null) {
                    mapView.addView(view, build);
                }
                if (infoWindow.f5919m) {
                    z7 = false;
                    BitmapDescriptor a8 = a(infoWindow);
                    marker = this.f5629b0.get(infoWindow);
                    if (marker != null || this.f5638g == null || !z7 || this.f5657p0) {
                        return;
                    }
                    if (OverlayUtil.isOverlayUpgrade()) {
                        marker.setPosition(infoWindow.f5910d);
                        marker.setYOffset(infoWindow.f5916j);
                        marker.setIcon(a8);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    if (infoWindow.f5908b != null) {
                        marker.type = com.baidu.mapsdkplatform.comapi.map.d.popup;
                        marker.f6025h = a8;
                        if (infoWindow.f5909c != null) {
                            bundle.putInt("draw_with_view", 1);
                        } else {
                            bundle.putInt("draw_with_view", 0);
                        }
                    }
                    marker.f6024g = infoWindow.f5910d;
                    marker.f6037t = infoWindow.f5916j;
                    marker.a(bundle);
                    this.f5638g.l(bundle);
                    return;
                }
            }
            z7 = true;
            BitmapDescriptor a82 = a(infoWindow);
            marker = this.f5629b0.get(infoWindow);
            if (marker != null) {
                return;
            } else {
                return;
            }
        }
        showInfoWindow(infoWindow, false);
    }

    class p implements com.baidu.platform.comapi.bmsdk.c {
        p() {
        }

        @Override // com.baidu.platform.comapi.bmsdk.c
        public void a(BmDrawItem bmDrawItem) {
            InfoWindow.OnInfoWindowClickListener onInfoWindowClickListener;
            if (bmDrawItem instanceof BmArc) {
                BmArc bmArc = (BmArc) bmDrawItem;
                Iterator it = BaiduMap.this.I.iterator();
                while (it.hasNext()) {
                    ((OnArcClickListener) it.next()).onArcClick(bmArc.c());
                }
                return;
            }
            if (bmDrawItem instanceof BmBaseLine) {
                BmBaseLine bmBaseLine = (BmBaseLine) bmDrawItem;
                Iterator it2 = BaiduMap.this.C.iterator();
                while (it2.hasNext()) {
                    ((OnPolylineClickListener) it2.next()).onPolylineClick(bmBaseLine.d());
                }
                return;
            }
            if (bmDrawItem instanceof BmCircle) {
                BmCircle bmCircle = (BmCircle) bmDrawItem;
                bmCircle.e().f5737q = (int) bmCircle.a();
                Iterator it3 = BaiduMap.this.E.iterator();
                while (it3.hasNext()) {
                    ((OnCircleClickListener) it3.next()).onCircleClick(bmCircle.e());
                }
                return;
            }
            if (bmDrawItem instanceof BmPolygon) {
                BmPolygon bmPolygon = (BmPolygon) bmDrawItem;
                bmPolygon.d().f6145w = (int) bmPolygon.a();
                Iterator it4 = BaiduMap.this.F.iterator();
                while (it4.hasNext()) {
                    ((OnPolygonClickListener) it4.next()).onPolygonClick(bmPolygon.d());
                }
                return;
            }
            if (bmDrawItem instanceof BmIconMarker) {
                BmIconMarker bmIconMarker = (BmIconMarker) bmDrawItem;
                String name = bmIconMarker.getName();
                Set<String> keySet = BaiduMap.this.f5627a0.keySet();
                if (keySet.isEmpty() || !keySet.contains(name)) {
                    Iterator it5 = BaiduMap.this.A.iterator();
                    while (it5.hasNext()) {
                        ((OnMarkerClickListener) it5.next()).onMarkerClick(bmIconMarker.d());
                    }
                    Iterator it6 = BaiduMap.this.B.iterator();
                    while (it6.hasNext()) {
                        ((OnMarkerWithBaseUIClickListener) it6.next()).onMarkerClick(bmIconMarker.d());
                    }
                    return;
                }
                for (String str : keySet) {
                    if (str != null && str.equals(name)) {
                        InfoWindow infoWindow = (InfoWindow) BaiduMap.this.f5627a0.get(str);
                        if (infoWindow == null || (onInfoWindowClickListener = infoWindow.f5914h) == null) {
                            return;
                        }
                        onInfoWindowClickListener.onInfoWindowClick();
                        return;
                    }
                }
                return;
            }
            if (bmDrawItem instanceof BmTextMarker) {
                BmTextMarker bmTextMarker = (BmTextMarker) bmDrawItem;
                Iterator it7 = BaiduMap.this.H.iterator();
                while (it7.hasNext()) {
                    ((OnTextClickListener) it7.next()).onTextClick(bmTextMarker.d());
                }
                return;
            }
            if (bmDrawItem instanceof BmGround) {
                BmGround bmGround = (BmGround) bmDrawItem;
                Iterator it8 = BaiduMap.this.G.iterator();
                while (it8.hasNext()) {
                    ((OnGroundOverlayClickListener) it8.next()).onGroundOverlayClick(bmGround.c());
                }
                return;
            }
            if (bmDrawItem instanceof BmPrism) {
                return;
            }
            if (bmDrawItem instanceof BmMultiPoint) {
                BmMultiPoint bmMultiPoint = (BmMultiPoint) bmDrawItem;
                int d8 = bmMultiPoint.d();
                MultiPoint e8 = bmMultiPoint.e();
                if (e8 == null) {
                    return;
                }
                Iterator it9 = BaiduMap.this.D.iterator();
                while (it9.hasNext()) {
                    ((OnMultiPointClickListener) it9.next()).onMultiPointClick(bmMultiPoint.e(), e8.getMultiPointItem(d8));
                }
            }
        }

        @Override // com.baidu.platform.comapi.bmsdk.c
        public void a(BmDrawItem bmDrawItem, BmBaseUI bmBaseUI) {
            if (bmDrawItem instanceof BmIconMarker) {
                BmIconMarker bmIconMarker = (BmIconMarker) bmDrawItem;
                Iterator it = BaiduMap.this.B.iterator();
                while (it.hasNext()) {
                    OnMarkerWithBaseUIClickListener onMarkerWithBaseUIClickListener = (OnMarkerWithBaseUIClickListener) it.next();
                    if (bmIconMarker.d() != null && bmBaseUI != null && bmBaseUI.a() != null) {
                        onMarkerWithBaseUIClickListener.onMarkerClick(bmIconMarker.d(), bmBaseUI.a());
                    }
                }
                return;
            }
            boolean z7 = bmDrawItem instanceof Bm3DModel;
        }
    }

    private final void a(MyLocationData myLocationData, MyLocationConfiguration myLocationConfiguration) {
        float f8;
        if (myLocationData == null || myLocationConfiguration == null || !isMyLocationEnabled()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        GeoPoint ll2mc = CoordUtil.ll2mc(new LatLng(myLocationData.latitude, myLocationData.longitude));
        try {
            jSONObject.put("type", 0);
            jSONObject2.put(MapBundleKey.MapObjKey.OBJ_SL_PTX, ll2mc.getLongitudeE6());
            jSONObject2.put(MapBundleKey.MapObjKey.OBJ_SL_PTY, ll2mc.getLatitudeE6());
            jSONObject2.put("radius", CoordUtil.getMCDistanceByOneLatLngAndRadius(r14, (int) myLocationData.accuracy));
            float f9 = myLocationData.direction;
            if (myLocationConfiguration.enableDirection) {
                f8 = f9 % 360.0f;
                if (f8 > 180.0f) {
                    f8 -= 360.0f;
                } else if (f8 < -180.0f) {
                    f8 += 360.0f;
                }
            } else {
                f8 = -1001.0f;
            }
            jSONObject2.put("direction", f8);
            jSONObject2.put("iconarrownor", "NormalLocArrow");
            if (!myLocationConfiguration.isEnableCustom()) {
                jSONObject2.put("iconarrownorid", 28);
                jSONObject2.put("iconarrowfocid", 29);
            }
            jSONObject2.put("iconarrowfoc", "FocusLocArrow");
            jSONObject2.put("lineid", myLocationConfiguration.accuracyCircleStrokeColor);
            jSONObject2.put("areaid", myLocationConfiguration.accuracyCircleFillColor);
            jSONObject2.put(com.arthenica.ffmpegkit.x.KEY_WIDTH, myLocationConfiguration.width);
            jSONArray.put(jSONObject2);
            if (myLocationConfiguration.locationMode == MyLocationConfiguration.LocationMode.COMPASS) {
                jSONObject3.put(MapBundleKey.MapObjKey.OBJ_SL_PTX, ll2mc.getLongitudeE6());
                jSONObject3.put(MapBundleKey.MapObjKey.OBJ_SL_PTY, ll2mc.getLatitudeE6());
                jSONObject3.put("radius", 0);
                jSONObject3.put("direction", 0);
                jSONObject3.put("iconarrownor", "direction_wheel");
                jSONObject3.put("iconarrowfoc", "direction_wheel");
                jSONObject3.put("iconarrownorid", 54);
                jSONObject3.put("iconarrowfocid", 54);
                jSONArray.put(jSONObject3);
            }
            jSONObject.put("data", jSONArray);
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar != null) {
            bVar.a(jSONObject.toString(), (Bundle) null);
        }
        int i8 = g.f5677a[myLocationConfiguration.locationMode.ordinal()];
        if (i8 == 1) {
            animateMapStatus(MapStatusUpdateFactory.newMapStatus(new MapStatus.Builder().rotate(myLocationData.direction).overlook(-45.0f).target(new LatLng(myLocationData.latitude, myLocationData.longitude)).targetScreen(getMapStatus().targetScreen).zoom(getMapStatus().zoom).build()));
        } else {
            if (i8 != 2) {
                return;
            }
            animateMapStatus(MapStatusUpdateFactory.newMapStatus(new MapStatus.Builder().target(new LatLng(myLocationData.latitude, myLocationData.longitude)).zoom(getMapStatus().zoom).rotate(getMapStatus().rotate).overlook(getMapStatus().overlook).targetScreen(getMapStatus().targetScreen).build()));
        }
    }

    void a(HeatMap heatMap) {
        this.X.lock();
        try {
            HeatMap heatMap2 = this.V;
            if (heatMap2 != null && this.f5638g != null && heatMap == heatMap2) {
                heatMap2.a();
                this.V.c();
                this.V.C = null;
                this.f5638g.e();
                this.V = null;
                this.f5638g.n(false);
            }
        } finally {
            this.X.unlock();
        }
    }

    private Point a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int i8 = 0;
        int i9 = 0;
        for (String str2 : str.replaceAll("^\\{", "").replaceAll("\\}$", "").split(SystemInfoUtil.COMMA)) {
            String[] split = str2.replaceAll("\"", "").split(":");
            if ("x".equals(split[0])) {
                i8 = Integer.valueOf(split[1]).intValue();
            }
            if ("y".equals(split[0])) {
                i9 = Integer.valueOf(split[1]).intValue();
            }
        }
        return new Point(i8, i9);
    }

    private BitmapDescriptor a(InfoWindow infoWindow) {
        View view = infoWindow.f5909c;
        if (view != null && infoWindow.f5920n) {
            if (infoWindow.f5917k) {
                if (infoWindow.f5918l <= 0) {
                    infoWindow.f5918l = SysOSUtil.getDensityDpi();
                }
                return BitmapDescriptorFactory.fromViewWithDpi(infoWindow.f5909c, infoWindow.f5918l);
            }
            return BitmapDescriptorFactory.fromView(view);
        }
        return infoWindow.f5908b;
    }

    boolean a() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
        if (bVar == null) {
            return false;
        }
        return bVar.c();
    }

    void a(TileOverlay tileOverlay) {
        this.Z.lock();
        if (tileOverlay != null) {
            try {
                if (this.U == tileOverlay) {
                    tileOverlay.c();
                    tileOverlay.f6376c = null;
                    com.baidu.mapsdkplatform.comapi.map.b bVar = this.f5638g;
                    if (bVar != null) {
                        bVar.V();
                    }
                }
            } finally {
                this.U = null;
                this.Z.unlock();
            }
        }
    }
}
