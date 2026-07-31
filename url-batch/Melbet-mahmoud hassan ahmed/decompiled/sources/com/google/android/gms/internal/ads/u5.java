package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class u5 extends Thread {

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue<a6<?>> f12634f;

    /* renamed from: g, reason: collision with root package name */
    private final t5 f12635g;

    /* renamed from: h, reason: collision with root package name */
    private final k5 f12636h;

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f12637i = false;

    /* renamed from: j, reason: collision with root package name */
    private final r5 f12638j;

    /* JADX WARN: Multi-variable type inference failed */
    public u5(BlockingQueue blockingQueue, BlockingQueue<a6<?>> blockingQueue2, t5 t5Var, k5 k5Var, r5 r5Var) {
        this.f12634f = blockingQueue;
        this.f12635g = blockingQueue2;
        this.f12636h = t5Var;
        this.f12638j = k5Var;
    }

    private void b() {
        a6<?> take = this.f12634f.take();
        SystemClock.elapsedRealtime();
        take.u(3);
        try {
            take.n("network-queue-take");
            take.x();
            TrafficStats.setThreadStatsTag(take.d());
            w5 a7 = this.f12635g.a(take);
            take.n("network-http-complete");
            if (a7.f13720e && take.w()) {
                take.q("not-modified");
                take.s();
                return;
            }
            g6<?> i7 = take.i(a7);
            take.n("network-parse-complete");
            if (i7.f5462b != null) {
                this.f12636h.d(take.k(), i7.f5462b);
                take.n("network-cache-written");
            }
            take.r();
            this.f12638j.b(take, i7, null);
            take.t(i7);
        } catch (k6 e7) {
            SystemClock.elapsedRealtime();
            this.f12638j.a(take, e7);
            take.s();
        } catch (Exception e8) {
            n6.c(e8, "Unhandled exception %s", e8.toString());
            k6 k6Var = new k6(e8);
            SystemClock.elapsedRealtime();
            this.f12638j.a(take, k6Var);
            take.s();
        } finally {
            take.u(4);
        }
    }

    public final void a() {
        this.f12637i = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f12637i) {
                    Thread.currentThread().interrupt();
                    return;
                }
                n6.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
