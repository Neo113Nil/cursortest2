package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* loaded from: classes.dex */
public final class Vh implements Provider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0944x0 f6799a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f6800b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f6801c;

    public Vh(C0944x0 c0944x0, Context context, ReporterConfig reporterConfig) {
        this.f6799a = c0944x0;
        this.f6800b = context;
        this.f6801c = reporterConfig;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        C0944x0 c0944x0 = this.f6799a;
        Context context = this.f6800b;
        ReporterConfig reporterConfig = this.f6801c;
        c0944x0.getClass();
        return C0918w0.a(context).f().c(reporterConfig);
    }
}
