package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public final class Y implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final D7 f7717a;

    /* renamed from: b, reason: collision with root package name */
    public final C1155za f7718b;

    public Y() {
        this(new D7(), new C1155za(20));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(Z z) {
        C0715i8 c0715i8 = new C0715i8();
        c0715i8.f8397b = this.f7717a.fromModel(z.f7760a);
        On a6 = this.f7718b.a(z.f7761b);
        c0715i8.f8396a = StringUtils.getUTF8Bytes((String) a6.f7230a);
        return new Ii(c0715i8, new C0710i3(C0710i3.b(a6)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Y(D7 d7, C1155za c1155za) {
        this.f7717a = d7;
        this.f7718b = c1155za;
    }

    public final Z a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
