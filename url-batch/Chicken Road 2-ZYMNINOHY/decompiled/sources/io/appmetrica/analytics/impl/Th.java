package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* loaded from: classes.dex */
public final class Th implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f11004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0644gi f11005b;

    public Th(C0644gi c0644gi, ReporterConfig reporterConfig) {
        this.f11005b = c0644gi;
        this.f11004a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0644gi c0644gi = this.f11005b;
        ReporterConfig reporterConfig = this.f11004a;
        C1118z0 c1118z0 = c0644gi.f11935a;
        Context context = c0644gi.f11938d;
        c1118z0.getClass();
        C1092y0.a(context).f().a(reporterConfig);
    }
}
