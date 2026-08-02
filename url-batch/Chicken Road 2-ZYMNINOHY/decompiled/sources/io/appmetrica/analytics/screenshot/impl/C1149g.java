package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.screenshot.impl.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1149g implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N fromModel(C1147e c1147e) {
        N n = new N();
        n.f13425a = c1147e.f13464a;
        return n;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C1147e(((N) obj).f13425a);
    }

    public final C1147e a(N n) {
        return new C1147e(n.f13425a);
    }
}
