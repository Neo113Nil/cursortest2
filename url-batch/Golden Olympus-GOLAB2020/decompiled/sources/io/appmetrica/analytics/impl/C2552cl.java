package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.cl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2552cl implements InterfaceC3034v8 {

    /* renamed from: a, reason: collision with root package name */
    public final C2786lj f38789a;

    /* renamed from: b, reason: collision with root package name */
    public final Rf f38790b;

    public C2552cl() {
        this(new C2786lj(), new Rf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Qi> fromModel(@NonNull C2525bl c2525bl) {
        O8 o8 = new O8();
        o8.f38066a = 2;
        o8.f38068c = new L8();
        Qi fromModel = this.f38789a.fromModel(c2525bl.f38740b);
        o8.f38068c.f37917b = (K8) fromModel.f38171a;
        Qi fromModel2 = this.f38790b.fromModel(c2525bl.f38739a);
        o8.f38068c.f37916a = (H8) fromModel2.f38171a;
        return Collections.singletonList(new Qi(o8, new C3055w3(C3055w3.b(fromModel, fromModel2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C2552cl(C2786lj c2786lj, Rf rf) {
        this.f38789a = c2786lj;
        this.f38790b = rf;
    }

    @NonNull
    public final C2525bl a(@NonNull List<Qi> list) {
        throw new UnsupportedOperationException();
    }
}
