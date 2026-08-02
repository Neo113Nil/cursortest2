package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ChatMessage$SuggestedReply$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ChatMessage.SuggestedReply((String) obj, (String) obj2, (ByteString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
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
        ChatMessage.SuggestedReply suggestedReply = (ChatMessage.SuggestedReply) obj;
        reverseProtoWriter.getClass();
        suggestedReply.getClass();
        reverseProtoWriter.writeBytes(suggestedReply.unknownFields());
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 3, suggestedReply.payload);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, suggestedReply.text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, suggestedReply.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ChatMessage.SuggestedReply suggestedReply = (ChatMessage.SuggestedReply) obj;
        suggestedReply.getClass();
        int size$okio = suggestedReply.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.BYTES.encodedSizeWithTag(3, suggestedReply.payload) + protoAdapter.encodedSizeWithTag(2, suggestedReply.text) + protoAdapter.encodedSizeWithTag(1, suggestedReply.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ChatMessage.SuggestedReply suggestedReply = (ChatMessage.SuggestedReply) obj;
        suggestedReply.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = suggestedReply.token;
        String str2 = suggestedReply.text;
        ByteString byteString2 = suggestedReply.payload;
        byteString.getClass();
        return new ChatMessage.SuggestedReply(str, str2, byteString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ChatMessage.SuggestedReply suggestedReply = (ChatMessage.SuggestedReply) obj;
        suggestedReply.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, suggestedReply.token);
        protoAdapter.encodeWithTag(protoWriter, 2, suggestedReply.text);
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, suggestedReply.payload);
        protoWriter.writeBytes(suggestedReply.unknownFields());
    }
}
