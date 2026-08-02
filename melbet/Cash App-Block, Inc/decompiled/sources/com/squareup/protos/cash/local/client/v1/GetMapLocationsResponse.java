package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.money.content.MoneyTab;
import com.squareup.protos.document.DocumentEntity;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/GetMapLocationsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/money/content/MoneyTab$Builder;", "Builder", "MapLocation", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetMapLocationsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetMapLocationsResponse> CREATOR;
    public final List map_locations;

    public final class MapLocation extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<MapLocation> CREATOR;
        public final LocalColor background_color;
        public final String brand_name;
        public final String brand_token;
        public final LocalEstimatedCompletionDuration estimated_pickup_wait_time;
        public final LocalColor foreground_color;
        public final LocalLocationSummary location_summary;
        public final LocalMiniCard mini_card;
        public final String profile_client_route;

        static {
            GetMapLocationsResponse$MapLocation$Companion$ADAPTER$1 getMapLocationsResponse$MapLocation$Companion$ADAPTER$1 = new GetMapLocationsResponse$MapLocation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MapLocation.class), "type.googleapis.com/squareup.cash.local.client.v1.GetMapLocationsResponse.MapLocation", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = getMapLocationsResponse$MapLocation$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getMapLocationsResponse$MapLocation$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MapLocation(String str, String str2, LocalLocationSummary localLocationSummary, String str3, LocalMiniCard localMiniCard, LocalColor localColor, LocalColor localColor2, LocalEstimatedCompletionDuration localEstimatedCompletionDuration, ByteString byteString) {
            super(ADAPTER, byteString);
            str.getClass();
            byteString.getClass();
            this.brand_token = str;
            this.brand_name = str2;
            this.location_summary = localLocationSummary;
            this.profile_client_route = str3;
            this.mini_card = localMiniCard;
            this.foreground_color = localColor;
            this.background_color = localColor2;
            this.estimated_pickup_wait_time = localEstimatedCompletionDuration;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MapLocation)) {
                return false;
            }
            MapLocation mapLocation = (MapLocation) obj;
            return Intrinsics.areEqual(unknownFields(), mapLocation.unknownFields()) && Intrinsics.areEqual(this.brand_token, mapLocation.brand_token) && Intrinsics.areEqual(this.brand_name, mapLocation.brand_name) && Intrinsics.areEqual(this.location_summary, mapLocation.location_summary) && Intrinsics.areEqual(this.profile_client_route, mapLocation.profile_client_route) && Intrinsics.areEqual(this.mini_card, mapLocation.mini_card) && Intrinsics.areEqual(this.foreground_color, mapLocation.foreground_color) && Intrinsics.areEqual(this.background_color, mapLocation.background_color) && Intrinsics.areEqual(this.estimated_pickup_wait_time, mapLocation.estimated_pickup_wait_time);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.brand_token);
            String str = this.brand_name;
            int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
            LocalLocationSummary localLocationSummary = this.location_summary;
            int hashCode2 = (hashCode + (localLocationSummary != null ? localLocationSummary.hashCode() : 0)) * 37;
            String str2 = this.profile_client_route;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            LocalMiniCard localMiniCard = this.mini_card;
            int hashCode4 = (hashCode3 + (localMiniCard != null ? localMiniCard.hashCode() : 0)) * 37;
            LocalColor localColor = this.foreground_color;
            int hashCode5 = (hashCode4 + (localColor != null ? localColor.hashCode() : 0)) * 37;
            LocalColor localColor2 = this.background_color;
            int hashCode6 = (hashCode5 + (localColor2 != null ? localColor2.hashCode() : 0)) * 37;
            LocalEstimatedCompletionDuration localEstimatedCompletionDuration = this.estimated_pickup_wait_time;
            int hashCode7 = hashCode6 + (localEstimatedCompletionDuration != null ? localEstimatedCompletionDuration.hashCode() : 0);
            this.hashCode = hashCode7;
            return hashCode7;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            DocumentEntity.Builder builder = new DocumentEntity.Builder(1, false);
            builder.category = this.brand_token;
            builder.token = this.brand_name;
            builder.client_route = this.location_summary;
            builder.title = this.profile_client_route;
            builder.url = this.mini_card;
            builder.owner_token = this.foreground_color;
            builder.version_data = this.background_color;
            builder.localizable_title = this.estimated_pickup_wait_time;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            BalanceFeedKt$$ExternalSyntheticOutline0.m(this.brand_token, "brand_token=", arrayList);
            String str = this.brand_name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "brand_name=", arrayList);
            }
            LocalLocationSummary localLocationSummary = this.location_summary;
            if (localLocationSummary != null) {
                arrayList.add("location_summary=" + localLocationSummary);
            }
            String str2 = this.profile_client_route;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "profile_client_route=", arrayList);
            }
            LocalMiniCard localMiniCard = this.mini_card;
            if (localMiniCard != null) {
                arrayList.add("mini_card=" + localMiniCard);
            }
            LocalColor localColor = this.foreground_color;
            if (localColor != null) {
                SizeMode$EnumUnboxingLocalUtility.m("foreground_color=", localColor, arrayList);
            }
            LocalColor localColor2 = this.background_color;
            if (localColor2 != null) {
                SizeMode$EnumUnboxingLocalUtility.m("background_color=", localColor2, arrayList);
            }
            LocalEstimatedCompletionDuration localEstimatedCompletionDuration = this.estimated_pickup_wait_time;
            if (localEstimatedCompletionDuration != null) {
                arrayList.add("estimated_pickup_wait_time=" + localEstimatedCompletionDuration);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "MapLocation{", "}", 0, null, null, 56);
        }
    }

    static {
        GetMapLocationsResponse$Companion$ADAPTER$1 getMapLocationsResponse$Companion$ADAPTER$1 = new GetMapLocationsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetMapLocationsResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.GetMapLocationsResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = getMapLocationsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getMapLocationsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMapLocationsResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.map_locations = TransactorKt.immutableCopyOf("map_locations", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetMapLocationsResponse)) {
            return false;
        }
        GetMapLocationsResponse getMapLocationsResponse = (GetMapLocationsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getMapLocationsResponse.unknownFields()) && Intrinsics.areEqual(this.map_locations, getMapLocationsResponse.map_locations);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.map_locations.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        MoneyTab.Builder builder = new MoneyTab.Builder(8, false);
        builder.applets = this.map_locations;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.map_locations;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("map_locations=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetMapLocationsResponse{", "}", 0, null, null, 56);
    }
}
