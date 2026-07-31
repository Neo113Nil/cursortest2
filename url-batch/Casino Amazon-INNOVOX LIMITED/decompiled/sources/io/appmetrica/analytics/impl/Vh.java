package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* loaded from: classes3.dex */
public final class Vh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f1092a;
    public final /* synthetic */ C0231hi b;

    public Vh(C0231hi c0231hi, ReporterConfig reporterConfig) {
        this.b = c0231hi;
        this.f1092a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0231hi c0231hi = this.b;
        ReporterConfig reporterConfig = this.f1092a;
        C0665z0 c0665z0 = c0231hi.f1292a;
        Context context = c0231hi.d;
        c0665z0.getClass();
        C0640y0.a(context).f().a(reporterConfig);
    }
}
