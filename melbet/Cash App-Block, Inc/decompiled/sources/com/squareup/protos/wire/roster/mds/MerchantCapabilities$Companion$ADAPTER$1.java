package com.squareup.protos.wire.roster.mds;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class MerchantCapabilities$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x004c. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        protoReader.getClass();
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
        Object obj33 = null;
        Object obj34 = null;
        Object obj35 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            Object obj36 = obj3;
            if (nextTag == -1) {
                return new MerchantCapabilities((Long) obj2, (Long) obj36, (Long) obj4, (Long) obj5, (Long) obj6, (Long) obj7, (Long) obj8, (Long) obj9, (Long) obj10, (Long) obj11, (Long) obj12, (Long) obj13, (Long) obj14, (Long) obj15, (Long) obj16, (Long) obj17, (Long) obj18, (Long) obj19, (Long) obj20, (Long) obj21, (Long) obj22, (Long) obj23, (Long) obj24, (Long) obj25, (Long) obj26, (Long) obj27, (Long) obj28, (Long) obj29, (Long) obj30, (Long) obj31, (Long) obj32, (Long) obj33, (Long) obj34, (Long) obj35, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    break;
                case 2:
                    obj3 = ProtoAdapter.INT64.decode(protoReader);
                    obj = obj2;
                    break;
                case 3:
                    obj4 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 4:
                    obj5 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 5:
                    obj6 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 6:
                    obj7 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 7:
                    obj8 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 8:
                    obj9 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 9:
                    obj10 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 10:
                    obj11 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 11:
                    obj12 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 12:
                    obj13 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 13:
                    obj14 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 14:
                    obj15 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 15:
                    obj16 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 16:
                    obj17 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 17:
                    obj18 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 18:
                    obj19 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 19:
                    obj20 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 20:
                    obj21 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 21:
                    obj22 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 22:
                    obj23 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 23:
                    obj24 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 24:
                    obj25 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 25:
                    obj26 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 26:
                    obj27 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 27:
                    obj28 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 28:
                    obj29 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 29:
                    obj30 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 30:
                    obj31 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 31:
                    obj32 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 32:
                    obj33 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 33:
                    obj34 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                case 34:
                    obj35 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj36;
                    obj = obj2;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj2;
                    obj3 = obj36;
                    break;
            }
            obj2 = obj;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MerchantCapabilities merchantCapabilities = (MerchantCapabilities) obj;
        reverseProtoWriter.getClass();
        merchantCapabilities.getClass();
        reverseProtoWriter.writeBytes(merchantCapabilities.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 34, merchantCapabilities.multi_legal_entity);
        protoAdapter.encodeWithTag(reverseProtoWriter, 33, merchantCapabilities.nab_seller_eligible);
        protoAdapter.encodeWithTag(reverseProtoWriter, 32, merchantCapabilities.has_many_employments);
        protoAdapter.encodeWithTag(reverseProtoWriter, 31, merchantCapabilities.show_third_party_gift_card_provider_onboarding);
        protoAdapter.encodeWithTag(reverseProtoWriter, 30, merchantCapabilities.jp_smirf_pricing_eligible);
        protoAdapter.encodeWithTag(reverseProtoWriter, 29, merchantCapabilities.reprice_1_6_cp_au_rates);
        protoAdapter.encodeWithTag(reverseProtoWriter, 28, merchantCapabilities.enable_modern_micros_mode);
        protoAdapter.encodeWithTag(reverseProtoWriter, 27, merchantCapabilities.use_third_party_gift_card_provider);
        protoAdapter.encodeWithTag(reverseProtoWriter, 26, merchantCapabilities.use_dual_mode_v2_pos);
        protoAdapter.encodeWithTag(reverseProtoWriter, 25, merchantCapabilities.use_dual_mode_v2_payg);
        protoAdapter.encodeWithTag(reverseProtoWriter, 24, merchantCapabilities.invoice_mke_dismissed);
        protoAdapter.encodeWithTag(reverseProtoWriter, 23, merchantCapabilities.payment_link_mke_dismissed);
        protoAdapter.encodeWithTag(reverseProtoWriter, 22, merchantCapabilities.apple_tap_to_pay_mke_dismissed);
        protoAdapter.encodeWithTag(reverseProtoWriter, 21, merchantCapabilities.is_test_merchant);
        protoAdapter.encodeWithTag(reverseProtoWriter, 20, merchantCapabilities.use_gift_card_settlement);
        protoAdapter.encodeWithTag(reverseProtoWriter, 19, merchantCapabilities.change_name_without_limit);
        protoAdapter.encodeWithTag(reverseProtoWriter, 18, merchantCapabilities.use_house_accounts);
        protoAdapter.encodeWithTag(reverseProtoWriter, 17, merchantCapabilities.apple_tap_to_pay_opt_in_seen);
        protoAdapter.encodeWithTag(reverseProtoWriter, 16, merchantCapabilities.apple_tap_to_pay_linked);
        protoAdapter.encodeWithTag(reverseProtoWriter, 15, merchantCapabilities.apple_tap_to_pay_enabled);
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, merchantCapabilities.use_gift_cards);
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, merchantCapabilities.use_elevated_tip_limit);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, merchantCapabilities.use_btc_treasury);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, merchantCapabilities.is_sandbox);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, merchantCapabilities.sell_cannabis);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, merchantCapabilities.use_items_autosku);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, merchantCapabilities.use_rule_based_taxes);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, merchantCapabilities.sell_cbd);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, merchantCapabilities.use_payroll);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, merchantCapabilities.use_restaurants);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, merchantCapabilities.use_appointments);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, merchantCapabilities.use_developer_dashboard);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, merchantCapabilities.use_point_of_sale);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, merchantCapabilities.use_savings);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MerchantCapabilities merchantCapabilities = (MerchantCapabilities) obj;
        merchantCapabilities.getClass();
        int size$okio = merchantCapabilities.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(34, merchantCapabilities.multi_legal_entity) + protoAdapter.encodedSizeWithTag(33, merchantCapabilities.nab_seller_eligible) + protoAdapter.encodedSizeWithTag(32, merchantCapabilities.has_many_employments) + protoAdapter.encodedSizeWithTag(31, merchantCapabilities.show_third_party_gift_card_provider_onboarding) + protoAdapter.encodedSizeWithTag(30, merchantCapabilities.jp_smirf_pricing_eligible) + protoAdapter.encodedSizeWithTag(29, merchantCapabilities.reprice_1_6_cp_au_rates) + protoAdapter.encodedSizeWithTag(28, merchantCapabilities.enable_modern_micros_mode) + protoAdapter.encodedSizeWithTag(27, merchantCapabilities.use_third_party_gift_card_provider) + protoAdapter.encodedSizeWithTag(26, merchantCapabilities.use_dual_mode_v2_pos) + protoAdapter.encodedSizeWithTag(25, merchantCapabilities.use_dual_mode_v2_payg) + protoAdapter.encodedSizeWithTag(24, merchantCapabilities.invoice_mke_dismissed) + protoAdapter.encodedSizeWithTag(23, merchantCapabilities.payment_link_mke_dismissed) + protoAdapter.encodedSizeWithTag(22, merchantCapabilities.apple_tap_to_pay_mke_dismissed) + protoAdapter.encodedSizeWithTag(21, merchantCapabilities.is_test_merchant) + protoAdapter.encodedSizeWithTag(20, merchantCapabilities.use_gift_card_settlement) + protoAdapter.encodedSizeWithTag(19, merchantCapabilities.change_name_without_limit) + protoAdapter.encodedSizeWithTag(18, merchantCapabilities.use_house_accounts) + protoAdapter.encodedSizeWithTag(17, merchantCapabilities.apple_tap_to_pay_opt_in_seen) + protoAdapter.encodedSizeWithTag(16, merchantCapabilities.apple_tap_to_pay_linked) + protoAdapter.encodedSizeWithTag(15, merchantCapabilities.apple_tap_to_pay_enabled) + protoAdapter.encodedSizeWithTag(14, merchantCapabilities.use_gift_cards) + protoAdapter.encodedSizeWithTag(13, merchantCapabilities.use_elevated_tip_limit) + protoAdapter.encodedSizeWithTag(12, merchantCapabilities.use_btc_treasury) + protoAdapter.encodedSizeWithTag(11, merchantCapabilities.is_sandbox) + protoAdapter.encodedSizeWithTag(10, merchantCapabilities.sell_cannabis) + protoAdapter.encodedSizeWithTag(9, merchantCapabilities.use_items_autosku) + protoAdapter.encodedSizeWithTag(8, merchantCapabilities.use_rule_based_taxes) + protoAdapter.encodedSizeWithTag(7, merchantCapabilities.sell_cbd) + protoAdapter.encodedSizeWithTag(6, merchantCapabilities.use_payroll) + protoAdapter.encodedSizeWithTag(5, merchantCapabilities.use_restaurants) + protoAdapter.encodedSizeWithTag(4, merchantCapabilities.use_appointments) + protoAdapter.encodedSizeWithTag(3, merchantCapabilities.use_developer_dashboard) + protoAdapter.encodedSizeWithTag(2, merchantCapabilities.use_point_of_sale) + protoAdapter.encodedSizeWithTag(1, merchantCapabilities.use_savings) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MerchantCapabilities merchantCapabilities = (MerchantCapabilities) obj;
        merchantCapabilities.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = merchantCapabilities.use_savings;
        Long l2 = merchantCapabilities.use_point_of_sale;
        Long l3 = merchantCapabilities.use_developer_dashboard;
        Long l4 = merchantCapabilities.use_appointments;
        Long l5 = merchantCapabilities.use_restaurants;
        Long l6 = merchantCapabilities.use_payroll;
        Long l7 = merchantCapabilities.sell_cbd;
        Long l8 = merchantCapabilities.use_rule_based_taxes;
        Long l9 = merchantCapabilities.use_items_autosku;
        Long l10 = merchantCapabilities.sell_cannabis;
        Long l11 = merchantCapabilities.is_sandbox;
        Long l12 = merchantCapabilities.use_btc_treasury;
        Long l13 = merchantCapabilities.use_elevated_tip_limit;
        Long l14 = merchantCapabilities.use_gift_cards;
        Long l15 = merchantCapabilities.apple_tap_to_pay_enabled;
        Long l16 = merchantCapabilities.apple_tap_to_pay_linked;
        Long l17 = merchantCapabilities.apple_tap_to_pay_opt_in_seen;
        Long l18 = merchantCapabilities.use_house_accounts;
        Long l19 = merchantCapabilities.change_name_without_limit;
        Long l20 = merchantCapabilities.use_gift_card_settlement;
        Long l21 = merchantCapabilities.is_test_merchant;
        Long l22 = merchantCapabilities.apple_tap_to_pay_mke_dismissed;
        Long l23 = merchantCapabilities.payment_link_mke_dismissed;
        Long l24 = merchantCapabilities.invoice_mke_dismissed;
        Long l25 = merchantCapabilities.use_dual_mode_v2_payg;
        Long l26 = merchantCapabilities.use_dual_mode_v2_pos;
        Long l27 = merchantCapabilities.use_third_party_gift_card_provider;
        Long l28 = merchantCapabilities.enable_modern_micros_mode;
        Long l29 = merchantCapabilities.reprice_1_6_cp_au_rates;
        Long l30 = merchantCapabilities.jp_smirf_pricing_eligible;
        Long l31 = merchantCapabilities.show_third_party_gift_card_provider_onboarding;
        Long l32 = merchantCapabilities.has_many_employments;
        Long l33 = merchantCapabilities.nab_seller_eligible;
        Long l34 = merchantCapabilities.multi_legal_entity;
        byteString.getClass();
        return new MerchantCapabilities(l, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25, l26, l27, l28, l29, l30, l31, l32, l33, l34, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MerchantCapabilities merchantCapabilities = (MerchantCapabilities) obj;
        merchantCapabilities.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, merchantCapabilities.use_savings);
        protoAdapter.encodeWithTag(protoWriter, 2, merchantCapabilities.use_point_of_sale);
        protoAdapter.encodeWithTag(protoWriter, 3, merchantCapabilities.use_developer_dashboard);
        protoAdapter.encodeWithTag(protoWriter, 4, merchantCapabilities.use_appointments);
        protoAdapter.encodeWithTag(protoWriter, 5, merchantCapabilities.use_restaurants);
        protoAdapter.encodeWithTag(protoWriter, 6, merchantCapabilities.use_payroll);
        protoAdapter.encodeWithTag(protoWriter, 7, merchantCapabilities.sell_cbd);
        protoAdapter.encodeWithTag(protoWriter, 8, merchantCapabilities.use_rule_based_taxes);
        protoAdapter.encodeWithTag(protoWriter, 9, merchantCapabilities.use_items_autosku);
        protoAdapter.encodeWithTag(protoWriter, 10, merchantCapabilities.sell_cannabis);
        protoAdapter.encodeWithTag(protoWriter, 11, merchantCapabilities.is_sandbox);
        protoAdapter.encodeWithTag(protoWriter, 12, merchantCapabilities.use_btc_treasury);
        protoAdapter.encodeWithTag(protoWriter, 13, merchantCapabilities.use_elevated_tip_limit);
        protoAdapter.encodeWithTag(protoWriter, 14, merchantCapabilities.use_gift_cards);
        protoAdapter.encodeWithTag(protoWriter, 15, merchantCapabilities.apple_tap_to_pay_enabled);
        protoAdapter.encodeWithTag(protoWriter, 16, merchantCapabilities.apple_tap_to_pay_linked);
        protoAdapter.encodeWithTag(protoWriter, 17, merchantCapabilities.apple_tap_to_pay_opt_in_seen);
        protoAdapter.encodeWithTag(protoWriter, 18, merchantCapabilities.use_house_accounts);
        protoAdapter.encodeWithTag(protoWriter, 19, merchantCapabilities.change_name_without_limit);
        protoAdapter.encodeWithTag(protoWriter, 20, merchantCapabilities.use_gift_card_settlement);
        protoAdapter.encodeWithTag(protoWriter, 21, merchantCapabilities.is_test_merchant);
        protoAdapter.encodeWithTag(protoWriter, 22, merchantCapabilities.apple_tap_to_pay_mke_dismissed);
        protoAdapter.encodeWithTag(protoWriter, 23, merchantCapabilities.payment_link_mke_dismissed);
        protoAdapter.encodeWithTag(protoWriter, 24, merchantCapabilities.invoice_mke_dismissed);
        protoAdapter.encodeWithTag(protoWriter, 25, merchantCapabilities.use_dual_mode_v2_payg);
        protoAdapter.encodeWithTag(protoWriter, 26, merchantCapabilities.use_dual_mode_v2_pos);
        protoAdapter.encodeWithTag(protoWriter, 27, merchantCapabilities.use_third_party_gift_card_provider);
        protoAdapter.encodeWithTag(protoWriter, 28, merchantCapabilities.enable_modern_micros_mode);
        protoAdapter.encodeWithTag(protoWriter, 29, merchantCapabilities.reprice_1_6_cp_au_rates);
        protoAdapter.encodeWithTag(protoWriter, 30, merchantCapabilities.jp_smirf_pricing_eligible);
        protoAdapter.encodeWithTag(protoWriter, 31, merchantCapabilities.show_third_party_gift_card_provider_onboarding);
        protoAdapter.encodeWithTag(protoWriter, 32, merchantCapabilities.has_many_employments);
        protoAdapter.encodeWithTag(protoWriter, 33, merchantCapabilities.nab_seller_eligible);
        protoAdapter.encodeWithTag(protoWriter, 34, merchantCapabilities.multi_legal_entity);
        protoWriter.writeBytes(merchantCapabilities.unknownFields());
    }
}
