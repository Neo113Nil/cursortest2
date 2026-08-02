package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class Yf implements Wf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0590eg f11307a;

    public Yf(C0590eg c0590eg) {
        this.f11307a = c0590eg;
    }

    @Override // io.appmetrica.analytics.impl.Wf
    public final void a() {
        C0590eg c0590eg = this.f11307a;
        C1128za c1128za = c0590eg.f11795b;
        Xf xf = new Xf(c0590eg);
        c1128za.getClass();
        try {
            FutureTask futureTask = new FutureTask(new CallableC1102ya(c1128za));
            C0817na.f12417I.f12429d.f12244a.getClass();
            new InterruptionSafeThread(futureTask, "IAA-SHMSR-" + ThreadFactoryC1131zd.f13101a.incrementAndGet()).start();
            C0823ng c0823ng = (C0823ng) futureTask.get(5L, TimeUnit.SECONDS);
            AbstractC0779lo.a(c1128za.f13100b);
            C0590eg.a(c0590eg, c0823ng, C0590eg.a(c0590eg));
        } catch (Throwable th) {
            try {
                xf.a(th);
            } finally {
                AbstractC0779lo.a(c1128za.f13100b);
            }
        }
    }
}
