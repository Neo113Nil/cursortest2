package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes.dex */
public final class Hm implements ProtobufConverter {
    public final C1036vm a(Gm gm) {
        C1036vm c1036vm = new C1036vm();
        c1036vm.f12904a = gm.f10340a;
        return c1036vm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        C1036vm c1036vm = new C1036vm();
        c1036vm.f12904a = ((Gm) obj).f10340a;
        return c1036vm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Gm(((C1036vm) obj).f12904a);
    }

    public final Gm a(C1036vm c1036vm) {
        return new Gm(c1036vm.f12904a);
    }
}
