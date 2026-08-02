package com.squareup.protos.cryptoinvestflow;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.api.UiAlias;
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
public final class CryptoPayrollPreference extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CryptoPayrollPreference> CREATOR;
    public final Integer allocation_bps;
    public final CurrencyCode source_currency;
    public final CurrencyCode target_currency;

    static {
        CryptoPayrollPreference$Companion$ADAPTER$1 cryptoPayrollPreference$Companion$ADAPTER$1 = new CryptoPayrollPreference$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CryptoPayrollPreference.class), "type.googleapis.com/squareup.cryptoinvestflow.CryptoPayrollPreference", Syntax.PROTO_2, null, "squareup/crypto-invest-flow/crypto_payroll_preference.proto");
        ADAPTER = cryptoPayrollPreference$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cryptoPayrollPreference$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoPayrollPreference(Integer num, CurrencyCode currencyCode, CurrencyCode currencyCode2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.allocation_bps = num;
        this.source_currency = currencyCode;
        this.target_currency = currencyCode2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CryptoPayrollPreference)) {
            return false;
        }
        CryptoPayrollPreference cryptoPayrollPreference = (CryptoPayrollPreference) obj;
        return Intrinsics.areEqual(unknownFields(), cryptoPayrollPreference.unknownFields()) && Intrinsics.areEqual(this.allocation_bps, cryptoPayrollPreference.allocation_bps) && this.source_currency == cryptoPayrollPreference.source_currency && this.target_currency == cryptoPayrollPreference.target_currency;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.allocation_bps;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        CurrencyCode currencyCode = this.source_currency;
        int hashCode3 = (hashCode2 + (currencyCode != null ? currencyCode.hashCode() : 0)) * 37;
        CurrencyCode currencyCode2 = this.target_currency;
        int hashCode4 = hashCode3 + (currencyCode2 != null ? currencyCode2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAlias.Builder builder = new UiAlias.Builder(10);
        builder.f1364type = this.allocation_bps;
        builder.canonical_text = this.source_currency;
        builder.formatted = this.target_currency;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.allocation_bps;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("allocation_bps=", num, arrayList);
        }
        CurrencyCode currencyCode = this.source_currency;
        if (currencyCode != null) {
            Matcher$$ExternalSyntheticOutline0.m("source_currency=", currencyCode, arrayList);
        }
        CurrencyCode currencyCode2 = this.target_currency;
        if (currencyCode2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("target_currency=", currencyCode2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoPayrollPreference{", "}", 0, null, null, 56);
    }
}
