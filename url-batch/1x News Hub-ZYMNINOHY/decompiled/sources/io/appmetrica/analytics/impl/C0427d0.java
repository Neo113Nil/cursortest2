package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0427d0 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final W f7164a;

    /* renamed from: b, reason: collision with root package name */
    public final C0717o6 f7165b;

    public C0427d0() {
        this(new W(new C1017zn()), new C0717o6());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z5 fromModel(C0401c0 c0401c0) {
        Z5 z5 = new Z5();
        z5.f6932a = this.f7164a.fromModel(c0401c0.f7108a);
        String str = c0401c0.f7109b;
        if (str != null) {
            z5.f6933b = str;
        }
        z5.f6934c = this.f7165b.a(c0401c0.f7110c);
        return z5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0427d0(W w3, C0717o6 c0717o6) {
        this.f7164a = w3;
        this.f7165b = c0717o6;
    }

    public final C0401c0 a(Z5 z5) {
        throw new UnsupportedOperationException();
    }
}
