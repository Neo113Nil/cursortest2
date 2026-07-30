package com.baidu.platform.comapi.map;

import android.graphics.Bitmap;
import android.opengl.GLDebugHelper;
import android.opengl.GLException;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.core.view.ViewCompat;
import com.baidu.platform.comapi.map.t;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.nio.IntBuffer;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes2.dex */
class f implements s {

    /* renamed from: a, reason: collision with root package name */
    private static final k f9660a = new k();

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<SurfaceView> f9661b;

    /* renamed from: c, reason: collision with root package name */
    private int f9662c = 60;

    /* renamed from: d, reason: collision with root package name */
    private final WeakReference<f> f9663d = new WeakReference<>(this);

    /* renamed from: e, reason: collision with root package name */
    private j f9664e;

    /* renamed from: f, reason: collision with root package name */
    private SurfaceRenderer f9665f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9666g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC0117f f9667h;

    /* renamed from: i, reason: collision with root package name */
    private g f9668i;

    /* renamed from: j, reason: collision with root package name */
    private h f9669j;

    /* renamed from: k, reason: collision with root package name */
    private l f9670k;

    /* renamed from: l, reason: collision with root package name */
    private int f9671l;

    /* renamed from: m, reason: collision with root package name */
    private int f9672m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f9673n;

    private abstract class b implements InterfaceC0117f {

        /* renamed from: a, reason: collision with root package name */
        protected int[] f9674a;

        public b(int[] iArr) {
            this.f9674a = a(iArr);
        }

        private int[] a(int[] iArr) {
            if (f.this.f9672m != 2 && f.this.f9672m != 3) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i8 = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            iArr2[i8] = 12352;
            if (f.this.f9672m == 2) {
                iArr2[length] = 4;
            } else {
                iArr2[length] = 64;
            }
            iArr2[length + 1] = 12344;
            return iArr2;
        }

