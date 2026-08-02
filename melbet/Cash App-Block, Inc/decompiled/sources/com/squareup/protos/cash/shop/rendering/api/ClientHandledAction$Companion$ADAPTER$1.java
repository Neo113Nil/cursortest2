package com.squareup.protos.cash.shop.rendering.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ClientHandledAction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ClientHandledAction(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ClientHandledAction clientHandledAction = (ClientHandledAction) obj;
        reverseProtoWriter.getClass();
        clientHandledAction.getClass();
        reverseProtoWriter.writeBytes(clientHandledAction.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ClientHandledAction clientHandledAction = (ClientHandledAction) obj;
        clientHandledAction.getClass();
        return clientHandledAction.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((ClientHandledAction) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ClientHandledAction(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClientHandledAction clientHandledAction = (ClientHandledAction) obj;
        clientHandledAction.getClass();
        protoWriter.writeBytes(clientHandledAction.unknownFields());
    }
}
