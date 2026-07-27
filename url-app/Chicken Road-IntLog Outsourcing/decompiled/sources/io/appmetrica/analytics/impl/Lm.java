package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes.dex */
public final class Lm implements ProtobufConverter {
    public final C1167zm a(Km km) {
        C1167zm c1167zm = new C1167zm();
        c1167zm.f9676a = km.f7051a;
        return c1167zm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        C1167zm c1167zm = new C1167zm();
        c1167zm.f9676a = ((Km) obj).f7051a;
        return c1167zm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Km(((C1167zm) obj).f9676a);
    }

    public final Km a(C1167zm c1167zm) {
        return new Km(c1167zm.f9676a);
    }
}
