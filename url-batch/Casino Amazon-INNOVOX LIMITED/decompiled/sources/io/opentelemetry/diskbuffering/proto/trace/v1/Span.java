package io.opentelemetry.diskbuffering.proto.trace.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import io.opentelemetry.diskbuffering.proto.common.v1.KeyValue;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class Span extends Message<Span, Builder> {
    public static final ProtoAdapter<Span> ADAPTER = new ProtoAdapter_Span();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.common.v1.KeyValue#ADAPTER", label = WireField.Label.REPEATED, tag = 9)
    public final List<KeyValue> attributes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "droppedAttributesCount", label = WireField.Label.OMIT_IDENTITY, tag = 10)
    public final int dropped_attributes_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "droppedEventsCount", label = WireField.Label.OMIT_IDENTITY, tag = 12)
    public final int dropped_events_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "droppedLinksCount", label = WireField.Label.OMIT_IDENTITY, tag = 14)
    public final int dropped_links_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", jsonName = "endTimeUnixNano", label = WireField.Label.OMIT_IDENTITY, tag = 8)
    public final long end_time_unix_nano;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.trace.v1.Span$Event#ADAPTER", label = WireField.Label.REPEATED, tag = 11)
    public final List<Event> events;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED32", label = WireField.Label.OMIT_IDENTITY, tag = 16)
    public final int flags;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.trace.v1.Span$SpanKind#ADAPTER", label = WireField.Label.OMIT_IDENTITY, tag = 6)
    public final SpanKind kind;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.trace.v1.Span$Link#ADAPTER", label = WireField.Label.REPEATED, tag = 13)
    public final List<Link> links;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, tag = 5)
    public final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "parentSpanId", label = WireField.Label.OMIT_IDENTITY, tag = 4)
    public final ByteString parent_span_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "spanId", label = WireField.Label.OMIT_IDENTITY, tag = 2)
    public final ByteString span_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", jsonName = "startTimeUnixNano", label = WireField.Label.OMIT_IDENTITY, tag = 7)
    public final long start_time_unix_nano;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.trace.v1.Status#ADAPTER", label = WireField.Label.OMIT_IDENTITY, tag = 15)
    public final Status status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "traceId", label = WireField.Label.OMIT_IDENTITY, tag = 1)
    public final ByteString trace_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "traceState", label = WireField.Label.OMIT_IDENTITY, tag = 3)
    public final String trace_state;

    public Span(Builder builder, ByteString byteString) {
        super(ADAPTER, byteString);
        if (builder.trace_id == null) {
            throw new IllegalArgumentException("builder.trace_id == null");
        }
        this.trace_id = builder.trace_id;
        if (builder.span_id == null) {
            throw new IllegalArgumentException("builder.span_id == null");
        }
        this.span_id = builder.span_id;
        if (builder.trace_state == null) {
            throw new IllegalArgumentException("builder.trace_state == null");
        }
        this.trace_state = builder.trace_state;
        if (builder.parent_span_id == null) {
            throw new IllegalArgumentException("builder.parent_span_id == null");
        }
        this.parent_span_id = builder.parent_span_id;
        this.flags = builder.flags;
        if (builder.name == null) {
            throw new IllegalArgumentException("builder.name == null");
        }
        this.name = builder.name;
        if (builder.kind == null) {
            throw new IllegalArgumentException("builder.kind == null");
        }
        this.kind = builder.kind;
        this.start_time_unix_nano = builder.start_time_unix_nano;
        this.end_time_unix_nano = builder.end_time_unix_nano;
        this.attributes = Internal.immutableCopyOf("attributes", builder.attributes);
        this.dropped_attributes_count = builder.dropped_attributes_count;
        this.events = Internal.immutableCopyOf("events", builder.events);
        this.dropped_events_count = builder.dropped_events_count;
        this.links = Internal.immutableCopyOf("links", builder.links);
        this.dropped_links_count = builder.dropped_links_count;
        this.status = builder.status;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.trace_id = this.trace_id;
        builder.span_id = this.span_id;
        builder.trace_state = this.trace_state;
        builder.parent_span_id = this.parent_span_id;
        builder.flags = this.flags;
        builder.name = this.name;
        builder.kind = this.kind;
        builder.start_time_unix_nano = this.start_time_unix_nano;
        builder.end_time_unix_nano = this.end_time_unix_nano;
        builder.attributes = Internal.copyOf(this.attributes);
        builder.dropped_attributes_count = this.dropped_attributes_count;
        builder.events = Internal.copyOf(this.events);
        builder.dropped_events_count = this.dropped_events_count;
        builder.links = Internal.copyOf(this.links);
        builder.dropped_links_count = this.dropped_links_count;
        builder.status = this.status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Span)) {
            return false;
        }
        Span span = (Span) obj;
        return unknownFields().equals(span.unknownFields()) && Internal.equals(this.trace_id, span.trace_id) && Internal.equals(this.span_id, span.span_id) && Internal.equals(this.trace_state, span.trace_state) && Internal.equals(this.parent_span_id, span.parent_span_id) && Internal.equals(Integer.valueOf(this.flags), Integer.valueOf(span.flags)) && Internal.equals(this.name, span.name) && Internal.equals(this.kind, span.kind) && Internal.equals(Long.valueOf(this.start_time_unix_nano), Long.valueOf(span.start_time_unix_nano)) && Internal.equals(Long.valueOf(this.end_time_unix_nano), Long.valueOf(span.end_time_unix_nano)) && this.attributes.equals(span.attributes) && Internal.equals(Integer.valueOf(this.dropped_attributes_count), Integer.valueOf(span.dropped_attributes_count)) && this.events.equals(span.events) && Internal.equals(Integer.valueOf(this.dropped_events_count), Integer.valueOf(span.dropped_events_count)) && this.links.equals(span.links) && Internal.equals(Integer.valueOf(this.dropped_links_count), Integer.valueOf(span.dropped_links_count)) && Internal.equals(this.status, span.status);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.trace_id;
        int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        ByteString byteString2 = this.span_id;
        int hashCode3 = (hashCode2 + (byteString2 != null ? byteString2.hashCode() : 0)) * 37;
        String str = this.trace_state;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        ByteString byteString3 = this.parent_span_id;
        int hashCode5 = (((hashCode4 + (byteString3 != null ? byteString3.hashCode() : 0)) * 37) + Integer.hashCode(this.flags)) * 37;
        String str2 = this.name;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        SpanKind spanKind = this.kind;
        int hashCode7 = (((((((((((((((((hashCode6 + (spanKind != null ? spanKind.hashCode() : 0)) * 37) + Long.hashCode(this.start_time_unix_nano)) * 37) + Long.hashCode(this.end_time_unix_nano)) * 37) + this.attributes.hashCode()) * 37) + Integer.hashCode(this.dropped_attributes_count)) * 37) + this.events.hashCode()) * 37) + Integer.hashCode(this.dropped_events_count)) * 37) + this.links.hashCode()) * 37) + Integer.hashCode(this.dropped_links_count)) * 37;
        Status status = this.status;
        int hashCode8 = hashCode7 + (status != null ? status.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.trace_id != null) {
            sb.append(", trace_id=").append(this.trace_id);
        }
        if (this.span_id != null) {
            sb.append(", span_id=").append(this.span_id);
        }
        if (this.trace_state != null) {
            sb.append(", trace_state=").append(Internal.sanitize(this.trace_state));
        }
        if (this.parent_span_id != null) {
            sb.append(", parent_span_id=").append(this.parent_span_id);
        }
        sb.append(", flags=").append(this.flags);
        if (this.name != null) {
            sb.append(", name=").append(Internal.sanitize(this.name));
        }
        if (this.kind != null) {
            sb.append(", kind=").append(this.kind);
        }
        sb.append(", start_time_unix_nano=").append(this.start_time_unix_nano);
        sb.append(", end_time_unix_nano=").append(this.end_time_unix_nano);
        if (!this.attributes.isEmpty()) {
            sb.append(", attributes=").append(this.attributes);
        }
        sb.append(", dropped_attributes_count=").append(this.dropped_attributes_count);
        if (!this.events.isEmpty()) {
            sb.append(", events=").append(this.events);
        }
        sb.append(", dropped_events_count=").append(this.dropped_events_count);
        if (!this.links.isEmpty()) {
            sb.append(", links=").append(this.links);
        }
        sb.append(", dropped_links_count=").append(this.dropped_links_count);
        if (this.status != null) {
            sb.append(", status=").append(this.status);
        }
        return sb.replace(0, 2, "Span{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<Span, Builder> {
        public Status status;
        public ByteString trace_id = ByteString.EMPTY;
        public ByteString span_id = ByteString.EMPTY;
        public String trace_state = "";
        public ByteString parent_span_id = ByteString.EMPTY;
        public int flags = 0;
        public String name = "";
        public SpanKind kind = SpanKind.SPAN_KIND_UNSPECIFIED;
        public long start_time_unix_nano = 0;
        public long end_time_unix_nano = 0;
        public List<KeyValue> attributes = Internal.newMutableList();
        public int dropped_attributes_count = 0;
        public List<Event> events = Internal.newMutableList();
        public int dropped_events_count = 0;
        public List<Link> links = Internal.newMutableList();
        public int dropped_links_count = 0;

        public Builder trace_id(ByteString byteString) {
            this.trace_id = byteString;
            return this;
        }

        public Builder span_id(ByteString byteString) {
            this.span_id = byteString;
            return this;
        }

        public Builder trace_state(String str) {
            this.trace_state = str;
            return this;
        }

        public Builder parent_span_id(ByteString byteString) {
            this.parent_span_id = byteString;
            return this;
        }

        public Builder flags(int i) {
            this.flags = i;
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder kind(SpanKind spanKind) {
            this.kind = spanKind;
            return this;
        }

        public Builder start_time_unix_nano(long j) {
            this.start_time_unix_nano = j;
            return this;
        }

        public Builder end_time_unix_nano(long j) {
            this.end_time_unix_nano = j;
            return this;
        }

        public Builder attributes(List<KeyValue> list) {
            Internal.checkElementsNotNull(list);
            this.attributes = list;
            return this;
        }

        public Builder dropped_attributes_count(int i) {
            this.dropped_attributes_count = i;
            return this;
        }

        public Builder events(List<Event> list) {
            Internal.checkElementsNotNull(list);
            this.events = list;
            return this;
        }

        public Builder dropped_events_count(int i) {
            this.dropped_events_count = i;
            return this;
        }

        public Builder links(List<Link> list) {
            Internal.checkElementsNotNull(list);
            this.links = list;
            return this;
        }

        public Builder dropped_links_count(int i) {
            this.dropped_links_count = i;
            return this;
        }

        public Builder status(Status status) {
            this.status = status;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Span build() {
            return new Span(this, super.buildUnknownFields());
        }
    }

    public enum SpanKind implements WireEnum {
        SPAN_KIND_UNSPECIFIED(0),
        SPAN_KIND_INTERNAL(1),
        SPAN_KIND_SERVER(2),
        SPAN_KIND_CLIENT(3),
        SPAN_KIND_PRODUCER(4),
        SPAN_KIND_CONSUMER(5);

        public static final ProtoAdapter<SpanKind> ADAPTER = new ProtoAdapter_SpanKind();
        private final int value;

        SpanKind(int i) {
            this.value = i;
        }

        public static SpanKind fromValue(int i) {
            if (i == 0) {
                return SPAN_KIND_UNSPECIFIED;
            }
            if (i == 1) {
                return SPAN_KIND_INTERNAL;
            }
            if (i == 2) {
                return SPAN_KIND_SERVER;
            }
            if (i == 3) {
                return SPAN_KIND_CLIENT;
            }
            if (i == 4) {
                return SPAN_KIND_PRODUCER;
            }
            if (i != 5) {
                return null;
            }
            return SPAN_KIND_CONSUMER;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        private static final class ProtoAdapter_SpanKind extends EnumAdapter<SpanKind> {
            ProtoAdapter_SpanKind() {
                super((Class<SpanKind>) SpanKind.class, Syntax.PROTO_3, SpanKind.SPAN_KIND_UNSPECIFIED);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public SpanKind fromValue(int i) {
                return SpanKind.fromValue(i);
            }
        }
    }

    public static final class Event extends Message<Event, Builder> {
        public static final ProtoAdapter<Event> ADAPTER = new ProtoAdapter_Event();
        private static final long serialVersionUID = 0;

        @WireField(adapter = "io.opentelemetry.diskbuffering.proto.common.v1.KeyValue#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
        public final List<KeyValue> attributes;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "droppedAttributesCount", label = WireField.Label.OMIT_IDENTITY, tag = 4)
        public final int dropped_attributes_count;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, tag = 2)
        public final String name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", jsonName = "timeUnixNano", label = WireField.Label.OMIT_IDENTITY, tag = 1)
        public final long time_unix_nano;

        public Event(long j, String str, List<KeyValue> list, int i) {
            this(j, str, list, i, ByteString.EMPTY);
        }

        public Event(long j, String str, List<KeyValue> list, int i, ByteString byteString) {
            super(ADAPTER, byteString);
            this.time_unix_nano = j;
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            }
            this.name = str;
            this.attributes = Internal.immutableCopyOf("attributes", list);
            this.dropped_attributes_count = i;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.time_unix_nano = this.time_unix_nano;
            builder.name = this.name;
            builder.attributes = Internal.copyOf(this.attributes);
            builder.dropped_attributes_count = this.dropped_attributes_count;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Event)) {
                return false;
            }
            Event event = (Event) obj;
            return unknownFields().equals(event.unknownFields()) && Internal.equals(Long.valueOf(this.time_unix_nano), Long.valueOf(event.time_unix_nano)) && Internal.equals(this.name, event.name) && this.attributes.equals(event.attributes) && Internal.equals(Integer.valueOf(this.dropped_attributes_count), Integer.valueOf(event.dropped_attributes_count));
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = ((unknownFields().hashCode() * 37) + Long.hashCode(this.time_unix_nano)) * 37;
            String str = this.name;
            int hashCode2 = ((((hashCode + (str != null ? str.hashCode() : 0)) * 37) + this.attributes.hashCode()) * 37) + Integer.hashCode(this.dropped_attributes_count);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", time_unix_nano=").append(this.time_unix_nano);
            if (this.name != null) {
                sb.append(", name=").append(Internal.sanitize(this.name));
            }
            if (!this.attributes.isEmpty()) {
                sb.append(", attributes=").append(this.attributes);
            }
            sb.append(", dropped_attributes_count=").append(this.dropped_attributes_count);
            return sb.replace(0, 2, "Event{").append(AbstractJsonLexerKt.END_OBJ).toString();
        }

        public static final class Builder extends Message.Builder<Event, Builder> {
            public long time_unix_nano = 0;
            public String name = "";
            public List<KeyValue> attributes = Internal.newMutableList();
            public int dropped_attributes_count = 0;

            public Builder time_unix_nano(long j) {
                this.time_unix_nano = j;
                return this;
            }

            public Builder name(String str) {
                this.name = str;
                return this;
            }

            public Builder attributes(List<KeyValue> list) {
                Internal.checkElementsNotNull(list);
                this.attributes = list;
                return this;
            }

            public Builder dropped_attributes_count(int i) {
                this.dropped_attributes_count = i;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public Event build() {
                return new Event(this.time_unix_nano, this.name, this.attributes, this.dropped_attributes_count, super.buildUnknownFields());
            }
        }

        private static final class ProtoAdapter_Event extends ProtoAdapter<Event> {
            public ProtoAdapter_Event() {
                super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) Event.class, "type.googleapis.com/opentelemetry.proto.trace.v1.Span.Event", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/trace/v1/trace.proto");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Event event) {
                int encodedSizeWithTag = !Objects.equals(Long.valueOf(event.time_unix_nano), 0L) ? ProtoAdapter.FIXED64.encodedSizeWithTag(1, Long.valueOf(event.time_unix_nano)) : 0;
                if (!Objects.equals(event.name, "")) {
                    encodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(2, event.name);
                }
                int encodedSizeWithTag2 = encodedSizeWithTag + KeyValue.ADAPTER.asRepeated().encodedSizeWithTag(3, event.attributes);
                if (!Objects.equals(Integer.valueOf(event.dropped_attributes_count), 0)) {
                    encodedSizeWithTag2 += ProtoAdapter.UINT32.encodedSizeWithTag(4, Integer.valueOf(event.dropped_attributes_count));
                }
                return encodedSizeWithTag2 + event.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Event event) throws IOException {
                if (!Objects.equals(Long.valueOf(event.time_unix_nano), 0L)) {
                    ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 1, (int) Long.valueOf(event.time_unix_nano));
                }
                if (!Objects.equals(event.name, "")) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, (int) event.name);
                }
                KeyValue.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, (int) event.attributes);
                if (!Objects.equals(Integer.valueOf(event.dropped_attributes_count), 0)) {
                    ProtoAdapter.UINT32.encodeWithTag(protoWriter, 4, (int) Integer.valueOf(event.dropped_attributes_count));
                }
                protoWriter.writeBytes(event.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter reverseProtoWriter, Event event) throws IOException {
                reverseProtoWriter.writeBytes(event.unknownFields());
                if (!Objects.equals(Integer.valueOf(event.dropped_attributes_count), 0)) {
                    ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 4, (int) Integer.valueOf(event.dropped_attributes_count));
                }
                KeyValue.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, (int) event.attributes);
                if (!Objects.equals(event.name, "")) {
                    ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, (int) event.name);
                }
                if (Objects.equals(Long.valueOf(event.time_unix_nano), 0L)) {
                    return;
                }
                ProtoAdapter.FIXED64.encodeWithTag(reverseProtoWriter, 1, (int) Long.valueOf(event.time_unix_nano));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Event decode(ProtoReader protoReader) throws IOException {
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        builder.addUnknownFields(protoReader.endMessageAndGetUnknownFields(beginMessage));
                        return builder.build();
                    }
                    if (nextTag == 1) {
                        builder.time_unix_nano(ProtoAdapter.FIXED64.decode(protoReader).longValue());
                    } else if (nextTag == 2) {
                        builder.name(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 3) {
                        builder.attributes.add(KeyValue.ADAPTER.decode(protoReader));
                    } else if (nextTag == 4) {
                        builder.dropped_attributes_count(ProtoAdapter.UINT32.decode(protoReader).intValue());
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Event redact(Event event) {
                Builder newBuilder = event.newBuilder();
                Internal.redactElements(newBuilder.attributes, KeyValue.ADAPTER);
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }
        }
    }

    public static final class Link extends Message<Link, Builder> {
        public static final ProtoAdapter<Link> ADAPTER = new ProtoAdapter_Link();
        private static final long serialVersionUID = 0;

        @WireField(adapter = "io.opentelemetry.diskbuffering.proto.common.v1.KeyValue#ADAPTER", label = WireField.Label.REPEATED, tag = 4)
        public final List<KeyValue> attributes;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "droppedAttributesCount", label = WireField.Label.OMIT_IDENTITY, tag = 5)
        public final int dropped_attributes_count;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED32", label = WireField.Label.OMIT_IDENTITY, tag = 6)
        public final int flags;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "spanId", label = WireField.Label.OMIT_IDENTITY, tag = 2)
        public final ByteString span_id;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "traceId", label = WireField.Label.OMIT_IDENTITY, tag = 1)
        public final ByteString trace_id;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "traceState", label = WireField.Label.OMIT_IDENTITY, tag = 3)
        public final String trace_state;

        public Link(ByteString byteString, ByteString byteString2, String str, List<KeyValue> list, int i, int i2) {
            this(byteString, byteString2, str, list, i, i2, ByteString.EMPTY);
        }

        public Link(ByteString byteString, ByteString byteString2, String str, List<KeyValue> list, int i, int i2, ByteString byteString3) {
            super(ADAPTER, byteString3);
            if (byteString == null) {
                throw new IllegalArgumentException("trace_id == null");
            }
            this.trace_id = byteString;
            if (byteString2 == null) {
                throw new IllegalArgumentException("span_id == null");
            }
            this.span_id = byteString2;
            if (str == null) {
                throw new IllegalArgumentException("trace_state == null");
            }
            this.trace_state = str;
            this.attributes = Internal.immutableCopyOf("attributes", list);
            this.dropped_attributes_count = i;
            this.flags = i2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.trace_id = this.trace_id;
            builder.span_id = this.span_id;
            builder.trace_state = this.trace_state;
            builder.attributes = Internal.copyOf(this.attributes);
            builder.dropped_attributes_count = this.dropped_attributes_count;
            builder.flags = this.flags;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Link)) {
                return false;
            }
            Link link = (Link) obj;
            return unknownFields().equals(link.unknownFields()) && Internal.equals(this.trace_id, link.trace_id) && Internal.equals(this.span_id, link.span_id) && Internal.equals(this.trace_state, link.trace_state) && this.attributes.equals(link.attributes) && Internal.equals(Integer.valueOf(this.dropped_attributes_count), Integer.valueOf(link.dropped_attributes_count)) && Internal.equals(Integer.valueOf(this.flags), Integer.valueOf(link.flags));
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ByteString byteString = this.trace_id;
            int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
            ByteString byteString2 = this.span_id;
            int hashCode3 = (hashCode2 + (byteString2 != null ? byteString2.hashCode() : 0)) * 37;
            String str = this.trace_state;
            int hashCode4 = ((((((hashCode3 + (str != null ? str.hashCode() : 0)) * 37) + this.attributes.hashCode()) * 37) + Integer.hashCode(this.dropped_attributes_count)) * 37) + Integer.hashCode(this.flags);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.trace_id != null) {
                sb.append(", trace_id=").append(this.trace_id);
            }
            if (this.span_id != null) {
                sb.append(", span_id=").append(this.span_id);
            }
            if (this.trace_state != null) {
                sb.append(", trace_state=").append(Internal.sanitize(this.trace_state));
            }
            if (!this.attributes.isEmpty()) {
                sb.append(", attributes=").append(this.attributes);
            }
            sb.append(", dropped_attributes_count=").append(this.dropped_attributes_count);
            sb.append(", flags=").append(this.flags);
            return sb.replace(0, 2, "Link{").append(AbstractJsonLexerKt.END_OBJ).toString();
        }

        public static final class Builder extends Message.Builder<Link, Builder> {
            public ByteString trace_id = ByteString.EMPTY;
            public ByteString span_id = ByteString.EMPTY;
            public String trace_state = "";
            public List<KeyValue> attributes = Internal.newMutableList();
            public int dropped_attributes_count = 0;
            public int flags = 0;

            public Builder trace_id(ByteString byteString) {
                this.trace_id = byteString;
                return this;
            }

            public Builder span_id(ByteString byteString) {
                this.span_id = byteString;
                return this;
            }

            public Builder trace_state(String str) {
                this.trace_state = str;
                return this;
            }

            public Builder attributes(List<KeyValue> list) {
                Internal.checkElementsNotNull(list);
                this.attributes = list;
                return this;
            }

            public Builder dropped_attributes_count(int i) {
                this.dropped_attributes_count = i;
                return this;
            }

            public Builder flags(int i) {
                this.flags = i;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public Link build() {
                return new Link(this.trace_id, this.span_id, this.trace_state, this.attributes, this.dropped_attributes_count, this.flags, super.buildUnknownFields());
            }
        }

        private static final class ProtoAdapter_Link extends ProtoAdapter<Link> {
            public ProtoAdapter_Link() {
                super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) Link.class, "type.googleapis.com/opentelemetry.proto.trace.v1.Span.Link", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/trace/v1/trace.proto");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Link link) {
                int encodedSizeWithTag = Objects.equals(link.trace_id, ByteString.EMPTY) ? 0 : ProtoAdapter.BYTES.encodedSizeWithTag(1, link.trace_id);
                if (!Objects.equals(link.span_id, ByteString.EMPTY)) {
                    encodedSizeWithTag += ProtoAdapter.BYTES.encodedSizeWithTag(2, link.span_id);
                }
                if (!Objects.equals(link.trace_state, "")) {
                    encodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(3, link.trace_state);
                }
                int encodedSizeWithTag2 = encodedSizeWithTag + KeyValue.ADAPTER.asRepeated().encodedSizeWithTag(4, link.attributes);
                if (!Objects.equals(Integer.valueOf(link.dropped_attributes_count), 0)) {
                    encodedSizeWithTag2 += ProtoAdapter.UINT32.encodedSizeWithTag(5, Integer.valueOf(link.dropped_attributes_count));
                }
                if (!Objects.equals(Integer.valueOf(link.flags), 0)) {
                    encodedSizeWithTag2 += ProtoAdapter.FIXED32.encodedSizeWithTag(6, Integer.valueOf(link.flags));
                }
                return encodedSizeWithTag2 + link.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Link link) throws IOException {
                if (!Objects.equals(link.trace_id, ByteString.EMPTY)) {
                    ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, (int) link.trace_id);
                }
                if (!Objects.equals(link.span_id, ByteString.EMPTY)) {
                    ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, (int) link.span_id);
                }
                if (!Objects.equals(link.trace_state, "")) {
                    ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, (int) link.trace_state);
                }
                KeyValue.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, (int) link.attributes);
                if (!Objects.equals(Integer.valueOf(link.dropped_attributes_count), 0)) {
                    ProtoAdapter.UINT32.encodeWithTag(protoWriter, 5, (int) Integer.valueOf(link.dropped_attributes_count));
                }
                if (!Objects.equals(Integer.valueOf(link.flags), 0)) {
                    ProtoAdapter.FIXED32.encodeWithTag(protoWriter, 6, (int) Integer.valueOf(link.flags));
                }
                protoWriter.writeBytes(link.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter reverseProtoWriter, Link link) throws IOException {
                reverseProtoWriter.writeBytes(link.unknownFields());
                if (!Objects.equals(Integer.valueOf(link.flags), 0)) {
                    ProtoAdapter.FIXED32.encodeWithTag(reverseProtoWriter, 6, (int) Integer.valueOf(link.flags));
                }
                if (!Objects.equals(Integer.valueOf(link.dropped_attributes_count), 0)) {
                    ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 5, (int) Integer.valueOf(link.dropped_attributes_count));
                }
                KeyValue.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, (int) link.attributes);
                if (!Objects.equals(link.trace_state, "")) {
                    ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, (int) link.trace_state);
                }
                if (!Objects.equals(link.span_id, ByteString.EMPTY)) {
                    ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 2, (int) link.span_id);
                }
                if (Objects.equals(link.trace_id, ByteString.EMPTY)) {
                    return;
                }
                ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 1, (int) link.trace_id);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Link decode(ProtoReader protoReader) throws IOException {
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag != -1) {
                        switch (nextTag) {
                            case 1:
                                builder.trace_id(ProtoAdapter.BYTES.decode(protoReader));
                                break;
                            case 2:
                                builder.span_id(ProtoAdapter.BYTES.decode(protoReader));
                                break;
                            case 3:
                                builder.trace_state(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 4:
                                builder.attributes.add(KeyValue.ADAPTER.decode(protoReader));
                                break;
                            case 5:
                                builder.dropped_attributes_count(ProtoAdapter.UINT32.decode(protoReader).intValue());
                                break;
                            case 6:
                                builder.flags(ProtoAdapter.FIXED32.decode(protoReader).intValue());
                                break;
                            default:
                                protoReader.readUnknownField(nextTag);
                                break;
                        }
                    } else {
                        builder.addUnknownFields(protoReader.endMessageAndGetUnknownFields(beginMessage));
                        return builder.build();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Link redact(Link link) {
                Builder newBuilder = link.newBuilder();
                Internal.redactElements(newBuilder.attributes, KeyValue.ADAPTER);
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }
        }
    }

    private static final class ProtoAdapter_Span extends ProtoAdapter<Span> {
        public ProtoAdapter_Span() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) Span.class, "type.googleapis.com/opentelemetry.proto.trace.v1.Span", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/trace/v1/trace.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Span span) {
            int encodedSizeWithTag = Objects.equals(span.trace_id, ByteString.EMPTY) ? 0 : ProtoAdapter.BYTES.encodedSizeWithTag(1, span.trace_id);
            if (!Objects.equals(span.span_id, ByteString.EMPTY)) {
                encodedSizeWithTag += ProtoAdapter.BYTES.encodedSizeWithTag(2, span.span_id);
            }
            if (!Objects.equals(span.trace_state, "")) {
                encodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(3, span.trace_state);
            }
            if (!Objects.equals(span.parent_span_id, ByteString.EMPTY)) {
                encodedSizeWithTag += ProtoAdapter.BYTES.encodedSizeWithTag(4, span.parent_span_id);
            }
            if (!Objects.equals(Integer.valueOf(span.flags), 0)) {
                encodedSizeWithTag += ProtoAdapter.FIXED32.encodedSizeWithTag(16, Integer.valueOf(span.flags));
            }
            if (!Objects.equals(span.name, "")) {
                encodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(5, span.name);
            }
            if (!Objects.equals(span.kind, SpanKind.SPAN_KIND_UNSPECIFIED)) {
                encodedSizeWithTag += SpanKind.ADAPTER.encodedSizeWithTag(6, span.kind);
            }
            if (!Objects.equals(Long.valueOf(span.start_time_unix_nano), 0L)) {
                encodedSizeWithTag += ProtoAdapter.FIXED64.encodedSizeWithTag(7, Long.valueOf(span.start_time_unix_nano));
            }
            if (!Objects.equals(Long.valueOf(span.end_time_unix_nano), 0L)) {
                encodedSizeWithTag += ProtoAdapter.FIXED64.encodedSizeWithTag(8, Long.valueOf(span.end_time_unix_nano));
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + KeyValue.ADAPTER.asRepeated().encodedSizeWithTag(9, span.attributes);
            if (!Objects.equals(Integer.valueOf(span.dropped_attributes_count), 0)) {
                encodedSizeWithTag2 += ProtoAdapter.UINT32.encodedSizeWithTag(10, Integer.valueOf(span.dropped_attributes_count));
            }
            int encodedSizeWithTag3 = encodedSizeWithTag2 + Event.ADAPTER.asRepeated().encodedSizeWithTag(11, span.events);
            if (!Objects.equals(Integer.valueOf(span.dropped_events_count), 0)) {
                encodedSizeWithTag3 += ProtoAdapter.UINT32.encodedSizeWithTag(12, Integer.valueOf(span.dropped_events_count));
            }
            int encodedSizeWithTag4 = encodedSizeWithTag3 + Link.ADAPTER.asRepeated().encodedSizeWithTag(13, span.links);
            if (!Objects.equals(Integer.valueOf(span.dropped_links_count), 0)) {
                encodedSizeWithTag4 += ProtoAdapter.UINT32.encodedSizeWithTag(14, Integer.valueOf(span.dropped_links_count));
            }
            if (!Objects.equals(span.status, null)) {
                encodedSizeWithTag4 += Status.ADAPTER.encodedSizeWithTag(15, span.status);
            }
            return encodedSizeWithTag4 + span.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Span span) throws IOException {
            if (!Objects.equals(span.trace_id, ByteString.EMPTY)) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, (int) span.trace_id);
            }
            if (!Objects.equals(span.span_id, ByteString.EMPTY)) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, (int) span.span_id);
            }
            if (!Objects.equals(span.trace_state, "")) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, (int) span.trace_state);
            }
            if (!Objects.equals(span.parent_span_id, ByteString.EMPTY)) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 4, (int) span.parent_span_id);
            }
            if (!Objects.equals(Integer.valueOf(span.flags), 0)) {
                ProtoAdapter.FIXED32.encodeWithTag(protoWriter, 16, (int) Integer.valueOf(span.flags));
            }
            if (!Objects.equals(span.name, "")) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, (int) span.name);
            }
            if (!Objects.equals(span.kind, SpanKind.SPAN_KIND_UNSPECIFIED)) {
                SpanKind.ADAPTER.encodeWithTag(protoWriter, 6, (int) span.kind);
            }
            if (!Objects.equals(Long.valueOf(span.start_time_unix_nano), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 7, (int) Long.valueOf(span.start_time_unix_nano));
            }
            if (!Objects.equals(Long.valueOf(span.end_time_unix_nano), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 8, (int) Long.valueOf(span.end_time_unix_nano));
            }
            KeyValue.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, (int) span.attributes);
            if (!Objects.equals(Integer.valueOf(span.dropped_attributes_count), 0)) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 10, (int) Integer.valueOf(span.dropped_attributes_count));
            }
            Event.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, (int) span.events);
            if (!Objects.equals(Integer.valueOf(span.dropped_events_count), 0)) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 12, (int) Integer.valueOf(span.dropped_events_count));
            }
            Link.ADAPTER.asRepeated().encodeWithTag(protoWriter, 13, (int) span.links);
            if (!Objects.equals(Integer.valueOf(span.dropped_links_count), 0)) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 14, (int) Integer.valueOf(span.dropped_links_count));
            }
            if (!Objects.equals(span.status, null)) {
                Status.ADAPTER.encodeWithTag(protoWriter, 15, (int) span.status);
            }
            protoWriter.writeBytes(span.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, Span span) throws IOException {
            reverseProtoWriter.writeBytes(span.unknownFields());
            if (!Objects.equals(span.status, null)) {
                Status.ADAPTER.encodeWithTag(reverseProtoWriter, 15, (int) span.status);
            }
            if (!Objects.equals(Integer.valueOf(span.dropped_links_count), 0)) {
                ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 14, (int) Integer.valueOf(span.dropped_links_count));
            }
            Link.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 13, (int) span.links);
            if (!Objects.equals(Integer.valueOf(span.dropped_events_count), 0)) {
                ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 12, (int) Integer.valueOf(span.dropped_events_count));
            }
            Event.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 11, (int) span.events);
            if (!Objects.equals(Integer.valueOf(span.dropped_attributes_count), 0)) {
                ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 10, (int) Integer.valueOf(span.dropped_attributes_count));
            }
            KeyValue.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 9, (int) span.attributes);
            if (!Objects.equals(Long.valueOf(span.end_time_unix_nano), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(reverseProtoWriter, 8, (int) Long.valueOf(span.end_time_unix_nano));
            }
            if (!Objects.equals(Long.valueOf(span.start_time_unix_nano), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(reverseProtoWriter, 7, (int) Long.valueOf(span.start_time_unix_nano));
            }
            if (!Objects.equals(span.kind, SpanKind.SPAN_KIND_UNSPECIFIED)) {
                SpanKind.ADAPTER.encodeWithTag(reverseProtoWriter, 6, (int) span.kind);
            }
            if (!Objects.equals(span.name, "")) {
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 5, (int) span.name);
            }
            if (!Objects.equals(Integer.valueOf(span.flags), 0)) {
                ProtoAdapter.FIXED32.encodeWithTag(reverseProtoWriter, 16, (int) Integer.valueOf(span.flags));
            }
            if (!Objects.equals(span.parent_span_id, ByteString.EMPTY)) {
                ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 4, (int) span.parent_span_id);
            }
            if (!Objects.equals(span.trace_state, "")) {
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, (int) span.trace_state);
            }
            if (!Objects.equals(span.span_id, ByteString.EMPTY)) {
                ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 2, (int) span.span_id);
            }
            if (Objects.equals(span.trace_id, ByteString.EMPTY)) {
                return;
            }
            ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 1, (int) span.trace_id);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public Span decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.trace_id(ProtoAdapter.BYTES.decode(protoReader));
                            break;
                        case 2:
                            builder.span_id(ProtoAdapter.BYTES.decode(protoReader));
                            break;
                        case 3:
                            builder.trace_state(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.parent_span_id(ProtoAdapter.BYTES.decode(protoReader));
                            break;
                        case 5:
                            builder.name(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            try {
                                builder.kind(SpanKind.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 7:
                            builder.start_time_unix_nano(ProtoAdapter.FIXED64.decode(protoReader).longValue());
                            break;
                        case 8:
                            builder.end_time_unix_nano(ProtoAdapter.FIXED64.decode(protoReader).longValue());
                            break;
                        case 9:
                            builder.attributes.add(KeyValue.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            builder.dropped_attributes_count(ProtoAdapter.UINT32.decode(protoReader).intValue());
                            break;
                        case 11:
                            builder.events.add(Event.ADAPTER.decode(protoReader));
                            break;
                        case 12:
                            builder.dropped_events_count(ProtoAdapter.UINT32.decode(protoReader).intValue());
                            break;
                        case 13:
                            builder.links.add(Link.ADAPTER.decode(protoReader));
                            break;
                        case 14:
                            builder.dropped_links_count(ProtoAdapter.UINT32.decode(protoReader).intValue());
                            break;
                        case 15:
                            builder.status(Status.ADAPTER.decode(protoReader));
                            break;
                        case 16:
                            builder.flags(ProtoAdapter.FIXED32.decode(protoReader).intValue());
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                } else {
                    builder.addUnknownFields(protoReader.endMessageAndGetUnknownFields(beginMessage));
                    return builder.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Span redact(Span span) {
            Builder newBuilder = span.newBuilder();
            Internal.redactElements(newBuilder.attributes, KeyValue.ADAPTER);
            Internal.redactElements(newBuilder.events, Event.ADAPTER);
            Internal.redactElements(newBuilder.links, Link.ADAPTER);
            if (newBuilder.status != null) {
                newBuilder.status = Status.ADAPTER.redact(newBuilder.status);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
