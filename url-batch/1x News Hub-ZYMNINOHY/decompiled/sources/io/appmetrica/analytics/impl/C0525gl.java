package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.gl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0525gl implements InterfaceC0538h8 {

    /* renamed from: a, reason: collision with root package name */
    public final C0446dj f7414a;

    /* renamed from: b, reason: collision with root package name */
    public final Lf f7415b;

    public C0525gl() {
        this(new C0446dj(), new Lf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ii> fromModel(C0499fl c0499fl) {
        A8 a8 = new A8();
        a8.f5741a = 2;
        a8.f5743c = new C0952x8();
        Ii fromModel = this.f7414a.fromModel(c0499fl.f7326b);
        a8.f5743c.f8615b = (C0926w8) fromModel.f6160a;
        Ii fromModel2 = this.f7415b.fromModel(c0499fl.f7325a);
        a8.f5743c.f8614a = (C0848t8) fromModel2.f6160a;
        return Collections.singletonList(new Ii(a8, new C0559i3(C0559i3.b(fromModel, fromModel2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0525gl(C0446dj c0446dj, Lf lf) {
        this.f7414a = c0446dj;
        this.f7415b = lf;
    }

    public final C0499fl a(List<Ii> list) {
        throw new UnsupportedOperationException();
    }
}
