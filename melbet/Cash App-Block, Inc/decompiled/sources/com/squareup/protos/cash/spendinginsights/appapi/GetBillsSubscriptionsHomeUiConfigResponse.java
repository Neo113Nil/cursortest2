package com.squareup.protos.cash.spendinginsights.appapi;

import android.os.Parcelable;
import com.squareup.protos.cash.pools.ListPoolsRequest;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/spendinginsights/appapi/GetBillsSubscriptionsHomeUiConfigResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/pools/ListPoolsRequest$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetBillsSubscriptionsHomeUiConfigResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetBillsSubscriptionsHomeUiConfigResponse> CREATOR;
    public final BillsSubscriptionsHomeUiConfig bills_subscriptions_home_ui_config;

    static {
        GetBillsSubscriptionsHomeUiConfigResponse$Companion$ADAPTER$1 getBillsSubscriptionsHomeUiConfigResponse$Companion$ADAPTER$1 = new GetBillsSubscriptionsHomeUiConfigResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetBillsSubscriptionsHomeUiConfigResponse.class), "type.googleapis.com/squareup.cash.spendinginsights.appapi.GetBillsSubscriptionsHomeUiConfigResponse", Syntax.PROTO_2, null, "squareup/cash/spendinginsights/app/spending_insights_app_service.proto");
        ADAPTER = getBillsSubscriptionsHomeUiConfigResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getBillsSubscriptionsHomeUiConfigResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBillsSubscriptionsHomeUiConfigResponse(BillsSubscriptionsHomeUiConfig billsSubscriptionsHomeUiConfig, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.bills_subscriptions_home_ui_config = billsSubscriptionsHomeUiConfig;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetBillsSubscriptionsHomeUiConfigResponse)) {
            return false;
        }
        GetBillsSubscriptionsHomeUiConfigResponse getBillsSubscriptionsHomeUiConfigResponse = (GetBillsSubscriptionsHomeUiConfigResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getBillsSubscriptionsHomeUiConfigResponse.unknownFields()) && Intrinsics.areEqual(this.bills_subscriptions_home_ui_config, getBillsSubscriptionsHomeUiConfigResponse.bills_subscriptions_home_ui_config);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BillsSubscriptionsHomeUiConfig billsSubscriptionsHomeUiConfig = this.bills_subscriptions_home_ui_config;
        int hashCode2 = hashCode + (billsSubscriptionsHomeUiConfig != null ? billsSubscriptionsHomeUiConfig.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(22);
        builder.pool_lifecycle_filter = this.bills_subscriptions_home_ui_config;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BillsSubscriptionsHomeUiConfig billsSubscriptionsHomeUiConfig = this.bills_subscriptions_home_ui_config;
        if (billsSubscriptionsHomeUiConfig != null) {
            arrayList.add("bills_subscriptions_home_ui_config=" + billsSubscriptionsHomeUiConfig);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetBillsSubscriptionsHomeUiConfigResponse{", "}", 0, null, null, 56);
    }
}
