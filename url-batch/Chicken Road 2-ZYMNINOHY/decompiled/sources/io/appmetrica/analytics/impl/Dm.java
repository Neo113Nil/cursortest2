package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes.dex */
public final class Dm implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1010um fromModel(Cm cm) {
        C1010um c1010um = new C1010um();
        c1010um.f12855a = cm.f10172a;
        return c1010um;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Cm(((C1010um) obj).f12855a);
    }

    public final Cm a(C1010um c1010um) {
        return new Cm(c1010um.f12855a);
    }
}
