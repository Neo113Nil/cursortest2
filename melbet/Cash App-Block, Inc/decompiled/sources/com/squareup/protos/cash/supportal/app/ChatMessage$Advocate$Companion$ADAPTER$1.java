package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ChatMessage$Advocate$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ChatMessage.Advocate((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        ChatMessage.Advocate advocate = (ChatMessage.Advocate) obj;
        reverseProtoWriter.getClass();
        advocate.getClass();
        reverseProtoWriter.writeBytes(advocate.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, advocate.display_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ChatMessage.Advocate advocate = (ChatMessage.Advocate) obj;
        advocate.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, advocate.display_name) + advocate.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ChatMessage.Advocate advocate = (ChatMessage.Advocate) obj;
        advocate.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = advocate.display_name;
        byteString.getClass();
        return new ChatMessage.Advocate(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ChatMessage.Advocate advocate = (ChatMessage.Advocate) obj;
        advocate.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, advocate.display_name);
        protoWriter.writeBytes(advocate.unknownFields());
    }
}
