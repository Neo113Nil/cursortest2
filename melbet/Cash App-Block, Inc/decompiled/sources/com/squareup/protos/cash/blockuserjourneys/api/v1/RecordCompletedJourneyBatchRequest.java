package com.squareup.protos.cash.blockuserjourneys.api.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.appthemes.Gradient;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes.dex */
public final class RecordCompletedJourneyBatchRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RecordCompletedJourneyBatchRequest> CREATOR;
    public final List requests;

    static {
        RecordCompletedJourneyBatchRequest$Companion$ADAPTER$1 recordCompletedJourneyBatchRequest$Companion$ADAPTER$1 = new RecordCompletedJourneyBatchRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RecordCompletedJourneyBatchRequest.class), "type.googleapis.com/squareup.cash.blockuserjourneys.api.v1.RecordCompletedJourneyBatchRequest", Syntax.PROTO_2, null, "squareup/cash/blockuserjourneys/api/v1/service.proto");
        ADAPTER = recordCompletedJourneyBatchRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(recordCompletedJourneyBatchRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordCompletedJourneyBatchRequest(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.requests = TransactorKt.immutableCopyOf("requests", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RecordCompletedJourneyBatchRequest)) {
            return false;
        }
        RecordCompletedJourneyBatchRequest recordCompletedJourneyBatchRequest = (RecordCompletedJourneyBatchRequest) obj;
        return Intrinsics.areEqual(unknownFields(), recordCompletedJourneyBatchRequest.unknownFields()) && Intrinsics.areEqual(this.requests, recordCompletedJourneyBatchRequest.requests);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.requests.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Gradient.Builder builder = new Gradient.Builder(27);
        builder.colors = this.requests;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.requests;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("requests=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RecordCompletedJourneyBatchRequest{", "}", 0, null, null, 56);
    }
}
