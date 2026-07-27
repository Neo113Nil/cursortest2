package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;

/* renamed from: io.appmetrica.analytics.impl.cd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0565cd implements ModuleEventServiceHandlerReporter {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7991a;

    /* renamed from: b, reason: collision with root package name */
    public final C0948r9 f7992b;

    /* renamed from: c, reason: collision with root package name */
    public final W5 f7993c;

    public C0565cd(boolean z, C0948r9 c0948r9, W5 w5) {
        this.f7991a = z;
        this.f7992b = c0948r9;
        this.f7993c = w5;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final boolean isMain() {
        return this.f7991a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final void report(CounterReportApi counterReportApi) {
        W5 d6 = W5.d(this.f7993c);
        d6.f7651d = counterReportApi.getType();
        d6.f7652e = counterReportApi.getCustomType();
        d6.setName(counterReportApi.getName());
        String value = counterReportApi.getValue();
        if (value != null) {
            d6.setValue(value);
        }
        byte[] valueBytes = counterReportApi.getValueBytes();
        if (valueBytes != null) {
            d6.setValueBytes(valueBytes);
        }
        d6.f7654g = counterReportApi.getBytesTruncated();
        C0948r9 c0948r9 = this.f7992b;
        c0948r9.a(d6, Wk.a(c0948r9.f9150c.b(d6), d6.f7656i));
    }
}
