package com.squareup.protos.timecards;

import android.os.Parcelable;
import com.squareup.protos.rewardly.ui.AppLinks;
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

/* loaded from: classes8.dex */
public final class ShiftsToSwap extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ShiftsToSwap> CREATOR;
    public final ShiftSchedule proposer_shift_schedule;
    public final ShiftSchedule target_shift_schedule;

    static {
        ShiftsToSwap$Companion$ADAPTER$1 shiftsToSwap$Companion$ADAPTER$1 = new ShiftsToSwap$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ShiftsToSwap.class), "type.googleapis.com/squareup.timecards.ShiftsToSwap", Syntax.PROTO_2, null, "squareup/timecards/change_proposal.proto");
        ADAPTER = shiftsToSwap$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(shiftsToSwap$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShiftsToSwap(ShiftSchedule shiftSchedule, ShiftSchedule shiftSchedule2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.proposer_shift_schedule = shiftSchedule;
        this.target_shift_schedule = shiftSchedule2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShiftsToSwap)) {
            return false;
        }
        ShiftsToSwap shiftsToSwap = (ShiftsToSwap) obj;
        return Intrinsics.areEqual(unknownFields(), shiftsToSwap.unknownFields()) && Intrinsics.areEqual(this.proposer_shift_schedule, shiftsToSwap.proposer_shift_schedule) && Intrinsics.areEqual(this.target_shift_schedule, shiftsToSwap.target_shift_schedule);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ShiftSchedule shiftSchedule = this.proposer_shift_schedule;
        int hashCode2 = (hashCode + (shiftSchedule != null ? shiftSchedule.hashCode() : 0)) * 37;
        ShiftSchedule shiftSchedule2 = this.target_shift_schedule;
        int hashCode3 = hashCode2 + (shiftSchedule2 != null ? shiftSchedule2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        AppLinks.Builder builder = new AppLinks.Builder(29);
        builder.f1411android = this.proposer_shift_schedule;
        builder.ios = this.target_shift_schedule;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ShiftSchedule shiftSchedule = this.proposer_shift_schedule;
        if (shiftSchedule != null) {
            arrayList.add("proposer_shift_schedule=" + shiftSchedule);
        }
        ShiftSchedule shiftSchedule2 = this.target_shift_schedule;
        if (shiftSchedule2 != null) {
            arrayList.add("target_shift_schedule=" + shiftSchedule2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ShiftsToSwap{", "}", 0, null, null, 56);
    }
}
