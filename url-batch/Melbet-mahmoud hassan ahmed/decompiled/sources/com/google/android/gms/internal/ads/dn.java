package com.google.android.gms.internal.ads;

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
import android.util.Log;

/* loaded from: classes.dex */
final class dn extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {

    /* renamed from: f, reason: collision with root package name */
    private final int[] f4249f;

    /* renamed from: g, reason: collision with root package name */
    private Handler f4250g;

    /* renamed from: h, reason: collision with root package name */
    private SurfaceTexture f4251h;

    /* renamed from: i, reason: collision with root package name */
    private Error f4252i;

    /* renamed from: j, reason: collision with root package name */
    private RuntimeException f4253j;

    /* renamed from: k, reason: collision with root package name */
    private fn f4254k;

    public dn() {
        super("dummySurface");
        this.f4249f = new int[1];
    }

    public final fn a(boolean z6) {
        boolean z7;
        start();
        this.f4250g = new Handler(getLooper(), this);
        synchronized (this) {
            z7 = false;
            this.f4250g.obtainMessage(1, z6 ? 1 : 0, 0).sendToTarget();
            while (this.f4254k == null && this.f4253j == null && this.f4252i == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z7 = true;
                }
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f4253j;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.f4252i;
        if (error == null) {
            return this.f4254k;
        }
        throw error;
    }

    public final void b() {
        this.f4250g.sendEmptyMessage(3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        try {
            if (i7 != 1) {
                if (i7 == 2) {
                    this.f4251h.updateTexImage();
                    return true;
                }
                if (i7 != 3) {
                    return true;
                }
                try {
                    try {
                        this.f4251h.release();
                    } finally {
                        this.f4254k = null;
                        this.f4251h = null;
                        GLES20.glDeleteTextures(1, this.f4249f, 0);
                    }
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                boolean z6 = message.arg1 != 0;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                jm.f(eglGetDisplay != null, "eglGetDisplay failed");
                int[] iArr = new int[2];
                jm.f(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                jm.f(EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0 && eGLConfigArr[0] != null, "eglChooseConfig failed");
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, z6 ? new int[]{12440, 2, 12992, 1, 12344} : new int[]{12440, 2, 12344}, 0);
                jm.f(eglCreateContext != null, "eglCreateContext failed");
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, z6 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                jm.f(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                jm.f(EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
                GLES20.glGenTextures(1, this.f4249f, 0);
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f4249f[0]);
                this.f4251h = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(this);
                this.f4254k = new fn(this, this.f4251h, z6, null);
                synchronized (this) {
                    notify();
                }
            } catch (Error e7) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e7);
                this.f4252i = e7;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e8) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e8);
                this.f4253j = e8;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f4250g.sendEmptyMessage(2);
    }
}
