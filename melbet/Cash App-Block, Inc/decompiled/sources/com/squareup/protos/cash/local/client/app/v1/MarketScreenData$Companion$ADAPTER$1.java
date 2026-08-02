package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.app.v1.MarketScreenData;
import com.squareup.protos.cash.local.client.app.v1.card.MiniCard;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MarketScreenData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MarketScreenData((MiniCard) obj, (MarketScreenData.ExplainerSection) obj2, (Boolean) obj3, (String) obj4, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(MiniCard.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(MarketScreenData.ExplainerSection.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                m.add(MarketScreenData.MarketBrand.ADAPTER.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MarketScreenData marketScreenData = (MarketScreenData) obj;
        reverseProtoWriter.getClass();
        marketScreenData.getClass();
        reverseProtoWriter.writeBytes(marketScreenData.unknownFields());
        MarketScreenData.MarketBrand.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, marketScreenData.market_brands);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, marketScreenData.brand_section_title);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 5, marketScreenData.explainer_section_in_footer);
        MarketScreenData.ExplainerSection.ADAPTER.encodeWithTag(reverseProtoWriter, 2, marketScreenData.explainer_section);
        MiniCard.ADAPTER.encodeWithTag(reverseProtoWriter, 1, marketScreenData.market_mini_card);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MarketScreenData marketScreenData = (MarketScreenData) obj;
        marketScreenData.getClass();
        return MarketScreenData.MarketBrand.ADAPTER.asRepeated().encodedSizeWithTag(4, marketScreenData.market_brands) + ProtoAdapter.STRING.encodedSizeWithTag(3, marketScreenData.brand_section_title) + ProtoAdapter.BOOL.encodedSizeWithTag(5, marketScreenData.explainer_section_in_footer) + MarketScreenData.ExplainerSection.ADAPTER.encodedSizeWithTag(2, marketScreenData.explainer_section) + MiniCard.ADAPTER.encodedSizeWithTag(1, marketScreenData.market_mini_card) + marketScreenData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MarketScreenData marketScreenData = (MarketScreenData) obj;
        marketScreenData.getClass();
        MiniCard miniCard = marketScreenData.market_mini_card;
        MiniCard miniCard2 = miniCard != null ? (MiniCard) MiniCard.ADAPTER.redact(miniCard) : null;
        MarketScreenData.ExplainerSection explainerSection = marketScreenData.explainer_section;
        MarketScreenData.ExplainerSection explainerSection2 = explainerSection != null ? (MarketScreenData.ExplainerSection) MarketScreenData.ExplainerSection.ADAPTER.redact(explainerSection) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(marketScreenData.market_brands, MarketScreenData.MarketBrand.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = marketScreenData.explainer_section_in_footer;
        String str = marketScreenData.brand_section_title;
        byteString.getClass();
        return new MarketScreenData(miniCard2, explainerSection2, bool, str, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MarketScreenData marketScreenData = (MarketScreenData) obj;
        marketScreenData.getClass();
        MiniCard.ADAPTER.encodeWithTag(protoWriter, 1, marketScreenData.market_mini_card);
        MarketScreenData.ExplainerSection.ADAPTER.encodeWithTag(protoWriter, 2, marketScreenData.explainer_section);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, marketScreenData.explainer_section_in_footer);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, marketScreenData.brand_section_title);
        MarketScreenData.MarketBrand.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, marketScreenData.market_brands);
        protoWriter.writeBytes(marketScreenData.unknownFields());
    }
}
