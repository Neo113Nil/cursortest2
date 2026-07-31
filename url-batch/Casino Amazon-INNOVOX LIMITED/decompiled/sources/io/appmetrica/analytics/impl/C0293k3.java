package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.k3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0293k3 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Hf f1333a;
    public final C0597w7 b;
    public final C0655yf c;
    public final C0229hg d;

    public C0293k3() {
        this(new Hf(), new C0597w7(), new C0655yf(), new C0229hg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(C0319l3 c0319l3) {
        Ei ei;
        C0169f8 c0169f8 = new C0169f8();
        Ei fromModel = this.f1333a.fromModel(c0319l3.f1351a);
        c0169f8.f1253a = (C0399o8) fromModel.f829a;
        c0169f8.c = this.b.fromModel(c0319l3.b);
        Ei fromModel2 = this.c.fromModel(c0319l3.c);
        c0169f8.d = (C0374n8) fromModel2.f829a;
        C0656yg c0656yg = c0319l3.d;
        if (c0656yg != null) {
            ei = this.d.fromModel(c0656yg);
            c0169f8.b = (C0449q8) ei.f829a;
        } else {
            ei = null;
        }
        return new Ei(c0169f8, new C0061b3(C0061b3.b(fromModel, fromModel2, ei)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0293k3(Hf hf, C0597w7 c0597w7, C0655yf c0655yf, C0229hg c0229hg) {
        this.f1333a = hf;
        this.b = c0597w7;
        this.c = c0655yf;
        this.d = c0229hg;
    }

    public final C0319l3 a(Ei ei) {
        throw new UnsupportedOperationException();
    }
}
