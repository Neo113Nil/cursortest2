package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes3.dex */
public final class Lh extends AbstractC2991th {
    public Lh(Z6 z6) {
        super(z6);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2991th, io.appmetrica.analytics.impl.InterfaceC3017uh
    public final boolean a(Boolean bool) {
        return !this.f39863a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
