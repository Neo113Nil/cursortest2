package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes3.dex */
public final class D9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0487rm fromModel(C9 c9) {
        C0487rm c0487rm = new C0487rm();
        if (c9 != null) {
            c0487rm.f1472a = c9.f793a;
        }
        return c0487rm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C9(((C0487rm) obj).f1472a);
    }

    public final C9 a(C0487rm c0487rm) {
        return new C9(c0487rm.f1472a);
    }
}
