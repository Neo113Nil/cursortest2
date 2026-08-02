package com.squareup.protos.franklin.common;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class P2pPoolComment$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new P2pPoolComment((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        P2pPoolComment p2pPoolComment = (P2pPoolComment) obj;
        reverseProtoWriter.getClass();
        p2pPoolComment.getClass();
        reverseProtoWriter.writeBytes(p2pPoolComment.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, p2pPoolComment.comment_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, p2pPoolComment.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        P2pPoolComment p2pPoolComment = (P2pPoolComment) obj;
        p2pPoolComment.getClass();
        int size$okio = p2pPoolComment.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, p2pPoolComment.comment_id) + protoAdapter.encodedSizeWithTag(1, p2pPoolComment.text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        P2pPoolComment p2pPoolComment = (P2pPoolComment) obj;
        p2pPoolComment.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = p2pPoolComment.text;
        String str2 = p2pPoolComment.comment_id;
        byteString.getClass();
        return new P2pPoolComment(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        P2pPoolComment p2pPoolComment = (P2pPoolComment) obj;
        p2pPoolComment.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, p2pPoolComment.text);
        protoAdapter.encodeWithTag(protoWriter, 2, p2pPoolComment.comment_id);
        protoWriter.writeBytes(p2pPoolComment.unknownFields());
    }
}
