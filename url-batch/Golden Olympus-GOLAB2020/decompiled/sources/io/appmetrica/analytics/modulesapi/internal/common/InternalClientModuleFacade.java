package io.appmetrica.analytics.modulesapi.internal.common;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface InternalClientModuleFacade {
    void reportAdRevenue(@NotNull ModuleAdRevenue moduleAdRevenue);

    void reportEvent(@NotNull InternalModuleEvent internalModuleEvent);
}
