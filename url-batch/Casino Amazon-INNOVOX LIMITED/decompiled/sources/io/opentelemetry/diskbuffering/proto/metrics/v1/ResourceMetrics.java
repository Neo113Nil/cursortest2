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
import io.opentelemetry.diskbuffering.proto.resource.v1.Resource;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class ResourceMetrics extends Message<ResourceMetrics, Builder> {
    public static final ProtoAdapter<ResourceMetrics> ADAPTER = new ProtoAdapter_ResourceMetrics();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.resource.v1.Resource#ADAPTER", label = WireField.Label.OMIT_IDENTITY, tag = 1)
    public final Resource resource;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "schemaUrl", label = WireField.Label.OMIT_IDENTITY, tag = 3)
    public final String schema_url;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.metrics.v1.ScopeMetrics#ADAPTER", jsonName = "scopeMetrics", label = WireField.Label.REPEATED, tag = 2)
    public final List<ScopeMetrics> scope_metrics;

    public ResourceMetrics(Resource resource, List<ScopeMetrics> list, String str) {
        this(resource, list, str, ByteString.EMPTY);
    }

    public ResourceMetrics(Resource resource, List<ScopeMetrics> list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource = resource;
        this.scope_metrics = Internal.immutableCopyOf("scope_metrics", list);
        if (str == null) {
            throw new IllegalArgumentException("schema_url == null");
        }
        this.schema_url = str;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.resource = this.resource;
        builder.scope_metrics = Internal.copyOf(this.scope_metrics);
        builder.schema_url = this.schema_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResourceMetrics)) {
            return false;
        }
        ResourceMetrics resourceMetrics = (ResourceMetrics) obj;
        return unknownFields().equals(resourceMetrics.unknownFields()) && Internal.equals(this.resource, resourceMetrics.resource) && this.scope_metrics.equals(resourceMetrics.scope_metrics) && Internal.equals(this.schema_url, resourceMetrics.schema_url);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Resource resource = this.resource;
        int hashCode2 = (((hashCode + (resource != null ? resource.hashCode() : 0)) * 37) + this.scope_metrics.hashCode()) * 37;
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
        if (!this.scope_metrics.isEmpty()) {
            sb.append(", scope_metrics=").append(this.scope_metrics);
        }
        if (this.schema_url != null) {
            sb.append(", schema_url=").append(Internal.sanitize(this.schema_url));
        }
        return sb.replace(0, 2, "ResourceMetrics{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<ResourceMetrics, Builder> {
        public Resource resource;
        public List<ScopeMetrics> scope_metrics = Internal.newMutableList();
        public String schema_url = "";

        public Builder resource(Resource resource) {
            this.resource = resource;
            return this;
        }

        public Builder scope_metrics(List<ScopeMetrics> list) {
            Internal.checkElementsNotNull(list);
            this.scope_metrics = list;
            return this;
        }

        public Builder schema_url(String str) {
            this.schema_url = str;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ResourceMetrics build() {
            return new ResourceMetrics(this.resource, this.scope_metrics, this.schema_url, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_ResourceMetrics extends ProtoAdapter<ResourceMetrics> {
        public ProtoAdapter_ResourceMetrics() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) ResourceMetrics.class, "type.googleapis.com/opentelemetry.proto.metrics.v1.ResourceMetrics", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/metrics/v1/metrics.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(ResourceMetrics resourceMetrics) {
            int encodedSizeWithTag = (!Objects.equals(resourceMetrics.resource, null) ? Resource.ADAPTER.encodedSizeWithTag(1, resourceMetrics.resource) : 0) + ScopeMetrics.ADAPTER.asRepeated().encodedSizeWithTag(2, resourceMetrics.scope_metrics);
            if (!Objects.equals(resourceMetrics.schema_url, "")) {
                encodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(3, resourceMetrics.schema_url);
            }
            return encodedSizeWithTag + resourceMetrics.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, ResourceMetrics resourceMetrics) throws IOException {
            if (!Objects.equals(resourceMetrics.resource, null)) {
                Resource.ADAPTER.encodeWithTag(protoWriter, 1, (int) resourceMetrics.resource);
            }
            ScopeMetrics.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, (int) resourceMetrics.scope_metrics);
            if (!Objects.equals(resourceMetrics.schema_url, "")) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, (int) resourceMetrics.schema_url);
            }
            protoWriter.writeBytes(resourceMetrics.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, ResourceMetrics resourceMetrics) throws IOException {
            reverseProtoWriter.writeBytes(resourceMetrics.unknownFields());
            if (!Objects.equals(resourceMetrics.schema_url, "")) {
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, (int) resourceMetrics.schema_url);
            }
            ScopeMetrics.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, (int) resourceMetrics.scope_metrics);
            if (Objects.equals(resourceMetrics.resource, null)) {
                return;
            }
            Resource.ADAPTER.encodeWithTag(reverseProtoWriter, 1, (int) resourceMetrics.resource);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public ResourceMetrics decode(ProtoReader protoReader) throws IOException {
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
                    builder.scope_metrics.add(ScopeMetrics.ADAPTER.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.schema_url(ProtoAdapter.STRING.decode(protoReader));
                } else {
                    protoReader.readUnknownField(nextTag);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public ResourceMetrics redact(ResourceMetrics resourceMetrics) {
            Builder newBuilder = resourceMetrics.newBuilder();
            if (newBuilder.resource != null) {
                newBuilder.resource = Resource.ADAPTER.redact(newBuilder.resource);
            }
            Internal.redactElements(newBuilder.scope_metrics, ScopeMetrics.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
