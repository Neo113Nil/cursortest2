package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.app.v1.card.MiniCard;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MarketScreenFeed$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MarketScreenFeed(m, (MiniCard) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(MarketScreenContent.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(MiniCard.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MarketScreenFeed marketScreenFeed = (MarketScreenFeed) obj;
        reverseProtoWriter.getClass();
        marketScreenFeed.getClass();
        reverseProtoWriter.writeBytes(marketScreenFeed.unknownFields());
        MiniCard.ADAPTER.encodeWithTag(reverseProtoWriter, 2, marketScreenFeed.market_mini_card);
        MarketScreenContent.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, marketScreenFeed.content);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MarketScreenFeed marketScreenFeed = (MarketScreenFeed) obj;
        marketScreenFeed.getClass();
        return MiniCard.ADAPTER.encodedSizeWithTag(2, marketScreenFeed.market_mini_card) + MarketScreenContent.ADAPTER.asRepeated().encodedSizeWithTag(1, marketScreenFeed.content) + marketScreenFeed.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MarketScreenFeed marketScreenFeed = (MarketScreenFeed) obj;
        marketScreenFeed.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(marketScreenFeed.content, MarketScreenContent.ADAPTER);
        MiniCard miniCard = marketScreenFeed.market_mini_card;
        MiniCard miniCard2 = miniCard != null ? (MiniCard) MiniCard.ADAPTER.redact(miniCard) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new MarketScreenFeed(m1169redactElements, miniCard2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MarketScreenFeed marketScreenFeed = (MarketScreenFeed) obj;
        marketScreenFeed.getClass();
        MarketScreenContent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, marketScreenFeed.content);
        MiniCard.ADAPTER.encodeWithTag(protoWriter, 2, marketScreenFeed.market_mini_card);
        protoWriter.writeBytes(marketScreenFeed.unknownFields());
    }
}
