package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* renamed from: io.appmetrica.analytics.impl.gi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2656gi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f39094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2992ti f39095b;

    public RunnableC2656gi(C2992ti c2992ti, ReporterConfig reporterConfig) {
        this.f39095b = c2992ti;
        this.f39094a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2992ti c2992ti = this.f39095b;
        ReporterConfig reporterConfig = this.f39094a;
        C3000u0 c3000u0 = c2992ti.f39864a;
        Context context = c2992ti.f39867d;
        c3000u0.getClass();
        C2974t0.a(context).f().a(reporterConfig);
    }
}
