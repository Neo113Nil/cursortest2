package com.squareup.protos.franklin.common;

import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.LendingRenderData;
import com.squareup.protos.franklin.lending.LendingProduct;
import com.squareup.protos.franklin.lending.RefundReason;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LendingRenderData$Companion$ADAPTER$1 extends ProtoAdapter {
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.squareup.wire.ProtoAdapter
    public final java.lang.Object decode(com.squareup.wire.ProtoReader r80) {
        /*
            Method dump skipped, instructions count: 1112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.protos.franklin.common.LendingRenderData$Companion$ADAPTER$1.decode(com.squareup.wire.ProtoReader):java.lang.Object");
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LendingRenderData lendingRenderData = (LendingRenderData) obj;
        reverseProtoWriter.getClass();
        lendingRenderData.getClass();
        reverseProtoWriter.writeBytes(lendingRenderData.unknownFields());
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 35, lendingRenderData.skipped_payment_allocation_description);
        LendingRenderData.SkippedPaymentAllocationStrategy.ADAPTER.encodeWithTag(reverseProtoWriter, 34, lendingRenderData.skipped_payment_allocation_strategy);
        LendingRenderData.PauseStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 33, lendingRenderData.pause_status);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 32, lendingRenderData.order_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 31, lendingRenderData.bank_partner_full_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 30, lendingRenderData.withdrawal_disclosure_url);
        LendingRenderData.Initiator.ADAPTER.encodeWithTag(reverseProtoWriter, 29, lendingRenderData.initiator);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 26, lendingRenderData.down_payment_amount_cents);
        RefundReason.ADAPTER.encodeWithTag(reverseProtoWriter, 25, lendingRenderData.refund_reason);
        protoAdapter.encodeWithTag(reverseProtoWriter, 22, lendingRenderData.loan_display_token);
        ProtoAdapter protoAdapter3 = LendingRenderData.Breakdown.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 21, lendingRenderData.loan_breakdown);
        ProtoAdapter protoAdapter4 = Money.ADAPTER;
        protoAdapter4.encodeWithTag(reverseProtoWriter, 28, lendingRenderData.total_interest_amount);
        protoAdapter4.encodeWithTag(reverseProtoWriter, 20, lendingRenderData.setup_fee_amount);
        protoAdapter4.encodeWithTag(reverseProtoWriter, 19, lendingRenderData.paid_so_far_amount);
        LendingRenderData.ContextCard.ADAPTER.encodeWithTag(reverseProtoWriter, 18, lendingRenderData.context_card);
        LendingRenderData.PrePurchaseFinancingData.ADAPTER.encodeWithTag(reverseProtoWriter, 27, lendingRenderData.pre_purchase_financing_data);
        LendingRenderData.RetroFinancingData.ADAPTER.encodeWithTag(reverseProtoWriter, 24, lendingRenderData.retro_financing_data);
        LendingRenderData.SingleUsePaymentData.ADAPTER.encodeWithTag(reverseProtoWriter, 23, lendingRenderData.sup_data);
        LendingRenderData.CfBnplData.ADAPTER.encodeWithTag(reverseProtoWriter, 17, lendingRenderData.cf_bnpl_data);
        LendingRenderData.BnplData.ADAPTER.encodeWithTag(reverseProtoWriter, 15, lendingRenderData.bnpl_data);
        LendingProduct.ADAPTER.encodeWithTag(reverseProtoWriter, 14, lendingRenderData.lending_product);
        LendingRenderData.RelatedTransaction.ADAPTER.encodeWithTag(reverseProtoWriter, 13, lendingRenderData.related_transaction);
        protoAdapter4.encodeWithTag(reverseProtoWriter, 16, lendingRenderData.outstanding_loan_balance_amount);
        ProtoAdapter protoAdapter5 = ProtoAdapter.BOOL;
        protoAdapter5.encodeWithTag(reverseProtoWriter, 12, lendingRenderData.suppress_details);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 11, lendingRenderData.payable_until);
        protoAdapter4.encodeWithTag(reverseProtoWriter, 10, lendingRenderData.original_amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, lendingRenderData.tila_document_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, lendingRenderData.loan_token);
        protoAdapter5.encodeWithTag(reverseProtoWriter, 6, lendingRenderData.manual_pay);
        protoAdapter5.encodeWithTag(reverseProtoWriter, 5, lendingRenderData.is_skippable);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 4, lendingRenderData.breakdown);
        protoAdapter4.encodeWithTag(reverseProtoWriter, 3, lendingRenderData.principal_amount);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, lendingRenderData.final_due_date);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 7, lendingRenderData.borrow_date);
        LendingRenderData.Type.ADAPTER.encodeWithTag(reverseProtoWriter, 1, lendingRenderData.f1380type);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LendingRenderData lendingRenderData = (LendingRenderData) obj;
        lendingRenderData.getClass();
        int encodedSizeWithTag = LendingRenderData.Type.ADAPTER.encodedSizeWithTag(1, lendingRenderData.f1380type) + lendingRenderData.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, lendingRenderData.final_due_date) + protoAdapter.encodedSizeWithTag(7, lendingRenderData.borrow_date) + encodedSizeWithTag;
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        int encodedSizeWithTag3 = protoAdapter2.encodedSizeWithTag(3, lendingRenderData.principal_amount) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter3 = LendingRenderData.Breakdown.ADAPTER;
        int encodedSizeWithTag4 = protoAdapter3.encodedSizeWithTag(4, lendingRenderData.breakdown) + encodedSizeWithTag3;
        ProtoAdapter protoAdapter4 = ProtoAdapter.BOOL;
        int encodedSizeWithTag5 = protoAdapter4.encodedSizeWithTag(6, lendingRenderData.manual_pay) + protoAdapter4.encodedSizeWithTag(5, lendingRenderData.is_skippable) + encodedSizeWithTag4;
        ProtoAdapter protoAdapter5 = ProtoAdapter.STRING;
        return LocalizedString.ADAPTER.encodedSizeWithTag(35, lendingRenderData.skipped_payment_allocation_description) + LendingRenderData.SkippedPaymentAllocationStrategy.ADAPTER.encodedSizeWithTag(34, lendingRenderData.skipped_payment_allocation_strategy) + LendingRenderData.PauseStatus.ADAPTER.encodedSizeWithTag(33, lendingRenderData.pause_status) + protoAdapter5.encodedSizeWithTag(32, lendingRenderData.order_id) + protoAdapter5.encodedSizeWithTag(31, lendingRenderData.bank_partner_full_name) + protoAdapter5.encodedSizeWithTag(30, lendingRenderData.withdrawal_disclosure_url) + LendingRenderData.Initiator.ADAPTER.encodedSizeWithTag(29, lendingRenderData.initiator) + protoAdapter.encodedSizeWithTag(26, lendingRenderData.down_payment_amount_cents) + RefundReason.ADAPTER.encodedSizeWithTag(25, lendingRenderData.refund_reason) + protoAdapter5.encodedSizeWithTag(22, lendingRenderData.loan_display_token) + protoAdapter3.encodedSizeWithTag(21, lendingRenderData.loan_breakdown) + protoAdapter2.encodedSizeWithTag(28, lendingRenderData.total_interest_amount) + protoAdapter2.encodedSizeWithTag(20, lendingRenderData.setup_fee_amount) + protoAdapter2.encodedSizeWithTag(19, lendingRenderData.paid_so_far_amount) + LendingRenderData.ContextCard.ADAPTER.encodedSizeWithTag(18, lendingRenderData.context_card) + LendingRenderData.PrePurchaseFinancingData.ADAPTER.encodedSizeWithTag(27, lendingRenderData.pre_purchase_financing_data) + LendingRenderData.RetroFinancingData.ADAPTER.encodedSizeWithTag(24, lendingRenderData.retro_financing_data) + LendingRenderData.SingleUsePaymentData.ADAPTER.encodedSizeWithTag(23, lendingRenderData.sup_data) + LendingRenderData.CfBnplData.ADAPTER.encodedSizeWithTag(17, lendingRenderData.cf_bnpl_data) + LendingRenderData.BnplData.ADAPTER.encodedSizeWithTag(15, lendingRenderData.bnpl_data) + LendingProduct.ADAPTER.encodedSizeWithTag(14, lendingRenderData.lending_product) + LendingRenderData.RelatedTransaction.ADAPTER.encodedSizeWithTag(13, lendingRenderData.related_transaction) + protoAdapter2.encodedSizeWithTag(16, lendingRenderData.outstanding_loan_balance_amount) + protoAdapter4.encodedSizeWithTag(12, lendingRenderData.suppress_details) + protoAdapter.encodedSizeWithTag(11, lendingRenderData.payable_until) + protoAdapter2.encodedSizeWithTag(10, lendingRenderData.original_amount) + protoAdapter5.encodedSizeWithTag(9, lendingRenderData.tila_document_token) + protoAdapter5.encodedSizeWithTag(8, lendingRenderData.loan_token) + encodedSizeWithTag5;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LendingRenderData lendingRenderData = (LendingRenderData) obj;
        lendingRenderData.getClass();
        Money money = lendingRenderData.principal_amount;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        LendingRenderData.Breakdown breakdown = lendingRenderData.breakdown;
        LendingRenderData.Breakdown breakdown2 = breakdown != null ? (LendingRenderData.Breakdown) LendingRenderData.Breakdown.ADAPTER.redact(breakdown) : null;
        Money money3 = lendingRenderData.original_amount;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        Money money5 = lendingRenderData.outstanding_loan_balance_amount;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        LendingRenderData.RelatedTransaction relatedTransaction = lendingRenderData.related_transaction;
        LendingRenderData.RelatedTransaction relatedTransaction2 = relatedTransaction != null ? (LendingRenderData.RelatedTransaction) LendingRenderData.RelatedTransaction.ADAPTER.redact(relatedTransaction) : null;
        LendingRenderData.BnplData bnplData = lendingRenderData.bnpl_data;
        LendingRenderData.BnplData bnplData2 = bnplData != null ? (LendingRenderData.BnplData) LendingRenderData.BnplData.ADAPTER.redact(bnplData) : null;
        LendingRenderData.CfBnplData cfBnplData = lendingRenderData.cf_bnpl_data;
        LendingRenderData.CfBnplData cfBnplData2 = cfBnplData != null ? (LendingRenderData.CfBnplData) LendingRenderData.CfBnplData.ADAPTER.redact(cfBnplData) : null;
        LendingRenderData.SingleUsePaymentData singleUsePaymentData = lendingRenderData.sup_data;
        LendingRenderData.SingleUsePaymentData singleUsePaymentData2 = singleUsePaymentData != null ? (LendingRenderData.SingleUsePaymentData) LendingRenderData.SingleUsePaymentData.ADAPTER.redact(singleUsePaymentData) : null;
        LendingRenderData.RetroFinancingData retroFinancingData = lendingRenderData.retro_financing_data;
        LendingRenderData.RetroFinancingData retroFinancingData2 = retroFinancingData != null ? (LendingRenderData.RetroFinancingData) LendingRenderData.RetroFinancingData.ADAPTER.redact(retroFinancingData) : null;
        LendingRenderData.PrePurchaseFinancingData prePurchaseFinancingData = lendingRenderData.pre_purchase_financing_data;
        LendingRenderData.PrePurchaseFinancingData prePurchaseFinancingData2 = prePurchaseFinancingData != null ? (LendingRenderData.PrePurchaseFinancingData) LendingRenderData.PrePurchaseFinancingData.ADAPTER.redact(prePurchaseFinancingData) : null;
        LendingRenderData.ContextCard contextCard = lendingRenderData.context_card;
        LendingRenderData.ContextCard contextCard2 = contextCard != null ? (LendingRenderData.ContextCard) LendingRenderData.ContextCard.ADAPTER.redact(contextCard) : null;
        Money money7 = lendingRenderData.paid_so_far_amount;
        Money money8 = money7 != null ? (Money) Money.ADAPTER.redact(money7) : null;
        Money money9 = lendingRenderData.setup_fee_amount;
        Money money10 = money9 != null ? (Money) Money.ADAPTER.redact(money9) : null;
        Money money11 = lendingRenderData.total_interest_amount;
        Money money12 = money11 != null ? (Money) Money.ADAPTER.redact(money11) : null;
        LendingRenderData.Breakdown breakdown3 = lendingRenderData.loan_breakdown;
        LendingRenderData.Breakdown breakdown4 = breakdown3 != null ? (LendingRenderData.Breakdown) LendingRenderData.Breakdown.ADAPTER.redact(breakdown3) : null;
        ByteString byteString = ByteString.EMPTY;
        LendingRenderData.Type type2 = lendingRenderData.f1380type;
        Long l = lendingRenderData.borrow_date;
        Long l2 = lendingRenderData.final_due_date;
        Boolean bool = lendingRenderData.is_skippable;
        Boolean bool2 = lendingRenderData.manual_pay;
        String str = lendingRenderData.loan_token;
        String str2 = lendingRenderData.tila_document_token;
        Long l3 = lendingRenderData.payable_until;
        Boolean bool3 = lendingRenderData.suppress_details;
        LendingProduct lendingProduct = lendingRenderData.lending_product;
        String str3 = lendingRenderData.loan_display_token;
        RefundReason refundReason = lendingRenderData.refund_reason;
        Long l4 = lendingRenderData.down_payment_amount_cents;
        LendingRenderData.Initiator initiator = lendingRenderData.initiator;
        String str4 = lendingRenderData.withdrawal_disclosure_url;
        String str5 = lendingRenderData.bank_partner_full_name;
        String str6 = lendingRenderData.order_id;
        LendingRenderData.PauseStatus pauseStatus = lendingRenderData.pause_status;
        LendingRenderData.SkippedPaymentAllocationStrategy skippedPaymentAllocationStrategy = lendingRenderData.skipped_payment_allocation_strategy;
        byteString.getClass();
        return new LendingRenderData(type2, l, l2, money2, breakdown2, bool, bool2, str, str2, money4, l3, bool3, money6, relatedTransaction2, lendingProduct, bnplData2, cfBnplData2, singleUsePaymentData2, retroFinancingData2, prePurchaseFinancingData2, contextCard2, money8, money10, money12, breakdown4, str3, refundReason, l4, initiator, str4, str5, str6, pauseStatus, skippedPaymentAllocationStrategy, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LendingRenderData lendingRenderData = (LendingRenderData) obj;
        lendingRenderData.getClass();
        LendingRenderData.Type.ADAPTER.encodeWithTag(protoWriter, 1, lendingRenderData.f1380type);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 7, lendingRenderData.borrow_date);
        protoAdapter.encodeWithTag(protoWriter, 2, lendingRenderData.final_due_date);
        ProtoAdapter protoAdapter2 = Money.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, lendingRenderData.principal_amount);
        ProtoAdapter protoAdapter3 = LendingRenderData.Breakdown.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 4, lendingRenderData.breakdown);
        ProtoAdapter protoAdapter4 = ProtoAdapter.BOOL;
        protoAdapter4.encodeWithTag(protoWriter, 5, lendingRenderData.is_skippable);
        protoAdapter4.encodeWithTag(protoWriter, 6, lendingRenderData.manual_pay);
        ProtoAdapter protoAdapter5 = ProtoAdapter.STRING;
        protoAdapter5.encodeWithTag(protoWriter, 8, lendingRenderData.loan_token);
        protoAdapter5.encodeWithTag(protoWriter, 9, lendingRenderData.tila_document_token);
        protoAdapter2.encodeWithTag(protoWriter, 10, lendingRenderData.original_amount);
        protoAdapter.encodeWithTag(protoWriter, 11, lendingRenderData.payable_until);
        protoAdapter4.encodeWithTag(protoWriter, 12, lendingRenderData.suppress_details);
        protoAdapter2.encodeWithTag(protoWriter, 16, lendingRenderData.outstanding_loan_balance_amount);
        LendingRenderData.RelatedTransaction.ADAPTER.encodeWithTag(protoWriter, 13, lendingRenderData.related_transaction);
        LendingProduct.ADAPTER.encodeWithTag(protoWriter, 14, lendingRenderData.lending_product);
        LendingRenderData.BnplData.ADAPTER.encodeWithTag(protoWriter, 15, lendingRenderData.bnpl_data);
        LendingRenderData.CfBnplData.ADAPTER.encodeWithTag(protoWriter, 17, lendingRenderData.cf_bnpl_data);
        LendingRenderData.SingleUsePaymentData.ADAPTER.encodeWithTag(protoWriter, 23, lendingRenderData.sup_data);
        LendingRenderData.RetroFinancingData.ADAPTER.encodeWithTag(protoWriter, 24, lendingRenderData.retro_financing_data);
        LendingRenderData.PrePurchaseFinancingData.ADAPTER.encodeWithTag(protoWriter, 27, lendingRenderData.pre_purchase_financing_data);
        LendingRenderData.ContextCard.ADAPTER.encodeWithTag(protoWriter, 18, lendingRenderData.context_card);
        protoAdapter2.encodeWithTag(protoWriter, 19, lendingRenderData.paid_so_far_amount);
        protoAdapter2.encodeWithTag(protoWriter, 20, lendingRenderData.setup_fee_amount);
        protoAdapter2.encodeWithTag(protoWriter, 28, lendingRenderData.total_interest_amount);
        protoAdapter3.encodeWithTag(protoWriter, 21, lendingRenderData.loan_breakdown);
        protoAdapter5.encodeWithTag(protoWriter, 22, lendingRenderData.loan_display_token);
        RefundReason.ADAPTER.encodeWithTag(protoWriter, 25, lendingRenderData.refund_reason);
        protoAdapter.encodeWithTag(protoWriter, 26, lendingRenderData.down_payment_amount_cents);
        LendingRenderData.Initiator.ADAPTER.encodeWithTag(protoWriter, 29, lendingRenderData.initiator);
        protoAdapter5.encodeWithTag(protoWriter, 30, lendingRenderData.withdrawal_disclosure_url);
        protoAdapter5.encodeWithTag(protoWriter, 31, lendingRenderData.bank_partner_full_name);
        protoAdapter5.encodeWithTag(protoWriter, 32, lendingRenderData.order_id);
        LendingRenderData.PauseStatus.ADAPTER.encodeWithTag(protoWriter, 33, lendingRenderData.pause_status);
        LendingRenderData.SkippedPaymentAllocationStrategy.ADAPTER.encodeWithTag(protoWriter, 34, lendingRenderData.skipped_payment_allocation_strategy);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 35, lendingRenderData.skipped_payment_allocation_description);
        protoWriter.writeBytes(lendingRenderData.unknownFields());
    }
}
