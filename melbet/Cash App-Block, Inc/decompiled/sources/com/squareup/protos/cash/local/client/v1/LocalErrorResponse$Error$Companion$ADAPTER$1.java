package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalErrorResponse$Error$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LocalErrorResponse.Error((String) obj, (LocalErrorResponse.Error.Type) obj2, (LocalErrorResponse.Error.Reason) obj3, (String) obj4, (LocalErrorResponse.Error.Level) obj5, (String) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    try {
                        obj2 = LocalErrorResponse.Error.Type.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    try {
                        obj3 = LocalErrorResponse.Error.Reason.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 5:
                    try {
                        obj5 = LocalErrorResponse.Error.Level.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalErrorResponse.Error error = (LocalErrorResponse.Error) obj;
        reverseProtoWriter.getClass();
        error.getClass();
        reverseProtoWriter.writeBytes(error.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, error.related_token);
        LocalErrorResponse.Error.Level.ADAPTER.encodeWithTag(reverseProtoWriter, 5, error.level);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, error.field);
        LocalErrorResponse.Error.Reason.ADAPTER.encodeWithTag(reverseProtoWriter, 3, error.reason);
        LocalErrorResponse.Error.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 2, error.f1308type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, error.message);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalErrorResponse.Error error = (LocalErrorResponse.Error) obj;
        error.getClass();
        int size$okio = error.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(6, error.related_token) + LocalErrorResponse.Error.Level.ADAPTER.encodedSizeWithTag(5, error.level) + protoAdapter.encodedSizeWithTag(4, error.field) + LocalErrorResponse.Error.Reason.ADAPTER.encodedSizeWithTag(3, error.reason) + LocalErrorResponse.Error.Type.ADAPTER.encodedSizeWithTag(2, error.f1308type) + protoAdapter.encodedSizeWithTag(1, error.message) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalErrorResponse.Error error = (LocalErrorResponse.Error) obj;
        error.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = error.message;
        LocalErrorResponse.Error.Type type2 = error.f1308type;
        LocalErrorResponse.Error.Reason reason = error.reason;
        String str2 = error.field;
        LocalErrorResponse.Error.Level level = error.level;
        String str3 = error.related_token;
        byteString.getClass();
        return new LocalErrorResponse.Error(str, type2, reason, str2, level, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalErrorResponse.Error error = (LocalErrorResponse.Error) obj;
        error.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, error.message);
        LocalErrorResponse.Error.Type.ADAPTER.encodeWithTag(protoWriter, 2, error.f1308type);
        LocalErrorResponse.Error.Reason.ADAPTER.encodeWithTag(protoWriter, 3, error.reason);
        protoAdapter.encodeWithTag(protoWriter, 4, error.field);
        LocalErrorResponse.Error.Level.ADAPTER.encodeWithTag(protoWriter, 5, error.level);
        protoAdapter.encodeWithTag(protoWriter, 6, error.related_token);
        protoWriter.writeBytes(error.unknownFields());
    }
}
