package com.squareup.protos.cash.cashautomationtooling.api.v1.external;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AttachmentIdentifier$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AttachmentIdentifier((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        AttachmentIdentifier attachmentIdentifier = (AttachmentIdentifier) obj;
        reverseProtoWriter.getClass();
        attachmentIdentifier.getClass();
        reverseProtoWriter.writeBytes(attachmentIdentifier.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, attachmentIdentifier.file_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AttachmentIdentifier attachmentIdentifier = (AttachmentIdentifier) obj;
        attachmentIdentifier.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, attachmentIdentifier.file_token) + attachmentIdentifier.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AttachmentIdentifier attachmentIdentifier = (AttachmentIdentifier) obj;
        attachmentIdentifier.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = attachmentIdentifier.file_token;
        byteString.getClass();
        return new AttachmentIdentifier(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AttachmentIdentifier attachmentIdentifier = (AttachmentIdentifier) obj;
        attachmentIdentifier.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, attachmentIdentifier.file_token);
        protoWriter.writeBytes(attachmentIdentifier.unknownFields());
    }
}
