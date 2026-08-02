package com.squareup.protos.cash.portfolios;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.groups.ExpenseSlice;
import com.squareup.protos.cash.portfolios.syncvalues.PortfoliosHistoricalDataValue;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/portfolios/GetPortfoliosHistoricalDataResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/groups/ExpenseSlice$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetPortfoliosHistoricalDataResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetPortfoliosHistoricalDataResponse> CREATOR;
    public final BalanceHistory balance_history;
    public final List comparison_balance_history;
    public final String entity_id;
    public final Long next_refresh_ms;
    public final PortfoliosHistoricalDataValue portfolios_historical_data_value;
    public final Long version;

    static {
        GetPortfoliosHistoricalDataResponse$Companion$ADAPTER$1 getPortfoliosHistoricalDataResponse$Companion$ADAPTER$1 = new GetPortfoliosHistoricalDataResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetPortfoliosHistoricalDataResponse.class), "type.googleapis.com/squareup.cash.portfolios.GetPortfoliosHistoricalDataResponse", Syntax.PROTO_2, null, "squareup/cash/portfolios/service.proto");
        ADAPTER = getPortfoliosHistoricalDataResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getPortfoliosHistoricalDataResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPortfoliosHistoricalDataResponse(BalanceHistory balanceHistory, Long l, List list, PortfoliosHistoricalDataValue portfoliosHistoricalDataValue, String str, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.balance_history = balanceHistory;
        this.next_refresh_ms = l;
        this.portfolios_historical_data_value = portfoliosHistoricalDataValue;
        this.entity_id = str;
        this.version = l2;
        this.comparison_balance_history = TransactorKt.immutableCopyOf("comparison_balance_history", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPortfoliosHistoricalDataResponse)) {
            return false;
        }
        GetPortfoliosHistoricalDataResponse getPortfoliosHistoricalDataResponse = (GetPortfoliosHistoricalDataResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getPortfoliosHistoricalDataResponse.unknownFields()) && Intrinsics.areEqual(this.balance_history, getPortfoliosHistoricalDataResponse.balance_history) && Intrinsics.areEqual(this.next_refresh_ms, getPortfoliosHistoricalDataResponse.next_refresh_ms) && Intrinsics.areEqual(this.comparison_balance_history, getPortfoliosHistoricalDataResponse.comparison_balance_history) && Intrinsics.areEqual(this.portfolios_historical_data_value, getPortfoliosHistoricalDataResponse.portfolios_historical_data_value) && Intrinsics.areEqual(this.entity_id, getPortfoliosHistoricalDataResponse.entity_id) && Intrinsics.areEqual(this.version, getPortfoliosHistoricalDataResponse.version);
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
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37, 37, this.comparison_balance_history);
        PortfoliosHistoricalDataValue portfoliosHistoricalDataValue = this.portfolios_historical_data_value;
        int hashCode3 = (m + (portfoliosHistoricalDataValue != null ? portfoliosHistoricalDataValue.hashCode() : 0)) * 37;
        String str = this.entity_id;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        Long l2 = this.version;
        int hashCode5 = hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ExpenseSlice.Builder builder = new ExpenseSlice.Builder(26);
        builder.requester = this.balance_history;
        builder.responder = this.next_refresh_ms;
        builder.amount = this.comparison_balance_history;
        builder.status = this.portfolios_historical_data_value;
        builder.slice_token = this.entity_id;
        builder.action = this.version;
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
        List list = this.comparison_balance_history;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("comparison_balance_history=", arrayList, list);
        }
        PortfoliosHistoricalDataValue portfoliosHistoricalDataValue = this.portfolios_historical_data_value;
        if (portfoliosHistoricalDataValue != null) {
            arrayList.add("portfolios_historical_data_value=" + portfoliosHistoricalDataValue);
        }
        String str = this.entity_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "entity_id=", arrayList);
        }
        Long l2 = this.version;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPortfoliosHistoricalDataResponse{", "}", 0, null, null, 56);
    }

    public GetPortfoliosHistoricalDataResponse(BalanceHistory balanceHistory, int i) {
        this((i & 1) != 0 ? null : balanceHistory, null, EmptyList.INSTANCE, null, null, null, ByteString.EMPTY);
    }
}
