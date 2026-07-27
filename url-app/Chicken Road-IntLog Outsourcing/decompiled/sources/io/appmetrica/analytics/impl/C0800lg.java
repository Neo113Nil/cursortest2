package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.lg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0800lg implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0597dj f8735a;

    /* renamed from: b, reason: collision with root package name */
    public final C1155za f8736b;

    /* renamed from: c, reason: collision with root package name */
    public final C1155za f8737c;

    public C0800lg() {
        this(new C0597dj(), new C1155za(100), new C1155za(2048));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(Cg cg) {
        Ii ii;
        C1051v8 c1051v8 = new C1051v8();
        On a6 = this.f8736b.a(cg.f6633a);
        c1051v8.f9456a = StringUtils.getUTF8Bytes((String) a6.f7230a);
        On a7 = this.f8737c.a(cg.f6634b);
        c1051v8.f9457b = StringUtils.getUTF8Bytes((String) a7.f7230a);
        C0700hj c0700hj = cg.f6635c;
        if (c0700hj != null) {
            ii = this.f8735a.fromModel(c0700hj);
            c1051v8.f9458c = (C1077w8) ii.f6960a;
        } else {
            ii = null;
        }
        return new Ii(c1051v8, new C0710i3(C0710i3.b(a6, a7, ii)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0800lg(C0597dj c0597dj, C1155za c1155za, C1155za c1155za2) {
        this.f8735a = c0597dj;
        this.f8736b = c1155za;
        this.f8737c = c1155za2;
    }

    public final Cg a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
