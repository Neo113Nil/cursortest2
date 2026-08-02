package com.squareup.protos.cash.cashface.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import app.cash.local.primitives.math.LocalMoneysKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aliases.Cashtag;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.genericelements.ui.Action;
import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.employeejobs.Job;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.ui.BlockState;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/cashface/api/GetProfileDetailsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/api/Error$Builder;", "Builder", "app/cash/local/primitives/math/LocalMoneysKt", "CustomerData", "MerchantData", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetProfileDetailsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetProfileDetailsResponse> CREATOR;
    public final AnalyticsData analytics_data;
    public final String bio;
    public final List elements;
    public final LocalMoneysKt entity_data;
    public final List generic_profile_elements;
    public final ReportState report_state;

    /* loaded from: classes7.dex */
    public final class CustomerData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CustomerData> CREATOR;
        public final BlockState blocked_state;
        public final String business_category;
        public final Boolean can_accept_payments;
        public final String cashtag;
        public final Integer credit_card_bps_fee_override;
        public final String display_name;
        public final Boolean is_business;
        public final Boolean is_cash_customer;
        public final Boolean is_verified;
        public final Image photo;
        public final Region region;

        static {
            GetProfileDetailsResponse$CustomerData$Companion$ADAPTER$1 getProfileDetailsResponse$CustomerData$Companion$ADAPTER$1 = new GetProfileDetailsResponse$CustomerData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CustomerData.class), "type.googleapis.com/squareup.cash.cashface.api.GetProfileDetailsResponse.CustomerData", Syntax.PROTO_2, null, "squareup/cash/cashface/api/ProfileDetails.proto");
            ADAPTER = getProfileDetailsResponse$CustomerData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getProfileDetailsResponse$CustomerData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomerData(String str, Image image, Region region, String str2, Boolean bool, Boolean bool2, Integer num, BlockState blockState, Boolean bool3, Boolean bool4, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.display_name = str;
            this.photo = image;
            this.region = region;
            this.cashtag = str2;
            this.is_business = bool;
            this.is_verified = bool2;
            this.credit_card_bps_fee_override = num;
            this.blocked_state = blockState;
            this.is_cash_customer = bool3;
            this.can_accept_payments = bool4;
            this.business_category = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CustomerData)) {
                return false;
            }
            CustomerData customerData = (CustomerData) obj;
            return Intrinsics.areEqual(unknownFields(), customerData.unknownFields()) && Intrinsics.areEqual(this.display_name, customerData.display_name) && Intrinsics.areEqual(this.photo, customerData.photo) && this.region == customerData.region && Intrinsics.areEqual(this.cashtag, customerData.cashtag) && Intrinsics.areEqual(this.is_business, customerData.is_business) && Intrinsics.areEqual(this.is_verified, customerData.is_verified) && Intrinsics.areEqual(this.credit_card_bps_fee_override, customerData.credit_card_bps_fee_override) && this.blocked_state == customerData.blocked_state && Intrinsics.areEqual(this.is_cash_customer, customerData.is_cash_customer) && Intrinsics.areEqual(this.can_accept_payments, customerData.can_accept_payments) && Intrinsics.areEqual(this.business_category, customerData.business_category);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.display_name;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            Image image = this.photo;
            int hashCode3 = (hashCode2 + (image != null ? image.hashCode() : 0)) * 37;
            Region region = this.region;
            int hashCode4 = (hashCode3 + (region != null ? region.hashCode() : 0)) * 37;
            String str2 = this.cashtag;
            int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Boolean bool = this.is_business;
            int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Boolean bool2 = this.is_verified;
            int hashCode7 = (hashCode6 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
            Integer num = this.credit_card_bps_fee_override;
            int hashCode8 = (hashCode7 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            BlockState blockState = this.blocked_state;
            int hashCode9 = (hashCode8 + (blockState != null ? blockState.hashCode() : 0)) * 37;
            Boolean bool3 = this.is_cash_customer;
            int hashCode10 = (hashCode9 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
            Boolean bool4 = this.can_accept_payments;
            int hashCode11 = (hashCode10 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
            String str3 = this.business_category;
            int hashCode12 = hashCode11 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode12;
            return hashCode12;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Job.Builder builder = new Job.Builder(4);
            builder.token = this.display_name;
            builder.default_wage = this.photo;
            builder.created_at_timestamp_ms = this.region;
            builder.merchant_token = this.cashtag;
            builder.tip_eligible = this.is_business;
            builder.updated_at_timestamp_ms = this.is_verified;
            builder.deleted_at_timestamp_ms = this.credit_card_bps_fee_override;
            builder.team_member_count = this.blocked_state;
            builder.version = this.is_cash_customer;
            builder.default_color_scheme = this.can_accept_payments;
            builder.title = this.business_category;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.display_name != null) {
                arrayList.add("display_name=██");
            }
            if (this.photo != null) {
                arrayList.add("photo=██");
            }
            if (this.region != null) {
                arrayList.add("region=██");
            }
            if (this.cashtag != null) {
                arrayList.add("cashtag=██");
            }
            Boolean bool = this.is_business;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_business=", bool, arrayList);
            }
            Boolean bool2 = this.is_verified;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_verified=", bool2, arrayList);
            }
            Integer num = this.credit_card_bps_fee_override;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("credit_card_bps_fee_override=", num, arrayList);
            }
            BlockState blockState = this.blocked_state;
            if (blockState != null) {
                arrayList.add("blocked_state=" + blockState);
            }
            Boolean bool3 = this.is_cash_customer;
            if (bool3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_cash_customer=", bool3, arrayList);
            }
            Boolean bool4 = this.can_accept_payments;
            if (bool4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("can_accept_payments=", bool4, arrayList);
            }
            String str = this.business_category;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "business_category=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CustomerData{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes7.dex */
    public final class MerchantData extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<MerchantData> CREATOR;
        public final Color brand_color;
        public final String canonical_category;
        public final Image header_image_url;
        public final Image logo_url;
        public final MerchantProfileImage merchant_logo_url;
        public final String merchant_token;
        public final String name;
        public final Action passive_action;
        public final Boolean should_colorize_avatar;
        public final Boolean should_fill_background;
        public final AnalyticsEvent view_event;

        public final class MerchantProfileImage extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<MerchantProfileImage> CREATOR;
            public final String dark_url;
            public final String light_url;

            static {
                GetProfileDetailsResponse$MerchantData$MerchantProfileImage$Companion$ADAPTER$1 getProfileDetailsResponse$MerchantData$MerchantProfileImage$Companion$ADAPTER$1 = new GetProfileDetailsResponse$MerchantData$MerchantProfileImage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MerchantProfileImage.class), "type.googleapis.com/squareup.cash.cashface.api.GetProfileDetailsResponse.MerchantData.MerchantProfileImage", Syntax.PROTO_2, null, "squareup/cash/cashface/api/ProfileDetails.proto");
                ADAPTER = getProfileDetailsResponse$MerchantData$MerchantProfileImage$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(getProfileDetailsResponse$MerchantData$MerchantProfileImage$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MerchantProfileImage(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.light_url = str;
                this.dark_url = str2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof MerchantProfileImage)) {
                    return false;
                }
                MerchantProfileImage merchantProfileImage = (MerchantProfileImage) obj;
                return Intrinsics.areEqual(unknownFields(), merchantProfileImage.unknownFields()) && Intrinsics.areEqual(this.light_url, merchantProfileImage.light_url) && Intrinsics.areEqual(this.dark_url, merchantProfileImage.dark_url);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.light_url;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.dark_url;
                int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Cashtag.Builder builder = new Cashtag.Builder(15);
                builder.prefix = this.light_url;
                builder.name = this.dark_url;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                if (this.light_url != null) {
                    arrayList.add("light_url=██");
                }
                if (this.dark_url != null) {
                    arrayList.add("dark_url=██");
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "MerchantProfileImage{", "}", 0, null, null, 56);
            }
        }

        static {
            GetProfileDetailsResponse$MerchantData$Companion$ADAPTER$1 getProfileDetailsResponse$MerchantData$Companion$ADAPTER$1 = new GetProfileDetailsResponse$MerchantData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MerchantData.class), "type.googleapis.com/squareup.cash.cashface.api.GetProfileDetailsResponse.MerchantData", Syntax.PROTO_2, null, "squareup/cash/cashface/api/ProfileDetails.proto");
            ADAPTER = getProfileDetailsResponse$MerchantData$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getProfileDetailsResponse$MerchantData$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MerchantData(String str, String str2, Image image, Color color, Boolean bool, Boolean bool2, String str3, AnalyticsEvent analyticsEvent, Image image2, MerchantProfileImage merchantProfileImage, Action action, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.name = str;
            this.canonical_category = str2;
            this.logo_url = image;
            this.brand_color = color;
            this.should_colorize_avatar = bool;
            this.should_fill_background = bool2;
            this.merchant_token = str3;
            this.view_event = analyticsEvent;
            this.header_image_url = image2;
            this.merchant_logo_url = merchantProfileImage;
            this.passive_action = action;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MerchantData)) {
                return false;
            }
            MerchantData merchantData = (MerchantData) obj;
            return Intrinsics.areEqual(unknownFields(), merchantData.unknownFields()) && Intrinsics.areEqual(this.name, merchantData.name) && Intrinsics.areEqual(this.canonical_category, merchantData.canonical_category) && Intrinsics.areEqual(this.logo_url, merchantData.logo_url) && Intrinsics.areEqual(this.brand_color, merchantData.brand_color) && Intrinsics.areEqual(this.should_colorize_avatar, merchantData.should_colorize_avatar) && Intrinsics.areEqual(this.should_fill_background, merchantData.should_fill_background) && Intrinsics.areEqual(this.merchant_token, merchantData.merchant_token) && Intrinsics.areEqual(this.view_event, merchantData.view_event) && Intrinsics.areEqual(this.header_image_url, merchantData.header_image_url) && Intrinsics.areEqual(this.merchant_logo_url, merchantData.merchant_logo_url) && Intrinsics.areEqual(this.passive_action, merchantData.passive_action);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.name;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.canonical_category;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Image image = this.logo_url;
            int hashCode4 = (hashCode3 + (image != null ? image.hashCode() : 0)) * 37;
            Color color = this.brand_color;
            int hashCode5 = (hashCode4 + (color != null ? color.hashCode() : 0)) * 37;
            Boolean bool = this.should_colorize_avatar;
            int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Boolean bool2 = this.should_fill_background;
            int hashCode7 = (hashCode6 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
            String str3 = this.merchant_token;
            int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
            AnalyticsEvent analyticsEvent = this.view_event;
            int hashCode9 = (hashCode8 + (analyticsEvent != null ? analyticsEvent.hashCode() : 0)) * 37;
            Image image2 = this.header_image_url;
            int hashCode10 = (hashCode9 + (image2 != null ? image2.hashCode() : 0)) * 37;
            MerchantProfileImage merchantProfileImage = this.merchant_logo_url;
            int hashCode11 = (hashCode10 + (merchantProfileImage != null ? merchantProfileImage.hashCode() : 0)) * 37;
            Action action = this.passive_action;
            int hashCode12 = hashCode11 + (action != null ? action.hashCode() : 0);
            this.hashCode = hashCode12;
            return hashCode12;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Job.Builder builder = new Job.Builder(5);
            builder.token = this.name;
            builder.merchant_token = this.canonical_category;
            builder.default_wage = this.logo_url;
            builder.created_at_timestamp_ms = this.brand_color;
            builder.tip_eligible = this.should_colorize_avatar;
            builder.updated_at_timestamp_ms = this.should_fill_background;
            builder.title = this.merchant_token;
            builder.deleted_at_timestamp_ms = this.view_event;
            builder.team_member_count = this.header_image_url;
            builder.version = this.merchant_logo_url;
            builder.default_color_scheme = this.passive_action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.name != null) {
                arrayList.add("name=██");
            }
            String str = this.canonical_category;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "canonical_category=", arrayList);
            }
            if (this.logo_url != null) {
                arrayList.add("logo_url=██");
            }
            if (this.brand_color != null) {
                arrayList.add("brand_color=██");
            }
            Boolean bool = this.should_colorize_avatar;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("should_colorize_avatar=", bool, arrayList);
            }
            Boolean bool2 = this.should_fill_background;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("should_fill_background=", bool2, arrayList);
            }
            String str2 = this.merchant_token;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "merchant_token=", arrayList);
            }
            AnalyticsEvent analyticsEvent = this.view_event;
            if (analyticsEvent != null) {
                arrayList.add("view_event=" + analyticsEvent);
            }
            if (this.header_image_url != null) {
                arrayList.add("header_image_url=██");
            }
            if (this.merchant_logo_url != null) {
                arrayList.add("merchant_logo_url=██");
            }
            Action action = this.passive_action;
            if (action != null) {
                arrayList.add("passive_action=" + action);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "MerchantData{", "}", 0, null, null, 56);
        }
    }

    static {
        GetProfileDetailsResponse$Companion$ADAPTER$1 getProfileDetailsResponse$Companion$ADAPTER$1 = new GetProfileDetailsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetProfileDetailsResponse.class), "type.googleapis.com/squareup.cash.cashface.api.GetProfileDetailsResponse", Syntax.PROTO_2, null, "squareup/cash/cashface/api/ProfileDetails.proto");
        ADAPTER = getProfileDetailsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getProfileDetailsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetProfileDetailsResponse(String str, List list, ReportState reportState, List list2, AnalyticsData analyticsData, LocalMoneysKt localMoneysKt, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        reportState.getClass();
        list2.getClass();
        byteString.getClass();
        this.bio = str;
        this.report_state = reportState;
        this.analytics_data = analyticsData;
        this.entity_data = localMoneysKt;
        this.elements = TransactorKt.immutableCopyOf("elements", list);
        this.generic_profile_elements = TransactorKt.immutableCopyOf("generic_profile_elements", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetProfileDetailsResponse)) {
            return false;
        }
        GetProfileDetailsResponse getProfileDetailsResponse = (GetProfileDetailsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getProfileDetailsResponse.unknownFields()) && Intrinsics.areEqual(this.bio, getProfileDetailsResponse.bio) && Intrinsics.areEqual(this.elements, getProfileDetailsResponse.elements) && this.report_state == getProfileDetailsResponse.report_state && Intrinsics.areEqual(this.generic_profile_elements, getProfileDetailsResponse.generic_profile_elements) && Intrinsics.areEqual(this.analytics_data, getProfileDetailsResponse.analytics_data) && Intrinsics.areEqual(this.entity_data, getProfileDetailsResponse.entity_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.bio;
        int m = Recorder$$ExternalSyntheticOutline2.m((this.report_state.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.elements)) * 37, 37, this.generic_profile_elements);
        AnalyticsData analyticsData = this.analytics_data;
        int hashCode2 = (m + (analyticsData != null ? analyticsData.hashCode() : 0)) * 37;
        LocalMoneysKt localMoneysKt = this.entity_data;
        int hashCode3 = hashCode2 + (localMoneysKt != null ? localMoneysKt.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(17);
        builder.description = this.bio;
        builder.category = this.elements;
        builder.code = this.report_state;
        builder.field = this.generic_profile_elements;
        builder.retryable = this.analytics_data;
        builder.metadata = this.entity_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.bio != null) {
            arrayList.add("bio=██");
        }
        List list = this.elements;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("elements=", arrayList, list);
        }
        arrayList.add("report_state=" + this.report_state);
        List list2 = this.generic_profile_elements;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("generic_profile_elements=", arrayList, list2);
        }
        AnalyticsData analyticsData = this.analytics_data;
        if (analyticsData != null) {
            arrayList.add("analytics_data=" + analyticsData);
        }
        LocalMoneysKt localMoneysKt = this.entity_data;
        if (localMoneysKt != null) {
            arrayList.add("entity_data=" + localMoneysKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetProfileDetailsResponse{", "}", 0, null, null, 56);
    }
}
