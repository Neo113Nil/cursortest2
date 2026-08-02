package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class P5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final List f6450a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f6451b = C0876ua.k().x().a();

    /* renamed from: c, reason: collision with root package name */
    public final WaitForActivationDelayBarrier f6452c = C0876ua.k().a();

    public P5(List list) {
        this.f6450a = list;
    }

    public static final void a(P5 p5) {
        Iterator it = p5.f6450a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6452c.subscribe(TimeUnit.SECONDS.toMillis(10L), this.f6451b, new Y1.E(28, this));
    }
}
