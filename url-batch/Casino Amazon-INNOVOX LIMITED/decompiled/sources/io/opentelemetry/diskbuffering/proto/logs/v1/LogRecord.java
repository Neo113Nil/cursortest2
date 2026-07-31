package io.opentelemetry.diskbuffering.proto.logs.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import io.opentelemetry.diskbuffering.proto.common.v1.AnyValue;
import io.opentelemetry.diskbuffering.proto.common.v1.KeyValue;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class LogRecord extends Message<LogRecord, Builder> {
    public static final ProtoAdapter<LogRecord> ADAPTER = new ProtoAdapter_LogRecord();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.common.v1.KeyValue#ADAPTER", label = WireField.Label.REPEATED, tag = 6)
    public final List<KeyValue> attributes;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.common.v1.AnyValue#ADAPTER", label = WireField.Label.OMIT_IDENTITY, tag = 5)
    public final AnyValue body;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "droppedAttributesCount", label = WireField.Label.OMIT_IDENTITY, tag = 7)
    public final int dropped_attributes_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventName", label = WireField.Label.OMIT_IDENTITY, tag = 12)
    public final String event_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED32", label = WireField.Label.OMIT_IDENTITY, tag = 8)
    public final int flags;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", jsonName = "observedTimeUnixNano", label = WireField.Label.OMIT_IDENTITY, tag = 11)
    public final long observed_time_unix_nano;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.logs.v1.SeverityNumber#ADAPTER", jsonName = "severityNumber", label = WireField.Label.OMIT_IDENTITY, tag = 2)
    public final SeverityNumber severity_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "severityText", label = WireField.Label.OMIT_IDENTITY, tag = 3)
    public final String severity_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "spanId", label = WireField.Label.OMIT_IDENTITY, tag = 10)
    public final ByteString span_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", jsonName = "timeUnixNano", label = WireField.Label.OMIT_IDENTITY, tag = 1)
    public final long time_unix_nano;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "traceId", label = WireField.Label.OMIT_IDENTITY, tag = 9)
    public final ByteString trace_id;

    public LogRecord(long j, long j2, SeverityNumber severityNumber, String str, AnyValue anyValue, List<KeyValue> list, int i, int i2, ByteString byteString, ByteString byteString2, String str2) {
        this(j, j2, severityNumber, str, anyValue, list, i, i2, byteString, byteString2, str2, ByteString.EMPTY);
    }

    public LogRecord(long j, long j2, SeverityNumber severityNumber, String str, AnyValue anyValue, List<KeyValue> list, int i, int i2, ByteString byteString, ByteString byteString2, String str2, ByteString byteString3) {
        super(ADAPTER, byteString3);
        this.time_unix_nano = j;
        this.observed_time_unix_nano = j2;
        if (severityNumber == null) {
            throw new IllegalArgumentException("severity_number == null");
        }
        this.severity_number = severityNumber;
        if (str == null) {
            throw new IllegalArgumentException("severity_text == null");
        }
        this.severity_text = str;
        this.body = anyValue;
        this.attributes = Internal.immutableCopyOf("attributes", list);
        this.dropped_attributes_count = i;
        this.flags = i2;
        if (byteString == null) {
            throw new IllegalArgumentException("trace_id == null");
        }
        this.trace_id = byteString;
        if (byteString2 == null) {
            throw new IllegalArgumentException("span_id == null");
        }
        this.span_id = byteString2;
        if (str2 == null) {
            throw new IllegalArgumentException("event_name == null");
        }
        this.event_name = str2;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.time_unix_nano = this.time_unix_nano;
        builder.observed_time_unix_nano = this.observed_time_unix_nano;
        builder.severity_number = this.severity_number;
        builder.severity_text = this.severity_text;
        builder.body = this.body;
        builder.attributes = Internal.copyOf(this.attributes);
        builder.dropped_attributes_count = this.dropped_attributes_count;
        builder.flags = this.flags;
        builder.trace_id = this.trace_id;
        builder.span_id = this.span_id;
        builder.event_name = this.event_name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogRecord)) {
            return false;
        }
        LogRecord logRecord = (LogRecord) obj;
        return unknownFields().equals(logRecord.unknownFields()) && Internal.equals(Long.valueOf(this.time_unix_nano), Long.valueOf(logRecord.time_unix_nano)) && Internal.equals(Long.valueOf(this.observed_time_unix_nano), Long.valueOf(logRecord.observed_time_unix_nano)) && Internal.equals(this.severity_number, logRecord.severity_number) && Internal.equals(this.severity_text, logRecord.severity_text) && Internal.equals(this.body, logRecord.body) && this.attributes.equals(logRecord.attributes) && Internal.equals(Integer.valueOf(this.dropped_attributes_count), Integer.valueOf(logRecord.dropped_attributes_count)) && Internal.equals(Integer.valueOf(this.flags), Integer.valueOf(logRecord.flags)) && Internal.equals(this.trace_id, logRecord.trace_id) && Internal.equals(this.span_id, logRecord.span_id) && Internal.equals(this.event_name, logRecord.event_name);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((unknownFields().hashCode() * 37) + Long.hashCode(this.time_unix_nano)) * 37) + Long.hashCode(this.observed_time_unix_nano)) * 37;
        SeverityNumber severityNumber = this.severity_number;
        int hashCode2 = (hashCode + (severityNumber != null ? severityNumber.hashCode() : 0)) * 37;
        String str = this.severity_text;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        AnyValue anyValue = this.body;
        int hashCode4 = (((((((hashCode3 + (anyValue != null ? anyValue.hashCode() : 0)) * 37) + this.attributes.hashCode()) * 37) + Integer.hashCode(this.dropped_attributes_count)) * 37) + Integer.hashCode(this.flags)) * 37;
        ByteString byteString = this.trace_id;
        int hashCode5 = (hashCode4 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        ByteString byteString2 = this.span_id;
        int hashCode6 = (hashCode5 + (byteString2 != null ? byteString2.hashCode() : 0)) * 37;
        String str2 = this.event_name;
        int hashCode7 = hashCode6 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", time_unix_nano=").append(this.time_unix_nano);
        sb.append(", observed_time_unix_nano=").append(this.observed_time_unix_nano);
        if (this.severity_number != null) {
            sb.append(", severity_number=").append(this.severity_number);
        }
        if (this.severity_text != null) {
            sb.append(", severity_text=").append(Internal.sanitize(this.severity_text));
        }
        if (this.body != null) {
            sb.append(", body=").append(this.body);
        }
        if (!this.attributes.isEmpty()) {
            sb.append(", attributes=").append(this.attributes);
        }
        sb.append(", dropped_attributes_count=").append(this.dropped_attributes_count);
        sb.append(", flags=").append(this.flags);
        if (this.trace_id != null) {
            sb.append(", trace_id=").append(this.trace_id);
        }
        if (this.span_id != null) {
            sb.append(", span_id=").append(this.span_id);
        }
        if (this.event_name != null) {
            sb.append(", event_name=").append(Internal.sanitize(this.event_name));
        }
        return sb.replace(0, 2, "LogRecord{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<LogRecord, Builder> {
        public AnyValue body;
        public long time_unix_nano = 0;
        public long observed_time_unix_nano = 0;
        public SeverityNumber severity_number = SeverityNumber.SEVERITY_NUMBER_UNSPECIFIED;
        public String severity_text = "";
        public List<KeyValue> attributes = Internal.newMutableList();
        public int dropped_attributes_count = 0;
        public int flags = 0;
        public ByteString trace_id = ByteString.EMPTY;
        public ByteString span_id = ByteString.EMPTY;
        public String event_name = "";

        public Builder time_unix_nano(long j) {
            this.time_unix_nano = j;
            return this;
        }

        public Builder observed_time_unix_nano(long j) {
            this.observed_time_unix_nano = j;
            return this;
        }

        public Builder severity_number(SeverityNumber severityNumber) {
            this.severity_number = severityNumber;
            return this;
        }

        public Builder severity_text(String str) {
            this.severity_text = str;
            return this;
        }

        public Builder body(AnyValue anyValue) {
            this.body = anyValue;
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

        public Builder trace_id(ByteString byteString) {
            this.trace_id = byteString;
            return this;
        }

        public Builder span_id(ByteString byteString) {
            this.span_id = byteString;
            return this;
        }

        public Builder event_name(String str) {
            this.event_name = str;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public LogRecord build() {
            return new LogRecord(this.time_unix_nano, this.observed_time_unix_nano, this.severity_number, this.severity_text, this.body, this.attributes, this.dropped_attributes_count, this.flags, this.trace_id, this.span_id, this.event_name, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_LogRecord extends ProtoAdapter<LogRecord> {
        public ProtoAdapter_LogRecord() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) LogRecord.class, "type.googleapis.com/opentelemetry.proto.logs.v1.LogRecord", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/logs/v1/logs.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(LogRecord logRecord) {
            int encodedSizeWithTag = Objects.equals(Long.valueOf(logRecord.time_unix_nano), 0L) ? 0 : ProtoAdapter.FIXED64.encodedSizeWithTag(1, Long.valueOf(logRecord.time_unix_nano));
            if (!Objects.equals(Long.valueOf(logRecord.observed_time_unix_nano), 0L)) {
                encodedSizeWithTag += ProtoAdapter.FIXED64.encodedSizeWithTag(11, Long.valueOf(logRecord.observed_time_unix_nano));
            }
            if (!Objects.equals(logRecord.severity_number, SeverityNumber.SEVERITY_NUMBER_UNSPECIFIED)) {
                encodedSizeWithTag += SeverityNumber.ADAPTER.encodedSizeWithTag(2, logRecord.severity_number);
            }
            if (!Objects.equals(logRecord.severity_text, "")) {
                encodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(3, logRecord.severity_text);
            }
            if (!Objects.equals(logRecord.body, null)) {
                encodedSizeWithTag += AnyValue.ADAPTER.encodedSizeWithTag(5, logRecord.body);
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + KeyValue.ADAPTER.asRepeated().encodedSizeWithTag(6, logRecord.attributes);
            if (!Objects.equals(Integer.valueOf(logRecord.dropped_attributes_count), 0)) {
                encodedSizeWithTag2 += ProtoAdapter.UINT32.encodedSizeWithTag(7, Integer.valueOf(logRecord.dropped_attributes_count));
            }
            if (!Objects.equals(Integer.valueOf(logRecord.flags), 0)) {
                encodedSizeWithTag2 += ProtoAdapter.FIXED32.encodedSizeWithTag(8, Integer.valueOf(logRecord.flags));
            }
            if (!Objects.equals(logRecord.trace_id, ByteString.EMPTY)) {
                encodedSizeWithTag2 += ProtoAdapter.BYTES.encodedSizeWithTag(9, logRecord.trace_id);
            }
            if (!Objects.equals(logRecord.span_id, ByteString.EMPTY)) {
                encodedSizeWithTag2 += ProtoAdapter.BYTES.encodedSizeWithTag(10, logRecord.span_id);
            }
            if (!Objects.equals(logRecord.event_name, "")) {
                encodedSizeWithTag2 += ProtoAdapter.STRING.encodedSizeWithTag(12, logRecord.event_name);
            }
            return encodedSizeWithTag2 + logRecord.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, LogRecord logRecord) throws IOException {
            if (!Objects.equals(Long.valueOf(logRecord.time_unix_nano), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 1, (int) Long.valueOf(logRecord.time_unix_nano));
            }
            if (!Objects.equals(Long.valueOf(logRecord.observed_time_unix_nano), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 11, (int) Long.valueOf(logRecord.observed_time_unix_nano));
            }
            if (!Objects.equals(logRecord.severity_number, SeverityNumber.SEVERITY_NUMBER_UNSPECIFIED)) {
                SeverityNumber.ADAPTER.encodeWithTag(protoWriter, 2, (int) logRecord.severity_number);
            }
            if (!Objects.equals(logRecord.severity_text, "")) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, (int) logRecord.severity_text);
            }
            if (!Objects.equals(logRecord.body, null)) {
                AnyValue.ADAPTER.encodeWithTag(protoWriter, 5, (int) logRecord.body);
            }
            KeyValue.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, (int) logRecord.attributes);
            if (!Objects.equals(Integer.valueOf(logRecord.dropped_attributes_count), 0)) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 7, (int) Integer.valueOf(logRecord.dropped_attributes_count));
            }
            if (!Objects.equals(Integer.valueOf(logRecord.flags), 0)) {
                ProtoAdapter.FIXED32.encodeWithTag(protoWriter, 8, (int) Integer.valueOf(logRecord.flags));
            }
            if (!Objects.equals(logRecord.trace_id, ByteString.EMPTY)) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 9, (int) logRecord.trace_id);
            }
            if (!Objects.equals(logRecord.span_id, ByteString.EMPTY)) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 10, (int) logRecord.span_id);
            }
            if (!Objects.equals(logRecord.event_name, "")) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, (int) logRecord.event_name);
            }
            protoWriter.writeBytes(logRecord.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, LogRecord logRecord) throws IOException {
            reverseProtoWriter.writeBytes(logRecord.unknownFields());
            if (!Objects.equals(logRecord.event_name, "")) {
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 12, (int) logRecord.event_name);
            }
            if (!Objects.equals(logRecord.span_id, ByteString.EMPTY)) {
                ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 10, (int) logRecord.span_id);
            }
            if (!Objects.equals(logRecord.trace_id, ByteString.EMPTY)) {
                ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 9, (int) logRecord.trace_id);
            }
            if (!Objects.equals(Integer.valueOf(logRecord.flags), 0)) {
                ProtoAdapter.FIXED32.encodeWithTag(reverseProtoWriter, 8, (int) Integer.valueOf(logRecord.flags));
            }
            if (!Objects.equals(Integer.valueOf(logRecord.dropped_attributes_count), 0)) {
                ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 7, (int) Integer.valueOf(logRecord.dropped_attributes_count));
            }
            KeyValue.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, (int) logRecord.attributes);
            if (!Objects.equals(logRecord.body, null)) {
                AnyValue.ADAPTER.encodeWithTag(reverseProtoWriter, 5, (int) logRecord.body);
            }
            if (!Objects.equals(logRecord.severity_text, "")) {
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, (int) logRecord.severity_text);
            }
            if (!Objects.equals(logRecord.severity_number, SeverityNumber.SEVERITY_NUMBER_UNSPECIFIED)) {
                SeverityNumber.ADAPTER.encodeWithTag(reverseProtoWriter, 2, (int) logRecord.severity_number);
            }
            if (!Objects.equals(Long.valueOf(logRecord.observed_time_unix_nano), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(reverseProtoWriter, 11, (int) Long.valueOf(logRecord.observed_time_unix_nano));
            }
            if (Objects.equals(Long.valueOf(logRecord.time_unix_nano), 0L)) {
                return;
            }
            ProtoAdapter.FIXED64.encodeWithTag(reverseProtoWriter, 1, (int) Long.valueOf(logRecord.time_unix_nano));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public LogRecord decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.time_unix_nano(ProtoAdapter.FIXED64.decode(protoReader).longValue());
                            break;
                        case 2:
                            try {
                                builder.severity_number(SeverityNumber.ADAPTER.decode(protoReader));
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 3:
                            builder.severity_text(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                        case 5:
                            builder.body(AnyValue.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            builder.attributes.add(KeyValue.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            builder.dropped_attributes_count(ProtoAdapter.UINT32.decode(protoReader).intValue());
                            break;
                        case 8:
                            builder.flags(ProtoAdapter.FIXED32.decode(protoReader).intValue());
                            break;
                        case 9:
                            builder.trace_id(ProtoAdapter.BYTES.decode(protoReader));
                            break;
                        case 10:
                            builder.span_id(ProtoAdapter.BYTES.decode(protoReader));
                            break;
                        case 11:
                            builder.observed_time_unix_nano(ProtoAdapter.FIXED64.decode(protoReader).longValue());
                            break;
                        case 12:
                            builder.event_name(ProtoAdapter.STRING.decode(protoReader));
                            break;
                    }
                } else {
                    builder.addUnknownFields(protoReader.endMessageAndGetUnknownFields(beginMessage));
                    return builder.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public LogRecord redact(LogRecord logRecord) {
            Builder newBuilder = logRecord.newBuilder();
            if (newBuilder.body != null) {
                newBuilder.body = AnyValue.ADAPTER.redact(newBuilder.body);
            }
            Internal.redactElements(newBuilder.attributes, KeyValue.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
