package com.squareup.protos.cash.pay;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pay.CashAppPayOrderRenderData;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayOrderRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Money money;
        Money money2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ?? decode;
        Money money3;
        Money money4;
        ArrayList arrayList3;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        String str = null;
        Money money5 = null;
        String str2 = null;
        Long l = null;
        String str3 = null;
        String str4 = null;
        CashAppPayOrderRenderData.Product product = null;
        CashAppPayMerchantRenderData cashAppPayMerchantRenderData = null;
        ArrayList arrayList14 = m;
        ArrayList arrayList15 = arrayList6;
        Object obj2 = null;
        Object obj3 = null;
        Money money6 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            ArrayList arrayList16 = arrayList7;
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppPayOrderRenderData(str, str2, l, money5, (Money) obj2, (Money) obj3, money6, cashAppPayMerchantRenderData, arrayList14, arrayList4, arrayList5, arrayList15, arrayList16, arrayList8, arrayList9, arrayList10, arrayList11, arrayList12, arrayList13, (CashAppPayOrderRenderData.OrderAggregations) obj4, (GlobalAddress) obj5, str3, str4, product, (CashAppPayOrderRenderData.RetroEligibility) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = obj6;
                    arrayList = arrayList15;
                    arrayList7 = arrayList16;
                    arrayList2 = arrayList10;
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    money6 = money6;
                    money5 = money5;
                    cashAppPayMerchantRenderData = cashAppPayMerchantRenderData;
                    break;
                case 2:
                    obj = obj6;
                    arrayList = arrayList15;
                    arrayList7 = arrayList16;
                    arrayList2 = arrayList10;
                    money6 = money6;
                    money5 = money5;
                    str2 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str;
                    break;
                case 3:
                    obj = obj6;
                    arrayList = arrayList15;
                    arrayList7 = arrayList16;
                    arrayList2 = arrayList10;
                    money6 = money6;
                    money5 = money5;
                    cashAppPayMerchantRenderData = TransactorKt.decodeMessageOrMerge(CashAppPayMerchantRenderData.ADAPTER, protoReader, cashAppPayMerchantRenderData);
                    decode = str;
                    break;
                case 4:
                    Money money7 = money6;
                    money3 = money5;
                    money4 = money7;
                    obj = obj6;
                    arrayList = arrayList15;
                    arrayList7 = arrayList16;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList14;
                    arrayList3.add(CashAppPayPaymentRenderData.ADAPTER.decode(protoReader));
                    Money money8 = money3;
                    money6 = money4;
                    money5 = money8;
                    decode = str;
                    arrayList14 = arrayList3;
                    break;
                case 5:
                    Money money9 = money6;
                    money3 = money5;
                    money4 = money9;
                    obj = obj6;
                    arrayList = arrayList15;
                    arrayList7 = arrayList16;
                    arrayList2 = arrayList10;
                    arrayList4.add(CashAppPayRefundRenderData.ADAPTER.decode(protoReader));
                    arrayList3 = arrayList14;
                    Money money82 = money3;
                    money6 = money4;
                    money5 = money82;
                    decode = str;
                    arrayList14 = arrayList3;
                    break;
                case 6:
                    Money money10 = money6;
                    money3 = money5;
                    money4 = money10;
                    obj = obj6;
                    arrayList = arrayList15;
                    arrayList7 = arrayList16;
                    arrayList2 = arrayList10;
                    arrayList5.add(CashAppPayDisputeRenderData.ADAPTER.decode(protoReader));
                    arrayList3 = arrayList14;
                    Money money822 = money3;
                    money6 = money4;
                    money5 = money822;
                    decode = str;
                    arrayList14 = arrayList3;
                    break;
                case 7:
                    Money money11 = money6;
                    money3 = money5;
                    money4 = money11;
                    obj = obj6;
                    arrayList7 = arrayList16;
                    arrayList = arrayList15;
                    arrayList.add(CashAppPayLoanSummaryRenderData.ADAPTER.decode(protoReader));
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList14;
                    Money money8222 = money3;
                    money6 = money4;
                    money5 = money8222;
                    decode = str;
                    arrayList14 = arrayList3;
                    break;
                case 8:
                    Money money12 = money6;
                    money3 = money5;
                    money4 = money12;
                    obj = obj6;
                    arrayList7 = arrayList16;
                    arrayList7.add(CashAppPayIncentiveRenderData.ADAPTER.decode(protoReader));
                    arrayList = arrayList15;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList14;
                    Money money82222 = money3;
                    money6 = money4;
                    money5 = money82222;
                    decode = str;
                    arrayList14 = arrayList3;
                    break;
                case 9:
                    obj = obj6;
                    money6 = money6;
                    arrayList = arrayList15;
                    arrayList7 = arrayList16;
                    money5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, money5);
                    arrayList2 = arrayList10;
                    decode = str;
                    break;
                case 10:
                    obj = obj6;
                    money6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, money6);
                    arrayList = arrayList15;
                    arrayList7 = arrayList16;
                    money5 = money5;
                    decode = str;
                    arrayList2 = arrayList10;
                    break;
                case 11:
                    money = money5;
                    money2 = money6;
                    obj = obj6;
                    arrayList9.add(CashAppPayLineItemRenderData.ADAPTER.decode(protoReader));
                    arrayList = arrayList15;
                    arrayList7 = arrayList16;
                    money3 = money;
                    money4 = money2;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList14;
                    Money money822222 = money3;
                    money6 = money4;
                    money5 = money822222;
                    decode = str;
                    arrayList14 = arrayList3;
                    break;
                case 12:
                    money = money5;
                    money2 = money6;
                    obj = obj6;
                    arrayList10.add(CashAppPayServiceChargeRenderData.ADAPTER.decode(protoReader));
                    arrayList = arrayList15;
                    arrayList7 = arrayList16;
                    money3 = money;
                    money4 = money2;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList14;
                    Money money8222222 = money3;
                    money6 = money4;
                    money5 = money8222222;
                    decode = str;
                    arrayList14 = arrayList3;
                    break;
                case 13:
                    money = money5;
                    money2 = money6;
                    obj = obj6;
                    arrayList11.add(CashAppPayShippingChargeRenderData.ADAPTER.decode(protoReader));
                    arrayList = arrayList15;
                    arrayList7 = arrayList16;
                    money3 = money;
                    money4 = money2;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList14;
                    Money money82222222 = money3;
                    money6 = money4;
                    money5 = money82222222;
                    decode = str;
                    arrayList14 = arrayList3;
                    break;
                case 14:
                    money = money5;
                    money2 = money6;
                    obj = obj6;
                    arrayList12.add(CashAppPayTaxRenderData.ADAPTER.decode(protoReader));
                    arrayList = arrayList15;
                    arrayList7 = arrayList16;
                    money3 = money;
                    money4 = money2;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList14;
                    Money money822222222 = money3;
                    money6 = money4;
                    money5 = money822222222;
                    decode = str;
                    arrayList14 = arrayList3;
                    break;
                case 15:
                    money = money5;
                    money2 = money6;
                    obj = obj6;
                    arrayList8.add(CashAppPayExternalIncentiveRenderData.ADAPTER.decode(protoReader));
                    arrayList = arrayList15;
                    arrayList7 = arrayList16;
                    money3 = money;
                    money4 = money2;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList14;
                    Money money8222222222 = money3;
                    money6 = money4;
                    money5 = money8222222222;
                    decode = str;
                    arrayList14 = arrayList3;
                    break;
                case 16:
                    money = money5;
                    money2 = money6;
                    obj = obj6;
                    arrayList13.add(CashAppPayPaymentScheduleRenderData.ADAPTER.decode(protoReader));
                    arrayList = arrayList15;
                    arrayList7 = arrayList16;
                    money3 = money;
                    money4 = money2;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList14;
                    Money money82222222222 = money3;
                    money6 = money4;
                    money5 = money82222222222;
                    decode = str;
                    arrayList14 = arrayList3;
                    break;
                case 17:
                    obj = obj6;
                    obj4 = TransactorKt.decodeMessageOrMerge(CashAppPayOrderRenderData.OrderAggregations.ADAPTER, protoReader, obj4);
                    arrayList = arrayList15;
                    arrayList7 = arrayList16;
                    decode = str;
                    arrayList2 = arrayList10;
                    break;
                case 18:
                    obj = obj6;
                    obj5 = TransactorKt.decodeMessageOrMerge(GlobalAddress.ADAPTER, protoReader, obj5);
                    arrayList = arrayList15;
                    arrayList7 = arrayList16;
                    decode = str;
                    arrayList2 = arrayList10;
                    break;
                case 19:
                    obj = obj6;
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = arrayList15;
                    arrayList7 = arrayList16;
                    decode = str;
                    arrayList2 = arrayList10;
                    break;
                case 20:
                    obj = obj6;
                    l = ProtoAdapter.INT64.decode(protoReader);
                    arrayList = arrayList15;
                    arrayList7 = arrayList16;
                    decode = str;
                    arrayList2 = arrayList10;
                    break;
                case 21:
                    obj = obj6;
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    arrayList = arrayList15;
                    arrayList7 = arrayList16;
                    decode = str;
                    arrayList2 = arrayList10;
                    break;
                case 22:
                    obj = obj6;
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    arrayList = arrayList15;
                    arrayList7 = arrayList16;
                    decode = str;
                    arrayList2 = arrayList10;
                    break;
                case 23:
                    obj = obj6;
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    arrayList = arrayList15;
                    arrayList7 = arrayList16;
                    decode = str;
                    arrayList2 = arrayList10;
                    break;
                case 24:
                    try {
                        product = CashAppPayOrderRenderData.Product.ADAPTER.decode(protoReader);
                        obj = obj6;
                        arrayList = arrayList15;
                        arrayList7 = arrayList16;
                        decode = str;
                        arrayList2 = arrayList10;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        obj = obj6;
                        money = money5;
                        money2 = money6;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 25:
                    obj = TransactorKt.decodeMessageOrMerge(CashAppPayOrderRenderData.RetroEligibility.ADAPTER, protoReader, obj6);
                    arrayList = arrayList15;
                    arrayList7 = arrayList16;
                    decode = str;
                    arrayList2 = arrayList10;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    Money money13 = money6;
                    money3 = money5;
                    money4 = money13;
                    obj = obj6;
                    arrayList = arrayList15;
                    arrayList7 = arrayList16;
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList14;
                    Money money822222222222 = money3;
                    money6 = money4;
                    money5 = money822222222222;
                    decode = str;
                    arrayList14 = arrayList3;
                    break;
            }
            str = decode;
            arrayList10 = arrayList2;
            arrayList15 = arrayList;
            obj6 = obj;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayOrderRenderData cashAppPayOrderRenderData = (CashAppPayOrderRenderData) obj;
        reverseProtoWriter.getClass();
        cashAppPayOrderRenderData.getClass();
        reverseProtoWriter.writeBytes(cashAppPayOrderRenderData.unknownFields());
        CashAppPayOrderRenderData.RetroEligibility.ADAPTER.encodeWithTag(reverseProtoWriter, 25, cashAppPayOrderRenderData.retro_eligibility);
        CashAppPayOrderRenderData.Product.ADAPTER.encodeWithTag(reverseProtoWriter, 24, cashAppPayOrderRenderData.product);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 21, cashAppPayOrderRenderData.view_enriched_receipt_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 19, cashAppPayOrderRenderData.customer_delivery_instructions);
        GlobalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 18, cashAppPayOrderRenderData.customer_shipping_address);
        CashAppPayOrderRenderData.OrderAggregations.ADAPTER.encodeWithTag(reverseProtoWriter, 17, cashAppPayOrderRenderData.order_aggregations);
        CashAppPayPaymentScheduleRenderData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 16, cashAppPayOrderRenderData.payment_schedules);
        CashAppPayTaxRenderData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 14, cashAppPayOrderRenderData.taxes);
        CashAppPayShippingChargeRenderData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 13, cashAppPayOrderRenderData.shipping_charges);
        CashAppPayServiceChargeRenderData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 12, cashAppPayOrderRenderData.service_charges);
        CashAppPayLineItemRenderData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 11, cashAppPayOrderRenderData.line_items);
        CashAppPayExternalIncentiveRenderData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 15, cashAppPayOrderRenderData.external_incentives);
        CashAppPayIncentiveRenderData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 8, cashAppPayOrderRenderData.incentives);
        CashAppPayLoanSummaryRenderData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, cashAppPayOrderRenderData.loan_summaries);
        CashAppPayDisputeRenderData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, cashAppPayOrderRenderData.disputes);
        CashAppPayRefundRenderData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, cashAppPayOrderRenderData.refunds);
        CashAppPayPaymentRenderData.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, cashAppPayOrderRenderData.payments);
        CashAppPayMerchantRenderData.ADAPTER.encodeWithTag(reverseProtoWriter, 3, cashAppPayOrderRenderData.merchant);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 10, cashAppPayOrderRenderData.order_discount_money);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 23, cashAppPayOrderRenderData.order_adjusted_total_money);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 22, cashAppPayOrderRenderData.order_net_money);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, cashAppPayOrderRenderData.order_total_money);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 20, cashAppPayOrderRenderData.created_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cashAppPayOrderRenderData.client_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cashAppPayOrderRenderData.order_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayOrderRenderData cashAppPayOrderRenderData = (CashAppPayOrderRenderData) obj;
        cashAppPayOrderRenderData.getClass();
        int size$okio = cashAppPayOrderRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(20, cashAppPayOrderRenderData.created_at) + protoAdapter.encodedSizeWithTag(2, cashAppPayOrderRenderData.client_id) + protoAdapter.encodedSizeWithTag(1, cashAppPayOrderRenderData.order_id) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        return CashAppPayOrderRenderData.RetroEligibility.ADAPTER.encodedSizeWithTag(25, cashAppPayOrderRenderData.retro_eligibility) + CashAppPayOrderRenderData.Product.ADAPTER.encodedSizeWithTag(24, cashAppPayOrderRenderData.product) + protoAdapter.encodedSizeWithTag(21, cashAppPayOrderRenderData.view_enriched_receipt_url) + protoAdapter.encodedSizeWithTag(19, cashAppPayOrderRenderData.customer_delivery_instructions) + GlobalAddress.ADAPTER.encodedSizeWithTag(18, cashAppPayOrderRenderData.customer_shipping_address) + CashAppPayOrderRenderData.OrderAggregations.ADAPTER.encodedSizeWithTag(17, cashAppPayOrderRenderData.order_aggregations) + CashAppPayPaymentScheduleRenderData.ADAPTER.asRepeated().encodedSizeWithTag(16, cashAppPayOrderRenderData.payment_schedules) + CashAppPayTaxRenderData.ADAPTER.asRepeated().encodedSizeWithTag(14, cashAppPayOrderRenderData.taxes) + CashAppPayShippingChargeRenderData.ADAPTER.asRepeated().encodedSizeWithTag(13, cashAppPayOrderRenderData.shipping_charges) + CashAppPayServiceChargeRenderData.ADAPTER.asRepeated().encodedSizeWithTag(12, cashAppPayOrderRenderData.service_charges) + CashAppPayLineItemRenderData.ADAPTER.asRepeated().encodedSizeWithTag(11, cashAppPayOrderRenderData.line_items) + CashAppPayExternalIncentiveRenderData.ADAPTER.asRepeated().encodedSizeWithTag(15, cashAppPayOrderRenderData.external_incentives) + CashAppPayIncentiveRenderData.ADAPTER.asRepeated().encodedSizeWithTag(8, cashAppPayOrderRenderData.incentives) + CashAppPayLoanSummaryRenderData.ADAPTER.asRepeated().encodedSizeWithTag(7, cashAppPayOrderRenderData.loan_summaries) + CashAppPayDisputeRenderData.ADAPTER.asRepeated().encodedSizeWithTag(6, cashAppPayOrderRenderData.disputes) + CashAppPayRefundRenderData.ADAPTER.asRepeated().encodedSizeWithTag(5, cashAppPayOrderRenderData.refunds) + CashAppPayPaymentRenderData.ADAPTER.asRepeated().encodedSizeWithTag(4, cashAppPayOrderRenderData.payments) + CashAppPayMerchantRenderData.ADAPTER.encodedSizeWithTag(3, cashAppPayOrderRenderData.merchant) + protoAdapter2.encodedSizeWithTag(10, cashAppPayOrderRenderData.order_discount_money) + protoAdapter2.encodedSizeWithTag(23, cashAppPayOrderRenderData.order_adjusted_total_money) + protoAdapter2.encodedSizeWithTag(22, cashAppPayOrderRenderData.order_net_money) + protoAdapter2.encodedSizeWithTag(9, cashAppPayOrderRenderData.order_total_money) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayOrderRenderData cashAppPayOrderRenderData = (CashAppPayOrderRenderData) obj;
        cashAppPayOrderRenderData.getClass();
        Money money = cashAppPayOrderRenderData.order_total_money;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = cashAppPayOrderRenderData.order_net_money;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = cashAppPayOrderRenderData.order_adjusted_total_money;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        Money money7 = cashAppPayOrderRenderData.order_discount_money;
        Money money8 = money7 != null ? (Money) Money.ADAPTER.redact(money7) : null;
        CashAppPayMerchantRenderData cashAppPayMerchantRenderData = cashAppPayOrderRenderData.merchant;
        CashAppPayMerchantRenderData cashAppPayMerchantRenderData2 = cashAppPayMerchantRenderData != null ? (CashAppPayMerchantRenderData) CashAppPayMerchantRenderData.ADAPTER.redact(cashAppPayMerchantRenderData) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cashAppPayOrderRenderData.payments, CashAppPayPaymentRenderData.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(cashAppPayOrderRenderData.refunds, CashAppPayRefundRenderData.ADAPTER);
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(cashAppPayOrderRenderData.disputes, CashAppPayDisputeRenderData.ADAPTER);
        ArrayList m1169redactElements4 = TransactorKt.m1169redactElements(cashAppPayOrderRenderData.loan_summaries, CashAppPayLoanSummaryRenderData.ADAPTER);
        ArrayList m1169redactElements5 = TransactorKt.m1169redactElements(cashAppPayOrderRenderData.incentives, CashAppPayIncentiveRenderData.ADAPTER);
        ArrayList m1169redactElements6 = TransactorKt.m1169redactElements(cashAppPayOrderRenderData.external_incentives, CashAppPayExternalIncentiveRenderData.ADAPTER);
        ArrayList m1169redactElements7 = TransactorKt.m1169redactElements(cashAppPayOrderRenderData.line_items, CashAppPayLineItemRenderData.ADAPTER);
        ArrayList m1169redactElements8 = TransactorKt.m1169redactElements(cashAppPayOrderRenderData.service_charges, CashAppPayServiceChargeRenderData.ADAPTER);
        ArrayList m1169redactElements9 = TransactorKt.m1169redactElements(cashAppPayOrderRenderData.shipping_charges, CashAppPayShippingChargeRenderData.ADAPTER);
        ArrayList m1169redactElements10 = TransactorKt.m1169redactElements(cashAppPayOrderRenderData.taxes, CashAppPayTaxRenderData.ADAPTER);
        ArrayList m1169redactElements11 = TransactorKt.m1169redactElements(cashAppPayOrderRenderData.payment_schedules, CashAppPayPaymentScheduleRenderData.ADAPTER);
        CashAppPayOrderRenderData.OrderAggregations orderAggregations = cashAppPayOrderRenderData.order_aggregations;
        CashAppPayOrderRenderData.OrderAggregations orderAggregations2 = orderAggregations != null ? (CashAppPayOrderRenderData.OrderAggregations) CashAppPayOrderRenderData.OrderAggregations.ADAPTER.redact(orderAggregations) : null;
        CashAppPayOrderRenderData.RetroEligibility retroEligibility = cashAppPayOrderRenderData.retro_eligibility;
        CashAppPayOrderRenderData.RetroEligibility retroEligibility2 = retroEligibility != null ? (CashAppPayOrderRenderData.RetroEligibility) CashAppPayOrderRenderData.RetroEligibility.ADAPTER.redact(retroEligibility) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = cashAppPayOrderRenderData.order_id;
        String str2 = cashAppPayOrderRenderData.client_id;
        Long l = cashAppPayOrderRenderData.created_at;
        String str3 = cashAppPayOrderRenderData.view_enriched_receipt_url;
        CashAppPayOrderRenderData.Product product = cashAppPayOrderRenderData.product;
        byteString.getClass();
        return new CashAppPayOrderRenderData(str, str2, l, money2, money4, money6, money8, cashAppPayMerchantRenderData2, m1169redactElements, m1169redactElements2, m1169redactElements3, m1169redactElements4, m1169redactElements5, m1169redactElements6, m1169redactElements7, m1169redactElements8, m1169redactElements9, m1169redactElements10, m1169redactElements11, orderAggregations2, null, null, str3, product, retroEligibility2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayOrderRenderData cashAppPayOrderRenderData = (CashAppPayOrderRenderData) obj;
        cashAppPayOrderRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cashAppPayOrderRenderData.order_id);
        protoAdapter.encodeWithTag(protoWriter, 2, cashAppPayOrderRenderData.client_id);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 20, cashAppPayOrderRenderData.created_at);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 9, cashAppPayOrderRenderData.order_total_money);
        protoAdapter2.encodeWithTag(protoWriter, 22, cashAppPayOrderRenderData.order_net_money);
        protoAdapter2.encodeWithTag(protoWriter, 23, cashAppPayOrderRenderData.order_adjusted_total_money);
        protoAdapter2.encodeWithTag(protoWriter, 10, cashAppPayOrderRenderData.order_discount_money);
        CashAppPayMerchantRenderData.ADAPTER.encodeWithTag(protoWriter, 3, cashAppPayOrderRenderData.merchant);
        CashAppPayPaymentRenderData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, cashAppPayOrderRenderData.payments);
        CashAppPayRefundRenderData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, cashAppPayOrderRenderData.refunds);
        CashAppPayDisputeRenderData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, cashAppPayOrderRenderData.disputes);
        CashAppPayLoanSummaryRenderData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, cashAppPayOrderRenderData.loan_summaries);
        CashAppPayIncentiveRenderData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, cashAppPayOrderRenderData.incentives);
        CashAppPayExternalIncentiveRenderData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 15, cashAppPayOrderRenderData.external_incentives);
        CashAppPayLineItemRenderData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 11, cashAppPayOrderRenderData.line_items);
        CashAppPayServiceChargeRenderData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 12, cashAppPayOrderRenderData.service_charges);
        CashAppPayShippingChargeRenderData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 13, cashAppPayOrderRenderData.shipping_charges);
        CashAppPayTaxRenderData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 14, cashAppPayOrderRenderData.taxes);
        CashAppPayPaymentScheduleRenderData.ADAPTER.asRepeated().encodeWithTag(protoWriter, 16, cashAppPayOrderRenderData.payment_schedules);
        CashAppPayOrderRenderData.OrderAggregations.ADAPTER.encodeWithTag(protoWriter, 17, cashAppPayOrderRenderData.order_aggregations);
        GlobalAddress.ADAPTER.encodeWithTag(protoWriter, 18, cashAppPayOrderRenderData.customer_shipping_address);
        protoAdapter.encodeWithTag(protoWriter, 19, cashAppPayOrderRenderData.customer_delivery_instructions);
        protoAdapter.encodeWithTag(protoWriter, 21, cashAppPayOrderRenderData.view_enriched_receipt_url);
        CashAppPayOrderRenderData.Product.ADAPTER.encodeWithTag(protoWriter, 24, cashAppPayOrderRenderData.product);
        CashAppPayOrderRenderData.RetroEligibility.ADAPTER.encodeWithTag(protoWriter, 25, cashAppPayOrderRenderData.retro_eligibility);
        protoWriter.writeBytes(cashAppPayOrderRenderData.unknownFields());
    }
}
