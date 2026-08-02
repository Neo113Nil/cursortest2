package com.squareup.protos.cash.customersearch.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.p2p.profile_directory.ui.Text;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SearchCommonMessageSection$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new SearchCommonMessageSection((Image) obj, (Text) obj2, (Text) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SearchCommonMessageSection searchCommonMessageSection = (SearchCommonMessageSection) obj;
        reverseProtoWriter.getClass();
        searchCommonMessageSection.getClass();
        reverseProtoWriter.writeBytes(searchCommonMessageSection.unknownFields());
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, searchCommonMessageSection.secondary_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, searchCommonMessageSection.primary_text);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, searchCommonMessageSection.picture);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SearchCommonMessageSection searchCommonMessageSection = (SearchCommonMessageSection) obj;
        searchCommonMessageSection.getClass();
        int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, searchCommonMessageSection.picture) + searchCommonMessageSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Text.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, searchCommonMessageSection.secondary_text) + protoAdapter.encodedSizeWithTag(2, searchCommonMessageSection.primary_text) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SearchCommonMessageSection searchCommonMessageSection = (SearchCommonMessageSection) obj;
        searchCommonMessageSection.getClass();
        Image image = searchCommonMessageSection.picture;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        Text text = searchCommonMessageSection.primary_text;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        Text text3 = searchCommonMessageSection.secondary_text;
        Text text4 = text3 != null ? (Text) Text.ADAPTER.redact(text3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SearchCommonMessageSection(image2, text2, text4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SearchCommonMessageSection searchCommonMessageSection = (SearchCommonMessageSection) obj;
        searchCommonMessageSection.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, searchCommonMessageSection.picture);
        ProtoAdapter protoAdapter = Text.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, searchCommonMessageSection.primary_text);
        protoAdapter.encodeWithTag(protoWriter, 3, searchCommonMessageSection.secondary_text);
        protoWriter.writeBytes(searchCommonMessageSection.unknownFields());
    }
}
