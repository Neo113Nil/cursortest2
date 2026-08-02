package com.squareup.protos.cash.grantly.api;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PaymentSchedule$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PaymentSchedule((Integer) obj, (Boolean) obj2, (Long) obj3, (Money) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaymentSchedule paymentSchedule = (PaymentSchedule) obj;
        reverseProtoWriter.getClass();
        paymentSchedule.getClass();
        reverseProtoWriter.writeBytes(paymentSchedule.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 4, paymentSchedule.amount);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 3, paymentSchedule.payment_date);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, paymentSchedule.is_optional);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, paymentSchedule.payment_number);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaymentSchedule paymentSchedule = (PaymentSchedule) obj;
        paymentSchedule.getClass();
        return Money.ADAPTER.encodedSizeWithTag(4, paymentSchedule.amount) + ProtoAdapter.INT64.encodedSizeWithTag(3, paymentSchedule.payment_date) + ProtoAdapter.BOOL.encodedSizeWithTag(2, paymentSchedule.is_optional) + ProtoAdapter.INT32.encodedSizeWithTag(1, paymentSchedule.payment_number) + paymentSchedule.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaymentSchedule paymentSchedule = (PaymentSchedule) obj;
        paymentSchedule.getClass();
        Money money = paymentSchedule.amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = paymentSchedule.payment_number;
        Boolean bool = paymentSchedule.is_optional;
        Long l = paymentSchedule.payment_date;
        byteString.getClass();
        return new PaymentSchedule(num, bool, l, money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaymentSchedule paymentSchedule = (PaymentSchedule) obj;
        paymentSchedule.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, paymentSchedule.payment_number);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, paymentSchedule.is_optional);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, paymentSchedule.payment_date);
        Money.ADAPTER.encodeWithTag(protoWriter, 4, paymentSchedule.amount);
        protoWriter.writeBytes(paymentSchedule.unknownFields());
    }
}
