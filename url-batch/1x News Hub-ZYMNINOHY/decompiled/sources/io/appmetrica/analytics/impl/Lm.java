package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes.dex */
public final class Lm implements ProtobufConverter {
    public final C1016zm a(Km km) {
        C1016zm c1016zm = new C1016zm();
        c1016zm.f8714a = km.f6246a;
        return c1016zm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        C1016zm c1016zm = new C1016zm();
        c1016zm.f8714a = ((Km) obj).f6246a;
        return c1016zm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Km(((C1016zm) obj).f8714a);
    }

    public final Km a(C1016zm c1016zm) {
        return new Km(c1016zm.f8714a);
    }
}
