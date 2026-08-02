package com.squareup.protos.timecards;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import net.idrnd.face.iad.capture.internal.y0;
import okio.ByteString;
import xyz.block.protos.genie.Binding;

/* loaded from: classes8.dex */
public final class TimecardEvent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TimecardEvent> CREATOR;
    public final String creator_employee_token;
    public final EventType event_type;
    public final Timecard point_in_time_timecard;
    public final String token;
    public final String transaction_token;

    /* loaded from: classes9.dex */
    public enum EventType implements WireEnum {
        CLOCKIN(1),
        CLOCKOUT(2),
        SUPERVISOR_CLOSE(3),
        EDIT(4),
        CREATE(5),
        DELETE(6),
        API_CREATE(7),
        API_DELETE(8),
        API_EDIT(9),
        UPDATE_NOTE(10),
        AUTO_CLOCK_OUT(11),
        LARGE_TIMECARD_SPLIT_EDIT(12),
        LARGE_TIMECARD_SPLIT_CREATE(13),
        EDIT_REQUEST_EDIT(14),
        UPDATE_CASH_TIPS(15);

        public final int value;
        public static final y0 Companion = new y0();
        public static final TimecardEvent$EventType$Companion$ADAPTER$1 ADAPTER = new TimecardEvent$EventType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(EventType.class), Syntax.PROTO_2, null);

        EventType(int i) {
            this.value = i;
        }

        public static final EventType fromValue(int i) {
            Companion.getClass();
            return y0.fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        TimecardEvent$Companion$ADAPTER$1 timecardEvent$Companion$ADAPTER$1 = new TimecardEvent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TimecardEvent.class), "type.googleapis.com/squareup.timecards.TimecardEvent", Syntax.PROTO_2, null, "squareup/timecards/data.proto");
        ADAPTER = timecardEvent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(timecardEvent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimecardEvent(String str, String str2, String str3, EventType eventType, Timecard timecard, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.transaction_token = str2;
        this.creator_employee_token = str3;
        this.event_type = eventType;
        this.point_in_time_timecard = timecard;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TimecardEvent)) {
            return false;
        }
        TimecardEvent timecardEvent = (TimecardEvent) obj;
        return Intrinsics.areEqual(unknownFields(), timecardEvent.unknownFields()) && Intrinsics.areEqual(this.token, timecardEvent.token) && Intrinsics.areEqual(this.transaction_token, timecardEvent.transaction_token) && Intrinsics.areEqual(this.creator_employee_token, timecardEvent.creator_employee_token) && this.event_type == timecardEvent.event_type && Intrinsics.areEqual(this.point_in_time_timecard, timecardEvent.point_in_time_timecard);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.transaction_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.creator_employee_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        EventType eventType = this.event_type;
        int hashCode5 = (hashCode4 + (eventType != null ? eventType.hashCode() : 0)) * 37;
        Timecard timecard = this.point_in_time_timecard;
        int hashCode6 = hashCode5 + (timecard != null ? timecard.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Binding.Builder builder = new Binding.Builder(10);
        builder.key_path = this.token;
        builder.get_transform = this.transaction_token;
        builder.set_transform = this.creator_employee_token;
        builder.validation = this.event_type;
        builder.on_invalid = this.point_in_time_timecard;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.transaction_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "transaction_token=", arrayList);
        }
        String str3 = this.creator_employee_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "creator_employee_token=", arrayList);
        }
        EventType eventType = this.event_type;
        if (eventType != null) {
            arrayList.add("event_type=" + eventType);
        }
        Timecard timecard = this.point_in_time_timecard;
        if (timecard != null) {
            arrayList.add("point_in_time_timecard=" + timecard);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TimecardEvent{", "}", 0, null, null, 56);
    }
}
