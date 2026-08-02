package com.squareup.protos.cash.pay;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayOrderRenderData$OrderAggregations$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppPayOrderRenderData.OrderAggregations((CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayOrderRenderData.OrderAggregations orderAggregations = (CashAppPayOrderRenderData.OrderAggregations) obj;
        reverseProtoWriter.getClass();
        orderAggregations.getClass();
        reverseProtoWriter.writeBytes(orderAggregations.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, orderAggregations.completed_loan_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, orderAggregations.active_loan_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, orderAggregations.oldest_overdue_payment_schedule_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, orderAggregations.next_upcoming_payment_schedule_id);
        CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations.ADAPTER.encodeWithTag(reverseProtoWriter, 1, orderAggregations.money_aggregations);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayOrderRenderData.OrderAggregations orderAggregations = (CashAppPayOrderRenderData.OrderAggregations) obj;
        orderAggregations.getClass();
        int encodedSizeWithTag = CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations.ADAPTER.encodedSizeWithTag(1, orderAggregations.money_aggregations) + orderAggregations.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, orderAggregations.completed_loan_id) + protoAdapter.encodedSizeWithTag(4, orderAggregations.active_loan_id) + protoAdapter.encodedSizeWithTag(3, orderAggregations.oldest_overdue_payment_schedule_id) + protoAdapter.encodedSizeWithTag(2, orderAggregations.next_upcoming_payment_schedule_id) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayOrderRenderData.OrderAggregations orderAggregations = (CashAppPayOrderRenderData.OrderAggregations) obj;
        orderAggregations.getClass();
        CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations moneyAggregations = orderAggregations.money_aggregations;
        CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations moneyAggregations2 = moneyAggregations != null ? (CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations) CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations.ADAPTER.redact(moneyAggregations) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = orderAggregations.next_upcoming_payment_schedule_id;
        String str2 = orderAggregations.oldest_overdue_payment_schedule_id;
        String str3 = orderAggregations.active_loan_id;
        String str4 = orderAggregations.completed_loan_id;
        byteString.getClass();
        return new CashAppPayOrderRenderData.OrderAggregations(moneyAggregations2, str, str2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayOrderRenderData.OrderAggregations orderAggregations = (CashAppPayOrderRenderData.OrderAggregations) obj;
        orderAggregations.getClass();
        CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations.ADAPTER.encodeWithTag(protoWriter, 1, orderAggregations.money_aggregations);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, orderAggregations.next_upcoming_payment_schedule_id);
        protoAdapter.encodeWithTag(protoWriter, 3, orderAggregations.oldest_overdue_payment_schedule_id);
        protoAdapter.encodeWithTag(protoWriter, 4, orderAggregations.active_loan_id);
        protoAdapter.encodeWithTag(protoWriter, 5, orderAggregations.completed_loan_id);
        protoWriter.writeBytes(orderAggregations.unknownFields());
    }
}
