package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.sa, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0500sa extends C0475ra {
    public C0500sa(int i, int i2) {
        this(i, new C0525ta(i2));
    }

    public final int a(String str) {
        return StringUtils.getUTF8Bytes(str).length;
    }

    @Override // io.appmetrica.analytics.impl.C0475ra
    public final int b(Object obj) {
        return StringUtils.getUTF8Bytes((String) obj).length;
    }

    public C0500sa(int i, C0525ta c0525ta) {
        super(i, c0525ta);
    }
}
