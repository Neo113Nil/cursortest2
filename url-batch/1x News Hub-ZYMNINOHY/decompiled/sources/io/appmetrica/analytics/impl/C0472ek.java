package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.ek, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0472ek implements ServiceComponentModuleConfig {

    /* renamed from: a, reason: collision with root package name */
    public final C0896v4 f7289a;

    public C0472ek(C0896v4 c0896v4) {
        this.f7289a = c0896v4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig
    public final boolean isRevenueAutoTrackingEnabled() {
        return ((Boolean) WrapUtils.getOrDefault(this.f7289a.f8488m, Boolean.TRUE)).booleanValue();
    }
}
