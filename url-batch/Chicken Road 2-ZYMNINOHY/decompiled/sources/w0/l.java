package w0;

import W.AbstractC0108a;
import W.C0115h;
import W.J;
import W.RunnableC0114g;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.Locale;

/* loaded from: classes.dex */
public final class l extends HandlerThread implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public RunnableC0114g f15854a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f15855b;

    /* renamed from: c, reason: collision with root package name */
    public Error f15856c;

    /* renamed from: d, reason: collision with root package name */
    public RuntimeException f15857d;

    /* renamed from: e, reason: collision with root package name */
    public m f15858e;

    public final void a(int i4) {
        EGLSurface eglCreatePbufferSurface;
        this.f15854a.getClass();
        RunnableC0114g runnableC0114g = this.f15854a;
        int[] iArr = runnableC0114g.f3306b;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC0108a.c("eglGetDisplay failed", eglGetDisplay != null);
        int[] iArr2 = new int[2];
        AbstractC0108a.c("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1));
        runnableC0114g.f3307c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr3 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, RunnableC0114g.f3304g, 0, eGLConfigArr, 0, 1, iArr3, 0);
        boolean z = eglChooseConfig && iArr3[0] > 0 && eGLConfigArr[0] != null;
        Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
        String str = J.f3263a;
        AbstractC0108a.c(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(runnableC0114g.f3307c, eGLConfig, EGL14.EGL_NO_CONTEXT, i4 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        AbstractC0108a.c("eglCreateContext failed", eglCreateContext != null);
        runnableC0114g.f3308d = eglCreateContext;
        EGLDisplay eGLDisplay = runnableC0114g.f3307c;
        if (i4 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i4 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            AbstractC0108a.c("eglCreatePbufferSurface failed", eglCreatePbufferSurface != null);
        }
        AbstractC0108a.c("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        runnableC0114g.f3309e = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, iArr, 0);
        AbstractC0108a.b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        runnableC0114g.f3310f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(runnableC0114g);
        SurfaceTexture surfaceTexture2 = this.f15854a.f3310f;
        surfaceTexture2.getClass();
        this.f15858e = new m(this, surfaceTexture2, i4 != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.f15854a.getClass();
        RunnableC0114g runnableC0114g = this.f15854a;
        runnableC0114g.f3305a.removeCallbacks(runnableC0114g);
        try {
            SurfaceTexture surfaceTexture = runnableC0114g.f3310f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, runnableC0114g.f3306b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = runnableC0114g.f3307c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = runnableC0114g.f3307c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = runnableC0114g.f3309e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(runnableC0114g.f3307c, runnableC0114g.f3309e);
            }
            EGLContext eGLContext = runnableC0114g.f3308d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(runnableC0114g.f3307c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = runnableC0114g.f3307c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(runnableC0114g.f3307c);
            }
            runnableC0114g.f3307c = null;
            runnableC0114g.f3308d = null;
            runnableC0114g.f3309e = null;
            runnableC0114g.f3310f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i4 = message.what;
        try {
            if (i4 == 1) {
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                    return true;
                } catch (C0115h e4) {
                    AbstractC0108a.f("PlaceholderSurface", "Failed to initialize placeholder surface", e4);
                    this.f15857d = new IllegalStateException(e4);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e5) {
                    AbstractC0108a.f("PlaceholderSurface", "Failed to initialize placeholder surface", e5);
                    this.f15856c = e5;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e6) {
                    AbstractC0108a.f("PlaceholderSurface", "Failed to initialize placeholder surface", e6);
                    this.f15857d = e6;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i4 == 2) {
                try {
                    b();
                    return true;
                } catch (Throwable th) {
                    try {
                        AbstractC0108a.f("PlaceholderSurface", "Failed to release placeholder surface", th);
                        return true;
                    } finally {
                        quit();
                    }
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
