package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class m5 extends Thread {

    /* renamed from: l, reason: collision with root package name */
    private static final boolean f8408l = n6.f8944b;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue<a6<?>> f8409f;

    /* renamed from: g, reason: collision with root package name */
    private final BlockingQueue<a6<?>> f8410g;

    /* renamed from: h, reason: collision with root package name */
    private final k5 f8411h;

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f8412i = false;

    /* renamed from: j, reason: collision with root package name */
    private final o6 f8413j;

    /* renamed from: k, reason: collision with root package name */
    private final r5 f8414k;

    /* JADX WARN: Multi-variable type inference failed */
    public m5(BlockingQueue blockingQueue, BlockingQueue<a6<?>> blockingQueue2, BlockingQueue<a6<?>> blockingQueue3, k5 k5Var, r5 r5Var) {
        this.f8409f = blockingQueue;
        this.f8410g = blockingQueue2;
        this.f8411h = blockingQueue3;
        this.f8414k = k5Var;
        this.f8413j = new o6(this, blockingQueue2, k5Var, null);
    }

    private void c() {
        r5 r5Var;
        a6<?> take = this.f8409f.take();
        take.n("cache-queue-take");
        take.u(1);
        try {
            take.x();
            j5 b7 = this.f8411h.b(take.k());
            if (b7 == null) {
                take.n("cache-miss");
                if (!this.f8413j.c(take)) {
                    this.f8410g.put(take);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (b7.a(currentTimeMillis)) {
                take.n("cache-hit-expired");
                take.f(b7);
                if (!this.f8413j.c(take)) {
                    this.f8410g.put(take);
                }
                return;
            }
            take.n("cache-hit");
            g6<?> i7 = take.i(new w5(b7.f6970a, b7.f6976g));
            take.n("cache-hit-parsed");
            if (!i7.c()) {
                take.n("cache-parsing-failed");
                this.f8411h.c(take.k(), true);
                take.f(null);
                if (!this.f8413j.c(take)) {
                    this.f8410g.put(take);
                }
                return;
            }
            if (b7.f6975f < currentTimeMillis) {
                take.n("cache-hit-refresh-needed");
                take.f(b7);
                i7.f5464d = true;
                if (!this.f8413j.c(take)) {
                    this.f8414k.b(take, i7, new l5(this, take));
                }
                r5Var = this.f8414k;
            } else {
                r5Var = this.f8414k;
            }
            r5Var.b(take, i7, null);
        } finally {
            take.u(2);
        }
    }

    public final void b() {
        this.f8412i = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f8408l) {
            n6.d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f8411h.a();
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.f8412i) {
                    Thread.currentThread().interrupt();
                    return;
                }
                n6.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
