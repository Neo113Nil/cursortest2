package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.AppletCardSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AppletCardSection$TileCarousel$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AppletCardSection.TileCarousel(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(AppletCardSection.TileCarousel.Tile.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AppletCardSection.TileCarousel tileCarousel = (AppletCardSection.TileCarousel) obj;
        reverseProtoWriter.getClass();
        tileCarousel.getClass();
        reverseProtoWriter.writeBytes(tileCarousel.unknownFields());
        AppletCardSection.TileCarousel.Tile.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, tileCarousel.tiles);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AppletCardSection.TileCarousel tileCarousel = (AppletCardSection.TileCarousel) obj;
        tileCarousel.getClass();
        return AppletCardSection.TileCarousel.Tile.ADAPTER.asRepeated().encodedSizeWithTag(1, tileCarousel.tiles) + tileCarousel.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AppletCardSection.TileCarousel tileCarousel = (AppletCardSection.TileCarousel) obj;
        tileCarousel.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(tileCarousel.tiles, AppletCardSection.TileCarousel.Tile.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new AppletCardSection.TileCarousel(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AppletCardSection.TileCarousel tileCarousel = (AppletCardSection.TileCarousel) obj;
        tileCarousel.getClass();
        AppletCardSection.TileCarousel.Tile.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, tileCarousel.tiles);
        protoWriter.writeBytes(tileCarousel.unknownFields());
    }
}
