package com.squareup.protos.cash.fx.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.grantly.api.Action;
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
public final class ExchangeRate extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ExchangeRate> CREATOR;
    public final CurrencyInfo from_currency;
    public final String rate;

    static {
        ExchangeRate$Companion$ADAPTER$1 exchangeRate$Companion$ADAPTER$1 = new ExchangeRate$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ExchangeRate.class), "type.googleapis.com/squareup.cash.fx.app.ExchangeRate", Syntax.PROTO_2, null, "squareup/cash/fx/app.proto");
        ADAPTER = exchangeRate$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(exchangeRate$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExchangeRate(CurrencyInfo currencyInfo, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.from_currency = currencyInfo;
        this.rate = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExchangeRate)) {
            return false;
        }
        ExchangeRate exchangeRate = (ExchangeRate) obj;
        return Intrinsics.areEqual(unknownFields(), exchangeRate.unknownFields()) && Intrinsics.areEqual(this.from_currency, exchangeRate.from_currency) && Intrinsics.areEqual(this.rate, exchangeRate.rate);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CurrencyInfo currencyInfo = this.from_currency;
        int hashCode2 = (hashCode + (currencyInfo != null ? currencyInfo.hashCode() : 0)) * 37;
        String str = this.rate;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(15);
        builder.f1268type = this.from_currency;
        builder.details = this.rate;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CurrencyInfo currencyInfo = this.from_currency;
        if (currencyInfo != null) {
            arrayList.add("from_currency=" + currencyInfo);
        }
        String str = this.rate;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "rate=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ExchangeRate{", "}", 0, null, null, 56);
    }
}
