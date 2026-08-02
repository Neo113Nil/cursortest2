package com.squareup.protos.franklin.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class ClientSecurityContext$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ClientSecurityContext((ByteString) obj, (ByteString) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BYTES.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BYTES.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ClientSecurityContext clientSecurityContext = (ClientSecurityContext) obj;
        reverseProtoWriter.getClass();
        clientSecurityContext.getClass();
        reverseProtoWriter.writeBytes(clientSecurityContext.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, clientSecurityContext.device_check_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, clientSecurityContext.client_public_key);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ClientSecurityContext clientSecurityContext = (ClientSecurityContext) obj;
        clientSecurityContext.getClass();
        int size$okio = clientSecurityContext.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        return protoAdapter.encodedSizeWithTag(2, clientSecurityContext.device_check_token) + protoAdapter.encodedSizeWithTag(1, clientSecurityContext.client_public_key) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ClientSecurityContext clientSecurityContext = (ClientSecurityContext) obj;
        clientSecurityContext.getClass();
        ByteString byteString = ByteString.EMPTY;
        ByteString byteString2 = clientSecurityContext.client_public_key;
        byteString.getClass();
        return new ClientSecurityContext(byteString2, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClientSecurityContext clientSecurityContext = (ClientSecurityContext) obj;
        clientSecurityContext.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BYTES;
        protoAdapter.encodeWithTag(protoWriter, 1, clientSecurityContext.client_public_key);
        protoAdapter.encodeWithTag(protoWriter, 2, clientSecurityContext.device_check_token);
        protoWriter.writeBytes(clientSecurityContext.unknownFields());
    }
}
