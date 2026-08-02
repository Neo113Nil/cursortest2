package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.i3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0681i3 implements InterfaceC0505b8 {

    /* renamed from: a, reason: collision with root package name */
    public final C0706j3 f12017a;

    public C0681i3() {
        this(new C0706j3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Di> fromModel(C0655h3 c0655h3) {
        C0996u8 c0996u8 = new C0996u8();
        c0996u8.f12820e = new C0557d8();
        Di fromModel = this.f12017a.fromModel(c0655h3.f11968b);
        c0996u8.f12820e.f11670a = (C0582e8) fromModel.f10202a;
        c0996u8.f12816a = c0655h3.f11967a;
        return Collections.singletonList(new Di(c0996u8, new C0474a3(C0474a3.b(fromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0681i3(C0706j3 c0706j3) {
        this.f12017a = c0706j3;
    }

    public final C0655h3 a(List<Di> list) {
        throw new UnsupportedOperationException();
    }
}
