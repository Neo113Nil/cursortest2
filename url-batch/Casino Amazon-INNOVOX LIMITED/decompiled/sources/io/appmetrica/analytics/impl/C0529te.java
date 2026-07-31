package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.te, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0529te implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0600wa f1500a;

    public C0529te() {
        this(new C0600wa(20480, 100, 1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ei fromModel(Map<String, String> map) {
        Nn a2 = this.f1500a.a(map);
        C0349m8 c0349m8 = new C0349m8();
        c0349m8.b = ((C0395o4) a2.b).b;
        Map map2 = (Map) a2.f977a;
        if (map2 != null) {
            c0349m8.f1373a = new C0324l8[map2.size()];
            int i = 0;
            for (Map.Entry entry : map2.entrySet()) {
                c0349m8.f1373a[i] = new C0324l8();
                c0349m8.f1373a[i].f1356a = StringUtils.getUTF8Bytes((String) entry.getKey());
                c0349m8.f1373a[i].b = StringUtils.getUTF8Bytes((String) entry.getValue());
                i++;
            }
        }
        InterfaceC0087c3 interfaceC0087c3 = a2.b;
        int i2 = ((C0395o4) interfaceC0087c3).f1175a;
        return new Ei(c0349m8, interfaceC0087c3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0529te(C0600wa c0600wa) {
        this.f1500a = c0600wa;
    }

    public final Map<String, String> a(Ei ei) {
        throw new UnsupportedOperationException();
    }
}
