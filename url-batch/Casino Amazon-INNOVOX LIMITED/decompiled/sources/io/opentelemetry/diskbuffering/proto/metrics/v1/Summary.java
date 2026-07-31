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
public final class Summary extends Message<Summary, Builder> {
    public static final ProtoAdapter<Summary> ADAPTER = new ProtoAdapter_Summary();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.metrics.v1.SummaryDataPoint#ADAPTER", jsonName = "dataPoints", label = WireField.Label.REPEATED, tag = 1)
    public final List<SummaryDataPoint> data_points;

    public Summary(List<SummaryDataPoint> list) {
        this(list, ByteString.EMPTY);
    }

    public Summary(List<SummaryDataPoint> list, ByteString byteString) {
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
        if (!(obj instanceof Summary)) {
            return false;
        }
        Summary summary = (Summary) obj;
        return unknownFields().equals(summary.unknownFields()) && this.data_points.equals(summary.data_points);
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
        return sb.replace(0, 2, "Summary{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<Summary, Builder> {
        public List<SummaryDataPoint> data_points = Internal.newMutableList();

        public Builder data_points(List<SummaryDataPoint> list) {
            Internal.checkElementsNotNull(list);
            this.data_points = list;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Summary build() {
            return new Summary(this.data_points, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_Summary extends ProtoAdapter<Summary> {
        public ProtoAdapter_Summary() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) Summary.class, "type.googleapis.com/opentelemetry.proto.metrics.v1.Summary", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/metrics/v1/metrics.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Summary summary) {
            return SummaryDataPoint.ADAPTER.asRepeated().encodedSizeWithTag(1, summary.data_points) + summary.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Summary summary) throws IOException {
            SummaryDataPoint.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, (int) summary.data_points);
            protoWriter.writeBytes(summary.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, Summary summary) throws IOException {
            reverseProtoWriter.writeBytes(summary.unknownFields());
            SummaryDataPoint.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, (int) summary.data_points);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public Summary decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    builder.addUnknownFields(protoReader.endMessageAndGetUnknownFields(beginMessage));
                    return builder.build();
                }
                if (nextTag == 1) {
                    builder.data_points.add(SummaryDataPoint.ADAPTER.decode(protoReader));
                } else {
                    protoReader.readUnknownField(nextTag);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Summary redact(Summary summary) {
            Builder newBuilder = summary.newBuilder();
            Internal.redactElements(newBuilder.data_points, SummaryDataPoint.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
