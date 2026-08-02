package com.squareup.protos.cash.customersearch.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.customersearch.api.SearchCommonTextRowItem;
import com.squareup.protos.cash.p2p.profile_directory.ui.HighlightText;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SearchCommonTextRowItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SearchCommonTextRowItem((SearchCommonTextRowItem.Metadata) obj, (HighlightText) obj2, (Image) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(SearchCommonTextRowItem.Metadata.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(HighlightText.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SearchCommonTextRowItem searchCommonTextRowItem = (SearchCommonTextRowItem) obj;
        reverseProtoWriter.getClass();
        searchCommonTextRowItem.getClass();
        reverseProtoWriter.writeBytes(searchCommonTextRowItem.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 4, searchCommonTextRowItem.action_url);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 3, searchCommonTextRowItem.icon);
        HighlightText.ADAPTER.encodeWithTag(reverseProtoWriter, 2, searchCommonTextRowItem.text);
        SearchCommonTextRowItem.Metadata.ADAPTER.encodeWithTag(reverseProtoWriter, 1, searchCommonTextRowItem.metadata);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SearchCommonTextRowItem searchCommonTextRowItem = (SearchCommonTextRowItem) obj;
        searchCommonTextRowItem.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(4, searchCommonTextRowItem.action_url) + Image.ADAPTER.encodedSizeWithTag(3, searchCommonTextRowItem.icon) + HighlightText.ADAPTER.encodedSizeWithTag(2, searchCommonTextRowItem.text) + SearchCommonTextRowItem.Metadata.ADAPTER.encodedSizeWithTag(1, searchCommonTextRowItem.metadata) + searchCommonTextRowItem.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SearchCommonTextRowItem searchCommonTextRowItem = (SearchCommonTextRowItem) obj;
        searchCommonTextRowItem.getClass();
        SearchCommonTextRowItem.Metadata metadata = searchCommonTextRowItem.metadata;
        SearchCommonTextRowItem.Metadata metadata2 = metadata != null ? (SearchCommonTextRowItem.Metadata) SearchCommonTextRowItem.Metadata.ADAPTER.redact(metadata) : null;
        HighlightText highlightText = searchCommonTextRowItem.text;
        HighlightText highlightText2 = highlightText != null ? (HighlightText) HighlightText.ADAPTER.redact(highlightText) : null;
        Image image = searchCommonTextRowItem.icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SearchCommonTextRowItem(metadata2, highlightText2, image2, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SearchCommonTextRowItem searchCommonTextRowItem = (SearchCommonTextRowItem) obj;
        searchCommonTextRowItem.getClass();
        SearchCommonTextRowItem.Metadata.ADAPTER.encodeWithTag(protoWriter, 1, searchCommonTextRowItem.metadata);
        HighlightText.ADAPTER.encodeWithTag(protoWriter, 2, searchCommonTextRowItem.text);
        Image.ADAPTER.encodeWithTag(protoWriter, 3, searchCommonTextRowItem.icon);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, searchCommonTextRowItem.action_url);
        protoWriter.writeBytes(searchCommonTextRowItem.unknownFields());
    }
}
