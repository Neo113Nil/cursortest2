package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport;

/* renamed from: io.appmetrica.analytics.impl.fk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0498fk implements ServiceComponentModuleReporter {

    /* renamed from: a, reason: collision with root package name */
    public final C0457e5 f7323a;

    /* renamed from: b, reason: collision with root package name */
    public final C0989yk f7324b;

    public C0498fk(C0457e5 c0457e5, C0989yk c0989yk) {
        this.f7323a = c0457e5;
        this.f7324b = c0989yk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter
    public final void handleReport(ServiceModuleCounterReport serviceModuleCounterReport) {
        this.f7324b.getClass();
        this.f7323a.a(C0989yk.a(serviceModuleCounterReport));
    }

    public /* synthetic */ C0498fk(C0457e5 c0457e5, C0989yk c0989yk, int i3, kotlin.jvm.internal.f fVar) {
        this(c0457e5, (i3 & 2) != 0 ? new C0989yk() : c0989yk);
    }
}
