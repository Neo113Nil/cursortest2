package com.squareup.protos.cash.portfolios;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.ListPoolsResponse;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/portfolios/GetHoldingsHistoricalDataResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/pools/ListPoolsResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetHoldingsHistoricalDataResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetHoldingsHistoricalDataResponse> CREATOR;
    public final List holding_histories;

    static {
        GetHoldingsHistoricalDataResponse$Companion$ADAPTER$1 getHoldingsHistoricalDataResponse$Companion$ADAPTER$1 = new GetHoldingsHistoricalDataResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetHoldingsHistoricalDataResponse.class), "type.googleapis.com/squareup.cash.portfolios.GetHoldingsHistoricalDataResponse", Syntax.PROTO_2, null, "squareup/cash/portfolios/service.proto");
        ADAPTER = getHoldingsHistoricalDataResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getHoldingsHistoricalDataResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetHoldingsHistoricalDataResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.holding_histories = TransactorKt.immutableCopyOf("holding_histories", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetHoldingsHistoricalDataResponse)) {
            return false;
        }
        GetHoldingsHistoricalDataResponse getHoldingsHistoricalDataResponse = (GetHoldingsHistoricalDataResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getHoldingsHistoricalDataResponse.unknownFields()) && Intrinsics.areEqual(this.holding_histories, getHoldingsHistoricalDataResponse.holding_histories);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.holding_histories.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsResponse.Builder builder = new ListPoolsResponse.Builder(11, false);
        builder.pools = this.holding_histories;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.holding_histories;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("holding_histories=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetHoldingsHistoricalDataResponse{", "}", 0, null, null, 56);
    }
}
