package com.squareup.stafftasks.resources;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UploadDocumentMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UploadDocumentMetadata((String) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UploadDocumentMetadata uploadDocumentMetadata = (UploadDocumentMetadata) obj;
        reverseProtoWriter.getClass();
        uploadDocumentMetadata.getClass();
        reverseProtoWriter.writeBytes(uploadDocumentMetadata.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, uploadDocumentMetadata.show_only_documents_linked_to_task);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, uploadDocumentMetadata.instructions);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UploadDocumentMetadata uploadDocumentMetadata = (UploadDocumentMetadata) obj;
        uploadDocumentMetadata.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(2, uploadDocumentMetadata.show_only_documents_linked_to_task) + ProtoAdapter.STRING.encodedSizeWithTag(1, uploadDocumentMetadata.instructions) + uploadDocumentMetadata.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UploadDocumentMetadata uploadDocumentMetadata = (UploadDocumentMetadata) obj;
        uploadDocumentMetadata.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = uploadDocumentMetadata.show_only_documents_linked_to_task;
        byteString.getClass();
        return new UploadDocumentMetadata(null, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UploadDocumentMetadata uploadDocumentMetadata = (UploadDocumentMetadata) obj;
        uploadDocumentMetadata.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, uploadDocumentMetadata.instructions);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, uploadDocumentMetadata.show_only_documents_linked_to_task);
        protoWriter.writeBytes(uploadDocumentMetadata.unknownFields());
    }
}
