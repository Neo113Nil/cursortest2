package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.hl, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0234hl implements InterfaceC0092c8 {

    /* renamed from: a, reason: collision with root package name */
    public final Zi f1293a;

    public C0234hl() {
        this(new Zi());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Ei> fromModel(C0208gl c0208gl) {
        C0573v8 c0573v8 = new C0573v8();
        c0573v8.f1531a = 1;
        c0573v8.b = new C0548u8();
        Ei fromModel = this.f1293a.fromModel(c0208gl.f1276a);
        c0573v8.b.f1512a = (C0473r8) fromModel.f829a;
        C0061b3 c0061b3 = new C0061b3(C0061b3.b(fromModel));
        fromModel.b.getBytesTruncated();
        return Collections.singletonList(new Ei(c0573v8, c0061b3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0234hl(Zi zi) {
        this.f1293a = zi;
    }

    public final C0208gl a(List<Ei> list) {
        throw new UnsupportedOperationException();
    }
}
