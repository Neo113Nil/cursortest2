package io.opentelemetry.diskbuffering.proto.logs.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import io.opentelemetry.diskbuffering.proto.resource.v1.Resource;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class ResourceLogs extends Message<ResourceLogs, Builder> {
    public static final ProtoAdapter<ResourceLogs> ADAPTER = new ProtoAdapter_ResourceLogs();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.resource.v1.Resource#ADAPTER", label = WireField.Label.OMIT_IDENTITY, tag = 1)
    public final Resource resource;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "schemaUrl", label = WireField.Label.OMIT_IDENTITY, tag = 3)
    public final String schema_url;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.logs.v1.ScopeLogs#ADAPTER", jsonName = "scopeLogs", label = WireField.Label.REPEATED, tag = 2)
    public final List<ScopeLogs> scope_logs;

    public ResourceLogs(Resource resource, List<ScopeLogs> list, String str) {
        this(resource, list, str, ByteString.EMPTY);
    }

    public ResourceLogs(Resource resource, List<ScopeLogs> list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource = resource;
        this.scope_logs = Internal.immutableCopyOf("scope_logs", list);
        if (str == null) {
            throw new IllegalArgumentException("schema_url == null");
        }
        this.schema_url = str;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.resource = this.resource;
        builder.scope_logs = Internal.copyOf(this.scope_logs);
        builder.schema_url = this.schema_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResourceLogs)) {
            return false;
        }
        ResourceLogs resourceLogs = (ResourceLogs) obj;
        return unknownFields().equals(resourceLogs.unknownFields()) && Internal.equals(this.resource, resourceLogs.resource) && this.scope_logs.equals(resourceLogs.scope_logs) && Internal.equals(this.schema_url, resourceLogs.schema_url);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Resource resource = this.resource;
        int hashCode2 = (((hashCode + (resource != null ? resource.hashCode() : 0)) * 37) + this.scope_logs.hashCode()) * 37;
        String str = this.schema_url;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.resource != null) {
            sb.append(", resource=").append(this.resource);
        }
        if (!this.scope_logs.isEmpty()) {
            sb.append(", scope_logs=").append(this.scope_logs);
        }
        if (this.schema_url != null) {
            sb.append(", schema_url=").append(Internal.sanitize(this.schema_url));
        }
        return sb.replace(0, 2, "ResourceLogs{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<ResourceLogs, Builder> {
        public Resource resource;
        public List<ScopeLogs> scope_logs = Internal.newMutableList();
        public String schema_url = "";

        public Builder resource(Resource resource) {
            this.resource = resource;
            return this;
        }

        public Builder scope_logs(List<ScopeLogs> list) {
            Internal.checkElementsNotNull(list);
            this.scope_logs = list;
            return this;
        }

        public Builder schema_url(String str) {
            this.schema_url = str;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ResourceLogs build() {
            return new ResourceLogs(this.resource, this.scope_logs, this.schema_url, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_ResourceLogs extends ProtoAdapter<ResourceLogs> {
        public ProtoAdapter_ResourceLogs() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) ResourceLogs.class, "type.googleapis.com/opentelemetry.proto.logs.v1.ResourceLogs", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/logs/v1/logs.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(ResourceLogs resourceLogs) {
            int encodedSizeWithTag = (!Objects.equals(resourceLogs.resource, null) ? Resource.ADAPTER.encodedSizeWithTag(1, resourceLogs.resource) : 0) + ScopeLogs.ADAPTER.asRepeated().encodedSizeWithTag(2, resourceLogs.scope_logs);
            if (!Objects.equals(resourceLogs.schema_url, "")) {
                encodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(3, resourceLogs.schema_url);
            }
            return encodedSizeWithTag + resourceLogs.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, ResourceLogs resourceLogs) throws IOException {
            if (!Objects.equals(resourceLogs.resource, null)) {
                Resource.ADAPTER.encodeWithTag(protoWriter, 1, (int) resourceLogs.resource);
            }
            ScopeLogs.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, (int) resourceLogs.scope_logs);
            if (!Objects.equals(resourceLogs.schema_url, "")) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, (int) resourceLogs.schema_url);
            }
            protoWriter.writeBytes(resourceLogs.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, ResourceLogs resourceLogs) throws IOException {
            reverseProtoWriter.writeBytes(resourceLogs.unknownFields());
            if (!Objects.equals(resourceLogs.schema_url, "")) {
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, (int) resourceLogs.schema_url);
            }
            ScopeLogs.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, (int) resourceLogs.scope_logs);
            if (Objects.equals(resourceLogs.resource, null)) {
                return;
            }
            Resource.ADAPTER.encodeWithTag(reverseProtoWriter, 1, (int) resourceLogs.resource);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public ResourceLogs decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    builder.addUnknownFields(protoReader.endMessageAndGetUnknownFields(beginMessage));
                    return builder.build();
                }
                if (nextTag == 1) {
                    builder.resource(Resource.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.scope_logs.add(ScopeLogs.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.schema_url(ProtoAdapter.STRING.decode(protoReader));
                } else {
                    protoReader.readUnknownField(nextTag);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public ResourceLogs redact(ResourceLogs resourceLogs) {
            Builder newBuilder = resourceLogs.newBuilder();
            if (newBuilder.resource != null) {
                newBuilder.resource = Resource.ADAPTER.redact(newBuilder.resource);
            }
            Internal.redactElements(newBuilder.scope_logs, ScopeLogs.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
