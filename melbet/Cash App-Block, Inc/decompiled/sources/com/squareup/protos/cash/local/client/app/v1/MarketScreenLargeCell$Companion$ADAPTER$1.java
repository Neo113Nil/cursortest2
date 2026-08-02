package com.squareup.protos.cash.local.client.app.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MarketScreenLargeCell$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MarketScreenLargeCell(m, (MarketScreenRowCell) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(LocalImage.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(MarketScreenRowCell.ADAPTER, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MarketScreenLargeCell marketScreenLargeCell = (MarketScreenLargeCell) obj;
        reverseProtoWriter.getClass();
        marketScreenLargeCell.getClass();
        reverseProtoWriter.writeBytes(marketScreenLargeCell.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, marketScreenLargeCell.profile_share_link_url);
        MarketScreenRowCell.ADAPTER.encodeWithTag(reverseProtoWriter, 2, marketScreenLargeCell.row_content);
        LocalImage.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, marketScreenLargeCell.hero_images);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MarketScreenLargeCell marketScreenLargeCell = (MarketScreenLargeCell) obj;
        marketScreenLargeCell.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(3, marketScreenLargeCell.profile_share_link_url) + MarketScreenRowCell.ADAPTER.encodedSizeWithTag(2, marketScreenLargeCell.row_content) + LocalImage.ADAPTER.asRepeated().encodedSizeWithTag(1, marketScreenLargeCell.hero_images) + marketScreenLargeCell.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MarketScreenLargeCell marketScreenLargeCell = (MarketScreenLargeCell) obj;
        marketScreenLargeCell.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(marketScreenLargeCell.hero_images, LocalImage.ADAPTER);
        MarketScreenRowCell marketScreenRowCell = marketScreenLargeCell.row_content;
        MarketScreenRowCell marketScreenRowCell2 = marketScreenRowCell != null ? (MarketScreenRowCell) MarketScreenRowCell.ADAPTER.redact(marketScreenRowCell) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = marketScreenLargeCell.profile_share_link_url;
        byteString.getClass();
        return new MarketScreenLargeCell(m1169redactElements, marketScreenRowCell2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MarketScreenLargeCell marketScreenLargeCell = (MarketScreenLargeCell) obj;
        marketScreenLargeCell.getClass();
        LocalImage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, marketScreenLargeCell.hero_images);
        MarketScreenRowCell.ADAPTER.encodeWithTag(protoWriter, 2, marketScreenLargeCell.row_content);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, marketScreenLargeCell.profile_share_link_url);
        protoWriter.writeBytes(marketScreenLargeCell.unknownFields());
    }
}
