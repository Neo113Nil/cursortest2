package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public final class C8 implements InterfaceC0986to {

    /* renamed from: a, reason: collision with root package name */
    public final H8 f10153a;

    public C8() {
        this(new H8());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0986to
    public final byte[] a(N8 n8, C0746kh c0746kh) {
        String str = n8.f10694b;
        return ((G8) this.f10153a.f10361a.a(n8.o)).a(str != null ? StringUtils.getUTF8Bytes(str) : new byte[0]);
    }

    public C8(H8 h8) {
        this.f10153a = h8;
    }
}
