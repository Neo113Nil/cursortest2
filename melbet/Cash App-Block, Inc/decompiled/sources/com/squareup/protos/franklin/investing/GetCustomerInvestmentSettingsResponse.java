package com.squareup.protos.franklin.investing;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pay.CashAppPayRenderData;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.investing.resources.CustomOrderConfiguration;
import com.squareup.protos.franklin.investing.resources.LearnMoreConfiguration;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/investing/GetCustomerInvestmentSettingsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/pay/CashAppPayRenderData$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetCustomerInvestmentSettingsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetCustomerInvestmentSettingsResponse> CREATOR;
    public final Long bitcoin_chart_polling_rate_ms;
    public final String bitcoin_discovery_url;
    public final String bitcoin_investment_entity_token;
    public final String crypto_in_app_disclosure_url;
    public final CustomOrderConfiguration custom_order_configuration;
    public final String disclosures_web_url;
    public final String documents_disclosure_text;
    public final String drip_disclosure_text;
    public final Long entity_detail_chart_polling_rate_ms;
    public final String entity_details_disclosure_text;
    public final String equities_discovery_url;
    public final String equities_in_app_disclosure_url;
    public final List equity_discovery_animation_tiles;
    public final String first_time_congrats_bitcoin_text;
    public final String first_time_congrats_bitcoin_title;
    public final String first_time_congrats_equity_detail_text;
    public final String first_time_congrats_equity_detail_title;
    public final String first_time_congrats_equity_text;
    public final String first_time_congrats_equity_title;
    public final String investing_home_disclosure_text;
    public final Boolean is_trusted_contact_enabled;
    public final Money min_scheduled_btc_buy_amt;
    public final Money min_scheduled_equity_buy_amt;
    public final LearnMoreConfiguration my_first_bitcoin_configuration;
    public final LearnMoreConfiguration my_first_stock_configuration;
    public final String my_watchlist_description;
    public final Long portfolio_chart_polling_rate_ms;
    public final Money purchase_limit;
    public final ResponseContext response_context;
    public final Boolean scheduled_btc_buys_enabled;
    public final Boolean scheduled_equity_buys_enabled;
    public final Money sell_limit;

    static {
        GetCustomerInvestmentSettingsResponse$Companion$ADAPTER$1 getCustomerInvestmentSettingsResponse$Companion$ADAPTER$1 = new GetCustomerInvestmentSettingsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetCustomerInvestmentSettingsResponse.class), "type.googleapis.com/squareup.franklin.investing.GetCustomerInvestmentSettingsResponse", Syntax.PROTO_2, null, "squareup/franklin/investing.proto");
        ADAPTER = getCustomerInvestmentSettingsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getCustomerInvestmentSettingsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCustomerInvestmentSettingsResponse(Money money, Money money2, String str, String str2, String str3, String str4, String str5, ResponseContext responseContext, String str6, LearnMoreConfiguration learnMoreConfiguration, String str7, String str8, List list, Long l, Long l2, Long l3, LearnMoreConfiguration learnMoreConfiguration2, Boolean bool, Boolean bool2, Money money3, Money money4, String str9, CustomOrderConfiguration customOrderConfiguration, String str10, String str11, String str12, String str13, Boolean bool3, String str14, String str15, String str16, String str17, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.purchase_limit = money;
        this.sell_limit = money2;
        this.equities_in_app_disclosure_url = str;
        this.equities_discovery_url = str2;
        this.bitcoin_discovery_url = str3;
        this.disclosures_web_url = str4;
        this.my_watchlist_description = str5;
        this.response_context = responseContext;
        this.crypto_in_app_disclosure_url = str6;
        this.my_first_stock_configuration = learnMoreConfiguration;
        this.first_time_congrats_equity_text = str7;
        this.first_time_congrats_bitcoin_text = str8;
        this.portfolio_chart_polling_rate_ms = l;
        this.bitcoin_chart_polling_rate_ms = l2;
        this.entity_detail_chart_polling_rate_ms = l3;
        this.my_first_bitcoin_configuration = learnMoreConfiguration2;
        this.scheduled_btc_buys_enabled = bool;
        this.scheduled_equity_buys_enabled = bool2;
        this.min_scheduled_btc_buy_amt = money3;
        this.min_scheduled_equity_buy_amt = money4;
        this.bitcoin_investment_entity_token = str9;
        this.custom_order_configuration = customOrderConfiguration;
        this.first_time_congrats_equity_title = str10;
        this.first_time_congrats_bitcoin_title = str11;
        this.first_time_congrats_equity_detail_title = str12;
        this.first_time_congrats_equity_detail_text = str13;
        this.is_trusted_contact_enabled = bool3;
        this.investing_home_disclosure_text = str14;
        this.entity_details_disclosure_text = str15;
        this.documents_disclosure_text = str16;
        this.drip_disclosure_text = str17;
        this.equity_discovery_animation_tiles = TransactorKt.immutableCopyOf("equity_discovery_animation_tiles", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetCustomerInvestmentSettingsResponse)) {
            return false;
        }
        GetCustomerInvestmentSettingsResponse getCustomerInvestmentSettingsResponse = (GetCustomerInvestmentSettingsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getCustomerInvestmentSettingsResponse.unknownFields()) && Intrinsics.areEqual(this.purchase_limit, getCustomerInvestmentSettingsResponse.purchase_limit) && Intrinsics.areEqual(this.sell_limit, getCustomerInvestmentSettingsResponse.sell_limit) && Intrinsics.areEqual(this.equities_in_app_disclosure_url, getCustomerInvestmentSettingsResponse.equities_in_app_disclosure_url) && Intrinsics.areEqual(this.equities_discovery_url, getCustomerInvestmentSettingsResponse.equities_discovery_url) && Intrinsics.areEqual(this.bitcoin_discovery_url, getCustomerInvestmentSettingsResponse.bitcoin_discovery_url) && Intrinsics.areEqual(this.disclosures_web_url, getCustomerInvestmentSettingsResponse.disclosures_web_url) && Intrinsics.areEqual(this.my_watchlist_description, getCustomerInvestmentSettingsResponse.my_watchlist_description) && Intrinsics.areEqual(this.response_context, getCustomerInvestmentSettingsResponse.response_context) && Intrinsics.areEqual(this.crypto_in_app_disclosure_url, getCustomerInvestmentSettingsResponse.crypto_in_app_disclosure_url) && Intrinsics.areEqual(this.my_first_stock_configuration, getCustomerInvestmentSettingsResponse.my_first_stock_configuration) && Intrinsics.areEqual(this.first_time_congrats_equity_text, getCustomerInvestmentSettingsResponse.first_time_congrats_equity_text) && Intrinsics.areEqual(this.first_time_congrats_bitcoin_text, getCustomerInvestmentSettingsResponse.first_time_congrats_bitcoin_text) && Intrinsics.areEqual(this.equity_discovery_animation_tiles, getCustomerInvestmentSettingsResponse.equity_discovery_animation_tiles) && Intrinsics.areEqual(this.portfolio_chart_polling_rate_ms, getCustomerInvestmentSettingsResponse.portfolio_chart_polling_rate_ms) && Intrinsics.areEqual(this.bitcoin_chart_polling_rate_ms, getCustomerInvestmentSettingsResponse.bitcoin_chart_polling_rate_ms) && Intrinsics.areEqual(this.entity_detail_chart_polling_rate_ms, getCustomerInvestmentSettingsResponse.entity_detail_chart_polling_rate_ms) && Intrinsics.areEqual(this.my_first_bitcoin_configuration, getCustomerInvestmentSettingsResponse.my_first_bitcoin_configuration) && Intrinsics.areEqual(this.scheduled_btc_buys_enabled, getCustomerInvestmentSettingsResponse.scheduled_btc_buys_enabled) && Intrinsics.areEqual(this.scheduled_equity_buys_enabled, getCustomerInvestmentSettingsResponse.scheduled_equity_buys_enabled) && Intrinsics.areEqual(this.min_scheduled_btc_buy_amt, getCustomerInvestmentSettingsResponse.min_scheduled_btc_buy_amt) && Intrinsics.areEqual(this.min_scheduled_equity_buy_amt, getCustomerInvestmentSettingsResponse.min_scheduled_equity_buy_amt) && Intrinsics.areEqual(this.bitcoin_investment_entity_token, getCustomerInvestmentSettingsResponse.bitcoin_investment_entity_token) && Intrinsics.areEqual(this.custom_order_configuration, getCustomerInvestmentSettingsResponse.custom_order_configuration) && Intrinsics.areEqual(this.first_time_congrats_equity_title, getCustomerInvestmentSettingsResponse.first_time_congrats_equity_title) && Intrinsics.areEqual(this.first_time_congrats_bitcoin_title, getCustomerInvestmentSettingsResponse.first_time_congrats_bitcoin_title) && Intrinsics.areEqual(this.first_time_congrats_equity_detail_title, getCustomerInvestmentSettingsResponse.first_time_congrats_equity_detail_title) && Intrinsics.areEqual(this.first_time_congrats_equity_detail_text, getCustomerInvestmentSettingsResponse.first_time_congrats_equity_detail_text) && Intrinsics.areEqual(this.is_trusted_contact_enabled, getCustomerInvestmentSettingsResponse.is_trusted_contact_enabled) && Intrinsics.areEqual(this.investing_home_disclosure_text, getCustomerInvestmentSettingsResponse.investing_home_disclosure_text) && Intrinsics.areEqual(this.entity_details_disclosure_text, getCustomerInvestmentSettingsResponse.entity_details_disclosure_text) && Intrinsics.areEqual(this.documents_disclosure_text, getCustomerInvestmentSettingsResponse.documents_disclosure_text) && Intrinsics.areEqual(this.drip_disclosure_text, getCustomerInvestmentSettingsResponse.drip_disclosure_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.purchase_limit;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.sell_limit;
        int hashCode3 = (hashCode2 + (money2 != null ? money2.hashCode() : 0)) * 37;
        String str = this.equities_in_app_disclosure_url;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.equities_discovery_url;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.bitcoin_discovery_url;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.disclosures_web_url;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.my_watchlist_description;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode9 = (hashCode8 + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        String str6 = this.crypto_in_app_disclosure_url;
        int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 37;
        LearnMoreConfiguration learnMoreConfiguration = this.my_first_stock_configuration;
        int hashCode11 = (hashCode10 + (learnMoreConfiguration != null ? learnMoreConfiguration.hashCode() : 0)) * 37;
        String str7 = this.first_time_congrats_equity_text;
        int hashCode12 = (hashCode11 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.first_time_congrats_bitcoin_text;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode12 + (str8 != null ? str8.hashCode() : 0)) * 37, 37, this.equity_discovery_animation_tiles);
        Long l = this.portfolio_chart_polling_rate_ms;
        int hashCode13 = (m + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.bitcoin_chart_polling_rate_ms;
        int hashCode14 = (hashCode13 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.entity_detail_chart_polling_rate_ms;
        int hashCode15 = (hashCode14 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        LearnMoreConfiguration learnMoreConfiguration2 = this.my_first_bitcoin_configuration;
        int hashCode16 = (hashCode15 + (learnMoreConfiguration2 != null ? learnMoreConfiguration2.hashCode() : 0)) * 37;
        Boolean bool = this.scheduled_btc_buys_enabled;
        int hashCode17 = (hashCode16 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.scheduled_equity_buys_enabled;
        int hashCode18 = (hashCode17 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Money money3 = this.min_scheduled_btc_buy_amt;
        int hashCode19 = (hashCode18 + (money3 != null ? money3.hashCode() : 0)) * 37;
        Money money4 = this.min_scheduled_equity_buy_amt;
        int hashCode20 = (hashCode19 + (money4 != null ? money4.hashCode() : 0)) * 37;
        String str9 = this.bitcoin_investment_entity_token;
        int hashCode21 = (hashCode20 + (str9 != null ? str9.hashCode() : 0)) * 37;
        CustomOrderConfiguration customOrderConfiguration = this.custom_order_configuration;
        int hashCode22 = (hashCode21 + (customOrderConfiguration != null ? customOrderConfiguration.hashCode() : 0)) * 37;
        String str10 = this.first_time_congrats_equity_title;
        int hashCode23 = (hashCode22 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.first_time_congrats_bitcoin_title;
        int hashCode24 = (hashCode23 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.first_time_congrats_equity_detail_title;
        int hashCode25 = (hashCode24 + (str12 != null ? str12.hashCode() : 0)) * 37;
        String str13 = this.first_time_congrats_equity_detail_text;
        int hashCode26 = (hashCode25 + (str13 != null ? str13.hashCode() : 0)) * 37;
        Boolean bool3 = this.is_trusted_contact_enabled;
        int hashCode27 = (hashCode26 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        String str14 = this.investing_home_disclosure_text;
        int hashCode28 = (hashCode27 + (str14 != null ? str14.hashCode() : 0)) * 37;
        String str15 = this.entity_details_disclosure_text;
        int hashCode29 = (hashCode28 + (str15 != null ? str15.hashCode() : 0)) * 37;
        String str16 = this.documents_disclosure_text;
        int hashCode30 = (hashCode29 + (str16 != null ? str16.hashCode() : 0)) * 37;
        String str17 = this.drip_disclosure_text;
        int hashCode31 = hashCode30 + (str17 != null ? str17.hashCode() : 0);
        this.hashCode = hashCode31;
        return hashCode31;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CashAppPayRenderData.Builder builder = new CashAppPayRenderData.Builder(1);
        builder.customer_auth_money = this.purchase_limit;
        builder.customer_capture_money = this.sell_limit;
        builder.authorization_channel = this.equities_in_app_disclosure_url;
        builder.state = this.equities_discovery_url;
        builder.order_id = this.bitcoin_discovery_url;
        builder.loan_token = this.disclosures_web_url;
        builder.tila_document_token = this.my_watchlist_description;
        builder.recurring_series_ids = this.response_context;
        builder.payment_plan_flow_url = this.crypto_in_app_disclosure_url;
        builder.linked_refund_tokens = this.my_first_stock_configuration;
        builder.linked_refunds = this.first_time_congrats_equity_text;
        builder.dispute_tokens = this.first_time_congrats_bitcoin_text;
        builder.failure_reasons = this.equity_discovery_animation_tiles;
        builder.customer_variable_discount_bps = this.portfolio_chart_polling_rate_ms;
        builder.disputes = this.bitcoin_chart_polling_rate_ms;
        builder.customer_variable_discount_money = this.entity_detail_chart_polling_rate_ms;
        builder.customer_discount_reclaimed_money = this.my_first_bitcoin_configuration;
        builder.has_pending_refund_capture = this.scheduled_btc_buys_enabled;
        builder.customer_void_money = this.scheduled_equity_buys_enabled;
        builder.customer_discount_money = this.min_scheduled_btc_buy_amt;
        builder.customer_fixed_discount_money = this.min_scheduled_equity_buy_amt;
        builder.customer_total_refund_money = this.bitcoin_investment_entity_token;
        builder.customer_dispute_credit_money = this.custom_order_configuration;
        builder.customer_dispute_final_money = this.first_time_congrats_equity_title;
        builder.customer_dispute_clawback_money = this.first_time_congrats_bitcoin_title;
        builder.loan_fee_money = this.first_time_congrats_equity_detail_title;
        builder.loan_borrowed_money = this.first_time_congrats_equity_detail_text;
        builder.loan_down_payment_money = this.is_trusted_contact_enabled;
        builder.loan_remaining_money = this.investing_home_disclosure_text;
        builder.customer_deposit_money = this.entity_details_disclosure_text;
        builder.loan_total_payment_count = this.documents_disclosure_text;
        builder.entity_type = this.drip_disclosure_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.purchase_limit;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("purchase_limit=", money, arrayList);
        }
        Money money2 = this.sell_limit;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("sell_limit=", money2, arrayList);
        }
        String str = this.equities_in_app_disclosure_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "equities_in_app_disclosure_url=", arrayList);
        }
        String str2 = this.equities_discovery_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "equities_discovery_url=", arrayList);
        }
        String str3 = this.bitcoin_discovery_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "bitcoin_discovery_url=", arrayList);
        }
        String str4 = this.disclosures_web_url;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "disclosures_web_url=", arrayList);
        }
        String str5 = this.my_watchlist_description;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "my_watchlist_description=", arrayList);
        }
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        String str6 = this.crypto_in_app_disclosure_url;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "crypto_in_app_disclosure_url=", arrayList);
        }
        LearnMoreConfiguration learnMoreConfiguration = this.my_first_stock_configuration;
        if (learnMoreConfiguration != null) {
            arrayList.add("my_first_stock_configuration=" + learnMoreConfiguration);
        }
        String str7 = this.first_time_congrats_equity_text;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "first_time_congrats_equity_text=", arrayList);
        }
        String str8 = this.first_time_congrats_bitcoin_text;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "first_time_congrats_bitcoin_text=", arrayList);
        }
        List list = this.equity_discovery_animation_tiles;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("equity_discovery_animation_tiles=", arrayList, list);
        }
        Long l = this.portfolio_chart_polling_rate_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("portfolio_chart_polling_rate_ms=", l, arrayList);
        }
        Long l2 = this.bitcoin_chart_polling_rate_ms;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("bitcoin_chart_polling_rate_ms=", l2, arrayList);
        }
        Long l3 = this.entity_detail_chart_polling_rate_ms;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("entity_detail_chart_polling_rate_ms=", l3, arrayList);
        }
        LearnMoreConfiguration learnMoreConfiguration2 = this.my_first_bitcoin_configuration;
        if (learnMoreConfiguration2 != null) {
            arrayList.add("my_first_bitcoin_configuration=" + learnMoreConfiguration2);
        }
        Boolean bool = this.scheduled_btc_buys_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("scheduled_btc_buys_enabled=", bool, arrayList);
        }
        Boolean bool2 = this.scheduled_equity_buys_enabled;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("scheduled_equity_buys_enabled=", bool2, arrayList);
        }
        Money money3 = this.min_scheduled_btc_buy_amt;
        if (money3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("min_scheduled_btc_buy_amt=", money3, arrayList);
        }
        Money money4 = this.min_scheduled_equity_buy_amt;
        if (money4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("min_scheduled_equity_buy_amt=", money4, arrayList);
        }
        String str9 = this.bitcoin_investment_entity_token;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "bitcoin_investment_entity_token=", arrayList);
        }
        CustomOrderConfiguration customOrderConfiguration = this.custom_order_configuration;
        if (customOrderConfiguration != null) {
            arrayList.add("custom_order_configuration=" + customOrderConfiguration);
        }
        String str10 = this.first_time_congrats_equity_title;
        if (str10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, "first_time_congrats_equity_title=", arrayList);
        }
        String str11 = this.first_time_congrats_bitcoin_title;
        if (str11 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str11, "first_time_congrats_bitcoin_title=", arrayList);
        }
        String str12 = this.first_time_congrats_equity_detail_title;
        if (str12 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str12, "first_time_congrats_equity_detail_title=", arrayList);
        }
        String str13 = this.first_time_congrats_equity_detail_text;
        if (str13 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str13, "first_time_congrats_equity_detail_text=", arrayList);
        }
        Boolean bool3 = this.is_trusted_contact_enabled;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_trusted_contact_enabled=", bool3, arrayList);
        }
        String str14 = this.investing_home_disclosure_text;
        if (str14 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str14, "investing_home_disclosure_text=", arrayList);
        }
        String str15 = this.entity_details_disclosure_text;
        if (str15 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str15, "entity_details_disclosure_text=", arrayList);
        }
        String str16 = this.documents_disclosure_text;
        if (str16 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str16, "documents_disclosure_text=", arrayList);
        }
        String str17 = this.drip_disclosure_text;
        if (str17 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str17, "drip_disclosure_text=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCustomerInvestmentSettingsResponse{", "}", 0, null, null, 56);
    }
}
