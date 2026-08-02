package com.squareup.protos.cash.btcnetwork.external;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PaymentMethods$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaymentMethods((Boolean) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaymentMethods paymentMethods = (PaymentMethods) obj;
        reverseProtoWriter.getClass();
        paymentMethods.getClass();
        reverseProtoWriter.writeBytes(paymentMethods.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, paymentMethods.lightning);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, paymentMethods.on_chain);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaymentMethods paymentMethods = (PaymentMethods) obj;
        paymentMethods.getClass();
        int size$okio = paymentMethods.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(2, paymentMethods.lightning) + protoAdapter.encodedSizeWithTag(1, paymentMethods.on_chain) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaymentMethods paymentMethods = (PaymentMethods) obj;
        paymentMethods.getClass();
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = paymentMethods.on_chain;
        Boolean bool2 = paymentMethods.lightning;
        byteString.getClass();
        return new PaymentMethods(bool, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaymentMethods paymentMethods = (PaymentMethods) obj;
        paymentMethods.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 1, paymentMethods.on_chain);
        protoAdapter.encodeWithTag(protoWriter, 2, paymentMethods.lightning);
        protoWriter.writeBytes(paymentMethods.unknownFields());
    }
}
