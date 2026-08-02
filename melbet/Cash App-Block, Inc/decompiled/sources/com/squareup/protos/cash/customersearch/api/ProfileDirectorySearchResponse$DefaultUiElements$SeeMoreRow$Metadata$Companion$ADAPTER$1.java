package com.squareup.protos.cash.customersearch.api;

import com.squareup.protos.cash.customersearch.api.ProfileDirectorySearchResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ProfileDirectorySearchResponse$DefaultUiElements$SeeMoreRow$Metadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.Metadata((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.Metadata metadata = (ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.Metadata) obj;
        reverseProtoWriter.getClass();
        metadata.getClass();
        reverseProtoWriter.writeBytes(metadata.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, metadata.query_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.Metadata metadata = (ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.Metadata) obj;
        metadata.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, metadata.query_token) + metadata.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.Metadata metadata = (ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.Metadata) obj;
        metadata.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = metadata.query_token;
        byteString.getClass();
        return new ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.Metadata(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.Metadata metadata = (ProfileDirectorySearchResponse.DefaultUiElements.SeeMoreRow.Metadata) obj;
        metadata.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, metadata.query_token);
        protoWriter.writeBytes(metadata.unknownFields());
    }
}
