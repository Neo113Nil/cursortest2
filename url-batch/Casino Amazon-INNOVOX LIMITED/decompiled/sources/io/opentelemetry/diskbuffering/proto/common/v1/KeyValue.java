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
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class KeyValue extends Message<KeyValue, Builder> {
    public static final ProtoAdapter<KeyValue> ADAPTER = new ProtoAdapter_KeyValue();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, tag = 1)
    public final String key;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.common.v1.AnyValue#ADAPTER", label = WireField.Label.OMIT_IDENTITY, tag = 2)
    public final AnyValue value;

    public KeyValue(String str, AnyValue anyValue) {
        this(str, anyValue, ByteString.EMPTY);
    }

    public KeyValue(String str, AnyValue anyValue, ByteString byteString) {
        super(ADAPTER, byteString);
        if (str == null) {
            throw new IllegalArgumentException("key == null");
        }
        this.key = str;
        this.value = anyValue;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.key = this.key;
        builder.value = this.value;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KeyValue)) {
            return false;
        }
        KeyValue keyValue = (KeyValue) obj;
        return unknownFields().equals(keyValue.unknownFields()) && Internal.equals(this.key, keyValue.key) && Internal.equals(this.value, keyValue.value);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.key;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        AnyValue anyValue = this.value;
        int hashCode3 = hashCode2 + (anyValue != null ? anyValue.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.key != null) {
            sb.append(", key=").append(Internal.sanitize(this.key));
        }
        if (this.value != null) {
            sb.append(", value=").append(this.value);
        }
        return sb.replace(0, 2, "KeyValue{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<KeyValue, Builder> {
        public String key = "";
        public AnyValue value;

        public Builder key(String str) {
            this.key = str;
            return this;
        }

        public Builder value(AnyValue anyValue) {
            this.value = anyValue;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public KeyValue build() {
            return new KeyValue(this.key, this.value, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_KeyValue extends ProtoAdapter<KeyValue> {
        public ProtoAdapter_KeyValue() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) KeyValue.class, "type.googleapis.com/opentelemetry.proto.common.v1.KeyValue", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/common/v1/common.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(KeyValue keyValue) {
            int encodedSizeWithTag = !Objects.equals(keyValue.key, "") ? ProtoAdapter.STRING.encodedSizeWithTag(1, keyValue.key) : 0;
            if (!Objects.equals(keyValue.value, null)) {
                encodedSizeWithTag += AnyValue.ADAPTER.encodedSizeWithTag(2, keyValue.value);
            }
            return encodedSizeWithTag + keyValue.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, KeyValue keyValue) throws IOException {
            if (!Objects.equals(keyValue.key, "")) {
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, (int) keyValue.key);
            }
            if (!Objects.equals(keyValue.value, null)) {
                AnyValue.ADAPTER.encodeWithTag(protoWriter, 2, (int) keyValue.value);
            }
            protoWriter.writeBytes(keyValue.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, KeyValue keyValue) throws IOException {
            reverseProtoWriter.writeBytes(keyValue.unknownFields());
            if (!Objects.equals(keyValue.value, null)) {
                AnyValue.ADAPTER.encodeWithTag(reverseProtoWriter, 2, (int) keyValue.value);
            }
            if (Objects.equals(keyValue.key, "")) {
                return;
            }
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, (int) keyValue.key);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public KeyValue decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    builder.addUnknownFields(protoReader.endMessageAndGetUnknownFields(beginMessage));
                    return builder.build();
                }
                if (nextTag == 1) {
                    builder.key(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.value(AnyValue.ADAPTER.decode(protoReader));
                } else {
                    protoReader.readUnknownField(nextTag);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public KeyValue redact(KeyValue keyValue) {
            Builder newBuilder = keyValue.newBuilder();
            if (newBuilder.value != null) {
                newBuilder.value = AnyValue.ADAPTER.redact(newBuilder.value);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
