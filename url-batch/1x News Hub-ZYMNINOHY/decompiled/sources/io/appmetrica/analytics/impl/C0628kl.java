package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.kl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0628kl implements InterfaceC0538h8 {

    /* renamed from: a, reason: collision with root package name */
    public final C0446dj f7736a;

    public C0628kl() {
        this(new C0446dj());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ii> fromModel(C0602jl c0602jl) {
        A8 a8 = new A8();
        a8.f5741a = 1;
        a8.f5742b = new C1002z8();
        Ii fromModel = this.f7736a.fromModel(c0602jl.f7659a);
        a8.f5742b.f8667a = (C0926w8) fromModel.f6160a;
        C0559i3 c0559i3 = new C0559i3(C0559i3.b(fromModel));
        fromModel.f6161b.getBytesTruncated();
        return Collections.singletonList(new Ii(a8, c0559i3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0628kl(C0446dj c0446dj) {
        this.f7736a = c0446dj;
    }

    public final C0602jl a(List<Ii> list) {
        throw new UnsupportedOperationException();
    }
}
