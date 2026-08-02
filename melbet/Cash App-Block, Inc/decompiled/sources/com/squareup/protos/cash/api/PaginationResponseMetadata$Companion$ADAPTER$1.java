package com.squareup.protos.cash.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PaginationResponseMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaginationResponseMetadata((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        PaginationResponseMetadata paginationResponseMetadata = (PaginationResponseMetadata) obj;
        reverseProtoWriter.getClass();
        paginationResponseMetadata.getClass();
        reverseProtoWriter.writeBytes(paginationResponseMetadata.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, paginationResponseMetadata.cursor);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaginationResponseMetadata paginationResponseMetadata = (PaginationResponseMetadata) obj;
        paginationResponseMetadata.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, paginationResponseMetadata.cursor) + paginationResponseMetadata.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaginationResponseMetadata paginationResponseMetadata = (PaginationResponseMetadata) obj;
        paginationResponseMetadata.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = paginationResponseMetadata.cursor;
        byteString.getClass();
        return new PaginationResponseMetadata(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaginationResponseMetadata paginationResponseMetadata = (PaginationResponseMetadata) obj;
        paginationResponseMetadata.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, paginationResponseMetadata.cursor);
        protoWriter.writeBytes(paginationResponseMetadata.unknownFields());
    }
}
