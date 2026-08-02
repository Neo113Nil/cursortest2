package com.squareup.protos.cash.disputron.core;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
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
import squareup.cash.earnings.EarningsYearMonth;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/disputron/core/GetClaimResolutionStatisticsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/earnings/EarningsYearMonth$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetClaimResolutionStatisticsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetClaimResolutionStatisticsResponse> CREATOR;
    public final Integer active_claims;
    public final Integer total_claims;

    static {
        GetClaimResolutionStatisticsResponse$Companion$ADAPTER$1 getClaimResolutionStatisticsResponse$Companion$ADAPTER$1 = new GetClaimResolutionStatisticsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetClaimResolutionStatisticsResponse.class), "type.googleapis.com/squareup.cash.disputron.core.GetClaimResolutionStatisticsResponse", Syntax.PROTO_3, null, "squareup/cash/disputron/core/ListClaimResolutionStatuses.proto");
        ADAPTER = getClaimResolutionStatisticsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getClaimResolutionStatisticsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetClaimResolutionStatisticsResponse(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.total_claims = num;
        this.active_claims = num2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetClaimResolutionStatisticsResponse)) {
            return false;
        }
        GetClaimResolutionStatisticsResponse getClaimResolutionStatisticsResponse = (GetClaimResolutionStatisticsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getClaimResolutionStatisticsResponse.unknownFields()) && Intrinsics.areEqual(this.total_claims, getClaimResolutionStatisticsResponse.total_claims) && Intrinsics.areEqual(this.active_claims, getClaimResolutionStatisticsResponse.active_claims);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.total_claims;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.active_claims;
        int hashCode3 = hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EarningsYearMonth.Builder builder = new EarningsYearMonth.Builder(2);
        builder.year = this.total_claims;
        builder.month = this.active_claims;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.total_claims;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("total_claims=", num, arrayList);
        }
        Integer num2 = this.active_claims;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("active_claims=", num2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetClaimResolutionStatisticsResponse{", "}", 0, null, null, 56);
    }
}
