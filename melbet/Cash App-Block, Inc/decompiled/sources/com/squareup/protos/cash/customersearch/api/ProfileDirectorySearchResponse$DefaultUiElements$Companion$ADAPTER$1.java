package com.squareup.protos.cash.customersearch.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.customersearch.api.ProfileDirectorySearchResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ProfileDirectorySearchResponse$DefaultUiElements$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ProfileDirectorySearchResponse.DefaultUiElements((ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProfileDirectorySearchResponse.DefaultUiElements defaultUiElements = (ProfileDirectorySearchResponse.DefaultUiElements) obj;
        reverseProtoWriter.getClass();
        defaultUiElements.getClass();
        reverseProtoWriter.writeBytes(defaultUiElements.unknownFields());
        ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.ADAPTER.encodeWithTag(reverseProtoWriter, 1, defaultUiElements.see_more_row);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProfileDirectorySearchResponse.DefaultUiElements defaultUiElements = (ProfileDirectorySearchResponse.DefaultUiElements) obj;
        defaultUiElements.getClass();
        return ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.ADAPTER.encodedSizeWithTag(1, defaultUiElements.see_more_row) + defaultUiElements.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProfileDirectorySearchResponse.DefaultUiElements defaultUiElements = (ProfileDirectorySearchResponse.DefaultUiElements) obj;
        defaultUiElements.getClass();
        ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow seeMoreRow = defaultUiElements.see_more_row;
        ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow seeMoreRow2 = seeMoreRow != null ? (ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow) ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.ADAPTER.redact(seeMoreRow) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ProfileDirectorySearchResponse.DefaultUiElements(seeMoreRow2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProfileDirectorySearchResponse.DefaultUiElements defaultUiElements = (ProfileDirectorySearchResponse.DefaultUiElements) obj;
        defaultUiElements.getClass();
        ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.ADAPTER.encodeWithTag(protoWriter, 1, defaultUiElements.see_more_row);
        protoWriter.writeBytes(defaultUiElements.unknownFields());
    }
}
