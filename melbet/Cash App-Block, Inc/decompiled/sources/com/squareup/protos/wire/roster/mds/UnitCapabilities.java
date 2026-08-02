package com.squareup.protos.wire.roster.mds;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.postcard.CashAppCard;
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
public final class UnitCapabilities extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UnitCapabilities> CREATOR;
    public final Long accept_all_transactions;
    public final Long accept_high_transactions;
    public final Long accept_jpy_jcb_payment_cards;
    public final Long accept_payment_cards;
    public final Long accept_payments_anywhere;
    public final Long cash_app_transfers_enabled;
    public final Long check_for_loan_withholdings;
    public final Long check_for_risk_reserves;
    public final Long decline_all_authorizations;
    public final Long get_introductory_payment_notice;
    public final Long is_test_unit;
    public final Long nab_seller_enabled;
    public final Long override_au_unsupported_business;
    public final Long reject_all_refunds;
    public final Long skip_payment_tutorials;
    public final Long use_local_offers_billing;

    static {
        UnitCapabilities$Companion$ADAPTER$1 unitCapabilities$Companion$ADAPTER$1 = new UnitCapabilities$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UnitCapabilities.class), "type.googleapis.com/squareup.roster.mds.UnitCapabilities", Syntax.PROTO_2, null, "squareup/roster/mds.proto");
        ADAPTER = unitCapabilities$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(unitCapabilities$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnitCapabilities(Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.accept_payment_cards = l;
        this.accept_high_transactions = l2;
        this.accept_jpy_jcb_payment_cards = l3;
        this.decline_all_authorizations = l4;
        this.override_au_unsupported_business = l5;
        this.reject_all_refunds = l6;
        this.skip_payment_tutorials = l7;
        this.get_introductory_payment_notice = l8;
        this.check_for_loan_withholdings = l9;
        this.use_local_offers_billing = l10;
        this.is_test_unit = l11;
        this.accept_payments_anywhere = l12;
        this.check_for_risk_reserves = l13;
        this.nab_seller_enabled = l14;
        this.cash_app_transfers_enabled = l15;
        this.accept_all_transactions = l16;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UnitCapabilities)) {
            return false;
        }
        UnitCapabilities unitCapabilities = (UnitCapabilities) obj;
        return Intrinsics.areEqual(unknownFields(), unitCapabilities.unknownFields()) && Intrinsics.areEqual(this.accept_payment_cards, unitCapabilities.accept_payment_cards) && Intrinsics.areEqual(this.accept_high_transactions, unitCapabilities.accept_high_transactions) && Intrinsics.areEqual(this.accept_jpy_jcb_payment_cards, unitCapabilities.accept_jpy_jcb_payment_cards) && Intrinsics.areEqual(this.decline_all_authorizations, unitCapabilities.decline_all_authorizations) && Intrinsics.areEqual(this.override_au_unsupported_business, unitCapabilities.override_au_unsupported_business) && Intrinsics.areEqual(this.reject_all_refunds, unitCapabilities.reject_all_refunds) && Intrinsics.areEqual(this.skip_payment_tutorials, unitCapabilities.skip_payment_tutorials) && Intrinsics.areEqual(this.get_introductory_payment_notice, unitCapabilities.get_introductory_payment_notice) && Intrinsics.areEqual(this.check_for_loan_withholdings, unitCapabilities.check_for_loan_withholdings) && Intrinsics.areEqual(this.use_local_offers_billing, unitCapabilities.use_local_offers_billing) && Intrinsics.areEqual(this.is_test_unit, unitCapabilities.is_test_unit) && Intrinsics.areEqual(this.accept_payments_anywhere, unitCapabilities.accept_payments_anywhere) && Intrinsics.areEqual(this.check_for_risk_reserves, unitCapabilities.check_for_risk_reserves) && Intrinsics.areEqual(this.nab_seller_enabled, unitCapabilities.nab_seller_enabled) && Intrinsics.areEqual(this.cash_app_transfers_enabled, unitCapabilities.cash_app_transfers_enabled) && Intrinsics.areEqual(this.accept_all_transactions, unitCapabilities.accept_all_transactions);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.accept_payment_cards;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.accept_high_transactions;
        int hashCode3 = (hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.accept_jpy_jcb_payment_cards;
        int hashCode4 = (hashCode3 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Long l4 = this.decline_all_authorizations;
        int hashCode5 = (hashCode4 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
        Long l5 = this.override_au_unsupported_business;
        int hashCode6 = (hashCode5 + (l5 != null ? Long.hashCode(l5.longValue()) : 0)) * 37;
        Long l6 = this.reject_all_refunds;
        int hashCode7 = (hashCode6 + (l6 != null ? Long.hashCode(l6.longValue()) : 0)) * 37;
        Long l7 = this.skip_payment_tutorials;
        int hashCode8 = (hashCode7 + (l7 != null ? Long.hashCode(l7.longValue()) : 0)) * 37;
        Long l8 = this.get_introductory_payment_notice;
        int hashCode9 = (hashCode8 + (l8 != null ? Long.hashCode(l8.longValue()) : 0)) * 37;
        Long l9 = this.check_for_loan_withholdings;
        int hashCode10 = (hashCode9 + (l9 != null ? Long.hashCode(l9.longValue()) : 0)) * 37;
        Long l10 = this.use_local_offers_billing;
        int hashCode11 = (hashCode10 + (l10 != null ? Long.hashCode(l10.longValue()) : 0)) * 37;
        Long l11 = this.is_test_unit;
        int hashCode12 = (hashCode11 + (l11 != null ? Long.hashCode(l11.longValue()) : 0)) * 37;
        Long l12 = this.accept_payments_anywhere;
        int hashCode13 = (hashCode12 + (l12 != null ? Long.hashCode(l12.longValue()) : 0)) * 37;
        Long l13 = this.check_for_risk_reserves;
        int hashCode14 = (hashCode13 + (l13 != null ? Long.hashCode(l13.longValue()) : 0)) * 37;
        Long l14 = this.nab_seller_enabled;
        int hashCode15 = (hashCode14 + (l14 != null ? Long.hashCode(l14.longValue()) : 0)) * 37;
        Long l15 = this.cash_app_transfers_enabled;
        int hashCode16 = (hashCode15 + (l15 != null ? Long.hashCode(l15.longValue()) : 0)) * 37;
        Long l16 = this.accept_all_transactions;
        int hashCode17 = hashCode16 + (l16 != null ? Long.hashCode(l16.longValue()) : 0);
        this.hashCode = hashCode17;
        return hashCode17;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CashAppCard.Builder builder = new CashAppCard.Builder(2);
        builder.card_token = this.accept_payment_cards;
        builder.version_token = this.accept_high_transactions;
        builder.last_four = this.accept_jpy_jcb_payment_cards;
        builder.cardholder_name = this.decline_all_authorizations;
        builder.apple_pay_identifier = this.override_au_unsupported_business;
        builder.apple_pay_description = this.reject_all_refunds;
        builder.card_theme_token = this.skip_payment_tutorials;
        builder.customization_image_path = this.get_introductory_payment_notice;
        builder.enabled = this.check_for_loan_withholdings;
        builder.sponsor_locked = this.use_local_offers_billing;
        builder.activated = this.is_test_unit;
        builder.isCardExpired = this.accept_payments_anywhere;
        builder.card_type = this.check_for_risk_reserves;
        builder.physical_card_order_state = this.nab_seller_enabled;
        builder.externalIssuingAccountState = this.cash_app_transfers_enabled;
        builder.payment_method = this.accept_all_transactions;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.accept_payment_cards;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("accept_payment_cards=", l, arrayList);
        }
        Long l2 = this.accept_high_transactions;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("accept_high_transactions=", l2, arrayList);
        }
        Long l3 = this.accept_jpy_jcb_payment_cards;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("accept_jpy_jcb_payment_cards=", l3, arrayList);
        }
        Long l4 = this.decline_all_authorizations;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("decline_all_authorizations=", l4, arrayList);
        }
        Long l5 = this.override_au_unsupported_business;
        if (l5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("override_au_unsupported_business=", l5, arrayList);
        }
        Long l6 = this.reject_all_refunds;
        if (l6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("reject_all_refunds=", l6, arrayList);
        }
        Long l7 = this.skip_payment_tutorials;
        if (l7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("skip_payment_tutorials=", l7, arrayList);
        }
        Long l8 = this.get_introductory_payment_notice;
        if (l8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("get_introductory_payment_notice=", l8, arrayList);
        }
        Long l9 = this.check_for_loan_withholdings;
        if (l9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("check_for_loan_withholdings=", l9, arrayList);
        }
        Long l10 = this.use_local_offers_billing;
        if (l10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("use_local_offers_billing=", l10, arrayList);
        }
        Long l11 = this.is_test_unit;
        if (l11 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_test_unit=", l11, arrayList);
        }
        Long l12 = this.accept_payments_anywhere;
        if (l12 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("accept_payments_anywhere=", l12, arrayList);
        }
        Long l13 = this.check_for_risk_reserves;
        if (l13 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("check_for_risk_reserves=", l13, arrayList);
        }
        Long l14 = this.nab_seller_enabled;
        if (l14 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("nab_seller_enabled=", l14, arrayList);
        }
        Long l15 = this.cash_app_transfers_enabled;
        if (l15 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("cash_app_transfers_enabled=", l15, arrayList);
        }
        Long l16 = this.accept_all_transactions;
        if (l16 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("accept_all_transactions=", l16, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UnitCapabilities{", "}", 0, null, null, 56);
    }
}
