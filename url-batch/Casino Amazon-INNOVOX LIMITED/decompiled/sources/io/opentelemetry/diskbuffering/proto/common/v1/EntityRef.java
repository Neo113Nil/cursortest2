package io.opentelemetry.diskbuffering.proto.common.v1;

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
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class EntityRef extends Message<EntityRef, Builder> {
    public static final ProtoAdapter<EntityRef> ADAPTER = new ProtoAdapter_EntityRef();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "descriptionKeys", label = WireField.Label.REPEATED, tag = 4)
    public final List<String> description_keys;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "idKeys", label = WireField.Label.REPEATED, tag = 3)
    public final List<String> id_keys;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "schemaUrl", label = WireField.Label.OMIT_IDENTITY, tag = 1)
    public final String schema_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, tag = 2)
    public final String type;

    public EntityRef(String str, String str2, List<String> list, List<String> list2) {
        this(str, str2, list, list2, ByteString.EMPTY);
    }

    public EntityRef(String str, String str2, List<String> list, List<String> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        if (str == null) {
            throw new IllegalArgumentException("schema_url == null");
        }
        this.schema_url = str;
        if (str2 == null) {
            throw new IllegalArgumentException("type == null");
        }
        this.type = str2;
        this.id_keys = Internal.immutableCopyOf("id_keys", list);
        this.description_keys = Internal.immutableCopyOf("description_keys", list2);
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.schema_url = this.schema_url;
        builder.type = this.type;
        builder.id_keys = Internal.copyOf(this.id_keys);
        builder.description_keys = Internal.copyOf(this.description_keys);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EntityRef)) {
            return false;
        }
        EntityRef entityRef = (EntityRef) obj;
        return unknownFields().equals(entityRef.unknownFields()) && Internal.equals(this.schema_url, entityRef.schema_url) && Internal.equals(this.type, entityRef.type) && this.id_keys.equals(entityRef.id_keys) && this.description_keys.equals(entityRef.description_keys);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.schema_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.type;
        int hashCode3 = ((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37) + this.id_keys.hashCode()) * 37) + this.description_keys.hashCode();
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.schema_url != null) {
            sb.append(", schema_url=").append(Internal.sanitize(this.schema_url));
        }
        if (this.type != null) {
            sb.append(", type=").append(Internal.sanitize(this.type));
        }
        if (!this.id_keys.isEmpty()) {
            sb.append(", id_keys=").append(Internal.sanitize(this.id_keys));
        }
        if (!this.description_keys.isEmpty()) {
            sb.append(", description_keys=").append(Internal.sanitize(this.description_keys));
        }
        return sb.replace(0, 2, "EntityRef{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<EntityRef, Builder> {
        public String schema_url = "";
        public String type = "";
        public List<String> id_keys = Internal.newMutableList();
        public List<String> description_keys = Internal.newMutableList();

        public Builder schema_url(String str) {
            this.schema_url = str;
            return this;
        }

        public Builder type(String str) {
            this.type = str;
            return this;
        }

        public Builder id_keys(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.id_keys = list;
            return this;
        }

        public Builder description_keys(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.description_keys = list;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public EntityRef build() {
            return new EntityRef(this.schema_url, this.type, this.id_keys, this.description_keys, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_EntityRef extends ProtoAdapter<EntityRef> {
        public ProtoAdapter_EntityRef() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) EntityRef.class, "type.googleapis.com/opentelemetry.proto.common.v1.EntityRef", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/common/v1/common.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(EntityRef entityRef) {
            int encodedSizeWithTag = !Objects.equals(entityRef.schema_url, "") ? ProtoAdapter.STRING.encodedSizeWithTag(1, entityRef.schema_url) : 0;
            if (!Objects.equals(entityRef.type, "")) {
                encodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(2, entityRef.type);
            }
            return encodedSizeWithTag + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, entityRef.id_keys) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, entityRef.description_keys) + entityRef.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, EntityRef entityRef) throws IOException {
            if (!Objects.equals(entityRef.schema_url, "")) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, (int) entityRef.schema_url);
            }
            if (!Objects.equals(entityRef.type, "")) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, (int) entityRef.type);
            }
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, (int) entityRef.id_keys);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 4, (int) entityRef.description_keys);
            protoWriter.writeBytes(entityRef.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, EntityRef entityRef) throws IOException {
            reverseProtoWriter.writeBytes(entityRef.unknownFields());
            ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 4, (int) entityRef.description_keys);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 3, (int) entityRef.id_keys);
            if (!Objects.equals(entityRef.type, "")) {
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, (int) entityRef.type);
            }
            if (Objects.equals(entityRef.schema_url, "")) {
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, (int) entityRef.schema_url);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public EntityRef decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    builder.addUnknownFields(protoReader.endMessageAndGetUnknownFields(beginMessage));
                    return builder.build();
                }
                if (nextTag == 1) {
                    builder.schema_url(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.type(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.id_keys.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.description_keys.add(ProtoAdapter.STRING.decode(protoReader));
                } else {
                    protoReader.readUnknownField(nextTag);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public EntityRef redact(EntityRef entityRef) {
            Builder newBuilder = entityRef.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
