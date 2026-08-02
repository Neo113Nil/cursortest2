package com.squareup.protos.timecards;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiDda;
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
import squareup.cash.earnings.EarningTool;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/timecards/CreateOrUpdateTimecardResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/UiDda$Builder;", "Builder", "ConflictError", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CreateOrUpdateTimecardResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CreateOrUpdateTimecardResponse> CREATOR;
    public final CreateOrUpdateTimecardResponse$Error$ConflictError error;
    public final Timecard timecard;
    public final List timecard_breaks;
    public final List timecard_events;

    public final class ConflictError extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ConflictError> CREATOR;
        public final Timecard conflicting_timecard;

        static {
            CreateOrUpdateTimecardResponse$ConflictError$Companion$ADAPTER$1 createOrUpdateTimecardResponse$ConflictError$Companion$ADAPTER$1 = new CreateOrUpdateTimecardResponse$ConflictError$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ConflictError.class), "type.googleapis.com/squareup.timecards.CreateOrUpdateTimecardResponse.ConflictError", Syntax.PROTO_2, null, "squareup/timecards/timecards_service.proto");
            ADAPTER = createOrUpdateTimecardResponse$ConflictError$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(createOrUpdateTimecardResponse$ConflictError$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConflictError(Timecard timecard, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.conflicting_timecard = timecard;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConflictError)) {
                return false;
            }
            ConflictError conflictError = (ConflictError) obj;
            return Intrinsics.areEqual(unknownFields(), conflictError.unknownFields()) && Intrinsics.areEqual(this.conflicting_timecard, conflictError.conflicting_timecard);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Timecard timecard = this.conflicting_timecard;
            int hashCode2 = hashCode + (timecard != null ? timecard.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EarningTool.Builder builder = new EarningTool.Builder(1);
            builder.tool = this.conflicting_timecard;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Timecard timecard = this.conflicting_timecard;
            if (timecard != null) {
                arrayList.add("conflicting_timecard=" + timecard);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ConflictError{", "}", 0, null, null, 56);
        }
    }

    static {
        CreateOrUpdateTimecardResponse$Companion$ADAPTER$1 createOrUpdateTimecardResponse$Companion$ADAPTER$1 = new CreateOrUpdateTimecardResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreateOrUpdateTimecardResponse.class), "type.googleapis.com/squareup.timecards.CreateOrUpdateTimecardResponse", Syntax.PROTO_2, null, "squareup/timecards/timecards_service.proto");
        ADAPTER = createOrUpdateTimecardResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(createOrUpdateTimecardResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateOrUpdateTimecardResponse(Timecard timecard, List list, List list2, CreateOrUpdateTimecardResponse$Error$ConflictError createOrUpdateTimecardResponse$Error$ConflictError, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.timecard = timecard;
        this.error = createOrUpdateTimecardResponse$Error$ConflictError;
        this.timecard_events = TransactorKt.immutableCopyOf("timecard_events", list);
        this.timecard_breaks = TransactorKt.immutableCopyOf("timecard_breaks", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateOrUpdateTimecardResponse)) {
            return false;
        }
        CreateOrUpdateTimecardResponse createOrUpdateTimecardResponse = (CreateOrUpdateTimecardResponse) obj;
        return Intrinsics.areEqual(unknownFields(), createOrUpdateTimecardResponse.unknownFields()) && Intrinsics.areEqual(this.timecard, createOrUpdateTimecardResponse.timecard) && Intrinsics.areEqual(this.timecard_events, createOrUpdateTimecardResponse.timecard_events) && Intrinsics.areEqual(this.timecard_breaks, createOrUpdateTimecardResponse.timecard_breaks) && Intrinsics.areEqual(this.error, createOrUpdateTimecardResponse.error);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Timecard timecard = this.timecard;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (timecard != null ? timecard.hashCode() : 0)) * 37, 37, this.timecard_events), 37, this.timecard_breaks);
        CreateOrUpdateTimecardResponse$Error$ConflictError createOrUpdateTimecardResponse$Error$ConflictError = this.error;
        int hashCode2 = m + (createOrUpdateTimecardResponse$Error$ConflictError != null ? createOrUpdateTimecardResponse$Error$ConflictError.value.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiDda.Builder builder = new UiDda.Builder(29);
        builder.account = this.timecard;
        builder.enabled = this.timecard_events;
        builder.button = this.timecard_breaks;
        builder.dda_form = this.error;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Timecard timecard = this.timecard;
        if (timecard != null) {
            arrayList.add("timecard=" + timecard);
        }
        List list = this.timecard_events;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("timecard_events=", arrayList, list);
        }
        List list2 = this.timecard_breaks;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("timecard_breaks=", arrayList, list2);
        }
        CreateOrUpdateTimecardResponse$Error$ConflictError createOrUpdateTimecardResponse$Error$ConflictError = this.error;
        if (createOrUpdateTimecardResponse$Error$ConflictError != null) {
            arrayList.add("error=" + createOrUpdateTimecardResponse$Error$ConflictError);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateOrUpdateTimecardResponse{", "}", 0, null, null, 56);
    }
}
