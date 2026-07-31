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
public final class NumberDataPoint extends Message<NumberDataPoint, Builder> {
    public static final ProtoAdapter<NumberDataPoint> ADAPTER = new ProtoAdapter_NumberDataPoint();
    public static final Double DEFAULT_AS_DOUBLE = Double.valueOf(0.0d);
    public static final Long DEFAULT_AS_INT = 0L;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "asDouble", oneofName = "value", tag = 4)
    public final Double as_double;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SFIXED64", jsonName = "asInt", oneofName = "value", tag = 6)
    public final Long as_int;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.common.v1.KeyValue#ADAPTER", label = WireField.Label.REPEATED, tag = 7)
    public final List<KeyValue> attributes;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.metrics.v1.Exemplar#ADAPTER", label = WireField.Label.REPEATED, tag = 5)
    public final List<Exemplar> exemplars;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.OMIT_IDENTITY, tag = 8)
    public final int flags;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", jsonName = "startTimeUnixNano", label = WireField.Label.OMIT_IDENTITY, tag = 2)
    public final long start_time_unix_nano;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", jsonName = "timeUnixNano", label = WireField.Label.OMIT_IDENTITY, tag = 3)
    public final long time_unix_nano;

    public NumberDataPoint(List<KeyValue> list, long j, long j2, List<Exemplar> list2, int i, Double d, Long l) {
        this(list, j, j2, list2, i, d, l, ByteString.EMPTY);
    }

    public NumberDataPoint(List<KeyValue> list, long j, long j2, List<Exemplar> list2, int i, Double d, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(d, l) > 1) {
            throw new IllegalArgumentException("at most one of as_double, as_int may be non-null");
        }
        this.attributes = Internal.immutableCopyOf("attributes", list);
        this.start_time_unix_nano = j;
        this.time_unix_nano = j2;
        this.exemplars = Internal.immutableCopyOf("exemplars", list2);
        this.flags = i;
        this.as_double = d;
        this.as_int = l;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.attributes = Internal.copyOf(this.attributes);
        builder.start_time_unix_nano = this.start_time_unix_nano;
        builder.time_unix_nano = this.time_unix_nano;
        builder.exemplars = Internal.copyOf(this.exemplars);
        builder.flags = this.flags;
        builder.as_double = this.as_double;
        builder.as_int = this.as_int;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NumberDataPoint)) {
            return false;
        }
        NumberDataPoint numberDataPoint = (NumberDataPoint) obj;
        return unknownFields().equals(numberDataPoint.unknownFields()) && this.attributes.equals(numberDataPoint.attributes) && Internal.equals(Long.valueOf(this.start_time_unix_nano), Long.valueOf(numberDataPoint.start_time_unix_nano)) && Internal.equals(Long.valueOf(this.time_unix_nano), Long.valueOf(numberDataPoint.time_unix_nano)) && this.exemplars.equals(numberDataPoint.exemplars) && Internal.equals(Integer.valueOf(this.flags), Integer.valueOf(numberDataPoint.flags)) && Internal.equals(this.as_double, numberDataPoint.as_double) && Internal.equals(this.as_int, numberDataPoint.as_int);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((((((unknownFields().hashCode() * 37) + this.attributes.hashCode()) * 37) + Long.hashCode(this.start_time_unix_nano)) * 37) + Long.hashCode(this.time_unix_nano)) * 37) + this.exemplars.hashCode()) * 37) + Integer.hashCode(this.flags)) * 37;
        Double d = this.as_double;
        int hashCode2 = (hashCode + (d != null ? d.hashCode() : 0)) * 37;
        Long l = this.as_int;
        int hashCode3 = hashCode2 + (l != null ? l.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.attributes.isEmpty()) {
            sb.append(", attributes=").append(this.attributes);
        }
        sb.append(", start_time_unix_nano=").append(this.start_time_unix_nano);
        sb.append(", time_unix_nano=").append(this.time_unix_nano);
        if (!this.exemplars.isEmpty()) {
            sb.append(", exemplars=").append(this.exemplars);
        }
        sb.append(", flags=").append(this.flags);
        if (this.as_double != null) {
            sb.append(", as_double=").append(this.as_double);
        }
        if (this.as_int != null) {
            sb.append(", as_int=").append(this.as_int);
        }
        return sb.replace(0, 2, "NumberDataPoint{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<NumberDataPoint, Builder> {
        public Double as_double;
        public Long as_int;
        public List<KeyValue> attributes = Internal.newMutableList();
        public long start_time_unix_nano = 0;
        public long time_unix_nano = 0;
        public List<Exemplar> exemplars = Internal.newMutableList();
        public int flags = 0;

        public Builder attributes(List<KeyValue> list) {
            Internal.checkElementsNotNull(list);
            this.attributes = list;
            return this;
        }

        public Builder start_time_unix_nano(long j) {
            this.start_time_unix_nano = j;
            return this;
        }

        public Builder time_unix_nano(long j) {
            this.time_unix_nano = j;
            return this;
        }

        public Builder exemplars(List<Exemplar> list) {
            Internal.checkElementsNotNull(list);
            this.exemplars = list;
            return this;
        }

        public Builder flags(int i) {
            this.flags = i;
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
        public NumberDataPoint build() {
            return new NumberDataPoint(this.attributes, this.start_time_unix_nano, this.time_unix_nano, this.exemplars, this.flags, this.as_double, this.as_int, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_NumberDataPoint extends ProtoAdapter<NumberDataPoint> {
        public ProtoAdapter_NumberDataPoint() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) NumberDataPoint.class, "type.googleapis.com/opentelemetry.proto.metrics.v1.NumberDataPoint", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/metrics/v1/metrics.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(NumberDataPoint numberDataPoint) {
            int encodedSizeWithTag = KeyValue.ADAPTER.asRepeated().encodedSizeWithTag(7, numberDataPoint.attributes);
            if (!Objects.equals(Long.valueOf(numberDataPoint.start_time_unix_nano), 0L)) {
                encodedSizeWithTag += ProtoAdapter.FIXED64.encodedSizeWithTag(2, Long.valueOf(numberDataPoint.start_time_unix_nano));
            }
            if (!Objects.equals(Long.valueOf(numberDataPoint.time_unix_nano), 0L)) {
                encodedSizeWithTag += ProtoAdapter.FIXED64.encodedSizeWithTag(3, Long.valueOf(numberDataPoint.time_unix_nano));
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + Exemplar.ADAPTER.asRepeated().encodedSizeWithTag(5, numberDataPoint.exemplars);
            if (!Objects.equals(Integer.valueOf(numberDataPoint.flags), 0)) {
                encodedSizeWithTag2 += ProtoAdapter.UINT32.encodedSizeWithTag(8, Integer.valueOf(numberDataPoint.flags));
            }
            return encodedSizeWithTag2 + ProtoAdapter.DOUBLE.encodedSizeWithTag(4, numberDataPoint.as_double) + ProtoAdapter.SFIXED64.encodedSizeWithTag(6, numberDataPoint.as_int) + numberDataPoint.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, NumberDataPoint numberDataPoint) throws IOException {
            KeyValue.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, (int) numberDataPoint.attributes);
            if (!Objects.equals(Long.valueOf(numberDataPoint.start_time_unix_nano), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 2, (int) Long.valueOf(numberDataPoint.start_time_unix_nano));
            }
            if (!Objects.equals(Long.valueOf(numberDataPoint.time_unix_nano), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 3, (int) Long.valueOf(numberDataPoint.time_unix_nano));
            }
            Exemplar.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, (int) numberDataPoint.exemplars);
            if (!Objects.equals(Integer.valueOf(numberDataPoint.flags), 0)) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 8, (int) Integer.valueOf(numberDataPoint.flags));
            }
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 4, (int) numberDataPoint.as_double);
            ProtoAdapter.SFIXED64.encodeWithTag(protoWriter, 6, (int) numberDataPoint.as_int);
            protoWriter.writeBytes(numberDataPoint.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, NumberDataPoint numberDataPoint) throws IOException {
            reverseProtoWriter.writeBytes(numberDataPoint.unknownFields());
            ProtoAdapter.SFIXED64.encodeWithTag(reverseProtoWriter, 6, (int) numberDataPoint.as_int);
            ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 4, (int) numberDataPoint.as_double);
            if (!Objects.equals(Integer.valueOf(numberDataPoint.flags), 0)) {
                ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 8, (int) Integer.valueOf(numberDataPoint.flags));
            }
            Exemplar.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, (int) numberDataPoint.exemplars);
            if (!Objects.equals(Long.valueOf(numberDataPoint.time_unix_nano), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(reverseProtoWriter, 3, (int) Long.valueOf(numberDataPoint.time_unix_nano));
            }
            if (!Objects.equals(Long.valueOf(numberDataPoint.start_time_unix_nano), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(reverseProtoWriter, 2, (int) Long.valueOf(numberDataPoint.start_time_unix_nano));
            }
            KeyValue.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, (int) numberDataPoint.attributes);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public NumberDataPoint decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 2:
                            builder.start_time_unix_nano(ProtoAdapter.FIXED64.decode(protoReader).longValue());
                            break;
                        case 3:
                            builder.time_unix_nano(ProtoAdapter.FIXED64.decode(protoReader).longValue());
                            break;
                        case 4:
                            builder.as_double(ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case 5:
                            builder.exemplars.add(Exemplar.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            builder.as_int(ProtoAdapter.SFIXED64.decode(protoReader));
                            break;
                        case 7:
                            builder.attributes.add(KeyValue.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            builder.flags(ProtoAdapter.UINT32.decode(protoReader).intValue());
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
        public NumberDataPoint redact(NumberDataPoint numberDataPoint) {
            Builder newBuilder = numberDataPoint.newBuilder();
            Internal.redactElements(newBuilder.attributes, KeyValue.ADAPTER);
            Internal.redactElements(newBuilder.exemplars, Exemplar.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
