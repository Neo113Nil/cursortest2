package com.tapjoy.internal;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes2.dex */
public final class gs {

    /* renamed from: b, reason: collision with root package name */
    private static Activity f8212b;

    /* renamed from: c, reason: collision with root package name */
    private static final by f8213c = new by();

    /* renamed from: d, reason: collision with root package name */
    private static final by f8214d = new by();

    /* renamed from: a, reason: collision with root package name */
    public static final ba f8211a = new ba() { // from class: com.tapjoy.internal.gs.1
        @Override // com.tapjoy.internal.ba
        public final boolean a(Runnable runnable) {
            GLSurfaceView gLSurfaceView = (GLSurfaceView) gs.f8213c.a();
            if (gLSurfaceView == null) {
                return false;
            }
            gLSurfaceView.queueEvent(runnable);
            return true;
        }
    };

    static void a(GLSurfaceView gLSurfaceView) {
        new Object[1][0] = gLSurfaceView;
        f8213c.a(gLSurfaceView);
        gLSurfaceView.queueEvent(new Runnable() { // from class: com.tapjoy.internal.gs.2
            @Override // java.lang.Runnable
            public final void run() {
                Thread currentThread = Thread.currentThread();
                new Object[1][0] = currentThread;
                gs.f8214d.a(currentThread);
            }
        });
    }

    public static Activity a() {
        Activity activity = f8212b;
        return activity == null ? b.a() : activity;
    }

    public static Thread b() {
        return (Thread) f8214d.a();
    }
}
