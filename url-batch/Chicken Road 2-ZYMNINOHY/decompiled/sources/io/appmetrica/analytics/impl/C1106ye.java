package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.ye, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1106ye implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0984tm fromModel(C1080xe c1080xe) {
        C0984tm c0984tm = new C0984tm();
        c0984tm.f12790a = c1080xe.f13024a;
        c0984tm.f12791b = c1080xe.f13025b;
        return c0984tm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C0984tm c0984tm = (C0984tm) obj;
        return new C1080xe(c0984tm.f12790a, c0984tm.f12791b);
    }

    public final C1080xe a(C0984tm c0984tm) {
        return new C1080xe(c0984tm.f12790a, c0984tm.f12791b);
    }
}
