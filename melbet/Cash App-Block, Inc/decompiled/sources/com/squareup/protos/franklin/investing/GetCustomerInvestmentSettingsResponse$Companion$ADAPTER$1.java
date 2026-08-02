package com.squareup.protos.franklin.investing;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.investing.resources.CustomOrderConfiguration;
import com.squareup.protos.franklin.investing.resources.EquityDiscoveryAnimationTile;
import com.squareup.protos.franklin.investing.resources.LearnMoreConfiguration;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetCustomerInvestmentSettingsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0047. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
        Object obj18 = null;
        Object obj19 = null;
        Object obj20 = null;
        Object obj21 = null;
        Object obj22 = null;
        Object obj23 = null;
        Object obj24 = null;
        Object obj25 = null;
        Object obj26 = null;
        Object obj27 = null;
        Object obj28 = null;
        Object obj29 = null;
        Object obj30 = null;
        Object obj31 = null;
        Object obj32 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            Object obj33 = obj10;
            if (nextTag == -1) {
                return new GetCustomerInvestmentSettingsResponse((Money) obj2, (Money) obj4, (String) obj3, (String) obj19, (String) obj20, (String) obj22, (String) obj32, (ResponseContext) obj9, (String) obj33, (LearnMoreConfiguration) obj11, (String) obj12, (String) obj13, m, (Long) obj14, (Long) obj15, (Long) obj16, (LearnMoreConfiguration) obj5, (Boolean) obj17, (Boolean) obj18, (Money) obj6, (Money) obj7, (String) obj21, (CustomOrderConfiguration) obj8, (String) obj23, (String) obj24, (String) obj25, (String) obj26, (Boolean) obj27, (String) obj28, (String) obj29, (String) obj30, (String) obj31, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj2 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj2);
                    obj = obj3;
                    obj10 = obj33;
                    break;
                case 2:
                    obj4 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj4);
                    obj = obj3;
                    obj10 = obj33;
                    break;
                case 3:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    obj10 = obj33;
                    break;
                case 4:
                    obj19 = ProtoAdapter.STRING.decode(protoReader);
                    obj10 = obj33;
                    obj = obj3;
                    break;
                case 5:
                    obj20 = ProtoAdapter.STRING.decode(protoReader);
                    obj10 = obj33;
                    obj = obj3;
                    break;
                case 6:
                    obj22 = ProtoAdapter.STRING.decode(protoReader);
                    obj10 = obj33;
                    obj = obj3;
                    break;
                case 7:
                    obj32 = ProtoAdapter.STRING.decode(protoReader);
                    obj10 = obj33;
                    obj = obj3;
                    break;
                case 8:
                    obj9 = TransactorKt.decodeMessageOrMerge(ResponseContext.ADAPTER, protoReader, obj9);
                    obj10 = obj33;
                    obj = obj3;
                    break;
                case 9:
                    obj10 = ProtoAdapter.STRING.decode(protoReader);
                    obj = obj3;
                    break;
                case 10:
                    obj11 = TransactorKt.decodeMessageOrMerge(LearnMoreConfiguration.ADAPTER, protoReader, obj11);
                    obj10 = obj33;
                    obj = obj3;
                    break;
                case 11:
                    obj12 = ProtoAdapter.STRING.decode(protoReader);
                    obj10 = obj33;
                    obj = obj3;
                    break;
                case 12:
                    obj13 = ProtoAdapter.STRING.decode(protoReader);
                    obj10 = obj33;
                    obj = obj3;
                    break;
                case 13:
                    m.add(EquityDiscoveryAnimationTile.ADAPTER.decode(protoReader));
                    obj = obj3;
                    obj10 = obj33;
                    break;
                case 14:
                    obj14 = ProtoAdapter.INT64.decode(protoReader);
                    obj10 = obj33;
                    obj = obj3;
                    break;
                case 15:
                    obj15 = ProtoAdapter.INT64.decode(protoReader);
                    obj10 = obj33;
                    obj = obj3;
                    break;
                case 16:
                    obj16 = ProtoAdapter.INT64.decode(protoReader);
                    obj10 = obj33;
                    obj = obj3;
                    break;
                case 17:
                    obj5 = TransactorKt.decodeMessageOrMerge(LearnMoreConfiguration.ADAPTER, protoReader, obj5);
                    obj = obj3;
                    obj10 = obj33;
                    break;
                case 18:
                    obj17 = ProtoAdapter.BOOL.decode(protoReader);
                    obj10 = obj33;
                    obj = obj3;
                    break;
                case 19:
                    obj18 = ProtoAdapter.BOOL.decode(protoReader);
                    obj10 = obj33;
                    obj = obj3;
                    break;
                case 20:
                    obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj6);
                    obj = obj3;
                    obj10 = obj33;
                    break;
                case 21:
                    obj7 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj7);
                    obj = obj3;
                    obj10 = obj33;
                    break;
                case 22:
                    obj21 = ProtoAdapter.STRING.decode(protoReader);
                    obj10 = obj33;
                    obj = obj3;
                    break;
                case 23:
                    obj8 = TransactorKt.decodeMessageOrMerge(CustomOrderConfiguration.ADAPTER, protoReader, obj8);
                    obj = obj3;
                    obj10 = obj33;
                    break;
                case 24:
                    obj23 = ProtoAdapter.STRING.decode(protoReader);
                    obj10 = obj33;
                    obj = obj3;
                    break;
                case 25:
                    obj24 = ProtoAdapter.STRING.decode(protoReader);
                    obj10 = obj33;
                    obj = obj3;
                    break;
                case 26:
                    obj25 = ProtoAdapter.STRING.decode(protoReader);
                    obj10 = obj33;
                    obj = obj3;
                    break;
                case 27:
                    obj26 = ProtoAdapter.STRING.decode(protoReader);
                    obj10 = obj33;
                    obj = obj3;
                    break;
                case 28:
                    obj27 = ProtoAdapter.BOOL.decode(protoReader);
                    obj10 = obj33;
                    obj = obj3;
                    break;
                case 29:
                    obj28 = ProtoAdapter.STRING.decode(protoReader);
                    obj10 = obj33;
                    obj = obj3;
                    break;
                case 30:
                    obj29 = ProtoAdapter.STRING.decode(protoReader);
                    obj10 = obj33;
                    obj = obj3;
                    break;
                case 31:
                    obj30 = ProtoAdapter.STRING.decode(protoReader);
                    obj10 = obj33;
                    obj = obj3;
                    break;
                case 32:
                    obj31 = ProtoAdapter.STRING.decode(protoReader);
                    obj10 = obj33;
                    obj = obj3;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj3;
                    obj10 = obj33;
                    break;
            }
            obj3 = obj;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetCustomerInvestmentSettingsResponse getCustomerInvestmentSettingsResponse = (GetCustomerInvestmentSettingsResponse) obj;
        reverseProtoWriter.getClass();
        getCustomerInvestmentSettingsResponse.getClass();
        reverseProtoWriter.writeBytes(getCustomerInvestmentSettingsResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 32, getCustomerInvestmentSettingsResponse.drip_disclosure_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 31, getCustomerInvestmentSettingsResponse.documents_disclosure_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 30, getCustomerInvestmentSettingsResponse.entity_details_disclosure_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 29, getCustomerInvestmentSettingsResponse.investing_home_disclosure_text);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 28, getCustomerInvestmentSettingsResponse.is_trusted_contact_enabled);
        protoAdapter.encodeWithTag(reverseProtoWriter, 27, getCustomerInvestmentSettingsResponse.first_time_congrats_equity_detail_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 26, getCustomerInvestmentSettingsResponse.first_time_congrats_equity_detail_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 25, getCustomerInvestmentSettingsResponse.first_time_congrats_bitcoin_title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 24, getCustomerInvestmentSettingsResponse.first_time_congrats_equity_title);
        CustomOrderConfiguration.ADAPTER.encodeWithTag(reverseProtoWriter, 23, getCustomerInvestmentSettingsResponse.custom_order_configuration);
        protoAdapter.encodeWithTag(reverseProtoWriter, 22, getCustomerInvestmentSettingsResponse.bitcoin_investment_entity_token);
        ProtoAdapter protoAdapter3 = Money.ADAPTER;
        protoAdapter3.encodeWithTag(reverseProtoWriter, 21, getCustomerInvestmentSettingsResponse.min_scheduled_equity_buy_amt);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 20, getCustomerInvestmentSettingsResponse.min_scheduled_btc_buy_amt);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 19, getCustomerInvestmentSettingsResponse.scheduled_equity_buys_enabled);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 18, getCustomerInvestmentSettingsResponse.scheduled_btc_buys_enabled);
        ProtoAdapter protoAdapter4 = LearnMoreConfiguration.ADAPTER;
        protoAdapter4.encodeWithTag(reverseProtoWriter, 17, getCustomerInvestmentSettingsResponse.my_first_bitcoin_configuration);
        ProtoAdapter protoAdapter5 = ProtoAdapter.INT64;
        protoAdapter5.encodeWithTag(reverseProtoWriter, 16, getCustomerInvestmentSettingsResponse.entity_detail_chart_polling_rate_ms);
        protoAdapter5.encodeWithTag(reverseProtoWriter, 15, getCustomerInvestmentSettingsResponse.bitcoin_chart_polling_rate_ms);
        protoAdapter5.encodeWithTag(reverseProtoWriter, 14, getCustomerInvestmentSettingsResponse.portfolio_chart_polling_rate_ms);
        EquityDiscoveryAnimationTile.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 13, getCustomerInvestmentSettingsResponse.equity_discovery_animation_tiles);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, getCustomerInvestmentSettingsResponse.first_time_congrats_bitcoin_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, getCustomerInvestmentSettingsResponse.first_time_congrats_equity_text);
        protoAdapter4.encodeWithTag(reverseProtoWriter, 10, getCustomerInvestmentSettingsResponse.my_first_stock_configuration);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, getCustomerInvestmentSettingsResponse.crypto_in_app_disclosure_url);
        ResponseContext.ADAPTER.encodeWithTag(reverseProtoWriter, 8, getCustomerInvestmentSettingsResponse.response_context);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, getCustomerInvestmentSettingsResponse.my_watchlist_description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, getCustomerInvestmentSettingsResponse.disclosures_web_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, getCustomerInvestmentSettingsResponse.bitcoin_discovery_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, getCustomerInvestmentSettingsResponse.equities_discovery_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, getCustomerInvestmentSettingsResponse.equities_in_app_disclosure_url);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 2, getCustomerInvestmentSettingsResponse.sell_limit);
        protoAdapter3.encodeWithTag(reverseProtoWriter, 1, getCustomerInvestmentSettingsResponse.purchase_limit);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetCustomerInvestmentSettingsResponse getCustomerInvestmentSettingsResponse = (GetCustomerInvestmentSettingsResponse) obj;
        getCustomerInvestmentSettingsResponse.getClass();
        int size$okio = getCustomerInvestmentSettingsResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, getCustomerInvestmentSettingsResponse.sell_limit) + protoAdapter.encodedSizeWithTag(1, getCustomerInvestmentSettingsResponse.purchase_limit) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(9, getCustomerInvestmentSettingsResponse.crypto_in_app_disclosure_url) + ResponseContext.ADAPTER.encodedSizeWithTag(8, getCustomerInvestmentSettingsResponse.response_context) + protoAdapter2.encodedSizeWithTag(7, getCustomerInvestmentSettingsResponse.my_watchlist_description) + protoAdapter2.encodedSizeWithTag(6, getCustomerInvestmentSettingsResponse.disclosures_web_url) + protoAdapter2.encodedSizeWithTag(5, getCustomerInvestmentSettingsResponse.bitcoin_discovery_url) + protoAdapter2.encodedSizeWithTag(4, getCustomerInvestmentSettingsResponse.equities_discovery_url) + protoAdapter2.encodedSizeWithTag(3, getCustomerInvestmentSettingsResponse.equities_in_app_disclosure_url) + encodedSizeWithTag;
        ProtoAdapter protoAdapter3 = LearnMoreConfiguration.ADAPTER;
        int encodedSizeWithTag3 = EquityDiscoveryAnimationTile.ADAPTER.asRepeated().encodedSizeWithTag(13, getCustomerInvestmentSettingsResponse.equity_discovery_animation_tiles) + protoAdapter2.encodedSizeWithTag(12, getCustomerInvestmentSettingsResponse.first_time_congrats_bitcoin_text) + protoAdapter2.encodedSizeWithTag(11, getCustomerInvestmentSettingsResponse.first_time_congrats_equity_text) + protoAdapter3.encodedSizeWithTag(10, getCustomerInvestmentSettingsResponse.my_first_stock_configuration) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter4 = ProtoAdapter.INT64;
        int encodedSizeWithTag4 = protoAdapter3.encodedSizeWithTag(17, getCustomerInvestmentSettingsResponse.my_first_bitcoin_configuration) + protoAdapter4.encodedSizeWithTag(16, getCustomerInvestmentSettingsResponse.entity_detail_chart_polling_rate_ms) + protoAdapter4.encodedSizeWithTag(15, getCustomerInvestmentSettingsResponse.bitcoin_chart_polling_rate_ms) + protoAdapter4.encodedSizeWithTag(14, getCustomerInvestmentSettingsResponse.portfolio_chart_polling_rate_ms) + encodedSizeWithTag3;
        ProtoAdapter protoAdapter5 = ProtoAdapter.BOOL;
        return protoAdapter2.encodedSizeWithTag(32, getCustomerInvestmentSettingsResponse.drip_disclosure_text) + protoAdapter2.encodedSizeWithTag(31, getCustomerInvestmentSettingsResponse.documents_disclosure_text) + protoAdapter2.encodedSizeWithTag(30, getCustomerInvestmentSettingsResponse.entity_details_disclosure_text) + protoAdapter2.encodedSizeWithTag(29, getCustomerInvestmentSettingsResponse.investing_home_disclosure_text) + protoAdapter5.encodedSizeWithTag(28, getCustomerInvestmentSettingsResponse.is_trusted_contact_enabled) + protoAdapter2.encodedSizeWithTag(27, getCustomerInvestmentSettingsResponse.first_time_congrats_equity_detail_text) + protoAdapter2.encodedSizeWithTag(26, getCustomerInvestmentSettingsResponse.first_time_congrats_equity_detail_title) + protoAdapter2.encodedSizeWithTag(25, getCustomerInvestmentSettingsResponse.first_time_congrats_bitcoin_title) + protoAdapter2.encodedSizeWithTag(24, getCustomerInvestmentSettingsResponse.first_time_congrats_equity_title) + CustomOrderConfiguration.ADAPTER.encodedSizeWithTag(23, getCustomerInvestmentSettingsResponse.custom_order_configuration) + protoAdapter2.encodedSizeWithTag(22, getCustomerInvestmentSettingsResponse.bitcoin_investment_entity_token) + protoAdapter.encodedSizeWithTag(21, getCustomerInvestmentSettingsResponse.min_scheduled_equity_buy_amt) + protoAdapter.encodedSizeWithTag(20, getCustomerInvestmentSettingsResponse.min_scheduled_btc_buy_amt) + protoAdapter5.encodedSizeWithTag(19, getCustomerInvestmentSettingsResponse.scheduled_equity_buys_enabled) + protoAdapter5.encodedSizeWithTag(18, getCustomerInvestmentSettingsResponse.scheduled_btc_buys_enabled) + encodedSizeWithTag4;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetCustomerInvestmentSettingsResponse getCustomerInvestmentSettingsResponse = (GetCustomerInvestmentSettingsResponse) obj;
        getCustomerInvestmentSettingsResponse.getClass();
        Money money = getCustomerInvestmentSettingsResponse.purchase_limit;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        Money money3 = getCustomerInvestmentSettingsResponse.sell_limit;
        Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
        ResponseContext responseContext = getCustomerInvestmentSettingsResponse.response_context;
        ResponseContext responseContext2 = responseContext != null ? (ResponseContext) ResponseContext.ADAPTER.redact(responseContext) : null;
        LearnMoreConfiguration learnMoreConfiguration = getCustomerInvestmentSettingsResponse.my_first_stock_configuration;
        LearnMoreConfiguration learnMoreConfiguration2 = learnMoreConfiguration != null ? (LearnMoreConfiguration) LearnMoreConfiguration.ADAPTER.redact(learnMoreConfiguration) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(getCustomerInvestmentSettingsResponse.equity_discovery_animation_tiles, EquityDiscoveryAnimationTile.ADAPTER);
        LearnMoreConfiguration learnMoreConfiguration3 = getCustomerInvestmentSettingsResponse.my_first_bitcoin_configuration;
        LearnMoreConfiguration learnMoreConfiguration4 = learnMoreConfiguration3 != null ? (LearnMoreConfiguration) LearnMoreConfiguration.ADAPTER.redact(learnMoreConfiguration3) : null;
        Money money5 = getCustomerInvestmentSettingsResponse.min_scheduled_btc_buy_amt;
        Money money6 = money5 != null ? (Money) Money.ADAPTER.redact(money5) : null;
        Money money7 = getCustomerInvestmentSettingsResponse.min_scheduled_equity_buy_amt;
        Money money8 = money7 != null ? (Money) Money.ADAPTER.redact(money7) : null;
        CustomOrderConfiguration customOrderConfiguration = getCustomerInvestmentSettingsResponse.custom_order_configuration;
        CustomOrderConfiguration customOrderConfiguration2 = customOrderConfiguration != null ? (CustomOrderConfiguration) CustomOrderConfiguration.ADAPTER.redact(customOrderConfiguration) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = getCustomerInvestmentSettingsResponse.equities_in_app_disclosure_url;
        String str2 = getCustomerInvestmentSettingsResponse.equities_discovery_url;
        String str3 = getCustomerInvestmentSettingsResponse.bitcoin_discovery_url;
        String str4 = getCustomerInvestmentSettingsResponse.disclosures_web_url;
        String str5 = getCustomerInvestmentSettingsResponse.my_watchlist_description;
        String str6 = getCustomerInvestmentSettingsResponse.crypto_in_app_disclosure_url;
        String str7 = getCustomerInvestmentSettingsResponse.first_time_congrats_equity_text;
        String str8 = getCustomerInvestmentSettingsResponse.first_time_congrats_bitcoin_text;
        Long l = getCustomerInvestmentSettingsResponse.portfolio_chart_polling_rate_ms;
        Long l2 = getCustomerInvestmentSettingsResponse.bitcoin_chart_polling_rate_ms;
        Long l3 = getCustomerInvestmentSettingsResponse.entity_detail_chart_polling_rate_ms;
        Boolean bool = getCustomerInvestmentSettingsResponse.scheduled_btc_buys_enabled;
        Boolean bool2 = getCustomerInvestmentSettingsResponse.scheduled_equity_buys_enabled;
        String str9 = getCustomerInvestmentSettingsResponse.bitcoin_investment_entity_token;
        String str10 = getCustomerInvestmentSettingsResponse.first_time_congrats_equity_title;
        String str11 = getCustomerInvestmentSettingsResponse.first_time_congrats_bitcoin_title;
        String str12 = getCustomerInvestmentSettingsResponse.first_time_congrats_equity_detail_title;
        String str13 = getCustomerInvestmentSettingsResponse.first_time_congrats_equity_detail_text;
        Boolean bool3 = getCustomerInvestmentSettingsResponse.is_trusted_contact_enabled;
        String str14 = getCustomerInvestmentSettingsResponse.investing_home_disclosure_text;
        String str15 = getCustomerInvestmentSettingsResponse.entity_details_disclosure_text;
        String str16 = getCustomerInvestmentSettingsResponse.documents_disclosure_text;
        String str17 = getCustomerInvestmentSettingsResponse.drip_disclosure_text;
        byteString.getClass();
        return new GetCustomerInvestmentSettingsResponse(money2, money4, str, str2, str3, str4, str5, responseContext2, str6, learnMoreConfiguration2, str7, str8, m1169redactElements, l, l2, l3, learnMoreConfiguration4, bool, bool2, money6, money8, str9, customOrderConfiguration2, str10, str11, str12, str13, bool3, str14, str15, str16, str17, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetCustomerInvestmentSettingsResponse getCustomerInvestmentSettingsResponse = (GetCustomerInvestmentSettingsResponse) obj;
        getCustomerInvestmentSettingsResponse.getClass();
        ProtoAdapter protoAdapter = Money.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, getCustomerInvestmentSettingsResponse.purchase_limit);
        protoAdapter.encodeWithTag(protoWriter, 2, getCustomerInvestmentSettingsResponse.sell_limit);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 3, getCustomerInvestmentSettingsResponse.equities_in_app_disclosure_url);
        protoAdapter2.encodeWithTag(protoWriter, 4, getCustomerInvestmentSettingsResponse.equities_discovery_url);
        protoAdapter2.encodeWithTag(protoWriter, 5, getCustomerInvestmentSettingsResponse.bitcoin_discovery_url);
        protoAdapter2.encodeWithTag(protoWriter, 6, getCustomerInvestmentSettingsResponse.disclosures_web_url);
        protoAdapter2.encodeWithTag(protoWriter, 7, getCustomerInvestmentSettingsResponse.my_watchlist_description);
        ResponseContext.ADAPTER.encodeWithTag(protoWriter, 8, getCustomerInvestmentSettingsResponse.response_context);
        protoAdapter2.encodeWithTag(protoWriter, 9, getCustomerInvestmentSettingsResponse.crypto_in_app_disclosure_url);
        ProtoAdapter protoAdapter3 = LearnMoreConfiguration.ADAPTER;
        protoAdapter3.encodeWithTag(protoWriter, 10, getCustomerInvestmentSettingsResponse.my_first_stock_configuration);
        protoAdapter2.encodeWithTag(protoWriter, 11, getCustomerInvestmentSettingsResponse.first_time_congrats_equity_text);
        protoAdapter2.encodeWithTag(protoWriter, 12, getCustomerInvestmentSettingsResponse.first_time_congrats_bitcoin_text);
        EquityDiscoveryAnimationTile.ADAPTER.asRepeated().encodeWithTag(protoWriter, 13, getCustomerInvestmentSettingsResponse.equity_discovery_animation_tiles);
        ProtoAdapter protoAdapter4 = ProtoAdapter.INT64;
        protoAdapter4.encodeWithTag(protoWriter, 14, getCustomerInvestmentSettingsResponse.portfolio_chart_polling_rate_ms);
        protoAdapter4.encodeWithTag(protoWriter, 15, getCustomerInvestmentSettingsResponse.bitcoin_chart_polling_rate_ms);
        protoAdapter4.encodeWithTag(protoWriter, 16, getCustomerInvestmentSettingsResponse.entity_detail_chart_polling_rate_ms);
        protoAdapter3.encodeWithTag(protoWriter, 17, getCustomerInvestmentSettingsResponse.my_first_bitcoin_configuration);
        ProtoAdapter protoAdapter5 = ProtoAdapter.BOOL;
        protoAdapter5.encodeWithTag(protoWriter, 18, getCustomerInvestmentSettingsResponse.scheduled_btc_buys_enabled);
        protoAdapter5.encodeWithTag(protoWriter, 19, getCustomerInvestmentSettingsResponse.scheduled_equity_buys_enabled);
        protoAdapter.encodeWithTag(protoWriter, 20, getCustomerInvestmentSettingsResponse.min_scheduled_btc_buy_amt);
        protoAdapter.encodeWithTag(protoWriter, 21, getCustomerInvestmentSettingsResponse.min_scheduled_equity_buy_amt);
        protoAdapter2.encodeWithTag(protoWriter, 22, getCustomerInvestmentSettingsResponse.bitcoin_investment_entity_token);
        CustomOrderConfiguration.ADAPTER.encodeWithTag(protoWriter, 23, getCustomerInvestmentSettingsResponse.custom_order_configuration);
        protoAdapter2.encodeWithTag(protoWriter, 24, getCustomerInvestmentSettingsResponse.first_time_congrats_equity_title);
        protoAdapter2.encodeWithTag(protoWriter, 25, getCustomerInvestmentSettingsResponse.first_time_congrats_bitcoin_title);
        protoAdapter2.encodeWithTag(protoWriter, 26, getCustomerInvestmentSettingsResponse.first_time_congrats_equity_detail_title);
        protoAdapter2.encodeWithTag(protoWriter, 27, getCustomerInvestmentSettingsResponse.first_time_congrats_equity_detail_text);
        protoAdapter5.encodeWithTag(protoWriter, 28, getCustomerInvestmentSettingsResponse.is_trusted_contact_enabled);
        protoAdapter2.encodeWithTag(protoWriter, 29, getCustomerInvestmentSettingsResponse.investing_home_disclosure_text);
        protoAdapter2.encodeWithTag(protoWriter, 30, getCustomerInvestmentSettingsResponse.entity_details_disclosure_text);
        protoAdapter2.encodeWithTag(protoWriter, 31, getCustomerInvestmentSettingsResponse.documents_disclosure_text);
        protoAdapter2.encodeWithTag(protoWriter, 32, getCustomerInvestmentSettingsResponse.drip_disclosure_text);
        protoWriter.writeBytes(getCustomerInvestmentSettingsResponse.unknownFields());
    }
}
