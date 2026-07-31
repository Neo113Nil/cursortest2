package io.appmetrica.analytics.modulesapi.internal.service;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface ServiceNetworkContext {
    @NotNull
    IExecutionPolicy getExecutionPolicy();

    @NotNull
    SimpleNetworkApi getNetworkApi();

    @NotNull
    SslSocketFactoryProvider getSslSocketFactoryProvider();

    @NotNull
    String getUserAgent();
}
