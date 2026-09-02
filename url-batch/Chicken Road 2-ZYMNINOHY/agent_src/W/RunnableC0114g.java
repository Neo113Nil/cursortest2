package W;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* renamed from: W.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0114g implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f3304g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a, reason: collision with root package name */
    public final Handler f3305a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f3306b = new int[1];

    /* renamed from: c, reason: collision with root package name */
    public EGLDisplay f3307c;

    /* renamed from: d, reason: collision with root package name */
    public EGLContext f3308d;

    /* renamed from: e, reason: collision with root package name */
    public EGLSurface f3309e;

    /* renamed from: f, reason: collision with root package name */
    public SurfaceTexture f3310f;

    public RunnableC0114g(Handler handler) {
        this.f3305a = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f3305a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f3310f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
