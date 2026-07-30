package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes2.dex */
public final class Z4 extends Thread {

    /* renamed from: n, reason: collision with root package name */
    public final PriorityBlockingQueue f28963n;

    /* renamed from: u, reason: collision with root package name */
    public final C2881Yl f28964u;

    /* renamed from: v, reason: collision with root package name */
    public final C3614n5 f28965v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f28966w = false;

    /* renamed from: x, reason: collision with root package name */
    public final Vx f28967x;

    public Z4(PriorityBlockingQueue priorityBlockingQueue, C2881Yl c2881Yl, C3614n5 c3614n5, Vx vx) {
        this.f28963n = priorityBlockingQueue;
        this.f28964u = c2881Yl;
        this.f28965v = c3614n5;
        this.f28967x = vx;
    }

    public final void a() {
        Vx vx = this.f28967x;
        AbstractC3074d5 abstractC3074d5 = (AbstractC3074d5) this.f28963n.take();
        SystemClock.elapsedRealtime();
        abstractC3074d5.c();
        Object obj = null;
        try {
            try {
                abstractC3074d5.a("network-queue-take");
                synchronized (abstractC3074d5.f29797x) {
                }
                TrafficStats.setThreadStatsTag(abstractC3074d5.f29796w);
                C2965b5 b9 = this.f28964u.b(abstractC3074d5);
                abstractC3074d5.a("network-http-complete");
                if (b9.f29405e && abstractC3074d5.g()) {
                    abstractC3074d5.b("not-modified");
                    abstractC3074d5.k();
                } else {
                    com.bumptech.glide.manager.n h9 = abstractC3074d5.h(b9);
                    abstractC3074d5.a("network-parse-complete");
                    T4 t42 = (T4) h9.f23619v;
                    if (t42 != null) {
                        this.f28965v.q(abstractC3074d5.d(), t42);
                        abstractC3074d5.a("network-cache-written");
                    }
                    synchronized (abstractC3074d5.f29797x) {
                        abstractC3074d5.f29789B = true;
                    }
                    vx.n(abstractC3074d5, h9, null);
                    abstractC3074d5.j(h9);
                }
            } catch (C3183f5 e6) {
                SystemClock.elapsedRealtime();
                vx.getClass();
                abstractC3074d5.a("post-error");
                ((K) vx.f28329u).f25863u.post(new RunnableC3771q0(abstractC3074d5, new com.bumptech.glide.manager.n(e6), obj, 1));
                abstractC3074d5.k();
            } catch (Exception e9) {
                Log.e("Volley", AbstractC3346i5.d("Unhandled exception %s", e9.toString()), e9);
                C3183f5 c3183f5 = new C3183f5(e9);
                SystemClock.elapsedRealtime();
                vx.getClass();
                abstractC3074d5.a("post-error");
                ((K) vx.f28329u).f25863u.post(new RunnableC3771q0(abstractC3074d5, new com.bumptech.glide.manager.n(c3183f5), obj, 1));
                abstractC3074d5.k();
            }
            abstractC3074d5.c();
        } catch (Throwable th) {
            abstractC3074d5.c();
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f28966w) {
                    Thread.currentThread().interrupt();
                    return;
                }
                AbstractC3346i5.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
