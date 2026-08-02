package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.GetChatMessagesResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetChatMessagesResponse$Conversation$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetChatMessagesResponse.Conversation((GetChatMessagesResponse.Conversation.BotStatus) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = GetChatMessagesResponse.Conversation.BotStatus.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetChatMessagesResponse.Conversation conversation = (GetChatMessagesResponse.Conversation) obj;
        reverseProtoWriter.getClass();
        conversation.getClass();
        reverseProtoWriter.writeBytes(conversation.unknownFields());
        GetChatMessagesResponse.Conversation.BotStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 1, conversation.bot_status);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetChatMessagesResponse.Conversation conversation = (GetChatMessagesResponse.Conversation) obj;
        conversation.getClass();
        return GetChatMessagesResponse.Conversation.BotStatus.ADAPTER.encodedSizeWithTag(1, conversation.bot_status) + conversation.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetChatMessagesResponse.Conversation conversation = (GetChatMessagesResponse.Conversation) obj;
        conversation.getClass();
        ByteString byteString = ByteString.EMPTY;
        GetChatMessagesResponse.Conversation.BotStatus botStatus = conversation.bot_status;
        byteString.getClass();
        return new GetChatMessagesResponse.Conversation(botStatus, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetChatMessagesResponse.Conversation conversation = (GetChatMessagesResponse.Conversation) obj;
        conversation.getClass();
        GetChatMessagesResponse.Conversation.BotStatus.ADAPTER.encodeWithTag(protoWriter, 1, conversation.bot_status);
        protoWriter.writeBytes(conversation.unknownFields());
    }
}
