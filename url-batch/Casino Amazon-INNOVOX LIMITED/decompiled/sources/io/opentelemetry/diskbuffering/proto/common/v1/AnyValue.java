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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class AnyValue extends Message<AnyValue, Builder> {
    public static final String DEFAULT_STRING_VALUE = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.common.v1.ArrayValue#ADAPTER", jsonName = "arrayValue", oneofName = "value", tag = 5)
    public final ArrayValue array_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "boolValue", oneofName = "value", tag = 2)
    public final Boolean bool_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", jsonName = "bytesValue", oneofName = "value", tag = 7)
    public final ByteString bytes_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", jsonName = "doubleValue", oneofName = "value", tag = 4)
    public final Double double_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", jsonName = "intValue", oneofName = "value", tag = 3)
    public final Long int_value;

    @WireField(adapter = "io.opentelemetry.diskbuffering.proto.common.v1.KeyValueList#ADAPTER", jsonName = "kvlistValue", oneofName = "value", tag = 6)
    public final KeyValueList kvlist_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "stringValue", oneofName = "value", tag = 1)
    public final String string_value;
    public static final ProtoAdapter<AnyValue> ADAPTER = new ProtoAdapter_AnyValue();
    public static final Boolean DEFAULT_BOOL_VALUE = false;
    public static final Long DEFAULT_INT_VALUE = 0L;
    public static final Double DEFAULT_DOUBLE_VALUE = Double.valueOf(0.0d);
    public static final ByteString DEFAULT_BYTES_VALUE = ByteString.EMPTY;

    public AnyValue(String str, Boolean bool, Long l, Double d, ArrayValue arrayValue, KeyValueList keyValueList, ByteString byteString) {
        this(str, bool, l, d, arrayValue, keyValueList, byteString, ByteString.EMPTY);
    }

    public AnyValue(String str, Boolean bool, Long l, Double d, ArrayValue arrayValue, KeyValueList keyValueList, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        if (Internal.countNonNull(str, bool, l, d, arrayValue, keyValueList, byteString) > 1) {
            throw new IllegalArgumentException("at most one of string_value, bool_value, int_value, double_value, array_value, kvlist_value, bytes_value may be non-null");
        }
        this.string_value = str;
        this.bool_value = bool;
        this.int_value = l;
        this.double_value = d;
        this.array_value = arrayValue;
        this.kvlist_value = keyValueList;
        this.bytes_value = byteString;
    }

    @Override // com.squareup.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.string_value = this.string_value;
        builder.bool_value = this.bool_value;
        builder.int_value = this.int_value;
        builder.double_value = this.double_value;
        builder.array_value = this.array_value;
        builder.kvlist_value = this.kvlist_value;
        builder.bytes_value = this.bytes_value;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AnyValue)) {
            return false;
        }
        AnyValue anyValue = (AnyValue) obj;
        return unknownFields().equals(anyValue.unknownFields()) && Internal.equals(this.string_value, anyValue.string_value) && Internal.equals(this.bool_value, anyValue.bool_value) && Internal.equals(this.int_value, anyValue.int_value) && Internal.equals(this.double_value, anyValue.double_value) && Internal.equals(this.array_value, anyValue.array_value) && Internal.equals(this.kvlist_value, anyValue.kvlist_value) && Internal.equals(this.bytes_value, anyValue.bytes_value);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.string_value;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.bool_value;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 37;
        Long l = this.int_value;
        int hashCode4 = (hashCode3 + (l != null ? l.hashCode() : 0)) * 37;
        Double d = this.double_value;
        int hashCode5 = (hashCode4 + (d != null ? d.hashCode() : 0)) * 37;
        ArrayValue arrayValue = this.array_value;
        int hashCode6 = (hashCode5 + (arrayValue != null ? arrayValue.hashCode() : 0)) * 37;
        KeyValueList keyValueList = this.kvlist_value;
        int hashCode7 = (hashCode6 + (keyValueList != null ? keyValueList.hashCode() : 0)) * 37;
        ByteString byteString = this.bytes_value;
        int hashCode8 = hashCode7 + (byteString != null ? byteString.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.string_value != null) {
            sb.append(", string_value=").append(Internal.sanitize(this.string_value));
        }
        if (this.bool_value != null) {
            sb.append(", bool_value=").append(this.bool_value);
        }
        if (this.int_value != null) {
            sb.append(", int_value=").append(this.int_value);
        }
        if (this.double_value != null) {
            sb.append(", double_value=").append(this.double_value);
        }
        if (this.array_value != null) {
            sb.append(", array_value=").append(this.array_value);
        }
        if (this.kvlist_value != null) {
            sb.append(", kvlist_value=").append(this.kvlist_value);
        }
        if (this.bytes_value != null) {
            sb.append(", bytes_value=").append(this.bytes_value);
        }
        return sb.replace(0, 2, "AnyValue{").append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    public static final class Builder extends Message.Builder<AnyValue, Builder> {
        public ArrayValue array_value;
        public Boolean bool_value;
        public ByteString bytes_value;
        public Double double_value;
        public Long int_value;
        public KeyValueList kvlist_value;
        public String string_value;

        public Builder string_value(String str) {
            this.string_value = str;
            this.bool_value = null;
            this.int_value = null;
            this.double_value = null;
            this.array_value = null;
            this.kvlist_value = null;
            this.bytes_value = null;
            return this;
        }

        public Builder bool_value(Boolean bool) {
            this.bool_value = bool;
            this.string_value = null;
            this.int_value = null;
            this.double_value = null;
            this.array_value = null;
            this.kvlist_value = null;
            this.bytes_value = null;
            return this;
        }

        public Builder int_value(Long l) {
            this.int_value = l;
            this.string_value = null;
            this.bool_value = null;
            this.double_value = null;
            this.array_value = null;
            this.kvlist_value = null;
            this.bytes_value = null;
            return this;
        }

        public Builder double_value(Double d) {
            this.double_value = d;
            this.string_value = null;
            this.bool_value = null;
            this.int_value = null;
            this.array_value = null;
            this.kvlist_value = null;
            this.bytes_value = null;
            return this;
        }

        public Builder array_value(ArrayValue arrayValue) {
            this.array_value = arrayValue;
            this.string_value = null;
            this.bool_value = null;
            this.int_value = null;
            this.double_value = null;
            this.kvlist_value = null;
            this.bytes_value = null;
            return this;
        }

        public Builder kvlist_value(KeyValueList keyValueList) {
            this.kvlist_value = keyValueList;
            this.string_value = null;
            this.bool_value = null;
            this.int_value = null;
            this.double_value = null;
            this.array_value = null;
            this.bytes_value = null;
            return this;
        }

        public Builder bytes_value(ByteString byteString) {
            this.bytes_value = byteString;
            this.string_value = null;
            this.bool_value = null;
            this.int_value = null;
            this.double_value = null;
            this.array_value = null;
            this.kvlist_value = null;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public AnyValue build() {
            return new AnyValue(this.string_value, this.bool_value, this.int_value, this.double_value, this.array_value, this.kvlist_value, this.bytes_value, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_AnyValue extends ProtoAdapter<AnyValue> {
        public ProtoAdapter_AnyValue() {
            super(FieldEncoding.LENGTH_DELIMITED, (Class<?>) AnyValue.class, "type.googleapis.com/opentelemetry.proto.common.v1.AnyValue", Syntax.PROTO_3, (Object) null, "opentelemetry/proto/common/v1/common.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        public int encodedSize(AnyValue anyValue) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, anyValue.string_value) + ProtoAdapter.BOOL.encodedSizeWithTag(2, anyValue.bool_value) + ProtoAdapter.INT64.encodedSizeWithTag(3, anyValue.int_value) + ProtoAdapter.DOUBLE.encodedSizeWithTag(4, anyValue.double_value) + ArrayValue.ADAPTER.encodedSizeWithTag(5, anyValue.array_value) + KeyValueList.ADAPTER.encodedSizeWithTag(6, anyValue.kvlist_value) + ProtoAdapter.BYTES.encodedSizeWithTag(7, anyValue.bytes_value) + anyValue.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, AnyValue anyValue) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, (int) anyValue.string_value);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, (int) anyValue.bool_value);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, (int) anyValue.int_value);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 4, (int) anyValue.double_value);
            ArrayValue.ADAPTER.encodeWithTag(protoWriter, 5, (int) anyValue.array_value);
            KeyValueList.ADAPTER.encodeWithTag(protoWriter, 6, (int) anyValue.kvlist_value);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 7, (int) anyValue.bytes_value);
            protoWriter.writeBytes(anyValue.unknownFields());
        }

        @Override // com.squareup.wire.ProtoAdapter
        public void encode(ReverseProtoWriter reverseProtoWriter, AnyValue anyValue) throws IOException {
            reverseProtoWriter.writeBytes(anyValue.unknownFields());
            ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 7, (int) anyValue.bytes_value);
            KeyValueList.ADAPTER.encodeWithTag(reverseProtoWriter, 6, (int) anyValue.kvlist_value);
            ArrayValue.ADAPTER.encodeWithTag(reverseProtoWriter, 5, (int) anyValue.array_value);
            ProtoAdapter.DOUBLE.encodeWithTag(reverseProtoWriter, 4, (int) anyValue.double_value);
            ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, (int) anyValue.int_value);
            ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, (int) anyValue.bool_value);
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, (int) anyValue.string_value);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.squareup.wire.ProtoAdapter
        public AnyValue decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.string_value(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.bool_value(ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 3:
                            builder.int_value(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 4:
                            builder.double_value(ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case 5:
                            builder.array_value(ArrayValue.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            builder.kvlist_value(KeyValueList.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            builder.bytes_value(ProtoAdapter.BYTES.decode(protoReader));
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                } else {
                    builder.addUnknownFields(protoReader.endMessageAndGetUnknownFields(beginMessage));
                    return builder.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public AnyValue redact(AnyValue anyValue) {
            Builder newBuilder = anyValue.newBuilder();
            if (newBuilder.array_value != null) {
                newBuilder.array_value = ArrayValue.ADAPTER.redact(newBuilder.array_value);
            }
            if (newBuilder.kvlist_value != null) {
                newBuilder.kvlist_value = KeyValueList.ADAPTER.redact(newBuilder.kvlist_value);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }
}
