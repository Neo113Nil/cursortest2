package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.bankbook.Institution;
import com.squareup.protos.franklin.common.ProfileAlias;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.protos.franklin.lending.LendingProduct;
import com.squareup.protos.franklin.lending.RefundReason;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.hieroglyph.KeyScope;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.IdValue;

/* loaded from: classes8.dex */
public final class LendingRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LendingRenderData> CREATOR;
    public final String bank_partner_full_name;
    public final BnplData bnpl_data;
    public final Long borrow_date;
    public final Breakdown breakdown;
    public final CfBnplData cf_bnpl_data;
    public final ContextCard context_card;
    public final Long down_payment_amount_cents;
    public final Long final_due_date;
    public final Initiator initiator;
    public final Boolean is_skippable;
    public final LendingProduct lending_product;
    public final Breakdown loan_breakdown;
    public final String loan_display_token;
    public final String loan_token;
    public final Boolean manual_pay;
    public final String order_id;
    public final Money original_amount;
    public final Money outstanding_loan_balance_amount;
    public final Money paid_so_far_amount;
    public final PauseStatus pause_status;
    public final Long payable_until;
    public final PrePurchaseFinancingData pre_purchase_financing_data;
    public final Money principal_amount;
    public final RefundReason refund_reason;
    public final RelatedTransaction related_transaction;
    public final RetroFinancingData retro_financing_data;
    public final Money setup_fee_amount;
    public final LocalizedString skipped_payment_allocation_description;
    public final SkippedPaymentAllocationStrategy skipped_payment_allocation_strategy;
    public final SingleUsePaymentData sup_data;
    public final Boolean suppress_details;
    public final String tila_document_token;
    public final Money total_interest_amount;

    /* renamed from: type, reason: collision with root package name */
    public final Type f1380type;
    public final String withdrawal_disclosure_url;

    public final class BnplData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BnplData> CREATOR;
        public final Boolean final_payment;
        public final Money late_fee;
        public final Integer number_of_payments;
        public final Integer payment_number;
        public final Money total_purchase_amount;

        static {
            LendingRenderData$BnplData$Companion$ADAPTER$1 lendingRenderData$BnplData$Companion$ADAPTER$1 = new LendingRenderData$BnplData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BnplData.class), "type.googleapis.com/squareup.franklin.LendingRenderData.BnplData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = lendingRenderData$BnplData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(lendingRenderData$BnplData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BnplData(Integer num, Integer num2, Money money, Money money2, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.payment_number = num;
            this.number_of_payments = num2;
            this.total_purchase_amount = money;
            this.late_fee = money2;
            this.final_payment = bool;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BnplData)) {
                return false;
            }
            BnplData bnplData = (BnplData) obj;
            return Intrinsics.areEqual(unknownFields(), bnplData.unknownFields()) && Intrinsics.areEqual(this.payment_number, bnplData.payment_number) && Intrinsics.areEqual(this.number_of_payments, bnplData.number_of_payments) && Intrinsics.areEqual(this.total_purchase_amount, bnplData.total_purchase_amount) && Intrinsics.areEqual(this.late_fee, bnplData.late_fee) && Intrinsics.areEqual(this.final_payment, bnplData.final_payment);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.payment_number;
            int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Integer num2 = this.number_of_payments;
            int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
            Money money = this.total_purchase_amount;
            int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
            Money money2 = this.late_fee;
            int hashCode5 = (hashCode4 + (money2 != null ? money2.hashCode() : 0)) * 37;
            Boolean bool = this.final_payment;
            int hashCode6 = hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ProfileAlias.Builder builder = new ProfileAlias.Builder(9, false);
            builder.alias = this.payment_number;
            builder.expires_at = this.number_of_payments;
            builder.version = this.total_purchase_amount;
            builder.display_date = this.late_fee;
            builder.verified = this.final_payment;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Integer num = this.payment_number;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("payment_number=", num, arrayList);
            }
            Integer num2 = this.number_of_payments;
            if (num2 != null) {
                re$$ExternalSyntheticOutline0.m("number_of_payments=", num2, arrayList);
            }
            Money money = this.total_purchase_amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("total_purchase_amount=", money, arrayList);
            }
            Money money2 = this.late_fee;
            if (money2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("late_fee=", money2, arrayList);
            }
            Boolean bool = this.final_payment;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("final_payment=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BnplData{", "}", 0, null, null, 56);
        }
    }

    public final class Breakdown extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Breakdown> CREATOR;
        public final Money interest_owing_amount;
        public final Money late_fees_owing_amount;
        public final Money principal_owing_amount;
        public final Money setup_fee_owing_amount;

        static {
            LendingRenderData$Breakdown$Companion$ADAPTER$1 lendingRenderData$Breakdown$Companion$ADAPTER$1 = new LendingRenderData$Breakdown$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Breakdown.class), "type.googleapis.com/squareup.franklin.LendingRenderData.Breakdown", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = lendingRenderData$Breakdown$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(lendingRenderData$Breakdown$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Breakdown(Money money, Money money2, Money money3, Money money4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.principal_owing_amount = money;
            this.setup_fee_owing_amount = money2;
            this.late_fees_owing_amount = money3;
            this.interest_owing_amount = money4;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Breakdown)) {
                return false;
            }
            Breakdown breakdown = (Breakdown) obj;
            return Intrinsics.areEqual(unknownFields(), breakdown.unknownFields()) && Intrinsics.areEqual(this.principal_owing_amount, breakdown.principal_owing_amount) && Intrinsics.areEqual(this.setup_fee_owing_amount, breakdown.setup_fee_owing_amount) && Intrinsics.areEqual(this.late_fees_owing_amount, breakdown.late_fees_owing_amount) && Intrinsics.areEqual(this.interest_owing_amount, breakdown.interest_owing_amount);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Money money = this.principal_owing_amount;
            int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
            Money money2 = this.setup_fee_owing_amount;
            int hashCode3 = (hashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
            Money money3 = this.late_fees_owing_amount;
            int hashCode4 = (hashCode3 + (money3 != null ? money3.hashCode() : 0)) * 37;
            Money money4 = this.interest_owing_amount;
            int hashCode5 = hashCode4 + (money4 != null ? money4.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ColoredButton.Builder builder = new ColoredButton.Builder(24);
            builder.button_color = this.principal_owing_amount;
            builder.text_color = this.setup_fee_owing_amount;
            builder.text = this.late_fees_owing_amount;
            builder.action = this.interest_owing_amount;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Money money = this.principal_owing_amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("principal_owing_amount=", money, arrayList);
            }
            Money money2 = this.setup_fee_owing_amount;
            if (money2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("setup_fee_owing_amount=", money2, arrayList);
            }
            Money money3 = this.late_fees_owing_amount;
            if (money3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("late_fees_owing_amount=", money3, arrayList);
            }
            Money money4 = this.interest_owing_amount;
            if (money4 != null) {
                Matcher$$ExternalSyntheticOutline0.m("interest_owing_amount=", money4, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Breakdown{", "}", 0, null, null, 56);
        }
    }

    public final class Builder extends Message.Builder {
        public String bank_partner_full_name;
        public BnplData bnpl_data;
        public Long borrow_date;
        public Breakdown breakdown;
        public CfBnplData cf_bnpl_data;
        public ContextCard context_card;
        public Long down_payment_amount_cents;
        public Long final_due_date;
        public Initiator initiator;
        public Boolean is_skippable;
        public LendingProduct lending_product;
        public Breakdown loan_breakdown;
        public String loan_display_token;
        public String loan_token;
        public Boolean manual_pay;
        public String order_id;
        public Money original_amount;
        public Money outstanding_loan_balance_amount;
        public Money paid_so_far_amount;
        public PauseStatus pause_status;
        public Long payable_until;
        public PrePurchaseFinancingData pre_purchase_financing_data;
        public Money principal_amount;
        public RefundReason refund_reason;
        public RelatedTransaction related_transaction;
        public RetroFinancingData retro_financing_data;
        public Money setup_fee_amount;
        public LocalizedString skipped_payment_allocation_description;
        public SkippedPaymentAllocationStrategy skipped_payment_allocation_strategy;
        public SingleUsePaymentData sup_data;
        public Boolean suppress_details;
        public String tila_document_token;
        public Money total_interest_amount;

        /* renamed from: type, reason: collision with root package name */
        public Type f1381type;
        public String withdrawal_disclosure_url;

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new LendingRenderData(this.f1381type, this.borrow_date, this.final_due_date, this.principal_amount, this.breakdown, this.is_skippable, this.manual_pay, this.loan_token, this.tila_document_token, this.original_amount, this.payable_until, this.suppress_details, this.outstanding_loan_balance_amount, this.related_transaction, this.lending_product, this.bnpl_data, this.cf_bnpl_data, this.sup_data, this.retro_financing_data, this.pre_purchase_financing_data, this.context_card, this.paid_so_far_amount, this.setup_fee_amount, this.total_interest_amount, this.loan_breakdown, this.loan_display_token, this.refund_reason, this.down_payment_amount_cents, this.initiator, this.withdrawal_disclosure_url, this.bank_partner_full_name, this.order_id, this.pause_status, this.skipped_payment_allocation_strategy, this.skipped_payment_allocation_description, buildUnknownFields());
        }
    }

    public final class CfBnplData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CfBnplData> CREATOR;
        public final Long late_fee_applies_at;
        public final Long next_payment_due_at;
        public final Integer number_of_payments;
        public final Long order_total_cents;
        public final Integer payment_number;
        public final Long return_amount_cents;
        public final String start_view_payment_plan_flow_url;
        public final Long total_return_amounts_cents;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public Long late_fee_applies_at;
            public Long next_payment_due_at;
            public Integer number_of_payments;
            public Long order_total_cents;
            public Integer payment_number;
            public Long return_amount_cents;
            public String start_view_payment_plan_flow_url;
            public Long total_return_amounts_cents;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new CfBnplData(this.payment_number, this.number_of_payments, this.next_payment_due_at, this.late_fee_applies_at, this.return_amount_cents, this.order_total_cents, this.total_return_amounts_cents, this.start_view_payment_plan_flow_url, buildUnknownFields());
                    case 1:
                        return new PrePurchaseFinancingData(this.payment_number, this.number_of_payments, this.next_payment_due_at, this.late_fee_applies_at, this.return_amount_cents, this.order_total_cents, this.total_return_amounts_cents, this.start_view_payment_plan_flow_url, buildUnknownFields());
                    default:
                        return new SingleUsePaymentData(this.payment_number, this.number_of_payments, this.next_payment_due_at, this.late_fee_applies_at, this.return_amount_cents, this.order_total_cents, this.total_return_amounts_cents, this.start_view_payment_plan_flow_url, buildUnknownFields());
                }
            }
        }

        static {
            LendingRenderData$CfBnplData$Companion$ADAPTER$1 lendingRenderData$CfBnplData$Companion$ADAPTER$1 = new LendingRenderData$CfBnplData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CfBnplData.class), "type.googleapis.com/squareup.franklin.LendingRenderData.CfBnplData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = lendingRenderData$CfBnplData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(lendingRenderData$CfBnplData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CfBnplData(Integer num, Integer num2, Long l, Long l2, Long l3, Long l4, Long l5, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.payment_number = num;
            this.number_of_payments = num2;
            this.next_payment_due_at = l;
            this.late_fee_applies_at = l2;
            this.return_amount_cents = l3;
            this.order_total_cents = l4;
            this.total_return_amounts_cents = l5;
            this.start_view_payment_plan_flow_url = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CfBnplData)) {
                return false;
            }
            CfBnplData cfBnplData = (CfBnplData) obj;
            return Intrinsics.areEqual(unknownFields(), cfBnplData.unknownFields()) && Intrinsics.areEqual(this.payment_number, cfBnplData.payment_number) && Intrinsics.areEqual(this.number_of_payments, cfBnplData.number_of_payments) && Intrinsics.areEqual(this.next_payment_due_at, cfBnplData.next_payment_due_at) && Intrinsics.areEqual(this.late_fee_applies_at, cfBnplData.late_fee_applies_at) && Intrinsics.areEqual(this.return_amount_cents, cfBnplData.return_amount_cents) && Intrinsics.areEqual(this.order_total_cents, cfBnplData.order_total_cents) && Intrinsics.areEqual(this.total_return_amounts_cents, cfBnplData.total_return_amounts_cents) && Intrinsics.areEqual(this.start_view_payment_plan_flow_url, cfBnplData.start_view_payment_plan_flow_url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.payment_number;
            int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Integer num2 = this.number_of_payments;
            int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
            Long l = this.next_payment_due_at;
            int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            Long l2 = this.late_fee_applies_at;
            int hashCode5 = (hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
            Long l3 = this.return_amount_cents;
            int hashCode6 = (hashCode5 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
            Long l4 = this.order_total_cents;
            int hashCode7 = (hashCode6 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
            Long l5 = this.total_return_amounts_cents;
            int hashCode8 = (hashCode7 + (l5 != null ? Long.hashCode(l5.longValue()) : 0)) * 37;
            String str = this.start_view_payment_plan_flow_url;
            int hashCode9 = hashCode8 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.payment_number = this.payment_number;
            builder.number_of_payments = this.number_of_payments;
            builder.next_payment_due_at = this.next_payment_due_at;
            builder.late_fee_applies_at = this.late_fee_applies_at;
            builder.return_amount_cents = this.return_amount_cents;
            builder.order_total_cents = this.order_total_cents;
            builder.total_return_amounts_cents = this.total_return_amounts_cents;
            builder.start_view_payment_plan_flow_url = this.start_view_payment_plan_flow_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Integer num = this.payment_number;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("payment_number=", num, arrayList);
            }
            Integer num2 = this.number_of_payments;
            if (num2 != null) {
                re$$ExternalSyntheticOutline0.m("number_of_payments=", num2, arrayList);
            }
            Long l = this.next_payment_due_at;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("next_payment_due_at=", l, arrayList);
            }
            Long l2 = this.late_fee_applies_at;
            if (l2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("late_fee_applies_at=", l2, arrayList);
            }
            Long l3 = this.return_amount_cents;
            if (l3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("return_amount_cents=", l3, arrayList);
            }
            Long l4 = this.order_total_cents;
            if (l4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("order_total_cents=", l4, arrayList);
            }
            Long l5 = this.total_return_amounts_cents;
            if (l5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("total_return_amounts_cents=", l5, arrayList);
            }
            String str = this.start_view_payment_plan_flow_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "start_view_payment_plan_flow_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CfBnplData{", "}", 0, null, null, 56);
        }
    }

    public final class ContextCard extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ContextCard> CREATOR;
        public final String body;
        public final String title;

        static {
            LendingRenderData$ContextCard$Companion$ADAPTER$1 lendingRenderData$ContextCard$Companion$ADAPTER$1 = new LendingRenderData$ContextCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ContextCard.class), "type.googleapis.com/squareup.franklin.LendingRenderData.ContextCard", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = lendingRenderData$ContextCard$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(lendingRenderData$ContextCard$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContextCard(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.body = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ContextCard)) {
                return false;
            }
            ContextCard contextCard = (ContextCard) obj;
            return Intrinsics.areEqual(unknownFields(), contextCard.unknownFields()) && Intrinsics.areEqual(this.title, contextCard.title) && Intrinsics.areEqual(this.body, contextCard.body);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.body;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            IdValue.Builder builder = new IdValue.Builder(5);
            builder.server = this.title;
            builder.local = this.body;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.body;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "body=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ContextCard{", "}", 0, null, null, 56);
        }
    }

    public enum Initiator implements WireEnum {
        CUSTOMER(1),
        JOB(2),
        ADMIN(3),
        BALANCE_RECOVERY(4),
        PAY_AS_YOU_GO(5),
        OVERDUE_SCHEDULED_RETRY(6),
        INFLOW(7),
        PAY_WITH_CASH(8),
        SETTLEMENT(9),
        FINAL_REPAYMENT_RETRY(10);

        public final int value;
        public static final Trigger.Companion Companion = new Trigger.Companion();
        public static final LendingRenderData$Initiator$Companion$ADAPTER$1 ADAPTER = new LendingRenderData$Initiator$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Initiator.class), Syntax.PROTO_2, null);

        Initiator(int i) {
            this.value = i;
        }

        public static final Initiator fromValue(int i) {
            Companion.getClass();
            return Trigger.Companion.m3950fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum PauseStatus implements WireEnum {
        DO_NOT_USE(0),
        PAUSED(1),
        RESUMED(2);

        public static final LendingRenderData$PauseStatus$Companion$ADAPTER$1 ADAPTER;
        public static final KeyScope.Companion Companion;
        public final int value;

        static {
            PauseStatus pauseStatus = DO_NOT_USE;
            Companion = new KeyScope.Companion();
            ADAPTER = new LendingRenderData$PauseStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PauseStatus.class), Syntax.PROTO_2, pauseStatus);
        }

        PauseStatus(int i) {
            this.value = i;
        }

        public static final PauseStatus fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return DO_NOT_USE;
            }
            if (i == 1) {
                return PAUSED;
            }
            if (i != 2) {
                return null;
            }
            return RESUMED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class PrePurchaseFinancingData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PrePurchaseFinancingData> CREATOR;
        public final Long early_repayment_fee_refund_amounts_cents;
        public final Long next_payment_due_at;
        public final Integer number_of_payments;
        public final Long order_total_cents;
        public final Integer payment_number;
        public final Long return_amount_cents;
        public final String start_view_payment_plan_flow_url;
        public final Long total_return_amounts_cents;

        static {
            LendingRenderData$PrePurchaseFinancingData$Companion$ADAPTER$1 lendingRenderData$PrePurchaseFinancingData$Companion$ADAPTER$1 = new LendingRenderData$PrePurchaseFinancingData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PrePurchaseFinancingData.class), "type.googleapis.com/squareup.franklin.LendingRenderData.PrePurchaseFinancingData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = lendingRenderData$PrePurchaseFinancingData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(lendingRenderData$PrePurchaseFinancingData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrePurchaseFinancingData(Integer num, Integer num2, Long l, Long l2, Long l3, Long l4, Long l5, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.payment_number = num;
            this.number_of_payments = num2;
            this.next_payment_due_at = l;
            this.return_amount_cents = l2;
            this.order_total_cents = l3;
            this.total_return_amounts_cents = l4;
            this.start_view_payment_plan_flow_url = str;
            this.early_repayment_fee_refund_amounts_cents = l5;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PrePurchaseFinancingData)) {
                return false;
            }
            PrePurchaseFinancingData prePurchaseFinancingData = (PrePurchaseFinancingData) obj;
            return Intrinsics.areEqual(unknownFields(), prePurchaseFinancingData.unknownFields()) && Intrinsics.areEqual(this.payment_number, prePurchaseFinancingData.payment_number) && Intrinsics.areEqual(this.number_of_payments, prePurchaseFinancingData.number_of_payments) && Intrinsics.areEqual(this.next_payment_due_at, prePurchaseFinancingData.next_payment_due_at) && Intrinsics.areEqual(this.return_amount_cents, prePurchaseFinancingData.return_amount_cents) && Intrinsics.areEqual(this.order_total_cents, prePurchaseFinancingData.order_total_cents) && Intrinsics.areEqual(this.total_return_amounts_cents, prePurchaseFinancingData.total_return_amounts_cents) && Intrinsics.areEqual(this.start_view_payment_plan_flow_url, prePurchaseFinancingData.start_view_payment_plan_flow_url) && Intrinsics.areEqual(this.early_repayment_fee_refund_amounts_cents, prePurchaseFinancingData.early_repayment_fee_refund_amounts_cents);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.payment_number;
            int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Integer num2 = this.number_of_payments;
            int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
            Long l = this.next_payment_due_at;
            int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            Long l2 = this.return_amount_cents;
            int hashCode5 = (hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
            Long l3 = this.order_total_cents;
            int hashCode6 = (hashCode5 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
            Long l4 = this.total_return_amounts_cents;
            int hashCode7 = (hashCode6 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
            String str = this.start_view_payment_plan_flow_url;
            int hashCode8 = (hashCode7 + (str != null ? str.hashCode() : 0)) * 37;
            Long l5 = this.early_repayment_fee_refund_amounts_cents;
            int hashCode9 = hashCode8 + (l5 != null ? Long.hashCode(l5.longValue()) : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CfBnplData.Builder builder = new CfBnplData.Builder(1);
            builder.payment_number = this.payment_number;
            builder.number_of_payments = this.number_of_payments;
            builder.next_payment_due_at = this.next_payment_due_at;
            builder.late_fee_applies_at = this.return_amount_cents;
            builder.return_amount_cents = this.order_total_cents;
            builder.order_total_cents = this.total_return_amounts_cents;
            builder.start_view_payment_plan_flow_url = this.start_view_payment_plan_flow_url;
            builder.total_return_amounts_cents = this.early_repayment_fee_refund_amounts_cents;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Integer num = this.payment_number;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("payment_number=", num, arrayList);
            }
            Integer num2 = this.number_of_payments;
            if (num2 != null) {
                re$$ExternalSyntheticOutline0.m("number_of_payments=", num2, arrayList);
            }
            Long l = this.next_payment_due_at;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("next_payment_due_at=", l, arrayList);
            }
            Long l2 = this.return_amount_cents;
            if (l2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("return_amount_cents=", l2, arrayList);
            }
            Long l3 = this.order_total_cents;
            if (l3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("order_total_cents=", l3, arrayList);
            }
            Long l4 = this.total_return_amounts_cents;
            if (l4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("total_return_amounts_cents=", l4, arrayList);
            }
            String str = this.start_view_payment_plan_flow_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "start_view_payment_plan_flow_url=", arrayList);
            }
            Long l5 = this.early_repayment_fee_refund_amounts_cents;
            if (l5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("early_repayment_fee_refund_amounts_cents=", l5, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PrePurchaseFinancingData{", "}", 0, null, null, 56);
        }
    }

    public final class RelatedTransaction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RelatedTransaction> CREATOR;
        public final String applied_percentage;
        public final Money transaction_amount;

        /* renamed from: type, reason: collision with root package name */
        public final Type f1382type;

        public enum Type implements WireEnum {
            PEER_TO_PEER(1),
            DIRECT_DEPOSIT(2);

            public final int value;
            public static final ClientDriven.Companion Companion = new ClientDriven.Companion();
            public static final LendingRenderData$RelatedTransaction$Type$Companion$ADAPTER$1 ADAPTER = new LendingRenderData$RelatedTransaction$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, null);

            Type(int i) {
                this.value = i;
            }

            public static final Type fromValue(int i) {
                Companion.getClass();
                if (i == 1) {
                    return PEER_TO_PEER;
                }
                if (i != 2) {
                    return null;
                }
                return DIRECT_DEPOSIT;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            LendingRenderData$RelatedTransaction$Companion$ADAPTER$1 lendingRenderData$RelatedTransaction$Companion$ADAPTER$1 = new LendingRenderData$RelatedTransaction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RelatedTransaction.class), "type.googleapis.com/squareup.franklin.LendingRenderData.RelatedTransaction", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = lendingRenderData$RelatedTransaction$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(lendingRenderData$RelatedTransaction$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RelatedTransaction(Money money, Type type2, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.transaction_amount = money;
            this.f1382type = type2;
            this.applied_percentage = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RelatedTransaction)) {
                return false;
            }
            RelatedTransaction relatedTransaction = (RelatedTransaction) obj;
            return Intrinsics.areEqual(unknownFields(), relatedTransaction.unknownFields()) && Intrinsics.areEqual(this.transaction_amount, relatedTransaction.transaction_amount) && this.f1382type == relatedTransaction.f1382type && Intrinsics.areEqual(this.applied_percentage, relatedTransaction.applied_percentage);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Money money = this.transaction_amount;
            int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
            Type type2 = this.f1382type;
            int hashCode3 = (hashCode2 + (type2 != null ? type2.hashCode() : 0)) * 37;
            String str = this.applied_percentage;
            int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Institution.Builder builder = new Institution.Builder(23, false);
            builder.display_info = this.transaction_amount;
            builder.help_menu_items = this.f1382type;
            builder.institution_token = this.applied_percentage;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Money money = this.transaction_amount;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("transaction_amount=", money, arrayList);
            }
            Type type2 = this.f1382type;
            if (type2 != null) {
                arrayList.add("type=" + type2);
            }
            String str = this.applied_percentage;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "applied_percentage=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RelatedTransaction{", "}", 0, null, null, 56);
        }
    }

    public final class RetroFinancingData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RetroFinancingData> CREATOR;
        public final Long early_repayment_fee_refund_amounts_cents;
        public final Boolean is_final_payment;
        public final Boolean is_p2p_eligible_customer;
        public final Long next_payment_due_at;
        public final Integer number_of_payments;
        public final Long order_total_cents;
        public final Integer payment_number;
        public final Long return_amount_cents;
        public final String start_view_payment_plan_flow_url;
        public final Long total_return_amounts_cents;

        static {
            LendingRenderData$RetroFinancingData$Companion$ADAPTER$1 lendingRenderData$RetroFinancingData$Companion$ADAPTER$1 = new LendingRenderData$RetroFinancingData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RetroFinancingData.class), "type.googleapis.com/squareup.franklin.LendingRenderData.RetroFinancingData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = lendingRenderData$RetroFinancingData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(lendingRenderData$RetroFinancingData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetroFinancingData(String str, Integer num, Integer num2, Long l, Long l2, Long l3, Long l4, Boolean bool, Long l5, Boolean bool2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.start_view_payment_plan_flow_url = str;
            this.payment_number = num;
            this.number_of_payments = num2;
            this.return_amount_cents = l;
            this.order_total_cents = l2;
            this.total_return_amounts_cents = l3;
            this.next_payment_due_at = l4;
            this.is_final_payment = bool;
            this.early_repayment_fee_refund_amounts_cents = l5;
            this.is_p2p_eligible_customer = bool2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RetroFinancingData)) {
                return false;
            }
            RetroFinancingData retroFinancingData = (RetroFinancingData) obj;
            return Intrinsics.areEqual(unknownFields(), retroFinancingData.unknownFields()) && Intrinsics.areEqual(this.start_view_payment_plan_flow_url, retroFinancingData.start_view_payment_plan_flow_url) && Intrinsics.areEqual(this.payment_number, retroFinancingData.payment_number) && Intrinsics.areEqual(this.number_of_payments, retroFinancingData.number_of_payments) && Intrinsics.areEqual(this.return_amount_cents, retroFinancingData.return_amount_cents) && Intrinsics.areEqual(this.order_total_cents, retroFinancingData.order_total_cents) && Intrinsics.areEqual(this.total_return_amounts_cents, retroFinancingData.total_return_amounts_cents) && Intrinsics.areEqual(this.next_payment_due_at, retroFinancingData.next_payment_due_at) && Intrinsics.areEqual(this.is_final_payment, retroFinancingData.is_final_payment) && Intrinsics.areEqual(this.early_repayment_fee_refund_amounts_cents, retroFinancingData.early_repayment_fee_refund_amounts_cents) && Intrinsics.areEqual(this.is_p2p_eligible_customer, retroFinancingData.is_p2p_eligible_customer);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.start_view_payment_plan_flow_url;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Integer num = this.payment_number;
            int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Integer num2 = this.number_of_payments;
            int hashCode4 = (hashCode3 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
            Long l = this.return_amount_cents;
            int hashCode5 = (hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            Long l2 = this.order_total_cents;
            int hashCode6 = (hashCode5 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
            Long l3 = this.total_return_amounts_cents;
            int hashCode7 = (hashCode6 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
            Long l4 = this.next_payment_due_at;
            int hashCode8 = (hashCode7 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
            Boolean bool = this.is_final_payment;
            int hashCode9 = (hashCode8 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Long l5 = this.early_repayment_fee_refund_amounts_cents;
            int hashCode10 = (hashCode9 + (l5 != null ? Long.hashCode(l5.longValue()) : 0)) * 37;
            Boolean bool2 = this.is_p2p_eligible_customer;
            int hashCode11 = hashCode10 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
            this.hashCode = hashCode11;
            return hashCode11;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CashInRequest.Builder builder = new CashInRequest.Builder(20);
            builder.external_id = this.start_view_payment_plan_flow_url;
            builder.request_context = this.payment_number;
            builder.passcode_token = this.number_of_payments;
            builder.external_client_transfer_token = this.return_amount_cents;
            builder.source = this.order_total_cents;
            builder.target = this.total_return_amounts_cents;
            builder.amount = this.next_payment_due_at;
            builder.call_context = this.is_final_payment;
            builder.forwarded_call_context = this.early_repayment_fee_refund_amounts_cents;
            builder.client_verified_digital_wallet = this.is_p2p_eligible_customer;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.start_view_payment_plan_flow_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "start_view_payment_plan_flow_url=", arrayList);
            }
            Integer num = this.payment_number;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("payment_number=", num, arrayList);
            }
            Integer num2 = this.number_of_payments;
            if (num2 != null) {
                re$$ExternalSyntheticOutline0.m("number_of_payments=", num2, arrayList);
            }
            Long l = this.return_amount_cents;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("return_amount_cents=", l, arrayList);
            }
            Long l2 = this.order_total_cents;
            if (l2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("order_total_cents=", l2, arrayList);
            }
            Long l3 = this.total_return_amounts_cents;
            if (l3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("total_return_amounts_cents=", l3, arrayList);
            }
            Long l4 = this.next_payment_due_at;
            if (l4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("next_payment_due_at=", l4, arrayList);
            }
            Boolean bool = this.is_final_payment;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_final_payment=", bool, arrayList);
            }
            Long l5 = this.early_repayment_fee_refund_amounts_cents;
            if (l5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("early_repayment_fee_refund_amounts_cents=", l5, arrayList);
            }
            Boolean bool2 = this.is_p2p_eligible_customer;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_p2p_eligible_customer=", bool2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RetroFinancingData{", "}", 0, null, null, 56);
        }
    }

    public final class SingleUsePaymentData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<SingleUsePaymentData> CREATOR;
        public final Long late_fee_applies_at;
        public final Long next_payment_due_at;
        public final Integer number_of_payments;
        public final Long order_total_cents;
        public final Integer payment_number;
        public final Long return_amount_cents;
        public final String start_view_payment_plan_flow_url;
        public final Long total_return_amounts_cents;

        static {
            LendingRenderData$SingleUsePaymentData$Companion$ADAPTER$1 lendingRenderData$SingleUsePaymentData$Companion$ADAPTER$1 = new LendingRenderData$SingleUsePaymentData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SingleUsePaymentData.class), "type.googleapis.com/squareup.franklin.LendingRenderData.SingleUsePaymentData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
            ADAPTER = lendingRenderData$SingleUsePaymentData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(lendingRenderData$SingleUsePaymentData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SingleUsePaymentData(Integer num, Integer num2, Long l, Long l2, Long l3, Long l4, Long l5, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.payment_number = num;
            this.number_of_payments = num2;
            this.next_payment_due_at = l;
            this.late_fee_applies_at = l2;
            this.return_amount_cents = l3;
            this.order_total_cents = l4;
            this.total_return_amounts_cents = l5;
            this.start_view_payment_plan_flow_url = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SingleUsePaymentData)) {
                return false;
            }
            SingleUsePaymentData singleUsePaymentData = (SingleUsePaymentData) obj;
            return Intrinsics.areEqual(unknownFields(), singleUsePaymentData.unknownFields()) && Intrinsics.areEqual(this.payment_number, singleUsePaymentData.payment_number) && Intrinsics.areEqual(this.number_of_payments, singleUsePaymentData.number_of_payments) && Intrinsics.areEqual(this.next_payment_due_at, singleUsePaymentData.next_payment_due_at) && Intrinsics.areEqual(this.late_fee_applies_at, singleUsePaymentData.late_fee_applies_at) && Intrinsics.areEqual(this.return_amount_cents, singleUsePaymentData.return_amount_cents) && Intrinsics.areEqual(this.order_total_cents, singleUsePaymentData.order_total_cents) && Intrinsics.areEqual(this.total_return_amounts_cents, singleUsePaymentData.total_return_amounts_cents) && Intrinsics.areEqual(this.start_view_payment_plan_flow_url, singleUsePaymentData.start_view_payment_plan_flow_url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.payment_number;
            int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Integer num2 = this.number_of_payments;
            int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
            Long l = this.next_payment_due_at;
            int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            Long l2 = this.late_fee_applies_at;
            int hashCode5 = (hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
            Long l3 = this.return_amount_cents;
            int hashCode6 = (hashCode5 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
            Long l4 = this.order_total_cents;
            int hashCode7 = (hashCode6 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
            Long l5 = this.total_return_amounts_cents;
            int hashCode8 = (hashCode7 + (l5 != null ? Long.hashCode(l5.longValue()) : 0)) * 37;
            String str = this.start_view_payment_plan_flow_url;
            int hashCode9 = hashCode8 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode9;
            return hashCode9;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CfBnplData.Builder builder = new CfBnplData.Builder(2);
            builder.payment_number = this.payment_number;
            builder.number_of_payments = this.number_of_payments;
            builder.next_payment_due_at = this.next_payment_due_at;
            builder.late_fee_applies_at = this.late_fee_applies_at;
            builder.return_amount_cents = this.return_amount_cents;
            builder.order_total_cents = this.order_total_cents;
            builder.total_return_amounts_cents = this.total_return_amounts_cents;
            builder.start_view_payment_plan_flow_url = this.start_view_payment_plan_flow_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Integer num = this.payment_number;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("payment_number=", num, arrayList);
            }
            Integer num2 = this.number_of_payments;
            if (num2 != null) {
                re$$ExternalSyntheticOutline0.m("number_of_payments=", num2, arrayList);
            }
            Long l = this.next_payment_due_at;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("next_payment_due_at=", l, arrayList);
            }
            Long l2 = this.late_fee_applies_at;
            if (l2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("late_fee_applies_at=", l2, arrayList);
            }
            Long l3 = this.return_amount_cents;
            if (l3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("return_amount_cents=", l3, arrayList);
            }
            Long l4 = this.order_total_cents;
            if (l4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("order_total_cents=", l4, arrayList);
            }
            Long l5 = this.total_return_amounts_cents;
            if (l5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("total_return_amounts_cents=", l5, arrayList);
            }
            String str = this.start_view_payment_plan_flow_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "start_view_payment_plan_flow_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "SingleUsePaymentData{", "}", 0, null, null, 56);
        }
    }

    public enum SkippedPaymentAllocationStrategy implements WireEnum {
        SKIPPED_PAYMENT_ALLOCATION_STRATEGY_UNSPECIFIED(0),
        ROLL_OVER_TO_NEXT(1),
        BACKLOAD_TO_FINAL(2),
        SPREAD_ACROSS_REMAINING(3);

        public static final LendingRenderData$SkippedPaymentAllocationStrategy$Companion$ADAPTER$1 ADAPTER;
        public static final UiControl.Type.Companion Companion;
        public final int value;

        static {
            SkippedPaymentAllocationStrategy skippedPaymentAllocationStrategy = SKIPPED_PAYMENT_ALLOCATION_STRATEGY_UNSPECIFIED;
            Companion = new UiControl.Type.Companion();
            ADAPTER = new LendingRenderData$SkippedPaymentAllocationStrategy$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(SkippedPaymentAllocationStrategy.class), Syntax.PROTO_2, skippedPaymentAllocationStrategy);
        }

        SkippedPaymentAllocationStrategy(int i) {
            this.value = i;
        }

        public static final SkippedPaymentAllocationStrategy fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return SKIPPED_PAYMENT_ALLOCATION_STRATEGY_UNSPECIFIED;
            }
            if (i == 1) {
                return ROLL_OVER_TO_NEXT;
            }
            if (i == 2) {
                return BACKLOAD_TO_FINAL;
            }
            if (i != 3) {
                return null;
            }
            return SPREAD_ACROSS_REMAINING;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum Type implements WireEnum {
        LOAN_CREATION(1),
        SCHEDULED_PAYMENT(2),
        SKIPPED_PAYMENT(3),
        COMPLETED_PAYMENT(4),
        MISSED_PAYMENT(5),
        OVERDUE_PAYMENT(6),
        INTEREST_CHARGE(7),
        REFUND(8),
        ADJUSTMENT(9),
        PARTIAL_PAYMENT(10),
        LATE_FEE(11);

        public final int value;
        public static final LinkResult.Companion Companion = new LinkResult.Companion();
        public static final LendingRenderData$Type$Companion$ADAPTER$1 ADAPTER = new LendingRenderData$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, null);

        Type(int i) {
            this.value = i;
        }

        public static final Type fromValue(int i) {
            Companion.getClass();
            return LinkResult.Companion.m3958fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        LendingRenderData$Companion$ADAPTER$1 lendingRenderData$Companion$ADAPTER$1 = new LendingRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LendingRenderData.class), "type.googleapis.com/squareup.franklin.LendingRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = lendingRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(lendingRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LendingRenderData(Type type2, Long l, Long l2, Money money, Breakdown breakdown, Boolean bool, Boolean bool2, String str, String str2, Money money2, Long l3, Boolean bool3, Money money3, RelatedTransaction relatedTransaction, LendingProduct lendingProduct, BnplData bnplData, CfBnplData cfBnplData, SingleUsePaymentData singleUsePaymentData, RetroFinancingData retroFinancingData, PrePurchaseFinancingData prePurchaseFinancingData, ContextCard contextCard, Money money4, Money money5, Money money6, Breakdown breakdown2, String str3, RefundReason refundReason, Long l4, Initiator initiator, String str4, String str5, String str6, PauseStatus pauseStatus, SkippedPaymentAllocationStrategy skippedPaymentAllocationStrategy, LocalizedString localizedString, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1380type = type2;
        this.borrow_date = l;
        this.final_due_date = l2;
        this.principal_amount = money;
        this.breakdown = breakdown;
        this.is_skippable = bool;
        this.manual_pay = bool2;
        this.loan_token = str;
        this.tila_document_token = str2;
        this.original_amount = money2;
        this.payable_until = l3;
        this.suppress_details = bool3;
        this.outstanding_loan_balance_amount = money3;
        this.related_transaction = relatedTransaction;
        this.lending_product = lendingProduct;
        this.bnpl_data = bnplData;
        this.cf_bnpl_data = cfBnplData;
        this.sup_data = singleUsePaymentData;
        this.retro_financing_data = retroFinancingData;
        this.pre_purchase_financing_data = prePurchaseFinancingData;
        this.context_card = contextCard;
        this.paid_so_far_amount = money4;
        this.setup_fee_amount = money5;
        this.total_interest_amount = money6;
        this.loan_breakdown = breakdown2;
        this.loan_display_token = str3;
        this.refund_reason = refundReason;
        this.down_payment_amount_cents = l4;
        this.initiator = initiator;
        this.withdrawal_disclosure_url = str4;
        this.bank_partner_full_name = str5;
        this.order_id = str6;
        this.pause_status = pauseStatus;
        this.skipped_payment_allocation_strategy = skippedPaymentAllocationStrategy;
        this.skipped_payment_allocation_description = localizedString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LendingRenderData)) {
            return false;
        }
        LendingRenderData lendingRenderData = (LendingRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), lendingRenderData.unknownFields()) && this.f1380type == lendingRenderData.f1380type && Intrinsics.areEqual(this.borrow_date, lendingRenderData.borrow_date) && Intrinsics.areEqual(this.final_due_date, lendingRenderData.final_due_date) && Intrinsics.areEqual(this.principal_amount, lendingRenderData.principal_amount) && Intrinsics.areEqual(this.breakdown, lendingRenderData.breakdown) && Intrinsics.areEqual(this.is_skippable, lendingRenderData.is_skippable) && Intrinsics.areEqual(this.manual_pay, lendingRenderData.manual_pay) && Intrinsics.areEqual(this.loan_token, lendingRenderData.loan_token) && Intrinsics.areEqual(this.tila_document_token, lendingRenderData.tila_document_token) && Intrinsics.areEqual(this.original_amount, lendingRenderData.original_amount) && Intrinsics.areEqual(this.payable_until, lendingRenderData.payable_until) && Intrinsics.areEqual(this.suppress_details, lendingRenderData.suppress_details) && Intrinsics.areEqual(this.outstanding_loan_balance_amount, lendingRenderData.outstanding_loan_balance_amount) && Intrinsics.areEqual(this.related_transaction, lendingRenderData.related_transaction) && this.lending_product == lendingRenderData.lending_product && Intrinsics.areEqual(this.bnpl_data, lendingRenderData.bnpl_data) && Intrinsics.areEqual(this.cf_bnpl_data, lendingRenderData.cf_bnpl_data) && Intrinsics.areEqual(this.sup_data, lendingRenderData.sup_data) && Intrinsics.areEqual(this.retro_financing_data, lendingRenderData.retro_financing_data) && Intrinsics.areEqual(this.pre_purchase_financing_data, lendingRenderData.pre_purchase_financing_data) && Intrinsics.areEqual(this.context_card, lendingRenderData.context_card) && Intrinsics.areEqual(this.paid_so_far_amount, lendingRenderData.paid_so_far_amount) && Intrinsics.areEqual(this.setup_fee_amount, lendingRenderData.setup_fee_amount) && Intrinsics.areEqual(this.total_interest_amount, lendingRenderData.total_interest_amount) && Intrinsics.areEqual(this.loan_breakdown, lendingRenderData.loan_breakdown) && Intrinsics.areEqual(this.loan_display_token, lendingRenderData.loan_display_token) && this.refund_reason == lendingRenderData.refund_reason && Intrinsics.areEqual(this.down_payment_amount_cents, lendingRenderData.down_payment_amount_cents) && this.initiator == lendingRenderData.initiator && Intrinsics.areEqual(this.withdrawal_disclosure_url, lendingRenderData.withdrawal_disclosure_url) && Intrinsics.areEqual(this.bank_partner_full_name, lendingRenderData.bank_partner_full_name) && Intrinsics.areEqual(this.order_id, lendingRenderData.order_id) && this.pause_status == lendingRenderData.pause_status && this.skipped_payment_allocation_strategy == lendingRenderData.skipped_payment_allocation_strategy && Intrinsics.areEqual(this.skipped_payment_allocation_description, lendingRenderData.skipped_payment_allocation_description);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Type type2 = this.f1380type;
        int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
        Long l = this.borrow_date;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.final_due_date;
        int hashCode4 = (hashCode3 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Money money = this.principal_amount;
        int hashCode5 = (hashCode4 + (money != null ? money.hashCode() : 0)) * 37;
        Breakdown breakdown = this.breakdown;
        int hashCode6 = (hashCode5 + (breakdown != null ? breakdown.hashCode() : 0)) * 37;
        Boolean bool = this.is_skippable;
        int hashCode7 = (hashCode6 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.manual_pay;
        int hashCode8 = (hashCode7 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        String str = this.loan_token;
        int hashCode9 = (hashCode8 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.tila_document_token;
        int hashCode10 = (hashCode9 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Money money2 = this.original_amount;
        int hashCode11 = (hashCode10 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Long l3 = this.payable_until;
        int hashCode12 = (hashCode11 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Boolean bool3 = this.suppress_details;
        int hashCode13 = (hashCode12 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        Money money3 = this.outstanding_loan_balance_amount;
        int hashCode14 = (hashCode13 + (money3 != null ? money3.hashCode() : 0)) * 37;
        RelatedTransaction relatedTransaction = this.related_transaction;
        int hashCode15 = (hashCode14 + (relatedTransaction != null ? relatedTransaction.hashCode() : 0)) * 37;
        LendingProduct lendingProduct = this.lending_product;
        int hashCode16 = (hashCode15 + (lendingProduct != null ? lendingProduct.hashCode() : 0)) * 37;
        BnplData bnplData = this.bnpl_data;
        int hashCode17 = (hashCode16 + (bnplData != null ? bnplData.hashCode() : 0)) * 37;
        CfBnplData cfBnplData = this.cf_bnpl_data;
        int hashCode18 = (hashCode17 + (cfBnplData != null ? cfBnplData.hashCode() : 0)) * 37;
        SingleUsePaymentData singleUsePaymentData = this.sup_data;
        int hashCode19 = (hashCode18 + (singleUsePaymentData != null ? singleUsePaymentData.hashCode() : 0)) * 37;
        RetroFinancingData retroFinancingData = this.retro_financing_data;
        int hashCode20 = (hashCode19 + (retroFinancingData != null ? retroFinancingData.hashCode() : 0)) * 37;
        PrePurchaseFinancingData prePurchaseFinancingData = this.pre_purchase_financing_data;
        int hashCode21 = (hashCode20 + (prePurchaseFinancingData != null ? prePurchaseFinancingData.hashCode() : 0)) * 37;
        ContextCard contextCard = this.context_card;
        int hashCode22 = (hashCode21 + (contextCard != null ? contextCard.hashCode() : 0)) * 37;
        Money money4 = this.paid_so_far_amount;
        int hashCode23 = (hashCode22 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Money money5 = this.setup_fee_amount;
        int hashCode24 = (hashCode23 + (money5 != null ? money5.hashCode() : 0)) * 37;
        Money money6 = this.total_interest_amount;
        int hashCode25 = (hashCode24 + (money6 != null ? money6.hashCode() : 0)) * 37;
        Breakdown breakdown2 = this.loan_breakdown;
        int hashCode26 = (hashCode25 + (breakdown2 != null ? breakdown2.hashCode() : 0)) * 37;
        String str3 = this.loan_display_token;
        int hashCode27 = (hashCode26 + (str3 != null ? str3.hashCode() : 0)) * 37;
        RefundReason refundReason = this.refund_reason;
        int hashCode28 = (hashCode27 + (refundReason != null ? refundReason.hashCode() : 0)) * 37;
        Long l4 = this.down_payment_amount_cents;
        int hashCode29 = (hashCode28 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
        Initiator initiator = this.initiator;
        int hashCode30 = (hashCode29 + (initiator != null ? initiator.hashCode() : 0)) * 37;
        String str4 = this.withdrawal_disclosure_url;
        int hashCode31 = (hashCode30 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.bank_partner_full_name;
        int hashCode32 = (hashCode31 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.order_id;
        int hashCode33 = (hashCode32 + (str6 != null ? str6.hashCode() : 0)) * 37;
        PauseStatus pauseStatus = this.pause_status;
        int hashCode34 = (hashCode33 + (pauseStatus != null ? pauseStatus.hashCode() : 0)) * 37;
        SkippedPaymentAllocationStrategy skippedPaymentAllocationStrategy = this.skipped_payment_allocation_strategy;
        int hashCode35 = (hashCode34 + (skippedPaymentAllocationStrategy != null ? skippedPaymentAllocationStrategy.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.skipped_payment_allocation_description;
        int hashCode36 = hashCode35 + (localizedString != null ? localizedString.hashCode() : 0);
        this.hashCode = hashCode36;
        return hashCode36;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.f1381type = this.f1380type;
        builder.borrow_date = this.borrow_date;
        builder.final_due_date = this.final_due_date;
        builder.principal_amount = this.principal_amount;
        builder.breakdown = this.breakdown;
        builder.is_skippable = this.is_skippable;
        builder.manual_pay = this.manual_pay;
        builder.loan_token = this.loan_token;
        builder.tila_document_token = this.tila_document_token;
        builder.original_amount = this.original_amount;
        builder.payable_until = this.payable_until;
        builder.suppress_details = this.suppress_details;
        builder.outstanding_loan_balance_amount = this.outstanding_loan_balance_amount;
        builder.related_transaction = this.related_transaction;
        builder.lending_product = this.lending_product;
        builder.bnpl_data = this.bnpl_data;
        builder.cf_bnpl_data = this.cf_bnpl_data;
        builder.sup_data = this.sup_data;
        builder.retro_financing_data = this.retro_financing_data;
        builder.pre_purchase_financing_data = this.pre_purchase_financing_data;
        builder.context_card = this.context_card;
        builder.paid_so_far_amount = this.paid_so_far_amount;
        builder.setup_fee_amount = this.setup_fee_amount;
        builder.total_interest_amount = this.total_interest_amount;
        builder.loan_breakdown = this.loan_breakdown;
        builder.loan_display_token = this.loan_display_token;
        builder.refund_reason = this.refund_reason;
        builder.down_payment_amount_cents = this.down_payment_amount_cents;
        builder.initiator = this.initiator;
        builder.withdrawal_disclosure_url = this.withdrawal_disclosure_url;
        builder.bank_partner_full_name = this.bank_partner_full_name;
        builder.order_id = this.order_id;
        builder.pause_status = this.pause_status;
        builder.skipped_payment_allocation_strategy = this.skipped_payment_allocation_strategy;
        builder.skipped_payment_allocation_description = this.skipped_payment_allocation_description;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Type type2 = this.f1380type;
        if (type2 != null) {
            arrayList.add("type=" + type2);
        }
        Long l = this.borrow_date;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("borrow_date=", l, arrayList);
        }
        Long l2 = this.final_due_date;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("final_due_date=", l2, arrayList);
        }
        Money money = this.principal_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("principal_amount=", money, arrayList);
        }
        Breakdown breakdown = this.breakdown;
        if (breakdown != null) {
            arrayList.add("breakdown=" + breakdown);
        }
        Boolean bool = this.is_skippable;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_skippable=", bool, arrayList);
        }
        Boolean bool2 = this.manual_pay;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("manual_pay=", bool2, arrayList);
        }
        String str = this.loan_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "loan_token=", arrayList);
        }
        String str2 = this.tila_document_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "tila_document_token=", arrayList);
        }
        Money money2 = this.original_amount;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("original_amount=", money2, arrayList);
        }
        Long l3 = this.payable_until;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("payable_until=", l3, arrayList);
        }
        Boolean bool3 = this.suppress_details;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("suppress_details=", bool3, arrayList);
        }
        Money money3 = this.outstanding_loan_balance_amount;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("outstanding_loan_balance_amount=", money3, arrayList);
        }
        RelatedTransaction relatedTransaction = this.related_transaction;
        if (relatedTransaction != null) {
            arrayList.add("related_transaction=" + relatedTransaction);
        }
        LendingProduct lendingProduct = this.lending_product;
        if (lendingProduct != null) {
            arrayList.add("lending_product=" + lendingProduct);
        }
        BnplData bnplData = this.bnpl_data;
        if (bnplData != null) {
            arrayList.add("bnpl_data=" + bnplData);
        }
        CfBnplData cfBnplData = this.cf_bnpl_data;
        if (cfBnplData != null) {
            arrayList.add("cf_bnpl_data=" + cfBnplData);
        }
        SingleUsePaymentData singleUsePaymentData = this.sup_data;
        if (singleUsePaymentData != null) {
            arrayList.add("sup_data=" + singleUsePaymentData);
        }
        RetroFinancingData retroFinancingData = this.retro_financing_data;
        if (retroFinancingData != null) {
            arrayList.add("retro_financing_data=" + retroFinancingData);
        }
        PrePurchaseFinancingData prePurchaseFinancingData = this.pre_purchase_financing_data;
        if (prePurchaseFinancingData != null) {
            arrayList.add("pre_purchase_financing_data=" + prePurchaseFinancingData);
        }
        ContextCard contextCard = this.context_card;
        if (contextCard != null) {
            arrayList.add("context_card=" + contextCard);
        }
        Money money4 = this.paid_so_far_amount;
        if (money4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("paid_so_far_amount=", money4, arrayList);
        }
        Money money5 = this.setup_fee_amount;
        if (money5 != null) {
            Matcher$$ExternalSyntheticOutline0.m("setup_fee_amount=", money5, arrayList);
        }
        Money money6 = this.total_interest_amount;
        if (money6 != null) {
            Matcher$$ExternalSyntheticOutline0.m("total_interest_amount=", money6, arrayList);
        }
        Breakdown breakdown2 = this.loan_breakdown;
        if (breakdown2 != null) {
            arrayList.add("loan_breakdown=" + breakdown2);
        }
        String str3 = this.loan_display_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "loan_display_token=", arrayList);
        }
        RefundReason refundReason = this.refund_reason;
        if (refundReason != null) {
            arrayList.add("refund_reason=" + refundReason);
        }
        Long l4 = this.down_payment_amount_cents;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("down_payment_amount_cents=", l4, arrayList);
        }
        Initiator initiator = this.initiator;
        if (initiator != null) {
            arrayList.add("initiator=" + initiator);
        }
        String str4 = this.withdrawal_disclosure_url;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "withdrawal_disclosure_url=", arrayList);
        }
        String str5 = this.bank_partner_full_name;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "bank_partner_full_name=", arrayList);
        }
        String str6 = this.order_id;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "order_id=", arrayList);
        }
        PauseStatus pauseStatus = this.pause_status;
        if (pauseStatus != null) {
            arrayList.add("pause_status=" + pauseStatus);
        }
        SkippedPaymentAllocationStrategy skippedPaymentAllocationStrategy = this.skipped_payment_allocation_strategy;
        if (skippedPaymentAllocationStrategy != null) {
            arrayList.add("skipped_payment_allocation_strategy=" + skippedPaymentAllocationStrategy);
        }
        if (this.skipped_payment_allocation_description != null) {
            arrayList.add("skipped_payment_allocation_description=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LendingRenderData{", "}", 0, null, null, 56);
    }
}
