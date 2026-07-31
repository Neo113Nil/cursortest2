package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.collections.ArraysKt;

/* loaded from: classes3.dex */
public final class r implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O fromModel(C0704p c0704p) {
        O o = new O();
        o.f1712a = c0704p.f1742a;
        Object[] array = c0704p.b.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        o.c = (String[]) array;
        o.b = c0704p.c;
        return o;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0704p toModel(O o) {
        return new C0704p(o.f1712a, ArraysKt.toList(o.c), o.b);
    }
}
