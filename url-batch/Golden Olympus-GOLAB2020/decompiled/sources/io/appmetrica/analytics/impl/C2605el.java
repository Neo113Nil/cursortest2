package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.el, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2605el implements InterfaceC3034v8 {

    /* renamed from: a, reason: collision with root package name */
    public final Rf f38933a;

    /* renamed from: b, reason: collision with root package name */
    public final C2990tg f38934b;

    public C2605el() {
        this(new Rf(), new C2990tg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Qi> fromModel(@NonNull C2579dl c2579dl) {
        Qi qi;
        O8 o8 = new O8();
        o8.f38066a = 3;
        o8.f38069d = new M8();
        Qi fromModel = this.f38933a.fromModel(c2579dl.f38856a);
        o8.f38069d.f37972a = (H8) fromModel.f38171a;
        Kg kg = c2579dl.f38857b;
        if (kg != null) {
            qi = this.f38934b.fromModel(kg);
            o8.f38069d.f37973b = (J8) qi.f38171a;
        } else {
            qi = null;
        }
        return Collections.singletonList(new Qi(o8, new C3055w3(C3055w3.b(fromModel, qi))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C2605el(Rf rf, C2990tg c2990tg) {
        this.f38933a = rf;
        this.f38934b = c2990tg;
    }

    @NonNull
    public final C2579dl a(@NonNull List<Qi> list) {
        throw new UnsupportedOperationException();
    }
}
