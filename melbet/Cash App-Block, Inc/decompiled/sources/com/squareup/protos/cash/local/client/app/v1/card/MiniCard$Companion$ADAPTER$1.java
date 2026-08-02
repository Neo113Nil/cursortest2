package com.squareup.protos.cash.local.client.app.v1.card;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MiniCard$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new MiniCard((String) obj, (Color) obj2, (Image) obj3, (Image) obj4, (Color) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MiniCard miniCard = (MiniCard) obj;
        reverseProtoWriter.getClass();
        miniCard.getClass();
        reverseProtoWriter.writeBytes(miniCard.unknownFields());
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, miniCard.brand_card_outline_color);
        ProtoAdapter protoAdapter2 = Image.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, miniCard.artwork_image);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, miniCard.icon);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, miniCard.background_color);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, miniCard.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MiniCard miniCard = (MiniCard) obj;
        miniCard.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, miniCard.title) + miniCard.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Color.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, miniCard.background_color) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = Image.ADAPTER;
        return protoAdapter.encodedSizeWithTag(5, miniCard.brand_card_outline_color) + protoAdapter2.encodedSizeWithTag(4, miniCard.artwork_image) + protoAdapter2.encodedSizeWithTag(3, miniCard.icon) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MiniCard miniCard = (MiniCard) obj;
        miniCard.getClass();
        Color color = miniCard.background_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Image image = miniCard.icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        Image image3 = miniCard.artwork_image;
        Image image4 = image3 != null ? (Image) Image.ADAPTER.redact(image3) : null;
        Color color3 = miniCard.brand_card_outline_color;
        Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = miniCard.title;
        byteString.getClass();
        return new MiniCard(str, color2, image2, image4, color4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MiniCard miniCard = (MiniCard) obj;
        miniCard.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, miniCard.title);
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, miniCard.background_color);
        ProtoAdapter protoAdapter2 = Image.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, miniCard.icon);
        protoAdapter2.encodeWithTag(protoWriter, 4, miniCard.artwork_image);
        protoAdapter.encodeWithTag(protoWriter, 5, miniCard.brand_card_outline_color);
        protoWriter.writeBytes(miniCard.unknownFields());
    }
}
