package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.el, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0595el implements InterfaceC0505b8 {

    /* renamed from: a, reason: collision with root package name */
    public final Gf f11809a;

    /* renamed from: b, reason: collision with root package name */
    public final C0642gg f11810b;

    public C0595el() {
        this(new Gf(), new C0642gg());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Di> fromModel(C0570dl c0570dl) {
        Di di;
        C0996u8 c0996u8 = new C0996u8();
        c0996u8.f12816a = 3;
        c0996u8.f12819d = new C0944s8();
        Di fromModel = this.f11809a.fromModel(c0570dl.f11684a);
        c0996u8.f12819d.f12723a = (C0815n8) fromModel.f10202a;
        C1082xg c1082xg = c0570dl.f11685b;
        if (c1082xg != null) {
            di = this.f11810b.fromModel(c1082xg);
            c0996u8.f12819d.f12724b = (C0867p8) di.f10202a;
        } else {
            di = null;
        }
        return Collections.singletonList(new Di(c0996u8, new C0474a3(C0474a3.b(fromModel, di))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0595el(Gf gf, C0642gg c0642gg) {
        this.f11809a = gf;
        this.f11810b = c0642gg;
    }

    public final C0570dl a(List<Di> list) {
        throw new UnsupportedOperationException();
    }
}
