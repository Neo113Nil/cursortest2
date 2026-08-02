package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.ClaimByPaymentTokenResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ClaimByPaymentTokenResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ClaimByPaymentTokenResponse((ResponseContext) obj, (ClaimByPaymentTokenResponse.Status) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = ClaimByPaymentTokenResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 7) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ClaimByPaymentTokenResponse claimByPaymentTokenResponse = (ClaimByPaymentTokenResponse) obj;
        reverseProtoWriter.getClass();
        claimByPaymentTokenResponse.getClass();
        reverseProtoWriter.writeBytes(claimByPaymentTokenResponse.unknownFields());
        ClaimByPaymentTokenResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, claimByPaymentTokenResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 7, claimByPaymentTokenResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ClaimByPaymentTokenResponse claimByPaymentTokenResponse = (ClaimByPaymentTokenResponse) obj;
        claimByPaymentTokenResponse.getClass();
        return ClaimByPaymentTokenResponse.Status.ADAPTER.encodedSizeWithTag(1, claimByPaymentTokenResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(7, claimByPaymentTokenResponse.response_context) + claimByPaymentTokenResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ClaimByPaymentTokenResponse claimByPaymentTokenResponse = (ClaimByPaymentTokenResponse) obj;
        claimByPaymentTokenResponse.getClass();
        ResponseContext responseContext = claimByPaymentTokenResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        ClaimByPaymentTokenResponse.Status status = claimByPaymentTokenResponse.status;
        byteString.getClass();
        return new ClaimByPaymentTokenResponse(responseContext2, status, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClaimByPaymentTokenResponse claimByPaymentTokenResponse = (ClaimByPaymentTokenResponse) obj;
        claimByPaymentTokenResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 7, claimByPaymentTokenResponse.response_context);
        ClaimByPaymentTokenResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, claimByPaymentTokenResponse.status);
        protoWriter.writeBytes(claimByPaymentTokenResponse.unknownFields());
    }
}
