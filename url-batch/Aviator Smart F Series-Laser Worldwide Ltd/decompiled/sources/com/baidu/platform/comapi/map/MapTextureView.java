package com.baidu.platform.comapi.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.baidu.mapapi.OpenLogUtil;
import com.baidu.mapapi.common.SysOSUtil;
import com.baidu.mapapi.map.OverlayUtil;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.basestruct.MapBound;
import com.baidu.platform.comapi.bmsdk.BmDrawItem;
import com.baidu.platform.comapi.bmsdk.BmLayer;
import com.baidu.platform.comapi.map.MapStatus;
import com.baidu.platform.comjni.map.basemap.AppBaseMap;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* loaded from: classes2.dex */
public class MapTextureView extends GLTextureView implements MapRenderModeChangeListener, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, MapViewInterface, v {
    protected List<Overlay> innerOverlayList;
    protected com.baidu.mapsdkplatform.comapi.map.b mBaseMapInner;
    protected GestureDetector mGestureDetector;
    protected MapController mMapController;
    protected i mProjection;
    protected o mapRenderStableListener;
    protected k mapRenderer;

    /* renamed from: o, reason: collision with root package name */
    int f9539o;
    protected q overlayMapCallBack;

    /* renamed from: p, reason: collision with root package name */
    int f9540p;

    /* renamed from: q, reason: collision with root package name */
    private List<BmLayer> f9541q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f9542r;

    /* renamed from: s, reason: collision with root package name */
    private d f9543s;
    protected y simpleGestureAdapter;

    /* renamed from: t, reason: collision with root package name */
    private float f9544t;

    /* renamed from: u, reason: collision with root package name */
    private float f9545u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f9546v;

    private class b implements GLSurfaceView.EGLContextFactory {

        /* renamed from: a, reason: collision with root package name */
        private int f9547a;

        private b() {
            this.f9547a = 12440;
        }

        public String a(String str, int i8) {
            return str + " failed: " + a(i8);
        }

        public void b(String str, int i8) {
            throw new RuntimeException(a(str, i8));
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{this.f9547a, 2, 12344});
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (eGLContext == null || eGLDisplay == null) {
                return;
            }
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                b("eglDestroyContex", egl10.eglGetError());
            }
            MapTextureView.this.onRecycle();
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

