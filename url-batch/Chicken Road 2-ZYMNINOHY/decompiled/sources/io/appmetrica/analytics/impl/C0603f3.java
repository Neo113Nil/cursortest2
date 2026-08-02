package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.f3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0603f3 implements ProtobufConverter {
    public final C0855om a(C0552d3 c0552d3) {
        C0855om c0855om = new C0855om();
        c0855om.f12533a = c0552d3.f11648a;
        return c0855om;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        C0855om c0855om = new C0855om();
        c0855om.f12533a = ((C0552d3) obj).f11648a;
        return c0855om;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C0552d3(((C0855om) obj).f12533a);
    }

    public final C0552d3 a(C0855om c0855om) {
        return new C0552d3(c0855om.f12533a);
    }
}
