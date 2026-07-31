package io.opentelemetry.api.incubator.metrics;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.metrics.LongGaugeBuilder;
import java.util.List;

/* loaded from: classes3.dex */
public interface ExtendedLongGaugeBuilder extends LongGaugeBuilder {
    default ExtendedLongGaugeBuilder setAttributesAdvice(List<AttributeKey<?>> list) {
        return this;
    }
}
