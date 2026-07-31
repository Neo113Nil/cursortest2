package com.yandex.mobile.ads.impl;

import android.os.Process;
import com.yandex.mobile.ads.impl.InterfaceC1861cm;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* renamed from: com.yandex.mobile.ads.impl.hm, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1981hm extends Thread {

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f26801h = ii2.f27214a;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue<op1<?>> f26802b;

    /* renamed from: c, reason: collision with root package name */
    private final BlockingQueue<op1<?>> f26803c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1861cm f26804d;

    /* renamed from: e, reason: collision with root package name */
    private final yq1 f26805e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f26806f = false;

    /* renamed from: g, reason: collision with root package name */
    private final wi2 f26807g;

    public C1981hm(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, InterfaceC1861cm interfaceC1861cm, yq1 yq1Var) {
        this.f26802b = priorityBlockingQueue;
        this.f26803c = priorityBlockingQueue2;
        this.f26804d = interfaceC1861cm;
        this.f26805e = yq1Var;
        this.f26807g = new wi2(this, priorityBlockingQueue2, yq1Var);
    }

    public final void b() {
        this.f26806f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f26801h) {
            ap0.e(new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f26804d.a();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f26806f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                ap0.b(new Object[0]);
            } catch (Throwable unused2) {
                ap0.b(new Object[0]);
                return;
            }
        }
    }

    private void a() {
        op1<?> take = this.f26802b.take();
        take.a("cache-queue-take");
        take.a(1);
        try {
            if (take.n()) {
                take.c("cache-discard-canceled");
            } else {
                InterfaceC1861cm.a aVar = this.f26804d.get(take.d());
                if (aVar == null) {
                    take.a("cache-miss");
                    if (!this.f26807g.a(take)) {
                        this.f26803c.put(take);
                    }
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (aVar.f24250e < currentTimeMillis) {
                        take.a("cache-hit-expired");
                        take.a(aVar);
                        if (!this.f26807g.a(take)) {
                            this.f26803c.put(take);
                        }
                    } else {
                        take.a("cache-hit");
                        qq1<?> a4 = take.a(new lc1(200, aVar.f24246a, aVar.f24252g, false));
                        take.a("cache-hit-parsed");
                        if (a4.f30871c != null) {
                            take.a("cache-parsing-failed");
                            this.f26804d.a(take.d());
                            take.a((InterfaceC1861cm.a) null);
                            if (!this.f26807g.a(take)) {
                                this.f26803c.put(take);
                            }
                        } else if (aVar.f24251f < currentTimeMillis) {
                            take.a("cache-hit-refresh-needed");
                            take.a(aVar);
                            a4.f30872d = true;
                            if (this.f26807g.a(take)) {
                                ((x50) this.f26805e).a(take, a4, null);
                            } else {
                                ((x50) this.f26805e).a(take, a4, new RunnableC1957gm(this, take));
                            }
                        } else {
                            ((x50) this.f26805e).a(take, a4, null);
                        }
                    }
                }
            }
            take.a(2);
        } catch (Throwable th) {
            take.a(2);
            throw th;
        }
    }
}
