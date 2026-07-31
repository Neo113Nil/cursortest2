package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.g3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0190g3 implements ProtobufConverter {
    public final C0438pm a(C0138e3 c0138e3) {
        C0438pm c0438pm = new C0438pm();
        c0438pm.f1440a = c0138e3.f1229a;
        return c0438pm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        C0438pm c0438pm = new C0438pm();
        c0438pm.f1440a = ((C0138e3) obj).f1229a;
        return c0438pm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C0138e3(((C0438pm) obj).f1440a);
    }

    public final C0138e3 a(C0438pm c0438pm) {
        return new C0138e3(c0438pm.f1440a);
    }
}
