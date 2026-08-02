package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public final class Df extends C0954xa {
    public Df(int i3) {
        super(i3);
    }

    @Override // io.appmetrica.analytics.impl.C0954xa
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int b(Z z) {
        if (z == null) {
            return 0;
        }
        return StringUtils.getUtf8BytesLength(z.f6921b) + 12;
    }
}
