package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public final class H8 implements InterfaceC1067vo {

    /* renamed from: a, reason: collision with root package name */
    public final M8 f6857a;

    public H8() {
        this(new M8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1067vo
    public final byte[] a(S8 s8, C0905ph c0905ph) {
        String str = s8.f7435b;
        return ((L8) this.f6857a.f7135a.a(s8.f7448o)).a(str != null ? StringUtils.getUTF8Bytes(str) : new byte[0]);
    }

    public H8(M8 m8) {
        this.f6857a = m8;
    }
}
