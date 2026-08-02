package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;

/* renamed from: io.appmetrica.analytics.impl.fc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0612fc extends Wn {

    /* renamed from: b, reason: collision with root package name */
    public final AppMetricaConfig f11834b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0612fc(Ta ta, AppMetricaConfig appMetricaConfig) {
        super(ta);
        String str = appMetricaConfig.apiKey;
        this.f11834b = appMetricaConfig;
    }

    public final Ua a() {
        return this.f11215a.a().a(this.f11834b);
    }
}
