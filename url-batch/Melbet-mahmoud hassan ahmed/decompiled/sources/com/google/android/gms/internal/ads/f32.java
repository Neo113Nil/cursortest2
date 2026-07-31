package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f32 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f4964l = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: f, reason: collision with root package name */
    private final Handler f4965f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f4966g = new int[1];

    /* renamed from: h, reason: collision with root package name */
    private EGLDisplay f4967h;

    /* renamed from: i, reason: collision with root package name */
    private EGLContext f4968i;

    /* renamed from: j, reason: collision with root package name */
    private EGLSurface f4969j;

    /* renamed from: k, reason: collision with root package name */
    private SurfaceTexture f4970k;

    public f32(Handler handler, e22 e22Var) {
        this.f4965f = handler;
    }

    public final SurfaceTexture a() {
        SurfaceTexture surfaceTexture = this.f4970k;
        Objects.requireNonNull(surfaceTexture);
        return surfaceTexture;
    }

    public final void b(int i7) {
        EGLConfig eGLConfig;
        EGLSurface eglCreatePbufferSurface;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == null) {
            throw new d12("eglGetDisplay failed", null);
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            throw new d12("eglInitialize failed", null);
        }
        this.f4967h = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, f4964l, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (!eglChooseConfig || iArr2[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
            throw new d12(n13.d("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]), null);
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f4967h, eGLConfig, EGL14.EGL_NO_CONTEXT, i7 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext == null) {
            throw new d12("eglCreateContext failed", null);
        }
        this.f4968i = eglCreateContext;
        EGLDisplay eGLDisplay = this.f4967h;
        if (i7 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i7 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface == null) {
                throw new d12("eglCreatePbufferSurface failed", null);
            }
        }
        if (!EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
            throw new d12("eglMakeCurrent failed", null);
        }
        this.f4969j = eglCreatePbufferSurface;
        GLES20.glGenTextures(1, this.f4966g, 0);
        int i8 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
            Log.e("GlUtil", valueOf.length() != 0 ? "glError ".concat(valueOf) : new String("glError "));
            i8 = glGetError;
        }
        if (i8 != 0) {
            String valueOf2 = String.valueOf(GLU.gluErrorString(i8));
            Log.e("GlUtil", valueOf2.length() != 0 ? "glError ".concat(valueOf2) : new String("glError "));
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f4966g[0]);
        this.f4970k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public final void c() {
        this.f4965f.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f4970k;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f4966g, 0);
            }
            EGLDisplay eGLDisplay = this.f4967h;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f4967h;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f4969j;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f4967h, this.f4969j);
            }
            EGLContext eGLContext = this.f4968i;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f4967h, eGLContext);
            }
            if (n13.f8865a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f4967h;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f4967h);
            }
            this.f4967h = null;
            this.f4968i = null;
            this.f4969j = null;
            this.f4970k = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.f4967h;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f4967h;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f4969j;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f4967h, this.f4969j);
            }
            EGLContext eGLContext2 = this.f4968i;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f4967h, eGLContext2);
            }
            if (n13.f8865a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay6 = this.f4967h;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f4967h);
            }
            this.f4967h = null;
            this.f4968i = null;
            this.f4969j = null;
            this.f4970k = null;
            throw th;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f4965f.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f4970k;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
