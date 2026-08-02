package com.squareup.protos.franklin.investing;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.AppLinks;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.SyncInvestmentHolding;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/franklin/investing/UpdateInvestmentHoldingResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/AppLinks$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UpdateInvestmentHoldingResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateInvestmentHoldingResponse> CREATOR;
    public final SyncInvestmentHolding investment_holding;
    public final ResponseContext response_context;

    static {
        UpdateInvestmentHoldingResponse$Companion$ADAPTER$1 updateInvestmentHoldingResponse$Companion$ADAPTER$1 = new UpdateInvestmentHoldingResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UpdateInvestmentHoldingResponse.class), "type.googleapis.com/squareup.franklin.investing.UpdateInvestmentHoldingResponse", Syntax.PROTO_2, null, "squareup/franklin/investing.proto");
        ADAPTER = updateInvestmentHoldingResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(updateInvestmentHoldingResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateInvestmentHoldingResponse(ResponseContext responseContext, SyncInvestmentHolding syncInvestmentHolding, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response_context = responseContext;
        this.investment_holding = syncInvestmentHolding;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateInvestmentHoldingResponse)) {
            return false;
        }
        UpdateInvestmentHoldingResponse updateInvestmentHoldingResponse = (UpdateInvestmentHoldingResponse) obj;
        return Intrinsics.areEqual(unknownFields(), updateInvestmentHoldingResponse.unknownFields()) && Intrinsics.areEqual(this.response_context, updateInvestmentHoldingResponse.response_context) && Intrinsics.areEqual(this.investment_holding, updateInvestmentHoldingResponse.investment_holding);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ResponseContext responseContext = this.response_context;
        int hashCode2 = (hashCode + (responseContext != null ? responseContext.hashCode() : 0)) * 37;
        SyncInvestmentHolding syncInvestmentHolding = this.investment_holding;
        int hashCode3 = hashCode2 + (syncInvestmentHolding != null ? syncInvestmentHolding.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(24);
        builder.f1372android = this.response_context;
        builder.ios = this.investment_holding;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResponseContext responseContext = this.response_context;
        if (responseContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("response_context=", responseContext, arrayList);
        }
        SyncInvestmentHolding syncInvestmentHolding = this.investment_holding;
        if (syncInvestmentHolding != null) {
            arrayList.add("investment_holding=" + syncInvestmentHolding);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateInvestmentHoldingResponse{", "}", 0, null, null, 56);
    }
}
