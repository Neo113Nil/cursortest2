package com.squareup.protos.cash.cashsuggest.api;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreditLineData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreditLineData((CreditLineType) obj, (Money) obj2, (Money) obj3, (Money) obj4, (Money) obj5, m, (Money) obj6, (PaymentDue) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    try {
                        obj = CreditLineType.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    break;
                case 4:
                    obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                    break;
                case 5:
                    m.add(PaymentDue.ADAPTER.decode(protoReader));
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(PaymentDue.ADAPTER, protoReader, obj7);
                    break;
                case 8:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CreditLineData creditLineData = (CreditLineData) obj;
        reverseProtoWriter.getClass();
        creditLineData.getClass();
        reverseProtoWriter.writeBytes(creditLineData.unknownFields());
        ProtoAdapter protoAdapter = PaymentDue.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, creditLineData.next_payment_due);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, creditLineData.overdue_balance);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 5, creditLineData.payment_dues);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, creditLineData.outstanding_balance);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, creditLineData.remaining_credit);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 8, creditLineData.total_granted_credit);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, creditLineData.total_credit);
        CreditLineType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, creditLineData.line_type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreditLineData creditLineData = (CreditLineData) obj;
        creditLineData.getClass();
        int encodedSizeWithTag = CreditLineType.ADAPTER.encodedSizeWithTag(1, creditLineData.line_type) + creditLineData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(4, creditLineData.outstanding_balance) + protoAdapter.encodedSizeWithTag(3, creditLineData.remaining_credit) + protoAdapter.encodedSizeWithTag(8, creditLineData.total_granted_credit) + protoAdapter.encodedSizeWithTag(2, creditLineData.total_credit) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = PaymentDue.ADAPTER;
        return protoAdapter2.encodedSizeWithTag(7, creditLineData.next_payment_due) + protoAdapter.encodedSizeWithTag(6, creditLineData.overdue_balance) + protoAdapter2.asRepeated().encodedSizeWithTag(5, creditLineData.payment_dues) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreditLineData creditLineData = (CreditLineData) obj;
        creditLineData.getClass();
        Money money = creditLineData.total_credit;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = creditLineData.total_granted_credit;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = creditLineData.remaining_credit;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        Money money7 = creditLineData.outstanding_balance;
        Money money8 = money7 != null ? (Money) Money.ADAPTER.redact(money7) : null;
        List list = creditLineData.payment_dues;
        ProtoAdapter protoAdapter = PaymentDue.ADAPTER;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter);
        Money money9 = creditLineData.overdue_balance;
        Money money10 = money9 != null ? (Money) Money.ADAPTER.redact(money9) : null;
        PaymentDue paymentDue = creditLineData.next_payment_due;
        return CreditLineData.copy$default(creditLineData, money2, money4, money6, money8, m1169redactElements, money10, paymentDue != null ? (PaymentDue) protoAdapter.redact(paymentDue) : null, ByteString.EMPTY, 1);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreditLineData creditLineData = (CreditLineData) obj;
        creditLineData.getClass();
        CreditLineType.ADAPTER.encodeWithTag(protoWriter, 1, creditLineData.line_type);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, creditLineData.total_credit);
        protoAdapter.encodeWithTag(protoWriter, 8, creditLineData.total_granted_credit);
        protoAdapter.encodeWithTag(protoWriter, 3, creditLineData.remaining_credit);
        protoAdapter.encodeWithTag(protoWriter, 4, creditLineData.outstanding_balance);
        ProtoAdapter protoAdapter2 = PaymentDue.ADAPTER;
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, creditLineData.payment_dues);
        protoAdapter.encodeWithTag(protoWriter, 6, creditLineData.overdue_balance);
        protoAdapter2.encodeWithTag(protoWriter, 7, creditLineData.next_payment_due);
        protoWriter.writeBytes(creditLineData.unknownFields());
    }
}
