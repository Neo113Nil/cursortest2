package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.rum.internal.utils.RumTagsUtilsKt;
import com.squareup.protos.cash.local.client.v1.LocalBuyer;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/local/client/v1/GetFulfillmentSchedulingQuoteResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/local/client/v1/LocalBuyer$Builder;", "Builder", "com/datadog/android/rum/internal/utils/RumTagsUtilsKt", "FulfillmentSchedulingQuote", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetFulfillmentSchedulingQuoteResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetFulfillmentSchedulingQuoteResponse> CREATOR;
    public final RumTagsUtilsKt response;

    public final class FulfillmentSchedulingQuote extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<FulfillmentSchedulingQuote> CREATOR;
        public final LocalFulfillment.EstimatedCompletionDuration estimated_completion_duration;
        public final LocalFulfillment.EstimatedCompletionTime estimated_completion_time;
        public final List scheduling_days;

        public final class Builder extends Message.Builder {
            public LocalFulfillment.EstimatedCompletionDuration estimated_completion_duration;
            public LocalFulfillment.EstimatedCompletionTime estimated_completion_time;
            public List scheduling_days;

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                return new FulfillmentSchedulingQuote(this.estimated_completion_time, this.estimated_completion_duration, this.scheduling_days, buildUnknownFields());
            }
        }

        static {
            GetFulfillmentSchedulingQuoteResponse$FulfillmentSchedulingQuote$Companion$ADAPTER$1 getFulfillmentSchedulingQuoteResponse$FulfillmentSchedulingQuote$Companion$ADAPTER$1 = new GetFulfillmentSchedulingQuoteResponse$FulfillmentSchedulingQuote$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FulfillmentSchedulingQuote.class), "type.googleapis.com/squareup.cash.local.client.v1.GetFulfillmentSchedulingQuoteResponse.FulfillmentSchedulingQuote", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
            ADAPTER = getFulfillmentSchedulingQuoteResponse$FulfillmentSchedulingQuote$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getFulfillmentSchedulingQuoteResponse$FulfillmentSchedulingQuote$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FulfillmentSchedulingQuote(LocalFulfillment.EstimatedCompletionTime estimatedCompletionTime, LocalFulfillment.EstimatedCompletionDuration estimatedCompletionDuration, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.estimated_completion_time = estimatedCompletionTime;
            this.estimated_completion_duration = estimatedCompletionDuration;
            this.scheduling_days = TransactorKt.immutableCopyOf("scheduling_days", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FulfillmentSchedulingQuote)) {
                return false;
            }
            FulfillmentSchedulingQuote fulfillmentSchedulingQuote = (FulfillmentSchedulingQuote) obj;
            return Intrinsics.areEqual(unknownFields(), fulfillmentSchedulingQuote.unknownFields()) && Intrinsics.areEqual(this.estimated_completion_time, fulfillmentSchedulingQuote.estimated_completion_time) && Intrinsics.areEqual(this.estimated_completion_duration, fulfillmentSchedulingQuote.estimated_completion_duration) && Intrinsics.areEqual(this.scheduling_days, fulfillmentSchedulingQuote.scheduling_days);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            LocalFulfillment.EstimatedCompletionTime estimatedCompletionTime = this.estimated_completion_time;
            int hashCode2 = (hashCode + (estimatedCompletionTime != null ? estimatedCompletionTime.hashCode() : 0)) * 37;
            LocalFulfillment.EstimatedCompletionDuration estimatedCompletionDuration = this.estimated_completion_duration;
            int hashCode3 = this.scheduling_days.hashCode() + ((hashCode2 + (estimatedCompletionDuration != null ? estimatedCompletionDuration.hashCode() : 0)) * 37);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.estimated_completion_time = this.estimated_completion_time;
            builder.estimated_completion_duration = this.estimated_completion_duration;
            builder.scheduling_days = this.scheduling_days;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            LocalFulfillment.EstimatedCompletionTime estimatedCompletionTime = this.estimated_completion_time;
            if (estimatedCompletionTime != null) {
                arrayList.add("estimated_completion_time=" + estimatedCompletionTime);
            }
            LocalFulfillment.EstimatedCompletionDuration estimatedCompletionDuration = this.estimated_completion_duration;
            if (estimatedCompletionDuration != null) {
                arrayList.add("estimated_completion_duration=" + estimatedCompletionDuration);
            }
            List list = this.scheduling_days;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("scheduling_days=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "FulfillmentSchedulingQuote{", "}", 0, null, null, 56);
        }
    }

    static {
        GetFulfillmentSchedulingQuoteResponse$Companion$ADAPTER$1 getFulfillmentSchedulingQuoteResponse$Companion$ADAPTER$1 = new GetFulfillmentSchedulingQuoteResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetFulfillmentSchedulingQuoteResponse.class), "type.googleapis.com/squareup.cash.local.client.v1.GetFulfillmentSchedulingQuoteResponse", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/cash_app_local_client_service.proto");
        ADAPTER = getFulfillmentSchedulingQuoteResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getFulfillmentSchedulingQuoteResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFulfillmentSchedulingQuoteResponse(RumTagsUtilsKt rumTagsUtilsKt, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.response = rumTagsUtilsKt;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetFulfillmentSchedulingQuoteResponse)) {
            return false;
        }
        GetFulfillmentSchedulingQuoteResponse getFulfillmentSchedulingQuoteResponse = (GetFulfillmentSchedulingQuoteResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getFulfillmentSchedulingQuoteResponse.unknownFields()) && Intrinsics.areEqual(this.response, getFulfillmentSchedulingQuoteResponse.response);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RumTagsUtilsKt rumTagsUtilsKt = this.response;
        int hashCode2 = hashCode + (rumTagsUtilsKt != null ? rumTagsUtilsKt.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        LocalBuyer.Builder builder = new LocalBuyer.Builder(3);
        builder.local_buyer = this.response;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RumTagsUtilsKt rumTagsUtilsKt = this.response;
        if (rumTagsUtilsKt != null) {
            arrayList.add("response=" + rumTagsUtilsKt);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetFulfillmentSchedulingQuoteResponse{", "}", 0, null, null, 56);
    }
}
