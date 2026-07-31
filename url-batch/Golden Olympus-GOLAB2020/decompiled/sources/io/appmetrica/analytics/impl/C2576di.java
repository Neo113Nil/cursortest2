package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* renamed from: io.appmetrica.analytics.impl.di, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2576di implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3000u0 f38853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f38854b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f38855c;

    public C2576di(C3000u0 c3000u0, Context context, ReporterConfig reporterConfig) {
        this.f38853a = c3000u0;
        this.f38854b = context;
        this.f38855c = reporterConfig;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        C3000u0 c3000u0 = this.f38853a;
        Context context = this.f38854b;
        ReporterConfig reporterConfig = this.f38855c;
        c3000u0.getClass();
        return C2974t0.a(context).f().c(reporterConfig);
    }
}
