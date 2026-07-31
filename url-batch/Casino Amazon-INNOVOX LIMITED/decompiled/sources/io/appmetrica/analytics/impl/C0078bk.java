package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.bk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0078bk implements ServiceComponentModuleReporter {

    /* renamed from: a, reason: collision with root package name */
    public final Y4 f1186a;
    public final C0560uk b;

    public C0078bk(Y4 y4, C0560uk c0560uk) {
        this.f1186a = y4;
        this.b = c0560uk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter
    public final void handleReport(ServiceModuleCounterReport serviceModuleCounterReport) {
        this.b.getClass();
        this.f1186a.a(C0560uk.a(serviceModuleCounterReport));
    }

    public /* synthetic */ C0078bk(Y4 y4, C0560uk c0560uk, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(y4, (i & 2) != 0 ? new C0560uk() : c0560uk);
    }
}
