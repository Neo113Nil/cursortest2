package io.appmetrica.analytics.modulesapi.internal.client;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface ClientContext {
    @NotNull
    ActivityLifecycleRegistry getActivityLifecycleRegistry();

    @NotNull
    ModuleClientActivator getClientActivator();

    @NotNull
    ModuleClientExecutorProvider getClientExecutorProvider();

    @NotNull
    ClientStorageProvider getClientStorageProvider();

    @NotNull
    Context getContext();

    @NotNull
    InternalClientModuleFacade getInternalClientModuleFacade();

    @NotNull
    ModuleAdRevenueContext getModuleAdRevenueContext();

    @NotNull
    ProcessDetector getProcessDetector();
}
