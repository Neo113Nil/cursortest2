package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes.dex */
public final class Rj extends AbstractC0643gh {
    public Rj(E6 e6) {
        super(e6);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0643gh, io.appmetrica.analytics.impl.InterfaceC0669hh
    public final boolean a(Boolean bool) {
        return !this.f11934a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
