package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class J5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final List f901a;
    public final IHandlerExecutor b = C0401oa.k().w().a();
    public final WaitForActivationDelayBarrier c = C0401oa.k().a();

    public J5(List list) {
        this.f901a = list;
    }

    public static final void a(J5 j5) {
        Iterator it = j5.f901a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.subscribe(TimeUnit.SECONDS.toMillis(10L), this.b, new ActivationBarrierCallback() { // from class: io.appmetrica.analytics.impl.J5$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
            public final void onWaitFinished() {
                J5.a(J5.this);
            }
        });
    }
}
