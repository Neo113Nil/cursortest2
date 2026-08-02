package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.VerifyIdentityResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class VerifyIdentityResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VerifyIdentityResponse((ResponseContext) obj, (VerifyIdentityResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = VerifyIdentityResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 12) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VerifyIdentityResponse verifyIdentityResponse = (VerifyIdentityResponse) obj;
        reverseProtoWriter.getClass();
        verifyIdentityResponse.getClass();
        reverseProtoWriter.writeBytes(verifyIdentityResponse.unknownFields());
        VerifyIdentityResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, verifyIdentityResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 12, verifyIdentityResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VerifyIdentityResponse verifyIdentityResponse = (VerifyIdentityResponse) obj;
        verifyIdentityResponse.getClass();
        return VerifyIdentityResponse.Status.ADAPTER.encodedSizeWithTag(1, verifyIdentityResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(12, verifyIdentityResponse.response_context) + verifyIdentityResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VerifyIdentityResponse verifyIdentityResponse = (VerifyIdentityResponse) obj;
        verifyIdentityResponse.getClass();
        ResponseContext responseContext = verifyIdentityResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        VerifyIdentityResponse.Status status = verifyIdentityResponse.status;
        byteString.getClass();
        return new VerifyIdentityResponse(responseContext2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VerifyIdentityResponse verifyIdentityResponse = (VerifyIdentityResponse) obj;
        verifyIdentityResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 12, verifyIdentityResponse.response_context);
        VerifyIdentityResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, verifyIdentityResponse.status);
        protoWriter.writeBytes(verifyIdentityResponse.unknownFields());
    }
}
