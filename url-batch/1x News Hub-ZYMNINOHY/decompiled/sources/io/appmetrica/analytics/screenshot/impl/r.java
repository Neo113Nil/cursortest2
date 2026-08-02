package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes.dex */
public final class r implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O fromModel(C1033p c1033p) {
        O o = new O();
        o.f8998a = c1033p.f9067a;
        Object[] array = c1033p.f9068b.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        o.f9000c = (String[]) array;
        o.f8999b = c1033p.f9069c;
        return o;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1033p toModel(O o) {
        return new C1033p(o.f8998a, c2.c.X(o.f9000c), o.f8999b);
    }
}
