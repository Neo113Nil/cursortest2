package com.squareup.protos.cash.pay;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayOrderRenderData$OrderAggregations$MoneyAggregations$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations((Money) obj, (Money) obj2, (Money) obj3, (Money) obj4, (Money) obj5, (Money) obj6, (Money) obj7, (Money) obj8, (Money) obj9, (Money) obj10, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj6);
                    break;
                case 6:
                    obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj7);
                    break;
                case 7:
                    obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                    break;
                case 8:
                    obj8 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj8);
                    break;
                case 9:
                    obj9 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj9);
                    break;
                case 10:
                    obj10 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj10);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations moneyAggregations = (CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations) obj;
        reverseProtoWriter.getClass();
        moneyAggregations.getClass();
        reverseProtoWriter.writeBytes(moneyAggregations.unknownFields());
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, moneyAggregations.total_dispute_returned_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, moneyAggregations.total_discount_returned_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, moneyAggregations.total_discount_applied_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, moneyAggregations.total_customer_owed_and_paid_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, moneyAggregations.total_order_refunded_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, moneyAggregations.total_loan_late_fee_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, moneyAggregations.total_loan_fee_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, moneyAggregations.total_loan_paid_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, moneyAggregations.total_loan_owed_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, moneyAggregations.total_loan_overdue_money);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations moneyAggregations = (CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations) obj;
        moneyAggregations.getClass();
        int size$okio = moneyAggregations.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        return protoAdapter.encodedSizeWithTag(10, moneyAggregations.total_dispute_returned_money) + protoAdapter.encodedSizeWithTag(9, moneyAggregations.total_discount_returned_money) + protoAdapter.encodedSizeWithTag(8, moneyAggregations.total_discount_applied_money) + protoAdapter.encodedSizeWithTag(6, moneyAggregations.total_customer_owed_and_paid_money) + protoAdapter.encodedSizeWithTag(5, moneyAggregations.total_order_refunded_money) + protoAdapter.encodedSizeWithTag(7, moneyAggregations.total_loan_late_fee_money) + protoAdapter.encodedSizeWithTag(4, moneyAggregations.total_loan_fee_money) + protoAdapter.encodedSizeWithTag(3, moneyAggregations.total_loan_paid_money) + protoAdapter.encodedSizeWithTag(2, moneyAggregations.total_loan_owed_money) + protoAdapter.encodedSizeWithTag(1, moneyAggregations.total_loan_overdue_money) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations moneyAggregations = (CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations) obj;
        moneyAggregations.getClass();
        Money money = moneyAggregations.total_loan_overdue_money;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = moneyAggregations.total_loan_owed_money;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = moneyAggregations.total_loan_paid_money;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        Money money7 = moneyAggregations.total_loan_fee_money;
        Money money8 = money7 != null ? (Money) Money.ADAPTER.redact(money7) : null;
        Money money9 = moneyAggregations.total_loan_late_fee_money;
        Money money10 = money9 != null ? (Money) Money.ADAPTER.redact(money9) : null;
        Money money11 = moneyAggregations.total_order_refunded_money;
        Money money12 = money11 != null ? (Money) Money.ADAPTER.redact(money11) : null;
        Money money13 = moneyAggregations.total_customer_owed_and_paid_money;
        Money money14 = money13 != null ? (Money) Money.ADAPTER.redact(money13) : null;
        Money money15 = moneyAggregations.total_discount_applied_money;
        Money money16 = money15 != null ? (Money) Money.ADAPTER.redact(money15) : null;
        Money money17 = moneyAggregations.total_discount_returned_money;
        Money money18 = money17 != null ? (Money) Money.ADAPTER.redact(money17) : null;
        Money money19 = moneyAggregations.total_dispute_returned_money;
        Money money20 = money19 != null ? (Money) Money.ADAPTER.redact(money19) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations(money2, money4, money6, money8, money10, money12, money14, money16, money18, money20, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations moneyAggregations = (CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations) obj;
        moneyAggregations.getClass();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, moneyAggregations.total_loan_overdue_money);
        protoAdapter.encodeWithTag(protoWriter, 2, moneyAggregations.total_loan_owed_money);
        protoAdapter.encodeWithTag(protoWriter, 3, moneyAggregations.total_loan_paid_money);
        protoAdapter.encodeWithTag(protoWriter, 4, moneyAggregations.total_loan_fee_money);
        protoAdapter.encodeWithTag(protoWriter, 7, moneyAggregations.total_loan_late_fee_money);
        protoAdapter.encodeWithTag(protoWriter, 5, moneyAggregations.total_order_refunded_money);
        protoAdapter.encodeWithTag(protoWriter, 6, moneyAggregations.total_customer_owed_and_paid_money);
        protoAdapter.encodeWithTag(protoWriter, 8, moneyAggregations.total_discount_applied_money);
        protoAdapter.encodeWithTag(protoWriter, 9, moneyAggregations.total_discount_returned_money);
        protoAdapter.encodeWithTag(protoWriter, 10, moneyAggregations.total_dispute_returned_money);
        protoWriter.writeBytes(moneyAggregations.unknownFields());
    }
}
