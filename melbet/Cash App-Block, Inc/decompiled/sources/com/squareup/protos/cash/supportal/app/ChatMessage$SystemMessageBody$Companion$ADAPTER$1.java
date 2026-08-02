package com.squareup.protos.cash.supportal.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ChatMessage$SystemMessageBody$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ChatMessage.SystemMessageBody((String) obj, (ChatMessage.SystemMessageBody.Styling) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(ChatMessage.SystemMessageBody.Styling.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ChatMessage.SystemMessageBody systemMessageBody = (ChatMessage.SystemMessageBody) obj;
        reverseProtoWriter.getClass();
        systemMessageBody.getClass();
        reverseProtoWriter.writeBytes(systemMessageBody.unknownFields());
        ChatMessage.SystemMessageBody.Styling.ADAPTER.encodeWithTag(reverseProtoWriter, 2, systemMessageBody.styling);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, systemMessageBody.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ChatMessage.SystemMessageBody systemMessageBody = (ChatMessage.SystemMessageBody) obj;
        systemMessageBody.getClass();
        return ChatMessage.SystemMessageBody.Styling.ADAPTER.encodedSizeWithTag(2, systemMessageBody.styling) + ProtoAdapter.STRING.encodedSizeWithTag(1, systemMessageBody.text) + systemMessageBody.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ChatMessage.SystemMessageBody systemMessageBody = (ChatMessage.SystemMessageBody) obj;
        systemMessageBody.getClass();
        ChatMessage.SystemMessageBody.Styling styling = systemMessageBody.styling;
        ChatMessage.SystemMessageBody.Styling styling2 = styling != null ? (ChatMessage.SystemMessageBody.Styling) ChatMessage.SystemMessageBody.Styling.ADAPTER.redact(styling) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = systemMessageBody.text;
        byteString.getClass();
        return new ChatMessage.SystemMessageBody(str, styling2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ChatMessage.SystemMessageBody systemMessageBody = (ChatMessage.SystemMessageBody) obj;
        systemMessageBody.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, systemMessageBody.text);
        ChatMessage.SystemMessageBody.Styling.ADAPTER.encodeWithTag(protoWriter, 2, systemMessageBody.styling);
        protoWriter.writeBytes(systemMessageBody.unknownFields());
    }
}
