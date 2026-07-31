package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.screenshot.impl.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0695g implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N fromModel(C0693e c0693e) {
        N n = new N();
        n.f1711a = c0693e.f1727a;
        return n;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C0693e(((N) obj).f1711a);
    }

    public final C0693e a(N n) {
        return new C0693e(n.f1711a);
    }
}
