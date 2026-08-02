package com.squareup.protos.cash.security;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class VerifyPasswordResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new VerifyPasswordResponse((ResponseContext) obj, (String) obj2, (Long) obj3, (Boolean) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VerifyPasswordResponse verifyPasswordResponse = (VerifyPasswordResponse) obj;
        reverseProtoWriter.getClass();
        verifyPasswordResponse.getClass();
        reverseProtoWriter.writeBytes(verifyPasswordResponse.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 4, verifyPasswordResponse.invalidate_password_token);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, verifyPasswordResponse.password_version);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, verifyPasswordResponse.password_token);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, verifyPasswordResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VerifyPasswordResponse verifyPasswordResponse = (VerifyPasswordResponse) obj;
        verifyPasswordResponse.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(4, verifyPasswordResponse.invalidate_password_token) + ProtoAdapter.INT64.encodedSizeWithTag(3, verifyPasswordResponse.password_version) + ProtoAdapter.STRING.encodedSizeWithTag(2, verifyPasswordResponse.password_token) + ResponseContext.ADAPTER.encodedSizeWithTag(1, verifyPasswordResponse.response_context) + verifyPasswordResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VerifyPasswordResponse verifyPasswordResponse = (VerifyPasswordResponse) obj;
        verifyPasswordResponse.getClass();
        ResponseContext responseContext = verifyPasswordResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = verifyPasswordResponse.password_version;
        Boolean bool = verifyPasswordResponse.invalidate_password_token;
        byteString.getClass();
        return new VerifyPasswordResponse(responseContext2, null, l, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VerifyPasswordResponse verifyPasswordResponse = (VerifyPasswordResponse) obj;
        verifyPasswordResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, verifyPasswordResponse.response_context);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, verifyPasswordResponse.password_token);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, verifyPasswordResponse.password_version);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, verifyPasswordResponse.invalidate_password_token);
        protoWriter.writeBytes(verifyPasswordResponse.unknownFields());
    }
}
