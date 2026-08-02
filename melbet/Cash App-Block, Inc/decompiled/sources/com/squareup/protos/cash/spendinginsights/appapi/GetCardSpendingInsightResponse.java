package com.squareup.protos.cash.spendinginsights.appapi;

import android.os.Parcelable;
import com.squareup.protos.cash.pools.ListPoolsRequest;
import com.squareup.protos.cash.spendinginsights.CardSpendingInsight;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/spendinginsights/appapi/GetCardSpendingInsightResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/pools/ListPoolsRequest$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetCardSpendingInsightResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetCardSpendingInsightResponse> CREATOR;
    public final CardSpendingInsight insight;

    static {
        GetCardSpendingInsightResponse$Companion$ADAPTER$1 getCardSpendingInsightResponse$Companion$ADAPTER$1 = new GetCardSpendingInsightResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetCardSpendingInsightResponse.class), "type.googleapis.com/squareup.cash.spendinginsights.appapi.GetCardSpendingInsightResponse", Syntax.PROTO_2, null, "squareup/cash/spendinginsights/app/spending_insights_app_service.proto");
        ADAPTER = getCardSpendingInsightResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getCardSpendingInsightResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCardSpendingInsightResponse(CardSpendingInsight cardSpendingInsight, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.insight = cardSpendingInsight;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetCardSpendingInsightResponse)) {
            return false;
        }
        GetCardSpendingInsightResponse getCardSpendingInsightResponse = (GetCardSpendingInsightResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getCardSpendingInsightResponse.unknownFields()) && Intrinsics.areEqual(this.insight, getCardSpendingInsightResponse.insight);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CardSpendingInsight cardSpendingInsight = this.insight;
        int hashCode2 = hashCode + (cardSpendingInsight != null ? cardSpendingInsight.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(23);
        builder.pool_lifecycle_filter = this.insight;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CardSpendingInsight cardSpendingInsight = this.insight;
        if (cardSpendingInsight != null) {
            arrayList.add("insight=" + cardSpendingInsight);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCardSpendingInsightResponse{", "}", 0, null, null, 56);
    }
}
