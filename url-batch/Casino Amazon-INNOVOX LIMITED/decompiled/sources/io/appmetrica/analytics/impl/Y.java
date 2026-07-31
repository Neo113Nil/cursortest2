package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes3.dex */
public final class Y implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0597w7 f1123a;
    public final C0525ta b;

    public Y() {
        this(new C0597w7(), new C0525ta(20));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(Z z) {
        C0118d8 c0118d8 = new C0118d8();
        c0118d8.b = this.f1123a.fromModel(z.f1136a);
        Nn a2 = this.b.a(z.b);
        c0118d8.f1211a = StringUtils.getUTF8Bytes((String) a2.f977a);
        return new Ei(c0118d8, new C0061b3(C0061b3.b(a2)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Y(C0597w7 c0597w7, C0525ta c0525ta) {
        this.f1123a = c0597w7;
        this.b = c0525ta;
    }

    public final Z a(Ei ei) {
        throw new UnsupportedOperationException();
    }
}
