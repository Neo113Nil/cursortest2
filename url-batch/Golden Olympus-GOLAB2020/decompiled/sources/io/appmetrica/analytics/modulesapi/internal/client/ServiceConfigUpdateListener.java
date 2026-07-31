package io.appmetrica.analytics.modulesapi.internal.client;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface ServiceConfigUpdateListener<T> {
    void onServiceConfigUpdated(@NotNull ModuleServiceConfig<T> moduleServiceConfig);
}
