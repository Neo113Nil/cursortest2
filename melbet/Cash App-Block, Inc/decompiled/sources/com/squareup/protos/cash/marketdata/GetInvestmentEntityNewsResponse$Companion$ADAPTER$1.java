package com.squareup.protos.cash.marketdata;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.marketdata.model.InvestmentEntityNews;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetInvestmentEntityNewsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetInvestmentEntityNewsResponse(m, (Integer) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(InvestmentEntityNews.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetInvestmentEntityNewsResponse getInvestmentEntityNewsResponse = (GetInvestmentEntityNewsResponse) obj;
        reverseProtoWriter.getClass();
        getInvestmentEntityNewsResponse.getClass();
        reverseProtoWriter.writeBytes(getInvestmentEntityNewsResponse.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, getInvestmentEntityNewsResponse.next_cache_refresh_after);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 2, getInvestmentEntityNewsResponse.number_of_news_in_carousel);
        InvestmentEntityNews.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getInvestmentEntityNewsResponse.investment_entity_news);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetInvestmentEntityNewsResponse getInvestmentEntityNewsResponse = (GetInvestmentEntityNewsResponse) obj;
        getInvestmentEntityNewsResponse.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(3, getInvestmentEntityNewsResponse.next_cache_refresh_after) + ProtoAdapter.INT32.encodedSizeWithTag(2, getInvestmentEntityNewsResponse.number_of_news_in_carousel) + InvestmentEntityNews.ADAPTER.asRepeated().encodedSizeWithTag(1, getInvestmentEntityNewsResponse.investment_entity_news) + getInvestmentEntityNewsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetInvestmentEntityNewsResponse getInvestmentEntityNewsResponse = (GetInvestmentEntityNewsResponse) obj;
        getInvestmentEntityNewsResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getInvestmentEntityNewsResponse.investment_entity_news, InvestmentEntityNews.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Integer num = getInvestmentEntityNewsResponse.number_of_news_in_carousel;
        Long l = getInvestmentEntityNewsResponse.next_cache_refresh_after;
        byteString.getClass();
        return new GetInvestmentEntityNewsResponse(m1169redactElements, num, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetInvestmentEntityNewsResponse getInvestmentEntityNewsResponse = (GetInvestmentEntityNewsResponse) obj;
        getInvestmentEntityNewsResponse.getClass();
        InvestmentEntityNews.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getInvestmentEntityNewsResponse.investment_entity_news);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getInvestmentEntityNewsResponse.number_of_news_in_carousel);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getInvestmentEntityNewsResponse.next_cache_refresh_after);
        protoWriter.writeBytes(getInvestmentEntityNewsResponse.unknownFields());
    }
}
