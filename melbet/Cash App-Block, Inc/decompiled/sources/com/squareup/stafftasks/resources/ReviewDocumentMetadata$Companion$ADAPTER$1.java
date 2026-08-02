package com.squareup.stafftasks.resources;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ReviewDocumentMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ReviewDocumentMetadata((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ReviewDocumentMetadata reviewDocumentMetadata = (ReviewDocumentMetadata) obj;
        reverseProtoWriter.getClass();
        reviewDocumentMetadata.getClass();
        reverseProtoWriter.writeBytes(reviewDocumentMetadata.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, reviewDocumentMetadata.file_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, reviewDocumentMetadata.instructions);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ReviewDocumentMetadata reviewDocumentMetadata = (ReviewDocumentMetadata) obj;
        reviewDocumentMetadata.getClass();
        int size$okio = reviewDocumentMetadata.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, reviewDocumentMetadata.file_id) + protoAdapter.encodedSizeWithTag(1, reviewDocumentMetadata.instructions) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ReviewDocumentMetadata reviewDocumentMetadata = (ReviewDocumentMetadata) obj;
        reviewDocumentMetadata.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = reviewDocumentMetadata.file_id;
        byteString.getClass();
        return new ReviewDocumentMetadata(null, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ReviewDocumentMetadata reviewDocumentMetadata = (ReviewDocumentMetadata) obj;
        reviewDocumentMetadata.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, reviewDocumentMetadata.instructions);
        protoAdapter.encodeWithTag(protoWriter, 2, reviewDocumentMetadata.file_id);
        protoWriter.writeBytes(reviewDocumentMetadata.unknownFields());
    }
}
