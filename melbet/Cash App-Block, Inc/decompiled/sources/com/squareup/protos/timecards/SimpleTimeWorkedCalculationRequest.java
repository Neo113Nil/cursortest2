package com.squareup.protos.timecards;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientrouting.data.FeatureContextKt;
import com.squareup.protos.common.time.DateTimeInterval;
import com.squareup.protos.timecards.Timecard;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import io.noties.markwon.LinkResolverDef;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SimpleTimeWorkedCalculationRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SimpleTimeWorkedCalculationRequest> CREATOR;
    public final Boolean always_use_fallback_time_zone;
    public final Boolean calculate_salary;
    public final String cursor;
    public final DateRange date_range;
    public final DateTimeInterval date_time_interval;
    public final Boolean exclude_future_shifts;
    public final Boolean exclude_shift_data;
    public final String fallback_time_zone_id;
    public final Boolean include_open_timecards;
    public final Boolean include_tips;
    public final String next_cursor;
    public final MerchantEmployeeRequestFilter request_filter;
    public final Boolean shift_local_date_range_to_start_of_workday;
    public final ShiftOptions shift_options;
    public final FeatureContextKt time_range;
    public final Boolean trim_time_worked_outside_report_range;
    public final Boolean use_new_cursor;

    static {
        LinkResolverDef linkResolverDef = ShiftOptions.Companion;
        SimpleTimeWorkedCalculationRequest$Companion$ADAPTER$1 simpleTimeWorkedCalculationRequest$Companion$ADAPTER$1 = new SimpleTimeWorkedCalculationRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SimpleTimeWorkedCalculationRequest.class), "type.googleapis.com/squareup.timecards.SimpleTimeWorkedCalculationRequest", Syntax.PROTO_2, null, "squareup/timecards/service.proto");
        ADAPTER = simpleTimeWorkedCalculationRequest$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(simpleTimeWorkedCalculationRequest$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleTimeWorkedCalculationRequest(DateRange dateRange, DateTimeInterval dateTimeInterval, MerchantEmployeeRequestFilter merchantEmployeeRequestFilter, Boolean bool, String str, String str2, Boolean bool2, String str3, Boolean bool3, FeatureContextKt featureContextKt, Boolean bool4, Boolean bool5, ShiftOptions shiftOptions, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.date_range = dateRange;
        this.date_time_interval = dateTimeInterval;
        this.request_filter = merchantEmployeeRequestFilter;
        this.use_new_cursor = bool;
        this.next_cursor = str;
        this.cursor = str2;
        this.include_open_timecards = bool2;
        this.fallback_time_zone_id = str3;
        this.always_use_fallback_time_zone = bool3;
        this.time_range = featureContextKt;
        this.trim_time_worked_outside_report_range = bool4;
        this.shift_local_date_range_to_start_of_workday = bool5;
        this.shift_options = shiftOptions;
        this.include_tips = bool6;
        this.calculate_salary = bool7;
        this.exclude_shift_data = bool8;
        this.exclude_future_shifts = bool9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SimpleTimeWorkedCalculationRequest)) {
            return false;
        }
        SimpleTimeWorkedCalculationRequest simpleTimeWorkedCalculationRequest = (SimpleTimeWorkedCalculationRequest) obj;
        return Intrinsics.areEqual(unknownFields(), simpleTimeWorkedCalculationRequest.unknownFields()) && Intrinsics.areEqual(this.date_range, simpleTimeWorkedCalculationRequest.date_range) && Intrinsics.areEqual(this.date_time_interval, simpleTimeWorkedCalculationRequest.date_time_interval) && Intrinsics.areEqual(this.request_filter, simpleTimeWorkedCalculationRequest.request_filter) && Intrinsics.areEqual(this.use_new_cursor, simpleTimeWorkedCalculationRequest.use_new_cursor) && Intrinsics.areEqual(this.next_cursor, simpleTimeWorkedCalculationRequest.next_cursor) && Intrinsics.areEqual(this.cursor, simpleTimeWorkedCalculationRequest.cursor) && Intrinsics.areEqual(this.include_open_timecards, simpleTimeWorkedCalculationRequest.include_open_timecards) && Intrinsics.areEqual(this.fallback_time_zone_id, simpleTimeWorkedCalculationRequest.fallback_time_zone_id) && Intrinsics.areEqual(this.always_use_fallback_time_zone, simpleTimeWorkedCalculationRequest.always_use_fallback_time_zone) && Intrinsics.areEqual(this.time_range, simpleTimeWorkedCalculationRequest.time_range) && Intrinsics.areEqual(this.trim_time_worked_outside_report_range, simpleTimeWorkedCalculationRequest.trim_time_worked_outside_report_range) && Intrinsics.areEqual(this.shift_local_date_range_to_start_of_workday, simpleTimeWorkedCalculationRequest.shift_local_date_range_to_start_of_workday) && this.shift_options == simpleTimeWorkedCalculationRequest.shift_options && Intrinsics.areEqual(this.include_tips, simpleTimeWorkedCalculationRequest.include_tips) && Intrinsics.areEqual(this.calculate_salary, simpleTimeWorkedCalculationRequest.calculate_salary) && Intrinsics.areEqual(this.exclude_shift_data, simpleTimeWorkedCalculationRequest.exclude_shift_data) && Intrinsics.areEqual(this.exclude_future_shifts, simpleTimeWorkedCalculationRequest.exclude_future_shifts);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        DateRange dateRange = this.date_range;
        int hashCode2 = (hashCode + (dateRange != null ? dateRange.hashCode() : 0)) * 37;
        DateTimeInterval dateTimeInterval = this.date_time_interval;
        int hashCode3 = (hashCode2 + (dateTimeInterval != null ? dateTimeInterval.hashCode() : 0)) * 37;
        MerchantEmployeeRequestFilter merchantEmployeeRequestFilter = this.request_filter;
        int hashCode4 = (hashCode3 + (merchantEmployeeRequestFilter != null ? merchantEmployeeRequestFilter.hashCode() : 0)) * 37;
        Boolean bool = this.use_new_cursor;
        int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.next_cursor;
        int hashCode6 = (hashCode5 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.cursor;
        int hashCode7 = (hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool2 = this.include_open_timecards;
        int hashCode8 = (hashCode7 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        String str3 = this.fallback_time_zone_id;
        int hashCode9 = (hashCode8 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool3 = this.always_use_fallback_time_zone;
        int hashCode10 = (hashCode9 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        FeatureContextKt featureContextKt = this.time_range;
        int hashCode11 = (hashCode10 + (featureContextKt != null ? featureContextKt.hashCode() : 0)) * 37;
        Boolean bool4 = this.trim_time_worked_outside_report_range;
        int hashCode12 = (hashCode11 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        Boolean bool5 = this.shift_local_date_range_to_start_of_workday;
        int hashCode13 = (hashCode12 + (bool5 != null ? Boolean.hashCode(bool5.booleanValue()) : 0)) * 37;
        ShiftOptions shiftOptions = this.shift_options;
        int hashCode14 = (hashCode13 + (shiftOptions != null ? shiftOptions.hashCode() : 0)) * 37;
        Boolean bool6 = this.include_tips;
        int hashCode15 = (hashCode14 + (bool6 != null ? Boolean.hashCode(bool6.booleanValue()) : 0)) * 37;
        Boolean bool7 = this.calculate_salary;
        int hashCode16 = (hashCode15 + (bool7 != null ? Boolean.hashCode(bool7.booleanValue()) : 0)) * 37;
        Boolean bool8 = this.exclude_shift_data;
        int hashCode17 = (hashCode16 + (bool8 != null ? Boolean.hashCode(bool8.booleanValue()) : 0)) * 37;
        Boolean bool9 = this.exclude_future_shifts;
        int hashCode18 = hashCode17 + (bool9 != null ? Boolean.hashCode(bool9.booleanValue()) : 0);
        this.hashCode = hashCode18;
        return hashCode18;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Timecard.Builder builder = new Timecard.Builder(8);
        builder.employee_token = this.date_range;
        builder.clockin_unit_token = this.date_time_interval;
        builder.clockout_unit_token = this.request_filter;
        builder.deleted = this.use_new_cursor;
        builder.token = this.next_cursor;
        builder.shift_id = this.cursor;
        builder.was_automatically_clocked_out = this.include_open_timecards;
        builder.merchant_token = this.fallback_time_zone_id;
        builder.note = this.always_use_fallback_time_zone;
        builder.employee = this.time_range;
        builder.clockin_timestamp_ms = this.trim_time_worked_outside_report_range;
        builder.clockout_timestamp_ms = this.shift_local_date_range_to_start_of_workday;
        builder.created_at_timestamp_ms = this.shift_options;
        builder.updated_at_timestamp_ms = this.include_tips;
        builder.hourly_wage = this.calculate_salary;
        builder.declared_tip = this.exclude_shift_data;
        builder.employee_job_info = this.exclude_future_shifts;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        DateRange dateRange = this.date_range;
        if (dateRange != null) {
            arrayList.add("date_range=" + dateRange);
        }
        DateTimeInterval dateTimeInterval = this.date_time_interval;
        if (dateTimeInterval != null) {
            arrayList.add("date_time_interval=" + dateTimeInterval);
        }
        MerchantEmployeeRequestFilter merchantEmployeeRequestFilter = this.request_filter;
        if (merchantEmployeeRequestFilter != null) {
            arrayList.add("request_filter=" + merchantEmployeeRequestFilter);
        }
        Boolean bool = this.use_new_cursor;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("use_new_cursor=", bool, arrayList);
        }
        String str = this.next_cursor;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "next_cursor=", arrayList);
        }
        String str2 = this.cursor;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "cursor=", arrayList);
        }
        Boolean bool2 = this.include_open_timecards;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("include_open_timecards=", bool2, arrayList);
        }
        String str3 = this.fallback_time_zone_id;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "fallback_time_zone_id=", arrayList);
        }
        Boolean bool3 = this.always_use_fallback_time_zone;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("always_use_fallback_time_zone=", bool3, arrayList);
        }
        FeatureContextKt featureContextKt = this.time_range;
        if (featureContextKt != null) {
            arrayList.add("time_range=" + featureContextKt);
        }
        Boolean bool4 = this.trim_time_worked_outside_report_range;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("trim_time_worked_outside_report_range=", bool4, arrayList);
        }
        Boolean bool5 = this.shift_local_date_range_to_start_of_workday;
        if (bool5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("shift_local_date_range_to_start_of_workday=", bool5, arrayList);
        }
        ShiftOptions shiftOptions = this.shift_options;
        if (shiftOptions != null) {
            arrayList.add("shift_options=" + shiftOptions);
        }
        Boolean bool6 = this.include_tips;
        if (bool6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("include_tips=", bool6, arrayList);
        }
        Boolean bool7 = this.calculate_salary;
        if (bool7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("calculate_salary=", bool7, arrayList);
        }
        Boolean bool8 = this.exclude_shift_data;
        if (bool8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("exclude_shift_data=", bool8, arrayList);
        }
        Boolean bool9 = this.exclude_future_shifts;
        if (bool9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("exclude_future_shifts=", bool9, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SimpleTimeWorkedCalculationRequest{", "}", 0, null, null, 56);
    }
}
