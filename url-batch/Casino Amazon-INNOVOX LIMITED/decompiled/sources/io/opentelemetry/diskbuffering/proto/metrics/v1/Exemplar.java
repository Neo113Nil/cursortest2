package io.opentelemetry.diskbuffering.proto.metrics.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import io.opentelemetry.diskbuffering.proto.common.v1.KeyValue;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class Exemplar extends Message<Exemplar, Builder> {
    public static final ProtoAdapter<Exemplar> ADAPTER = new ProtoAdapter_Exemplar();
    public static final Double DEFAULT_AS_DOUBLE = Double.valueOf(0.0d);
    public static final Long DEFAULT_AS_INT = 0L;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "asDouble", oneofName = "value", tag = 3)
    public final Double as_double;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SFIXED64", jsonName = "asInt", oneofName = "value", tag = 6)
    public final Long as_int;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.common.v1.KeyValue#ADAPTER", jsonName = "filteredAttributes", label = WireField.Label.REPEATED, tag = 7)
    public final List<KeyValue> filtered_attributes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "spanId", label = WireField.Label.OMIT_IDENTITY, tag = 4)
    public final ByteString span_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", jsonName = "timeUnixNano", label = WireField.Label.OMIT_IDENTITY, tag = 2)
    public final long time_unix_nano;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "traceId", label = WireField.Label.OMIT_IDENTITY, tag = 5)
    public final ByteString trace_id;

    public Exemplar(List<KeyValue> list, long j, ByteString byteString, ByteString byteString2, Double d, Long l) {
        this(list, j, byteString, byteString2, d, l, ByteString.EMPTY);
    }

    public Exemplar(List<KeyValue> list, long j, ByteString byteString, ByteString byteString2, Double d, Long l, ByteString byteString3) {
        super(ADAPTER, byteString3);
        if (Internal.countNonNull(d, l) > 1) {
            throw new IllegalArgumentException("at most one of as_double, as_int may be non-null");
        }
        this.filtered_attributes = Internal.immutableCopyOf("filtered_attributes", list);
        this.time_unix_nano = j;
        if (byteString == null) {
            throw new IllegalArgumentException("span_id == null");
        }
        this.span_id = byteString;
        if (byteString2 == null) {
            throw new IllegalArgumentException("trace_id == null");
        }
        this.trace_id = byteString2;
        this.as_double = d;
        this.as_int = l;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.filtered_attributes = Internal.copyOf(this.filtered_attributes);
        builder.time_unix_nano = this.time_unix_nano;
        builder.span_id = this.span_id;
        builder.trace_id = this.trace_id;
        builder.as_double = this.as_double;
        builder.as_int = this.as_int;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Exemplar)) {
            return false;
        }
        Exemplar exemplar = (Exemplar) obj;
        return unknownFields().equals(exemplar.unknownFields()) && this.filtered_attributes.equals(exemplar.filtered_attributes) && Internal.equals(Long.valueOf(this.time_unix_nano), Long.valueOf(exemplar.time_unix_nano)) && Internal.equals(this.span_id, exemplar.span_id) && Internal.equals(this.trace_id, exemplar.trace_id) && Internal.equals(this.as_double, exemplar.as_double) && Internal.equals(this.as_int, exemplar.as_int);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((unknownFields().hashCode() * 37) + this.filtered_attributes.hashCode()) * 37) + Long.hashCode(this.time_unix_nano)) * 37;
        ByteString byteString = this.span_id;
        int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        ByteString byteString2 = this.trace_id;
        int hashCode3 = (hashCode2 + (byteString2 != null ? byteString2.hashCode() : 0)) * 37;
        Double d = this.as_double;
        int hashCode4 = (hashCode3 + (d != null ? d.hashCode() : 0)) * 37;
        Long l = this.as_int;
        int hashCode5 = hashCode4 + (l != null ? l.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.filtered_attributes.isEmpty()) {
            sb.append(", filtered_attributes=").append(this.filtered_attributes);
        }
        sb.append(", time_unix_nano=").append(this.time_unix_nano);
        if (this.span_id != null) {
            sb.append(", span_id=").append(this.span_id);
        }
        if (this.trace_id != null) {
            sb.append(", trace_id=").append(this.trace_id);
        }
        if (this.as_double != null) {
            sb.append(", as_double=").append(this.as_double);
        }
        if (this.as_int != null) {
            sb.append(", as_int=").append(this.as_int);
        }
        return sb.replace(0, 2, "Exemplar{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<Exemplar, Builder> {
        public Double as_double;
        public Long as_int;
        public List<KeyValue> filtered_attributes = Internal.newMutableList();
        public long time_unix_nano = 0;
        public ByteString span_id = ByteString.EMPTY;
        public ByteString trace_id = ByteString.EMPTY;

        public Builder filtered_attributes(List<KeyValue> list) {
            Internal.checkElementsNotNull(list);
            this.filtered_attributes = list;
            return this;
        }

        public Builder time_unix_nano(long j) {
            this.time_unix_nano = j;
            return this;
        }

        public Builder span_id(ByteString byteString) {
            this.span_id = byteString;
            return this;
        }

        public Builder trace_id(ByteString byteString) {
            this.trace_id = byteString;
            return this;
        }

        public Builder as_double(Double d) {
            this.as_double = d;
            this.as_int = null;
            return this;
        }

        public Builder as_int(Long l) {
            this.as_int = l;
            this.as_double = null;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Exemplar build() {
            return new Exemplar(this.filtered_attributes, this.time_unix_nano, this.span_id, this.trace_id, this.as_double, this.as_int, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_Exemplar extends ProtoAdapter<Exemplar> {
        public ProtoAdapter_Exemplar() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) Exemplar.class, "type.googleapis.com/opentelemetry.proto.metrics.v1.Exemplar", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/metrics/v1/metrics.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Exemplar exemplar) {
            int encodedSizeWithTag = KeyValue.ADAPTER.asRepeated().encodedSizeWithTag(7, exemplar.filtered_attributes);
            if (!Objects.equals(Long.valueOf(exemplar.time_unix_nano), 0L)) {
                encodedSizeWithTag += ProtoAdapter.FIXED64.encodedSizeWithTag(2, Long.valueOf(exemplar.time_unix_nano));
            }
            if (!Objects.equals(exemplar.span_id, ByteString.EMPTY)) {
                encodedSizeWithTag += ProtoAdapter.BYTES.encodedSizeWithTag(4, exemplar.span_id);
            }
            if (!Objects.equals(exemplar.trace_id, ByteString.EMPTY)) {
                encodedSizeWithTag += ProtoAdapter.BYTES.encodedSizeWithTag(5, exemplar.trace_id);
            }
            return encodedSizeWithTag + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, exemplar.as_double) + ProtoAdapter.SFIXED64.encodedSizeWithTag(6, exemplar.as_int) + exemplar.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Exemplar exemplar) throws IOException {
            KeyValue.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, (int) exemplar.filtered_attributes);
            if (!Objects.equals(Long.valueOf(exemplar.time_unix_nano), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 2, (int) Long.valueOf(exemplar.time_unix_nano));
            }
            if (!Objects.equals(exemplar.span_id, ByteString.EMPTY)) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 4, (int) exemplar.span_id);
            }
            if (!Objects.equals(exemplar.trace_id, ByteString.EMPTY)) {
                ProtoAdapter.BYTES.encodeWithTag(protoWriter, 5, (int) exemplar.trace_id);
            }
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, (int) exemplar.as_double);
            ProtoAdapter.SFIXED64.encodeWithTag(protoWriter, 6, (int) exemplar.as_int);
            protoWriter.writeBytes(exemplar.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, Exemplar exemplar) throws IOException {
            reverseProtoWriter.writeBytes(exemplar.unknownFields());
            ProtoAdapter.SFIXED64.encodeWithTag(reverseProtoWriter, 6, (int) exemplar.as_int);
            ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 3, (int) exemplar.as_double);
            if (!Objects.equals(exemplar.trace_id, ByteString.EMPTY)) {
                ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 5, (int) exemplar.trace_id);
            }
            if (!Objects.equals(exemplar.span_id, ByteString.EMPTY)) {
                ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 4, (int) exemplar.span_id);
            }
            if (!Objects.equals(Long.valueOf(exemplar.time_unix_nano), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(reverseProtoWriter, 2, (int) Long.valueOf(exemplar.time_unix_nano));
            }
            KeyValue.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, (int) exemplar.filtered_attributes);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public Exemplar decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 2:
                            builder.time_unix_nano(ProtoAdapter.FIXED64.decode(protoReader).longValue());
                            break;
                        case 3:
                            builder.as_double(ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case 4:
                            builder.span_id(ProtoAdapter.BYTES.decode(protoReader));
                            break;
                        case 5:
                            builder.trace_id(ProtoAdapter.BYTES.decode(protoReader));
                            break;
                        case 6:
                            builder.as_int(ProtoAdapter.SFIXED64.decode(protoReader));
                            break;
                        case 7:
                            builder.filtered_attributes.add(KeyValue.ADAPTER.decode(protoReader));
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
        public Exemplar redact(Exemplar exemplar) {
            Builder newBuilder = exemplar.newBuilder();
            Internal.redactElements(newBuilder.filtered_attributes, KeyValue.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
