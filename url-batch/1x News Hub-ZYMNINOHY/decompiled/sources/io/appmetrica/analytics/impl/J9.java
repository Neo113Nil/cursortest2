package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes.dex */
public final class J9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0888um fromModel(I9 i9) {
        C0888um c0888um = new C0888um();
        if (i9 != null) {
            c0888um.f8470a = i9.f6142a;
        }
        return c0888um;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new I9(((C0888um) obj).f8470a);
    }

    public final I9 a(C0888um c0888um) {
        return new I9(c0888um.f8470a);
    }
}
