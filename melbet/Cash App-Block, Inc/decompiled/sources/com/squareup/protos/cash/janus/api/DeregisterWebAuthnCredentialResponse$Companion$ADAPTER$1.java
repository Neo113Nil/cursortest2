package com.squareup.protos.cash.janus.api;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class DeregisterWebAuthnCredentialResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DeregisterWebAuthnCredentialResponse((ResponseContext) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DeregisterWebAuthnCredentialResponse deregisterWebAuthnCredentialResponse = (DeregisterWebAuthnCredentialResponse) obj;
        reverseProtoWriter.getClass();
        deregisterWebAuthnCredentialResponse.getClass();
        reverseProtoWriter.writeBytes(deregisterWebAuthnCredentialResponse.unknownFields());
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, deregisterWebAuthnCredentialResponse.response_context);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DeregisterWebAuthnCredentialResponse deregisterWebAuthnCredentialResponse = (DeregisterWebAuthnCredentialResponse) obj;
        deregisterWebAuthnCredentialResponse.getClass();
        return ResponseContext.ADAPTER.encodedSizeWithTag(1, deregisterWebAuthnCredentialResponse.response_context) + deregisterWebAuthnCredentialResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DeregisterWebAuthnCredentialResponse deregisterWebAuthnCredentialResponse = (DeregisterWebAuthnCredentialResponse) obj;
        deregisterWebAuthnCredentialResponse.getClass();
        ResponseContext responseContext = deregisterWebAuthnCredentialResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new DeregisterWebAuthnCredentialResponse(responseContext2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DeregisterWebAuthnCredentialResponse deregisterWebAuthnCredentialResponse = (DeregisterWebAuthnCredentialResponse) obj;
        deregisterWebAuthnCredentialResponse.getClass();
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 1, deregisterWebAuthnCredentialResponse.response_context);
        protoWriter.writeBytes(deregisterWebAuthnCredentialResponse.unknownFields());
    }
}
