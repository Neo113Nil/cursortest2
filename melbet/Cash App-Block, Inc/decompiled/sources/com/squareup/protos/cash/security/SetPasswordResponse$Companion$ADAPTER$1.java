package com.squareup.protos.cash.security;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SetPasswordResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SetPasswordResponse((ResponseContext) obj, (String) obj2, (String) obj3, (Long) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SetPasswordResponse setPasswordResponse = (SetPasswordResponse) obj;
        reverseProtoWriter.getClass();
        setPasswordResponse.getClass();
        reverseProtoWriter.writeBytes(setPasswordResponse.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 4, setPasswordResponse.password_version);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, setPasswordResponse.password_error_message);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, setPasswordResponse.password_token);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, setPasswordResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SetPasswordResponse setPasswordResponse = (SetPasswordResponse) obj;
        setPasswordResponse.getClass();
        int encodedSizeWithTag = ResponseContext.ADAPTER.encodedSizeWithTag(1, setPasswordResponse.response_context) + setPasswordResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.INT64.encodedSizeWithTag(4, setPasswordResponse.password_version) + protoAdapter.encodedSizeWithTag(3, setPasswordResponse.password_error_message) + protoAdapter.encodedSizeWithTag(2, setPasswordResponse.password_token) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SetPasswordResponse setPasswordResponse = (SetPasswordResponse) obj;
        setPasswordResponse.getClass();
        ResponseContext responseContext = setPasswordResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = setPasswordResponse.password_error_message;
        Long l = setPasswordResponse.password_version;
        byteString.getClass();
        return new SetPasswordResponse(responseContext2, null, str, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SetPasswordResponse setPasswordResponse = (SetPasswordResponse) obj;
        setPasswordResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, setPasswordResponse.response_context);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, setPasswordResponse.password_token);
        protoAdapter.encodeWithTag(protoWriter, 3, setPasswordResponse.password_error_message);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, setPasswordResponse.password_version);
        protoWriter.writeBytes(setPasswordResponse.unknownFields());
    }
}
