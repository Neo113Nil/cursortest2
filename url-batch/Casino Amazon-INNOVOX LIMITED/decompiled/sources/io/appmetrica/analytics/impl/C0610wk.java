package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext;

/* renamed from: io.appmetrica.analytics.impl.wk, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0610wk implements ServiceModuleReporterComponentContext {

    /* renamed from: a, reason: collision with root package name */
    public final C0078bk f1552a;
    public final C0052ak b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0610wk(Y4 y4, C0420p4 c0420p4) {
        this.f1552a = new C0078bk(y4, null, 2, 0 == true ? 1 : 0);
        this.b = new C0052ak(c0420p4);
    }

    public final C0052ak a() {
        return this.b;
    }

    public final C0078bk b() {
        return this.f1552a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleConfig getConfig() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleReporter getReporter() {
        return this.f1552a;
    }
}
