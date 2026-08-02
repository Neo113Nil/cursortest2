package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.GetChatMessagesRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetChatMessagesRequest$After$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetChatMessagesRequest.After((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        GetChatMessagesRequest.After after = (GetChatMessagesRequest.After) obj;
        reverseProtoWriter.getClass();
        after.getClass();
        reverseProtoWriter.writeBytes(after.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, after.message_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetChatMessagesRequest.After after = (GetChatMessagesRequest.After) obj;
        after.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, after.message_token) + after.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetChatMessagesRequest.After after = (GetChatMessagesRequest.After) obj;
        after.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = after.message_token;
        byteString.getClass();
        return new GetChatMessagesRequest.After(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetChatMessagesRequest.After after = (GetChatMessagesRequest.After) obj;
        after.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, after.message_token);
        protoWriter.writeBytes(after.unknownFields());
    }
}
