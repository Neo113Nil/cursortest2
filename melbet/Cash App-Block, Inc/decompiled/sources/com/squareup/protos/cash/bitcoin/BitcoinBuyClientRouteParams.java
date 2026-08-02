package com.squareup.protos.cash.bitcoin;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.BalanceImpact;
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
public final class BitcoinBuyClientRouteParams extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BitcoinBuyClientRouteParams> CREATOR;
    public final Money amount;
    public final String instrument_token;

    static {
        BitcoinBuyClientRouteParams$Companion$ADAPTER$1 bitcoinBuyClientRouteParams$Companion$ADAPTER$1 = new BitcoinBuyClientRouteParams$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BitcoinBuyClientRouteParams.class), "type.googleapis.com/squareup.cash.bitcoin.BitcoinBuyClientRouteParams", Syntax.PROTO_2, null, "squareup/cash/bitcoin/BitcoinRoutingParams.proto");
        ADAPTER = bitcoinBuyClientRouteParams$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(bitcoinBuyClientRouteParams$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinBuyClientRouteParams(Money money, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.amount = money;
        this.instrument_token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitcoinBuyClientRouteParams)) {
            return false;
        }
        BitcoinBuyClientRouteParams bitcoinBuyClientRouteParams = (BitcoinBuyClientRouteParams) obj;
        return Intrinsics.areEqual(unknownFields(), bitcoinBuyClientRouteParams.unknownFields()) && Intrinsics.areEqual(this.amount, bitcoinBuyClientRouteParams.amount) && Intrinsics.areEqual(this.instrument_token, bitcoinBuyClientRouteParams.instrument_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Money money = this.amount;
        int hashCode2 = (hashCode + (money != null ? money.hashCode() : 0)) * 37;
        String str = this.instrument_token;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BalanceImpact.Builder builder = new BalanceImpact.Builder(2);
        builder.amount = this.amount;
        builder.balance_name = this.instrument_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Money money = this.amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("amount=", money, arrayList);
        }
        String str = this.instrument_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "instrument_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BitcoinBuyClientRouteParams{", "}", 0, null, null, 56);
    }
}
