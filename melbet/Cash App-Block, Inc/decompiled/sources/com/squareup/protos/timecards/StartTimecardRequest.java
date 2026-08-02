package com.squareup.protos.timecards;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import squareup.cash.savings.GoalFolder;

/* loaded from: classes8.dex */
public final class StartTimecardRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StartTimecardRequest> CREATOR;
    public final String clockin_unit_token;
    public final String employee_token;
    public final String job_token;
    public final String local_time_zone_id;
    public final String merchant_token;
    public final String shift_schedule_published_version_token;
    public final String shift_schedule_token;
    public final Boolean use_job_token;

    static {
        StartTimecardRequest$Companion$ADAPTER$1 startTimecardRequest$Companion$ADAPTER$1 = new StartTimecardRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StartTimecardRequest.class), "type.googleapis.com/squareup.timecards.StartTimecardRequest", Syntax.PROTO_2, null, "squareup/timecards/timecards_service.proto");
        ADAPTER = startTimecardRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(startTimecardRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartTimecardRequest(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.merchant_token = str;
        this.employee_token = str2;
        this.clockin_unit_token = str3;
        this.use_job_token = bool;
        this.job_token = str4;
        this.local_time_zone_id = str5;
        this.shift_schedule_token = str6;
        this.shift_schedule_published_version_token = str7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartTimecardRequest)) {
            return false;
        }
        StartTimecardRequest startTimecardRequest = (StartTimecardRequest) obj;
        return Intrinsics.areEqual(unknownFields(), startTimecardRequest.unknownFields()) && Intrinsics.areEqual(this.merchant_token, startTimecardRequest.merchant_token) && Intrinsics.areEqual(this.employee_token, startTimecardRequest.employee_token) && Intrinsics.areEqual(this.clockin_unit_token, startTimecardRequest.clockin_unit_token) && Intrinsics.areEqual(this.use_job_token, startTimecardRequest.use_job_token) && Intrinsics.areEqual(this.job_token, startTimecardRequest.job_token) && Intrinsics.areEqual(this.local_time_zone_id, startTimecardRequest.local_time_zone_id) && Intrinsics.areEqual(this.shift_schedule_token, startTimecardRequest.shift_schedule_token) && Intrinsics.areEqual(this.shift_schedule_published_version_token, startTimecardRequest.shift_schedule_published_version_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.merchant_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.employee_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.clockin_unit_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool = this.use_job_token;
        int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str4 = this.job_token;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.local_time_zone_id;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.shift_schedule_token;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.shift_schedule_published_version_token;
        int hashCode9 = hashCode8 + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GoalFolder.Builder builder = new GoalFolder.Builder(10);
        builder.token = this.merchant_token;
        builder.icon_unicode = this.employee_token;
        builder.completion_token = this.clockin_unit_token;
        builder.met_goal = this.use_job_token;
        builder.label = this.job_token;
        builder.goal_flow_parameters = this.local_time_zone_id;
        builder.goal_amount = this.shift_schedule_token;
        builder.goal_progress_percentage = this.shift_schedule_published_version_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.merchant_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "merchant_token=", arrayList);
        }
        String str2 = this.employee_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "employee_token=", arrayList);
        }
        String str3 = this.clockin_unit_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "clockin_unit_token=", arrayList);
        }
        Boolean bool = this.use_job_token;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("use_job_token=", bool, arrayList);
        }
        String str4 = this.job_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "job_token=", arrayList);
        }
        String str5 = this.local_time_zone_id;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "local_time_zone_id=", arrayList);
        }
        String str6 = this.shift_schedule_token;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "shift_schedule_token=", arrayList);
        }
        String str7 = this.shift_schedule_published_version_token;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "shift_schedule_published_version_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StartTimecardRequest{", "}", 0, null, null, 56);
    }
}
