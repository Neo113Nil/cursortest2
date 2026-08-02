package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.lg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0649lg implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0446dj f7827a;

    /* renamed from: b, reason: collision with root package name */
    public final C1004za f7828b;

    /* renamed from: c, reason: collision with root package name */
    public final C1004za f7829c;

    public C0649lg() {
        this(new C0446dj(), new C1004za(100), new C1004za(2048));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(Cg cg) {
        Ii ii;
        C0900v8 c0900v8 = new C0900v8();
        On a3 = this.f7828b.a(cg.f5850a);
        c0900v8.f8504a = StringUtils.getUTF8Bytes((String) a3.f6419a);
        On a4 = this.f7829c.a(cg.f5851b);
        c0900v8.f8505b = StringUtils.getUTF8Bytes((String) a4.f6419a);
        C0549hj c0549hj = cg.f5852c;
        if (c0549hj != null) {
            ii = this.f7827a.fromModel(c0549hj);
            c0900v8.f8506c = (C0926w8) ii.f6160a;
        } else {
            ii = null;
        }
        return new Ii(c0900v8, new C0559i3(C0559i3.b(a3, a4, ii)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0649lg(C0446dj c0446dj, C1004za c1004za, C1004za c1004za2) {
        this.f7827a = c0446dj;
        this.f7828b = c1004za;
        this.f7829c = c1004za2;
    }

    public final Cg a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
