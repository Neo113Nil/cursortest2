package io.opentelemetry.api.incubator.metrics;

import io.opentelemetry.api.metrics.DoubleGauge;

/* loaded from: classes3.dex */
public interface ExtendedDoubleGauge extends DoubleGauge {
    default boolean isEnabled() {
        return true;
    }
}
