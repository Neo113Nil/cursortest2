package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes3.dex */
public final class Mf extends La {
    public Mf(int i4) {
        super(i4);
    }

    @Override // io.appmetrica.analytics.impl.La
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int b(Y y4) {
        if (y4 == null) {
            return 0;
        }
        return StringUtils.getUtf8BytesLength(y4.f38544b) + 12;
    }
}
