package io.opentelemetry.sdk.logs;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.Value;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.logs.data.LogRecordData;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public interface ReadWriteLogRecord {
    @Nullable
    default String getEventName() {
        return null;
    }

    <T> ReadWriteLogRecord setAttribute(AttributeKey<T> attributeKey, T t);

    LogRecordData toLogRecordData();

    default ReadWriteLogRecord setAllAttributes(Attributes attributes) {
        if (attributes != null && !attributes.isEmpty()) {
            attributes.forEach(new BiConsumer() { // from class: io.opentelemetry.sdk.logs.ReadWriteLogRecord$$ExternalSyntheticLambda0
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    ReadWriteLogRecord.this.setAttribute((AttributeKey) obj, obj2);
                }
            });
        }
        return this;
    }

    @Nullable
    default <T> T getAttribute(AttributeKey<T> attributeKey) {
        return (T) toLogRecordData().getAttributes().get(attributeKey);
    }

    default InstrumentationScopeInfo getInstrumentationScopeInfo() {
        return toLogRecordData().getInstrumentationScopeInfo();
    }

    default long getTimestampEpochNanos() {
        return toLogRecordData().getTimestampEpochNanos();
    }

    default long getObservedTimestampEpochNanos() {
        return toLogRecordData().getTimestampEpochNanos();
    }

    default SpanContext getSpanContext() {
        return toLogRecordData().getSpanContext();
    }

    default Severity getSeverity() {
        return toLogRecordData().getSeverity();
    }

    @Nullable
    default String getSeverityText() {
        return toLogRecordData().getSeverityText();
    }

    @Nullable
    default Value<?> getBodyValue() {
        return toLogRecordData().getBodyValue();
    }

    default Attributes getAttributes() {
        return toLogRecordData().getAttributes();
    }
}
