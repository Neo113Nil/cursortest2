package com.squareup.protos.timecards;

import android.os.Parcelable;
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
import squareup.cash.paychecks.Deduction;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/protos/timecards/StartTimecardResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/paychecks/Deduction$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StartTimecardResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StartTimecardResponse> CREATOR;
    public final List employee_job_infos;
    public final Timecard timecard;
    public final TimecardBreak timecard_break;
    public final Boolean valid;

    static {
        StartTimecardResponse$Companion$ADAPTER$1 startTimecardResponse$Companion$ADAPTER$1 = new StartTimecardResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StartTimecardResponse.class), "type.googleapis.com/squareup.timecards.StartTimecardResponse", Syntax.PROTO_2, null, "squareup/timecards/timecards_service.proto");
        ADAPTER = startTimecardResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(startTimecardResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartTimecardResponse(Timecard timecard, TimecardBreak timecardBreak, Boolean bool, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.timecard = timecard;
        this.timecard_break = timecardBreak;
        this.valid = bool;
        this.employee_job_infos = TransactorKt.immutableCopyOf("employee_job_infos", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartTimecardResponse)) {
            return false;
        }
        StartTimecardResponse startTimecardResponse = (StartTimecardResponse) obj;
        return Intrinsics.areEqual(unknownFields(), startTimecardResponse.unknownFields()) && Intrinsics.areEqual(this.timecard, startTimecardResponse.timecard) && Intrinsics.areEqual(this.timecard_break, startTimecardResponse.timecard_break) && Intrinsics.areEqual(this.valid, startTimecardResponse.valid) && Intrinsics.areEqual(this.employee_job_infos, startTimecardResponse.employee_job_infos);
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
        int hashCode4 = this.employee_job_infos.hashCode() + ((hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Deduction.Builder builder = new Deduction.Builder(5);
        builder.amount = this.timecard;
        builder.description = this.timecard_break;
        builder.note = this.valid;
        builder.tint_color = this.employee_job_infos;
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
        List list = this.employee_job_infos;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("employee_job_infos=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StartTimecardResponse{", "}", 0, null, null, 56);
    }
}
