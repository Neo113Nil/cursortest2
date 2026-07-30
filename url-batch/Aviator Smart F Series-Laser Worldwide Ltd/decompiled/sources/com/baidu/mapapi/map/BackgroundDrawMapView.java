package com.baidu.mapapi.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import com.baidu.platform.comapi.map.MapController;
import com.baidu.platform.comapi.map.MapSurfaceView;
import com.baidu.platform.comapi.map.MapTextureView;
import com.baidu.platform.comjni.map.basemap.AppBaseMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class BackgroundDrawMapView extends TextureView implements TextureView.SurfaceTextureListener {
    private static final int DEFAULT_FPS = 30;
    private static final int MAX_FPS = 60;
    private static final int MIN_FPS = 10;
    private MapController mController;
    private c mDrawThread;
    private final Object mDrawThreadLock;
    private volatile int mFps;
    private final AtomicBoolean mIsReady;
    private final List<IBackgroundDrawLayer> mLayers;
    private MapSurfaceView mMapSurfaceView;
    private MapTextureView mMapTextureView;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    class b implements Comparator<IBackgroundDrawLayer> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(IBackgroundDrawLayer iBackgroundDrawLayer, IBackgroundDrawLayer iBackgroundDrawLayer2) {
            boolean z7 = iBackgroundDrawLayer instanceof BaseBackgroundDrawLayer;
            return (z7 && (iBackgroundDrawLayer2 instanceof BaseBackgroundDrawLayer)) ? ((BaseBackgroundDrawLayer) iBackgroundDrawLayer).mOrder - ((BaseBackgroundDrawLayer) iBackgroundDrawLayer2).mOrder : z7 ? 1 : -1;
        }
    }

    private class c extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f5591a;

        private c() {
            this.f5591a = new AtomicBoolean(false);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            MapController mapController;
            AppBaseMap baseMap;
            super.run();
            synchronized (BackgroundDrawMapView.this.mDrawThreadLock) {
                this.f5591a.set(true);
                CanvasProxy canvasProxy = new CanvasProxy(BackgroundDrawMapView.this);
                long j8 = 0;
                int i8 = 0;
                while (BackgroundDrawMapView.this.mIsReady.get() && !Thread.interrupted()) {
                    if (canvasProxy.lockCanvas() != null) {
                        try {
                            try {
                                mapController = BackgroundDrawMapView.this.mController;
                            } catch (Exception unused) {
                                if (!isInterrupted() && i8 <= 3) {
                                    try {
                                        BackgroundDrawMapView.this.mDrawThreadLock.wait(100L);
                                    } catch (InterruptedException unused2) {
                                        interrupt();
                                    }
                                    i8++;
                                }
                            }
                            if (mapController != null && (baseMap = mapController.getBaseMap()) != null) {
                                baseMap.Draw();
                                a(canvasProxy, BackgroundDrawMapView.this.mLayers, baseMap);
                                if (!isInterrupted()) {
                                    i8 = 0;
                                    canvasProxy.unlockCanvasAndPost(null);
                                    long currentTimeMillis = (1000 / BackgroundDrawMapView.this.mFps) - (System.currentTimeMillis() - j8);
                                    if (currentTimeMillis > 0) {
                                        BackgroundDrawMapView.this.mDrawThreadLock.wait(currentTimeMillis);
                                    }
                                    j8 = System.currentTimeMillis();
                                }
                            }
                            break;
                        } finally {
                            canvasProxy.unlockCanvasAndPost(null);
                        }
                    }
                    if (i8 > 3) {
                        break;
                    }
                    i8++;
                    try {
                        BackgroundDrawMapView.this.mDrawThreadLock.wait(100L);
                    } catch (InterruptedException unused3) {
                    }
                }
                this.f5591a.set(false);
            }
        }

        private void a(CanvasProxy canvasProxy, List<IBackgroundDrawLayer> list, AppBaseMap appBaseMap) {
            for (IBackgroundDrawLayer iBackgroundDrawLayer : list) {
                if (iBackgroundDrawLayer instanceof com.baidu.mapapi.map.a) {
                    ((com.baidu.mapapi.map.a) iBackgroundDrawLayer).updateEntity(appBaseMap.getBaseRoadData());
                }
                iBackgroundDrawLayer.onDraw(canvasProxy);
            }
        }

        /* synthetic */ c(BackgroundDrawMapView backgroundDrawMapView, a aVar) {
            this();
        }
    }

    public BackgroundDrawMapView(Context context) {
        this(context, null);
    }

    private void setController(MapController mapController) {
        c cVar = this.mDrawThread;
        if (cVar != null && cVar.f5591a.get()) {
            cVar.interrupt();
            while (cVar.f5591a.get()) {
            }
        }
        a aVar = null;
        this.mDrawThread = null;
        this.mController = null;
        if (mapController == null) {
            return;
        }
        this.mController = mapController;
        if (this.mIsReady.get()) {
            for (IBackgroundDrawLayer iBackgroundDrawLayer : this.mLayers) {
                if (iBackgroundDrawLayer instanceof com.baidu.mapapi.map.b) {
                    ((com.baidu.mapapi.map.b) iBackgroundDrawLayer).updateMapController(mapController);
                }
            }
            c cVar2 = new c(this, aVar);
            this.mDrawThread = cVar2;
            cVar2.start();
        }
    }

    public void addLayer(BaseBackgroundDrawLayer baseBackgroundDrawLayer) {
        if (baseBackgroundDrawLayer == null || this.mLayers.contains(baseBackgroundDrawLayer)) {
            return;
        }
        this.mLayers.add(baseBackgroundDrawLayer);
        if (this.mIsReady.get()) {
            if (baseBackgroundDrawLayer instanceof com.baidu.mapapi.map.b) {
                ((com.baidu.mapapi.map.b) baseBackgroundDrawLayer).updateMapController(this.mController);
            }
            baseBackgroundDrawLayer.onCreate();
            baseBackgroundDrawLayer.onSizeChanged(getWidth(), getHeight());
        }
        List asList = Arrays.asList(this.mLayers.toArray(new IBackgroundDrawLayer[0]));
        Collections.sort(asList, new b());
        this.mLayers.clear();
        this.mLayers.addAll(asList);
    }

    public void bindView(MapSurfaceView mapSurfaceView) {
        c cVar = this.mDrawThread;
        if (cVar != null && cVar.f5591a.get()) {
            cVar.interrupt();
        }
        this.mDrawThread = null;
        this.mController = null;
        this.mMapTextureView = null;
        this.mMapSurfaceView = mapSurfaceView;
    }

    public boolean closeBackgroundMap() {
        MapSurfaceView mapSurfaceView = this.mMapSurfaceView;
        if (mapSurfaceView != null) {
            mapSurfaceView.setSupBackgroundDraw(false);
            mapSurfaceView.onForeground(true);
        }
        MapTextureView mapTextureView = this.mMapTextureView;
        if (mapTextureView != null) {
            mapTextureView.setSupBackgroundDraw(false);
            mapTextureView.onForeground(true);
        }
        setController(null);
        return true;
    }

    public IBackgroundDrawBaseRouteLayer getBaseRouteLayer() {
        for (IBackgroundDrawLayer iBackgroundDrawLayer : this.mLayers) {
            if (iBackgroundDrawLayer instanceof com.baidu.mapapi.map.a) {
                return (com.baidu.mapapi.map.a) iBackgroundDrawLayer;
            }
        }
        return null;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i8, int i9) {
        for (IBackgroundDrawLayer iBackgroundDrawLayer : this.mLayers) {
            if (iBackgroundDrawLayer instanceof com.baidu.mapapi.map.b) {
                ((com.baidu.mapapi.map.b) iBackgroundDrawLayer).updateMapController(this.mController);
            }
            iBackgroundDrawLayer.onCreate();
            iBackgroundDrawLayer.onSizeChanged(i8, i9);
        }
        this.mIsReady.set(true);
        setController(this.mController);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        c cVar = this.mDrawThread;
        if (cVar != null && cVar.f5591a.get()) {
            cVar.interrupt();
        }
        Iterator<IBackgroundDrawLayer> it = this.mLayers.iterator();
        while (it.hasNext()) {
            it.next().onDestroy();
        }
        this.mIsReady.set(false);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i8, int i9) {
        Iterator<IBackgroundDrawLayer> it = this.mLayers.iterator();
        while (it.hasNext()) {
            it.next().onSizeChanged(i8, i9);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        Iterator<IBackgroundDrawLayer> it = this.mLayers.iterator();
        while (it.hasNext()) {
            it.next().onUpdated();
        }
    }

    public boolean openBackgroundMap() {
        MapController mapController;
        MapSurfaceView mapSurfaceView = this.mMapSurfaceView;
        if (mapSurfaceView != null) {
            mapController = mapSurfaceView.getController();
            mapSurfaceView.setSupBackgroundDraw(true);
            mapSurfaceView.onBackground(true);
        } else {
            mapController = null;
        }
        MapTextureView mapTextureView = this.mMapTextureView;
        if (mapController == null && mapTextureView != null) {
            mapController = mapTextureView.getController();
            mapTextureView.setSupBackgroundDraw(true);
            mapTextureView.onBackground(true);
        }
        if (mapController == null) {
            return false;
        }
        setController(mapController);
        return true;
    }

    public void removeLayer(BaseBackgroundDrawLayer baseBackgroundDrawLayer) {
        if (baseBackgroundDrawLayer == null) {
            return;
        }
        this.mLayers.remove(baseBackgroundDrawLayer);
        if (this.mIsReady.get()) {
            baseBackgroundDrawLayer.onDestroy();
        }
    }

    public void setFps(int i8) {
        this.mFps = Math.min(60, Math.max(10, i8));
    }

    public BackgroundDrawMapView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static class CanvasProxy {

        /* renamed from: a, reason: collision with root package name */
        private final TextureView f5587a;

        /* renamed from: b, reason: collision with root package name */
        private Canvas f5588b;

        public CanvasProxy(TextureView textureView) {
            this.f5587a = textureView;
        }

        public void drawBitmap(Bitmap bitmap, float f8, float f9, Paint paint) {
            Canvas canvas;
            TextureView textureView = this.f5587a;
            if (textureView == null || (canvas = this.f5588b) == null || Thread.currentThread().isInterrupted() || !textureView.isAvailable()) {
                return;
            }
            canvas.drawBitmap(bitmap, f8, f9, paint);
        }

        public void drawColor(int i8) {
            Canvas canvas;
            TextureView textureView = this.f5587a;
            if (textureView == null || (canvas = this.f5588b) == null || Thread.currentThread().isInterrupted() || !textureView.isAvailable()) {
                return;
            }
            canvas.drawColor(i8);
        }

        public void drawPath(Path path, Paint paint) {
            Canvas canvas;
            TextureView textureView = this.f5587a;
            if (textureView == null || (canvas = this.f5588b) == null || Thread.currentThread().isInterrupted() || !textureView.isAvailable()) {
                return;
            }
            canvas.drawPath(path, paint);
        }

        public void drawPoint(float f8, float f9, Paint paint) {
            Canvas canvas;
            TextureView textureView = this.f5587a;
            if (textureView == null || (canvas = this.f5588b) == null || Thread.currentThread().isInterrupted() || !textureView.isAvailable()) {
                return;
            }
            canvas.drawPoint(f8, f9, paint);
        }

        public Canvas lockCanvas() {
            TextureView textureView = this.f5587a;
            if (textureView == null || Thread.currentThread().isInterrupted()) {
                return null;
            }
            Canvas lockCanvas = textureView.lockCanvas();
            this.f5588b = lockCanvas;
            return lockCanvas;
        }

        public void restore() {
            Canvas canvas;
            TextureView textureView = this.f5587a;
            if (textureView == null || (canvas = this.f5588b) == null || Thread.currentThread().isInterrupted() || !textureView.isAvailable()) {
                return;
            }
            canvas.restore();
        }

        public void rotate(float f8) {
            Canvas canvas;
            TextureView textureView = this.f5587a;
            if (textureView == null || (canvas = this.f5588b) == null || Thread.currentThread().isInterrupted() || !textureView.isAvailable()) {
                return;
            }
            canvas.rotate(f8);
        }

        public int save() {
            Canvas canvas;
            TextureView textureView = this.f5587a;
            if (textureView == null || (canvas = this.f5588b) == null || Thread.currentThread().isInterrupted() || !textureView.isAvailable()) {
                return -1;
            }
            return canvas.save();
        }

        public void scale(float f8, float f9) {
            Canvas canvas;
            TextureView textureView = this.f5587a;
            if (textureView == null || (canvas = this.f5588b) == null || Thread.currentThread().isInterrupted() || !textureView.isAvailable()) {
                return;
            }
            canvas.scale(f8, f9);
        }

        public void translate(float f8, float f9) {
            Canvas canvas;
            TextureView textureView = this.f5587a;
            if (textureView == null || (canvas = this.f5588b) == null || Thread.currentThread().isInterrupted() || !textureView.isAvailable()) {
                return;
            }
            canvas.translate(f8, f9);
        }

        public void unlockCanvasAndPost(Canvas canvas) {
            TextureView textureView = this.f5587a;
            if (textureView == null) {
                return;
            }
            if (canvas == null) {
                canvas = this.f5588b;
            }
            if (canvas != null && canvas == this.f5588b && textureView.isAvailable()) {
                textureView.unlockCanvasAndPost(canvas);
                this.f5588b = null;
            }
        }

        public void rotate(float f8, float f9, float f10) {
            Canvas canvas;
            TextureView textureView = this.f5587a;
            if (textureView == null || (canvas = this.f5588b) == null || Thread.currentThread().isInterrupted() || !textureView.isAvailable()) {
                return;
            }
            canvas.rotate(f8, f9, f10);
        }

        public void scale(float f8, float f9, float f10, float f11) {
            Canvas canvas;
            TextureView textureView = this.f5587a;
            if (textureView == null || (canvas = this.f5588b) == null || Thread.currentThread().isInterrupted() || !textureView.isAvailable()) {
                return;
            }
            canvas.scale(f8, f9, f10, f11);
        }
    }

    public BackgroundDrawMapView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mIsReady = new AtomicBoolean(false);
        this.mFps = 30;
        this.mDrawThreadLock = new Object();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.mLayers = copyOnWriteArrayList;
        copyOnWriteArrayList.add(new com.baidu.mapapi.map.a(getContext()));
        setOnClickListener(new a());
        setSurfaceTextureListener(this);
    }

    public void bindView(MapTextureView mapTextureView) {
        c cVar = this.mDrawThread;
        if (cVar != null && cVar.f5591a.get()) {
            cVar.interrupt();
        }
        this.mDrawThread = null;
        this.mController = null;
        this.mMapTextureView = mapTextureView;
        this.mMapSurfaceView = null;
    }
}
