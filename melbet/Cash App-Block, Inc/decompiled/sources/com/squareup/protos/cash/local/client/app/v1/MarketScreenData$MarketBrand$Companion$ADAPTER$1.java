package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.app.v1.MarketScreenData;
import com.squareup.protos.cash.local.client.app.v1.card.MiniCard;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MarketScreenData$MarketBrand$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new MarketScreenData.MarketBrand((String) obj, (String) obj2, (MiniCard) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(MiniCard.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MarketScreenData.MarketBrand marketBrand = (MarketScreenData.MarketBrand) obj;
        reverseProtoWriter.getClass();
        marketBrand.getClass();
        reverseProtoWriter.writeBytes(marketBrand.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, marketBrand.client_route);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, marketBrand.brand_token);
        MiniCard.ADAPTER.encodeWithTag(reverseProtoWriter, 3, marketBrand.mini_card);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, marketBrand.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, marketBrand.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MarketScreenData.MarketBrand marketBrand = (MarketScreenData.MarketBrand) obj;
        marketBrand.getClass();
        int size$okio = marketBrand.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, marketBrand.client_route) + protoAdapter.encodedSizeWithTag(4, marketBrand.brand_token) + MiniCard.ADAPTER.encodedSizeWithTag(3, marketBrand.mini_card) + protoAdapter.encodedSizeWithTag(2, marketBrand.subtitle) + protoAdapter.encodedSizeWithTag(1, marketBrand.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MarketScreenData.MarketBrand marketBrand = (MarketScreenData.MarketBrand) obj;
        marketBrand.getClass();
        MiniCard miniCard = marketBrand.mini_card;
        MiniCard miniCard2 = miniCard != null ? (MiniCard) MiniCard.ADAPTER.redact(miniCard) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = marketBrand.title;
        String str2 = marketBrand.subtitle;
        String str3 = marketBrand.brand_token;
        String str4 = marketBrand.client_route;
        byteString.getClass();
        return new MarketScreenData.MarketBrand(str, str2, miniCard2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MarketScreenData.MarketBrand marketBrand = (MarketScreenData.MarketBrand) obj;
        marketBrand.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, marketBrand.title);
        protoAdapter.encodeWithTag(protoWriter, 2, marketBrand.subtitle);
        MiniCard.ADAPTER.encodeWithTag(protoWriter, 3, marketBrand.mini_card);
        protoAdapter.encodeWithTag(protoWriter, 4, marketBrand.brand_token);
        protoAdapter.encodeWithTag(protoWriter, 5, marketBrand.client_route);
        protoWriter.writeBytes(marketBrand.unknownFields());
    }
}
