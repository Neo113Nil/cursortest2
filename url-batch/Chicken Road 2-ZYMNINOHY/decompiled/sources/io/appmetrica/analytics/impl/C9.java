package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes.dex */
public final class C9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0907qm fromModel(B9 b9) {
        C0907qm c0907qm = new C0907qm();
        if (b9 != null) {
            c0907qm.f12629a = b9.f10094a;
        }
        return c0907qm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new B9(((C0907qm) obj).f12629a);
    }

    public final B9 a(C0907qm c0907qm) {
        return new B9(c0907qm.f12629a);
    }
}
