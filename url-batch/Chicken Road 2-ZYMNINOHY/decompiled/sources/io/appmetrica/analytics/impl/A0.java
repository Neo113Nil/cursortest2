package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public final class A0 implements InterfaceC1052wc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0 f9995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMetricaConfig f9996b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PublicLogger f9997c;

    public A0(C0 c02, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f9995a = c02;
        this.f9996b = appMetricaConfig;
        this.f9997c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1052wc
    public final C0664hc a() {
        C0 c02 = this.f9995a;
        C0721ji c0721ji = c02.f10143g;
        AppMetricaConfig appMetricaConfig = this.f9996b;
        PublicLogger publicLogger = this.f9997c;
        D7 d7 = c02.f10145i;
        return c0721ji.a(appMetricaConfig, publicLogger, new C0755l0(d7.f10187j, d7.f10185h));
    }
}
