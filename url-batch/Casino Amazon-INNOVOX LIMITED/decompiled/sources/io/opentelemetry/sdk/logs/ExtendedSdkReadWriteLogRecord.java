package io.opentelemetry.sdk.logs;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.Value;
import io.opentelemetry.api.incubator.common.ExtendedAttributeKey;
import io.opentelemetry.api.incubator.common.ExtendedAttributes;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.internal.ExtendedAttributesMap;
import io.opentelemetry.sdk.logs.data.internal.ExtendedLogRecordData;
import io.opentelemetry.sdk.logs.internal.ExtendedReadWriteLogRecord;
import io.opentelemetry.sdk.resources.Resource;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
class ExtendedSdkReadWriteLogRecord extends SdkReadWriteLogRecord implements ExtendedReadWriteLogRecord {

    @Nullable
    private ExtendedAttributesMap extendedAttributes;
    private final Object lock;

    @Override // io.opentelemetry.sdk.logs.SdkReadWriteLogRecord, io.opentelemetry.sdk.logs.ReadWriteLogRecord
    public /* bridge */ /* synthetic */ ReadWriteLogRecord setAttribute(AttributeKey attributeKey, Object obj) {
        return setAttribute((AttributeKey<AttributeKey>) attributeKey, (AttributeKey) obj);
    }

    @Override // io.opentelemetry.sdk.logs.internal.ExtendedReadWriteLogRecord
    public /* bridge */ /* synthetic */ ExtendedReadWriteLogRecord setAttribute(ExtendedAttributeKey extendedAttributeKey, Object obj) {
        return setAttribute((ExtendedAttributeKey<ExtendedAttributeKey>) extendedAttributeKey, (ExtendedAttributeKey) obj);
    }

    private ExtendedSdkReadWriteLogRecord(LogLimits logLimits, Resource resource, InstrumentationScopeInfo instrumentationScopeInfo, @Nullable String str, long j, long j2, SpanContext spanContext, Severity severity, @Nullable String str2, @Nullable Value<?> value, @Nullable ExtendedAttributesMap extendedAttributesMap) {
        super(logLimits, resource, instrumentationScopeInfo, j, j2, spanContext, severity, str2, value, null, str);
        this.lock = new Object();
        this.extendedAttributes = extendedAttributesMap;
    }

    static ExtendedSdkReadWriteLogRecord create(LogLimits logLimits, Resource resource, InstrumentationScopeInfo instrumentationScopeInfo, @Nullable String str, long j, long j2, SpanContext spanContext, Severity severity, @Nullable String str2, @Nullable Value<?> value, @Nullable ExtendedAttributesMap extendedAttributesMap) {
        return new ExtendedSdkReadWriteLogRecord(logLimits, resource, instrumentationScopeInfo, str, j, j2, spanContext, severity, str2, value, extendedAttributesMap);
    }

    @Override // io.opentelemetry.sdk.logs.SdkReadWriteLogRecord, io.opentelemetry.sdk.logs.ReadWriteLogRecord
    public <T> ExtendedSdkReadWriteLogRecord setAttribute(AttributeKey<T> attributeKey, T t) {
        return (attributeKey == null || attributeKey.getKey().isEmpty() || t == null) ? this : setAttribute((ExtendedAttributeKey<ExtendedAttributeKey<T>>) ExtendedAttributeKey.fromAttributeKey(attributeKey), (ExtendedAttributeKey<T>) t);
    }

    @Override // io.opentelemetry.sdk.logs.internal.ExtendedReadWriteLogRecord
    public <T> ExtendedSdkReadWriteLogRecord setAttribute(ExtendedAttributeKey<T> extendedAttributeKey, T t) {
        if (extendedAttributeKey == null || extendedAttributeKey.getKey().isEmpty() || t == null) {
            return this;
        }
        synchronized (this.lock) {
            if (this.extendedAttributes == null) {
                this.extendedAttributes = ExtendedAttributesMap.create(this.logLimits.getMaxNumberOfAttributes(), this.logLimits.getMaxAttributeValueLength());
            }
            this.extendedAttributes.put((ExtendedAttributeKey<?>) extendedAttributeKey, (Object) t);
        }
        return this;
    }

    private ExtendedAttributes getImmutableExtendedAttributes() {
        synchronized (this.lock) {
            ExtendedAttributesMap extendedAttributesMap = this.extendedAttributes;
            if (extendedAttributesMap == null) {
                return ExtendedAttributes.empty();
            }
            return extendedAttributesMap.immutableCopy();
        }
    }

    @Override // io.opentelemetry.sdk.logs.SdkReadWriteLogRecord, io.opentelemetry.sdk.logs.ReadWriteLogRecord, io.opentelemetry.sdk.logs.internal.ExtendedReadWriteLogRecord
    public ExtendedLogRecordData toLogRecordData() {
        ExtendedSdkLogRecordData create;
        synchronized (this.lock) {
            Resource resource = this.resource;
            InstrumentationScopeInfo instrumentationScopeInfo = this.instrumentationScopeInfo;
            String str = this.eventName;
            long j = this.timestampEpochNanos;
            long j2 = this.observedTimestampEpochNanos;
            SpanContext spanContext = this.spanContext;
            Severity severity = this.severity;
            String str2 = this.severityText;
            Value<?> value = this.body;
            ExtendedAttributes immutableExtendedAttributes = getImmutableExtendedAttributes();
            ExtendedAttributesMap extendedAttributesMap = this.extendedAttributes;
            create = ExtendedSdkLogRecordData.create(resource, instrumentationScopeInfo, str, j, j2, spanContext, severity, str2, value, immutableExtendedAttributes, extendedAttributesMap == null ? 0 : extendedAttributesMap.getTotalAddedValues());
        }
        return create;
    }

    @Override // io.opentelemetry.sdk.logs.SdkReadWriteLogRecord, io.opentelemetry.sdk.logs.ReadWriteLogRecord
    public Attributes getAttributes() {
        return getExtendedAttributes().asAttributes();
    }

    @Override // io.opentelemetry.sdk.logs.SdkReadWriteLogRecord, io.opentelemetry.sdk.logs.ReadWriteLogRecord
    @Nullable
    public <T> T getAttribute(AttributeKey<T> attributeKey) {
        return (T) getAttribute(ExtendedAttributeKey.fromAttributeKey(attributeKey));
    }

    @Override // io.opentelemetry.sdk.logs.internal.ExtendedReadWriteLogRecord
    @Nullable
    public <T> T getAttribute(ExtendedAttributeKey<T> extendedAttributeKey) {
        synchronized (this.lock) {
            ExtendedAttributesMap extendedAttributesMap = this.extendedAttributes;
            if (extendedAttributesMap != null && !extendedAttributesMap.isEmpty()) {
                return (T) this.extendedAttributes.get((ExtendedAttributeKey) extendedAttributeKey);
            }
            return null;
        }
    }

    @Override // io.opentelemetry.sdk.logs.internal.ExtendedReadWriteLogRecord
    public ExtendedAttributes getExtendedAttributes() {
        return getImmutableExtendedAttributes();
    }
}
