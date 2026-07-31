package io.appmetrica.analytics.modulesapi.internal.client;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueCollector;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public abstract class ModuleClientEntryPoint<T> {
    @Nullable
    public AdRevenueCollector getAdRevenueCollector() {
        return null;
    }

    @NotNull
    public abstract String getIdentifier();

    @Nullable
    public ServiceConfigExtensionConfiguration<T> getServiceConfigExtensionConfiguration() {
        return null;
    }

    public void initClientSide(@NotNull ClientContext clientContext) {
    }

    public void onActivated() {
    }
}
