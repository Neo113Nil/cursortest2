package io.opentelemetry.diskbuffering.proto.trace.v1;

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
public final class ResourceSpans extends Message<ResourceSpans, Builder> {
    public static final ProtoAdapter<ResourceSpans> ADAPTER = new ProtoAdapter_ResourceSpans();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.resource.v1.Resource#ADAPTER", label = WireField.Label.OMIT_IDENTITY, tag = 1)
    public final Resource resource;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "schemaUrl", label = WireField.Label.OMIT_IDENTITY, tag = 3)
    public final String schema_url;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.trace.v1.ScopeSpans#ADAPTER", jsonName = "scopeSpans", label = WireField.Label.REPEATED, tag = 2)
    public final List<ScopeSpans> scope_spans;

    public ResourceSpans(Resource resource, List<ScopeSpans> list, String str) {
        this(resource, list, str, ByteString.EMPTY);
    }

    public ResourceSpans(Resource resource, List<ScopeSpans> list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource = resource;
        this.scope_spans = Internal.immutableCopyOf("scope_spans", list);
        if (str == null) {
            throw new IllegalArgumentException("schema_url == null");
        }
        this.schema_url = str;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.resource = this.resource;
        builder.scope_spans = Internal.copyOf(this.scope_spans);
        builder.schema_url = this.schema_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResourceSpans)) {
            return false;
        }
        ResourceSpans resourceSpans = (ResourceSpans) obj;
        return unknownFields().equals(resourceSpans.unknownFields()) && Internal.equals(this.resource, resourceSpans.resource) && this.scope_spans.equals(resourceSpans.scope_spans) && Internal.equals(this.schema_url, resourceSpans.schema_url);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Resource resource = this.resource;
        int hashCode2 = (((hashCode + (resource != null ? resource.hashCode() : 0)) * 37) + this.scope_spans.hashCode()) * 37;
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
        if (!this.scope_spans.isEmpty()) {
            sb.append(", scope_spans=").append(this.scope_spans);
        }
        if (this.schema_url != null) {
            sb.append(", schema_url=").append(Internal.sanitize(this.schema_url));
        }
        return sb.replace(0, 2, "ResourceSpans{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<ResourceSpans, Builder> {
        public Resource resource;
        public List<ScopeSpans> scope_spans = Internal.newMutableList();
        public String schema_url = "";

        public Builder resource(Resource resource) {
            this.resource = resource;
            return this;
        }

        public Builder scope_spans(List<ScopeSpans> list) {
            Internal.checkElementsNotNull(list);
            this.scope_spans = list;
            return this;
        }

        public Builder schema_url(String str) {
            this.schema_url = str;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ResourceSpans build() {
            return new ResourceSpans(this.resource, this.scope_spans, this.schema_url, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_ResourceSpans extends ProtoAdapter<ResourceSpans> {
        public ProtoAdapter_ResourceSpans() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) ResourceSpans.class, "type.googleapis.com/opentelemetry.proto.trace.v1.ResourceSpans", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/trace/v1/trace.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(ResourceSpans resourceSpans) {
            int encodedSizeWithTag = (!Objects.equals(resourceSpans.resource, null) ? Resource.ADAPTER.encodedSizeWithTag(1, resourceSpans.resource) : 0) + ScopeSpans.ADAPTER.asRepeated().encodedSizeWithTag(2, resourceSpans.scope_spans);
            if (!Objects.equals(resourceSpans.schema_url, "")) {
                encodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(3, resourceSpans.schema_url);
            }
            return encodedSizeWithTag + resourceSpans.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, ResourceSpans resourceSpans) throws IOException {
            if (!Objects.equals(resourceSpans.resource, null)) {
                Resource.ADAPTER.encodeWithTag(protoWriter, 1, (int) resourceSpans.resource);
            }
            ScopeSpans.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, (int) resourceSpans.scope_spans);
            if (!Objects.equals(resourceSpans.schema_url, "")) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, (int) resourceSpans.schema_url);
            }
            protoWriter.writeBytes(resourceSpans.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, ResourceSpans resourceSpans) throws IOException {
            reverseProtoWriter.writeBytes(resourceSpans.unknownFields());
            if (!Objects.equals(resourceSpans.schema_url, "")) {
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, (int) resourceSpans.schema_url);
            }
            ScopeSpans.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, (int) resourceSpans.scope_spans);
            if (Objects.equals(resourceSpans.resource, null)) {
                return;
            }
            Resource.ADAPTER.encodeWithTag(reverseProtoWriter, 1, (int) resourceSpans.resource);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public ResourceSpans decode(ProtoReader protoReader) throws IOException {
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
                    builder.scope_spans.add(ScopeSpans.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.schema_url(ProtoAdapter.STRING.decode(protoReader));
                } else {
                    protoReader.readUnknownField(nextTag);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public ResourceSpans redact(ResourceSpans resourceSpans) {
            Builder newBuilder = resourceSpans.newBuilder();
            if (newBuilder.resource != null) {
                newBuilder.resource = Resource.ADAPTER.redact(newBuilder.resource);
            }
            Internal.redactElements(newBuilder.scope_spans, ScopeSpans.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
