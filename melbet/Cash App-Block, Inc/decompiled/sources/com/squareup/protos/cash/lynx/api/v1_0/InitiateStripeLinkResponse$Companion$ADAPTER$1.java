package com.squareup.protos.cash.lynx.api.v1_0;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class InitiateStripeLinkResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new InitiateStripeLinkResponse((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        InitiateStripeLinkResponse initiateStripeLinkResponse = (InitiateStripeLinkResponse) obj;
        reverseProtoWriter.getClass();
        initiateStripeLinkResponse.getClass();
        reverseProtoWriter.writeBytes(initiateStripeLinkResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, initiateStripeLinkResponse.publishable_key);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, initiateStripeLinkResponse.client_secret);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        InitiateStripeLinkResponse initiateStripeLinkResponse = (InitiateStripeLinkResponse) obj;
        initiateStripeLinkResponse.getClass();
        int size$okio = initiateStripeLinkResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, initiateStripeLinkResponse.publishable_key) + protoAdapter.encodedSizeWithTag(1, initiateStripeLinkResponse.client_secret) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        InitiateStripeLinkResponse initiateStripeLinkResponse = (InitiateStripeLinkResponse) obj;
        initiateStripeLinkResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = initiateStripeLinkResponse.publishable_key;
        byteString.getClass();
        return new InitiateStripeLinkResponse(null, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        InitiateStripeLinkResponse initiateStripeLinkResponse = (InitiateStripeLinkResponse) obj;
        initiateStripeLinkResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, initiateStripeLinkResponse.client_secret);
        protoAdapter.encodeWithTag(protoWriter, 2, initiateStripeLinkResponse.publishable_key);
        protoWriter.writeBytes(initiateStripeLinkResponse.unknownFields());
    }
}
