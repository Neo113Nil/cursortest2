package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ChatMessage$TransactionBody$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ChatMessage.TransactionBody((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        ChatMessage.TransactionBody transactionBody = (ChatMessage.TransactionBody) obj;
        reverseProtoWriter.getClass();
        transactionBody.getClass();
        reverseProtoWriter.writeBytes(transactionBody.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, transactionBody.entity_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ChatMessage.TransactionBody transactionBody = (ChatMessage.TransactionBody) obj;
        transactionBody.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, transactionBody.entity_id) + transactionBody.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ChatMessage.TransactionBody transactionBody = (ChatMessage.TransactionBody) obj;
        transactionBody.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = transactionBody.entity_id;
        byteString.getClass();
        return new ChatMessage.TransactionBody(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ChatMessage.TransactionBody transactionBody = (ChatMessage.TransactionBody) obj;
        transactionBody.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, transactionBody.entity_id);
        protoWriter.writeBytes(transactionBody.unknownFields());
    }
}
