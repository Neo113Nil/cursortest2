package com.squareup.protos.timecards;

import android.os.Parcelable;
import com.squareup.protos.employeejobs.Job;
import com.squareup.protos.timecards.scheduling.Shift;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
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
import squareup.cash.paychecks.Deduction;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/timecards/GetClockinEssentialsResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/paychecks/Deduction$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetClockinEssentialsResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetClockinEssentialsResponse> CREATOR;
    public final AutomaticClockoutDetails automatic_clockout_details;
    public final Shift clocked_in_shift;
    public final Job next_shift_job;
    public final ShiftSchedule next_shift_schedule;

    static {
        GetClockinEssentialsResponse$Companion$ADAPTER$1 getClockinEssentialsResponse$Companion$ADAPTER$1 = new GetClockinEssentialsResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetClockinEssentialsResponse.class), "type.googleapis.com/squareup.timecards.GetClockinEssentialsResponse", Syntax.PROTO_2, null, "squareup/timecards/timecards_service.proto");
        ADAPTER = getClockinEssentialsResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getClockinEssentialsResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetClockinEssentialsResponse(Shift shift, ShiftSchedule shiftSchedule, AutomaticClockoutDetails automaticClockoutDetails, Job job, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.clocked_in_shift = shift;
        this.next_shift_schedule = shiftSchedule;
        this.automatic_clockout_details = automaticClockoutDetails;
        this.next_shift_job = job;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetClockinEssentialsResponse)) {
            return false;
        }
        GetClockinEssentialsResponse getClockinEssentialsResponse = (GetClockinEssentialsResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getClockinEssentialsResponse.unknownFields()) && Intrinsics.areEqual(this.clocked_in_shift, getClockinEssentialsResponse.clocked_in_shift) && Intrinsics.areEqual(this.next_shift_schedule, getClockinEssentialsResponse.next_shift_schedule) && Intrinsics.areEqual(this.automatic_clockout_details, getClockinEssentialsResponse.automatic_clockout_details) && Intrinsics.areEqual(this.next_shift_job, getClockinEssentialsResponse.next_shift_job);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Shift shift = this.clocked_in_shift;
        int hashCode2 = (hashCode + (shift != null ? shift.hashCode() : 0)) * 37;
        ShiftSchedule shiftSchedule = this.next_shift_schedule;
        int hashCode3 = (hashCode2 + (shiftSchedule != null ? shiftSchedule.hashCode() : 0)) * 37;
        AutomaticClockoutDetails automaticClockoutDetails = this.automatic_clockout_details;
        int hashCode4 = (hashCode3 + (automaticClockoutDetails != null ? automaticClockoutDetails.hashCode() : 0)) * 37;
        Job job = this.next_shift_job;
        int hashCode5 = hashCode4 + (job != null ? job.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Deduction.Builder builder = new Deduction.Builder(2);
        builder.amount = this.clocked_in_shift;
        builder.description = this.next_shift_schedule;
        builder.note = this.automatic_clockout_details;
        builder.tint_color = this.next_shift_job;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Shift shift = this.clocked_in_shift;
        if (shift != null) {
            arrayList.add("clocked_in_shift=" + shift);
        }
        ShiftSchedule shiftSchedule = this.next_shift_schedule;
        if (shiftSchedule != null) {
            arrayList.add("next_shift_schedule=" + shiftSchedule);
        }
        AutomaticClockoutDetails automaticClockoutDetails = this.automatic_clockout_details;
        if (automaticClockoutDetails != null) {
            arrayList.add("automatic_clockout_details=" + automaticClockoutDetails);
        }
        Job job = this.next_shift_job;
        if (job != null) {
            arrayList.add("next_shift_job=" + job);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetClockinEssentialsResponse{", "}", 0, null, null, 56);
    }
}
