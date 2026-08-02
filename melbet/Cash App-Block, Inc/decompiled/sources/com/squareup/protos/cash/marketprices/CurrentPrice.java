package com.squareup.protos.cash.marketprices;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.GiftCard;
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

/* loaded from: classes.dex */
public final class CurrentPrice extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CurrentPrice> CREATOR;
    public final Money current_price;
    public final String investment_entity_token;
    public final Money price_at_market_open;
    public final Long time_sec;

    static {
        CurrentPrice$Companion$ADAPTER$1 currentPrice$Companion$ADAPTER$1 = new CurrentPrice$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CurrentPrice.class), "type.googleapis.com/squareup.cash.marketprices.CurrentPrice", Syntax.PROTO_2, null, "squareup/cash/marketprices/prices.proto");
        ADAPTER = currentPrice$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(currentPrice$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrentPrice(String str, Money money, Money money2, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.investment_entity_token = str;
        this.current_price = money;
        this.price_at_market_open = money2;
        this.time_sec = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CurrentPrice)) {
            return false;
        }
        CurrentPrice currentPrice = (CurrentPrice) obj;
        return Intrinsics.areEqual(unknownFields(), currentPrice.unknownFields()) && Intrinsics.areEqual(this.investment_entity_token, currentPrice.investment_entity_token) && Intrinsics.areEqual(this.current_price, currentPrice.current_price) && Intrinsics.areEqual(this.price_at_market_open, currentPrice.price_at_market_open) && Intrinsics.areEqual(this.time_sec, currentPrice.time_sec);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.investment_entity_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Money money = this.current_price;
        int hashCode3 = (hashCode2 + (money != null ? money.hashCode() : 0)) * 37;
        Money money2 = this.price_at_market_open;
        int hashCode4 = (hashCode3 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Long l = this.time_sec;
        int hashCode5 = hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Builder builder = new GiftCard.Builder(20, false);
        builder.id = this.investment_entity_token;
        builder.last_4 = this.current_price;
        builder.gift_card_id = this.price_at_market_open;
        builder.gift_card_amount = this.time_sec;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.investment_entity_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "investment_entity_token=", arrayList);
        }
        Money money = this.current_price;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("current_price=", money, arrayList);
        }
        Money money2 = this.price_at_market_open;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("price_at_market_open=", money2, arrayList);
        }
        Long l = this.time_sec;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("time_sec=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CurrentPrice{", "}", 0, null, null, 56);
    }
}
