package com.squareup.protos.cash.pay;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pay.CashAppPayLoanSummaryRenderData;
import com.squareup.protos.common.Money;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayLoanSummaryRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Long l;
        String str;
        String str2;
        ?? decode;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        String str3 = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Long l2 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Long l3 = null;
        Long l4 = null;
        CashAppPayLoanSummaryRenderData.AutoPayState autoPayState = null;
        CashAppPayLoanSummaryRenderData.LendingProduct lendingProduct = null;
        CashAppPayLoanSummaryRenderData.LoanState loanState = null;
        String str11 = null;
        Integer num = null;
        Long l5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashAppPayLoanSummaryRenderData(str3, (Money) obj, (Money) obj2, (Money) obj3, l2, str4, str5, str6, str7, str8, str9, str10, l3, l4, m, arrayList, autoPayState, lendingProduct, loanState, str11, num, l5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    decode = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
                    decode = str3;
                    break;
                case 3:
                    l2 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str3;
                    break;
                case 4:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 5:
                    str6 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 6:
                    l3 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str3;
                    break;
                case 7:
                    l = l2;
                    str = str4;
                    str2 = str5;
                    m.add(CashAppPayLoanSummaryRenderData.Fee.ADAPTER.decode(protoReader));
                    decode = str3;
                    l2 = l;
                    str4 = str;
                    str5 = str2;
                    break;
                case 8:
                    l4 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str3;
                    break;
                case 9:
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    decode = str3;
                    break;
                case 10:
                    obj3 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj3);
                    decode = str3;
                    break;
                case 11:
                default:
                    protoReader.readUnknownField(nextTag);
                    l = l2;
                    str = str4;
                    str2 = str5;
                    decode = str3;
                    l2 = l;
                    str4 = str;
                    str5 = str2;
                    break;
                case 12:
                    l = l2;
                    str = str4;
                    str2 = str5;
                    arrayList.add(CashAppPayLoanSummaryRenderData.Adjustment.ADAPTER.decode(protoReader));
                    decode = str3;
                    l2 = l;
                    str4 = str;
                    str5 = str2;
                    break;
                case 13:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 14:
                    str7 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 15:
                    str10 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 16:
                    l = l2;
                    str = str4;
                    str2 = str5;
                    try {
                        autoPayState = CashAppPayLoanSummaryRenderData.AutoPayState.ADAPTER.decode(protoReader);
                        l2 = l;
                        str4 = str;
                        str5 = str2;
                        decode = str3;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 17:
                    l = l2;
                    str = str4;
                    str2 = str5;
                    try {
                        lendingProduct = CashAppPayLoanSummaryRenderData.LendingProduct.ADAPTER.decode(protoReader);
                        l2 = l;
                        str4 = str;
                        str5 = str2;
                        decode = str3;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 18:
                    str8 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 19:
                    str9 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 20:
                    try {
                        loanState = CashAppPayLoanSummaryRenderData.LoanState.ADAPTER.decode(protoReader);
                        decode = str3;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        l = l2;
                        str = str4;
                        str2 = str5;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 21:
                    str11 = ProtoAdapter.STRING.decode(protoReader);
                    decode = str3;
                    break;
                case 22:
                    num = ProtoAdapter.INT32.decode(protoReader);
                    decode = str3;
                    break;
                case 23:
                    l5 = ProtoAdapter.INT64.decode(protoReader);
                    decode = str3;
                    break;
            }
            str3 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashAppPayLoanSummaryRenderData cashAppPayLoanSummaryRenderData = (CashAppPayLoanSummaryRenderData) obj;
        reverseProtoWriter.getClass();
        cashAppPayLoanSummaryRenderData.getClass();
        reverseProtoWriter.writeBytes(cashAppPayLoanSummaryRenderData.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 23, cashAppPayLoanSummaryRenderData.original_transaction_occurred_at);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 22, cashAppPayLoanSummaryRenderData.purchase_apr_bps);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 21, cashAppPayLoanSummaryRenderData.display_id);
        CashAppPayLoanSummaryRenderData.LoanState.ADAPTER.encodeWithTag(reverseProtoWriter, 20, cashAppPayLoanSummaryRenderData.loan_state);
        CashAppPayLoanSummaryRenderData.LendingProduct.ADAPTER.encodeWithTag(reverseProtoWriter, 17, cashAppPayLoanSummaryRenderData.lending_product);
        CashAppPayLoanSummaryRenderData.AutoPayState.ADAPTER.encodeWithTag(reverseProtoWriter, 16, cashAppPayLoanSummaryRenderData.auto_pay_state);
        CashAppPayLoanSummaryRenderData.Adjustment.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 12, cashAppPayLoanSummaryRenderData.loan_adjustments);
        CashAppPayLoanSummaryRenderData.Fee.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, cashAppPayLoanSummaryRenderData.fees);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, cashAppPayLoanSummaryRenderData.created_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, cashAppPayLoanSummaryRenderData.total_repayment_money);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 15, cashAppPayLoanSummaryRenderData.change_schedule_flow_url);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 19, cashAppPayLoanSummaryRenderData.toggle_auto_pay_from_enriched_receipt_flow_url);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 18, cashAppPayLoanSummaryRenderData.toggle_auto_pay_flow_url);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 14, cashAppPayLoanSummaryRenderData.initiate_payment_flow_url);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, cashAppPayLoanSummaryRenderData.payment_plan_flow_url);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 13, cashAppPayLoanSummaryRenderData.view_documents_flow_url);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 4, cashAppPayLoanSummaryRenderData.tila_document_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, cashAppPayLoanSummaryRenderData.total_number_of_installments);
        ProtoAdapter protoAdapter3 = Money.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 10, cashAppPayLoanSummaryRenderData.remaining_balance_money);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 9, cashAppPayLoanSummaryRenderData.down_payment_money);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, cashAppPayLoanSummaryRenderData.total_borrowed_money);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, cashAppPayLoanSummaryRenderData.loan_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashAppPayLoanSummaryRenderData cashAppPayLoanSummaryRenderData = (CashAppPayLoanSummaryRenderData) obj;
        cashAppPayLoanSummaryRenderData.getClass();
        int size$okio = cashAppPayLoanSummaryRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, cashAppPayLoanSummaryRenderData.loan_id) + size$okio;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(10, cashAppPayLoanSummaryRenderData.remaining_balance_money) + protoAdapter2.encodedSizeWithTag(9, cashAppPayLoanSummaryRenderData.down_payment_money) + protoAdapter2.encodedSizeWithTag(2, cashAppPayLoanSummaryRenderData.total_borrowed_money) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        return protoAdapter3.encodedSizeWithTag(23, cashAppPayLoanSummaryRenderData.original_transaction_occurred_at) + ProtoAdapter.INT32.encodedSizeWithTag(22, cashAppPayLoanSummaryRenderData.purchase_apr_bps) + protoAdapter.encodedSizeWithTag(21, cashAppPayLoanSummaryRenderData.display_id) + CashAppPayLoanSummaryRenderData.LoanState.ADAPTER.encodedSizeWithTag(20, cashAppPayLoanSummaryRenderData.loan_state) + CashAppPayLoanSummaryRenderData.LendingProduct.ADAPTER.encodedSizeWithTag(17, cashAppPayLoanSummaryRenderData.lending_product) + CashAppPayLoanSummaryRenderData.AutoPayState.ADAPTER.encodedSizeWithTag(16, cashAppPayLoanSummaryRenderData.auto_pay_state) + CashAppPayLoanSummaryRenderData.Adjustment.ADAPTER.asRepeated().encodedSizeWithTag(12, cashAppPayLoanSummaryRenderData.loan_adjustments) + CashAppPayLoanSummaryRenderData.Fee.ADAPTER.asRepeated().encodedSizeWithTag(7, cashAppPayLoanSummaryRenderData.fees) + protoAdapter3.encodedSizeWithTag(8, cashAppPayLoanSummaryRenderData.created_at) + protoAdapter3.encodedSizeWithTag(6, cashAppPayLoanSummaryRenderData.total_repayment_money) + protoAdapter.encodedSizeWithTag(15, cashAppPayLoanSummaryRenderData.change_schedule_flow_url) + protoAdapter.encodedSizeWithTag(19, cashAppPayLoanSummaryRenderData.toggle_auto_pay_from_enriched_receipt_flow_url) + protoAdapter.encodedSizeWithTag(18, cashAppPayLoanSummaryRenderData.toggle_auto_pay_flow_url) + protoAdapter.encodedSizeWithTag(14, cashAppPayLoanSummaryRenderData.initiate_payment_flow_url) + protoAdapter.encodedSizeWithTag(5, cashAppPayLoanSummaryRenderData.payment_plan_flow_url) + protoAdapter.encodedSizeWithTag(13, cashAppPayLoanSummaryRenderData.view_documents_flow_url) + protoAdapter.encodedSizeWithTag(4, cashAppPayLoanSummaryRenderData.tila_document_id) + protoAdapter3.encodedSizeWithTag(3, cashAppPayLoanSummaryRenderData.total_number_of_installments) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashAppPayLoanSummaryRenderData cashAppPayLoanSummaryRenderData = (CashAppPayLoanSummaryRenderData) obj;
        cashAppPayLoanSummaryRenderData.getClass();
        Money money = cashAppPayLoanSummaryRenderData.total_borrowed_money;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = cashAppPayLoanSummaryRenderData.down_payment_money;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = cashAppPayLoanSummaryRenderData.remaining_balance_money;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(cashAppPayLoanSummaryRenderData.fees, CashAppPayLoanSummaryRenderData.Fee.ADAPTER);
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(cashAppPayLoanSummaryRenderData.loan_adjustments, CashAppPayLoanSummaryRenderData.Adjustment.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = cashAppPayLoanSummaryRenderData.loan_id;
        Long l = cashAppPayLoanSummaryRenderData.total_number_of_installments;
        String str2 = cashAppPayLoanSummaryRenderData.tila_document_id;
        String str3 = cashAppPayLoanSummaryRenderData.view_documents_flow_url;
        String str4 = cashAppPayLoanSummaryRenderData.payment_plan_flow_url;
        String str5 = cashAppPayLoanSummaryRenderData.initiate_payment_flow_url;
        String str6 = cashAppPayLoanSummaryRenderData.toggle_auto_pay_flow_url;
        String str7 = cashAppPayLoanSummaryRenderData.toggle_auto_pay_from_enriched_receipt_flow_url;
        String str8 = cashAppPayLoanSummaryRenderData.change_schedule_flow_url;
        Long l2 = cashAppPayLoanSummaryRenderData.total_repayment_money;
        Long l3 = cashAppPayLoanSummaryRenderData.created_at;
        CashAppPayLoanSummaryRenderData.AutoPayState autoPayState = cashAppPayLoanSummaryRenderData.auto_pay_state;
        CashAppPayLoanSummaryRenderData.LendingProduct lendingProduct = cashAppPayLoanSummaryRenderData.lending_product;
        CashAppPayLoanSummaryRenderData.LoanState loanState = cashAppPayLoanSummaryRenderData.loan_state;
        String str9 = cashAppPayLoanSummaryRenderData.display_id;
        Integer num = cashAppPayLoanSummaryRenderData.purchase_apr_bps;
        Long l4 = cashAppPayLoanSummaryRenderData.original_transaction_occurred_at;
        byteString.getClass();
        return new CashAppPayLoanSummaryRenderData(str, money2, money4, money6, l, str2, str3, str4, str5, str6, str7, str8, l2, l3, m1169redactElements, m1169redactElements2, autoPayState, lendingProduct, loanState, str9, num, l4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashAppPayLoanSummaryRenderData cashAppPayLoanSummaryRenderData = (CashAppPayLoanSummaryRenderData) obj;
        cashAppPayLoanSummaryRenderData.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cashAppPayLoanSummaryRenderData.loan_id);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 2, cashAppPayLoanSummaryRenderData.total_borrowed_money);
        protoAdapter2.encodeWithTag(protoWriter, 9, cashAppPayLoanSummaryRenderData.down_payment_money);
        protoAdapter2.encodeWithTag(protoWriter, 10, cashAppPayLoanSummaryRenderData.remaining_balance_money);
        ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
        protoAdapter3.encodeWithTag(protoWriter, 3, cashAppPayLoanSummaryRenderData.total_number_of_installments);
        protoAdapter.encodeWithTag(protoWriter, 4, cashAppPayLoanSummaryRenderData.tila_document_id);
        protoAdapter.encodeWithTag(protoWriter, 13, cashAppPayLoanSummaryRenderData.view_documents_flow_url);
        protoAdapter.encodeWithTag(protoWriter, 5, cashAppPayLoanSummaryRenderData.payment_plan_flow_url);
        protoAdapter.encodeWithTag(protoWriter, 14, cashAppPayLoanSummaryRenderData.initiate_payment_flow_url);
        protoAdapter.encodeWithTag(protoWriter, 18, cashAppPayLoanSummaryRenderData.toggle_auto_pay_flow_url);
        protoAdapter.encodeWithTag(protoWriter, 19, cashAppPayLoanSummaryRenderData.toggle_auto_pay_from_enriched_receipt_flow_url);
        protoAdapter.encodeWithTag(protoWriter, 15, cashAppPayLoanSummaryRenderData.change_schedule_flow_url);
        protoAdapter3.encodeWithTag(protoWriter, 6, cashAppPayLoanSummaryRenderData.total_repayment_money);
        protoAdapter3.encodeWithTag(protoWriter, 8, cashAppPayLoanSummaryRenderData.created_at);
        CashAppPayLoanSummaryRenderData.Fee.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, cashAppPayLoanSummaryRenderData.fees);
        CashAppPayLoanSummaryRenderData.Adjustment.ADAPTER.asRepeated().encodeWithTag(protoWriter, 12, cashAppPayLoanSummaryRenderData.loan_adjustments);
        CashAppPayLoanSummaryRenderData.AutoPayState.ADAPTER.encodeWithTag(protoWriter, 16, cashAppPayLoanSummaryRenderData.auto_pay_state);
        CashAppPayLoanSummaryRenderData.LendingProduct.ADAPTER.encodeWithTag(protoWriter, 17, cashAppPayLoanSummaryRenderData.lending_product);
        CashAppPayLoanSummaryRenderData.LoanState.ADAPTER.encodeWithTag(protoWriter, 20, cashAppPayLoanSummaryRenderData.loan_state);
        protoAdapter.encodeWithTag(protoWriter, 21, cashAppPayLoanSummaryRenderData.display_id);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 22, cashAppPayLoanSummaryRenderData.purchase_apr_bps);
        protoAdapter3.encodeWithTag(protoWriter, 23, cashAppPayLoanSummaryRenderData.original_transaction_occurred_at);
        protoWriter.writeBytes(cashAppPayLoanSummaryRenderData.unknownFields());
    }
}
