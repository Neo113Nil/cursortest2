package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.zf, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0680zf extends C0475ra {
    public C0680zf(int i) {
        super(i);
    }

    @Override // io.appmetrica.analytics.impl.C0475ra
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int b(Z z) {
        if (z == null) {
            return 0;
        }
        return StringUtils.getUtf8BytesLength(z.b) + 12;
    }
}
