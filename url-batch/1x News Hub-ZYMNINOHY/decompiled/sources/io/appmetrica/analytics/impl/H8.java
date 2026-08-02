package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public final class H8 implements InterfaceC0916vo {

    /* renamed from: a, reason: collision with root package name */
    public final M8 f6064a;

    public H8() {
        this(new M8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0916vo
    public final byte[] a(S8 s8, C0754ph c0754ph) {
        String str = s8.f6612b;
        return ((L8) this.f6064a.f6326a.a(s8.o)).a(str != null ? StringUtils.getUTF8Bytes(str) : new byte[0]);
    }

    public H8(M8 m8) {
        this.f6064a = m8;
    }
}
