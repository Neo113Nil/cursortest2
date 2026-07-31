package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.ze, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0679ze implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0562um fromModel(C0654ye c0654ye) {
        C0562um c0562um = new C0562um();
        c0562um.f1520a = c0654ye.f1584a;
        c0562um.b = c0654ye.b;
        return c0562um;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C0562um c0562um = (C0562um) obj;
        return new C0654ye(c0562um.f1520a, c0562um.b);
    }

    public final C0654ye a(C0562um c0562um) {
        return new C0654ye(c0562um.f1520a, c0562um.b);
    }
}
