package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* loaded from: classes.dex */
public final class Yh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReporterConfig f6908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0651li f6909b;

    public Yh(C0651li c0651li, ReporterConfig reporterConfig) {
        this.f6909b = c0651li;
        this.f6908a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0651li c0651li = this.f6909b;
        ReporterConfig reporterConfig = this.f6908a;
        C0944x0 c0944x0 = c0651li.f7831a;
        Context context = c0651li.f7834d;
        c0944x0.getClass();
        C0918w0.a(context).f().a(reporterConfig);
    }
}
