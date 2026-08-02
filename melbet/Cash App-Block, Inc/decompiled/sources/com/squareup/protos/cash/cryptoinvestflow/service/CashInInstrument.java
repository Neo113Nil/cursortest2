package com.squareup.protos.cash.cryptoinvestflow.service;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashface.api.Trust;
import com.squareup.protos.common.Money;
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
public final class CashInInstrument extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashInInstrument> CREATOR;
    public final Money amount;
    public final CashInInstrumentType cash_in_instrument_type;
    public final String instrument_display_name;
    public final String instrument_token;

    static {
        CashInInstrument$Companion$ADAPTER$1 cashInInstrument$Companion$ADAPTER$1 = new CashInInstrument$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashInInstrument.class), "type.googleapis.com/squareup.cash.cryptoinvestflow.service.CashInInstrument", Syntax.PROTO_2, null, "squareup/cash/cryptoinvestflow/service/exchange.proto");
        ADAPTER = cashInInstrument$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashInInstrument$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashInInstrument(String str, String str2, CashInInstrumentType cashInInstrumentType, Money money, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.instrument_token = str;
        this.instrument_display_name = str2;
        this.cash_in_instrument_type = cashInInstrumentType;
        this.amount = money;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashInInstrument)) {
            return false;
        }
        CashInInstrument cashInInstrument = (CashInInstrument) obj;
        return Intrinsics.areEqual(unknownFields(), cashInInstrument.unknownFields()) && Intrinsics.areEqual(this.instrument_token, cashInInstrument.instrument_token) && Intrinsics.areEqual(this.instrument_display_name, cashInInstrument.instrument_display_name) && this.cash_in_instrument_type == cashInInstrument.cash_in_instrument_type && Intrinsics.areEqual(this.amount, cashInInstrument.amount);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.instrument_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.instrument_display_name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        CashInInstrumentType cashInInstrumentType = this.cash_in_instrument_type;
        int hashCode4 = (hashCode3 + (cashInInstrumentType != null ? cashInInstrumentType.hashCode() : 0)) * 37;
        Money money = this.amount;
        int hashCode5 = hashCode4 + (money != null ? money.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Trust.Builder builder = new Trust.Builder(26, false);
        builder.title = this.instrument_token;
        builder.icon = this.instrument_display_name;
        builder.enabled = this.cash_in_instrument_type;
        builder.id = this.amount;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.instrument_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "instrument_token=", arrayList);
        }
        String str2 = this.instrument_display_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "instrument_display_name=", arrayList);
        }
        CashInInstrumentType cashInInstrumentType = this.cash_in_instrument_type;
        if (cashInInstrumentType != null) {
            arrayList.add("cash_in_instrument_type=" + cashInInstrumentType);
        }
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashInInstrument{", "}", 0, null, null, 56);
    }
}
