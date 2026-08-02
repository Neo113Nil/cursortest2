package com.squareup.protos.cash.customersearch.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.customersearch.api.SearchCommonCardSection;
import com.squareup.protos.cash.p2p.profile_directory.ui.Text;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SearchCommonCardSection$SearchCommonCardItem$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SearchCommonCardSection.SearchCommonCardItem((Metadata) obj, (Image) obj2, (Text) obj3, (Text) obj4, (Text) obj5, (Text) obj6, (String) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(Metadata.ADAPTER, protoReader, obj);
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
                    obj5 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SearchCommonCardSection.SearchCommonCardItem searchCommonCardItem = (SearchCommonCardSection.SearchCommonCardItem) obj;
        reverseProtoWriter.getClass();
        searchCommonCardItem.getClass();
        reverseProtoWriter.writeBytes(searchCommonCardItem.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 7, searchCommonCardItem.item_action_url);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, searchCommonCardItem.tertiary_right_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, searchCommonCardItem.tertiary_left_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, searchCommonCardItem.secondary_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, searchCommonCardItem.primary_text);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 2, searchCommonCardItem.picture);
        Metadata.ADAPTER.encodeWithTag(reverseProtoWriter, 1, searchCommonCardItem.metadata);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SearchCommonCardSection.SearchCommonCardItem searchCommonCardItem = (SearchCommonCardSection.SearchCommonCardItem) obj;
        searchCommonCardItem.getClass();
        int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(2, searchCommonCardItem.picture) + Metadata.ADAPTER.encodedSizeWithTag(1, searchCommonCardItem.metadata) + searchCommonCardItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        return ProtoAdapter.STRING.encodedSizeWithTag(7, searchCommonCardItem.item_action_url) + protoAdapter.encodedSizeWithTag(6, searchCommonCardItem.tertiary_right_text) + protoAdapter.encodedSizeWithTag(5, searchCommonCardItem.tertiary_left_text) + protoAdapter.encodedSizeWithTag(4, searchCommonCardItem.secondary_text) + protoAdapter.encodedSizeWithTag(3, searchCommonCardItem.primary_text) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SearchCommonCardSection.SearchCommonCardItem searchCommonCardItem = (SearchCommonCardSection.SearchCommonCardItem) obj;
        searchCommonCardItem.getClass();
        Metadata metadata = searchCommonCardItem.metadata;
        Metadata metadata2 = metadata != null ? (Metadata) Metadata.ADAPTER.redact(metadata) : null;
        Image image = searchCommonCardItem.picture;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        Text text = searchCommonCardItem.primary_text;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = searchCommonCardItem.secondary_text;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        Text text5 = searchCommonCardItem.tertiary_left_text;
        Text text6 = text5 != null ? (Text) Text.ADAPTER.redact(text5) : null;
        Text text7 = searchCommonCardItem.tertiary_right_text;
        Text text8 = text7 != null ? (Text) Text.ADAPTER.redact(text7) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SearchCommonCardSection.SearchCommonCardItem(metadata2, image2, text2, text4, text6, text8, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SearchCommonCardSection.SearchCommonCardItem searchCommonCardItem = (SearchCommonCardSection.SearchCommonCardItem) obj;
        searchCommonCardItem.getClass();
        Metadata.ADAPTER.encodeWithTag(protoWriter, 1, searchCommonCardItem.metadata);
        Image.ADAPTER.encodeWithTag(protoWriter, 2, searchCommonCardItem.picture);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, searchCommonCardItem.primary_text);
        protoAdapter.encodeWithTag(protoWriter, 4, searchCommonCardItem.secondary_text);
        protoAdapter.encodeWithTag(protoWriter, 5, searchCommonCardItem.tertiary_left_text);
        protoAdapter.encodeWithTag(protoWriter, 6, searchCommonCardItem.tertiary_right_text);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, searchCommonCardItem.item_action_url);
        protoWriter.writeBytes(searchCommonCardItem.unknownFields());
    }
}
