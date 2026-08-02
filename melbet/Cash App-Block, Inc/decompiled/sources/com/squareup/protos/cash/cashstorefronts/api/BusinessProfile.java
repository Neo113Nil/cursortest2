package com.squareup.protos.cash.cashstorefronts.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.paychecks.UiState;

/* loaded from: classes7.dex */
public final class BusinessProfile extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BusinessProfile> CREATOR;
    public final String affiliate_link;
    public final String afterpay_merchant_id;
    public final String afterpay_store_id;
    public final String bizzy_brand_id;
    public final String bizzy_token;
    public final BusinessMetadata business_metadata;
    public final List business_statuses;
    public final String canonical_category;
    public final List categories;
    public final Long external_created_at;
    public final List features;
    public final List image_assets;
    public final String locale;
    public final Image logo;
    public final String merchantein_token;
    public final String name;
    public final String region;
    public final String square_merchant_token;
    public final Status status;
    public final List tags;
    public final TargetApp target_app;
    public final String token;
    public final Long version;
    public final String website_url;

    static {
        BusinessProfile$Companion$ADAPTER$1 businessProfile$Companion$ADAPTER$1 = new BusinessProfile$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BusinessProfile.class), "type.googleapis.com/squareup.cash.cashstorefronts.api.BusinessProfile", Syntax.PROTO_2, null, "squareup/cash/cashstorefronts/api/BusinessProfile.proto");
        ADAPTER = businessProfile$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(businessProfile$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessProfile(String str, String str2, Status status, Image image, List list, String str3, List list2, List list3, List list4, String str4, BusinessMetadata businessMetadata, TargetApp targetApp, String str5, String str6, Long l, Long l2, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list5, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        byteString.getClass();
        this.token = str;
        this.name = str2;
        this.status = status;
        this.logo = image;
        this.canonical_category = str3;
        this.website_url = str4;
        this.business_metadata = businessMetadata;
        this.target_app = targetApp;
        this.region = str5;
        this.locale = str6;
        this.version = l;
        this.external_created_at = l2;
        this.afterpay_store_id = str7;
        this.merchantein_token = str8;
        this.bizzy_token = str9;
        this.bizzy_brand_id = str10;
        this.afterpay_merchant_id = str11;
        this.square_merchant_token = str12;
        this.affiliate_link = str13;
        this.tags = TransactorKt.immutableCopyOf("tags", list);
        this.categories = TransactorKt.immutableCopyOf("categories", list2);
        this.image_assets = TransactorKt.immutableCopyOf("image_assets", list3);
        this.features = TransactorKt.immutableCopyOf("features", list4);
        this.business_statuses = TransactorKt.immutableCopyOf("business_statuses", list5);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BusinessProfile)) {
            return false;
        }
        BusinessProfile businessProfile = (BusinessProfile) obj;
        return Intrinsics.areEqual(unknownFields(), businessProfile.unknownFields()) && Intrinsics.areEqual(this.token, businessProfile.token) && Intrinsics.areEqual(this.name, businessProfile.name) && this.status == businessProfile.status && Intrinsics.areEqual(this.logo, businessProfile.logo) && Intrinsics.areEqual(this.tags, businessProfile.tags) && Intrinsics.areEqual(this.canonical_category, businessProfile.canonical_category) && Intrinsics.areEqual(this.categories, businessProfile.categories) && Intrinsics.areEqual(this.image_assets, businessProfile.image_assets) && Intrinsics.areEqual(this.features, businessProfile.features) && Intrinsics.areEqual(this.website_url, businessProfile.website_url) && Intrinsics.areEqual(this.business_metadata, businessProfile.business_metadata) && this.target_app == businessProfile.target_app && Intrinsics.areEqual(this.region, businessProfile.region) && Intrinsics.areEqual(this.locale, businessProfile.locale) && Intrinsics.areEqual(this.version, businessProfile.version) && Intrinsics.areEqual(this.external_created_at, businessProfile.external_created_at) && Intrinsics.areEqual(this.afterpay_store_id, businessProfile.afterpay_store_id) && Intrinsics.areEqual(this.merchantein_token, businessProfile.merchantein_token) && Intrinsics.areEqual(this.bizzy_token, businessProfile.bizzy_token) && Intrinsics.areEqual(this.bizzy_brand_id, businessProfile.bizzy_brand_id) && Intrinsics.areEqual(this.afterpay_merchant_id, businessProfile.afterpay_merchant_id) && Intrinsics.areEqual(this.square_merchant_token, businessProfile.square_merchant_token) && Intrinsics.areEqual(this.affiliate_link, businessProfile.affiliate_link) && Intrinsics.areEqual(this.business_statuses, businessProfile.business_statuses);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.token);
        String str = this.name;
        int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
        Status status = this.status;
        int hashCode2 = (hashCode + (status != null ? status.hashCode() : 0)) * 37;
        Image image = this.logo;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (image != null ? image.hashCode() : 0)) * 37, 37, this.tags);
        String str2 = this.canonical_category;
        int m3 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((m2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.categories), 37, this.image_assets), 37, this.features);
        String str3 = this.website_url;
        int hashCode3 = (m3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        BusinessMetadata businessMetadata = this.business_metadata;
        int hashCode4 = (hashCode3 + (businessMetadata != null ? businessMetadata.hashCode() : 0)) * 37;
        TargetApp targetApp = this.target_app;
        int hashCode5 = (hashCode4 + (targetApp != null ? targetApp.hashCode() : 0)) * 37;
        String str4 = this.region;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.locale;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Long l = this.version;
        int hashCode8 = (hashCode7 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.external_created_at;
        int hashCode9 = (hashCode8 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        String str6 = this.afterpay_store_id;
        int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.merchantein_token;
        int hashCode11 = (hashCode10 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.bizzy_token;
        int hashCode12 = (hashCode11 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.bizzy_brand_id;
        int hashCode13 = (hashCode12 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.afterpay_merchant_id;
        int hashCode14 = (hashCode13 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.square_merchant_token;
        int hashCode15 = (hashCode14 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.affiliate_link;
        int hashCode16 = this.business_statuses.hashCode() + ((hashCode15 + (str12 != null ? str12.hashCode() : 0)) * 37);
        this.hashCode = hashCode16;
        return hashCode16;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiState.Builder builder = new UiState.Builder(1);
        builder.paychecks_on_money_tab_client_route = this.token;
        builder.paychecks_applet_client_route = this.name;
        builder.customer_acknowledged_risk_alert = this.status;
        builder.customer_dda_is_locked = this.logo;
        builder.upcoming_paychecks = this.tags;
        builder.customer_is_denylisted = this.canonical_category;
        builder.shouldDisplayBenefitsBooklet = this.categories;
        builder.current_month_paychecks_aggregation = this.image_assets;
        builder.applet_state = this.features;
        builder.displayed_monthly_aggregation = this.website_url;
        builder.pre_rollover_applet_text = this.business_metadata;
        builder.post_rollover_applet_text = this.target_app;
        builder.applet_title_text = this.region;
        builder.applet_accessibility_label = this.locale;
        builder.applet_text_rollover_date = this.version;
        builder.pre_rollover_applet_accessibility_value = this.external_created_at;
        builder.post_rollover_applet_accessibility_value = this.afterpay_store_id;
        builder.applet_accessibility_hint = this.merchantein_token;
        builder.activity_subtitle = this.bizzy_token;
        builder.applet_banking_benefits_setup_cta_text = this.bizzy_brand_id;
        builder.applet_brief = this.afterpay_merchant_id;
        builder.kyb_eligibility_warning = this.square_merchant_token;
        builder.benefits_status_section = this.affiliate_link;
        builder.benefits_details = this.business_statuses;
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
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        Image image = this.logo;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("logo=", image, arrayList);
        }
        List list = this.tags;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("tags=", arrayList, list);
        }
        String str2 = this.canonical_category;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "canonical_category=", arrayList);
        }
        List list2 = this.categories;
        if (!list2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("categories=", arrayList, list2);
        }
        List list3 = this.image_assets;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("image_assets=", arrayList, list3);
        }
        List list4 = this.features;
        if (!list4.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("features=", arrayList, list4);
        }
        String str3 = this.website_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "website_url=", arrayList);
        }
        BusinessMetadata businessMetadata = this.business_metadata;
        if (businessMetadata != null) {
            arrayList.add("business_metadata=" + businessMetadata);
        }
        TargetApp targetApp = this.target_app;
        if (targetApp != null) {
            arrayList.add("target_app=" + targetApp);
        }
        String str4 = this.region;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "region=", arrayList);
        }
        String str5 = this.locale;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "locale=", arrayList);
        }
        Long l = this.version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l, arrayList);
        }
        Long l2 = this.external_created_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("external_created_at=", l2, arrayList);
        }
        String str6 = this.afterpay_store_id;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "afterpay_store_id=", arrayList);
        }
        String str7 = this.merchantein_token;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "merchantein_token=", arrayList);
        }
        String str8 = this.bizzy_token;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "bizzy_token=", arrayList);
        }
        String str9 = this.bizzy_brand_id;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "bizzy_brand_id=", arrayList);
        }
        String str10 = this.afterpay_merchant_id;
        if (str10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, "afterpay_merchant_id=", arrayList);
        }
        String str11 = this.square_merchant_token;
        if (str11 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str11, "square_merchant_token=", arrayList);
        }
        String str12 = this.affiliate_link;
        if (str12 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str12, "affiliate_link=", arrayList);
        }
        List list5 = this.business_statuses;
        if (!list5.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("business_statuses=", arrayList, list5);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BusinessProfile{", "}", 0, null, null, 56);
    }
}
