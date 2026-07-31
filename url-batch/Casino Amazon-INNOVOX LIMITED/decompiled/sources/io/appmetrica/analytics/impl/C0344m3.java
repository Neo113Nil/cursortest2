package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.m3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0344m3 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0500sa f1368a;

    public C0344m3() {
        this(new C0500sa(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(List<String> list) {
        Nn a2 = this.f1368a.a((List<Object>) list);
        C0195g8 c0195g8 = new C0195g8();
        c0195g8.f1268a = StringUtils.getUTF8Bytes((List<String>) a2.f977a);
        InterfaceC0087c3 interfaceC0087c3 = a2.b;
        int i = ((C0395o4) interfaceC0087c3).f1175a;
        return new Ei(c0195g8, interfaceC0087c3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0344m3(C0500sa c0500sa) {
        this.f1368a = c0500sa;
    }

    public final List<String> a(Ei ei) {
        throw new UnsupportedOperationException();
    }
}
