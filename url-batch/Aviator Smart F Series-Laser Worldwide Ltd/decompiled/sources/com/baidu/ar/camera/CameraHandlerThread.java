package com.baidu.ar.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.SurfaceHolder;

/* loaded from: classes.dex */
public class CameraHandlerThread extends HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f1904a;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Camera.ErrorCallback f1905a;

        public a(CameraHandlerThread cameraHandlerThread, Camera.ErrorCallback errorCallback) {
            this.f1905a = errorCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraManager.getInstance().setOnCameraError(this.f1905a);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f1906a;

        public b(CameraHandlerThread cameraHandlerThread, byte[] bArr) {
            this.f1906a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraManager.getInstance().addCameraCallbackBuffer(this.f1906a);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f1907a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1908b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f1909c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f1910d;

        public c(int i8, int i9, int i10, int i11) {
            this.f1907a = i8;
            this.f1908b = i9;
            this.f1909c = i10;
            this.f1910d = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraHandlerThread.this.a(this.f1907a, this.f1908b, this.f1909c, this.f1910d);
            CameraHandlerThread.this.f();
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f1912a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1913b;

        public d(int i8, int i9) {
            this.f1912a = i8;
            this.f1913b = i9;
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraHandlerThread.this.internalReopenCamera(this.f1912a, this.f1913b);
            CameraHandlerThread.this.f();
        }
    }

    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SurfaceHolder f1915a;

        public e(SurfaceHolder surfaceHolder) {
            this.f1915a = surfaceHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraHandlerThread.this.a(this.f1915a);
        }
    }

    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SurfaceTexture f1917a;

        public f(SurfaceTexture surfaceTexture) {
            this.f1917a = surfaceTexture;
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraHandlerThread.this.a(this.f1917a);
        }
    }

    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Camera.PreviewCallback f1919a;

        public g(Camera.PreviewCallback previewCallback) {
            this.f1919a = previewCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraHandlerThread.this.a(this.f1919a);
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraHandlerThread.this.d();
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraHandlerThread.this.e();
        }
    }

    public class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f1923a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1924b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f1925c;

        public j(int i8, int i9, int i10) {
            this.f1923a = i8;
            this.f1924b = i9;
            this.f1925c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraHandlerThread.this.a(this.f1923a, this.f1924b, this.f1925c);
        }
    }

    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraHandlerThread.this.c();
            CameraHandlerThread.this.g();
        }
    }

    public CameraHandlerThread() {
        super("CameraHandlerThread");
        start();
        this.f1904a = new Handler(getLooper());
    }

    public final void a(int i8, int i9, int i10) {
        CameraManager.getInstance().switchCamera(i8, i9, i10);
    }

    public void addCameraCallbackBuffer(byte[] bArr) {
        b();
        this.f1904a.post(new b(this, bArr));
    }

    public final void b() {
        if (this.f1904a == null) {
            throw new NullPointerException("Handler is not available!");
        }
    }

    public final void c() {
        CameraManager.getInstance().releaseCamera();
    }

    public final void d() {
        CameraManager.getInstance().startPreview();
    }

    public void destoryThread() {
        this.f1904a.removeCallbacksAndMessages(null);
        quitSafely();
    }

    public final void e() {
        CameraManager.getInstance().stopPreview();
    }

    public final synchronized void f() {
        notify();
    }

    public final synchronized void g() {
        notify();
    }

    public int getCameraId() {
        return CameraManager.getInstance().getCameraID();
    }

    public Handler getHandler() {
        return this.f1904a;
    }

    public final void h() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Log.w("CameraHandlerThread", "wait was interrupted");
        }
    }

    public void internalReopenCamera(int i8, int i9) {
        CameraManager.getInstance().reopenCamera(i8, i9);
    }

    public synchronized void openCamera(int i8, int i9, int i10, int i11) {
        b();
        this.f1904a.post(new c(i8, i9, i10, i11));
        h();
    }

    public synchronized void releaseCamera() {
        b();
        this.f1904a.post(new k());
        h();
    }

    public synchronized void reopenCamera(int i8, int i9) {
        b();
        this.f1904a.post(new d(i8, i9));
        h();
    }

    public boolean setCameraFlashMode(String str) {
        return CameraManager.getInstance().setCameraFlashMode(str);
    }

    public void setOnCameraError(Camera.ErrorCallback errorCallback) {
        b();
        this.f1904a.post(new a(this, errorCallback));
    }

    public void setPreviewCallback(Camera.PreviewCallback previewCallback) {
        b();
        this.f1904a.post(new g(previewCallback));
    }

    public void setPreviewSurface(SurfaceTexture surfaceTexture) {
        b();
        this.f1904a.post(new f(surfaceTexture));
    }

    public void startPreview() {
        b();
        this.f1904a.post(new h());
    }

    public void stopPreview() {
        b();
        this.f1904a.post(new i());
    }

    public void switchCamera(int i8, int i9, int i10) {
        b();
        this.f1904a.post(new j(i8, i9, i10));
    }

    public CameraHandlerThread(String str) {
        super(str);
        start();
        this.f1904a = new Handler(getLooper());
    }

    public final void a(int i8, int i9, int i10, int i11) {
        CameraManager.getInstance().openCamera(i8, i9, i10, i11);
    }

    public void setPreviewSurface(SurfaceHolder surfaceHolder) {
        b();
        this.f1904a.post(new e(surfaceHolder));
    }

    public final void a(SurfaceTexture surfaceTexture) {
        CameraManager.getInstance().setPreviewSurface(surfaceTexture);
    }

    public final void a(Camera.PreviewCallback previewCallback) {
        CameraManager.getInstance().setPreviewCallback(previewCallback);
    }

    public final void a(SurfaceHolder surfaceHolder) {
        CameraManager.getInstance().setPreviewSurface(surfaceHolder);
    }
}
