package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.investcrypto.resources.Order;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/cashbusinessaccounts/api/v1/GetC4bEligibilityResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/investcrypto/resources/Order$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetC4bEligibilityResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetC4bEligibilityResponse> CREATOR;
    public final C4bEligibilityState account_switcher;
    public final C4bEligibilityState activity_treehouse;
    public final C4bEligibilityState bitcoin_auto_invest;
    public final C4bEligibilityState c4b_promotion_visibility;
    public final C4bEligibilityState cash_card_tab;
    public final C4bEligibilityState cash_offers_tab;
    public final C4bEligibilityState cash_shopping_p13n_toggle;
    public final String customer_token;
    public final C4bEligibilityState dda_tab;
    public final C4bEligibilityState documents_btc;
    public final C4bEligibilityState documents_stock;
    public final C4bEligibilityState documents_taxes;
    public final C4bEligibilityState kid_sponsor_eligible_customer;
    public final C4bEligibilityState limits_btc;
    public final C4bEligibilityState limits_hub_redesign_visibility;
    public final C4bEligibilityState money_btc_applet;
    public final C4bEligibilityState money_earnings_applet;
    public final C4bEligibilityState money_families_applet;
    public final C4bEligibilityState money_global_borrow_applet;
    public final C4bEligibilityState money_investing_applet;
    public final C4bEligibilityState money_tab_home_design_system;
    public final C4bEligibilityState money_taxes_applet;
    public final C4bEligibilityState moneybot_visibility;
    public final C4bEligibilityState nearby_payment_feature_visibility;
    public final C4bEligibilityState payment_personal_to_c4b;
    public final C4bEligibilityState payment_send_as_btc;
    public final C4bEligibilityState payment_send_as_gift_card;
    public final C4bEligibilityState payment_send_as_stock;
    public final C4bEligibilityState personalized_ads_toggle;
    public final C4bEligibilityState pools_onboarding_visibility;
    public final C4bEligibilityState recurring_p2p_payment_feature_visibility;
    public final C4bEligibilityState remittance_send;
    public final C4bEligibilityState settings_invest_trusted_contact_app;
    public final C4bEligibilityState settings_tax_password_auth_app;
    public final C4bEligibilityState sponsor_eligible_customer;
    public final C4bEligibilityState tap_to_pay_visibility;
    public final Long ttl;
    public final C4bEligibilityState work_applet_visibility;

    static {
        GetC4bEligibilityResponse$Companion$ADAPTER$1 getC4bEligibilityResponse$Companion$ADAPTER$1 = new GetC4bEligibilityResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetC4bEligibilityResponse.class), "type.googleapis.com/squareup.cash.cashbusinessaccounts.api.v1.GetC4bEligibilityResponse", Syntax.PROTO_2, null, "squareup/cash/cashbusinessaccounts/api/v1/c4b_features.proto");
        ADAPTER = getC4bEligibilityResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getC4bEligibilityResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetC4bEligibilityResponse(String str, Long l, C4bEligibilityState c4bEligibilityState, C4bEligibilityState c4bEligibilityState2, C4bEligibilityState c4bEligibilityState3, C4bEligibilityState c4bEligibilityState4, C4bEligibilityState c4bEligibilityState5, C4bEligibilityState c4bEligibilityState6, C4bEligibilityState c4bEligibilityState7, C4bEligibilityState c4bEligibilityState8, C4bEligibilityState c4bEligibilityState9, C4bEligibilityState c4bEligibilityState10, C4bEligibilityState c4bEligibilityState11, C4bEligibilityState c4bEligibilityState12, C4bEligibilityState c4bEligibilityState13, C4bEligibilityState c4bEligibilityState14, C4bEligibilityState c4bEligibilityState15, C4bEligibilityState c4bEligibilityState16, C4bEligibilityState c4bEligibilityState17, C4bEligibilityState c4bEligibilityState18, C4bEligibilityState c4bEligibilityState19, C4bEligibilityState c4bEligibilityState20, C4bEligibilityState c4bEligibilityState21, C4bEligibilityState c4bEligibilityState22, C4bEligibilityState c4bEligibilityState23, C4bEligibilityState c4bEligibilityState24, C4bEligibilityState c4bEligibilityState25, C4bEligibilityState c4bEligibilityState26, C4bEligibilityState c4bEligibilityState27, C4bEligibilityState c4bEligibilityState28, C4bEligibilityState c4bEligibilityState29, C4bEligibilityState c4bEligibilityState30, C4bEligibilityState c4bEligibilityState31, C4bEligibilityState c4bEligibilityState32, C4bEligibilityState c4bEligibilityState33, C4bEligibilityState c4bEligibilityState34, C4bEligibilityState c4bEligibilityState35, C4bEligibilityState c4bEligibilityState36, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
        this.ttl = l;
        this.account_switcher = c4bEligibilityState;
        this.activity_treehouse = c4bEligibilityState2;
        this.cash_card_tab = c4bEligibilityState3;
        this.cash_offers_tab = c4bEligibilityState4;
        this.c4b_promotion_visibility = c4bEligibilityState5;
        this.dda_tab = c4bEligibilityState6;
        this.documents_btc = c4bEligibilityState7;
        this.documents_stock = c4bEligibilityState8;
        this.documents_taxes = c4bEligibilityState9;
        this.limits_btc = c4bEligibilityState10;
        this.money_btc_applet = c4bEligibilityState11;
        this.money_earnings_applet = c4bEligibilityState12;
        this.money_families_applet = c4bEligibilityState13;
        this.money_global_borrow_applet = c4bEligibilityState14;
        this.money_investing_applet = c4bEligibilityState15;
        this.money_tab_home_design_system = c4bEligibilityState16;
        this.money_taxes_applet = c4bEligibilityState17;
        this.payment_personal_to_c4b = c4bEligibilityState18;
        this.payment_send_as_btc = c4bEligibilityState19;
        this.payment_send_as_stock = c4bEligibilityState20;
        this.payment_send_as_gift_card = c4bEligibilityState21;
        this.remittance_send = c4bEligibilityState22;
        this.settings_invest_trusted_contact_app = c4bEligibilityState23;
        this.settings_tax_password_auth_app = c4bEligibilityState24;
        this.sponsor_eligible_customer = c4bEligibilityState25;
        this.tap_to_pay_visibility = c4bEligibilityState26;
        this.cash_shopping_p13n_toggle = c4bEligibilityState27;
        this.moneybot_visibility = c4bEligibilityState28;
        this.limits_hub_redesign_visibility = c4bEligibilityState29;
        this.personalized_ads_toggle = c4bEligibilityState30;
        this.pools_onboarding_visibility = c4bEligibilityState31;
        this.work_applet_visibility = c4bEligibilityState32;
        this.kid_sponsor_eligible_customer = c4bEligibilityState33;
        this.nearby_payment_feature_visibility = c4bEligibilityState34;
        this.bitcoin_auto_invest = c4bEligibilityState35;
        this.recurring_p2p_payment_feature_visibility = c4bEligibilityState36;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetC4bEligibilityResponse)) {
            return false;
        }
        GetC4bEligibilityResponse getC4bEligibilityResponse = (GetC4bEligibilityResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getC4bEligibilityResponse.unknownFields()) && Intrinsics.areEqual(this.customer_token, getC4bEligibilityResponse.customer_token) && Intrinsics.areEqual(this.ttl, getC4bEligibilityResponse.ttl) && Intrinsics.areEqual(this.account_switcher, getC4bEligibilityResponse.account_switcher) && Intrinsics.areEqual(this.activity_treehouse, getC4bEligibilityResponse.activity_treehouse) && Intrinsics.areEqual(this.cash_card_tab, getC4bEligibilityResponse.cash_card_tab) && Intrinsics.areEqual(this.cash_offers_tab, getC4bEligibilityResponse.cash_offers_tab) && Intrinsics.areEqual(this.c4b_promotion_visibility, getC4bEligibilityResponse.c4b_promotion_visibility) && Intrinsics.areEqual(this.dda_tab, getC4bEligibilityResponse.dda_tab) && Intrinsics.areEqual(this.documents_btc, getC4bEligibilityResponse.documents_btc) && Intrinsics.areEqual(this.documents_stock, getC4bEligibilityResponse.documents_stock) && Intrinsics.areEqual(this.documents_taxes, getC4bEligibilityResponse.documents_taxes) && Intrinsics.areEqual(this.limits_btc, getC4bEligibilityResponse.limits_btc) && Intrinsics.areEqual(this.money_btc_applet, getC4bEligibilityResponse.money_btc_applet) && Intrinsics.areEqual(this.money_earnings_applet, getC4bEligibilityResponse.money_earnings_applet) && Intrinsics.areEqual(this.money_families_applet, getC4bEligibilityResponse.money_families_applet) && Intrinsics.areEqual(this.money_global_borrow_applet, getC4bEligibilityResponse.money_global_borrow_applet) && Intrinsics.areEqual(this.money_investing_applet, getC4bEligibilityResponse.money_investing_applet) && Intrinsics.areEqual(this.money_tab_home_design_system, getC4bEligibilityResponse.money_tab_home_design_system) && Intrinsics.areEqual(this.money_taxes_applet, getC4bEligibilityResponse.money_taxes_applet) && Intrinsics.areEqual(this.payment_personal_to_c4b, getC4bEligibilityResponse.payment_personal_to_c4b) && Intrinsics.areEqual(this.payment_send_as_btc, getC4bEligibilityResponse.payment_send_as_btc) && Intrinsics.areEqual(this.payment_send_as_stock, getC4bEligibilityResponse.payment_send_as_stock) && Intrinsics.areEqual(this.payment_send_as_gift_card, getC4bEligibilityResponse.payment_send_as_gift_card) && Intrinsics.areEqual(this.remittance_send, getC4bEligibilityResponse.remittance_send) && Intrinsics.areEqual(this.settings_invest_trusted_contact_app, getC4bEligibilityResponse.settings_invest_trusted_contact_app) && Intrinsics.areEqual(this.settings_tax_password_auth_app, getC4bEligibilityResponse.settings_tax_password_auth_app) && Intrinsics.areEqual(this.sponsor_eligible_customer, getC4bEligibilityResponse.sponsor_eligible_customer) && Intrinsics.areEqual(this.tap_to_pay_visibility, getC4bEligibilityResponse.tap_to_pay_visibility) && Intrinsics.areEqual(this.cash_shopping_p13n_toggle, getC4bEligibilityResponse.cash_shopping_p13n_toggle) && Intrinsics.areEqual(this.moneybot_visibility, getC4bEligibilityResponse.moneybot_visibility) && Intrinsics.areEqual(this.limits_hub_redesign_visibility, getC4bEligibilityResponse.limits_hub_redesign_visibility) && Intrinsics.areEqual(this.personalized_ads_toggle, getC4bEligibilityResponse.personalized_ads_toggle) && Intrinsics.areEqual(this.pools_onboarding_visibility, getC4bEligibilityResponse.pools_onboarding_visibility) && Intrinsics.areEqual(this.work_applet_visibility, getC4bEligibilityResponse.work_applet_visibility) && Intrinsics.areEqual(this.kid_sponsor_eligible_customer, getC4bEligibilityResponse.kid_sponsor_eligible_customer) && Intrinsics.areEqual(this.nearby_payment_feature_visibility, getC4bEligibilityResponse.nearby_payment_feature_visibility) && Intrinsics.areEqual(this.bitcoin_auto_invest, getC4bEligibilityResponse.bitcoin_auto_invest) && Intrinsics.areEqual(this.recurring_p2p_payment_feature_visibility, getC4bEligibilityResponse.recurring_p2p_payment_feature_visibility);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.ttl;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        C4bEligibilityState c4bEligibilityState = this.account_switcher;
        int hashCode4 = (hashCode3 + (c4bEligibilityState != null ? c4bEligibilityState.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState2 = this.activity_treehouse;
        int hashCode5 = (hashCode4 + (c4bEligibilityState2 != null ? c4bEligibilityState2.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState3 = this.cash_card_tab;
        int hashCode6 = (hashCode5 + (c4bEligibilityState3 != null ? c4bEligibilityState3.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState4 = this.cash_offers_tab;
        int hashCode7 = (hashCode6 + (c4bEligibilityState4 != null ? c4bEligibilityState4.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState5 = this.c4b_promotion_visibility;
        int hashCode8 = (hashCode7 + (c4bEligibilityState5 != null ? c4bEligibilityState5.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState6 = this.dda_tab;
        int hashCode9 = (hashCode8 + (c4bEligibilityState6 != null ? c4bEligibilityState6.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState7 = this.documents_btc;
        int hashCode10 = (hashCode9 + (c4bEligibilityState7 != null ? c4bEligibilityState7.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState8 = this.documents_stock;
        int hashCode11 = (hashCode10 + (c4bEligibilityState8 != null ? c4bEligibilityState8.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState9 = this.documents_taxes;
        int hashCode12 = (hashCode11 + (c4bEligibilityState9 != null ? c4bEligibilityState9.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState10 = this.limits_btc;
        int hashCode13 = (hashCode12 + (c4bEligibilityState10 != null ? c4bEligibilityState10.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState11 = this.money_btc_applet;
        int hashCode14 = (hashCode13 + (c4bEligibilityState11 != null ? c4bEligibilityState11.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState12 = this.money_earnings_applet;
        int hashCode15 = (hashCode14 + (c4bEligibilityState12 != null ? c4bEligibilityState12.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState13 = this.money_families_applet;
        int hashCode16 = (hashCode15 + (c4bEligibilityState13 != null ? c4bEligibilityState13.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState14 = this.money_global_borrow_applet;
        int hashCode17 = (hashCode16 + (c4bEligibilityState14 != null ? c4bEligibilityState14.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState15 = this.money_investing_applet;
        int hashCode18 = (hashCode17 + (c4bEligibilityState15 != null ? c4bEligibilityState15.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState16 = this.money_tab_home_design_system;
        int hashCode19 = (hashCode18 + (c4bEligibilityState16 != null ? c4bEligibilityState16.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState17 = this.money_taxes_applet;
        int hashCode20 = (hashCode19 + (c4bEligibilityState17 != null ? c4bEligibilityState17.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState18 = this.payment_personal_to_c4b;
        int hashCode21 = (hashCode20 + (c4bEligibilityState18 != null ? c4bEligibilityState18.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState19 = this.payment_send_as_btc;
        int hashCode22 = (hashCode21 + (c4bEligibilityState19 != null ? c4bEligibilityState19.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState20 = this.payment_send_as_stock;
        int hashCode23 = (hashCode22 + (c4bEligibilityState20 != null ? c4bEligibilityState20.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState21 = this.payment_send_as_gift_card;
        int hashCode24 = (hashCode23 + (c4bEligibilityState21 != null ? c4bEligibilityState21.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState22 = this.remittance_send;
        int hashCode25 = (hashCode24 + (c4bEligibilityState22 != null ? c4bEligibilityState22.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState23 = this.settings_invest_trusted_contact_app;
        int hashCode26 = (hashCode25 + (c4bEligibilityState23 != null ? c4bEligibilityState23.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState24 = this.settings_tax_password_auth_app;
        int hashCode27 = (hashCode26 + (c4bEligibilityState24 != null ? c4bEligibilityState24.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState25 = this.sponsor_eligible_customer;
        int hashCode28 = (hashCode27 + (c4bEligibilityState25 != null ? c4bEligibilityState25.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState26 = this.tap_to_pay_visibility;
        int hashCode29 = (hashCode28 + (c4bEligibilityState26 != null ? c4bEligibilityState26.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState27 = this.cash_shopping_p13n_toggle;
        int hashCode30 = (hashCode29 + (c4bEligibilityState27 != null ? c4bEligibilityState27.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState28 = this.moneybot_visibility;
        int hashCode31 = (hashCode30 + (c4bEligibilityState28 != null ? c4bEligibilityState28.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState29 = this.limits_hub_redesign_visibility;
        int hashCode32 = (hashCode31 + (c4bEligibilityState29 != null ? c4bEligibilityState29.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState30 = this.personalized_ads_toggle;
        int hashCode33 = (hashCode32 + (c4bEligibilityState30 != null ? c4bEligibilityState30.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState31 = this.pools_onboarding_visibility;
        int hashCode34 = (hashCode33 + (c4bEligibilityState31 != null ? c4bEligibilityState31.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState32 = this.work_applet_visibility;
        int hashCode35 = (hashCode34 + (c4bEligibilityState32 != null ? c4bEligibilityState32.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState33 = this.kid_sponsor_eligible_customer;
        int hashCode36 = (hashCode35 + (c4bEligibilityState33 != null ? c4bEligibilityState33.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState34 = this.nearby_payment_feature_visibility;
        int hashCode37 = (hashCode36 + (c4bEligibilityState34 != null ? c4bEligibilityState34.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState35 = this.bitcoin_auto_invest;
        int hashCode38 = (hashCode37 + (c4bEligibilityState35 != null ? c4bEligibilityState35.hashCode() : 0)) * 37;
        C4bEligibilityState c4bEligibilityState36 = this.recurring_p2p_payment_feature_visibility;
        int hashCode39 = hashCode38 + (c4bEligibilityState36 != null ? c4bEligibilityState36.hashCode() : 0);
        this.hashCode = hashCode39;
        return hashCode39;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Order.Builder builder = new Order.Builder(1);
        builder.token = this.customer_token;
        builder.expiration_epoch_ms = this.ttl;
        builder.fiat_instrument_token = this.account_switcher;
        builder.crypto_instrument_token = this.activity_treehouse;
        builder.funding_transaction_token = this.cash_card_tab;
        builder.customer_token = this.cash_offers_tab;
        builder.idempotence_token = this.c4b_promotion_visibility;
        builder.push_transaction_token = this.dda_tab;
        builder.source_instrument_token = this.documents_btc;
        builder.target_instrument_token = this.documents_stock;
        builder.source_transaction_token = this.documents_taxes;
        builder.target_transaction_token = this.limits_btc;
        builder.side = this.money_btc_applet;
        builder.f1281type = this.money_earnings_applet;
        builder.state = this.money_families_applet;
        builder.crypto_amount = this.money_global_borrow_applet;
        builder.fiat_amount = this.money_investing_applet;
        builder.fee = this.money_tab_home_design_system;
        builder.current_price = this.money_taxes_applet;
        builder.target_price = this.payment_personal_to_c4b;
        builder.original_price = this.payment_send_as_btc;
        builder.final_price = this.payment_send_as_stock;
        builder.source_money = this.payment_send_as_gift_card;
        builder.target_money = this.remittance_send;
        builder.reference_price = this.settings_invest_trusted_contact_app;
        builder.spread_price_fee = this.settings_tax_password_auth_app;
        builder.fee_strategy = this.sponsor_eligible_customer;
        builder.creation_epoch_ms = this.tap_to_pay_visibility;
        builder.origin = this.cash_shopping_p13n_toggle;
        builder.feature = this.moneybot_visibility;
        builder.recurring_schedule = this.limits_hub_redesign_visibility;
        builder.price_strategy = this.personalized_ads_toggle;
        builder.feature_metadata = this.pools_onboarding_visibility;
        builder.price_spread_bps = this.work_applet_visibility;
        builder.incorporated_spread_bps = this.kid_sponsor_eligible_customer;
        builder.order_sponsorship = this.nearby_payment_feature_visibility;
        builder.funding_source = this.bitcoin_auto_invest;
        builder.trading_model = this.recurring_p2p_payment_feature_visibility;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        Long l = this.ttl;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("ttl=", l, arrayList);
        }
        C4bEligibilityState c4bEligibilityState = this.account_switcher;
        if (c4bEligibilityState != null) {
            SizeMode$EnumUnboxingLocalUtility.m("account_switcher=", c4bEligibilityState, arrayList);
        }
        C4bEligibilityState c4bEligibilityState2 = this.activity_treehouse;
        if (c4bEligibilityState2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("activity_treehouse=", c4bEligibilityState2, arrayList);
        }
        C4bEligibilityState c4bEligibilityState3 = this.cash_card_tab;
        if (c4bEligibilityState3 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("cash_card_tab=", c4bEligibilityState3, arrayList);
        }
        C4bEligibilityState c4bEligibilityState4 = this.cash_offers_tab;
        if (c4bEligibilityState4 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("cash_offers_tab=", c4bEligibilityState4, arrayList);
        }
        C4bEligibilityState c4bEligibilityState5 = this.c4b_promotion_visibility;
        if (c4bEligibilityState5 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("c4b_promotion_visibility=", c4bEligibilityState5, arrayList);
        }
        C4bEligibilityState c4bEligibilityState6 = this.dda_tab;
        if (c4bEligibilityState6 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("dda_tab=", c4bEligibilityState6, arrayList);
        }
        C4bEligibilityState c4bEligibilityState7 = this.documents_btc;
        if (c4bEligibilityState7 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("documents_btc=", c4bEligibilityState7, arrayList);
        }
        C4bEligibilityState c4bEligibilityState8 = this.documents_stock;
        if (c4bEligibilityState8 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("documents_stock=", c4bEligibilityState8, arrayList);
        }
        C4bEligibilityState c4bEligibilityState9 = this.documents_taxes;
        if (c4bEligibilityState9 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("documents_taxes=", c4bEligibilityState9, arrayList);
        }
        C4bEligibilityState c4bEligibilityState10 = this.limits_btc;
        if (c4bEligibilityState10 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("limits_btc=", c4bEligibilityState10, arrayList);
        }
        C4bEligibilityState c4bEligibilityState11 = this.money_btc_applet;
        if (c4bEligibilityState11 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("money_btc_applet=", c4bEligibilityState11, arrayList);
        }
        C4bEligibilityState c4bEligibilityState12 = this.money_earnings_applet;
        if (c4bEligibilityState12 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("money_earnings_applet=", c4bEligibilityState12, arrayList);
        }
        C4bEligibilityState c4bEligibilityState13 = this.money_families_applet;
        if (c4bEligibilityState13 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("money_families_applet=", c4bEligibilityState13, arrayList);
        }
        C4bEligibilityState c4bEligibilityState14 = this.money_global_borrow_applet;
        if (c4bEligibilityState14 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("money_global_borrow_applet=", c4bEligibilityState14, arrayList);
        }
        C4bEligibilityState c4bEligibilityState15 = this.money_investing_applet;
        if (c4bEligibilityState15 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("money_investing_applet=", c4bEligibilityState15, arrayList);
        }
        C4bEligibilityState c4bEligibilityState16 = this.money_tab_home_design_system;
        if (c4bEligibilityState16 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("money_tab_home_design_system=", c4bEligibilityState16, arrayList);
        }
        C4bEligibilityState c4bEligibilityState17 = this.money_taxes_applet;
        if (c4bEligibilityState17 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("money_taxes_applet=", c4bEligibilityState17, arrayList);
        }
        C4bEligibilityState c4bEligibilityState18 = this.payment_personal_to_c4b;
        if (c4bEligibilityState18 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("payment_personal_to_c4b=", c4bEligibilityState18, arrayList);
        }
        C4bEligibilityState c4bEligibilityState19 = this.payment_send_as_btc;
        if (c4bEligibilityState19 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("payment_send_as_btc=", c4bEligibilityState19, arrayList);
        }
        C4bEligibilityState c4bEligibilityState20 = this.payment_send_as_stock;
        if (c4bEligibilityState20 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("payment_send_as_stock=", c4bEligibilityState20, arrayList);
        }
        C4bEligibilityState c4bEligibilityState21 = this.payment_send_as_gift_card;
        if (c4bEligibilityState21 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("payment_send_as_gift_card=", c4bEligibilityState21, arrayList);
        }
        C4bEligibilityState c4bEligibilityState22 = this.remittance_send;
        if (c4bEligibilityState22 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("remittance_send=", c4bEligibilityState22, arrayList);
        }
        C4bEligibilityState c4bEligibilityState23 = this.settings_invest_trusted_contact_app;
        if (c4bEligibilityState23 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("settings_invest_trusted_contact_app=", c4bEligibilityState23, arrayList);
        }
        C4bEligibilityState c4bEligibilityState24 = this.settings_tax_password_auth_app;
        if (c4bEligibilityState24 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("settings_tax_password_auth_app=", c4bEligibilityState24, arrayList);
        }
        C4bEligibilityState c4bEligibilityState25 = this.sponsor_eligible_customer;
        if (c4bEligibilityState25 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("sponsor_eligible_customer=", c4bEligibilityState25, arrayList);
        }
        C4bEligibilityState c4bEligibilityState26 = this.tap_to_pay_visibility;
        if (c4bEligibilityState26 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("tap_to_pay_visibility=", c4bEligibilityState26, arrayList);
        }
        C4bEligibilityState c4bEligibilityState27 = this.cash_shopping_p13n_toggle;
        if (c4bEligibilityState27 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("cash_shopping_p13n_toggle=", c4bEligibilityState27, arrayList);
        }
        C4bEligibilityState c4bEligibilityState28 = this.moneybot_visibility;
        if (c4bEligibilityState28 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("moneybot_visibility=", c4bEligibilityState28, arrayList);
        }
        C4bEligibilityState c4bEligibilityState29 = this.limits_hub_redesign_visibility;
        if (c4bEligibilityState29 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("limits_hub_redesign_visibility=", c4bEligibilityState29, arrayList);
        }
        C4bEligibilityState c4bEligibilityState30 = this.personalized_ads_toggle;
        if (c4bEligibilityState30 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("personalized_ads_toggle=", c4bEligibilityState30, arrayList);
        }
        C4bEligibilityState c4bEligibilityState31 = this.pools_onboarding_visibility;
        if (c4bEligibilityState31 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("pools_onboarding_visibility=", c4bEligibilityState31, arrayList);
        }
        C4bEligibilityState c4bEligibilityState32 = this.work_applet_visibility;
        if (c4bEligibilityState32 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("work_applet_visibility=", c4bEligibilityState32, arrayList);
        }
        C4bEligibilityState c4bEligibilityState33 = this.kid_sponsor_eligible_customer;
        if (c4bEligibilityState33 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("kid_sponsor_eligible_customer=", c4bEligibilityState33, arrayList);
        }
        C4bEligibilityState c4bEligibilityState34 = this.nearby_payment_feature_visibility;
        if (c4bEligibilityState34 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("nearby_payment_feature_visibility=", c4bEligibilityState34, arrayList);
        }
        C4bEligibilityState c4bEligibilityState35 = this.bitcoin_auto_invest;
        if (c4bEligibilityState35 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("bitcoin_auto_invest=", c4bEligibilityState35, arrayList);
        }
        C4bEligibilityState c4bEligibilityState36 = this.recurring_p2p_payment_feature_visibility;
        if (c4bEligibilityState36 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("recurring_p2p_payment_feature_visibility=", c4bEligibilityState36, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetC4bEligibilityResponse{", "}", 0, null, null, 56);
    }
}
