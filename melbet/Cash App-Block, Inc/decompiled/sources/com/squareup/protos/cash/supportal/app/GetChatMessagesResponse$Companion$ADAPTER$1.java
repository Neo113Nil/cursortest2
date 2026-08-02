package com.squareup.protos.cash.supportal.app;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.supportal.app.GetChatMessagesResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetChatMessagesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetChatMessagesResponse(m, (Boolean) obj, (Boolean) obj2, (GetChatMessagesResponse.Conversation) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(ChatMessage.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 3) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(GetChatMessagesResponse.Conversation.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetChatMessagesResponse getChatMessagesResponse = (GetChatMessagesResponse) obj;
        reverseProtoWriter.getClass();
        getChatMessagesResponse.getClass();
        reverseProtoWriter.writeBytes(getChatMessagesResponse.unknownFields());
        GetChatMessagesResponse.Conversation.ADAPTER.encodeWithTag(reverseProtoWriter, 4, getChatMessagesResponse.active_conversation);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, getChatMessagesResponse.more_after);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, getChatMessagesResponse.more_before);
        ChatMessage.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, getChatMessagesResponse.messages);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetChatMessagesResponse getChatMessagesResponse = (GetChatMessagesResponse) obj;
        getChatMessagesResponse.getClass();
        int encodedSizeWithTag = ChatMessage.ADAPTER.asRepeated().encodedSizeWithTag(1, getChatMessagesResponse.messages) + getChatMessagesResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return GetChatMessagesResponse.Conversation.ADAPTER.encodedSizeWithTag(4, getChatMessagesResponse.active_conversation) + protoAdapter.encodedSizeWithTag(3, getChatMessagesResponse.more_after) + protoAdapter.encodedSizeWithTag(2, getChatMessagesResponse.more_before) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetChatMessagesResponse getChatMessagesResponse = (GetChatMessagesResponse) obj;
        getChatMessagesResponse.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getChatMessagesResponse.messages, ChatMessage.ADAPTER);
        GetChatMessagesResponse.Conversation conversation = getChatMessagesResponse.active_conversation;
        GetChatMessagesResponse.Conversation conversation2 = conversation != null ? (GetChatMessagesResponse.Conversation) GetChatMessagesResponse.Conversation.ADAPTER.redact(conversation) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = getChatMessagesResponse.more_before;
        Boolean bool2 = getChatMessagesResponse.more_after;
        byteString.getClass();
        return new GetChatMessagesResponse(m1169redactElements, bool, bool2, conversation2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetChatMessagesResponse getChatMessagesResponse = (GetChatMessagesResponse) obj;
        getChatMessagesResponse.getClass();
        ChatMessage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getChatMessagesResponse.messages);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 2, getChatMessagesResponse.more_before);
        protoAdapter.encodeWithTag(protoWriter, 3, getChatMessagesResponse.more_after);
        GetChatMessagesResponse.Conversation.ADAPTER.encodeWithTag(protoWriter, 4, getChatMessagesResponse.active_conversation);
        protoWriter.writeBytes(getChatMessagesResponse.unknownFields());
    }
}
