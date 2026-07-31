package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes3.dex */
public final class Aa implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final Be f37174a;

    public Aa() {
        this(new Sl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2970sm fromModel(@NonNull G4 g4) {
        C2970sm c2970sm = new C2970sm();
        c2970sm.f39813b = g4.f37559b;
        c2970sm.f39812a = g4.f37558a;
        c2970sm.f39814c = g4.f37560c;
        c2970sm.f39815d = g4.f37561d;
        c2970sm.f39816e = g4.f37562e;
        c2970sm.f39817f = this.f37174a.a(g4.f37563f);
        return c2970sm;
    }

    public Aa(Sl sl) {
        this.f37174a = sl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final G4 toModel(@NonNull C2970sm c2970sm) {
        E4 e4 = new E4();
        e4.f37403d = c2970sm.f39815d;
        e4.f37402c = c2970sm.f39814c;
        e4.f37401b = c2970sm.f39813b;
        e4.f37400a = c2970sm.f39812a;
        e4.f37404e = c2970sm.f39816e;
        e4.f37405f = this.f37174a.a(c2970sm.f39817f);
        return new G4(e4);
    }
}
