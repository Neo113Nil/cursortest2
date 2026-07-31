package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class Em implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3048vm fromModel(@NotNull Dm dm) {
        C3048vm c3048vm = new C3048vm();
        c3048vm.f39987a = dm.f37383a;
        return c3048vm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Dm(((C3048vm) obj).f39987a);
    }

    @NotNull
    public final Dm a(@NotNull C3048vm c3048vm) {
        return new Dm(c3048vm.f39987a);
    }
}
