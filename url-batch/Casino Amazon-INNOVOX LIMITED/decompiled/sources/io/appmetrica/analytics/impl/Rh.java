package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes3.dex */
public final class Rh implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0665z0 f1029a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ReporterConfig c;

    public Rh(C0665z0 c0665z0, Context context, ReporterConfig reporterConfig) {
        this.f1029a = c0665z0;
        this.b = context;
        this.c = reporterConfig;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        C0665z0 c0665z0 = this.f1029a;
        Context context = this.b;
        ReporterConfig reporterConfig = this.c;
        c0665z0.getClass();
        return C0640y0.a(context).f().c(reporterConfig);
    }
}
