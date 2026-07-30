package com.baidu.platform.comapi.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import android.opengl.GLException;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import com.baidu.platform.comapi.util.EglConfigUtils;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
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
public class GLTextureView extends TextureView implements TextureView.SurfaceTextureListener {
    public static final int DEBUG_CHECK_GL_ERROR = 1;
    public static final int DEBUG_LOG_GL_CALLS = 2;
    public static final int RENDERMODE_CONTINUOUSLY = 1;
    public static final int RENDERMODE_WHEN_DIRTY = 0;

    /* renamed from: a, reason: collision with root package name */
    private static final h f9362a = new h(null);

    /* renamed from: b, reason: collision with root package name */
    private int f9363b;

    /* renamed from: c, reason: collision with root package name */
    private final View.OnLayoutChangeListener f9364c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakReference<GLTextureView> f9365d;

    /* renamed from: e, reason: collision with root package name */
    private g f9366e;

    /* renamed from: f, reason: collision with root package name */
    private SurfaceRenderer f9367f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9368g;

    /* renamed from: h, reason: collision with root package name */
    private GLSurfaceView.EGLConfigChooser f9369h;

    /* renamed from: i, reason: collision with root package name */
    private GLSurfaceView.EGLContextFactory f9370i;

    /* renamed from: j, reason: collision with root package name */
    private GLSurfaceView.EGLWindowSurfaceFactory f9371j;

    /* renamed from: k, reason: collision with root package name */
    private GLSurfaceView.GLWrapper f9372k;

    /* renamed from: l, reason: collision with root package name */
    private int f9373l;

    /* renamed from: m, reason: collision with root package name */
    private int f9374m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f9375n;

