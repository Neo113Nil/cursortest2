package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class X9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2944rm fromModel(@Nullable W9 w9) {
        C2944rm c2944rm = new C2944rm();
        if (w9 != null) {
            c2944rm.f39755a = w9.f38461a;
        }
        return c2944rm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new W9(((C2944rm) obj).f39755a);
    }

    @NotNull
    public final W9 a(@NotNull C2944rm c2944rm) {
        return new W9(c2944rm.f39755a);
    }
}
