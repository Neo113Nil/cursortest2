package com.squareup.protos.wire.roster.mds;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class UnitCapabilities$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0028. Please report as an issue. */
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
        while (true) {
            int nextTag = protoReader.nextTag();
            Object obj18 = obj3;
            if (nextTag == -1) {
                return new UnitCapabilities((Long) obj2, (Long) obj18, (Long) obj4, (Long) obj5, (Long) obj6, (Long) obj7, (Long) obj8, (Long) obj9, (Long) obj10, (Long) obj11, (Long) obj12, (Long) obj13, (Long) obj14, (Long) obj15, (Long) obj16, (Long) obj17, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj18;
                    break;
                case 2:
                    obj3 = ProtoAdapter.INT64.decode(protoReader);
                    obj = obj2;
                    break;
                case 3:
                    obj4 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj18;
                    obj = obj2;
                    break;
                case 4:
                    obj5 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj18;
                    obj = obj2;
                    break;
                case 5:
                    obj6 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj18;
                    obj = obj2;
                    break;
                case 6:
                    obj7 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj18;
                    obj = obj2;
                    break;
                case 7:
                    obj8 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj18;
                    obj = obj2;
                    break;
                case 8:
                    obj9 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj18;
                    obj = obj2;
                    break;
                case 9:
                    obj10 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj18;
                    obj = obj2;
                    break;
                case 10:
                    obj11 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj18;
                    obj = obj2;
                    break;
                case 11:
                    obj12 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj18;
                    obj = obj2;
                    break;
                case 12:
                    obj13 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj18;
                    obj = obj2;
                    break;
                case 13:
                    obj14 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj18;
                    obj = obj2;
                    break;
                case 14:
                    obj15 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj18;
                    obj = obj2;
                    break;
                case 15:
                    obj16 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj18;
                    obj = obj2;
                    break;
                case 16:
                    obj17 = ProtoAdapter.INT64.decode(protoReader);
                    obj3 = obj18;
                    obj = obj2;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    obj = obj2;
                    obj3 = obj18;
                    break;
            }
            obj2 = obj;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UnitCapabilities unitCapabilities = (UnitCapabilities) obj;
        reverseProtoWriter.getClass();
        unitCapabilities.getClass();
        reverseProtoWriter.writeBytes(unitCapabilities.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 16, unitCapabilities.accept_all_transactions);
        protoAdapter.encodeWithTag(reverseProtoWriter, 15, unitCapabilities.cash_app_transfers_enabled);
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, unitCapabilities.nab_seller_enabled);
        protoAdapter.encodeWithTag(reverseProtoWriter, 13, unitCapabilities.check_for_risk_reserves);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, unitCapabilities.accept_payments_anywhere);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, unitCapabilities.is_test_unit);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, unitCapabilities.use_local_offers_billing);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, unitCapabilities.check_for_loan_withholdings);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, unitCapabilities.get_introductory_payment_notice);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, unitCapabilities.skip_payment_tutorials);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, unitCapabilities.reject_all_refunds);
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, unitCapabilities.override_au_unsupported_business);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, unitCapabilities.decline_all_authorizations);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, unitCapabilities.accept_jpy_jcb_payment_cards);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, unitCapabilities.accept_high_transactions);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, unitCapabilities.accept_payment_cards);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UnitCapabilities unitCapabilities = (UnitCapabilities) obj;
        unitCapabilities.getClass();
        int size$okio = unitCapabilities.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return protoAdapter.encodedSizeWithTag(16, unitCapabilities.accept_all_transactions) + protoAdapter.encodedSizeWithTag(15, unitCapabilities.cash_app_transfers_enabled) + protoAdapter.encodedSizeWithTag(14, unitCapabilities.nab_seller_enabled) + protoAdapter.encodedSizeWithTag(13, unitCapabilities.check_for_risk_reserves) + protoAdapter.encodedSizeWithTag(12, unitCapabilities.accept_payments_anywhere) + protoAdapter.encodedSizeWithTag(11, unitCapabilities.is_test_unit) + protoAdapter.encodedSizeWithTag(10, unitCapabilities.use_local_offers_billing) + protoAdapter.encodedSizeWithTag(9, unitCapabilities.check_for_loan_withholdings) + protoAdapter.encodedSizeWithTag(8, unitCapabilities.get_introductory_payment_notice) + protoAdapter.encodedSizeWithTag(7, unitCapabilities.skip_payment_tutorials) + protoAdapter.encodedSizeWithTag(6, unitCapabilities.reject_all_refunds) + protoAdapter.encodedSizeWithTag(5, unitCapabilities.override_au_unsupported_business) + protoAdapter.encodedSizeWithTag(4, unitCapabilities.decline_all_authorizations) + protoAdapter.encodedSizeWithTag(3, unitCapabilities.accept_jpy_jcb_payment_cards) + protoAdapter.encodedSizeWithTag(2, unitCapabilities.accept_high_transactions) + protoAdapter.encodedSizeWithTag(1, unitCapabilities.accept_payment_cards) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UnitCapabilities unitCapabilities = (UnitCapabilities) obj;
        unitCapabilities.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = unitCapabilities.accept_payment_cards;
        Long l2 = unitCapabilities.accept_high_transactions;
        Long l3 = unitCapabilities.accept_jpy_jcb_payment_cards;
        Long l4 = unitCapabilities.decline_all_authorizations;
        Long l5 = unitCapabilities.override_au_unsupported_business;
        Long l6 = unitCapabilities.reject_all_refunds;
        Long l7 = unitCapabilities.skip_payment_tutorials;
        Long l8 = unitCapabilities.get_introductory_payment_notice;
        Long l9 = unitCapabilities.check_for_loan_withholdings;
        Long l10 = unitCapabilities.use_local_offers_billing;
        Long l11 = unitCapabilities.is_test_unit;
        Long l12 = unitCapabilities.accept_payments_anywhere;
        Long l13 = unitCapabilities.check_for_risk_reserves;
        Long l14 = unitCapabilities.nab_seller_enabled;
        Long l15 = unitCapabilities.cash_app_transfers_enabled;
        Long l16 = unitCapabilities.accept_all_transactions;
        byteString.getClass();
        return new UnitCapabilities(l, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UnitCapabilities unitCapabilities = (UnitCapabilities) obj;
        unitCapabilities.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, unitCapabilities.accept_payment_cards);
        protoAdapter.encodeWithTag(protoWriter, 2, unitCapabilities.accept_high_transactions);
        protoAdapter.encodeWithTag(protoWriter, 3, unitCapabilities.accept_jpy_jcb_payment_cards);
        protoAdapter.encodeWithTag(protoWriter, 4, unitCapabilities.decline_all_authorizations);
        protoAdapter.encodeWithTag(protoWriter, 5, unitCapabilities.override_au_unsupported_business);
        protoAdapter.encodeWithTag(protoWriter, 6, unitCapabilities.reject_all_refunds);
        protoAdapter.encodeWithTag(protoWriter, 7, unitCapabilities.skip_payment_tutorials);
        protoAdapter.encodeWithTag(protoWriter, 8, unitCapabilities.get_introductory_payment_notice);
        protoAdapter.encodeWithTag(protoWriter, 9, unitCapabilities.check_for_loan_withholdings);
        protoAdapter.encodeWithTag(protoWriter, 10, unitCapabilities.use_local_offers_billing);
        protoAdapter.encodeWithTag(protoWriter, 11, unitCapabilities.is_test_unit);
        protoAdapter.encodeWithTag(protoWriter, 12, unitCapabilities.accept_payments_anywhere);
        protoAdapter.encodeWithTag(protoWriter, 13, unitCapabilities.check_for_risk_reserves);
        protoAdapter.encodeWithTag(protoWriter, 14, unitCapabilities.nab_seller_enabled);
        protoAdapter.encodeWithTag(protoWriter, 15, unitCapabilities.cash_app_transfers_enabled);
        protoAdapter.encodeWithTag(protoWriter, 16, unitCapabilities.accept_all_transactions);
        protoWriter.writeBytes(unitCapabilities.unknownFields());
    }
}
