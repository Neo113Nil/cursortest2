package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public final class Df extends C1105xa {
    public Df(int i2) {
        super(i2);
    }

    @Override // io.appmetrica.analytics.impl.C1105xa
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int b(Z z) {
        if (z == null) {
            return 0;
        }
        return StringUtils.getUtf8BytesLength(z.f7761b) + 12;
    }
}
