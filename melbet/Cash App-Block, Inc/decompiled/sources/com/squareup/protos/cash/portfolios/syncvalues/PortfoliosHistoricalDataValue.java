package com.squareup.protos.cash.portfolios.syncvalues;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.taply.app.v1.Allowed;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
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
public final class PortfoliosHistoricalDataValue extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PortfoliosHistoricalDataValue> CREATOR;
    public final BalanceHistory balance_history;
    public final List comparison_balance_history;
    public final HistoricalRange historical_range;
    public final Long next_refresh_ms;

    static {
        PortfoliosHistoricalDataValue$Companion$ADAPTER$1 portfoliosHistoricalDataValue$Companion$ADAPTER$1 = new PortfoliosHistoricalDataValue$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PortfoliosHistoricalDataValue.class), "type.googleapis.com/squareup.cash.portfolios.syncvalues.PortfoliosHistoricalDataValue", Syntax.PROTO_2, null, "squareup/cash/portfolios/syncvalues/portfolios_historical_data_value.proto");
        ADAPTER = portfoliosHistoricalDataValue$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(portfoliosHistoricalDataValue$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PortfoliosHistoricalDataValue(BalanceHistory balanceHistory, Long l, HistoricalRange historicalRange, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.balance_history = balanceHistory;
        this.next_refresh_ms = l;
        this.historical_range = historicalRange;
        this.comparison_balance_history = TransactorKt.immutableCopyOf("comparison_balance_history", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PortfoliosHistoricalDataValue)) {
            return false;
        }
        PortfoliosHistoricalDataValue portfoliosHistoricalDataValue = (PortfoliosHistoricalDataValue) obj;
        return Intrinsics.areEqual(unknownFields(), portfoliosHistoricalDataValue.unknownFields()) && Intrinsics.areEqual(this.balance_history, portfoliosHistoricalDataValue.balance_history) && Intrinsics.areEqual(this.next_refresh_ms, portfoliosHistoricalDataValue.next_refresh_ms) && this.historical_range == portfoliosHistoricalDataValue.historical_range && Intrinsics.areEqual(this.comparison_balance_history, portfoliosHistoricalDataValue.comparison_balance_history);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BalanceHistory balanceHistory = this.balance_history;
        int hashCode2 = (hashCode + (balanceHistory != null ? balanceHistory.hashCode() : 0)) * 37;
        Long l = this.next_refresh_ms;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        HistoricalRange historicalRange = this.historical_range;
        int hashCode4 = this.comparison_balance_history.hashCode() + ((hashCode3 + (historicalRange != null ? historicalRange.hashCode() : 0)) * 37);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Allowed.Builder builder = new Allowed.Builder(6);
        builder.card_encryption_data = this.balance_history;
        builder.customer_token_hash_email = this.next_refresh_ms;
        builder.device_metadata = this.historical_range;
        builder.success_screen = this.comparison_balance_history;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceHistory balanceHistory = this.balance_history;
        if (balanceHistory != null) {
            arrayList.add("balance_history=" + balanceHistory);
        }
        Long l = this.next_refresh_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("next_refresh_ms=", l, arrayList);
        }
        HistoricalRange historicalRange = this.historical_range;
        if (historicalRange != null) {
            arrayList.add("historical_range=" + historicalRange);
        }
        List list = this.comparison_balance_history;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("comparison_balance_history=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PortfoliosHistoricalDataValue{", "}", 0, null, null, 56);
    }
}
