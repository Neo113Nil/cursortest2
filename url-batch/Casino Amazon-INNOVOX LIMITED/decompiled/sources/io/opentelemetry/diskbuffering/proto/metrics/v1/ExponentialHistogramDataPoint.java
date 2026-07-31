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
public final class ExponentialHistogramDataPoint extends Message<ExponentialHistogramDataPoint, Builder> {
    public static final ProtoAdapter<ExponentialHistogramDataPoint> ADAPTER = new ProtoAdapter_ExponentialHistogramDataPoint();
    public static final Double DEFAULT_MAX;
    public static final Double DEFAULT_MIN;
    public static final Double DEFAULT_SUM;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.common.v1.KeyValue#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<KeyValue> attributes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.OMIT_IDENTITY, tag = 4)
    public final long count;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.metrics.v1.Exemplar#ADAPTER", label = WireField.Label.REPEATED, tag = 11)
    public final List<Exemplar> exemplars;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.OMIT_IDENTITY, tag = 10)
    public final int flags;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 13)
    public final Double max;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 12)
    public final Double min;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.metrics.v1.ExponentialHistogramDataPoint$Buckets#ADAPTER", label = WireField.Label.OMIT_IDENTITY, tag = 9)
    public final Buckets negative;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.metrics.v1.ExponentialHistogramDataPoint$Buckets#ADAPTER", label = WireField.Label.OMIT_IDENTITY, tag = 8)
    public final Buckets positive;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.OMIT_IDENTITY, tag = 6)
    public final int scale;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", jsonName = "startTimeUnixNano", label = WireField.Label.OMIT_IDENTITY, tag = 2)
    public final long start_time_unix_nano;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 5)
    public final Double sum;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", jsonName = "timeUnixNano", label = WireField.Label.OMIT_IDENTITY, tag = 3)
    public final long time_unix_nano;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", jsonName = "zeroCount", label = WireField.Label.OMIT_IDENTITY, tag = 7)
    public final long zero_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "zeroThreshold", label = WireField.Label.OMIT_IDENTITY, tag = 14)
    public final double zero_threshold;

    static {
        Double valueOf = Double.valueOf(0.0d);
        DEFAULT_SUM = valueOf;
        DEFAULT_MIN = valueOf;
        DEFAULT_MAX = valueOf;
    }

    public ExponentialHistogramDataPoint(List<KeyValue> list, long j, long j2, long j3, Double d, int i, long j4, Buckets buckets, Buckets buckets2, int i2, List<Exemplar> list2, Double d2, Double d3, double d4) {
        this(list, j, j2, j3, d, i, j4, buckets, buckets2, i2, list2, d2, d3, d4, ByteString.EMPTY);
    }

    public ExponentialHistogramDataPoint(List<KeyValue> list, long j, long j2, long j3, Double d, int i, long j4, Buckets buckets, Buckets buckets2, int i2, List<Exemplar> list2, Double d2, Double d3, double d4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.attributes = Internal.immutableCopyOf("attributes", list);
        this.start_time_unix_nano = j;
        this.time_unix_nano = j2;
        this.count = j3;
        this.sum = d;
        this.scale = i;
        this.zero_count = j4;
        this.positive = buckets;
        this.negative = buckets2;
        this.flags = i2;
        this.exemplars = Internal.immutableCopyOf("exemplars", list2);
        this.min = d2;
        this.max = d3;
        this.zero_threshold = d4;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.attributes = Internal.copyOf(this.attributes);
        builder.start_time_unix_nano = this.start_time_unix_nano;
        builder.time_unix_nano = this.time_unix_nano;
        builder.count = this.count;
        builder.sum = this.sum;
        builder.scale = this.scale;
        builder.zero_count = this.zero_count;
        builder.positive = this.positive;
        builder.negative = this.negative;
        builder.flags = this.flags;
        builder.exemplars = Internal.copyOf(this.exemplars);
        builder.min = this.min;
        builder.max = this.max;
        builder.zero_threshold = this.zero_threshold;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExponentialHistogramDataPoint)) {
            return false;
        }
        ExponentialHistogramDataPoint exponentialHistogramDataPoint = (ExponentialHistogramDataPoint) obj;
        return unknownFields().equals(exponentialHistogramDataPoint.unknownFields()) && this.attributes.equals(exponentialHistogramDataPoint.attributes) && Internal.equals(Long.valueOf(this.start_time_unix_nano), Long.valueOf(exponentialHistogramDataPoint.start_time_unix_nano)) && Internal.equals(Long.valueOf(this.time_unix_nano), Long.valueOf(exponentialHistogramDataPoint.time_unix_nano)) && Internal.equals(Long.valueOf(this.count), Long.valueOf(exponentialHistogramDataPoint.count)) && Internal.equals(this.sum, exponentialHistogramDataPoint.sum) && Internal.equals(Integer.valueOf(this.scale), Integer.valueOf(exponentialHistogramDataPoint.scale)) && Internal.equals(Long.valueOf(this.zero_count), Long.valueOf(exponentialHistogramDataPoint.zero_count)) && Internal.equals(this.positive, exponentialHistogramDataPoint.positive) && Internal.equals(this.negative, exponentialHistogramDataPoint.negative) && Internal.equals(Integer.valueOf(this.flags), Integer.valueOf(exponentialHistogramDataPoint.flags)) && this.exemplars.equals(exponentialHistogramDataPoint.exemplars) && Internal.equals(this.min, exponentialHistogramDataPoint.min) && Internal.equals(this.max, exponentialHistogramDataPoint.max) && Internal.equals(Double.valueOf(this.zero_threshold), Double.valueOf(exponentialHistogramDataPoint.zero_threshold));
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((((unknownFields().hashCode() * 37) + this.attributes.hashCode()) * 37) + Long.hashCode(this.start_time_unix_nano)) * 37) + Long.hashCode(this.time_unix_nano)) * 37) + Long.hashCode(this.count)) * 37;
        Double d = this.sum;
        int hashCode2 = (((((hashCode + (d != null ? d.hashCode() : 0)) * 37) + Integer.hashCode(this.scale)) * 37) + Long.hashCode(this.zero_count)) * 37;
        Buckets buckets = this.positive;
        int hashCode3 = (hashCode2 + (buckets != null ? buckets.hashCode() : 0)) * 37;
        Buckets buckets2 = this.negative;
        int hashCode4 = (((((hashCode3 + (buckets2 != null ? buckets2.hashCode() : 0)) * 37) + Integer.hashCode(this.flags)) * 37) + this.exemplars.hashCode()) * 37;
        Double d2 = this.min;
        int hashCode5 = (hashCode4 + (d2 != null ? d2.hashCode() : 0)) * 37;
        Double d3 = this.max;
        int hashCode6 = ((hashCode5 + (d3 != null ? d3.hashCode() : 0)) * 37) + Double.hashCode(this.zero_threshold);
        this.hashCode = hashCode6;
        return hashCode6;
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
        sb.append(", scale=").append(this.scale);
        sb.append(", zero_count=").append(this.zero_count);
        if (this.positive != null) {
            sb.append(", positive=").append(this.positive);
        }
        if (this.negative != null) {
            sb.append(", negative=").append(this.negative);
        }
        sb.append(", flags=").append(this.flags);
        if (!this.exemplars.isEmpty()) {
            sb.append(", exemplars=").append(this.exemplars);
        }
        if (this.min != null) {
            sb.append(", min=").append(this.min);
        }
        if (this.max != null) {
            sb.append(", max=").append(this.max);
        }
        sb.append(", zero_threshold=").append(this.zero_threshold);
        return sb.replace(0, 2, "ExponentialHistogramDataPoint{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<ExponentialHistogramDataPoint, Builder> {
        public Double max;
        public Double min;
        public Buckets negative;
        public Buckets positive;
        public Double sum;
        public List<KeyValue> attributes = Internal.newMutableList();
        public long start_time_unix_nano = 0;
        public long time_unix_nano = 0;
        public long count = 0;
        public int scale = 0;
        public long zero_count = 0;
        public int flags = 0;
        public List<Exemplar> exemplars = Internal.newMutableList();
        public double zero_threshold = 0.0d;

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

        public Builder scale(int i) {
            this.scale = i;
            return this;
        }

        public Builder zero_count(long j) {
            this.zero_count = j;
            return this;
        }

        public Builder positive(Buckets buckets) {
            this.positive = buckets;
            return this;
        }

        public Builder negative(Buckets buckets) {
            this.negative = buckets;
            return this;
        }

        public Builder flags(int i) {
            this.flags = i;
            return this;
        }

        public Builder exemplars(List<Exemplar> list) {
            Internal.checkElementsNotNull(list);
            this.exemplars = list;
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

        public Builder zero_threshold(double d) {
            this.zero_threshold = d;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ExponentialHistogramDataPoint build() {
            return new ExponentialHistogramDataPoint(this.attributes, this.start_time_unix_nano, this.time_unix_nano, this.count, this.sum, this.scale, this.zero_count, this.positive, this.negative, this.flags, this.exemplars, this.min, this.max, this.zero_threshold, super.buildUnknownFields());
        }
    }

    public static final class Buckets extends Message<Buckets, Builder> {
        public static final ProtoAdapter<Buckets> ADAPTER = new ProtoAdapter_Buckets();
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "bucketCounts", label = WireField.Label.PACKED, tag = 2)
        public final List<Long> bucket_counts;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#SINT32", label = WireField.Label.OMIT_IDENTITY, tag = 1)
        public final int offset;

        public Buckets(int i, List<Long> list) {
            this(i, list, ByteString.EMPTY);
        }

        public Buckets(int i, List<Long> list, ByteString byteString) {
            super(ADAPTER, byteString);
            this.offset = i;
            this.bucket_counts = Internal.immutableCopyOf("bucket_counts", list);
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.offset = this.offset;
            builder.bucket_counts = Internal.copyOf(this.bucket_counts);
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Buckets)) {
                return false;
            }
            Buckets buckets = (Buckets) obj;
            return unknownFields().equals(buckets.unknownFields()) && Internal.equals(Integer.valueOf(this.offset), Integer.valueOf(buckets.offset)) && this.bucket_counts.equals(buckets.bucket_counts);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = (((unknownFields().hashCode() * 37) + Integer.hashCode(this.offset)) * 37) + this.bucket_counts.hashCode();
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", offset=").append(this.offset);
            if (!this.bucket_counts.isEmpty()) {
                sb.append(", bucket_counts=").append(this.bucket_counts);
            }
            return sb.replace(0, 2, "Buckets{").append(AbstractJsonLexerKt.END_OBJ).toString();
        }

        public static final class Builder extends Message.Builder<Buckets, Builder> {
            public int offset = 0;
            public List<Long> bucket_counts = Internal.newMutableList();

            public Builder offset(int i) {
                this.offset = i;
                return this;
            }

            public Builder bucket_counts(List<Long> list) {
                Internal.checkElementsNotNull(list);
                this.bucket_counts = list;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public Buckets build() {
                return new Buckets(this.offset, this.bucket_counts, super.buildUnknownFields());
            }
        }

        private static final class ProtoAdapter_Buckets extends ProtoAdapter<Buckets> {
            public ProtoAdapter_Buckets() {
                super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) Buckets.class, "type.googleapis.com/opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint.Buckets", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/metrics/v1/metrics.proto");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Buckets buckets) {
                return (Objects.equals(Integer.valueOf(buckets.offset), 0) ? 0 : ProtoAdapter.SINT32.encodedSizeWithTag(1, Integer.valueOf(buckets.offset))) + ProtoAdapter.UINT64.asPacked().encodedSizeWithTag(2, buckets.bucket_counts) + buckets.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, Buckets buckets) throws IOException {
                if (!Objects.equals(Integer.valueOf(buckets.offset), 0)) {
                    ProtoAdapter.SINT32.encodeWithTag(protoWriter, 1, (int) Integer.valueOf(buckets.offset));
                }
                ProtoAdapter.UINT64.asPacked().encodeWithTag(protoWriter, 2, (int) buckets.bucket_counts);
                protoWriter.writeBytes(buckets.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter reverseProtoWriter, Buckets buckets) throws IOException {
                reverseProtoWriter.writeBytes(buckets.unknownFields());
                ProtoAdapter.UINT64.asPacked().encodeWithTag(reverseProtoWriter, 2, (int) buckets.bucket_counts);
                if (Objects.equals(Integer.valueOf(buckets.offset), 0)) {
                    return;
                }
                ProtoAdapter.SINT32.encodeWithTag(reverseProtoWriter, 1, (int) Integer.valueOf(buckets.offset));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Buckets decode(ProtoReader protoReader) throws IOException {
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        builder.addUnknownFields(protoReader.endMessageAndGetUnknownFields(beginMessage));
                        return builder.build();
                    }
                    if (nextTag == 1) {
                        builder.offset(ProtoAdapter.SINT32.decode(protoReader).intValue());
                    } else if (nextTag == 2) {
                        builder.bucket_counts.add(ProtoAdapter.UINT64.decode(protoReader));
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Buckets redact(Buckets buckets) {
                Builder newBuilder = buckets.newBuilder();
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }
        }
    }

    private static final class ProtoAdapter_ExponentialHistogramDataPoint extends ProtoAdapter<ExponentialHistogramDataPoint> {
        public ProtoAdapter_ExponentialHistogramDataPoint() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) ExponentialHistogramDataPoint.class, "type.googleapis.com/opentelemetry.proto.metrics.v1.ExponentialHistogramDataPoint", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/metrics/v1/metrics.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(ExponentialHistogramDataPoint exponentialHistogramDataPoint) {
            int encodedSizeWithTag = KeyValue.ADAPTER.asRepeated().encodedSizeWithTag(1, exponentialHistogramDataPoint.attributes);
            if (!Objects.equals(Long.valueOf(exponentialHistogramDataPoint.start_time_unix_nano), 0L)) {
                encodedSizeWithTag += ProtoAdapter.FIXED64.encodedSizeWithTag(2, Long.valueOf(exponentialHistogramDataPoint.start_time_unix_nano));
            }
            if (!Objects.equals(Long.valueOf(exponentialHistogramDataPoint.time_unix_nano), 0L)) {
                encodedSizeWithTag += ProtoAdapter.FIXED64.encodedSizeWithTag(3, Long.valueOf(exponentialHistogramDataPoint.time_unix_nano));
            }
            if (!Objects.equals(Long.valueOf(exponentialHistogramDataPoint.count), 0L)) {
                encodedSizeWithTag += ProtoAdapter.FIXED64.encodedSizeWithTag(4, Long.valueOf(exponentialHistogramDataPoint.count));
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + ProtoAdapter.DOUBLE.encodedSizeWithTag(5, exponentialHistogramDataPoint.sum);
            if (!Objects.equals(Integer.valueOf(exponentialHistogramDataPoint.scale), 0)) {
                encodedSizeWithTag2 += ProtoAdapter.SINT32.encodedSizeWithTag(6, Integer.valueOf(exponentialHistogramDataPoint.scale));
            }
            if (!Objects.equals(Long.valueOf(exponentialHistogramDataPoint.zero_count), 0L)) {
                encodedSizeWithTag2 += ProtoAdapter.FIXED64.encodedSizeWithTag(7, Long.valueOf(exponentialHistogramDataPoint.zero_count));
            }
            if (!Objects.equals(exponentialHistogramDataPoint.positive, null)) {
                encodedSizeWithTag2 += Buckets.ADAPTER.encodedSizeWithTag(8, exponentialHistogramDataPoint.positive);
            }
            if (!Objects.equals(exponentialHistogramDataPoint.negative, null)) {
                encodedSizeWithTag2 += Buckets.ADAPTER.encodedSizeWithTag(9, exponentialHistogramDataPoint.negative);
            }
            if (!Objects.equals(Integer.valueOf(exponentialHistogramDataPoint.flags), 0)) {
                encodedSizeWithTag2 += ProtoAdapter.UINT32.encodedSizeWithTag(10, Integer.valueOf(exponentialHistogramDataPoint.flags));
            }
            int encodedSizeWithTag3 = encodedSizeWithTag2 + Exemplar.ADAPTER.asRepeated().encodedSizeWithTag(11, exponentialHistogramDataPoint.exemplars) + ProtoAdapter.DOUBLE.encodedSizeWithTag(12, exponentialHistogramDataPoint.min) + ProtoAdapter.DOUBLE.encodedSizeWithTag(13, exponentialHistogramDataPoint.max);
            if (!Objects.equals(Double.valueOf(exponentialHistogramDataPoint.zero_threshold), Double.valueOf(0.0d))) {
                encodedSizeWithTag3 += ProtoAdapter.DOUBLE.encodedSizeWithTag(14, Double.valueOf(exponentialHistogramDataPoint.zero_threshold));
            }
            return encodedSizeWithTag3 + exponentialHistogramDataPoint.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, ExponentialHistogramDataPoint exponentialHistogramDataPoint) throws IOException {
            KeyValue.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, (int) exponentialHistogramDataPoint.attributes);
            if (!Objects.equals(Long.valueOf(exponentialHistogramDataPoint.start_time_unix_nano), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 2, (int) Long.valueOf(exponentialHistogramDataPoint.start_time_unix_nano));
            }
            if (!Objects.equals(Long.valueOf(exponentialHistogramDataPoint.time_unix_nano), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 3, (int) Long.valueOf(exponentialHistogramDataPoint.time_unix_nano));
            }
            if (!Objects.equals(Long.valueOf(exponentialHistogramDataPoint.count), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 4, (int) Long.valueOf(exponentialHistogramDataPoint.count));
            }
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 5, (int) exponentialHistogramDataPoint.sum);
            if (!Objects.equals(Integer.valueOf(exponentialHistogramDataPoint.scale), 0)) {
                ProtoAdapter.SINT32.encodeWithTag(protoWriter, 6, (int) Integer.valueOf(exponentialHistogramDataPoint.scale));
            }
            if (!Objects.equals(Long.valueOf(exponentialHistogramDataPoint.zero_count), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 7, (int) Long.valueOf(exponentialHistogramDataPoint.zero_count));
            }
            if (!Objects.equals(exponentialHistogramDataPoint.positive, null)) {
                Buckets.ADAPTER.encodeWithTag(protoWriter, 8, (int) exponentialHistogramDataPoint.positive);
            }
            if (!Objects.equals(exponentialHistogramDataPoint.negative, null)) {
                Buckets.ADAPTER.encodeWithTag(protoWriter, 9, (int) exponentialHistogramDataPoint.negative);
            }
            if (!Objects.equals(Integer.valueOf(exponentialHistogramDataPoint.flags), 0)) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 10, (int) Integer.valueOf(exponentialHistogramDataPoint.flags));
            }
            Exemplar.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, (int) exponentialHistogramDataPoint.exemplars);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 12, (int) exponentialHistogramDataPoint.min);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 13, (int) exponentialHistogramDataPoint.max);
            if (!Objects.equals(Double.valueOf(exponentialHistogramDataPoint.zero_threshold), Double.valueOf(0.0d))) {
                ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 14, (int) Double.valueOf(exponentialHistogramDataPoint.zero_threshold));
            }
            protoWriter.writeBytes(exponentialHistogramDataPoint.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, ExponentialHistogramDataPoint exponentialHistogramDataPoint) throws IOException {
            reverseProtoWriter.writeBytes(exponentialHistogramDataPoint.unknownFields());
            if (!Objects.equals(Double.valueOf(exponentialHistogramDataPoint.zero_threshold), Double.valueOf(0.0d))) {
                ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 14, (int) Double.valueOf(exponentialHistogramDataPoint.zero_threshold));
            }
            ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 13, (int) exponentialHistogramDataPoint.max);
            ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 12, (int) exponentialHistogramDataPoint.min);
            Exemplar.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 11, (int) exponentialHistogramDataPoint.exemplars);
            if (!Objects.equals(Integer.valueOf(exponentialHistogramDataPoint.flags), 0)) {
                ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 10, (int) Integer.valueOf(exponentialHistogramDataPoint.flags));
            }
            if (!Objects.equals(exponentialHistogramDataPoint.negative, null)) {
                Buckets.ADAPTER.encodeWithTag(reverseProtoWriter, 9, (int) exponentialHistogramDataPoint.negative);
            }
            if (!Objects.equals(exponentialHistogramDataPoint.positive, null)) {
                Buckets.ADAPTER.encodeWithTag(reverseProtoWriter, 8, (int) exponentialHistogramDataPoint.positive);
            }
            if (!Objects.equals(Long.valueOf(exponentialHistogramDataPoint.zero_count), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(reverseProtoWriter, 7, (int) Long.valueOf(exponentialHistogramDataPoint.zero_count));
            }
            if (!Objects.equals(Integer.valueOf(exponentialHistogramDataPoint.scale), 0)) {
                ProtoAdapter.SINT32.encodeWithTag(reverseProtoWriter, 6, (int) Integer.valueOf(exponentialHistogramDataPoint.scale));
            }
            ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 5, (int) exponentialHistogramDataPoint.sum);
            if (!Objects.equals(Long.valueOf(exponentialHistogramDataPoint.count), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(reverseProtoWriter, 4, (int) Long.valueOf(exponentialHistogramDataPoint.count));
            }
            if (!Objects.equals(Long.valueOf(exponentialHistogramDataPoint.time_unix_nano), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(reverseProtoWriter, 3, (int) Long.valueOf(exponentialHistogramDataPoint.time_unix_nano));
            }
            if (!Objects.equals(Long.valueOf(exponentialHistogramDataPoint.start_time_unix_nano), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(reverseProtoWriter, 2, (int) Long.valueOf(exponentialHistogramDataPoint.start_time_unix_nano));
            }
            KeyValue.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, (int) exponentialHistogramDataPoint.attributes);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public ExponentialHistogramDataPoint decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.attributes.add(KeyValue.ADAPTER.decode(protoReader));
                            break;
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
                            builder.scale(ProtoAdapter.SINT32.decode(protoReader).intValue());
                            break;
                        case 7:
                            builder.zero_count(ProtoAdapter.FIXED64.decode(protoReader).longValue());
                            break;
                        case 8:
                            builder.positive(Buckets.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            builder.negative(Buckets.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            builder.flags(ProtoAdapter.UINT32.decode(protoReader).intValue());
                            break;
                        case 11:
                            builder.exemplars.add(Exemplar.ADAPTER.decode(protoReader));
                            break;
                        case 12:
                            builder.min(ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case 13:
                            builder.max(ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case 14:
                            builder.zero_threshold(ProtoAdapter.DOUBLE.decode(protoReader).doubleValue());
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
        public ExponentialHistogramDataPoint redact(ExponentialHistogramDataPoint exponentialHistogramDataPoint) {
            Builder newBuilder = exponentialHistogramDataPoint.newBuilder();
            Internal.redactElements(newBuilder.attributes, KeyValue.ADAPTER);
            if (newBuilder.positive != null) {
                newBuilder.positive = Buckets.ADAPTER.redact(newBuilder.positive);
            }
            if (newBuilder.negative != null) {
                newBuilder.negative = Buckets.ADAPTER.redact(newBuilder.negative);
            }
            Internal.redactElements(newBuilder.exemplars, Exemplar.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
