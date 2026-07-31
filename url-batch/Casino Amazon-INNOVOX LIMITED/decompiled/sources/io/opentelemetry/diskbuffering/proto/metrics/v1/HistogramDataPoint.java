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
public final class HistogramDataPoint extends Message<HistogramDataPoint, Builder> {
    public static final ProtoAdapter<HistogramDataPoint> ADAPTER = new ProtoAdapter_HistogramDataPoint();
    public static final Double DEFAULT_MAX;
    public static final Double DEFAULT_MIN;
    public static final Double DEFAULT_SUM;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.common.v1.KeyValue#ADAPTER", label = WireField.Label.REPEATED, tag = 9)
    public final List<KeyValue> attributes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", jsonName = "bucketCounts", label = WireField.Label.PACKED, tag = 6)
    public final List<Long> bucket_counts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.OMIT_IDENTITY, tag = 4)
    public final long count;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.metrics.v1.Exemplar#ADAPTER", label = WireField.Label.REPEATED, tag = 8)
    public final List<Exemplar> exemplars;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "explicitBounds", label = WireField.Label.PACKED, tag = 7)
    public final List<Double> explicit_bounds;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.OMIT_IDENTITY, tag = 10)
    public final int flags;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 12)
    public final Double max;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 11)
    public final Double min;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", jsonName = "startTimeUnixNano", label = WireField.Label.OMIT_IDENTITY, tag = 2)
    public final long start_time_unix_nano;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 5)
    public final Double sum;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", jsonName = "timeUnixNano", label = WireField.Label.OMIT_IDENTITY, tag = 3)
    public final long time_unix_nano;

    static {
        Double valueOf = Double.valueOf(0.0d);
        DEFAULT_SUM = valueOf;
        DEFAULT_MIN = valueOf;
        DEFAULT_MAX = valueOf;
    }

    public HistogramDataPoint(List<KeyValue> list, long j, long j2, long j3, Double d, List<Long> list2, List<Double> list3, List<Exemplar> list4, int i, Double d2, Double d3) {
        this(list, j, j2, j3, d, list2, list3, list4, i, d2, d3, ByteString.EMPTY);
    }

    public HistogramDataPoint(List<KeyValue> list, long j, long j2, long j3, Double d, List<Long> list2, List<Double> list3, List<Exemplar> list4, int i, Double d2, Double d3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.attributes = Internal.immutableCopyOf("attributes", list);
        this.start_time_unix_nano = j;
        this.time_unix_nano = j2;
        this.count = j3;
        this.sum = d;
        this.bucket_counts = Internal.immutableCopyOf("bucket_counts", list2);
        this.explicit_bounds = Internal.immutableCopyOf("explicit_bounds", list3);
        this.exemplars = Internal.immutableCopyOf("exemplars", list4);
        this.flags = i;
        this.min = d2;
        this.max = d3;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.attributes = Internal.copyOf(this.attributes);
        builder.start_time_unix_nano = this.start_time_unix_nano;
        builder.time_unix_nano = this.time_unix_nano;
        builder.count = this.count;
        builder.sum = this.sum;
        builder.bucket_counts = Internal.copyOf(this.bucket_counts);
        builder.explicit_bounds = Internal.copyOf(this.explicit_bounds);
        builder.exemplars = Internal.copyOf(this.exemplars);
        builder.flags = this.flags;
        builder.min = this.min;
        builder.max = this.max;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HistogramDataPoint)) {
            return false;
        }
        HistogramDataPoint histogramDataPoint = (HistogramDataPoint) obj;
        return unknownFields().equals(histogramDataPoint.unknownFields()) && this.attributes.equals(histogramDataPoint.attributes) && Internal.equals(Long.valueOf(this.start_time_unix_nano), Long.valueOf(histogramDataPoint.start_time_unix_nano)) && Internal.equals(Long.valueOf(this.time_unix_nano), Long.valueOf(histogramDataPoint.time_unix_nano)) && Internal.equals(Long.valueOf(this.count), Long.valueOf(histogramDataPoint.count)) && Internal.equals(this.sum, histogramDataPoint.sum) && this.bucket_counts.equals(histogramDataPoint.bucket_counts) && this.explicit_bounds.equals(histogramDataPoint.explicit_bounds) && this.exemplars.equals(histogramDataPoint.exemplars) && Internal.equals(Integer.valueOf(this.flags), Integer.valueOf(histogramDataPoint.flags)) && Internal.equals(this.min, histogramDataPoint.min) && Internal.equals(this.max, histogramDataPoint.max);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((((unknownFields().hashCode() * 37) + this.attributes.hashCode()) * 37) + Long.hashCode(this.start_time_unix_nano)) * 37) + Long.hashCode(this.time_unix_nano)) * 37) + Long.hashCode(this.count)) * 37;
        Double d = this.sum;
        int hashCode2 = (((((((((hashCode + (d != null ? d.hashCode() : 0)) * 37) + this.bucket_counts.hashCode()) * 37) + this.explicit_bounds.hashCode()) * 37) + this.exemplars.hashCode()) * 37) + Integer.hashCode(this.flags)) * 37;
        Double d2 = this.min;
        int hashCode3 = (hashCode2 + (d2 != null ? d2.hashCode() : 0)) * 37;
        Double d3 = this.max;
        int hashCode4 = hashCode3 + (d3 != null ? d3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.attributes.isEmpty()) {
            sb.append(", attributes=").append(this.attributes);
        }
        sb.append(", start_time_unix_nano=").append(this.start_time_unix_nano);
        sb.append(", time_unix_nano=").append(this.time_unix_nano);
        sb.append(", count=").append(this.count);
        if (this.sum != null) {
            sb.append(", sum=").append(this.sum);
        }
        if (!this.bucket_counts.isEmpty()) {
            sb.append(", bucket_counts=").append(this.bucket_counts);
        }
        if (!this.explicit_bounds.isEmpty()) {
            sb.append(", explicit_bounds=").append(this.explicit_bounds);
        }
        if (!this.exemplars.isEmpty()) {
            sb.append(", exemplars=").append(this.exemplars);
        }
        sb.append(", flags=").append(this.flags);
        if (this.min != null) {
            sb.append(", min=").append(this.min);
        }
        if (this.max != null) {
            sb.append(", max=").append(this.max);
        }
        return sb.replace(0, 2, "HistogramDataPoint{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<HistogramDataPoint, Builder> {
        public Double max;
        public Double min;
        public Double sum;
        public List<KeyValue> attributes = Internal.newMutableList();
        public long start_time_unix_nano = 0;
        public long time_unix_nano = 0;
        public long count = 0;
        public List<Long> bucket_counts = Internal.newMutableList();
        public List<Double> explicit_bounds = Internal.newMutableList();
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

        public Builder count(long j) {
            this.count = j;
            return this;
        }

        public Builder sum(Double d) {
            this.sum = d;
            return this;
        }

        public Builder bucket_counts(List<Long> list) {
            Internal.checkElementsNotNull(list);
            this.bucket_counts = list;
            return this;
        }

        public Builder explicit_bounds(List<Double> list) {
            Internal.checkElementsNotNull(list);
            this.explicit_bounds = list;
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

        public Builder min(Double d) {
            this.min = d;
            return this;
        }

        public Builder max(Double d) {
            this.max = d;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public HistogramDataPoint build() {
            return new HistogramDataPoint(this.attributes, this.start_time_unix_nano, this.time_unix_nano, this.count, this.sum, this.bucket_counts, this.explicit_bounds, this.exemplars, this.flags, this.min, this.max, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_HistogramDataPoint extends ProtoAdapter<HistogramDataPoint> {
        public ProtoAdapter_HistogramDataPoint() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) HistogramDataPoint.class, "type.googleapis.com/opentelemetry.proto.metrics.v1.HistogramDataPoint", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/metrics/v1/metrics.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(HistogramDataPoint histogramDataPoint) {
            int encodedSizeWithTag = KeyValue.ADAPTER.asRepeated().encodedSizeWithTag(9, histogramDataPoint.attributes);
            if (!Objects.equals(Long.valueOf(histogramDataPoint.start_time_unix_nano), 0L)) {
                encodedSizeWithTag += ProtoAdapter.FIXED64.encodedSizeWithTag(2, Long.valueOf(histogramDataPoint.start_time_unix_nano));
            }
            if (!Objects.equals(Long.valueOf(histogramDataPoint.time_unix_nano), 0L)) {
                encodedSizeWithTag += ProtoAdapter.FIXED64.encodedSizeWithTag(3, Long.valueOf(histogramDataPoint.time_unix_nano));
            }
            if (!Objects.equals(Long.valueOf(histogramDataPoint.count), 0L)) {
                encodedSizeWithTag += ProtoAdapter.FIXED64.encodedSizeWithTag(4, Long.valueOf(histogramDataPoint.count));
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + ProtoAdapter.DOUBLE.encodedSizeWithTag(5, histogramDataPoint.sum) + ProtoAdapter.FIXED64.asPacked().encodedSizeWithTag(6, histogramDataPoint.bucket_counts) + ProtoAdapter.DOUBLE.asPacked().encodedSizeWithTag(7, histogramDataPoint.explicit_bounds) + Exemplar.ADAPTER.asRepeated().encodedSizeWithTag(8, histogramDataPoint.exemplars);
            if (!Objects.equals(Integer.valueOf(histogramDataPoint.flags), 0)) {
                encodedSizeWithTag2 += ProtoAdapter.UINT32.encodedSizeWithTag(10, Integer.valueOf(histogramDataPoint.flags));
            }
            return encodedSizeWithTag2 + ProtoAdapter.DOUBLE.encodedSizeWithTag(11, histogramDataPoint.min) + ProtoAdapter.DOUBLE.encodedSizeWithTag(12, histogramDataPoint.max) + histogramDataPoint.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, HistogramDataPoint histogramDataPoint) throws IOException {
            KeyValue.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, (int) histogramDataPoint.attributes);
            if (!Objects.equals(Long.valueOf(histogramDataPoint.start_time_unix_nano), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 2, (int) Long.valueOf(histogramDataPoint.start_time_unix_nano));
            }
            if (!Objects.equals(Long.valueOf(histogramDataPoint.time_unix_nano), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 3, (int) Long.valueOf(histogramDataPoint.time_unix_nano));
            }
            if (!Objects.equals(Long.valueOf(histogramDataPoint.count), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 4, (int) Long.valueOf(histogramDataPoint.count));
            }
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 5, (int) histogramDataPoint.sum);
            ProtoAdapter.FIXED64.asPacked().encodeWithTag(protoWriter, 6, (int) histogramDataPoint.bucket_counts);
            ProtoAdapter.DOUBLE.asPacked().encodeWithTag(protoWriter, 7, (int) histogramDataPoint.explicit_bounds);
            Exemplar.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, (int) histogramDataPoint.exemplars);
            if (!Objects.equals(Integer.valueOf(histogramDataPoint.flags), 0)) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 10, (int) Integer.valueOf(histogramDataPoint.flags));
            }
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 11, (int) histogramDataPoint.min);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 12, (int) histogramDataPoint.max);
            protoWriter.writeBytes(histogramDataPoint.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, HistogramDataPoint histogramDataPoint) throws IOException {
            reverseProtoWriter.writeBytes(histogramDataPoint.unknownFields());
            ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 12, (int) histogramDataPoint.max);
            ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 11, (int) histogramDataPoint.min);
            if (!Objects.equals(Integer.valueOf(histogramDataPoint.flags), 0)) {
                ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 10, (int) Integer.valueOf(histogramDataPoint.flags));
            }
            Exemplar.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 8, (int) histogramDataPoint.exemplars);
            ProtoAdapter.DOUBLE.asPacked().encodeWithTag(reverseProtoWriter, 7, (int) histogramDataPoint.explicit_bounds);
            ProtoAdapter.FIXED64.asPacked().encodeWithTag(reverseProtoWriter, 6, (int) histogramDataPoint.bucket_counts);
            ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 5, (int) histogramDataPoint.sum);
            if (!Objects.equals(Long.valueOf(histogramDataPoint.count), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(reverseProtoWriter, 4, (int) Long.valueOf(histogramDataPoint.count));
            }
            if (!Objects.equals(Long.valueOf(histogramDataPoint.time_unix_nano), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(reverseProtoWriter, 3, (int) Long.valueOf(histogramDataPoint.time_unix_nano));
            }
            if (!Objects.equals(Long.valueOf(histogramDataPoint.start_time_unix_nano), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(reverseProtoWriter, 2, (int) Long.valueOf(histogramDataPoint.start_time_unix_nano));
            }
            KeyValue.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 9, (int) histogramDataPoint.attributes);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public HistogramDataPoint decode(ProtoReader protoReader) throws IOException {
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
                            builder.count(ProtoAdapter.FIXED64.decode(protoReader).longValue());
                            break;
                        case 5:
                            builder.sum(ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case 6:
                            builder.bucket_counts.add(ProtoAdapter.FIXED64.decode(protoReader));
                            break;
                        case 7:
                            builder.explicit_bounds.add(ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case 8:
                            builder.exemplars.add(Exemplar.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            builder.attributes.add(KeyValue.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            builder.flags(ProtoAdapter.UINT32.decode(protoReader).intValue());
                            break;
                        case 11:
                            builder.min(ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case 12:
                            builder.max(ProtoAdapter.DOUBLE.decode(protoReader));
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
        public HistogramDataPoint redact(HistogramDataPoint histogramDataPoint) {
            Builder newBuilder = histogramDataPoint.newBuilder();
            Internal.redactElements(newBuilder.attributes, KeyValue.ADAPTER);
            Internal.redactElements(newBuilder.exemplars, Exemplar.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
