package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0110d0 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final W f1205a;
    public final C0245i6 b;

    public C0110d0() {
        this(new W(new C0663yn()), new C0245i6());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T5 fromModel(C0084c0 c0084c0) {
        T5 t5 = new T5();
        t5.f1055a = this.f1205a.fromModel(c0084c0.f1187a);
        String str = c0084c0.b;
        if (str != null) {
            t5.b = str;
        }
        t5.c = this.b.a(c0084c0.c);
        return t5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0110d0(W w, C0245i6 c0245i6) {
        this.f1205a = w;
        this.b = c0245i6;
    }

    public final C0084c0 a(T5 t5) {
        throw new UnsupportedOperationException();
    }
}
