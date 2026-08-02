package com.squareup.protos.cash.commerce;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashregistrar.Account;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.protos.common.Money;
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
public final class CommerceRefund extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CommerceRefund> CREATOR;
    public final Money discount_reclaimed_money;
    public final Long display_date;
    public final String refund_id;
    public final RefundState refund_state;
    public final Money total_money;

    public enum RefundState implements WireEnum {
        UNKNOWN_REFUND_STATE(0),
        AUTHORIZED_REFUND_STATE(1),
        CAPTURED_REFUND_STATE(2),
        VOIDED_REFUND_STATE(3),
        DECLINED_REFUND_STATE(4);

        public static final CommerceRefund$RefundState$Companion$ADAPTER$1 ADAPTER;
        public static final Action.Type.Companion Companion;
        public final int value;

        static {
            RefundState refundState = UNKNOWN_REFUND_STATE;
            Companion = new Action.Type.Companion();
            ADAPTER = new CommerceRefund$RefundState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(RefundState.class), Syntax.PROTO_2, refundState);
        }

        RefundState(int i) {
            this.value = i;
        }

        public static final RefundState fromValue(int i) {
            Companion.getClass();
            return Action.Type.Companion.fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        CommerceRefund$Companion$ADAPTER$1 commerceRefund$Companion$ADAPTER$1 = new CommerceRefund$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CommerceRefund.class), "type.googleapis.com/squareup.cash.commerce.CommerceRefund", Syntax.PROTO_2, null, "squareup/cash/commerce/commerce_refund.proto");
        ADAPTER = commerceRefund$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(commerceRefund$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommerceRefund(String str, Money money, Money money2, Long l, RefundState refundState, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.refund_id = str;
        this.total_money = money;
        this.discount_reclaimed_money = money2;
        this.display_date = l;
        this.refund_state = refundState;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommerceRefund)) {
            return false;
        }
        CommerceRefund commerceRefund = (CommerceRefund) obj;
        return Intrinsics.areEqual(unknownFields(), commerceRefund.unknownFields()) && Intrinsics.areEqual(this.refund_id, commerceRefund.refund_id) && Intrinsics.areEqual(this.total_money, commerceRefund.total_money) && Intrinsics.areEqual(this.discount_reclaimed_money, commerceRefund.discount_reclaimed_money) && Intrinsics.areEqual(this.display_date, commerceRefund.display_date) && this.refund_state == commerceRefund.refund_state;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.refund_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.total_money;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.discount_reclaimed_money;
        int hashCode4 = (hashCode3 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Long l = this.display_date;
        int hashCode5 = (hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        RefundState refundState = this.refund_state;
        int hashCode6 = hashCode5 + (refundState != null ? refundState.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Account.Builder builder = new Account.Builder(25, false);
        builder.customer_token = this.refund_id;
        builder.account_token = this.total_money;
        builder.display_name = this.discount_reclaimed_money;
        builder.account_type = this.display_date;
        builder.is_sponsored_account = this.refund_state;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.refund_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "refund_id=", arrayList);
        }
        Money money = this.total_money;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("total_money=", money, arrayList);
        }
        Money money2 = this.discount_reclaimed_money;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("discount_reclaimed_money=", money2, arrayList);
        }
        Long l = this.display_date;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("display_date=", l, arrayList);
        }
        RefundState refundState = this.refund_state;
        if (refundState != null) {
            arrayList.add("refund_state=" + refundState);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CommerceRefund{", "}", 0, null, null, 56);
    }
}
