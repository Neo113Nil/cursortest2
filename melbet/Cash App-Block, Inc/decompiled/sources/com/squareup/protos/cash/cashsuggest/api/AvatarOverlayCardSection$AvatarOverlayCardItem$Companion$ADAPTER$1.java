package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.AvatarOverlayCardSection;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.cash.p2p.profile_directory.ui.Text;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AvatarOverlayCardSection$AvatarOverlayCardItem$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AvatarOverlayCardSection.AvatarOverlayCardItem((ItemMetadata) obj, (Image) obj2, (ImageLayout) obj3, (Avatar) obj4, (Text) obj5, (Text) obj6, (String) obj7, (ShopInfoResponse) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(ItemMetadata.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj4 = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, protoReader, obj4);
                    break;
                case 4:
                    obj5 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj5);
                    break;
                case 5:
                    obj6 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj6);
                    break;
                case 6:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj8 = TransactorKt.decodeMessageOrMerge(ShopInfoResponse.ADAPTER, protoReader, obj8);
                    break;
                case 8:
                    try {
                        obj3 = ImageLayout.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AvatarOverlayCardSection.AvatarOverlayCardItem avatarOverlayCardItem = (AvatarOverlayCardSection.AvatarOverlayCardItem) obj;
        reverseProtoWriter.getClass();
        avatarOverlayCardItem.getClass();
        reverseProtoWriter.writeBytes(avatarOverlayCardItem.unknownFields());
        ShopInfoResponse.ADAPTER.encodeWithTag(reverseProtoWriter, 7, avatarOverlayCardItem.half_sheet);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 6, avatarOverlayCardItem.item_action_url);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, avatarOverlayCardItem.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, avatarOverlayCardItem.title);
        Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 3, avatarOverlayCardItem.avatar);
        ImageLayout.ADAPTER.encodeWithTag(reverseProtoWriter, 8, avatarOverlayCardItem.picture_layout);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 2, avatarOverlayCardItem.picture);
        ItemMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 1, avatarOverlayCardItem.metadata);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AvatarOverlayCardSection.AvatarOverlayCardItem avatarOverlayCardItem = (AvatarOverlayCardSection.AvatarOverlayCardItem) obj;
        avatarOverlayCardItem.getClass();
        int encodedSizeWithTag = Avatar.ADAPTER.encodedSizeWithTag(3, avatarOverlayCardItem.avatar) + ImageLayout.ADAPTER.encodedSizeWithTag(8, avatarOverlayCardItem.picture_layout) + Image.ADAPTER.encodedSizeWithTag(2, avatarOverlayCardItem.picture) + ItemMetadata.ADAPTER.encodedSizeWithTag(1, avatarOverlayCardItem.metadata) + avatarOverlayCardItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        return ShopInfoResponse.ADAPTER.encodedSizeWithTag(7, avatarOverlayCardItem.half_sheet) + ProtoAdapter.STRING.encodedSizeWithTag(6, avatarOverlayCardItem.item_action_url) + protoAdapter.encodedSizeWithTag(5, avatarOverlayCardItem.subtitle) + protoAdapter.encodedSizeWithTag(4, avatarOverlayCardItem.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AvatarOverlayCardSection.AvatarOverlayCardItem avatarOverlayCardItem = (AvatarOverlayCardSection.AvatarOverlayCardItem) obj;
        avatarOverlayCardItem.getClass();
        ItemMetadata itemMetadata = avatarOverlayCardItem.metadata;
        ItemMetadata itemMetadata2 = itemMetadata != null ? (ItemMetadata) ItemMetadata.ADAPTER.redact(itemMetadata) : null;
        Image image = avatarOverlayCardItem.picture;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        Avatar avatar = avatarOverlayCardItem.avatar;
        Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
        Text text = avatarOverlayCardItem.title;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = avatarOverlayCardItem.subtitle;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        ShopInfoResponse shopInfoResponse = avatarOverlayCardItem.half_sheet;
        ShopInfoResponse shopInfoResponse2 = shopInfoResponse != null ? (ShopInfoResponse) ShopInfoResponse.ADAPTER.redact(shopInfoResponse) : null;
        ByteString byteString = ByteString.EMPTY;
        ImageLayout imageLayout = avatarOverlayCardItem.picture_layout;
        byteString.getClass();
        return new AvatarOverlayCardSection.AvatarOverlayCardItem(itemMetadata2, image2, imageLayout, avatar2, text2, text4, null, shopInfoResponse2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AvatarOverlayCardSection.AvatarOverlayCardItem avatarOverlayCardItem = (AvatarOverlayCardSection.AvatarOverlayCardItem) obj;
        avatarOverlayCardItem.getClass();
        ItemMetadata.ADAPTER.encodeWithTag(protoWriter, 1, avatarOverlayCardItem.metadata);
        Image.ADAPTER.encodeWithTag(protoWriter, 2, avatarOverlayCardItem.picture);
        ImageLayout.ADAPTER.encodeWithTag(protoWriter, 8, avatarOverlayCardItem.picture_layout);
        Avatar.ADAPTER.encodeWithTag(protoWriter, 3, avatarOverlayCardItem.avatar);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 4, avatarOverlayCardItem.title);
        protoAdapter.encodeWithTag(protoWriter, 5, avatarOverlayCardItem.subtitle);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, avatarOverlayCardItem.item_action_url);
        ShopInfoResponse.ADAPTER.encodeWithTag(protoWriter, 7, avatarOverlayCardItem.half_sheet);
        protoWriter.writeBytes(avatarOverlayCardItem.unknownFields());
    }
}
