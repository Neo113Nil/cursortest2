package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.GetChatMessagesRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetChatMessagesRequest$Before$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetChatMessagesRequest.Before((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        GetChatMessagesRequest.Before before = (GetChatMessagesRequest.Before) obj;
        reverseProtoWriter.getClass();
        before.getClass();
        reverseProtoWriter.writeBytes(before.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, before.message_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetChatMessagesRequest.Before before = (GetChatMessagesRequest.Before) obj;
        before.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, before.message_token) + before.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetChatMessagesRequest.Before before = (GetChatMessagesRequest.Before) obj;
        before.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = before.message_token;
        byteString.getClass();
        return new GetChatMessagesRequest.Before(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetChatMessagesRequest.Before before = (GetChatMessagesRequest.Before) obj;
        before.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, before.message_token);
        protoWriter.writeBytes(before.unknownFields());
    }
}
