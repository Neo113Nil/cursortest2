package com.android.volley;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* compiled from: NetworkDispatcher.java */
/* loaded from: classes.dex */
public class g extends Thread {

    /* renamed from: a, reason: collision with root package name */
    private final BlockingQueue<l<?>> f2280a;

    /* renamed from: b, reason: collision with root package name */
    private final f f2281b;

    /* renamed from: c, reason: collision with root package name */
    private final b f2282c;

    /* renamed from: d, reason: collision with root package name */
    private final o f2283d;
    private volatile boolean e = false;

    public g(BlockingQueue<l<?>> blockingQueue, f fVar, b bVar, o oVar) {
        this.f2280a = blockingQueue;
        this.f2281b = fVar;
        this.f2282c = bVar;
        this.f2283d = oVar;
    }

    public void a() {
        this.e = true;
        interrupt();
    }

    @TargetApi(14)
    private void a(l<?> lVar) {
        if (Build.VERSION.SDK_INT >= 14) {
            TrafficStats.setThreadStatsTag(lVar.b());
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                l<?> take = this.f2280a.take();
                try {
                    take.a("network-queue-take");
                    if (take.g()) {
                        take.b("network-discard-cancelled");
                    } else {
                        a(take);
                        i a2 = this.f2281b.a(take);
                        take.a("network-http-complete");
                        if (a2.f2287d && take.v()) {
                            take.b("not-modified");
                        } else {
                            n<?> a3 = take.a(a2);
                            take.a("network-parse-complete");
                            if (take.q() && a3.f2304b != null) {
                                this.f2282c.a(take.d(), a3.f2304b);
                                take.a("network-cache-written");
                            }
                            take.u();
                            this.f2283d.a(take, a3);
                        }
                    }
                } catch (s e) {
                    e.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    a(take, e);
                } catch (Exception e2) {
                    t.a(e2, "Unhandled exception %s", e2.toString());
                    s sVar = new s(e2);
                    sVar.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.f2283d.a(take, sVar);
                }
            } catch (InterruptedException unused) {
                if (this.e) {
                    return;
                }
            }
        }
    }

    private void a(l<?> lVar, s sVar) {
        this.f2283d.a(lVar, lVar.a(sVar));
    }
}
