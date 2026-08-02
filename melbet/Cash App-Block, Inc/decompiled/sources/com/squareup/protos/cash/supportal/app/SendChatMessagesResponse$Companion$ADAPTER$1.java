package com.squareup.protos.cash.supportal.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SendChatMessagesResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SendChatMessagesResponse(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SendChatMessagesResponse sendChatMessagesResponse = (SendChatMessagesResponse) obj;
        reverseProtoWriter.getClass();
        sendChatMessagesResponse.getClass();
        reverseProtoWriter.writeBytes(sendChatMessagesResponse.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SendChatMessagesResponse sendChatMessagesResponse = (SendChatMessagesResponse) obj;
        sendChatMessagesResponse.getClass();
        return sendChatMessagesResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((SendChatMessagesResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SendChatMessagesResponse(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SendChatMessagesResponse sendChatMessagesResponse = (SendChatMessagesResponse) obj;
        sendChatMessagesResponse.getClass();
        protoWriter.writeBytes(sendChatMessagesResponse.unknownFields());
    }
}
