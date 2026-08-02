package com.squareup.protos.timecards.scheduling;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.timecards.Timecard;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import net.idrnd.face.iad.capture.Plane;
import okio.ByteString;
import squareup.cash.bills.BillsConfig;
import xyz.block.protos.genie.Binding;

/* loaded from: classes8.dex */
public final class Shift extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Shift> CREATOR;
    public final String id;
    public final ShiftSchedule shift_schedule;
    public final Timecard timecard;
    public final List timecard_breaks;
    public final Traits traits;

    public final class Traits extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Traits> CREATOR;
        public final Boolean is_unscheduled;
        public final Status status;

        public enum Status implements WireEnum {
            DO_NOT_USE(0),
            SCHEDULED(1),
            IN_PROGRESS(2),
            COMPLETED(3);

            public static final Shift$Traits$Status$Companion$ADAPTER$1 ADAPTER;
            public static final Plane Companion;
            public final int value;

            static {
                Status status = DO_NOT_USE;
                Companion = new Plane(6);
                ADAPTER = new Shift$Traits$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
            }

            Status(int i) {
                this.value = i;
            }

            public static final Status fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return DO_NOT_USE;
                }
                if (i == 1) {
                    return SCHEDULED;
                }
                if (i == 2) {
                    return IN_PROGRESS;
                }
                if (i != 3) {
                    return null;
                }
                return COMPLETED;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            Shift$Traits$Companion$ADAPTER$1 shift$Traits$Companion$ADAPTER$1 = new Shift$Traits$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Traits.class), "type.googleapis.com/squareup.timecards.scheduling.Shift.Traits", Syntax.PROTO_2, null, "squareup/timecards/scheduling/models.proto");
            ADAPTER = shift$Traits$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(shift$Traits$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Traits(Status status, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.status = status;
            this.is_unscheduled = bool;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Traits)) {
                return false;
            }
            Traits traits = (Traits) obj;
            return Intrinsics.areEqual(unknownFields(), traits.unknownFields()) && this.status == traits.status && Intrinsics.areEqual(this.is_unscheduled, traits.is_unscheduled);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Status status = this.status;
            int hashCode2 = (hashCode + (status != null ? status.hashCode() : 0)) * 37;
            Boolean bool = this.is_unscheduled;
            int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BillsConfig.Builder builder = new BillsConfig.Builder(2);
            builder.bills_applet_default_action = this.status;
            builder.half_applet_content = this.is_unscheduled;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Status status = this.status;
            if (status != null) {
                arrayList.add("status=" + status);
            }
            Boolean bool = this.is_unscheduled;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_unscheduled=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Traits{", "}", 0, null, null, 56);
        }
    }

    static {
        Shift$Companion$ADAPTER$1 shift$Companion$ADAPTER$1 = new Shift$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Shift.class), "type.googleapis.com/squareup.timecards.scheduling.Shift", Syntax.PROTO_2, null, "squareup/timecards/scheduling/models.proto");
        ADAPTER = shift$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(shift$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shift(String str, ShiftSchedule shiftSchedule, Timecard timecard, List list, Traits traits, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.id = str;
        this.shift_schedule = shiftSchedule;
        this.timecard = timecard;
        this.traits = traits;
        this.timecard_breaks = TransactorKt.immutableCopyOf("timecard_breaks", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Shift)) {
            return false;
        }
        Shift shift = (Shift) obj;
        return Intrinsics.areEqual(unknownFields(), shift.unknownFields()) && Intrinsics.areEqual(this.id, shift.id) && Intrinsics.areEqual(this.shift_schedule, shift.shift_schedule) && Intrinsics.areEqual(this.timecard, shift.timecard) && Intrinsics.areEqual(this.timecard_breaks, shift.timecard_breaks) && Intrinsics.areEqual(this.traits, shift.traits);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ShiftSchedule shiftSchedule = this.shift_schedule;
        int hashCode3 = (hashCode2 + (shiftSchedule != null ? shiftSchedule.hashCode() : 0)) * 37;
        Timecard timecard = this.timecard;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (timecard != null ? timecard.hashCode() : 0)) * 37, 37, this.timecard_breaks);
        Traits traits = this.traits;
        int hashCode4 = m + (traits != null ? traits.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Binding.Builder builder = new Binding.Builder(11);
        builder.key_path = this.id;
        builder.get_transform = this.shift_schedule;
        builder.set_transform = this.timecard;
        builder.validation = this.timecard_breaks;
        builder.on_invalid = this.traits;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        ShiftSchedule shiftSchedule = this.shift_schedule;
        if (shiftSchedule != null) {
            arrayList.add("shift_schedule=" + shiftSchedule);
        }
        Timecard timecard = this.timecard;
        if (timecard != null) {
            arrayList.add("timecard=" + timecard);
        }
        List list = this.timecard_breaks;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("timecard_breaks=", arrayList, list);
        }
        Traits traits = this.traits;
        if (traits != null) {
            arrayList.add("traits=" + traits);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Shift{", "}", 0, null, null, 56);
    }
}
