package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.VerifyContactsResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class VerifyContactsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VerifyContactsResponse((ResponseContext) obj, (VerifyContactsResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = VerifyContactsResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VerifyContactsResponse verifyContactsResponse = (VerifyContactsResponse) obj;
        reverseProtoWriter.getClass();
        verifyContactsResponse.getClass();
        reverseProtoWriter.writeBytes(verifyContactsResponse.unknownFields());
        VerifyContactsResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 2, verifyContactsResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, verifyContactsResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VerifyContactsResponse verifyContactsResponse = (VerifyContactsResponse) obj;
        verifyContactsResponse.getClass();
        return VerifyContactsResponse.Status.ADAPTER.encodedSizeWithTag(2, verifyContactsResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(1, verifyContactsResponse.response_context) + verifyContactsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VerifyContactsResponse verifyContactsResponse = (VerifyContactsResponse) obj;
        verifyContactsResponse.getClass();
        ResponseContext responseContext = verifyContactsResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        VerifyContactsResponse.Status status = verifyContactsResponse.status;
        byteString.getClass();
        return new VerifyContactsResponse(responseContext2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VerifyContactsResponse verifyContactsResponse = (VerifyContactsResponse) obj;
        verifyContactsResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, verifyContactsResponse.response_context);
        VerifyContactsResponse.Status.ADAPTER.encodeWithTag(protoWriter, 2, verifyContactsResponse.status);
        protoWriter.writeBytes(verifyContactsResponse.unknownFields());
    }
}
