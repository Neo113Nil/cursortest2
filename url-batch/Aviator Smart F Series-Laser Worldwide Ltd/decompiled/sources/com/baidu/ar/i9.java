package com.baidu.ar;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
import android.view.View;
import com.baidu.ar.baidumap.MapDuMix;
import com.baidu.ar.baidumap.MapDuMixParams;
import com.baidu.ar.camera.CameraHandlerThread;
import com.baidu.ar.camera.DuMixRenderer;

/* loaded from: classes.dex */
public class i9 implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public NavigationController f2451a;

    /* renamed from: b, reason: collision with root package name */
    public SurfaceTexture f2452b;

    /* renamed from: c, reason: collision with root package name */
    public CameraHandlerThread f2453c;

    /* renamed from: e, reason: collision with root package name */
    public DuMixRenderer f2455e;

    /* renamed from: f, reason: collision with root package name */
    public GLSurfaceView f2456f;

    /* renamed from: g, reason: collision with root package name */
    public MapDuMix f2457g;

    /* renamed from: k, reason: collision with root package name */
    public DuMixInput f2461k;

    /* renamed from: l, reason: collision with root package name */
    public DuMixOutput f2462l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2463m;

    /* renamed from: n, reason: collision with root package name */
    public Context f2464n;

    /* renamed from: o, reason: collision with root package name */
    public c f2465o;

    /* renamed from: p, reason: collision with root package name */
    public IMockFrameAvailable f2466p;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2454d = false;

    /* renamed from: h, reason: collision with root package name */
    public int f2458h = 1280;

    /* renamed from: i, reason: collision with root package name */
    public int f2459i = 720;

    /* renamed from: j, reason: collision with root package name */
    public MapDuMixParams f2460j = null;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2467q = false;

    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (i9.this.f2457g != null) {
                return i9.this.f2457g.onTouch(view, motionEvent);
            }
            return false;
        }
    }

    public class b implements DuMixRenderer.a {
        public b() {
        }

        @Override // com.baidu.ar.camera.DuMixRenderer.a
        public void a(SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
            i9.this.a(surfaceTexture, false);
            i9.this.f2452b = surfaceTexture;
            i9 i9Var = i9.this;
            i9Var.f2461k = new DuMixInput(surfaceTexture, i9Var.f2458h, i9.this.f2459i);
            i9.this.f2461k.setFrontCamera(i9.this.f2454d);
            i9 i9Var2 = i9.this;
            i9Var2.f2462l = new DuMixOutput(surfaceTexture2, i9Var2.f2458h, i9.this.f2459i);
            surfaceTexture2.setOnFrameAvailableListener(i9.this);
        }

        @Override // com.baidu.ar.camera.DuMixRenderer.a
        public void onSurfaceChanged(int i8, int i9) {
            if (i9.this.f2460j == null || i9.this.f2462l == null) {
                return;
            }
            i9.this.f2462l.setOutputWidth(i8);
            i9.this.f2462l.setOutputHeight(i9);
            i9.this.f2460j.setShareContext(null);
            i9.this.f2460j.setUseTextureIO(false);
            i9.this.f2460j.setHeight(i9.this.f2459i);
            i9.this.f2460j.setWidth(i9.this.f2458h);
            i9 i9Var = i9.this;
            i9Var.f2457g = i9Var.b();
            if (i9.this.f2465o != null && !i9.this.f2463m) {
                i9.this.f2465o.a(i9.this.f2457g);
                i9.this.f2457g.setup(i9.this.f2461k, i9.this.f2462l, i9.this.f2451a.createMapDuMixCallback());
                i9.this.f2463m = true;
            }
            i9.this.f2457g.changeOutputSize(i8, i9);
        }
    }

    public interface c {
        void a(MapDuMix mapDuMix);
    }

    public i9(Context context, MapDuMix mapDuMix, NavigationController navigationController) {
        this.f2451a = navigationController;
        this.f2457g = mapDuMix;
        this.f2464n = context;
    }

    public MapDuMix b() {
        if (this.f2457g == null) {
            MapDuMix mapDuMix = MapDuMix.getInstance(this.f2464n, this.f2460j);
            this.f2457g = mapDuMix;
            mapDuMix.addLuaMsgListener(this.f2451a);
        }
        return this.f2457g;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        GLSurfaceView gLSurfaceView = this.f2456f;
        if (gLSurfaceView != null) {
            gLSurfaceView.requestRender();
        }
    }

    public final void c() {
        MapDuMix mapDuMix = this.f2457g;
        if (mapDuMix != null) {
            mapDuMix.release();
            this.f2457g = null;
        }
    }

    public void d() {
        CameraHandlerThread cameraHandlerThread = this.f2453c;
        if (cameraHandlerThread != null) {
            cameraHandlerThread.stopPreview();
            this.f2453c.releaseCamera();
            this.f2453c.destoryThread();
            this.f2453c = null;
        }
        DuMixRenderer duMixRenderer = this.f2455e;
        if (duMixRenderer != null) {
            duMixRenderer.release();
            this.f2455e = null;
        }
        SurfaceTexture surfaceTexture = this.f2452b;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f2452b = null;
        }
        c();
    }

    public void e() {
        CameraHandlerThread cameraHandlerThread = this.f2453c;
        if (cameraHandlerThread != null) {
            cameraHandlerThread.stopPreview();
            this.f2453c.releaseCamera();
        }
    }

    public void f() {
        SurfaceTexture surfaceTexture = this.f2452b;
        if (surfaceTexture != null) {
            a(surfaceTexture, false);
        }
    }

    public final DuMixRenderer.a a() {
        return new b();
    }

    public void a(int i8, int i9) {
        this.f2458h = i8;
        this.f2459i = i9;
    }

    public final void a(SurfaceTexture surfaceTexture, boolean z7) {
        if (this.f2467q) {
            CameraHandlerThread cameraHandlerThread = this.f2453c;
            if (cameraHandlerThread != null) {
                cameraHandlerThread.stopPreview();
                this.f2453c.releaseCamera();
                this.f2453c.destoryThread();
            }
            this.f2466p.onSurfaceTextureCreated(surfaceTexture, this.f2458h, this.f2459i);
            return;
        }
        if (this.f2453c == null) {
            this.f2453c = new CameraHandlerThread();
        }
        this.f2453c.stopPreview();
        int rotation = ((Activity) this.f2464n).getWindowManager().getDefaultDisplay().getRotation();
        if (z7) {
            CameraHandlerThread cameraHandlerThread2 = this.f2453c;
            boolean z8 = this.f2454d;
            cameraHandlerThread2.switchCamera(z8 ? 1 : 0, this.f2458h, this.f2459i);
        } else {
            CameraHandlerThread cameraHandlerThread3 = this.f2453c;
            boolean z9 = this.f2454d;
            cameraHandlerThread3.openCamera(z9 ? 1 : 0, this.f2458h, this.f2459i, rotation);
        }
        this.f2453c.setPreviewSurface(surfaceTexture);
        this.f2453c.startPreview();
    }

    public void a(GLSurfaceView gLSurfaceView, MapDuMixParams mapDuMixParams, c cVar) {
        this.f2460j = mapDuMixParams;
        a(cVar);
        this.f2456f = gLSurfaceView;
        DuMixRenderer duMixRenderer = new DuMixRenderer(a());
        this.f2455e = duMixRenderer;
        this.f2456f.setRenderer(duMixRenderer);
        this.f2456f.setRenderMode(0);
        this.f2456f.setOnTouchListener(new a());
    }

    public void a(IMockFrameAvailable iMockFrameAvailable) {
        this.f2466p = iMockFrameAvailable;
    }

    public void a(c cVar) {
        this.f2465o = cVar;
    }

    public void a(boolean z7) {
        this.f2467q = z7;
    }
}
