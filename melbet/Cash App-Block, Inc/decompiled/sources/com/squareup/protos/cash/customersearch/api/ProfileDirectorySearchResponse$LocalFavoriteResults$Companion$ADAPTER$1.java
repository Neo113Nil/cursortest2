package com.squareup.protos.cash.customersearch.api;

import com.squareup.protos.cash.customersearch.api.ProfileDirectorySearchResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ProfileDirectorySearchResponse$LocalFavoriteResults$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ProfileDirectorySearchResponse.LocalFavoriteResults(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ProfileDirectorySearchResponse.LocalFavoriteResults localFavoriteResults = (ProfileDirectorySearchResponse.LocalFavoriteResults) obj;
        reverseProtoWriter.getClass();
        localFavoriteResults.getClass();
        reverseProtoWriter.writeBytes(localFavoriteResults.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ProfileDirectorySearchResponse.LocalFavoriteResults localFavoriteResults = (ProfileDirectorySearchResponse.LocalFavoriteResults) obj;
        localFavoriteResults.getClass();
        return localFavoriteResults.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((ProfileDirectorySearchResponse.LocalFavoriteResults) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ProfileDirectorySearchResponse.LocalFavoriteResults(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ProfileDirectorySearchResponse.LocalFavoriteResults localFavoriteResults = (ProfileDirectorySearchResponse.LocalFavoriteResults) obj;
        localFavoriteResults.getClass();
        protoWriter.writeBytes(localFavoriteResults.unknownFields());
    }
}
