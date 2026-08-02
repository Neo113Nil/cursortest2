package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.VerifyQrCodeResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class VerifyQrCodeResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VerifyQrCodeResponse((ResponseContext) obj, (VerifyQrCodeResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = VerifyQrCodeResponse.Status.ADAPTER.decode(protoReader);
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
        VerifyQrCodeResponse verifyQrCodeResponse = (VerifyQrCodeResponse) obj;
        reverseProtoWriter.getClass();
        verifyQrCodeResponse.getClass();
        reverseProtoWriter.writeBytes(verifyQrCodeResponse.unknownFields());
        VerifyQrCodeResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, verifyQrCodeResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 6, verifyQrCodeResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VerifyQrCodeResponse verifyQrCodeResponse = (VerifyQrCodeResponse) obj;
        verifyQrCodeResponse.getClass();
        return VerifyQrCodeResponse.Status.ADAPTER.encodedSizeWithTag(1, verifyQrCodeResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(6, verifyQrCodeResponse.response_context) + verifyQrCodeResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VerifyQrCodeResponse verifyQrCodeResponse = (VerifyQrCodeResponse) obj;
        verifyQrCodeResponse.getClass();
        ResponseContext responseContext = verifyQrCodeResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        VerifyQrCodeResponse.Status status = verifyQrCodeResponse.status;
        byteString.getClass();
        return new VerifyQrCodeResponse(responseContext2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VerifyQrCodeResponse verifyQrCodeResponse = (VerifyQrCodeResponse) obj;
        verifyQrCodeResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 6, verifyQrCodeResponse.response_context);
        VerifyQrCodeResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, verifyQrCodeResponse.status);
        protoWriter.writeBytes(verifyQrCodeResponse.unknownFields());
    }
}
