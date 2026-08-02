package com.squareup.protos.cash.pay;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pay.CashAppPayPaymentRenderData;
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
public final class CashAppPayPaymentRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        String str = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        CashAppPayPaymentRenderData.PaymentState paymentState = null;
        Long l = null;
        Long l2 = null;
        Long l3 = null;
        Long l4 = null;
        Long l5 = null;
        Long l6 = null;
        Long l7 = null;
        CashAppPayPaymentRenderData.AuthorizationChannel authorizationChannel = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Object obj9 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppPayPaymentRenderData(str, str2, (CashAppPayMerchantRenderData) obj3, str3, str4, paymentState, (Money) obj7, (Money) obj8, (Money) obj, (Money) obj2, (Money) obj4, (Money) obj5, (Money) obj6, l, l2, l3, l4, l5, l6, l7, m, authorizationChannel, arrayList4, str5, (CashAppPayInstrumentRenderData) obj9, arrayList5, arrayList6, str7, str6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 3:
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    obj3 = TransactorKt.decodeMessageOrMerge(CashAppPayMerchantRenderData.ADAPTER, protoReader, obj3);
                    decode = str;
                    break;
                case 4:
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 5:
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    try {
                        paymentState = CashAppPayPaymentRenderData.PaymentState.ADAPTER.decode(protoReader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                    }
                    decode = str;
                    break;
                case 6:
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj7);
                    decode = str;
                    break;
                case 7:
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    obj8 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj8);
                    decode = str;
                    break;
                case 8:
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
                    decode = str;
                    break;
                case 9:
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    decode = str;
                    break;
                case 10:
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    decode = str;
                    break;
                case 11:
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    l = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 12:
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    l2 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 13:
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    l3 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 14:
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    l4 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 15:
                default:
                    protoReader.readUnknownField(nextTag);
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    decode = str;
                    break;
                case 16:
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    l7 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str;
                    break;
                case 17:
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    m.add(ProtoAdapter.STRING.decode(protoReader));
                    decode = str;
                    break;
                case 18:
                    try {
                        authorizationChannel = CashAppPayPaymentRenderData.AuthorizationChannel.ADAPTER.decode(protoReader);
                        arrayList = arrayList4;
                        arrayList2 = arrayList5;
                        arrayList3 = arrayList6;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        arrayList = arrayList4;
                        arrayList2 = arrayList5;
                        arrayList3 = arrayList6;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                    }
                    decode = str;
                    break;
                case 19:
                    arrayList4.add(CashAppPayPaymentRenderData.DiscountRenderData.ADAPTER.decode(protoReader));
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    decode = str;
                    break;
                case 20:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    decode = str;
                    break;
                case 21:
                    obj9 = TransactorKt.decodeMessageOrMerge(CashAppPayInstrumentRenderData.ADAPTER, protoReader, obj9);
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    decode = str;
                    break;
                case 22:
                    l5 = ProtoAdapter.INT64.decode(protoReader);
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    decode = str;
                    break;
                case 23:
                    obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj5);
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    decode = str;
                    break;
                case 24:
                    l6 = ProtoAdapter.INT64.decode(protoReader);
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    decode = str;
                    break;
                case 25:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    decode = str;
                    break;
                case 26:
                    obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj6);
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    decode = str;
                    break;
                case 27:
                    arrayList5.add(ProtoAdapter.STRING.decode(protoReader));
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    decode = str;
                    break;
                case 28:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    decode = str;
                    break;
                case 29:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    decode = str;
                    break;
                case 30:
                    arrayList6.add(ProtoAdapter.STRING.decode(protoReader));
                    arrayList = arrayList4;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    decode = str;
                    break;
            }
            str = decode;
            arrayList4 = arrayList;
            arrayList5 = arrayList2;
            arrayList6 = arrayList3;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayPaymentRenderData cashAppPayPaymentRenderData = (CashAppPayPaymentRenderData) obj;
        reverseProtoWriter.getClass();
        cashAppPayPaymentRenderData.getClass();
        reverseProtoWriter.writeBytes(cashAppPayPaymentRenderData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 29, cashAppPayPaymentRenderData.associated_order_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 28, cashAppPayPaymentRenderData.statement_descriptor);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 30, cashAppPayPaymentRenderData.dispute_ids);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 27, cashAppPayPaymentRenderData.refund_ids);
        CashAppPayInstrumentRenderData.ADAPTER.encodeWithTag(reverseProtoWriter, 21, cashAppPayPaymentRenderData.instrument);
        protoAdapter.encodeWithTag(reverseProtoWriter, 20, cashAppPayPaymentRenderData.associated_loan_id);
        CashAppPayPaymentRenderData.DiscountRenderData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 19, cashAppPayPaymentRenderData.discounts);
        CashAppPayPaymentRenderData.AuthorizationChannel.ADAPTER.encodeWithTag(reverseProtoWriter, 18, cashAppPayPaymentRenderData.authorization_channel);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 17, cashAppPayPaymentRenderData.failure_reasons);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 16, cashAppPayPaymentRenderData.installment_number);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 24, cashAppPayPaymentRenderData.hidden_until_date);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 22, cashAppPayPaymentRenderData.display_date);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 14, cashAppPayPaymentRenderData.failed_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 13, cashAppPayPaymentRenderData.voided_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 12, cashAppPayPaymentRenderData.captured_at);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, cashAppPayPaymentRenderData.authorized_at);
        ProtoAdapter protoAdapter3 = Money.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 26, cashAppPayPaymentRenderData.dispute_won_money);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 23, cashAppPayPaymentRenderData.scheduled_money);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 10, cashAppPayPaymentRenderData.refunded_money);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 9, cashAppPayPaymentRenderData.failed_money);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 8, cashAppPayPaymentRenderData.void_money);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 7, cashAppPayPaymentRenderData.capture_money);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 6, cashAppPayPaymentRenderData.auth_money);
        CashAppPayPaymentRenderData.PaymentState.ADAPTER.encodeWithTag(reverseProtoWriter, 5, cashAppPayPaymentRenderData.state);
        protoAdapter.encodeWithTag(reverseProtoWriter, 25, cashAppPayPaymentRenderData.external_reference_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, cashAppPayPaymentRenderData.display_id);
        CashAppPayMerchantRenderData.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cashAppPayPaymentRenderData.merchant);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cashAppPayPaymentRenderData.order_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cashAppPayPaymentRenderData.payment_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayPaymentRenderData cashAppPayPaymentRenderData = (CashAppPayPaymentRenderData) obj;
        cashAppPayPaymentRenderData.getClass();
        int size$okio = cashAppPayPaymentRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = CashAppPayPaymentRenderData.PaymentState.ADAPTER.encodedSizeWithTag(5, cashAppPayPaymentRenderData.state) + protoAdapter.encodedSizeWithTag(25, cashAppPayPaymentRenderData.external_reference_id) + protoAdapter.encodedSizeWithTag(4, cashAppPayPaymentRenderData.display_id) + CashAppPayMerchantRenderData.ADAPTER.encodedSizeWithTag(3, cashAppPayPaymentRenderData.merchant) + protoAdapter.encodedSizeWithTag(2, cashAppPayPaymentRenderData.order_id) + protoAdapter.encodedSizeWithTag(1, cashAppPayPaymentRenderData.payment_id) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(26, cashAppPayPaymentRenderData.dispute_won_money) + protoAdapter2.encodedSizeWithTag(23, cashAppPayPaymentRenderData.scheduled_money) + protoAdapter2.encodedSizeWithTag(10, cashAppPayPaymentRenderData.refunded_money) + protoAdapter2.encodedSizeWithTag(9, cashAppPayPaymentRenderData.failed_money) + protoAdapter2.encodedSizeWithTag(8, cashAppPayPaymentRenderData.void_money) + protoAdapter2.encodedSizeWithTag(7, cashAppPayPaymentRenderData.capture_money) + protoAdapter2.encodedSizeWithTag(6, cashAppPayPaymentRenderData.auth_money) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(29, cashAppPayPaymentRenderData.associated_order_id) + protoAdapter.encodedSizeWithTag(28, cashAppPayPaymentRenderData.statement_descriptor) + protoAdapter.asRepeated().encodedSizeWithTag(30, cashAppPayPaymentRenderData.dispute_ids) + protoAdapter.asRepeated().encodedSizeWithTag(27, cashAppPayPaymentRenderData.refund_ids) + CashAppPayInstrumentRenderData.ADAPTER.encodedSizeWithTag(21, cashAppPayPaymentRenderData.instrument) + protoAdapter.encodedSizeWithTag(20, cashAppPayPaymentRenderData.associated_loan_id) + CashAppPayPaymentRenderData.DiscountRenderData.ADAPTER.asRepeated().encodedSizeWithTag(19, cashAppPayPaymentRenderData.discounts) + CashAppPayPaymentRenderData.AuthorizationChannel.ADAPTER.encodedSizeWithTag(18, cashAppPayPaymentRenderData.authorization_channel) + protoAdapter.asRepeated().encodedSizeWithTag(17, cashAppPayPaymentRenderData.failure_reasons) + protoAdapter3.encodedSizeWithTag(16, cashAppPayPaymentRenderData.installment_number) + protoAdapter3.encodedSizeWithTag(24, cashAppPayPaymentRenderData.hidden_until_date) + protoAdapter3.encodedSizeWithTag(22, cashAppPayPaymentRenderData.display_date) + protoAdapter3.encodedSizeWithTag(14, cashAppPayPaymentRenderData.failed_at) + protoAdapter3.encodedSizeWithTag(13, cashAppPayPaymentRenderData.voided_at) + protoAdapter3.encodedSizeWithTag(12, cashAppPayPaymentRenderData.captured_at) + protoAdapter3.encodedSizeWithTag(11, cashAppPayPaymentRenderData.authorized_at) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayPaymentRenderData cashAppPayPaymentRenderData = (CashAppPayPaymentRenderData) obj;
        cashAppPayPaymentRenderData.getClass();
        CashAppPayMerchantRenderData cashAppPayMerchantRenderData = cashAppPayPaymentRenderData.merchant;
        CashAppPayMerchantRenderData cashAppPayMerchantRenderData2 = cashAppPayMerchantRenderData != null ? (CashAppPayMerchantRenderData) CashAppPayMerchantRenderData.ADAPTER.redact(cashAppPayMerchantRenderData) : null;
        Money money = cashAppPayPaymentRenderData.auth_money;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = cashAppPayPaymentRenderData.capture_money;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = cashAppPayPaymentRenderData.void_money;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        Money money7 = cashAppPayPaymentRenderData.failed_money;
        Money money8 = money7 != null ? (Money) Money.ADAPTER.redact(money7) : null;
        Money money9 = cashAppPayPaymentRenderData.refunded_money;
        Money money10 = money9 != null ? (Money) Money.ADAPTER.redact(money9) : null;
        Money money11 = cashAppPayPaymentRenderData.scheduled_money;
        Money money12 = money11 != null ? (Money) Money.ADAPTER.redact(money11) : null;
        Money money13 = cashAppPayPaymentRenderData.dispute_won_money;
        Money money14 = money13 != null ? (Money) Money.ADAPTER.redact(money13) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cashAppPayPaymentRenderData.discounts, CashAppPayPaymentRenderData.DiscountRenderData.ADAPTER);
        CashAppPayInstrumentRenderData cashAppPayInstrumentRenderData = cashAppPayPaymentRenderData.instrument;
        CashAppPayInstrumentRenderData cashAppPayInstrumentRenderData2 = cashAppPayInstrumentRenderData != null ? (CashAppPayInstrumentRenderData) CashAppPayInstrumentRenderData.ADAPTER.redact(cashAppPayInstrumentRenderData) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cashAppPayPaymentRenderData.payment_id;
        String str2 = cashAppPayPaymentRenderData.order_id;
        String str3 = cashAppPayPaymentRenderData.display_id;
        String str4 = cashAppPayPaymentRenderData.external_reference_id;
        CashAppPayPaymentRenderData.PaymentState paymentState = cashAppPayPaymentRenderData.state;
        Long l = cashAppPayPaymentRenderData.authorized_at;
        Long l2 = cashAppPayPaymentRenderData.captured_at;
        Long l3 = cashAppPayPaymentRenderData.voided_at;
        Long l4 = cashAppPayPaymentRenderData.failed_at;
        Long l5 = cashAppPayPaymentRenderData.display_date;
        Long l6 = cashAppPayPaymentRenderData.hidden_until_date;
        Long l7 = cashAppPayPaymentRenderData.installment_number;
        List list = cashAppPayPaymentRenderData.failure_reasons;
        CashAppPayPaymentRenderData.AuthorizationChannel authorizationChannel = cashAppPayPaymentRenderData.authorization_channel;
        String str5 = cashAppPayPaymentRenderData.associated_loan_id;
        List list2 = cashAppPayPaymentRenderData.refund_ids;
        List list3 = cashAppPayPaymentRenderData.dispute_ids;
        String str6 = cashAppPayPaymentRenderData.statement_descriptor;
        String str7 = cashAppPayPaymentRenderData.associated_order_id;
        list.getClass();
        list2.getClass();
        list3.getClass();
        byteString.getClass();
        return new CashAppPayPaymentRenderData(str, str2, cashAppPayMerchantRenderData2, str3, str4, paymentState, money2, money4, money6, money8, money10, money12, money14, l, l2, l3, l4, l5, l6, l7, list, authorizationChannel, m1169redactElements, str5, cashAppPayInstrumentRenderData2, list2, list3, str6, str7, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayPaymentRenderData cashAppPayPaymentRenderData = (CashAppPayPaymentRenderData) obj;
        cashAppPayPaymentRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cashAppPayPaymentRenderData.payment_id);
        protoAdapter.encodeWithTag(protoWriter, 2, cashAppPayPaymentRenderData.order_id);
        CashAppPayMerchantRenderData.ADAPTER.encodeWithTag(protoWriter, 3, cashAppPayPaymentRenderData.merchant);
        protoAdapter.encodeWithTag(protoWriter, 4, cashAppPayPaymentRenderData.display_id);
        protoAdapter.encodeWithTag(protoWriter, 25, cashAppPayPaymentRenderData.external_reference_id);
        CashAppPayPaymentRenderData.PaymentState.ADAPTER.encodeWithTag(protoWriter, 5, cashAppPayPaymentRenderData.state);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 6, cashAppPayPaymentRenderData.auth_money);
        protoAdapter2.encodeWithTag(protoWriter, 7, cashAppPayPaymentRenderData.capture_money);
        protoAdapter2.encodeWithTag(protoWriter, 8, cashAppPayPaymentRenderData.void_money);
        protoAdapter2.encodeWithTag(protoWriter, 9, cashAppPayPaymentRenderData.failed_money);
        protoAdapter2.encodeWithTag(protoWriter, 10, cashAppPayPaymentRenderData.refunded_money);
        protoAdapter2.encodeWithTag(protoWriter, 23, cashAppPayPaymentRenderData.scheduled_money);
        protoAdapter2.encodeWithTag(protoWriter, 26, cashAppPayPaymentRenderData.dispute_won_money);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(protoWriter, 11, cashAppPayPaymentRenderData.authorized_at);
        protoAdapter3.encodeWithTag(protoWriter, 12, cashAppPayPaymentRenderData.captured_at);
        protoAdapter3.encodeWithTag(protoWriter, 13, cashAppPayPaymentRenderData.voided_at);
        protoAdapter3.encodeWithTag(protoWriter, 14, cashAppPayPaymentRenderData.failed_at);
        protoAdapter3.encodeWithTag(protoWriter, 22, cashAppPayPaymentRenderData.display_date);
        protoAdapter3.encodeWithTag(protoWriter, 24, cashAppPayPaymentRenderData.hidden_until_date);
        protoAdapter3.encodeWithTag(protoWriter, 16, cashAppPayPaymentRenderData.installment_number);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 17, cashAppPayPaymentRenderData.failure_reasons);
        CashAppPayPaymentRenderData.AuthorizationChannel.ADAPTER.encodeWithTag(protoWriter, 18, cashAppPayPaymentRenderData.authorization_channel);
        CashAppPayPaymentRenderData.DiscountRenderData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 19, cashAppPayPaymentRenderData.discounts);
        protoAdapter.encodeWithTag(protoWriter, 20, cashAppPayPaymentRenderData.associated_loan_id);
        CashAppPayInstrumentRenderData.ADAPTER.encodeWithTag(protoWriter, 21, cashAppPayPaymentRenderData.instrument);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 27, cashAppPayPaymentRenderData.refund_ids);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 30, cashAppPayPaymentRenderData.dispute_ids);
        protoAdapter.encodeWithTag(protoWriter, 28, cashAppPayPaymentRenderData.statement_descriptor);
        protoAdapter.encodeWithTag(protoWriter, 29, cashAppPayPaymentRenderData.associated_order_id);
        protoWriter.writeBytes(cashAppPayPaymentRenderData.unknownFields());
    }
}
