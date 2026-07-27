package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes.dex */
public final class Ee implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1117xm fromModel(De de) {
        C1117xm c1117xm = new C1117xm();
        c1117xm.f9581a = de.f6683a;
        c1117xm.f9582b = de.f6684b;
        return c1117xm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C1117xm c1117xm = (C1117xm) obj;
        return new De(c1117xm.f9581a, c1117xm.f9582b);
    }

    public final De a(C1117xm c1117xm) {
        return new De(c1117xm.f9581a, c1117xm.f9582b);
    }
}
