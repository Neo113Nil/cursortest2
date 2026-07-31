package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Rf implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Ge f38201a;

    /* renamed from: b, reason: collision with root package name */
    public final Lf f38202b;

    /* renamed from: c, reason: collision with root package name */
    public final H3 f38203c;

    /* renamed from: d, reason: collision with root package name */
    public final Vf f38204d;

    /* renamed from: e, reason: collision with root package name */
    public final Na f38205e;

    /* renamed from: f, reason: collision with root package name */
    public final Na f38206f;

    public Rf() {
        this(new Ge(), new Lf(), new H3(), new Vf(), new Na(100), new Na(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(@NonNull Uf uf) {
        Qi qi;
        Qi qi2;
        Qi qi3;
        Qi qi4;
        H8 h8 = new H8();
        Jn a4 = this.f38205e.a(uf.f38364a);
        h8.f37623a = StringUtils.getUTF8Bytes((String) a4.f37851a);
        Jn a5 = this.f38206f.a(uf.f38365b);
        h8.f37624b = StringUtils.getUTF8Bytes((String) a5.f37851a);
        List<String> list = uf.f38366c;
        Qi qi5 = null;
        if (list != null) {
            qi = this.f38203c.fromModel(list);
            h8.f37625c = (C3138z8) qi.f38171a;
        } else {
            qi = null;
        }
        Map<String, String> map = uf.f38367d;
        if (map != null) {
            qi2 = this.f38201a.fromModel(map);
            h8.f37626d = (F8) qi2.f38171a;
        } else {
            qi2 = null;
        }
        Nf nf = uf.f38368e;
        if (nf != null) {
            qi3 = this.f38202b.fromModel(nf);
            h8.f37627e = (G8) qi3.f38171a;
        } else {
            qi3 = null;
        }
        Nf nf2 = uf.f38369f;
        if (nf2 != null) {
            qi4 = this.f38202b.fromModel(nf2);
            h8.f37628f = (G8) qi4.f38171a;
        } else {
            qi4 = null;
        }
        List<String> list2 = uf.f38370g;
        if (list2 != null) {
            qi5 = this.f38204d.fromModel(list2);
            h8.f37629g = (I8[]) qi5.f38171a;
        }
        return new Qi(h8, new C3055w3(C3055w3.b(a4, a5, qi, qi2, qi3, qi4, qi5)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Rf(Ge ge, Lf lf, H3 h32, Vf vf, Na na, Na na2) {
        this.f38201a = ge;
        this.f38202b = lf;
        this.f38203c = h32;
        this.f38204d = vf;
        this.f38205e = na;
        this.f38206f = na2;
    }

    @NonNull
    public final Uf a(@NonNull Qi qi) {
        throw new UnsupportedOperationException();
    }
}
