package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class I5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final List f10423a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f10424b = C0817na.k().w().a();

    /* renamed from: c, reason: collision with root package name */
    public final WaitForActivationDelayBarrier f10425c = C0817na.k().a();

    public I5(List list) {
        this.f10423a = list;
    }

    public static final void a(I5 i5) {
        Iterator it = i5.f10423a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10425c.subscribe(TimeUnit.SECONDS.toMillis(10L), this.f10424b, new io.appmetrica.analytics.flutter.pigeon.a(2, this));
    }
}
