package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.dl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0131dl implements InterfaceC0092c8 {

    /* renamed from: a, reason: collision with root package name */
    public final Zi f1222a;
    public final Hf b;

    public C0131dl() {
        this(new Zi(), new Hf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ei> fromModel(C0105cl c0105cl) {
        C0573v8 c0573v8 = new C0573v8();
        c0573v8.f1531a = 2;
        c0573v8.c = new C0498s8();
        Ei fromModel = this.f1222a.fromModel(c0105cl.b);
        c0573v8.c.b = (C0473r8) fromModel.f829a;
        Ei fromModel2 = this.b.fromModel(c0105cl.f1203a);
        c0573v8.c.f1482a = (C0399o8) fromModel2.f829a;
        return Collections.singletonList(new Ei(c0573v8, new C0061b3(C0061b3.b(fromModel, fromModel2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0131dl(Zi zi, Hf hf) {
        this.f1222a = zi;
        this.b = hf;
    }

    public final C0105cl a(List<Ei> list) {
        throw new UnsupportedOperationException();
    }
}
