package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.e6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2590e6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final List f38913a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f38914b = Ia.j().w().a();

    /* renamed from: c, reason: collision with root package name */
    public final WaitForActivationDelayBarrier f38915c = Ia.j().a();

    public RunnableC2590e6(List list) {
        this.f38913a = list;
    }

    public static final void a(RunnableC2590e6 runnableC2590e6) {
        Iterator it = runnableC2590e6.f38913a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f38915c.subscribe(TimeUnit.SECONDS.toMillis(10L), this.f38914b, new ActivationBarrierCallback() { // from class: io.appmetrica.analytics.impl.hp
            @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
            public final void onWaitFinished() {
                RunnableC2590e6.a(RunnableC2590e6.this);
            }
        });
    }
}
