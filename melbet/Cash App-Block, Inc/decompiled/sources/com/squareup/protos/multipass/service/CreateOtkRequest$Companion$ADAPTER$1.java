package com.squareup.protos.multipass.service;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CreateOtkRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateOtkRequest((ClientCredentials) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ClientCredentials.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreateOtkRequest createOtkRequest = (CreateOtkRequest) obj;
        reverseProtoWriter.getClass();
        createOtkRequest.getClass();
        reverseProtoWriter.writeBytes(createOtkRequest.unknownFields());
        ClientCredentials.ADAPTER.encodeWithTag(reverseProtoWriter, 1, createOtkRequest.client_credentials);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateOtkRequest createOtkRequest = (CreateOtkRequest) obj;
        createOtkRequest.getClass();
        return ClientCredentials.ADAPTER.encodedSizeWithTag(1, createOtkRequest.client_credentials) + createOtkRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateOtkRequest createOtkRequest = (CreateOtkRequest) obj;
        createOtkRequest.getClass();
        ClientCredentials clientCredentials = createOtkRequest.client_credentials;
        ClientCredentials clientCredentials2 = clientCredentials != null ? (ClientCredentials) ClientCredentials.ADAPTER.redact(clientCredentials) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CreateOtkRequest(clientCredentials2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateOtkRequest createOtkRequest = (CreateOtkRequest) obj;
        createOtkRequest.getClass();
        ClientCredentials.ADAPTER.encodeWithTag(protoWriter, 1, createOtkRequest.client_credentials);
        protoWriter.writeBytes(createOtkRequest.unknownFields());
    }
}
