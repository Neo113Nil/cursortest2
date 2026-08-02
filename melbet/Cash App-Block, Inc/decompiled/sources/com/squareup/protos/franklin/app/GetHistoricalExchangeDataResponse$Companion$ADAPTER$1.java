package com.squareup.protos.franklin.app;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.PriceHistory;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetHistoricalExchangeDataResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetHistoricalExchangeDataResponse((PriceHistory) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(PriceHistory.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetHistoricalExchangeDataResponse getHistoricalExchangeDataResponse = (GetHistoricalExchangeDataResponse) obj;
        reverseProtoWriter.getClass();
        getHistoricalExchangeDataResponse.getClass();
        reverseProtoWriter.writeBytes(getHistoricalExchangeDataResponse.unknownFields());
        PriceHistory.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getHistoricalExchangeDataResponse.price_history);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetHistoricalExchangeDataResponse getHistoricalExchangeDataResponse = (GetHistoricalExchangeDataResponse) obj;
        getHistoricalExchangeDataResponse.getClass();
        return PriceHistory.ADAPTER.encodedSizeWithTag(1, getHistoricalExchangeDataResponse.price_history) + getHistoricalExchangeDataResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetHistoricalExchangeDataResponse getHistoricalExchangeDataResponse = (GetHistoricalExchangeDataResponse) obj;
        getHistoricalExchangeDataResponse.getClass();
        PriceHistory priceHistory = getHistoricalExchangeDataResponse.price_history;
        PriceHistory priceHistory2 = priceHistory != null ? (PriceHistory) PriceHistory.ADAPTER.redact(priceHistory) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetHistoricalExchangeDataResponse(priceHistory2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetHistoricalExchangeDataResponse getHistoricalExchangeDataResponse = (GetHistoricalExchangeDataResponse) obj;
        getHistoricalExchangeDataResponse.getClass();
        PriceHistory.ADAPTER.encodeWithTag(protoWriter, 1, getHistoricalExchangeDataResponse.price_history);
        protoWriter.writeBytes(getHistoricalExchangeDataResponse.unknownFields());
    }
}
