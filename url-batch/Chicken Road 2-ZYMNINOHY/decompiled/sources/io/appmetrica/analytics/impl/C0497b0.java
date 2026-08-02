package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0497b0 {

    /* renamed from: a, reason: collision with root package name */
    public final C1118z0 f11447a;

    /* renamed from: b, reason: collision with root package name */
    public final Wk f11448b;

    /* renamed from: c, reason: collision with root package name */
    public final R3 f11449c;

    /* renamed from: d, reason: collision with root package name */
    public final long f11450d = TimeUnit.SECONDS.toMillis(10);

    public C0497b0(C1118z0 c1118z0, Wk wk, R3 r32) {
        this.f11447a = c1118z0;
        this.f11448b = wk;
        this.f11449c = r32;
    }

    public final synchronized void a(Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        this.f11447a.getClass();
        if (C1118z0.a()) {
            return;
        }
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Session autotracking enabled", new Object[0]);
        this.f11448b.a();
        this.f11447a.getClass();
        C1092y0 a3 = C1092y0.a(context);
        a3.f13048d.a(null, a3);
        IHandlerExecutor a4 = this.f11449c.a();
        ((C1127z9) a4).f13097b.post(new Q1.a(this, context, appMetricaLibraryAdapterConfig, 12));
        this.f11447a.getClass();
        C1118z0.b();
    }

    public static final void a(C0497b0 c0497b0, Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        c0497b0.f11447a.getClass();
        C1092y0 a3 = C1092y0.a(context);
        a3.f().a(appMetricaLibraryAdapterConfig);
        C0501b4.l().f11457c.a().execute(new RunnableC1041w1(a3.f13045a));
    }
}
