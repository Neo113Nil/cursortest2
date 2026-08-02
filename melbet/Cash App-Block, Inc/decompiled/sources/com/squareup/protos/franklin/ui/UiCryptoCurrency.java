package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneta.api.v1_0.CashInRequest;
import com.squareup.protos.franklin.common.EnableCryptocurrencyTransferInStatus;
import com.squareup.protos.franklin.common.EnableCryptocurrencyTransferOutStatus;
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
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes8.dex */
public final class UiCryptoCurrency extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiCryptoCurrency> CREATOR;
    public final Long accepted_crypto_terms_at;
    public final Boolean bitcoin_deposit_enabled;
    public final BitcoinDisplayUnits bitcoin_display_units;
    public final Boolean bitcoin_p2p_enabled;
    public final Boolean bitcoin_withdrawal_enabled;
    public final String enable_cryptocurrency_transfer_in_button_text;
    public final EnableCryptocurrencyTransferInStatus enable_cryptocurrency_transfer_in_status;
    public final String enable_cryptocurrency_transfer_out_button_text;
    public final EnableCryptocurrencyTransferOutStatus enable_cryptocurrency_transfer_out_status;
    public final Boolean has_usd_over_ln_payment;

    static {
        UiCryptoCurrency$Companion$ADAPTER$1 uiCryptoCurrency$Companion$ADAPTER$1 = new UiCryptoCurrency$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiCryptoCurrency.class), "type.googleapis.com/squareup.franklin.ui.UiCryptoCurrency", Syntax.PROTO_2, null, "squareup/franklin/ui/cryptocurrency.proto");
        ADAPTER = uiCryptoCurrency$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiCryptoCurrency$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiCryptoCurrency(BitcoinDisplayUnits bitcoinDisplayUnits, Boolean bool, Boolean bool2, EnableCryptocurrencyTransferOutStatus enableCryptocurrencyTransferOutStatus, String str, EnableCryptocurrencyTransferInStatus enableCryptocurrencyTransferInStatus, String str2, Boolean bool3, Long l, Boolean bool4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.bitcoin_display_units = bitcoinDisplayUnits;
        this.bitcoin_withdrawal_enabled = bool;
        this.bitcoin_deposit_enabled = bool2;
        this.enable_cryptocurrency_transfer_out_status = enableCryptocurrencyTransferOutStatus;
        this.enable_cryptocurrency_transfer_out_button_text = str;
        this.enable_cryptocurrency_transfer_in_status = enableCryptocurrencyTransferInStatus;
        this.enable_cryptocurrency_transfer_in_button_text = str2;
        this.bitcoin_p2p_enabled = bool3;
        this.accepted_crypto_terms_at = l;
        this.has_usd_over_ln_payment = bool4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiCryptoCurrency)) {
            return false;
        }
        UiCryptoCurrency uiCryptoCurrency = (UiCryptoCurrency) obj;
        return Intrinsics.areEqual(unknownFields(), uiCryptoCurrency.unknownFields()) && this.bitcoin_display_units == uiCryptoCurrency.bitcoin_display_units && Intrinsics.areEqual(this.bitcoin_withdrawal_enabled, uiCryptoCurrency.bitcoin_withdrawal_enabled) && Intrinsics.areEqual(this.bitcoin_deposit_enabled, uiCryptoCurrency.bitcoin_deposit_enabled) && this.enable_cryptocurrency_transfer_out_status == uiCryptoCurrency.enable_cryptocurrency_transfer_out_status && Intrinsics.areEqual(this.enable_cryptocurrency_transfer_out_button_text, uiCryptoCurrency.enable_cryptocurrency_transfer_out_button_text) && this.enable_cryptocurrency_transfer_in_status == uiCryptoCurrency.enable_cryptocurrency_transfer_in_status && Intrinsics.areEqual(this.enable_cryptocurrency_transfer_in_button_text, uiCryptoCurrency.enable_cryptocurrency_transfer_in_button_text) && Intrinsics.areEqual(this.bitcoin_p2p_enabled, uiCryptoCurrency.bitcoin_p2p_enabled) && Intrinsics.areEqual(this.accepted_crypto_terms_at, uiCryptoCurrency.accepted_crypto_terms_at) && Intrinsics.areEqual(this.has_usd_over_ln_payment, uiCryptoCurrency.has_usd_over_ln_payment);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BitcoinDisplayUnits bitcoinDisplayUnits = this.bitcoin_display_units;
        int hashCode2 = (hashCode + (bitcoinDisplayUnits != null ? bitcoinDisplayUnits.hashCode() : 0)) * 37;
        Boolean bool = this.bitcoin_withdrawal_enabled;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.bitcoin_deposit_enabled;
        int hashCode4 = (hashCode3 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        EnableCryptocurrencyTransferOutStatus enableCryptocurrencyTransferOutStatus = this.enable_cryptocurrency_transfer_out_status;
        int hashCode5 = (hashCode4 + (enableCryptocurrencyTransferOutStatus != null ? enableCryptocurrencyTransferOutStatus.hashCode() : 0)) * 37;
        String str = this.enable_cryptocurrency_transfer_out_button_text;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 37;
        EnableCryptocurrencyTransferInStatus enableCryptocurrencyTransferInStatus = this.enable_cryptocurrency_transfer_in_status;
        int hashCode7 = (hashCode6 + (enableCryptocurrencyTransferInStatus != null ? enableCryptocurrencyTransferInStatus.hashCode() : 0)) * 37;
        String str2 = this.enable_cryptocurrency_transfer_in_button_text;
        int hashCode8 = (hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool3 = this.bitcoin_p2p_enabled;
        int hashCode9 = (hashCode8 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        Long l = this.accepted_crypto_terms_at;
        int hashCode10 = (hashCode9 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Boolean bool4 = this.has_usd_over_ln_payment;
        int hashCode11 = hashCode10 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CashInRequest.Builder builder = new CashInRequest.Builder(23);
        builder.request_context = this.bitcoin_display_units;
        builder.external_client_transfer_token = this.bitcoin_withdrawal_enabled;
        builder.source = this.bitcoin_deposit_enabled;
        builder.target = this.enable_cryptocurrency_transfer_out_status;
        builder.external_id = this.enable_cryptocurrency_transfer_out_button_text;
        builder.amount = this.enable_cryptocurrency_transfer_in_status;
        builder.passcode_token = this.enable_cryptocurrency_transfer_in_button_text;
        builder.call_context = this.bitcoin_p2p_enabled;
        builder.forwarded_call_context = this.accepted_crypto_terms_at;
        builder.client_verified_digital_wallet = this.has_usd_over_ln_payment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BitcoinDisplayUnits bitcoinDisplayUnits = this.bitcoin_display_units;
        if (bitcoinDisplayUnits != null) {
            arrayList.add("bitcoin_display_units=" + bitcoinDisplayUnits);
        }
        Boolean bool = this.bitcoin_withdrawal_enabled;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("bitcoin_withdrawal_enabled=", bool, arrayList);
        }
        Boolean bool2 = this.bitcoin_deposit_enabled;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("bitcoin_deposit_enabled=", bool2, arrayList);
        }
        EnableCryptocurrencyTransferOutStatus enableCryptocurrencyTransferOutStatus = this.enable_cryptocurrency_transfer_out_status;
        if (enableCryptocurrencyTransferOutStatus != null) {
            arrayList.add("enable_cryptocurrency_transfer_out_status=" + enableCryptocurrencyTransferOutStatus);
        }
        String str = this.enable_cryptocurrency_transfer_out_button_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "enable_cryptocurrency_transfer_out_button_text=", arrayList);
        }
        EnableCryptocurrencyTransferInStatus enableCryptocurrencyTransferInStatus = this.enable_cryptocurrency_transfer_in_status;
        if (enableCryptocurrencyTransferInStatus != null) {
            arrayList.add("enable_cryptocurrency_transfer_in_status=" + enableCryptocurrencyTransferInStatus);
        }
        String str2 = this.enable_cryptocurrency_transfer_in_button_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "enable_cryptocurrency_transfer_in_button_text=", arrayList);
        }
        Boolean bool3 = this.bitcoin_p2p_enabled;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("bitcoin_p2p_enabled=", bool3, arrayList);
        }
        Long l = this.accepted_crypto_terms_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("accepted_crypto_terms_at=", l, arrayList);
        }
        Boolean bool4 = this.has_usd_over_ln_payment;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_usd_over_ln_payment=", bool4, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiCryptoCurrency{", "}", 0, null, null, 56);
    }
}
