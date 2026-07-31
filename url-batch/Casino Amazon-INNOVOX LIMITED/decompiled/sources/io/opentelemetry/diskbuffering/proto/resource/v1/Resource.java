package io.opentelemetry.diskbuffering.proto.resource.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import io.opentelemetry.diskbuffering.proto.common.v1.EntityRef;
import io.opentelemetry.diskbuffering.proto.common.v1.KeyValue;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class Resource extends Message<Resource, Builder> {
    public static final ProtoAdapter<Resource> ADAPTER = new ProtoAdapter_Resource();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.common.v1.KeyValue#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<KeyValue> attributes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "droppedAttributesCount", label = WireField.Label.OMIT_IDENTITY, tag = 2)
    public final int dropped_attributes_count;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.common.v1.EntityRef#ADAPTER", jsonName = "entityRefs", label = WireField.Label.REPEATED, tag = 3)
    public final List<EntityRef> entity_refs;

    public Resource(List<KeyValue> list, int i, List<EntityRef> list2) {
        this(list, i, list2, ByteString.EMPTY);
    }

    public Resource(List<KeyValue> list, int i, List<EntityRef> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.attributes = Internal.immutableCopyOf("attributes", list);
        this.dropped_attributes_count = i;
        this.entity_refs = Internal.immutableCopyOf("entity_refs", list2);
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.attributes = Internal.copyOf(this.attributes);
        builder.dropped_attributes_count = this.dropped_attributes_count;
        builder.entity_refs = Internal.copyOf(this.entity_refs);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Resource)) {
            return false;
        }
        Resource resource = (Resource) obj;
        return unknownFields().equals(resource.unknownFields()) && this.attributes.equals(resource.attributes) && Internal.equals(Integer.valueOf(this.dropped_attributes_count), Integer.valueOf(resource.dropped_attributes_count)) && this.entity_refs.equals(resource.entity_refs);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (((((unknownFields().hashCode() * 37) + this.attributes.hashCode()) * 37) + Integer.hashCode(this.dropped_attributes_count)) * 37) + this.entity_refs.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.attributes.isEmpty()) {
            sb.append(", attributes=").append(this.attributes);
        }
        sb.append(", dropped_attributes_count=").append(this.dropped_attributes_count);
        if (!this.entity_refs.isEmpty()) {
            sb.append(", entity_refs=").append(this.entity_refs);
        }
        return sb.replace(0, 2, "Resource{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<Resource, Builder> {
        public List<KeyValue> attributes = Internal.newMutableList();
        public int dropped_attributes_count = 0;
        public List<EntityRef> entity_refs = Internal.newMutableList();

        public Builder attributes(List<KeyValue> list) {
            Internal.checkElementsNotNull(list);
            this.attributes = list;
            return this;
        }

        public Builder dropped_attributes_count(int i) {
            this.dropped_attributes_count = i;
            return this;
        }

        public Builder entity_refs(List<EntityRef> list) {
            Internal.checkElementsNotNull(list);
            this.entity_refs = list;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Resource build() {
            return new Resource(this.attributes, this.dropped_attributes_count, this.entity_refs, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_Resource extends ProtoAdapter<Resource> {
        public ProtoAdapter_Resource() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) Resource.class, "type.googleapis.com/opentelemetry.proto.resource.v1.Resource", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/resource/v1/resource.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(Resource resource) {
            int encodedSizeWithTag = KeyValue.ADAPTER.asRepeated().encodedSizeWithTag(1, resource.attributes);
            if (!Objects.equals(Integer.valueOf(resource.dropped_attributes_count), 0)) {
                encodedSizeWithTag += ProtoAdapter.UINT32.encodedSizeWithTag(2, Integer.valueOf(resource.dropped_attributes_count));
            }
            return encodedSizeWithTag + EntityRef.ADAPTER.asRepeated().encodedSizeWithTag(3, resource.entity_refs) + resource.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Resource resource) throws IOException {
            KeyValue.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, (int) resource.attributes);
            if (!Objects.equals(Integer.valueOf(resource.dropped_attributes_count), 0)) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 2, (int) Integer.valueOf(resource.dropped_attributes_count));
            }
            EntityRef.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, (int) resource.entity_refs);
            protoWriter.writeBytes(resource.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, Resource resource) throws IOException {
            reverseProtoWriter.writeBytes(resource.unknownFields());
            EntityRef.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, (int) resource.entity_refs);
            if (!Objects.equals(Integer.valueOf(resource.dropped_attributes_count), 0)) {
                ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 2, (int) Integer.valueOf(resource.dropped_attributes_count));
            }
            KeyValue.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, (int) resource.attributes);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public Resource decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    builder.addUnknownFields(protoReader.endMessageAndGetUnknownFields(beginMessage));
                    return builder.build();
                }
                if (nextTag == 1) {
                    builder.attributes.add(KeyValue.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.dropped_attributes_count(ProtoAdapter.UINT32.decode(protoReader).intValue());
                } else if (nextTag == 3) {
                    builder.entity_refs.add(EntityRef.ADAPTER.decode(protoReader));
                } else {
                    protoReader.readUnknownField(nextTag);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public Resource redact(Resource resource) {
            Builder newBuilder = resource.newBuilder();
            Internal.redactElements(newBuilder.attributes, KeyValue.ADAPTER);
            Internal.redactElements(newBuilder.entity_refs, EntityRef.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
