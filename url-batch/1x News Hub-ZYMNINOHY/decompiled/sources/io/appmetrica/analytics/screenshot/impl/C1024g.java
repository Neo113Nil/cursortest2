package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.screenshot.impl.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1024g implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N fromModel(C1022e c1022e) {
        N n3 = new N();
        n3.f8996a = c1022e.f9035a;
        return n3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C1022e(((N) obj).f8996a);
    }

    public final C1022e a(N n3) {
        return new C1022e(n3.f8996a);
    }
}