        abstract EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        @Override // com.baidu.platform.comapi.map.f.InterfaceC0117f
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f9674a, null, 0, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
            int i8 = iArr[0];
            if (i8 <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i8];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f9674a, eGLConfigArr, i8, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            EGLConfig a8 = a(egl10, eGLDisplay, eGLConfigArr);
            if (a8 != null) {
                return a8;
            }
            throw new IllegalArgumentException("No config chosen");
        }
    }

    private class d implements g {

        /* renamed from: a, reason: collision with root package name */
        private int f9686a;

        private d() {
            this.f9686a = 12440;
        }

        @Override // com.baidu.platform.comapi.map.f.g
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.f9686a, f.this.f9672m, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (f.this.f9672m == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        @Override // com.baidu.platform.comapi.map.f.g
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (eGLContext == null || eGLDisplay == null) {
                return;
            }
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            Log.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            i.b("eglDestroyContex", egl10.eglGetError());
        }
    }

    private static class e implements h {
        private e() {
        }

        @Override // com.baidu.platform.comapi.map.f.h
        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e8) {
                Log.e("GLRenderControl", "eglCreateWindowSurface", e8);
                return null;
            }
        }

        @Override // com.baidu.platform.comapi.map.f.h
        public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    /* renamed from: com.baidu.platform.comapi.map.f$f, reason: collision with other inner class name */
    interface InterfaceC0117f {
        EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    interface g {
        EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    interface h {
        EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    static class j extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private volatile boolean f9694a;

        /* renamed from: b, reason: collision with root package name */
        private volatile boolean f9695b;

        /* renamed from: c, reason: collision with root package name */
        private volatile boolean f9696c;

        /* renamed from: d, reason: collision with root package name */
        private volatile boolean f9697d;

        /* renamed from: e, reason: collision with root package name */
        private volatile boolean f9698e;

        /* renamed from: f, reason: collision with root package name */
        private volatile boolean f9699f;

        /* renamed from: g, reason: collision with root package name */
        private volatile boolean f9700g;

        /* renamed from: h, reason: collision with root package name */
        private volatile boolean f9701h;

        /* renamed from: i, reason: collision with root package name */
        private volatile boolean f9702i;

        /* renamed from: j, reason: collision with root package name */
        private volatile boolean f9703j;

        /* renamed from: k, reason: collision with root package name */
        private volatile boolean f9704k;

        /* renamed from: q, reason: collision with root package name */
        private volatile boolean f9710q;

        /* renamed from: u, reason: collision with root package name */
        private i f9714u;

        /* renamed from: v, reason: collision with root package name */
        private long f9715v;

        /* renamed from: w, reason: collision with root package name */
        private long f9716w;

        /* renamed from: y, reason: collision with root package name */
        private WeakReference<f> f9718y;

        /* renamed from: r, reason: collision with root package name */
        private volatile ArrayList<Runnable> f9711r = new ArrayList<>();

        /* renamed from: s, reason: collision with root package name */
        private volatile boolean f9712s = true;

        /* renamed from: t, reason: collision with root package name */
        private volatile Runnable f9713t = null;

        /* renamed from: x, reason: collision with root package name */
        private int f9717x = 60;

        /* renamed from: l, reason: collision with root package name */
        private volatile int f9705l = 0;

        /* renamed from: m, reason: collision with root package name */
        private volatile int f9706m = 0;

        /* renamed from: o, reason: collision with root package name */
        private volatile boolean f9708o = true;

        /* renamed from: n, reason: collision with root package name */
        private volatile int f9707n = 1;

        /* renamed from: p, reason: collision with root package name */
        private volatile boolean f9709p = false;

        j(WeakReference<f> weakReference) {
            this.f9718y = weakReference;
            setPriority(10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
        
            if (r0.f9673n == false) goto L43;
         */
        /* JADX WARN: Removed duplicated region for block: B:213:0x02ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void d() {
            boolean z7;
            boolean z8;
            int fps;
            int i8;
            boolean z9;
            boolean z10;
            this.f9714u = new i(this.f9718y);
            this.f9701h = false;
            this.f9702i = false;
            this.f9709p = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            Runnable runnable = null;
            GL10 gl10 = null;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            boolean z18 = false;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                Runnable runnable2 = null;
                while (true) {
                    try {
                        synchronized (f.f9660a) {
                            while (!this.f9694a) {
                                if (this.f9711r.isEmpty()) {
                                    if (this.f9697d != this.f9696c) {
                                        z9 = this.f9696c;
                                        this.f9697d = this.f9696c;
                                        f.f9660a.notifyAll();
                                    } else {
                                        z9 = false;
                                    }
                                    if (this.f9704k) {
                                        k();
                                        j();
                                        this.f9704k = false;
                                        z13 = true;
                                    }
                                    if (z11) {
                                        k();
                                        j();
                                        z11 = false;
                                    }
                                    if (z9 && this.f9702i) {
                                        k();
                                    }
                                    if (z9) {
                                        if (this.f9701h) {
                                            f fVar = this.f9718y.get();
                                            if (fVar != null) {
                                            }
                                            j();
                                        }
                                    }
                                    if (!this.f9698e && !this.f9700g) {
                                        if (this.f9702i) {
                                            k();
                                        }
                                        this.f9700g = true;
                                        this.f9699f = false;
                                        f.f9660a.notifyAll();
                                    }
                                    if (this.f9698e && this.f9700g) {
                                        this.f9700g = false;
                                        f.f9660a.notifyAll();
                                    }
                                    if (z12) {
                                        this.f9709p = false;
                                        this.f9710q = true;
                                        f.f9660a.notifyAll();
                                        z12 = false;
                                    }
                                    if (this.f9713t != null) {
                                        runnable = this.f9713t;
                                        this.f9713t = null;
                                    }
                                    if (g()) {
                                        if (!this.f9701h) {
                                            if (z13) {
                                                z13 = false;
                                            } else {
                                                try {
                                                    this.f9714u.f();
                                                    this.f9701h = true;
                                                    f.f9660a.notifyAll();
                                                    z14 = true;
                                                } catch (RuntimeException e8) {
                                                    f.f9660a.a(this);
                                                    throw e8;
                                                }
                                            }
                                        }
                                        if (this.f9701h && !this.f9702i) {
                                            this.f9702i = true;
                                            z15 = true;
                                            z16 = true;
                                            z17 = true;
                                        }
                                        if (this.f9702i) {
                                            if (this.f9712s) {
                                                i9 = this.f9705l;
                                                i10 = this.f9706m;
                                                this.f9709p = true;
                                                this.f9712s = false;
                                                z10 = false;
                                                z15 = true;
                                                z17 = true;
                                            } else {
                                                z10 = false;
                                            }
                                            this.f9708o = z10;
                                            f.f9660a.notifyAll();
                                            if (this.f9709p) {
                                                z18 = true;
                                            }
                                        }
                                    } else if (runnable != null) {
                                        Log.w("GLRenderControl", "Warning, !readyToDraw() but waiting for draw finished! Early reporting draw finished.");
                                        runnable.run();
                                        runnable = null;
                                    }
                                    f.f9660a.wait();
                                } else {
                                    runnable2 = this.f9711r.remove(0);
                                }
                            }
                            synchronized (f.f9660a) {
                                k();
                                j();
                            }
                            return;
                        }
                    } catch (Throwable th) {
                        synchronized (f.f9660a) {
                        }
                    }
                    if (runnable2 != null) {
                        break;
                    }
                    if (z15) {
                        if (this.f9714u.b()) {
                            synchronized (f.f9660a) {
                                this.f9703j = true;
                                f.f9660a.notifyAll();
                            }
                            z15 = false;
                        } else {
                            synchronized (f.f9660a) {
                                this.f9703j = true;
                                this.f9699f = true;
                                f.f9660a.notifyAll();
                            }
                        }
                        synchronized (f.f9660a) {
                            k();
                            j();
                            throw th;
                        }
                    }
                    if (z16) {
                        gl10 = (GL10) this.f9714u.a();
                        z16 = false;
                    }
                    if (z14) {
                        f fVar2 = this.f9718y.get();
                        if (fVar2 != null) {
                            try {
                                z7 = z11;
                                z8 = z12;
                                fVar2.f9665f.onSurfaceCreated(null, fVar2.e(), fVar2.c(), 0);
                                Log.d("GLRenderControl", "mRenderer.onSurfaceCreated");
                            } catch (Throwable th2) {
                                Log.d("GLRenderControl", "mRenderer.onSurfaceCreated");
                                throw th2;
                            }
                        } else {
                            z7 = z11;
                            z8 = z12;
                        }
                        z14 = false;
                    } else {
                        z7 = z11;
                        z8 = z12;
                    }
                    if (z17) {
                        f fVar3 = this.f9718y.get();
                        if (fVar3 != null) {
                            try {
                                fVar3.f9665f.onSurfaceChanged(i9, i10);
                                Log.d("GLRenderControl", "mRenderer.onSurfaceChanged");
                            } catch (Throwable th3) {
                                Log.d("GLRenderControl", "mRenderer.onSurfaceChanged");
                                throw th3;
                            }
                        }
                        z17 = false;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    f fVar4 = this.f9718y.get();
                    if (fVar4 != null) {
                        try {
                            fVar4.f9665f.onDrawFrame(gl10);
                            if (runnable != null) {
                                runnable.run();
                                runnable = null;
                            }
                            fps = fVar4.getFPS();
                        } finally {
                        }
                    } else {
                        fps = 60;
                    }
                    int g8 = this.f9714u.g();
                    if (g8 != 12288) {
                        if (g8 != 12302) {
                            i.a("GLThread", "eglSwapBuffers", g8);
                            synchronized (f.f9660a) {
                                this.f9699f = true;
                                f.f9660a.notifyAll();
                            }
                        } else {
                            z7 = true;
                        }
                    }
                    if (z18) {
                        i8 = 60;
                        z12 = true;
                        z18 = false;
                    } else {
                        z12 = z8;
                        i8 = 60;
                    }
                    if (fps <= i8 && fps > 0) {
                        long currentTimeMillis2 = (1000 / fps) - (System.currentTimeMillis() - currentTimeMillis);
                        if (currentTimeMillis2 > 1) {
                            synchronized (f.f9660a) {
                                f.f9660a.notifyAll();
                                f.f9660a.wait(currentTimeMillis2);
                            }
                        }
                    }
                    a(System.currentTimeMillis() - currentTimeMillis);
                    z11 = z7;
                }
                runnable2.run();
            }
        }

        private boolean g() {
            return !this.f9697d && this.f9698e && !this.f9699f && this.f9705l > 0 && this.f9706m > 0 && (this.f9708o || this.f9707n == 1);
        }

        private void j() {
            if (this.f9701h) {
                this.f9714u.e();
                this.f9701h = false;
                f.f9660a.a(this);
            }
        }

        private void k() {
            if (this.f9702i) {
                this.f9702i = false;
                this.f9714u.c();
            }
        }

        public boolean b() {
            return this.f9701h && this.f9702i && g();
        }

        public int c() {
            int i8;
            synchronized (f.f9660a) {
                i8 = this.f9707n;
            }
            return i8;
        }

        public void e() {
            synchronized (f.f9660a) {
                this.f9696c = true;
                while (!this.f9695b && !this.f9697d) {
                    try {
                        f.f9660a.notifyAll();
                        f.f9660a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void f() {
            synchronized (f.f9660a) {
                this.f9696c = false;
                this.f9708o = true;
                this.f9710q = false;
                while (!this.f9695b && this.f9697d && !this.f9710q) {
                    try {
                        f.f9660a.notifyAll();
                        f.f9660a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void h() {
            synchronized (f.f9660a) {
                this.f9694a = true;
                while (!this.f9695b) {
                    try {
                        f.f9660a.notifyAll();
                        f.f9660a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void i() {
            synchronized (f.f9660a) {
                this.f9708o = true;
                f.f9660a.notifyAll();
            }
        }

        public void l() {
            synchronized (f.f9660a) {
                this.f9698e = true;
                this.f9703j = false;
                while (this.f9700g && !this.f9703j && !this.f9695b) {
                    try {
                        f.f9660a.notifyAll();
                        f.f9660a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void m() {
            synchronized (f.f9660a) {
                this.f9698e = false;
                while (!this.f9700g && !this.f9695b) {
                    try {
                        f.f9660a.notifyAll();
                        f.f9660a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            setName("GLThread " + getId());
            try {
                d();
            } catch (InterruptedException unused) {
            } catch (Throwable th) {
                f.f9660a.b(this);
                throw th;
            }
            f.f9660a.b(this);
        }

        private void a(long j8) {
            long j9 = this.f9715v + 1;
            this.f9715v = j9;
            long j10 = this.f9716w + j8;
            this.f9716w = j10;
            if (j9 >= 10) {
                int i8 = (int) (j10 / j9);
                if (i8 <= 0) {
                    this.f9715v = 0L;
                    this.f9716w = 0L;
                } else {
                    this.f9717x = (this.f9717x + (1000 / i8)) / 2;
                    this.f9715v = 0L;
                    this.f9716w = 0L;
                }
            }
        }

        public void b(Runnable runnable) {
            synchronized (f.f9660a) {
                try {
                    if (Thread.currentThread() == this) {
                        return;
                    }
                    this.f9709p = true;
                    this.f9708o = true;
                    this.f9710q = false;
                    this.f9713t = runnable;
                    f.f9660a.notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void a(int i8) {
            if (i8 >= 0 && i8 <= 1) {
                synchronized (f.f9660a) {
                    this.f9707n = i8;
                    f.f9660a.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("renderMode");
        }

        public void a(int i8, int i9) {
            synchronized (f.f9660a) {
                try {
                    this.f9705l = i8;
                    this.f9706m = i9;
                    this.f9712s = true;
                    this.f9708o = true;
                    this.f9710q = false;
                    if (Thread.currentThread() == this) {
                        return;
                    }
                    while (!this.f9695b && !this.f9697d && !this.f9710q && b()) {
                        try {
                            f.f9660a.notifyAll();
                            f.f9660a.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void a(Runnable runnable) {
            if (runnable != null) {
                synchronized (f.f9660a) {
                    this.f9711r.add(runnable);
                    f.f9660a.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("r must not be null");
        }
    }

    private static class k {
        private k() {
        }

        public synchronized void a(j jVar) {
            notifyAll();
        }

        public synchronized void b(j jVar) {
            jVar.f9695b = true;
            notifyAll();
        }
    }

    interface l {
        GL a(GL gl);
    }

    static class m extends Writer {

        /* renamed from: a, reason: collision with root package name */
        private StringBuilder f9719a = new StringBuilder();

        m() {
        }

        private void a() {
            if (this.f9719a.length() > 0) {
                Log.v("GLSurfaceView26", this.f9719a.toString());
                StringBuilder sb = this.f9719a;
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            a();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i8, int i9) {
            for (int i10 = 0; i10 < i9; i10++) {
                char c8 = cArr[i8 + i10];
                if (c8 == '\n') {
                    a();
                } else {
                    this.f9719a.append(c8);
                }
            }
        }
    }

    private class n extends c {
        public n(boolean z7) {
            super(8, 8, 8, 0, z7 ? 16 : 0, 0, 0, 0);
        }
    }

    public f(SurfaceView surfaceView) {
        this.f9661b = new WeakReference<>(surfaceView);
    }

    public void b(boolean z7) {
        this.f9673n = z7;
    }

    @Override // com.baidu.platform.comapi.map.s
    public Bitmap captureImageFromSurface(int i8, int i9, int i10, int i11, Object obj, Bitmap.Config config) {
        return a(i8, i9, i10, i11, (GL10) obj, config);
    }

    protected void finalize() {
        try {
            j jVar = this.f9664e;
            if (jVar != null) {
                jVar.h();
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.baidu.platform.comapi.map.s
    public int getDebugFlags() {
        return this.f9671l;
    }

    @Override // com.baidu.platform.comapi.map.s
    public int getFPS() {
        return this.f9662c;
    }

    @Override // com.baidu.platform.comapi.map.s
    public int getRenderMode() {
        return this.f9664e.c();
    }

    @Override // com.baidu.platform.comapi.map.s
    public t.a getViewType() {
        return t.a.OPENGL_ES;
    }

    @Override // com.baidu.platform.comapi.map.s
    public void onAttachedToWindow() {
        if (this.f9666g && this.f9665f != null) {
            j jVar = this.f9664e;
            int c8 = jVar != null ? jVar.c() : 1;
            j jVar2 = new j(this.f9663d);
            this.f9664e = jVar2;
            if (c8 != 1) {
                jVar2.a(c8);
            }
            this.f9664e.start();
        }
        this.f9666g = false;
    }

    @Override // com.baidu.platform.comapi.map.s
    public void onDetachedFromWindow() {
        j jVar = this.f9664e;
        if (jVar != null) {
            jVar.h();
        }
        this.f9666g = true;
    }

    @Override // com.baidu.platform.comapi.map.s
    public void onPause() {
        this.f9664e.e();
    }

    @Override // com.baidu.platform.comapi.map.s
    public void onResume() {
        this.f9664e.f();
    }

    @Override // com.baidu.platform.comapi.map.s
    public void queueEvent(Runnable runnable) {
        this.f9664e.a(runnable);
    }

    @Override // com.baidu.platform.comapi.map.s
    public void requestRender() {
        this.f9664e.i();
    }

    @Override // com.baidu.platform.comapi.map.s
    public void setDebugFlags(int i8) {
        this.f9671l = i8;
    }

    @Override // com.baidu.platform.comapi.map.s
    public void setFPS(int i8) {
        if (i8 <= 0) {
            return;
        }
        if (i8 > 60) {
            i8 = 60;
        }
        this.f9662c = i8;
    }

    @Override // com.baidu.platform.comapi.map.s
    public void setRenderMode(int i8) {
        this.f9664e.a(i8);
    }

    @Override // com.baidu.platform.comapi.map.s
    public void setRenderer(SurfaceRenderer surfaceRenderer) {
        b();
        if (this.f9667h == null) {
            this.f9667h = new n(true);
        }
        if (this.f9668i == null) {
            this.f9668i = new d();
        }
        if (this.f9669j == null) {
            this.f9669j = new e();
        }
        this.f9665f = surfaceRenderer;
        j jVar = new j(this.f9663d);
        this.f9664e = jVar;
        jVar.start();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i8, int i9, int i10) {
        this.f9664e.a(i9, i10);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f9664e.l();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f9664e.m();
    }

    @Override // android.view.SurfaceHolder.Callback2
    @Deprecated
    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        j jVar = this.f9664e;
        if (jVar != null) {
            jVar.b(runnable);
        }
    }

    public int c() {
        SurfaceView surfaceView = this.f9661b.get();
        if (surfaceView != null) {
            return surfaceView.getHeight();
        }
        return 0;
    }

    public SurfaceHolder d() {
        SurfaceView surfaceView = this.f9661b.get();
        if (surfaceView != null) {
            return surfaceView.getHolder();
        }
        return null;
    }

    public int e() {
        SurfaceView surfaceView = this.f9661b.get();
        if (surfaceView != null) {
            return surfaceView.getWidth();
        }
        return 0;
    }

    private void b() {
        if (this.f9664e != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    public void a(g gVar) {
        b();
        this.f9668i = gVar;
    }

    public void a(InterfaceC0117f interfaceC0117f) {
        b();
        this.f9667h = interfaceC0117f;
    }

    public void a(boolean z7) {
        a(new n(z7));
    }

    public void a(int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        a(new c(i8, i9, i10, i11, i12, i13, i14, i15));
    }

    public void a(int i8) {
        b();
        this.f9672m = i8;
    }

    private class c extends b {

        /* renamed from: c, reason: collision with root package name */
        private int[] f9676c;

        /* renamed from: d, reason: collision with root package name */
        protected int f9677d;

        /* renamed from: e, reason: collision with root package name */
        protected int f9678e;

        /* renamed from: f, reason: collision with root package name */
        protected int f9679f;

        /* renamed from: g, reason: collision with root package name */
        protected int f9680g;

        /* renamed from: h, reason: collision with root package name */
        protected int f9681h;

        /* renamed from: i, reason: collision with root package name */
        protected int f9682i;

        /* renamed from: j, reason: collision with root package name */
        protected int f9683j;

        /* renamed from: k, reason: collision with root package name */
        protected int f9684k;

        public c(int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            super(new int[]{12324, i8, 12323, i9, 12322, i10, 12321, i11, 12325, i12, 12326, i13, 12338, i14, 12337, i15, 12344});
            this.f9676c = new int[1];
            this.f9677d = i8;
            this.f9678e = i9;
            this.f9679f = i10;
            this.f9680g = i11;
            this.f9681h = i12;
            this.f9682i = i13;
            this.f9683j = i14;
            this.f9684k = i15;
        }

        @Override // com.baidu.platform.comapi.map.f.b
        public EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            EGLConfig eGLConfig = null;
            for (EGLConfig eGLConfig2 : eGLConfigArr) {
                int a8 = a(egl10, eGLDisplay, eGLConfig2, 12325, 0);
                int a9 = a(egl10, eGLDisplay, eGLConfig2, 12326, 0);
                if (a8 >= this.f9681h && a9 >= this.f9682i) {
                    int a10 = a(egl10, eGLDisplay, eGLConfig2, 12324, 0);
                    int a11 = a(egl10, eGLDisplay, eGLConfig2, 12323, 0);
                    int a12 = a(egl10, eGLDisplay, eGLConfig2, 12322, 0);
                    int a13 = a(egl10, eGLDisplay, eGLConfig2, 12321, 0);
                    if (a10 == this.f9677d && a11 == this.f9678e && a12 == this.f9679f && a13 == this.f9680g) {
                        if (eGLConfig == null) {
                            eGLConfig = eGLConfig2;
                        }
                        if (a(egl10, eGLDisplay, eGLConfig2, 12337, 0) == this.f9684k) {
                            return eGLConfig2;
                        }
                    }
                }
            }
            return eGLConfig;
        }

        private int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i8, int i9) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i8, this.f9676c) ? this.f9676c[0] : i9;
        }
    }

    private Bitmap a(int i8, int i9, int i10, int i11, GL10 gl10, Bitmap.Config config) {
        Bitmap createBitmap;
        int i12 = i10 * i11;
        int[] iArr = new int[i12];
        int[] iArr2 = new int[i12];
        IntBuffer wrap = IntBuffer.wrap(iArr);
        wrap.position(0);
        try {
            gl10.glReadPixels(i8, i9, i10, i11, 6408, 5121, wrap);
            for (int i13 = 0; i13 < i11; i13++) {
                int i14 = i13 * i10;
                int i15 = ((i11 - i13) - 1) * i10;
                for (int i16 = 0; i16 < i10; i16++) {
                    int i17 = iArr[i14 + i16];
                    iArr2[i15 + i16] = (i17 & (-16711936)) | ((i17 << 16) & 16711680) | ((i17 >> 16) & 255);
                }
            }
            if (config == null) {
                createBitmap = Bitmap.createBitmap(iArr2, i10, i11, Bitmap.Config.ARGB_8888);
            } else {
                createBitmap = Bitmap.createBitmap(iArr2, i10, i11, config);
            }
            return a(createBitmap);
        } catch (GLException unused) {
            return null;
        }
    }

    private static class i {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<f> f9688a;

        /* renamed from: b, reason: collision with root package name */
        EGL10 f9689b;

        /* renamed from: c, reason: collision with root package name */
        EGLDisplay f9690c;

        /* renamed from: d, reason: collision with root package name */
        EGLSurface f9691d;

        /* renamed from: e, reason: collision with root package name */
        EGLConfig f9692e;

        /* renamed from: f, reason: collision with root package name */
        EGLContext f9693f;

        public i(WeakReference<f> weakReference) {
            this.f9688a = weakReference;
        }

        private void d() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f9691d;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.f9689b.eglMakeCurrent(this.f9690c, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            f fVar = this.f9688a.get();
            if (fVar != null) {
                fVar.f9669j.destroySurface(this.f9689b, this.f9690c, this.f9691d);
            }
            this.f9691d = null;
        }

        GL a() {
            GL gl = this.f9693f.getGL();
            f fVar = this.f9688a.get();
            if (fVar == null) {
                return gl;
            }
            if (fVar.f9670k != null) {
                gl = fVar.f9670k.a(gl);
            }
            if ((fVar.f9671l & 3) != 0) {
                return GLDebugHelper.wrap(gl, (fVar.f9671l & 1) == 0 ? 0 : 1, (fVar.f9671l & 2) != 0 ? new m() : null);
            }
            return gl;
        }

        public boolean b() {
            if (this.f9689b == null) {
                throw new RuntimeException("egl not initialized");
            }
            if (this.f9690c == null) {
                throw new RuntimeException("eglDisplay not initialized");
            }
            if (this.f9692e == null) {
                throw new RuntimeException("mEglConfig not initialized");
            }
            d();
            f fVar = this.f9688a.get();
            if (fVar != null) {
                this.f9691d = fVar.f9669j.createWindowSurface(this.f9689b, this.f9690c, this.f9692e, fVar.d());
            } else {
                this.f9691d = null;
            }
            EGLSurface eGLSurface = this.f9691d;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.f9689b.eglGetError() == 12299) {
                    Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (this.f9689b.eglMakeCurrent(this.f9690c, eGLSurface, eGLSurface, this.f9693f)) {
                return true;
            }
            a("EGLHelper", "eglMakeCurrent", this.f9689b.eglGetError());
            return false;
        }

        public void c() {
            d();
        }

        public void e() {
            if (this.f9693f != null) {
                f fVar = this.f9688a.get();
                if (fVar != null) {
                    fVar.f9668i.destroyContext(this.f9689b, this.f9690c, this.f9693f);
                }
                this.f9693f = null;
            }
            EGLDisplay eGLDisplay = this.f9690c;
            if (eGLDisplay != null) {
                this.f9689b.eglTerminate(eGLDisplay);
                this.f9690c = null;
            }
        }

        public void f() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f9689b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f9690c = eglGetDisplay;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed");
            }
            if (!this.f9689b.eglInitialize(eglGetDisplay, new int[2])) {
                throw new RuntimeException("eglInitialize failed");
            }
            f fVar = this.f9688a.get();
            if (fVar == null) {
                this.f9692e = null;
                this.f9693f = null;
            } else {
                try {
                    this.f9692e = fVar.f9667h.chooseConfig(this.f9689b, this.f9690c);
                    this.f9693f = fVar.f9668i.createContext(this.f9689b, this.f9690c, this.f9692e);
                } catch (IllegalArgumentException e8) {
                    e8.printStackTrace();
                    return;
                }
            }
            EGLContext eGLContext = this.f9693f;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.f9693f = null;
                a("createContext");
            }
            this.f9691d = null;
        }

        public int g() {
            if (this.f9689b.eglSwapBuffers(this.f9690c, this.f9691d)) {
                return 12288;
            }
            return this.f9689b.eglGetError();
        }

        private void a(String str) {
            b(str, this.f9689b.eglGetError());
        }

        public static void a(String str, String str2, int i8) {
            Log.w(str, a(str2, i8));
        }

        public static String a(String str, int i8) {
            return str + " failed: " + a(i8);
        }

        private static String a(int i8) {
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

        public static void b(String str, int i8) {
            throw new RuntimeException(a(str, i8));
        }

        private static String b(int i8) {
            return "0x" + Integer.toHexString(i8);
        }
    }

    public Bitmap a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        int i8 = width * height;
        int[] iArr = new int[i8];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        for (int i9 = 0; i9 < i8; i9++) {
            iArr[i9] = (iArr[i9] & ViewCompat.MEASURED_SIZE_MASK) | (-16777216);
        }
        createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return createBitmap;
    }
}
