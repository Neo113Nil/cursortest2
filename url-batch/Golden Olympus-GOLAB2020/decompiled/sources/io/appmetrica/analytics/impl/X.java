package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes3.dex */
public final class X implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final R7 f38504a;

    /* renamed from: b, reason: collision with root package name */
    public final Na f38505b;

    public X() {
        this(new R7(), new Na(20));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(@NonNull Y y4) {
        C3060w8 c3060w8 = new C3060w8();
        c3060w8.f40020b = this.f38504a.fromModel(y4.f38543a);
        Jn a4 = this.f38505b.a(y4.f38544b);
        c3060w8.f40019a = StringUtils.getUTF8Bytes((String) a4.f37851a);
        return new Qi(c3060w8, new C3055w3(C3055w3.b(a4)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public X(R7 r7, Na na) {
        this.f38504a = r7;
        this.f38505b = na;
    }

    @NonNull
    public final Y a(@NonNull Qi qi) {
        throw new UnsupportedOperationException();
    }
}
