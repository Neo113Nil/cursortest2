package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0375b0 {

    /* renamed from: a, reason: collision with root package name */
    public final C0944x0 f7052a;

    /* renamed from: b, reason: collision with root package name */
    public final C0396bl f7053b;

    /* renamed from: c, reason: collision with root package name */
    public final Z3 f7054c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7055d = TimeUnit.SECONDS.toMillis(10);

    public C0375b0(C0944x0 c0944x0, C0396bl c0396bl, Z3 z3) {
        this.f7052a = c0944x0;
        this.f7053b = c0396bl;
        this.f7054c = z3;
    }

    public final synchronized void a(Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        this.f7052a.getClass();
        if (C0944x0.a()) {
            return;
        }
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Session autotracking enabled", new Object[0]);
        this.f7053b.a();
        this.f7052a.getClass();
        C0918w0 a3 = C0918w0.a(context);
        a3.f8542d.a(null, a3);
        IHandlerExecutor a4 = this.f7054c.a();
        ((G9) a4).f6035b.post(new A0.a(this, context, appMetricaLibraryAdapterConfig, 9));
        this.f7052a.getClass();
        C0944x0.b();
    }

    public static final void a(C0375b0 c0375b0, Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        c0375b0.f7052a.getClass();
        C0918w0 a3 = C0918w0.a(context);
        a3.f().a(appMetricaLibraryAdapterConfig);
        C0585j4.l().f7594c.a().execute(new RunnableC0893v1(a3.f8539a));
    }
}
