package com.squareup.protos.wire.roster.mds;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.merchants.api.UserLocale;
import com.squareup.protos.rewardly.ui.UiReward;
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
public final class Merchant extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Merchant> CREATOR;
    public final List addresses;
    public final BusinessUnit business_unit;
    public final MerchantCapabilities capabilities;
    public final Country country;
    public final Long created_ts;
    public final String legal_entity_token;
    public final UserLocale locale;
    public final Unit main_unit;
    public final String main_unit_token;
    public final String main_unit_token_override;
    public final Long merchant_id;
    public final Names name;
    public final String oldest_unit_token;
    public final String platform_account_token;
    public final Boolean platform_hidden;
    public final String reserved_merchant_token;
    public final StatusScope$Status status;
    public final String token;
    public final Long updated_ts;
    public final Long version;

    static {
        Merchant$Companion$ADAPTER$1 merchant$Companion$ADAPTER$1 = new Merchant$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Merchant.class), "type.googleapis.com/squareup.roster.mds.Merchant", Syntax.PROTO_2, null, "squareup/roster/mds.proto");
        ADAPTER = merchant$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(merchant$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Merchant(String str, Long l, Names names, List list, UserLocale userLocale, Country country, StatusScope$Status statusScope$Status, Long l2, Long l3, Long l4, String str2, Unit unit, String str3, String str4, String str5, Boolean bool, MerchantCapabilities merchantCapabilities, BusinessUnit businessUnit, String str6, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.token = str;
        this.version = l;
        this.name = names;
        this.locale = userLocale;
        this.country = country;
        this.status = statusScope$Status;
        this.created_ts = l2;
        this.updated_ts = l3;
        this.merchant_id = l4;
        this.main_unit_token = str2;
        this.main_unit = unit;
        this.oldest_unit_token = str3;
        this.reserved_merchant_token = str4;
        this.platform_account_token = str5;
        this.platform_hidden = bool;
        this.capabilities = merchantCapabilities;
        this.business_unit = businessUnit;
        this.legal_entity_token = str6;
        this.main_unit_token_override = str7;
        this.addresses = TransactorKt.immutableCopyOf("addresses", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Merchant)) {
            return false;
        }
        Merchant merchant = (Merchant) obj;
        return Intrinsics.areEqual(unknownFields(), merchant.unknownFields()) && Intrinsics.areEqual(this.token, merchant.token) && Intrinsics.areEqual(this.version, merchant.version) && Intrinsics.areEqual(this.name, merchant.name) && Intrinsics.areEqual(this.addresses, merchant.addresses) && Intrinsics.areEqual(this.locale, merchant.locale) && this.country == merchant.country && this.status == merchant.status && Intrinsics.areEqual(this.created_ts, merchant.created_ts) && Intrinsics.areEqual(this.updated_ts, merchant.updated_ts) && Intrinsics.areEqual(this.merchant_id, merchant.merchant_id) && Intrinsics.areEqual(this.main_unit_token, merchant.main_unit_token) && Intrinsics.areEqual(this.main_unit, merchant.main_unit) && Intrinsics.areEqual(this.oldest_unit_token, merchant.oldest_unit_token) && Intrinsics.areEqual(this.reserved_merchant_token, merchant.reserved_merchant_token) && Intrinsics.areEqual(this.platform_account_token, merchant.platform_account_token) && Intrinsics.areEqual(this.platform_hidden, merchant.platform_hidden) && Intrinsics.areEqual(this.capabilities, merchant.capabilities) && this.business_unit == merchant.business_unit && Intrinsics.areEqual(this.legal_entity_token, merchant.legal_entity_token) && Intrinsics.areEqual(this.main_unit_token_override, merchant.main_unit_token_override);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.version;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Names names = this.name;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (names != null ? names.hashCode() : 0)) * 37, 37, this.addresses);
        UserLocale userLocale = this.locale;
        int hashCode4 = (m + (userLocale != null ? userLocale.hashCode() : 0)) * 37;
        Country country = this.country;
        int hashCode5 = (hashCode4 + (country != null ? country.hashCode() : 0)) * 37;
        StatusScope$Status statusScope$Status = this.status;
        int hashCode6 = (hashCode5 + (statusScope$Status != null ? statusScope$Status.hashCode() : 0)) * 37;
        Long l2 = this.created_ts;
        int hashCode7 = (hashCode6 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.updated_ts;
        int hashCode8 = (hashCode7 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Long l4 = this.merchant_id;
        int hashCode9 = (hashCode8 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
        String str2 = this.main_unit_token;
        int hashCode10 = (hashCode9 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Unit unit = this.main_unit;
        int hashCode11 = (hashCode10 + (unit != null ? unit.hashCode() : 0)) * 37;
        String str3 = this.oldest_unit_token;
        int hashCode12 = (hashCode11 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.reserved_merchant_token;
        int hashCode13 = (hashCode12 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.platform_account_token;
        int hashCode14 = (hashCode13 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Boolean bool = this.platform_hidden;
        int hashCode15 = (hashCode14 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        MerchantCapabilities merchantCapabilities = this.capabilities;
        int hashCode16 = (hashCode15 + (merchantCapabilities != null ? merchantCapabilities.hashCode() : 0)) * 37;
        BusinessUnit businessUnit = this.business_unit;
        int hashCode17 = (hashCode16 + (businessUnit != null ? businessUnit.hashCode() : 0)) * 37;
        String str6 = this.legal_entity_token;
        int hashCode18 = (hashCode17 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.main_unit_token_override;
        int hashCode19 = hashCode18 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = hashCode19;
        return hashCode19;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiReward.Builder builder = new UiReward.Builder(5);
        builder.token = this.token;
        builder.activation_date_time_ms = this.version;
        builder.discount_text = this.name;
        builder.boost_attributes = this.addresses;
        builder.merchant_name = this.locale;
        builder.offerly_token = this.country;
        builder.reward_avatars = this.status;
        builder.expiration_date_time_ms = this.created_ts;
        builder.merchant_tokens = this.updated_ts;
        builder.is_custom_offer = this.merchant_id;
        builder.category = this.main_unit_token;
        builder.redeemable_with_cash_card = this.main_unit;
        builder.title = this.oldest_unit_token;
        builder.main_text = this.reserved_merchant_token;
        builder.affiliate_link_url = this.platform_account_token;
        builder.draggable = this.platform_hidden;
        builder.redeemable_with_cash_app_pay = this.capabilities;
        builder.app_links = this.business_unit;
        builder.user_agent = this.legal_entity_token;
        builder.full_title_text = this.main_unit_token_override;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        Long l = this.version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l, arrayList);
        }
        Names names = this.name;
        if (names != null) {
            arrayList.add("name=" + names);
        }
        List list = this.addresses;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("addresses=", arrayList, list);
        }
        UserLocale userLocale = this.locale;
        if (userLocale != null) {
            arrayList.add("locale=" + userLocale);
        }
        Country country = this.country;
        if (country != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("country=", country, arrayList);
        }
        StatusScope$Status statusScope$Status = this.status;
        if (statusScope$Status != null) {
            arrayList.add("status=" + statusScope$Status);
        }
        Long l2 = this.created_ts;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_ts=", l2, arrayList);
        }
        Long l3 = this.updated_ts;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated_ts=", l3, arrayList);
        }
        Long l4 = this.merchant_id;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("merchant_id=", l4, arrayList);
        }
        String str2 = this.main_unit_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "main_unit_token=", arrayList);
        }
        Unit unit = this.main_unit;
        if (unit != null) {
            arrayList.add("main_unit=" + unit);
        }
        String str3 = this.oldest_unit_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "oldest_unit_token=", arrayList);
        }
        String str4 = this.reserved_merchant_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "reserved_merchant_token=", arrayList);
        }
        String str5 = this.platform_account_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "platform_account_token=", arrayList);
        }
        Boolean bool = this.platform_hidden;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("platform_hidden=", bool, arrayList);
        }
        MerchantCapabilities merchantCapabilities = this.capabilities;
        if (merchantCapabilities != null) {
            arrayList.add("capabilities=" + merchantCapabilities);
        }
        BusinessUnit businessUnit = this.business_unit;
        if (businessUnit != null) {
            arrayList.add("business_unit=" + businessUnit);
        }
        String str6 = this.legal_entity_token;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "legal_entity_token=", arrayList);
        }
        String str7 = this.main_unit_token_override;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "main_unit_token_override=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Merchant{", "}", 0, null, null, 56);
    }
}
