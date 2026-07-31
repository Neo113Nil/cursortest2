package io.appmetrica.analytics.modulesapi.internal.service;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface ModuleServiceLifecycleController {
    void registerObserver(@NotNull ModuleServiceLifecycleObserver moduleServiceLifecycleObserver);
}
