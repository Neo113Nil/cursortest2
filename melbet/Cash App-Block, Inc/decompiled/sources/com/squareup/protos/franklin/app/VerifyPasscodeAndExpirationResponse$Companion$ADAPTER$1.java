package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.VerifyPasscodeAndExpirationResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class VerifyPasscodeAndExpirationResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VerifyPasscodeAndExpirationResponse((ResponseContext) obj, (VerifyPasscodeAndExpirationResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = VerifyPasscodeAndExpirationResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VerifyPasscodeAndExpirationResponse verifyPasscodeAndExpirationResponse = (VerifyPasscodeAndExpirationResponse) obj;
        reverseProtoWriter.getClass();
        verifyPasscodeAndExpirationResponse.getClass();
        reverseProtoWriter.writeBytes(verifyPasscodeAndExpirationResponse.unknownFields());
        VerifyPasscodeAndExpirationResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, verifyPasscodeAndExpirationResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 6, verifyPasscodeAndExpirationResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VerifyPasscodeAndExpirationResponse verifyPasscodeAndExpirationResponse = (VerifyPasscodeAndExpirationResponse) obj;
        verifyPasscodeAndExpirationResponse.getClass();
        return VerifyPasscodeAndExpirationResponse.Status.ADAPTER.encodedSizeWithTag(1, verifyPasscodeAndExpirationResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(6, verifyPasscodeAndExpirationResponse.response_context) + verifyPasscodeAndExpirationResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VerifyPasscodeAndExpirationResponse verifyPasscodeAndExpirationResponse = (VerifyPasscodeAndExpirationResponse) obj;
        verifyPasscodeAndExpirationResponse.getClass();
        ResponseContext responseContext = verifyPasscodeAndExpirationResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        VerifyPasscodeAndExpirationResponse.Status status = verifyPasscodeAndExpirationResponse.status;
        byteString.getClass();
        return new VerifyPasscodeAndExpirationResponse(responseContext2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VerifyPasscodeAndExpirationResponse verifyPasscodeAndExpirationResponse = (VerifyPasscodeAndExpirationResponse) obj;
        verifyPasscodeAndExpirationResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 6, verifyPasscodeAndExpirationResponse.response_context);
        VerifyPasscodeAndExpirationResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, verifyPasscodeAndExpirationResponse.status);
        protoWriter.writeBytes(verifyPasscodeAndExpirationResponse.unknownFields());
    }
}
