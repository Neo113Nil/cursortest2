package com.squareup.protos.cash.portfolios;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.PriceHistory;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class HoldingBalanceHistory extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<HoldingBalanceHistory> CREATOR;
    public final List balance_ticks;
    public final Long end_time;
    public final String investment_entity_token;
    public final Long start_time;
    public final String symbol;
    public final Long tick_frequency_ms;

    static {
        HoldingBalanceHistory$Companion$ADAPTER$1 holdingBalanceHistory$Companion$ADAPTER$1 = new HoldingBalanceHistory$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(HoldingBalanceHistory.class), "type.googleapis.com/squareup.cash.portfolios.HoldingBalanceHistory", Syntax.PROTO_2, null, "squareup/cash/portfolios/service.proto");
        ADAPTER = holdingBalanceHistory$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(holdingBalanceHistory$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoldingBalanceHistory(Long l, Long l2, Long l3, String str, String str2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.investment_entity_token = str;
        this.symbol = str2;
        this.start_time = l;
        this.end_time = l2;
        this.tick_frequency_ms = l3;
        this.balance_ticks = TransactorKt.immutableCopyOf("balance_ticks", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HoldingBalanceHistory)) {
            return false;
        }
        HoldingBalanceHistory holdingBalanceHistory = (HoldingBalanceHistory) obj;
        return Intrinsics.areEqual(unknownFields(), holdingBalanceHistory.unknownFields()) && Intrinsics.areEqual(this.investment_entity_token, holdingBalanceHistory.investment_entity_token) && Intrinsics.areEqual(this.symbol, holdingBalanceHistory.symbol) && Intrinsics.areEqual(this.start_time, holdingBalanceHistory.start_time) && Intrinsics.areEqual(this.end_time, holdingBalanceHistory.end_time) && Intrinsics.areEqual(this.tick_frequency_ms, holdingBalanceHistory.tick_frequency_ms) && Intrinsics.areEqual(this.balance_ticks, holdingBalanceHistory.balance_ticks);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.investment_entity_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.symbol;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Long l = this.start_time;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.end_time;
        int hashCode5 = (hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Long l3 = this.tick_frequency_ms;
        int hashCode6 = this.balance_ticks.hashCode() + ((hashCode5 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PriceHistory.Builder builder = new PriceHistory.Builder(1);
        builder.base_currency_code = this.investment_entity_token;
        builder.quote_currency_code = this.symbol;
        builder.start_time = this.start_time;
        builder.end_time = this.end_time;
        builder.tick_frequency_ms = this.tick_frequency_ms;
        builder.price_ticks = this.balance_ticks;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.investment_entity_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "investment_entity_token=", arrayList);
        }
        String str2 = this.symbol;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "symbol=", arrayList);
        }
        Long l = this.start_time;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("start_time=", l, arrayList);
        }
        Long l2 = this.end_time;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("end_time=", l2, arrayList);
        }
        Long l3 = this.tick_frequency_ms;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("tick_frequency_ms=", l3, arrayList);
        }
        List list = this.balance_ticks;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("balance_ticks=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HoldingBalanceHistory{", "}", 0, null, null, 56);
    }
}
