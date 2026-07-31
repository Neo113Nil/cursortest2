package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.ak, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0052ak implements ServiceComponentModuleConfig {

    /* renamed from: a, reason: collision with root package name */
    public final C0420p4 f1169a;

    public C0052ak(C0420p4 c0420p4) {
        this.f1169a = c0420p4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig
    public final boolean isRevenueAutoTrackingEnabled() {
        return ((Boolean) WrapUtils.getOrDefault(this.f1169a.m, Boolean.TRUE)).booleanValue();
    }
}
