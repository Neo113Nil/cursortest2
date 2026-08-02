package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes.dex */
public final class Zj implements ServiceComponentModuleConfig {

    /* renamed from: a, reason: collision with root package name */
    public final C0837o4 f11396a;

    public Zj(C0837o4 c0837o4) {
        this.f11396a = c0837o4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig
    public final boolean isRevenueAutoTrackingEnabled() {
        return ((Boolean) WrapUtils.getOrDefault(this.f11396a.f12496m, Boolean.TRUE)).booleanValue();
    }
}
