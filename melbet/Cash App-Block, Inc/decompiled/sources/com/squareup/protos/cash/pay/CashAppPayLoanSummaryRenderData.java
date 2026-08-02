package com.squareup.protos.cash.pay;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.customersearch.api.Metadata;
import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.protos.cash.taply.app.v1.Allowed;
import com.squareup.protos.common.Money;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashAppPayLoanSummaryRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashAppPayLoanSummaryRenderData> CREATOR;
    public final AutoPayState auto_pay_state;
    public final String change_schedule_flow_url;
    public final Long created_at;
    public final String display_id;
    public final Money down_payment_money;
    public final List fees;
    public final String initiate_payment_flow_url;
    public final LendingProduct lending_product;
    public final List loan_adjustments;
    public final String loan_id;
    public final LoanState loan_state;
    public final Long original_transaction_occurred_at;
    public final String payment_plan_flow_url;
    public final Integer purchase_apr_bps;
    public final Money remaining_balance_money;
    public final String tila_document_id;
    public final String toggle_auto_pay_flow_url;
    public final String toggle_auto_pay_from_enriched_receipt_flow_url;
    public final Money total_borrowed_money;
    public final Long total_number_of_installments;
    public final Long total_repayment_money;
    public final String view_documents_flow_url;

    public final class Adjustment extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Adjustment> CREATOR;
        public final Money adjustment_money;
        public final Reason reason;

        /* renamed from: type, reason: collision with root package name */
        public final Type f1322type;

        public enum Reason implements WireEnum {
            OTHER(0),
            SUP_BUFFER_RELEASE(1);

            public static final CashAppPayLoanSummaryRenderData$Adjustment$Reason$Companion$ADAPTER$1 ADAPTER;
            public static final FeeType.Companion Companion;
            public final int value;

            static {
                Reason reason = OTHER;
                Companion = new FeeType.Companion();
                ADAPTER = new CashAppPayLoanSummaryRenderData$Adjustment$Reason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Reason.class), Syntax.PROTO_2, reason);
            }

            Reason(int i) {
                this.value = i;
            }

            public static final Reason fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return OTHER;
                }
                if (i != 1) {
                    return null;
                }
                return SUP_BUFFER_RELEASE;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        public enum Type implements WireEnum {
            DEBIT(1),
            CREDIT(2);

            public final int value;
            public static final ContactAliasType.Companion Companion = new ContactAliasType.Companion();
            public static final CashAppPayLoanSummaryRenderData$Adjustment$Type$Companion$ADAPTER$1 ADAPTER = new CashAppPayLoanSummaryRenderData$Adjustment$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, null);

            Type(int i) {
                this.value = i;
            }

            public static final Type fromValue(int i) {
                Companion.getClass();
                if (i == 1) {
                    return DEBIT;
                }
                if (i != 2) {
                    return null;
                }
                return CREDIT;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            CashAppPayLoanSummaryRenderData$Adjustment$Companion$ADAPTER$1 cashAppPayLoanSummaryRenderData$Adjustment$Companion$ADAPTER$1 = new CashAppPayLoanSummaryRenderData$Adjustment$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Adjustment.class), "type.googleapis.com/squareup.cash.pay.CashAppPayLoanSummaryRenderData.Adjustment", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_loan_summary.proto");
            ADAPTER = cashAppPayLoanSummaryRenderData$Adjustment$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayLoanSummaryRenderData$Adjustment$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Adjustment(Money money, Type type2, Reason reason, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.adjustment_money = money;
            this.f1322type = type2;
            this.reason = reason;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Adjustment)) {
                return false;
            }
            Adjustment adjustment = (Adjustment) obj;
            return Intrinsics.areEqual(unknownFields(), adjustment.unknownFields()) && Intrinsics.areEqual(this.adjustment_money, adjustment.adjustment_money) && this.f1322type == adjustment.f1322type && this.reason == adjustment.reason;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Money money = this.adjustment_money;
            int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
            Type type2 = this.f1322type;
            int hashCode3 = (hashCode2 + (type2 != null ? type2.hashCode() : 0)) * 37;
            Reason reason = this.reason;
            int hashCode4 = hashCode3 + (reason != null ? reason.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BLEPayload.Builder builder = new BLEPayload.Builder(20, false);
            builder.advertisement_data = this.adjustment_money;
            builder.transmission_level = this.f1322type;
            builder.frequency = this.reason;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Money money = this.adjustment_money;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("adjustment_money=", money, arrayList);
            }
            Type type2 = this.f1322type;
            if (type2 != null) {
                arrayList.add("type=" + type2);
            }
            Reason reason = this.reason;
            if (reason != null) {
                arrayList.add("reason=" + reason);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Adjustment{", "}", 0, null, null, 56);
        }
    }

    public enum AutoPayState implements WireEnum {
        AUTO_PAY_UNKNOWN(0),
        AUTO_PAY_ENABLED(1),
        AUTO_PAY_DISABLED(2);

        public static final CashAppPayLoanSummaryRenderData$AutoPayState$Companion$ADAPTER$1 ADAPTER;
        public static final RetailerType.Companion Companion;
        public final int value;

        static {
            AutoPayState autoPayState = AUTO_PAY_UNKNOWN;
            Companion = new RetailerType.Companion();
            ADAPTER = new CashAppPayLoanSummaryRenderData$AutoPayState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AutoPayState.class), Syntax.PROTO_2, autoPayState);
        }

        AutoPayState(int i) {
            this.value = i;
        }

        public static final AutoPayState fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return AUTO_PAY_UNKNOWN;
            }
            if (i == 1) {
                return AUTO_PAY_ENABLED;
            }
            if (i != 2) {
                return null;
            }
            return AUTO_PAY_DISABLED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class Fee extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Fee> CREATOR;
        public final Money fee_money;
        public final FeeType fee_type;
        public final Long incurred_at;
        public final Long installment_incurred_on;

        public enum FeeType implements WireEnum {
            UNKNOWN_FEE_TYPE(0),
            SERVICE_FEE_TYPE(1),
            LATE_FEE_TYPE(2),
            FINANCE_FEE_TYPE(3);

            public static final CashAppPayLoanSummaryRenderData$Fee$FeeType$Companion$ADAPTER$1 ADAPTER;
            public static final Origin.Companion Companion;
            public final int value;

            static {
                FeeType feeType = UNKNOWN_FEE_TYPE;
                Companion = new Origin.Companion();
                ADAPTER = new CashAppPayLoanSummaryRenderData$Fee$FeeType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(FeeType.class), Syntax.PROTO_2, feeType);
            }

            FeeType(int i) {
                this.value = i;
            }

            public static final FeeType fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return UNKNOWN_FEE_TYPE;
                }
                if (i == 1) {
                    return SERVICE_FEE_TYPE;
                }
                if (i == 2) {
                    return LATE_FEE_TYPE;
                }
                if (i != 3) {
                    return null;
                }
                return FINANCE_FEE_TYPE;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            CashAppPayLoanSummaryRenderData$Fee$Companion$ADAPTER$1 cashAppPayLoanSummaryRenderData$Fee$Companion$ADAPTER$1 = new CashAppPayLoanSummaryRenderData$Fee$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Fee.class), "type.googleapis.com/squareup.cash.pay.CashAppPayLoanSummaryRenderData.Fee", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_loan_summary.proto");
            ADAPTER = cashAppPayLoanSummaryRenderData$Fee$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayLoanSummaryRenderData$Fee$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fee(Money money, Long l, Long l2, FeeType feeType, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.fee_money = money;
            this.incurred_at = l;
            this.installment_incurred_on = l2;
            this.fee_type = feeType;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Fee)) {
                return false;
            }
            Fee fee = (Fee) obj;
            return Intrinsics.areEqual(unknownFields(), fee.unknownFields()) && Intrinsics.areEqual(this.fee_money, fee.fee_money) && Intrinsics.areEqual(this.incurred_at, fee.incurred_at) && Intrinsics.areEqual(this.installment_incurred_on, fee.installment_incurred_on) && this.fee_type == fee.fee_type;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Money money = this.fee_money;
            int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
            Long l = this.incurred_at;
            int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            Long l2 = this.installment_incurred_on;
            int hashCode4 = (hashCode3 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
            FeeType feeType = this.fee_type;
            int hashCode5 = hashCode4 + (feeType != null ? feeType.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Allowed.Builder builder = new Allowed.Builder(1);
            builder.card_encryption_data = this.fee_money;
            builder.customer_token_hash_email = this.incurred_at;
            builder.device_metadata = this.installment_incurred_on;
            builder.success_screen = this.fee_type;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Money money = this.fee_money;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("fee_money=", money, arrayList);
            }
            Long l = this.incurred_at;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("incurred_at=", l, arrayList);
            }
            Long l2 = this.installment_incurred_on;
            if (l2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("installment_incurred_on=", l2, arrayList);
            }
            FeeType feeType = this.fee_type;
            if (feeType != null) {
                arrayList.add("fee_type=" + feeType);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Fee{", "}", 0, null, null, 56);
        }
    }

    public enum LendingProduct implements WireEnum {
        LENDING_PRODUCT_UNKNOWN(0),
        LENDING_PRODUCT_AFTERPAY(1),
        LENDING_PRODUCT_SINGLE_USE_PAYMENT(2),
        LENDING_PRODUCT_CF_BNPL(3);

        public static final CashAppPayLoanSummaryRenderData$LendingProduct$Companion$ADAPTER$1 ADAPTER;
        public static final SliceStatus.Companion Companion;
        public final int value;

        static {
            LendingProduct lendingProduct = LENDING_PRODUCT_UNKNOWN;
            Companion = new SliceStatus.Companion();
            ADAPTER = new CashAppPayLoanSummaryRenderData$LendingProduct$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(LendingProduct.class), Syntax.PROTO_2, lendingProduct);
        }

        LendingProduct(int i) {
            this.value = i;
        }

        public static final LendingProduct fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return LENDING_PRODUCT_UNKNOWN;
            }
            if (i == 1) {
                return LENDING_PRODUCT_AFTERPAY;
            }
            if (i == 2) {
                return LENDING_PRODUCT_SINGLE_USE_PAYMENT;
            }
            if (i != 3) {
                return null;
            }
            return LENDING_PRODUCT_CF_BNPL;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum LoanState implements WireEnum {
        LOAN_STATE_UNKNOWN(0),
        LOAN_STATE_OFFERED(1),
        LOAN_STATE_ISSUED(2),
        LOAN_STATE_PAID_OFF(3),
        LOAN_STATE_SELECTED(4),
        LOAN_STATE_DECLINED(5),
        LOAN_STATE_FAILED(6);

        public static final CashAppPayLoanSummaryRenderData$LoanState$Companion$ADAPTER$1 ADAPTER;
        public static final FeeType.Companion Companion;
        public final int value;

        static {
            LoanState loanState = LOAN_STATE_UNKNOWN;
            Companion = new FeeType.Companion();
            ADAPTER = new CashAppPayLoanSummaryRenderData$LoanState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(LoanState.class), Syntax.PROTO_2, loanState);
        }

        LoanState(int i) {
            this.value = i;
        }

        public static final LoanState fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 0:
                    return LOAN_STATE_UNKNOWN;
                case 1:
                    return LOAN_STATE_OFFERED;
                case 2:
                    return LOAN_STATE_ISSUED;
                case 3:
                    return LOAN_STATE_PAID_OFF;
                case 4:
                    return LOAN_STATE_SELECTED;
                case 5:
                    return LOAN_STATE_DECLINED;
                case 6:
                    return LOAN_STATE_FAILED;
                default:
                    return null;
            }
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CashAppPayLoanSummaryRenderData$Companion$ADAPTER$1 cashAppPayLoanSummaryRenderData$Companion$ADAPTER$1 = new CashAppPayLoanSummaryRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashAppPayLoanSummaryRenderData.class), "type.googleapis.com/squareup.cash.pay.CashAppPayLoanSummaryRenderData", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_loan_summary.proto");
        ADAPTER = cashAppPayLoanSummaryRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayLoanSummaryRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppPayLoanSummaryRenderData(String str, Money money, Money money2, Money money3, Long l, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l2, Long l3, List list, List list2, AutoPayState autoPayState, LendingProduct lendingProduct, LoanState loanState, String str9, Integer num, Long l4, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.loan_id = str;
        this.total_borrowed_money = money;
        this.down_payment_money = money2;
        this.remaining_balance_money = money3;
        this.total_number_of_installments = l;
        this.tila_document_id = str2;
        this.view_documents_flow_url = str3;
        this.payment_plan_flow_url = str4;
        this.initiate_payment_flow_url = str5;
        this.toggle_auto_pay_flow_url = str6;
        this.toggle_auto_pay_from_enriched_receipt_flow_url = str7;
        this.change_schedule_flow_url = str8;
        this.total_repayment_money = l2;
        this.created_at = l3;
        this.auto_pay_state = autoPayState;
        this.lending_product = lendingProduct;
        this.loan_state = loanState;
        this.display_id = str9;
        this.purchase_apr_bps = num;
        this.original_transaction_occurred_at = l4;
        this.fees = TransactorKt.immutableCopyOf("fees", list);
        this.loan_adjustments = TransactorKt.immutableCopyOf("loan_adjustments", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashAppPayLoanSummaryRenderData)) {
            return false;
        }
        CashAppPayLoanSummaryRenderData cashAppPayLoanSummaryRenderData = (CashAppPayLoanSummaryRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), cashAppPayLoanSummaryRenderData.unknownFields()) && Intrinsics.areEqual(this.loan_id, cashAppPayLoanSummaryRenderData.loan_id) && Intrinsics.areEqual(this.total_borrowed_money, cashAppPayLoanSummaryRenderData.total_borrowed_money) && Intrinsics.areEqual(this.down_payment_money, cashAppPayLoanSummaryRenderData.down_payment_money) && Intrinsics.areEqual(this.remaining_balance_money, cashAppPayLoanSummaryRenderData.remaining_balance_money) && Intrinsics.areEqual(this.total_number_of_installments, cashAppPayLoanSummaryRenderData.total_number_of_installments) && Intrinsics.areEqual(this.tila_document_id, cashAppPayLoanSummaryRenderData.tila_document_id) && Intrinsics.areEqual(this.view_documents_flow_url, cashAppPayLoanSummaryRenderData.view_documents_flow_url) && Intrinsics.areEqual(this.payment_plan_flow_url, cashAppPayLoanSummaryRenderData.payment_plan_flow_url) && Intrinsics.areEqual(this.initiate_payment_flow_url, cashAppPayLoanSummaryRenderData.initiate_payment_flow_url) && Intrinsics.areEqual(this.toggle_auto_pay_flow_url, cashAppPayLoanSummaryRenderData.toggle_auto_pay_flow_url) && Intrinsics.areEqual(this.toggle_auto_pay_from_enriched_receipt_flow_url, cashAppPayLoanSummaryRenderData.toggle_auto_pay_from_enriched_receipt_flow_url) && Intrinsics.areEqual(this.change_schedule_flow_url, cashAppPayLoanSummaryRenderData.change_schedule_flow_url) && Intrinsics.areEqual(this.total_repayment_money, cashAppPayLoanSummaryRenderData.total_repayment_money) && Intrinsics.areEqual(this.created_at, cashAppPayLoanSummaryRenderData.created_at) && Intrinsics.areEqual(this.fees, cashAppPayLoanSummaryRenderData.fees) && Intrinsics.areEqual(this.loan_adjustments, cashAppPayLoanSummaryRenderData.loan_adjustments) && this.auto_pay_state == cashAppPayLoanSummaryRenderData.auto_pay_state && this.lending_product == cashAppPayLoanSummaryRenderData.lending_product && this.loan_state == cashAppPayLoanSummaryRenderData.loan_state && Intrinsics.areEqual(this.display_id, cashAppPayLoanSummaryRenderData.display_id) && Intrinsics.areEqual(this.purchase_apr_bps, cashAppPayLoanSummaryRenderData.purchase_apr_bps) && Intrinsics.areEqual(this.original_transaction_occurred_at, cashAppPayLoanSummaryRenderData.original_transaction_occurred_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.loan_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.total_borrowed_money;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.down_payment_money;
        int hashCode4 = (hashCode3 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.remaining_balance_money;
        int hashCode5 = (hashCode4 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Long l = this.total_number_of_installments;
        int hashCode6 = (hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str2 = this.tila_document_id;
        int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.view_documents_flow_url;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.payment_plan_flow_url;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.initiate_payment_flow_url;
        int hashCode10 = (hashCode9 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.toggle_auto_pay_flow_url;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.toggle_auto_pay_from_enriched_receipt_flow_url;
        int hashCode12 = (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.change_schedule_flow_url;
        int hashCode13 = (hashCode12 + (str8 != null ? str8.hashCode() : 0)) * 37;
        Long l2 = this.total_repayment_money;
        int hashCode14 = (hashCode13 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.created_at;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode14 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37, 37, this.fees), 37, this.loan_adjustments);
        AutoPayState autoPayState = this.auto_pay_state;
        int hashCode15 = (m + (autoPayState != null ? autoPayState.hashCode() : 0)) * 37;
        LendingProduct lendingProduct = this.lending_product;
        int hashCode16 = (hashCode15 + (lendingProduct != null ? lendingProduct.hashCode() : 0)) * 37;
        LoanState loanState = this.loan_state;
        int hashCode17 = (hashCode16 + (loanState != null ? loanState.hashCode() : 0)) * 37;
        String str9 = this.display_id;
        int hashCode18 = (hashCode17 + (str9 != null ? str9.hashCode() : 0)) * 37;
        Integer num = this.purchase_apr_bps;
        int hashCode19 = (hashCode18 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Long l4 = this.original_transaction_occurred_at;
        int hashCode20 = hashCode19 + (l4 != null ? Long.hashCode(l4.longValue()) : 0);
        this.hashCode = hashCode20;
        return hashCode20;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Metadata.Builder builder = new Metadata.Builder(2, false);
        builder.model_version = this.loan_id;
        builder.app_feature_client_route = this.total_borrowed_money;
        builder.offer_id = this.down_payment_money;
        builder.stock_ticker = this.remaining_balance_money;
        builder.is_cash_customer = this.total_number_of_installments;
        builder.search_text = this.tila_document_id;
        builder.query_token = this.view_documents_flow_url;
        builder.entity_token = this.payment_plan_flow_url;
        builder.entity_attributes = this.initiate_payment_flow_url;
        builder.entity_name = this.toggle_auto_pay_flow_url;
        builder.business_token = this.toggle_auto_pay_from_enriched_receipt_flow_url;
        builder.business_name = this.change_schedule_flow_url;
        builder.is_linked_account = this.total_repayment_money;
        builder.is_c4b_account = this.created_at;
        builder.match_fields = this.fees;
        builder.merchant_tags = this.loan_adjustments;
        builder.is_multiple_account_holder = this.auto_pay_state;
        builder.is_first_linked_account = this.lending_product;
        builder.entity_type = this.loan_state;
        builder.app_feature_name = this.display_id;
        builder.match_length = this.purchase_apr_bps;
        builder.offer_type = this.original_transaction_occurred_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.loan_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "loan_id=", arrayList);
        }
        Money money = this.total_borrowed_money;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("total_borrowed_money=", money, arrayList);
        }
        Money money2 = this.down_payment_money;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("down_payment_money=", money2, arrayList);
        }
        Money money3 = this.remaining_balance_money;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("remaining_balance_money=", money3, arrayList);
        }
        Long l = this.total_number_of_installments;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("total_number_of_installments=", l, arrayList);
        }
        String str2 = this.tila_document_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "tila_document_id=", arrayList);
        }
        String str3 = this.view_documents_flow_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "view_documents_flow_url=", arrayList);
        }
        String str4 = this.payment_plan_flow_url;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "payment_plan_flow_url=", arrayList);
        }
        String str5 = this.initiate_payment_flow_url;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "initiate_payment_flow_url=", arrayList);
        }
        String str6 = this.toggle_auto_pay_flow_url;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "toggle_auto_pay_flow_url=", arrayList);
        }
        String str7 = this.toggle_auto_pay_from_enriched_receipt_flow_url;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "toggle_auto_pay_from_enriched_receipt_flow_url=", arrayList);
        }
        String str8 = this.change_schedule_flow_url;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "change_schedule_flow_url=", arrayList);
        }
        Long l2 = this.total_repayment_money;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("total_repayment_money=", l2, arrayList);
        }
        Long l3 = this.created_at;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l3, arrayList);
        }
        List list = this.fees;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("fees=", arrayList, list);
        }
        List list2 = this.loan_adjustments;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("loan_adjustments=", arrayList, list2);
        }
        AutoPayState autoPayState = this.auto_pay_state;
        if (autoPayState != null) {
            arrayList.add("auto_pay_state=" + autoPayState);
        }
        LendingProduct lendingProduct = this.lending_product;
        if (lendingProduct != null) {
            arrayList.add("lending_product=" + lendingProduct);
        }
        LoanState loanState = this.loan_state;
        if (loanState != null) {
            arrayList.add("loan_state=" + loanState);
        }
        String str9 = this.display_id;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "display_id=", arrayList);
        }
        Integer num = this.purchase_apr_bps;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("purchase_apr_bps=", num, arrayList);
        }
        Long l4 = this.original_transaction_occurred_at;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("original_transaction_occurred_at=", l4, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashAppPayLoanSummaryRenderData{", "}", 0, null, null, 56);
    }
}
