package io.appmetrica.analytics.modulesapi.internal.client;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface ModuleClientExecutorProvider {
    @NotNull
    IHandlerExecutor getDefaultExecutor();
}
