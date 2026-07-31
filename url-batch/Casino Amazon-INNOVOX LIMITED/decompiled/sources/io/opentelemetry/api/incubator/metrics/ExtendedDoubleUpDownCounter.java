package io.opentelemetry.api.incubator.metrics;

import io.opentelemetry.api.metrics.DoubleUpDownCounter;

/* loaded from: classes3.dex */
public interface ExtendedDoubleUpDownCounter extends DoubleUpDownCounter {
    default boolean isEnabled() {
        return true;
    }
}
