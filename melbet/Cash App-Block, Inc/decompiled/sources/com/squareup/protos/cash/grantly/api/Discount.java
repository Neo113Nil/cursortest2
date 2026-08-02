package com.squareup.protos.cash.grantly.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.protos.cash.client.ClientInfo;
import com.squareup.protos.cash.grantly.api.Action;
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
public final class Discount extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Discount> CREATOR;
    public final List allowed_authorization_channels;
    public final Integer bps;
    public final String description;
    public final String discount_key;
    public final String discount_token;
    public final Integer flat_discount;
    public final Boolean in_app_only;
    public final Integer max_campaign_discount;
    public final Integer max_daily_discount;
    public final Integer max_one_time_discount;
    public final Integer max_usage_count;
    public final Integer min_transaction_amount;
    public final PaymentMethodTarget payment_method_target;
    public final List targeted_customers;
    public final Integer total_discount_amount;

    public enum AuthorizationChannel implements WireEnum {
        IN_PERSON(1),
        ONLINE(2),
        IN_APP(3);

        public final int value;
        public static final ImageLayout.Companion Companion = new ImageLayout.Companion();
        public static final Discount$AuthorizationChannel$Companion$ADAPTER$1 ADAPTER = new Discount$AuthorizationChannel$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AuthorizationChannel.class), Syntax.PROTO_2, null);

        AuthorizationChannel(int i) {
            this.value = i;
        }

        public static final AuthorizationChannel fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return IN_PERSON;
            }
            if (i == 2) {
                return ONLINE;
            }
            if (i != 3) {
                return null;
            }
            return IN_APP;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum PaymentMethodTarget implements WireEnum {
        UNKNOWN(1),
        CASH_APP_PAY_ONLY(2),
        AGNOSTIC(3);

        public final int value;
        public static final Action.Type.Companion Companion = new Action.Type.Companion();
        public static final Discount$PaymentMethodTarget$Companion$ADAPTER$1 ADAPTER = new Discount$PaymentMethodTarget$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PaymentMethodTarget.class), Syntax.PROTO_2, null);

        PaymentMethodTarget(int i) {
            this.value = i;
        }

        public static final PaymentMethodTarget fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return UNKNOWN;
            }
            if (i == 2) {
                return CASH_APP_PAY_ONLY;
            }
            if (i != 3) {
                return null;
            }
            return AGNOSTIC;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Discount$Companion$ADAPTER$1 discount$Companion$ADAPTER$1 = new Discount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Discount.class), "type.googleapis.com/squareup.cash.grantly.api.Discount", Syntax.PROTO_2, null, "squareup/cash/grantly/api/preauthorize_payment_response.proto");
        ADAPTER = discount$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(discount$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Discount(String str, Integer num, Integer num2, String str2, Integer num3, Integer num4, Integer num5, Integer num6, String str3, List list, Integer num7, List list2, Boolean bool, Integer num8, PaymentMethodTarget paymentMethodTarget, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.discount_key = str;
        this.flat_discount = num;
        this.bps = num2;
        this.description = str2;
        this.max_one_time_discount = num3;
        this.max_daily_discount = num4;
        this.max_usage_count = num5;
        this.total_discount_amount = num6;
        this.discount_token = str3;
        this.max_campaign_discount = num7;
        this.in_app_only = bool;
        this.min_transaction_amount = num8;
        this.payment_method_target = paymentMethodTarget;
        this.allowed_authorization_channels = TransactorKt.immutableCopyOf("allowed_authorization_channels", list);
        this.targeted_customers = TransactorKt.immutableCopyOf("targeted_customers", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Discount)) {
            return false;
        }
        Discount discount = (Discount) obj;
        return Intrinsics.areEqual(unknownFields(), discount.unknownFields()) && Intrinsics.areEqual(this.discount_key, discount.discount_key) && Intrinsics.areEqual(this.flat_discount, discount.flat_discount) && Intrinsics.areEqual(this.bps, discount.bps) && Intrinsics.areEqual(this.description, discount.description) && Intrinsics.areEqual(this.max_one_time_discount, discount.max_one_time_discount) && Intrinsics.areEqual(this.max_daily_discount, discount.max_daily_discount) && Intrinsics.areEqual(this.max_usage_count, discount.max_usage_count) && Intrinsics.areEqual(this.total_discount_amount, discount.total_discount_amount) && Intrinsics.areEqual(this.discount_token, discount.discount_token) && Intrinsics.areEqual(this.allowed_authorization_channels, discount.allowed_authorization_channels) && Intrinsics.areEqual(this.max_campaign_discount, discount.max_campaign_discount) && Intrinsics.areEqual(this.targeted_customers, discount.targeted_customers) && Intrinsics.areEqual(this.in_app_only, discount.in_app_only) && Intrinsics.areEqual(this.min_transaction_amount, discount.min_transaction_amount) && this.payment_method_target == discount.payment_method_target;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.discount_key;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.flat_discount;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.bps;
        int hashCode4 = (hashCode3 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        String str2 = this.description;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num3 = this.max_one_time_discount;
        int hashCode6 = (hashCode5 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0)) * 37;
        Integer num4 = this.max_daily_discount;
        int hashCode7 = (hashCode6 + (num4 != null ? Integer.hashCode(num4.intValue()) : 0)) * 37;
        Integer num5 = this.max_usage_count;
        int hashCode8 = (hashCode7 + (num5 != null ? Integer.hashCode(num5.intValue()) : 0)) * 37;
        Integer num6 = this.total_discount_amount;
        int hashCode9 = (hashCode8 + (num6 != null ? Integer.hashCode(num6.intValue()) : 0)) * 37;
        String str3 = this.discount_token;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode9 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.allowed_authorization_channels);
        Integer num7 = this.max_campaign_discount;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((m + (num7 != null ? Integer.hashCode(num7.intValue()) : 0)) * 37, 37, this.targeted_customers);
        Boolean bool = this.in_app_only;
        int hashCode10 = (m2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Integer num8 = this.min_transaction_amount;
        int hashCode11 = (hashCode10 + (num8 != null ? Integer.hashCode(num8.intValue()) : 0)) * 37;
        PaymentMethodTarget paymentMethodTarget = this.payment_method_target;
        int hashCode12 = hashCode11 + (paymentMethodTarget != null ? paymentMethodTarget.hashCode() : 0);
        this.hashCode = hashCode12;
        return hashCode12;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClientInfo.Builder builder = new ClientInfo.Builder(3);
        builder.user_agent = this.discount_key;
        builder.client_scenario = this.flat_discount;
        builder.time_format = this.bps;
        builder.device_uuid = this.description;
        builder.ip_address = this.max_one_time_discount;
        builder.device_name = this.max_daily_discount;
        builder.accept_language = this.max_usage_count;
        builder.device_installation_id = this.total_discount_amount;
        builder.date_format = this.discount_token;
        builder.drm_id = this.allowed_authorization_channels;
        builder.device_vendor_id = this.max_campaign_discount;
        builder.device_id = this.targeted_customers;
        builder.threatmetrix_smart_id = this.in_app_only;
        builder.timestamp = this.min_transaction_amount;
        builder.navigation_paradigm = this.payment_method_target;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.discount_key;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "discount_key=", arrayList);
        }
        Integer num = this.flat_discount;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("flat_discount=", num, arrayList);
        }
        Integer num2 = this.bps;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("bps=", num2, arrayList);
        }
        String str2 = this.description;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
        }
        Integer num3 = this.max_one_time_discount;
        if (num3 != null) {
            re$$ExternalSyntheticOutline0.m("max_one_time_discount=", num3, arrayList);
        }
        Integer num4 = this.max_daily_discount;
        if (num4 != null) {
            re$$ExternalSyntheticOutline0.m("max_daily_discount=", num4, arrayList);
        }
        Integer num5 = this.max_usage_count;
        if (num5 != null) {
            re$$ExternalSyntheticOutline0.m("max_usage_count=", num5, arrayList);
        }
        Integer num6 = this.total_discount_amount;
        if (num6 != null) {
            re$$ExternalSyntheticOutline0.m("total_discount_amount=", num6, arrayList);
        }
        String str3 = this.discount_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "discount_token=", arrayList);
        }
        List list = this.allowed_authorization_channels;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("allowed_authorization_channels=", arrayList, list);
        }
        Integer num7 = this.max_campaign_discount;
        if (num7 != null) {
            re$$ExternalSyntheticOutline0.m("max_campaign_discount=", num7, arrayList);
        }
        List list2 = this.targeted_customers;
        if (!list2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("targeted_customers=", arrayList, list2);
        }
        Boolean bool = this.in_app_only;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("in_app_only=", bool, arrayList);
        }
        Integer num8 = this.min_transaction_amount;
        if (num8 != null) {
            re$$ExternalSyntheticOutline0.m("min_transaction_amount=", num8, arrayList);
        }
        PaymentMethodTarget paymentMethodTarget = this.payment_method_target;
        if (paymentMethodTarget != null) {
            arrayList.add("payment_method_target=" + paymentMethodTarget);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Discount{", "}", 0, null, null, 56);
    }
}
