package com.squareup.protos.franklin.common;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PaymentRewardStatus$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaymentRewardStatus((String) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaymentRewardStatus paymentRewardStatus = (PaymentRewardStatus) obj;
        reverseProtoWriter.getClass();
        paymentRewardStatus.getClass();
        reverseProtoWriter.writeBytes(paymentRewardStatus.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, paymentRewardStatus.show_payments);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, paymentRewardStatus.main_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaymentRewardStatus paymentRewardStatus = (PaymentRewardStatus) obj;
        paymentRewardStatus.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(2, paymentRewardStatus.show_payments) + ProtoAdapter.STRING.encodedSizeWithTag(1, paymentRewardStatus.main_text) + paymentRewardStatus.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaymentRewardStatus paymentRewardStatus = (PaymentRewardStatus) obj;
        paymentRewardStatus.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = paymentRewardStatus.main_text;
        Boolean bool = paymentRewardStatus.show_payments;
        byteString.getClass();
        return new PaymentRewardStatus(str, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaymentRewardStatus paymentRewardStatus = (PaymentRewardStatus) obj;
        paymentRewardStatus.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, paymentRewardStatus.main_text);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, paymentRewardStatus.show_payments);
        protoWriter.writeBytes(paymentRewardStatus.unknownFields());
    }
}
