package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ChatMessage$Customer$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ChatMessage.Customer(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ChatMessage.Customer customer = (ChatMessage.Customer) obj;
        reverseProtoWriter.getClass();
        customer.getClass();
        reverseProtoWriter.writeBytes(customer.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ChatMessage.Customer customer = (ChatMessage.Customer) obj;
        customer.getClass();
        return customer.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((ChatMessage.Customer) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ChatMessage.Customer(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ChatMessage.Customer customer = (ChatMessage.Customer) obj;
        customer.getClass();
        protoWriter.writeBytes(customer.unknownFields());
    }
}
