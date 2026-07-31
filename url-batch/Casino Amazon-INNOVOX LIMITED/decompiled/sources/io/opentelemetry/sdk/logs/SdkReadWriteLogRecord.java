package io.opentelemetry.sdk.logs;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.Value;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.internal.AttributesMap;
import io.opentelemetry.sdk.logs.data.LogRecordData;
import io.opentelemetry.sdk.resources.Resource;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
class SdkReadWriteLogRecord implements ReadWriteLogRecord {

    @Nullable
    private AttributesMap attributes;

    @Nullable
    protected final Value<?> body;

    @Nullable
    protected String eventName;
    protected final InstrumentationScopeInfo instrumentationScopeInfo;
    private final Object lock = new Object();
    protected final LogLimits logLimits;
    protected final long observedTimestampEpochNanos;
    protected final Resource resource;
    protected final Severity severity;

    @Nullable
    protected final String severityText;
    protected final SpanContext spanContext;
    protected final long timestampEpochNanos;

    protected SdkReadWriteLogRecord(LogLimits logLimits, Resource resource, InstrumentationScopeInfo instrumentationScopeInfo, long j, long j2, SpanContext spanContext, Severity severity, @Nullable String str, @Nullable Value<?> value, @Nullable AttributesMap attributesMap, @Nullable String str2) {
        this.logLimits = logLimits;
        this.resource = resource;
        this.instrumentationScopeInfo = instrumentationScopeInfo;
        this.timestampEpochNanos = j;
        this.observedTimestampEpochNanos = j2;
        this.spanContext = spanContext;
        this.severity = severity;
        this.severityText = str;
        this.body = value;
        this.eventName = str2;
        this.attributes = attributesMap;
    }

    static SdkReadWriteLogRecord create(LogLimits logLimits, Resource resource, InstrumentationScopeInfo instrumentationScopeInfo, long j, long j2, SpanContext spanContext, Severity severity, @Nullable String str, @Nullable Value<?> value, @Nullable AttributesMap attributesMap, @Nullable String str2) {
        return new SdkReadWriteLogRecord(logLimits, resource, instrumentationScopeInfo, j, j2, spanContext, severity, str, value, attributesMap, str2);
    }

    @Override // io.opentelemetry.sdk.logs.ReadWriteLogRecord
    public <T> ReadWriteLogRecord setAttribute(AttributeKey<T> attributeKey, T t) {
        if (attributeKey == null || attributeKey.getKey().isEmpty() || t == null) {
            return this;
        }
        synchronized (this.lock) {
            if (this.attributes == null) {
                this.attributes = AttributesMap.create(this.logLimits.getMaxNumberOfAttributes(), this.logLimits.getMaxAttributeValueLength());
            }
            this.attributes.put((AttributeKey<?>) attributeKey, (Object) t);
        }
        return this;
    }

    private Attributes getImmutableAttributes() {
        synchronized (this.lock) {
            AttributesMap attributesMap = this.attributes;
            if (attributesMap != null && !attributesMap.isEmpty()) {
                return this.attributes.immutableCopy();
            }
            return Attributes.empty();
        }
    }

    @Override // io.opentelemetry.sdk.logs.ReadWriteLogRecord, io.opentelemetry.sdk.logs.internal.ExtendedReadWriteLogRecord
    public LogRecordData toLogRecordData() {
        SdkLogRecordData create;
        synchronized (this.lock) {
            Resource resource = this.resource;
            InstrumentationScopeInfo instrumentationScopeInfo = this.instrumentationScopeInfo;
            long j = this.timestampEpochNanos;
            long j2 = this.observedTimestampEpochNanos;
            SpanContext spanContext = this.spanContext;
            Severity severity = this.severity;
            String str = this.severityText;
            Value<?> value = this.body;
            Attributes immutableAttributes = getImmutableAttributes();
            AttributesMap attributesMap = this.attributes;
            create = SdkLogRecordData.create(resource, instrumentationScopeInfo, j, j2, spanContext, severity, str, value, immutableAttributes, attributesMap == null ? 0 : attributesMap.getTotalAddedValues(), this.eventName);
        }
        return create;
    }

    @Override // io.opentelemetry.sdk.logs.ReadWriteLogRecord
    public InstrumentationScopeInfo getInstrumentationScopeInfo() {
        return this.instrumentationScopeInfo;
    }

    @Override // io.opentelemetry.sdk.logs.ReadWriteLogRecord
    public long getTimestampEpochNanos() {
        return this.timestampEpochNanos;
    }

    @Override // io.opentelemetry.sdk.logs.ReadWriteLogRecord
    public long getObservedTimestampEpochNanos() {
        return this.observedTimestampEpochNanos;
    }

    @Override // io.opentelemetry.sdk.logs.ReadWriteLogRecord
    public SpanContext getSpanContext() {
        return this.spanContext;
    }

    @Override // io.opentelemetry.sdk.logs.ReadWriteLogRecord
    public Severity getSeverity() {
        return this.severity;
    }

    @Override // io.opentelemetry.sdk.logs.ReadWriteLogRecord
    @Nullable
    public String getSeverityText() {
        return this.severityText;
    }

    @Override // io.opentelemetry.sdk.logs.ReadWriteLogRecord
    @Nullable
    public Value<?> getBodyValue() {
        return this.body;
    }

    @Override // io.opentelemetry.sdk.logs.ReadWriteLogRecord
    public Attributes getAttributes() {
        return getImmutableAttributes();
    }

    @Override // io.opentelemetry.sdk.logs.ReadWriteLogRecord
    @Nullable
    public String getEventName() {
        return this.eventName;
    }

    @Override // io.opentelemetry.sdk.logs.ReadWriteLogRecord
    @Nullable
    public <T> T getAttribute(AttributeKey<T> attributeKey) {
        synchronized (this.lock) {
            AttributesMap attributesMap = this.attributes;
            if (attributesMap != null && !attributesMap.isEmpty()) {
                return (T) this.attributes.get((AttributeKey) attributeKey);
            }
            return null;
        }
    }
}
