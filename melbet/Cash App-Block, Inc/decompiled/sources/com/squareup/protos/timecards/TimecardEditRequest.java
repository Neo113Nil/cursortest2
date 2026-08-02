package com.squareup.protos.timecards;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.piggybank.api.v2.SavingsGoalEmoji;
import com.squareup.protos.common.Money;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.Binding;
import xyz.block.protos.genie.Expression;

/* loaded from: classes8.dex */
public final class TimecardEditRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TimecardEditRequest> CREATOR;
    public final TimecardAndBreaks associated_timecard_and_breaks;
    public final List break_edits;
    public final Money proposed_declared_tip;
    public final String proposed_job_id;
    public final String proposed_notes;
    public final String proposed_start_at;
    public final String proposed_stop_at;
    public final Money resulting_hourly_wage_rate;
    public final String resulting_job_title;
    public final Boolean resulting_tip_eligible;
    public final String timecard_id;
    public final String timecard_time_zone;

    public final class TimecardBreakEditRequest extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TimecardBreakEditRequest> CREATOR;
        public final String break_id;
        public final ProposedBreakDefinition proposed_break_definition;
        public final String proposed_break_definition_id;
        public final String proposed_start_at;
        public final String proposed_stop_at;

        public final class ProposedBreakDefinition extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<ProposedBreakDefinition> CREATOR;
            public final String expected_duration;
            public final String id;
            public final Boolean is_paid;
            public final String name;

            static {
                TimecardEditRequest$TimecardBreakEditRequest$ProposedBreakDefinition$Companion$ADAPTER$1 timecardEditRequest$TimecardBreakEditRequest$ProposedBreakDefinition$Companion$ADAPTER$1 = new TimecardEditRequest$TimecardBreakEditRequest$ProposedBreakDefinition$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProposedBreakDefinition.class), "type.googleapis.com/squareup.timecards.TimecardEditRequest.TimecardBreakEditRequest.ProposedBreakDefinition", Syntax.PROTO_2, null, "squareup/timecards/change_proposal.proto");
                ADAPTER = timecardEditRequest$TimecardBreakEditRequest$ProposedBreakDefinition$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(timecardEditRequest$TimecardBreakEditRequest$ProposedBreakDefinition$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ProposedBreakDefinition(Boolean bool, String str, String str2, String str3, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.id = str;
                this.name = str2;
                this.expected_duration = str3;
                this.is_paid = bool;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ProposedBreakDefinition)) {
                    return false;
                }
                ProposedBreakDefinition proposedBreakDefinition = (ProposedBreakDefinition) obj;
                return Intrinsics.areEqual(unknownFields(), proposedBreakDefinition.unknownFields()) && Intrinsics.areEqual(this.id, proposedBreakDefinition.id) && Intrinsics.areEqual(this.name, proposedBreakDefinition.name) && Intrinsics.areEqual(this.expected_duration, proposedBreakDefinition.expected_duration) && Intrinsics.areEqual(this.is_paid, proposedBreakDefinition.is_paid);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.id;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.name;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                String str3 = this.expected_duration;
                int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
                Boolean bool = this.is_paid;
                int hashCode5 = hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                SavingsGoalEmoji.Builder builder = new SavingsGoalEmoji.Builder(2);
                builder.name = this.id;
                builder.text = this.name;
                builder.accessibility_text = this.expected_duration;
                builder.active = this.is_paid;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.id;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
                }
                String str2 = this.name;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "name=", arrayList);
                }
                String str3 = this.expected_duration;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "expected_duration=", arrayList);
                }
                Boolean bool = this.is_paid;
                if (bool != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("is_paid=", bool, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ProposedBreakDefinition{", "}", 0, null, null, 56);
            }
        }

        static {
            TimecardEditRequest$TimecardBreakEditRequest$Companion$ADAPTER$1 timecardEditRequest$TimecardBreakEditRequest$Companion$ADAPTER$1 = new TimecardEditRequest$TimecardBreakEditRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TimecardBreakEditRequest.class), "type.googleapis.com/squareup.timecards.TimecardEditRequest.TimecardBreakEditRequest", Syntax.PROTO_2, null, "squareup/timecards/change_proposal.proto");
            ADAPTER = timecardEditRequest$TimecardBreakEditRequest$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(timecardEditRequest$TimecardBreakEditRequest$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TimecardBreakEditRequest(String str, String str2, ProposedBreakDefinition proposedBreakDefinition, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.break_id = str;
            this.proposed_break_definition_id = str2;
            this.proposed_break_definition = proposedBreakDefinition;
            this.proposed_start_at = str3;
            this.proposed_stop_at = str4;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TimecardBreakEditRequest)) {
                return false;
            }
            TimecardBreakEditRequest timecardBreakEditRequest = (TimecardBreakEditRequest) obj;
            return Intrinsics.areEqual(unknownFields(), timecardBreakEditRequest.unknownFields()) && Intrinsics.areEqual(this.break_id, timecardBreakEditRequest.break_id) && Intrinsics.areEqual(this.proposed_break_definition_id, timecardBreakEditRequest.proposed_break_definition_id) && Intrinsics.areEqual(this.proposed_break_definition, timecardBreakEditRequest.proposed_break_definition) && Intrinsics.areEqual(this.proposed_start_at, timecardBreakEditRequest.proposed_start_at) && Intrinsics.areEqual(this.proposed_stop_at, timecardBreakEditRequest.proposed_stop_at);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.break_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.proposed_break_definition_id;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            ProposedBreakDefinition proposedBreakDefinition = this.proposed_break_definition;
            int hashCode4 = (hashCode3 + (proposedBreakDefinition != null ? proposedBreakDefinition.hashCode() : 0)) * 37;
            String str3 = this.proposed_start_at;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.proposed_stop_at;
            int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Binding.Builder builder = new Binding.Builder(9);
            builder.key_path = this.break_id;
            builder.get_transform = this.proposed_break_definition_id;
            builder.set_transform = this.proposed_break_definition;
            builder.validation = this.proposed_start_at;
            builder.on_invalid = this.proposed_stop_at;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.break_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "break_id=", arrayList);
            }
            String str2 = this.proposed_break_definition_id;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "proposed_break_definition_id=", arrayList);
            }
            ProposedBreakDefinition proposedBreakDefinition = this.proposed_break_definition;
            if (proposedBreakDefinition != null) {
                arrayList.add("proposed_break_definition=" + proposedBreakDefinition);
            }
            String str3 = this.proposed_start_at;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "proposed_start_at=", arrayList);
            }
            String str4 = this.proposed_stop_at;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "proposed_stop_at=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TimecardBreakEditRequest{", "}", 0, null, null, 56);
        }
    }

    static {
        TimecardEditRequest$Companion$ADAPTER$1 timecardEditRequest$Companion$ADAPTER$1 = new TimecardEditRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TimecardEditRequest.class), "type.googleapis.com/squareup.timecards.TimecardEditRequest", Syntax.PROTO_2, null, "squareup/timecards/change_proposal.proto");
        ADAPTER = timecardEditRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(timecardEditRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimecardEditRequest(String str, String str2, String str3, String str4, String str5, Money money, List list, TimecardAndBreaks timecardAndBreaks, String str6, String str7, Money money2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.timecard_id = str;
        this.proposed_job_id = str2;
        this.proposed_start_at = str3;
        this.proposed_stop_at = str4;
        this.proposed_notes = str5;
        this.proposed_declared_tip = money;
        this.associated_timecard_and_breaks = timecardAndBreaks;
        this.timecard_time_zone = str6;
        this.resulting_job_title = str7;
        this.resulting_hourly_wage_rate = money2;
        this.resulting_tip_eligible = bool;
        this.break_edits = TransactorKt.immutableCopyOf("break_edits", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TimecardEditRequest)) {
            return false;
        }
        TimecardEditRequest timecardEditRequest = (TimecardEditRequest) obj;
        return Intrinsics.areEqual(unknownFields(), timecardEditRequest.unknownFields()) && Intrinsics.areEqual(this.timecard_id, timecardEditRequest.timecard_id) && Intrinsics.areEqual(this.proposed_job_id, timecardEditRequest.proposed_job_id) && Intrinsics.areEqual(this.proposed_start_at, timecardEditRequest.proposed_start_at) && Intrinsics.areEqual(this.proposed_stop_at, timecardEditRequest.proposed_stop_at) && Intrinsics.areEqual(this.proposed_notes, timecardEditRequest.proposed_notes) && Intrinsics.areEqual(this.proposed_declared_tip, timecardEditRequest.proposed_declared_tip) && Intrinsics.areEqual(this.break_edits, timecardEditRequest.break_edits) && Intrinsics.areEqual(this.associated_timecard_and_breaks, timecardEditRequest.associated_timecard_and_breaks) && Intrinsics.areEqual(this.timecard_time_zone, timecardEditRequest.timecard_time_zone) && Intrinsics.areEqual(this.resulting_job_title, timecardEditRequest.resulting_job_title) && Intrinsics.areEqual(this.resulting_hourly_wage_rate, timecardEditRequest.resulting_hourly_wage_rate) && Intrinsics.areEqual(this.resulting_tip_eligible, timecardEditRequest.resulting_tip_eligible);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.timecard_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.proposed_job_id;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.proposed_start_at;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.proposed_stop_at;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.proposed_notes;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Money money = this.proposed_declared_tip;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (money != null ? money.hashCode() : 0)) * 37, 37, this.break_edits);
        TimecardAndBreaks timecardAndBreaks = this.associated_timecard_and_breaks;
        int hashCode7 = (m + (timecardAndBreaks != null ? timecardAndBreaks.hashCode() : 0)) * 37;
        String str6 = this.timecard_time_zone;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.resulting_job_title;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 37;
        Money money2 = this.resulting_hourly_wage_rate;
        int hashCode10 = (hashCode9 + (money2 != null ? money2.hashCode() : 0)) * 37;
        Boolean bool = this.resulting_tip_eligible;
        int hashCode11 = hashCode10 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode11;
        return hashCode11;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Expression.Builder builder = new Expression.Builder(27, false);
        builder.string_literal = this.timecard_id;
        builder.key_path_ref = this.proposed_job_id;
        builder.int_literal = this.proposed_start_at;
        builder.float_literal = this.proposed_stop_at;
        builder.blob_literal = this.proposed_notes;
        builder.unary_op = this.proposed_declared_tip;
        builder.binary_op = this.break_edits;
        builder.conditional_op = this.associated_timecard_and_breaks;
        builder.filter_op = this.timecard_time_zone;
        builder.collection_literal = this.resulting_job_title;
        builder.format_string_op = this.resulting_hourly_wage_rate;
        builder.bool_literal = this.resulting_tip_eligible;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.timecard_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "timecard_id=", arrayList);
        }
        String str2 = this.proposed_job_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "proposed_job_id=", arrayList);
        }
        String str3 = this.proposed_start_at;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "proposed_start_at=", arrayList);
        }
        String str4 = this.proposed_stop_at;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "proposed_stop_at=", arrayList);
        }
        String str5 = this.proposed_notes;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "proposed_notes=", arrayList);
        }
        Money money = this.proposed_declared_tip;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("proposed_declared_tip=", money, arrayList);
        }
        List list = this.break_edits;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("break_edits=", arrayList, list);
        }
        TimecardAndBreaks timecardAndBreaks = this.associated_timecard_and_breaks;
        if (timecardAndBreaks != null) {
            arrayList.add("associated_timecard_and_breaks=" + timecardAndBreaks);
        }
        String str6 = this.timecard_time_zone;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "timecard_time_zone=", arrayList);
        }
        String str7 = this.resulting_job_title;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "resulting_job_title=", arrayList);
        }
        Money money2 = this.resulting_hourly_wage_rate;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("resulting_hourly_wage_rate=", money2, arrayList);
        }
        Boolean bool = this.resulting_tip_eligible;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("resulting_tip_eligible=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TimecardEditRequest{", "}", 0, null, null, 56);
    }
}
