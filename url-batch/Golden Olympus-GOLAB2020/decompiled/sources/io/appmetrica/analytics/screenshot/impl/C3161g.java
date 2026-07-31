package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.screenshot.impl.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3161g implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K fromModel(@NotNull C3159e c3159e) {
        K k4 = new K();
        k4.f40704a = c3159e.f40751a;
        return k4;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C3159e(((K) obj).f40704a);
    }

    @NotNull
    public final C3159e a(@NotNull K k4) {
        return new C3159e(k4.f40704a);
    }
}
