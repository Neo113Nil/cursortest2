package com.squareup.protos.timecards.scheduling;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.SyncContactsRequest;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/timecards/scheduling/GetShiftSchedulesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/app/SyncContactsRequest$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetShiftSchedulesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetShiftSchedulesResponse> CREATOR;
    public final String cursor;
    public final List shift_schedules;
    public final List team_members;

    static {
        GetShiftSchedulesResponse$Companion$ADAPTER$1 getShiftSchedulesResponse$Companion$ADAPTER$1 = new GetShiftSchedulesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetShiftSchedulesResponse.class), "type.googleapis.com/squareup.timecards.scheduling.GetShiftSchedulesResponse", Syntax.PROTO_2, null, "squareup/timecards/scheduling/reporting_service.proto");
        ADAPTER = getShiftSchedulesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getShiftSchedulesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetShiftSchedulesResponse(String str, List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.cursor = str;
        this.shift_schedules = TransactorKt.immutableCopyOf("shift_schedules", list);
        this.team_members = TransactorKt.immutableCopyOf("team_members", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetShiftSchedulesResponse)) {
            return false;
        }
        GetShiftSchedulesResponse getShiftSchedulesResponse = (GetShiftSchedulesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getShiftSchedulesResponse.unknownFields()) && Intrinsics.areEqual(this.shift_schedules, getShiftSchedulesResponse.shift_schedules) && Intrinsics.areEqual(this.team_members, getShiftSchedulesResponse.team_members) && Intrinsics.areEqual(this.cursor, getShiftSchedulesResponse.cursor);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.shift_schedules), 37, this.team_members);
        String str = this.cursor;
        int hashCode = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SyncContactsRequest.Builder builder = new SyncContactsRequest.Builder(10, false);
        builder.add_hashed_aliases = this.shift_schedules;
        builder.remove_hashed_aliases = this.team_members;
        builder.sync_token = this.cursor;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.shift_schedules;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("shift_schedules=", arrayList, list);
        }
        List list2 = this.team_members;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("team_members=", arrayList, list2);
        }
        String str = this.cursor;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "cursor=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetShiftSchedulesResponse{", "}", 0, null, null, 56);
    }
}
