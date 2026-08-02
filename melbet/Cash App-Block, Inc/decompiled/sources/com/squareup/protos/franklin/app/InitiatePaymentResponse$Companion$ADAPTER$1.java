package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.app.InitiatePaymentResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class InitiatePaymentResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InitiatePaymentResponse((ResponseContext) obj, (InitiatePaymentResponse.Status) obj2, (ClaimData) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj2 = InitiatePaymentResponse.Status.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 10) {
                obj3 = TransactorKt.decodeMessageOrMerge(ClaimData.ADAPTER, protoReader, obj3);
            } else if (nextTag != 11) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InitiatePaymentResponse initiatePaymentResponse = (InitiatePaymentResponse) obj;
        reverseProtoWriter.getClass();
        initiatePaymentResponse.getClass();
        reverseProtoWriter.writeBytes(initiatePaymentResponse.unknownFields());
        ClaimData.ADAPTER.encodeWithTag(reverseProtoWriter, 10, initiatePaymentResponse.claim_data);
        InitiatePaymentResponse.Status.ADAPTER.encodeWithTag(reverseProtoWriter, 1, initiatePaymentResponse.status);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 11, initiatePaymentResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InitiatePaymentResponse initiatePaymentResponse = (InitiatePaymentResponse) obj;
        initiatePaymentResponse.getClass();
        return ClaimData.ADAPTER.encodedSizeWithTag(10, initiatePaymentResponse.claim_data) + InitiatePaymentResponse.Status.ADAPTER.encodedSizeWithTag(1, initiatePaymentResponse.status) + ResponseContext.ADAPTER.encodedSizeWithTag(11, initiatePaymentResponse.response_context) + initiatePaymentResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InitiatePaymentResponse initiatePaymentResponse = (InitiatePaymentResponse) obj;
        initiatePaymentResponse.getClass();
        ResponseContext responseContext = initiatePaymentResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ClaimData claimData = initiatePaymentResponse.claim_data;
        ClaimData claimData2 = claimData != null ? (ClaimData) ClaimData.ADAPTER.redact(claimData) : null;
        ByteString byteString = ByteString.EMPTY;
        InitiatePaymentResponse.Status status = initiatePaymentResponse.status;
        byteString.getClass();
        return new InitiatePaymentResponse(responseContext2, status, claimData2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InitiatePaymentResponse initiatePaymentResponse = (InitiatePaymentResponse) obj;
        initiatePaymentResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 11, initiatePaymentResponse.response_context);
        InitiatePaymentResponse.Status.ADAPTER.encodeWithTag(protoWriter, 1, initiatePaymentResponse.status);
        ClaimData.ADAPTER.encodeWithTag(protoWriter, 10, initiatePaymentResponse.claim_data);
        protoWriter.writeBytes(initiatePaymentResponse.unknownFields());
    }
}
