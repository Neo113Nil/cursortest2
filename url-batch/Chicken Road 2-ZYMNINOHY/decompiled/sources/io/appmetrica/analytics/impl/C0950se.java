package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.se, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0950se implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C1024va f12744a;

    public C0950se() {
        this(new C1024va(20480, 100, AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Di fromModel(Map<String, String> map) {
        Mn a3 = this.f12744a.a(map);
        C0763l8 c0763l8 = new C0763l8();
        c0763l8.f12284b = ((C0811n4) a3.f10677b).f12390b;
        Map map2 = (Map) a3.f10676a;
        if (map2 != null) {
            c0763l8.f12283a = new C0737k8[map2.size()];
            int i4 = 0;
            for (Map.Entry entry : map2.entrySet()) {
                c0763l8.f12283a[i4] = new C0737k8();
                c0763l8.f12283a[i4].f12200a = StringUtils.getUTF8Bytes((String) entry.getKey());
                c0763l8.f12283a[i4].f12201b = StringUtils.getUTF8Bytes((String) entry.getValue());
                i4++;
            }
        }
        InterfaceC0500b3 interfaceC0500b3 = a3.f10677b;
        int i5 = ((C0811n4) interfaceC0500b3).f11415a;
        return new Di(c0763l8, interfaceC0500b3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C0950se(C1024va c1024va) {
        this.f12744a = c1024va;
    }

    public final Map<String, String> a(Di di) {
        throw new UnsupportedOperationException();
    }
}
