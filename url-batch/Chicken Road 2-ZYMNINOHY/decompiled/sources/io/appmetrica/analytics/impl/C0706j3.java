package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.j3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0706j3 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Gf f12090a;

    /* renamed from: b, reason: collision with root package name */
    public final C1021v7 f12091b;

    /* renamed from: c, reason: collision with root package name */
    public final C1081xf f12092c;

    /* renamed from: d, reason: collision with root package name */
    public final C0642gg f12093d;

    public C0706j3() {
        this(new Gf(), new C1021v7(), new C1081xf(), new C0642gg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(C0732k3 c0732k3) {
        Di di;
        C0582e8 c0582e8 = new C0582e8();
        Di fromModel = this.f12090a.fromModel(c0732k3.f12184a);
        c0582e8.f11737a = (C0815n8) fromModel.f10202a;
        c0582e8.f11739c = this.f12091b.fromModel(c0732k3.f12185b);
        Di fromModel2 = this.f12092c.fromModel(c0732k3.f12186c);
        c0582e8.f11740d = (C0789m8) fromModel2.f10202a;
        C1082xg c1082xg = c0732k3.f12187d;
        if (c1082xg != null) {
            di = this.f12093d.fromModel(c1082xg);
            c0582e8.f11738b = (C0867p8) di.f10202a;
        } else {
            di = null;
        }
        return new Di(c0582e8, new C0474a3(C0474a3.b(fromModel, fromModel2, di)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0706j3(Gf gf, C1021v7 c1021v7, C1081xf c1081xf, C0642gg c0642gg) {
        this.f12090a = gf;
        this.f12091b = c1021v7;
        this.f12092c = c1081xf;
        this.f12093d = c0642gg;
    }

    public final C0732k3 a(Di di) {
        throw new UnsupportedOperationException();
    }
}
