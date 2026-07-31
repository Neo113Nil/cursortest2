package io.opentelemetry.api.incubator.metrics;

import io.opentelemetry.api.metrics.LongUpDownCounter;

/* loaded from: classes3.dex */
public interface ExtendedLongUpDownCounter extends LongUpDownCounter {
    default boolean isEnabled() {
        return true;
    }
}
