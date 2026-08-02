package com.squareup.protos.cash.cashliteflow.api.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetCardProcessorDetailsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetCardProcessorDetailsResponse((CardProcessorDetails) obj, (ResponseContext) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CardProcessorDetails.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetCardProcessorDetailsResponse getCardProcessorDetailsResponse = (GetCardProcessorDetailsResponse) obj;
        reverseProtoWriter.getClass();
        getCardProcessorDetailsResponse.getClass();
        reverseProtoWriter.writeBytes(getCardProcessorDetailsResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getCardProcessorDetailsResponse.response_context);
        CardProcessorDetails.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getCardProcessorDetailsResponse.card_processor_details);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCardProcessorDetailsResponse getCardProcessorDetailsResponse = (GetCardProcessorDetailsResponse) obj;
        getCardProcessorDetailsResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(2, getCardProcessorDetailsResponse.response_context) + CardProcessorDetails.ADAPTER.encodedSizeWithTag(1, getCardProcessorDetailsResponse.card_processor_details) + getCardProcessorDetailsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCardProcessorDetailsResponse getCardProcessorDetailsResponse = (GetCardProcessorDetailsResponse) obj;
        getCardProcessorDetailsResponse.getClass();
        CardProcessorDetails cardProcessorDetails = getCardProcessorDetailsResponse.card_processor_details;
        CardProcessorDetails cardProcessorDetails2 = cardProcessorDetails != null ? (CardProcessorDetails) CardProcessorDetails.ADAPTER.redact(cardProcessorDetails) : null;
        ResponseContext responseContext = getCardProcessorDetailsResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetCardProcessorDetailsResponse(cardProcessorDetails2, responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCardProcessorDetailsResponse getCardProcessorDetailsResponse = (GetCardProcessorDetailsResponse) obj;
        getCardProcessorDetailsResponse.getClass();
        CardProcessorDetails.ADAPTER.encodeWithTag(protoWriter, 1, getCardProcessorDetailsResponse.card_processor_details);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 2, getCardProcessorDetailsResponse.response_context);
        protoWriter.writeBytes(getCardProcessorDetailsResponse.unknownFields());
    }
}
