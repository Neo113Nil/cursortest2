package io.opentelemetry.sdk.logs.data;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.Value;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.logs.data.Body;
import io.opentelemetry.sdk.resources.Resource;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public interface LogRecordData {
    Attributes getAttributes();

    @Deprecated
    Body getBody();

    @Nullable
    default String getEventName() {
        return null;
    }

    InstrumentationScopeInfo getInstrumentationScopeInfo();

    long getObservedTimestampEpochNanos();

    Resource getResource();

    Severity getSeverity();

    @Nullable
    String getSeverityText();

    SpanContext getSpanContext();

    long getTimestampEpochNanos();

    int getTotalAttributeCount();

    @Nullable
    default Value<?> getBodyValue() {
        Body body = getBody();
        if (body.getType() == Body.Type.EMPTY) {
            return null;
        }
        return Value.of(body.asString());
    }
}
