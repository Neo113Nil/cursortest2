package com.squareup.protos.cash.customersearch.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.customersearch.api.ProfileDirectorySearchResponse;
import com.squareup.protos.cash.p2p.profile_directory.ui.HighlightText;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ProfileDirectorySearchResponse$DefaultUiElements$SeeMoreRow$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow((Image) obj, (HighlightText) obj2, (HighlightText) obj3, (ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.Metadata) obj4, (Integer) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(HighlightText.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(HighlightText.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.Metadata.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow seeMoreRow = (ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow) obj;
        reverseProtoWriter.getClass();
        seeMoreRow.getClass();
        reverseProtoWriter.writeBytes(seeMoreRow.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 5, seeMoreRow.index);
        ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.Metadata.ADAPTER.encodeWithTag(reverseProtoWriter, 4, seeMoreRow.metadata);
        ProtoAdapter protoAdapter = HighlightText.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, seeMoreRow.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, seeMoreRow.title);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, seeMoreRow.image);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow seeMoreRow = (ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow) obj;
        seeMoreRow.getClass();
        int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, seeMoreRow.image) + seeMoreRow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = HighlightText.ADAPTER;
        return ProtoAdapter.INT32.encodedSizeWithTag(5, seeMoreRow.index) + ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.Metadata.ADAPTER.encodedSizeWithTag(4, seeMoreRow.metadata) + protoAdapter.encodedSizeWithTag(3, seeMoreRow.subtitle) + protoAdapter.encodedSizeWithTag(2, seeMoreRow.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow seeMoreRow = (ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow) obj;
        seeMoreRow.getClass();
        Image image = seeMoreRow.image;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        HighlightText highlightText = seeMoreRow.title;
        HighlightText highlightText2 = highlightText != null ? (HighlightText) HighlightText.ADAPTER.redact(highlightText) : null;
        HighlightText highlightText3 = seeMoreRow.subtitle;
        HighlightText highlightText4 = highlightText3 != null ? (HighlightText) HighlightText.ADAPTER.redact(highlightText3) : null;
        ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.Metadata metadata = seeMoreRow.metadata;
        ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.Metadata metadata2 = metadata != null ? (ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.Metadata) ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.Metadata.ADAPTER.redact(metadata) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = seeMoreRow.index;
        byteString.getClass();
        return new ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow(image2, highlightText2, highlightText4, metadata2, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow seeMoreRow = (ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow) obj;
        seeMoreRow.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, seeMoreRow.image);
        ProtoAdapter protoAdapter = HighlightText.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, seeMoreRow.title);
        protoAdapter.encodeWithTag(protoWriter, 3, seeMoreRow.subtitle);
        ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.Metadata.ADAPTER.encodeWithTag(protoWriter, 4, seeMoreRow.metadata);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, seeMoreRow.index);
        protoWriter.writeBytes(seeMoreRow.unknownFields());
    }
}
