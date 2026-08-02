package com.squareup.protos.cash.pay;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.lending.Loan;
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

/* loaded from: classes7.dex */
public final class CashAppPayRefundRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashAppPayRefundRenderData> CREATOR;
    public final String associated_order_id;
    public final Long authorized_at;
    public final Long captured_at;
    public final Money discount_reclaimed_money;
    public final Long display_date;
    public final Long failed_at;
    public final CashAppPayInstrumentRenderData instrument;
    public final String instrument_display_name;
    public final String linked_payment_id;
    public final CashAppPayMerchantRenderData merchant;
    public final String refund_id;
    public final RefundState refund_state;
    public final Money total_money;
    public final Long voided_at;

    public enum RefundState implements WireEnum {
        UNKNOWN_REFUND_STATE(0),
        PENDING_REFUND_STATE(1),
        COMPLETED_REFUND_STATE(2),
        CANCELLED_REFUND_STATE(3),
        FAILED_REFUND_STATE(4),
        AUTHORIZED_REFUND_STATE(5);

        public static final CashAppPayRefundRenderData$RefundState$Companion$ADAPTER$1 ADAPTER;
        public static final RetailerType.Companion Companion;
        public final int value;

        static {
            RefundState refundState = UNKNOWN_REFUND_STATE;
            Companion = new RetailerType.Companion();
            ADAPTER = new CashAppPayRefundRenderData$RefundState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(RefundState.class), Syntax.PROTO_2, refundState);
        }

        RefundState(int i) {
            this.value = i;
        }

        public static final RefundState fromValue(int i) {
            Companion.getClass();
            return RetailerType.Companion.m3908fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CashAppPayRefundRenderData$Companion$ADAPTER$1 cashAppPayRefundRenderData$Companion$ADAPTER$1 = new CashAppPayRefundRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashAppPayRefundRenderData.class), "type.googleapis.com/squareup.cash.pay.CashAppPayRefundRenderData", Syntax.PROTO_2, null, "squareup/cash/pay/cash_app_pay_refund.proto");
        ADAPTER = cashAppPayRefundRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashAppPayRefundRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashAppPayRefundRenderData(String str, CashAppPayMerchantRenderData cashAppPayMerchantRenderData, RefundState refundState, Money money, Money money2, Long l, Long l2, Long l3, Long l4, Long l5, String str2, String str3, CashAppPayInstrumentRenderData cashAppPayInstrumentRenderData, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.refund_id = str;
        this.merchant = cashAppPayMerchantRenderData;
        this.refund_state = refundState;
        this.total_money = money;
        this.discount_reclaimed_money = money2;
        this.authorized_at = l;
        this.voided_at = l2;
        this.captured_at = l3;
        this.failed_at = l4;
        this.display_date = l5;
        this.instrument_display_name = str2;
        this.linked_payment_id = str3;
        this.instrument = cashAppPayInstrumentRenderData;
        this.associated_order_id = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashAppPayRefundRenderData)) {
            return false;
        }
        CashAppPayRefundRenderData cashAppPayRefundRenderData = (CashAppPayRefundRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), cashAppPayRefundRenderData.unknownFields()) && Intrinsics.areEqual(this.refund_id, cashAppPayRefundRenderData.refund_id) && Intrinsics.areEqual(this.merchant, cashAppPayRefundRenderData.merchant) && this.refund_state == cashAppPayRefundRenderData.refund_state && Intrinsics.areEqual(this.total_money, cashAppPayRefundRenderData.total_money) && Intrinsics.areEqual(this.discount_reclaimed_money, cashAppPayRefundRenderData.discount_reclaimed_money) && Intrinsics.areEqual(this.authorized_at, cashAppPayRefundRenderData.authorized_at) && Intrinsics.areEqual(this.voided_at, cashAppPayRefundRenderData.voided_at) && Intrinsics.areEqual(this.captured_at, cashAppPayRefundRenderData.captured_at) && Intrinsics.areEqual(this.failed_at, cashAppPayRefundRenderData.failed_at) && Intrinsics.areEqual(this.display_date, cashAppPayRefundRenderData.display_date) && Intrinsics.areEqual(this.instrument_display_name, cashAppPayRefundRenderData.instrument_display_name) && Intrinsics.areEqual(this.linked_payment_id, cashAppPayRefundRenderData.linked_payment_id) && Intrinsics.areEqual(this.instrument, cashAppPayRefundRenderData.instrument) && Intrinsics.areEqual(this.associated_order_id, cashAppPayRefundRenderData.associated_order_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.refund_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        CashAppPayMerchantRenderData cashAppPayMerchantRenderData = this.merchant;
        int hashCode3 = (hashCode2 + (cashAppPayMerchantRenderData != null ? cashAppPayMerchantRenderData.hashCode() : 0)) * 37;
        RefundState refundState = this.refund_state;
        int hashCode4 = (hashCode3 + (refundState != null ? refundState.hashCode() : 0)) * 37;
        Money money = this.total_money;
        int hashCode5 = (hashCode4 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.discount_reclaimed_money;
        int hashCode6 = (hashCode5 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Long l = this.authorized_at;
        int hashCode7 = (hashCode6 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.voided_at;
        int hashCode8 = (hashCode7 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.captured_at;
        int hashCode9 = (hashCode8 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Long l4 = this.failed_at;
        int hashCode10 = (hashCode9 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
        Long l5 = this.display_date;
        int hashCode11 = (hashCode10 + (l5 != null ? Long.hashCode(l5.longValue()) : 0)) * 37;
        String str2 = this.instrument_display_name;
        int hashCode12 = (hashCode11 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.linked_payment_id;
        int hashCode13 = (hashCode12 + (str3 != null ? str3.hashCode() : 0)) * 37;
        CashAppPayInstrumentRenderData cashAppPayInstrumentRenderData = this.instrument;
        int hashCode14 = (hashCode13 + (cashAppPayInstrumentRenderData != null ? cashAppPayInstrumentRenderData.hashCode() : 0)) * 37;
        String str4 = this.associated_order_id;
        int hashCode15 = hashCode14 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode15;
        return hashCode15;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Loan.Builder builder = new Loan.Builder(9);
        builder.token = this.refund_id;
        builder.outstanding_amount = this.merchant;
        builder.late_fee_amount = this.refund_state;
        builder.principal_amount = this.total_money;
        builder.setup_fee_amount = this.discount_reclaimed_money;
        builder.borrowed_at = this.authorized_at;
        builder.due_at = this.voided_at;
        builder.interest_amount = this.captured_at;
        builder.setup_fee_bps = this.failed_at;
        builder.detail_rows = this.display_date;
        builder.credit_line_token = this.instrument_display_name;
        builder.state = this.linked_payment_id;
        builder.lending_product = this.instrument;
        builder.bnpl_data = this.associated_order_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.refund_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "refund_id=", arrayList);
        }
        CashAppPayMerchantRenderData cashAppPayMerchantRenderData = this.merchant;
        if (cashAppPayMerchantRenderData != null) {
            arrayList.add("merchant=" + cashAppPayMerchantRenderData);
        }
        RefundState refundState = this.refund_state;
        if (refundState != null) {
            arrayList.add("refund_state=" + refundState);
        }
        Money money = this.total_money;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("total_money=", money, arrayList);
        }
        Money money2 = this.discount_reclaimed_money;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("discount_reclaimed_money=", money2, arrayList);
        }
        Long l = this.authorized_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("authorized_at=", l, arrayList);
        }
        Long l2 = this.voided_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("voided_at=", l2, arrayList);
        }
        Long l3 = this.captured_at;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("captured_at=", l3, arrayList);
        }
        Long l4 = this.failed_at;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("failed_at=", l4, arrayList);
        }
        Long l5 = this.display_date;
        if (l5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("display_date=", l5, arrayList);
        }
        String str2 = this.instrument_display_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "instrument_display_name=", arrayList);
        }
        String str3 = this.linked_payment_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "linked_payment_id=", arrayList);
        }
        CashAppPayInstrumentRenderData cashAppPayInstrumentRenderData = this.instrument;
        if (cashAppPayInstrumentRenderData != null) {
            arrayList.add("instrument=" + cashAppPayInstrumentRenderData);
        }
        String str4 = this.associated_order_id;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "associated_order_id=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashAppPayRefundRenderData{", "}", 0, null, null, 56);
    }
}
