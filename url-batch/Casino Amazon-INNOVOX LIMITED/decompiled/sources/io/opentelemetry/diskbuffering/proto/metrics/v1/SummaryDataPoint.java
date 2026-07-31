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
public final class SummaryDataPoint extends Message<SummaryDataPoint, Builder> {
    public static final ProtoAdapter<SummaryDataPoint> ADAPTER = new ProtoAdapter_SummaryDataPoint();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.common.v1.KeyValue#ADAPTER", label = WireField.Label.REPEATED, tag = 7)
    public final List<KeyValue> attributes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", label = WireField.Label.OMIT_IDENTITY, tag = 4)
    public final long count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.OMIT_IDENTITY, tag = 8)
    public final int flags;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.metrics.v1.SummaryDataPoint$ValueAtQuantile#ADAPTER", jsonName = "quantileValues", label = WireField.Label.REPEATED, tag = 6)
    public final List<ValueAtQuantile> quantile_values;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", jsonName = "startTimeUnixNano", label = WireField.Label.OMIT_IDENTITY, tag = 2)
    public final long start_time_unix_nano;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, tag = 5)
    public final double sum;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FIXED64", jsonName = "timeUnixNano", label = WireField.Label.OMIT_IDENTITY, tag = 3)
    public final long time_unix_nano;

    public SummaryDataPoint(List<KeyValue> list, long j, long j2, long j3, double d, List<ValueAtQuantile> list2, int i) {
        this(list, j, j2, j3, d, list2, i, ByteString.EMPTY);
    }

    public SummaryDataPoint(List<KeyValue> list, long j, long j2, long j3, double d, List<ValueAtQuantile> list2, int i, ByteString byteString) {
        super(ADAPTER, byteString);
        this.attributes = Internal.immutableCopyOf("attributes", list);
        this.start_time_unix_nano = j;
        this.time_unix_nano = j2;
        this.count = j3;
        this.sum = d;
        this.quantile_values = Internal.immutableCopyOf("quantile_values", list2);
        this.flags = i;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.attributes = Internal.copyOf(this.attributes);
        builder.start_time_unix_nano = this.start_time_unix_nano;
        builder.time_unix_nano = this.time_unix_nano;
        builder.count = this.count;
        builder.sum = this.sum;
        builder.quantile_values = Internal.copyOf(this.quantile_values);
        builder.flags = this.flags;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SummaryDataPoint)) {
            return false;
        }
        SummaryDataPoint summaryDataPoint = (SummaryDataPoint) obj;
        return unknownFields().equals(summaryDataPoint.unknownFields()) && this.attributes.equals(summaryDataPoint.attributes) && Internal.equals(Long.valueOf(this.start_time_unix_nano), Long.valueOf(summaryDataPoint.start_time_unix_nano)) && Internal.equals(Long.valueOf(this.time_unix_nano), Long.valueOf(summaryDataPoint.time_unix_nano)) && Internal.equals(Long.valueOf(this.count), Long.valueOf(summaryDataPoint.count)) && Internal.equals(Double.valueOf(this.sum), Double.valueOf(summaryDataPoint.sum)) && this.quantile_values.equals(summaryDataPoint.quantile_values) && Internal.equals(Integer.valueOf(this.flags), Integer.valueOf(summaryDataPoint.flags));
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (((((((((((((unknownFields().hashCode() * 37) + this.attributes.hashCode()) * 37) + Long.hashCode(this.start_time_unix_nano)) * 37) + Long.hashCode(this.time_unix_nano)) * 37) + Long.hashCode(this.count)) * 37) + Double.hashCode(this.sum)) * 37) + this.quantile_values.hashCode()) * 37) + Integer.hashCode(this.flags);
        this.hashCode = hashCode;
        return hashCode;
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
        sb.append(", sum=").append(this.sum);
        if (!this.quantile_values.isEmpty()) {
            sb.append(", quantile_values=").append(this.quantile_values);
        }
        sb.append(", flags=").append(this.flags);
        return sb.replace(0, 2, "SummaryDataPoint{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<SummaryDataPoint, Builder> {
        public List<KeyValue> attributes = Internal.newMutableList();
        public long start_time_unix_nano = 0;
        public long time_unix_nano = 0;
        public long count = 0;
        public double sum = 0.0d;
        public List<ValueAtQuantile> quantile_values = Internal.newMutableList();
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

        public Builder sum(double d) {
            this.sum = d;
            return this;
        }

        public Builder quantile_values(List<ValueAtQuantile> list) {
            Internal.checkElementsNotNull(list);
            this.quantile_values = list;
            return this;
        }

        public Builder flags(int i) {
            this.flags = i;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public SummaryDataPoint build() {
            return new SummaryDataPoint(this.attributes, this.start_time_unix_nano, this.time_unix_nano, this.count, this.sum, this.quantile_values, this.flags, super.buildUnknownFields());
        }
    }

    public static final class ValueAtQuantile extends Message<ValueAtQuantile, Builder> {
        public static final ProtoAdapter<ValueAtQuantile> ADAPTER = new ProtoAdapter_ValueAtQuantile();
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, tag = 1)
        public final double quantile;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, tag = 2)
        public final double value;

        public ValueAtQuantile(double d, double d2) {
            this(d, d2, ByteString.EMPTY);
        }

        public ValueAtQuantile(double d, double d2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.quantile = d;
            this.value = d2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.quantile = this.quantile;
            builder.value = this.value;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ValueAtQuantile)) {
                return false;
            }
            ValueAtQuantile valueAtQuantile = (ValueAtQuantile) obj;
            return unknownFields().equals(valueAtQuantile.unknownFields()) && Internal.equals(Double.valueOf(this.quantile), Double.valueOf(valueAtQuantile.quantile)) && Internal.equals(Double.valueOf(this.value), Double.valueOf(valueAtQuantile.value));
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = (((unknownFields().hashCode() * 37) + Double.hashCode(this.quantile)) * 37) + Double.hashCode(this.value);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", quantile=").append(this.quantile);
            sb.append(", value=").append(this.value);
            return sb.replace(0, 2, "ValueAtQuantile{").append(AbstractJsonLexerKt.END_OBJ).toString();
        }

        public static final class Builder extends Message.Builder<ValueAtQuantile, Builder> {
            public double quantile = 0.0d;
            public double value = 0.0d;

            public Builder quantile(double d) {
                this.quantile = d;
                return this;
            }

            public Builder value(double d) {
                this.value = d;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public ValueAtQuantile build() {
                return new ValueAtQuantile(this.quantile, this.value, super.buildUnknownFields());
            }
        }

        private static final class ProtoAdapter_ValueAtQuantile extends ProtoAdapter<ValueAtQuantile> {
            public ProtoAdapter_ValueAtQuantile() {
                super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) ValueAtQuantile.class, "type.googleapis.com/opentelemetry.proto.metrics.v1.SummaryDataPoint.ValueAtQuantile", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/metrics/v1/metrics.proto");
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ValueAtQuantile valueAtQuantile) {
                Double valueOf = Double.valueOf(valueAtQuantile.quantile);
                Double valueOf2 = Double.valueOf(0.0d);
                int encodedSizeWithTag = !Objects.equals(valueOf, valueOf2) ? ProtoAdapter.DOUBLE.encodedSizeWithTag(1, Double.valueOf(valueAtQuantile.quantile)) : 0;
                if (!Objects.equals(Double.valueOf(valueAtQuantile.value), valueOf2)) {
                    encodedSizeWithTag += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, Double.valueOf(valueAtQuantile.value));
                }
                return encodedSizeWithTag + valueAtQuantile.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter protoWriter, ValueAtQuantile valueAtQuantile) throws IOException {
                Double valueOf = Double.valueOf(valueAtQuantile.quantile);
                Double valueOf2 = Double.valueOf(0.0d);
                if (!Objects.equals(valueOf, valueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 1, (int) Double.valueOf(valueAtQuantile.quantile));
                }
                if (!Objects.equals(Double.valueOf(valueAtQuantile.value), valueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 2, (int) Double.valueOf(valueAtQuantile.value));
                }
                protoWriter.writeBytes(valueAtQuantile.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter reverseProtoWriter, ValueAtQuantile valueAtQuantile) throws IOException {
                reverseProtoWriter.writeBytes(valueAtQuantile.unknownFields());
                Double valueOf = Double.valueOf(valueAtQuantile.value);
                Double valueOf2 = Double.valueOf(0.0d);
                if (!Objects.equals(valueOf, valueOf2)) {
                    ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 2, (int) Double.valueOf(valueAtQuantile.value));
                }
                if (Objects.equals(Double.valueOf(valueAtQuantile.quantile), valueOf2)) {
                    return;
                }
                ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 1, (int) Double.valueOf(valueAtQuantile.quantile));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ValueAtQuantile decode(ProtoReader protoReader) throws IOException {
                Builder builder = new Builder();
                long beginMessage = protoReader.beginMessage();
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        builder.addUnknownFields(protoReader.endMessageAndGetUnknownFields(beginMessage));
                        return builder.build();
                    }
                    if (nextTag == 1) {
                        builder.quantile(ProtoAdapter.DOUBLE.decode(protoReader).doubleValue());
                    } else if (nextTag == 2) {
                        builder.value(ProtoAdapter.DOUBLE.decode(protoReader).doubleValue());
                    } else {
                        protoReader.readUnknownField(nextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ValueAtQuantile redact(ValueAtQuantile valueAtQuantile) {
                Builder newBuilder = valueAtQuantile.newBuilder();
                newBuilder.clearUnknownFields();
                return newBuilder.build();
            }
        }
    }

    private static final class ProtoAdapter_SummaryDataPoint extends ProtoAdapter<SummaryDataPoint> {
        public ProtoAdapter_SummaryDataPoint() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) SummaryDataPoint.class, "type.googleapis.com/opentelemetry.proto.metrics.v1.SummaryDataPoint", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/metrics/v1/metrics.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(SummaryDataPoint summaryDataPoint) {
            int encodedSizeWithTag = KeyValue.ADAPTER.asRepeated().encodedSizeWithTag(7, summaryDataPoint.attributes);
            if (!Objects.equals(Long.valueOf(summaryDataPoint.start_time_unix_nano), 0L)) {
                encodedSizeWithTag += ProtoAdapter.FIXED64.encodedSizeWithTag(2, Long.valueOf(summaryDataPoint.start_time_unix_nano));
            }
            if (!Objects.equals(Long.valueOf(summaryDataPoint.time_unix_nano), 0L)) {
                encodedSizeWithTag += ProtoAdapter.FIXED64.encodedSizeWithTag(3, Long.valueOf(summaryDataPoint.time_unix_nano));
            }
            if (!Objects.equals(Long.valueOf(summaryDataPoint.count), 0L)) {
                encodedSizeWithTag += ProtoAdapter.FIXED64.encodedSizeWithTag(4, Long.valueOf(summaryDataPoint.count));
            }
            if (!Objects.equals(Double.valueOf(summaryDataPoint.sum), Double.valueOf(0.0d))) {
                encodedSizeWithTag += ProtoAdapter.DOUBLE.encodedSizeWithTag(5, Double.valueOf(summaryDataPoint.sum));
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + ValueAtQuantile.ADAPTER.asRepeated().encodedSizeWithTag(6, summaryDataPoint.quantile_values);
            if (!Objects.equals(Integer.valueOf(summaryDataPoint.flags), 0)) {
                encodedSizeWithTag2 += ProtoAdapter.UINT32.encodedSizeWithTag(8, Integer.valueOf(summaryDataPoint.flags));
            }
            return encodedSizeWithTag2 + summaryDataPoint.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, SummaryDataPoint summaryDataPoint) throws IOException {
            KeyValue.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, (int) summaryDataPoint.attributes);
            if (!Objects.equals(Long.valueOf(summaryDataPoint.start_time_unix_nano), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 2, (int) Long.valueOf(summaryDataPoint.start_time_unix_nano));
            }
            if (!Objects.equals(Long.valueOf(summaryDataPoint.time_unix_nano), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 3, (int) Long.valueOf(summaryDataPoint.time_unix_nano));
            }
            if (!Objects.equals(Long.valueOf(summaryDataPoint.count), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(protoWriter, 4, (int) Long.valueOf(summaryDataPoint.count));
            }
            if (!Objects.equals(Double.valueOf(summaryDataPoint.sum), Double.valueOf(0.0d))) {
                ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 5, (int) Double.valueOf(summaryDataPoint.sum));
            }
            ValueAtQuantile.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, (int) summaryDataPoint.quantile_values);
            if (!Objects.equals(Integer.valueOf(summaryDataPoint.flags), 0)) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 8, (int) Integer.valueOf(summaryDataPoint.flags));
            }
            protoWriter.writeBytes(summaryDataPoint.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, SummaryDataPoint summaryDataPoint) throws IOException {
            reverseProtoWriter.writeBytes(summaryDataPoint.unknownFields());
            if (!Objects.equals(Integer.valueOf(summaryDataPoint.flags), 0)) {
                ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 8, (int) Integer.valueOf(summaryDataPoint.flags));
            }
            ValueAtQuantile.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, (int) summaryDataPoint.quantile_values);
            if (!Objects.equals(Double.valueOf(summaryDataPoint.sum), Double.valueOf(0.0d))) {
                ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 5, (int) Double.valueOf(summaryDataPoint.sum));
            }
            if (!Objects.equals(Long.valueOf(summaryDataPoint.count), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(reverseProtoWriter, 4, (int) Long.valueOf(summaryDataPoint.count));
            }
            if (!Objects.equals(Long.valueOf(summaryDataPoint.time_unix_nano), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(reverseProtoWriter, 3, (int) Long.valueOf(summaryDataPoint.time_unix_nano));
            }
            if (!Objects.equals(Long.valueOf(summaryDataPoint.start_time_unix_nano), 0L)) {
                ProtoAdapter.FIXED64.encodeWithTag(reverseProtoWriter, 2, (int) Long.valueOf(summaryDataPoint.start_time_unix_nano));
            }
            KeyValue.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, (int) summaryDataPoint.attributes);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public SummaryDataPoint decode(ProtoReader protoReader) throws IOException {
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
                            builder.sum(ProtoAdapter.DOUBLE.decode(protoReader).doubleValue());
                            break;
                        case 6:
                            builder.quantile_values.add(ValueAtQuantile.ADAPTER.decode(protoReader));
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
        public SummaryDataPoint redact(SummaryDataPoint summaryDataPoint) {
            Builder newBuilder = summaryDataPoint.newBuilder();
            Internal.redactElements(newBuilder.attributes, KeyValue.ADAPTER);
            Internal.redactElements(newBuilder.quantile_values, ValueAtQuantile.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
