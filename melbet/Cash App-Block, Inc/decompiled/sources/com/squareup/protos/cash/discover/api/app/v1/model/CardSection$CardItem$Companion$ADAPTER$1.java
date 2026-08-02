package com.squareup.protos.cash.discover.api.app.v1.model;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.discover.api.app.v1.model.CardSection;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardSection$CardItem$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CardSection.CardItem((ItemMetadata) obj, (Image) obj2, (Text) obj3, (Text) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ItemMetadata.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj2);
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj3);
            } else if (nextTag == 6) {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 7) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardSection.CardItem cardItem = (CardSection.CardItem) obj;
        reverseProtoWriter.getClass();
        cardItem.getClass();
        reverseProtoWriter.writeBytes(cardItem.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 6, cardItem.item_action_url);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, cardItem.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, cardItem.title);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cardItem.picture);
        ItemMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cardItem.metadata);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardSection.CardItem cardItem = (CardSection.CardItem) obj;
        cardItem.getClass();
        int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(2, cardItem.picture) + ItemMetadata.ADAPTER.encodedSizeWithTag(1, cardItem.metadata) + cardItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        return ProtoAdapter.STRING.encodedSizeWithTag(6, cardItem.item_action_url) + protoAdapter.encodedSizeWithTag(7, cardItem.subtitle) + protoAdapter.encodedSizeWithTag(4, cardItem.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardSection.CardItem cardItem = (CardSection.CardItem) obj;
        cardItem.getClass();
        ItemMetadata itemMetadata = cardItem.metadata;
        ItemMetadata itemMetadata2 = itemMetadata != null ? (ItemMetadata) ItemMetadata.ADAPTER.redact(itemMetadata) : null;
        Image image = cardItem.picture;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        Text text = cardItem.title;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = cardItem.subtitle;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardSection.CardItem(itemMetadata2, image2, text2, text4, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardSection.CardItem cardItem = (CardSection.CardItem) obj;
        cardItem.getClass();
        ItemMetadata.ADAPTER.encodeWithTag(protoWriter, 1, cardItem.metadata);
        Image.ADAPTER.encodeWithTag(protoWriter, 2, cardItem.picture);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 4, cardItem.title);
        protoAdapter.encodeWithTag(protoWriter, 7, cardItem.subtitle);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, cardItem.item_action_url);
        protoWriter.writeBytes(cardItem.unknownFields());
    }
}
