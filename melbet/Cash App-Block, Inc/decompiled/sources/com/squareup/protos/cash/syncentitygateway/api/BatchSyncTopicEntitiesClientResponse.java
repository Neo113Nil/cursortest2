package com.squareup.protos.cash.syncentitygateway.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/syncentitygateway/api/BatchSyncTopicEntitiesClientResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/bankingbenefits/ui/GreenBenefitsV1$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BatchSyncTopicEntitiesClientResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BatchSyncTopicEntitiesClientResponse> CREATOR;
    public final List failed_requests;
    public final List successful_responses;

    static {
        BatchSyncTopicEntitiesClientResponse$Companion$ADAPTER$1 batchSyncTopicEntitiesClientResponse$Companion$ADAPTER$1 = new BatchSyncTopicEntitiesClientResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BatchSyncTopicEntitiesClientResponse.class), "type.googleapis.com/squareup.cash.syncentitygateway.api.v1.BatchSyncTopicEntitiesClientResponse", Syntax.PROTO_2, null, "squareup/cash/syncentitygateway/api/v1/app.proto");
        ADAPTER = batchSyncTopicEntitiesClientResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(batchSyncTopicEntitiesClientResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatchSyncTopicEntitiesClientResponse(List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.successful_responses = TransactorKt.immutableCopyOf("successful_responses", list);
        this.failed_requests = TransactorKt.immutableCopyOf("failed_requests", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BatchSyncTopicEntitiesClientResponse)) {
            return false;
        }
        BatchSyncTopicEntitiesClientResponse batchSyncTopicEntitiesClientResponse = (BatchSyncTopicEntitiesClientResponse) obj;
        return Intrinsics.areEqual(unknownFields(), batchSyncTopicEntitiesClientResponse.unknownFields()) && Intrinsics.areEqual(this.successful_responses, batchSyncTopicEntitiesClientResponse.successful_responses) && Intrinsics.areEqual(this.failed_requests, batchSyncTopicEntitiesClientResponse.failed_requests);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.failed_requests.hashCode() + Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.successful_responses);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GreenBenefitsV1.Builder builder = new GreenBenefitsV1.Builder(14, false);
        builder.card_holder_benefits = this.successful_responses;
        builder.green_status_benefits = this.failed_requests;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.successful_responses;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("successful_responses=", arrayList, list);
        }
        List list2 = this.failed_requests;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("failed_requests=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BatchSyncTopicEntitiesClientResponse{", "}", 0, null, null, 56);
    }
}
