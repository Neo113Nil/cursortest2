package com.squareup.protos.multipass.service;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ClientSessionToken$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ClientSessionToken((ByteString) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        ClientSessionToken clientSessionToken = (ClientSessionToken) obj;
        reverseProtoWriter.getClass();
        clientSessionToken.getClass();
        reverseProtoWriter.writeBytes(clientSessionToken.unknownFields());
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 1, clientSessionToken.value);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ClientSessionToken clientSessionToken = (ClientSessionToken) obj;
        clientSessionToken.getClass();
        return ProtoAdapter.BYTES.encodedSizeWithTag(1, clientSessionToken.value) + clientSessionToken.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((ClientSessionToken) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ClientSessionToken(null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClientSessionToken clientSessionToken = (ClientSessionToken) obj;
        clientSessionToken.getClass();
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, clientSessionToken.value);
        protoWriter.writeBytes(clientSessionToken.unknownFields());
    }
}
