package com.squareup.protos.cash.postcard.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetCardDetailsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetCardDetailsResponse((CardDetails) obj, (ResponseContext) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CardDetails.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetCardDetailsResponse getCardDetailsResponse = (GetCardDetailsResponse) obj;
        reverseProtoWriter.getClass();
        getCardDetailsResponse.getClass();
        reverseProtoWriter.writeBytes(getCardDetailsResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getCardDetailsResponse.response_context);
        CardDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getCardDetailsResponse.card_details);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCardDetailsResponse getCardDetailsResponse = (GetCardDetailsResponse) obj;
        getCardDetailsResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(2, getCardDetailsResponse.response_context) + CardDetails.ADAPTER.encodedSizeWithTag(1, getCardDetailsResponse.card_details) + getCardDetailsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCardDetailsResponse getCardDetailsResponse = (GetCardDetailsResponse) obj;
        getCardDetailsResponse.getClass();
        CardDetails cardDetails = getCardDetailsResponse.card_details;
        CardDetails cardDetails2 = cardDetails != null ? (CardDetails) CardDetails.ADAPTER.redact(cardDetails) : null;
        ResponseContext responseContext = getCardDetailsResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetCardDetailsResponse(cardDetails2, responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCardDetailsResponse getCardDetailsResponse = (GetCardDetailsResponse) obj;
        getCardDetailsResponse.getClass();
        CardDetails.ADAPTER.encodeWithTag(protoWriter, 1, getCardDetailsResponse.card_details);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, getCardDetailsResponse.response_context);
        protoWriter.writeBytes(getCardDetailsResponse.unknownFields());
    }
}
