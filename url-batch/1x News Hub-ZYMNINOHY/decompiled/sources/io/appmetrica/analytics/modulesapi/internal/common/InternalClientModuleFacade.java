package io.appmetrica.analytics.modulesapi.internal.common;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;

/* loaded from: classes.dex */
public interface InternalClientModuleFacade {
    void reportAdRevenue(ModuleAdRevenue moduleAdRevenue);

    void reportEvent(InternalModuleEvent internalModuleEvent);
}
