package com.squareup.protos.cash.cashbusinessaccounts.api.v1;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GetC4bEligibilityResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0059. Please report as an issue. */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        Object obj;
        Object obj2;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
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
        Object obj36 = null;
        Object obj37 = null;
        Object obj38 = null;
        Object obj39 = null;
        Object obj40 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            Object obj41 = obj9;
            if (nextTag == -1) {
                return new GetC4bEligibilityResponse((String) obj4, (Long) obj18, (C4bEligibilityState) obj30, (C4bEligibilityState) obj39, (C4bEligibilityState) obj23, (C4bEligibilityState) obj24, (C4bEligibilityState) obj11, (C4bEligibilityState) obj33, (C4bEligibilityState) obj31, (C4bEligibilityState) obj32, (C4bEligibilityState) obj34, (C4bEligibilityState) obj37, (C4bEligibilityState) obj19, (C4bEligibilityState) obj3, (C4bEligibilityState) obj21, (C4bEligibilityState) obj36, (C4bEligibilityState) obj22, (C4bEligibilityState) obj38, (C4bEligibilityState) obj20, (C4bEligibilityState) obj27, (C4bEligibilityState) obj25, (C4bEligibilityState) obj26, (C4bEligibilityState) obj35, (C4bEligibilityState) obj40, (C4bEligibilityState) obj29, (C4bEligibilityState) obj28, (C4bEligibilityState) obj6, (C4bEligibilityState) obj41, (C4bEligibilityState) obj7, (C4bEligibilityState) obj13, (C4bEligibilityState) obj14, (C4bEligibilityState) obj12, (C4bEligibilityState) obj15, (C4bEligibilityState) obj10, (C4bEligibilityState) obj5, (C4bEligibilityState) obj16, (C4bEligibilityState) obj17, (C4bEligibilityState) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag != 1) {
                if (nextTag != 2) {
                    switch (nextTag) {
                        case 10:
                            obj9 = obj41;
                            obj = obj5;
                            obj2 = obj4;
                            obj19 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj19);
                            break;
                        case 11:
                            obj9 = obj41;
                            obj = obj5;
                            obj2 = obj4;
                            obj20 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj20);
                            break;
                        case 12:
                            obj9 = obj41;
                            obj = obj5;
                            obj2 = obj4;
                            obj21 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj21);
                            break;
                        case 13:
                            obj9 = obj41;
                            obj = obj5;
                            obj2 = obj4;
                            obj22 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj22);
                            break;
                        case 14:
                            obj9 = obj41;
                            obj = obj5;
                            obj2 = obj4;
                            obj23 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj23);
                            break;
                        case 15:
                            obj9 = obj41;
                            obj = obj5;
                            obj2 = obj4;
                            obj24 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj24);
                            break;
                        case 16:
                            obj9 = obj41;
                            obj = obj5;
                            obj2 = obj4;
                            obj25 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj25);
                            break;
                        case 17:
                            obj9 = obj41;
                            obj = obj5;
                            obj2 = obj4;
                            obj26 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj26);
                            break;
                        case 18:
                            obj9 = obj41;
                            obj = obj5;
                            obj2 = obj4;
                            obj27 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj27);
                            break;
                        case 19:
                            obj9 = obj41;
                            obj = obj5;
                            obj2 = obj4;
                            obj28 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj28);
                            break;
                        case 20:
                            obj9 = obj41;
                            obj = obj5;
                            obj2 = obj4;
                            obj29 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj29);
                            break;
                        case 21:
                            obj9 = obj41;
                            obj = obj5;
                            obj2 = obj4;
                            obj30 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj30);
                            break;
                        case 22:
                            obj9 = obj41;
                            obj = obj5;
                            obj2 = obj4;
                            obj31 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj31);
                            break;
                        case 23:
                            obj9 = obj41;
                            obj = obj5;
                            obj2 = obj4;
                            obj32 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj32);
                            break;
                        case 24:
                            obj9 = obj41;
                            obj = obj5;
                            obj2 = obj4;
                            obj33 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj33);
                            break;
                        case 25:
                            obj9 = obj41;
                            obj = obj5;
                            obj2 = obj4;
                            obj34 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj34);
                            break;
                        case 26:
                            obj9 = obj41;
                            obj = obj5;
                            obj2 = obj4;
                            obj35 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj35);
                            break;
                        case 27:
                            obj9 = obj41;
                            obj = obj5;
                            obj2 = obj4;
                            obj36 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj36);
                            break;
                        case 28:
                            obj9 = obj41;
                            obj = obj5;
                            obj2 = obj4;
                            obj37 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj37);
                            break;
                        case 29:
                            obj9 = obj41;
                            obj = obj5;
                            obj2 = obj4;
                            obj38 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj38);
                            break;
                        case 30:
                            obj9 = obj41;
                            obj = obj5;
                            obj2 = obj4;
                            obj39 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj39);
                            break;
                        case 31:
                            obj9 = obj41;
                            obj = obj5;
                            obj2 = obj4;
                            obj40 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj40);
                            break;
                        case 32:
                            obj9 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj41);
                            break;
                        case 33:
                            obj6 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj6);
                            obj9 = obj41;
                            break;
                        case 34:
                            obj3 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj3);
                            obj9 = obj41;
                            break;
                        case 35:
                            obj11 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj11);
                            obj9 = obj41;
                            break;
                        case 36:
                            obj7 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj7);
                            obj9 = obj41;
                            break;
                        case 37:
                            obj13 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj13);
                            obj9 = obj41;
                            break;
                        case 38:
                            obj14 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj14);
                            obj9 = obj41;
                            break;
                        case 39:
                            obj12 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj12);
                            obj9 = obj41;
                            break;
                        case 40:
                            obj15 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj15);
                            obj9 = obj41;
                            break;
                        case 41:
                            obj10 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj10);
                            obj9 = obj41;
                            break;
                        case 42:
                            obj5 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj5);
                            obj2 = obj4;
                            obj9 = obj41;
                            break;
                        case 43:
                            obj16 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj16);
                            obj9 = obj41;
                            break;
                        case 44:
                            obj17 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj17);
                            obj9 = obj41;
                            break;
                        case 45:
                            obj8 = TransactorKt.decodeMessageOrMerge(C4bEligibilityState.ADAPTER, protoReader, obj8);
                            obj9 = obj41;
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            obj2 = obj4;
                            obj9 = obj41;
                            break;
                    }
                    obj4 = obj2;
                } else {
                    obj9 = obj41;
                    obj18 = ProtoAdapter.INT64.decode(protoReader);
                    obj5 = obj5;
                }
                obj2 = obj4;
                obj4 = obj2;
            } else {
                obj9 = obj41;
                obj = obj5;
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
            obj5 = obj;
            obj4 = obj2;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetC4bEligibilityResponse getC4bEligibilityResponse = (GetC4bEligibilityResponse) obj;
        reverseProtoWriter.getClass();
        getC4bEligibilityResponse.getClass();
        reverseProtoWriter.writeBytes(getC4bEligibilityResponse.unknownFields());
        ProtoAdapter protoAdapter = C4bEligibilityState.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 45, getC4bEligibilityResponse.recurring_p2p_payment_feature_visibility);
        protoAdapter.encodeWithTag(reverseProtoWriter, 44, getC4bEligibilityResponse.bitcoin_auto_invest);
        protoAdapter.encodeWithTag(reverseProtoWriter, 43, getC4bEligibilityResponse.nearby_payment_feature_visibility);
        protoAdapter.encodeWithTag(reverseProtoWriter, 42, getC4bEligibilityResponse.kid_sponsor_eligible_customer);
        protoAdapter.encodeWithTag(reverseProtoWriter, 41, getC4bEligibilityResponse.work_applet_visibility);
        protoAdapter.encodeWithTag(reverseProtoWriter, 40, getC4bEligibilityResponse.pools_onboarding_visibility);
        protoAdapter.encodeWithTag(reverseProtoWriter, 39, getC4bEligibilityResponse.personalized_ads_toggle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 38, getC4bEligibilityResponse.limits_hub_redesign_visibility);
        protoAdapter.encodeWithTag(reverseProtoWriter, 37, getC4bEligibilityResponse.moneybot_visibility);
        protoAdapter.encodeWithTag(reverseProtoWriter, 36, getC4bEligibilityResponse.cash_shopping_p13n_toggle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 32, getC4bEligibilityResponse.tap_to_pay_visibility);
        protoAdapter.encodeWithTag(reverseProtoWriter, 33, getC4bEligibilityResponse.sponsor_eligible_customer);
        protoAdapter.encodeWithTag(reverseProtoWriter, 19, getC4bEligibilityResponse.settings_tax_password_auth_app);
        protoAdapter.encodeWithTag(reverseProtoWriter, 20, getC4bEligibilityResponse.settings_invest_trusted_contact_app);
        protoAdapter.encodeWithTag(reverseProtoWriter, 31, getC4bEligibilityResponse.remittance_send);
        protoAdapter.encodeWithTag(reverseProtoWriter, 26, getC4bEligibilityResponse.payment_send_as_gift_card);
        protoAdapter.encodeWithTag(reverseProtoWriter, 17, getC4bEligibilityResponse.payment_send_as_stock);
        protoAdapter.encodeWithTag(reverseProtoWriter, 16, getC4bEligibilityResponse.payment_send_as_btc);
        protoAdapter.encodeWithTag(reverseProtoWriter, 18, getC4bEligibilityResponse.payment_personal_to_c4b);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, getC4bEligibilityResponse.money_taxes_applet);
        protoAdapter.encodeWithTag(reverseProtoWriter, 29, getC4bEligibilityResponse.money_tab_home_design_system);
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, getC4bEligibilityResponse.money_investing_applet);
        protoAdapter.encodeWithTag(reverseProtoWriter, 27, getC4bEligibilityResponse.money_global_borrow_applet);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, getC4bEligibilityResponse.money_families_applet);
        protoAdapter.encodeWithTag(reverseProtoWriter, 34, getC4bEligibilityResponse.money_earnings_applet);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, getC4bEligibilityResponse.money_btc_applet);
        protoAdapter.encodeWithTag(reverseProtoWriter, 28, getC4bEligibilityResponse.limits_btc);
        protoAdapter.encodeWithTag(reverseProtoWriter, 25, getC4bEligibilityResponse.documents_taxes);
        protoAdapter.encodeWithTag(reverseProtoWriter, 23, getC4bEligibilityResponse.documents_stock);
        protoAdapter.encodeWithTag(reverseProtoWriter, 22, getC4bEligibilityResponse.documents_btc);
        protoAdapter.encodeWithTag(reverseProtoWriter, 24, getC4bEligibilityResponse.dda_tab);
        protoAdapter.encodeWithTag(reverseProtoWriter, 35, getC4bEligibilityResponse.c4b_promotion_visibility);
        protoAdapter.encodeWithTag(reverseProtoWriter, 15, getC4bEligibilityResponse.cash_offers_tab);
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, getC4bEligibilityResponse.cash_card_tab);
        protoAdapter.encodeWithTag(reverseProtoWriter, 30, getC4bEligibilityResponse.activity_treehouse);
        protoAdapter.encodeWithTag(reverseProtoWriter, 21, getC4bEligibilityResponse.account_switcher);
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, getC4bEligibilityResponse.ttl);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, getC4bEligibilityResponse.customer_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetC4bEligibilityResponse getC4bEligibilityResponse = (GetC4bEligibilityResponse) obj;
        getC4bEligibilityResponse.getClass();
        int encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(2, getC4bEligibilityResponse.ttl) + ProtoAdapter.STRING.encodedSizeWithTag(1, getC4bEligibilityResponse.customer_token) + getC4bEligibilityResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = C4bEligibilityState.ADAPTER;
        return protoAdapter.encodedSizeWithTag(45, getC4bEligibilityResponse.recurring_p2p_payment_feature_visibility) + protoAdapter.encodedSizeWithTag(44, getC4bEligibilityResponse.bitcoin_auto_invest) + protoAdapter.encodedSizeWithTag(43, getC4bEligibilityResponse.nearby_payment_feature_visibility) + protoAdapter.encodedSizeWithTag(42, getC4bEligibilityResponse.kid_sponsor_eligible_customer) + protoAdapter.encodedSizeWithTag(41, getC4bEligibilityResponse.work_applet_visibility) + protoAdapter.encodedSizeWithTag(40, getC4bEligibilityResponse.pools_onboarding_visibility) + protoAdapter.encodedSizeWithTag(39, getC4bEligibilityResponse.personalized_ads_toggle) + protoAdapter.encodedSizeWithTag(38, getC4bEligibilityResponse.limits_hub_redesign_visibility) + protoAdapter.encodedSizeWithTag(37, getC4bEligibilityResponse.moneybot_visibility) + protoAdapter.encodedSizeWithTag(36, getC4bEligibilityResponse.cash_shopping_p13n_toggle) + protoAdapter.encodedSizeWithTag(32, getC4bEligibilityResponse.tap_to_pay_visibility) + protoAdapter.encodedSizeWithTag(33, getC4bEligibilityResponse.sponsor_eligible_customer) + protoAdapter.encodedSizeWithTag(19, getC4bEligibilityResponse.settings_tax_password_auth_app) + protoAdapter.encodedSizeWithTag(20, getC4bEligibilityResponse.settings_invest_trusted_contact_app) + protoAdapter.encodedSizeWithTag(31, getC4bEligibilityResponse.remittance_send) + protoAdapter.encodedSizeWithTag(26, getC4bEligibilityResponse.payment_send_as_gift_card) + protoAdapter.encodedSizeWithTag(17, getC4bEligibilityResponse.payment_send_as_stock) + protoAdapter.encodedSizeWithTag(16, getC4bEligibilityResponse.payment_send_as_btc) + protoAdapter.encodedSizeWithTag(18, getC4bEligibilityResponse.payment_personal_to_c4b) + protoAdapter.encodedSizeWithTag(11, getC4bEligibilityResponse.money_taxes_applet) + protoAdapter.encodedSizeWithTag(29, getC4bEligibilityResponse.money_tab_home_design_system) + protoAdapter.encodedSizeWithTag(13, getC4bEligibilityResponse.money_investing_applet) + protoAdapter.encodedSizeWithTag(27, getC4bEligibilityResponse.money_global_borrow_applet) + protoAdapter.encodedSizeWithTag(12, getC4bEligibilityResponse.money_families_applet) + protoAdapter.encodedSizeWithTag(34, getC4bEligibilityResponse.money_earnings_applet) + protoAdapter.encodedSizeWithTag(10, getC4bEligibilityResponse.money_btc_applet) + protoAdapter.encodedSizeWithTag(28, getC4bEligibilityResponse.limits_btc) + protoAdapter.encodedSizeWithTag(25, getC4bEligibilityResponse.documents_taxes) + protoAdapter.encodedSizeWithTag(23, getC4bEligibilityResponse.documents_stock) + protoAdapter.encodedSizeWithTag(22, getC4bEligibilityResponse.documents_btc) + protoAdapter.encodedSizeWithTag(24, getC4bEligibilityResponse.dda_tab) + protoAdapter.encodedSizeWithTag(35, getC4bEligibilityResponse.c4b_promotion_visibility) + protoAdapter.encodedSizeWithTag(15, getC4bEligibilityResponse.cash_offers_tab) + protoAdapter.encodedSizeWithTag(14, getC4bEligibilityResponse.cash_card_tab) + protoAdapter.encodedSizeWithTag(30, getC4bEligibilityResponse.activity_treehouse) + protoAdapter.encodedSizeWithTag(21, getC4bEligibilityResponse.account_switcher) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GetC4bEligibilityResponse getC4bEligibilityResponse = (GetC4bEligibilityResponse) obj;
        getC4bEligibilityResponse.getClass();
        C4bEligibilityState c4bEligibilityState = getC4bEligibilityResponse.account_switcher;
        C4bEligibilityState c4bEligibilityState2 = c4bEligibilityState != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState) : null;
        C4bEligibilityState c4bEligibilityState3 = getC4bEligibilityResponse.activity_treehouse;
        C4bEligibilityState c4bEligibilityState4 = c4bEligibilityState3 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState3) : null;
        C4bEligibilityState c4bEligibilityState5 = getC4bEligibilityResponse.cash_card_tab;
        C4bEligibilityState c4bEligibilityState6 = c4bEligibilityState5 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState5) : null;
        C4bEligibilityState c4bEligibilityState7 = getC4bEligibilityResponse.cash_offers_tab;
        C4bEligibilityState c4bEligibilityState8 = c4bEligibilityState7 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState7) : null;
        C4bEligibilityState c4bEligibilityState9 = getC4bEligibilityResponse.c4b_promotion_visibility;
        C4bEligibilityState c4bEligibilityState10 = c4bEligibilityState9 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState9) : null;
        C4bEligibilityState c4bEligibilityState11 = getC4bEligibilityResponse.dda_tab;
        C4bEligibilityState c4bEligibilityState12 = c4bEligibilityState11 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState11) : null;
        C4bEligibilityState c4bEligibilityState13 = getC4bEligibilityResponse.documents_btc;
        C4bEligibilityState c4bEligibilityState14 = c4bEligibilityState13 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState13) : null;
        C4bEligibilityState c4bEligibilityState15 = getC4bEligibilityResponse.documents_stock;
        C4bEligibilityState c4bEligibilityState16 = c4bEligibilityState15 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState15) : null;
        C4bEligibilityState c4bEligibilityState17 = getC4bEligibilityResponse.documents_taxes;
        C4bEligibilityState c4bEligibilityState18 = c4bEligibilityState17 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState17) : null;
        C4bEligibilityState c4bEligibilityState19 = getC4bEligibilityResponse.limits_btc;
        C4bEligibilityState c4bEligibilityState20 = c4bEligibilityState19 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState19) : null;
        C4bEligibilityState c4bEligibilityState21 = getC4bEligibilityResponse.money_btc_applet;
        C4bEligibilityState c4bEligibilityState22 = c4bEligibilityState21 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState21) : null;
        C4bEligibilityState c4bEligibilityState23 = getC4bEligibilityResponse.money_earnings_applet;
        C4bEligibilityState c4bEligibilityState24 = c4bEligibilityState23 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState23) : null;
        C4bEligibilityState c4bEligibilityState25 = getC4bEligibilityResponse.money_families_applet;
        C4bEligibilityState c4bEligibilityState26 = c4bEligibilityState25 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState25) : null;
        C4bEligibilityState c4bEligibilityState27 = getC4bEligibilityResponse.money_global_borrow_applet;
        C4bEligibilityState c4bEligibilityState28 = c4bEligibilityState27 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState27) : null;
        C4bEligibilityState c4bEligibilityState29 = getC4bEligibilityResponse.money_investing_applet;
        C4bEligibilityState c4bEligibilityState30 = c4bEligibilityState29 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState29) : null;
        C4bEligibilityState c4bEligibilityState31 = getC4bEligibilityResponse.money_tab_home_design_system;
        C4bEligibilityState c4bEligibilityState32 = c4bEligibilityState31 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState31) : null;
        C4bEligibilityState c4bEligibilityState33 = getC4bEligibilityResponse.money_taxes_applet;
        C4bEligibilityState c4bEligibilityState34 = c4bEligibilityState33 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState33) : null;
        C4bEligibilityState c4bEligibilityState35 = getC4bEligibilityResponse.payment_personal_to_c4b;
        C4bEligibilityState c4bEligibilityState36 = c4bEligibilityState35 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState35) : null;
        C4bEligibilityState c4bEligibilityState37 = getC4bEligibilityResponse.payment_send_as_btc;
        C4bEligibilityState c4bEligibilityState38 = c4bEligibilityState37 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState37) : null;
        C4bEligibilityState c4bEligibilityState39 = getC4bEligibilityResponse.payment_send_as_stock;
        C4bEligibilityState c4bEligibilityState40 = c4bEligibilityState39 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState39) : null;
        C4bEligibilityState c4bEligibilityState41 = getC4bEligibilityResponse.payment_send_as_gift_card;
        C4bEligibilityState c4bEligibilityState42 = c4bEligibilityState41 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState41) : null;
        C4bEligibilityState c4bEligibilityState43 = getC4bEligibilityResponse.remittance_send;
        C4bEligibilityState c4bEligibilityState44 = c4bEligibilityState43 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState43) : null;
        C4bEligibilityState c4bEligibilityState45 = getC4bEligibilityResponse.settings_invest_trusted_contact_app;
        C4bEligibilityState c4bEligibilityState46 = c4bEligibilityState45 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState45) : null;
        C4bEligibilityState c4bEligibilityState47 = getC4bEligibilityResponse.settings_tax_password_auth_app;
        C4bEligibilityState c4bEligibilityState48 = c4bEligibilityState47 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState47) : null;
        C4bEligibilityState c4bEligibilityState49 = getC4bEligibilityResponse.sponsor_eligible_customer;
        C4bEligibilityState c4bEligibilityState50 = c4bEligibilityState49 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState49) : null;
        C4bEligibilityState c4bEligibilityState51 = getC4bEligibilityResponse.tap_to_pay_visibility;
        C4bEligibilityState c4bEligibilityState52 = c4bEligibilityState51 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState51) : null;
        C4bEligibilityState c4bEligibilityState53 = getC4bEligibilityResponse.cash_shopping_p13n_toggle;
        C4bEligibilityState c4bEligibilityState54 = c4bEligibilityState53 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState53) : null;
        C4bEligibilityState c4bEligibilityState55 = getC4bEligibilityResponse.moneybot_visibility;
        C4bEligibilityState c4bEligibilityState56 = c4bEligibilityState55 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState55) : null;
        C4bEligibilityState c4bEligibilityState57 = getC4bEligibilityResponse.limits_hub_redesign_visibility;
        C4bEligibilityState c4bEligibilityState58 = c4bEligibilityState57 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState57) : null;
        C4bEligibilityState c4bEligibilityState59 = getC4bEligibilityResponse.personalized_ads_toggle;
        C4bEligibilityState c4bEligibilityState60 = c4bEligibilityState59 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState59) : null;
        C4bEligibilityState c4bEligibilityState61 = getC4bEligibilityResponse.pools_onboarding_visibility;
        C4bEligibilityState c4bEligibilityState62 = c4bEligibilityState61 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState61) : null;
        C4bEligibilityState c4bEligibilityState63 = getC4bEligibilityResponse.work_applet_visibility;
        C4bEligibilityState c4bEligibilityState64 = c4bEligibilityState63 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState63) : null;
        C4bEligibilityState c4bEligibilityState65 = getC4bEligibilityResponse.kid_sponsor_eligible_customer;
        C4bEligibilityState c4bEligibilityState66 = c4bEligibilityState65 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState65) : null;
        C4bEligibilityState c4bEligibilityState67 = getC4bEligibilityResponse.nearby_payment_feature_visibility;
        C4bEligibilityState c4bEligibilityState68 = c4bEligibilityState67 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState67) : null;
        C4bEligibilityState c4bEligibilityState69 = getC4bEligibilityResponse.bitcoin_auto_invest;
        C4bEligibilityState c4bEligibilityState70 = c4bEligibilityState69 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState69) : null;
        C4bEligibilityState c4bEligibilityState71 = getC4bEligibilityResponse.recurring_p2p_payment_feature_visibility;
        C4bEligibilityState c4bEligibilityState72 = c4bEligibilityState71 != null ? (C4bEligibilityState) C4bEligibilityState.ADAPTER.redact(c4bEligibilityState71) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = getC4bEligibilityResponse.customer_token;
        Long l = getC4bEligibilityResponse.ttl;
        byteString.getClass();
        return new GetC4bEligibilityResponse(str, l, c4bEligibilityState2, c4bEligibilityState4, c4bEligibilityState6, c4bEligibilityState8, c4bEligibilityState10, c4bEligibilityState12, c4bEligibilityState14, c4bEligibilityState16, c4bEligibilityState18, c4bEligibilityState20, c4bEligibilityState22, c4bEligibilityState24, c4bEligibilityState26, c4bEligibilityState28, c4bEligibilityState30, c4bEligibilityState32, c4bEligibilityState34, c4bEligibilityState36, c4bEligibilityState38, c4bEligibilityState40, c4bEligibilityState42, c4bEligibilityState44, c4bEligibilityState46, c4bEligibilityState48, c4bEligibilityState50, c4bEligibilityState52, c4bEligibilityState54, c4bEligibilityState56, c4bEligibilityState58, c4bEligibilityState60, c4bEligibilityState62, c4bEligibilityState64, c4bEligibilityState66, c4bEligibilityState68, c4bEligibilityState70, c4bEligibilityState72, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetC4bEligibilityResponse getC4bEligibilityResponse = (GetC4bEligibilityResponse) obj;
        getC4bEligibilityResponse.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getC4bEligibilityResponse.customer_token);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getC4bEligibilityResponse.ttl);
        ProtoAdapter protoAdapter = C4bEligibilityState.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 21, getC4bEligibilityResponse.account_switcher);
        protoAdapter.encodeWithTag(protoWriter, 30, getC4bEligibilityResponse.activity_treehouse);
        protoAdapter.encodeWithTag(protoWriter, 14, getC4bEligibilityResponse.cash_card_tab);
        protoAdapter.encodeWithTag(protoWriter, 15, getC4bEligibilityResponse.cash_offers_tab);
        protoAdapter.encodeWithTag(protoWriter, 35, getC4bEligibilityResponse.c4b_promotion_visibility);
        protoAdapter.encodeWithTag(protoWriter, 24, getC4bEligibilityResponse.dda_tab);
        protoAdapter.encodeWithTag(protoWriter, 22, getC4bEligibilityResponse.documents_btc);
        protoAdapter.encodeWithTag(protoWriter, 23, getC4bEligibilityResponse.documents_stock);
        protoAdapter.encodeWithTag(protoWriter, 25, getC4bEligibilityResponse.documents_taxes);
        protoAdapter.encodeWithTag(protoWriter, 28, getC4bEligibilityResponse.limits_btc);
        protoAdapter.encodeWithTag(protoWriter, 10, getC4bEligibilityResponse.money_btc_applet);
        protoAdapter.encodeWithTag(protoWriter, 34, getC4bEligibilityResponse.money_earnings_applet);
        protoAdapter.encodeWithTag(protoWriter, 12, getC4bEligibilityResponse.money_families_applet);
        protoAdapter.encodeWithTag(protoWriter, 27, getC4bEligibilityResponse.money_global_borrow_applet);
        protoAdapter.encodeWithTag(protoWriter, 13, getC4bEligibilityResponse.money_investing_applet);
        protoAdapter.encodeWithTag(protoWriter, 29, getC4bEligibilityResponse.money_tab_home_design_system);
        protoAdapter.encodeWithTag(protoWriter, 11, getC4bEligibilityResponse.money_taxes_applet);
        protoAdapter.encodeWithTag(protoWriter, 18, getC4bEligibilityResponse.payment_personal_to_c4b);
        protoAdapter.encodeWithTag(protoWriter, 16, getC4bEligibilityResponse.payment_send_as_btc);
        protoAdapter.encodeWithTag(protoWriter, 17, getC4bEligibilityResponse.payment_send_as_stock);
        protoAdapter.encodeWithTag(protoWriter, 26, getC4bEligibilityResponse.payment_send_as_gift_card);
        protoAdapter.encodeWithTag(protoWriter, 31, getC4bEligibilityResponse.remittance_send);
        protoAdapter.encodeWithTag(protoWriter, 20, getC4bEligibilityResponse.settings_invest_trusted_contact_app);
        protoAdapter.encodeWithTag(protoWriter, 19, getC4bEligibilityResponse.settings_tax_password_auth_app);
        protoAdapter.encodeWithTag(protoWriter, 33, getC4bEligibilityResponse.sponsor_eligible_customer);
        protoAdapter.encodeWithTag(protoWriter, 32, getC4bEligibilityResponse.tap_to_pay_visibility);
        protoAdapter.encodeWithTag(protoWriter, 36, getC4bEligibilityResponse.cash_shopping_p13n_toggle);
        protoAdapter.encodeWithTag(protoWriter, 37, getC4bEligibilityResponse.moneybot_visibility);
        protoAdapter.encodeWithTag(protoWriter, 38, getC4bEligibilityResponse.limits_hub_redesign_visibility);
        protoAdapter.encodeWithTag(protoWriter, 39, getC4bEligibilityResponse.personalized_ads_toggle);
        protoAdapter.encodeWithTag(protoWriter, 40, getC4bEligibilityResponse.pools_onboarding_visibility);
        protoAdapter.encodeWithTag(protoWriter, 41, getC4bEligibilityResponse.work_applet_visibility);
        protoAdapter.encodeWithTag(protoWriter, 42, getC4bEligibilityResponse.kid_sponsor_eligible_customer);
        protoAdapter.encodeWithTag(protoWriter, 43, getC4bEligibilityResponse.nearby_payment_feature_visibility);
        protoAdapter.encodeWithTag(protoWriter, 44, getC4bEligibilityResponse.bitcoin_auto_invest);
        protoAdapter.encodeWithTag(protoWriter, 45, getC4bEligibilityResponse.recurring_p2p_payment_feature_visibility);
        protoWriter.writeBytes(getC4bEligibilityResponse.unknownFields());
    }
}
