package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ChatMessage$SelectTransaction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ChatMessage.SelectTransaction((ByteString) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BYTES.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ChatMessage.SelectTransaction selectTransaction = (ChatMessage.SelectTransaction) obj;
        reverseProtoWriter.getClass();
        selectTransaction.getClass();
        reverseProtoWriter.writeBytes(selectTransaction.unknownFields());
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 1, selectTransaction.payload);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ChatMessage.SelectTransaction selectTransaction = (ChatMessage.SelectTransaction) obj;
        selectTransaction.getClass();
        return ProtoAdapter.BYTES.encodedSizeWithTag(1, selectTransaction.payload) + selectTransaction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ChatMessage.SelectTransaction selectTransaction = (ChatMessage.SelectTransaction) obj;
        selectTransaction.getClass();
        ByteString byteString = ByteString.EMPTY;
        ByteString byteString2 = selectTransaction.payload;
        byteString.getClass();
        return new ChatMessage.SelectTransaction(byteString2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ChatMessage.SelectTransaction selectTransaction = (ChatMessage.SelectTransaction) obj;
        selectTransaction.getClass();
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, selectTransaction.payload);
        protoWriter.writeBytes(selectTransaction.unknownFields());
    }
}
