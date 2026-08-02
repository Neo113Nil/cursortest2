package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.t3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0843t3 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0979ya f8334a;

    public C0843t3() {
        this(new C0979ya(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(List<String> list) {
        On a3 = this.f8334a.a((List<Object>) list);
        C0641l8 c0641l8 = new C0641l8();
        c0641l8.f7774a = StringUtils.getUTF8Bytes((List<String>) a3.f6419a);
        InterfaceC0584j3 interfaceC0584j3 = a3.f6420b;
        int i3 = ((C0870u4) interfaceC0584j3).f7496a;
        return new Ii(c0641l8, interfaceC0584j3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0843t3(C0979ya c0979ya) {
        this.f8334a = c0979ya;
    }

    public final List<String> a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
