package com.squareup.protos.cash.referly.api.incentives.client;

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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/referly/api/incentives/client/GetPromotionsHomeDataResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/pools/ListPoolsRequest$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetPromotionsHomeDataResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetPromotionsHomeDataResponse> CREATOR;
    public final PromotionsHomeData promotions_home_data;

    static {
        GetPromotionsHomeDataResponse$Companion$ADAPTER$1 getPromotionsHomeDataResponse$Companion$ADAPTER$1 = new GetPromotionsHomeDataResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetPromotionsHomeDataResponse.class), "type.googleapis.com/squareup.cash.referly.api.incentives.client.GetPromotionsHomeDataResponse", Syntax.PROTO_2, null, "squareup/cash/referly/api/incentives/client/GetPromotionsHomeDataAPI.proto");
        ADAPTER = getPromotionsHomeDataResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getPromotionsHomeDataResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPromotionsHomeDataResponse(PromotionsHomeData promotionsHomeData, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.promotions_home_data = promotionsHomeData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPromotionsHomeDataResponse)) {
            return false;
        }
        GetPromotionsHomeDataResponse getPromotionsHomeDataResponse = (GetPromotionsHomeDataResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getPromotionsHomeDataResponse.unknownFields()) && Intrinsics.areEqual(this.promotions_home_data, getPromotionsHomeDataResponse.promotions_home_data);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PromotionsHomeData promotionsHomeData = this.promotions_home_data;
        int hashCode2 = hashCode + (promotionsHomeData != null ? promotionsHomeData.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ListPoolsRequest.Builder builder = new ListPoolsRequest.Builder(13);
        builder.pool_lifecycle_filter = this.promotions_home_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PromotionsHomeData promotionsHomeData = this.promotions_home_data;
        if (promotionsHomeData != null) {
            arrayList.add("promotions_home_data=" + promotionsHomeData);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPromotionsHomeDataResponse{", "}", 0, null, null, 56);
    }
}
