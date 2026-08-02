package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes.dex */
public final class Wj extends AbstractC0650lh {
    public Wj(L6 l6) {
        super(l6);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0650lh, io.appmetrica.analytics.impl.InterfaceC0676mh
    public final boolean a(Boolean bool) {
        return !this.f7830a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
