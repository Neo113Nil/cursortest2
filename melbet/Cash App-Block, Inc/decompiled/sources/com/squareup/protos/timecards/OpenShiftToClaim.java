package com.squareup.protos.timecards;

import android.os.Parcelable;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.earnings.EarningTool;

/* loaded from: classes8.dex */
public final class OpenShiftToClaim extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<OpenShiftToClaim> CREATOR;
    public final ShiftSchedule shift_schedule;

    static {
        OpenShiftToClaim$Companion$ADAPTER$1 openShiftToClaim$Companion$ADAPTER$1 = new OpenShiftToClaim$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(OpenShiftToClaim.class), "type.googleapis.com/squareup.timecards.OpenShiftToClaim", Syntax.PROTO_2, null, "squareup/timecards/change_proposal.proto");
        ADAPTER = openShiftToClaim$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(openShiftToClaim$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenShiftToClaim(ShiftSchedule shiftSchedule, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.shift_schedule = shiftSchedule;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OpenShiftToClaim)) {
            return false;
        }
        OpenShiftToClaim openShiftToClaim = (OpenShiftToClaim) obj;
        return Intrinsics.areEqual(unknownFields(), openShiftToClaim.unknownFields()) && Intrinsics.areEqual(this.shift_schedule, openShiftToClaim.shift_schedule);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ShiftSchedule shiftSchedule = this.shift_schedule;
        int hashCode2 = hashCode + (shiftSchedule != null ? shiftSchedule.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EarningTool.Builder builder = new EarningTool.Builder(2);
        builder.tool = this.shift_schedule;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ShiftSchedule shiftSchedule = this.shift_schedule;
        if (shiftSchedule != null) {
            arrayList.add("shift_schedule=" + shiftSchedule);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OpenShiftToClaim{", "}", 0, null, null, 56);
    }
}
