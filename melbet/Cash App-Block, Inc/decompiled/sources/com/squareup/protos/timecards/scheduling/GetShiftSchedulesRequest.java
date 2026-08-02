package com.squareup.protos.timecards.scheduling;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.Transfer;
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

/* loaded from: classes8.dex */
public final class GetShiftSchedulesRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetShiftSchedulesRequest> CREATOR;
    public final String _accept_language;
    public final String cursor;
    public final String datetime_range_time_zone;
    public final List job_ids;
    public final List location_ids;
    public final OpenShiftsFilter open_shifts_filter;
    public final String start_datetime;
    public final String stop_datetime;
    public final List team_member_ids;

    static {
        GetShiftSchedulesRequest$Companion$ADAPTER$1 getShiftSchedulesRequest$Companion$ADAPTER$1 = new GetShiftSchedulesRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetShiftSchedulesRequest.class), "type.googleapis.com/squareup.timecards.scheduling.GetShiftSchedulesRequest", Syntax.PROTO_2, null, "squareup/timecards/scheduling/reporting_service.proto");
        ADAPTER = getShiftSchedulesRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getShiftSchedulesRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetShiftSchedulesRequest(String str, List list, List list2, List list3, String str2, String str3, String str4, OpenShiftsFilter openShiftsFilter, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this._accept_language = str;
        this.start_datetime = str2;
        this.stop_datetime = str3;
        this.cursor = str4;
        this.open_shifts_filter = openShiftsFilter;
        this.datetime_range_time_zone = str5;
        this.location_ids = TransactorKt.immutableCopyOf("location_ids", list);
        this.team_member_ids = TransactorKt.immutableCopyOf("team_member_ids", list2);
        this.job_ids = TransactorKt.immutableCopyOf("job_ids", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetShiftSchedulesRequest)) {
            return false;
        }
        GetShiftSchedulesRequest getShiftSchedulesRequest = (GetShiftSchedulesRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getShiftSchedulesRequest.unknownFields()) && Intrinsics.areEqual(this._accept_language, getShiftSchedulesRequest._accept_language) && Intrinsics.areEqual(this.location_ids, getShiftSchedulesRequest.location_ids) && Intrinsics.areEqual(this.team_member_ids, getShiftSchedulesRequest.team_member_ids) && Intrinsics.areEqual(this.job_ids, getShiftSchedulesRequest.job_ids) && Intrinsics.areEqual(this.start_datetime, getShiftSchedulesRequest.start_datetime) && Intrinsics.areEqual(this.stop_datetime, getShiftSchedulesRequest.stop_datetime) && Intrinsics.areEqual(this.cursor, getShiftSchedulesRequest.cursor) && this.open_shifts_filter == getShiftSchedulesRequest.open_shifts_filter && Intrinsics.areEqual(this.datetime_range_time_zone, getShiftSchedulesRequest.datetime_range_time_zone);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this._accept_language;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.location_ids), 37, this.team_member_ids), 37, this.job_ids);
        String str2 = this.start_datetime;
        int hashCode2 = (m + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.stop_datetime;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.cursor;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 37;
        OpenShiftsFilter openShiftsFilter = this.open_shifts_filter;
        int hashCode5 = (hashCode4 + (openShiftsFilter != null ? openShiftsFilter.hashCode() : 0)) * 37;
        String str5 = this.datetime_range_time_zone;
        int hashCode6 = hashCode5 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Transfer.Builder builder = new Transfer.Builder(17);
        builder.token = this._accept_language;
        builder.source = this.location_ids;
        builder.target = this.team_member_ids;
        builder.state = this.job_ids;
        builder.amount = this.start_datetime;
        builder.push_amount = this.stop_datetime;
        builder.created_at = this.cursor;
        builder.completed_at = this.open_shifts_filter;
        builder.failed_at = this.datetime_range_time_zone;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this._accept_language;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "_accept_language=", arrayList);
        }
        List list = this.location_ids;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("location_ids=", arrayList, list);
        }
        List list2 = this.team_member_ids;
        if (!list2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("team_member_ids=", arrayList, list2);
        }
        List list3 = this.job_ids;
        if (!list3.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("job_ids=", arrayList, list3);
        }
        String str2 = this.start_datetime;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "start_datetime=", arrayList);
        }
        String str3 = this.stop_datetime;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "stop_datetime=", arrayList);
        }
        String str4 = this.cursor;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "cursor=", arrayList);
        }
        OpenShiftsFilter openShiftsFilter = this.open_shifts_filter;
        if (openShiftsFilter != null) {
            arrayList.add("open_shifts_filter=" + openShiftsFilter);
        }
        String str5 = this.datetime_range_time_zone;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "datetime_range_time_zone=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetShiftSchedulesRequest{", "}", 0, null, null, 56);
    }
}
