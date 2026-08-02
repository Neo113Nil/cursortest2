package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashsuggest.api.RowSection;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.cash.p2p.profile_directory.ui.Button;
import com.squareup.protos.cash.p2p.profile_directory.ui.Text;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class RowSection$RowItem$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new RowSection.RowItem((ItemMetadata) obj, (Avatar) obj2, (Text) obj3, (Text) obj4, (Text) obj5, (String) obj6, (Button) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(ItemMetadata.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(Button.ADAPTER, protoReader, obj7);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RowSection.RowItem rowItem = (RowSection.RowItem) obj;
        reverseProtoWriter.getClass();
        rowItem.getClass();
        reverseProtoWriter.writeBytes(rowItem.unknownFields());
        Button.ADAPTER.encodeWithTag(reverseProtoWriter, 7, rowItem.action_button);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 6, rowItem.item_action_url);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, rowItem.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, rowItem.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, rowItem.header);
        Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 2, rowItem.avatar);
        ItemMetadata.ADAPTER.encodeWithTag(reverseProtoWriter, 1, rowItem.metadata);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RowSection.RowItem rowItem = (RowSection.RowItem) obj;
        rowItem.getClass();
        int encodedSizeWithTag = Avatar.ADAPTER.encodedSizeWithTag(2, rowItem.avatar) + ItemMetadata.ADAPTER.encodedSizeWithTag(1, rowItem.metadata) + rowItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        return Button.ADAPTER.encodedSizeWithTag(7, rowItem.action_button) + ProtoAdapter.STRING.encodedSizeWithTag(6, rowItem.item_action_url) + protoAdapter.encodedSizeWithTag(5, rowItem.subtitle) + protoAdapter.encodedSizeWithTag(4, rowItem.title) + protoAdapter.encodedSizeWithTag(3, rowItem.header) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RowSection.RowItem rowItem = (RowSection.RowItem) obj;
        rowItem.getClass();
        ItemMetadata itemMetadata = rowItem.metadata;
        ItemMetadata itemMetadata2 = itemMetadata != null ? (ItemMetadata) ItemMetadata.ADAPTER.redact(itemMetadata) : null;
        Avatar avatar = rowItem.avatar;
        Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
        Text text = rowItem.header;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = rowItem.title;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        Text text5 = rowItem.subtitle;
        Text text6 = text5 != null ? (Text) Text.ADAPTER.redact(text5) : null;
        Button button = rowItem.action_button;
        Button button2 = button != null ? (Button) Button.ADAPTER.redact(button) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new RowSection.RowItem(itemMetadata2, avatar2, text2, text4, text6, null, button2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RowSection.RowItem rowItem = (RowSection.RowItem) obj;
        rowItem.getClass();
        ItemMetadata.ADAPTER.encodeWithTag(protoWriter, 1, rowItem.metadata);
        Avatar.ADAPTER.encodeWithTag(protoWriter, 2, rowItem.avatar);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, rowItem.header);
        protoAdapter.encodeWithTag(protoWriter, 4, rowItem.title);
        protoAdapter.encodeWithTag(protoWriter, 5, rowItem.subtitle);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, rowItem.item_action_url);
        Button.ADAPTER.encodeWithTag(protoWriter, 7, rowItem.action_button);
        protoWriter.writeBytes(rowItem.unknownFields());
    }
}
