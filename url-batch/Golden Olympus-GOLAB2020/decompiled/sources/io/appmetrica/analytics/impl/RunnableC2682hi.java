package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* renamed from: io.appmetrica.analytics.impl.hi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2682hi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f39153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2992ti f39154b;

    public RunnableC2682hi(C2992ti c2992ti, ReporterConfig reporterConfig) {
        this.f39154b = c2992ti;
        this.f39153a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2992ti c2992ti = this.f39154b;
        ReporterConfig reporterConfig = this.f39153a;
        C3000u0 c3000u0 = c2992ti.f39864a;
        Context context = c2992ti.f39867d;
        c3000u0.getClass();
        C2974t0.a(context).f().a(reporterConfig);
    }
}
