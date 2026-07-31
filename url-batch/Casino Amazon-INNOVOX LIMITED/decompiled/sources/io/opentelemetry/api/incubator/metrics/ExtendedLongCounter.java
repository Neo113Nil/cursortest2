package io.opentelemetry.api.incubator.metrics;

import io.opentelemetry.api.metrics.LongCounter;

/* loaded from: classes3.dex */
public interface ExtendedLongCounter extends LongCounter {
    default boolean isEnabled() {
        return true;
    }
}
