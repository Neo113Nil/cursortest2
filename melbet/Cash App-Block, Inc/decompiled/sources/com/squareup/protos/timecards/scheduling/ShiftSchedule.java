package com.squareup.protos.timecards.scheduling;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.common.calendar.CalendarEvent;
import com.squareup.protos.employeejobs.Job;
import com.squareup.protos.franklin.api.Transfer;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.full.KClasses$$Lambda$1;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ShiftSchedule extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ShiftSchedule> CREATOR;
    public final ColorScheme color_scheme;
    public final String created_at;
    public final Boolean deleted;
    public final String id;
    public final Version latest_version;
    public final String merchant_id;
    public final Version published_version;
    public final String shift_id;
    public final String updated_at;

    public final class Version extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Version> CREATOR;
        public final CalendarEvent calendar_event;
        public final String created_at;
        public final Boolean deleted;
        public final String id;
        public final String job_id;
        public final String location_id;
        public final String notes;
        public final Boolean published;
        public final ShiftCover shift_cover;
        public final String team_member_id;
        public final String updated_at;

        static {
            ShiftSchedule$Version$Companion$ADAPTER$1 shiftSchedule$Version$Companion$ADAPTER$1 = new ShiftSchedule$Version$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Version.class), "type.googleapis.com/squareup.timecards.scheduling.ShiftSchedule.Version", Syntax.PROTO_2, null, "squareup/timecards/scheduling/models.proto");
            ADAPTER = shiftSchedule$Version$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(shiftSchedule$Version$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Version(String str, String str2, String str3, String str4, CalendarEvent calendarEvent, String str5, Boolean bool, Boolean bool2, String str6, String str7, ShiftCover shiftCover, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.id = str;
            this.job_id = str2;
            this.location_id = str3;
            this.team_member_id = str4;
            this.calendar_event = calendarEvent;
            this.notes = str5;
            this.published = bool;
            this.deleted = bool2;
            this.created_at = str6;
            this.updated_at = str7;
            this.shift_cover = shiftCover;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Version)) {
                return false;
            }
            Version version = (Version) obj;
            return Intrinsics.areEqual(unknownFields(), version.unknownFields()) && Intrinsics.areEqual(this.id, version.id) && Intrinsics.areEqual(this.job_id, version.job_id) && Intrinsics.areEqual(this.location_id, version.location_id) && Intrinsics.areEqual(this.team_member_id, version.team_member_id) && Intrinsics.areEqual(this.calendar_event, version.calendar_event) && Intrinsics.areEqual(this.notes, version.notes) && Intrinsics.areEqual(this.published, version.published) && Intrinsics.areEqual(this.deleted, version.deleted) && Intrinsics.areEqual(this.created_at, version.created_at) && Intrinsics.areEqual(this.updated_at, version.updated_at) && Intrinsics.areEqual(this.shift_cover, version.shift_cover);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.job_id;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.location_id;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.team_member_id;
            int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
            CalendarEvent calendarEvent = this.calendar_event;
            int hashCode6 = (hashCode5 + (calendarEvent != null ? calendarEvent.hashCode() : 0)) * 37;
            String str5 = this.notes;
            int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
            Boolean bool = this.published;
            int hashCode8 = (hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
            Boolean bool2 = this.deleted;
            int hashCode9 = (hashCode8 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
            String str6 = this.created_at;
            int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 37;
            String str7 = this.updated_at;
            int hashCode11 = (hashCode10 + (str7 != null ? str7.hashCode() : 0)) * 37;
            ShiftCover shiftCover = this.shift_cover;
            int hashCode12 = hashCode11 + (shiftCover != null ? shiftCover.hashCode() : 0);
            this.hashCode = hashCode12;
            return hashCode12;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Job.Builder builder = new Job.Builder(21);
            builder.token = this.id;
            builder.merchant_token = this.job_id;
            builder.title = this.location_id;
            builder.default_wage = this.team_member_id;
            builder.created_at_timestamp_ms = this.calendar_event;
            builder.updated_at_timestamp_ms = this.notes;
            builder.tip_eligible = this.published;
            builder.deleted_at_timestamp_ms = this.deleted;
            builder.team_member_count = this.created_at;
            builder.version = this.updated_at;
            builder.default_color_scheme = this.shift_cover;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
            }
            String str2 = this.job_id;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "job_id=", arrayList);
            }
            String str3 = this.location_id;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "location_id=", arrayList);
            }
            String str4 = this.team_member_id;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "team_member_id=", arrayList);
            }
            CalendarEvent calendarEvent = this.calendar_event;
            if (calendarEvent != null) {
                arrayList.add("calendar_event=" + calendarEvent);
            }
            if (this.notes != null) {
                arrayList.add("notes=██");
            }
            Boolean bool = this.published;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("published=", bool, arrayList);
            }
            Boolean bool2 = this.deleted;
            if (bool2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("deleted=", bool2, arrayList);
            }
            String str5 = this.created_at;
            if (str5 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "created_at=", arrayList);
            }
            String str6 = this.updated_at;
            if (str6 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "updated_at=", arrayList);
            }
            ShiftCover shiftCover = this.shift_cover;
            if (shiftCover != null) {
                arrayList.add("shift_cover=" + shiftCover);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Version{", "}", 0, null, null, 56);
        }
    }

    static {
        KClasses$$Lambda$1 kClasses$$Lambda$1 = ColorScheme.Companion;
        ShiftSchedule$Companion$ADAPTER$1 shiftSchedule$Companion$ADAPTER$1 = new ShiftSchedule$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ShiftSchedule.class), "type.googleapis.com/squareup.timecards.scheduling.ShiftSchedule", Syntax.PROTO_2, null, "squareup/timecards/scheduling/models.proto");
        ADAPTER = shiftSchedule$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(shiftSchedule$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShiftSchedule(String str, String str2, String str3, ColorScheme colorScheme, Version version, Version version2, Boolean bool, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.id = str;
        this.shift_id = str2;
        this.merchant_id = str3;
        this.color_scheme = colorScheme;
        this.latest_version = version;
        this.published_version = version2;
        this.deleted = bool;
        this.created_at = str4;
        this.updated_at = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShiftSchedule)) {
            return false;
        }
        ShiftSchedule shiftSchedule = (ShiftSchedule) obj;
        return Intrinsics.areEqual(unknownFields(), shiftSchedule.unknownFields()) && Intrinsics.areEqual(this.id, shiftSchedule.id) && Intrinsics.areEqual(this.shift_id, shiftSchedule.shift_id) && Intrinsics.areEqual(this.merchant_id, shiftSchedule.merchant_id) && this.color_scheme == shiftSchedule.color_scheme && Intrinsics.areEqual(this.latest_version, shiftSchedule.latest_version) && Intrinsics.areEqual(this.published_version, shiftSchedule.published_version) && Intrinsics.areEqual(this.deleted, shiftSchedule.deleted) && Intrinsics.areEqual(this.created_at, shiftSchedule.created_at) && Intrinsics.areEqual(this.updated_at, shiftSchedule.updated_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.shift_id;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.merchant_id;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        ColorScheme colorScheme = this.color_scheme;
        int hashCode5 = (hashCode4 + (colorScheme != null ? colorScheme.hashCode() : 0)) * 37;
        Version version = this.latest_version;
        int hashCode6 = (hashCode5 + (version != null ? version.hashCode() : 0)) * 37;
        Version version2 = this.published_version;
        int hashCode7 = (hashCode6 + (version2 != null ? version2.hashCode() : 0)) * 37;
        Boolean bool = this.deleted;
        int hashCode8 = (hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str4 = this.created_at;
        int hashCode9 = (hashCode8 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.updated_at;
        int hashCode10 = hashCode9 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Transfer.Builder builder = new Transfer.Builder(18, false);
        builder.token = this.id;
        builder.source = this.shift_id;
        builder.target = this.merchant_id;
        builder.state = this.color_scheme;
        builder.amount = this.latest_version;
        builder.push_amount = this.published_version;
        builder.created_at = this.deleted;
        builder.completed_at = this.created_at;
        builder.failed_at = this.updated_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
        }
        String str2 = this.shift_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "shift_id=", arrayList);
        }
        String str3 = this.merchant_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "merchant_id=", arrayList);
        }
        ColorScheme colorScheme = this.color_scheme;
        if (colorScheme != null) {
            arrayList.add("color_scheme=" + colorScheme);
        }
        Version version = this.latest_version;
        if (version != null) {
            arrayList.add("latest_version=" + version);
        }
        Version version2 = this.published_version;
        if (version2 != null) {
            arrayList.add("published_version=" + version2);
        }
        Boolean bool = this.deleted;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("deleted=", bool, arrayList);
        }
        String str4 = this.created_at;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "created_at=", arrayList);
        }
        String str5 = this.updated_at;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "updated_at=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ShiftSchedule{", "}", 0, null, null, 56);
    }
}
