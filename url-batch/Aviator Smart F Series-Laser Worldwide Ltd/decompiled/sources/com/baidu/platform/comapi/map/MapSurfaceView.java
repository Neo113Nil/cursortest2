package com.baidu.platform.comapi.map;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import com.baidu.mapapi.OpenLogUtil;
import com.baidu.mapapi.map.OverlayUtil;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.basestruct.MapBound;
import com.baidu.platform.comapi.bmsdk.BmDrawItem;
import com.baidu.platform.comapi.bmsdk.BmLayer;
import com.baidu.platform.comapi.map.MapStatus;
import com.baidu.platform.comapi.map.f;
import com.baidu.platform.comapi.map.t;
import com.baidu.platform.comapi.util.SysOSUtil;
import com.baidu.platform.comjni.map.basemap.AppBaseMap;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MapSurfaceView extends u implements View.OnKeyListener, MapViewInterface, MapRenderModeChangeListener, v {

    /* renamed from: b, reason: collision with root package name */
    private static int f9505b;

    /* renamed from: c, reason: collision with root package name */
    private static final ExecutorService f9506c = Executors.newSingleThreadExecutor();
    protected com.baidu.mapsdkplatform.comapi.map.b A;
    private float B;
    private float C;
    private boolean D;
    private int E;
    private int F;
    private int G;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f9507d;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f9508e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f9509f;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f9510g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f9511h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f9512i;

    /* renamed from: j, reason: collision with root package name */
    protected MapController f9513j;

    /* renamed from: k, reason: collision with root package name */
    protected q f9514k;

    /* renamed from: l, reason: collision with root package name */
    protected i f9515l;

    /* renamed from: m, reason: collision with root package name */
    protected k f9516m;

    /* renamed from: n, reason: collision with root package name */
    private LocationOverlay f9517n;

    /* renamed from: o, reason: collision with root package name */
    protected volatile boolean f9518o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f9519p;

    /* renamed from: q, reason: collision with root package name */
    private List<BmLayer> f9520q;

    /* renamed from: r, reason: collision with root package name */
    private List<Overlay> f9521r;

    /* renamed from: s, reason: collision with root package name */
    private int f9522s;

    /* renamed from: t, reason: collision with root package name */
    private int f9523t;

    /* renamed from: u, reason: collision with root package name */
    private HashSet<n> f9524u;

    /* renamed from: v, reason: collision with root package name */
    protected boolean f9525v;

    /* renamed from: w, reason: collision with root package name */
    protected y f9526w;

    /* renamed from: x, reason: collision with root package name */
    protected GestureDetector f9527x;

    /* renamed from: y, reason: collision with root package name */
    protected o f9528y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f9529z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppBaseMap baseMap;
            MapController mapController = MapSurfaceView.this.f9513j;
            if (mapController == null || (baseMap = mapController.getBaseMap()) == null) {
                return;
            }
            baseMap.ShowSatelliteMap(MapSurfaceView.this.f9508e);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppBaseMap baseMap;
            MapController mapController = MapSurfaceView.this.f9513j;
            if (mapController == null || (baseMap = mapController.getBaseMap()) == null) {
                return;
            }
            baseMap.ShowTrafficMap(MapSurfaceView.this.f9507d);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppBaseMap baseMap;
            MapController mapController = MapSurfaceView.this.f9513j;
            if (mapController == null || (baseMap = mapController.getBaseMap()) == null) {
                return;
            }
            baseMap.ShowTrafficMap(MapSurfaceView.this.f9507d);
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppBaseMap baseMap;
            MapController mapController = MapSurfaceView.this.f9513j;
            if (mapController == null || (baseMap = mapController.getBaseMap()) == null) {
                return;
            }
            baseMap.ShowStreetRoadMap(MapSurfaceView.this.f9509f);
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f9534a;

        e(boolean z7) {
            this.f9534a = z7;
        }

        @Override // java.lang.Runnable
        public void run() {
            AppBaseMap baseMap;
            MapController mapController = MapSurfaceView.this.f9513j;
            if (mapController == null || (baseMap = mapController.getBaseMap()) == null) {
                return;
            }
            baseMap.ShowBaseIndoorMap(this.f9534a);
        }
    }

    private class f implements f.g {

        /* renamed from: a, reason: collision with root package name */
        private int f9536a;

        private f() {
            this.f9536a = 12440;
        }

        public String a(String str, int i8) {
            return str + " failed: " + a(i8);
        }

        public void b(String str, int i8) {
            throw new RuntimeException(a(str, i8));
        }

        @Override // com.baidu.platform.comapi.map.f.g
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{this.f9536a, 2, 12344});
        }

        @Override // com.baidu.platform.comapi.map.f.g
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (eGLContext != null && eGLDisplay != null) {
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
                if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                    Log.e("MapContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
                    b("eglDestroyContex", egl10.eglGetError());
                }
            }
            MapSurfaceView.this.onRecycle();
        }

        /* synthetic */ f(MapSurfaceView mapSurfaceView, a aVar) {
            this();
        }

        private String a(int i8) {
            switch (i8) {
                case 12288:
                    return "EGL_SUCCESS";
                case 12289:
                    return "EGL_NOT_INITIALIZED";
                case 12290:
                    return "EGL_BAD_ACCESS";
                case 12291:
                    return "EGL_BAD_ALLOC";
                case 12292:
                    return "EGL_BAD_ATTRIBUTE";
                case 12293:
                    return "EGL_BAD_CONFIG";
                case 12294:
                    return "EGL_BAD_CONTEXT";
                case 12295:
                    return "EGL_BAD_CURRENT_SURFACE";
                case 12296:
                    return "EGL_BAD_DISPLAY";
                case 12297:
                    return "EGL_BAD_MATCH";
                case 12298:
                    return "EGL_BAD_NATIVE_PIXMAP";
                case 12299:
                    return "EGL_BAD_NATIVE_WINDOW";
                case 12300:
                    return "EGL_BAD_PARAMETER";
                case 12301:
                    return "EGL_BAD_SURFACE";
                case 12302:
                    return "EGL_CONTEXT_LOST";
                default:
                    return b(i8);
            }
        }

        private String b(int i8) {
            return "0x" + Integer.toHexString(i8);
        }
    }

    private class g extends GestureDetector.SimpleOnGestureListener {
        private g() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            GeoPoint fromPixels;
            BmDrawItem a8;
            List<w> list;
            super.onLongPress(motionEvent);
            MapController mapController = MapSurfaceView.this.f9513j;
            if (mapController == null || mapController.getBaseMap() == null) {
                return;
            }
            MapController mapController2 = MapSurfaceView.this.f9513j;
            if (mapController2.mIsMapLoadFinish) {
                String GetNearlyObjID = mapController2.getBaseMap().GetNearlyObjID(-1L, (int) motionEvent.getX(), (int) motionEvent.getY(), MapSurfaceView.this.f9513j.nearlyRadius);
                if (GetNearlyObjID == null || GetNearlyObjID.equals("")) {
                    MapSurfaceView mapSurfaceView = MapSurfaceView.this;
                    if (mapSurfaceView.f9513j.mListeners != null) {
                        fromPixels = mapSurfaceView.getProjection() != null ? MapSurfaceView.this.getProjection().fromPixels((int) motionEvent.getX(), (int) motionEvent.getY()) : null;
                        if (fromPixels == null) {
                            return;
                        }
                        for (w wVar : MapSurfaceView.this.f9513j.mListeners) {
                            if (wVar != null) {
                                wVar.g(fromPixels);
                            }
                        }
                    }
                } else {
                    MapSurfaceView mapSurfaceView2 = MapSurfaceView.this;
                    if (mapSurfaceView2.f9513j.mListeners != null) {
                        fromPixels = mapSurfaceView2.getProjection() != null ? MapSurfaceView.this.getProjection().fromPixels((int) motionEvent.getX(), (int) motionEvent.getY()) : null;
                        for (w wVar2 : MapSurfaceView.this.f9513j.mListeners) {
                            if (wVar2 != null) {
                                if (wVar2.a(GetNearlyObjID)) {
                                    MapSurfaceView.this.f9513j.mHasMapObjDraging = true;
                                } else if (fromPixels != null) {
                                    wVar2.g(fromPixels);
                                }
                            }
                        }
                    }
                }
                if (!OverlayUtil.isOverlayUpgrade() || MapSurfaceView.this.f9520q == null || MapSurfaceView.this.f9520q.isEmpty()) {
                    return;
                }
                for (int i8 = 0; i8 < MapSurfaceView.this.f9520q.size(); i8++) {
                    BmLayer bmLayer = (BmLayer) MapSurfaceView.this.f9520q.get(i8);
                    if (bmLayer != null && (a8 = bmLayer.a((int) motionEvent.getX(), (int) motionEvent.getY(), MapSurfaceView.this.f9513j.nearlyRadius)) != null && (list = MapSurfaceView.this.f9513j.mListeners) != null) {
                        for (w wVar3 : list) {
                            if (wVar3 != null && wVar3.a(a8)) {
                                MapSurfaceView.this.f9513j.mHasBmDrawItemDraging = true;
                            }
                        }
                    }
                }
            }
        }

        /* synthetic */ g(MapSurfaceView mapSurfaceView, a aVar) {
            this();
        }
    }

    public MapSurfaceView(Context context) {
        super(context);
        this.f9507d = false;
        this.f9508e = false;
        this.f9509f = false;
        this.f9510g = true;
        this.f9511h = true;
        this.f9512i = true;
        this.f9513j = null;
        this.f9514k = null;
        this.f9515l = null;
        this.f9518o = false;
        this.f9519p = true;
        this.f9520q = new ArrayList();
        this.f9521r = new ArrayList();
        this.f9522s = 0;
        this.f9523t = 0;
        this.f9524u = new HashSet<>();
        this.f9525v = true;
        this.f9529z = true;
        this.D = false;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        f9505b++;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean addBmLayer(BmLayer bmLayer) {
        return addBmLayerBelow(0L, bmLayer);
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean addBmLayerBelow(Overlay overlay, BmLayer bmLayer) {
        return overlay != null ? addBmLayerBelow(overlay.mLayerID, bmLayer) : addBmLayerBelow(0L, bmLayer);
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public synchronized boolean addOverlay(Overlay overlay) {
        MapController mapController;
        if (overlay != null) {
            try {
                mapController = this.f9513j;
            } catch (Throwable th) {
                throw th;
            }
            if (mapController != null) {
                AppBaseMap baseMap = mapController.getBaseMap();
                if (baseMap == null) {
                    return false;
                }
                if (overlay instanceof InnerOverlay) {
                    InnerOverlay innerOverlay = (InnerOverlay) overlay;
                    if (innerOverlay.mBaseMap == null) {
                        innerOverlay.mBaseMap = getController().getBaseMap();
                    }
                    if (!innerOverlay.addedToMapView()) {
                        return false;
                    }
                    synchronized (this) {
                        this.f9521r.add(overlay);
                        this.f9514k.a((InnerOverlay) overlay);
                    }
                    return true;
                }
                if (!(overlay instanceof ItemizedOverlay)) {
                    return false;
                }
                ItemizedOverlay itemizedOverlay = (ItemizedOverlay) overlay;
                long AddLayer = baseMap.AddLayer(itemizedOverlay.getUpdateType(), 0, "item");
                overlay.mLayerID = AddLayer;
                if (AddLayer == 0) {
                    return false;
                }
                synchronized (this) {
                    this.f9521r.add(overlay);
                    itemizedOverlay.c();
                    baseMap.SetLayersClickable(overlay.mLayerID, true);
                    baseMap.ShowLayers(overlay.mLayerID, true);
                    baseMap.UpdateLayers(overlay.mLayerID);
                }
                return true;
                throw th;
            }
        }
        return false;
    }

    public void addSimpleOnGestureListener(GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        this.f9526w.a(simpleOnGestureListener);
    }

    public void addStateListener(n nVar) {
        if (nVar != null) {
            this.f9524u.add(nVar);
        }
    }

    public void animateTo(MapStatus mapStatus, int i8) {
        MapController mapController = this.f9513j;
        if (mapController != null) {
            mapController.setMapStatusWithAnimation(mapStatus, i8);
        }
    }

    public void beginLocationLayerAnimation() {
        LocationOverlay locationOverlay = this.f9517n;
        if (locationOverlay != null) {
            locationOverlay.beginLocationLayerAnimation();
        }
    }

    @Override // com.baidu.platform.comapi.map.u
    public /* bridge */ /* synthetic */ Bitmap captureImageFromSurface(int i8, int i9, int i10, int i11, Object obj, Bitmap.Config config) {
        return super.captureImageFromSurface(i8, i9, i10, i11, obj, config);
    }

    public void clearDefaultLocationLayerData(Bundle bundle) {
        this.f9517n.clearLocationLayerData(bundle);
    }

    public void doCaptureMapView(com.baidu.platform.comapi.map.c cVar, int i8, int i9) {
        this.f9516m.a(cVar, i8, i9);
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean enable3D() {
        return true;
    }

    public void forceSetTraffic(boolean z7) {
        if (this.f9513j != null) {
            this.f9507d = z7;
        }
        f9506c.submit(new b());
    }

    public com.baidu.mapsdkplatform.comapi.map.b getBaseMap() {
        return this.A;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public List<BmLayer> getBmlayers() {
        return this.f9520q;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public MapController getController() {
        return this.f9513j;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public MapStatus getCurrentMapStatus() {
        MapController mapController = this.f9513j;
        if (mapController != null) {
            return mapController.getCurrentMapStatus();
        }
        return null;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public float getCurrentZoomLevel() {
        MapController mapController = this.f9513j;
        if (mapController != null) {
            return mapController.getCurrentZoomLevel();
        }
        return 0.0f;
    }

    @Override // com.baidu.platform.comapi.map.u
    public /* bridge */ /* synthetic */ int getDebugFlags() {
        return super.getDebugFlags();
    }

    public LocationOverlay getDefaultLocationLay() {
        return this.f9517n;
    }

    public int getFPS() {
        return this.f9791a.getFPS();
    }

    public float getFZoomToBoundF(MapBound mapBound, MapBound mapBound2) {
        if (this.f9513j == null) {
            return 0.0f;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(TtmlNode.LEFT, mapBound.leftBottomPt.getIntX());
        bundle.putInt("bottom", mapBound.leftBottomPt.getIntY());
        bundle.putInt(TtmlNode.RIGHT, mapBound.rightTopPt.getIntX());
        bundle.putInt("top", mapBound.rightTopPt.getIntY());
        Bundle bundle2 = new Bundle();
        bundle2.putInt(TtmlNode.LEFT, mapBound2.leftBottomPt.getIntX());
        bundle2.putInt("bottom", mapBound2.leftBottomPt.getIntY());
        bundle2.putInt(TtmlNode.RIGHT, mapBound2.rightTopPt.getIntX());
        bundle2.putInt("top", mapBound2.rightTopPt.getIntY());
        return this.f9513j.GetFZoomToBoundF(bundle, bundle2);
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public MapStatus.GeoBound getGeoRound() {
        MapController mapController = this.f9513j;
        if (mapController == null) {
            return null;
        }
        return mapController.getMapStatus().geoRound;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public int getLatitudeSpan() {
        MapStatus mapStatus = getMapStatus();
        i iVar = (i) getProjection();
        MapStatus.WinRound winRound = mapStatus.winRound;
        GeoPoint fromPixels = iVar.fromPixels(winRound.left, winRound.top);
        MapStatus.WinRound winRound2 = mapStatus.winRound;
        return (int) Math.abs(fromPixels.getLatitude() - iVar.fromPixels(winRound2.right - 1, winRound2.bottom - 1).getLatitude());
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public int getLongitudeSpan() {
        MapStatus mapStatus = getMapStatus();
        i iVar = (i) getProjection();
        MapStatus.WinRound winRound = mapStatus.winRound;
        GeoPoint fromPixels = iVar.fromPixels(winRound.left, winRound.top);
        MapStatus.WinRound winRound2 = mapStatus.winRound;
        return (int) Math.abs(iVar.fromPixels(winRound2.right - 1, winRound2.bottom - 1).getLongitude() - fromPixels.getLongitude());
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public GeoPoint getMapCenter() {
        MapController mapController = this.f9513j;
        if (mapController == null) {
            return null;
        }
        MapStatus mapStatus = mapController.getMapStatus();
        return new GeoPoint(mapStatus.centerPtY, mapStatus.centerPtX);
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public int getMapRotation() {
        MapController mapController = this.f9513j;
        if (mapController == null) {
            return 0;
        }
        return mapController.getMapStatus().rotation;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public MapStatus getMapStatus() {
        MapController mapController = this.f9513j;
        if (mapController != null) {
            return mapController.getMapStatus();
        }
        return null;
    }

    public MapViewListener getMapViewListener() {
        MapController mapController = this.f9513j;
        if (mapController != null) {
            return mapController.getMapViewListener();
        }
        return null;
    }

    public OnLongPressListener getOnLongPressListener() {
        return this.f9526w.a();
    }

    public synchronized Overlay getOverlay(int i8) {
        if (i8 == 21) {
            return null;
        }
        for (Overlay overlay : this.f9521r) {
            if (overlay.mType == i8) {
                return overlay;
            }
        }
        return null;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public List<Overlay> getOverlays() {
        return this.f9521r;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public double getOverlooking() {
        MapController mapController = this.f9513j;
        return mapController == null ? com.github.mikephil.charting.utils.i.DOUBLE_EPSILON : mapController.getMapStatus().overlooking;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public Projection getProjection() {
        return this.f9515l;
    }

    @Override // com.baidu.platform.comapi.map.u
    public /* bridge */ /* synthetic */ s getRenderControl() {
        return super.getRenderControl();
    }

    @Override // com.baidu.platform.comapi.map.u
    public /* bridge */ /* synthetic */ int getRenderMode() {
        return super.getRenderMode();
    }

    public ExecutorService getSingleThreadPool() {
        return f9506c;
    }

    @Override // com.baidu.platform.comapi.map.u
    public /* bridge */ /* synthetic */ t.a getViewType() {
        return super.getViewType();
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public MapStatus.WinRound getWinRound() {
        MapController mapController = this.f9513j;
        if (mapController == null) {
            return null;
        }
        return mapController.getMapStatus().winRound;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public float getZoomLevel() {
        MapController mapController = this.f9513j;
        if (mapController != null) {
            return mapController.getZoomLevel();
        }
        return 0.0f;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public float getZoomToBound(MapBound mapBound) {
        SysOSUtil sysOSUtil = SysOSUtil.getInstance();
        return getZoomToBound(mapBound, sysOSUtil.getScreenWidth(), sysOSUtil.getScreenHeight());
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public float getZoomToBoundF(MapBound mapBound, int i8, int i9) {
        if (this.f9513j == null) {
            return 0.0f;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(TtmlNode.LEFT, mapBound.leftBottomPt.getIntX());
        bundle.putInt("bottom", mapBound.leftBottomPt.getIntY());
        bundle.putInt(TtmlNode.RIGHT, mapBound.rightTopPt.getIntX());
        bundle.putInt("top", mapBound.rightTopPt.getIntY());
        return this.f9513j.getZoomToBoundF(bundle);
    }

    double getZoomUnitsInMeter() {
        MapController mapController = this.f9513j;
        return mapController != null ? mapController.getZoomUnitsInMeter() : com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
    }

    public boolean inRangeOfView(float f8, float f9) {
        float f10 = 0;
        return f8 >= f10 && f8 <= ((float) this.f9522s) && f9 >= f10 && f9 <= ((float) this.f9523t);
    }

    public synchronized boolean insertOverlay(Overlay overlay, int i8) {
        MapController mapController;
        try {
            if ((overlay instanceof InnerOverlay) && (mapController = this.f9513j) != null) {
                InnerOverlay innerOverlay = (InnerOverlay) overlay;
                if (innerOverlay.mBaseMap == null) {
                    innerOverlay.mBaseMap = mapController.getBaseMap();
                }
                this.f9521r.add(overlay);
                this.f9514k.a(innerOverlay);
            }
        } catch (Throwable th) {
            throw th;
        }
        return false;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean isBaseIndoorMap() {
        return this.f9510g;
    }

    public boolean isPredictTraffic() {
        return this.E > 0 || this.F > 0 || this.G > 0;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean isSatellite() {
        return this.f9508e;
    }

    public boolean isSetBackgroundDraw() {
        MapController mapController = this.f9513j;
        if (mapController == null) {
            return false;
        }
        return mapController.isSetBackgroundDraw();
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean isStreetRoad() {
        return this.f9509f;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean isTraffic() {
        return this.f9507d;
    }

    @Override // com.baidu.platform.comapi.map.u, android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MapController mapController = this.f9513j;
        if (mapController != null) {
            mapController.updateDrawFPS();
        }
    }

    public void onBackground() {
        onBackground(false);
    }

    @Override // com.baidu.platform.comapi.map.u, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        MapController mapController = this.f9513j;
        if (mapController != null) {
            mapController.updateDrawFPS();
        }
        super.onDetachedFromWindow();
    }

    public void onForeground() {
        onForeground(false);
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i8, KeyEvent keyEvent) {
        if (this != view || keyEvent.getAction() != 0) {
            return false;
        }
        switch (i8) {
            case 19:
                this.f9513j.scrollBy(0, -50);
                break;
            case 20:
                this.f9513j.scrollBy(0, 50);
                break;
            case 21:
                this.f9513j.scrollBy(-50, 0);
                break;
            case 22:
                this.f9513j.scrollBy(50, 0);
                break;
        }
        return false;
    }

    @Override // com.baidu.platform.comapi.map.MapRenderModeChangeListener
    public void onMapRenderModeChange(int i8) {
        o oVar;
        if (i8 == 1) {
            requestRender();
            return;
        }
        if (i8 == 0) {
            if (getRenderMode() != 0) {
                setRenderMode(0);
            }
        } else {
            if (i8 != 2 || (oVar = this.f9528y) == null) {
                return;
            }
            oVar.a();
        }
    }

    @Override // com.baidu.platform.comapi.map.u
    public void onPause() {
        if (this.f9511h) {
            return;
        }
        if (OpenLogUtil.isMapLogEnable()) {
            com.baidu.mapsdkplatform.comapi.commonutils.b.a().a("BasicMap onPause");
        }
        k kVar = this.f9516m;
        if (kVar != null) {
            kVar.b();
        }
        MapController mapController = this.f9513j;
        if (mapController != null) {
            mapController.onPause();
        }
        Iterator<n> it = this.f9524u.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
        super.onPause();
        this.f9511h = true;
    }

    public void onRecycle() {
        MapController mapController = this.f9513j;
        if (mapController == null || mapController.getBaseMap() == null) {
            return;
        }
        this.f9513j.getBaseMap().ResetImageRes();
    }

    @Override // com.baidu.platform.comapi.map.MapRenderModeChangeListener
    public void onRequestRender() {
        requestRender();
    }

    @Override // com.baidu.platform.comapi.map.u
    public void onResume() {
        if (this.f9511h) {
            if (OpenLogUtil.isMapLogEnable()) {
                com.baidu.mapsdkplatform.comapi.commonutils.b.a().a("BasicMap onResume isInited = " + this.f9518o);
            }
            if (this.f9518o) {
                k kVar = this.f9516m;
                if (kVar != null) {
                    kVar.c();
                }
                MapController mapController = this.f9513j;
                if (mapController != null) {
                    mapController.onResume();
                }
                Iterator<n> it = this.f9524u.iterator();
                while (it.hasNext()) {
                    it.next().a(this);
                }
                setRenderMode(1);
                super.onResume();
                this.f9511h = false;
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        this.B = i8;
        this.C = i9;
    }

    @Override // android.view.View, com.baidu.platform.comapi.map.MapViewInterface
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i8;
        com.baidu.mapsdkplatform.comapi.map.b bVar;
        List<w> list;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.D = false;
        } else if (action == 2) {
            float x7 = motionEvent.getX();
            float y7 = motionEvent.getY();
            if ((x7 < 0.0f || x7 > this.B || y7 < 0.0f || y7 > this.C) && !this.D && (bVar = this.A) != null && (list = bVar.f8069v) != null) {
                for (w wVar : list) {
                    if (wVar != null) {
                        wVar.b(this.A.y());
                        this.D = true;
                    }
                }
            }
        }
        MapStatus mapStatus = getMapStatus();
        int pointerCount = motionEvent.getPointerCount();
        while (i8 < pointerCount) {
            int x8 = (int) motionEvent.getX(i8);
            int y8 = (int) motionEvent.getY(i8);
            if (mapStatus != null) {
                MapStatus.WinRound winRound = mapStatus.winRound;
                i8 = (x8 >= winRound.left && x8 <= winRound.right && y8 >= winRound.top && y8 <= winRound.bottom) ? i8 + 1 : 0;
            }
            if (motionEvent.getAction() != 262 && motionEvent.getAction() != 6) {
                return false;
            }
        }
        try {
            GestureDetector gestureDetector = this.f9527x;
            if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
            MapController mapController = this.f9513j;
            if (mapController != null) {
                if (mapController.handleTouchEvent(motionEvent)) {
                    return true;
                }
            }
            return super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            return super.onTouchEvent(motionEvent);
        }
    }

    @Override // com.baidu.platform.comapi.map.u
    public /* bridge */ /* synthetic */ void queueEvent(Runnable runnable) {
        super.queueEvent(runnable);
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void refresh(Overlay overlay) {
        if (overlay == null || this.f9513j == null) {
            return;
        }
        if (overlay instanceof ItemizedOverlay) {
            ItemizedOverlay itemizedOverlay = (ItemizedOverlay) overlay;
            if (itemizedOverlay.b()) {
                if (itemizedOverlay.getAllItem().size() <= 0) {
                    this.f9513j.getBaseMap().ClearLayer(overlay.mLayerID);
                    this.f9513j.getBaseMap().ShowLayers(overlay.mLayerID, false);
                    this.f9513j.getBaseMap().UpdateLayers(overlay.mLayerID);
                } else {
                    this.f9513j.getBaseMap().ShowLayers(overlay.mLayerID, true);
                    this.f9513j.getBaseMap().UpdateLayers(overlay.mLayerID);
                }
                itemizedOverlay.b(false);
            }
        }
        MapController mapController = this.f9513j;
        if (mapController == null || mapController.getBaseMap() == null) {
            return;
        }
        this.f9513j.getBaseMap().UpdateLayers(overlay.mLayerID);
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public synchronized boolean removeBmLayer(BmLayer bmLayer) {
        if (bmLayer != null) {
            MapController mapController = this.f9513j;
            if (mapController != null) {
                AppBaseMap baseMap = mapController.getBaseMap();
                if (baseMap == null) {
                    return false;
                }
                baseMap.removeBmLayer(bmLayer.getNativeInstance());
                synchronized (this) {
                    this.f9520q.remove(bmLayer);
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public synchronized boolean removeOverlay(Overlay overlay) {
        if (overlay != null) {
            MapController mapController = this.f9513j;
            if (mapController != null) {
                AppBaseMap baseMap = mapController.getBaseMap();
                if (baseMap == null) {
                    return false;
                }
                baseMap.ClearLayer(overlay.mLayerID);
                baseMap.ShowLayers(overlay.mLayerID, false);
                baseMap.UpdateLayers(overlay.mLayerID);
                baseMap.RemoveLayer(overlay.mLayerID);
                synchronized (this) {
                    try {
                        if (overlay instanceof ItemizedOverlay) {
                            this.f9521r.remove(overlay);
                        } else if (overlay instanceof InnerOverlay) {
                            this.f9521r.remove(overlay);
                            this.f9514k.a(overlay);
                        }
                        overlay.mLayerID = 0L;
                    } finally {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void removeSimpleOnGestureListener(GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        this.f9526w.b(simpleOnGestureListener);
    }

    public void removeStateListener(n nVar) {
        if (nVar != null) {
            this.f9524u.remove(nVar);
        }
    }

    @Override // com.baidu.platform.comapi.map.u
    public /* bridge */ /* synthetic */ void requestRender() {
        super.requestRender();
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void saveScreenToLocal(String str) {
        MapController mapController = this.f9513j;
        if (mapController != null) {
            mapController.saveScreenToLocal(str);
        }
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setBaseIndoorMap(boolean z7) {
        if (this.f9513j != null) {
            this.f9510g = z7;
        }
        f9506c.submit(new e(z7));
    }

    public void setBaseMap(com.baidu.mapsdkplatform.comapi.map.b bVar) {
        this.A = bVar;
    }

    @Override // com.baidu.platform.comapi.map.u
    public /* bridge */ /* synthetic */ void setDebugFlags(int i8) {
        super.setDebugFlags(i8);
    }

    public void setDefaultLocationLayerData(List<OverlayLocationData> list) {
        this.f9517n.setLocationLayerData(list);
    }

    public void setFPS(int i8) {
        this.f9791a.setFPS(i8);
    }

    public void setFirstFrameListener(com.baidu.platform.comapi.map.e eVar) {
        k kVar = this.f9516m;
        if (kVar != null) {
            kVar.a(eVar);
        }
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setGeoRound(MapStatus.GeoBound geoBound) {
    }

    protected void setGestureDetector(GestureDetector gestureDetector) {
        this.f9527x = gestureDetector;
    }

    public boolean setItsPreTime(int i8, int i9, int i10) {
        AppBaseMap baseMap;
        if (this.E == i8 && this.F == i9 && this.G == i10) {
            return true;
        }
        MapController mapController = this.f9513j;
        if (mapController == null || (baseMap = mapController.getBaseMap()) == null) {
            return false;
        }
        this.E = i8;
        this.F = i9;
        this.G = i10;
        return baseMap.SetItsPreTime(i8, i9, i10);
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setMapCenter(GeoPoint geoPoint) {
        MapController mapController = this.f9513j;
        if (mapController != null) {
            MapStatus mapStatus = mapController.getMapStatus();
            mapStatus.centerPtX = geoPoint.getLongitude();
            mapStatus.centerPtY = geoPoint.getLatitude();
            this.f9513j.setMapStatus(mapStatus);
        }
    }

    public void setMapController(MapController mapController) {
        if (this.f9513j != null) {
            return;
        }
        this.f9513j = mapController;
        this.f9516m.a(mapController.getBaseMap());
        this.f9516m.a(true);
        q qVar = new q(this.f9513j.getBaseMap());
        this.f9514k = qVar;
        this.f9513j.setOverlayMapCallBack(qVar);
        this.f9513j.setMapViewInterface(this);
        b();
        this.f9513j.setMapRenderModeChangeListener(this);
        this.f9518o = true;
        this.f9515l = new i(this.f9513j);
        this.f9526w.a(this.f9513j);
    }

    public void setMapRenderStableListener(o oVar) {
        this.f9528y = oVar;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setMapStatus(MapStatus mapStatus) {
        MapController mapController = this.f9513j;
        if (mapController != null) {
            mapController.setMapStatus(mapStatus);
        }
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setMapTo2D(boolean z7) {
    }

    public void setOnLongPressListener(OnLongPressListener onLongPressListener) {
        this.f9526w.a(onLongPressListener);
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setOverlooking(int i8) {
        MapController mapController = this.f9513j;
        if (mapController != null) {
            MapStatus mapStatus = mapController.getMapStatus();
            mapStatus.overlooking = i8;
            this.f9513j.setMapStatus(mapStatus);
        }
    }

    public void setPixelFormatTransparent(boolean z7) {
        if (z7) {
            getHolder().setFormat(-3);
        } else {
            getHolder().setFormat(-1);
        }
    }

    @Override // com.baidu.platform.comapi.map.u
    public /* bridge */ /* synthetic */ void setRenderMode(int i8) {
        super.setRenderMode(i8);
    }

    @Override // com.baidu.platform.comapi.map.u
    public /* bridge */ /* synthetic */ void setRenderer(SurfaceRenderer surfaceRenderer) {
        super.setRenderer(surfaceRenderer);
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setRotation(int i8) {
        MapController mapController = this.f9513j;
        if (mapController != null) {
            MapStatus mapStatus = mapController.getMapStatus();
            mapStatus.rotation = i8;
            this.f9513j.setMapStatus(mapStatus);
        }
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setSatellite(boolean z7) {
        if (this.f9513j != null) {
            this.f9508e = z7;
        }
        f9506c.submit(new a());
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setStreetRoad(boolean z7) {
        if (this.f9513j != null) {
            this.f9509f = z7;
        }
        f9506c.submit(new d());
    }

    public void setSupBackgroundDraw(boolean z7) {
        MapController mapController = this.f9513j;
        if (mapController == null) {
            return;
        }
        mapController.setSupBackgroundDraw(z7);
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setTraffic(boolean z7) {
        if (this.f9507d == z7) {
            return;
        }
        if (this.f9513j != null) {
            this.f9507d = z7;
        }
        f9506c.submit(new c());
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setWinRound(MapStatus.WinRound winRound) {
        MapController mapController = this.f9513j;
        if (mapController != null) {
            MapStatus mapStatus = mapController.getMapStatus();
            mapStatus.winRound = winRound;
            this.f9513j.setMapStatus(mapStatus);
        }
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setZoomLevel(float f8) {
        if (this.f9513j == null) {
            return;
        }
        getController().getFocusedBaseIndoorMapInfo();
        if (f8 < 4.0f) {
            f8 = 4.0f;
        } else {
            float f9 = 22;
            if (f8 > f9) {
                f8 = f9;
            }
        }
        MapStatus mapStatus = getMapStatus();
        if (mapStatus != null) {
            mapStatus.level = f8;
            animateTo(mapStatus, 300);
        }
    }

    @Override // com.baidu.platform.comapi.map.u, android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i8, int i9, int i10) {
        MapController mapController = this.f9513j;
        if (mapController != null) {
            mapController.updateDrawFPS();
        }
        k kVar = this.f9516m;
        if (kVar != null) {
            kVar.f9772v = i9;
            kVar.f9773w = i10;
            kVar.f9774x = 0;
        }
        this.f9522s = i9;
        this.f9523t = i10;
        super.surfaceChanged(surfaceHolder, i8, i9, i10);
        if (this.f9513j != null) {
            MapStatus mapStatus = getMapStatus();
            if (mapStatus != null) {
                MapStatus.WinRound winRound = mapStatus.winRound;
                winRound.left = 0;
                winRound.top = 0;
                winRound.bottom = i10;
                winRound.right = i9;
                if (this.f9519p) {
                    this.f9519p = false;
                    this.f9513j.setMapStatusWithAnimation(mapStatus, 4, 0);
                } else {
                    this.f9513j.setMapStatus(mapStatus, false);
                }
                if (this.f9513j.getMapViewSurfaceListener() != null) {
                    this.f9513j.getMapViewSurfaceListener().onSurfaceChanged(i9, i10);
                }
            }
            MapStatus mapStatus2 = getMapStatus();
            MapStatus.WinRound winRound2 = mapStatus2.winRound;
            int abs = Math.abs(winRound2.right - winRound2.left);
            MapStatus.WinRound winRound3 = mapStatus2.winRound;
            int abs2 = Math.abs(winRound3.bottom - winRound3.top);
            if (OpenLogUtil.isMapLogEnable()) {
                com.baidu.mapsdkplatform.comapi.commonutils.b.a().a("MapSurfaceView winRoundWidth = " + abs + ";winRoundHeight = " + abs2 + ";mWidth = " + this.f9522s + ";mHeight = " + this.f9523t);
            }
            if (abs > 0 && abs2 > 0) {
                this.f9522s = abs;
                this.f9523t = abs2;
            }
            this.f9513j.setScreenSize(this.f9522s, this.f9523t);
            if (this.f9513j.isNaviMode() && this.f9513j.getNaviMapViewListener() != null) {
                this.f9513j.getNaviMapViewListener().resizeScreen(i9, i10);
            }
        }
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.A;
        if (bVar != null) {
            bVar.b(this.f9522s, this.f9523t);
        }
    }

    @Override // com.baidu.platform.comapi.map.u, android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        MapController mapController = this.f9513j;
        if (mapController != null) {
            mapController.updateDrawFPS();
        }
        super.surfaceCreated(surfaceHolder);
        if (surfaceHolder == null || surfaceHolder.getSurface().isValid()) {
            return;
        }
        surfaceDestroyed(surfaceHolder);
    }

    @Override // com.baidu.platform.comapi.map.u, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        MapController mapController = this.f9513j;
        if (mapController != null) {
            mapController.updateDrawFPS();
        }
        super.surfaceDestroyed(surfaceHolder);
    }

    @Override // com.baidu.platform.comapi.map.u, android.view.SurfaceHolder.Callback2
    @Deprecated
    public /* bridge */ /* synthetic */ void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        super.surfaceRedrawNeeded(surfaceHolder);
    }

    @Override // com.baidu.platform.comapi.map.u, android.view.SurfaceHolder.Callback2
    @TargetApi(26)
    public /* bridge */ /* synthetic */ void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        super.surfaceRedrawNeededAsync(surfaceHolder, runnable);
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean switchOverlay(Overlay overlay, Overlay overlay2) {
        MapController mapController;
        AppBaseMap baseMap;
        if (overlay == null || overlay2 == null || (mapController = this.f9513j) == null || (baseMap = mapController.getBaseMap()) == null) {
            return false;
        }
        return baseMap.SwitchLayer(overlay.mLayerID, overlay2.mLayerID);
    }

    public void unInit() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.A;
        if (bVar != null) {
            List<w> list = bVar.f8069v;
            if (list != null) {
                for (w wVar : list) {
                    if (wVar != null) {
                        wVar.d();
                    }
                }
            }
            this.A.h();
            this.A = null;
        }
        MapController mapController = this.f9513j;
        if (mapController != null) {
            mapController.unInit();
        }
        this.f9513j = null;
        q qVar = this.f9514k;
        if (qVar != null) {
            qVar.a();
        }
        this.f9514k = null;
        this.f9515l = null;
        this.f9516m = null;
        if (OpenLogUtil.isMapLogEnable()) {
            com.baidu.mapsdkplatform.comapi.commonutils.b.a().a("BasicMap surfaceView unInit");
        }
    }

    @Override // com.baidu.platform.comapi.map.u
    protected s a(t.a aVar, boolean z7, Context context) {
        s a8 = super.a(aVar, z7, context);
        if (a8 instanceof com.baidu.platform.comapi.map.f) {
            com.baidu.platform.comapi.map.f fVar = (com.baidu.platform.comapi.map.f) a8;
            if (this.f9529z) {
                fVar.a(new f(this, null));
            }
        }
        return a8;
    }

    public void animateTo(MapStatus mapStatus, int i8, int i9) {
        MapController mapController = this.f9513j;
        if (mapController != null) {
            mapController.setMapStatusWithAnimation(mapStatus, i8, i9);
        }
    }

    protected void b() {
        MapController mapController = this.f9513j;
        if (mapController == null || mapController.getBaseMap() == null) {
            return;
        }
        a();
    }

    public void doCaptureMapView(com.baidu.platform.comapi.map.c cVar, int i8, int i9, Bitmap.Config config) {
        this.f9516m.a(cVar, i8, i9, config);
    }

    public void onBackground(boolean z7) {
        if (z7 || !this.f9512i) {
            MapController mapController = this.f9513j;
            if (mapController != null && mapController.getBaseMap() != null) {
                this.f9513j.getBaseMap().OnBackground();
            }
            this.f9512i = true;
        }
    }

    public void onForeground(boolean z7) {
        if (z7 || this.f9512i) {
            MapController mapController = this.f9513j;
            if (mapController != null && mapController.getBaseMap() != null) {
                this.f9513j.getBaseMap().OnForeground();
            }
            this.f9512i = false;
            if (this.f9791a.getViewType() == t.a.VULKAN) {
                k kVar = this.f9516m;
                if (kVar != null) {
                    kVar.c();
                }
                super.onResume();
            }
        }
    }

    public void saveScreenToLocal(String str, Rect rect) {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.A;
        if (bVar == null || bVar.i() == null) {
            return;
        }
        String str2 = null;
        if (rect == null) {
            this.A.i().SaveScreenToLocal(str, null);
            return;
        }
        int i8 = rect.left;
        int i9 = this.f9523t;
        int i10 = rect.bottom;
        int i11 = i9 < i10 ? 0 : i9 - i10;
        int width = rect.width();
        int height = rect.height();
        if (i8 < 0 || i11 < 0 || width <= 0 || height <= 0) {
            return;
        }
        if (width > this.f9522s) {
            width = Math.abs(rect.width()) - (rect.right - this.f9522s);
        }
        if (height > this.f9523t) {
            height = Math.abs(rect.height()) - (rect.bottom - this.f9523t);
        }
        if (i8 > com.baidu.mapapi.common.SysOSUtil.getScreenSizeX() || i11 > com.baidu.mapapi.common.SysOSUtil.getScreenSizeY()) {
            this.A.i().SaveScreenToLocal(str, null);
            return;
        }
        if (width != 0 && height != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("x", i8);
                jSONObject.put("y", i11);
                jSONObject.put(com.arthenica.ffmpegkit.x.KEY_WIDTH, width);
                jSONObject.put(com.arthenica.ffmpegkit.x.KEY_HEIGHT, height);
                str2 = jSONObject.toString();
            } catch (Exception unused) {
            }
        }
        this.A.i().SaveScreenToLocal(str, str2);
    }

    public synchronized boolean addBmLayerBelow(long j8, BmLayer bmLayer) {
        if (bmLayer != null) {
            MapController mapController = this.f9513j;
            if (mapController != null) {
                AppBaseMap baseMap = mapController.getBaseMap();
                if (baseMap == null) {
                    return false;
                }
                synchronized (this) {
                    if (this.f9520q.contains(bmLayer)) {
                        return false;
                    }
                    this.f9520q.add(bmLayer);
                    return baseMap.addBmLayerBelow(j8, bmLayer.getNativeInstance(), 1, 0);
                }
            }
        }
        return false;
    }

    public void doCaptureMapView(com.baidu.platform.comapi.map.c cVar, Rect rect, Bitmap.Config config) {
        if (rect != null) {
            int i8 = rect.left;
            int i9 = this.f9523t;
            int i10 = rect.bottom;
            int i11 = i9 < i10 ? 0 : i9 - i10;
            int width = rect.width();
            int height = rect.height();
            if (i8 < 0 || i11 < 0 || width <= 0 || height <= 0) {
                return;
            }
            if (width > this.f9522s) {
                width = Math.abs(rect.width()) - (rect.right - this.f9522s);
            }
            int i12 = width;
            int abs = height > this.f9523t ? Math.abs(rect.height()) - (rect.bottom - this.f9523t) : height;
            if (i8 > com.baidu.mapapi.common.SysOSUtil.getScreenSizeX() || i11 > com.baidu.mapapi.common.SysOSUtil.getScreenSizeY()) {
                return;
            }
            this.f9516m.a(cVar, i8, i11, i12, abs, config);
            requestRender();
        }
    }

    public synchronized Overlay getOverlay(Class<?> cls) {
        for (Overlay overlay : this.f9521r) {
            if (overlay.getClass() == cls) {
                return overlay;
            }
        }
        return null;
    }

    public MapSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9507d = false;
        this.f9508e = false;
        this.f9509f = false;
        this.f9510g = true;
        this.f9511h = true;
        this.f9512i = true;
        this.f9513j = null;
        this.f9514k = null;
        this.f9515l = null;
        this.f9518o = false;
        this.f9519p = true;
        this.f9520q = new ArrayList();
        this.f9521r = new ArrayList();
        this.f9522s = 0;
        this.f9523t = 0;
        this.f9524u = new HashSet<>();
        this.f9525v = true;
        this.f9529z = true;
        this.D = false;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        f9505b++;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public float getZoomToBound(MapBound mapBound, int i8, int i9) {
        if (this.f9513j == null) {
            return 0.0f;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(TtmlNode.LEFT, mapBound.leftBottomPt.getIntX());
        bundle.putInt("bottom", mapBound.leftBottomPt.getIntY());
        bundle.putInt(TtmlNode.RIGHT, mapBound.rightTopPt.getIntX());
        bundle.putInt("top", mapBound.rightTopPt.getIntY());
        return this.f9513j.getZoomToBound(bundle, i8, i9);
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setZoomLevel(int i8) {
        setZoomLevel(i8);
    }

    @Override // com.baidu.platform.comapi.map.u
    protected void a(Context context, t.a aVar, boolean z7) {
        super.a(context, aVar, z7);
        setBackgroundColor(Color.rgb(244, 242, 240));
        setPixelFormatTransparent(false);
        this.f9526w = new y();
        this.f9527x = new GestureDetector(context, this.f9526w);
        k kVar = new k((WeakReference<MapSurfaceView>) new WeakReference(this), this);
        this.f9516m = kVar;
        setRenderer(kVar);
        setRenderMode(1);
        this.f9526w.a(new g(this, null));
        if (OpenLogUtil.isMapLogEnable()) {
            com.baidu.mapsdkplatform.comapi.commonutils.b.a().a("BasicMap surfaceView initView");
        }
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public float getZoomToBoundF(MapBound mapBound) {
        SysOSUtil sysOSUtil = SysOSUtil.getInstance();
        return getZoomToBoundF(mapBound, sysOSUtil.getScreenWidth(), sysOSUtil.getScreenHeight());
    }

    public MapSurfaceView(Context context, t.a aVar) {
        super(context, aVar);
        this.f9507d = false;
        this.f9508e = false;
        this.f9509f = false;
        this.f9510g = true;
        this.f9511h = true;
        this.f9512i = true;
        this.f9513j = null;
        this.f9514k = null;
        this.f9515l = null;
        this.f9518o = false;
        this.f9519p = true;
        this.f9520q = new ArrayList();
        this.f9521r = new ArrayList();
        this.f9522s = 0;
        this.f9523t = 0;
        this.f9524u = new HashSet<>();
        this.f9525v = true;
        this.f9529z = true;
        this.D = false;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        f9505b++;
    }

    public MapSurfaceView(Context context, t.a aVar, boolean z7) {
        super(context, aVar, z7);
        this.f9507d = false;
        this.f9508e = false;
        this.f9509f = false;
        this.f9510g = true;
        this.f9511h = true;
        this.f9512i = true;
        this.f9513j = null;
        this.f9514k = null;
        this.f9515l = null;
        this.f9518o = false;
        this.f9519p = true;
        this.f9520q = new ArrayList();
        this.f9521r = new ArrayList();
        this.f9522s = 0;
        this.f9523t = 0;
        this.f9524u = new HashSet<>();
        this.f9525v = true;
        this.f9529z = true;
        this.D = false;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        f9505b++;
    }

    public MapSurfaceView(Context context, boolean z7) {
        super(context, z7);
        this.f9507d = false;
        this.f9508e = false;
        this.f9509f = false;
        this.f9510g = true;
        this.f9511h = true;
        this.f9512i = true;
        this.f9513j = null;
        this.f9514k = null;
        this.f9515l = null;
        this.f9518o = false;
        this.f9519p = true;
        this.f9520q = new ArrayList();
        this.f9521r = new ArrayList();
        this.f9522s = 0;
        this.f9523t = 0;
        this.f9524u = new HashSet<>();
        this.f9525v = true;
        this.f9529z = true;
        this.D = false;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        f9505b++;
    }

    protected void a() {
        MapController mapController = this.f9513j;
        if (mapController == null || mapController.getBaseMap() == null || this.f9514k == null) {
            return;
        }
        this.f9521r.clear();
        this.f9514k.a();
    }
}
