package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0994z0 implements Dc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A0 f8656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMetricaConfig f8657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PublicLogger f8658c;

    public C0994z0(A0 a02, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.f8656a = a02;
        this.f8657b = appMetricaConfig;
        this.f8658c = publicLogger;
    }

    @Override // io.appmetrica.analytics.impl.Dc
    public final C0723oc a() {
        A0 a02 = this.f8656a;
        C0729oi c0729oi = a02.f5713g;
        AppMetricaConfig appMetricaConfig = this.f8657b;
        PublicLogger publicLogger = this.f8658c;
        L7 l7 = a02.f5715i;
        return c0729oi.b(appMetricaConfig, publicLogger, new C0633l0(l7.f6271j, l7.f6269h));
    }
}
