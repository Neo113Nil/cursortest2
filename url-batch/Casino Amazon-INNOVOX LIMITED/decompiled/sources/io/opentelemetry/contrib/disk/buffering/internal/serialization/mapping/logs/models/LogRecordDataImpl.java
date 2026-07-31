package io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs.models;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.Value;
import io.opentelemetry.api.incubator.common.ExtendedAttributes;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs.models.AutoValue_LogRecordDataImpl;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.logs.data.Body;
import io.opentelemetry.sdk.logs.data.internal.ExtendedLogRecordData;
import io.opentelemetry.sdk.resources.Resource;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public abstract class LogRecordDataImpl implements ExtendedLogRecordData {

    public static abstract class Builder {
        public abstract LogRecordDataImpl build();

        public abstract Builder setAttributes(Attributes attributes);

        public abstract Builder setBodyValue(@Nullable Value<?> value);

        public abstract Builder setEventName(String str);

        public abstract Builder setInstrumentationScopeInfo(InstrumentationScopeInfo instrumentationScopeInfo);

        public abstract Builder setObservedTimestampEpochNanos(Long l);

        public abstract Builder setResource(Resource resource);

        public abstract Builder setSeverity(Severity severity);

        public abstract Builder setSeverityText(String str);

        public abstract Builder setSpanContext(SpanContext spanContext);

        public abstract Builder setTimestampEpochNanos(Long l);

        public abstract Builder setTotalAttributeCount(Integer num);
    }

    @Override // io.opentelemetry.sdk.logs.data.internal.ExtendedLogRecordData, io.opentelemetry.sdk.logs.data.LogRecordData
    public abstract Attributes getAttributes();

    @Override // io.opentelemetry.sdk.logs.data.LogRecordData
    @Nullable
    public abstract Value<?> getBodyValue();

    @Override // io.opentelemetry.sdk.logs.data.LogRecordData
    @Nullable
    public abstract String getEventName();

    public static Builder builder() {
        return new AutoValue_LogRecordDataImpl.Builder();
    }

    @Override // io.opentelemetry.sdk.logs.data.LogRecordData
    @Deprecated
    public Body getBody() {
        Value<?> bodyValue = getBodyValue();
        if (bodyValue == null) {
            return Body.empty();
        }
        return Body.string(bodyValue.asString());
    }

    @Override // io.opentelemetry.sdk.logs.data.internal.ExtendedLogRecordData
    public ExtendedAttributes getExtendedAttributes() {
        return ExtendedAttributes.builder().putAll(getAttributes()).build();
    }
}
