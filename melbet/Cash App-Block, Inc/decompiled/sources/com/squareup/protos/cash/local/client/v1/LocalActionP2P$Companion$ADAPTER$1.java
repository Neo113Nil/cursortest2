package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalActionP2P$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalActionP2P((Boolean) obj, (String) obj2, (Boolean) obj3, (Boolean) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalActionP2P localActionP2P = (LocalActionP2P) obj;
        reverseProtoWriter.getClass();
        localActionP2P.getClass();
        reverseProtoWriter.writeBytes(localActionP2P.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, localActionP2P.request_enabled);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, localActionP2P.pay_enabled);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, localActionP2P.customer_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localActionP2P.enabled);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalActionP2P localActionP2P = (LocalActionP2P) obj;
        localActionP2P.getClass();
        int size$okio = localActionP2P.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(4, localActionP2P.request_enabled) + protoAdapter.encodedSizeWithTag(3, localActionP2P.pay_enabled) + ProtoAdapter.STRING.encodedSizeWithTag(2, localActionP2P.customer_token) + protoAdapter.encodedSizeWithTag(1, localActionP2P.enabled) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalActionP2P localActionP2P = (LocalActionP2P) obj;
        localActionP2P.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = localActionP2P.enabled;
        String str = localActionP2P.customer_token;
        Boolean bool2 = localActionP2P.pay_enabled;
        Boolean bool3 = localActionP2P.request_enabled;
        byteString.getClass();
        return new LocalActionP2P(bool, str, bool2, bool3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalActionP2P localActionP2P = (LocalActionP2P) obj;
        localActionP2P.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, localActionP2P.enabled);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, localActionP2P.customer_token);
        protoAdapter.encodeWithTag(protoWriter, 3, localActionP2P.pay_enabled);
        protoAdapter.encodeWithTag(protoWriter, 4, localActionP2P.request_enabled);
        protoWriter.writeBytes(localActionP2P.unknownFields());
    }
}
