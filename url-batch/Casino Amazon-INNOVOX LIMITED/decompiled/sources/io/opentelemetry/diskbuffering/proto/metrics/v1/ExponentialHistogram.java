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
public final class ExponentialHistogram extends Message<ExponentialHistogram, Builder> {
    public static final ProtoAdapter<ExponentialHistogram> ADAPTER = new ProtoAdapter_ExponentialHistogram();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.metrics.v1.AggregationTemporality#ADAPTER", jsonName = "aggregationTemporality", label = WireField.Label.OMIT_IDENTITY, tag = 2)
    public final AggregationTemporality aggregation_temporality;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.metrics.v1.ExponentialHistogramDataPoint#ADAPTER", jsonName = "dataPoints", label = WireField.Label.REPEATED, tag = 1)
    public final List<ExponentialHistogramDataPoint> data_points;

    public ExponentialHistogram(List<ExponentialHistogramDataPoint> list, AggregationTemporality aggregationTemporality) {
        this(list, aggregationTemporality, ByteString.EMPTY);
    }

    public ExponentialHistogram(List<ExponentialHistogramDataPoint> list, AggregationTemporality aggregationTemporality, ByteString byteString) {
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
        if (!(obj instanceof ExponentialHistogram)) {
            return false;
        }
        ExponentialHistogram exponentialHistogram = (ExponentialHistogram) obj;
        return unknownFields().equals(exponentialHistogram.unknownFields()) && this.data_points.equals(exponentialHistogram.data_points) && Internal.equals(this.aggregation_temporality, exponentialHistogram.aggregation_temporality);
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
        return sb.replace(0, 2, "ExponentialHistogram{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<ExponentialHistogram, Builder> {
        public List<ExponentialHistogramDataPoint> data_points = Internal.newMutableList();
        public AggregationTemporality aggregation_temporality = AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED;

        public Builder data_points(List<ExponentialHistogramDataPoint> list) {
            Internal.checkElementsNotNull(list);
            this.data_points = list;
            return this;
        }

        public Builder aggregation_temporality(AggregationTemporality aggregationTemporality) {
            this.aggregation_temporality = aggregationTemporality;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ExponentialHistogram build() {
            return new ExponentialHistogram(this.data_points, this.aggregation_temporality, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_ExponentialHistogram extends ProtoAdapter<ExponentialHistogram> {
        public ProtoAdapter_ExponentialHistogram() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) ExponentialHistogram.class, "type.googleapis.com/opentelemetry.proto.metrics.v1.ExponentialHistogram", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/metrics/v1/metrics.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(ExponentialHistogram exponentialHistogram) {
            int encodedSizeWithTag = ExponentialHistogramDataPoint.ADAPTER.asRepeated().encodedSizeWithTag(1, exponentialHistogram.data_points);
            if (!Objects.equals(exponentialHistogram.aggregation_temporality, AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED)) {
                encodedSizeWithTag += AggregationTemporality.ADAPTER.encodedSizeWithTag(2, exponentialHistogram.aggregation_temporality);
            }
            return encodedSizeWithTag + exponentialHistogram.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, ExponentialHistogram exponentialHistogram) throws IOException {
            ExponentialHistogramDataPoint.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, (int) exponentialHistogram.data_points);
            if (!Objects.equals(exponentialHistogram.aggregation_temporality, AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED)) {
                AggregationTemporality.ADAPTER.encodeWithTag(protoWriter, 2, (int) exponentialHistogram.aggregation_temporality);
            }
            protoWriter.writeBytes(exponentialHistogram.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, ExponentialHistogram exponentialHistogram) throws IOException {
            reverseProtoWriter.writeBytes(exponentialHistogram.unknownFields());
            if (!Objects.equals(exponentialHistogram.aggregation_temporality, AggregationTemporality.AGGREGATION_TEMPORALITY_UNSPECIFIED)) {
                AggregationTemporality.ADAPTER.encodeWithTag(reverseProtoWriter, 2, (int) exponentialHistogram.aggregation_temporality);
            }
            ExponentialHistogramDataPoint.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, (int) exponentialHistogram.data_points);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public ExponentialHistogram decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    builder.addUnknownFields(protoReader.endMessageAndGetUnknownFields(beginMessage));
                    return builder.build();
                }
                if (nextTag == 1) {
                    builder.data_points.add(ExponentialHistogramDataPoint.ADAPTER.decode(protoReader));
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
        public ExponentialHistogram redact(ExponentialHistogram exponentialHistogram) {
            Builder newBuilder = exponentialHistogram.newBuilder();
            Internal.redactElements(newBuilder.data_points, ExponentialHistogramDataPoint.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
