package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class P5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final List f7264a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f7265b = C1027ua.k().x().a();

    /* renamed from: c, reason: collision with root package name */
    public final WaitForActivationDelayBarrier f7266c = C1027ua.k().a();

    public P5(List list) {
        this.f7264a = list;
    }

    public static final void a(P5 p5) {
        Iterator it = p5.f7264a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7266c.subscribe(TimeUnit.SECONDS.toMillis(10L), this.f7265b, new D3.g(26, this));
    }
}
