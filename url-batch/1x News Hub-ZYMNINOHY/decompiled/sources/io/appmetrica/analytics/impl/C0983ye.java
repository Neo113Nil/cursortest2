package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ye, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0983ye implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Ca f8642a;

    public C0983ye() {
        this(new Ca(20480, 100, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(Map<String, String> map) {
        On a3 = this.f8642a.a(map);
        C0796r8 c0796r8 = new C0796r8();
        c0796r8.f8213b = ((C0870u4) a3.f6420b).f8393b;
        Map map2 = (Map) a3.f6419a;
        if (map2 != null) {
            c0796r8.f8212a = new C0771q8[map2.size()];
            int i3 = 0;
            for (Map.Entry entry : map2.entrySet()) {
                c0796r8.f8212a[i3] = new C0771q8();
                c0796r8.f8212a[i3].f8139a = StringUtils.getUTF8Bytes((String) entry.getKey());
                c0796r8.f8212a[i3].f8140b = StringUtils.getUTF8Bytes((String) entry.getValue());
                i3++;
            }
        }
        InterfaceC0584j3 interfaceC0584j3 = a3.f6420b;
        int i4 = ((C0870u4) interfaceC0584j3).f7496a;
        return new Ii(c0796r8, interfaceC0584j3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0983ye(Ca ca) {
        this.f8642a = ca;
    }

    public final Map<String, String> a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
