package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.j3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0267j3 implements InterfaceC0092c8 {

    /* renamed from: a, reason: collision with root package name */
    public final C0293k3 f1315a;

    public C0267j3() {
        this(new C0293k3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ei> fromModel(C0242i3 c0242i3) {
        C0573v8 c0573v8 = new C0573v8();
        c0573v8.e = new C0143e8();
        Ei fromModel = this.f1315a.fromModel(c0242i3.b);
        c0573v8.e.f1233a = (C0169f8) fromModel.f829a;
        c0573v8.f1531a = c0242i3.f1299a;
        return Collections.singletonList(new Ei(c0573v8, new C0061b3(C0061b3.b(fromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0267j3(C0293k3 c0293k3) {
        this.f1315a = c0293k3;
    }

    public final C0242i3 a(List<Ei> list) {
        throw new UnsupportedOperationException();
    }
}
