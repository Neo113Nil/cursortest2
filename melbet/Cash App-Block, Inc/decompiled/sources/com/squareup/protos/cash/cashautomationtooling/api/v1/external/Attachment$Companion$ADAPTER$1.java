package com.squareup.protos.cash.cashautomationtooling.api.v1.external;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Attachment$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Attachment((AttachmentIdentifier) obj, (String) obj2, (ByteString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(AttachmentIdentifier.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.BYTES.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Attachment attachment = (Attachment) obj;
        reverseProtoWriter.getClass();
        attachment.getClass();
        reverseProtoWriter.writeBytes(attachment.unknownFields());
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 3, attachment.file_data);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, attachment.file_name);
        AttachmentIdentifier.ADAPTER.encodeWithTag(reverseProtoWriter, 1, attachment.attachment_identifier);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Attachment attachment = (Attachment) obj;
        attachment.getClass();
        return ProtoAdapter.BYTES.encodedSizeWithTag(3, attachment.file_data) + ProtoAdapter.STRING.encodedSizeWithTag(2, attachment.file_name) + AttachmentIdentifier.ADAPTER.encodedSizeWithTag(1, attachment.attachment_identifier) + attachment.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Attachment attachment = (Attachment) obj;
        attachment.getClass();
        AttachmentIdentifier attachmentIdentifier = attachment.attachment_identifier;
        AttachmentIdentifier attachmentIdentifier2 = attachmentIdentifier != null ? (AttachmentIdentifier) AttachmentIdentifier.ADAPTER.redact(attachmentIdentifier) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = attachment.file_name;
        byteString.getClass();
        return new Attachment(attachmentIdentifier2, str, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Attachment attachment = (Attachment) obj;
        attachment.getClass();
        AttachmentIdentifier.ADAPTER.encodeWithTag(protoWriter, 1, attachment.attachment_identifier);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, attachment.file_name);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, attachment.file_data);
        protoWriter.writeBytes(attachment.unknownFields());
    }
}
