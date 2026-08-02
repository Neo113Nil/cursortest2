package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.n3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0688n3 implements ProtobufConverter {
    public final C0836sm a(C0636l3 c0636l3) {
        C0836sm c0836sm = new C0836sm();
        c0836sm.f8326a = c0636l3.f7751a;
        return c0836sm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        C0836sm c0836sm = new C0836sm();
        c0836sm.f8326a = ((C0636l3) obj).f7751a;
        return c0836sm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C0636l3(((C0836sm) obj).f8326a);
    }

    public final C0636l3 a(C0836sm c0836sm) {
        return new C0636l3(c0836sm.f8326a);
    }
}
