package com.squareup.protos.cash.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.api.Error;
import com.squareup.wire.AnyMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Error$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Error((Error.Category) obj, (Error.Code) obj2, (String) obj3, (String) obj4, (Boolean) obj5, (AnyMessage) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = Error.Category.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    try {
                        obj2 = Error.Code.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    obj5 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(AnyMessage.ADAPTER, protoReader, obj6);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Error error = (Error) obj;
        reverseProtoWriter.getClass();
        error.getClass();
        reverseProtoWriter.writeBytes(error.unknownFields());
        AnyMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 6, error.metadata);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, error.retryable);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, error.field);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, error.description);
        Error.Code.ADAPTER.encodeWithTag(reverseProtoWriter, 2, error.code);
        Error.Category.ADAPTER.encodeWithTag(reverseProtoWriter, 1, error.category);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Error error = (Error) obj;
        error.getClass();
        int encodedSizeWithTag = Error.Code.ADAPTER.encodedSizeWithTag(2, error.code) + Error.Category.ADAPTER.encodedSizeWithTag(1, error.category) + error.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return AnyMessage.ADAPTER.encodedSizeWithTag(6, error.metadata) + ProtoAdapter.BOOL.encodedSizeWithTag(5, error.retryable) + protoAdapter.encodedSizeWithTag(4, error.field) + protoAdapter.encodedSizeWithTag(3, error.description) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Error error = (Error) obj;
        error.getClass();
        AnyMessage anyMessage = error.metadata;
        AnyMessage anyMessage2 = anyMessage != null ? (AnyMessage) AnyMessage.ADAPTER.redact(anyMessage) : null;
        ByteString byteString = ByteString.EMPTY;
        Error.Category category = error.category;
        Error.Code code = error.code;
        String str = error.description;
        String str2 = error.field;
        Boolean bool = error.retryable;
        byteString.getClass();
        return new Error(category, code, str, str2, bool, anyMessage2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Error error = (Error) obj;
        error.getClass();
        Error.Category.ADAPTER.encodeWithTag(protoWriter, 1, error.category);
        Error.Code.ADAPTER.encodeWithTag(protoWriter, 2, error.code);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 3, error.description);
        protoAdapter.encodeWithTag(protoWriter, 4, error.field);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, error.retryable);
        AnyMessage.ADAPTER.encodeWithTag(protoWriter, 6, error.metadata);
        protoWriter.writeBytes(error.unknownFields());
    }
}
