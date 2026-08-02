package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.employeejobs.Job;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PaymentHistoryConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentHistoryConfig> CREATOR;
    public final List automated_investment_payment_types;
    public final List banking_transaction_customer_ids;
    public final List bitcoin_transaction_customer_ids;
    public final List business_payments_customer_ids;
    public final List lending_transaction_customer_ids;
    public final List loyalty_merchant_payment_activity_hidden_payment_types;
    public final List referral_customer_ids;
    public final String script_url;
    public final String search_script_url;
    public final List top_level_hidden_payment_types;
    public final List transfer_customer_ids;

    static {
        PaymentHistoryConfig$Companion$ADAPTER$1 paymentHistoryConfig$Companion$ADAPTER$1 = new PaymentHistoryConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PaymentHistoryConfig.class), "type.googleapis.com/squareup.franklin.common.PaymentHistoryConfig", Syntax.PROTO_2, null, "squareup/franklin/common/payment_history_config.proto");
        ADAPTER = paymentHistoryConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(paymentHistoryConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentHistoryConfig(String str, String str2, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, ByteString byteString) {
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
        byteString.getClass();
        this.script_url = str;
        this.search_script_url = str2;
        this.transfer_customer_ids = TransactorKt.immutableCopyOf("transfer_customer_ids", list);
        this.banking_transaction_customer_ids = TransactorKt.immutableCopyOf("banking_transaction_customer_ids", list2);
        this.bitcoin_transaction_customer_ids = TransactorKt.immutableCopyOf("bitcoin_transaction_customer_ids", list3);
        this.lending_transaction_customer_ids = TransactorKt.immutableCopyOf("lending_transaction_customer_ids", list4);
        this.referral_customer_ids = TransactorKt.immutableCopyOf("referral_customer_ids", list5);
        this.top_level_hidden_payment_types = TransactorKt.immutableCopyOf("top_level_hidden_payment_types", list6);
        this.loyalty_merchant_payment_activity_hidden_payment_types = TransactorKt.immutableCopyOf("loyalty_merchant_payment_activity_hidden_payment_types", list7);
        this.automated_investment_payment_types = TransactorKt.immutableCopyOf("automated_investment_payment_types", list8);
        this.business_payments_customer_ids = TransactorKt.immutableCopyOf("business_payments_customer_ids", list9);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentHistoryConfig)) {
            return false;
        }
        PaymentHistoryConfig paymentHistoryConfig = (PaymentHistoryConfig) obj;
        return Intrinsics.areEqual(unknownFields(), paymentHistoryConfig.unknownFields()) && Intrinsics.areEqual(this.script_url, paymentHistoryConfig.script_url) && Intrinsics.areEqual(this.search_script_url, paymentHistoryConfig.search_script_url) && Intrinsics.areEqual(this.transfer_customer_ids, paymentHistoryConfig.transfer_customer_ids) && Intrinsics.areEqual(this.banking_transaction_customer_ids, paymentHistoryConfig.banking_transaction_customer_ids) && Intrinsics.areEqual(this.bitcoin_transaction_customer_ids, paymentHistoryConfig.bitcoin_transaction_customer_ids) && Intrinsics.areEqual(this.lending_transaction_customer_ids, paymentHistoryConfig.lending_transaction_customer_ids) && Intrinsics.areEqual(this.referral_customer_ids, paymentHistoryConfig.referral_customer_ids) && Intrinsics.areEqual(this.top_level_hidden_payment_types, paymentHistoryConfig.top_level_hidden_payment_types) && Intrinsics.areEqual(this.loyalty_merchant_payment_activity_hidden_payment_types, paymentHistoryConfig.loyalty_merchant_payment_activity_hidden_payment_types) && Intrinsics.areEqual(this.automated_investment_payment_types, paymentHistoryConfig.automated_investment_payment_types) && Intrinsics.areEqual(this.business_payments_customer_ids, paymentHistoryConfig.business_payments_customer_ids);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.script_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.search_script_url;
        int hashCode3 = this.business_payments_customer_ids.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.transfer_customer_ids), 37, this.banking_transaction_customer_ids), 37, this.bitcoin_transaction_customer_ids), 37, this.lending_transaction_customer_ids), 37, this.referral_customer_ids), 37, this.top_level_hidden_payment_types), 37, this.loyalty_merchant_payment_activity_hidden_payment_types), 37, this.automated_investment_payment_types);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Job.Builder builder = new Job.Builder(15);
        builder.token = this.script_url;
        builder.merchant_token = this.search_script_url;
        builder.title = this.transfer_customer_ids;
        builder.default_wage = this.banking_transaction_customer_ids;
        builder.created_at_timestamp_ms = this.bitcoin_transaction_customer_ids;
        builder.updated_at_timestamp_ms = this.lending_transaction_customer_ids;
        builder.deleted_at_timestamp_ms = this.referral_customer_ids;
        builder.team_member_count = this.top_level_hidden_payment_types;
        builder.version = this.loyalty_merchant_payment_activity_hidden_payment_types;
        builder.tip_eligible = this.automated_investment_payment_types;
        builder.default_color_scheme = this.business_payments_customer_ids;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.script_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "script_url=", arrayList);
        }
        String str2 = this.search_script_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "search_script_url=", arrayList);
        }
        List list = this.transfer_customer_ids;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("transfer_customer_ids=", arrayList, list);
        }
        List list2 = this.banking_transaction_customer_ids;
        if (!list2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("banking_transaction_customer_ids=", arrayList, list2);
        }
        List list3 = this.bitcoin_transaction_customer_ids;
        if (!list3.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("bitcoin_transaction_customer_ids=", arrayList, list3);
        }
        List list4 = this.lending_transaction_customer_ids;
        if (!list4.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("lending_transaction_customer_ids=", arrayList, list4);
        }
        List list5 = this.referral_customer_ids;
        if (!list5.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("referral_customer_ids=", arrayList, list5);
        }
        List list6 = this.top_level_hidden_payment_types;
        if (!list6.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("top_level_hidden_payment_types=", arrayList, list6);
        }
        List list7 = this.loyalty_merchant_payment_activity_hidden_payment_types;
        if (!list7.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("loyalty_merchant_payment_activity_hidden_payment_types=", arrayList, list7);
        }
        List list8 = this.automated_investment_payment_types;
        if (!list8.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("automated_investment_payment_types=", arrayList, list8);
        }
        List list9 = this.business_payments_customer_ids;
        if (!list9.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("business_payments_customer_ids=", arrayList, list9);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentHistoryConfig{", "}", 0, null, null, 56);
    }
}
