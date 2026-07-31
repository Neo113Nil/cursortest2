package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.qd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2910qd implements ModuleEventServiceHandlerReporter {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f39655a;

    /* renamed from: b, reason: collision with root package name */
    public final F9 f39656b;

    /* renamed from: c, reason: collision with root package name */
    public final C2773l6 f39657c;

    public C2910qd(boolean z4, @NotNull F9 f9, @NotNull C2773l6 c2773l6) {
        this.f39655a = z4;
        this.f39656b = f9;
        this.f39657c = c2773l6;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final boolean isMain() {
        return this.f39655a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final void report(@NotNull CounterReportApi counterReportApi) {
        C2773l6 d4 = C2773l6.d(this.f39657c);
        d4.f39379d = counterReportApi.getType();
        d4.f39380e = counterReportApi.getCustomType();
        d4.setName(counterReportApi.getName());
        String value = counterReportApi.getValue();
        if (value != null) {
            d4.setValue(value);
        }
        byte[] valueBytes = counterReportApi.getValueBytes();
        if (valueBytes != null) {
            d4.setValueBytes(valueBytes);
        }
        d4.f39382g = counterReportApi.getBytesTruncated();
        F9 f9 = this.f39656b;
        f9.a(d4, Sk.a(f9.f37519c.b(d4), d4.f39384i));
    }
}
