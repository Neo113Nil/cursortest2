package io.opentelemetry.api.incubator.metrics;

import io.opentelemetry.api.metrics.DoubleHistogram;

/* loaded from: classes3.dex */
public interface ExtendedDoubleHistogram extends DoubleHistogram {
    default boolean isEnabled() {
        return true;
    }
}
