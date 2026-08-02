package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext;

/* loaded from: classes.dex */
public final class Ak implements ServiceModuleReporterComponentContext {

    /* renamed from: a, reason: collision with root package name */
    public final C0498fk f5761a;

    /* renamed from: b, reason: collision with root package name */
    public final C0472ek f5762b;

    /* JADX WARN: Multi-variable type inference failed */
    public Ak(C0457e5 c0457e5, C0896v4 c0896v4) {
        this.f5761a = new C0498fk(c0457e5, null, 2, 0 == true ? 1 : 0);
        this.f5762b = new C0472ek(c0896v4);
    }

    public final C0472ek a() {
        return this.f5762b;
    }

    public final C0498fk b() {
        return this.f5761a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleConfig getConfig() {
        return this.f5762b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleReporter getReporter() {
        return this.f5761a;
    }
}
