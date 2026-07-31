package o2;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* loaded from: classes.dex */
public final class j implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f19735m = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: f, reason: collision with root package name */
    private final Handler f19736f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f19737g;

    /* renamed from: h, reason: collision with root package name */
    private final c f19738h;

    /* renamed from: i, reason: collision with root package name */
    private EGLDisplay f19739i;

    /* renamed from: j, reason: collision with root package name */
    private EGLContext f19740j;

    /* renamed from: k, reason: collision with root package name */
    private EGLSurface f19741k;

    /* renamed from: l, reason: collision with root package name */
    private SurfaceTexture f19742l;

    public static final class b extends RuntimeException {
        private b(String str) {
            super(str);
        }
    }

    public interface c {
        void a();
    }

    public j(Handler handler) {
        this(handler, null);
    }

    public j(Handler handler, c cVar) {
        this.f19736f = handler;
        this.f19738h = cVar;
        this.f19737g = new int[1];
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f19735m, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!eglChooseConfig || iArr[0] <= 0 || eGLConfigArr[0] == null) {
            throw new b(m0.C("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        }
        return eGLConfigArr[0];
    }

    private static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i7) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i7 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new b("eglCreateContext failed");
    }

    private static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i7) {
        EGLSurface eglCreatePbufferSurface;
        if (i7 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i7 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface == null) {
                throw new b("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext)) {
            return eglCreatePbufferSurface;
        }
        throw new b("eglMakeCurrent failed");
    }

    private void d() {
        c cVar = this.f19738h;
        if (cVar != null) {
            cVar.a();
        }
    }

    private static void e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        m.a();
    }

    private static EGLDisplay f() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == null) {
            throw new b("eglGetDisplay failed");
        }
        int[] iArr = new int[2];
        if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            return eglGetDisplay;
        }
        throw new b("eglInitialize failed");
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) o2.a.e(this.f19742l);
    }

    public void h(int i7) {
        EGLDisplay f7 = f();
        this.f19739i = f7;
        EGLConfig a7 = a(f7);
        EGLContext b7 = b(this.f19739i, a7, i7);
        this.f19740j = b7;
        this.f19741k = c(this.f19739i, a7, b7, i7);
        e(this.f19737g);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f19737g[0]);
        this.f19742l = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void i() {
        this.f19736f.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f19742l;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f19737g, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f19739i;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f19739i;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f19741k;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f19739i, this.f19741k);
            }
            EGLContext eGLContext = this.f19740j;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f19739i, eGLContext);
            }
            if (m0.f19752a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f19739i;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f19739i);
            }
            this.f19739i = null;
            this.f19740j = null;
            this.f19741k = null;
            this.f19742l = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f19736f.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f19742l;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
