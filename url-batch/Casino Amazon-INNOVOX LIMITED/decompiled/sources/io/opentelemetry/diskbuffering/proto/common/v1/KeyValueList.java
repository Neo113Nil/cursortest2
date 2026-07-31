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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class KeyValueList extends Message<KeyValueList, Builder> {
    public static final ProtoAdapter<KeyValueList> ADAPTER = new ProtoAdapter_KeyValueList();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.common.v1.KeyValue#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<KeyValue> values;

    public KeyValueList(List<KeyValue> list) {
        this(list, ByteString.EMPTY);
    }

    public KeyValueList(List<KeyValue> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.values = Internal.immutableCopyOf("values", list);
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.values = Internal.copyOf(this.values);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KeyValueList)) {
            return false;
        }
        KeyValueList keyValueList = (KeyValueList) obj;
        return unknownFields().equals(keyValueList.unknownFields()) && this.values.equals(keyValueList.values);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (unknownFields().hashCode() * 37) + this.values.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.values.isEmpty()) {
            sb.append(", values=").append(this.values);
        }
        return sb.replace(0, 2, "KeyValueList{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<KeyValueList, Builder> {
        public List<KeyValue> values = Internal.newMutableList();

        public Builder values(List<KeyValue> list) {
            Internal.checkElementsNotNull(list);
            this.values = list;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public KeyValueList build() {
            return new KeyValueList(this.values, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_KeyValueList extends ProtoAdapter<KeyValueList> {
        public ProtoAdapter_KeyValueList() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) KeyValueList.class, "type.googleapis.com/opentelemetry.proto.common.v1.KeyValueList", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/common/v1/common.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(KeyValueList keyValueList) {
            return KeyValue.ADAPTER.asRepeated().encodedSizeWithTag(1, keyValueList.values) + keyValueList.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, KeyValueList keyValueList) throws IOException {
            KeyValue.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, (int) keyValueList.values);
            protoWriter.writeBytes(keyValueList.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, KeyValueList keyValueList) throws IOException {
            reverseProtoWriter.writeBytes(keyValueList.unknownFields());
            KeyValue.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, (int) keyValueList.values);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public KeyValueList decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    builder.addUnknownFields(protoReader.endMessageAndGetUnknownFields(beginMessage));
                    return builder.build();
                }
                if (nextTag == 1) {
                    builder.values.add(KeyValue.ADAPTER.decode(protoReader));
                } else {
                    protoReader.readUnknownField(nextTag);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public KeyValueList redact(KeyValueList keyValueList) {
            Builder newBuilder = keyValueList.newBuilder();
            Internal.redactElements(newBuilder.values, KeyValue.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
