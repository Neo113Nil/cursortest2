package com.squareup.protos.wire.roster.mds;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
public final class MerchantCapabilities extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MerchantCapabilities> CREATOR;
    public final Long apple_tap_to_pay_enabled;
    public final Long apple_tap_to_pay_linked;
    public final Long apple_tap_to_pay_mke_dismissed;
    public final Long apple_tap_to_pay_opt_in_seen;
    public final Long change_name_without_limit;
    public final Long enable_modern_micros_mode;
    public final Long has_many_employments;
    public final Long invoice_mke_dismissed;
    public final Long is_sandbox;
    public final Long is_test_merchant;
    public final Long jp_smirf_pricing_eligible;
    public final Long multi_legal_entity;
    public final Long nab_seller_eligible;
    public final Long payment_link_mke_dismissed;
    public final Long reprice_1_6_cp_au_rates;
    public final Long sell_cannabis;
    public final Long sell_cbd;
    public final Long show_third_party_gift_card_provider_onboarding;
    public final Long use_appointments;
    public final Long use_btc_treasury;
    public final Long use_developer_dashboard;
    public final Long use_dual_mode_v2_payg;
    public final Long use_dual_mode_v2_pos;
    public final Long use_elevated_tip_limit;
    public final Long use_gift_card_settlement;
    public final Long use_gift_cards;
    public final Long use_house_accounts;
    public final Long use_items_autosku;
    public final Long use_payroll;
    public final Long use_point_of_sale;
    public final Long use_restaurants;
    public final Long use_rule_based_taxes;
    public final Long use_savings;
    public final Long use_third_party_gift_card_provider;

    public final class Builder extends Message.Builder {
        public Long apple_tap_to_pay_enabled;
        public Long apple_tap_to_pay_linked;
        public Long apple_tap_to_pay_mke_dismissed;
        public Long apple_tap_to_pay_opt_in_seen;
        public Long change_name_without_limit;
        public Long enable_modern_micros_mode;
        public Long has_many_employments;
        public Long invoice_mke_dismissed;
        public Long is_sandbox;
        public Long is_test_merchant;
        public Long jp_smirf_pricing_eligible;
        public Long multi_legal_entity;
        public Long nab_seller_eligible;
        public Long payment_link_mke_dismissed;
        public Long reprice_1_6_cp_au_rates;
        public Long sell_cannabis;
        public Long sell_cbd;
        public Long show_third_party_gift_card_provider_onboarding;
        public Long use_appointments;
        public Long use_btc_treasury;
        public Long use_developer_dashboard;
        public Long use_dual_mode_v2_payg;
        public Long use_dual_mode_v2_pos;
        public Long use_elevated_tip_limit;
        public Long use_gift_card_settlement;
        public Long use_gift_cards;
        public Long use_house_accounts;
        public Long use_items_autosku;
        public Long use_payroll;
        public Long use_point_of_sale;
        public Long use_restaurants;
        public Long use_rule_based_taxes;
        public Long use_savings;
        public Long use_third_party_gift_card_provider;

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new MerchantCapabilities(this.use_savings, this.use_point_of_sale, this.use_developer_dashboard, this.use_appointments, this.use_restaurants, this.use_payroll, this.sell_cbd, this.use_rule_based_taxes, this.use_items_autosku, this.sell_cannabis, this.is_sandbox, this.use_btc_treasury, this.use_elevated_tip_limit, this.use_gift_cards, this.apple_tap_to_pay_enabled, this.apple_tap_to_pay_linked, this.apple_tap_to_pay_opt_in_seen, this.use_house_accounts, this.change_name_without_limit, this.use_gift_card_settlement, this.is_test_merchant, this.apple_tap_to_pay_mke_dismissed, this.payment_link_mke_dismissed, this.invoice_mke_dismissed, this.use_dual_mode_v2_payg, this.use_dual_mode_v2_pos, this.use_third_party_gift_card_provider, this.enable_modern_micros_mode, this.reprice_1_6_cp_au_rates, this.jp_smirf_pricing_eligible, this.show_third_party_gift_card_provider_onboarding, this.has_many_employments, this.nab_seller_eligible, this.multi_legal_entity, buildUnknownFields());
        }
    }

    static {
        MerchantCapabilities$Companion$ADAPTER$1 merchantCapabilities$Companion$ADAPTER$1 = new MerchantCapabilities$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MerchantCapabilities.class), "type.googleapis.com/squareup.roster.mds.MerchantCapabilities", Syntax.PROTO_2, null, "squareup/roster/mds.proto");
        ADAPTER = merchantCapabilities$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(merchantCapabilities$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchantCapabilities(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, Long l17, Long l18, Long l19, Long l20, Long l21, Long l22, Long l23, Long l24, Long l25, Long l26, Long l27, Long l28, Long l29, Long l30, Long l31, Long l32, Long l33, Long l34, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.use_savings = l;
        this.use_point_of_sale = l2;
        this.use_developer_dashboard = l3;
        this.use_appointments = l4;
        this.use_restaurants = l5;
        this.use_payroll = l6;
        this.sell_cbd = l7;
        this.use_rule_based_taxes = l8;
        this.use_items_autosku = l9;
        this.sell_cannabis = l10;
        this.is_sandbox = l11;
        this.use_btc_treasury = l12;
        this.use_elevated_tip_limit = l13;
        this.use_gift_cards = l14;
        this.apple_tap_to_pay_enabled = l15;
        this.apple_tap_to_pay_linked = l16;
        this.apple_tap_to_pay_opt_in_seen = l17;
        this.use_house_accounts = l18;
        this.change_name_without_limit = l19;
        this.use_gift_card_settlement = l20;
        this.is_test_merchant = l21;
        this.apple_tap_to_pay_mke_dismissed = l22;
        this.payment_link_mke_dismissed = l23;
        this.invoice_mke_dismissed = l24;
        this.use_dual_mode_v2_payg = l25;
        this.use_dual_mode_v2_pos = l26;
        this.use_third_party_gift_card_provider = l27;
        this.enable_modern_micros_mode = l28;
        this.reprice_1_6_cp_au_rates = l29;
        this.jp_smirf_pricing_eligible = l30;
        this.show_third_party_gift_card_provider_onboarding = l31;
        this.has_many_employments = l32;
        this.nab_seller_eligible = l33;
        this.multi_legal_entity = l34;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MerchantCapabilities)) {
            return false;
        }
        MerchantCapabilities merchantCapabilities = (MerchantCapabilities) obj;
        return Intrinsics.areEqual(unknownFields(), merchantCapabilities.unknownFields()) && Intrinsics.areEqual(this.use_savings, merchantCapabilities.use_savings) && Intrinsics.areEqual(this.use_point_of_sale, merchantCapabilities.use_point_of_sale) && Intrinsics.areEqual(this.use_developer_dashboard, merchantCapabilities.use_developer_dashboard) && Intrinsics.areEqual(this.use_appointments, merchantCapabilities.use_appointments) && Intrinsics.areEqual(this.use_restaurants, merchantCapabilities.use_restaurants) && Intrinsics.areEqual(this.use_payroll, merchantCapabilities.use_payroll) && Intrinsics.areEqual(this.sell_cbd, merchantCapabilities.sell_cbd) && Intrinsics.areEqual(this.use_rule_based_taxes, merchantCapabilities.use_rule_based_taxes) && Intrinsics.areEqual(this.use_items_autosku, merchantCapabilities.use_items_autosku) && Intrinsics.areEqual(this.sell_cannabis, merchantCapabilities.sell_cannabis) && Intrinsics.areEqual(this.is_sandbox, merchantCapabilities.is_sandbox) && Intrinsics.areEqual(this.use_btc_treasury, merchantCapabilities.use_btc_treasury) && Intrinsics.areEqual(this.use_elevated_tip_limit, merchantCapabilities.use_elevated_tip_limit) && Intrinsics.areEqual(this.use_gift_cards, merchantCapabilities.use_gift_cards) && Intrinsics.areEqual(this.apple_tap_to_pay_enabled, merchantCapabilities.apple_tap_to_pay_enabled) && Intrinsics.areEqual(this.apple_tap_to_pay_linked, merchantCapabilities.apple_tap_to_pay_linked) && Intrinsics.areEqual(this.apple_tap_to_pay_opt_in_seen, merchantCapabilities.apple_tap_to_pay_opt_in_seen) && Intrinsics.areEqual(this.use_house_accounts, merchantCapabilities.use_house_accounts) && Intrinsics.areEqual(this.change_name_without_limit, merchantCapabilities.change_name_without_limit) && Intrinsics.areEqual(this.use_gift_card_settlement, merchantCapabilities.use_gift_card_settlement) && Intrinsics.areEqual(this.is_test_merchant, merchantCapabilities.is_test_merchant) && Intrinsics.areEqual(this.apple_tap_to_pay_mke_dismissed, merchantCapabilities.apple_tap_to_pay_mke_dismissed) && Intrinsics.areEqual(this.payment_link_mke_dismissed, merchantCapabilities.payment_link_mke_dismissed) && Intrinsics.areEqual(this.invoice_mke_dismissed, merchantCapabilities.invoice_mke_dismissed) && Intrinsics.areEqual(this.use_dual_mode_v2_payg, merchantCapabilities.use_dual_mode_v2_payg) && Intrinsics.areEqual(this.use_dual_mode_v2_pos, merchantCapabilities.use_dual_mode_v2_pos) && Intrinsics.areEqual(this.use_third_party_gift_card_provider, merchantCapabilities.use_third_party_gift_card_provider) && Intrinsics.areEqual(this.enable_modern_micros_mode, merchantCapabilities.enable_modern_micros_mode) && Intrinsics.areEqual(this.reprice_1_6_cp_au_rates, merchantCapabilities.reprice_1_6_cp_au_rates) && Intrinsics.areEqual(this.jp_smirf_pricing_eligible, merchantCapabilities.jp_smirf_pricing_eligible) && Intrinsics.areEqual(this.show_third_party_gift_card_provider_onboarding, merchantCapabilities.show_third_party_gift_card_provider_onboarding) && Intrinsics.areEqual(this.has_many_employments, merchantCapabilities.has_many_employments) && Intrinsics.areEqual(this.nab_seller_eligible, merchantCapabilities.nab_seller_eligible) && Intrinsics.areEqual(this.multi_legal_entity, merchantCapabilities.multi_legal_entity);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.use_savings;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.use_point_of_sale;
        int hashCode3 = (hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.use_developer_dashboard;
        int hashCode4 = (hashCode3 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Long l4 = this.use_appointments;
        int hashCode5 = (hashCode4 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
        Long l5 = this.use_restaurants;
        int hashCode6 = (hashCode5 + (l5 != null ? Long.hashCode(l5.longValue()) : 0)) * 37;
        Long l6 = this.use_payroll;
        int hashCode7 = (hashCode6 + (l6 != null ? Long.hashCode(l6.longValue()) : 0)) * 37;
        Long l7 = this.sell_cbd;
        int hashCode8 = (hashCode7 + (l7 != null ? Long.hashCode(l7.longValue()) : 0)) * 37;
        Long l8 = this.use_rule_based_taxes;
        int hashCode9 = (hashCode8 + (l8 != null ? Long.hashCode(l8.longValue()) : 0)) * 37;
        Long l9 = this.use_items_autosku;
        int hashCode10 = (hashCode9 + (l9 != null ? Long.hashCode(l9.longValue()) : 0)) * 37;
        Long l10 = this.sell_cannabis;
        int hashCode11 = (hashCode10 + (l10 != null ? Long.hashCode(l10.longValue()) : 0)) * 37;
        Long l11 = this.is_sandbox;
        int hashCode12 = (hashCode11 + (l11 != null ? Long.hashCode(l11.longValue()) : 0)) * 37;
        Long l12 = this.use_btc_treasury;
        int hashCode13 = (hashCode12 + (l12 != null ? Long.hashCode(l12.longValue()) : 0)) * 37;
        Long l13 = this.use_elevated_tip_limit;
        int hashCode14 = (hashCode13 + (l13 != null ? Long.hashCode(l13.longValue()) : 0)) * 37;
        Long l14 = this.use_gift_cards;
        int hashCode15 = (hashCode14 + (l14 != null ? Long.hashCode(l14.longValue()) : 0)) * 37;
        Long l15 = this.apple_tap_to_pay_enabled;
        int hashCode16 = (hashCode15 + (l15 != null ? Long.hashCode(l15.longValue()) : 0)) * 37;
        Long l16 = this.apple_tap_to_pay_linked;
        int hashCode17 = (hashCode16 + (l16 != null ? Long.hashCode(l16.longValue()) : 0)) * 37;
        Long l17 = this.apple_tap_to_pay_opt_in_seen;
        int hashCode18 = (hashCode17 + (l17 != null ? Long.hashCode(l17.longValue()) : 0)) * 37;
        Long l18 = this.use_house_accounts;
        int hashCode19 = (hashCode18 + (l18 != null ? Long.hashCode(l18.longValue()) : 0)) * 37;
        Long l19 = this.change_name_without_limit;
        int hashCode20 = (hashCode19 + (l19 != null ? Long.hashCode(l19.longValue()) : 0)) * 37;
        Long l20 = this.use_gift_card_settlement;
        int hashCode21 = (hashCode20 + (l20 != null ? Long.hashCode(l20.longValue()) : 0)) * 37;
        Long l21 = this.is_test_merchant;
        int hashCode22 = (hashCode21 + (l21 != null ? Long.hashCode(l21.longValue()) : 0)) * 37;
        Long l22 = this.apple_tap_to_pay_mke_dismissed;
        int hashCode23 = (hashCode22 + (l22 != null ? Long.hashCode(l22.longValue()) : 0)) * 37;
        Long l23 = this.payment_link_mke_dismissed;
        int hashCode24 = (hashCode23 + (l23 != null ? Long.hashCode(l23.longValue()) : 0)) * 37;
        Long l24 = this.invoice_mke_dismissed;
        int hashCode25 = (hashCode24 + (l24 != null ? Long.hashCode(l24.longValue()) : 0)) * 37;
        Long l25 = this.use_dual_mode_v2_payg;
        int hashCode26 = (hashCode25 + (l25 != null ? Long.hashCode(l25.longValue()) : 0)) * 37;
        Long l26 = this.use_dual_mode_v2_pos;
        int hashCode27 = (hashCode26 + (l26 != null ? Long.hashCode(l26.longValue()) : 0)) * 37;
        Long l27 = this.use_third_party_gift_card_provider;
        int hashCode28 = (hashCode27 + (l27 != null ? Long.hashCode(l27.longValue()) : 0)) * 37;
        Long l28 = this.enable_modern_micros_mode;
        int hashCode29 = (hashCode28 + (l28 != null ? Long.hashCode(l28.longValue()) : 0)) * 37;
        Long l29 = this.reprice_1_6_cp_au_rates;
        int hashCode30 = (hashCode29 + (l29 != null ? Long.hashCode(l29.longValue()) : 0)) * 37;
        Long l30 = this.jp_smirf_pricing_eligible;
        int hashCode31 = (hashCode30 + (l30 != null ? Long.hashCode(l30.longValue()) : 0)) * 37;
        Long l31 = this.show_third_party_gift_card_provider_onboarding;
        int hashCode32 = (hashCode31 + (l31 != null ? Long.hashCode(l31.longValue()) : 0)) * 37;
        Long l32 = this.has_many_employments;
        int hashCode33 = (hashCode32 + (l32 != null ? Long.hashCode(l32.longValue()) : 0)) * 37;
        Long l33 = this.nab_seller_eligible;
        int hashCode34 = (hashCode33 + (l33 != null ? Long.hashCode(l33.longValue()) : 0)) * 37;
        Long l34 = this.multi_legal_entity;
        int hashCode35 = hashCode34 + (l34 != null ? Long.hashCode(l34.longValue()) : 0);
        this.hashCode = hashCode35;
        return hashCode35;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.use_savings = this.use_savings;
        builder.use_point_of_sale = this.use_point_of_sale;
        builder.use_developer_dashboard = this.use_developer_dashboard;
        builder.use_appointments = this.use_appointments;
        builder.use_restaurants = this.use_restaurants;
        builder.use_payroll = this.use_payroll;
        builder.sell_cbd = this.sell_cbd;
        builder.use_rule_based_taxes = this.use_rule_based_taxes;
        builder.use_items_autosku = this.use_items_autosku;
        builder.sell_cannabis = this.sell_cannabis;
        builder.is_sandbox = this.is_sandbox;
        builder.use_btc_treasury = this.use_btc_treasury;
        builder.use_elevated_tip_limit = this.use_elevated_tip_limit;
        builder.use_gift_cards = this.use_gift_cards;
        builder.apple_tap_to_pay_enabled = this.apple_tap_to_pay_enabled;
        builder.apple_tap_to_pay_linked = this.apple_tap_to_pay_linked;
        builder.apple_tap_to_pay_opt_in_seen = this.apple_tap_to_pay_opt_in_seen;
        builder.use_house_accounts = this.use_house_accounts;
        builder.change_name_without_limit = this.change_name_without_limit;
        builder.use_gift_card_settlement = this.use_gift_card_settlement;
        builder.is_test_merchant = this.is_test_merchant;
        builder.apple_tap_to_pay_mke_dismissed = this.apple_tap_to_pay_mke_dismissed;
        builder.payment_link_mke_dismissed = this.payment_link_mke_dismissed;
        builder.invoice_mke_dismissed = this.invoice_mke_dismissed;
        builder.use_dual_mode_v2_payg = this.use_dual_mode_v2_payg;
        builder.use_dual_mode_v2_pos = this.use_dual_mode_v2_pos;
        builder.use_third_party_gift_card_provider = this.use_third_party_gift_card_provider;
        builder.enable_modern_micros_mode = this.enable_modern_micros_mode;
        builder.reprice_1_6_cp_au_rates = this.reprice_1_6_cp_au_rates;
        builder.jp_smirf_pricing_eligible = this.jp_smirf_pricing_eligible;
        builder.show_third_party_gift_card_provider_onboarding = this.show_third_party_gift_card_provider_onboarding;
        builder.has_many_employments = this.has_many_employments;
        builder.nab_seller_eligible = this.nab_seller_eligible;
        builder.multi_legal_entity = this.multi_legal_entity;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.use_savings;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("use_savings=", l, arrayList);
        }
        Long l2 = this.use_point_of_sale;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("use_point_of_sale=", l2, arrayList);
        }
        Long l3 = this.use_developer_dashboard;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("use_developer_dashboard=", l3, arrayList);
        }
        Long l4 = this.use_appointments;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("use_appointments=", l4, arrayList);
        }
        Long l5 = this.use_restaurants;
        if (l5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("use_restaurants=", l5, arrayList);
        }
        Long l6 = this.use_payroll;
        if (l6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("use_payroll=", l6, arrayList);
        }
        Long l7 = this.sell_cbd;
        if (l7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("sell_cbd=", l7, arrayList);
        }
        Long l8 = this.use_rule_based_taxes;
        if (l8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("use_rule_based_taxes=", l8, arrayList);
        }
        Long l9 = this.use_items_autosku;
        if (l9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("use_items_autosku=", l9, arrayList);
        }
        Long l10 = this.sell_cannabis;
        if (l10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("sell_cannabis=", l10, arrayList);
        }
        Long l11 = this.is_sandbox;
        if (l11 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_sandbox=", l11, arrayList);
        }
        Long l12 = this.use_btc_treasury;
        if (l12 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("use_btc_treasury=", l12, arrayList);
        }
        Long l13 = this.use_elevated_tip_limit;
        if (l13 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("use_elevated_tip_limit=", l13, arrayList);
        }
        Long l14 = this.use_gift_cards;
        if (l14 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("use_gift_cards=", l14, arrayList);
        }
        Long l15 = this.apple_tap_to_pay_enabled;
        if (l15 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("apple_tap_to_pay_enabled=", l15, arrayList);
        }
        Long l16 = this.apple_tap_to_pay_linked;
        if (l16 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("apple_tap_to_pay_linked=", l16, arrayList);
        }
        Long l17 = this.apple_tap_to_pay_opt_in_seen;
        if (l17 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("apple_tap_to_pay_opt_in_seen=", l17, arrayList);
        }
        Long l18 = this.use_house_accounts;
        if (l18 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("use_house_accounts=", l18, arrayList);
        }
        Long l19 = this.change_name_without_limit;
        if (l19 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("change_name_without_limit=", l19, arrayList);
        }
        Long l20 = this.use_gift_card_settlement;
        if (l20 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("use_gift_card_settlement=", l20, arrayList);
        }
        Long l21 = this.is_test_merchant;
        if (l21 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_test_merchant=", l21, arrayList);
        }
        Long l22 = this.apple_tap_to_pay_mke_dismissed;
        if (l22 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("apple_tap_to_pay_mke_dismissed=", l22, arrayList);
        }
        Long l23 = this.payment_link_mke_dismissed;
        if (l23 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("payment_link_mke_dismissed=", l23, arrayList);
        }
        Long l24 = this.invoice_mke_dismissed;
        if (l24 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("invoice_mke_dismissed=", l24, arrayList);
        }
        Long l25 = this.use_dual_mode_v2_payg;
        if (l25 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("use_dual_mode_v2_payg=", l25, arrayList);
        }
        Long l26 = this.use_dual_mode_v2_pos;
        if (l26 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("use_dual_mode_v2_pos=", l26, arrayList);
        }
        Long l27 = this.use_third_party_gift_card_provider;
        if (l27 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("use_third_party_gift_card_provider=", l27, arrayList);
        }
        Long l28 = this.enable_modern_micros_mode;
        if (l28 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enable_modern_micros_mode=", l28, arrayList);
        }
        Long l29 = this.reprice_1_6_cp_au_rates;
        if (l29 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("reprice_1_6_cp_au_rates=", l29, arrayList);
        }
        Long l30 = this.jp_smirf_pricing_eligible;
        if (l30 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("jp_smirf_pricing_eligible=", l30, arrayList);
        }
        Long l31 = this.show_third_party_gift_card_provider_onboarding;
        if (l31 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_third_party_gift_card_provider_onboarding=", l31, arrayList);
        }
        Long l32 = this.has_many_employments;
        if (l32 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_many_employments=", l32, arrayList);
        }
        Long l33 = this.nab_seller_eligible;
        if (l33 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("nab_seller_eligible=", l33, arrayList);
        }
        Long l34 = this.multi_legal_entity;
        if (l34 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("multi_legal_entity=", l34, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MerchantCapabilities{", "}", 0, null, null, 56);
    }
}
