package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.p2pencore.v1.Date;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.groups.Group;
import com.squareup.protos.cash.groups.SliceStatus;
import com.squareup.protos.cash.investcrypto.resources.Origin;
import com.squareup.protos.franklin.app.CheckRewardCodeResponse;
import com.squareup.protos.giftly.GiftCard;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalBrand extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalBrand> CREATOR;
    public final Boolean allow_checkout_notes;
    public final LocalImage artwork_image;
    public final LocalColor background_color;
    public final Banner banner;
    public final LocalColor brand_card_outline_color;
    public final LocalBrand$CashBackOffer$Percentage cash_back_offer;
    public final String cashtag;
    public final String category;
    public final Long customer_added_count;
    public final String description;
    public final LocalEstimatedCompletionDuration estimated_pickup_wait_time;
    public final FeatureSet feature_set;
    public final LocalColor foreground_color;
    public final FulfillmentSelection fulfillment_selection;
    public final LocalImage hero_image;
    public final LocationFulfillmentSummary location_fulfillment_summary;
    public final LocalMiniCard mini_card;
    public final String name;
    public final List nearby_locations;
    public final String policies;
    public final LocalCashConfiguration redeemable_local_bux;
    public final RequiredLocationSelection required_location_selection;
    public final LocalLocationDetail selected_location;
    public final String token;
    public final WebLayoutType web_layout_type;

    public enum Banner implements WireEnum {
        BANNER_UNSPECIFIED(0),
        BANNER_ENROLL(1),
        BANNER_ADD_BRAND_OR_REMOVE(2);

        public static final LocalBrand$Banner$Companion$ADAPTER$1 ADAPTER;
        public static final Origin.Companion Companion;
        public final int value;

        static {
            Banner banner = BANNER_UNSPECIFIED;
            Companion = new Origin.Companion();
            ADAPTER = new LocalBrand$Banner$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Banner.class), Syntax.PROTO_2, banner);
        }

        Banner(int i) {
            this.value = i;
        }

        public static final Banner fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return BANNER_UNSPECIFIED;
            }
            if (i == 1) {
                return BANNER_ENROLL;
            }
            if (i != 2) {
                return null;
            }
            return BANNER_ADD_BRAND_OR_REMOVE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class FulfillmentSelection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<FulfillmentSelection> CREATOR;
        public final List available_fulfillment_types;
        public final LocalFulfillmentType previous_fulfillment_method_used;
        public final List saved_delivery_addresses;

        static {
            LocalBrand$FulfillmentSelection$Companion$ADAPTER$1 localBrand$FulfillmentSelection$Companion$ADAPTER$1 = new LocalBrand$FulfillmentSelection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FulfillmentSelection.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalBrand.FulfillmentSelection", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_brand.proto");
            ADAPTER = localBrand$FulfillmentSelection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localBrand$FulfillmentSelection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FulfillmentSelection(List list, List list2, LocalFulfillmentType localFulfillmentType, ByteString byteString) {
            super(ADAPTER, byteString);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
            this.previous_fulfillment_method_used = localFulfillmentType;
            this.available_fulfillment_types = TransactorKt.immutableCopyOf("available_fulfillment_types", list);
            this.saved_delivery_addresses = TransactorKt.immutableCopyOf("saved_delivery_addresses", list2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FulfillmentSelection)) {
                return false;
            }
            FulfillmentSelection fulfillmentSelection = (FulfillmentSelection) obj;
            return Intrinsics.areEqual(unknownFields(), fulfillmentSelection.unknownFields()) && Intrinsics.areEqual(this.available_fulfillment_types, fulfillmentSelection.available_fulfillment_types) && Intrinsics.areEqual(this.saved_delivery_addresses, fulfillmentSelection.saved_delivery_addresses) && this.previous_fulfillment_method_used == fulfillmentSelection.previous_fulfillment_method_used;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.available_fulfillment_types), 37, this.saved_delivery_addresses);
            LocalFulfillmentType localFulfillmentType = this.previous_fulfillment_method_used;
            int hashCode = m + (localFulfillmentType != null ? localFulfillmentType.hashCode() : 0);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Group.Builder builder = new Group.Builder(23);
            builder.participants = this.available_fulfillment_types;
            builder.name = this.saved_delivery_addresses;
            builder.group_image = this.previous_fulfillment_method_used;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.available_fulfillment_types;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("available_fulfillment_types=", arrayList, list);
            }
            List list2 = this.saved_delivery_addresses;
            if (!list2.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("saved_delivery_addresses=", arrayList, list2);
            }
            LocalFulfillmentType localFulfillmentType = this.previous_fulfillment_method_used;
            if (localFulfillmentType != null) {
                arrayList.add("previous_fulfillment_method_used=" + localFulfillmentType);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "FulfillmentSelection{", "}", 0, null, null, 56);
        }
    }

    public final class LocationFulfillmentSummary extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LocationFulfillmentSummary> CREATOR;
        public final Integer num_delivery_locations;
        public final Integer num_pickup_locations;
        public final Integer total_locations;

        static {
            LocalBrand$LocationFulfillmentSummary$Companion$ADAPTER$1 localBrand$LocationFulfillmentSummary$Companion$ADAPTER$1 = new LocalBrand$LocationFulfillmentSummary$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocationFulfillmentSummary.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalBrand.LocationFulfillmentSummary", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_brand.proto");
            ADAPTER = localBrand$LocationFulfillmentSummary$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localBrand$LocationFulfillmentSummary$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocationFulfillmentSummary(Integer num, Integer num2, Integer num3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.num_pickup_locations = num;
            this.num_delivery_locations = num2;
            this.total_locations = num3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LocationFulfillmentSummary)) {
                return false;
            }
            LocationFulfillmentSummary locationFulfillmentSummary = (LocationFulfillmentSummary) obj;
            return Intrinsics.areEqual(unknownFields(), locationFulfillmentSummary.unknownFields()) && Intrinsics.areEqual(this.num_pickup_locations, locationFulfillmentSummary.num_pickup_locations) && Intrinsics.areEqual(this.num_delivery_locations, locationFulfillmentSummary.num_delivery_locations) && Intrinsics.areEqual(this.total_locations, locationFulfillmentSummary.total_locations);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.num_pickup_locations;
            int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Integer num2 = this.num_delivery_locations;
            int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
            Integer num3 = this.total_locations;
            int hashCode4 = hashCode3 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Date.Builder builder = new Date.Builder(1);
            builder.year = this.num_pickup_locations;
            builder.month = this.num_delivery_locations;
            builder.day = this.total_locations;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Integer num = this.num_pickup_locations;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("num_pickup_locations=", num, arrayList);
            }
            Integer num2 = this.num_delivery_locations;
            if (num2 != null) {
                re$$ExternalSyntheticOutline0.m("num_delivery_locations=", num2, arrayList);
            }
            Integer num3 = this.total_locations;
            if (num3 != null) {
                re$$ExternalSyntheticOutline0.m("total_locations=", num3, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LocationFulfillmentSummary{", "}", 0, null, null, 56);
        }
    }

    public final class RequiredLocationSelection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<RequiredLocationSelection> CREATOR;
        public final String cancel_button_title;
        public final String confirm_button_title;
        public final String prompt_subtitle;
        public final String prompt_title;
        public final Boolean selected_location_is_default;

        static {
            LocalBrand$RequiredLocationSelection$Companion$ADAPTER$1 localBrand$RequiredLocationSelection$Companion$ADAPTER$1 = new LocalBrand$RequiredLocationSelection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RequiredLocationSelection.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalBrand.RequiredLocationSelection", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_brand.proto");
            ADAPTER = localBrand$RequiredLocationSelection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(localBrand$RequiredLocationSelection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequiredLocationSelection(String str, String str2, String str3, String str4, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.prompt_title = str;
            this.prompt_subtitle = str2;
            this.confirm_button_title = str3;
            this.cancel_button_title = str4;
            this.selected_location_is_default = bool;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RequiredLocationSelection)) {
                return false;
            }
            RequiredLocationSelection requiredLocationSelection = (RequiredLocationSelection) obj;
            return Intrinsics.areEqual(unknownFields(), requiredLocationSelection.unknownFields()) && Intrinsics.areEqual(this.prompt_title, requiredLocationSelection.prompt_title) && Intrinsics.areEqual(this.prompt_subtitle, requiredLocationSelection.prompt_subtitle) && Intrinsics.areEqual(this.confirm_button_title, requiredLocationSelection.confirm_button_title) && Intrinsics.areEqual(this.cancel_button_title, requiredLocationSelection.cancel_button_title) && Intrinsics.areEqual(this.selected_location_is_default, requiredLocationSelection.selected_location_is_default);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.prompt_title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.prompt_subtitle;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.confirm_button_title;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.cancel_button_title;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
            Boolean bool = this.selected_location_is_default;
            int hashCode6 = hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CheckRewardCodeResponse.Builder builder = new CheckRewardCodeResponse.Builder(2);
            builder.reward_text = this.prompt_title;
            builder.inviter_photo_url = this.prompt_subtitle;
            builder.inviter_full_name = this.confirm_button_title;
            builder.inviter_customer_token = this.cancel_button_title;
            builder.valid = this.selected_location_is_default;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.prompt_title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "prompt_title=", arrayList);
            }
            String str2 = this.prompt_subtitle;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "prompt_subtitle=", arrayList);
            }
            String str3 = this.confirm_button_title;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "confirm_button_title=", arrayList);
            }
            String str4 = this.cancel_button_title;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "cancel_button_title=", arrayList);
            }
            Boolean bool = this.selected_location_is_default;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("selected_location_is_default=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "RequiredLocationSelection{", "}", 0, null, null, 56);
        }
    }

    public enum WebLayoutType implements WireEnum {
        WEB_LAYOUT_TYPE_UNSPECIFIED(0),
        WEB_LAYOUT_TYPE_DEFAULT(1),
        WEB_LAYOUT_TYPE_CARD(2);

        public static final LocalBrand$WebLayoutType$Companion$ADAPTER$1 ADAPTER;
        public static final SliceStatus.Companion Companion;
        public final int value;

        static {
            WebLayoutType webLayoutType = WEB_LAYOUT_TYPE_UNSPECIFIED;
            Companion = new SliceStatus.Companion();
            ADAPTER = new LocalBrand$WebLayoutType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(WebLayoutType.class), Syntax.PROTO_2, webLayoutType);
        }

        WebLayoutType(int i) {
            this.value = i;
        }

        public static final WebLayoutType fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return WEB_LAYOUT_TYPE_UNSPECIFIED;
            }
            if (i == 1) {
                return WEB_LAYOUT_TYPE_DEFAULT;
            }
            if (i != 2) {
                return null;
            }
            return WEB_LAYOUT_TYPE_CARD;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        LocalBrand$Companion$ADAPTER$1 localBrand$Companion$ADAPTER$1 = new LocalBrand$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalBrand.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalBrand", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_brand.proto");
        ADAPTER = localBrand$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localBrand$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrand(String str, String str2, LocalColor localColor, LocalColor localColor2, LocalImage localImage, LocalBrand$CashBackOffer$Percentage localBrand$CashBackOffer$Percentage, Long l, LocalLocationDetail localLocationDetail, List list, String str3, String str4, LocalMiniCard localMiniCard, Banner banner, LocalCashConfiguration localCashConfiguration, LocalEstimatedCompletionDuration localEstimatedCompletionDuration, RequiredLocationSelection requiredLocationSelection, LocalImage localImage2, String str5, WebLayoutType webLayoutType, FeatureSet featureSet, FulfillmentSelection fulfillmentSelection, LocationFulfillmentSummary locationFulfillmentSummary, Boolean bool, LocalColor localColor3, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        list.getClass();
        byteString.getClass();
        this.token = str;
        this.name = str2;
        this.foreground_color = localColor;
        this.background_color = localColor2;
        this.hero_image = localImage;
        this.cash_back_offer = localBrand$CashBackOffer$Percentage;
        this.customer_added_count = l;
        this.selected_location = localLocationDetail;
        this.description = str3;
        this.category = str4;
        this.mini_card = localMiniCard;
        this.banner = banner;
        this.redeemable_local_bux = localCashConfiguration;
        this.estimated_pickup_wait_time = localEstimatedCompletionDuration;
        this.required_location_selection = requiredLocationSelection;
        this.artwork_image = localImage2;
        this.cashtag = str5;
        this.web_layout_type = webLayoutType;
        this.feature_set = featureSet;
        this.fulfillment_selection = fulfillmentSelection;
        this.location_fulfillment_summary = locationFulfillmentSummary;
        this.allow_checkout_notes = bool;
        this.brand_card_outline_color = localColor3;
        this.policies = str6;
        this.nearby_locations = TransactorKt.immutableCopyOf("nearby_locations", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalBrand)) {
            return false;
        }
        LocalBrand localBrand = (LocalBrand) obj;
        return Intrinsics.areEqual(unknownFields(), localBrand.unknownFields()) && Intrinsics.areEqual(this.token, localBrand.token) && Intrinsics.areEqual(this.name, localBrand.name) && Intrinsics.areEqual(this.foreground_color, localBrand.foreground_color) && Intrinsics.areEqual(this.background_color, localBrand.background_color) && Intrinsics.areEqual(this.hero_image, localBrand.hero_image) && Intrinsics.areEqual(this.cash_back_offer, localBrand.cash_back_offer) && Intrinsics.areEqual(this.customer_added_count, localBrand.customer_added_count) && Intrinsics.areEqual(this.selected_location, localBrand.selected_location) && Intrinsics.areEqual(this.nearby_locations, localBrand.nearby_locations) && Intrinsics.areEqual(this.description, localBrand.description) && Intrinsics.areEqual(this.category, localBrand.category) && Intrinsics.areEqual(this.mini_card, localBrand.mini_card) && this.banner == localBrand.banner && Intrinsics.areEqual(this.redeemable_local_bux, localBrand.redeemable_local_bux) && Intrinsics.areEqual(this.estimated_pickup_wait_time, localBrand.estimated_pickup_wait_time) && Intrinsics.areEqual(this.required_location_selection, localBrand.required_location_selection) && Intrinsics.areEqual(this.artwork_image, localBrand.artwork_image) && Intrinsics.areEqual(this.cashtag, localBrand.cashtag) && this.web_layout_type == localBrand.web_layout_type && Intrinsics.areEqual(this.feature_set, localBrand.feature_set) && Intrinsics.areEqual(this.fulfillment_selection, localBrand.fulfillment_selection) && Intrinsics.areEqual(this.location_fulfillment_summary, localBrand.location_fulfillment_summary) && Intrinsics.areEqual(this.allow_checkout_notes, localBrand.allow_checkout_notes) && Intrinsics.areEqual(this.brand_card_outline_color, localBrand.brand_card_outline_color) && Intrinsics.areEqual(this.policies, localBrand.policies);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.token);
        String str = this.name;
        int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
        LocalColor localColor = this.foreground_color;
        int hashCode2 = (hashCode + (localColor != null ? localColor.hashCode() : 0)) * 37;
        LocalColor localColor2 = this.background_color;
        int hashCode3 = (hashCode2 + (localColor2 != null ? localColor2.hashCode() : 0)) * 37;
        LocalImage localImage = this.hero_image;
        int hashCode4 = (hashCode3 + (localImage != null ? localImage.hashCode() : 0)) * 37;
        LocalBrand$CashBackOffer$Percentage localBrand$CashBackOffer$Percentage = this.cash_back_offer;
        int hashCode5 = (hashCode4 + (localBrand$CashBackOffer$Percentage != null ? localBrand$CashBackOffer$Percentage.value.hashCode() : 0)) * 37;
        Long l = this.customer_added_count;
        int hashCode6 = (hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        LocalLocationDetail localLocationDetail = this.selected_location;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (localLocationDetail != null ? localLocationDetail.hashCode() : 0)) * 37, 37, this.nearby_locations);
        String str2 = this.description;
        int hashCode7 = (m2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.category;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
        LocalMiniCard localMiniCard = this.mini_card;
        int hashCode9 = (hashCode8 + (localMiniCard != null ? localMiniCard.hashCode() : 0)) * 37;
        Banner banner = this.banner;
        int hashCode10 = (hashCode9 + (banner != null ? banner.hashCode() : 0)) * 37;
        LocalCashConfiguration localCashConfiguration = this.redeemable_local_bux;
        int hashCode11 = (hashCode10 + (localCashConfiguration != null ? localCashConfiguration.hashCode() : 0)) * 37;
        LocalEstimatedCompletionDuration localEstimatedCompletionDuration = this.estimated_pickup_wait_time;
        int hashCode12 = (hashCode11 + (localEstimatedCompletionDuration != null ? localEstimatedCompletionDuration.hashCode() : 0)) * 37;
        RequiredLocationSelection requiredLocationSelection = this.required_location_selection;
        int hashCode13 = (hashCode12 + (requiredLocationSelection != null ? requiredLocationSelection.hashCode() : 0)) * 37;
        LocalImage localImage2 = this.artwork_image;
        int hashCode14 = (hashCode13 + (localImage2 != null ? localImage2.hashCode() : 0)) * 37;
        String str4 = this.cashtag;
        int hashCode15 = (hashCode14 + (str4 != null ? str4.hashCode() : 0)) * 37;
        WebLayoutType webLayoutType = this.web_layout_type;
        int hashCode16 = (hashCode15 + (webLayoutType != null ? webLayoutType.hashCode() : 0)) * 37;
        FeatureSet featureSet = this.feature_set;
        int hashCode17 = (hashCode16 + (featureSet != null ? featureSet.hashCode() : 0)) * 37;
        FulfillmentSelection fulfillmentSelection = this.fulfillment_selection;
        int hashCode18 = (hashCode17 + (fulfillmentSelection != null ? fulfillmentSelection.hashCode() : 0)) * 37;
        LocationFulfillmentSummary locationFulfillmentSummary = this.location_fulfillment_summary;
        int hashCode19 = (hashCode18 + (locationFulfillmentSummary != null ? locationFulfillmentSummary.hashCode() : 0)) * 37;
        Boolean bool = this.allow_checkout_notes;
        int hashCode20 = (hashCode19 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        LocalColor localColor3 = this.brand_card_outline_color;
        int hashCode21 = (hashCode20 + (localColor3 != null ? localColor3.hashCode() : 0)) * 37;
        String str5 = this.policies;
        int hashCode22 = hashCode21 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode22;
        return hashCode22;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Builder builder = new GiftCard.Builder(2);
        builder.token = this.token;
        builder.status = this.name;
        builder.current_amount_text = this.foreground_color;
        builder.stored_value_balance_token = this.background_color;
        builder.gift_card_type_description = this.hero_image;
        builder.current_status_description_text = this.cash_back_offer;
        builder.preview_title = this.customer_added_count;
        builder.localizable_title = this.selected_location;
        builder.details = this.nearby_locations;
        builder.title = this.description;
        builder.subtitle = this.category;
        builder.localizable_subtitle = this.mini_card;
        builder.localizable_activation_text = this.banner;
        builder.localizable_original_amount_text = this.redeemable_local_bux;
        builder.localizable_current_amount_text = this.estimated_pickup_wait_time;
        builder.localizable_gift_card_type_description = this.required_location_selection;
        builder.localizable_current_status_description_text = this.artwork_image;
        builder.activation_text = this.cashtag;
        builder.localizable_preview_title = this.web_layout_type;
        builder.themed_color = this.feature_set;
        builder.logo = this.fulfillment_selection;
        builder.card = this.location_fulfillment_summary;
        builder.senders = this.allow_checkout_notes;
        builder.options = this.brand_card_outline_color;
        builder.original_amount_text = this.policies;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.token, "token=", arrayList);
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        LocalColor localColor = this.foreground_color;
        if (localColor != null) {
            SizeMode$EnumUnboxingLocalUtility.m("foreground_color=", localColor, arrayList);
        }
        LocalColor localColor2 = this.background_color;
        if (localColor2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("background_color=", localColor2, arrayList);
        }
        LocalImage localImage = this.hero_image;
        if (localImage != null) {
            SizeMode$EnumUnboxingLocalUtility.m("hero_image=", localImage, arrayList);
        }
        LocalBrand$CashBackOffer$Percentage localBrand$CashBackOffer$Percentage = this.cash_back_offer;
        if (localBrand$CashBackOffer$Percentage != null) {
            arrayList.add("cash_back_offer=" + localBrand$CashBackOffer$Percentage);
        }
        Long l = this.customer_added_count;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("customer_added_count=", l, arrayList);
        }
        LocalLocationDetail localLocationDetail = this.selected_location;
        if (localLocationDetail != null) {
            arrayList.add("selected_location=" + localLocationDetail);
        }
        List list = this.nearby_locations;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("nearby_locations=", arrayList, list);
        }
        String str2 = this.description;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "description=", arrayList);
        }
        String str3 = this.category;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "category=", arrayList);
        }
        LocalMiniCard localMiniCard = this.mini_card;
        if (localMiniCard != null) {
            arrayList.add("mini_card=" + localMiniCard);
        }
        Banner banner = this.banner;
        if (banner != null) {
            arrayList.add("banner=" + banner);
        }
        LocalCashConfiguration localCashConfiguration = this.redeemable_local_bux;
        if (localCashConfiguration != null) {
            arrayList.add("redeemable_local_bux=" + localCashConfiguration);
        }
        LocalEstimatedCompletionDuration localEstimatedCompletionDuration = this.estimated_pickup_wait_time;
        if (localEstimatedCompletionDuration != null) {
            arrayList.add("estimated_pickup_wait_time=" + localEstimatedCompletionDuration);
        }
        RequiredLocationSelection requiredLocationSelection = this.required_location_selection;
        if (requiredLocationSelection != null) {
            arrayList.add("required_location_selection=" + requiredLocationSelection);
        }
        LocalImage localImage2 = this.artwork_image;
        if (localImage2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("artwork_image=", localImage2, arrayList);
        }
        if (this.cashtag != null) {
            arrayList.add("cashtag=██");
        }
        WebLayoutType webLayoutType = this.web_layout_type;
        if (webLayoutType != null) {
            arrayList.add("web_layout_type=" + webLayoutType);
        }
        FeatureSet featureSet = this.feature_set;
        if (featureSet != null) {
            arrayList.add("feature_set=" + featureSet);
        }
        FulfillmentSelection fulfillmentSelection = this.fulfillment_selection;
        if (fulfillmentSelection != null) {
            arrayList.add("fulfillment_selection=" + fulfillmentSelection);
        }
        LocationFulfillmentSummary locationFulfillmentSummary = this.location_fulfillment_summary;
        if (locationFulfillmentSummary != null) {
            arrayList.add("location_fulfillment_summary=" + locationFulfillmentSummary);
        }
        Boolean bool = this.allow_checkout_notes;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("allow_checkout_notes=", bool, arrayList);
        }
        LocalColor localColor3 = this.brand_card_outline_color;
        if (localColor3 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("brand_card_outline_color=", localColor3, arrayList);
        }
        String str4 = this.policies;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "policies=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalBrand{", "}", 0, null, null, 56);
    }
}
