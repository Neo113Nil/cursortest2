package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes.dex */
public final class Hm implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1142ym fromModel(Gm gm) {
        C1142ym c1142ym = new C1142ym();
        c1142ym.f9604a = gm.f6847a;
        return c1142ym;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Gm(((C1142ym) obj).f9604a);
    }

    public final Gm a(C1142ym c1142ym) {
        return new Gm(c1142ym.f9604a);
    }
}
