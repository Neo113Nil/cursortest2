package io.opentelemetry.api.incubator.metrics;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.metrics.LongCounterBuilder;
import java.util.List;

/* loaded from: classes3.dex */
public interface ExtendedLongCounterBuilder extends LongCounterBuilder {
    default ExtendedLongCounterBuilder setAttributesAdvice(List<AttributeKey<?>> list) {
        return this;
    }
}
