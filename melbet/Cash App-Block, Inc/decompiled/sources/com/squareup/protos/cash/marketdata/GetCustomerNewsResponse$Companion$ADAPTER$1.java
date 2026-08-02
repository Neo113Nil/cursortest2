package com.squareup.protos.cash.marketdata;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.marketdata.model.PortfolioNews;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetCustomerNewsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetCustomerNewsResponse((PortfolioNews) obj, (PortfolioNews) obj2, (Integer) obj3, (Long) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(PortfolioNews.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(PortfolioNews.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetCustomerNewsResponse getCustomerNewsResponse = (GetCustomerNewsResponse) obj;
        reverseProtoWriter.getClass();
        getCustomerNewsResponse.getClass();
        reverseProtoWriter.writeBytes(getCustomerNewsResponse.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 4, getCustomerNewsResponse.next_cache_refresh_after);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 3, getCustomerNewsResponse.number_of_news_in_carousel);
        ProtoAdapter protoAdapter = PortfolioNews.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, getCustomerNewsResponse.bitcoin);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, getCustomerNewsResponse.equity);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCustomerNewsResponse getCustomerNewsResponse = (GetCustomerNewsResponse) obj;
        getCustomerNewsResponse.getClass();
        int size$okio = getCustomerNewsResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = PortfolioNews.ADAPTER;
        return ProtoAdapter.INT64.encodedSizeWithTag(4, getCustomerNewsResponse.next_cache_refresh_after) + ProtoAdapter.INT32.encodedSizeWithTag(3, getCustomerNewsResponse.number_of_news_in_carousel) + protoAdapter.encodedSizeWithTag(2, getCustomerNewsResponse.bitcoin) + protoAdapter.encodedSizeWithTag(1, getCustomerNewsResponse.equity) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCustomerNewsResponse getCustomerNewsResponse = (GetCustomerNewsResponse) obj;
        getCustomerNewsResponse.getClass();
        PortfolioNews portfolioNews = getCustomerNewsResponse.equity;
        PortfolioNews portfolioNews2 = portfolioNews != null ? (PortfolioNews) PortfolioNews.ADAPTER.redact(portfolioNews) : null;
        PortfolioNews portfolioNews3 = getCustomerNewsResponse.bitcoin;
        PortfolioNews portfolioNews4 = portfolioNews3 != null ? (PortfolioNews) PortfolioNews.ADAPTER.redact(portfolioNews3) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = getCustomerNewsResponse.number_of_news_in_carousel;
        Long l = getCustomerNewsResponse.next_cache_refresh_after;
        byteString.getClass();
        return new GetCustomerNewsResponse(portfolioNews2, portfolioNews4, num, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCustomerNewsResponse getCustomerNewsResponse = (GetCustomerNewsResponse) obj;
        getCustomerNewsResponse.getClass();
        ProtoAdapter protoAdapter = PortfolioNews.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, getCustomerNewsResponse.equity);
        protoAdapter.encodeWithTag(protoWriter, 2, getCustomerNewsResponse.bitcoin);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getCustomerNewsResponse.number_of_news_in_carousel);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, getCustomerNewsResponse.next_cache_refresh_after);
        protoWriter.writeBytes(getCustomerNewsResponse.unknownFields());
    }
}
