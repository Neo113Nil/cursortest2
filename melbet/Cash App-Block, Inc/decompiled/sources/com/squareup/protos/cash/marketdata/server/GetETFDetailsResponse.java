package com.squareup.protos.cash.marketdata.server;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.GiftCard;
import com.squareup.protos.cash.marketdata.model.HoldingsDetails;
import com.squareup.protos.cash.marketdata.model.SectorsDetails;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/marketdata/server/GetETFDetailsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/GiftCard$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetETFDetailsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetETFDetailsResponse> CREATOR;
    public final HoldingsDetails holdings_details;
    public final Long next_refresh_mins;
    public final SectorsDetails sectors_details;
    public final Long updated_at;

    static {
        GetETFDetailsResponse$Companion$ADAPTER$1 getETFDetailsResponse$Companion$ADAPTER$1 = new GetETFDetailsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetETFDetailsResponse.class), "type.googleapis.com/squareup.cash.marketdata.server.GetETFDetailsResponse", Syntax.PROTO_2, null, "squareup/cash/marketdata/server/investment_metrics_service.proto");
        ADAPTER = getETFDetailsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getETFDetailsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetETFDetailsResponse(Long l, HoldingsDetails holdingsDetails, SectorsDetails sectorsDetails, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.next_refresh_mins = l;
        this.holdings_details = holdingsDetails;
        this.sectors_details = sectorsDetails;
        this.updated_at = l2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetETFDetailsResponse)) {
            return false;
        }
        GetETFDetailsResponse getETFDetailsResponse = (GetETFDetailsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getETFDetailsResponse.unknownFields()) && Intrinsics.areEqual(this.next_refresh_mins, getETFDetailsResponse.next_refresh_mins) && Intrinsics.areEqual(this.holdings_details, getETFDetailsResponse.holdings_details) && Intrinsics.areEqual(this.sectors_details, getETFDetailsResponse.sectors_details) && Intrinsics.areEqual(this.updated_at, getETFDetailsResponse.updated_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.next_refresh_mins;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        HoldingsDetails holdingsDetails = this.holdings_details;
        int hashCode3 = (hashCode2 + (holdingsDetails != null ? holdingsDetails.hashCode() : 0)) * 37;
        SectorsDetails sectorsDetails = this.sectors_details;
        int hashCode4 = (hashCode3 + (sectorsDetails != null ? sectorsDetails.hashCode() : 0)) * 37;
        Long l2 = this.updated_at;
        int hashCode5 = hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Builder builder = new GiftCard.Builder(19, false);
        builder.id = this.next_refresh_mins;
        builder.last_4 = this.holdings_details;
        builder.gift_card_id = this.sectors_details;
        builder.gift_card_amount = this.updated_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.next_refresh_mins;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("next_refresh_mins=", l, arrayList);
        }
        HoldingsDetails holdingsDetails = this.holdings_details;
        if (holdingsDetails != null) {
            arrayList.add("holdings_details=" + holdingsDetails);
        }
        SectorsDetails sectorsDetails = this.sectors_details;
        if (sectorsDetails != null) {
            arrayList.add("sectors_details=" + sectorsDetails);
        }
        Long l2 = this.updated_at;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("updated_at=", l2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetETFDetailsResponse{", "}", 0, null, null, 56);
    }
}
