package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@TargetApi(14)
/* loaded from: classes.dex */
public final class rq0 extends Thread implements SurfaceTexture.OnFrameAvailableListener, pq0 {
    private static final float[] G = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private EGL10 A;
    private EGLDisplay B;
    private EGLContext C;
    private EGLSurface D;
    private volatile boolean E;
    private volatile boolean F;

    /* renamed from: f, reason: collision with root package name */
    private final qq0 f11324f;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f11325g;

    /* renamed from: h, reason: collision with root package name */
    private final float[] f11326h;

    /* renamed from: i, reason: collision with root package name */
    private final float[] f11327i;

    /* renamed from: j, reason: collision with root package name */
    private final float[] f11328j;

    /* renamed from: k, reason: collision with root package name */
    private final float[] f11329k;

    /* renamed from: l, reason: collision with root package name */
    private final float[] f11330l;

    /* renamed from: m, reason: collision with root package name */
    private final float[] f11331m;

    /* renamed from: n, reason: collision with root package name */
    private float f11332n;

    /* renamed from: o, reason: collision with root package name */
    private float f11333o;

    /* renamed from: p, reason: collision with root package name */
    private float f11334p;

    /* renamed from: q, reason: collision with root package name */
    private int f11335q;

    /* renamed from: r, reason: collision with root package name */
    private int f11336r;

    /* renamed from: s, reason: collision with root package name */
    private SurfaceTexture f11337s;

    /* renamed from: t, reason: collision with root package name */
    private SurfaceTexture f11338t;

    /* renamed from: u, reason: collision with root package name */
    private int f11339u;

    /* renamed from: v, reason: collision with root package name */
    private int f11340v;

    /* renamed from: w, reason: collision with root package name */
    private int f11341w;

    /* renamed from: x, reason: collision with root package name */
    private final FloatBuffer f11342x;

    /* renamed from: y, reason: collision with root package name */
    private final CountDownLatch f11343y;

    /* renamed from: z, reason: collision with root package name */
    private final Object f11344z;

    public rq0(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = G;
        int length = fArr.length;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f11342x = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        this.f11325g = new float[9];
        this.f11326h = new float[9];
        this.f11327i = new float[9];
        this.f11328j = new float[9];
        this.f11329k = new float[9];
        this.f11330l = new float[9];
        this.f11331m = new float[9];
        this.f11332n = Float.NaN;
        qq0 qq0Var = new qq0(context);
        this.f11324f = qq0Var;
        qq0Var.a(this);
        this.f11343y = new CountDownLatch(1);
        this.f11344z = new Object();
    }

    private static final void g(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder(str.length() + 21);
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    private static final void h(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    private static final void i(float[] fArr, float f7) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d7 = f7;
        fArr[4] = (float) Math.cos(d7);
        fArr[5] = (float) (-Math.sin(d7));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d7);
        fArr[8] = (float) Math.cos(d7);
    }

