package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0840t0 implements Ia {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f8329a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f8330b;

    /* renamed from: c, reason: collision with root package name */
    public final C0637l4 f8331c;

    public C0840t0() {
        IHandlerExecutor a3 = C0585j4.l().g().a();
        this.f8330b = a3;
        this.f8329a = a3.getHandler();
        this.f8331c = new C0637l4();
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final void a(AppMetricaConfig appMetricaConfig, InterfaceC0360ab interfaceC0360ab) {
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final Handler b() {
        return this.f8329a;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final C0377b2 c() {
        return new C0377b2();
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final C0799rb d() {
        return new C0799rb();
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final ICommonExecutor getDefaultExecutor() {
        return this.f8330b;
    }

    @Override // io.appmetrica.analytics.impl.Ia
    public final C0637l4 a() {
        return this.f8331c;
    }
}
