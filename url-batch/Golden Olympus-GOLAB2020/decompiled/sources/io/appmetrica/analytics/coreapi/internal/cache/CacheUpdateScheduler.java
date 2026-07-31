package io.appmetrica.analytics.coreapi.internal.cache;

import kotlin.Metadata;

@Metadata
/* loaded from: classes3.dex */
public interface CacheUpdateScheduler {
    void onStateUpdated();

    void scheduleUpdateIfNeededNow();
}
