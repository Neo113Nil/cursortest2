package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes.dex */
public final class Ee implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0966xm fromModel(De de) {
        C0966xm c0966xm = new C0966xm();
        c0966xm.f8625a = de.f5898a;
        c0966xm.f8626b = de.f5899b;
        return c0966xm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C0966xm c0966xm = (C0966xm) obj;
        return new De(c0966xm.f8625a, c0966xm.f8626b);
    }

    public final De a(C0966xm c0966xm) {
        return new De(c0966xm.f8625a, c0966xm.f8626b);
    }
}
