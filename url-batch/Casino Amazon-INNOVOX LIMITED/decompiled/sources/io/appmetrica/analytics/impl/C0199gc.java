package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;

/* renamed from: io.appmetrica.analytics.impl.gc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0199gc extends Xn {
    public final AppMetricaConfig b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0199gc(Ua ua, AppMetricaConfig appMetricaConfig) {
        super(ua);
        String str = appMetricaConfig.apiKey;
        this.b = appMetricaConfig;
    }

    public final Va a() {
        return this.f1122a.a().a(this.b);
    }
}
