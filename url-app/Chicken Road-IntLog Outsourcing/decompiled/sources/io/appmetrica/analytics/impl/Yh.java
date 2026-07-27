package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* loaded from: classes.dex */
public final class Yh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f7748a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0802li f7749b;

    public Yh(C0802li c0802li, ReporterConfig reporterConfig) {
        this.f7749b = c0802li;
        this.f7748a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0802li c0802li = this.f7749b;
        ReporterConfig reporterConfig = this.f7748a;
        C1095x0 c1095x0 = c0802li.f8739a;
        Context context = c0802li.f8742d;
        c1095x0.getClass();
        C1069w0.a(context).f().a(reporterConfig);
    }
}
