package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;

/* renamed from: io.appmetrica.analytics.impl.mc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0671mc extends Yn {

    /* renamed from: b, reason: collision with root package name */
    public final AppMetricaConfig f7874b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0671mc(InterfaceC0360ab interfaceC0360ab, AppMetricaConfig appMetricaConfig) {
        super(interfaceC0360ab);
        String str = appMetricaConfig.apiKey;
        this.f7874b = appMetricaConfig;
    }

    public final InterfaceC0386bb a() {
        return this.f6919a.a().a(this.f7874b);
    }
}
