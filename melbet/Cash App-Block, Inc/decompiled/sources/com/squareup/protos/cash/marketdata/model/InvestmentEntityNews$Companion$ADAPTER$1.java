package com.squareup.protos.cash.marketdata.model;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InvestmentEntityNews$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InvestmentEntityNews((String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(News.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        InvestmentEntityNews investmentEntityNews = (InvestmentEntityNews) obj;
        reverseProtoWriter.getClass();
        investmentEntityNews.getClass();
        reverseProtoWriter.writeBytes(investmentEntityNews.unknownFields());
        News.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, investmentEntityNews.news);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, investmentEntityNews.investment_entity_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InvestmentEntityNews investmentEntityNews = (InvestmentEntityNews) obj;
        investmentEntityNews.getClass();
        return News.ADAPTER.asRepeated().encodedSizeWithTag(2, investmentEntityNews.news) + ProtoAdapter.STRING.encodedSizeWithTag(1, investmentEntityNews.investment_entity_token) + investmentEntityNews.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InvestmentEntityNews investmentEntityNews = (InvestmentEntityNews) obj;
        investmentEntityNews.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(investmentEntityNews.news, News.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = investmentEntityNews.investment_entity_token;
        byteString.getClass();
        return new InvestmentEntityNews(str, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InvestmentEntityNews investmentEntityNews = (InvestmentEntityNews) obj;
        investmentEntityNews.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, investmentEntityNews.investment_entity_token);
        News.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, investmentEntityNews.news);
        protoWriter.writeBytes(investmentEntityNews.unknownFields());
    }
}
