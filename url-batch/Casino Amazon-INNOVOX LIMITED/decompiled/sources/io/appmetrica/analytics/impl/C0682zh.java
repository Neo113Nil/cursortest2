package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.zh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0682zh extends AbstractC0230hh {
    public C0682zh(F6 f6) {
        super(f6);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0230hh, io.appmetrica.analytics.impl.InterfaceC0255ih
    public final boolean a(Boolean bool) {
        return !this.f1291a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
