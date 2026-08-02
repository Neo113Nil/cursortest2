package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public final class B0 implements InterfaceC1052wc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0 f10068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMetricaConfig f10069b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PublicLogger f10070c;

    public B0(C0 c02, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f10068a = c02;
        this.f10069b = appMetricaConfig;
        this.f10070c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1052wc
    public final C0664hc a() {
        C0 c02 = this.f10068a;
        C0721ji c0721ji = c02.f10143g;
        AppMetricaConfig appMetricaConfig = this.f10069b;
        PublicLogger publicLogger = this.f10070c;
        D7 d7 = c02.f10145i;
        return c0721ji.b(appMetricaConfig, publicLogger, new C0755l0(d7.f10187j, d7.f10185h));
    }
}
