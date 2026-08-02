package com.squareup.protos.cash.spendinginsights.appapi;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.tax.OpenTaxHubResponse;
import com.squareup.protos.franklin.common.ResponseContext;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/spendinginsights/appapi/RefreshCardSpendingInsightsEntryPointResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/tax/OpenTaxHubResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RefreshCardSpendingInsightsEntryPointResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RefreshCardSpendingInsightsEntryPointResponse> CREATOR;
    public final ResponseContext response_context;

    static {
        RefreshCardSpendingInsightsEntryPointResponse$Companion$ADAPTER$1 refreshCardSpendingInsightsEntryPointResponse$Companion$ADAPTER$1 = new RefreshCardSpendingInsightsEntryPointResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RefreshCardSpendingInsightsEntryPointResponse.class), "type.googleapis.com/squareup.cash.spendinginsights.appapi.RefreshCardSpendingInsightsEntryPointResponse", Syntax.PROTO_2, null, "squareup/cash/spendinginsights/app/spending_insights_app_service.proto");
        ADAPTER = refreshCardSpendingInsightsEntryPointResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(refreshCardSpendingInsightsEntryPointResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshCardSpendingInsightsEntryPointResponse(ResponseContext responseContext, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RefreshCardSpendingInsightsEntryPointResponse)) {
            return false;
        }
        RefreshCardSpendingInsightsEntryPointResponse refreshCardSpendingInsightsEntryPointResponse = (RefreshCardSpendingInsightsEntryPointResponse) obj;
        return Intrinsics.areEqual(unknownFields(), refreshCardSpendingInsightsEntryPointResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, refreshCardSpendingInsightsEntryPointResponse.response_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = hashCode + (responseContext != null ? responseContext.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        OpenTaxHubResponse.Builder builder = new OpenTaxHubResponse.Builder(4);
        builder.response_context = this.response_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RefreshCardSpendingInsightsEntryPointResponse{", "}", 0, null, null, 56);
    }
}
