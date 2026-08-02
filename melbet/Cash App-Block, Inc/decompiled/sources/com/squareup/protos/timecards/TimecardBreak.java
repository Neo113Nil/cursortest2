package com.squareup.protos.timecards;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.client.ClientInfo;
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
public final class TimecardBreak extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TimecardBreak> CREATOR;
    public final String break_name;
    public final String created_at;
    public final Integer expected_duration_seconds;
    public final Boolean is_paid;
    public final String merchant_token;
    public final Integer minimum_duration_seconds;
    public final Long start_timestamp_ms;
    public final Long start_timestamp_seconds;
    public final Long stop_timestamp_ms;
    public final Long stop_timestamp_seconds;
    public final String timecard_break_definition_token;
    public final String timecard_token;
    public final String token;
    public final String updated_at;
    public final Boolean violates_expected_duration;

    static {
        TimecardBreak$Companion$ADAPTER$1 timecardBreak$Companion$ADAPTER$1 = new TimecardBreak$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TimecardBreak.class), "type.googleapis.com/squareup.timecards.TimecardBreak", Syntax.PROTO_2, null, "squareup/timecards/data.proto");
        ADAPTER = timecardBreak$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(timecardBreak$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimecardBreak(String str, String str2, String str3, Long l, Long l2, String str4, Boolean bool, String str5, Integer num, Long l3, Long l4, Boolean bool2, Integer num2, String str6, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.timecard_token = str2;
        this.merchant_token = str3;
        this.start_timestamp_ms = l;
        this.stop_timestamp_ms = l2;
        this.timecard_break_definition_token = str4;
        this.is_paid = bool;
        this.break_name = str5;
        this.expected_duration_seconds = num;
        this.start_timestamp_seconds = l3;
        this.stop_timestamp_seconds = l4;
        this.violates_expected_duration = bool2;
        this.minimum_duration_seconds = num2;
        this.created_at = str6;
        this.updated_at = str7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TimecardBreak)) {
            return false;
        }
        TimecardBreak timecardBreak = (TimecardBreak) obj;
        return Intrinsics.areEqual(unknownFields(), timecardBreak.unknownFields()) && Intrinsics.areEqual(this.token, timecardBreak.token) && Intrinsics.areEqual(this.timecard_token, timecardBreak.timecard_token) && Intrinsics.areEqual(this.merchant_token, timecardBreak.merchant_token) && Intrinsics.areEqual(this.start_timestamp_ms, timecardBreak.start_timestamp_ms) && Intrinsics.areEqual(this.stop_timestamp_ms, timecardBreak.stop_timestamp_ms) && Intrinsics.areEqual(this.timecard_break_definition_token, timecardBreak.timecard_break_definition_token) && Intrinsics.areEqual(this.is_paid, timecardBreak.is_paid) && Intrinsics.areEqual(this.break_name, timecardBreak.break_name) && Intrinsics.areEqual(this.expected_duration_seconds, timecardBreak.expected_duration_seconds) && Intrinsics.areEqual(this.start_timestamp_seconds, timecardBreak.start_timestamp_seconds) && Intrinsics.areEqual(this.stop_timestamp_seconds, timecardBreak.stop_timestamp_seconds) && Intrinsics.areEqual(this.violates_expected_duration, timecardBreak.violates_expected_duration) && Intrinsics.areEqual(this.minimum_duration_seconds, timecardBreak.minimum_duration_seconds) && Intrinsics.areEqual(this.created_at, timecardBreak.created_at) && Intrinsics.areEqual(this.updated_at, timecardBreak.updated_at);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.timecard_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.merchant_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Long l = this.start_timestamp_ms;
        int hashCode5 = (hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.stop_timestamp_ms;
        int hashCode6 = (hashCode5 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        String str4 = this.timecard_break_definition_token;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Boolean bool = this.is_paid;
        int hashCode8 = (hashCode7 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str5 = this.break_name;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 37;
        Integer num = this.expected_duration_seconds;
        int hashCode10 = (hashCode9 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Long l3 = this.start_timestamp_seconds;
        int hashCode11 = (hashCode10 + (l3 != null ? Long.hashCode(l3.longValue()) : 0)) * 37;
        Long l4 = this.stop_timestamp_seconds;
        int hashCode12 = (hashCode11 + (l4 != null ? Long.hashCode(l4.longValue()) : 0)) * 37;
        Boolean bool2 = this.violates_expected_duration;
        int hashCode13 = (hashCode12 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Integer num2 = this.minimum_duration_seconds;
        int hashCode14 = (hashCode13 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        String str6 = this.created_at;
        int hashCode15 = (hashCode14 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.updated_at;
        int hashCode16 = hashCode15 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = hashCode16;
        return hashCode16;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ClientInfo.Builder builder = new ClientInfo.Builder(10);
        builder.user_agent = this.token;
        builder.device_uuid = this.timecard_token;
        builder.date_format = this.merchant_token;
        builder.device_installation_id = this.start_timestamp_ms;
        builder.drm_id = this.stop_timestamp_ms;
        builder.time_format = this.timecard_break_definition_token;
        builder.device_vendor_id = this.is_paid;
        builder.ip_address = this.break_name;
        builder.client_scenario = this.expected_duration_seconds;
        builder.device_id = this.start_timestamp_seconds;
        builder.threatmetrix_smart_id = this.stop_timestamp_seconds;
        builder.timestamp = this.violates_expected_duration;
        builder.navigation_paradigm = this.minimum_duration_seconds;
        builder.device_name = this.created_at;
        builder.accept_language = this.updated_at;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.timecard_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "timecard_token=", arrayList);
        }
        String str3 = this.merchant_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "merchant_token=", arrayList);
        }
        Long l = this.start_timestamp_ms;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("start_timestamp_ms=", l, arrayList);
        }
        Long l2 = this.stop_timestamp_ms;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("stop_timestamp_ms=", l2, arrayList);
        }
        String str4 = this.timecard_break_definition_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "timecard_break_definition_token=", arrayList);
        }
        Boolean bool = this.is_paid;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_paid=", bool, arrayList);
        }
        String str5 = this.break_name;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "break_name=", arrayList);
        }
        Integer num = this.expected_duration_seconds;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("expected_duration_seconds=", num, arrayList);
        }
        Long l3 = this.start_timestamp_seconds;
        if (l3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("start_timestamp_seconds=", l3, arrayList);
        }
        Long l4 = this.stop_timestamp_seconds;
        if (l4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("stop_timestamp_seconds=", l4, arrayList);
        }
        Boolean bool2 = this.violates_expected_duration;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("violates_expected_duration=", bool2, arrayList);
        }
        Integer num2 = this.minimum_duration_seconds;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("minimum_duration_seconds=", num2, arrayList);
        }
        String str6 = this.created_at;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "created_at=", arrayList);
        }
        String str7 = this.updated_at;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "updated_at=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TimecardBreak{", "}", 0, null, null, 56);
    }
}
