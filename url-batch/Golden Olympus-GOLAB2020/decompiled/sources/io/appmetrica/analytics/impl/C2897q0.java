package io.appmetrica.analytics.impl;

import android.os.Handler;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2897q0 implements Wa {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f39642a;

    /* renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f39643b;

    /* renamed from: c, reason: collision with root package name */
    public final C3134z4 f39644c;

    public C2897q0() {
        IHandlerExecutor a4 = C3082x4.l().g().a();
        this.f39643b = a4;
        this.f39642a = a4.getHandler();
        this.f39644c = new C3134z4();
    }

    @Override // io.appmetrica.analytics.impl.Wa
    public final void a(AppMetricaConfig appMetricaConfig, @NonNull InterfaceC2856ob interfaceC2856ob) {
    }

    @Override // io.appmetrica.analytics.impl.Wa
    @NonNull
    public final Handler b() {
        return this.f39642a;
    }

    @Override // io.appmetrica.analytics.impl.Wa
    @NonNull
    public final Y1 c() {
        return new Y1();
    }

    @Override // io.appmetrica.analytics.impl.Wa
    @NonNull
    public final Fb d() {
        return new Fb();
    }

    @Override // io.appmetrica.analytics.impl.Wa
    @NonNull
    public final ICommonExecutor getDefaultExecutor() {
        return this.f39643b;
    }

    @Override // io.appmetrica.analytics.impl.Wa
    @NonNull
    public final C3134z4 a() {
        return this.f39644c;
    }
}
