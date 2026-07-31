package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.dk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2578dk extends AbstractC2991th {
    public C2578dk(@NonNull Z6 z6) {
        super(z6);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2991th, io.appmetrica.analytics.impl.InterfaceC3017uh
    public final boolean a(Boolean bool) {
        return !this.f39863a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }
}
