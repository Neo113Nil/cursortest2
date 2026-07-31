package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes3.dex */
public final class B0 implements InterfaceC0627xc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0 f769a;
    public final /* synthetic */ AppMetricaConfig b;
    public final /* synthetic */ PublicLogger c;

    public B0(C0 c0, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f769a = c0;
        this.b = appMetricaConfig;
        this.c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0627xc
    public final C0251ic a() {
        C0 c0 = this.f769a;
        C0308ki c0308ki = c0.g;
        AppMetricaConfig appMetricaConfig = this.b;
        PublicLogger publicLogger = this.c;
        E7 e7 = c0.i;
        return c0308ki.b(appMetricaConfig, publicLogger, new C0316l0(e7.j, e7.h));
    }
}
