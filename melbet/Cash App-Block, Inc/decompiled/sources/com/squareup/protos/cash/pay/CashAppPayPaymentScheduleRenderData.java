package com.squareup.protos.cash.pay;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.janus.api.ContactAliasType;
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
import xyz.block.protos.genie.Expression;

/* loaded from: classes7.dex */
public final class CashAppPayPaymentScheduleRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashAppPayPaymentScheduleRenderData> CREATOR;
    public final List associated_payment_ids;
    public final List associated_refund_ids;
    public final Integer installment_sequence_number;
    public final Money late_fee_money;
    public final Money late_fee_refunded_money;
    public final Money owed_money;
    public final Money paid_money;
    public final String payment_schedule_id;
    public final Money payment_schedule_money;
    public final Money refunded_money;
    public final Long schedule_due_at;
    public final PaymentScheduleState state;

    public enum PaymentScheduleState implements WireEnum {
        UNKNOWN_PAYMENT_SCHEDULE_STATE(0),
        OWED_PAYMENT_SCHEDULE_STATE(1),
        PAID_PAYMENT_SCHEDULE_STATE(2),
        OVER_DUE_PAYMENT_SCHEDULE_STATE(3),
        REFUNDED_PAYMENT_SCHEDULE_STATE(4),
        DEFERRED_PAYMENT_SCHEDULE_STATE(5),
        PENDING_PAYMENT_SCHEDULE_STATE(6),
        PARTIALLY_REFUNDED_PAYMENT_SCHEDULE_STATE(7),
        CANCELLED_PAYMENT_SCHEDULE_STATE(8),
        MISSED_PAYMENT_SCHEDULE_STATE(9);

        public static final CashAppPayPaymentScheduleRenderData$PaymentScheduleState$Companion$ADAPTER$1 ADAPTER;
        public static final ContactAliasType.Companion Companion;
        public final int value;

        static {
            PaymentScheduleState paymentScheduleState = UNKNOWN_PAYMENT_SCHEDULE_STATE;
            Companion = new ContactAliasType.Companion();
            ADAPTER = new CashAppPayPaymentScheduleRenderData$PaymentScheduleState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PaymentScheduleState.class), Syntax.PROTO_2, paymentScheduleState);
        }

        PaymentScheduleState(int i) {
            this.value = i;
        }

        public static final PaymentScheduleState fromValue(int i) {
            Companion.getClass();
            return ContactAliasType.Companion.m3898fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CashAppPayPaymentScheduleRenderData$Companion$ADAPTER$1 cashAppPayPaymentScheduleRenderData$Companion$ADAPTER$1 = new CashAppPayPaymentScheduleRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashAppPayPaymentScheduleRenderData.class), "type.googleapis.com/squareup.cash.pay.CashAppPayPaymentScheduleRenderData", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_payment_schedule.proto");
        ADAPTER = cashAppPayPaymentScheduleRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayPaymentScheduleRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppPayPaymentScheduleRenderData(String str, Money money, Money money2, Money money3, Money money4, Money money5, Money money6, Long l, PaymentScheduleState paymentScheduleState, List list, List list2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.payment_schedule_id = str;
        this.payment_schedule_money = money;
        this.paid_money = money2;
        this.owed_money = money3;
        this.late_fee_money = money4;
        this.refunded_money = money5;
        this.late_fee_refunded_money = money6;
        this.schedule_due_at = l;
        this.state = paymentScheduleState;
        this.installment_sequence_number = num;
        this.associated_payment_ids = TransactorKt.immutableCopyOf("associated_payment_ids", list);
        this.associated_refund_ids = TransactorKt.immutableCopyOf("associated_refund_ids", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashAppPayPaymentScheduleRenderData)) {
            return false;
        }
        CashAppPayPaymentScheduleRenderData cashAppPayPaymentScheduleRenderData = (CashAppPayPaymentScheduleRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), cashAppPayPaymentScheduleRenderData.unknownFields()) && Intrinsics.areEqual(this.payment_schedule_id, cashAppPayPaymentScheduleRenderData.payment_schedule_id) && Intrinsics.areEqual(this.payment_schedule_money, cashAppPayPaymentScheduleRenderData.payment_schedule_money) && Intrinsics.areEqual(this.paid_money, cashAppPayPaymentScheduleRenderData.paid_money) && Intrinsics.areEqual(this.owed_money, cashAppPayPaymentScheduleRenderData.owed_money) && Intrinsics.areEqual(this.late_fee_money, cashAppPayPaymentScheduleRenderData.late_fee_money) && Intrinsics.areEqual(this.refunded_money, cashAppPayPaymentScheduleRenderData.refunded_money) && Intrinsics.areEqual(this.late_fee_refunded_money, cashAppPayPaymentScheduleRenderData.late_fee_refunded_money) && Intrinsics.areEqual(this.schedule_due_at, cashAppPayPaymentScheduleRenderData.schedule_due_at) && this.state == cashAppPayPaymentScheduleRenderData.state && Intrinsics.areEqual(this.associated_payment_ids, cashAppPayPaymentScheduleRenderData.associated_payment_ids) && Intrinsics.areEqual(this.associated_refund_ids, cashAppPayPaymentScheduleRenderData.associated_refund_ids) && Intrinsics.areEqual(this.installment_sequence_number, cashAppPayPaymentScheduleRenderData.installment_sequence_number);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.payment_schedule_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.payment_schedule_money;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.paid_money;
        int hashCode4 = (hashCode3 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Money money3 = this.owed_money;
        int hashCode5 = (hashCode4 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.late_fee_money;
        int hashCode6 = (hashCode5 + (money4 != null ? money4.hashCode() : 0)) * 37;
        Money money5 = this.refunded_money;
        int hashCode7 = (hashCode6 + (money5 != null ? money5.hashCode() : 0)) * 37;
        Money money6 = this.late_fee_refunded_money;
        int hashCode8 = (hashCode7 + (money6 != null ? money6.hashCode() : 0)) * 37;
        Long l = this.schedule_due_at;
        int hashCode9 = (hashCode8 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        PaymentScheduleState paymentScheduleState = this.state;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode9 + (paymentScheduleState != null ? paymentScheduleState.hashCode() : 0)) * 37, 37, this.associated_payment_ids), 37, this.associated_refund_ids);
        Integer num = this.installment_sequence_number;
        int hashCode10 = m + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Expression.Builder builder = new Expression.Builder(16, false);
        builder.string_literal = this.payment_schedule_id;
        builder.key_path_ref = this.payment_schedule_money;
        builder.float_literal = this.paid_money;
        builder.bool_literal = this.owed_money;
        builder.blob_literal = this.late_fee_money;
        builder.unary_op = this.refunded_money;
        builder.binary_op = this.late_fee_refunded_money;
        builder.int_literal = this.schedule_due_at;
        builder.conditional_op = this.state;
        builder.filter_op = this.associated_payment_ids;
        builder.collection_literal = this.associated_refund_ids;
        builder.format_string_op = this.installment_sequence_number;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.payment_schedule_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "payment_schedule_id=", arrayList);
        }
        Money money = this.payment_schedule_money;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("payment_schedule_money=", money, arrayList);
        }
        Money money2 = this.paid_money;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("paid_money=", money2, arrayList);
        }
        Money money3 = this.owed_money;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("owed_money=", money3, arrayList);
        }
        Money money4 = this.late_fee_money;
        if (money4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("late_fee_money=", money4, arrayList);
        }
        Money money5 = this.refunded_money;
        if (money5 != null) {
            Matcher$$ExternalSyntheticOutline0.m("refunded_money=", money5, arrayList);
        }
        Money money6 = this.late_fee_refunded_money;
        if (money6 != null) {
            Matcher$$ExternalSyntheticOutline0.m("late_fee_refunded_money=", money6, arrayList);
        }
        Long l = this.schedule_due_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("schedule_due_at=", l, arrayList);
        }
        PaymentScheduleState paymentScheduleState = this.state;
        if (paymentScheduleState != null) {
            arrayList.add("state=" + paymentScheduleState);
        }
        List list = this.associated_payment_ids;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("associated_payment_ids=", arrayList, list);
        }
        List list2 = this.associated_refund_ids;
        if (!list2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("associated_refund_ids=", arrayList, list2);
        }
        Integer num = this.installment_sequence_number;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("installment_sequence_number=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashAppPayPaymentScheduleRenderData{", "}", 0, null, null, 56);
    }
}
