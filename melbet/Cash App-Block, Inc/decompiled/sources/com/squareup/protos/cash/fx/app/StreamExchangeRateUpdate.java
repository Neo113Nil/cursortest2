package com.squareup.protos.cash.fx.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.protos.common.CurrencyCode;
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

/* loaded from: classes7.dex */
public final class StreamExchangeRateUpdate extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StreamExchangeRateUpdate> CREATOR;
    public final Long emitted_at_ms;
    public final ExchangeRate exchange_rate;
    public final CurrencyCode from_currency;
    public final CurrencyCode to_currency;

    static {
        StreamExchangeRateUpdate$Companion$ADAPTER$1 streamExchangeRateUpdate$Companion$ADAPTER$1 = new StreamExchangeRateUpdate$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StreamExchangeRateUpdate.class), "type.googleapis.com/squareup.cash.fx.app.StreamExchangeRateUpdate", Syntax.PROTO_2, null, "squareup/cash/fx/app.proto");
        ADAPTER = streamExchangeRateUpdate$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(streamExchangeRateUpdate$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamExchangeRateUpdate(ExchangeRate exchangeRate, CurrencyCode currencyCode, CurrencyCode currencyCode2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.exchange_rate = exchangeRate;
        this.from_currency = currencyCode;
        this.to_currency = currencyCode2;
        this.emitted_at_ms = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StreamExchangeRateUpdate)) {
            return false;
        }
        StreamExchangeRateUpdate streamExchangeRateUpdate = (StreamExchangeRateUpdate) obj;
        return Intrinsics.areEqual(unknownFields(), streamExchangeRateUpdate.unknownFields()) && Intrinsics.areEqual(this.exchange_rate, streamExchangeRateUpdate.exchange_rate) && this.from_currency == streamExchangeRateUpdate.from_currency && this.to_currency == streamExchangeRateUpdate.to_currency && Intrinsics.areEqual(this.emitted_at_ms, streamExchangeRateUpdate.emitted_at_ms);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ExchangeRate exchangeRate = this.exchange_rate;
        int hashCode2 = (hashCode + (exchangeRate != null ? exchangeRate.hashCode() : 0)) * 37;
        CurrencyCode currencyCode = this.from_currency;
        int hashCode3 = (hashCode2 + (currencyCode != null ? currencyCode.hashCode() : 0)) * 37;
        CurrencyCode currencyCode2 = this.to_currency;
        int hashCode4 = (hashCode3 + (currencyCode2 != null ? currencyCode2.hashCode() : 0)) * 37;
        Long l = this.emitted_at_ms;
        int hashCode5 = hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.CardPii.Builder builder = new Card.CardPii.Builder(7, false);
        builder.postal_code = this.exchange_rate;
        builder.last_four_digits = this.from_currency;
        builder.expiration = this.to_currency;
        builder.ciphertext_ = this.emitted_at_ms;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ExchangeRate exchangeRate = this.exchange_rate;
        if (exchangeRate != null) {
            arrayList.add("exchange_rate=" + exchangeRate);
        }
        CurrencyCode currencyCode = this.from_currency;
        if (currencyCode != null) {
            Matcher$$ExternalSyntheticOutline0.m("from_currency=", currencyCode, arrayList);
        }
        CurrencyCode currencyCode2 = this.to_currency;
        if (currencyCode2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("to_currency=", currencyCode2, arrayList);
        }
        Long l = this.emitted_at_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("emitted_at_ms=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StreamExchangeRateUpdate{", "}", 0, null, null, 56);
    }
}
