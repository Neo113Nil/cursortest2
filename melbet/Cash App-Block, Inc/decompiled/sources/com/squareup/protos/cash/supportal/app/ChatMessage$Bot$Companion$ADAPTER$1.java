package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ChatMessage$Bot$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ChatMessage.Bot(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ChatMessage.Bot bot = (ChatMessage.Bot) obj;
        reverseProtoWriter.getClass();
        bot.getClass();
        reverseProtoWriter.writeBytes(bot.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ChatMessage.Bot bot = (ChatMessage.Bot) obj;
        bot.getClass();
        return bot.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((ChatMessage.Bot) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ChatMessage.Bot(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ChatMessage.Bot bot = (ChatMessage.Bot) obj;
        bot.getClass();
        protoWriter.writeBytes(bot.unknownFields());
    }
}
