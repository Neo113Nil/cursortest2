package io.opentelemetry.api.incubator.metrics;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.metrics.DoubleUpDownCounterBuilder;
import java.util.List;

/* loaded from: classes3.dex */
public interface ExtendedDoubleUpDownCounterBuilder extends DoubleUpDownCounterBuilder {
    default ExtendedDoubleUpDownCounterBuilder setAttributesAdvice(List<AttributeKey<?>> list) {
        return this;
    }
}
