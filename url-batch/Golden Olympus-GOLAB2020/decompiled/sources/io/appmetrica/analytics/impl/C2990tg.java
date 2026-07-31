package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.tg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2990tg implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C2786lj f39860a;

    /* renamed from: b, reason: collision with root package name */
    public final Na f39861b;

    /* renamed from: c, reason: collision with root package name */
    public final Na f39862c;

    public C2990tg() {
        this(new C2786lj(), new Na(100), new Na(com.ironsource.mediationsdk.metadata.a.f17688n));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(@NonNull Kg kg) {
        Qi qi;
        J8 j8 = new J8();
        Jn a4 = this.f39861b.a(kg.f37891a);
        j8.f37822a = StringUtils.getUTF8Bytes((String) a4.f37851a);
        Jn a5 = this.f39862c.a(kg.f37892b);
        j8.f37823b = StringUtils.getUTF8Bytes((String) a5.f37851a);
        C2890pj c2890pj = kg.f37893c;
        if (c2890pj != null) {
            qi = this.f39860a.fromModel(c2890pj);
            j8.f37824c = (K8) qi.f38171a;
        } else {
            qi = null;
        }
        return new Qi(j8, new C3055w3(C3055w3.b(a4, a5, qi)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C2990tg(C2786lj c2786lj, Na na, Na na2) {
        this.f39860a = c2786lj;
        this.f39861b = na;
        this.f39862c = na2;
    }

    @NonNull
    public final Kg a(@NonNull Qi qi) {
        throw new UnsupportedOperationException();
    }
}
