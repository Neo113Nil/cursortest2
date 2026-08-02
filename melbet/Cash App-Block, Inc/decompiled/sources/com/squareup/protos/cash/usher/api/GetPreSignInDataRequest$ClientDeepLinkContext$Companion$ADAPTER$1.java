package com.squareup.protos.cash.usher.api;

import com.squareup.protos.cash.usher.api.GetPreSignInDataRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class GetPreSignInDataRequest$ClientDeepLinkContext$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetPreSignInDataRequest.ClientDeepLinkContext((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetPreSignInDataRequest.ClientDeepLinkContext clientDeepLinkContext = (GetPreSignInDataRequest.ClientDeepLinkContext) obj;
        reverseProtoWriter.getClass();
        clientDeepLinkContext.getClass();
        reverseProtoWriter.writeBytes(clientDeepLinkContext.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, clientDeepLinkContext.payload);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, clientDeepLinkContext.deep_link);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetPreSignInDataRequest.ClientDeepLinkContext clientDeepLinkContext = (GetPreSignInDataRequest.ClientDeepLinkContext) obj;
        clientDeepLinkContext.getClass();
        int size$okio = clientDeepLinkContext.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, clientDeepLinkContext.payload) + protoAdapter.encodedSizeWithTag(1, clientDeepLinkContext.deep_link) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetPreSignInDataRequest.ClientDeepLinkContext clientDeepLinkContext = (GetPreSignInDataRequest.ClientDeepLinkContext) obj;
        clientDeepLinkContext.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = clientDeepLinkContext.deep_link;
        String str2 = clientDeepLinkContext.payload;
        byteString.getClass();
        return new GetPreSignInDataRequest.ClientDeepLinkContext(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetPreSignInDataRequest.ClientDeepLinkContext clientDeepLinkContext = (GetPreSignInDataRequest.ClientDeepLinkContext) obj;
        clientDeepLinkContext.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, clientDeepLinkContext.deep_link);
        protoAdapter.encodeWithTag(protoWriter, 2, clientDeepLinkContext.payload);
        protoWriter.writeBytes(clientDeepLinkContext.unknownFields());
    }
}
