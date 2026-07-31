package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes3.dex */
public final class F3 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Rf f37497a;

    /* renamed from: b, reason: collision with root package name */
    public final R7 f37498b;

    /* renamed from: c, reason: collision with root package name */
    public final Lf f37499c;

    /* renamed from: d, reason: collision with root package name */
    public final C2990tg f37500d;

    public F3() {
        this(new Rf(), new R7(), new Lf(), new C2990tg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(@NonNull G3 g32) {
        Qi qi;
        C3112y8 c3112y8 = new C3112y8();
        Qi fromModel = this.f37497a.fromModel(g32.f37554a);
        c3112y8.f40263a = (H8) fromModel.f38171a;
        c3112y8.f40265c = this.f37498b.fromModel(g32.f37555b);
        Qi fromModel2 = this.f37499c.fromModel(g32.f37556c);
        c3112y8.f40266d = (G8) fromModel2.f38171a;
        Kg kg = g32.f37557d;
        if (kg != null) {
            qi = this.f37500d.fromModel(kg);
            c3112y8.f40264b = (J8) qi.f38171a;
        } else {
            qi = null;
        }
        return new Qi(c3112y8, new C3055w3(C3055w3.b(fromModel, fromModel2, qi)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public F3(Rf rf, R7 r7, Lf lf, C2990tg c2990tg) {
        this.f37497a = rf;
        this.f37498b = r7;
        this.f37499c = lf;
        this.f37500d = c2990tg;
    }

    @NonNull
    public final G3 a(@NonNull Qi qi) {
        throw new UnsupportedOperationException();
    }
}
