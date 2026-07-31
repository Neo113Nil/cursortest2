package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes3.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final C3000u0 f38586a;

    /* renamed from: b, reason: collision with root package name */
    public final Xk f38587b;

    /* renamed from: c, reason: collision with root package name */
    public final C2823n4 f38588c;

    public Z(C3000u0 c3000u0, Xk xk, C2823n4 c2823n4) {
        this.f38586a = c3000u0;
        this.f38587b = xk;
        this.f38588c = c2823n4;
    }

    public final void a(final Context context, final AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        boolean z4;
        PublicLogger mainPublicOrAnonymousLogger = LoggerStorage.getMainPublicOrAnonymousLogger();
        this.f38586a.getClass();
        synchronized (C2974t0.class) {
            z4 = C2974t0.f39821f;
        }
        if (!z4) {
            mainPublicOrAnonymousLogger.info("Session autotracking enabled", new Object[0]);
            this.f38587b.a();
        }
        this.f38586a.getClass();
        C2974t0 a4 = C2974t0.a(context);
        a4.f39826d.a(null, a4);
        IHandlerExecutor a5 = this.f38588c.a();
        ((U9) a5).f38354b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.fp
            @Override // java.lang.Runnable
            public final void run() {
                Z.a(Z.this, context, appMetricaLibraryAdapterConfig);
            }
        });
        this.f38586a.getClass();
        C3000u0.a();
    }

    public static final void a(Z z4, Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        z4.f38586a.getClass();
        C2974t0 a4 = C2974t0.a(context);
        a4.f().a(appMetricaLibraryAdapterConfig);
        C3082x4.l().f40118c.a().execute(new RunnableC2949s1(a4.f39823a));
    }
}
