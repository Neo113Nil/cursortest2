package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.AvatarOverlayCardSection;
import com.squareup.protos.cash.p2p.profile_directory.ui.Text;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AvatarOverlayCardSection$InfoOverlayCardItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AvatarOverlayCardSection.InfoOverlayCardItem((ItemMetadata) obj, (Image) obj2, (Text) obj3, (Text) obj4, (ShopInfoResponse) obj5, (Color) obj6, (Boolean) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(ItemMetadata.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(ShopInfoResponse.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AvatarOverlayCardSection.InfoOverlayCardItem infoOverlayCardItem = (AvatarOverlayCardSection.InfoOverlayCardItem) obj;
        reverseProtoWriter.getClass();
        infoOverlayCardItem.getClass();
        reverseProtoWriter.writeBytes(infoOverlayCardItem.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 7, infoOverlayCardItem.hide_close_button);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 6, infoOverlayCardItem.background_color);
        ShopInfoResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 5, infoOverlayCardItem.half_sheet);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, infoOverlayCardItem.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, infoOverlayCardItem.title);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 2, infoOverlayCardItem.icon);
        ItemMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 1, infoOverlayCardItem.metadata);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AvatarOverlayCardSection.InfoOverlayCardItem infoOverlayCardItem = (AvatarOverlayCardSection.InfoOverlayCardItem) obj;
        infoOverlayCardItem.getClass();
        int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(2, infoOverlayCardItem.icon) + ItemMetadata.ADAPTER.encodedSizeWithTag(1, infoOverlayCardItem.metadata) + infoOverlayCardItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        return ProtoAdapter.BOOL.encodedSizeWithTag(7, infoOverlayCardItem.hide_close_button) + Color.ADAPTER.encodedSizeWithTag(6, infoOverlayCardItem.background_color) + ShopInfoResponse.ADAPTER.encodedSizeWithTag(5, infoOverlayCardItem.half_sheet) + protoAdapter.encodedSizeWithTag(4, infoOverlayCardItem.description) + protoAdapter.encodedSizeWithTag(3, infoOverlayCardItem.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AvatarOverlayCardSection.InfoOverlayCardItem infoOverlayCardItem = (AvatarOverlayCardSection.InfoOverlayCardItem) obj;
        infoOverlayCardItem.getClass();
        ItemMetadata itemMetadata = infoOverlayCardItem.metadata;
        ItemMetadata itemMetadata2 = itemMetadata != null ? (ItemMetadata) ItemMetadata.ADAPTER.redact(itemMetadata) : null;
        Image image = infoOverlayCardItem.icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        Text text = infoOverlayCardItem.title;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = infoOverlayCardItem.description;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        ShopInfoResponse shopInfoResponse = infoOverlayCardItem.half_sheet;
        ShopInfoResponse shopInfoResponse2 = shopInfoResponse != null ? (ShopInfoResponse) ShopInfoResponse.ADAPTER.redact(shopInfoResponse) : null;
        Color color = infoOverlayCardItem.background_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = infoOverlayCardItem.hide_close_button;
        byteString.getClass();
        return new AvatarOverlayCardSection.InfoOverlayCardItem(itemMetadata2, image2, text2, text4, shopInfoResponse2, color2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AvatarOverlayCardSection.InfoOverlayCardItem infoOverlayCardItem = (AvatarOverlayCardSection.InfoOverlayCardItem) obj;
        infoOverlayCardItem.getClass();
        ItemMetadata.ADAPTER.encodeWithTag(protoWriter, 1, infoOverlayCardItem.metadata);
        Image.ADAPTER.encodeWithTag(protoWriter, 2, infoOverlayCardItem.icon);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, infoOverlayCardItem.title);
        protoAdapter.encodeWithTag(protoWriter, 4, infoOverlayCardItem.description);
        ShopInfoResponse.ADAPTER.encodeWithTag(protoWriter, 5, infoOverlayCardItem.half_sheet);
        Color.ADAPTER.encodeWithTag(protoWriter, 6, infoOverlayCardItem.background_color);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, infoOverlayCardItem.hide_close_button);
        protoWriter.writeBytes(infoOverlayCardItem.unknownFields());
    }
}
