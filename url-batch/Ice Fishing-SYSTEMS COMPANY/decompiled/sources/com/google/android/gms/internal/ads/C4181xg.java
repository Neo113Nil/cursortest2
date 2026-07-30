package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.HandlerThread;
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

/* renamed from: com.google.android.gms.internal.ads.xg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4181xg extends Thread implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: U, reason: collision with root package name */
    public static final float[] f35194U = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: A, reason: collision with root package name */
    public final float[] f35195A;

    /* renamed from: B, reason: collision with root package name */
    public float f35196B;

    /* renamed from: C, reason: collision with root package name */
    public float f35197C;

    /* renamed from: D, reason: collision with root package name */
    public float f35198D;

    /* renamed from: E, reason: collision with root package name */
    public int f35199E;

    /* renamed from: F, reason: collision with root package name */
    public int f35200F;

    /* renamed from: G, reason: collision with root package name */
    public SurfaceTexture f35201G;

    /* renamed from: H, reason: collision with root package name */
    public SurfaceTexture f35202H;

    /* renamed from: I, reason: collision with root package name */
    public int f35203I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public int f35204K;

    /* renamed from: L, reason: collision with root package name */
    public final FloatBuffer f35205L;

    /* renamed from: M, reason: collision with root package name */
    public final CountDownLatch f35206M;

    /* renamed from: N, reason: collision with root package name */
    public final Object f35207N;

    /* renamed from: O, reason: collision with root package name */
    public EGL10 f35208O;

    /* renamed from: P, reason: collision with root package name */
    public EGLDisplay f35209P;

    /* renamed from: Q, reason: collision with root package name */
    public EGLContext f35210Q;

    /* renamed from: R, reason: collision with root package name */
    public EGLSurface f35211R;

    /* renamed from: S, reason: collision with root package name */
    public volatile boolean f35212S;

    /* renamed from: T, reason: collision with root package name */
    public volatile boolean f35213T;

    /* renamed from: n, reason: collision with root package name */
    public final C4127wg f35214n;

    /* renamed from: u, reason: collision with root package name */
    public final float[] f35215u;

    /* renamed from: v, reason: collision with root package name */
    public final float[] f35216v;

    /* renamed from: w, reason: collision with root package name */
    public final float[] f35217w;

    /* renamed from: x, reason: collision with root package name */
    public final float[] f35218x;

    /* renamed from: y, reason: collision with root package name */
    public final float[] f35219y;

    /* renamed from: z, reason: collision with root package name */
    public final float[] f35220z;

    public C4181xg(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = f35194U;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f35205L = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        this.f35215u = new float[9];
        this.f35216v = new float[9];
        this.f35217w = new float[9];
        this.f35218x = new float[9];
        this.f35219y = new float[9];
        this.f35220z = new float[9];
        this.f35195A = new float[9];
        this.f35196B = Float.NaN;
        C4127wg c4127wg = new C4127wg(context);
        this.f35214n = c4127wg;
        c4127wg.f35022h = this;
        this.f35206M = new CountDownLatch(1);
        this.f35207N = new Object();
    }

    public static final void e(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder(str.length() + 10 + String.valueOf(glGetError).length());
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    public static final void f(float[] fArr, float[] fArr2, float[] fArr3) {
        float f6 = fArr2[0] * fArr3[0];
        float f9 = fArr2[1];
        float f10 = fArr3[3];
        float f11 = fArr2[2];
        float f12 = fArr3[6];
        fArr[0] = f6 + (f9 * f10) + (f11 * f12);
        float f13 = fArr2[0];
        float f14 = fArr3[1] * f13;
        float f15 = fArr3[4];
        float f16 = fArr3[7];
        fArr[1] = f14 + (f9 * f15) + (f11 * f16);
        float f17 = f13 * fArr3[2];
        float f18 = fArr2[1];
        float f19 = fArr3[5];
        float f20 = fArr3[8];
        fArr[2] = f17 + (f18 * f19) + (f11 * f20);
        float f21 = fArr2[3];
        float f22 = fArr3[0];
        float f23 = fArr2[4];
        float f24 = fArr2[5];
        fArr[3] = (f21 * f22) + (f10 * f23) + (f24 * f12);
        float f25 = fArr2[3];
        float f26 = fArr3[1];
        fArr[4] = (f25 * f26) + (f23 * f15) + (f24 * f16);
        float f27 = fArr3[2];
        fArr[5] = (f25 * f27) + (fArr2[4] * f19) + (f24 * f20);
        float f28 = fArr2[6] * f22;
        float f29 = fArr2[7];
        float f30 = fArr3[3] * f29;
        float f31 = fArr2[8];
        fArr[6] = f28 + f30 + (f12 * f31);
        float f32 = fArr2[6];
        float f33 = f16 * f31;
        fArr[7] = f33 + (f29 * fArr3[4]) + (f26 * f32);
        fArr[8] = (f32 * f27) + (fArr2[7] * fArr3[5]) + (f31 * f20);
    }

    public static final void g(float[] fArr, float f6) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d2 = f6;
        fArr[4] = (float) Math.cos(d2);
        fArr[5] = (float) (-Math.sin(d2));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d2);
        fArr[8] = (float) Math.cos(d2);
    }

    public static final void h(float[] fArr, float f6) {
        double d2 = f6;
        fArr[0] = (float) Math.cos(d2);
        fArr[1] = (float) (-Math.sin(d2));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d2);
        fArr[4] = (float) Math.cos(d2);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public static final int i(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        e("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            e("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            e("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            e("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
                sb.append("Could not compile shader ");
                sb.append(i);
                sb.append(":");
                Log.e("SphericalVideoRenderer", sb.toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                e("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    public final void a(int i, int i4) {
        Object obj = this.f35207N;
        synchronized (obj) {
            this.f35200F = i;
            this.f35199E = i4;
            this.f35212S = true;
            obj.notifyAll();
        }
    }

    public final void b() {
        Object obj = this.f35207N;
        synchronized (obj) {
            this.f35213T = true;
            this.f35202H = null;
            obj.notifyAll();
        }
    }

    public final void c(float f6, float f9) {
        int i = this.f35200F;
        int i4 = this.f35199E;
        if (i <= i4) {
            i = i4;
        }
        float f10 = i;
        this.f35197C -= (f6 * 1.7453293f) / f10;
        float f11 = this.f35198D - ((f9 * 1.7453293f) / f10);
        this.f35198D = f11;
        if (f11 < -1.5707964f) {
            this.f35198D = -1.5707964f;
            f11 = -1.5707964f;
        }
        if (f11 > 1.5707964f) {
            this.f35198D = 1.5707964f;
        }
    }

    public final void d() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f35211R;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            this.f35208O.eglMakeCurrent(this.f35209P, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f35208O.eglDestroySurface(this.f35209P, this.f35211R);
            this.f35211R = null;
        }
        EGLContext eGLContext = this.f35210Q;
        if (eGLContext != null) {
            this.f35208O.eglDestroyContext(this.f35209P, eGLContext);
            this.f35210Q = null;
        }
        EGLDisplay eGLDisplay = this.f35209P;
        if (eGLDisplay != null) {
            this.f35208O.eglTerminate(eGLDisplay);
            this.f35209P = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f35204K++;
        Object obj = this.f35207N;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00b0  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z8;
        int i;
        int glCreateProgram;
        char c4 = 2;
        int i4 = 3;
        char c9 = '\b';
        float f6 = 0.0f;
        if (this.f35202H == null) {
            int i9 = t2.C.f40822b;
            u2.i.c("SphericalVideoProcessor started with no output texture.");
            this.f35206M.countDown();
            return;
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f35208O = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f35209P = eglGetDisplay;
        if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
            if (this.f35208O.eglInitialize(eglGetDisplay, new int[2])) {
                int[] iArr = new int[1];
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                EGLConfig eGLConfig = (this.f35208O.eglChooseConfig(this.f35209P, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344}, eGLConfigArr, 1, iArr) && iArr[0] > 0) ? eGLConfigArr[0] : null;
                if (eGLConfig != null) {
                    EGL10 egl102 = this.f35208O;
                    EGLDisplay eGLDisplay = this.f35209P;
                    EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
                    EGLContext eglCreateContext = egl102.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, new int[]{12440, 2, 12344});
                    this.f35210Q = eglCreateContext;
                    if (eglCreateContext != null && eglCreateContext != eGLContext) {
                        EGLSurface eglCreateWindowSurface = this.f35208O.eglCreateWindowSurface(this.f35209P, eGLConfig, this.f35202H, null);
                        this.f35211R = eglCreateWindowSurface;
                        if (eglCreateWindowSurface != null && eglCreateWindowSurface != EGL10.EGL_NO_SURFACE && this.f35208O.eglMakeCurrent(this.f35209P, eglCreateWindowSurface, eglCreateWindowSurface, this.f35210Q)) {
                            z8 = true;
                            C3151ea c3151ea = AbstractC3368ia.f31536R1;
                            q2.r rVar = q2.r.f40116e;
                            i = i(35633, ((String) rVar.f40119c.a(c3151ea)).equals(c3151ea.c()) ? (String) rVar.f40119c.a(c3151ea) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
                            if (i != 0) {
                                C3151ea c3151ea2 = AbstractC3368ia.f31545S1;
                                int i10 = i(35632, !((String) rVar.f40119c.a(c3151ea2)).equals(c3151ea2.c()) ? (String) rVar.f40119c.a(c3151ea2) : "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}");
                                if (i10 != 0) {
                                    glCreateProgram = GLES20.glCreateProgram();
                                    e("createProgram");
                                    if (glCreateProgram != 0) {
                                        GLES20.glAttachShader(glCreateProgram, i);
                                        e("attachShader");
                                        GLES20.glAttachShader(glCreateProgram, i10);
                                        e("attachShader");
                                        GLES20.glLinkProgram(glCreateProgram);
                                        e("linkProgram");
                                        int[] iArr2 = new int[1];
                                        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr2, 0);
                                        e("getProgramiv");
                                        if (iArr2[0] != 1) {
                                            Log.e("SphericalVideoRenderer", "Could not link program: ");
                                            Log.e("SphericalVideoRenderer", GLES20.glGetProgramInfoLog(glCreateProgram));
                                            GLES20.glDeleteProgram(glCreateProgram);
                                            e("deleteProgram");
                                        } else {
                                            GLES20.glValidateProgram(glCreateProgram);
                                            e("validateProgram");
                                        }
                                    }
                                    this.f35203I = glCreateProgram;
                                    GLES20.glUseProgram(glCreateProgram);
                                    e("useProgram");
                                    int glGetAttribLocation = GLES20.glGetAttribLocation(this.f35203I, "aPosition");
                                    GLES20.glVertexAttribPointer(glGetAttribLocation, 3, 5126, false, 12, (Buffer) this.f35205L);
                                    e("vertexAttribPointer");
                                    GLES20.glEnableVertexAttribArray(glGetAttribLocation);
                                    e("enableVertexAttribArray");
                                    int[] iArr3 = new int[1];
                                    GLES20.glGenTextures(1, iArr3, 0);
                                    e("genTextures");
                                    int i11 = iArr3[0];
                                    GLES20.glBindTexture(36197, i11);
                                    e("bindTextures");
                                    GLES20.glTexParameteri(36197, 10240, 9729);
                                    e("texParameteri");
                                    GLES20.glTexParameteri(36197, 10241, 9729);
                                    e("texParameteri");
                                    GLES20.glTexParameteri(36197, 10242, 33071);
                                    e("texParameteri");
                                    GLES20.glTexParameteri(36197, 10243, 33071);
                                    e("texParameteri");
                                    int glGetUniformLocation = GLES20.glGetUniformLocation(this.f35203I, "uVMat");
                                    this.J = glGetUniformLocation;
                                    GLES20.glUniformMatrix3fv(glGetUniformLocation, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                                    int i12 = this.f35203I;
                                    if (z8 || i12 == 0) {
                                        String valueOf = String.valueOf(GLUtils.getEGLErrorString(this.f35208O.eglGetError()));
                                        int i13 = t2.C.f40822b;
                                        String concat = "EGL initialization failed: ".concat(valueOf);
                                        u2.i.c(concat);
                                        p2.j.f39798C.f39808h.d("SphericalVideoProcessor.run.1", new Throwable(concat));
                                        d();
                                        this.f35206M.countDown();
                                    }
                                    SurfaceTexture surfaceTexture = new SurfaceTexture(i11);
                                    this.f35201G = surfaceTexture;
                                    surfaceTexture.setOnFrameAvailableListener(this);
                                    this.f35206M.countDown();
                                    C4127wg c4127wg = this.f35214n;
                                    if (c4127wg.f35021g == null) {
                                        SensorManager sensorManager = c4127wg.f35015a;
                                        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
                                        if (defaultSensor == null) {
                                            int i14 = t2.C.f40822b;
                                            u2.i.c("No Sensor of TYPE_ROTATION_VECTOR");
                                        } else {
                                            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
                                            handlerThread.start();
                                            Z2.e eVar = new Z2.e(handlerThread.getLooper(), 3);
                                            c4127wg.f35021g = eVar;
                                            if (!sensorManager.registerListener(c4127wg, defaultSensor, 0, eVar)) {
                                                int i15 = t2.C.f40822b;
                                                u2.i.c("SensorManager.registerListener failed.");
                                                c4127wg.b();
                                            }
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                this.f35212S = true;
                                                while (!this.f35213T) {
                                                    while (this.f35204K > 0) {
                                                        this.f35201G.updateTexImage();
                                                        this.f35204K--;
                                                    }
                                                    float[] fArr = this.f35215u;
                                                    if (c4127wg.c(fArr)) {
                                                        if (Float.isNaN(this.f35196B)) {
                                                            float[] fArr2 = new float[i4];
                                                            // fill-array-data instruction
                                                            fArr2[0] = 0.0f;
                                                            fArr2[1] = 1.0f;
                                                            fArr2[2] = 0.0f;
                                                            float f9 = fArr[0];
                                                            float f10 = fArr2[0];
                                                            float f11 = fArr[1];
                                                            float f12 = fArr2[1];
                                                            float f13 = (fArr[c4] * f6) + (f11 * f12) + (f9 * f10);
                                                            float f14 = (fArr[5] * f6) + (fArr[i4] * f10) + (fArr[4] * f12);
                                                            float f15 = (fArr[c9] * f6) + (fArr[6] * f10) + (fArr[7] * f12);
                                                            float[] fArr3 = new float[i4];
                                                            fArr3[0] = f13;
                                                            fArr3[1] = f14;
                                                            fArr3[c4] = f15;
                                                            this.f35196B = -(((float) Math.atan2(fArr3[1], fArr3[0])) - 1.5707964f);
                                                        }
                                                        h(this.f35220z, this.f35196B + this.f35197C);
                                                    } else {
                                                        g(fArr, -1.5707964f);
                                                        h(this.f35220z, this.f35197C);
                                                    }
                                                    float[] fArr4 = this.f35216v;
                                                    g(fArr4, 1.5707964f);
                                                    float[] fArr5 = this.f35217w;
                                                    f(fArr5, this.f35220z, fArr4);
                                                    float[] fArr6 = this.f35218x;
                                                    f(fArr6, fArr, fArr5);
                                                    float[] fArr7 = this.f35219y;
                                                    g(fArr7, this.f35198D);
                                                    float[] fArr8 = this.f35195A;
                                                    f(fArr8, fArr7, fArr6);
                                                    GLES20.glUniformMatrix3fv(this.J, 1, false, fArr8, 0);
                                                    GLES20.glDrawArrays(5, 0, 4);
                                                    e("drawArrays");
                                                    GLES20.glFinish();
                                                    this.f35208O.eglSwapBuffers(this.f35209P, this.f35211R);
                                                    if (this.f35212S) {
                                                        GLES20.glViewport(0, 0, this.f35200F, this.f35199E);
                                                        e("viewport");
                                                        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.f35203I, "uFOVx");
                                                        int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.f35203I, "uFOVy");
                                                        int i16 = this.f35200F;
                                                        int i17 = this.f35199E;
                                                        if (i16 > i17) {
                                                            GLES20.glUniform1f(glGetUniformLocation2, 0.87266463f);
                                                            GLES20.glUniform1f(glGetUniformLocation3, (this.f35199E * 0.87266463f) / this.f35200F);
                                                        } else {
                                                            GLES20.glUniform1f(glGetUniformLocation2, (i16 * 0.87266463f) / i17);
                                                            GLES20.glUniform1f(glGetUniformLocation3, 0.87266463f);
                                                        }
                                                        this.f35212S = false;
                                                    }
                                                    try {
                                                        Object obj = this.f35207N;
                                                        synchronized (obj) {
                                                            try {
                                                                if (!this.f35213T && !this.f35212S && this.f35204K == 0) {
                                                                    obj.wait();
                                                                }
                                                            } catch (Throwable th) {
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (InterruptedException unused) {
                                                    }
                                                    c4 = 2;
                                                    i4 = 3;
                                                    c9 = '\b';
                                                    f6 = 0.0f;
                                                }
                                            } catch (Throwable th2) {
                                                this.f35214n.b();
                                                this.f35201G.setOnFrameAvailableListener(null);
                                                this.f35201G = null;
                                                d();
                                                throw th2;
                                            }
                                        } catch (IllegalStateException unused2) {
                                            int i18 = t2.C.f40822b;
                                            u2.i.f("SphericalVideoProcessor halted unexpectedly.");
                                        }
                                    } catch (Throwable th3) {
                                        int i19 = t2.C.f40822b;
                                        u2.i.d("SphericalVideoProcessor died.", th3);
                                        p2.j.f39798C.f39808h.d("SphericalVideoProcessor.run.2", th3);
                                    }
                                    this.f35214n.b();
                                    this.f35201G.setOnFrameAvailableListener(null);
                                    this.f35201G = null;
                                    d();
                                    return;
                                }
                            }
                            glCreateProgram = 0;
                            this.f35203I = glCreateProgram;
                            GLES20.glUseProgram(glCreateProgram);
                            e("useProgram");
                            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f35203I, "aPosition");
                            GLES20.glVertexAttribPointer(glGetAttribLocation2, 3, 5126, false, 12, (Buffer) this.f35205L);
                            e("vertexAttribPointer");
                            GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
                            e("enableVertexAttribArray");
                            int[] iArr32 = new int[1];
                            GLES20.glGenTextures(1, iArr32, 0);
                            e("genTextures");
                            int i112 = iArr32[0];
                            GLES20.glBindTexture(36197, i112);
                            e("bindTextures");
                            GLES20.glTexParameteri(36197, 10240, 9729);
                            e("texParameteri");
                            GLES20.glTexParameteri(36197, 10241, 9729);
                            e("texParameteri");
                            GLES20.glTexParameteri(36197, 10242, 33071);
                            e("texParameteri");
                            GLES20.glTexParameteri(36197, 10243, 33071);
                            e("texParameteri");
                            int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.f35203I, "uVMat");
                            this.J = glGetUniformLocation4;
                            GLES20.glUniformMatrix3fv(glGetUniformLocation4, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
                            int i122 = this.f35203I;
                            if (z8) {
                            }
                            String valueOf2 = String.valueOf(GLUtils.getEGLErrorString(this.f35208O.eglGetError()));
                            int i132 = t2.C.f40822b;
                            String concat2 = "EGL initialization failed: ".concat(valueOf2);
                            u2.i.c(concat2);
                            p2.j.f39798C.f39808h.d("SphericalVideoProcessor.run.1", new Throwable(concat2));
                            d();
                            this.f35206M.countDown();
                        }
                    }
                }
            }
        }
        z8 = false;
        C3151ea c3151ea3 = AbstractC3368ia.f31536R1;
        q2.r rVar2 = q2.r.f40116e;
        i = i(35633, ((String) rVar2.f40119c.a(c3151ea3)).equals(c3151ea3.c()) ? (String) rVar2.f40119c.a(c3151ea3) : "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}");
        if (i != 0) {
        }
        glCreateProgram = 0;
        this.f35203I = glCreateProgram;
        GLES20.glUseProgram(glCreateProgram);
        e("useProgram");
        int glGetAttribLocation22 = GLES20.glGetAttribLocation(this.f35203I, "aPosition");
        GLES20.glVertexAttribPointer(glGetAttribLocation22, 3, 5126, false, 12, (Buffer) this.f35205L);
        e("vertexAttribPointer");
        GLES20.glEnableVertexAttribArray(glGetAttribLocation22);
        e("enableVertexAttribArray");
        int[] iArr322 = new int[1];
        GLES20.glGenTextures(1, iArr322, 0);
        e("genTextures");
        int i1122 = iArr322[0];
        GLES20.glBindTexture(36197, i1122);
        e("bindTextures");
        GLES20.glTexParameteri(36197, 10240, 9729);
        e("texParameteri");
        GLES20.glTexParameteri(36197, 10241, 9729);
        e("texParameteri");
        GLES20.glTexParameteri(36197, 10242, 33071);
        e("texParameteri");
        GLES20.glTexParameteri(36197, 10243, 33071);
        e("texParameteri");
        int glGetUniformLocation42 = GLES20.glGetUniformLocation(this.f35203I, "uVMat");
        this.J = glGetUniformLocation42;
        GLES20.glUniformMatrix3fv(glGetUniformLocation42, 1, false, new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}, 0);
        int i1222 = this.f35203I;
        if (z8) {
        }
        String valueOf22 = String.valueOf(GLUtils.getEGLErrorString(this.f35208O.eglGetError()));
        int i1322 = t2.C.f40822b;
        String concat22 = "EGL initialization failed: ".concat(valueOf22);
        u2.i.c(concat22);
        p2.j.f39798C.f39808h.d("SphericalVideoProcessor.run.1", new Throwable(concat22));
        d();
        this.f35206M.countDown();
    }
}
