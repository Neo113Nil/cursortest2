package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.lj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2786lj implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Ge f39405a;

    /* renamed from: b, reason: collision with root package name */
    public final H3 f39406b;

    /* renamed from: c, reason: collision with root package name */
    public final Na f39407c;

    /* renamed from: d, reason: collision with root package name */
    public final Na f39408d;

    public C2786lj() {
        this(new Ge(), new H3(), new Na(100), new Na(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(@NonNull C2890pj c2890pj) {
        Qi qi;
        K8 k8 = new K8();
        Jn a4 = this.f39407c.a(c2890pj.f39625a);
        k8.f37873a = StringUtils.getUTF8Bytes((String) a4.f37851a);
        List<String> list = c2890pj.f39626b;
        Qi qi2 = null;
        if (list != null) {
            qi = this.f39406b.fromModel(list);
            k8.f37874b = (C3138z8) qi.f38171a;
        } else {
            qi = null;
        }
        Jn a5 = this.f39408d.a(c2890pj.f39627c);
        k8.f37875c = StringUtils.getUTF8Bytes((String) a5.f37851a);
        Map<String, String> map = c2890pj.f39628d;
        if (map != null) {
            qi2 = this.f39405a.fromModel(map);
            k8.f37876d = (F8) qi2.f38171a;
        }
        return new Qi(k8, new C3055w3(C3055w3.b(a4, qi, a5, qi2)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C2786lj(Ge ge, H3 h32, Na na, Na na2) {
        this.f39405a = ge;
        this.f39406b = h32;
        this.f39407c = na;
        this.f39408d = na2;
    }

    @NonNull
    public final C2890pj a(@NonNull Qi qi) {
        throw new UnsupportedOperationException();
    }
}
