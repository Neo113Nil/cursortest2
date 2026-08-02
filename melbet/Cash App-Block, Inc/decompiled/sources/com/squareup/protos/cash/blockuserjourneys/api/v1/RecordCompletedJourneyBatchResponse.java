package com.squareup.protos.cash.blockuserjourneys.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.idv.DisplayName;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/cash/blockuserjourneys/api/v1/RecordCompletedJourneyBatchResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/idv/DisplayName$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RecordCompletedJourneyBatchResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RecordCompletedJourneyBatchResponse> CREATOR;
    public final String message;

    static {
        RecordCompletedJourneyBatchResponse$Companion$ADAPTER$1 recordCompletedJourneyBatchResponse$Companion$ADAPTER$1 = new RecordCompletedJourneyBatchResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RecordCompletedJourneyBatchResponse.class), "type.googleapis.com/squareup.cash.blockuserjourneys.api.v1.RecordCompletedJourneyBatchResponse", Syntax.PROTO_2, null, "squareup/cash/blockuserjourneys/api/v1/service.proto");
        ADAPTER = recordCompletedJourneyBatchResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(recordCompletedJourneyBatchResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordCompletedJourneyBatchResponse(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.message = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecordCompletedJourneyBatchResponse)) {
            return false;
        }
        RecordCompletedJourneyBatchResponse recordCompletedJourneyBatchResponse = (RecordCompletedJourneyBatchResponse) obj;
        return Intrinsics.areEqual(unknownFields(), recordCompletedJourneyBatchResponse.unknownFields()) && Intrinsics.areEqual(this.message, recordCompletedJourneyBatchResponse.message);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.message;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DisplayName.Builder builder = new DisplayName.Builder(23);
        builder.display_name = this.message;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.message;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "message=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RecordCompletedJourneyBatchResponse{", "}", 0, null, null, 56);
    }
}
