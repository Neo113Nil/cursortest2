package com.squareup.protos.cash.fiatly.api.v2;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PaymentUpdateHeartbeat$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaymentUpdateHeartbeat((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        PaymentUpdateHeartbeat paymentUpdateHeartbeat = (PaymentUpdateHeartbeat) obj;
        reverseProtoWriter.getClass();
        paymentUpdateHeartbeat.getClass();
        reverseProtoWriter.writeBytes(paymentUpdateHeartbeat.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, paymentUpdateHeartbeat.data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaymentUpdateHeartbeat paymentUpdateHeartbeat = (PaymentUpdateHeartbeat) obj;
        paymentUpdateHeartbeat.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, paymentUpdateHeartbeat.data) + paymentUpdateHeartbeat.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaymentUpdateHeartbeat paymentUpdateHeartbeat = (PaymentUpdateHeartbeat) obj;
        paymentUpdateHeartbeat.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = paymentUpdateHeartbeat.data;
        byteString.getClass();
        return new PaymentUpdateHeartbeat(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaymentUpdateHeartbeat paymentUpdateHeartbeat = (PaymentUpdateHeartbeat) obj;
        paymentUpdateHeartbeat.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, paymentUpdateHeartbeat.data);
        protoWriter.writeBytes(paymentUpdateHeartbeat.unknownFields());
    }
}
