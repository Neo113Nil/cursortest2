package com.squareup.protos.cash.local.activity;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.activity.CashAppLocalOrderRenderData;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppLocalOrderRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        ArrayList arrayList;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        String str = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        CashAppLocalOrderRenderData.OrderStatus orderStatus = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                Object obj12 = obj2;
                return new CashAppLocalOrderRenderData(str, orderStatus, str2, str3, str4, m, (CashAppLocalOrderRenderData.Actions) obj7, (Money) obj8, (Money) obj9, (Money) obj10, (Money) obj11, (Money) obj12, (CashAppLocalOrderRenderData.OrderPaymentData) obj3, (Money) obj4, (CashAppLocalOrderRenderData.LocalCashData) obj5, (CashAppLocalOrderRenderData.OrderActivityEntry) obj6, arrayList2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    arrayList = m;
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    try {
                        orderStatus = CashAppLocalOrderRenderData.OrderStatus.ADAPTER.decode(protoReader);
                        arrayList = m;
                        decode = str;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj2;
                        arrayList = m;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    decode = str;
                    break;
                case 4:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    decode = str;
                    break;
                case 5:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = m;
                    decode = str;
                    break;
                case 6:
                    m.add(CashAppLocalOrderRenderData.OrderLine.ADAPTER.decode(protoReader));
                    obj = obj2;
                    arrayList = m;
                    decode = str;
                    obj2 = obj;
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(CashAppLocalOrderRenderData.Actions.ADAPTER, protoReader, obj7);
                    arrayList = m;
                    decode = str;
                    break;
                case 8:
                case 13:
                case 14:
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj2;
                    arrayList = m;
                    decode = str;
                    obj2 = obj;
                    break;
                case 9:
                    obj8 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj8);
                    arrayList = m;
                    decode = str;
                    break;
                case 10:
                    obj9 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj9);
                    arrayList = m;
                    decode = str;
                    break;
                case 11:
                    obj10 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj10);
                    arrayList = m;
                    decode = str;
                    break;
                case 12:
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    arrayList = m;
                    decode = str;
                    break;
                case 15:
                    obj3 = TransactorKt.decodeMessageOrMerge(CashAppLocalOrderRenderData.OrderPaymentData.ADAPTER, protoReader, obj3);
                    arrayList = m;
                    decode = str;
                    break;
                case 16:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    arrayList = m;
                    decode = str;
                    break;
                case 17:
                    obj5 = TransactorKt.decodeMessageOrMerge(CashAppLocalOrderRenderData.LocalCashData.ADAPTER, protoReader, obj5);
                    arrayList = m;
                    decode = str;
                    break;
                case 18:
                    obj6 = TransactorKt.decodeMessageOrMerge(CashAppLocalOrderRenderData.OrderActivityEntry.ADAPTER, protoReader, obj6);
                    arrayList = m;
                    decode = str;
                    break;
                case 19:
                    obj11 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj11);
                    arrayList = m;
                    decode = str;
                    break;
                case 20:
                    arrayList2.add(CashAppLocalOrderRenderData.AdjustmentLine.ADAPTER.decode(protoReader));
                    obj = obj2;
                    arrayList = m;
                    decode = str;
                    obj2 = obj;
                    break;
            }
            str = decode;
            m = arrayList;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppLocalOrderRenderData cashAppLocalOrderRenderData = (CashAppLocalOrderRenderData) obj;
        reverseProtoWriter.getClass();
        cashAppLocalOrderRenderData.getClass();
        reverseProtoWriter.writeBytes(cashAppLocalOrderRenderData.unknownFields());
        CashAppLocalOrderRenderData.AdjustmentLine.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 20, cashAppLocalOrderRenderData.adjustment_lines);
        CashAppLocalOrderRenderData.OrderActivityEntry.ADAPTER.encodeWithTag(reverseProtoWriter, 18, cashAppLocalOrderRenderData.order_activity_entry);
        CashAppLocalOrderRenderData.LocalCashData.ADAPTER.encodeWithTag(reverseProtoWriter, 17, cashAppLocalOrderRenderData.local_cash_data);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 16, cashAppLocalOrderRenderData.total_amount_paid_by_buyer);
        CashAppLocalOrderRenderData.OrderPaymentData.ADAPTER.encodeWithTag(reverseProtoWriter, 15, cashAppLocalOrderRenderData.order_payment_data);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, cashAppLocalOrderRenderData.order_total_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 19, cashAppLocalOrderRenderData.order_fee_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, cashAppLocalOrderRenderData.order_tip_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, cashAppLocalOrderRenderData.order_tax_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, cashAppLocalOrderRenderData.order_subtotal_amount);
        CashAppLocalOrderRenderData.Actions.ADAPTER.encodeWithTag(reverseProtoWriter, 7, cashAppLocalOrderRenderData.actions);
        CashAppLocalOrderRenderData.OrderLine.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, cashAppLocalOrderRenderData.order_lines);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, cashAppLocalOrderRenderData.location_address);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, cashAppLocalOrderRenderData.pickup_time);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, cashAppLocalOrderRenderData.buyer_name);
        CashAppLocalOrderRenderData.OrderStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 2, cashAppLocalOrderRenderData.order_status);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, cashAppLocalOrderRenderData.brand_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppLocalOrderRenderData cashAppLocalOrderRenderData = (CashAppLocalOrderRenderData) obj;
        cashAppLocalOrderRenderData.getClass();
        int size$okio = cashAppLocalOrderRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = CashAppLocalOrderRenderData.Actions.ADAPTER.encodedSizeWithTag(7, cashAppLocalOrderRenderData.actions) + CashAppLocalOrderRenderData.OrderLine.ADAPTER.asRepeated().encodedSizeWithTag(6, cashAppLocalOrderRenderData.order_lines) + protoAdapter.encodedSizeWithTag(5, cashAppLocalOrderRenderData.location_address) + protoAdapter.encodedSizeWithTag(4, cashAppLocalOrderRenderData.pickup_time) + protoAdapter.encodedSizeWithTag(3, cashAppLocalOrderRenderData.buyer_name) + CashAppLocalOrderRenderData.OrderStatus.ADAPTER.encodedSizeWithTag(2, cashAppLocalOrderRenderData.order_status) + protoAdapter.encodedSizeWithTag(1, cashAppLocalOrderRenderData.brand_name) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        return CashAppLocalOrderRenderData.AdjustmentLine.ADAPTER.asRepeated().encodedSizeWithTag(20, cashAppLocalOrderRenderData.adjustment_lines) + CashAppLocalOrderRenderData.OrderActivityEntry.ADAPTER.encodedSizeWithTag(18, cashAppLocalOrderRenderData.order_activity_entry) + CashAppLocalOrderRenderData.LocalCashData.ADAPTER.encodedSizeWithTag(17, cashAppLocalOrderRenderData.local_cash_data) + protoAdapter2.encodedSizeWithTag(16, cashAppLocalOrderRenderData.total_amount_paid_by_buyer) + CashAppLocalOrderRenderData.OrderPaymentData.ADAPTER.encodedSizeWithTag(15, cashAppLocalOrderRenderData.order_payment_data) + protoAdapter2.encodedSizeWithTag(12, cashAppLocalOrderRenderData.order_total_amount) + protoAdapter2.encodedSizeWithTag(19, cashAppLocalOrderRenderData.order_fee_amount) + protoAdapter2.encodedSizeWithTag(11, cashAppLocalOrderRenderData.order_tip_amount) + protoAdapter2.encodedSizeWithTag(10, cashAppLocalOrderRenderData.order_tax_amount) + protoAdapter2.encodedSizeWithTag(9, cashAppLocalOrderRenderData.order_subtotal_amount) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppLocalOrderRenderData cashAppLocalOrderRenderData = (CashAppLocalOrderRenderData) obj;
        cashAppLocalOrderRenderData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cashAppLocalOrderRenderData.order_lines, CashAppLocalOrderRenderData.OrderLine.ADAPTER);
        CashAppLocalOrderRenderData.Actions actions = cashAppLocalOrderRenderData.actions;
        CashAppLocalOrderRenderData.Actions actions2 = actions != null ? (CashAppLocalOrderRenderData.Actions) CashAppLocalOrderRenderData.Actions.ADAPTER.redact(actions) : null;
        Money money = cashAppLocalOrderRenderData.order_subtotal_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = cashAppLocalOrderRenderData.order_tax_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = cashAppLocalOrderRenderData.order_tip_amount;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        Money money7 = cashAppLocalOrderRenderData.order_fee_amount;
        Money money8 = money7 != null ? (Money) Money.ADAPTER.redact(money7) : null;
        Money money9 = cashAppLocalOrderRenderData.order_total_amount;
        Money money10 = money9 != null ? (Money) Money.ADAPTER.redact(money9) : null;
        CashAppLocalOrderRenderData.OrderPaymentData orderPaymentData = cashAppLocalOrderRenderData.order_payment_data;
        CashAppLocalOrderRenderData.OrderPaymentData orderPaymentData2 = orderPaymentData != null ? (CashAppLocalOrderRenderData.OrderPaymentData) CashAppLocalOrderRenderData.OrderPaymentData.ADAPTER.redact(orderPaymentData) : null;
        Money money11 = cashAppLocalOrderRenderData.total_amount_paid_by_buyer;
        Money money12 = money11 != null ? (Money) Money.ADAPTER.redact(money11) : null;
        CashAppLocalOrderRenderData.LocalCashData localCashData = cashAppLocalOrderRenderData.local_cash_data;
        CashAppLocalOrderRenderData.LocalCashData localCashData2 = localCashData != null ? (CashAppLocalOrderRenderData.LocalCashData) CashAppLocalOrderRenderData.LocalCashData.ADAPTER.redact(localCashData) : null;
        CashAppLocalOrderRenderData.OrderActivityEntry orderActivityEntry = cashAppLocalOrderRenderData.order_activity_entry;
        CashAppLocalOrderRenderData.OrderActivityEntry orderActivityEntry2 = orderActivityEntry != null ? (CashAppLocalOrderRenderData.OrderActivityEntry) CashAppLocalOrderRenderData.OrderActivityEntry.ADAPTER.redact(orderActivityEntry) : null;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(cashAppLocalOrderRenderData.adjustment_lines, CashAppLocalOrderRenderData.AdjustmentLine.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = cashAppLocalOrderRenderData.brand_name;
        CashAppLocalOrderRenderData.OrderStatus orderStatus = cashAppLocalOrderRenderData.order_status;
        String str2 = cashAppLocalOrderRenderData.pickup_time;
        String str3 = cashAppLocalOrderRenderData.location_address;
        byteString.getClass();
        return new CashAppLocalOrderRenderData(str, orderStatus, null, str2, str3, m1169redactElements, actions2, money2, money4, money6, money8, money10, orderPaymentData2, money12, localCashData2, orderActivityEntry2, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppLocalOrderRenderData cashAppLocalOrderRenderData = (CashAppLocalOrderRenderData) obj;
        cashAppLocalOrderRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cashAppLocalOrderRenderData.brand_name);
        CashAppLocalOrderRenderData.OrderStatus.ADAPTER.encodeWithTag(protoWriter, 2, cashAppLocalOrderRenderData.order_status);
        protoAdapter.encodeWithTag(protoWriter, 3, cashAppLocalOrderRenderData.buyer_name);
        protoAdapter.encodeWithTag(protoWriter, 4, cashAppLocalOrderRenderData.pickup_time);
        protoAdapter.encodeWithTag(protoWriter, 5, cashAppLocalOrderRenderData.location_address);
        CashAppLocalOrderRenderData.OrderLine.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, cashAppLocalOrderRenderData.order_lines);
        CashAppLocalOrderRenderData.Actions.ADAPTER.encodeWithTag(protoWriter, 7, cashAppLocalOrderRenderData.actions);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 9, cashAppLocalOrderRenderData.order_subtotal_amount);
        protoAdapter2.encodeWithTag(protoWriter, 10, cashAppLocalOrderRenderData.order_tax_amount);
        protoAdapter2.encodeWithTag(protoWriter, 11, cashAppLocalOrderRenderData.order_tip_amount);
        protoAdapter2.encodeWithTag(protoWriter, 19, cashAppLocalOrderRenderData.order_fee_amount);
        protoAdapter2.encodeWithTag(protoWriter, 12, cashAppLocalOrderRenderData.order_total_amount);
        CashAppLocalOrderRenderData.OrderPaymentData.ADAPTER.encodeWithTag(protoWriter, 15, cashAppLocalOrderRenderData.order_payment_data);
        protoAdapter2.encodeWithTag(protoWriter, 16, cashAppLocalOrderRenderData.total_amount_paid_by_buyer);
        CashAppLocalOrderRenderData.LocalCashData.ADAPTER.encodeWithTag(protoWriter, 17, cashAppLocalOrderRenderData.local_cash_data);
        CashAppLocalOrderRenderData.OrderActivityEntry.ADAPTER.encodeWithTag(protoWriter, 18, cashAppLocalOrderRenderData.order_activity_entry);
        CashAppLocalOrderRenderData.AdjustmentLine.ADAPTER.asRepeated().encodeWithTag(protoWriter, 20, cashAppLocalOrderRenderData.adjustment_lines);
        protoWriter.writeBytes(cashAppLocalOrderRenderData.unknownFields());
    }
}
