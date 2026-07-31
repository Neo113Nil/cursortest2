package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class Lf implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final X f37922a;

    /* renamed from: b, reason: collision with root package name */
    public final Mf f37923b;

    public Lf() {
        this(new X(), new Mf(30));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(@NonNull Nf nf) {
        int i4;
        G8 g8 = new G8();
        Qi fromModel = this.f37922a.fromModel(nf.f38019a);
        g8.f37569a = (C3060w8) fromModel.f38171a;
        Jn a4 = this.f37923b.a(nf.f38020b);
        if (AbstractC2713io.a((Collection) a4.f37851a)) {
            i4 = 0;
        } else {
            g8.f37570b = new C3060w8[((List) a4.f37851a).size()];
            i4 = 0;
            for (int i5 = 0; i5 < ((List) a4.f37851a).size(); i5++) {
                Qi fromModel2 = this.f37922a.fromModel((Y) ((List) a4.f37851a).get(i5));
                g8.f37570b[i5] = (C3060w8) fromModel2.f38171a;
                i4 += fromModel2.f38172b.getBytesTruncated();
            }
        }
        return new Qi(g8, new C3055w3(C3055w3.b(fromModel, a4, new C3055w3(i4))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public Lf(X x4, Mf mf) {
        this.f37922a = x4;
        this.f37923b = mf;
    }

    @NonNull
    public final Nf a(@NonNull Qi qi) {
        throw new UnsupportedOperationException();
    }
}
