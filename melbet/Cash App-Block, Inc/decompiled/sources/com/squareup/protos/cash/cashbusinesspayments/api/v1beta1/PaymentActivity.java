package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.protos.common.Money;
import com.squareup.protos.timecards.Timecard;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PaymentActivity extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentActivity> CREATOR;
    public final Money amount;
    public final String application_id;
    public final String application_name;
    public final String auth_code;
    public final Instant created_at;
    public final String customer_token;
    public final String display_id;
    public final String fee_amount_cents;
    public final Boolean is_refunded;
    public final String listing_title;
    public final String note;
    public final String payment_method;
    public final String payment_token;
    public final State state;
    public final String statement_description;
    public final String time_zone;
    public final List transaction_events;

    public enum State implements WireEnum {
        STATE_UNSPECIFIED(0),
        PROCESSING(1),
        COMPLETED(2),
        FAILED(3),
        REFUNDED(4);

        public static final PaymentActivity$State$Companion$ADAPTER$1 ADAPTER;
        public static final CardProduct.Companion Companion;
        public final int value;

        static {
            State state = STATE_UNSPECIFIED;
            Companion = new CardProduct.Companion(24);
            ADAPTER = new PaymentActivity$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(State.class), Syntax.PROTO_2, state);
        }

        State(int i) {
            this.value = i;
        }

        public static final State fromValue(int i) {
            Companion.getClass();
            return CardProduct.Companion.m3835fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        PaymentActivity$Companion$ADAPTER$1 paymentActivity$Companion$ADAPTER$1 = new PaymentActivity$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaymentActivity.class), "type.googleapis.com/squareup.cash.cashbusinesspayments.api.v1beta1.PaymentActivity", Syntax.PROTO_2, null, "squareup/cash/cashbusinesspayments/api/v1beta1/receipt_data.proto");
        ADAPTER = paymentActivity$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paymentActivity$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentActivity(String str, String str2, String str3, Instant instant, String str4, String str5, Money money, Boolean bool, String str6, State state, String str7, String str8, String str9, String str10, String str11, String str12, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.customer_token = str;
        this.payment_token = str2;
        this.display_id = str3;
        this.created_at = instant;
        this.time_zone = str4;
        this.note = str5;
        this.amount = money;
        this.is_refunded = bool;
        this.fee_amount_cents = str6;
        this.state = state;
        this.payment_method = str7;
        this.statement_description = str8;
        this.auth_code = str9;
        this.application_id = str10;
        this.application_name = str11;
        this.listing_title = str12;
        this.transaction_events = TransactorKt.immutableCopyOf("transaction_events", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentActivity)) {
            return false;
        }
        PaymentActivity paymentActivity = (PaymentActivity) obj;
        return Intrinsics.areEqual(unknownFields(), paymentActivity.unknownFields()) && Intrinsics.areEqual(this.customer_token, paymentActivity.customer_token) && Intrinsics.areEqual(this.payment_token, paymentActivity.payment_token) && Intrinsics.areEqual(this.display_id, paymentActivity.display_id) && Intrinsics.areEqual(this.created_at, paymentActivity.created_at) && Intrinsics.areEqual(this.time_zone, paymentActivity.time_zone) && Intrinsics.areEqual(this.note, paymentActivity.note) && Intrinsics.areEqual(this.amount, paymentActivity.amount) && Intrinsics.areEqual(this.is_refunded, paymentActivity.is_refunded) && Intrinsics.areEqual(this.fee_amount_cents, paymentActivity.fee_amount_cents) && this.state == paymentActivity.state && Intrinsics.areEqual(this.payment_method, paymentActivity.payment_method) && Intrinsics.areEqual(this.statement_description, paymentActivity.statement_description) && Intrinsics.areEqual(this.auth_code, paymentActivity.auth_code) && Intrinsics.areEqual(this.application_id, paymentActivity.application_id) && Intrinsics.areEqual(this.application_name, paymentActivity.application_name) && Intrinsics.areEqual(this.listing_title, paymentActivity.listing_title) && Intrinsics.areEqual(this.transaction_events, paymentActivity.transaction_events);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.payment_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.display_id;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Instant instant = this.created_at;
        int hashCode5 = (hashCode4 + (instant != null ? instant.hashCode() : 0)) * 37;
        String str4 = this.time_zone;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.note;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode8 = (hashCode7 + (money != null ? money.hashCode() : 0)) * 37;
        Boolean bool = this.is_refunded;
        int hashCode9 = (hashCode8 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str6 = this.fee_amount_cents;
        int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 37;
        State state = this.state;
        int hashCode11 = (hashCode10 + (state != null ? state.hashCode() : 0)) * 37;
        String str7 = this.payment_method;
        int hashCode12 = (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.statement_description;
        int hashCode13 = (hashCode12 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.auth_code;
        int hashCode14 = (hashCode13 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.application_id;
        int hashCode15 = (hashCode14 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.application_name;
        int hashCode16 = (hashCode15 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.listing_title;
        int hashCode17 = this.transaction_events.hashCode() + ((hashCode16 + (str12 != null ? str12.hashCode() : 0)) * 37);
        this.hashCode = hashCode17;
        return hashCode17;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Timecard.Builder builder = new Timecard.Builder(2);
        builder.token = this.customer_token;
        builder.shift_id = this.payment_token;
        builder.merchant_token = this.display_id;
        builder.employee = this.created_at;
        builder.employee_token = this.time_zone;
        builder.clockin_unit_token = this.note;
        builder.hourly_wage = this.amount;
        builder.deleted = this.is_refunded;
        builder.clockout_unit_token = this.fee_amount_cents;
        builder.was_automatically_clocked_out = this.state;
        builder.note = this.payment_method;
        builder.clockin_timestamp_ms = this.statement_description;
        builder.clockout_timestamp_ms = this.auth_code;
        builder.created_at_timestamp_ms = this.application_id;
        builder.updated_at_timestamp_ms = this.application_name;
        builder.declared_tip = this.listing_title;
        builder.employee_job_info = this.transaction_events;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        String str2 = this.payment_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "payment_token=", arrayList);
        }
        String str3 = this.display_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "display_id=", arrayList);
        }
        Instant instant = this.created_at;
        if (instant != null) {
            Matcher$$ExternalSyntheticOutline0.m("created_at=", instant, arrayList);
        }
        String str4 = this.time_zone;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "time_zone=", arrayList);
        }
        if (this.note != null) {
            arrayList.add("note=██");
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        Boolean bool = this.is_refunded;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_refunded=", bool, arrayList);
        }
        String str5 = this.fee_amount_cents;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "fee_amount_cents=", arrayList);
        }
        State state = this.state;
        if (state != null) {
            arrayList.add("state=" + state);
        }
        if (this.payment_method != null) {
            arrayList.add("payment_method=██");
        }
        if (this.statement_description != null) {
            arrayList.add("statement_description=██");
        }
        if (this.auth_code != null) {
            arrayList.add("auth_code=██");
        }
        String str6 = this.application_id;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "application_id=", arrayList);
        }
        String str7 = this.application_name;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "application_name=", arrayList);
        }
        String str8 = this.listing_title;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "listing_title=", arrayList);
        }
        List list = this.transaction_events;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("transaction_events=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentActivity{", "}", 0, null, null, 56);
    }
}
