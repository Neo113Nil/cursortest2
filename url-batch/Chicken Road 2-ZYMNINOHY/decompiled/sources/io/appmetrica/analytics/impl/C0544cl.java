package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.cl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0544cl implements InterfaceC0505b8 {

    /* renamed from: a, reason: collision with root package name */
    public final Yi f11630a;

    /* renamed from: b, reason: collision with root package name */
    public final Gf f11631b;

    public C0544cl() {
        this(new Yi(), new Gf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Di> fromModel(C0518bl c0518bl) {
        C0996u8 c0996u8 = new C0996u8();
        c0996u8.f12816a = 2;
        c0996u8.f12818c = new C0918r8();
        Di fromModel = this.f11630a.fromModel(c0518bl.f11552b);
        c0996u8.f12818c.f12655b = (C0893q8) fromModel.f10202a;
        Di fromModel2 = this.f11631b.fromModel(c0518bl.f11551a);
        c0996u8.f12818c.f12654a = (C0815n8) fromModel2.f10202a;
        return Collections.singletonList(new Di(c0996u8, new C0474a3(C0474a3.b(fromModel, fromModel2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0544cl(Yi yi, Gf gf) {
        this.f11630a = yi;
        this.f11631b = gf;
    }

    public final C0518bl a(List<Di> list) {
        throw new UnsupportedOperationException();
    }
}
