package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetMarketScreenDataResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetMarketScreenDataResponse((ResponseContext) obj, (MarketScreenData) obj2, (Long) obj3, (MarketScreenFeed) obj4, (MarketTilesScreen) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(MarketScreenData.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(MarketScreenFeed.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(MarketTilesScreen.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetMarketScreenDataResponse getMarketScreenDataResponse = (GetMarketScreenDataResponse) obj;
        reverseProtoWriter.getClass();
        getMarketScreenDataResponse.getClass();
        reverseProtoWriter.writeBytes(getMarketScreenDataResponse.unknownFields());
        MarketTilesScreen.ADAPTER.encodeWithTag(reverseProtoWriter, 5, getMarketScreenDataResponse.market_tiles_screen);
        MarketScreenFeed.ADAPTER.encodeWithTag(reverseProtoWriter, 4, getMarketScreenDataResponse.market_screen_feed);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, getMarketScreenDataResponse.expires_at);
        MarketScreenData.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getMarketScreenDataResponse.market_screen_data);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getMarketScreenDataResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetMarketScreenDataResponse getMarketScreenDataResponse = (GetMarketScreenDataResponse) obj;
        getMarketScreenDataResponse.getClass();
        return MarketTilesScreen.ADAPTER.encodedSizeWithTag(5, getMarketScreenDataResponse.market_tiles_screen) + MarketScreenFeed.ADAPTER.encodedSizeWithTag(4, getMarketScreenDataResponse.market_screen_feed) + ProtoAdapter.INT64.encodedSizeWithTag(3, getMarketScreenDataResponse.expires_at) + MarketScreenData.ADAPTER.encodedSizeWithTag(2, getMarketScreenDataResponse.market_screen_data) + ResponseContext.ADAPTER.encodedSizeWithTag(1, getMarketScreenDataResponse.response_context) + getMarketScreenDataResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetMarketScreenDataResponse getMarketScreenDataResponse = (GetMarketScreenDataResponse) obj;
        getMarketScreenDataResponse.getClass();
        ResponseContext responseContext = getMarketScreenDataResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        MarketScreenData marketScreenData = getMarketScreenDataResponse.market_screen_data;
        MarketScreenData marketScreenData2 = marketScreenData != null ? (MarketScreenData) MarketScreenData.ADAPTER.redact(marketScreenData) : null;
        MarketScreenFeed marketScreenFeed = getMarketScreenDataResponse.market_screen_feed;
        MarketScreenFeed marketScreenFeed2 = marketScreenFeed != null ? (MarketScreenFeed) MarketScreenFeed.ADAPTER.redact(marketScreenFeed) : null;
        MarketTilesScreen marketTilesScreen = getMarketScreenDataResponse.market_tiles_screen;
        MarketTilesScreen marketTilesScreen2 = marketTilesScreen != null ? (MarketTilesScreen) MarketTilesScreen.ADAPTER.redact(marketTilesScreen) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = getMarketScreenDataResponse.expires_at;
        byteString.getClass();
        return new GetMarketScreenDataResponse(responseContext2, marketScreenData2, l, marketScreenFeed2, marketTilesScreen2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetMarketScreenDataResponse getMarketScreenDataResponse = (GetMarketScreenDataResponse) obj;
        getMarketScreenDataResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, getMarketScreenDataResponse.response_context);
        MarketScreenData.ADAPTER.encodeWithTag(protoWriter, 2, getMarketScreenDataResponse.market_screen_data);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getMarketScreenDataResponse.expires_at);
        MarketScreenFeed.ADAPTER.encodeWithTag(protoWriter, 4, getMarketScreenDataResponse.market_screen_feed);
        MarketTilesScreen.ADAPTER.encodeWithTag(protoWriter, 5, getMarketScreenDataResponse.market_tiles_screen);
        protoWriter.writeBytes(getMarketScreenDataResponse.unknownFields());
    }
}
