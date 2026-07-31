package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: classes2.dex */
public class tt extends Thread {

    /* renamed from: b, reason: collision with root package name */
    private static tt f19826b;

    /* renamed from: a, reason: collision with root package name */
    private a f19827a;

    private class a extends HandlerThread {

        /* renamed from: a, reason: collision with root package name */
        private Handler f19828a;

        a(String str) {
            super(str);
            setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.d());
        }

        Handler a() {
            return this.f19828a;
        }

        void b() {
            this.f19828a = new Handler(getLooper());
        }
    }

    private tt() {
        a aVar = new a(getClass().getSimpleName());
        this.f19827a = aVar;
        aVar.start();
        this.f19827a.b();
    }

    public static synchronized tt a() {
        tt ttVar;
        synchronized (tt.class) {
            try {
                if (f19826b == null) {
                    f19826b = new tt();
                }
                ttVar = f19826b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ttVar;
    }

    public synchronized void a(Runnable runnable) {
        a aVar = this.f19827a;
        if (aVar == null) {
            return;
        }
        Handler a4 = aVar.a();
        if (a4 != null) {
            a4.post(runnable);
        }
    }
}
