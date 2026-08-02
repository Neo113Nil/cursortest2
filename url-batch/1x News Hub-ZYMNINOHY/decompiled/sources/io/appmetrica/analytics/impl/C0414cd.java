package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;

/* renamed from: io.appmetrica.analytics.impl.cd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0414cd implements ModuleEventServiceHandlerReporter {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7135a;

    /* renamed from: b, reason: collision with root package name */
    public final C0797r9 f7136b;

    /* renamed from: c, reason: collision with root package name */
    public final W5 f7137c;

    public C0414cd(boolean z, C0797r9 c0797r9, W5 w5) {
        this.f7135a = z;
        this.f7136b = c0797r9;
        this.f7137c = w5;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final boolean isMain() {
        return this.f7135a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final void report(CounterReportApi counterReportApi) {
        W5 d3 = W5.d(this.f7137c);
        d3.f6818d = counterReportApi.getType();
        d3.f6819e = counterReportApi.getCustomType();
        d3.setName(counterReportApi.getName());
        String value = counterReportApi.getValue();
        if (value != null) {
            d3.setValue(value);
        }
        byte[] valueBytes = counterReportApi.getValueBytes();
        if (valueBytes != null) {
            d3.setValueBytes(valueBytes);
        }
        d3.f6820g = counterReportApi.getBytesTruncated();
        C0797r9 c0797r9 = this.f7136b;
        c0797r9.a(d3, Wk.a(c0797r9.f8216c.b(d3), d3.f6822i));
    }
}
