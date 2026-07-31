package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

@TargetApi(17)
/* loaded from: classes.dex */
public final class fn extends Surface {

    /* renamed from: h, reason: collision with root package name */
    private static boolean f5155h;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f5156i;

    /* renamed from: f, reason: collision with root package name */
    private final dn f5157f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5158g;

    /* synthetic */ fn(dn dnVar, SurfaceTexture surfaceTexture, boolean z6, en enVar) {
        super(surfaceTexture);
        this.f5157f = dnVar;
    }

    public static fn a(Context context, boolean z6) {
        if (zm.f15186a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
        boolean z7 = true;
        if (z6 && !c(context)) {
            z7 = false;
        }
        jm.e(z7);
        return new dn().a(z6);
    }

    public static synchronized boolean c(Context context) {
        boolean z6;
        synchronized (fn.class) {
            if (!f5156i) {
                int i7 = zm.f15186a;
                if (i7 >= 17) {
                    boolean z7 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (i7 == 24) {
                            String str = zm.f15189d;
                            if ((str.startsWith("SM-G950") || str.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                            }
                        }
                        z7 = true;
                    }
                    f5155h = z7;
                }
                f5156i = true;
            }
            z6 = f5155h;
        }
        return z6;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f5157f) {
            if (!this.f5158g) {
                this.f5157f.b();
                this.f5158g = true;
            }
        }
    }
}
