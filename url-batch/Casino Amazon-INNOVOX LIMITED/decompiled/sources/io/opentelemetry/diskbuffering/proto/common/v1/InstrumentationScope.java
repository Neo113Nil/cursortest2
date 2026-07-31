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
public final class InstrumentationScope extends Message<InstrumentationScope, Builder> {
    public static final ProtoAdapter<InstrumentationScope> ADAPTER = new ProtoAdapter_InstrumentationScope();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.common.v1.KeyValue#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public final List<KeyValue> attributes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", jsonName = "droppedAttributesCount", label = WireField.Label.OMIT_IDENTITY, tag = 4)
    public final int dropped_attributes_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, tag = 1)
    public final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, tag = 2)
    public final String version;

    public InstrumentationScope(String str, String str2, List<KeyValue> list, int i) {
        this(str, str2, list, i, ByteString.EMPTY);
    }

    public InstrumentationScope(String str, String str2, List<KeyValue> list, int i, ByteString byteString) {
        super(ADAPTER, byteString);
        if (str == null) {
            throw new IllegalArgumentException("name == null");
        }
        this.name = str;
        if (str2 == null) {
            throw new IllegalArgumentException("version == null");
        }
        this.version = str2;
        this.attributes = Internal.immutableCopyOf("attributes", list);
        this.dropped_attributes_count = i;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.version = this.version;
        builder.attributes = Internal.copyOf(this.attributes);
        builder.dropped_attributes_count = this.dropped_attributes_count;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstrumentationScope)) {
            return false;
        }
        InstrumentationScope instrumentationScope = (InstrumentationScope) obj;
        return unknownFields().equals(instrumentationScope.unknownFields()) && Internal.equals(this.name, instrumentationScope.name) && Internal.equals(this.version, instrumentationScope.version) && this.attributes.equals(instrumentationScope.attributes) && Internal.equals(Integer.valueOf(this.dropped_attributes_count), Integer.valueOf(instrumentationScope.dropped_attributes_count));
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.version;
        int hashCode3 = ((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37) + this.attributes.hashCode()) * 37) + Integer.hashCode(this.dropped_attributes_count);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=").append(Internal.sanitize(this.name));
        }
        if (this.version != null) {
            sb.append(", version=").append(Internal.sanitize(this.version));
        }
        if (!this.attributes.isEmpty()) {
            sb.append(", attributes=").append(this.attributes);
        }
        sb.append(", dropped_attributes_count=").append(this.dropped_attributes_count);
        return sb.replace(0, 2, "InstrumentationScope{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<InstrumentationScope, Builder> {
        public String name = "";
        public String version = "";
        public List<KeyValue> attributes = Internal.newMutableList();
        public int dropped_attributes_count = 0;

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder version(String str) {
            this.version = str;
            return this;
        }

        public Builder attributes(List<KeyValue> list) {
            Internal.checkElementsNotNull(list);
            this.attributes = list;
            return this;
        }

        public Builder dropped_attributes_count(int i) {
            this.dropped_attributes_count = i;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public InstrumentationScope build() {
            return new InstrumentationScope(this.name, this.version, this.attributes, this.dropped_attributes_count, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_InstrumentationScope extends ProtoAdapter<InstrumentationScope> {
        public ProtoAdapter_InstrumentationScope() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) InstrumentationScope.class, "type.googleapis.com/opentelemetry.proto.common.v1.InstrumentationScope", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/common/v1/common.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(InstrumentationScope instrumentationScope) {
            int encodedSizeWithTag = !Objects.equals(instrumentationScope.name, "") ? ProtoAdapter.STRING.encodedSizeWithTag(1, instrumentationScope.name) : 0;
            if (!Objects.equals(instrumentationScope.version, "")) {
                encodedSizeWithTag += ProtoAdapter.STRING.encodedSizeWithTag(2, instrumentationScope.version);
            }
            int encodedSizeWithTag2 = encodedSizeWithTag + KeyValue.ADAPTER.asRepeated().encodedSizeWithTag(3, instrumentationScope.attributes);
            if (!Objects.equals(Integer.valueOf(instrumentationScope.dropped_attributes_count), 0)) {
                encodedSizeWithTag2 += ProtoAdapter.UINT32.encodedSizeWithTag(4, Integer.valueOf(instrumentationScope.dropped_attributes_count));
            }
            return encodedSizeWithTag2 + instrumentationScope.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, InstrumentationScope instrumentationScope) throws IOException {
            if (!Objects.equals(instrumentationScope.name, "")) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, (int) instrumentationScope.name);
            }
            if (!Objects.equals(instrumentationScope.version, "")) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, (int) instrumentationScope.version);
            }
            KeyValue.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, (int) instrumentationScope.attributes);
            if (!Objects.equals(Integer.valueOf(instrumentationScope.dropped_attributes_count), 0)) {
                ProtoAdapter.UINT32.encodeWithTag(protoWriter, 4, (int) Integer.valueOf(instrumentationScope.dropped_attributes_count));
            }
            protoWriter.writeBytes(instrumentationScope.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, InstrumentationScope instrumentationScope) throws IOException {
            reverseProtoWriter.writeBytes(instrumentationScope.unknownFields());
            if (!Objects.equals(Integer.valueOf(instrumentationScope.dropped_attributes_count), 0)) {
                ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 4, (int) Integer.valueOf(instrumentationScope.dropped_attributes_count));
            }
            KeyValue.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, (int) instrumentationScope.attributes);
            if (!Objects.equals(instrumentationScope.version, "")) {
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, (int) instrumentationScope.version);
            }
            if (Objects.equals(instrumentationScope.name, "")) {
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, (int) instrumentationScope.name);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public InstrumentationScope decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    builder.addUnknownFields(protoReader.endMessageAndGetUnknownFields(beginMessage));
                    return builder.build();
                }
                if (nextTag == 1) {
                    builder.name(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.version(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.attributes.add(KeyValue.ADAPTER.decode(protoReader));
                } else if (nextTag == 4) {
                    builder.dropped_attributes_count(ProtoAdapter.UINT32.decode(protoReader).intValue());
                } else {
                    protoReader.readUnknownField(nextTag);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public InstrumentationScope redact(InstrumentationScope instrumentationScope) {
            Builder newBuilder = instrumentationScope.newBuilder();
            Internal.redactElements(newBuilder.attributes, KeyValue.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