    private class c extends GestureDetector.SimpleOnGestureListener {
        private c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            GeoPoint fromPixels;
            BmDrawItem a8;
            List<w> list;
            super.onLongPress(motionEvent);
            MapController mapController = MapTextureView.this.mMapController;
            if (mapController == null || mapController.getBaseMap() == null) {
                return;
            }
            MapController mapController2 = MapTextureView.this.mMapController;
            if (mapController2.mIsMapLoadFinish) {
                String GetNearlyObjID = mapController2.getBaseMap().GetNearlyObjID(-1L, (int) motionEvent.getX(), (int) motionEvent.getY(), MapTextureView.this.mMapController.nearlyRadius);
                if (GetNearlyObjID == null || GetNearlyObjID.equals("")) {
                    MapTextureView mapTextureView = MapTextureView.this;
                    if (mapTextureView.mMapController.mListeners != null) {
                        fromPixels = mapTextureView.getProjection() != null ? MapTextureView.this.getProjection().fromPixels((int) motionEvent.getX(), (int) motionEvent.getY()) : null;
                        if (fromPixels == null) {
                            return;
                        }
                        for (w wVar : MapTextureView.this.mMapController.mListeners) {
                            if (wVar != null) {
                                wVar.g(fromPixels);
                            }
                        }
                    }
                } else {
                    MapTextureView mapTextureView2 = MapTextureView.this;
                    if (mapTextureView2.mMapController.mListeners != null) {
                        fromPixels = mapTextureView2.getProjection() != null ? MapTextureView.this.getProjection().fromPixels((int) motionEvent.getX(), (int) motionEvent.getY()) : null;
                        for (w wVar2 : MapTextureView.this.mMapController.mListeners) {
                            if (wVar2 != null) {
                                if (wVar2.a(GetNearlyObjID)) {
                                    MapTextureView.this.mMapController.mHasMapObjDraging = true;
                                } else if (fromPixels != null) {
                                    wVar2.g(fromPixels);
                                }
                            }
                        }
                    }
                }
                if (!OverlayUtil.isOverlayUpgrade() || MapTextureView.this.f9541q == null || MapTextureView.this.f9541q.isEmpty()) {
                    return;
                }
                for (int i8 = 0; i8 < MapTextureView.this.f9541q.size(); i8++) {
                    BmLayer bmLayer = (BmLayer) MapTextureView.this.f9541q.get(i8);
                    if (bmLayer != null && (a8 = bmLayer.a((int) motionEvent.getX(), (int) motionEvent.getY(), MapTextureView.this.mMapController.nearlyRadius)) != null && (list = MapTextureView.this.mMapController.mListeners) != null) {
                        for (w wVar3 : list) {
                            if (wVar3 != null && wVar3.a(a8)) {
                                MapTextureView.this.mMapController.mHasBmDrawItemDraging = true;
                            }
                        }
                    }
                }
            }
        }
    }

    public interface d {
        void a(int i8);
    }

    public MapTextureView(Context context) {
        super(context);
        this.mMapController = null;
        this.overlayMapCallBack = null;
        this.mProjection = null;
        this.mapRenderer = null;
        this.f9541q = new ArrayList();
        this.innerOverlayList = new ArrayList();
        this.f9542r = true;
        this.f9546v = false;
        a(context);
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean addBmLayer(BmLayer bmLayer) {
        return a(0L, bmLayer);
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean addBmLayerBelow(Overlay overlay, BmLayer bmLayer) {
        return overlay != null ? a(overlay.mLayerID, bmLayer) : a(0L, bmLayer);
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean addOverlay(Overlay overlay) {
        MapController mapController;
        AppBaseMap baseMap;
        if (overlay == null || (mapController = this.mMapController) == null || (baseMap = mapController.getBaseMap()) == null) {
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
            this.innerOverlayList.add(overlay);
            this.overlayMapCallBack.a(innerOverlay);
            return true;
        }
        if (overlay instanceof ItemizedOverlay) {
            ItemizedOverlay itemizedOverlay = (ItemizedOverlay) overlay;
            long AddLayer = baseMap.AddLayer(itemizedOverlay.getUpdateType(), 0, "item");
            overlay.mLayerID = AddLayer;
            if (AddLayer == 0) {
                return false;
            }
            this.innerOverlayList.add(overlay);
            itemizedOverlay.c();
            baseMap.SetLayersClickable(overlay.mLayerID, true);
            baseMap.ShowLayers(overlay.mLayerID, true);
            baseMap.UpdateLayers(overlay.mLayerID);
            return true;
        }
        return false;
    }

    public void animateTo(MapStatus mapStatus, int i8) {
        MapController mapController = this.mMapController;
        if (mapController != null) {
            mapController.setMapStatusWithAnimation(mapStatus, i8);
        }
    }

    public void attachBaseMapController(MapController mapController) {
        k kVar = new k(this, this);
        this.mapRenderer = kVar;
        this.mMapController = mapController;
        kVar.a(mapController.getBaseMap());
        setEGLContextFactory(new b());
        setRenderer(this.mapRenderer);
        setRenderMode(0);
        this.mapRenderer.a(true);
        setPreserveEGLContextOnPause(true);
        q qVar = new q(this.mMapController.getBaseMap());
        this.overlayMapCallBack = qVar;
        this.mMapController.setOverlayMapCallBack(qVar);
        this.mMapController.setMapViewInterface(this);
        initInnerOverlays();
        this.mMapController.setMapRenderModeChangeListener(this);
        this.mProjection = new i(this.mMapController);
        this.simpleGestureAdapter.a(this.mMapController);
    }

    protected void clearInnerOverlays() {
        MapController mapController = this.mMapController;
        if (mapController == null || mapController.getBaseMap() == null || this.overlayMapCallBack == null) {
            return;
        }
        this.innerOverlayList.clear();
        this.overlayMapCallBack.a();
    }

    public void destroyForMultiViews() {
        MapController mapController = this.mMapController;
        if (mapController != null) {
            mapController.unInitForMultiTextureView();
            this.mMapController = null;
        }
        q qVar = this.overlayMapCallBack;
        if (qVar != null) {
            qVar.a();
            this.overlayMapCallBack = null;
        }
        this.mProjection = null;
    }

    public void doCaptureMapView(com.baidu.platform.comapi.map.c cVar, int i8, int i9, Bitmap.Config config) {
        this.mapRenderer.a(cVar, i8, i9, config);
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean enable3D() {
        return false;
    }

    public com.baidu.mapsdkplatform.comapi.map.b getBaseMap() {
        return this.mBaseMapInner;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public List<BmLayer> getBmlayers() {
        return this.f9541q;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public MapController getController() {
        return this.mMapController;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public MapStatus getCurrentMapStatus() {
        MapController mapController = this.mMapController;
        if (mapController != null) {
            return mapController.getCurrentMapStatus();
        }
        return null;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public float getCurrentZoomLevel() {
        MapController mapController = this.mMapController;
        if (mapController != null) {
            return mapController.getCurrentZoomLevel();
        }
        return 0.0f;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public MapStatus.GeoBound getGeoRound() {
        MapController mapController = this.mMapController;
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
        MapController mapController = this.mMapController;
        if (mapController == null) {
            return null;
        }
        MapStatus mapStatus = mapController.getMapStatus();
        return new GeoPoint(mapStatus.centerPtY, mapStatus.centerPtX);
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public int getMapRotation() {
        MapController mapController = this.mMapController;
        if (mapController == null) {
            return 0;
        }
        return mapController.getMapStatus().rotation;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public MapStatus getMapStatus() {
        MapController mapController = this.mMapController;
        if (mapController != null) {
            return mapController.getMapStatus();
        }
        return null;
    }

    public synchronized Overlay getOverlay(int i8) {
        for (Overlay overlay : this.innerOverlayList) {
            if (overlay.mType == i8) {
                return overlay;
            }
        }
        return null;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public List<Overlay> getOverlays() {
        return this.innerOverlayList;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public double getOverlooking() {
        MapController mapController = this.mMapController;
        return mapController == null ? com.github.mikephil.charting.utils.i.DOUBLE_EPSILON : mapController.getMapStatus().overlooking;
    }

    public Overlay getPopupOverlay() {
        return null;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public Projection getProjection() {
        return this.mProjection;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public MapStatus.WinRound getWinRound() {
        MapController mapController = this.mMapController;
        if (mapController == null) {
            return null;
        }
        return mapController.getMapStatus().winRound;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public float getZoomLevel() {
        MapController mapController = this.mMapController;
        if (mapController != null) {
            return mapController.getZoomLevel();
        }
        return 0.0f;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public float getZoomToBound(MapBound mapBound) {
        return getZoomToBound(mapBound, this.f9539o, this.f9540p);
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public float getZoomToBoundF(MapBound mapBound, int i8, int i9) {
        if (this.mMapController == null) {
            return 0.0f;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(TtmlNode.LEFT, mapBound.leftBottomPt.getIntX());
        bundle.putInt("bottom", mapBound.leftBottomPt.getIntY());
        bundle.putInt(TtmlNode.RIGHT, mapBound.rightTopPt.getIntX());
        bundle.putInt("top", mapBound.rightTopPt.getIntY());
        return this.mMapController.getZoomToBoundF(bundle);
    }

    protected void initInnerOverlays() {
        MapController mapController = this.mMapController;
        if (mapController == null || mapController.getBaseMap() == null) {
            return;
        }
        clearInnerOverlays();
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean isBaseIndoorMap() {
        return false;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean isSatellite() {
        return false;
    }

    public boolean isSetBackgroundDraw() {
        MapController mapController = this.mMapController;
        if (mapController == null) {
            return false;
        }
        return mapController.isSetBackgroundDraw();
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean isStreetRoad() {
        return false;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean isTraffic() {
        return false;
    }

    public void listenMapRenderMessage(d dVar) {
        this.f9543s = dVar;
    }

    public void onBackground() {
        onBackground(false);
    }

    public void onDestroy() {
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.mBaseMapInner;
        if (bVar != null) {
            List<w> list = bVar.f8069v;
            if (list != null) {
                for (w wVar : list) {
                    if (wVar != null) {
                        wVar.d();
                    }
                }
            }
            this.mBaseMapInner.h();
            this.mBaseMapInner = null;
        }
        this.mMapController.unInit();
        this.mMapController = null;
        this.overlayMapCallBack.a();
        this.overlayMapCallBack = null;
        this.mProjection = null;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
        return false;
    }

    public void onForeground() {
        onForeground(false);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        GeoPoint fromPixels;
        MapController mapController = this.mMapController;
        if (mapController == null || mapController.getBaseMap() == null) {
            return;
        }
        MapController mapController2 = this.mMapController;
        if (mapController2.mIsMapLoadFinish) {
            String GetNearlyObjID = mapController2.getBaseMap().GetNearlyObjID(-1L, (int) motionEvent.getX(), (int) motionEvent.getY(), this.mMapController.nearlyRadius);
            if (GetNearlyObjID == null || GetNearlyObjID.equals("")) {
                if (this.mMapController.mListeners != null) {
                    fromPixels = getProjection() != null ? getProjection().fromPixels((int) motionEvent.getX(), (int) motionEvent.getY()) : null;
                    if (fromPixels == null) {
                        return;
                    }
                    for (w wVar : this.mMapController.mListeners) {
                        if (wVar != null) {
                            wVar.g(fromPixels);
                        }
                    }
                    return;
                }
                return;
            }
            if (this.mMapController.mListeners != null) {
                fromPixels = getProjection() != null ? getProjection().fromPixels((int) motionEvent.getX(), (int) motionEvent.getY()) : null;
                for (w wVar2 : this.mMapController.mListeners) {
                    if (wVar2 != null) {
                        if (wVar2.a(GetNearlyObjID)) {
                            this.mMapController.mHasMapObjDraging = true;
                        } else if (fromPixels != null) {
                            wVar2.g(fromPixels);
                        }
                    }
                }
            }
        }
    }

    @Override // com.baidu.platform.comapi.map.MapRenderModeChangeListener
    public void onMapRenderModeChange(int i8) {
        o oVar;
        d dVar = this.f9543s;
        if (dVar != null) {
            dVar.a(i8);
        }
        if (i8 == 1) {
            requestRender();
            return;
        }
        if (i8 == 0) {
            if (getRenderMode() != 0) {
                setRenderMode(0);
            }
        } else {
            if (i8 != 2 || (oVar = this.mapRenderStableListener) == null) {
                return;
            }
            oVar.a();
        }
    }

    @Override // com.baidu.platform.comapi.map.GLTextureView
    public void onPause() {
        MapController mapController = this.mMapController;
        if (mapController != null && mapController.getBaseMap() != null) {
            this.mMapController.getBaseMap().OnPause();
        }
        super.onPause();
    }

    public void onRecycle() {
        MapController mapController = this.mMapController;
        if (mapController == null || mapController.getBaseMap() == null) {
            return;
        }
        this.mMapController.getBaseMap().ResetImageRes();
    }

    @Override // com.baidu.platform.comapi.map.MapRenderModeChangeListener
    public void onRequestRender() {
    }

    @Override // com.baidu.platform.comapi.map.GLTextureView
    public void onResume() {
        MapController mapController = this.mMapController;
        if (mapController != null && mapController.getBaseMap() != null) {
            this.mMapController.getBaseMap().OnResume();
        }
        super.onResume();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f8, float f9) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.TextureView, android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        this.f9544t = i8;
        this.f9545u = i9;
    }

    @Override // com.baidu.platform.comapi.map.GLTextureView, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i8, int i9) {
        super.onSurfaceTextureAvailable(surfaceTexture, i8, i9);
        this.f9539o = i8;
        this.f9540p = i9;
        MapController mapController = this.mMapController;
        if (mapController != null) {
            if (mapController.getMapViewSurfaceListener() != null) {
                this.mMapController.getMapViewSurfaceListener().onSurfaceChanged(i8, i9);
            }
            MapStatus mapStatus = getMapStatus();
            MapStatus.WinRound winRound = mapStatus.winRound;
            this.f9539o = Math.abs(winRound.right - winRound.left);
            MapStatus.WinRound winRound2 = mapStatus.winRound;
            this.f9540p = Math.abs(winRound2.bottom - winRound2.top);
        }
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.mBaseMapInner;
        if (bVar != null) {
            bVar.b(this.f9539o, this.f9540p);
        }
    }

    @Override // com.baidu.platform.comapi.map.GLTextureView, android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        super.onSurfaceTextureDestroyed(surfaceTexture);
        return true;
    }

    @Override // com.baidu.platform.comapi.map.GLTextureView, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i8, int i9) {
        super.onSurfaceTextureSizeChanged(surfaceTexture, i8, i9);
        this.f9539o = i8;
        this.f9540p = i9;
        k kVar = this.mapRenderer;
        kVar.f9772v = i8;
        kVar.f9773w = i9;
        kVar.f9774x = 0;
        if (this.mMapController != null) {
            MapStatus mapStatus = getMapStatus();
            MapStatus.WinRound winRound = mapStatus.winRound;
            winRound.left = 0;
            winRound.top = 0;
            winRound.bottom = i9;
            winRound.right = i8;
            this.mMapController.setMapStatusWithAnimation(mapStatus, 4, 0);
            if (this.mMapController.getMapViewSurfaceListener() != null) {
                this.mMapController.getMapViewSurfaceListener().onSurfaceChanged(i8, i9);
            }
            MapStatus mapStatus2 = getMapStatus();
            MapStatus.WinRound winRound2 = mapStatus2.winRound;
            int abs = Math.abs(winRound2.right - winRound2.left);
            MapStatus.WinRound winRound3 = mapStatus2.winRound;
            int abs2 = Math.abs(winRound3.bottom - winRound3.top);
            if (OpenLogUtil.isMapLogEnable()) {
                com.baidu.mapsdkplatform.comapi.commonutils.b.a().a("MapTextureView winRoundWidth = " + abs + ";winRoundHeight = " + abs2 + ";mWidth = " + this.f9539o + ";mHeight = " + this.f9540p);
            }
            if (abs > 0 && abs2 > 0) {
                this.f9539o = abs;
                this.f9540p = abs2;
            }
            this.mMapController.setScreenSize(this.f9539o, this.f9540p);
        }
        com.baidu.mapsdkplatform.comapi.map.b bVar = this.mBaseMapInner;
        if (bVar != null) {
            bVar.b(this.f9539o, this.f9540p);
        }
    }

    @Override // com.baidu.platform.comapi.map.GLTextureView, android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        super.onSurfaceTextureUpdated(surfaceTexture);
    }

    @Override // android.view.View, com.baidu.platform.comapi.map.MapViewInterface
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.baidu.mapsdkplatform.comapi.map.b bVar;
        List<w> list;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f9546v = false;
        } else if (action == 2) {
            float x7 = motionEvent.getX();
            float y7 = motionEvent.getY();
            if ((x7 < 0.0f || x7 > this.f9544t || y7 < 0.0f || y7 > this.f9545u) && !this.f9546v && (bVar = this.mBaseMapInner) != null && (list = bVar.f8069v) != null) {
                for (w wVar : list) {
                    if (wVar != null) {
                        wVar.b(this.mBaseMapInner.y());
                        this.f9546v = true;
                    }
                }
            }
        }
        MapStatus mapStatus = getMapStatus();
        if (mapStatus == null) {
            return false;
        }
        int pointerCount = motionEvent.getPointerCount();
        for (int i8 = 0; i8 < pointerCount; i8++) {
            int x8 = (int) motionEvent.getX(i8);
            int y8 = (int) motionEvent.getY(i8);
            MapStatus.WinRound winRound = mapStatus.winRound;
            if (x8 < winRound.left || x8 > winRound.right || y8 < winRound.top || y8 > winRound.bottom) {
                return false;
            }
        }
        try {
            GestureDetector gestureDetector = this.mGestureDetector;
            if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent)) {
                return true;
            }
            MapController mapController = this.mMapController;
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

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void refresh(Overlay overlay) {
        if (overlay == null || this.mMapController == null) {
            return;
        }
        if (overlay instanceof ItemizedOverlay) {
            ItemizedOverlay itemizedOverlay = (ItemizedOverlay) overlay;
            if (itemizedOverlay.b()) {
                if (itemizedOverlay.getAllItem().size() <= 0) {
                    this.mMapController.getBaseMap().ClearLayer(overlay.mLayerID);
                    this.mMapController.getBaseMap().ShowLayers(overlay.mLayerID, false);
                    this.mMapController.getBaseMap().UpdateLayers(overlay.mLayerID);
                } else {
                    this.mMapController.getBaseMap().ShowLayers(overlay.mLayerID, true);
                    this.mMapController.getBaseMap().UpdateLayers(overlay.mLayerID);
                }
                itemizedOverlay.b(false);
            }
        }
        MapController mapController = this.mMapController;
        if (mapController == null || mapController.getBaseMap() == null) {
            return;
        }
        this.mMapController.getBaseMap().UpdateLayers(overlay.mLayerID);
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public synchronized boolean removeBmLayer(BmLayer bmLayer) {
        if (bmLayer != null) {
            MapController mapController = this.mMapController;
            if (mapController != null) {
                AppBaseMap baseMap = mapController.getBaseMap();
                if (baseMap == null) {
                    return false;
                }
                baseMap.removeBmLayer(bmLayer.getNativeInstance());
                synchronized (this) {
                    this.f9541q.remove(bmLayer);
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean removeOverlay(Overlay overlay) {
        MapController mapController;
        AppBaseMap baseMap;
        if (overlay == null || (mapController = this.mMapController) == null || (baseMap = mapController.getBaseMap()) == null) {
            return false;
        }
        baseMap.ClearLayer(overlay.mLayerID);
        baseMap.ShowLayers(overlay.mLayerID, false);
        baseMap.UpdateLayers(overlay.mLayerID);
        baseMap.RemoveLayer(overlay.mLayerID);
        if (overlay instanceof ItemizedOverlay) {
            this.innerOverlayList.remove(overlay);
        } else if (overlay instanceof InnerOverlay) {
            this.innerOverlayList.remove(overlay);
            this.overlayMapCallBack.a(overlay);
        }
        overlay.mLayerID = 0L;
        return true;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void saveScreenToLocal(String str) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setBaseIndoorMap(boolean z7) {
    }

    public void setBaseMap(com.baidu.mapsdkplatform.comapi.map.b bVar) {
        this.mBaseMapInner = bVar;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setGeoRound(MapStatus.GeoBound geoBound) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setMapCenter(GeoPoint geoPoint) {
        MapController mapController = this.mMapController;
        if (mapController != null) {
            MapStatus mapStatus = mapController.getMapStatus();
            mapStatus.centerPtX = geoPoint.getLongitude();
            mapStatus.centerPtY = geoPoint.getLatitude();
            this.mMapController.setMapStatus(mapStatus);
        }
    }

    public void setMapRenderStableListener(o oVar) {
        this.mapRenderStableListener = oVar;
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setMapStatus(MapStatus mapStatus) {
        MapController mapController = this.mMapController;
        if (mapController != null) {
            mapController.setMapStatus(mapStatus);
        }
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setMapTo2D(boolean z7) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setOverlooking(int i8) {
        MapController mapController = this.mMapController;
        if (mapController != null) {
            MapStatus mapStatus = mapController.getMapStatus();
            mapStatus.overlooking = i8;
            this.mMapController.setMapStatus(mapStatus);
        }
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setRotation(int i8) {
        MapController mapController = this.mMapController;
        if (mapController != null) {
            MapStatus mapStatus = mapController.getMapStatus();
            mapStatus.rotation = i8;
            this.mMapController.setMapStatus(mapStatus);
        }
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setSatellite(boolean z7) {
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setStreetRoad(boolean z7) {
    }

    public void setSupBackgroundDraw(boolean z7) {
        MapController mapController = this.mMapController;
        if (mapController == null) {
            return;
        }
        mapController.setSupBackgroundDraw(z7);
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setTraffic(boolean z7) {
        AppBaseMap baseMap;
        MapController mapController = this.mMapController;
        if (mapController == null || (baseMap = mapController.getBaseMap()) == null) {
            return;
        }
        baseMap.ShowTrafficMap(z7);
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setWinRound(MapStatus.WinRound winRound) {
        MapController mapController = this.mMapController;
        if (mapController != null) {
            MapStatus mapStatus = mapController.getMapStatus();
            mapStatus.winRound = winRound;
            this.mMapController.setMapStatus(mapStatus);
        }
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setZoomLevel(float f8) {
        if (this.mMapController == null) {
            return;
        }
        getController().getFocusedBaseIndoorMapInfo();
        if (f8 < 4.0f) {
            f8 = 4.0f;
        } else if (f8 > 22) {
            f8 = 22.0f;
        }
        MapStatus mapStatus = getMapStatus();
        if (mapStatus != null) {
            mapStatus.level = f8;
            animateTo(mapStatus, 300);
        }
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public boolean switchOverlay(Overlay overlay, Overlay overlay2) {
        MapController mapController;
        AppBaseMap baseMap;
        if (overlay == null || overlay2 == null || (mapController = this.mMapController) == null || (baseMap = mapController.getBaseMap()) == null) {
            return false;
        }
        return baseMap.SwitchLayer(overlay.mLayerID, overlay2.mLayerID);
    }

    public void unListenMapRenderMessage() {
        this.f9543s = null;
    }

    private void a(Context context) {
        setEGLContextClientVersion(3);
        this.simpleGestureAdapter = new y();
        this.mGestureDetector = new GestureDetector(context, this.simpleGestureAdapter);
        this.simpleGestureAdapter.a(new c());
        if (OpenLogUtil.isMapLogEnable()) {
            com.baidu.mapsdkplatform.comapi.commonutils.b.a().a("BasicMap surfaceView initView");
        }
    }

    public void doCaptureMapView(com.baidu.platform.comapi.map.c cVar, Rect rect, Bitmap.Config config) {
        if (rect != null) {
            int i8 = rect.left;
            int i9 = this.f9540p;
            int i10 = rect.bottom;
            int i11 = i9 < i10 ? 0 : i9 - i10;
            int width = rect.width();
            int height = rect.height();
            if (i8 < 0 || i11 < 0 || width <= 0 || height <= 0) {
                return;
            }
            if (width > this.f9539o) {
                width = Math.abs(rect.width()) - (rect.right - this.f9539o);
            }
            int i12 = width;
            int abs = height > this.f9540p ? Math.abs(rect.height()) - (rect.bottom - this.f9540p) : height;
            if (i8 > SysOSUtil.getScreenSizeX() || i11 > SysOSUtil.getScreenSizeY()) {
                return;
            }
            this.mapRenderer.a(cVar, i8, i11, i12, abs, config);
        }
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public float getZoomToBound(MapBound mapBound, int i8, int i9) {
        if (this.mMapController == null) {
            return 0.0f;
        }
        Bundle bundle = new Bundle();
        bundle.putInt(TtmlNode.LEFT, mapBound.leftBottomPt.getIntX());
        bundle.putInt("bottom", mapBound.leftBottomPt.getIntY());
        bundle.putInt(TtmlNode.RIGHT, mapBound.rightTopPt.getIntX());
        bundle.putInt("top", mapBound.rightTopPt.getIntY());
        return this.mMapController.getZoomToBound(bundle, i8, i9);
    }

    public void onBackground(boolean z7) {
        if (z7 || !this.f9542r) {
            MapController mapController = this.mMapController;
            if (mapController != null && mapController.getBaseMap() != null) {
                this.mMapController.getBaseMap().OnBackground();
            }
            this.f9542r = true;
        }
    }

    public void onForeground(boolean z7) {
        if (z7 || this.f9542r) {
            MapController mapController = this.mMapController;
            if (mapController != null && mapController.getBaseMap() != null) {
                this.mMapController.getBaseMap().OnForeground();
            }
            this.f9542r = false;
        }
    }

    public boolean addBmLayerBelow(long j8, BmLayer bmLayer) {
        return a(j8, bmLayer);
    }

    public synchronized Overlay getOverlay(Class<?> cls) {
        for (Overlay overlay : this.innerOverlayList) {
            if (overlay.getClass() == cls) {
                return overlay;
            }
        }
        return null;
    }

    public MapTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMapController = null;
        this.overlayMapCallBack = null;
        this.mProjection = null;
        this.mapRenderer = null;
        this.f9541q = new ArrayList();
        this.innerOverlayList = new ArrayList();
        this.f9542r = true;
        this.f9546v = false;
        a(context);
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public void setZoomLevel(int i8) {
        setZoomLevel(i8);
    }

    @Override // com.baidu.platform.comapi.map.MapViewInterface
    public float getZoomToBoundF(MapBound mapBound) {
        return getZoomToBoundF(mapBound, this.f9539o, this.f9540p);
    }

    public MapTextureView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mMapController = null;
        this.overlayMapCallBack = null;
        this.mProjection = null;
        this.mapRenderer = null;
        this.f9541q = new ArrayList();
        this.innerOverlayList = new ArrayList();
        this.f9542r = true;
        this.f9546v = false;
        a(context);
    }

    private synchronized boolean a(long j8, BmLayer bmLayer) {
        if (bmLayer != null) {
            MapController mapController = this.mMapController;
            if (mapController != null) {
                AppBaseMap baseMap = mapController.getBaseMap();
                if (baseMap == null) {
                    return false;
                }
                synchronized (this) {
                    if (this.f9541q.contains(bmLayer)) {
                        return false;
                    }
                    this.f9541q.add(bmLayer);
                    return baseMap.addBmLayerBelow(j8, bmLayer.getNativeInstance(), 1, 0);
                }
            }
        }
        return false;
    }
}
