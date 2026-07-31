package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.hg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0229hg implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Zi f1290a;
    public final C0525ta b;
    public final C0525ta c;

    public C0229hg() {
        this(new Zi(), new C0525ta(100), new C0525ta(2048));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(C0656yg c0656yg) {
        Ei ei;
        C0449q8 c0449q8 = new C0449q8();
        Nn a2 = this.b.a(c0656yg.f1586a);
        c0449q8.f1450a = StringUtils.getUTF8Bytes((String) a2.f977a);
        Nn a3 = this.c.a(c0656yg.b);
        c0449q8.b = StringUtils.getUTF8Bytes((String) a3.f977a);
        C0129dj c0129dj = c0656yg.c;
        if (c0129dj != null) {
            ei = this.f1290a.fromModel(c0129dj);
            c0449q8.c = (C0473r8) ei.f829a;
        } else {
            ei = null;
        }
        return new Ei(c0449q8, new C0061b3(C0061b3.b(a2, a3, ei)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0229hg(Zi zi, C0525ta c0525ta, C0525ta c0525ta2) {
        this.f1290a = zi;
        this.b = c0525ta;
        this.c = c0525ta2;
    }

    public final C0656yg a(Ei ei) {
        throw new UnsupportedOperationException();
    }
}
