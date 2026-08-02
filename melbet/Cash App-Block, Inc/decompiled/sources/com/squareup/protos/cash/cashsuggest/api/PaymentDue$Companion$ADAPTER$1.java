package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PaymentDue$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PaymentDue((Long) obj, (Money) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PaymentDue paymentDue = (PaymentDue) obj;
        reverseProtoWriter.getClass();
        paymentDue.getClass();
        reverseProtoWriter.writeBytes(paymentDue.unknownFields());
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, paymentDue.due_amount_in_cents);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, paymentDue.due_at_ms);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PaymentDue paymentDue = (PaymentDue) obj;
        paymentDue.getClass();
        return Money.ADAPTER.encodedSizeWithTag(2, paymentDue.due_amount_in_cents) + ProtoAdapter.INT64.encodedSizeWithTag(1, paymentDue.due_at_ms) + paymentDue.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PaymentDue paymentDue = (PaymentDue) obj;
        paymentDue.getClass();
        Money money = paymentDue.due_amount_in_cents;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = paymentDue.due_at_ms;
        byteString.getClass();
        return new PaymentDue(l, money2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PaymentDue paymentDue = (PaymentDue) obj;
        paymentDue.getClass();
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, paymentDue.due_at_ms);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, paymentDue.due_amount_in_cents);
        protoWriter.writeBytes(paymentDue.unknownFields());
    }
}
