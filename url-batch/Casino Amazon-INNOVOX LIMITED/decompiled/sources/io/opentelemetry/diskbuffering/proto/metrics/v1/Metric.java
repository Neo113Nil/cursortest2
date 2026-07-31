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
public final class Metric extends Message<Metric, Builder> {
    public static final ProtoAdapter<Metric> ADAPTER = new ProtoAdapter_Metric();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, tag = 2)
    public final String description;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.metrics.v1.ExponentialHistogram#ADAPTER", jsonName = "exponentialHistogram", oneofName = "data", tag = 10)
    public final ExponentialHistogram exponential_histogram;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.metrics.v1.Gauge#ADAPTER", oneofName = "data", tag = 5)
    public final Gauge gauge;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.metrics.v1.Histogram#ADAPTER", oneofName = "data", tag = 9)
    public final Histogram histogram;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.common.v1.KeyValue#ADAPTER", label = WireField.Label.REPEATED, tag = 12)
    public final List<KeyValue> metadata;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, tag = 1)
    public final String name;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.metrics.v1.Sum#ADAPTER", oneofName = "data", tag = 7)
    public final Sum sum;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.metrics.v1.Summary#ADAPTER", oneofName = "data", tag = 11)
    public final Summary summary;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, tag = 3)
    public final String unit;

    public Metric(String str, String str2, String str3, List<KeyValue> list, Gauge gauge, Sum sum, Histogram histogram, ExponentialHistogram exponentialHistogram, Summary summary) {
        this(str, str2, str3, list, gauge, sum, histogram, exponentialHistogram, summary, ByteString.EMPTY);
    }

    public Metric(String str, String str2, String str3, List<KeyValue> list, Gauge gauge, Sum sum, Histogram histogram, ExponentialHistogram exponentialHistogram, Summary summary, ByteString byteString) {
        super(ADAPTER, byteString);
        if (Internal.countNonNull(gauge, sum, histogram, exponentialHistogram, summary) > 1) {
            throw new IllegalArgumentException("at most one of gauge, sum, histogram, exponential_histogram, summary may be non-null");
        }
        if (str == null) {
            throw new IllegalArgumentException("name == null");
        }
        this.name = str;
        if (str2 == null) {
            throw new IllegalArgumentException("description == null");
        }
        this.description = str2;
        if (str3 == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.unit = str3;
        this.metadata = Internal.immutableCopyOf("metadata", list);
        this.gauge = gauge;
        this.sum = sum;
        this.histogram = histogram;
        this.exponential_histogram = exponentialHistogram;
        this.summary = summary;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.description = this.description;
        builder.unit = this.unit;
        builder.metadata = Internal.copyOf(this.metadata);
        builder.gauge = this.gauge;
        builder.sum = this.sum;
        builder.histogram = this.histogram;
        builder.exponential_histogram = this.exponential_histogram;
        builder.summary = this.summary;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Metric)) {
            return false;
        }
        Metric metric = (Metric) obj;
        return unknownFields().equals(metric.unknownFields()) && Internal.equals(this.name, metric.name) && Internal.equals(this.description, metric.description) && Internal.equals(this.unit, metric.unit) && this.metadata.equals(metric.metadata) && Internal.equals(this.gauge, metric.gauge) && Internal.equals(this.sum, metric.sum) && Internal.equals(this.histogram, metric.histogram) && Internal.equals(this.exponential_histogram, metric.exponential_histogram) && Internal.equals(this.summary, metric.summary);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.unit;
        int hashCode4 = (((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37) + this.metadata.hashCode()) * 37;
        Gauge gauge = this.gauge;
        int hashCode5 = (hashCode4 + (gauge != null ? gauge.hashCode() : 0)) * 37;
        Sum sum = this.sum;
        int hashCode6 = (hashCode5 + (sum != null ? sum.hashCode() : 0)) * 37;
        Histogram histogram = this.histogram;
        int hashCode7 = (hashCode6 + (histogram != null ? histogram.hashCode() : 0)) * 37;
        ExponentialHistogram exponentialHistogram = this.exponential_histogram;
        int hashCode8 = (hashCode7 + (exponentialHistogram != null ? exponentialHistogram.hashCode() : 0)) * 37;
        Summary summary = this.summary;
        int hashCode9 = hashCode8 + (summary != null ? summary.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=").append(Internal.sanitize(this.name));
        }
        if (this.description != null) {
            sb.append(", description=").append(Internal.sanitize(this.description));
        }
        if (this.unit != null) {
            sb.append(", unit=").append(Internal.sanitize(this.unit));
        }
        if (!this.metadata.isEmpty()) {
            sb.append(", metadata=").append(this.metadata);
        }
        if (this.gauge != null) {
            sb.append(", gauge=").append(this.gauge);
        }
        if (this.sum != null) {
            sb.append(", sum=").append(this.sum);
        }
        if (this.histogram != null) {
            sb.append(", histogram=").append(this.histogram);
        }
        if (this.exponential_histogram != null) {
            sb.append(", exponential_histogram=").append(this.exponential_histogram);
        }
        if (this.summary != null) {
            sb.append(", summary=").append(this.summary);
        }
        return sb.replace(0, 2, "Metric{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<Metric, Builder> {
        public ExponentialHistogram exponential_histogram;
        public Gauge gauge;
        public Histogram histogram;
        public Sum sum;
        public Summary summary;
        public String name = "";
        public String description = "";
        public String unit = "";
        public List<KeyValue> metadata = Internal.newMutableList();

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder description(String str) {
            this.description = str;
            return this;
        }

        public Builder unit(String str) {
            this.unit = str;
            return this;
        }

        public Builder metadata(List<KeyValue> list) {
            Internal.checkElementsNotNull(list);
            this.metadata = list;
            return this;
        }

        public Builder gauge(Gauge gauge) {
            this.gauge = gauge;
            this.sum = null;
            this.histogram = null;
            this.exponential_histogram = null;
            this.summary = null;
            return this;
        }

        public Builder sum(Sum sum) {
            this.sum = sum;
            this.gauge = null;
            this.histogram = null;
            this.exponential_histogram = null;
            this.summary = null;
            return this;
        }

        public Builder histogram(Histogram histogram) {
            this.histogram = histogram;
            this.gauge = null;
            this.sum = null;
            this.exponential_histogram = null;
            this.summary = null;
            return this;
        }

        public Builder exponential_histogram(ExponentialHistogram exponentialHistogram) {
            this.exponential_histogram = exponentialHistogram;
            this.gauge = null;
            this.sum = null;
            this.histogram = null;
            this.summary = null;
            return this;
        }

        public Builder summary(Summary summary) {
            this.summary = summary;
            this.gauge = null;
            this.sum = null;
            this.histogram = null;
            this.exponential_histogram = null;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Metric build() {
            return new Metric(this.name, this.description, this.unit, this.metadata, this.gauge, this.sum, this.histogram, this.exponential_histogram, this.summary, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_Metric extends ProtoAdapter<Metric> {
        public ProtoAdapter_Metric() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) Metric.class, "type.googleapis.com/opentelemetry.proto.metrics.v1.Metric", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/metrics/v1/metrics.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Metric metric) {
            int encodedSizeWithTag = !Objects.equals(metric.name, "") ? ProtoAdapter.STRING.encodedSizeWithTag(1, metric.name) : 0;
            if (!Objects.equals(metric.description, "")) {
                encodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(2, metric.description);
            }
            if (!Objects.equals(metric.unit, "")) {
                encodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(3, metric.unit);
            }
            return encodedSizeWithTag + KeyValue.ADAPTER.asRepeated().encodedSizeWithTag(12, metric.metadata) + Gauge.ADAPTER.encodedSizeWithTag(5, metric.gauge) + Sum.ADAPTER.encodedSizeWithTag(7, metric.sum) + Histogram.ADAPTER.encodedSizeWithTag(9, metric.histogram) + ExponentialHistogram.ADAPTER.encodedSizeWithTag(10, metric.exponential_histogram) + Summary.ADAPTER.encodedSizeWithTag(11, metric.summary) + metric.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Metric metric) throws IOException {
            if (!Objects.equals(metric.name, "")) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, (int) metric.name);
            }
            if (!Objects.equals(metric.description, "")) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, (int) metric.description);
            }
            if (!Objects.equals(metric.unit, "")) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, (int) metric.unit);
            }
            KeyValue.ADAPTER.asRepeated().encodeWithTag(protoWriter, 12, (int) metric.metadata);
            Gauge.ADAPTER.encodeWithTag(protoWriter, 5, (int) metric.gauge);
            Sum.ADAPTER.encodeWithTag(protoWriter, 7, (int) metric.sum);
            Histogram.ADAPTER.encodeWithTag(protoWriter, 9, (int) metric.histogram);
            ExponentialHistogram.ADAPTER.encodeWithTag(protoWriter, 10, (int) metric.exponential_histogram);
            Summary.ADAPTER.encodeWithTag(protoWriter, 11, (int) metric.summary);
            protoWriter.writeBytes(metric.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, Metric metric) throws IOException {
            reverseProtoWriter.writeBytes(metric.unknownFields());
            Summary.ADAPTER.encodeWithTag(reverseProtoWriter, 11, (int) metric.summary);
            ExponentialHistogram.ADAPTER.encodeWithTag(reverseProtoWriter, 10, (int) metric.exponential_histogram);
            Histogram.ADAPTER.encodeWithTag(reverseProtoWriter, 9, (int) metric.histogram);
            Sum.ADAPTER.encodeWithTag(reverseProtoWriter, 7, (int) metric.sum);
            Gauge.ADAPTER.encodeWithTag(reverseProtoWriter, 5, (int) metric.gauge);
            KeyValue.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 12, (int) metric.metadata);
            if (!Objects.equals(metric.unit, "")) {
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, (int) metric.unit);
            }
            if (!Objects.equals(metric.description, "")) {
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, (int) metric.description);
            }
            if (Objects.equals(metric.name, "")) {
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, (int) metric.name);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public Metric decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.name(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.description(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.unit(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                        case 6:
                        case 8:
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                        case 5:
                            builder.gauge(Gauge.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            builder.sum(Sum.ADAPTER.decode(protoReader));
                            break;
                        case 9:
                            builder.histogram(Histogram.ADAPTER.decode(protoReader));
                            break;
                        case 10:
                            builder.exponential_histogram(ExponentialHistogram.ADAPTER.decode(protoReader));
                            break;
                        case 11:
                            builder.summary(Summary.ADAPTER.decode(protoReader));
                            break;
                        case 12:
                            builder.metadata.add(KeyValue.ADAPTER.decode(protoReader));
                            break;
                    }
                } else {
                    builder.addUnknownFields(protoReader.endMessageAndGetUnknownFields(beginMessage));
                    return builder.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Metric redact(Metric metric) {
            Builder newBuilder = metric.newBuilder();
            Internal.redactElements(newBuilder.metadata, KeyValue.ADAPTER);
            if (newBuilder.gauge != null) {
                newBuilder.gauge = Gauge.ADAPTER.redact(newBuilder.gauge);
            }
            if (newBuilder.sum != null) {
                newBuilder.sum = Sum.ADAPTER.redact(newBuilder.sum);
            }
            if (newBuilder.histogram != null) {
                newBuilder.histogram = Histogram.ADAPTER.redact(newBuilder.histogram);
            }
            if (newBuilder.exponential_histogram != null) {
                newBuilder.exponential_histogram = ExponentialHistogram.ADAPTER.redact(newBuilder.exponential_histogram);
            }
            if (newBuilder.summary != null) {
                newBuilder.summary = Summary.ADAPTER.redact(newBuilder.summary);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
