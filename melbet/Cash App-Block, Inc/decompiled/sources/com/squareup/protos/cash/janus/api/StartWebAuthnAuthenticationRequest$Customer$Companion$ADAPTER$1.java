package com.squareup.protos.cash.janus.api;

import com.squareup.protos.cash.janus.api.StartWebAuthnAuthenticationRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class StartWebAuthnAuthenticationRequest$Customer$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StartWebAuthnAuthenticationRequest.Customer((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        StartWebAuthnAuthenticationRequest.Customer customer = (StartWebAuthnAuthenticationRequest.Customer) obj;
        reverseProtoWriter.getClass();
        customer.getClass();
        reverseProtoWriter.writeBytes(customer.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, customer.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StartWebAuthnAuthenticationRequest.Customer customer = (StartWebAuthnAuthenticationRequest.Customer) obj;
        customer.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, customer.customer_token) + customer.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StartWebAuthnAuthenticationRequest.Customer customer = (StartWebAuthnAuthenticationRequest.Customer) obj;
        customer.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = customer.customer_token;
        byteString.getClass();
        return new StartWebAuthnAuthenticationRequest.Customer(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StartWebAuthnAuthenticationRequest.Customer customer = (StartWebAuthnAuthenticationRequest.Customer) obj;
        customer.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, customer.customer_token);
        protoWriter.writeBytes(customer.unknownFields());
    }
}
