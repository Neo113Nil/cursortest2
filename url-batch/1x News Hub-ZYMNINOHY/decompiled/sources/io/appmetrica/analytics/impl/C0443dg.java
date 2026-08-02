package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.dg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0443dg implements InterfaceC0391bg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0597jg f7186a;

    public C0443dg(C0597jg c0597jg) {
        this.f7186a = c0597jg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0391bg
    public final void a() {
        C0597jg c0597jg = this.f7186a;
        Ga ga = c0597jg.f7646b;
        C0417cg c0417cg = new C0417cg(c0597jg);
        ga.getClass();
        try {
            FutureTask futureTask = new FutureTask(new Fa(ga));
            C0876ua.f8420H.f8431d.f8027a.getClass();
            new InterruptionSafeThread(futureTask, "IAA-SHMSR-" + Gd.f6039a.incrementAndGet()).start();
            C0830sg c0830sg = (C0830sg) futureTask.get(5L, TimeUnit.SECONDS);
            AbstractC0709no.a(ga.f6038b);
            C0597jg.a(c0597jg, c0830sg, C0597jg.a(c0597jg));
        } catch (Throwable th) {
            try {
                c0417cg.a(th);
            } finally {
                AbstractC0709no.a(ga.f6038b);
            }
        }
    }
}
