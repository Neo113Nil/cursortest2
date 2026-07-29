package com.ironsource.b.b;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: SuperLooper.java */
/* loaded from: classes2.dex */
public class h extends Thread {

    /* renamed from: b, reason: collision with root package name */
    private static h f6744b;

    /* renamed from: a, reason: collision with root package name */
    private a f6745a = new a(getClass().getSimpleName());

    private h() {
        this.f6745a.start();
        this.f6745a.a();
    }

    public static synchronized h a() {
        h hVar;
        synchronized (h.class) {
            if (f6744b == null) {
                f6744b = new h();
            }
            hVar = f6744b;
        }
        return hVar;
    }

    public synchronized void a(Runnable runnable) {
        if (this.f6745a == null) {
            return;
        }
        Handler b2 = this.f6745a.b();
        if (b2 != null) {
            b2.post(runnable);
        }
    }

    /* compiled from: SuperLooper.java */
    private class a extends HandlerThread {

        /* renamed from: b, reason: collision with root package name */
        private Handler f6747b;

        a(String str) {
            super(str);
            setUncaughtExceptionHandler(new com.ironsource.b.d.g());
        }

        void a() {
            this.f6747b = new Handler(getLooper());
        }

        Handler b() {
            return this.f6747b;
        }
    }
}
