package com.squareup.protos.cash.pay;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pay.CashAppPayRenderData;
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
public final class CashAppPayRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Money money;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ?? decode;
        Money money2;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        String str = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Long l = null;
        String str2 = null;
        Boolean bool = null;
        String str3 = null;
        Money money3 = null;
        Money money4 = null;
        String str4 = null;
        Money money5 = null;
        Money money6 = null;
        Money money7 = null;
        Money money8 = null;
        Integer num = null;
        String str5 = null;
        String str6 = null;
        CashAppPayRenderData.EntityType entityType = null;
        ArrayList arrayList11 = m;
        ArrayList arrayList12 = arrayList7;
        Money money9 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        while (true) {
            ArrayList arrayList13 = arrayList6;
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppPayRenderData(str, str2, arrayList11, money3, money4, money5, (Money) obj6, (Money) obj, l, money6, money7, arrayList13, money8, arrayList12, arrayList8, bool, str3, arrayList9, money9, (Money) obj3, (Money) obj4, arrayList10, str4, (Money) obj5, (Money) obj2, (Money) obj7, (Money) obj8, num, str5, str6, (Money) obj9, entityType, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    money = money9;
                    arrayList = arrayList10;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList4 = arrayList9;
                    arrayList5 = arrayList11;
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    money = money9;
                    arrayList = arrayList10;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList4 = arrayList9;
                    arrayList5 = arrayList11;
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 3:
                    money = money9;
                    arrayList = arrayList10;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList4 = arrayList9;
                    arrayList5 = arrayList11;
                    arrayList5.add(ProtoAdapter.STRING.decode(protoReader));
                    decode = str;
                    break;
                case 4:
                    money = money9;
                    arrayList = arrayList10;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList4 = arrayList9;
                    money3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, money3);
                    arrayList5 = arrayList11;
                    decode = str;
                    break;
                case 5:
                    money = money9;
                    arrayList = arrayList10;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList4 = arrayList9;
                    money4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, money4);
                    arrayList5 = arrayList11;
                    decode = str;
                    break;
                case 6:
                    money = money9;
                    arrayList = arrayList10;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList4 = arrayList9;
                    money5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, money5);
                    arrayList5 = arrayList11;
                    decode = str;
                    break;
                case 7:
                    money = money9;
                    arrayList = arrayList10;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList4 = arrayList9;
                    money6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, money6);
                    arrayList5 = arrayList11;
                    decode = str;
                    break;
                case 8:
                    money = money9;
                    arrayList = arrayList10;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList4 = arrayList9;
                    money7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, money7);
                    arrayList5 = arrayList11;
                    decode = str;
                    break;
                case 9:
                    Money money10 = money9;
                    arrayList4 = arrayList9;
                    arrayList = arrayList10;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    money = money10;
                    money8 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, money8);
                    arrayList5 = arrayList11;
                    decode = str;
                    break;
                case 10:
                    Money money11 = money9;
                    arrayList4 = arrayList9;
                    arrayList = arrayList10;
                    arrayList6 = arrayList13;
                    arrayList3 = arrayList12;
                    arrayList3.add(ProtoAdapter.STRING.decode(protoReader));
                    money = money11;
                    arrayList5 = arrayList11;
                    decode = str;
                    break;
                case 11:
                    Money money12 = money9;
                    arrayList4 = arrayList9;
                    arrayList = arrayList10;
                    arrayList6 = arrayList13;
                    arrayList6.add(ProtoAdapter.STRING.decode(protoReader));
                    money = money12;
                    arrayList5 = arrayList11;
                    arrayList3 = arrayList12;
                    decode = str;
                    break;
                case 12:
                    Money money13 = money9;
                    arrayList4 = arrayList9;
                    money2 = money13;
                    arrayList = arrayList10;
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    money = money2;
                    arrayList5 = arrayList11;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    decode = str;
                    break;
                case 13:
                    Money money14 = money9;
                    arrayList4 = arrayList9;
                    money2 = money14;
                    arrayList = arrayList10;
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    money = money2;
                    arrayList5 = arrayList11;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    decode = str;
                    break;
                case 14:
                    ArrayList arrayList14 = arrayList9;
                    money2 = money9;
                    arrayList = arrayList10;
                    arrayList4 = arrayList14;
                    arrayList4.add(ProtoAdapter.STRING.decode(protoReader));
                    money = money2;
                    arrayList5 = arrayList11;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    decode = str;
                    break;
                case 15:
                    arrayList2 = arrayList9;
                    arrayList = arrayList10;
                    money = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, money9);
                    arrayList5 = arrayList11;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList4 = arrayList2;
                    decode = str;
                    break;
                case 16:
                    arrayList2 = arrayList9;
                    money = money9;
                    arrayList = arrayList10;
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    arrayList5 = arrayList11;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList4 = arrayList2;
                    decode = str;
                    break;
                case 17:
                    arrayList2 = arrayList9;
                    money = money9;
                    arrayList = arrayList10;
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    arrayList5 = arrayList11;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList4 = arrayList2;
                    decode = str;
                    break;
                case 18:
                    arrayList2 = arrayList9;
                    money = money9;
                    arrayList = arrayList10;
                    obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                    arrayList5 = arrayList11;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList4 = arrayList2;
                    decode = str;
                    break;
                case 19:
                    arrayList2 = arrayList9;
                    money = money9;
                    arrayList = arrayList10;
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    arrayList5 = arrayList11;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList4 = arrayList2;
                    decode = str;
                    break;
                case 20:
                    arrayList2 = arrayList9;
                    money = money9;
                    arrayList = arrayList10;
                    obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj7);
                    arrayList5 = arrayList11;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList4 = arrayList2;
                    decode = str;
                    break;
                case 21:
                    arrayList2 = arrayList9;
                    money = money9;
                    arrayList = arrayList10;
                    num = ProtoAdapter.INT32.decode(protoReader);
                    arrayList5 = arrayList11;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList4 = arrayList2;
                    decode = str;
                    break;
                case 22:
                    arrayList2 = arrayList9;
                    money = money9;
                    arrayList = arrayList10;
                    arrayList8.add(CashAppPayRenderData.Refund.ADAPTER.decode(protoReader));
                    arrayList5 = arrayList11;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList4 = arrayList2;
                    decode = str;
                    break;
                case 23:
                    arrayList2 = arrayList9;
                    money = money9;
                    arrayList = arrayList10;
                    bool = ProtoAdapter.BOOL.decode(protoReader);
                    arrayList5 = arrayList11;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList4 = arrayList2;
                    decode = str;
                    break;
                case 24:
                    arrayList2 = arrayList9;
                    money = money9;
                    arrayList = arrayList10;
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList5 = arrayList11;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList4 = arrayList2;
                    decode = str;
                    break;
                case 25:
                    arrayList2 = arrayList9;
                    money = money9;
                    arrayList = arrayList10;
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList5 = arrayList11;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList4 = arrayList2;
                    decode = str;
                    break;
                case 26:
                    arrayList2 = arrayList9;
                    money = money9;
                    arrayList = arrayList10;
                    obj8 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj8);
                    arrayList5 = arrayList11;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList4 = arrayList2;
                    decode = str;
                    break;
                case 27:
                    arrayList2 = arrayList9;
                    money = money9;
                    arrayList = arrayList10;
                    obj9 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj9);
                    arrayList5 = arrayList11;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList4 = arrayList2;
                    decode = str;
                    break;
                case 28:
                    try {
                        entityType = CashAppPayRenderData.EntityType.ADAPTER.decode(protoReader);
                        money = money9;
                        arrayList = arrayList10;
                        arrayList3 = arrayList12;
                        arrayList6 = arrayList13;
                        decode = str;
                        arrayList4 = arrayList9;
                        arrayList5 = arrayList11;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        arrayList = arrayList10;
                        arrayList2 = arrayList9;
                        money = money9;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 29:
                    obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj6);
                    money = money9;
                    arrayList = arrayList10;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    decode = str;
                    arrayList4 = arrayList9;
                    arrayList5 = arrayList11;
                    break;
                case 30:
                    obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
                    money = money9;
                    arrayList = arrayList10;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    decode = str;
                    arrayList4 = arrayList9;
                    arrayList5 = arrayList11;
                    break;
                case 31:
                default:
                    protoReader.readUnknownField(nextTag);
                    money = money9;
                    arrayList = arrayList10;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList4 = arrayList9;
                    arrayList5 = arrayList11;
                    decode = str;
                    break;
                case 32:
                    l = ProtoAdapter.UINT64.decode(protoReader);
                    money = money9;
                    arrayList = arrayList10;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    decode = str;
                    arrayList4 = arrayList9;
                    arrayList5 = arrayList11;
                    break;
                case 33:
                    arrayList10.add(CashAppPayRenderData.Dispute.ADAPTER.decode(protoReader));
                    money = money9;
                    arrayList = arrayList10;
                    arrayList3 = arrayList12;
                    arrayList6 = arrayList13;
                    arrayList4 = arrayList9;
                    arrayList5 = arrayList11;
                    decode = str;
                    break;
            }
            str = decode;
            arrayList11 = arrayList5;
            arrayList9 = arrayList4;
            arrayList12 = arrayList3;
            arrayList10 = arrayList;
            money9 = money;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayRenderData cashAppPayRenderData = (CashAppPayRenderData) obj;
        reverseProtoWriter.getClass();
        cashAppPayRenderData.getClass();
        reverseProtoWriter.writeBytes(cashAppPayRenderData.unknownFields());
        CashAppPayRenderData.EntityType.ADAPTER.encodeWithTag(reverseProtoWriter, 28, cashAppPayRenderData.entity_type);
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 27, cashAppPayRenderData.customer_deposit_money);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 25, cashAppPayRenderData.payment_plan_flow_url);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 24, cashAppPayRenderData.tila_document_token);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 21, cashAppPayRenderData.loan_total_payment_count);
        protoAdapter.encodeWithTag(reverseProtoWriter, 26, cashAppPayRenderData.loan_remaining_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 20, cashAppPayRenderData.loan_down_payment_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 19, cashAppPayRenderData.loan_borrowed_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 18, cashAppPayRenderData.loan_fee_money);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 13, cashAppPayRenderData.loan_token);
        CashAppPayRenderData.Dispute.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 33, cashAppPayRenderData.disputes);
        protoAdapter.encodeWithTag(reverseProtoWriter, 17, cashAppPayRenderData.customer_dispute_clawback_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 16, cashAppPayRenderData.customer_dispute_final_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 15, cashAppPayRenderData.customer_dispute_credit_money);
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 14, cashAppPayRenderData.dispute_tokens);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 12, cashAppPayRenderData.order_id);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 23, cashAppPayRenderData.has_pending_refund_capture);
        CashAppPayRenderData.Refund.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 22, cashAppPayRenderData.linked_refunds);
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 10, cashAppPayRenderData.linked_refund_tokens);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, cashAppPayRenderData.customer_total_refund_money);
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 11, cashAppPayRenderData.recurring_series_ids);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, cashAppPayRenderData.customer_void_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, cashAppPayRenderData.customer_discount_reclaimed_money);
        ProtoAdapter.UINT64.encodeWithTag(reverseProtoWriter, 32, cashAppPayRenderData.customer_variable_discount_bps);
        protoAdapter.encodeWithTag(reverseProtoWriter, 30, cashAppPayRenderData.customer_variable_discount_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 29, cashAppPayRenderData.customer_fixed_discount_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, cashAppPayRenderData.customer_discount_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, cashAppPayRenderData.customer_capture_money);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, cashAppPayRenderData.customer_auth_money);
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 3, cashAppPayRenderData.failure_reasons);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, cashAppPayRenderData.state);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, cashAppPayRenderData.authorization_channel);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayRenderData cashAppPayRenderData = (CashAppPayRenderData) obj;
        cashAppPayRenderData.getClass();
        int size$okio = cashAppPayRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.asRepeated().encodedSizeWithTag(3, cashAppPayRenderData.failure_reasons) + protoAdapter.encodedSizeWithTag(2, cashAppPayRenderData.state) + protoAdapter.encodedSizeWithTag(1, cashAppPayRenderData.authorization_channel) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        return CashAppPayRenderData.EntityType.ADAPTER.encodedSizeWithTag(28, cashAppPayRenderData.entity_type) + protoAdapter2.encodedSizeWithTag(27, cashAppPayRenderData.customer_deposit_money) + protoAdapter.encodedSizeWithTag(25, cashAppPayRenderData.payment_plan_flow_url) + protoAdapter.encodedSizeWithTag(24, cashAppPayRenderData.tila_document_token) + ProtoAdapter.INT32.encodedSizeWithTag(21, cashAppPayRenderData.loan_total_payment_count) + protoAdapter2.encodedSizeWithTag(26, cashAppPayRenderData.loan_remaining_money) + protoAdapter2.encodedSizeWithTag(20, cashAppPayRenderData.loan_down_payment_money) + protoAdapter2.encodedSizeWithTag(19, cashAppPayRenderData.loan_borrowed_money) + protoAdapter2.encodedSizeWithTag(18, cashAppPayRenderData.loan_fee_money) + protoAdapter.encodedSizeWithTag(13, cashAppPayRenderData.loan_token) + CashAppPayRenderData.Dispute.ADAPTER.asRepeated().encodedSizeWithTag(33, cashAppPayRenderData.disputes) + protoAdapter2.encodedSizeWithTag(17, cashAppPayRenderData.customer_dispute_clawback_money) + protoAdapter2.encodedSizeWithTag(16, cashAppPayRenderData.customer_dispute_final_money) + protoAdapter2.encodedSizeWithTag(15, cashAppPayRenderData.customer_dispute_credit_money) + protoAdapter.asRepeated().encodedSizeWithTag(14, cashAppPayRenderData.dispute_tokens) + protoAdapter.encodedSizeWithTag(12, cashAppPayRenderData.order_id) + ProtoAdapter.BOOL.encodedSizeWithTag(23, cashAppPayRenderData.has_pending_refund_capture) + CashAppPayRenderData.Refund.ADAPTER.asRepeated().encodedSizeWithTag(22, cashAppPayRenderData.linked_refunds) + protoAdapter.asRepeated().encodedSizeWithTag(10, cashAppPayRenderData.linked_refund_tokens) + protoAdapter2.encodedSizeWithTag(9, cashAppPayRenderData.customer_total_refund_money) + protoAdapter.asRepeated().encodedSizeWithTag(11, cashAppPayRenderData.recurring_series_ids) + protoAdapter2.encodedSizeWithTag(8, cashAppPayRenderData.customer_void_money) + protoAdapter2.encodedSizeWithTag(7, cashAppPayRenderData.customer_discount_reclaimed_money) + ProtoAdapter.UINT64.encodedSizeWithTag(32, cashAppPayRenderData.customer_variable_discount_bps) + protoAdapter2.encodedSizeWithTag(30, cashAppPayRenderData.customer_variable_discount_money) + protoAdapter2.encodedSizeWithTag(29, cashAppPayRenderData.customer_fixed_discount_money) + protoAdapter2.encodedSizeWithTag(6, cashAppPayRenderData.customer_discount_money) + protoAdapter2.encodedSizeWithTag(5, cashAppPayRenderData.customer_capture_money) + protoAdapter2.encodedSizeWithTag(4, cashAppPayRenderData.customer_auth_money) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayRenderData cashAppPayRenderData = (CashAppPayRenderData) obj;
        cashAppPayRenderData.getClass();
        Money money = cashAppPayRenderData.customer_auth_money;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = cashAppPayRenderData.customer_capture_money;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = cashAppPayRenderData.customer_discount_money;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        Money money7 = cashAppPayRenderData.customer_fixed_discount_money;
        Money money8 = money7 != null ? (Money) Money.ADAPTER.redact(money7) : null;
        Money money9 = cashAppPayRenderData.customer_variable_discount_money;
        Money money10 = money9 != null ? (Money) Money.ADAPTER.redact(money9) : null;
        Money money11 = cashAppPayRenderData.customer_discount_reclaimed_money;
        Money money12 = money11 != null ? (Money) Money.ADAPTER.redact(money11) : null;
        Money money13 = cashAppPayRenderData.customer_void_money;
        Money money14 = money13 != null ? (Money) Money.ADAPTER.redact(money13) : null;
        Money money15 = cashAppPayRenderData.customer_total_refund_money;
        Money money16 = money15 != null ? (Money) Money.ADAPTER.redact(money15) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cashAppPayRenderData.linked_refunds, CashAppPayRenderData.Refund.ADAPTER);
        Money money17 = cashAppPayRenderData.customer_dispute_credit_money;
        Money money18 = money17 != null ? (Money) Money.ADAPTER.redact(money17) : null;
        Money money19 = cashAppPayRenderData.customer_dispute_final_money;
        Money money20 = money19 != null ? (Money) Money.ADAPTER.redact(money19) : null;
        Money money21 = cashAppPayRenderData.customer_dispute_clawback_money;
        Money money22 = money21 != null ? (Money) Money.ADAPTER.redact(money21) : null;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(cashAppPayRenderData.disputes, CashAppPayRenderData.Dispute.ADAPTER);
        Money money23 = cashAppPayRenderData.loan_fee_money;
        Money money24 = money23 != null ? (Money) Money.ADAPTER.redact(money23) : null;
        Money money25 = cashAppPayRenderData.loan_borrowed_money;
        Money money26 = money25 != null ? (Money) Money.ADAPTER.redact(money25) : null;
        Money money27 = cashAppPayRenderData.loan_down_payment_money;
        Money money28 = money27 != null ? (Money) Money.ADAPTER.redact(money27) : null;
        Money money29 = cashAppPayRenderData.loan_remaining_money;
        Money money30 = money29 != null ? (Money) Money.ADAPTER.redact(money29) : null;
        Money money31 = cashAppPayRenderData.customer_deposit_money;
        Money money32 = money31 != null ? (Money) Money.ADAPTER.redact(money31) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cashAppPayRenderData.authorization_channel;
        String str2 = cashAppPayRenderData.state;
        List list = cashAppPayRenderData.failure_reasons;
        Long l = cashAppPayRenderData.customer_variable_discount_bps;
        List list2 = cashAppPayRenderData.recurring_series_ids;
        List list3 = cashAppPayRenderData.linked_refund_tokens;
        Boolean bool = cashAppPayRenderData.has_pending_refund_capture;
        String str3 = cashAppPayRenderData.order_id;
        List list4 = cashAppPayRenderData.dispute_tokens;
        String str4 = cashAppPayRenderData.loan_token;
        Integer num = cashAppPayRenderData.loan_total_payment_count;
        String str5 = cashAppPayRenderData.tila_document_token;
        String str6 = cashAppPayRenderData.payment_plan_flow_url;
        CashAppPayRenderData.EntityType entityType = cashAppPayRenderData.entity_type;
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        byteString.getClass();
        return new CashAppPayRenderData(str, str2, list, money2, money4, money6, money8, money10, l, money12, money14, list2, money16, list3, m1169redactElements, bool, str3, list4, money18, money20, money22, m1169redactElements2, str4, money24, money26, money28, money30, num, str5, str6, money32, entityType, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayRenderData cashAppPayRenderData = (CashAppPayRenderData) obj;
        cashAppPayRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cashAppPayRenderData.authorization_channel);
        protoAdapter.encodeWithTag(protoWriter, 2, cashAppPayRenderData.state);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, cashAppPayRenderData.failure_reasons);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 4, cashAppPayRenderData.customer_auth_money);
        protoAdapter2.encodeWithTag(protoWriter, 5, cashAppPayRenderData.customer_capture_money);
        protoAdapter2.encodeWithTag(protoWriter, 6, cashAppPayRenderData.customer_discount_money);
        protoAdapter2.encodeWithTag(protoWriter, 29, cashAppPayRenderData.customer_fixed_discount_money);
        protoAdapter2.encodeWithTag(protoWriter, 30, cashAppPayRenderData.customer_variable_discount_money);
        ProtoAdapter.UINT64.encodeWithTag(protoWriter, 32, cashAppPayRenderData.customer_variable_discount_bps);
        protoAdapter2.encodeWithTag(protoWriter, 7, cashAppPayRenderData.customer_discount_reclaimed_money);
        protoAdapter2.encodeWithTag(protoWriter, 8, cashAppPayRenderData.customer_void_money);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 11, cashAppPayRenderData.recurring_series_ids);
        protoAdapter2.encodeWithTag(protoWriter, 9, cashAppPayRenderData.customer_total_refund_money);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 10, cashAppPayRenderData.linked_refund_tokens);
        CashAppPayRenderData.Refund.ADAPTER.asRepeated().encodeWithTag(protoWriter, 22, cashAppPayRenderData.linked_refunds);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 23, cashAppPayRenderData.has_pending_refund_capture);
        protoAdapter.encodeWithTag(protoWriter, 12, cashAppPayRenderData.order_id);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 14, cashAppPayRenderData.dispute_tokens);
        protoAdapter2.encodeWithTag(protoWriter, 15, cashAppPayRenderData.customer_dispute_credit_money);
        protoAdapter2.encodeWithTag(protoWriter, 16, cashAppPayRenderData.customer_dispute_final_money);
        protoAdapter2.encodeWithTag(protoWriter, 17, cashAppPayRenderData.customer_dispute_clawback_money);
        CashAppPayRenderData.Dispute.ADAPTER.asRepeated().encodeWithTag(protoWriter, 33, cashAppPayRenderData.disputes);
        protoAdapter.encodeWithTag(protoWriter, 13, cashAppPayRenderData.loan_token);
        protoAdapter2.encodeWithTag(protoWriter, 18, cashAppPayRenderData.loan_fee_money);
        protoAdapter2.encodeWithTag(protoWriter, 19, cashAppPayRenderData.loan_borrowed_money);
        protoAdapter2.encodeWithTag(protoWriter, 20, cashAppPayRenderData.loan_down_payment_money);
        protoAdapter2.encodeWithTag(protoWriter, 26, cashAppPayRenderData.loan_remaining_money);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 21, cashAppPayRenderData.loan_total_payment_count);
        protoAdapter.encodeWithTag(protoWriter, 24, cashAppPayRenderData.tila_document_token);
        protoAdapter.encodeWithTag(protoWriter, 25, cashAppPayRenderData.payment_plan_flow_url);
        protoAdapter2.encodeWithTag(protoWriter, 27, cashAppPayRenderData.customer_deposit_money);
        CashAppPayRenderData.EntityType.ADAPTER.encodeWithTag(protoWriter, 28, cashAppPayRenderData.entity_type);
        protoWriter.writeBytes(cashAppPayRenderData.unknownFields());
    }
}
