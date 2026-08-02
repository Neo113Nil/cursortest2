package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.ya, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0979ya extends C0954xa {
    public C0979ya(int i3, int i4) {
        this(i3, new C1004za(i4));
    }

    public final int a(String str) {
        return StringUtils.getUTF8Bytes(str).length;
    }

    @Override // io.appmetrica.analytics.impl.C0954xa
    public final int b(Object obj) {
        return StringUtils.getUTF8Bytes((String) obj).length;
    }

    public C0979ya(int i3, C1004za c1004za) {
        super(i3, c1004za);
    }
}
