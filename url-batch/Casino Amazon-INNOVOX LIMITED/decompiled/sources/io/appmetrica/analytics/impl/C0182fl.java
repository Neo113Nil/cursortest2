package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.fl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0182fl implements InterfaceC0092c8 {

    /* renamed from: a, reason: collision with root package name */
    public final Hf f1261a;
    public final C0229hg b;

    public C0182fl() {
        this(new Hf(), new C0229hg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ei> fromModel(C0156el c0156el) {
        Ei ei;
        C0573v8 c0573v8 = new C0573v8();
        c0573v8.f1531a = 3;
        c0573v8.d = new C0523t8();
        Ei fromModel = this.f1261a.fromModel(c0156el.f1240a);
        c0573v8.d.f1497a = (C0399o8) fromModel.f829a;
        C0656yg c0656yg = c0156el.b;
        if (c0656yg != null) {
            ei = this.b.fromModel(c0656yg);
            c0573v8.d.b = (C0449q8) ei.f829a;
        } else {
            ei = null;
        }
        return Collections.singletonList(new Ei(c0573v8, new C0061b3(C0061b3.b(fromModel, ei))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0182fl(Hf hf, C0229hg c0229hg) {
        this.f1261a = hf;
        this.b = c0229hg;
    }

    public final C0156el a(List<Ei> list) {
        throw new UnsupportedOperationException();
    }
}
