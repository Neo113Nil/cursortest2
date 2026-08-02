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
public final class PortfolioNews$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PortfolioNews(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(News.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PortfolioNews portfolioNews = (PortfolioNews) obj;
        reverseProtoWriter.getClass();
        portfolioNews.getClass();
        reverseProtoWriter.writeBytes(portfolioNews.unknownFields());
        News.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, portfolioNews.news);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PortfolioNews portfolioNews = (PortfolioNews) obj;
        portfolioNews.getClass();
        return News.ADAPTER.asRepeated().encodedSizeWithTag(1, portfolioNews.news) + portfolioNews.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PortfolioNews portfolioNews = (PortfolioNews) obj;
        portfolioNews.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(portfolioNews.news, News.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PortfolioNews(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PortfolioNews portfolioNews = (PortfolioNews) obj;
        portfolioNews.getClass();
        News.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, portfolioNews.news);
        protoWriter.writeBytes(portfolioNews.unknownFields());
    }
}
