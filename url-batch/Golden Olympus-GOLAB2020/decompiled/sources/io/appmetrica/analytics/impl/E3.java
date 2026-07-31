package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class E3 implements InterfaceC3034v8 {

    /* renamed from: a, reason: collision with root package name */
    public final F3 f37399a;

    public E3() {
        this(new F3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Qi> fromModel(@NonNull D3 d32) {
        O8 o8 = new O8();
        o8.f38070e = new C3086x8();
        Qi fromModel = this.f37399a.fromModel(d32.f37339b);
        o8.f38070e.f40158a = (C3112y8) fromModel.f38171a;
        o8.f38066a = d32.f37338a;
        return Collections.singletonList(new Qi(o8, new C3055w3(C3055w3.b(fromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public E3(F3 f32) {
        this.f37399a = f32;
    }

    @NonNull
    public final D3 a(@NonNull List<Qi> list) {
        throw new UnsupportedOperationException();
    }
}
