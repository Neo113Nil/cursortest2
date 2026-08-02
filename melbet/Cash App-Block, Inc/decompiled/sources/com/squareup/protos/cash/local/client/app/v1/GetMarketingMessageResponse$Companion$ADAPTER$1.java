package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetMarketingMessageResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetMarketingMessageResponse((MarketingMessage) obj, (LocalErrorResponse) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(MarketingMessage.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalErrorResponse.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetMarketingMessageResponse getMarketingMessageResponse = (GetMarketingMessageResponse) obj;
        reverseProtoWriter.getClass();
        getMarketingMessageResponse.getClass();
        reverseProtoWriter.writeBytes(getMarketingMessageResponse.unknownFields());
        LocalErrorResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getMarketingMessageResponse.error_response);
        MarketingMessage.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getMarketingMessageResponse.marketing_message);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetMarketingMessageResponse getMarketingMessageResponse = (GetMarketingMessageResponse) obj;
        getMarketingMessageResponse.getClass();
        return LocalErrorResponse.ADAPTER.encodedSizeWithTag(2, getMarketingMessageResponse.error_response) + MarketingMessage.ADAPTER.encodedSizeWithTag(1, getMarketingMessageResponse.marketing_message) + getMarketingMessageResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetMarketingMessageResponse getMarketingMessageResponse = (GetMarketingMessageResponse) obj;
        getMarketingMessageResponse.getClass();
        MarketingMessage marketingMessage = getMarketingMessageResponse.marketing_message;
        MarketingMessage marketingMessage2 = marketingMessage != null ? (MarketingMessage) MarketingMessage.ADAPTER.redact(marketingMessage) : null;
        LocalErrorResponse localErrorResponse = getMarketingMessageResponse.error_response;
        LocalErrorResponse localErrorResponse2 = localErrorResponse != null ? (LocalErrorResponse) LocalErrorResponse.ADAPTER.redact(localErrorResponse) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetMarketingMessageResponse(marketingMessage2, localErrorResponse2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetMarketingMessageResponse getMarketingMessageResponse = (GetMarketingMessageResponse) obj;
        getMarketingMessageResponse.getClass();
        MarketingMessage.ADAPTER.encodeWithTag(protoWriter, 1, getMarketingMessageResponse.marketing_message);
        LocalErrorResponse.ADAPTER.encodeWithTag(protoWriter, 2, getMarketingMessageResponse.error_response);
        protoWriter.writeBytes(getMarketingMessageResponse.unknownFields());
    }
}
