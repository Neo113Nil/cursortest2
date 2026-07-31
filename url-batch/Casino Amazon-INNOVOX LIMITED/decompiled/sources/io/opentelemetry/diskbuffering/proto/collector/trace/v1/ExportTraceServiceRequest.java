package io.opentelemetry.diskbuffering.proto.collector.trace.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import io.opentelemetry.diskbuffering.proto.trace.v1.ResourceSpans;
import java.io.IOException;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class ExportTraceServiceRequest extends Message<ExportTraceServiceRequest, Builder> {
    public static final ProtoAdapter<ExportTraceServiceRequest> ADAPTER = new ProtoAdapter_ExportTraceServiceRequest();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.trace.v1.ResourceSpans#ADAPTER", jsonName = "resourceSpans", label = WireField.Label.REPEATED, tag = 1)
    public final List<ResourceSpans> resource_spans;

    public ExportTraceServiceRequest(List<ResourceSpans> list) {
        this(list, ByteString.EMPTY);
    }

    public ExportTraceServiceRequest(List<ResourceSpans> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource_spans = Internal.immutableCopyOf("resource_spans", list);
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.resource_spans = Internal.copyOf(this.resource_spans);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExportTraceServiceRequest)) {
            return false;
        }
        ExportTraceServiceRequest exportTraceServiceRequest = (ExportTraceServiceRequest) obj;
        return unknownFields().equals(exportTraceServiceRequest.unknownFields()) && this.resource_spans.equals(exportTraceServiceRequest.resource_spans);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (unknownFields().hashCode() * 37) + this.resource_spans.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.resource_spans.isEmpty()) {
            sb.append(", resource_spans=").append(this.resource_spans);
        }
        return sb.replace(0, 2, "ExportTraceServiceRequest{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<ExportTraceServiceRequest, Builder> {
        public List<ResourceSpans> resource_spans = Internal.newMutableList();

        public Builder resource_spans(List<ResourceSpans> list) {
            Internal.checkElementsNotNull(list);
            this.resource_spans = list;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ExportTraceServiceRequest build() {
            return new ExportTraceServiceRequest(this.resource_spans, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_ExportTraceServiceRequest extends ProtoAdapter<ExportTraceServiceRequest> {
        public ProtoAdapter_ExportTraceServiceRequest() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) ExportTraceServiceRequest.class, "type.googleapis.com/opentelemetry.proto.collector.trace.v1.ExportTraceServiceRequest", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/collector/trace/v1/trace_service.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(ExportTraceServiceRequest exportTraceServiceRequest) {
            return ResourceSpans.ADAPTER.asRepeated().encodedSizeWithTag(1, exportTraceServiceRequest.resource_spans) + exportTraceServiceRequest.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, ExportTraceServiceRequest exportTraceServiceRequest) throws IOException {
            ResourceSpans.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, (int) exportTraceServiceRequest.resource_spans);
            protoWriter.writeBytes(exportTraceServiceRequest.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, ExportTraceServiceRequest exportTraceServiceRequest) throws IOException {
            reverseProtoWriter.writeBytes(exportTraceServiceRequest.unknownFields());
            ResourceSpans.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, (int) exportTraceServiceRequest.resource_spans);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public ExportTraceServiceRequest decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    builder.addUnknownFields(protoReader.endMessageAndGetUnknownFields(beginMessage));
                    return builder.build();
                }
                if (nextTag == 1) {
                    builder.resource_spans.add(ResourceSpans.ADAPTER.decode(protoReader));
                } else {
                    protoReader.readUnknownField(nextTag);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public ExportTraceServiceRequest redact(ExportTraceServiceRequest exportTraceServiceRequest) {
            Builder newBuilder = exportTraceServiceRequest.newBuilder();
            Internal.redactElements(newBuilder.resource_spans, ResourceSpans.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
