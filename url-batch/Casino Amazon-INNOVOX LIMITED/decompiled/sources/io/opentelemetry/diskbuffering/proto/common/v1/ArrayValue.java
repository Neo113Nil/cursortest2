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
public final class ArrayValue extends Message<ArrayValue, Builder> {
    public static final ProtoAdapter<ArrayValue> ADAPTER = new ProtoAdapter_ArrayValue();
    private static final long serialVersionUID = 0;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.common.v1.AnyValue#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<AnyValue> values;

    public ArrayValue(List<AnyValue> list) {
        this(list, ByteString.EMPTY);
    }

    public ArrayValue(List<AnyValue> list, ByteString byteString) {
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
        if (!(obj instanceof ArrayValue)) {
            return false;
        }
        ArrayValue arrayValue = (ArrayValue) obj;
        return unknownFields().equals(arrayValue.unknownFields()) && this.values.equals(arrayValue.values);
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
        return sb.replace(0, 2, "ArrayValue{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<ArrayValue, Builder> {
        public List<AnyValue> values = Internal.newMutableList();

        public Builder values(List<AnyValue> list) {
            Internal.checkElementsNotNull(list);
            this.values = list;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ArrayValue build() {
            return new ArrayValue(this.values, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_ArrayValue extends ProtoAdapter<ArrayValue> {
        public ProtoAdapter_ArrayValue() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) ArrayValue.class, "type.googleapis.com/opentelemetry.proto.common.v1.ArrayValue", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/common/v1/common.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(ArrayValue arrayValue) {
            return AnyValue.ADAPTER.asRepeated().encodedSizeWithTag(1, arrayValue.values) + arrayValue.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, ArrayValue arrayValue) throws IOException {
            AnyValue.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, (int) arrayValue.values);
            protoWriter.writeBytes(arrayValue.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, ArrayValue arrayValue) throws IOException {
            reverseProtoWriter.writeBytes(arrayValue.unknownFields());
            AnyValue.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, (int) arrayValue.values);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public ArrayValue decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    builder.addUnknownFields(protoReader.endMessageAndGetUnknownFields(beginMessage));
                    return builder.build();
                }
                if (nextTag == 1) {
                    builder.values.add(AnyValue.ADAPTER.decode(protoReader));
                } else {
                    protoReader.readUnknownField(nextTag);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public ArrayValue redact(ArrayValue arrayValue) {
            Builder newBuilder = arrayValue.newBuilder();
            Internal.redactElements(newBuilder.values, AnyValue.ADAPTER);
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
