package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.gl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2659gl implements InterfaceC3034v8 {

    /* renamed from: a, reason: collision with root package name */
    public final C2786lj f39101a;

    public C2659gl() {
        this(new C2786lj());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Qi> fromModel(@NonNull C2632fl c2632fl) {
        O8 o8 = new O8();
        o8.f38066a = 1;
        o8.f38067b = new N8();
        Qi fromModel = this.f39101a.fromModel(c2632fl.f38974a);
        o8.f38067b.f37998a = (K8) fromModel.f38171a;
        C3055w3 c3055w3 = new C3055w3(C3055w3.b(fromModel));
        fromModel.f38172b.getBytesTruncated();
        return Collections.singletonList(new Qi(o8, c3055w3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C2659gl(C2786lj c2786lj) {
        this.f39101a = c2786lj;
    }

    @NonNull
    public final C2632fl a(@NonNull List<Qi> list) {
        throw new UnsupportedOperationException();
    }
}
