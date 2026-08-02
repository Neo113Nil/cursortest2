package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0549d0 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final W f11638a;

    /* renamed from: b, reason: collision with root package name */
    public final C0658h6 f11639b;

    public C0549d0() {
        this(new W(new C1089xn()), new C0658h6());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final S5 fromModel(C0523c0 c0523c0) {
        S5 s5 = new S5();
        s5.f10929a = this.f11638a.fromModel(c0523c0.f11565a);
        String str = c0523c0.f11566b;
        if (str != null) {
            s5.f10930b = str;
        }
        s5.f10931c = this.f11639b.a(c0523c0.f11567c);
        return s5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0549d0(W w4, C0658h6 c0658h6) {
        this.f11638a = w4;
        this.f11639b = c0658h6;
    }

    public final C0523c0 a(S5 s5) {
        throw new UnsupportedOperationException();
    }
}
