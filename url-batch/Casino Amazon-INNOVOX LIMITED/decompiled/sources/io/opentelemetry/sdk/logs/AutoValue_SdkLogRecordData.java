package io.opentelemetry.sdk.logs;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.Value;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.resources.Resource;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
final class AutoValue_SdkLogRecordData extends SdkLogRecordData {
    private final Attributes attributes;

    @Nullable
    private final Value<?> bodyValue;

    @Nullable
    private final String eventName;
    private final InstrumentationScopeInfo instrumentationScopeInfo;
    private final long observedTimestampEpochNanos;
    private final Resource resource;
    private final Severity severity;

    @Nullable
    private final String severityText;
    private final SpanContext spanContext;
    private final long timestampEpochNanos;
    private final int totalAttributeCount;

    AutoValue_SdkLogRecordData(Resource resource, InstrumentationScopeInfo instrumentationScopeInfo, long j, long j2, SpanContext spanContext, Severity severity, @Nullable String str, Attributes attributes, int i, @Nullable Value<?> value, @Nullable String str2) {
        if (resource == null) {
            throw new NullPointerException("Null resource");
        }
        this.resource = resource;
        if (instrumentationScopeInfo == null) {
            throw new NullPointerException("Null instrumentationScopeInfo");
        }
        this.instrumentationScopeInfo = instrumentationScopeInfo;
        this.timestampEpochNanos = j;
        this.observedTimestampEpochNanos = j2;
        if (spanContext == null) {
            throw new NullPointerException("Null spanContext");
        }
        this.spanContext = spanContext;
        if (severity == null) {
            throw new NullPointerException("Null severity");
        }
        this.severity = severity;
        this.severityText = str;
        if (attributes == null) {
            throw new NullPointerException("Null attributes");
        }
        this.attributes = attributes;
        this.totalAttributeCount = i;
        this.bodyValue = value;
        this.eventName = str2;
    }

    @Override // io.opentelemetry.sdk.logs.data.LogRecordData
    public Resource getResource() {
        return this.resource;
    }

    @Override // io.opentelemetry.sdk.logs.data.LogRecordData
    public InstrumentationScopeInfo getInstrumentationScopeInfo() {
        return this.instrumentationScopeInfo;
    }

    @Override // io.opentelemetry.sdk.logs.data.LogRecordData
    public long getTimestampEpochNanos() {
        return this.timestampEpochNanos;
    }

    @Override // io.opentelemetry.sdk.logs.data.LogRecordData
    public long getObservedTimestampEpochNanos() {
        return this.observedTimestampEpochNanos;
    }

    @Override // io.opentelemetry.sdk.logs.data.LogRecordData
    public SpanContext getSpanContext() {
        return this.spanContext;
    }

    @Override // io.opentelemetry.sdk.logs.data.LogRecordData
    public Severity getSeverity() {
        return this.severity;
    }

    @Override // io.opentelemetry.sdk.logs.data.LogRecordData
    @Nullable
    public String getSeverityText() {
        return this.severityText;
    }

    @Override // io.opentelemetry.sdk.logs.data.LogRecordData
    public Attributes getAttributes() {
        return this.attributes;
    }

    @Override // io.opentelemetry.sdk.logs.data.LogRecordData
    public int getTotalAttributeCount() {
        return this.totalAttributeCount;
    }

    @Override // io.opentelemetry.sdk.logs.SdkLogRecordData, io.opentelemetry.sdk.logs.data.LogRecordData
    @Nullable
    public Value<?> getBodyValue() {
        return this.bodyValue;
    }

    @Override // io.opentelemetry.sdk.logs.SdkLogRecordData, io.opentelemetry.sdk.logs.data.LogRecordData
    @Nullable
    public String getEventName() {
        return this.eventName;
    }

    public String toString() {
        return "SdkLogRecordData{resource=" + this.resource + ", instrumentationScopeInfo=" + this.instrumentationScopeInfo + ", timestampEpochNanos=" + this.timestampEpochNanos + ", observedTimestampEpochNanos=" + this.observedTimestampEpochNanos + ", spanContext=" + this.spanContext + ", severity=" + this.severity + ", severityText=" + this.severityText + ", attributes=" + this.attributes + ", totalAttributeCount=" + this.totalAttributeCount + ", bodyValue=" + this.bodyValue + ", eventName=" + this.eventName + "}";
    }

    public boolean equals(Object obj) {
        String str;
        Value<?> value;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SdkLogRecordData) {
            SdkLogRecordData sdkLogRecordData = (SdkLogRecordData) obj;
            if (this.resource.equals(sdkLogRecordData.getResource()) && this.instrumentationScopeInfo.equals(sdkLogRecordData.getInstrumentationScopeInfo()) && this.timestampEpochNanos == sdkLogRecordData.getTimestampEpochNanos() && this.observedTimestampEpochNanos == sdkLogRecordData.getObservedTimestampEpochNanos() && this.spanContext.equals(sdkLogRecordData.getSpanContext()) && this.severity.equals(sdkLogRecordData.getSeverity()) && ((str = this.severityText) != null ? str.equals(sdkLogRecordData.getSeverityText()) : sdkLogRecordData.getSeverityText() == null) && this.attributes.equals(sdkLogRecordData.getAttributes()) && this.totalAttributeCount == sdkLogRecordData.getTotalAttributeCount() && ((value = this.bodyValue) != null ? value.equals(sdkLogRecordData.getBodyValue()) : sdkLogRecordData.getBodyValue() == null) && ((str2 = this.eventName) != null ? str2.equals(sdkLogRecordData.getEventName()) : sdkLogRecordData.getEventName() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.resource.hashCode() ^ 1000003) * 1000003) ^ this.instrumentationScopeInfo.hashCode()) * 1000003;
        long j = this.timestampEpochNanos;
        int i = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.observedTimestampEpochNanos;
        int hashCode2 = (((((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.spanContext.hashCode()) * 1000003) ^ this.severity.hashCode()) * 1000003;
        String str = this.severityText;
        int hashCode3 = (((((hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.attributes.hashCode()) * 1000003) ^ this.totalAttributeCount) * 1000003;
        Value<?> value = this.bodyValue;
        int hashCode4 = (hashCode3 ^ (value == null ? 0 : value.hashCode())) * 1000003;
        String str2 = this.eventName;
        return hashCode4 ^ (str2 != null ? str2.hashCode() : 0);
    }
}
