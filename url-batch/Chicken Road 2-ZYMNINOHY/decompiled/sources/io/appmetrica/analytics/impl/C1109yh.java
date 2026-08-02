package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.yh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1109yh extends AbstractC0643gh {
    public C1109yh(E6 e6) {
        super(e6);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0643gh, io.appmetrica.analytics.impl.InterfaceC0669hh
    public final boolean a(Boolean bool) {
        return !this.f11934a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
