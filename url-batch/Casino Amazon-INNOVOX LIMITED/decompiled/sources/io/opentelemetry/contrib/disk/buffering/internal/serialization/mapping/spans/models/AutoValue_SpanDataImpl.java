package io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.spans.models;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.spans.models.SpanDataImpl;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.sdk.trace.data.EventData;
import io.opentelemetry.sdk.trace.data.LinkData;
import io.opentelemetry.sdk.trace.data.StatusData;
import java.util.List;

/* loaded from: classes3.dex */
final class AutoValue_SpanDataImpl extends SpanDataImpl {
    private final Attributes attributes;
    private final long endEpochNanos;
    private final List<EventData> events;
    private final InstrumentationScopeInfo instrumentationScopeInfo;
    private final SpanKind kind;
    private final List<LinkData> links;
    private final String name;
    private final SpanContext parentSpanContext;
    private final Resource resource;
    private final SpanContext spanContext;
    private final long startEpochNanos;
    private final StatusData status;
    private final int totalAttributeCount;
    private final int totalRecordedEvents;
    private final int totalRecordedLinks;

    private AutoValue_SpanDataImpl(String str, SpanKind spanKind, SpanContext spanContext, SpanContext spanContext2, StatusData statusData, long j, Attributes attributes, List<EventData> list, List<LinkData> list2, long j2, int i, int i2, int i3, Resource resource, InstrumentationScopeInfo instrumentationScopeInfo) {
        this.name = str;
        this.kind = spanKind;
        this.spanContext = spanContext;
        this.parentSpanContext = spanContext2;
        this.status = statusData;
        this.startEpochNanos = j;
        this.attributes = attributes;
        this.events = list;
        this.links = list2;
        this.endEpochNanos = j2;
        this.totalRecordedEvents = i;
        this.totalRecordedLinks = i2;
        this.totalAttributeCount = i3;
        this.resource = resource;
        this.instrumentationScopeInfo = instrumentationScopeInfo;
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public String getName() {
        return this.name;
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public SpanKind getKind() {
        return this.kind;
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public SpanContext getSpanContext() {
        return this.spanContext;
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public SpanContext getParentSpanContext() {
        return this.parentSpanContext;
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public StatusData getStatus() {
        return this.status;
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public long getStartEpochNanos() {
        return this.startEpochNanos;
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public Attributes getAttributes() {
        return this.attributes;
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public List<EventData> getEvents() {
        return this.events;
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public List<LinkData> getLinks() {
        return this.links;
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public long getEndEpochNanos() {
        return this.endEpochNanos;
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public int getTotalRecordedEvents() {
        return this.totalRecordedEvents;
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public int getTotalRecordedLinks() {
        return this.totalRecordedLinks;
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public int getTotalAttributeCount() {
        return this.totalAttributeCount;
    }

    @Override // io.opentelemetry.sdk.trace.data.SpanData
    public Resource getResource() {
        return this.resource;
    }

    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.spans.models.SpanDataImpl, io.opentelemetry.sdk.trace.data.SpanData
    public InstrumentationScopeInfo getInstrumentationScopeInfo() {
        return this.instrumentationScopeInfo;
    }

    public String toString() {
        return "SpanDataImpl{name=" + this.name + ", kind=" + this.kind + ", spanContext=" + this.spanContext + ", parentSpanContext=" + this.parentSpanContext + ", status=" + this.status + ", startEpochNanos=" + this.startEpochNanos + ", attributes=" + this.attributes + ", events=" + this.events + ", links=" + this.links + ", endEpochNanos=" + this.endEpochNanos + ", totalRecordedEvents=" + this.totalRecordedEvents + ", totalRecordedLinks=" + this.totalRecordedLinks + ", totalAttributeCount=" + this.totalAttributeCount + ", resource=" + this.resource + ", instrumentationScopeInfo=" + this.instrumentationScopeInfo + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SpanDataImpl) {
            SpanDataImpl spanDataImpl = (SpanDataImpl) obj;
            if (this.name.equals(spanDataImpl.getName()) && this.kind.equals(spanDataImpl.getKind()) && this.spanContext.equals(spanDataImpl.getSpanContext()) && this.parentSpanContext.equals(spanDataImpl.getParentSpanContext()) && this.status.equals(spanDataImpl.getStatus()) && this.startEpochNanos == spanDataImpl.getStartEpochNanos() && this.attributes.equals(spanDataImpl.getAttributes()) && this.events.equals(spanDataImpl.getEvents()) && this.links.equals(spanDataImpl.getLinks()) && this.endEpochNanos == spanDataImpl.getEndEpochNanos() && this.totalRecordedEvents == spanDataImpl.getTotalRecordedEvents() && this.totalRecordedLinks == spanDataImpl.getTotalRecordedLinks() && this.totalAttributeCount == spanDataImpl.getTotalAttributeCount() && this.resource.equals(spanDataImpl.getResource()) && this.instrumentationScopeInfo.equals(spanDataImpl.getInstrumentationScopeInfo())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((((((this.name.hashCode() ^ 1000003) * 1000003) ^ this.kind.hashCode()) * 1000003) ^ this.spanContext.hashCode()) * 1000003) ^ this.parentSpanContext.hashCode()) * 1000003) ^ this.status.hashCode()) * 1000003;
        long j = this.startEpochNanos;
        int hashCode2 = (((((((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.attributes.hashCode()) * 1000003) ^ this.events.hashCode()) * 1000003) ^ this.links.hashCode()) * 1000003;
        long j2 = this.endEpochNanos;
        return ((((((((((hashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.totalRecordedEvents) * 1000003) ^ this.totalRecordedLinks) * 1000003) ^ this.totalAttributeCount) * 1000003) ^ this.resource.hashCode()) * 1000003) ^ this.instrumentationScopeInfo.hashCode();
    }

    static final class Builder extends SpanDataImpl.Builder {
        private Attributes attributes;
        private long endEpochNanos;
        private List<EventData> events;
        private InstrumentationScopeInfo instrumentationScopeInfo;
        private SpanKind kind;
        private List<LinkData> links;
        private String name;
        private SpanContext parentSpanContext;
        private Resource resource;
        private byte set$0;
        private SpanContext spanContext;
        private long startEpochNanos;
        private StatusData status;
        private int totalAttributeCount;
        private int totalRecordedEvents;
        private int totalRecordedLinks;

        Builder() {
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.spans.models.SpanDataImpl.Builder
        public SpanDataImpl.Builder setName(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.name = str;
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.spans.models.SpanDataImpl.Builder
        public SpanDataImpl.Builder setKind(SpanKind spanKind) {
            if (spanKind == null) {
                throw new NullPointerException("Null kind");
            }
            this.kind = spanKind;
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.spans.models.SpanDataImpl.Builder
        public SpanDataImpl.Builder setSpanContext(SpanContext spanContext) {
            if (spanContext == null) {
                throw new NullPointerException("Null spanContext");
            }
            this.spanContext = spanContext;
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.spans.models.SpanDataImpl.Builder
        public SpanDataImpl.Builder setParentSpanContext(SpanContext spanContext) {
            if (spanContext == null) {
                throw new NullPointerException("Null parentSpanContext");
            }
            this.parentSpanContext = spanContext;
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.spans.models.SpanDataImpl.Builder
        public SpanDataImpl.Builder setStatus(StatusData statusData) {
            if (statusData == null) {
                throw new NullPointerException("Null status");
            }
            this.status = statusData;
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.spans.models.SpanDataImpl.Builder
        public SpanDataImpl.Builder setStartEpochNanos(Long l) {
            if (l == null) {
                throw new NullPointerException("Null startEpochNanos");
            }
            this.startEpochNanos = l.longValue();
            this.set$0 = (byte) (this.set$0 | 1);
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.spans.models.SpanDataImpl.Builder
        public SpanDataImpl.Builder setAttributes(Attributes attributes) {
            if (attributes == null) {
                throw new NullPointerException("Null attributes");
            }
            this.attributes = attributes;
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.spans.models.SpanDataImpl.Builder
        public SpanDataImpl.Builder setEvents(List<EventData> list) {
            if (list == null) {
                throw new NullPointerException("Null events");
            }
            this.events = list;
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.spans.models.SpanDataImpl.Builder
        public SpanDataImpl.Builder setLinks(List<LinkData> list) {
            if (list == null) {
                throw new NullPointerException("Null links");
            }
            this.links = list;
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.spans.models.SpanDataImpl.Builder
        public SpanDataImpl.Builder setEndEpochNanos(Long l) {
            if (l == null) {
                throw new NullPointerException("Null endEpochNanos");
            }
            this.endEpochNanos = l.longValue();
            this.set$0 = (byte) (this.set$0 | 2);
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.spans.models.SpanDataImpl.Builder
        public SpanDataImpl.Builder setTotalRecordedEvents(Integer num) {
            if (num == null) {
                throw new NullPointerException("Null totalRecordedEvents");
            }
            this.totalRecordedEvents = num.intValue();
            this.set$0 = (byte) (this.set$0 | 4);
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.spans.models.SpanDataImpl.Builder
        public SpanDataImpl.Builder setTotalRecordedLinks(Integer num) {
            if (num == null) {
                throw new NullPointerException("Null totalRecordedLinks");
            }
            this.totalRecordedLinks = num.intValue();
            this.set$0 = (byte) (this.set$0 | 8);
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.spans.models.SpanDataImpl.Builder
        public SpanDataImpl.Builder setTotalAttributeCount(Integer num) {
            if (num == null) {
                throw new NullPointerException("Null totalAttributeCount");
            }
            this.totalAttributeCount = num.intValue();
            this.set$0 = (byte) (this.set$0 | 16);
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.spans.models.SpanDataImpl.Builder
        public SpanDataImpl.Builder setResource(Resource resource) {
            if (resource == null) {
                throw new NullPointerException("Null resource");
            }
            this.resource = resource;
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.spans.models.SpanDataImpl.Builder
        public SpanDataImpl.Builder setInstrumentationScopeInfo(InstrumentationScopeInfo instrumentationScopeInfo) {
            if (instrumentationScopeInfo == null) {
                throw new NullPointerException("Null instrumentationScopeInfo");
            }
            this.instrumentationScopeInfo = instrumentationScopeInfo;
            return this;
        }

        @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.spans.models.SpanDataImpl.Builder
        public SpanDataImpl build() {
            if (this.set$0 != 31 || this.name == null || this.kind == null || this.spanContext == null || this.parentSpanContext == null || this.status == null || this.attributes == null || this.events == null || this.links == null || this.resource == null || this.instrumentationScopeInfo == null) {
                StringBuilder sb = new StringBuilder();
                if (this.name == null) {
                    sb.append(" name");
                }
                if (this.kind == null) {
                    sb.append(" kind");
                }
                if (this.spanContext == null) {
                    sb.append(" spanContext");
                }
                if (this.parentSpanContext == null) {
                    sb.append(" parentSpanContext");
                }
                if (this.status == null) {
                    sb.append(" status");
                }
                if ((this.set$0 & 1) == 0) {
                    sb.append(" startEpochNanos");
                }
                if (this.attributes == null) {
                    sb.append(" attributes");
                }
                if (this.events == null) {
                    sb.append(" events");
                }
                if (this.links == null) {
                    sb.append(" links");
                }
                if ((this.set$0 & 2) == 0) {
                    sb.append(" endEpochNanos");
                }
                if ((this.set$0 & 4) == 0) {
                    sb.append(" totalRecordedEvents");
                }
                if ((this.set$0 & 8) == 0) {
                    sb.append(" totalRecordedLinks");
                }
                if ((this.set$0 & 16) == 0) {
                    sb.append(" totalAttributeCount");
                }
                if (this.resource == null) {
                    sb.append(" resource");
                }
                if (this.instrumentationScopeInfo == null) {
                    sb.append(" instrumentationScopeInfo");
                }
                throw new IllegalStateException("Missing required properties:" + ((Object) sb));
            }
            return new AutoValue_SpanDataImpl(this.name, this.kind, this.spanContext, this.parentSpanContext, this.status, this.startEpochNanos, this.attributes, this.events, this.links, this.endEpochNanos, this.totalRecordedEvents, this.totalRecordedLinks, this.totalAttributeCount, this.resource, this.instrumentationScopeInfo);
        }
    }
}
