package com.squareup.protos.timecards;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.time.DateTime;
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
import squareup.cash.bills.BillsApplet;
import squareup.cash.paychecks.Deduction;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/protos/timecards/StopTimecardResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/paychecks/Deduction$Builder;", "Builder", "WorkdayShiftSummary", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StopTimecardResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StopTimecardResponse> CREATOR;
    public final Timecard timecard;
    public final TimecardBreak timecard_break;
    public final Boolean valid;
    public final WorkdayShiftSummary workday_shift_summary;

    public final class WorkdayShiftSummary extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<WorkdayShiftSummary> CREATOR;
        public final List job_summaries;
        public final Long paid_seconds;
        public final Long total_seconds;

        public final class JobSummary extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<JobSummary> CREATOR;
            public final EmployeeJobInfo job_info;
            public final Long paid_seconds;
            public final DateTime start_zoned_date_time;
            public final DateTime stop_zoned_date_time;

            static {
                StopTimecardResponse$WorkdayShiftSummary$JobSummary$Companion$ADAPTER$1 stopTimecardResponse$WorkdayShiftSummary$JobSummary$Companion$ADAPTER$1 = new StopTimecardResponse$WorkdayShiftSummary$JobSummary$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(JobSummary.class), "type.googleapis.com/squareup.timecards.StopTimecardResponse.WorkdayShiftSummary.JobSummary", Syntax.PROTO_2, null, "squareup/timecards/timecards_service.proto");
                ADAPTER = stopTimecardResponse$WorkdayShiftSummary$JobSummary$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(stopTimecardResponse$WorkdayShiftSummary$JobSummary$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public JobSummary(EmployeeJobInfo employeeJobInfo, DateTime dateTime, DateTime dateTime2, Long l, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.job_info = employeeJobInfo;
                this.start_zoned_date_time = dateTime;
                this.stop_zoned_date_time = dateTime2;
                this.paid_seconds = l;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof JobSummary)) {
                    return false;
                }
                JobSummary jobSummary = (JobSummary) obj;
                return Intrinsics.areEqual(unknownFields(), jobSummary.unknownFields()) && Intrinsics.areEqual(this.job_info, jobSummary.job_info) && Intrinsics.areEqual(this.start_zoned_date_time, jobSummary.start_zoned_date_time) && Intrinsics.areEqual(this.stop_zoned_date_time, jobSummary.stop_zoned_date_time) && Intrinsics.areEqual(this.paid_seconds, jobSummary.paid_seconds);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                EmployeeJobInfo employeeJobInfo = this.job_info;
                int hashCode2 = (hashCode + (employeeJobInfo != null ? employeeJobInfo.hashCode() : 0)) * 37;
                DateTime dateTime = this.start_zoned_date_time;
                int hashCode3 = (hashCode2 + (dateTime != null ? dateTime.hashCode() : 0)) * 37;
                DateTime dateTime2 = this.stop_zoned_date_time;
                int hashCode4 = (hashCode3 + (dateTime2 != null ? dateTime2.hashCode() : 0)) * 37;
                Long l = this.paid_seconds;
                int hashCode5 = hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Deduction.Builder builder = new Deduction.Builder(7);
                builder.amount = this.job_info;
                builder.description = this.start_zoned_date_time;
                builder.note = this.stop_zoned_date_time;
                builder.tint_color = this.paid_seconds;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                EmployeeJobInfo employeeJobInfo = this.job_info;
                if (employeeJobInfo != null) {
                    arrayList.add("job_info=" + employeeJobInfo);
                }
                DateTime dateTime = this.start_zoned_date_time;
                if (dateTime != null) {
                    arrayList.add("start_zoned_date_time=" + dateTime);
                }
                DateTime dateTime2 = this.stop_zoned_date_time;
                if (dateTime2 != null) {
                    arrayList.add("stop_zoned_date_time=" + dateTime2);
                }
                Long l = this.paid_seconds;
                if (l != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("paid_seconds=", l, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "JobSummary{", "}", 0, null, null, 56);
            }
        }

        static {
            StopTimecardResponse$WorkdayShiftSummary$Companion$ADAPTER$1 stopTimecardResponse$WorkdayShiftSummary$Companion$ADAPTER$1 = new StopTimecardResponse$WorkdayShiftSummary$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(WorkdayShiftSummary.class), "type.googleapis.com/squareup.timecards.StopTimecardResponse.WorkdayShiftSummary", Syntax.PROTO_2, null, "squareup/timecards/timecards_service.proto");
            ADAPTER = stopTimecardResponse$WorkdayShiftSummary$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(stopTimecardResponse$WorkdayShiftSummary$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WorkdayShiftSummary(Long l, Long l2, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.paid_seconds = l;
            this.total_seconds = l2;
            this.job_summaries = TransactorKt.immutableCopyOf("job_summaries", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WorkdayShiftSummary)) {
                return false;
            }
            WorkdayShiftSummary workdayShiftSummary = (WorkdayShiftSummary) obj;
            return Intrinsics.areEqual(unknownFields(), workdayShiftSummary.unknownFields()) && Intrinsics.areEqual(this.paid_seconds, workdayShiftSummary.paid_seconds) && Intrinsics.areEqual(this.total_seconds, workdayShiftSummary.total_seconds) && Intrinsics.areEqual(this.job_summaries, workdayShiftSummary.job_summaries);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Long l = this.paid_seconds;
            int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
            Long l2 = this.total_seconds;
            int hashCode3 = this.job_summaries.hashCode() + ((hashCode2 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BillsApplet.Builder builder = new BillsApplet.Builder(12);
            builder.action = this.paid_seconds;
            builder.full_applet = this.total_seconds;
            builder.half_applet = this.job_summaries;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Long l = this.paid_seconds;
            if (l != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("paid_seconds=", l, arrayList);
            }
            Long l2 = this.total_seconds;
            if (l2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("total_seconds=", l2, arrayList);
            }
            List list = this.job_summaries;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("job_summaries=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "WorkdayShiftSummary{", "}", 0, null, null, 56);
        }
    }

    static {
        StopTimecardResponse$Companion$ADAPTER$1 stopTimecardResponse$Companion$ADAPTER$1 = new StopTimecardResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StopTimecardResponse.class), "type.googleapis.com/squareup.timecards.StopTimecardResponse", Syntax.PROTO_2, null, "squareup/timecards/timecards_service.proto");
        ADAPTER = stopTimecardResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(stopTimecardResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopTimecardResponse(Timecard timecard, TimecardBreak timecardBreak, Boolean bool, WorkdayShiftSummary workdayShiftSummary, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.timecard = timecard;
        this.timecard_break = timecardBreak;
        this.valid = bool;
        this.workday_shift_summary = workdayShiftSummary;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StopTimecardResponse)) {
            return false;
        }
        StopTimecardResponse stopTimecardResponse = (StopTimecardResponse) obj;
        return Intrinsics.areEqual(unknownFields(), stopTimecardResponse.unknownFields()) && Intrinsics.areEqual(this.timecard, stopTimecardResponse.timecard) && Intrinsics.areEqual(this.timecard_break, stopTimecardResponse.timecard_break) && Intrinsics.areEqual(this.valid, stopTimecardResponse.valid) && Intrinsics.areEqual(this.workday_shift_summary, stopTimecardResponse.workday_shift_summary);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Timecard timecard = this.timecard;
        int hashCode2 = (hashCode + (timecard != null ? timecard.hashCode() : 0)) * 37;
        TimecardBreak timecardBreak = this.timecard_break;
        int hashCode3 = (hashCode2 + (timecardBreak != null ? timecardBreak.hashCode() : 0)) * 37;
        Boolean bool = this.valid;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        WorkdayShiftSummary workdayShiftSummary = this.workday_shift_summary;
        int hashCode5 = hashCode4 + (workdayShiftSummary != null ? workdayShiftSummary.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Deduction.Builder builder = new Deduction.Builder(6);
        builder.amount = this.timecard;
        builder.description = this.timecard_break;
        builder.note = this.valid;
        builder.tint_color = this.workday_shift_summary;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Timecard timecard = this.timecard;
        if (timecard != null) {
            arrayList.add("timecard=" + timecard);
        }
        TimecardBreak timecardBreak = this.timecard_break;
        if (timecardBreak != null) {
            arrayList.add("timecard_break=" + timecardBreak);
        }
        Boolean bool = this.valid;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("valid=", bool, arrayList);
        }
        WorkdayShiftSummary workdayShiftSummary = this.workday_shift_summary;
        if (workdayShiftSummary != null) {
            arrayList.add("workday_shift_summary=" + workdayShiftSummary);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StopTimecardResponse{", "}", 0, null, null, 56);
    }
}
