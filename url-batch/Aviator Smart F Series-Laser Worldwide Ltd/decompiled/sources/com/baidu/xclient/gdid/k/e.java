package com.baidu.xclient.gdid.k;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public EGL10 f10771a;

    /* renamed from: b, reason: collision with root package name */
    public EGLDisplay f10772b;

    /* renamed from: c, reason: collision with root package name */
    public EGLConfig f10773c;

    /* renamed from: d, reason: collision with root package name */
    public EGLSurface f10774d;

    /* renamed from: e, reason: collision with root package name */
    public EGLContext f10775e;

    /* renamed from: f, reason: collision with root package name */
    public GL10 f10776f;

    /* renamed from: h, reason: collision with root package name */
    public Object f10778h;

    /* renamed from: g, reason: collision with root package name */
    public int f10777g = 1;

    /* renamed from: i, reason: collision with root package name */
    public int f10779i = 8;

    /* renamed from: j, reason: collision with root package name */
    public int f10780j = 8;

    /* renamed from: k, reason: collision with root package name */
    public int f10781k = 8;

    /* renamed from: l, reason: collision with root package name */
    public int f10782l = 8;

    /* renamed from: m, reason: collision with root package name */
    public int f10783m = 16;

    /* renamed from: n, reason: collision with root package name */
    public int f10784n = 4;

    /* renamed from: o, reason: collision with root package name */
    public EGLContext f10785o = EGL10.EGL_NO_CONTEXT;

    public final EGLSurface a(int[] iArr) {
        int i8 = this.f10777g;
        return i8 != 2 ? i8 != 3 ? this.f10771a.eglCreatePbufferSurface(this.f10772b, this.f10773c, iArr) : this.f10771a.eglCreateWindowSurface(this.f10772b, this.f10773c, this.f10778h, iArr) : this.f10771a.eglCreatePixmapSurface(this.f10772b, this.f10773c, this.f10778h, iArr);
    }

    public void b() {
        EGL10 egl10 = this.f10771a;
        EGLDisplay eGLDisplay = this.f10772b;
        EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        this.f10771a.eglDestroySurface(this.f10772b, this.f10774d);
        this.f10771a.eglDestroyContext(this.f10772b, this.f10775e);
        this.f10771a.eglTerminate(this.f10772b);
    }

    public void a() {
        EGL10 egl10 = this.f10771a;
        EGLDisplay eGLDisplay = this.f10772b;
        EGLSurface eGLSurface = this.f10774d;
        egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f10775e);
        this.f10776f = (GL10) this.f10775e.getGL();
    }

    public boolean a(int i8, int i9) {
        int[] iArr = {12324, this.f10779i, 12323, this.f10780j, 12322, this.f10781k, 12321, this.f10782l, 12325, this.f10783m, 12352, this.f10784n, 12344};
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f10771a = egl10;
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f10772b = eglGetDisplay;
        this.f10771a.eglInitialize(eglGetDisplay, new int[2]);
        int[] iArr2 = new int[1];
        this.f10771a.eglChooseConfig(this.f10772b, iArr, null, 0, iArr2);
        int i10 = iArr2[0];
        if (i10 == 0) {
            return false;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[i10];
        this.f10771a.eglChooseConfig(this.f10772b, iArr, eGLConfigArr, i10, iArr2);
        this.f10773c = eGLConfigArr[0];
        this.f10774d = a(new int[]{12375, i8, 12374, i9, 12344});
        this.f10775e = this.f10771a.eglCreateContext(this.f10772b, this.f10773c, this.f10785o, new int[]{12440, 2, 12344});
        a();
        return true;
    }
}
