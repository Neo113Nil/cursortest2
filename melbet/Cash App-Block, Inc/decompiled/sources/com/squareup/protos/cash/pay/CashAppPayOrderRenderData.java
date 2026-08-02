package com.squareup.protos.cash.pay;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
import com.squareup.protos.cash.groups.ExpenseSlice;
import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.cash.janus.api.ContactAliasType;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
import com.squareup.protos.cash.marketdata.model.InvestmentFinancials;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.protos.cash.postcard.CardModule;
import com.squareup.protos.cash.taply.app.v1.Allowed;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.giftly.GiftCard;
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
public final class CashAppPayOrderRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashAppPayOrderRenderData> CREATOR;
    public final String client_id;
    public final Long created_at;
    public final String customer_delivery_instructions;
    public final GlobalAddress customer_shipping_address;
    public final List disputes;
    public final List external_incentives;
    public final List incentives;
    public final List line_items;
    public final List loan_summaries;
    public final CashAppPayMerchantRenderData merchant;
    public final Money order_adjusted_total_money;
    public final OrderAggregations order_aggregations;
    public final Money order_discount_money;
    public final String order_id;
    public final Money order_net_money;
    public final Money order_total_money;
    public final List payment_schedules;
    public final List payments;
    public final Product product;
    public final List refunds;
    public final RetroEligibility retro_eligibility;
    public final List service_charges;
    public final List shipping_charges;
    public final List taxes;
    public final String view_enriched_receipt_url;

    public final class OrderAggregations extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<OrderAggregations> CREATOR;
        public final String active_loan_id;
        public final String completed_loan_id;
        public final MoneyAggregations money_aggregations;
        public final String next_upcoming_payment_schedule_id;
        public final String oldest_overdue_payment_schedule_id;

        public final class MoneyAggregations extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<MoneyAggregations> CREATOR;
            public final Money total_customer_owed_and_paid_money;
            public final Money total_discount_applied_money;
            public final Money total_discount_returned_money;
            public final Money total_dispute_returned_money;
            public final Money total_loan_fee_money;
            public final Money total_loan_late_fee_money;
            public final Money total_loan_overdue_money;
            public final Money total_loan_owed_money;
            public final Money total_loan_paid_money;
            public final Money total_order_refunded_money;

            static {
                CashAppPayOrderRenderData$OrderAggregations$MoneyAggregations$Companion$ADAPTER$1 cashAppPayOrderRenderData$OrderAggregations$MoneyAggregations$Companion$ADAPTER$1 = new CashAppPayOrderRenderData$OrderAggregations$MoneyAggregations$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MoneyAggregations.class), "type.googleapis.com/squareup.cash.pay.CashAppPayOrderRenderData.OrderAggregations.MoneyAggregations", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_order.proto");
                ADAPTER = cashAppPayOrderRenderData$OrderAggregations$MoneyAggregations$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayOrderRenderData$OrderAggregations$MoneyAggregations$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MoneyAggregations(Money money, Money money2, Money money3, Money money4, Money money5, Money money6, Money money7, Money money8, Money money9, Money money10, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.total_loan_overdue_money = money;
                this.total_loan_owed_money = money2;
                this.total_loan_paid_money = money3;
                this.total_loan_fee_money = money4;
                this.total_loan_late_fee_money = money5;
                this.total_order_refunded_money = money6;
                this.total_customer_owed_and_paid_money = money7;
                this.total_discount_applied_money = money8;
                this.total_discount_returned_money = money9;
                this.total_dispute_returned_money = money10;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof MoneyAggregations)) {
                    return false;
                }
                MoneyAggregations moneyAggregations = (MoneyAggregations) obj;
                return Intrinsics.areEqual(unknownFields(), moneyAggregations.unknownFields()) && Intrinsics.areEqual(this.total_loan_overdue_money, moneyAggregations.total_loan_overdue_money) && Intrinsics.areEqual(this.total_loan_owed_money, moneyAggregations.total_loan_owed_money) && Intrinsics.areEqual(this.total_loan_paid_money, moneyAggregations.total_loan_paid_money) && Intrinsics.areEqual(this.total_loan_fee_money, moneyAggregations.total_loan_fee_money) && Intrinsics.areEqual(this.total_loan_late_fee_money, moneyAggregations.total_loan_late_fee_money) && Intrinsics.areEqual(this.total_order_refunded_money, moneyAggregations.total_order_refunded_money) && Intrinsics.areEqual(this.total_customer_owed_and_paid_money, moneyAggregations.total_customer_owed_and_paid_money) && Intrinsics.areEqual(this.total_discount_applied_money, moneyAggregations.total_discount_applied_money) && Intrinsics.areEqual(this.total_discount_returned_money, moneyAggregations.total_discount_returned_money) && Intrinsics.areEqual(this.total_dispute_returned_money, moneyAggregations.total_dispute_returned_money);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Money money = this.total_loan_overdue_money;
                int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
                Money money2 = this.total_loan_owed_money;
                int hashCode3 = (hashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
                Money money3 = this.total_loan_paid_money;
                int hashCode4 = (hashCode3 + (money3 != null ? money3.hashCode() : 0)) * 37;
                Money money4 = this.total_loan_fee_money;
                int hashCode5 = (hashCode4 + (money4 != null ? money4.hashCode() : 0)) * 37;
                Money money5 = this.total_loan_late_fee_money;
                int hashCode6 = (hashCode5 + (money5 != null ? money5.hashCode() : 0)) * 37;
                Money money6 = this.total_order_refunded_money;
                int hashCode7 = (hashCode6 + (money6 != null ? money6.hashCode() : 0)) * 37;
                Money money7 = this.total_customer_owed_and_paid_money;
                int hashCode8 = (hashCode7 + (money7 != null ? money7.hashCode() : 0)) * 37;
                Money money8 = this.total_discount_applied_money;
                int hashCode9 = (hashCode8 + (money8 != null ? money8.hashCode() : 0)) * 37;
                Money money9 = this.total_discount_returned_money;
                int hashCode10 = (hashCode9 + (money9 != null ? money9.hashCode() : 0)) * 37;
                Money money10 = this.total_dispute_returned_money;
                int hashCode11 = hashCode10 + (money10 != null ? money10.hashCode() : 0);
                this.hashCode = hashCode11;
                return hashCode11;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                CashInRequest.Builder builder = new CashInRequest.Builder(12);
                builder.amount = this.total_loan_overdue_money;
                builder.request_context = this.total_loan_owed_money;
                builder.external_id = this.total_loan_paid_money;
                builder.passcode_token = this.total_loan_fee_money;
                builder.external_client_transfer_token = this.total_loan_late_fee_money;
                builder.source = this.total_order_refunded_money;
                builder.target = this.total_customer_owed_and_paid_money;
                builder.call_context = this.total_discount_applied_money;
                builder.forwarded_call_context = this.total_discount_returned_money;
                builder.client_verified_digital_wallet = this.total_dispute_returned_money;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Money money = this.total_loan_overdue_money;
                if (money != null) {
                    Matcher$$ExternalSyntheticOutline0.m("total_loan_overdue_money=", money, arrayList);
                }
                Money money2 = this.total_loan_owed_money;
                if (money2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("total_loan_owed_money=", money2, arrayList);
                }
                Money money3 = this.total_loan_paid_money;
                if (money3 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("total_loan_paid_money=", money3, arrayList);
                }
                Money money4 = this.total_loan_fee_money;
                if (money4 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("total_loan_fee_money=", money4, arrayList);
                }
                Money money5 = this.total_loan_late_fee_money;
                if (money5 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("total_loan_late_fee_money=", money5, arrayList);
                }
                Money money6 = this.total_order_refunded_money;
                if (money6 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("total_order_refunded_money=", money6, arrayList);
                }
                Money money7 = this.total_customer_owed_and_paid_money;
                if (money7 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("total_customer_owed_and_paid_money=", money7, arrayList);
                }
                Money money8 = this.total_discount_applied_money;
                if (money8 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("total_discount_applied_money=", money8, arrayList);
                }
                Money money9 = this.total_discount_returned_money;
                if (money9 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("total_discount_returned_money=", money9, arrayList);
                }
                Money money10 = this.total_dispute_returned_money;
                if (money10 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("total_dispute_returned_money=", money10, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "MoneyAggregations{", "}", 0, null, null, 56);
            }
        }

        static {
            CashAppPayOrderRenderData$OrderAggregations$Companion$ADAPTER$1 cashAppPayOrderRenderData$OrderAggregations$Companion$ADAPTER$1 = new CashAppPayOrderRenderData$OrderAggregations$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OrderAggregations.class), "type.googleapis.com/squareup.cash.pay.CashAppPayOrderRenderData.OrderAggregations", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_order.proto");
            ADAPTER = cashAppPayOrderRenderData$OrderAggregations$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayOrderRenderData$OrderAggregations$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OrderAggregations(MoneyAggregations moneyAggregations, String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.money_aggregations = moneyAggregations;
            this.next_upcoming_payment_schedule_id = str;
            this.oldest_overdue_payment_schedule_id = str2;
            this.active_loan_id = str3;
            this.completed_loan_id = str4;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OrderAggregations)) {
                return false;
            }
            OrderAggregations orderAggregations = (OrderAggregations) obj;
            return Intrinsics.areEqual(unknownFields(), orderAggregations.unknownFields()) && Intrinsics.areEqual(this.money_aggregations, orderAggregations.money_aggregations) && Intrinsics.areEqual(this.next_upcoming_payment_schedule_id, orderAggregations.next_upcoming_payment_schedule_id) && Intrinsics.areEqual(this.oldest_overdue_payment_schedule_id, orderAggregations.oldest_overdue_payment_schedule_id) && Intrinsics.areEqual(this.active_loan_id, orderAggregations.active_loan_id) && Intrinsics.areEqual(this.completed_loan_id, orderAggregations.completed_loan_id);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            MoneyAggregations moneyAggregations = this.money_aggregations;
            int hashCode2 = (hashCode + (moneyAggregations != null ? moneyAggregations.hashCode() : 0)) * 37;
            String str = this.next_upcoming_payment_schedule_id;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.oldest_overdue_payment_schedule_id;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.active_loan_id;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.completed_loan_id;
            int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BrandBanner.Builder builder = new BrandBanner.Builder(28);
            builder.icon = this.money_aggregations;
            builder.title = this.next_upcoming_payment_schedule_id;
            builder.subtitle = this.oldest_overdue_payment_schedule_id;
            builder.action = this.active_loan_id;
            builder.icon_background_color = this.completed_loan_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            MoneyAggregations moneyAggregations = this.money_aggregations;
            if (moneyAggregations != null) {
                arrayList.add("money_aggregations=" + moneyAggregations);
            }
            String str = this.next_upcoming_payment_schedule_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "next_upcoming_payment_schedule_id=", arrayList);
            }
            String str2 = this.oldest_overdue_payment_schedule_id;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "oldest_overdue_payment_schedule_id=", arrayList);
            }
            String str3 = this.active_loan_id;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "active_loan_id=", arrayList);
            }
            String str4 = this.completed_loan_id;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "completed_loan_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "OrderAggregations{", "}", 0, null, null, 56);
        }
    }

    public enum Product implements WireEnum {
        PRODUCT_UNKNOWN(0),
        PRODUCT_RETROACTIVE_FINANCING(1),
        PRODUCT_CASH_APP_PAY(2),
        PRODUCT_AFTERPAY(3),
        PRODUCT_CASH_APP_CARD(4),
        PRODUCT_CASH_CARD_RETROACTIVE_FINANCING(5),
        PRODUCT_P2P_RETROACTIVE_FINANCING(9),
        PRODUCT_CASH_APP_PAY_RETROACTIVE_FINANCING(15),
        PRODUCT_PRE_PURCHASE_FINANCING(10),
        PRODUCT_AFTERPAY_PAY_IN_FOUR(6),
        PRODUCT_AFTERPAY_PAY_NOW(7),
        PRODUCT_AFTERPAY_PAY_MONTHLY(8),
        PRODUCT_CF_BNPL(12),
        PRODUCT_SINGLE_USE_PAYMENT(13),
        PRODUCT_PAYOUT(14),
        PRODUCT_OTHER(11);

        public static final CashAppPayOrderRenderData$Product$Companion$ADAPTER$1 ADAPTER;
        public static final ContactAliasType.Companion Companion;
        public final int value;

        static {
            Product product = PRODUCT_UNKNOWN;
            Companion = new ContactAliasType.Companion();
            ADAPTER = new CashAppPayOrderRenderData$Product$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Product.class), Syntax.PROTO_2, product);
        }

        Product(int i) {
            this.value = i;
        }

        public static final Product fromValue(int i) {
            Companion.getClass();
            return ContactAliasType.Companion.m3897fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class RetroEligibility extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RetroEligibility> CREATOR;
        public final ConvertedData converted_data;
        public final EligibleData eligible_data;
        public final Long expire_at;
        public final UiState ui_state;

        public final class ConvertedData extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ConvertedData> CREATOR;
            public final Money downpayment_amount;
            public final Money drawdown_amount;
            public final String loan_token;
            public final String view_payment_plan_url;

            static {
                CashAppPayOrderRenderData$RetroEligibility$ConvertedData$Companion$ADAPTER$1 cashAppPayOrderRenderData$RetroEligibility$ConvertedData$Companion$ADAPTER$1 = new CashAppPayOrderRenderData$RetroEligibility$ConvertedData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ConvertedData.class), "type.googleapis.com/squareup.cash.pay.CashAppPayOrderRenderData.RetroEligibility.ConvertedData", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_order.proto");
                ADAPTER = cashAppPayOrderRenderData$RetroEligibility$ConvertedData$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayOrderRenderData$RetroEligibility$ConvertedData$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConvertedData(String str, String str2, Money money, Money money2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.view_payment_plan_url = str;
                this.loan_token = str2;
                this.downpayment_amount = money;
                this.drawdown_amount = money2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ConvertedData)) {
                    return false;
                }
                ConvertedData convertedData = (ConvertedData) obj;
                return Intrinsics.areEqual(unknownFields(), convertedData.unknownFields()) && Intrinsics.areEqual(this.view_payment_plan_url, convertedData.view_payment_plan_url) && Intrinsics.areEqual(this.loan_token, convertedData.loan_token) && Intrinsics.areEqual(this.downpayment_amount, convertedData.downpayment_amount) && Intrinsics.areEqual(this.drawdown_amount, convertedData.drawdown_amount);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.view_payment_plan_url;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.loan_token;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                Money money = this.downpayment_amount;
                int hashCode4 = (hashCode3 + (money != null ? money.hashCode() : 0)) * 37;
                Money money2 = this.drawdown_amount;
                int hashCode5 = hashCode4 + (money2 != null ? money2.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                InvestmentFinancials.Revenue.Builder builder = new InvestmentFinancials.Revenue.Builder(1);
                builder.quarter = this.view_payment_plan_url;
                builder.year = this.loan_token;
                builder.revenue = this.downpayment_amount;
                builder.profit = this.drawdown_amount;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.view_payment_plan_url;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "view_payment_plan_url=", arrayList);
                }
                String str2 = this.loan_token;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "loan_token=", arrayList);
                }
                Money money = this.downpayment_amount;
                if (money != null) {
                    Matcher$$ExternalSyntheticOutline0.m("downpayment_amount=", money, arrayList);
                }
                Money money2 = this.drawdown_amount;
                if (money2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("drawdown_amount=", money2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ConvertedData{", "}", 0, null, null, 56);
            }
        }

        public final class EligibleData extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<EligibleData> CREATOR;
            public final String convert_to_payment_plan_url;
            public final Money eligible_amount;
            public final Money eligible_loan_money;
            public final Boolean has_downpayment;
            public final Boolean is_partial_retro;
            public final LoanDuration loan_duration;

            public final class LoanDuration extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<LoanDuration> CREATOR;
                public final Long amount;
                public final TimeUnit time_unit;

                public enum TimeUnit implements WireEnum {
                    UNSPECIFIED_TIME_UNIT(0),
                    WEEKS(1),
                    BIWEEKLY(2);

                    public static final CashAppPayOrderRenderData$RetroEligibility$EligibleData$LoanDuration$TimeUnit$Companion$ADAPTER$1 ADAPTER;
                    public static final RetailerType.Companion Companion;
                    public final int value;

                    static {
                        TimeUnit timeUnit = UNSPECIFIED_TIME_UNIT;
                        Companion = new RetailerType.Companion();
                        ADAPTER = new CashAppPayOrderRenderData$RetroEligibility$EligibleData$LoanDuration$TimeUnit$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TimeUnit.class), Syntax.PROTO_2, timeUnit);
                    }

                    TimeUnit(int i) {
                        this.value = i;
                    }

                    public static final TimeUnit fromValue(int i) {
                        Companion.getClass();
                        if (i == 0) {
                            return UNSPECIFIED_TIME_UNIT;
                        }
                        if (i == 1) {
                            return WEEKS;
                        }
                        if (i != 2) {
                            return null;
                        }
                        return BIWEEKLY;
                    }

                    @Override // com.squareup.wire.WireEnum
                    public final int getValue() {
                        return this.value;
                    }
                }

                static {
                    CashAppPayOrderRenderData$RetroEligibility$EligibleData$LoanDuration$Companion$ADAPTER$1 cashAppPayOrderRenderData$RetroEligibility$EligibleData$LoanDuration$Companion$ADAPTER$1 = new CashAppPayOrderRenderData$RetroEligibility$EligibleData$LoanDuration$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LoanDuration.class), "type.googleapis.com/squareup.cash.pay.CashAppPayOrderRenderData.RetroEligibility.EligibleData.LoanDuration", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_order.proto");
                    ADAPTER = cashAppPayOrderRenderData$RetroEligibility$EligibleData$LoanDuration$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayOrderRenderData$RetroEligibility$EligibleData$LoanDuration$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public LoanDuration(Long l, TimeUnit timeUnit, ByteString byteString) {
                    super(ADAPTER, byteString);
                    byteString.getClass();
                    this.amount = l;
                    this.time_unit = timeUnit;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof LoanDuration)) {
                        return false;
                    }
                    LoanDuration loanDuration = (LoanDuration) obj;
                    return Intrinsics.areEqual(unknownFields(), loanDuration.unknownFields()) && Intrinsics.areEqual(this.amount, loanDuration.amount) && this.time_unit == loanDuration.time_unit;
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    Long l = this.amount;
                    int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
                    TimeUnit timeUnit = this.time_unit;
                    int hashCode3 = hashCode2 + (timeUnit != null ? timeUnit.hashCode() : 0);
                    this.hashCode = hashCode3;
                    return hashCode3;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    CardModule.Builder builder = new CardModule.Builder(6);
                    builder.f1329type = this.amount;
                    builder.use_case = this.time_unit;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    Long l = this.amount;
                    if (l != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m("amount=", l, arrayList);
                    }
                    TimeUnit timeUnit = this.time_unit;
                    if (timeUnit != null) {
                        arrayList.add("time_unit=" + timeUnit);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "LoanDuration{", "}", 0, null, null, 56);
                }
            }

            static {
                CashAppPayOrderRenderData$RetroEligibility$EligibleData$Companion$ADAPTER$1 cashAppPayOrderRenderData$RetroEligibility$EligibleData$Companion$ADAPTER$1 = new CashAppPayOrderRenderData$RetroEligibility$EligibleData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EligibleData.class), "type.googleapis.com/squareup.cash.pay.CashAppPayOrderRenderData.RetroEligibility.EligibleData", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_order.proto");
                ADAPTER = cashAppPayOrderRenderData$RetroEligibility$EligibleData$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayOrderRenderData$RetroEligibility$EligibleData$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EligibleData(String str, Money money, Boolean bool, LoanDuration loanDuration, Money money2, Boolean bool2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.convert_to_payment_plan_url = str;
                this.eligible_amount = money;
                this.has_downpayment = bool;
                this.loan_duration = loanDuration;
                this.eligible_loan_money = money2;
                this.is_partial_retro = bool2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof EligibleData)) {
                    return false;
                }
                EligibleData eligibleData = (EligibleData) obj;
                return Intrinsics.areEqual(unknownFields(), eligibleData.unknownFields()) && Intrinsics.areEqual(this.convert_to_payment_plan_url, eligibleData.convert_to_payment_plan_url) && Intrinsics.areEqual(this.eligible_amount, eligibleData.eligible_amount) && Intrinsics.areEqual(this.has_downpayment, eligibleData.has_downpayment) && Intrinsics.areEqual(this.loan_duration, eligibleData.loan_duration) && Intrinsics.areEqual(this.eligible_loan_money, eligibleData.eligible_loan_money) && Intrinsics.areEqual(this.is_partial_retro, eligibleData.is_partial_retro);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.convert_to_payment_plan_url;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                Money money = this.eligible_amount;
                int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
                Boolean bool = this.has_downpayment;
                int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
                LoanDuration loanDuration = this.loan_duration;
                int hashCode5 = (hashCode4 + (loanDuration != null ? loanDuration.hashCode() : 0)) * 37;
                Money money2 = this.eligible_loan_money;
                int hashCode6 = (hashCode5 + (money2 != null ? money2.hashCode() : 0)) * 37;
                Boolean bool2 = this.is_partial_retro;
                int hashCode7 = hashCode6 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
                this.hashCode = hashCode7;
                return hashCode7;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                ExpenseSlice.Builder builder = new ExpenseSlice.Builder(21);
                builder.slice_token = this.convert_to_payment_plan_url;
                builder.amount = this.eligible_amount;
                builder.requester = this.has_downpayment;
                builder.responder = this.loan_duration;
                builder.status = this.eligible_loan_money;
                builder.action = this.is_partial_retro;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.convert_to_payment_plan_url;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "convert_to_payment_plan_url=", arrayList);
                }
                Money money = this.eligible_amount;
                if (money != null) {
                    Matcher$$ExternalSyntheticOutline0.m("eligible_amount=", money, arrayList);
                }
                Boolean bool = this.has_downpayment;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("has_downpayment=", bool, arrayList);
                }
                LoanDuration loanDuration = this.loan_duration;
                if (loanDuration != null) {
                    arrayList.add("loan_duration=" + loanDuration);
                }
                Money money2 = this.eligible_loan_money;
                if (money2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("eligible_loan_money=", money2, arrayList);
                }
                Boolean bool2 = this.is_partial_retro;
                if (bool2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("is_partial_retro=", bool2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "EligibleData{", "}", 0, null, null, 56);
            }
        }

        public enum UiState implements WireEnum {
            UNKNOWN(0),
            ELIGIBLE(1),
            NOT_ELIGIBLE(2),
            CONVERTED_TO_PAYMENT_PLAN(3);

            public static final CashAppPayOrderRenderData$RetroEligibility$UiState$Companion$ADAPTER$1 ADAPTER;
            public static final Origin.Companion Companion;
            public final int value;

            static {
                UiState uiState = UNKNOWN;
                Companion = new Origin.Companion();
                ADAPTER = new CashAppPayOrderRenderData$RetroEligibility$UiState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(UiState.class), Syntax.PROTO_2, uiState);
            }

            UiState(int i) {
                this.value = i;
            }

            public static final UiState fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return UNKNOWN;
                }
                if (i == 1) {
                    return ELIGIBLE;
                }
                if (i == 2) {
                    return NOT_ELIGIBLE;
                }
                if (i != 3) {
                    return null;
                }
                return CONVERTED_TO_PAYMENT_PLAN;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            CashAppPayOrderRenderData$RetroEligibility$Companion$ADAPTER$1 cashAppPayOrderRenderData$RetroEligibility$Companion$ADAPTER$1 = new CashAppPayOrderRenderData$RetroEligibility$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RetroEligibility.class), "type.googleapis.com/squareup.cash.pay.CashAppPayOrderRenderData.RetroEligibility", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_order.proto");
            ADAPTER = cashAppPayOrderRenderData$RetroEligibility$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayOrderRenderData$RetroEligibility$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetroEligibility(UiState uiState, EligibleData eligibleData, ConvertedData convertedData, Long l, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.ui_state = uiState;
            this.eligible_data = eligibleData;
            this.converted_data = convertedData;
            this.expire_at = l;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RetroEligibility)) {
                return false;
            }
            RetroEligibility retroEligibility = (RetroEligibility) obj;
            return Intrinsics.areEqual(unknownFields(), retroEligibility.unknownFields()) && this.ui_state == retroEligibility.ui_state && Intrinsics.areEqual(this.eligible_data, retroEligibility.eligible_data) && Intrinsics.areEqual(this.converted_data, retroEligibility.converted_data) && Intrinsics.areEqual(this.expire_at, retroEligibility.expire_at);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            UiState uiState = this.ui_state;
            int hashCode2 = (hashCode + (uiState != null ? uiState.hashCode() : 0)) * 37;
            EligibleData eligibleData = this.eligible_data;
            int hashCode3 = (hashCode2 + (eligibleData != null ? eligibleData.hashCode() : 0)) * 37;
            ConvertedData convertedData = this.converted_data;
            int hashCode4 = (hashCode3 + (convertedData != null ? convertedData.hashCode() : 0)) * 37;
            Long l = this.expire_at;
            int hashCode5 = hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Allowed.Builder builder = new Allowed.Builder(2);
            builder.card_encryption_data = this.ui_state;
            builder.customer_token_hash_email = this.eligible_data;
            builder.device_metadata = this.converted_data;
            builder.success_screen = this.expire_at;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            UiState uiState = this.ui_state;
            if (uiState != null) {
                arrayList.add("ui_state=" + uiState);
            }
            EligibleData eligibleData = this.eligible_data;
            if (eligibleData != null) {
                arrayList.add("eligible_data=" + eligibleData);
            }
            ConvertedData convertedData = this.converted_data;
            if (convertedData != null) {
                arrayList.add("converted_data=" + convertedData);
            }
            Long l = this.expire_at;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("expire_at=", l, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RetroEligibility{", "}", 0, null, null, 56);
        }
    }

    static {
        CashAppPayOrderRenderData$Companion$ADAPTER$1 cashAppPayOrderRenderData$Companion$ADAPTER$1 = new CashAppPayOrderRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashAppPayOrderRenderData.class), "type.googleapis.com/squareup.cash.pay.CashAppPayOrderRenderData", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_order.proto");
        ADAPTER = cashAppPayOrderRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayOrderRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppPayOrderRenderData(String str, String str2, Long l, Money money, Money money2, Money money3, Money money4, CashAppPayMerchantRenderData cashAppPayMerchantRenderData, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, OrderAggregations orderAggregations, GlobalAddress globalAddress, String str3, String str4, Product product, RetroEligibility retroEligibility, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        list7.getClass();
        list8.getClass();
        list9.getClass();
        list10.getClass();
        list11.getClass();
        byteString.getClass();
        this.order_id = str;
        this.client_id = str2;
        this.created_at = l;
        this.order_total_money = money;
        this.order_net_money = money2;
        this.order_adjusted_total_money = money3;
        this.order_discount_money = money4;
        this.merchant = cashAppPayMerchantRenderData;
        this.order_aggregations = orderAggregations;
        this.customer_shipping_address = globalAddress;
        this.customer_delivery_instructions = str3;
        this.view_enriched_receipt_url = str4;
        this.product = product;
        this.retro_eligibility = retroEligibility;
        this.payments = TransactorKt.immutableCopyOf("payments", list);
        this.refunds = TransactorKt.immutableCopyOf("refunds", list2);
        this.disputes = TransactorKt.immutableCopyOf("disputes", list3);
        this.loan_summaries = TransactorKt.immutableCopyOf("loan_summaries", list4);
        this.incentives = TransactorKt.immutableCopyOf("incentives", list5);
        this.external_incentives = TransactorKt.immutableCopyOf("external_incentives", list6);
        this.line_items = TransactorKt.immutableCopyOf("line_items", list7);
        this.service_charges = TransactorKt.immutableCopyOf("service_charges", list8);
        this.shipping_charges = TransactorKt.immutableCopyOf("shipping_charges", list9);
        this.taxes = TransactorKt.immutableCopyOf("taxes", list10);
        this.payment_schedules = TransactorKt.immutableCopyOf("payment_schedules", list11);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashAppPayOrderRenderData)) {
            return false;
        }
        CashAppPayOrderRenderData cashAppPayOrderRenderData = (CashAppPayOrderRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), cashAppPayOrderRenderData.unknownFields()) && Intrinsics.areEqual(this.order_id, cashAppPayOrderRenderData.order_id) && Intrinsics.areEqual(this.client_id, cashAppPayOrderRenderData.client_id) && Intrinsics.areEqual(this.created_at, cashAppPayOrderRenderData.created_at) && Intrinsics.areEqual(this.order_total_money, cashAppPayOrderRenderData.order_total_money) && Intrinsics.areEqual(this.order_net_money, cashAppPayOrderRenderData.order_net_money) && Intrinsics.areEqual(this.order_adjusted_total_money, cashAppPayOrderRenderData.order_adjusted_total_money) && Intrinsics.areEqual(this.order_discount_money, cashAppPayOrderRenderData.order_discount_money) && Intrinsics.areEqual(this.merchant, cashAppPayOrderRenderData.merchant) && Intrinsics.areEqual(this.payments, cashAppPayOrderRenderData.payments) && Intrinsics.areEqual(this.refunds, cashAppPayOrderRenderData.refunds) && Intrinsics.areEqual(this.disputes, cashAppPayOrderRenderData.disputes) && Intrinsics.areEqual(this.loan_summaries, cashAppPayOrderRenderData.loan_summaries) && Intrinsics.areEqual(this.incentives, cashAppPayOrderRenderData.incentives) && Intrinsics.areEqual(this.external_incentives, cashAppPayOrderRenderData.external_incentives) && Intrinsics.areEqual(this.line_items, cashAppPayOrderRenderData.line_items) && Intrinsics.areEqual(this.service_charges, cashAppPayOrderRenderData.service_charges) && Intrinsics.areEqual(this.shipping_charges, cashAppPayOrderRenderData.shipping_charges) && Intrinsics.areEqual(this.taxes, cashAppPayOrderRenderData.taxes) && Intrinsics.areEqual(this.payment_schedules, cashAppPayOrderRenderData.payment_schedules) && Intrinsics.areEqual(this.order_aggregations, cashAppPayOrderRenderData.order_aggregations) && Intrinsics.areEqual(this.customer_shipping_address, cashAppPayOrderRenderData.customer_shipping_address) && Intrinsics.areEqual(this.customer_delivery_instructions, cashAppPayOrderRenderData.customer_delivery_instructions) && Intrinsics.areEqual(this.view_enriched_receipt_url, cashAppPayOrderRenderData.view_enriched_receipt_url) && this.product == cashAppPayOrderRenderData.product && Intrinsics.areEqual(this.retro_eligibility, cashAppPayOrderRenderData.retro_eligibility);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.order_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.client_id;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.created_at;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Money money = this.order_total_money;
        int hashCode5 = (hashCode4 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.order_net_money;
        int hashCode6 = (hashCode5 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.order_adjusted_total_money;
        int hashCode7 = (hashCode6 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.order_discount_money;
        int hashCode8 = (hashCode7 + (money4 != null ? money4.hashCode() : 0)) * 37;
        CashAppPayMerchantRenderData cashAppPayMerchantRenderData = this.merchant;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode8 + (cashAppPayMerchantRenderData != null ? cashAppPayMerchantRenderData.hashCode() : 0)) * 37, 37, this.payments), 37, this.refunds), 37, this.disputes), 37, this.loan_summaries), 37, this.incentives), 37, this.external_incentives), 37, this.line_items), 37, this.service_charges), 37, this.shipping_charges), 37, this.taxes), 37, this.payment_schedules);
        OrderAggregations orderAggregations = this.order_aggregations;
        int hashCode9 = (m + (orderAggregations != null ? orderAggregations.hashCode() : 0)) * 37;
        GlobalAddress globalAddress = this.customer_shipping_address;
        int hashCode10 = (hashCode9 + (globalAddress != null ? globalAddress.hashCode() : 0)) * 37;
        String str3 = this.customer_delivery_instructions;
        int hashCode11 = (hashCode10 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.view_enriched_receipt_url;
        int hashCode12 = (hashCode11 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Product product = this.product;
        int hashCode13 = (hashCode12 + (product != null ? product.hashCode() : 0)) * 37;
        RetroEligibility retroEligibility = this.retro_eligibility;
        int hashCode14 = hashCode13 + (retroEligibility != null ? retroEligibility.hashCode() : 0);
        this.hashCode = hashCode14;
        return hashCode14;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Builder builder = new GiftCard.Builder(3);
        builder.token = this.order_id;
        builder.status = this.client_id;
        builder.activation_text = this.created_at;
        builder.original_amount_text = this.order_total_money;
        builder.current_amount_text = this.order_net_money;
        builder.stored_value_balance_token = this.order_adjusted_total_money;
        builder.gift_card_type_description = this.order_discount_money;
        builder.current_status_description_text = this.merchant;
        builder.details = this.payments;
        builder.senders = this.refunds;
        builder.options = this.disputes;
        builder.preview_title = this.loan_summaries;
        builder.localizable_title = this.incentives;
        builder.localizable_subtitle = this.external_incentives;
        builder.localizable_activation_text = this.line_items;
        builder.localizable_original_amount_text = this.service_charges;
        builder.localizable_current_amount_text = this.shipping_charges;
        builder.localizable_gift_card_type_description = this.taxes;
        builder.localizable_current_status_description_text = this.payment_schedules;
        builder.localizable_preview_title = this.order_aggregations;
        builder.themed_color = this.customer_shipping_address;
        builder.title = this.customer_delivery_instructions;
        builder.subtitle = this.view_enriched_receipt_url;
        builder.logo = this.product;
        builder.card = this.retro_eligibility;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.order_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "order_id=", arrayList);
        }
        String str2 = this.client_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "client_id=", arrayList);
        }
        Long l = this.created_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at=", l, arrayList);
        }
        Money money = this.order_total_money;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("order_total_money=", money, arrayList);
        }
        Money money2 = this.order_net_money;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("order_net_money=", money2, arrayList);
        }
        Money money3 = this.order_adjusted_total_money;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("order_adjusted_total_money=", money3, arrayList);
        }
        Money money4 = this.order_discount_money;
        if (money4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("order_discount_money=", money4, arrayList);
        }
        CashAppPayMerchantRenderData cashAppPayMerchantRenderData = this.merchant;
        if (cashAppPayMerchantRenderData != null) {
            arrayList.add("merchant=" + cashAppPayMerchantRenderData);
        }
        List list = this.payments;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("payments=", arrayList, list);
        }
        List list2 = this.refunds;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("refunds=", arrayList, list2);
        }
        List list3 = this.disputes;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("disputes=", arrayList, list3);
        }
        List list4 = this.loan_summaries;
        if (!list4.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("loan_summaries=", arrayList, list4);
        }
        List list5 = this.incentives;
        if (!list5.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("incentives=", arrayList, list5);
        }
        List list6 = this.external_incentives;
        if (!list6.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("external_incentives=", arrayList, list6);
        }
        List list7 = this.line_items;
        if (!list7.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("line_items=", arrayList, list7);
        }
        List list8 = this.service_charges;
        if (!list8.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("service_charges=", arrayList, list8);
        }
        List list9 = this.shipping_charges;
        if (!list9.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("shipping_charges=", arrayList, list9);
        }
        List list10 = this.taxes;
        if (!list10.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("taxes=", arrayList, list10);
        }
        List list11 = this.payment_schedules;
        if (!list11.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("payment_schedules=", arrayList, list11);
        }
        OrderAggregations orderAggregations = this.order_aggregations;
        if (orderAggregations != null) {
            arrayList.add("order_aggregations=" + orderAggregations);
        }
        if (this.customer_shipping_address != null) {
            arrayList.add("customer_shipping_address=██");
        }
        if (this.customer_delivery_instructions != null) {
            arrayList.add("customer_delivery_instructions=██");
        }
        String str3 = this.view_enriched_receipt_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "view_enriched_receipt_url=", arrayList);
        }
        Product product = this.product;
        if (product != null) {
            arrayList.add("product=" + product);
        }
        RetroEligibility retroEligibility = this.retro_eligibility;
        if (retroEligibility != null) {
            arrayList.add("retro_eligibility=" + retroEligibility);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashAppPayOrderRenderData{", "}", 0, null, null, 56);
    }
}
