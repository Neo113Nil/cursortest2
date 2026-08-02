package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.groups.Group;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalCheckoutBrandSummary extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalCheckoutBrandSummary> CREATOR;
    public final AfterPayConfiguration after_pay_configuration;
    public final Boolean allow_checkout_notes;
    public final LocalImage artwork_image;
    public final LocalColor background_color;
    public final LocalColor brand_card_outline_color;
    public final String cashtag;
    public final FeatureSet feature_set;
    public final String name;
    public final String policies;
    public final String token;

    public final class AfterPayConfiguration extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AfterPayConfiguration> CREATOR;
        public final Boolean enabled;
        public final LocalMoney maximum_order_total_required;
        public final LocalMoney minimum_order_total_required;

        static {
            LocalCheckoutBrandSummary$AfterPayConfiguration$Companion$ADAPTER$1 localCheckoutBrandSummary$AfterPayConfiguration$Companion$ADAPTER$1 = new LocalCheckoutBrandSummary$AfterPayConfiguration$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AfterPayConfiguration.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalCheckoutBrandSummary.AfterPayConfiguration", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_common.proto");
            ADAPTER = localCheckoutBrandSummary$AfterPayConfiguration$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localCheckoutBrandSummary$AfterPayConfiguration$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AfterPayConfiguration(Boolean bool, LocalMoney localMoney, LocalMoney localMoney2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.enabled = bool;
            this.minimum_order_total_required = localMoney;
            this.maximum_order_total_required = localMoney2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AfterPayConfiguration)) {
                return false;
            }
            AfterPayConfiguration afterPayConfiguration = (AfterPayConfiguration) obj;
            return Intrinsics.areEqual(unknownFields(), afterPayConfiguration.unknownFields()) && Intrinsics.areEqual(this.enabled, afterPayConfiguration.enabled) && Intrinsics.areEqual(this.minimum_order_total_required, afterPayConfiguration.minimum_order_total_required) && Intrinsics.areEqual(this.maximum_order_total_required, afterPayConfiguration.maximum_order_total_required);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Boolean bool = this.enabled;
            int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            LocalMoney localMoney = this.minimum_order_total_required;
            int hashCode3 = (hashCode2 + (localMoney != null ? localMoney.hashCode() : 0)) * 37;
            LocalMoney localMoney2 = this.maximum_order_total_required;
            int hashCode4 = hashCode3 + (localMoney2 != null ? localMoney2.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Group.Builder builder = new Group.Builder(25);
            builder.name = this.enabled;
            builder.group_image = this.minimum_order_total_required;
            builder.participants = this.maximum_order_total_required;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Boolean bool = this.enabled;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool, arrayList);
            }
            LocalMoney localMoney = this.minimum_order_total_required;
            if (localMoney != null) {
                SizeMode$EnumUnboxingLocalUtility.m("minimum_order_total_required=", localMoney, arrayList);
            }
            LocalMoney localMoney2 = this.maximum_order_total_required;
            if (localMoney2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("maximum_order_total_required=", localMoney2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AfterPayConfiguration{", "}", 0, null, null, 56);
        }
    }

    static {
        LocalCheckoutBrandSummary$Companion$ADAPTER$1 localCheckoutBrandSummary$Companion$ADAPTER$1 = new LocalCheckoutBrandSummary$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalCheckoutBrandSummary.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalCheckoutBrandSummary", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_common.proto");
        ADAPTER = localCheckoutBrandSummary$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localCheckoutBrandSummary$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalCheckoutBrandSummary(String str, Boolean bool, LocalImage localImage, String str2, LocalColor localColor, FeatureSet featureSet, String str3, LocalColor localColor2, String str4, AfterPayConfiguration afterPayConfiguration, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.allow_checkout_notes = bool;
        this.artwork_image = localImage;
        this.cashtag = str2;
        this.background_color = localColor;
        this.feature_set = featureSet;
        this.name = str3;
        this.brand_card_outline_color = localColor2;
        this.policies = str4;
        this.after_pay_configuration = afterPayConfiguration;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalCheckoutBrandSummary)) {
            return false;
        }
        LocalCheckoutBrandSummary localCheckoutBrandSummary = (LocalCheckoutBrandSummary) obj;
        return Intrinsics.areEqual(unknownFields(), localCheckoutBrandSummary.unknownFields()) && Intrinsics.areEqual(this.token, localCheckoutBrandSummary.token) && Intrinsics.areEqual(this.allow_checkout_notes, localCheckoutBrandSummary.allow_checkout_notes) && Intrinsics.areEqual(this.artwork_image, localCheckoutBrandSummary.artwork_image) && Intrinsics.areEqual(this.cashtag, localCheckoutBrandSummary.cashtag) && Intrinsics.areEqual(this.background_color, localCheckoutBrandSummary.background_color) && Intrinsics.areEqual(this.feature_set, localCheckoutBrandSummary.feature_set) && Intrinsics.areEqual(this.name, localCheckoutBrandSummary.name) && Intrinsics.areEqual(this.brand_card_outline_color, localCheckoutBrandSummary.brand_card_outline_color) && Intrinsics.areEqual(this.policies, localCheckoutBrandSummary.policies) && Intrinsics.areEqual(this.after_pay_configuration, localCheckoutBrandSummary.after_pay_configuration);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.allow_checkout_notes;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        LocalImage localImage = this.artwork_image;
        int hashCode4 = (hashCode3 + (localImage != null ? localImage.hashCode() : 0)) * 37;
        String str2 = this.cashtag;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalColor localColor = this.background_color;
        int hashCode6 = (hashCode5 + (localColor != null ? localColor.hashCode() : 0)) * 37;
        FeatureSet featureSet = this.feature_set;
        int hashCode7 = (hashCode6 + (featureSet != null ? featureSet.hashCode() : 0)) * 37;
        String str3 = this.name;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
        LocalColor localColor2 = this.brand_card_outline_color;
        int hashCode9 = (hashCode8 + (localColor2 != null ? localColor2.hashCode() : 0)) * 37;
        String str4 = this.policies;
        int hashCode10 = (hashCode9 + (str4 != null ? str4.hashCode() : 0)) * 37;
        AfterPayConfiguration afterPayConfiguration = this.after_pay_configuration;
        int hashCode11 = hashCode10 + (afterPayConfiguration != null ? afterPayConfiguration.hashCode() : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CashInRequest.Builder builder = new CashInRequest.Builder(9);
        builder.external_id = this.token;
        builder.request_context = this.allow_checkout_notes;
        builder.source = this.artwork_image;
        builder.passcode_token = this.cashtag;
        builder.target = this.background_color;
        builder.amount = this.feature_set;
        builder.external_client_transfer_token = this.name;
        builder.call_context = this.brand_card_outline_color;
        builder.forwarded_call_context = this.policies;
        builder.client_verified_digital_wallet = this.after_pay_configuration;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        Boolean bool = this.allow_checkout_notes;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("allow_checkout_notes=", bool, arrayList);
        }
        LocalImage localImage = this.artwork_image;
        if (localImage != null) {
            SizeMode$EnumUnboxingLocalUtility.m("artwork_image=", localImage, arrayList);
        }
        if (this.cashtag != null) {
            arrayList.add("cashtag=██");
        }
        LocalColor localColor = this.background_color;
        if (localColor != null) {
            SizeMode$EnumUnboxingLocalUtility.m("background_color=", localColor, arrayList);
        }
        FeatureSet featureSet = this.feature_set;
        if (featureSet != null) {
            arrayList.add("feature_set=" + featureSet);
        }
        String str2 = this.name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "name=", arrayList);
        }
        LocalColor localColor2 = this.brand_card_outline_color;
        if (localColor2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("brand_card_outline_color=", localColor2, arrayList);
        }
        String str3 = this.policies;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "policies=", arrayList);
        }
        AfterPayConfiguration afterPayConfiguration = this.after_pay_configuration;
        if (afterPayConfiguration != null) {
            arrayList.add("after_pay_configuration=" + afterPayConfiguration);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalCheckoutBrandSummary{", "}", 0, null, null, 56);
    }
}
