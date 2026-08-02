package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.SupportChatStatusResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SupportChatStatusResponse$Granted$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SupportChatStatusResponse.Granted((Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SupportChatStatusResponse.Granted granted = (SupportChatStatusResponse.Granted) obj;
        reverseProtoWriter.getClass();
        granted.getClass();
        reverseProtoWriter.writeBytes(granted.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, granted.has_active_chat);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SupportChatStatusResponse.Granted granted = (SupportChatStatusResponse.Granted) obj;
        granted.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(1, granted.has_active_chat) + granted.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SupportChatStatusResponse.Granted granted = (SupportChatStatusResponse.Granted) obj;
        granted.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = granted.has_active_chat;
        byteString.getClass();
        return new SupportChatStatusResponse.Granted(bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SupportChatStatusResponse.Granted granted = (SupportChatStatusResponse.Granted) obj;
        granted.getClass();
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, granted.has_active_chat);
        protoWriter.writeBytes(granted.unknownFields());
    }
}
