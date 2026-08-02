package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ChatMessage$ChatSystem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ChatMessage.ChatSystem(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ChatMessage.ChatSystem chatSystem = (ChatMessage.ChatSystem) obj;
        reverseProtoWriter.getClass();
        chatSystem.getClass();
        reverseProtoWriter.writeBytes(chatSystem.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ChatMessage.ChatSystem chatSystem = (ChatMessage.ChatSystem) obj;
        chatSystem.getClass();
        return chatSystem.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((ChatMessage.ChatSystem) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ChatMessage.ChatSystem(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ChatMessage.ChatSystem chatSystem = (ChatMessage.ChatSystem) obj;
        chatSystem.getClass();
        protoWriter.writeBytes(chatSystem.unknownFields());
    }
}
