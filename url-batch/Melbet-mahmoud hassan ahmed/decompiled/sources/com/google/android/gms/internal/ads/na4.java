package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* loaded from: classes.dex */
public final class na4 extends Surface {

    /* renamed from: i, reason: collision with root package name */
    private static int f9007i;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f9008j;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9009f;

    /* renamed from: g, reason: collision with root package name */
    private final la4 f9010g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f9011h;

    /* synthetic */ na4(la4 la4Var, SurfaceTexture surfaceTexture, boolean z6, ma4 ma4Var) {
        super(surfaceTexture);
        this.f9010g = la4Var;
        this.f9009f = z6;
    }

    public static na4 a(Context context, boolean z6) {
        boolean z7 = true;
        if (z6 && !c(context)) {
            z7 = false;
        }
        wu1.f(z7);
        return new la4().a(z6 ? f9007i : 0);
    }

    public static synchronized boolean c(Context context) {
        int i7;
        String eglQueryString;
        String eglQueryString2;
        synchronized (na4.class) {
            if (!f9008j) {
                int i8 = n13.f8865a;
                int i9 = 2;
                if (i8 >= 24 && ((i8 >= 26 || (!"samsung".equals(n13.f8867c) && !"XT1650".equals(n13.f8868d))) && ((i8 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
                    if (i8 >= 17 && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                        i9 = 1;
                    }
                    f9007i = i9;
                    f9008j = true;
                }
                i9 = 0;
                f9007i = i9;
                f9008j = true;
            }
            i7 = f9007i;
        }
        return i7 != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f9010g) {
            if (!this.f9011h) {
                this.f9010g.b();
                this.f9011h = true;
            }
        }
    }
}
