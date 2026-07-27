package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.n3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0839n3 implements ProtobufConverter {
    public final C0987sm a(C0787l3 c0787l3) {
        C0987sm c0987sm = new C0987sm();
        c0987sm.f9267a = c0787l3.f8653a;
        return c0987sm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        C0987sm c0987sm = new C0987sm();
        c0987sm.f9267a = ((C0787l3) obj).f8653a;
        return c0987sm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C0787l3(((C0987sm) obj).f9267a);
    }

    public final C0787l3 a(C0987sm c0987sm) {
        return new C0787l3(c0987sm.f9267a);
    }
}
