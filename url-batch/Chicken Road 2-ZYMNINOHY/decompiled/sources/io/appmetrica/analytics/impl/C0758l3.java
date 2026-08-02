package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.l3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0758l3 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0920ra f12258a;

    public C0758l3() {
        this(new C0920ra(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(List<String> list) {
        Mn a3 = this.f12258a.a((List<Object>) list);
        C0608f8 c0608f8 = new C0608f8();
        c0608f8.f11825a = StringUtils.getUTF8Bytes((List<String>) a3.f10676a);
        InterfaceC0500b3 interfaceC0500b3 = a3.f10677b;
        int i4 = ((C0811n4) interfaceC0500b3).f11415a;
        return new Di(c0608f8, interfaceC0500b3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0758l3(C0920ra c0920ra) {
        this.f12258a = c0920ra;
    }

    public final List<String> a(Di di) {
        throw new UnsupportedOperationException();
    }
}
