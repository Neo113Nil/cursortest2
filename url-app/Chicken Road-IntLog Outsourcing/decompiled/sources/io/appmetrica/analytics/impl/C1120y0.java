package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1120y0 implements Dc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A0 f9585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMetricaConfig f9586b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PublicLogger f9587c;

    public C1120y0(A0 a02, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f9585a = a02;
        this.f9586b = appMetricaConfig;
        this.f9587c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.Dc
    public final C0874oc a() {
        A0 a02 = this.f9585a;
        C0880oi c0880oi = a02.f6487g;
        AppMetricaConfig appMetricaConfig = this.f9586b;
        PublicLogger publicLogger = this.f9587c;
        L7 l7 = a02.f6489i;
        return c0880oi.a(appMetricaConfig, publicLogger, new C0784l0(l7.f7077j, l7.f7075h));
    }
}
