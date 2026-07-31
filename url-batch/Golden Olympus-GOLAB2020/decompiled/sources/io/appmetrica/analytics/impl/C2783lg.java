package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.lg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2783lg implements InterfaceC2731jg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2938rg f39402a;

    public C2783lg(C2938rg c2938rg) {
        this.f39402a = c2938rg;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2731jg
    public final void a() {
        C2938rg c2938rg = this.f39402a;
        Ua ua = c2938rg.f39731b;
        C2757kg c2757kg = new C2757kg(c2938rg);
        ua.getClass();
        try {
            FutureTask futureTask = new FutureTask(new Ta(ua));
            Ia.f37730F.f37739d.f39744a.getClass();
            new InterruptionSafeThread(futureTask, "IAA-SHMSR-" + Od.f38077a.incrementAndGet()).start();
            Ag ag = (Ag) futureTask.get(5L, TimeUnit.SECONDS);
            AbstractC2713io.a(ua.f38357b);
            C2938rg.a(c2938rg, ag, C2938rg.a(c2938rg));
        } catch (Throwable th) {
            try {
                c2757kg.a(th);
            } finally {
                AbstractC2713io.a(ua.f38357b);
            }
        }
    }
}
