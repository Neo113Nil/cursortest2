package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Hf implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0529te f874a;
    public final C0655yf b;
    public final C0344m3 c;
    public final Jf d;
    public final C0525ta e;
    public final C0525ta f;

    public Hf() {
        this(new C0529te(), new C0655yf(), new C0344m3(), new Jf(), new C0525ta(100), new C0525ta(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(If r10) {
        Ei ei;
        Ei ei2;
        Ei ei3;
        Ei ei4;
        C0399o8 c0399o8 = new C0399o8();
        Nn a2 = this.e.a(r10.f890a);
        c0399o8.f1410a = StringUtils.getUTF8Bytes((String) a2.f977a);
        Nn a3 = this.f.a(r10.b);
        c0399o8.b = StringUtils.getUTF8Bytes((String) a3.f977a);
        List<String> list = r10.c;
        Ei ei5 = null;
        if (list != null) {
            ei = this.c.fromModel(list);
            c0399o8.c = (C0195g8) ei.f829a;
        } else {
            ei = null;
        }
        Map<String, String> map = r10.d;
        if (map != null) {
            ei2 = this.f874a.fromModel(map);
            c0399o8.d = (C0349m8) ei2.f829a;
        } else {
            ei2 = null;
        }
        Af af = r10.e;
        if (af != null) {
            ei3 = this.b.fromModel(af);
            c0399o8.e = (C0374n8) ei3.f829a;
        } else {
            ei3 = null;
        }
        Af af2 = r10.f;
        if (af2 != null) {
            ei4 = this.b.fromModel(af2);
            c0399o8.f = (C0374n8) ei4.f829a;
        } else {
            ei4 = null;
        }
        List<String> list2 = r10.g;
        if (list2 != null) {
            ei5 = this.d.fromModel(list2);
            c0399o8.g = (C0424p8[]) ei5.f829a;
        }
        return new Ei(c0399o8, new C0061b3(C0061b3.b(a2, a3, ei, ei2, ei3, ei4, ei5)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Hf(C0529te c0529te, C0655yf c0655yf, C0344m3 c0344m3, Jf jf, C0525ta c0525ta, C0525ta c0525ta2) {
        this.f874a = c0529te;
        this.b = c0655yf;
        this.c = c0344m3;
        this.d = jf;
        this.e = c0525ta;
        this.f = c0525ta2;
    }

    public final If a(Ei ei) {
        throw new UnsupportedOperationException();
    }
}
