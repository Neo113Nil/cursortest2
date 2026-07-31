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
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class Sum extends Message<Sum, Builder> {
    public static final ProtoAdapter<Sum> ADAPTER = new ProtoAdapter_Sum();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.metrics.v1.AggregationTemporality#ADAPTER", jsonName = "aggregationTemporality", label = WireField.Label.OMIT_IDENTITY, tag = 2)
    public final AggregationTemporality aggregation_temporality;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.metrics.v1.NumberDataPoint#ADAPTER", jsonName = "dataPoints", label = WireField.Label.REPEATED, tag = 1)
    public final List<NumberDataPoint> data_points;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isMonotonic", label = WireField.Label.OMIT_IDENTITY, tag = 3)
    public final boolean is_monotonic;

    public Sum(List<NumberDataPoint> list, AggregationTemporality aggregationTemporality, boolean z) {
        this(list, aggregationTemporality, z, ByteString.EMPTY);
    }

    public Sum(List<NumberDataPoint> list, AggregationTemporality aggregationTemporality, boolean z, ByteString byteString) {
        super(ADAPTER, byteString);
        this.data_points = Internal.immutableCopyOf("data_points", list);
        if (aggregationTemporality == null) {
            throw new IllegalArgumentException("aggregation_temporality == null");
        }
        this.aggregation_temporality = aggregationTemporality;
        this.is_monotonic = z;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.data_points = Internal.copyOf(this.data_points);
        builder.aggregation_temporality = this.aggregation_temporality;
        builder.is_monotonic = this.is_monotonic;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Sum)) {
            return false;
        }
        Sum sum = (Sum) obj;
        return unknownFields().equals(sum.unknownFields()) && this.data_points.equals(sum.data_points) && Internal.equals(this.aggregation_temporality, sum.aggregation_temporality) && Internal.equals(Boolean.valueOf(this.is_monotonic), Boolean.valueOf(sum.is_monotonic));
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = ((unknownFields().hashCode() * 37) + this.data_points.hashCode()) * 37;
        AggregationTemporality aggregationTemporality = this.aggregation_temporality;
        int hashCode2 = ((hashCode + (aggregationTemporality != null ? aggregationTemporality.hashCode() : 0)) * 37) + Boolean.hashCode(this.is_monotonic);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.data_points.isEmpty()) {
            sb.append(", data_points=").append(this.data_points);
        }
        if (this.aggregation_temporality != null) {
            sb.append(", aggregation_temporality=").append(this.aggregation_temporality);
        }
        sb.append(", is_monotonic=").append(this.is_monotonic);
        return sb.replace(0, 2, "Sum{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<Sum, Builder> {
        public List<NumberDataPoint> data_points = Internal.newMutableList();
        public AggregationTemporality aggregation_temporality = AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED;
        public boolean is_monotonic = false;

        public Builder data_points(List<NumberDataPoint> list) {
            Internal.checkElementsNotNull(list);
            this.data_points = list;
            return this;
        }

        public Builder aggregation_temporality(AggregationTemporality aggregationTemporality) {
            this.aggregation_temporality = aggregationTemporality;
            return this;
        }

        public Builder is_monotonic(boolean z) {
            this.is_monotonic = z;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Sum build() {
            return new Sum(this.data_points, this.aggregation_temporality, this.is_monotonic, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_Sum extends ProtoAdapter<Sum> {
        public ProtoAdapter_Sum() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) Sum.class, "type.googleapis.com/opentelemetry.proto.metrics.v1.Sum", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/metrics/v1/metrics.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Sum sum) {
            int encodedSizeWithTag = NumberDataPoint.ADAPTER.asRepeated().encodedSizeWithTag(1, sum.data_points);
            if (!Objects.equals(sum.aggregation_temporality, AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED)) {
                encodedSizeWithTag += AggregationTemporality.ADAPTER.encodedSizeWithTag(2, sum.aggregation_temporality);
            }
            if (!Objects.equals(Boolean.valueOf(sum.is_monotonic), false)) {
                encodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(sum.is_monotonic));
            }
            return encodedSizeWithTag + sum.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Sum sum) throws IOException {
            NumberDataPoint.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, (int) sum.data_points);
            if (!Objects.equals(sum.aggregation_temporality, AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED)) {
                AggregationTemporality.ADAPTER.encodeWithTag(protoWriter, 2, (int) sum.aggregation_temporality);
            }
            if (!Objects.equals(Boolean.valueOf(sum.is_monotonic), false)) {
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, (int) Boolean.valueOf(sum.is_monotonic));
            }
            protoWriter.writeBytes(sum.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, Sum sum) throws IOException {
            reverseProtoWriter.writeBytes(sum.unknownFields());
            if (!Objects.equals(Boolean.valueOf(sum.is_monotonic), false)) {
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, (int) Boolean.valueOf(sum.is_monotonic));
            }
            if (!Objects.equals(sum.aggregation_temporality, AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED)) {
                AggregationTemporality.ADAPTER.encodeWithTag(reverseProtoWriter, 2, (int) sum.aggregation_temporality);
            }
            NumberDataPoint.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, (int) sum.data_points);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public Sum decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    builder.addUnknownFields(protoReader.endMessageAndGetUnknownFields(beginMessage));
                    return builder.build();
                }
                if (nextTag == 1) {
                    builder.data_points.add(NumberDataPoint.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    try {
                        builder.aggregation_temporality(AggregationTemporality.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                } else if (nextTag == 3) {
                    builder.is_monotonic(ProtoAdapter.BOOL.decode(protoReader).booleanValue());
                } else {
                    protoReader.readUnknownField(nextTag);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Sum redact(Sum sum) {
            Builder newBuilder = sum.newBuilder();
            Internal.redactElements(newBuilder.data_points, NumberDataPoint.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
