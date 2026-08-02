package com.squareup.protos.cash.janus.syncvalues;

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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new AuthorizedPrincipal((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        AuthorizedPrincipal authorizedPrincipal = (AuthorizedPrincipal) obj;
        reverseProtoWriter.getClass();
        authorizedPrincipal.getClass();
        reverseProtoWriter.writeBytes(authorizedPrincipal.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, authorizedPrincipal.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AuthorizedPrincipal authorizedPrincipal = (AuthorizedPrincipal) obj;
        authorizedPrincipal.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, authorizedPrincipal.customer_token) + authorizedPrincipal.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AuthorizedPrincipal authorizedPrincipal = (AuthorizedPrincipal) obj;
        authorizedPrincipal.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = authorizedPrincipal.customer_token;
        byteString.getClass();
        return new AuthorizedPrincipal(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AuthorizedPrincipal authorizedPrincipal = (AuthorizedPrincipal) obj;
        authorizedPrincipal.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, authorizedPrincipal.customer_token);
        protoWriter.writeBytes(authorizedPrincipal.unknownFields());
    }
}
