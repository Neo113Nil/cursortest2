package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes.dex */
public final class MarketTilesScreen$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MarketTilesScreen((String) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(BrandTile.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MarketTilesScreen marketTilesScreen = (MarketTilesScreen) obj;
        reverseProtoWriter.getClass();
        marketTilesScreen.getClass();
        reverseProtoWriter.writeBytes(marketTilesScreen.unknownFields());
        BrandTile.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, marketTilesScreen.brand_tiles);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, marketTilesScreen.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MarketTilesScreen marketTilesScreen = (MarketTilesScreen) obj;
        marketTilesScreen.getClass();
        return BrandTile.ADAPTER.asRepeated().encodedSizeWithTag(2, marketTilesScreen.brand_tiles) + ProtoAdapter.STRING.encodedSizeWithTag(1, marketTilesScreen.title) + marketTilesScreen.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MarketTilesScreen marketTilesScreen = (MarketTilesScreen) obj;
        marketTilesScreen.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(marketTilesScreen.brand_tiles, BrandTile.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = marketTilesScreen.title;
        byteString.getClass();
        return new MarketTilesScreen(str, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MarketTilesScreen marketTilesScreen = (MarketTilesScreen) obj;
        marketTilesScreen.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, marketTilesScreen.title);
        BrandTile.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, marketTilesScreen.brand_tiles);
        protoWriter.writeBytes(marketTilesScreen.unknownFields());
    }
}