    class a implements View.OnLayoutChangeListener {
        a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            GLTextureView gLTextureView = GLTextureView.this;
            gLTextureView.onSurfaceTextureSizeChanged(gLTextureView.getSurfaceTexture(), i10 - i8, i11 - i9);
        }
    }

    private abstract class b implements GLSurfaceView.EGLConfigChooser {

        /* renamed from: a, reason: collision with root package name */
        protected int[] f9377a;

        public b(int[] iArr) {
            this.f9377a = a(iArr);
        }

        private int[] a(int[] iArr) {
            if (GLTextureView.this.f9374m != 2 && GLTextureView.this.f9374m != 3) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i8 = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i8);
            iArr2[i8] = 12352;
            if (GLTextureView.this.f9374m == 2) {
                iArr2[length] = 4;
            } else {
                iArr2[length] = 64;
            }
            iArr2[length + 1] = 12344;
            return iArr2;
        }

        abstract EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        @Override // android.opengl.GLSurfaceView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f9377a, null, 0, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
            int i8 = iArr[0];
            if (i8 <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i8];
            if (!egl10.eglChooseConfig(eGLDisplay, this.f9377a, eGLConfigArr, i8, iArr)) {
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            EGLConfig a8 = a(egl10, eGLDisplay, eGLConfigArr);
            if (a8 != null) {
                return a8;
            }
            throw new IllegalArgumentException("No config chosen");
        }
    }

    private class c extends b {

        /* renamed from: c, reason: collision with root package name */
        private int[] f9379c;

        /* renamed from: d, reason: collision with root package name */
        protected int f9380d;

        /* renamed from: e, reason: collision with root package name */
        protected int f9381e;

        /* renamed from: f, reason: collision with root package name */
        protected int f9382f;

        /* renamed from: g, reason: collision with root package name */
        protected int f9383g;

        /* renamed from: h, reason: collision with root package name */
        protected int f9384h;

        /* renamed from: i, reason: collision with root package name */
        protected int f9385i;

        /* renamed from: j, reason: collision with root package name */
        protected int f9386j;

        public c(int i8, int i9, int i10, int i11, int i12, int i13) {
            super(new int[]{12324, i8, 12323, i9, 12322, i10, 12321, i11, 12325, i12, 12326, i13, 12344});
            this.f9379c = new int[1];
            this.f9380d = i8;
            this.f9381e = i9;
            this.f9382f = i10;
            this.f9383g = i11;
            this.f9384h = i12;
            this.f9385i = i13;
            this.f9386j = 1;
        }

        @Override // com.baidu.platform.comapi.map.GLTextureView.b
        public EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            EGLConfig eGLConfig = null;
            for (EGLConfig eGLConfig2 : eGLConfigArr) {
                int a8 = a(egl10, eGLDisplay, eGLConfig2, 12325, 0);
                int a9 = a(egl10, eGLDisplay, eGLConfig2, 12326, 0);
                if (a8 >= this.f9384h && a9 >= this.f9385i) {
                    int a10 = a(egl10, eGLDisplay, eGLConfig2, 12324, 0);
                    int a11 = a(egl10, eGLDisplay, eGLConfig2, 12323, 0);
                    int a12 = a(egl10, eGLDisplay, eGLConfig2, 12322, 0);
                    int a13 = a(egl10, eGLDisplay, eGLConfig2, 12321, 0);
                    if (a10 == this.f9380d && a11 == this.f9381e && a12 == this.f9382f && a13 == this.f9383g) {
                        if (eGLConfig == null) {
                            eGLConfig = eGLConfig2;
                        }
                        if (a(egl10, eGLDisplay, eGLConfig2, 12337, 0) == this.f9386j) {
                            return eGLConfig2;
                        }
                    }
                }
            }
            return eGLConfig;
        }

        public c(int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            super(new int[]{12324, i8, 12323, i9, 12322, i10, 12321, i11, 12325, i12, 12326, i13, 12338, 1, 12337, i14, 12344});
            this.f9379c = new int[1];
            this.f9380d = i8;
            this.f9381e = i9;
            this.f9382f = i10;
            this.f9383g = i11;
            this.f9384h = i12;
            this.f9385i = i13;
            this.f9386j = i14;
        }

        private int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i8, int i9) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i8, this.f9379c) ? this.f9379c[0] : i9;
        }
    }

    private class d implements GLSurfaceView.EGLContextFactory {

        /* renamed from: a, reason: collision with root package name */
        private int f9388a;

        private d() {
            this.f9388a = 12440;
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int[] iArr = {this.f9388a, GLTextureView.this.f9374m, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (GLTextureView.this.f9374m == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            f.b("eglDestroyContex", egl10.eglGetError());
        }

        /* synthetic */ d(GLTextureView gLTextureView, a aVar) {
            this();
        }
    }

    private static class e implements GLSurfaceView.EGLWindowSurfaceFactory {
        private e() {
        }

        @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException e8) {
                Log.e("GLTextureView", "eglCreateWindowSurface", e8);
                return null;
            }
        }

        @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
        public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    private static class f {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<GLTextureView> f9390a;

        /* renamed from: b, reason: collision with root package name */
        EGL10 f9391b;

        /* renamed from: c, reason: collision with root package name */
        EGLDisplay f9392c;

        /* renamed from: d, reason: collision with root package name */
        EGLSurface f9393d;

        /* renamed from: e, reason: collision with root package name */
        EGLConfig f9394e;

        /* renamed from: f, reason: collision with root package name */
        EGLContext f9395f;

        public f(WeakReference<GLTextureView> weakReference) {
            this.f9390a = weakReference;
        }

        public static void a(String str, String str2, int i8) {
        }

        private void d() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f9393d;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.f9391b.eglMakeCurrent(this.f9392c, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            GLTextureView gLTextureView = this.f9390a.get();
            if (gLTextureView != null) {
                gLTextureView.f9371j.destroySurface(this.f9391b, this.f9392c, this.f9393d);
            }
            this.f9393d = null;
        }

        public boolean b() {
            Log.w("EglHelper", "createSurface()  tid=" + Thread.currentThread().getId());
            if (this.f9391b == null) {
                throw new RuntimeException("egl not initialized");
            }
            if (this.f9392c == null) {
                throw new RuntimeException("eglDisplay not initialized");
            }
            if (this.f9394e == null) {
                throw new RuntimeException("mEglConfig not initialized");
            }
            d();
            GLTextureView gLTextureView = this.f9390a.get();
            if (gLTextureView != null) {
                this.f9393d = gLTextureView.f9371j.createWindowSurface(this.f9391b, this.f9392c, this.f9394e, gLTextureView.getSurfaceTexture());
            } else {
                this.f9393d = null;
            }
            EGLSurface eGLSurface = this.f9393d;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                if (this.f9391b.eglGetError() == 12299) {
                    Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                }
                return false;
            }
            if (this.f9391b.eglMakeCurrent(this.f9392c, eGLSurface, eGLSurface, this.f9395f)) {
                return true;
            }
            a("EGLHelper", "eglMakeCurrent", this.f9391b.eglGetError());
            return false;
        }

        public void c() {
            Log.w("EglHelper", "destroySurface()  tid=" + Thread.currentThread().getId());
            d();
        }

        public void e() {
            Log.w("EglHelper", "finish() tid=" + Thread.currentThread().getId());
            if (this.f9395f != null) {
                GLTextureView gLTextureView = this.f9390a.get();
                if (gLTextureView != null) {
                    gLTextureView.f9370i.destroyContext(this.f9391b, this.f9392c, this.f9395f);
                }
                this.f9395f = null;
            }
            EGLDisplay eGLDisplay = this.f9392c;
            if (eGLDisplay != null) {
                this.f9391b.eglTerminate(eGLDisplay);
                this.f9392c = null;
            }
        }

        public void f() {
            Log.w("EglHelper", "start() tid=" + Thread.currentThread().getId());
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f9391b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f9392c = eglGetDisplay;
            if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed");
            }
            if (!this.f9391b.eglInitialize(eglGetDisplay, new int[2])) {
                throw new RuntimeException("eglInitialize failed");
            }
            GLTextureView gLTextureView = this.f9390a.get();
            if (gLTextureView == null) {
                this.f9394e = null;
                this.f9395f = null;
            } else {
                this.f9394e = gLTextureView.f9369h.chooseConfig(this.f9391b, this.f9392c);
                this.f9395f = gLTextureView.f9370i.createContext(this.f9391b, this.f9392c, this.f9394e);
            }
            EGLContext eGLContext = this.f9395f;
            if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                this.f9395f = null;
                a("createContext");
            }
            Log.w("EglHelper", "createContext " + this.f9395f + " tid=" + Thread.currentThread().getId());
            this.f9393d = null;
        }

        public int g() {
            if (this.f9391b.eglSwapBuffers(this.f9392c, this.f9393d)) {
                return 12288;
            }
            return this.f9391b.eglGetError();
        }

        GL a() {
            GL gl = this.f9395f.getGL();
            GLTextureView gLTextureView = this.f9390a.get();
            if (gLTextureView == null) {
                return gl;
            }
            if (gLTextureView.f9372k != null) {
                gl = gLTextureView.f9372k.wrap(gl);
            }
            if ((gLTextureView.f9373l & 3) != 0) {
                return GLDebugHelper.wrap(gl, (gLTextureView.f9373l & 1) == 0 ? 0 : 1, (gLTextureView.f9373l & 2) != 0 ? new i() : null);
            }
            return gl;
        }

        private void a(String str) {
            b(str, this.f9391b.eglGetError());
        }

        public static String a(String str, int i8) {
            return str + " EGL failed code: " + i8;
        }

        public static void b(String str, int i8) {
            throw new RuntimeException(a(str, i8));
        }
    }

    static class g extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private boolean f9396a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f9397b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f9398c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f9399d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f9400e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f9401f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f9402g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f9403h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f9404i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f9405j;

        /* renamed from: o, reason: collision with root package name */
        private boolean f9410o;

        /* renamed from: r, reason: collision with root package name */
        private f f9413r;

        /* renamed from: s, reason: collision with root package name */
        private WeakReference<GLTextureView> f9414s;

        /* renamed from: p, reason: collision with root package name */
        private ArrayList<Runnable> f9411p = new ArrayList<>();

        /* renamed from: q, reason: collision with root package name */
        private boolean f9412q = true;

        /* renamed from: k, reason: collision with root package name */
        private int f9406k = 0;

        /* renamed from: l, reason: collision with root package name */
        private int f9407l = 0;

        /* renamed from: n, reason: collision with root package name */
        private boolean f9409n = true;

        /* renamed from: m, reason: collision with root package name */
        private int f9408m = 1;

        g(WeakReference<GLTextureView> weakReference) {
            this.f9414s = weakReference;
        }

        /* JADX WARN: Removed duplicated region for block: B:127:0x035b  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x0373 A[Catch: all -> 0x0252, TryCatch #1 {all -> 0x0252, blocks: (B:4:0x001c, B:5:0x001e, B:167:0x024a, B:89:0x0257, B:153:0x0266, B:154:0x0268, B:164:0x0277, B:94:0x027b, B:96:0x0291, B:98:0x02a2, B:102:0x02c4, B:104:0x02ef, B:106:0x02f7, B:108:0x0305, B:109:0x0313, B:113:0x0321, B:114:0x032a, B:122:0x0337, B:125:0x033b, B:128:0x035c, B:131:0x0366, B:133:0x0373, B:134:0x0375, B:142:0x037d, B:199:0x039c, B:7:0x001f, B:186:0x0023, B:9:0x0035, B:184:0x003d, B:86:0x0247, B:11:0x004b, B:13:0x0051, B:15:0x005c, B:16:0x0089, B:19:0x008f, B:21:0x00b3, B:23:0x00bc, B:26:0x00c2, B:28:0x00df, B:30:0x00e3, B:32:0x00ed, B:34:0x00f3, B:36:0x00fd, B:38:0x0102, B:40:0x011c, B:42:0x0126, B:44:0x012d, B:45:0x0145, B:47:0x0149, B:50:0x014f, B:52:0x016b, B:53:0x016e, B:54:0x0179, B:56:0x017d, B:59:0x0183, B:62:0x01a7, B:63:0x01c9, B:65:0x01cf, B:69:0x01fd, B:71:0x0201, B:73:0x0205, B:74:0x020b, B:80:0x020f, B:82:0x0213, B:84:0x0219, B:85:0x023e, B:78:0x038e, B:169:0x01d9, B:172:0x01e3, B:174:0x01e9, B:177:0x01f3, B:178:0x01fa, B:117:0x032c, B:118:0x0331, B:157:0x026a, B:158:0x026f, B:136:0x0376, B:137:0x0379), top: B:3:0x001c, inners: #0, #3, #4, #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0385  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x020f A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void d() {
            GL10 gl10;
            GL10 gl102;
            boolean z7;
            int i8;
            GL10 gl103;
            long currentTimeMillis;
            long j8;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            GLTextureView gLTextureView;
            g gVar = this;
            gVar.f9413r = new f(gVar.f9414s);
            gVar.f9403h = false;
            gVar.f9404i = false;
            boolean z13 = false;
            GL10 gl104 = null;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            int i9 = 0;
            int i10 = 0;
            boolean z18 = false;
            boolean z19 = false;
            boolean z20 = false;
            while (true) {
                Runnable runnable = null;
                while (true) {
                    try {
                        synchronized (com.baidu.platform.b.a.f8644a) {
                            while (!gVar.f9396a) {
                                if (gVar.f9411p.isEmpty()) {
                                    boolean z21 = gVar.f9399d;
                                    boolean z22 = gVar.f9398c;
                                    if (z21 != z22) {
                                        gVar.f9399d = z22;
                                        com.baidu.platform.b.a.f8644a.notifyAll();
                                        z9 = z22;
                                        StringBuilder sb = new StringBuilder();
                                        gl10 = gl104;
                                        sb.append("mPaused is now ");
                                        sb.append(gVar.f9399d);
                                        sb.append(" tid=");
                                        z8 = z14;
                                        sb.append(getId());
                                        Log.i("GLThread", sb.toString());
                                    } else {
                                        gl10 = gl104;
                                        z8 = z14;
                                        z9 = false;
                                    }
                                    if (gVar.f9405j) {
                                        Log.i("GLThread", "releasing EGL context because asked to tid=" + getId());
                                        l();
                                        k();
                                        gVar.f9405j = false;
                                        z20 = true;
                                    }
                                    if (z13) {
                                        l();
                                        k();
                                        z13 = false;
                                    }
                                    if (z9 && gVar.f9404i) {
                                        Log.i("GLThread", "releasing EGL surface because paused tid=" + getId());
                                        l();
                                    }
                                    if (z9 && gVar.f9403h && ((gLTextureView = gVar.f9414s.get()) == null || !gLTextureView.f9375n || GLTextureView.f9362a.b())) {
                                        k();
                                        Log.i("GLThread", "releasing EGL context because paused tid=" + getId());
                                    }
                                    if (z9 && GLTextureView.f9362a.c()) {
                                        gVar.f9413r.e();
                                        Log.i("GLThread", "terminating EGL because paused tid=" + getId());
                                    }
                                    if (!gVar.f9400e && !gVar.f9402g) {
                                        Log.i("GLThread", "noticed surfaceView surface lost tid=" + getId());
                                        if (gVar.f9404i) {
                                            l();
                                        }
                                        gVar.f9402g = true;
                                        gVar.f9401f = false;
                                        com.baidu.platform.b.a.f8644a.notifyAll();
                                    }
                                    if (gVar.f9400e && gVar.f9402g) {
                                        Log.i("GLThread", "noticed surfaceView surface acquired tid=" + getId());
                                        gVar.f9402g = false;
                                        com.baidu.platform.b.a.f8644a.notifyAll();
                                    }
                                    if (z19) {
                                        Log.i("GLThread", "sending render notification tid=" + getId());
                                        gVar.f9410o = true;
                                        com.baidu.platform.b.a.f8644a.notifyAll();
                                        z18 = false;
                                        z19 = false;
                                    }
                                    if (g()) {
                                        if (!gVar.f9403h) {
                                            if (z20) {
                                                z14 = z8;
                                                z20 = false;
                                            } else if (GLTextureView.f9362a.c(gVar)) {
                                                try {
                                                    gVar.f9413r.f();
                                                    gVar.f9403h = true;
                                                    com.baidu.platform.b.a.f8644a.notifyAll();
                                                    z14 = true;
                                                } catch (RuntimeException e8) {
                                                    GLTextureView.f9362a.a(gVar);
                                                    throw e8;
                                                }
                                            }
                                            if (gVar.f9403h && !gVar.f9404i) {
                                                gVar.f9404i = true;
                                                z15 = true;
                                                z16 = true;
                                                z17 = true;
                                            }
                                            if (gVar.f9404i) {
                                                z10 = z13;
                                            } else {
                                                if (gVar.f9412q) {
                                                    i9 = gVar.f9406k;
                                                    i10 = gVar.f9407l;
                                                    StringBuilder sb2 = new StringBuilder();
                                                    sb2.append("noticing that we want render notification tid=");
                                                    z11 = z13;
                                                    sb2.append(getId());
                                                    Log.i("GLThread", sb2.toString());
                                                    gVar.f9412q = false;
                                                    z12 = false;
                                                    z15 = true;
                                                    z17 = true;
                                                    z18 = true;
                                                } else {
                                                    z11 = z13;
                                                    z12 = false;
                                                }
                                                gVar.f9409n = z12;
                                                com.baidu.platform.b.a.f8644a.notifyAll();
                                                z13 = z11;
                                            }
                                        }
                                        z14 = z8;
                                        if (gVar.f9403h) {
                                            gVar.f9404i = true;
                                            z15 = true;
                                            z16 = true;
                                            z17 = true;
                                        }
                                        if (gVar.f9404i) {
                                        }
                                    } else {
                                        z10 = z13;
                                        z14 = z8;
                                    }
                                    com.baidu.platform.b.a.f8644a.wait();
                                    gVar = this;
                                    z13 = z10;
                                    gl104 = gl10;
                                } else {
                                    runnable = gVar.f9411p.remove(0);
                                    gl10 = gl104;
                                }
                            }
                            synchronized (com.baidu.platform.b.a.f8644a) {
                                l();
                                k();
                            }
                            return;
                        }
                        if (runnable != null) {
                            break;
                        }
                        if (z15) {
                            Log.w("GLThread", "egl createSurface");
                            if (gVar.f9413r.b()) {
                                z15 = false;
                            } else {
                                Object obj = com.baidu.platform.b.a.f8644a;
                                synchronized (obj) {
                                    gVar.f9401f = true;
                                    obj.notifyAll();
                                }
                                gl104 = gl10;
                            }
                        }
                        if (z16) {
                            GL10 gl105 = (GL10) gVar.f9413r.a();
                            GLTextureView.f9362a.a(gl105);
                            gl102 = gl105;
                            z16 = false;
                        } else {
                            gl102 = gl10;
                        }
                        if (z14) {
                            Log.w("GLThread", "onSurfaceCreated");
                            GLTextureView gLTextureView2 = gVar.f9414s.get();
                            if (gLTextureView2 != null) {
                                z7 = z13;
                                gLTextureView2.f9367f.onSurfaceCreated(null, gLTextureView2.getWidth(), gLTextureView2.getHeight(), 0);
                            } else {
                                z7 = z13;
                            }
                            z14 = false;
                        } else {
                            z7 = z13;
                        }
                        if (z17) {
                            Log.w("GLThread", "onSurfaceChanged(" + i9 + ", " + i10 + ")");
                            GLTextureView gLTextureView3 = gVar.f9414s.get();
                            if (gLTextureView3 != null) {
                                gLTextureView3.f9367f.onSurfaceChanged(i9, i10);
                            }
                            z17 = false;
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        GLTextureView gLTextureView4 = gVar.f9414s.get();
                        if (gLTextureView4 != null) {
                            gLTextureView4.f9367f.onDrawFrame(gl102);
                            i8 = gLTextureView4.getFPS();
                        } else {
                            i8 = 60;
                        }
                        int g8 = gVar.f9413r.g();
                        if (g8 != 12288) {
                            if (g8 != 12302) {
                                f.a("GLThread", "eglSwapBuffers", g8);
                                Object obj2 = com.baidu.platform.b.a.f8644a;
                                synchronized (obj2) {
                                    gVar.f9401f = true;
                                    obj2.notifyAll();
                                }
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("egl context lost tid=");
                                gl103 = gl102;
                                sb3.append(getId());
                                Log.i("GLThread", sb3.toString());
                                z13 = true;
                                if (z18) {
                                    z19 = true;
                                }
                                currentTimeMillis = System.currentTimeMillis();
                                if (i8 < 60 && i8 > 0) {
                                    j8 = (1000 / i8) - (currentTimeMillis - currentTimeMillis2);
                                    if (j8 > 1) {
                                        Object obj3 = com.baidu.platform.b.a.f8644a;
                                        synchronized (obj3) {
                                            obj3.wait(j8);
                                        }
                                    }
                                }
                                gVar = this;
                                gl104 = gl103;
                            }
                        }
                        gl103 = gl102;
                        z13 = z7;
                        if (z18) {
                        }
                        currentTimeMillis = System.currentTimeMillis();
                        if (i8 < 60) {
                            j8 = (1000 / i8) - (currentTimeMillis - currentTimeMillis2);
                            if (j8 > 1) {
                            }
                        }
                        gVar = this;
                        gl104 = gl103;
                    } catch (Throwable th) {
                        synchronized (com.baidu.platform.b.a.f8644a) {
                            l();
                            k();
                            throw th;
                        }
                    }
                }
                runnable.run();
                gl104 = gl10;
            }
        }

        private boolean g() {
            return !this.f9399d && this.f9400e && !this.f9401f && this.f9406k > 0 && this.f9407l > 0 && (this.f9409n || this.f9408m == 1);
        }

        private void k() {
            if (this.f9403h) {
                this.f9413r.e();
                this.f9403h = false;
                GLTextureView.f9362a.a(this);
            }
        }

        private void l() {
            if (this.f9404i) {
                this.f9404i = false;
                this.f9413r.c();
            }
        }

        public boolean b() {
            return this.f9403h && this.f9404i && g();
        }

        public int c() {
            int i8;
            synchronized (com.baidu.platform.b.a.f8644a) {
                i8 = this.f9408m;
            }
            return i8;
        }

        public void e() {
            Object obj = com.baidu.platform.b.a.f8644a;
            synchronized (obj) {
                Log.i("GLThread", "onPause tid=" + getId());
                this.f9398c = true;
                obj.notifyAll();
                while (!this.f9397b && !this.f9399d) {
                    Log.i("Main thread", "onPause waiting for mPaused.");
                    try {
                        com.baidu.platform.b.a.f8644a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void f() {
            Object obj = com.baidu.platform.b.a.f8644a;
            synchronized (obj) {
                Log.i("GLThread", "onResume tid=" + getId());
                this.f9398c = false;
                this.f9409n = true;
                this.f9410o = false;
                obj.notifyAll();
                while (!this.f9397b && this.f9399d && !this.f9410o) {
                    Log.i("Main thread", "onResume waiting for !mPaused.");
                    try {
                        com.baidu.platform.b.a.f8644a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void h() {
            Object obj = com.baidu.platform.b.a.f8644a;
            synchronized (obj) {
                this.f9396a = true;
                obj.notifyAll();
                while (!this.f9397b) {
                    try {
                        com.baidu.platform.b.a.f8644a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void i() {
            this.f9405j = true;
            com.baidu.platform.b.a.f8644a.notifyAll();
        }

        public void j() {
            Object obj = com.baidu.platform.b.a.f8644a;
            synchronized (obj) {
                this.f9409n = true;
                obj.notifyAll();
            }
        }

        public void m() {
            Object obj = com.baidu.platform.b.a.f8644a;
            synchronized (obj) {
                this.f9400e = true;
                obj.notifyAll();
                while (this.f9402g && !this.f9397b) {
                    try {
                        com.baidu.platform.b.a.f8644a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void n() {
            Object obj = com.baidu.platform.b.a.f8644a;
            synchronized (obj) {
                this.f9400e = false;
                obj.notifyAll();
                while (!this.f9402g && !this.f9397b) {
                    try {
                        com.baidu.platform.b.a.f8644a.wait();
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
                GLTextureView.f9362a.b(this);
                throw th;
            }
            GLTextureView.f9362a.b(this);
        }

        public void a(int i8) {
            if (i8 < 0 || i8 > 1) {
                throw new IllegalArgumentException("renderMode");
            }
            Object obj = com.baidu.platform.b.a.f8644a;
            synchronized (obj) {
                this.f9408m = i8;
                obj.notifyAll();
            }
        }

        public void a(int i8, int i9) {
            Object obj = com.baidu.platform.b.a.f8644a;
            synchronized (obj) {
                this.f9406k = i8;
                this.f9407l = i9;
                this.f9412q = true;
                this.f9409n = true;
                this.f9410o = false;
                obj.notifyAll();
                while (!this.f9397b && !this.f9399d && !this.f9410o && b()) {
                    Log.i("Main thread", "onWindowResize waiting for render complete from tid=" + getId());
                    try {
                        com.baidu.platform.b.a.f8644a.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }

        public void a(Runnable runnable) {
            if (runnable != null) {
                Object obj = com.baidu.platform.b.a.f8644a;
                synchronized (obj) {
                    this.f9411p.add(runnable);
                    obj.notifyAll();
                }
                return;
            }
            throw new IllegalArgumentException("r must not be null");
        }
    }

    private static class h {

        /* renamed from: a, reason: collision with root package name */
        private static String f9415a = "GLThreadManager";

        /* renamed from: b, reason: collision with root package name */
        private static final Class f9416b;

        /* renamed from: c, reason: collision with root package name */
        private static final Method f9417c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f9418d;

        /* renamed from: e, reason: collision with root package name */
        private int f9419e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f9420f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f9421g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f9422h;

        /* renamed from: i, reason: collision with root package name */
        private g f9423i;

        static {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                f9416b = cls;
                Method declaredMethod = cls.getDeclaredMethod("getInt", String.class, Integer.TYPE);
                f9417c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception e8) {
                throw new RuntimeException(e8);
            }
        }

        private h() {
        }

        public void a(g gVar) {
            if (this.f9423i == gVar) {
                this.f9423i = null;
            }
            com.baidu.platform.b.a.f8644a.notifyAll();
        }

        public void b(g gVar) {
            Object obj = com.baidu.platform.b.a.f8644a;
            synchronized (obj) {
                try {
                    gVar.f9397b = true;
                    if (this.f9423i == gVar) {
                        this.f9423i = null;
                    }
                    obj.notifyAll();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean c(g gVar) {
            g gVar2 = this.f9423i;
            if (gVar2 == gVar || gVar2 == null) {
                this.f9423i = gVar;
                com.baidu.platform.b.a.f8644a.notifyAll();
                return true;
            }
            a();
            if (this.f9421g) {
                return true;
            }
            g gVar3 = this.f9423i;
            if (gVar3 == null) {
                return false;
            }
            gVar3.i();
            return false;
        }

        /* synthetic */ h(a aVar) {
            this();
        }

        public void a(GL10 gl10) {
            Object obj = com.baidu.platform.b.a.f8644a;
            synchronized (obj) {
                try {
                    if (!this.f9420f) {
                        a();
                        String glGetString = gl10.glGetString(7937);
                        if (this.f9419e < 131072) {
                            this.f9421g = !glGetString.startsWith("Q3Dimension MSM7500 ");
                            obj.notifyAll();
                        }
                        this.f9422h = !this.f9421g;
                        Log.w(f9415a, "checkGLDriver renderer = \"" + glGetString + "\" multipleContextsAllowed = " + this.f9421g + " mLimitedGLESContexts = " + this.f9422h);
                        this.f9420f = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean c() {
            boolean z7;
            synchronized (com.baidu.platform.b.a.f8644a) {
                a();
                z7 = !this.f9421g;
            }
            return z7;
        }

        public boolean b() {
            boolean z7;
            synchronized (com.baidu.platform.b.a.f8644a) {
                z7 = this.f9422h;
            }
            return z7;
        }

        private void a() {
            if (this.f9418d) {
                return;
            }
            try {
                this.f9419e = ((Integer) f9417c.invoke(null, "ro.opengles.version", 0)).intValue();
            } catch (Exception unused) {
                this.f9419e = 65536;
            }
            if (this.f9419e >= 131072) {
                this.f9421g = true;
            }
            Log.w(f9415a, "checkGLESVersion mGLESVersion = " + this.f9419e + " mMultipleGLESContextsAllowed = " + this.f9421g);
            this.f9418d = true;
        }
    }

    static class i extends Writer {

        /* renamed from: a, reason: collision with root package name */
        private StringBuilder f9424a = new StringBuilder();

        i() {
        }

        private void a() {
            if (this.f9424a.length() > 0) {
                StringBuilder sb = this.f9424a;
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
                    this.f9424a.append(c8);
                }
            }
        }
    }

    private class j extends c {
        public j(boolean z7) {
            super(8, 8, 8, 0, z7 ? 16 : 0, 0);
        }
    }

    public GLTextureView(Context context) {
        super(context);
        this.f9363b = 60;
        this.f9364c = new a();
        this.f9365d = new WeakReference<>(this);
        c();
    }

    public Bitmap captureImageFromSurface(int i8, int i9, int i10, int i11, Object obj, Bitmap.Config config) {
        return a(i8, i9, i10, i11, (GL10) obj, config);
    }

    protected void finalize() {
        try {
            g gVar = this.f9366e;
            if (gVar != null) {
                gVar.h();
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.f9373l;
    }

    public int getFPS() {
        return this.f9363b;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f9375n;
    }

    public int getRenderMode() {
        return this.f9366e.c();
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.d("GLTextureView", "onAttachedToWindow reattach =" + this.f9368g);
        if (this.f9368g && this.f9367f != null) {
            g gVar = this.f9366e;
            int c8 = gVar != null ? gVar.c() : 1;
            g gVar2 = new g(this.f9365d);
            this.f9366e = gVar2;
            if (c8 != 1) {
                gVar2.a(c8);
            }
            this.f9366e.start();
        }
        this.f9368g = false;
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        Log.d("GLTextureView", "onDetachedFromWindow");
        g gVar = this.f9366e;
        if (gVar != null) {
            gVar.h();
        }
        this.f9368g = true;
        super.onDetachedFromWindow();
    }

    public void onPause() {
        g gVar = this.f9366e;
        if (gVar != null) {
            gVar.e();
        }
    }

    public void onResume() {
        g gVar = this.f9366e;
        if (gVar != null) {
            gVar.f();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i8, int i9) {
        surfaceCreated(surfaceTexture);
        surfaceChanged(surfaceTexture, 0, i8, i9);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceDestroyed(surfaceTexture);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i8, int i9) {
        surfaceChanged(surfaceTexture, 0, i8, i9);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void queueEvent(Runnable runnable) {
        g gVar = this.f9366e;
        if (gVar != null) {
            gVar.a(runnable);
        }
    }

    public void requestRender() {
        g gVar = this.f9366e;
        if (gVar != null) {
            gVar.j();
        }
    }

    public void setDebugFlags(int i8) {
        this.f9373l = i8;
    }

    public void setEGLConfigChooser(GLSurfaceView.EGLConfigChooser eGLConfigChooser) {
        b();
        this.f9369h = eGLConfigChooser;
    }

    public void setEGLContextClientVersion(int i8) {
        b();
        this.f9374m = i8;
    }

    public void setEGLContextFactory(GLSurfaceView.EGLContextFactory eGLContextFactory) {
        b();
        this.f9370i = eGLContextFactory;
    }

    public void setEGLWindowSurfaceFactory(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        b();
        this.f9371j = eGLWindowSurfaceFactory;
    }

    public void setFPS(int i8) {
        this.f9363b = i8;
    }

    public void setGLWrapper(GLSurfaceView.GLWrapper gLWrapper) {
        this.f9372k = gLWrapper;
    }

    public void setPreserveEGLContextOnPause(boolean z7) {
        this.f9375n = z7;
    }

    public void setRenderMode(int i8) {
        this.f9366e.a(i8);
    }

    public void setRenderer(SurfaceRenderer surfaceRenderer) {
        b();
        if (this.f9369h == null) {
            try {
                if (EglConfigUtils.isSupportConfig(8, 8, 8, 0, 24, 8, 0, 0)) {
                    setEGLConfigChooser(8, 8, 8, 0, 24, 8);
                } else {
                    setEGLConfigChooser(true);
                }
            } catch (IllegalArgumentException unused) {
                setEGLConfigChooser(true);
            }
        }
        a aVar = null;
        if (this.f9370i == null) {
            this.f9370i = new d(this, aVar);
        }
        if (this.f9371j == null) {
            this.f9371j = new e(aVar);
        }
        this.f9367f = surfaceRenderer;
        g gVar = new g(this.f9365d);
        this.f9366e = gVar;
        gVar.start();
    }

    public void surfaceChanged(SurfaceTexture surfaceTexture, int i8, int i9, int i10) {
        g gVar = this.f9366e;
        if (gVar != null) {
            gVar.a(i9, i10);
        }
    }

    public void surfaceCreated(SurfaceTexture surfaceTexture) {
        g gVar = this.f9366e;
        if (gVar != null) {
            gVar.m();
        }
    }

    public void surfaceDestroyed(SurfaceTexture surfaceTexture) {
        g gVar = this.f9366e;
        if (gVar != null) {
            gVar.n();
        }
    }

    private void b() {
        if (this.f9366e != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    private void c() {
        setSurfaceTextureListener(this);
        addOnLayoutChangeListener(this.f9364c);
    }

    public void setEGLConfigChooser(boolean z7) {
        setEGLConfigChooser(new j(z7));
    }

    private Bitmap a(int i8, int i9, int i10, int i11, GL10 gl10, Bitmap.Config config) {
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
                return Bitmap.createBitmap(iArr2, i10, i11, Bitmap.Config.ARGB_8888);
            }
            return Bitmap.createBitmap(iArr2, i10, i11, config);
        } catch (GLException unused) {
            return null;
        } catch (OutOfMemoryError e8) {
            Log.e("OutOfMemoryError", " createBitmap cause OutOfMemoryError : " + e8.getMessage());
            return null;
        }
    }

    public void setEGLConfigChooser(int i8, int i9, int i10, int i11, int i12, int i13) {
        setEGLConfigChooser(new c(i8, i9, i10, i11, i12, i13));
    }

    public void setEGLConfigChooser(int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        setEGLConfigChooser(new c(i8, i9, i10, i11, i12, i13, i14));
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9363b = 60;
        this.f9364c = new a();
        this.f9365d = new WeakReference<>(this);
        c();
    }

    public GLTextureView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f9363b = 60;
        this.f9364c = new a();
        this.f9365d = new WeakReference<>(this);
        c();
    }
}
