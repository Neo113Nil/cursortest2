package io.opentelemetry.api.incubator.metrics;

import io.opentelemetry.api.metrics.LongGauge;

/* loaded from: classes3.dex */
public interface ExtendedLongGauge extends LongGauge {
    default boolean isEnabled() {
        return true;
    }
}
