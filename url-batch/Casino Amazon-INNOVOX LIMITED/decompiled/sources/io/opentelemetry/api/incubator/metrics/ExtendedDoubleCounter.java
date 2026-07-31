package io.opentelemetry.api.incubator.metrics;

import io.opentelemetry.api.metrics.DoubleCounter;

/* loaded from: classes3.dex */
public interface ExtendedDoubleCounter extends DoubleCounter {
    default boolean isEnabled() {
        return true;
    }
}
