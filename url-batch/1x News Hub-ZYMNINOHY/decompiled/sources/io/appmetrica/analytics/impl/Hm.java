package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes.dex */
public final class Hm implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0991ym fromModel(Gm gm) {
        C0991ym c0991ym = new C0991ym();
        c0991ym.f8648a = gm.f6054a;
        return c0991ym;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Gm(((C0991ym) obj).f8648a);
    }

    public final Gm a(C0991ym c0991ym) {
        return new Gm(c0991ym.f8648a);
    }
}
