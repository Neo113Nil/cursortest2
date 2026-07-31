package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Z implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final M fromModel(@NotNull X x4) {
        M m4 = new M();
        m4.f40710a = x4.f40733a;
        m4.f40711b = x4.f40734b;
        return m4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        M m4 = (M) obj;
        return new X(m4.f40710a, m4.f40711b);
    }

    @NotNull
    public final X a(@NotNull M m4) {
        return new X(m4.f40710a, m4.f40711b);
    }
}
