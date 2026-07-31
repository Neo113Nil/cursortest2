package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes3.dex */
public final class D8 implements uo {

    /* renamed from: a, reason: collision with root package name */
    public final I8 f808a;

    public D8() {
        this(new I8());
    }

    @Override // io.appmetrica.analytics.impl.uo
    public final byte[] a(O8 o8, C0333lh c0333lh) {
        String str = o8.b;
        return ((H8) this.f808a.f888a.a(o8.o)).a(str != null ? StringUtils.getUTF8Bytes(str) : new byte[0]);
    }

    public D8(I8 i8) {
        this.f808a = i8;
    }
}
