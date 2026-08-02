package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.app.GetExchangeDataRequest;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ExchangeData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ExchangeData> CREATOR;
    public final CurrencyCode base_currency_code;
    public final List rates;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public CurrencyCode base_currency_code;
        public List rates;

        public Builder(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    this.rates = EmptyList.INSTANCE;
                    break;
            }
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new ExchangeData(this.base_currency_code, this.rates, buildUnknownFields());
                default:
                    return new GetExchangeDataRequest(this.base_currency_code, this.rates, buildUnknownFields());
            }
        }
    }

    static {
        ExchangeData$Companion$ADAPTER$1 exchangeData$Companion$ADAPTER$1 = new ExchangeData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ExchangeData.class), "type.googleapis.com/squareup.franklin.common.ExchangeData", Syntax.PROTO_2, null, "squareup/franklin/common/balance_data.proto");
        ADAPTER = exchangeData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(exchangeData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExchangeData(CurrencyCode currencyCode, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.base_currency_code = currencyCode;
        this.rates = TransactorKt.immutableCopyOf("rates", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExchangeData)) {
            return false;
        }
        ExchangeData exchangeData = (ExchangeData) obj;
        return Intrinsics.areEqual(unknownFields(), exchangeData.unknownFields()) && this.base_currency_code == exchangeData.base_currency_code && Intrinsics.areEqual(this.rates, exchangeData.rates);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CurrencyCode currencyCode = this.base_currency_code;
        int hashCode2 = this.rates.hashCode() + ((hashCode + (currencyCode != null ? currencyCode.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.base_currency_code = this.base_currency_code;
        builder.rates = this.rates;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CurrencyCode currencyCode = this.base_currency_code;
        if (currencyCode != null) {
            Matcher$$ExternalSyntheticOutline0.m("base_currency_code=", currencyCode, arrayList);
        }
        List list = this.rates;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("rates=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ExchangeData{", "}", 0, null, null, 56);
    }

    public ExchangeData(CurrencyCode currencyCode, List list, int i) {
        this((i & 1) != 0 ? null : currencyCode, (i & 2) != 0 ? EmptyList.INSTANCE : list, ByteString.EMPTY);
    }
}
