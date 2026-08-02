package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes.dex */
public final class Qh implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1118z0 f10844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f10845b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f10846c;

    public Qh(C1118z0 c1118z0, Context context, ReporterConfig reporterConfig) {
        this.f10844a = c1118z0;
        this.f10845b = context;
        this.f10846c = reporterConfig;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        C1118z0 c1118z0 = this.f10844a;
        Context context = this.f10845b;
        ReporterConfig reporterConfig = this.f10846c;
        c1118z0.getClass();
        return C1092y0.a(context).f().c(reporterConfig);
    }
}
