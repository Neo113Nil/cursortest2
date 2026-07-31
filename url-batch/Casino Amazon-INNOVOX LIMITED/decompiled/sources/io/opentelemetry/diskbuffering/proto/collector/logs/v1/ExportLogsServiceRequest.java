package io.opentelemetry.diskbuffering.proto.collector.logs.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import io.opentelemetry.diskbuffering.proto.logs.v1.ResourceLogs;
import java.io.IOException;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class ExportLogsServiceRequest extends Message<ExportLogsServiceRequest, Builder> {
    public static final ProtoAdapter<ExportLogsServiceRequest> ADAPTER = new ProtoAdapter_ExportLogsServiceRequest();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.logs.v1.ResourceLogs#ADAPTER", jsonName = "resourceLogs", label = WireField.Label.REPEATED, tag = 1)
    public final List<ResourceLogs> resource_logs;

    public ExportLogsServiceRequest(List<ResourceLogs> list) {
        this(list, ByteString.EMPTY);
    }

    public ExportLogsServiceRequest(List<ResourceLogs> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource_logs = Internal.immutableCopyOf("resource_logs", list);
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.resource_logs = Internal.copyOf(this.resource_logs);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExportLogsServiceRequest)) {
            return false;
        }
        ExportLogsServiceRequest exportLogsServiceRequest = (ExportLogsServiceRequest) obj;
        return unknownFields().equals(exportLogsServiceRequest.unknownFields()) && this.resource_logs.equals(exportLogsServiceRequest.resource_logs);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (unknownFields().hashCode() * 37) + this.resource_logs.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.resource_logs.isEmpty()) {
            sb.append(", resource_logs=").append(this.resource_logs);
        }
        return sb.replace(0, 2, "ExportLogsServiceRequest{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<ExportLogsServiceRequest, Builder> {
        public List<ResourceLogs> resource_logs = Internal.newMutableList();

        public Builder resource_logs(List<ResourceLogs> list) {
            Internal.checkElementsNotNull(list);
            this.resource_logs = list;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ExportLogsServiceRequest build() {
            return new ExportLogsServiceRequest(this.resource_logs, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_ExportLogsServiceRequest extends ProtoAdapter<ExportLogsServiceRequest> {
        public ProtoAdapter_ExportLogsServiceRequest() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) ExportLogsServiceRequest.class, "type.googleapis.com/opentelemetry.proto.collector.logs.v1.ExportLogsServiceRequest", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/collector/logs/v1/logs_service.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(ExportLogsServiceRequest exportLogsServiceRequest) {
            return ResourceLogs.ADAPTER.asRepeated().encodedSizeWithTag(1, exportLogsServiceRequest.resource_logs) + exportLogsServiceRequest.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, ExportLogsServiceRequest exportLogsServiceRequest) throws IOException {
            ResourceLogs.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, (int) exportLogsServiceRequest.resource_logs);
            protoWriter.writeBytes(exportLogsServiceRequest.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, ExportLogsServiceRequest exportLogsServiceRequest) throws IOException {
            reverseProtoWriter.writeBytes(exportLogsServiceRequest.unknownFields());
            ResourceLogs.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, (int) exportLogsServiceRequest.resource_logs);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public ExportLogsServiceRequest decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    builder.addUnknownFields(protoReader.endMessageAndGetUnknownFields(beginMessage));
                    return builder.build();
                }
                if (nextTag == 1) {
                    builder.resource_logs.add(ResourceLogs.ADAPTER.decode(protoReader));
                } else {
                    protoReader.readUnknownField(nextTag);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public ExportLogsServiceRequest redact(ExportLogsServiceRequest exportLogsServiceRequest) {
            Builder newBuilder = exportLogsServiceRequest.newBuilder();
            Internal.redactElements(newBuilder.resource_logs, ResourceLogs.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
