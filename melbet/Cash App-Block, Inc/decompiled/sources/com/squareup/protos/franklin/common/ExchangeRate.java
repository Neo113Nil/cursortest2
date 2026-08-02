package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.document.Document;
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

/* loaded from: classes.dex */
public final class ExchangeRate extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ExchangeRate> CREATOR;
    public final Long base_value_cents;
    public final Long change_bps;
    public final Long change_cents;
    public final Long created_at_seconds;
    public final CurrencyCode currency_code;
    public final Money market_value;

    static {
        ExchangeRate$Companion$ADAPTER$1 exchangeRate$Companion$ADAPTER$1 = new ExchangeRate$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ExchangeRate.class), "type.googleapis.com/squareup.franklin.common.ExchangeRate", Syntax.PROTO_2, null, "squareup/franklin/common/balance_data.proto");
        ADAPTER = exchangeRate$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(exchangeRate$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExchangeRate(Money money, Long l, Long l2, Long l3, CurrencyCode currencyCode, Long l4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.market_value = money;
        this.change_bps = l;
        this.change_cents = l2;
        this.base_value_cents = l3;
        this.currency_code = currencyCode;
        this.created_at_seconds = l4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExchangeRate)) {
            return false;
        }
        ExchangeRate exchangeRate = (ExchangeRate) obj;
        return Intrinsics.areEqual(unknownFields(), exchangeRate.unknownFields()) && Intrinsics.areEqual(this.market_value, exchangeRate.market_value) && Intrinsics.areEqual(this.change_bps, exchangeRate.change_bps) && Intrinsics.areEqual(this.change_cents, exchangeRate.change_cents) && Intrinsics.areEqual(this.base_value_cents, exchangeRate.base_value_cents) && this.currency_code == exchangeRate.currency_code && Intrinsics.areEqual(this.created_at_seconds, exchangeRate.created_at_seconds);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.market_value;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        Long l = this.change_bps;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.change_cents;
        int hashCode4 = (hashCode3 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.base_value_cents;
        int hashCode5 = (hashCode4 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        CurrencyCode currencyCode = this.currency_code;
        int hashCode6 = (hashCode5 + (currencyCode != null ? currencyCode.hashCode() : 0)) * 37;
        Long l4 = this.created_at_seconds;
        int hashCode7 = hashCode6 + (l4 != null ? Long.hashCode(l4.longValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Document.Builder builder = new Document.Builder(28, false);
        builder.category = this.market_value;
        builder.document_date = this.change_bps;
        builder.token = this.change_cents;
        builder.title = this.base_value_cents;
        builder.url = this.currency_code;
        builder.owner_token = this.created_at_seconds;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.market_value;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("market_value=", money, arrayList);
        }
        Long l = this.change_bps;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("change_bps=", l, arrayList);
        }
        Long l2 = this.change_cents;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("change_cents=", l2, arrayList);
        }
        Long l3 = this.base_value_cents;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("base_value_cents=", l3, arrayList);
        }
        CurrencyCode currencyCode = this.currency_code;
        if (currencyCode != null) {
            Matcher$$ExternalSyntheticOutline0.m("currency_code=", currencyCode, arrayList);
        }
        Long l4 = this.created_at_seconds;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("created_at_seconds=", l4, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ExchangeRate{", "}", 0, null, null, 56);
    }
}
