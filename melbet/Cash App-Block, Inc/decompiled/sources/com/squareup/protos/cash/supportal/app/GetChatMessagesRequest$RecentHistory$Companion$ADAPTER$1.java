package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.GetChatMessagesRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetChatMessagesRequest$RecentHistory$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetChatMessagesRequest.RecentHistory(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetChatMessagesRequest.RecentHistory recentHistory = (GetChatMessagesRequest.RecentHistory) obj;
        reverseProtoWriter.getClass();
        recentHistory.getClass();
        reverseProtoWriter.writeBytes(recentHistory.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetChatMessagesRequest.RecentHistory recentHistory = (GetChatMessagesRequest.RecentHistory) obj;
        recentHistory.getClass();
        return recentHistory.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((GetChatMessagesRequest.RecentHistory) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetChatMessagesRequest.RecentHistory(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetChatMessagesRequest.RecentHistory recentHistory = (GetChatMessagesRequest.RecentHistory) obj;
        recentHistory.getClass();
        protoWriter.writeBytes(recentHistory.unknownFields());
    }
}
