package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes.dex */
public final class r implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O fromModel(C1158p c1158p) {
        O o = new O();
        o.f13427a = c1158p.f13497a;
        Object[] array = c1158p.f13498b.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        o.f13429c = (String[]) array;
        o.f13428b = c1158p.f13499c;
        return o;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1158p toModel(O o) {
        return new C1158p(o.f13427a, d3.g.Y(o.f13429c), o.f13428b);
    }
}
