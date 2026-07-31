package io.appmetrica.analytics.coreapi.internal.lifecycle;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface ActivityLifecycleRegistry {
    void registerListener(@NotNull ActivityLifecycleListener activityLifecycleListener, @NotNull ActivityEvent... activityEventArr);

    void unregisterListener(@NotNull ActivityLifecycleListener activityLifecycleListener, @NotNull ActivityEvent... activityEventArr);
}