    private static final void j(float[] fArr, float f7) {
        double d7 = f7;
        fArr[0] = (float) Math.cos(d7);
        fArr[1] = (float) (-Math.sin(d7));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d7);
        fArr[4] = (float) Math.cos(d7);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static final int k(int i7, String str) {
        int glCreateShader = GLES20.glCreateShader(i7);
        g("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            g("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            g("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            g("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Could not compile shader ");
                sb.append(i7);
                sb.append(":");
                Log.e("SphericalVideoRenderer", sb.toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                g("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    public final SurfaceTexture a() {
        if (this.f11338t == null) {
            return null;
        }
        try {
            this.f11343y.await();
        } catch (InterruptedException unused) {
        }
        return this.f11337s;
    }

    public final void b(int i7, int i8) {
        synchronized (this.f11344z) {
            this.f11336r = i7;
            this.f11335q = i8;
            this.E = true;
            this.f11344z.notifyAll();
        }
    }

    public final void c(SurfaceTexture surfaceTexture, int i7, int i8) {
        this.f11336r = i7;
        this.f11335q = i8;
        this.f11338t = surfaceTexture;
    }

    public final void d() {
        synchronized (this.f11344z) {
            this.F = true;
            this.f11338t = null;
            this.f11344z.notifyAll();
        }
    }

    public final void e(float f7, float f8) {
        int i7 = this.f11336r;
        int i8 = this.f11335q;
        float f9 = i7 > i8 ? i7 : i8;
        this.f11333o -= (f7 * 1.7453293f) / f9;
        float f10 = this.f11334p - ((f8 * 1.7453293f) / f9);
        this.f11334p = f10;
        if (f10 < -1.5707964f) {
            this.f11334p = -1.5707964f;
            f10 = -1.5707964f;
        }
        if (f10 > 1.5707964f) {
            this.f11334p = 1.5707964f;
        }
    }

    final boolean f() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.D;
        boolean z6 = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            z6 = this.A.eglDestroySurface(this.B, this.D) | this.A.eglMakeCurrent(this.B, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.D = null;
        }
        EGLContext eGLContext = this.C;
        if (eGLContext != null) {
            z6 |= this.A.eglDestroyContext(this.B, eGLContext);
            this.C = null;
        }
        EGLDisplay eGLDisplay = this.B;
        if (eGLDisplay == null) {
            return z6;
        }
        boolean eglTerminate = this.A.eglTerminate(eGLDisplay);
        this.B = null;
        return eglTerminate | z6;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f11341w++;
        synchronized (this.f11344z) {
            this.f11344z.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00a8  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z6;
        int k7;
        int glCreateProgram;
        if (this.f11338t == null) {
            io0.d("SphericalVideoProcessor started with no output texture.");
            this.f11343y.countDown();
            return;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.A = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.B = eglGetDisplay;
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY && this.A.eglInitialize(eglGetDisplay, new int[2])) {
            int[] iArr = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            EGLConfig eGLConfig = (this.A.eglChooseConfig(this.B, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) && iArr[0] > 0) ? eGLConfigArr[0] : null;
            if (eGLConfig != null) {
                EGLContext eglCreateContext = this.A.eglCreateContext(this.B, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
                this.C = eglCreateContext;
                if (eglCreateContext != null && eglCreateContext != EGL10.EGL_NO_CONTEXT) {
                    EGLSurface eglCreateWindowSurface = this.A.eglCreateWindowSurface(this.B, eGLConfig, this.f11338t, null);
                    this.D = eglCreateWindowSurface;
                    if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE && this.A.eglMakeCurrent(this.B, eglCreateWindowSurface, eglCreateWindowSurface, this.C)) {
                        z6 = true;
                        e10<String> e10Var = m10.U0;
                        k7 = k(35633, ((String) sw.c().b(e10Var)).equals(e10Var.l()) ? (String) sw.c().b(e10Var) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
                        if (k7 != 0) {
                            e10<String> e10Var2 = m10.V0;
                            int k8 = k(35632, !((String) sw.c().b(e10Var2)).equals(e10Var2.l()) ? (String) sw.c().b(e10Var2) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}");
                            if (k8 != 0) {
                                glCreateProgram = GLES20.glCreateProgram();
                                g("createProgram");
                                if (glCreateProgram != 0) {
                                    GLES20.glAttachShader(glCreateProgram, k7);
                                    g("attachShader");
                                    GLES20.glAttachShader(glCreateProgram, k8);
                                    g("attachShader");
                                    GLES20.glLinkProgram(glCreateProgram);
                                    g("linkProgram");
                                    int[] iArr2 = new int[1];
                                    GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
                                    g("getProgramiv");
                                    if (iArr2[0] != 1) {
                                        Log.e("SphericalVideoRenderer", "Could not link program: ");
                                        Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(glCreateProgram));
                                        GLES20.glDeleteProgram(glCreateProgram);
                                        g("deleteProgram");
                                    } else {
                                        GLES20.glValidateProgram(glCreateProgram);
                                        g("validateProgram");
                                    }
                                }
                                this.f11339u = glCreateProgram;
                                GLES20.glUseProgram(glCreateProgram);
                                g("useProgram");
                                int glGetAttribLocation = GLES20.glGetAttribLocation(this.f11339u, "aPosition");
                                GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, 12, (Buffer) this.f11342x);
                                g("vertexAttribPointer");
                                GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                                g("enableVertexAttribArray");
                                int[] iArr3 = new int[1];
                                GLES20.glGenTextures(1, iArr3, 0);
                                g("genTextures");
                                int i7 = iArr3[0];
                                GLES20.glBindTexture(36197, i7);
                                g("bindTextures");
                                GLES20.glTexParameteri(36197, 10240, 9729);
                                g("texParameteri");
                                GLES20.glTexParameteri(36197, 10241, 9729);
                                g("texParameteri");
                                GLES20.glTexParameteri(36197, 10242, 33071);
                                g("texParameteri");
                                GLES20.glTexParameteri(36197, 10243, 33071);
                                g("texParameteri");
                                int glGetUniformLocation = GLES20.glGetUniformLocation(this.f11339u, "uVMat");
                                this.f11340v = glGetUniformLocation;
                                GLES20.glUniformMatrix3fv(glGetUniformLocation, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                                int i8 = this.f11339u;
                                if (z6 || i8 == 0) {
                                    String valueOf = String.valueOf(GLUtils.getEGLErrorString(this.A.eglGetError()));
                                    String concat = valueOf.length() != 0 ? "EGL initialization failed: ".concat(valueOf) : new String("EGL initialization failed: ");
                                    io0.d(concat);
                                    y2.t.p().s(new Throwable(concat), "SphericalVideoProcessor.run.1");
                                    f();
                                    this.f11343y.countDown();
                                }
                                SurfaceTexture surfaceTexture = new SurfaceTexture(i7);
                                this.f11337s = surfaceTexture;
                                surfaceTexture.setOnFrameAvailableListener(this);
                                this.f11343y.countDown();
                                this.f11324f.b();
                                try {
                                    try {
                                        this.E = true;
                                        while (!this.F) {
                                            while (this.f11341w > 0) {
                                                this.f11337s.updateTexImage();
                                                this.f11341w--;
                                            }
                                            if (this.f11324f.d(this.f11325g)) {
                                                if (Float.isNaN(this.f11332n)) {
                                                    float[] fArr = this.f11325g;
                                                    float[] fArr2 = {0.0f, 1.0f, 0.0f};
                                                    float f7 = fArr[0];
                                                    float f8 = fArr2[0];
                                                    float f9 = fArr[1];
                                                    float f10 = fArr2[1];
                                                    float f11 = (f7 * f8) + (f9 * f10);
                                                    float f12 = fArr[2];
                                                    float f13 = fArr2[2];
                                                    float[] fArr3 = {f11 + (f12 * f13), (fArr[3] * f8) + (fArr[4] * f10) + (fArr[5] * f13), (fArr[6] * f8) + (fArr[7] * f10) + (fArr[8] * f13)};
                                                    this.f11332n = -(((float) Math.atan2(fArr3[1], fArr3[0])) - 1.5707964f);
                                                }
                                                j(this.f11330l, this.f11332n + this.f11333o);
                                            } else {
                                                i(this.f11325g, -1.5707964f);
                                                j(this.f11330l, this.f11333o);
                                            }
                                            i(this.f11326h, 1.5707964f);
                                            h(this.f11327i, this.f11330l, this.f11326h);
                                            h(this.f11328j, this.f11325g, this.f11327i);
                                            i(this.f11329k, this.f11334p);
                                            h(this.f11331m, this.f11329k, this.f11328j);
                                            GLES20.glUniformMatrix3fv(this.f11340v, 1, false, this.f11331m, 0);
                                            GLES20.glDrawArrays(5, 0, 4);
                                            g("drawArrays");
                                            GLES20.glFinish();
                                            this.A.eglSwapBuffers(this.B, this.D);
                                            if (this.E) {
                                                GLES20.glViewport(0, 0, this.f11336r, this.f11335q);
                                                g("viewport");
                                                int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.f11339u, "uFOVx");
                                                int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.f11339u, "uFOVy");
                                                int i9 = this.f11336r;
                                                int i10 = this.f11335q;
                                                if (i9 > i10) {
                                                    GLES20.glUniform1f(glGetUniformLocation2, 0.87266463f);
                                                    GLES20.glUniform1f(glGetUniformLocation3, (this.f11335q * 0.87266463f) / this.f11336r);
                                                } else {
                                                    GLES20.glUniform1f(glGetUniformLocation2, (i9 * 0.87266463f) / i10);
                                                    GLES20.glUniform1f(glGetUniformLocation3, 0.87266463f);
                                                }
                                                this.E = false;
                                            }
                                            try {
                                                synchronized (this.f11344z) {
                                                    if (!this.F && !this.E && this.f11341w == 0) {
                                                        this.f11344z.wait();
                                                    }
                                                }
                                            } catch (InterruptedException unused) {
                                            }
                                        }
                                        return;
                                    } finally {
                                        this.f11324f.c();
                                        this.f11337s.setOnFrameAvailableListener(null);
                                        this.f11337s = null;
                                        f();
                                    }
                                } catch (IllegalStateException unused2) {
                                    io0.g("SphericalVideoProcessor halted unexpectedly.");
                                    return;
                                } catch (Throwable th) {
                                    io0.e("SphericalVideoProcessor died.", th);
                                    y2.t.p().s(th, "SphericalVideoProcessor.run.2");
                                    return;
                                }
                            }
                        }
                        glCreateProgram = 0;
                        this.f11339u = glCreateProgram;
                        GLES20.glUseProgram(glCreateProgram);
                        g("useProgram");
                        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f11339u, "aPosition");
                        GLES20.glVertexAttribPointer(glGetAttribLocation2, 3, 5126, false, 12, (Buffer) this.f11342x);
                        g("vertexAttribPointer");
                        GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                        g("enableVertexAttribArray");
                        int[] iArr32 = new int[1];
                        GLES20.glGenTextures(1, iArr32, 0);
                        g("genTextures");
                        int i72 = iArr32[0];
                        GLES20.glBindTexture(36197, i72);
                        g("bindTextures");
                        GLES20.glTexParameteri(36197, 10240, 9729);
                        g("texParameteri");
                        GLES20.glTexParameteri(36197, 10241, 9729);
                        g("texParameteri");
                        GLES20.glTexParameteri(36197, 10242, 33071);
                        g("texParameteri");
                        GLES20.glTexParameteri(36197, 10243, 33071);
                        g("texParameteri");
                        int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.f11339u, "uVMat");
                        this.f11340v = glGetUniformLocation4;
                        GLES20.glUniformMatrix3fv(glGetUniformLocation4, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                        int i82 = this.f11339u;
                        if (z6) {
                        }
                        String valueOf2 = String.valueOf(GLUtils.getEGLErrorString(this.A.eglGetError()));
                        if (valueOf2.length() != 0) {
                        }
                        io0.d(concat);
                        y2.t.p().s(new Throwable(concat), "SphericalVideoProcessor.run.1");
                        f();
                        this.f11343y.countDown();
                    }
                }
            }
        }
        z6 = false;
        e10<String> e10Var3 = m10.U0;
        k7 = k(35633, ((String) sw.c().b(e10Var3)).equals(e10Var3.l()) ? (String) sw.c().b(e10Var3) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
        if (k7 != 0) {
        }
        glCreateProgram = 0;
        this.f11339u = glCreateProgram;
        GLES20.glUseProgram(glCreateProgram);
        g("useProgram");
        int glGetAttribLocation22 = GLES20.glGetAttribLocation(this.f11339u, "aPosition");
        GLES20.glVertexAttribPointer(glGetAttribLocation22, 3, 5126, false, 12, (Buffer) this.f11342x);
        g("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation22);
        g("enableVertexAttribArray");
        int[] iArr322 = new int[1];
        GLES20.glGenTextures(1, iArr322, 0);
        g("genTextures");
        int i722 = iArr322[0];
        GLES20.glBindTexture(36197, i722);
        g("bindTextures");
        GLES20.glTexParameteri(36197, 10240, 9729);
        g("texParameteri");
        GLES20.glTexParameteri(36197, 10241, 9729);
        g("texParameteri");
        GLES20.glTexParameteri(36197, 10242, 33071);
        g("texParameteri");
        GLES20.glTexParameteri(36197, 10243, 33071);
        g("texParameteri");
        int glGetUniformLocation42 = GLES20.glGetUniformLocation(this.f11339u, "uVMat");
        this.f11340v = glGetUniformLocation42;
        GLES20.glUniformMatrix3fv(glGetUniformLocation42, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
        int i822 = this.f11339u;
        if (z6) {
        }
        String valueOf22 = String.valueOf(GLUtils.getEGLErrorString(this.A.eglGetError()));
        if (valueOf22.length() != 0) {
        }
        io0.d(concat);
        y2.t.p().s(new Throwable(concat), "SphericalVideoProcessor.run.1");
        f();
        this.f11343y.countDown();
    }

    @Override // com.google.android.gms.internal.ads.pq0
    public final void zza() {
        synchronized (this.f11344z) {
            this.f11344z.notifyAll();
        }
    }
}
