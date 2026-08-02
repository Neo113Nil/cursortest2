package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes.dex */
public final class Y implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final D7 f6879a;

    /* renamed from: b, reason: collision with root package name */
    public final C1004za f6880b;

    public Y() {
        this(new D7(), new C1004za(20));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(Z z) {
        C0564i8 c0564i8 = new C0564i8();
        c0564i8.f7513b = this.f6879a.fromModel(z.f6920a);
        On a3 = this.f6880b.a(z.f6921b);
        c0564i8.f7512a = StringUtils.getUTF8Bytes((String) a3.f6419a);
        return new Ii(c0564i8, new C0559i3(C0559i3.b(a3)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Y(D7 d7, C1004za c1004za) {
        this.f6879a = d7;
        this.f6880b = c1004za;
    }

    public final Z a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
