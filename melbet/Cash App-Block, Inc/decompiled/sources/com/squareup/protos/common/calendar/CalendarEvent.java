package com.squareup.protos.common.calendar;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Header;
import com.squareup.protos.common.time.DateTime;
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
public final class CalendarEvent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CalendarEvent> CREATOR;
    public final String id;
    public final Recurrence recurrence_info;
    public final String start_datetime;
    public final String stop_datetime;
    public final String time_zone;

    public final class Recurrence extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Recurrence> CREATOR;
        public final String exdate;
        public final String rrule;

        static {
            CalendarEvent$Recurrence$Companion$ADAPTER$1 calendarEvent$Recurrence$Companion$ADAPTER$1 = new CalendarEvent$Recurrence$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Recurrence.class), "type.googleapis.com/squareup.common.calendar.CalendarEvent.Recurrence", Syntax.PROTO_2, null, "squareup/common/calendar/calendar.proto");
            ADAPTER = calendarEvent$Recurrence$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(calendarEvent$Recurrence$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Recurrence(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.rrule = str;
            this.exdate = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Recurrence)) {
                return false;
            }
            Recurrence recurrence = (Recurrence) obj;
            return Intrinsics.areEqual(unknownFields(), recurrence.unknownFields()) && Intrinsics.areEqual(this.rrule, recurrence.rrule) && Intrinsics.areEqual(this.exdate, recurrence.exdate);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.rrule;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.exdate;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Header.Builder builder = new Header.Builder(22);
            builder.name = this.rrule;
            builder.value = this.exdate;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.rrule;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "rrule=", arrayList);
            }
            String str2 = this.exdate;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "exdate=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Recurrence{", "}", 0, null, null, 56);
        }
    }

    static {
        CalendarEvent$Companion$ADAPTER$1 calendarEvent$Companion$ADAPTER$1 = new CalendarEvent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CalendarEvent.class), "type.googleapis.com/squareup.common.calendar.CalendarEvent", Syntax.PROTO_2, null, "squareup/common/calendar/calendar.proto");
        ADAPTER = calendarEvent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(calendarEvent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarEvent(String str, String str2, String str3, String str4, Recurrence recurrence, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.id = str;
        this.start_datetime = str2;
        this.stop_datetime = str3;
        this.time_zone = str4;
        this.recurrence_info = recurrence;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CalendarEvent)) {
            return false;
        }
        CalendarEvent calendarEvent = (CalendarEvent) obj;
        return Intrinsics.areEqual(unknownFields(), calendarEvent.unknownFields()) && Intrinsics.areEqual(this.id, calendarEvent.id) && Intrinsics.areEqual(this.start_datetime, calendarEvent.start_datetime) && Intrinsics.areEqual(this.stop_datetime, calendarEvent.stop_datetime) && Intrinsics.areEqual(this.time_zone, calendarEvent.time_zone) && Intrinsics.areEqual(this.recurrence_info, calendarEvent.recurrence_info);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.start_datetime;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.stop_datetime;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.time_zone;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Recurrence recurrence = this.recurrence_info;
        int hashCode6 = hashCode5 + (recurrence != null ? recurrence.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DateTime.Builder builder = new DateTime.Builder(25, false);
        builder.posix_tz = this.id;
        builder.instant_usec = this.start_datetime;
        builder.ordinal = this.stop_datetime;
        builder.timezone_offset_min = this.time_zone;
        builder.tz_name = this.recurrence_info;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        String str2 = this.start_datetime;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "start_datetime=", arrayList);
        }
        String str3 = this.stop_datetime;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "stop_datetime=", arrayList);
        }
        String str4 = this.time_zone;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "time_zone=", arrayList);
        }
        Recurrence recurrence = this.recurrence_info;
        if (recurrence != null) {
            arrayList.add("recurrence_info=" + recurrence);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CalendarEvent{", "}", 0, null, null, 56);
    }
}
