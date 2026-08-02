package com.squareup.protos.cash.cashstorefronts.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.BalanceData;
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

/* loaded from: classes8.dex */
public final class AfterpayAppMetadata extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AfterpayAppMetadata> CREATOR;
    public final String avatar_url;
    public final String background_color;
    public final String banner_image_url;
    public final Boolean has_locations;
    public final Boolean in_store_only;
    public final String invalid_url_reason;
    public final String landing_page_url;
    public final Long last_outbound_count;
    public final Long last_url_validation_time;
    public final String location_url;
    public final String logo_url;
    public final String main_image_url;
    public final String merchant_id;
    public final String merchant_outbound_url;
    public final String name;
    public final String new_logo_url;
    public final String shop_url;
    public final String store_short_name;

    static {
        AfterpayAppMetadata$Companion$ADAPTER$1 afterpayAppMetadata$Companion$ADAPTER$1 = new AfterpayAppMetadata$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AfterpayAppMetadata.class), "type.googleapis.com/squareup.cash.cashstorefronts.api.AfterpayAppMetadata", Syntax.PROTO_2, null, "squareup/cash/cashstorefronts/api/BusinessProfile.proto");
        ADAPTER = afterpayAppMetadata$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(afterpayAppMetadata$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfterpayAppMetadata(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, Long l, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Boolean bool2, String str14, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.name = str;
        this.shop_url = str2;
        this.merchant_id = str3;
        this.main_image_url = str4;
        this.logo_url = str5;
        this.in_store_only = bool;
        this.new_logo_url = str6;
        this.last_outbound_count = l;
        this.merchant_outbound_url = str7;
        this.avatar_url = str8;
        this.store_short_name = str9;
        this.background_color = str10;
        this.banner_image_url = str11;
        this.location_url = str12;
        this.landing_page_url = str13;
        this.has_locations = bool2;
        this.invalid_url_reason = str14;
        this.last_url_validation_time = l2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AfterpayAppMetadata)) {
            return false;
        }
        AfterpayAppMetadata afterpayAppMetadata = (AfterpayAppMetadata) obj;
        return Intrinsics.areEqual(unknownFields(), afterpayAppMetadata.unknownFields()) && Intrinsics.areEqual(this.name, afterpayAppMetadata.name) && Intrinsics.areEqual(this.shop_url, afterpayAppMetadata.shop_url) && Intrinsics.areEqual(this.merchant_id, afterpayAppMetadata.merchant_id) && Intrinsics.areEqual(this.main_image_url, afterpayAppMetadata.main_image_url) && Intrinsics.areEqual(this.logo_url, afterpayAppMetadata.logo_url) && Intrinsics.areEqual(this.in_store_only, afterpayAppMetadata.in_store_only) && Intrinsics.areEqual(this.new_logo_url, afterpayAppMetadata.new_logo_url) && Intrinsics.areEqual(this.last_outbound_count, afterpayAppMetadata.last_outbound_count) && Intrinsics.areEqual(this.merchant_outbound_url, afterpayAppMetadata.merchant_outbound_url) && Intrinsics.areEqual(this.avatar_url, afterpayAppMetadata.avatar_url) && Intrinsics.areEqual(this.store_short_name, afterpayAppMetadata.store_short_name) && Intrinsics.areEqual(this.background_color, afterpayAppMetadata.background_color) && Intrinsics.areEqual(this.banner_image_url, afterpayAppMetadata.banner_image_url) && Intrinsics.areEqual(this.location_url, afterpayAppMetadata.location_url) && Intrinsics.areEqual(this.landing_page_url, afterpayAppMetadata.landing_page_url) && Intrinsics.areEqual(this.has_locations, afterpayAppMetadata.has_locations) && Intrinsics.areEqual(this.invalid_url_reason, afterpayAppMetadata.invalid_url_reason) && Intrinsics.areEqual(this.last_url_validation_time, afterpayAppMetadata.last_url_validation_time);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.shop_url;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.merchant_id;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.main_image_url;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.logo_url;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Boolean bool = this.in_store_only;
        int hashCode7 = (hashCode6 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str6 = this.new_logo_url;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Long l = this.last_outbound_count;
        int hashCode9 = (hashCode8 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str7 = this.merchant_outbound_url;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.avatar_url;
        int hashCode11 = (hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.store_short_name;
        int hashCode12 = (hashCode11 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.background_color;
        int hashCode13 = (hashCode12 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.banner_image_url;
        int hashCode14 = (hashCode13 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.location_url;
        int hashCode15 = (hashCode14 + (str12 != null ? str12.hashCode() : 0)) * 37;
        String str13 = this.landing_page_url;
        int hashCode16 = (hashCode15 + (str13 != null ? str13.hashCode() : 0)) * 37;
        Boolean bool2 = this.has_locations;
        int hashCode17 = (hashCode16 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        String str14 = this.invalid_url_reason;
        int hashCode18 = (hashCode17 + (str14 != null ? str14.hashCode() : 0)) * 37;
        Long l2 = this.last_url_validation_time;
        int hashCode19 = hashCode18 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
        this.hashCode = hashCode19;
        return hashCode19;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BalanceData.Builder builder = new BalanceData.Builder(1);
        builder.enable_cryptocurrency_transfer_out_button_text = this.name;
        builder.enable_cryptocurrency_transfer_in_button_text = this.shop_url;
        builder.supported_transfer_instruments = this.merchant_id;
        builder.balance_limit_groups = this.main_image_url;
        builder.scheduled_reload_enabled = this.logo_url;
        builder.cash_balance_home_screen_button_enabled = this.in_store_only;
        builder.scheduled_btc_buy_enabled = this.new_logo_url;
        builder.check_deposits_enabled = this.last_outbound_count;
        builder.bitcoin_p2p_enabled = this.merchant_outbound_url;
        builder.cash_balance_home_screen_button_priority = this.avatar_url;
        builder.enable_cryptocurrency_transfer_out_status = this.store_short_name;
        builder.enable_cryptocurrency_transfer_in_status = this.background_color;
        builder.scheduled_reload_data = this.banner_image_url;
        builder.scheduled_btc_buy_data = this.location_url;
        builder.direct_deposit = this.landing_page_url;
        builder.adding_cash_enabled = this.has_locations;
        builder.deposit_check = this.invalid_url_reason;
        builder.dda_form = this.last_url_validation_time;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        String str2 = this.shop_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "shop_url=", arrayList);
        }
        String str3 = this.merchant_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "merchant_id=", arrayList);
        }
        String str4 = this.main_image_url;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "main_image_url=", arrayList);
        }
        String str5 = this.logo_url;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "logo_url=", arrayList);
        }
        Boolean bool = this.in_store_only;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("in_store_only=", bool, arrayList);
        }
        String str6 = this.new_logo_url;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "new_logo_url=", arrayList);
        }
        Long l = this.last_outbound_count;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("last_outbound_count=", l, arrayList);
        }
        String str7 = this.merchant_outbound_url;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "merchant_outbound_url=", arrayList);
        }
        String str8 = this.avatar_url;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "avatar_url=", arrayList);
        }
        String str9 = this.store_short_name;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "store_short_name=", arrayList);
        }
        String str10 = this.background_color;
        if (str10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, "background_color=", arrayList);
        }
        String str11 = this.banner_image_url;
        if (str11 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str11, "banner_image_url=", arrayList);
        }
        String str12 = this.location_url;
        if (str12 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str12, "location_url=", arrayList);
        }
        String str13 = this.landing_page_url;
        if (str13 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str13, "landing_page_url=", arrayList);
        }
        Boolean bool2 = this.has_locations;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_locations=", bool2, arrayList);
        }
        String str14 = this.invalid_url_reason;
        if (str14 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str14, "invalid_url_reason=", arrayList);
        }
        Long l2 = this.last_url_validation_time;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("last_url_validation_time=", l2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AfterpayAppMetadata{", "}", 0, null, null, 56);
    }
}
