package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;

/* loaded from: classes.dex */
public final class Vc implements ModuleEventServiceHandlerReporter {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11113a;

    /* renamed from: b, reason: collision with root package name */
    public final C0738k9 f11114b;

    /* renamed from: c, reason: collision with root package name */
    public final P5 f11115c;

    public Vc(boolean z, C0738k9 c0738k9, P5 p5) {
        this.f11113a = z;
        this.f11114b = c0738k9;
        this.f11115c = p5;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final boolean isMain() {
        return this.f11113a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final void report(CounterReportApi counterReportApi) {
        P5 d4 = P5.d(this.f11115c);
        d4.f10797d = counterReportApi.getType();
        d4.f10798e = counterReportApi.getCustomType();
        d4.setName(counterReportApi.getName());
        String value = counterReportApi.getValue();
        if (value != null) {
            d4.setValue(value);
        }
        byte[] valueBytes = counterReportApi.getValueBytes();
        if (valueBytes != null) {
            d4.setValueBytes(valueBytes);
        }
        d4.f10800g = counterReportApi.getBytesTruncated();
        C0738k9 c0738k9 = this.f11114b;
        c0738k9.a(d4, Rk.a(c0738k9.f12204c.b(d4), d4.f10802i));
    }
}
