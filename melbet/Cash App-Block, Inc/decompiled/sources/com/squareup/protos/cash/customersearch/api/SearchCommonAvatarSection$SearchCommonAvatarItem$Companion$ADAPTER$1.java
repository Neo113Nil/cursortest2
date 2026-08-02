package com.squareup.protos.cash.customersearch.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.customersearch.api.SearchCommonAvatarSection;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.cash.p2p.profile_directory.ui.Text;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SearchCommonAvatarSection$SearchCommonAvatarItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SearchCommonAvatarSection.SearchCommonAvatarItem((Metadata) obj, (Avatar) obj2, (Text) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Metadata.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Avatar.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SearchCommonAvatarSection.SearchCommonAvatarItem searchCommonAvatarItem = (SearchCommonAvatarSection.SearchCommonAvatarItem) obj;
        reverseProtoWriter.getClass();
        searchCommonAvatarItem.getClass();
        reverseProtoWriter.writeBytes(searchCommonAvatarItem.unknownFields());
        Text.ADAPTER.encodeWithTag(reverseProtoWriter, 3, searchCommonAvatarItem.title);
        Avatar.ADAPTER.encodeWithTag(reverseProtoWriter, 2, searchCommonAvatarItem.avatar);
        Metadata.ADAPTER.encodeWithTag(reverseProtoWriter, 1, searchCommonAvatarItem.metadata);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SearchCommonAvatarSection.SearchCommonAvatarItem searchCommonAvatarItem = (SearchCommonAvatarSection.SearchCommonAvatarItem) obj;
        searchCommonAvatarItem.getClass();
        return Text.ADAPTER.encodedSizeWithTag(3, searchCommonAvatarItem.title) + Avatar.ADAPTER.encodedSizeWithTag(2, searchCommonAvatarItem.avatar) + Metadata.ADAPTER.encodedSizeWithTag(1, searchCommonAvatarItem.metadata) + searchCommonAvatarItem.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SearchCommonAvatarSection.SearchCommonAvatarItem searchCommonAvatarItem = (SearchCommonAvatarSection.SearchCommonAvatarItem) obj;
        searchCommonAvatarItem.getClass();
        Metadata metadata = searchCommonAvatarItem.metadata;
        Metadata metadata2 = metadata != null ? (Metadata) Metadata.ADAPTER.redact(metadata) : null;
        Avatar avatar = searchCommonAvatarItem.avatar;
        Avatar avatar2 = avatar != null ? (Avatar) Avatar.ADAPTER.redact(avatar) : null;
        Text text = searchCommonAvatarItem.title;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SearchCommonAvatarSection.SearchCommonAvatarItem(metadata2, avatar2, text2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SearchCommonAvatarSection.SearchCommonAvatarItem searchCommonAvatarItem = (SearchCommonAvatarSection.SearchCommonAvatarItem) obj;
        searchCommonAvatarItem.getClass();
        Metadata.ADAPTER.encodeWithTag(protoWriter, 1, searchCommonAvatarItem.metadata);
        Avatar.ADAPTER.encodeWithTag(protoWriter, 2, searchCommonAvatarItem.avatar);
        Text.ADAPTER.encodeWithTag(protoWriter, 3, searchCommonAvatarItem.title);
        protoWriter.writeBytes(searchCommonAvatarItem.unknownFields());
    }
}
