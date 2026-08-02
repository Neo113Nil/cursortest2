package com.squareup.protos.cash.pay;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.BalanceImpact;
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
public final class CashAppPayPaymentRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashAppPayPaymentRenderData> CREATOR;
    public final String associated_loan_id;
    public final String associated_order_id;
    public final Money auth_money;
    public final AuthorizationChannel authorization_channel;
    public final Long authorized_at;
    public final Money capture_money;
    public final Long captured_at;
    public final List discounts;
    public final Long display_date;
    public final String display_id;
    public final List dispute_ids;
    public final Money dispute_won_money;
    public final String external_reference_id;
    public final Long failed_at;
    public final Money failed_money;
    public final List failure_reasons;
    public final Long hidden_until_date;
    public final Long installment_number;
    public final CashAppPayInstrumentRenderData instrument;
    public final CashAppPayMerchantRenderData merchant;
    public final String order_id;
    public final String payment_id;
    public final List refund_ids;
    public final Money refunded_money;
    public final Money scheduled_money;
    public final PaymentState state;
    public final String statement_descriptor;
    public final Money void_money;
    public final Long voided_at;

    public enum AuthorizationChannel implements WireEnum {
        UNKNOWN_AUTHORIZATION_CHANNEL(0),
        IN_PERSON_AUTHORIZATION_CHANNEL(1),
        ONLINE_AUTHORIZATION_CHANNEL(2),
        IN_APP_AUTHORIZATION_CHANNEL(3);

        public static final CashAppPayPaymentRenderData$AuthorizationChannel$Companion$ADAPTER$1 ADAPTER;
        public static final SliceStatus.Companion Companion;
        public final int value;

        static {
            AuthorizationChannel authorizationChannel = UNKNOWN_AUTHORIZATION_CHANNEL;
            Companion = new SliceStatus.Companion();
            ADAPTER = new CashAppPayPaymentRenderData$AuthorizationChannel$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AuthorizationChannel.class), Syntax.PROTO_2, authorizationChannel);
        }

        AuthorizationChannel(int i) {
            this.value = i;
        }

        public static final AuthorizationChannel fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return UNKNOWN_AUTHORIZATION_CHANNEL;
            }
            if (i == 1) {
                return IN_PERSON_AUTHORIZATION_CHANNEL;
            }
            if (i == 2) {
                return ONLINE_AUTHORIZATION_CHANNEL;
            }
            if (i != 3) {
                return null;
            }
            return IN_APP_AUTHORIZATION_CHANNEL;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class Builder extends Message.Builder {
        public String associated_loan_id;
        public String associated_order_id;
        public Money auth_money;
        public AuthorizationChannel authorization_channel;
        public Long authorized_at;
        public Money capture_money;
        public Long captured_at;
        public List discounts;
        public Long display_date;
        public String display_id;
        public List dispute_ids;
        public Money dispute_won_money;
        public String external_reference_id;
        public Long failed_at;
        public Money failed_money;
        public List failure_reasons;
        public Long hidden_until_date;
        public Long installment_number;
        public CashAppPayInstrumentRenderData instrument;
        public CashAppPayMerchantRenderData merchant;
        public String order_id;
        public String payment_id;
        public List refund_ids;
        public Money refunded_money;
        public Money scheduled_money;
        public PaymentState state;
        public String statement_descriptor;
        public Money void_money;
        public Long voided_at;

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new CashAppPayPaymentRenderData(this.payment_id, this.order_id, this.merchant, this.display_id, this.external_reference_id, this.state, this.auth_money, this.capture_money, this.void_money, this.failed_money, this.refunded_money, this.scheduled_money, this.dispute_won_money, this.authorized_at, this.captured_at, this.voided_at, this.failed_at, this.display_date, this.hidden_until_date, this.installment_number, this.failure_reasons, this.authorization_channel, this.discounts, this.associated_loan_id, this.instrument, this.refund_ids, this.dispute_ids, this.statement_descriptor, this.associated_order_id, buildUnknownFields());
        }
    }

    public final class DiscountRenderData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DiscountRenderData> CREATOR;
        public final String incentive_id;
        public final Money total_discount_money;

        static {
            CashAppPayPaymentRenderData$DiscountRenderData$Companion$ADAPTER$1 cashAppPayPaymentRenderData$DiscountRenderData$Companion$ADAPTER$1 = new CashAppPayPaymentRenderData$DiscountRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DiscountRenderData.class), "type.googleapis.com/squareup.cash.pay.CashAppPayPaymentRenderData.DiscountRenderData", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_payment.proto");
            ADAPTER = cashAppPayPaymentRenderData$DiscountRenderData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayPaymentRenderData$DiscountRenderData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DiscountRenderData(Money money, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.incentive_id = str;
            this.total_discount_money = money;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DiscountRenderData)) {
                return false;
            }
            DiscountRenderData discountRenderData = (DiscountRenderData) obj;
            return Intrinsics.areEqual(unknownFields(), discountRenderData.unknownFields()) && Intrinsics.areEqual(this.incentive_id, discountRenderData.incentive_id) && Intrinsics.areEqual(this.total_discount_money, discountRenderData.total_discount_money);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.incentive_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Money money = this.total_discount_money;
            int hashCode3 = hashCode2 + (money != null ? money.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BalanceImpact.Builder builder = new BalanceImpact.Builder(6);
            builder.balance_name = this.incentive_id;
            builder.amount = this.total_discount_money;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.incentive_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "incentive_id=", arrayList);
            }
            Money money = this.total_discount_money;
            if (money != null) {
                Matcher$$ExternalSyntheticOutline0.m("total_discount_money=", money, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DiscountRenderData{", "}", 0, null, null, 56);
        }
    }

    public enum PaymentState implements WireEnum {
        UNKNOWN_PAYMENT_STATE(0),
        SCHEDULED_PAYMENT_STATE(1),
        AUTHORIZED_PAYMENT_STATE(2),
        CAPTURED_PAYMENT_STATE(3),
        VOIDED_PAYMENT_STATE(4),
        FAILED_PAYMENT_STATE(5);

        public static final CashAppPayPaymentRenderData$PaymentState$Companion$ADAPTER$1 ADAPTER;
        public static final FeeType.Companion Companion;
        public final int value;

        static {
            PaymentState paymentState = UNKNOWN_PAYMENT_STATE;
            Companion = new FeeType.Companion();
            ADAPTER = new CashAppPayPaymentRenderData$PaymentState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PaymentState.class), Syntax.PROTO_2, paymentState);
        }

        PaymentState(int i) {
            this.value = i;
        }

        public static final PaymentState fromValue(int i) {
            Companion.getClass();
            return FeeType.Companion.m3912fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CashAppPayPaymentRenderData$Companion$ADAPTER$1 cashAppPayPaymentRenderData$Companion$ADAPTER$1 = new CashAppPayPaymentRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashAppPayPaymentRenderData.class), "type.googleapis.com/squareup.cash.pay.CashAppPayPaymentRenderData", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_payment.proto");
        ADAPTER = cashAppPayPaymentRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayPaymentRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppPayPaymentRenderData(String str, String str2, CashAppPayMerchantRenderData cashAppPayMerchantRenderData, String str3, String str4, PaymentState paymentState, Money money, Money money2, Money money3, Money money4, Money money5, Money money6, Money money7, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, List list, AuthorizationChannel authorizationChannel, List list2, String str5, CashAppPayInstrumentRenderData cashAppPayInstrumentRenderData, List list3, List list4, String str6, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        byteString.getClass();
        this.payment_id = str;
        this.order_id = str2;
        this.merchant = cashAppPayMerchantRenderData;
        this.display_id = str3;
        this.external_reference_id = str4;
        this.state = paymentState;
        this.auth_money = money;
        this.capture_money = money2;
        this.void_money = money3;
        this.failed_money = money4;
        this.refunded_money = money5;
        this.scheduled_money = money6;
        this.dispute_won_money = money7;
        this.authorized_at = l;
        this.captured_at = l2;
        this.voided_at = l3;
        this.failed_at = l4;
        this.display_date = l5;
        this.hidden_until_date = l6;
        this.installment_number = l7;
        this.authorization_channel = authorizationChannel;
        this.associated_loan_id = str5;
        this.instrument = cashAppPayInstrumentRenderData;
        this.statement_descriptor = str6;
        this.associated_order_id = str7;
        this.failure_reasons = TransactorKt.immutableCopyOf("failure_reasons", list);
        this.discounts = TransactorKt.immutableCopyOf("discounts", list2);
        this.refund_ids = TransactorKt.immutableCopyOf("refund_ids", list3);
        this.dispute_ids = TransactorKt.immutableCopyOf("dispute_ids", list4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashAppPayPaymentRenderData)) {
            return false;
        }
        CashAppPayPaymentRenderData cashAppPayPaymentRenderData = (CashAppPayPaymentRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), cashAppPayPaymentRenderData.unknownFields()) && Intrinsics.areEqual(this.payment_id, cashAppPayPaymentRenderData.payment_id) && Intrinsics.areEqual(this.order_id, cashAppPayPaymentRenderData.order_id) && Intrinsics.areEqual(this.merchant, cashAppPayPaymentRenderData.merchant) && Intrinsics.areEqual(this.display_id, cashAppPayPaymentRenderData.display_id) && Intrinsics.areEqual(this.external_reference_id, cashAppPayPaymentRenderData.external_reference_id) && this.state == cashAppPayPaymentRenderData.state && Intrinsics.areEqual(this.auth_money, cashAppPayPaymentRenderData.auth_money) && Intrinsics.areEqual(this.capture_money, cashAppPayPaymentRenderData.capture_money) && Intrinsics.areEqual(this.void_money, cashAppPayPaymentRenderData.void_money) && Intrinsics.areEqual(this.failed_money, cashAppPayPaymentRenderData.failed_money) && Intrinsics.areEqual(this.refunded_money, cashAppPayPaymentRenderData.refunded_money) && Intrinsics.areEqual(this.scheduled_money, cashAppPayPaymentRenderData.scheduled_money) && Intrinsics.areEqual(this.dispute_won_money, cashAppPayPaymentRenderData.dispute_won_money) && Intrinsics.areEqual(this.authorized_at, cashAppPayPaymentRenderData.authorized_at) && Intrinsics.areEqual(this.captured_at, cashAppPayPaymentRenderData.captured_at) && Intrinsics.areEqual(this.voided_at, cashAppPayPaymentRenderData.voided_at) && Intrinsics.areEqual(this.failed_at, cashAppPayPaymentRenderData.failed_at) && Intrinsics.areEqual(this.display_date, cashAppPayPaymentRenderData.display_date) && Intrinsics.areEqual(this.hidden_until_date, cashAppPayPaymentRenderData.hidden_until_date) && Intrinsics.areEqual(this.installment_number, cashAppPayPaymentRenderData.installment_number) && Intrinsics.areEqual(this.failure_reasons, cashAppPayPaymentRenderData.failure_reasons) && this.authorization_channel == cashAppPayPaymentRenderData.authorization_channel && Intrinsics.areEqual(this.discounts, cashAppPayPaymentRenderData.discounts) && Intrinsics.areEqual(this.associated_loan_id, cashAppPayPaymentRenderData.associated_loan_id) && Intrinsics.areEqual(this.instrument, cashAppPayPaymentRenderData.instrument) && Intrinsics.areEqual(this.refund_ids, cashAppPayPaymentRenderData.refund_ids) && Intrinsics.areEqual(this.dispute_ids, cashAppPayPaymentRenderData.dispute_ids) && Intrinsics.areEqual(this.statement_descriptor, cashAppPayPaymentRenderData.statement_descriptor) && Intrinsics.areEqual(this.associated_order_id, cashAppPayPaymentRenderData.associated_order_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.payment_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.order_id;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        CashAppPayMerchantRenderData cashAppPayMerchantRenderData = this.merchant;
        int hashCode4 = (hashCode3 + (cashAppPayMerchantRenderData != null ? cashAppPayMerchantRenderData.hashCode() : 0)) * 37;
        String str3 = this.display_id;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.external_reference_id;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        PaymentState paymentState = this.state;
        int hashCode7 = (hashCode6 + (paymentState != null ? paymentState.hashCode() : 0)) * 37;
        Money money = this.auth_money;
        int hashCode8 = (hashCode7 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.capture_money;
        int hashCode9 = (hashCode8 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.void_money;
        int hashCode10 = (hashCode9 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.failed_money;
        int hashCode11 = (hashCode10 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Money money5 = this.refunded_money;
        int hashCode12 = (hashCode11 + (money5 != null ? money5.hashCode() : 0)) * 37;
        Money money6 = this.scheduled_money;
        int hashCode13 = (hashCode12 + (money6 != null ? money6.hashCode() : 0)) * 37;
        Money money7 = this.dispute_won_money;
        int hashCode14 = (hashCode13 + (money7 != null ? money7.hashCode() : 0)) * 37;
        Long l = this.authorized_at;
        int hashCode15 = (hashCode14 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.captured_at;
        int hashCode16 = (hashCode15 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.voided_at;
        int hashCode17 = (hashCode16 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Long l4 = this.failed_at;
        int hashCode18 = (hashCode17 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
        Long l5 = this.display_date;
        int hashCode19 = (hashCode18 + (l5 != null ? Long.hashCode(l5.longValue()) : 0)) * 37;
        Long l6 = this.hidden_until_date;
        int hashCode20 = (hashCode19 + (l6 != null ? Long.hashCode(l6.longValue()) : 0)) * 37;
        Long l7 = this.installment_number;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode20 + (l7 != null ? Long.hashCode(l7.longValue()) : 0)) * 37, 37, this.failure_reasons);
        AuthorizationChannel authorizationChannel = this.authorization_channel;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((m + (authorizationChannel != null ? authorizationChannel.hashCode() : 0)) * 37, 37, this.discounts);
        String str5 = this.associated_loan_id;
        int hashCode21 = (m2 + (str5 != null ? str5.hashCode() : 0)) * 37;
        CashAppPayInstrumentRenderData cashAppPayInstrumentRenderData = this.instrument;
        int m3 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode21 + (cashAppPayInstrumentRenderData != null ? cashAppPayInstrumentRenderData.hashCode() : 0)) * 37, 37, this.refund_ids), 37, this.dispute_ids);
        String str6 = this.statement_descriptor;
        int hashCode22 = (m3 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.associated_order_id;
        int hashCode23 = hashCode22 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = hashCode23;
        return hashCode23;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.payment_id = this.payment_id;
        builder.order_id = this.order_id;
        builder.merchant = this.merchant;
        builder.display_id = this.display_id;
        builder.external_reference_id = this.external_reference_id;
        builder.state = this.state;
        builder.auth_money = this.auth_money;
        builder.capture_money = this.capture_money;
        builder.void_money = this.void_money;
        builder.failed_money = this.failed_money;
        builder.refunded_money = this.refunded_money;
        builder.scheduled_money = this.scheduled_money;
        builder.dispute_won_money = this.dispute_won_money;
        builder.authorized_at = this.authorized_at;
        builder.captured_at = this.captured_at;
        builder.voided_at = this.voided_at;
        builder.failed_at = this.failed_at;
        builder.display_date = this.display_date;
        builder.hidden_until_date = this.hidden_until_date;
        builder.installment_number = this.installment_number;
        builder.failure_reasons = this.failure_reasons;
        builder.authorization_channel = this.authorization_channel;
        builder.discounts = this.discounts;
        builder.associated_loan_id = this.associated_loan_id;
        builder.instrument = this.instrument;
        builder.refund_ids = this.refund_ids;
        builder.dispute_ids = this.dispute_ids;
        builder.statement_descriptor = this.statement_descriptor;
        builder.associated_order_id = this.associated_order_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.payment_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "payment_id=", arrayList);
        }
        String str2 = this.order_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "order_id=", arrayList);
        }
        CashAppPayMerchantRenderData cashAppPayMerchantRenderData = this.merchant;
        if (cashAppPayMerchantRenderData != null) {
            arrayList.add("merchant=" + cashAppPayMerchantRenderData);
        }
        String str3 = this.display_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "display_id=", arrayList);
        }
        String str4 = this.external_reference_id;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "external_reference_id=", arrayList);
        }
        PaymentState paymentState = this.state;
        if (paymentState != null) {
            arrayList.add("state=" + paymentState);
        }
        Money money = this.auth_money;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("auth_money=", money, arrayList);
        }
        Money money2 = this.capture_money;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("capture_money=", money2, arrayList);
        }
        Money money3 = this.void_money;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("void_money=", money3, arrayList);
        }
        Money money4 = this.failed_money;
        if (money4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("failed_money=", money4, arrayList);
        }
        Money money5 = this.refunded_money;
        if (money5 != null) {
            Matcher$$ExternalSyntheticOutline0.m("refunded_money=", money5, arrayList);
        }
        Money money6 = this.scheduled_money;
        if (money6 != null) {
            Matcher$$ExternalSyntheticOutline0.m("scheduled_money=", money6, arrayList);
        }
        Money money7 = this.dispute_won_money;
        if (money7 != null) {
            Matcher$$ExternalSyntheticOutline0.m("dispute_won_money=", money7, arrayList);
        }
        Long l = this.authorized_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("authorized_at=", l, arrayList);
        }
        Long l2 = this.captured_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("captured_at=", l2, arrayList);
        }
        Long l3 = this.voided_at;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("voided_at=", l3, arrayList);
        }
        Long l4 = this.failed_at;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("failed_at=", l4, arrayList);
        }
        Long l5 = this.display_date;
        if (l5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("display_date=", l5, arrayList);
        }
        Long l6 = this.hidden_until_date;
        if (l6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("hidden_until_date=", l6, arrayList);
        }
        Long l7 = this.installment_number;
        if (l7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("installment_number=", l7, arrayList);
        }
        List list = this.failure_reasons;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("failure_reasons=", arrayList, list);
        }
        AuthorizationChannel authorizationChannel = this.authorization_channel;
        if (authorizationChannel != null) {
            arrayList.add("authorization_channel=" + authorizationChannel);
        }
        List list2 = this.discounts;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("discounts=", arrayList, list2);
        }
        String str5 = this.associated_loan_id;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "associated_loan_id=", arrayList);
        }
        CashAppPayInstrumentRenderData cashAppPayInstrumentRenderData = this.instrument;
        if (cashAppPayInstrumentRenderData != null) {
            arrayList.add("instrument=" + cashAppPayInstrumentRenderData);
        }
        List list3 = this.refund_ids;
        if (!list3.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("refund_ids=", arrayList, list3);
        }
        List list4 = this.dispute_ids;
        if (!list4.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("dispute_ids=", arrayList, list4);
        }
        String str6 = this.statement_descriptor;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "statement_descriptor=", arrayList);
        }
        String str7 = this.associated_order_id;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "associated_order_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashAppPayPaymentRenderData{", "}", 0, null, null, 56);
    }
}
