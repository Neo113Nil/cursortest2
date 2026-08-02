package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import com.squareup.protos.franklin.app.ClaimData;
import com.squareup.protos.franklin.common.PriceHistory;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/app/GetHistoricalExchangeDataResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/app/ClaimData$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetHistoricalExchangeDataResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetHistoricalExchangeDataResponse> CREATOR;
    public final PriceHistory price_history;

    static {
        GetHistoricalExchangeDataResponse$Companion$ADAPTER$1 getHistoricalExchangeDataResponse$Companion$ADAPTER$1 = new GetHistoricalExchangeDataResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetHistoricalExchangeDataResponse.class), "type.googleapis.com/squareup.franklin.app.GetHistoricalExchangeDataResponse", Syntax.PROTO_2, null, "squareup/franklin/app/exchange_data.proto");
        ADAPTER = getHistoricalExchangeDataResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getHistoricalExchangeDataResponse$Companion$ADAPTER$1);
    }

    public /* synthetic */ GetHistoricalExchangeDataResponse(PriceHistory priceHistory, int i) {
        this((i & 1) != 0 ? null : priceHistory, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetHistoricalExchangeDataResponse)) {
            return false;
        }
        GetHistoricalExchangeDataResponse getHistoricalExchangeDataResponse = (GetHistoricalExchangeDataResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getHistoricalExchangeDataResponse.unknownFields()) && Intrinsics.areEqual(this.price_history, getHistoricalExchangeDataResponse.price_history);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PriceHistory priceHistory = this.price_history;
        int hashCode2 = hashCode + (priceHistory != null ? priceHistory.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClaimData.Builder builder = new ClaimData.Builder(12);
        builder.claimable_payment = this.price_history;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PriceHistory priceHistory = this.price_history;
        if (priceHistory != null) {
            arrayList.add("price_history=" + priceHistory);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetHistoricalExchangeDataResponse{", "}", 0, null, null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetHistoricalExchangeDataResponse(PriceHistory priceHistory, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.price_history = priceHistory;
    }
}
