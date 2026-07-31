package io.opentelemetry.diskbuffering.proto.collector.metrics.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import io.opentelemetry.diskbuffering.proto.metrics.v1.ResourceMetrics;
import java.io.IOException;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class ExportMetricsServiceRequest extends Message<ExportMetricsServiceRequest, Builder> {
    public static final ProtoAdapter<ExportMetricsServiceRequest> ADAPTER = new ProtoAdapter_ExportMetricsServiceRequest();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.metrics.v1.ResourceMetrics#ADAPTER", jsonName = "resourceMetrics", label = WireField.Label.REPEATED, tag = 1)
    public final List<ResourceMetrics> resource_metrics;

    public ExportMetricsServiceRequest(List<ResourceMetrics> list) {
        this(list, ByteString.EMPTY);
    }

    public ExportMetricsServiceRequest(List<ResourceMetrics> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource_metrics = Internal.immutableCopyOf("resource_metrics", list);
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.resource_metrics = Internal.copyOf(this.resource_metrics);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExportMetricsServiceRequest)) {
            return false;
        }
        ExportMetricsServiceRequest exportMetricsServiceRequest = (ExportMetricsServiceRequest) obj;
        return unknownFields().equals(exportMetricsServiceRequest.unknownFields()) && this.resource_metrics.equals(exportMetricsServiceRequest.resource_metrics);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (unknownFields().hashCode() * 37) + this.resource_metrics.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.resource_metrics.isEmpty()) {
            sb.append(", resource_metrics=").append(this.resource_metrics);
        }
        return sb.replace(0, 2, "ExportMetricsServiceRequest{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<ExportMetricsServiceRequest, Builder> {
        public List<ResourceMetrics> resource_metrics = Internal.newMutableList();

        public Builder resource_metrics(List<ResourceMetrics> list) {
            Internal.checkElementsNotNull(list);
            this.resource_metrics = list;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ExportMetricsServiceRequest build() {
            return new ExportMetricsServiceRequest(this.resource_metrics, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_ExportMetricsServiceRequest extends ProtoAdapter<ExportMetricsServiceRequest> {
        public ProtoAdapter_ExportMetricsServiceRequest() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) ExportMetricsServiceRequest.class, "type.googleapis.com/opentelemetry.proto.collector.metrics.v1.ExportMetricsServiceRequest", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/collector/metrics/v1/metrics_service.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(ExportMetricsServiceRequest exportMetricsServiceRequest) {
            return ResourceMetrics.ADAPTER.asRepeated().encodedSizeWithTag(1, exportMetricsServiceRequest.resource_metrics) + exportMetricsServiceRequest.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, ExportMetricsServiceRequest exportMetricsServiceRequest) throws IOException {
            ResourceMetrics.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, (int) exportMetricsServiceRequest.resource_metrics);
            protoWriter.writeBytes(exportMetricsServiceRequest.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, ExportMetricsServiceRequest exportMetricsServiceRequest) throws IOException {
            reverseProtoWriter.writeBytes(exportMetricsServiceRequest.unknownFields());
            ResourceMetrics.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, (int) exportMetricsServiceRequest.resource_metrics);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public ExportMetricsServiceRequest decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    builder.addUnknownFields(protoReader.endMessageAndGetUnknownFields(beginMessage));
                    return builder.build();
                }
                if (nextTag == 1) {
                    builder.resource_metrics.add(ResourceMetrics.ADAPTER.decode(protoReader));
                } else {
                    protoReader.readUnknownField(nextTag);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public ExportMetricsServiceRequest redact(ExportMetricsServiceRequest exportMetricsServiceRequest) {
            Builder newBuilder = exportMetricsServiceRequest.newBuilder();
            Internal.redactElements(newBuilder.resource_metrics, ResourceMetrics.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
