package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;

/* renamed from: io.appmetrica.analytics.impl.ak, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0491ak implements ServiceComponentModuleReporter {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f11441a;

    /* renamed from: b, reason: collision with root package name */
    public final C0982tk f11442b;

    public C0491ak(X4 x4, C0982tk c0982tk) {
        this.f11441a = x4;
        this.f11442b = c0982tk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter
    public final void handleReport(ServiceModuleCounterReport serviceModuleCounterReport) {
        this.f11442b.getClass();
        this.f11441a.a(C0982tk.a(serviceModuleCounterReport));
    }

    public /* synthetic */ C0491ak(X4 x4, C0982tk c0982tk, int i4, kotlin.jvm.internal.e eVar) {
        this(x4, (i4 & 2) != 0 ? new C0982tk() : c0982tk);
    }
}
