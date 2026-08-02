package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.yf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1107yf extends C0895qa {
    public C1107yf(int i4) {
        super(i4);
    }

    @Override // io.appmetrica.analytics.impl.C0895qa
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int b(Z z) {
        if (z == null) {
            return 0;
        }
        return StringUtils.getUtf8BytesLength(z.f11331b) + 12;
    }
}
