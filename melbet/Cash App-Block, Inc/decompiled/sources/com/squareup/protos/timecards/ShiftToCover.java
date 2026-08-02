package com.squareup.protos.timecards;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.timecards.scheduling.ShiftCover;
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
import squareup.cash.bills.BillsApplet;

/* loaded from: classes8.dex */
public final class ShiftToCover extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ShiftToCover> CREATOR;
    public final ShiftCover shift_cover;
    public final ShiftSchedule shift_schedule;
    public final String shift_schedule_version_token;

    static {
        ShiftToCover$Companion$ADAPTER$1 shiftToCover$Companion$ADAPTER$1 = new ShiftToCover$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ShiftToCover.class), "type.googleapis.com/squareup.timecards.ShiftToCover", Syntax.PROTO_2, null, "squareup/timecards/change_proposal.proto");
        ADAPTER = shiftToCover$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(shiftToCover$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShiftToCover(ShiftSchedule shiftSchedule, String str, ShiftCover shiftCover, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.shift_schedule = shiftSchedule;
        this.shift_schedule_version_token = str;
        this.shift_cover = shiftCover;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShiftToCover)) {
            return false;
        }
        ShiftToCover shiftToCover = (ShiftToCover) obj;
        return Intrinsics.areEqual(unknownFields(), shiftToCover.unknownFields()) && Intrinsics.areEqual(this.shift_schedule, shiftToCover.shift_schedule) && Intrinsics.areEqual(this.shift_schedule_version_token, shiftToCover.shift_schedule_version_token) && Intrinsics.areEqual(this.shift_cover, shiftToCover.shift_cover);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ShiftSchedule shiftSchedule = this.shift_schedule;
        int hashCode2 = (hashCode + (shiftSchedule != null ? shiftSchedule.hashCode() : 0)) * 37;
        String str = this.shift_schedule_version_token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        ShiftCover shiftCover = this.shift_cover;
        int hashCode4 = hashCode3 + (shiftCover != null ? shiftCover.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsApplet.Builder builder = new BillsApplet.Builder(10);
        builder.action = this.shift_schedule;
        builder.full_applet = this.shift_schedule_version_token;
        builder.half_applet = this.shift_cover;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ShiftSchedule shiftSchedule = this.shift_schedule;
        if (shiftSchedule != null) {
            arrayList.add("shift_schedule=" + shiftSchedule);
        }
        String str = this.shift_schedule_version_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "shift_schedule_version_token=", arrayList);
        }
        ShiftCover shiftCover = this.shift_cover;
        if (shiftCover != null) {
            arrayList.add("shift_cover=" + shiftCover);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ShiftToCover{", "}", 0, null, null, 56);
    }
}
