package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.customersearch.api.Metadata;
import com.squareup.protos.franklin.common.scenarios.BankAccountLinkingConfig;
import com.squareup.protos.franklin.common.scenarios.MenuItem;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import okio.Path;

/* loaded from: classes8.dex */
public final class InstrumentLinkingConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InstrumentLinkingConfig> CREATOR;
    public final BankAccountLinkingConfig bank_account_linking_config;
    public final Boolean bankbook_enabled;
    public final Boolean cash_balance_enabled;
    public final Long credit_card_fee_bps;
    public final Boolean credit_card_linking_enabled;
    public final String customer_passcode_instrument_token;
    public final String instrument_description_bank_account_linked;
    public final String instrument_description_no_instrument_linked;
    public final String instrument_description_no_instrument_linked_personal;
    public final String instrument_header_bank_account_linked;
    public final String instrument_header_no_instrument_linked;
    public final String instrument_header_no_instrument_linked_personal;
    public final IssuedCardDisabledStyle issued_card_disabled_style;
    public final Boolean issued_cards_enabled;
    public final Integer max_credit_card_prompts;
    public final MenuItem menu_item_bank_account;
    public final MenuItem menu_item_card;
    public final MenuItem menu_item_cash_balance;
    public final MenuItem menu_item_credit_card;
    public final Boolean nfc_card_linking_enabled;
    public final Boolean physical_issued_cards_enabled;
    public final List supported_transfer_instruments;

    /* loaded from: classes.dex */
    public enum IssuedCardDisabledStyle implements WireEnum {
        WHITE(1),
        GREY(2);

        public final int value;
        public static final Path.Companion Companion = new Path.Companion();
        public static final InstrumentLinkingConfig$IssuedCardDisabledStyle$Companion$ADAPTER$1 ADAPTER = new InstrumentLinkingConfig$IssuedCardDisabledStyle$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(IssuedCardDisabledStyle.class), Syntax.PROTO_2, null);

        IssuedCardDisabledStyle(int i) {
            this.value = i;
        }

        public static final IssuedCardDisabledStyle fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return WHITE;
            }
            if (i != 2) {
                return null;
            }
            return GREY;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        InstrumentLinkingConfig$Companion$ADAPTER$1 instrumentLinkingConfig$Companion$ADAPTER$1 = new InstrumentLinkingConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InstrumentLinkingConfig.class), "type.googleapis.com/squareup.franklin.common.InstrumentLinkingConfig", Syntax.PROTO_2, null, "squareup/franklin/common/instrument_linking_config.proto");
        ADAPTER = instrumentLinkingConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(instrumentLinkingConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentLinkingConfig(MenuItem menuItem, MenuItem menuItem2, MenuItem menuItem3, MenuItem menuItem4, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Integer num, Long l, Boolean bool2, Boolean bool3, IssuedCardDisabledStyle issuedCardDisabledStyle, Boolean bool4, String str7, List list, Boolean bool5, Boolean bool6, BankAccountLinkingConfig bankAccountLinkingConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.menu_item_card = menuItem;
        this.menu_item_bank_account = menuItem2;
        this.menu_item_credit_card = menuItem3;
        this.menu_item_cash_balance = menuItem4;
        this.instrument_header_no_instrument_linked = str;
        this.instrument_description_no_instrument_linked = str2;
        this.instrument_header_bank_account_linked = str3;
        this.instrument_description_bank_account_linked = str4;
        this.instrument_header_no_instrument_linked_personal = str5;
        this.instrument_description_no_instrument_linked_personal = str6;
        this.credit_card_linking_enabled = bool;
        this.max_credit_card_prompts = num;
        this.credit_card_fee_bps = l;
        this.cash_balance_enabled = bool2;
        this.issued_cards_enabled = bool3;
        this.issued_card_disabled_style = issuedCardDisabledStyle;
        this.physical_issued_cards_enabled = bool4;
        this.customer_passcode_instrument_token = str7;
        this.bankbook_enabled = bool5;
        this.nfc_card_linking_enabled = bool6;
        this.bank_account_linking_config = bankAccountLinkingConfig;
        this.supported_transfer_instruments = TransactorKt.immutableCopyOf("supported_transfer_instruments", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstrumentLinkingConfig)) {
            return false;
        }
        InstrumentLinkingConfig instrumentLinkingConfig = (InstrumentLinkingConfig) obj;
        return Intrinsics.areEqual(unknownFields(), instrumentLinkingConfig.unknownFields()) && Intrinsics.areEqual(this.menu_item_card, instrumentLinkingConfig.menu_item_card) && Intrinsics.areEqual(this.menu_item_bank_account, instrumentLinkingConfig.menu_item_bank_account) && Intrinsics.areEqual(this.menu_item_credit_card, instrumentLinkingConfig.menu_item_credit_card) && Intrinsics.areEqual(this.menu_item_cash_balance, instrumentLinkingConfig.menu_item_cash_balance) && Intrinsics.areEqual(this.instrument_header_no_instrument_linked, instrumentLinkingConfig.instrument_header_no_instrument_linked) && Intrinsics.areEqual(this.instrument_description_no_instrument_linked, instrumentLinkingConfig.instrument_description_no_instrument_linked) && Intrinsics.areEqual(this.instrument_header_bank_account_linked, instrumentLinkingConfig.instrument_header_bank_account_linked) && Intrinsics.areEqual(this.instrument_description_bank_account_linked, instrumentLinkingConfig.instrument_description_bank_account_linked) && Intrinsics.areEqual(this.instrument_header_no_instrument_linked_personal, instrumentLinkingConfig.instrument_header_no_instrument_linked_personal) && Intrinsics.areEqual(this.instrument_description_no_instrument_linked_personal, instrumentLinkingConfig.instrument_description_no_instrument_linked_personal) && Intrinsics.areEqual(this.credit_card_linking_enabled, instrumentLinkingConfig.credit_card_linking_enabled) && Intrinsics.areEqual(this.max_credit_card_prompts, instrumentLinkingConfig.max_credit_card_prompts) && Intrinsics.areEqual(this.credit_card_fee_bps, instrumentLinkingConfig.credit_card_fee_bps) && Intrinsics.areEqual(this.cash_balance_enabled, instrumentLinkingConfig.cash_balance_enabled) && Intrinsics.areEqual(this.issued_cards_enabled, instrumentLinkingConfig.issued_cards_enabled) && this.issued_card_disabled_style == instrumentLinkingConfig.issued_card_disabled_style && Intrinsics.areEqual(this.physical_issued_cards_enabled, instrumentLinkingConfig.physical_issued_cards_enabled) && Intrinsics.areEqual(this.customer_passcode_instrument_token, instrumentLinkingConfig.customer_passcode_instrument_token) && Intrinsics.areEqual(this.supported_transfer_instruments, instrumentLinkingConfig.supported_transfer_instruments) && Intrinsics.areEqual(this.bankbook_enabled, instrumentLinkingConfig.bankbook_enabled) && Intrinsics.areEqual(this.nfc_card_linking_enabled, instrumentLinkingConfig.nfc_card_linking_enabled) && Intrinsics.areEqual(this.bank_account_linking_config, instrumentLinkingConfig.bank_account_linking_config);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        MenuItem menuItem = this.menu_item_card;
        int hashCode2 = (hashCode + (menuItem != null ? menuItem.hashCode() : 0)) * 37;
        MenuItem menuItem2 = this.menu_item_bank_account;
        int hashCode3 = (hashCode2 + (menuItem2 != null ? menuItem2.hashCode() : 0)) * 37;
        MenuItem menuItem3 = this.menu_item_credit_card;
        int hashCode4 = (hashCode3 + (menuItem3 != null ? menuItem3.hashCode() : 0)) * 37;
        MenuItem menuItem4 = this.menu_item_cash_balance;
        int hashCode5 = (hashCode4 + (menuItem4 != null ? menuItem4.hashCode() : 0)) * 37;
        String str = this.instrument_header_no_instrument_linked;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.instrument_description_no_instrument_linked;
        int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.instrument_header_bank_account_linked;
        int hashCode8 = (hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.instrument_description_bank_account_linked;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.instrument_header_no_instrument_linked_personal;
        int hashCode10 = (hashCode9 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.instrument_description_no_instrument_linked_personal;
        int hashCode11 = (hashCode10 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Boolean bool = this.credit_card_linking_enabled;
        int hashCode12 = (hashCode11 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Integer num = this.max_credit_card_prompts;
        int hashCode13 = (hashCode12 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Long l = this.credit_card_fee_bps;
        int hashCode14 = (hashCode13 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Boolean bool2 = this.cash_balance_enabled;
        int hashCode15 = (hashCode14 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.issued_cards_enabled;
        int hashCode16 = (hashCode15 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        IssuedCardDisabledStyle issuedCardDisabledStyle = this.issued_card_disabled_style;
        int hashCode17 = (hashCode16 + (issuedCardDisabledStyle != null ? issuedCardDisabledStyle.hashCode() : 0)) * 37;
        Boolean bool4 = this.physical_issued_cards_enabled;
        int hashCode18 = (hashCode17 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        String str7 = this.customer_passcode_instrument_token;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode18 + (str7 != null ? str7.hashCode() : 0)) * 37, 37, this.supported_transfer_instruments);
        Boolean bool5 = this.bankbook_enabled;
        int hashCode19 = (m + (bool5 != null ? Boolean.hashCode(bool5.booleanValue()) : 0)) * 37;
        Boolean bool6 = this.nfc_card_linking_enabled;
        int hashCode20 = (hashCode19 + (bool6 != null ? Boolean.hashCode(bool6.booleanValue()) : 0)) * 37;
        BankAccountLinkingConfig bankAccountLinkingConfig = this.bank_account_linking_config;
        int hashCode21 = hashCode20 + (bankAccountLinkingConfig != null ? bankAccountLinkingConfig.hashCode() : 0);
        this.hashCode = hashCode21;
        return hashCode21;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Metadata.Builder builder = new Metadata.Builder(3, false);
        builder.business_name = this.menu_item_card;
        builder.app_feature_name = this.menu_item_bank_account;
        builder.app_feature_client_route = this.menu_item_credit_card;
        builder.offer_id = this.menu_item_cash_balance;
        builder.model_version = this.instrument_header_no_instrument_linked;
        builder.search_text = this.instrument_description_no_instrument_linked;
        builder.query_token = this.instrument_header_bank_account_linked;
        builder.entity_token = this.instrument_description_bank_account_linked;
        builder.entity_attributes = this.instrument_header_no_instrument_linked_personal;
        builder.entity_name = this.instrument_description_no_instrument_linked_personal;
        builder.is_cash_customer = this.credit_card_linking_enabled;
        builder.match_length = this.max_credit_card_prompts;
        builder.stock_ticker = this.credit_card_fee_bps;
        builder.is_linked_account = this.cash_balance_enabled;
        builder.is_c4b_account = this.issued_cards_enabled;
        builder.merchant_tags = this.issued_card_disabled_style;
        builder.is_multiple_account_holder = this.physical_issued_cards_enabled;
        builder.business_token = this.customer_passcode_instrument_token;
        builder.match_fields = this.supported_transfer_instruments;
        builder.is_first_linked_account = this.bankbook_enabled;
        builder.entity_type = this.nfc_card_linking_enabled;
        builder.offer_type = this.bank_account_linking_config;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        MenuItem menuItem = this.menu_item_card;
        if (menuItem != null) {
            arrayList.add("menu_item_card=" + menuItem);
        }
        MenuItem menuItem2 = this.menu_item_bank_account;
        if (menuItem2 != null) {
            arrayList.add("menu_item_bank_account=" + menuItem2);
        }
        MenuItem menuItem3 = this.menu_item_credit_card;
        if (menuItem3 != null) {
            arrayList.add("menu_item_credit_card=" + menuItem3);
        }
        MenuItem menuItem4 = this.menu_item_cash_balance;
        if (menuItem4 != null) {
            arrayList.add("menu_item_cash_balance=" + menuItem4);
        }
        String str = this.instrument_header_no_instrument_linked;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "instrument_header_no_instrument_linked=", arrayList);
        }
        String str2 = this.instrument_description_no_instrument_linked;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "instrument_description_no_instrument_linked=", arrayList);
        }
        String str3 = this.instrument_header_bank_account_linked;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "instrument_header_bank_account_linked=", arrayList);
        }
        String str4 = this.instrument_description_bank_account_linked;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "instrument_description_bank_account_linked=", arrayList);
        }
        String str5 = this.instrument_header_no_instrument_linked_personal;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "instrument_header_no_instrument_linked_personal=", arrayList);
        }
        String str6 = this.instrument_description_no_instrument_linked_personal;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "instrument_description_no_instrument_linked_personal=", arrayList);
        }
        Boolean bool = this.credit_card_linking_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("credit_card_linking_enabled=", bool, arrayList);
        }
        Integer num = this.max_credit_card_prompts;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("max_credit_card_prompts=", num, arrayList);
        }
        Long l = this.credit_card_fee_bps;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("credit_card_fee_bps=", l, arrayList);
        }
        Boolean bool2 = this.cash_balance_enabled;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("cash_balance_enabled=", bool2, arrayList);
        }
        Boolean bool3 = this.issued_cards_enabled;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("issued_cards_enabled=", bool3, arrayList);
        }
        IssuedCardDisabledStyle issuedCardDisabledStyle = this.issued_card_disabled_style;
        if (issuedCardDisabledStyle != null) {
            arrayList.add("issued_card_disabled_style=" + issuedCardDisabledStyle);
        }
        Boolean bool4 = this.physical_issued_cards_enabled;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("physical_issued_cards_enabled=", bool4, arrayList);
        }
        String str7 = this.customer_passcode_instrument_token;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "customer_passcode_instrument_token=", arrayList);
        }
        List list = this.supported_transfer_instruments;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("supported_transfer_instruments=", arrayList, list);
        }
        Boolean bool5 = this.bankbook_enabled;
        if (bool5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("bankbook_enabled=", bool5, arrayList);
        }
        Boolean bool6 = this.nfc_card_linking_enabled;
        if (bool6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("nfc_card_linking_enabled=", bool6, arrayList);
        }
        BankAccountLinkingConfig bankAccountLinkingConfig = this.bank_account_linking_config;
        if (bankAccountLinkingConfig != null) {
            arrayList.add("bank_account_linking_config=" + bankAccountLinkingConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InstrumentLinkingConfig{", "}", 0, null, null, 56);
    }
}
