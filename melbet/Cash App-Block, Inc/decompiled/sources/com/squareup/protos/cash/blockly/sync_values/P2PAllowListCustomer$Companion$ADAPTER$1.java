package com.squareup.protos.cash.blockly.sync_values;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class P2PAllowListCustomer$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new P2PAllowListCustomer((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        P2PAllowListCustomer p2PAllowListCustomer = (P2PAllowListCustomer) obj;
        reverseProtoWriter.getClass();
        p2PAllowListCustomer.getClass();
        reverseProtoWriter.writeBytes(p2PAllowListCustomer.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, p2PAllowListCustomer.allowlist_customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        P2PAllowListCustomer p2PAllowListCustomer = (P2PAllowListCustomer) obj;
        p2PAllowListCustomer.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, p2PAllowListCustomer.allowlist_customer_token) + p2PAllowListCustomer.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        P2PAllowListCustomer p2PAllowListCustomer = (P2PAllowListCustomer) obj;
        p2PAllowListCustomer.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = p2PAllowListCustomer.allowlist_customer_token;
        byteString.getClass();
        return new P2PAllowListCustomer(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        P2PAllowListCustomer p2PAllowListCustomer = (P2PAllowListCustomer) obj;
        p2PAllowListCustomer.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, p2PAllowListCustomer.allowlist_customer_token);
        protoWriter.writeBytes(p2PAllowListCustomer.unknownFields());
    }
}
