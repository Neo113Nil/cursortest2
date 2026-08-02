package com.squareup.protos.cash.pay;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pay.CashAppPayPaymentScheduleRenderData;
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
public final class CashAppPayPaymentScheduleRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList arrayList;
        Long l;
        CashAppPayPaymentScheduleRenderData.PaymentScheduleState paymentScheduleState;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        String str = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Long l2 = null;
        CashAppPayPaymentScheduleRenderData.PaymentScheduleState paymentScheduleState2 = null;
        Integer num = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppPayPaymentScheduleRenderData(str, (Money) obj, (Money) obj2, (Money) obj3, (Money) obj4, (Money) obj5, (Money) obj6, l2, paymentScheduleState2, m, arrayList2, num, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    arrayList = m;
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    arrayList = m;
                    obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
                    decode = str;
                    break;
                case 3:
                    arrayList = m;
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    decode = str;
                    break;
                case 4:
                    arrayList = m;
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    decode = str;
                    break;
                case 5:
                    arrayList = m;
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    decode = str;
                    break;
                case 6:
                    arrayList = m;
                    obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                    decode = str;
                    break;
                case 7:
                    arrayList = m;
                    obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj6);
                    decode = str;
                    break;
                case 8:
                    arrayList = m;
                    l2 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 9:
                    try {
                        paymentScheduleState2 = CashAppPayPaymentScheduleRenderData.PaymentScheduleState.ADAPTER.decode(protoReader);
                        arrayList = m;
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        arrayList = m;
                        l = l2;
                        paymentScheduleState = paymentScheduleState2;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 10:
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    arrayList = m;
                    l = l2;
                    paymentScheduleState = paymentScheduleState2;
                    decode = str;
                    l2 = l;
                    paymentScheduleState2 = paymentScheduleState;
                    break;
                case 11:
                    arrayList2.add(ProtoAdapter.STRING.decode(protoReader));
                    arrayList = m;
                    l = l2;
                    paymentScheduleState = paymentScheduleState2;
                    decode = str;
                    l2 = l;
                    paymentScheduleState2 = paymentScheduleState;
                    break;
                case 12:
                    num = ProtoAdapter.UINT32.decode(protoReader);
                    arrayList = m;
                    decode = str;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    arrayList = m;
                    l = l2;
                    paymentScheduleState = paymentScheduleState2;
                    decode = str;
                    l2 = l;
                    paymentScheduleState2 = paymentScheduleState;
                    break;
            }
            str = decode;
            m = arrayList;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayPaymentScheduleRenderData cashAppPayPaymentScheduleRenderData = (CashAppPayPaymentScheduleRenderData) obj;
        reverseProtoWriter.getClass();
        cashAppPayPaymentScheduleRenderData.getClass();
        reverseProtoWriter.writeBytes(cashAppPayPaymentScheduleRenderData.unknownFields());
        ProtoAdapter.UINT32.encodeWithTag(reverseProtoWriter, 12, cashAppPayPaymentScheduleRenderData.installment_sequence_number);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 11, cashAppPayPaymentScheduleRenderData.associated_refund_ids);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 10, cashAppPayPaymentScheduleRenderData.associated_payment_ids);
        CashAppPayPaymentScheduleRenderData.PaymentScheduleState.ADAPTER.encodeWithTag(reverseProtoWriter, 9, cashAppPayPaymentScheduleRenderData.state);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 8, cashAppPayPaymentScheduleRenderData.schedule_due_at);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, cashAppPayPaymentScheduleRenderData.late_fee_refunded_money);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, cashAppPayPaymentScheduleRenderData.refunded_money);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, cashAppPayPaymentScheduleRenderData.late_fee_money);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, cashAppPayPaymentScheduleRenderData.owed_money);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, cashAppPayPaymentScheduleRenderData.paid_money);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, cashAppPayPaymentScheduleRenderData.payment_schedule_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cashAppPayPaymentScheduleRenderData.payment_schedule_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayPaymentScheduleRenderData cashAppPayPaymentScheduleRenderData = (CashAppPayPaymentScheduleRenderData) obj;
        cashAppPayPaymentScheduleRenderData.getClass();
        int size$okio = cashAppPayPaymentScheduleRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, cashAppPayPaymentScheduleRenderData.payment_schedule_id) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        return ProtoAdapter.UINT32.encodedSizeWithTag(12, cashAppPayPaymentScheduleRenderData.installment_sequence_number) + protoAdapter.asRepeated().encodedSizeWithTag(11, cashAppPayPaymentScheduleRenderData.associated_refund_ids) + protoAdapter.asRepeated().encodedSizeWithTag(10, cashAppPayPaymentScheduleRenderData.associated_payment_ids) + CashAppPayPaymentScheduleRenderData.PaymentScheduleState.ADAPTER.encodedSizeWithTag(9, cashAppPayPaymentScheduleRenderData.state) + ProtoAdapter.INT64.encodedSizeWithTag(8, cashAppPayPaymentScheduleRenderData.schedule_due_at) + protoAdapter2.encodedSizeWithTag(7, cashAppPayPaymentScheduleRenderData.late_fee_refunded_money) + protoAdapter2.encodedSizeWithTag(6, cashAppPayPaymentScheduleRenderData.refunded_money) + protoAdapter2.encodedSizeWithTag(5, cashAppPayPaymentScheduleRenderData.late_fee_money) + protoAdapter2.encodedSizeWithTag(4, cashAppPayPaymentScheduleRenderData.owed_money) + protoAdapter2.encodedSizeWithTag(3, cashAppPayPaymentScheduleRenderData.paid_money) + protoAdapter2.encodedSizeWithTag(2, cashAppPayPaymentScheduleRenderData.payment_schedule_money) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayPaymentScheduleRenderData cashAppPayPaymentScheduleRenderData = (CashAppPayPaymentScheduleRenderData) obj;
        cashAppPayPaymentScheduleRenderData.getClass();
        Money money = cashAppPayPaymentScheduleRenderData.payment_schedule_money;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = cashAppPayPaymentScheduleRenderData.paid_money;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = cashAppPayPaymentScheduleRenderData.owed_money;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        Money money7 = cashAppPayPaymentScheduleRenderData.late_fee_money;
        Money money8 = money7 != null ? (Money) Money.ADAPTER.redact(money7) : null;
        Money money9 = cashAppPayPaymentScheduleRenderData.refunded_money;
        Money money10 = money9 != null ? (Money) Money.ADAPTER.redact(money9) : null;
        Money money11 = cashAppPayPaymentScheduleRenderData.late_fee_refunded_money;
        Money money12 = money11 != null ? (Money) Money.ADAPTER.redact(money11) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cashAppPayPaymentScheduleRenderData.payment_schedule_id;
        Long l = cashAppPayPaymentScheduleRenderData.schedule_due_at;
        CashAppPayPaymentScheduleRenderData.PaymentScheduleState paymentScheduleState = cashAppPayPaymentScheduleRenderData.state;
        List list = cashAppPayPaymentScheduleRenderData.associated_payment_ids;
        List list2 = cashAppPayPaymentScheduleRenderData.associated_refund_ids;
        Integer num = cashAppPayPaymentScheduleRenderData.installment_sequence_number;
        list.getClass();
        list2.getClass();
        byteString.getClass();
        return new CashAppPayPaymentScheduleRenderData(str, money2, money4, money6, money8, money10, money12, l, paymentScheduleState, list, list2, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayPaymentScheduleRenderData cashAppPayPaymentScheduleRenderData = (CashAppPayPaymentScheduleRenderData) obj;
        cashAppPayPaymentScheduleRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cashAppPayPaymentScheduleRenderData.payment_schedule_id);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 2, cashAppPayPaymentScheduleRenderData.payment_schedule_money);
        protoAdapter2.encodeWithTag(protoWriter, 3, cashAppPayPaymentScheduleRenderData.paid_money);
        protoAdapter2.encodeWithTag(protoWriter, 4, cashAppPayPaymentScheduleRenderData.owed_money);
        protoAdapter2.encodeWithTag(protoWriter, 5, cashAppPayPaymentScheduleRenderData.late_fee_money);
        protoAdapter2.encodeWithTag(protoWriter, 6, cashAppPayPaymentScheduleRenderData.refunded_money);
        protoAdapter2.encodeWithTag(protoWriter, 7, cashAppPayPaymentScheduleRenderData.late_fee_refunded_money);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, cashAppPayPaymentScheduleRenderData.schedule_due_at);
        CashAppPayPaymentScheduleRenderData.PaymentScheduleState.ADAPTER.encodeWithTag(protoWriter, 9, cashAppPayPaymentScheduleRenderData.state);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 10, cashAppPayPaymentScheduleRenderData.associated_payment_ids);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 11, cashAppPayPaymentScheduleRenderData.associated_refund_ids);
        ProtoAdapter.UINT32.encodeWithTag(protoWriter, 12, cashAppPayPaymentScheduleRenderData.installment_sequence_number);
        protoWriter.writeBytes(cashAppPayPaymentScheduleRenderData.unknownFields());
    }
}
