package io.opentelemetry.api.incubator.metrics;

import io.opentelemetry.api.metrics.LongHistogram;

/* loaded from: classes3.dex */
public interface ExtendedLongHistogram extends LongHistogram {
    default boolean isEnabled() {
        return true;
    }
}
