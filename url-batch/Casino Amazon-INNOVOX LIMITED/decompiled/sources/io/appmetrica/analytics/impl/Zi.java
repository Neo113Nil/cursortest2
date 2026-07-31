package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Zi implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0529te f1148a;
    public final C0344m3 b;
    public final C0525ta c;
    public final C0525ta d;

    public Zi() {
        this(new C0529te(), new C0344m3(), new C0525ta(100), new C0525ta(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(C0129dj c0129dj) {
        Ei ei;
        C0473r8 c0473r8 = new C0473r8();
        Nn a2 = this.c.a(c0129dj.f1220a);
        c0473r8.f1465a = StringUtils.getUTF8Bytes((String) a2.f977a);
        List<String> list = c0129dj.b;
        Ei ei2 = null;
        if (list != null) {
            ei = this.b.fromModel(list);
            c0473r8.b = (C0195g8) ei.f829a;
        } else {
            ei = null;
        }
        Nn a3 = this.d.a(c0129dj.c);
        c0473r8.c = StringUtils.getUTF8Bytes((String) a3.f977a);
        Map<String, String> map = c0129dj.d;
        if (map != null) {
            ei2 = this.f1148a.fromModel(map);
            c0473r8.d = (C0349m8) ei2.f829a;
        }
        return new Ei(c0473r8, new C0061b3(C0061b3.b(a2, ei, a3, ei2)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Zi(C0529te c0529te, C0344m3 c0344m3, C0525ta c0525ta, C0525ta c0525ta2) {
        this.f1148a = c0529te;
        this.b = c0344m3;
        this.c = c0525ta;
        this.d = c0525ta2;
    }

    public final C0129dj a(Ei ei) {
        throw new UnsupportedOperationException();
    }
}
