package io.appmetrica.analytics.reporterextension.internal;

import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;

/* loaded from: classes.dex */
public final class ReporterExtensionClientModuleEntryPoint extends ModuleClientEntryPoint<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final String f8976a = "reporter_extension";

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public String getIdentifier() {
        return this.f8976a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(ClientContext clientContext) {
        super.initClientSide(clientContext);
        if (clientContext.getProcessDetector().isMainProcess()) {
            clientContext.getClientActivator().activate(clientContext.getContext());
        }
    }
}
