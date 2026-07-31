package io.opentelemetry.api.incubator.metrics;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.metrics.DoubleCounterBuilder;
import java.util.List;

/* loaded from: classes3.dex */
public interface ExtendedDoubleCounterBuilder extends DoubleCounterBuilder {
    default ExtendedDoubleCounterBuilder setAttributesAdvice(List<AttributeKey<?>> list) {
        return this;
    }
}
