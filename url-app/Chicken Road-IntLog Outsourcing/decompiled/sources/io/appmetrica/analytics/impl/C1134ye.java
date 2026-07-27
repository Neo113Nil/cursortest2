package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.ye, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1134ye implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final Ca f9598a;

    public C1134ye() {
        this(new Ca(20480, 100, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ii fromModel(Map<String, String> map) {
        On a6 = this.f9598a.a(map);
        C0947r8 c0947r8 = new C0947r8();
        c0947r8.f9147b = ((C1021u4) a6.f7231b).f9337b;
        Map map2 = (Map) a6.f7230a;
        if (map2 != null) {
            c0947r8.f9146a = new C0922q8[map2.size()];
            int i2 = 0;
            for (Map.Entry entry : map2.entrySet()) {
                c0947r8.f9146a[i2] = new C0922q8();
                c0947r8.f9146a[i2].f9070a = StringUtils.getUTF8Bytes((String) entry.getKey());
                c0947r8.f9146a[i2].f9071b = StringUtils.getUTF8Bytes((String) entry.getValue());
                i2++;
            }
        }
        InterfaceC0735j3 interfaceC0735j3 = a6.f7231b;
        int i3 = ((C1021u4) interfaceC0735j3).f8378a;
        return new Ii(c0947r8, interfaceC0735j3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C1134ye(Ca ca) {
        this.f9598a = ca;
    }

    public final Map<String, String> a(Ii ii) {
        throw new UnsupportedOperationException();
    }
}
