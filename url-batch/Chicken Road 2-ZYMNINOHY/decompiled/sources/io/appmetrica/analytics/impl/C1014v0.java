package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1014v0 implements Ba {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f12862a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f12863b;

    /* renamed from: c, reason: collision with root package name */
    public final C0578e4 f12864c;

    public C1014v0() {
        IHandlerExecutor a3 = C0501b4.l().g().a();
        this.f12863b = a3;
        this.f12862a = a3.getHandler();
        this.f12864c = new C0578e4();
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final void a(AppMetricaConfig appMetricaConfig, Ta ta) {
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final Handler b() {
        return this.f12862a;
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final S1 c() {
        return new S1();
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final C0740kb d() {
        return new C0740kb();
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final ICommonExecutor getDefaultExecutor() {
        return this.f12863b;
    }

    @Override // io.appmetrica.analytics.impl.Ba
    public final C0578e4 a() {
        return this.f12864c;
    }
}
