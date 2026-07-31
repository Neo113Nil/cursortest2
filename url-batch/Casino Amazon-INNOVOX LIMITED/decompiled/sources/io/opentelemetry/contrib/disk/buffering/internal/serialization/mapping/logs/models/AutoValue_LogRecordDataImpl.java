package io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs.models;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.Value;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs.models.LogRecordDataImpl;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.resources.Resource;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
final class AutoValue_LogRecordDataImpl extends LogRecordDataImpl {
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

    private AutoValue_LogRecordDataImpl(Resource resource, InstrumentationScopeInfo instrumentationScopeInfo, long j, long j2, SpanContext spanContext, Severity severity, @Nullable String str, int i, Attributes attributes, @Nullable Value<?> value, @Nullable String str2) {
        this.resource = resource;
        this.instrumentationScopeInfo = instrumentationScopeInfo;
        this.timestampEpochNanos = j;
        this.observedTimestampEpochNanos = j2;
        this.spanContext = spanContext;
        this.severity = severity;
        this.severityText = str;
        this.totalAttributeCount = i;
        this.attributes = attributes;
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
    public int getTotalAttributeCount() {
        return this.totalAttributeCount;
    }

    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs.models.LogRecordDataImpl, io.opentelemetry.sdk.logs.data.internal.ExtendedLogRecordData, io.opentelemetry.sdk.logs.data.LogRecordData
    public Attributes getAttributes() {
        return this.attributes;
    }

    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs.models.LogRecordDataImpl, io.opentelemetry.sdk.logs.data.LogRecordData
    @Nullable
    public Value<?> getBodyValue() {
        return this.bodyValue;
    }

    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs.models.LogRecordDataImpl, io.opentelemetry.sdk.logs.data.LogRecordData
    @Nullable
    public String getEventName() {
        return this.eventName;
    }

    public String toString() {
        return "LogRecordDataImpl{resource=" + this.resource + ", instrumentationScopeInfo=" + this.instrumentationScopeInfo + ", timestampEpochNanos=" + this.timestampEpochNanos + ", observedTimestampEpochNanos=" + this.observedTimestampEpochNanos + ", spanContext=" + this.spanContext + ", severity=" + this.severity + ", severityText=" + this.severityText + ", totalAttributeCount=" + this.totalAttributeCount + ", attributes=" + this.attributes + ", bodyValue=" + this.bodyValue + ", eventName=" + this.eventName + "}";
    }

    public boolean equals(Object obj) {
        String str;
        Value<?> value;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof LogRecordDataImpl) {
            LogRecordDataImpl logRecordDataImpl = (LogRecordDataImpl) obj;
            if (this.resource.equals(logRecordDataImpl.getResource()) && this.instrumentationScopeInfo.equals(logRecordDataImpl.getInstrumentationScopeInfo()) && this.timestampEpochNanos == logRecordDataImpl.getTimestampEpochNanos() && this.observedTimestampEpochNanos == logRecordDataImpl.getObservedTimestampEpochNanos() && this.spanContext.equals(logRecordDataImpl.getSpanContext()) && this.severity.equals(logRecordDataImpl.getSeverity()) && ((str = this.severityText) != null ? str.equals(logRecordDataImpl.getSeverityText()) : logRecordDataImpl.getSeverityText() == null) && this.totalAttributeCount == logRecordDataImpl.getTotalAttributeCount() && this.attributes.equals(logRecordDataImpl.getAttributes()) && ((value = this.bodyValue) != null ? value.equals(logRecordDataImpl.getBodyValue()) : logRecordDataImpl.getBodyValue() == null) && ((str2 = this.eventName) != null ? str2.equals(logRecordDataImpl.getEventName()) : logRecordDataImpl.getEventName() == null)) {
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
        int hashCode3 = (((((hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.totalAttributeCount) * 1000003) ^ this.attributes.hashCode()) * 1000003;
        Value<?> value = this.bodyValue;
        int hashCode4 = (hashCode3 ^ (value == null ? 0 : value.hashCode())) * 1000003;
        String str2 = this.eventName;
        return hashCode4 ^ (str2 != null ? str2.hashCode() : 0);
    }

    static final class Builder extends LogRecordDataImpl.Builder {
        private Attributes attributes;
        private Value<?> bodyValue;
        private String eventName;
        private InstrumentationScopeInfo instrumentationScopeInfo;
        private long observedTimestampEpochNanos;
        private Resource resource;
        private byte set$0;
        private Severity severity;
        private String severityText;
        private SpanContext spanContext;
        private long timestampEpochNanos;
        private int totalAttributeCount;

        Builder() {
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs.models.LogRecordDataImpl.Builder
        public LogRecordDataImpl.Builder setResource(Resource resource) {
            if (resource == null) {
                throw new NullPointerException("Null resource");
            }
            this.resource = resource;
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs.models.LogRecordDataImpl.Builder
        public LogRecordDataImpl.Builder setInstrumentationScopeInfo(InstrumentationScopeInfo instrumentationScopeInfo) {
            if (instrumentationScopeInfo == null) {
                throw new NullPointerException("Null instrumentationScopeInfo");
            }
            this.instrumentationScopeInfo = instrumentationScopeInfo;
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs.models.LogRecordDataImpl.Builder
        public LogRecordDataImpl.Builder setTimestampEpochNanos(Long l) {
            if (l == null) {
                throw new NullPointerException("Null timestampEpochNanos");
            }
            this.timestampEpochNanos = l.longValue();
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs.models.LogRecordDataImpl.Builder
        public LogRecordDataImpl.Builder setObservedTimestampEpochNanos(Long l) {
            if (l == null) {
                throw new NullPointerException("Null observedTimestampEpochNanos");
            }
            this.observedTimestampEpochNanos = l.longValue();
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs.models.LogRecordDataImpl.Builder
        public LogRecordDataImpl.Builder setSpanContext(SpanContext spanContext) {
            if (spanContext == null) {
                throw new NullPointerException("Null spanContext");
            }
            this.spanContext = spanContext;
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs.models.LogRecordDataImpl.Builder
        public LogRecordDataImpl.Builder setSeverity(Severity severity) {
            if (severity == null) {
                throw new NullPointerException("Null severity");
            }
            this.severity = severity;
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs.models.LogRecordDataImpl.Builder
        public LogRecordDataImpl.Builder setSeverityText(String str) {
            this.severityText = str;
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs.models.LogRecordDataImpl.Builder
        public LogRecordDataImpl.Builder setTotalAttributeCount(Integer num) {
            if (num == null) {
                throw new NullPointerException("Null totalAttributeCount");
            }
            this.totalAttributeCount = num.intValue();
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs.models.LogRecordDataImpl.Builder
        public LogRecordDataImpl.Builder setAttributes(Attributes attributes) {
            if (attributes == null) {
                throw new NullPointerException("Null attributes");
            }
            this.attributes = attributes;
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs.models.LogRecordDataImpl.Builder
        public LogRecordDataImpl.Builder setBodyValue(@Nullable Value<?> value) {
            this.bodyValue = value;
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs.models.LogRecordDataImpl.Builder
        public LogRecordDataImpl.Builder setEventName(String str) {
            this.eventName = str;
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs.models.LogRecordDataImpl.Builder
        public LogRecordDataImpl build() {
            if (this.set$0 != 7 || this.resource == null || this.instrumentationScopeInfo == null || this.spanContext == null || this.severity == null || this.attributes == null) {
                StringBuilder sb = new StringBuilder();
                if (this.resource == null) {
                    sb.append(" resource");
                }
                if (this.instrumentationScopeInfo == null) {
                    sb.append(" instrumentationScopeInfo");
                }
                if ((this.set$0 & 1) == 0) {
                    sb.append(" timestampEpochNanos");
                }
                if ((this.set$0 & 2) == 0) {
                    sb.append(" observedTimestampEpochNanos");
                }
                if (this.spanContext == null) {
                    sb.append(" spanContext");
                }
                if (this.severity == null) {
                    sb.append(" severity");
                }
                if ((this.set$0 & 4) == 0) {
                    sb.append(" totalAttributeCount");
                }
                if (this.attributes == null) {
                    sb.append(" attributes");
                }
                throw new IllegalStateException("Missing required properties:" + ((Object) sb));
            }
            return new AutoValue_LogRecordDataImpl(this.resource, this.instrumentationScopeInfo, this.timestampEpochNanos, this.observedTimestampEpochNanos, this.spanContext, this.severity, this.severityText, this.totalAttributeCount, this.attributes, this.bodyValue, this.eventName);
        }
    }
}
