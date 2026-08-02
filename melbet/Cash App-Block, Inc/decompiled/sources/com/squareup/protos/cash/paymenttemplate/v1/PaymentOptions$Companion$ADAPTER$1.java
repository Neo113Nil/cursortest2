package com.squareup.protos.cash.paymenttemplate.v1;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PaymentOptions$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaymentOptions(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(OonPaymentMethod.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaymentOptions paymentOptions = (PaymentOptions) obj;
        reverseProtoWriter.getClass();
        paymentOptions.getClass();
        reverseProtoWriter.writeBytes(paymentOptions.unknownFields());
        OonPaymentMethod.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, paymentOptions.oon_payment_methods);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaymentOptions paymentOptions = (PaymentOptions) obj;
        paymentOptions.getClass();
        return OonPaymentMethod.ADAPTER.asRepeated().encodedSizeWithTag(1, paymentOptions.oon_payment_methods) + paymentOptions.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaymentOptions paymentOptions = (PaymentOptions) obj;
        paymentOptions.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(paymentOptions.oon_payment_methods, OonPaymentMethod.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PaymentOptions(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaymentOptions paymentOptions = (PaymentOptions) obj;
        paymentOptions.getClass();
        OonPaymentMethod.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, paymentOptions.oon_payment_methods);
        protoWriter.writeBytes(paymentOptions.unknownFields());
    }
}
