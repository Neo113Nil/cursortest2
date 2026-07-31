package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;

/* loaded from: classes3.dex */
public final class Ac extends Tn {

    /* renamed from: b, reason: collision with root package name */
    public final AppMetricaConfig f37175b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ac(@NonNull InterfaceC2856ob interfaceC2856ob, @NonNull AppMetricaConfig appMetricaConfig) {
        super(interfaceC2856ob);
        String str = appMetricaConfig.apiKey;
        this.f37175b = appMetricaConfig;
    }

    @NonNull
    public final InterfaceC2882pb a() {
        return this.f38335a.a().a(this.f37175b);
    }
}
