package com.squareup.protos.cash.discover.api.app.v1.model;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.discover.api.app.v1.model.AvatarSection;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AvatarSection$AvatarItem$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AvatarSection.AvatarItem((ItemMetadata) obj, (Avatar) obj2, (Text) obj3, (String) obj4, (Text) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ItemMetadata.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AvatarSection.AvatarItem avatarItem = (AvatarSection.AvatarItem) obj;
        reverseProtoWriter.getClass();
        avatarItem.getClass();
        reverseProtoWriter.writeBytes(avatarItem.unknownFields());
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, avatarItem.subtitle);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, avatarItem.item_action_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, avatarItem.title);
        Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 2, avatarItem.avatar);
        ItemMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 1, avatarItem.metadata);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AvatarSection.AvatarItem avatarItem = (AvatarSection.AvatarItem) obj;
        avatarItem.getClass();
        int encodedSizeWithTag = Avatar.ADAPTER.encodedSizeWithTag(2, avatarItem.avatar) + ItemMetadata.ADAPTER.encodedSizeWithTag(1, avatarItem.metadata) + avatarItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        return protoAdapter.encodedSizeWithTag(5, avatarItem.subtitle) + ProtoAdapter.STRING.encodedSizeWithTag(4, avatarItem.item_action_url) + protoAdapter.encodedSizeWithTag(3, avatarItem.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AvatarSection.AvatarItem avatarItem = (AvatarSection.AvatarItem) obj;
        avatarItem.getClass();
        ItemMetadata itemMetadata = avatarItem.metadata;
        ItemMetadata itemMetadata2 = itemMetadata != null ? (ItemMetadata) ItemMetadata.ADAPTER.redact(itemMetadata) : null;
        Avatar avatar = avatarItem.avatar;
        Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
        Text text = avatarItem.title;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = avatarItem.subtitle;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = avatarItem.item_action_url;
        byteString.getClass();
        return new AvatarSection.AvatarItem(itemMetadata2, avatar2, text2, str, text4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AvatarSection.AvatarItem avatarItem = (AvatarSection.AvatarItem) obj;
        avatarItem.getClass();
        ItemMetadata.ADAPTER.encodeWithTag(protoWriter, 1, avatarItem.metadata);
        Avatar.ADAPTER.encodeWithTag(protoWriter, 2, avatarItem.avatar);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, avatarItem.title);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, avatarItem.item_action_url);
        protoAdapter.encodeWithTag(protoWriter, 5, avatarItem.subtitle);
        protoWriter.writeBytes(avatarItem.unknownFields());
    }
}
