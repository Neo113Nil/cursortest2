package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleConfig;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentModuleReporter;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext;

/* renamed from: io.appmetrica.analytics.impl.vk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1034vk implements ServiceModuleReporterComponentContext {

    /* renamed from: a, reason: collision with root package name */
    public final C0491ak f12901a;

    /* renamed from: b, reason: collision with root package name */
    public final Zj f12902b;

    /* JADX WARN: Multi-variable type inference failed */
    public C1034vk(X4 x4, C0837o4 c0837o4) {
        this.f12901a = new C0491ak(x4, null, 2, 0 == true ? 1 : 0);
        this.f12902b = new Zj(c0837o4);
    }

    public final Zj a() {
        return this.f12902b;
    }

    public final C0491ak b() {
        return this.f12901a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleConfig getConfig() {
        return this.f12902b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext
    public final ServiceComponentModuleReporter getReporter() {
        return this.f12901a;
    }
}
