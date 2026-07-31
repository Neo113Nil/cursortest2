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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class Gauge extends Message<Gauge, Builder> {
    public static final ProtoAdapter<Gauge> ADAPTER = new ProtoAdapter_Gauge();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.metrics.v1.NumberDataPoint#ADAPTER", jsonName = "dataPoints", label = WireField.Label.REPEATED, tag = 1)
    public final List<NumberDataPoint> data_points;

    public Gauge(List<NumberDataPoint> list) {
        this(list, ByteString.EMPTY);
    }

    public Gauge(List<NumberDataPoint> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.data_points = Internal.immutableCopyOf("data_points", list);
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.data_points = Internal.copyOf(this.data_points);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Gauge)) {
            return false;
        }
        Gauge gauge = (Gauge) obj;
        return unknownFields().equals(gauge.unknownFields()) && this.data_points.equals(gauge.data_points);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (unknownFields().hashCode() * 37) + this.data_points.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.data_points.isEmpty()) {
            sb.append(", data_points=").append(this.data_points);
        }
        return sb.replace(0, 2, "Gauge{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<Gauge, Builder> {
        public List<NumberDataPoint> data_points = Internal.newMutableList();

        public Builder data_points(List<NumberDataPoint> list) {
            Internal.checkElementsNotNull(list);
            this.data_points = list;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Gauge build() {
            return new Gauge(this.data_points, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_Gauge extends ProtoAdapter<Gauge> {
        public ProtoAdapter_Gauge() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) Gauge.class, "type.googleapis.com/opentelemetry.proto.metrics.v1.Gauge", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/metrics/v1/metrics.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Gauge gauge) {
            return NumberDataPoint.ADAPTER.asRepeated().encodedSizeWithTag(1, gauge.data_points) + gauge.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Gauge gauge) throws IOException {
            NumberDataPoint.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, (int) gauge.data_points);
            protoWriter.writeBytes(gauge.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, Gauge gauge) throws IOException {
            reverseProtoWriter.writeBytes(gauge.unknownFields());
            NumberDataPoint.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, (int) gauge.data_points);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public Gauge decode(ProtoReader protoReader) throws IOException {
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
                } else {
                    protoReader.readUnknownField(nextTag);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Gauge redact(Gauge gauge) {
            Builder newBuilder = gauge.newBuilder();
            Internal.redactElements(newBuilder.data_points, NumberDataPoint.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
