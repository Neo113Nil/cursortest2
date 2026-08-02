package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;

/* loaded from: classes.dex */
public abstract class e implements ModuleAdRevenueProcessor {

    /* renamed from: a, reason: collision with root package name */
    protected final b f9417a;

    /* renamed from: b, reason: collision with root package name */
    public final ClientContext f9418b;

    public e(b bVar, ClientContext clientContext) {
        this.f9417a = bVar;
        this.f9418b = clientContext;
    }

    public final void a(ModuleAdRevenue moduleAdRevenue) {
        this.f9418b.getInternalClientModuleFacade().reportAdRevenue(moduleAdRevenue);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from AdMob was reported", new Object[0]);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final String getDescription() {
        return "AdMob";
    }
}
