package io.appmetrica.analytics.screenshot.impl;

import g4.AbstractC0464i;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes.dex */
public final class r implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O fromModel(C1184p c1184p) {
        O o2 = new O();
        o2.f9978a = c1184p.f10048a;
        Object[] array = c1184p.f10049b.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        o2.f9980c = (String[]) array;
        o2.f9979b = c1184p.f10050c;
        return o2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1184p toModel(O o2) {
        return new C1184p(o2.f9978a, AbstractC0464i.a0(o2.f9980c), o2.f9979b);
    }
}
