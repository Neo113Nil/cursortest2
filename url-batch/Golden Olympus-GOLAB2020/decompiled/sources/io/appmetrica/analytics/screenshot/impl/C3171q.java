package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.collections.AbstractC3219i;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.screenshot.impl.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3171q implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final L fromModel(@NotNull C3169o c3169o) {
        L l4 = new L();
        l4.f40706a = c3169o.f40776a;
        Object[] array = c3169o.f40777b.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        l4.f40708c = (String[]) array;
        l4.f40707b = c3169o.f40778c;
        return l4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3169o toModel(@NotNull L l4) {
        return new C3169o(l4.f40706a, AbstractC3219i.G0(l4.f40708c), l4.f40707b);
    }
}
