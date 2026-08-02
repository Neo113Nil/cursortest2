package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.out.sync_entity.CashOutFeeData;
import com.squareup.protos.cash.local.client.v1.LocalOpenHours;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/BatchGetLocationStatusResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/out/sync_entity/CashOutFeeData$Builder;", "Builder", "GetLocationStatusResponse", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BatchGetLocationStatusResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BatchGetLocationStatusResponse> CREATOR;
    public final Long expires_at;
    public final List responses;

    public final class GetLocationStatusResponse extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<GetLocationStatusResponse> CREATOR;
        public final String brand_token;
        public final LocalOpenHours.HoursForDay.Range current_or_next_range;
        public final LocalEstimatedCompletionDuration estimated_pickup_wait_time;
        public final String location_token;
        public final LocalOpenHours open_hours;
        public final LocalOpenStatus open_status;
        public final String time_zone;

        public final class Builder extends Message.Builder {
            public String brand_token;
            public LocalOpenHours.HoursForDay.Range current_or_next_range;
            public LocalEstimatedCompletionDuration estimated_pickup_wait_time;
            public String location_token;
            public LocalOpenHours open_hours;
            public LocalOpenStatus open_status;
            public String time_zone;

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                return new GetLocationStatusResponse(this.brand_token, this.location_token, this.time_zone, this.open_status, this.current_or_next_range, this.estimated_pickup_wait_time, this.open_hours, buildUnknownFields());
            }
        }

        static {
            BatchGetLocationStatusResponse$GetLocationStatusResponse$Companion$ADAPTER$1 batchGetLocationStatusResponse$GetLocationStatusResponse$Companion$ADAPTER$1 = new BatchGetLocationStatusResponse$GetLocationStatusResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetLocationStatusResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.BatchGetLocationStatusResponse.GetLocationStatusResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = batchGetLocationStatusResponse$GetLocationStatusResponse$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(batchGetLocationStatusResponse$GetLocationStatusResponse$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetLocationStatusResponse(String str, String str2, String str3, LocalOpenStatus localOpenStatus, LocalOpenHours.HoursForDay.Range range, LocalEstimatedCompletionDuration localEstimatedCompletionDuration, LocalOpenHours localOpenHours, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.brand_token = str;
            this.location_token = str2;
            this.time_zone = str3;
            this.open_status = localOpenStatus;
            this.current_or_next_range = range;
            this.estimated_pickup_wait_time = localEstimatedCompletionDuration;
            this.open_hours = localOpenHours;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetLocationStatusResponse)) {
                return false;
            }
            GetLocationStatusResponse getLocationStatusResponse = (GetLocationStatusResponse) obj;
            return Intrinsics.areEqual(unknownFields(), getLocationStatusResponse.unknownFields()) && Intrinsics.areEqual(this.brand_token, getLocationStatusResponse.brand_token) && Intrinsics.areEqual(this.location_token, getLocationStatusResponse.location_token) && Intrinsics.areEqual(this.time_zone, getLocationStatusResponse.time_zone) && this.open_status == getLocationStatusResponse.open_status && Intrinsics.areEqual(this.current_or_next_range, getLocationStatusResponse.current_or_next_range) && Intrinsics.areEqual(this.estimated_pickup_wait_time, getLocationStatusResponse.estimated_pickup_wait_time) && Intrinsics.areEqual(this.open_hours, getLocationStatusResponse.open_hours);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.brand_token;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.location_token;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.time_zone;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            LocalOpenStatus localOpenStatus = this.open_status;
            int hashCode5 = (hashCode4 + (localOpenStatus != null ? localOpenStatus.hashCode() : 0)) * 37;
            LocalOpenHours.HoursForDay.Range range = this.current_or_next_range;
            int hashCode6 = (hashCode5 + (range != null ? range.hashCode() : 0)) * 37;
            LocalEstimatedCompletionDuration localEstimatedCompletionDuration = this.estimated_pickup_wait_time;
            int hashCode7 = (hashCode6 + (localEstimatedCompletionDuration != null ? localEstimatedCompletionDuration.hashCode() : 0)) * 37;
            LocalOpenHours localOpenHours = this.open_hours;
            int hashCode8 = hashCode7 + (localOpenHours != null ? localOpenHours.hashCode() : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.brand_token = this.brand_token;
            builder.location_token = this.location_token;
            builder.time_zone = this.time_zone;
            builder.open_status = this.open_status;
            builder.current_or_next_range = this.current_or_next_range;
            builder.estimated_pickup_wait_time = this.estimated_pickup_wait_time;
            builder.open_hours = this.open_hours;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.brand_token;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "brand_token=", arrayList);
            }
            String str2 = this.location_token;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "location_token=", arrayList);
            }
            String str3 = this.time_zone;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "time_zone=", arrayList);
            }
            LocalOpenStatus localOpenStatus = this.open_status;
            if (localOpenStatus != null) {
                arrayList.add("open_status=" + localOpenStatus);
            }
            LocalOpenHours.HoursForDay.Range range = this.current_or_next_range;
            if (range != null) {
                arrayList.add("current_or_next_range=" + range);
            }
            LocalEstimatedCompletionDuration localEstimatedCompletionDuration = this.estimated_pickup_wait_time;
            if (localEstimatedCompletionDuration != null) {
                arrayList.add("estimated_pickup_wait_time=" + localEstimatedCompletionDuration);
            }
            LocalOpenHours localOpenHours = this.open_hours;
            if (localOpenHours != null) {
                arrayList.add("open_hours=" + localOpenHours);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "GetLocationStatusResponse{", "}", 0, null, null, 56);
        }
    }

    static {
        BatchGetLocationStatusResponse$Companion$ADAPTER$1 batchGetLocationStatusResponse$Companion$ADAPTER$1 = new BatchGetLocationStatusResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BatchGetLocationStatusResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.BatchGetLocationStatusResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = batchGetLocationStatusResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(batchGetLocationStatusResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatchGetLocationStatusResponse(Long l, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.expires_at = l;
        this.responses = TransactorKt.immutableCopyOf("responses", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BatchGetLocationStatusResponse)) {
            return false;
        }
        BatchGetLocationStatusResponse batchGetLocationStatusResponse = (BatchGetLocationStatusResponse) obj;
        return Intrinsics.areEqual(unknownFields(), batchGetLocationStatusResponse.unknownFields()) && Intrinsics.areEqual(this.responses, batchGetLocationStatusResponse.responses) && Intrinsics.areEqual(this.expires_at, batchGetLocationStatusResponse.expires_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.responses);
        Long l = this.expires_at;
        int hashCode = m + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        CashOutFeeData.Builder builder = new CashOutFeeData.Builder(1);
        builder.min_fee_steps = this.responses;
        builder.version = this.expires_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.responses;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("responses=", arrayList, list);
        }
        Long l = this.expires_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expires_at=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BatchGetLocationStatusResponse{", "}", 0, null, null, 56);
    }
}
