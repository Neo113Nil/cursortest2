package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.ra, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0920ra extends C0895qa {
    public C0920ra(int i4, int i5) {
        this(i4, new C0946sa(i5));
    }

    public final int a(String str) {
        return StringUtils.getUTF8Bytes(str).length;
    }

    @Override // io.appmetrica.analytics.impl.C0895qa
    public final int b(Object obj) {
        return StringUtils.getUTF8Bytes((String) obj).length;
    }

    public C0920ra(int i4, C0946sa c0946sa) {
        super(i4, c0946sa);
    }
}
