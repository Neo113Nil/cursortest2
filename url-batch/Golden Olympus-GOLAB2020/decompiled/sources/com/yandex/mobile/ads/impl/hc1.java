package com.yandex.mobile.ads.impl;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class hc1 extends Thread {

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue<op1<?>> f26707b;

    /* renamed from: c, reason: collision with root package name */
    private final gc1 f26708c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1861cm f26709d;

    /* renamed from: e, reason: collision with root package name */
    private final yq1 f26710e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f26711f = false;

    public hc1(PriorityBlockingQueue priorityBlockingQueue, gc1 gc1Var, InterfaceC1861cm interfaceC1861cm, yq1 yq1Var) {
        this.f26707b = priorityBlockingQueue;
        this.f26708c = gc1Var;
        this.f26709d = interfaceC1861cm;
        this.f26710e = yq1Var;
    }

    private void a() {
        op1<?> take = this.f26707b.take();
        SystemClock.elapsedRealtime();
        take.a(3);
        try {
            try {
                try {
                    take.a("network-queue-take");
                    if (take.n()) {
                        take.c("network-discard-cancelled");
                        take.p();
                    } else {
                        TrafficStats.setThreadStatsTag(take.k());
                        lc1 a4 = this.f26708c.a(take);
                        take.a("network-http-complete");
                        if (a4.f28509e && take.m()) {
                            take.c("not-modified");
                            take.p();
                        } else {
                            qq1<?> a5 = take.a(a4);
                            take.a("network-parse-complete");
                            if (take.t() && a5.f30870b != null) {
                                this.f26709d.a(take.d(), a5.f30870b);
                                take.a("network-cache-written");
                            }
                            take.o();
                            ((x50) this.f26710e).a(take, a5, null);
                            take.a(a5);
                        }
                    }
                } catch (Exception e4) {
                    Object[] args = {e4.toString()};
                    boolean z4 = ii2.f27214a;
                    int i4 = ap0.f23396b;
                    Intrinsics.checkNotNullParameter(args, "args");
                    hi2 hi2Var = new hi2((Throwable) e4);
                    SystemClock.elapsedRealtime();
                    ((x50) this.f26710e).a(take, hi2Var);
                    take.p();
                }
            } catch (hi2 e5) {
                SystemClock.elapsedRealtime();
                ((x50) this.f26710e).a(take, take.b(e5));
                take.p();
            }
            take.a(4);
        } catch (Throwable th) {
            take.a(4);
            throw th;
        }
    }

    public final void b() {
        this.f26711f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f26711f) {
                    Thread.currentThread().interrupt();
                    return;
                } else {
                    boolean z4 = ii2.f27214a;
                    ap0.b(new Object[0]);
                }
            } catch (Throwable unused2) {
                boolean z5 = ii2.f27214a;
                ap0.b(new Object[0]);
                return;
            }
        }
    }
}
