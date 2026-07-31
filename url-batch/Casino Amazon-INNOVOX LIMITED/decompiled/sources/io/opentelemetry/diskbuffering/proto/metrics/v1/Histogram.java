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
public final class Histogram extends Message<Histogram, Builder> {
    public static final ProtoAdapter<Histogram> ADAPTER = new ProtoAdapter_Histogram();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.metrics.v1.AggregationTemporality#ADAPTER", jsonName = "aggregationTemporality", label = WireField.Label.OMIT_IDENTITY, tag = 2)
    public final AggregationTemporality aggregation_temporality;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.metrics.v1.HistogramDataPoint#ADAPTER", jsonName = "dataPoints", label = WireField.Label.REPEATED, tag = 1)
    public final List<HistogramDataPoint> data_points;

    public Histogram(List<HistogramDataPoint> list, AggregationTemporality aggregationTemporality) {
        this(list, aggregationTemporality, ByteString.EMPTY);
    }

    public Histogram(List<HistogramDataPoint> list, AggregationTemporality aggregationTemporality, ByteString byteString) {
        super(ADAPTER, byteString);
        this.data_points = Internal.immutableCopyOf("data_points", list);
        if (aggregationTemporality == null) {
            throw new IllegalArgumentException("aggregation_temporality == null");
        }
        this.aggregation_temporality = aggregationTemporality;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.data_points = Internal.copyOf(this.data_points);
        builder.aggregation_temporality = this.aggregation_temporality;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Histogram)) {
            return false;
        }
        Histogram histogram = (Histogram) obj;
        return unknownFields().equals(histogram.unknownFields()) && this.data_points.equals(histogram.data_points) && Internal.equals(this.aggregation_temporality, histogram.aggregation_temporality);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = ((unknownFields().hashCode() * 37) + this.data_points.hashCode()) * 37;
        AggregationTemporality aggregationTemporality = this.aggregation_temporality;
        int hashCode2 = hashCode + (aggregationTemporality != null ? aggregationTemporality.hashCode() : 0);
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
        return sb.replace(0, 2, "Histogram{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<Histogram, Builder> {
        public List<HistogramDataPoint> data_points = Internal.newMutableList();
        public AggregationTemporality aggregation_temporality = AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED;

        public Builder data_points(List<HistogramDataPoint> list) {
            Internal.checkElementsNotNull(list);
            this.data_points = list;
            return this;
        }

        public Builder aggregation_temporality(AggregationTemporality aggregationTemporality) {
            this.aggregation_temporality = aggregationTemporality;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Histogram build() {
            return new Histogram(this.data_points, this.aggregation_temporality, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_Histogram extends ProtoAdapter<Histogram> {
        public ProtoAdapter_Histogram() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) Histogram.class, "type.googleapis.com/opentelemetry.proto.metrics.v1.Histogram", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/metrics/v1/metrics.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Histogram histogram) {
            int encodedSizeWithTag = HistogramDataPoint.ADAPTER.asRepeated().encodedSizeWithTag(1, histogram.data_points);
            if (!Objects.equals(histogram.aggregation_temporality, AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED)) {
                encodedSizeWithTag += AggregationTemporality.ADAPTER.encodedSizeWithTag(2, histogram.aggregation_temporality);
            }
            return encodedSizeWithTag + histogram.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Histogram histogram) throws IOException {
            HistogramDataPoint.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, (int) histogram.data_points);
            if (!Objects.equals(histogram.aggregation_temporality, AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED)) {
                AggregationTemporality.ADAPTER.encodeWithTag(protoWriter, 2, (int) histogram.aggregation_temporality);
            }
            protoWriter.writeBytes(histogram.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, Histogram histogram) throws IOException {
            reverseProtoWriter.writeBytes(histogram.unknownFields());
            if (!Objects.equals(histogram.aggregation_temporality, AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED)) {
                AggregationTemporality.ADAPTER.encodeWithTag(reverseProtoWriter, 2, (int) histogram.aggregation_temporality);
            }
            HistogramDataPoint.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, (int) histogram.data_points);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public Histogram decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    builder.addUnknownFields(protoReader.endMessageAndGetUnknownFields(beginMessage));
                    return builder.build();
                }
                if (nextTag == 1) {
                    builder.data_points.add(HistogramDataPoint.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    try {
                        builder.aggregation_temporality(AggregationTemporality.ADAPTER.decode(protoReader));
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                } else {
                    protoReader.readUnknownField(nextTag);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Histogram redact(Histogram histogram) {
            Builder newBuilder = histogram.newBuilder();
            Internal.redactElements(newBuilder.data_points, HistogramDataPoint.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
