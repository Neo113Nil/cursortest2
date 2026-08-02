package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreatePOSLocalCashRedemptionResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreatePOSLocalCashRedemptionResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 4) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreatePOSLocalCashRedemptionResponse createPOSLocalCashRedemptionResponse = (CreatePOSLocalCashRedemptionResponse) obj;
        reverseProtoWriter.getClass();
        createPOSLocalCashRedemptionResponse.getClass();
        reverseProtoWriter.writeBytes(createPOSLocalCashRedemptionResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 4, createPOSLocalCashRedemptionResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreatePOSLocalCashRedemptionResponse createPOSLocalCashRedemptionResponse = (CreatePOSLocalCashRedemptionResponse) obj;
        createPOSLocalCashRedemptionResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(4, createPOSLocalCashRedemptionResponse.response_context) + createPOSLocalCashRedemptionResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreatePOSLocalCashRedemptionResponse createPOSLocalCashRedemptionResponse = (CreatePOSLocalCashRedemptionResponse) obj;
        createPOSLocalCashRedemptionResponse.getClass();
        ResponseContext responseContext = createPOSLocalCashRedemptionResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CreatePOSLocalCashRedemptionResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreatePOSLocalCashRedemptionResponse createPOSLocalCashRedemptionResponse = (CreatePOSLocalCashRedemptionResponse) obj;
        createPOSLocalCashRedemptionResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 4, createPOSLocalCashRedemptionResponse.response_context);
        protoWriter.writeBytes(createPOSLocalCashRedemptionResponse.unknownFields());
    }
}
