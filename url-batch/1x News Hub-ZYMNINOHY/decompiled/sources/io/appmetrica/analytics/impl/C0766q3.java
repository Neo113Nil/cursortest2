package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.q3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0766q3 implements InterfaceC0538h8 {

    /* renamed from: a, reason: collision with root package name */
    public final C0791r3 f8119a;

    public C0766q3() {
        this(new C0791r3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ii> fromModel(C0740p3 c0740p3) {
        A8 a8 = new A8();
        a8.f5745e = new C0589j8();
        Ii fromModel = this.f8119a.fromModel(c0740p3.f8059b);
        a8.f5745e.f7629a = (C0615k8) fromModel.f6160a;
        a8.f5741a = c0740p3.f8058a;
        return Collections.singletonList(new Ii(a8, new C0559i3(C0559i3.b(fromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0766q3(C0791r3 c0791r3) {
        this.f8119a = c0791r3;
    }

    public final C0740p3 a(List<Ii> list) {
        throw new UnsupportedOperationException();
    }
}
