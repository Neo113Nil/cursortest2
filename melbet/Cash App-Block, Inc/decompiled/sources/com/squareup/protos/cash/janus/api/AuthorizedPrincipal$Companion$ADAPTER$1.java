package com.squareup.protos.cash.janus.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class AuthorizedPrincipal$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AuthorizedPrincipal((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        AuthorizedPrincipal authorizedPrincipal = (AuthorizedPrincipal) obj;
        reverseProtoWriter.getClass();
        authorizedPrincipal.getClass();
        reverseProtoWriter.writeBytes(authorizedPrincipal.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, authorizedPrincipal.switching_identifier);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, authorizedPrincipal.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AuthorizedPrincipal authorizedPrincipal = (AuthorizedPrincipal) obj;
        authorizedPrincipal.getClass();
        int size$okio = authorizedPrincipal.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, authorizedPrincipal.switching_identifier) + protoAdapter.encodedSizeWithTag(1, authorizedPrincipal.customer_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AuthorizedPrincipal authorizedPrincipal = (AuthorizedPrincipal) obj;
        authorizedPrincipal.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = authorizedPrincipal.customer_token;
        String str2 = authorizedPrincipal.switching_identifier;
        byteString.getClass();
        return new AuthorizedPrincipal(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AuthorizedPrincipal authorizedPrincipal = (AuthorizedPrincipal) obj;
        authorizedPrincipal.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, authorizedPrincipal.customer_token);
        protoAdapter.encodeWithTag(protoWriter, 2, authorizedPrincipal.switching_identifier);
        protoWriter.writeBytes(authorizedPrincipal.unknownFields());
    }
}
