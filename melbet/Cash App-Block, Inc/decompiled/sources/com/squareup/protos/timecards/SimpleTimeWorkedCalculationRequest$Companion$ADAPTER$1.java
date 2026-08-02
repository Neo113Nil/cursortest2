package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.cash.clientrouting.data.FeatureContextKt;
import com.squareup.protos.common.time.DateTimeInterval;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SimpleTimeWorkedCalculationRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        String str;
        String str2;
        Boolean bool;
        FeatureContextKt simpleTimeWorkedCalculationRequest$TimeRange$LocalDateRange;
        ?? decode;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Boolean bool2 = null;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool3 = null;
        String str5 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        ShiftOptions shiftOptions = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        Boolean bool9 = null;
        Boolean bool10 = null;
        FeatureContextKt featureContextKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SimpleTimeWorkedCalculationRequest((DateRange) obj, (DateTimeInterval) obj2, (MerchantEmployeeRequestFilter) obj3, bool2, str3, str4, bool3, str5, bool4, featureContextKt, bool5, bool6, shiftOptions, bool7, bool8, bool9, bool10, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(DateRange.ADAPTER, protoReader, obj);
                    decode = bool2;
                    break;
                case 2:
                    obj3 = TransactorKt.decodeMessageOrMerge(MerchantEmployeeRequestFilter.ADAPTER, protoReader, obj3);
                    decode = bool2;
                    break;
                case 3:
                    str3 = ProtoAdapter.STRING.decode(protoReader);
                    decode = bool2;
                    break;
                case 4:
                    bool3 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = bool2;
                    break;
                case 5:
                    obj2 = TransactorKt.decodeMessageOrMerge(DateTimeInterval.ADAPTER, protoReader, obj2);
                    decode = bool2;
                    break;
                case 6:
                    str5 = ProtoAdapter.STRING.decode(protoReader);
                    decode = bool2;
                    break;
                case 7:
                    bool4 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = bool2;
                    break;
                case 8:
                    simpleTimeWorkedCalculationRequest$TimeRange$LocalDateRange = new SimpleTimeWorkedCalculationRequest$TimeRange$LocalDateRange((LocalDateRange) LocalDateRange.ADAPTER.decode(protoReader));
                    featureContextKt = simpleTimeWorkedCalculationRequest$TimeRange$LocalDateRange;
                    decode = bool2;
                    break;
                case 9:
                    simpleTimeWorkedCalculationRequest$TimeRange$LocalDateRange = new SimpleTimeWorkedCalculationRequest$TimeRange$LocalDateTimeRange((LocalDateTimeRange) LocalDateTimeRange.ADAPTER.decode(protoReader));
                    featureContextKt = simpleTimeWorkedCalculationRequest$TimeRange$LocalDateRange;
                    decode = bool2;
                    break;
                case 10:
                    simpleTimeWorkedCalculationRequest$TimeRange$LocalDateRange = new SimpleTimeWorkedCalculationRequest$TimeRange$InstantRange((InstantRange) InstantRange.ADAPTER.decode(protoReader));
                    featureContextKt = simpleTimeWorkedCalculationRequest$TimeRange$LocalDateRange;
                    decode = bool2;
                    break;
                case 11:
                    bool5 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = bool2;
                    break;
                case 12:
                    bool6 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = bool2;
                    break;
                case 13:
                    try {
                        shiftOptions = ShiftOptions.ADAPTER.decode(protoReader);
                        decode = bool2;
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        str = str3;
                        str2 = str4;
                        bool = bool3;
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 14:
                    bool7 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = bool2;
                    break;
                case 15:
                    str4 = ProtoAdapter.STRING.decode(protoReader);
                    decode = bool2;
                    break;
                case 16:
                    decode = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 17:
                    bool8 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = bool2;
                    break;
                case 18:
                    bool9 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = bool2;
                    break;
                case 19:
                    bool10 = ProtoAdapter.BOOL.decode(protoReader);
                    decode = bool2;
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    str = str3;
                    str2 = str4;
                    bool = bool3;
                    decode = bool2;
                    str3 = str;
                    bool3 = bool;
                    str4 = str2;
                    break;
            }
            bool2 = decode;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SimpleTimeWorkedCalculationRequest simpleTimeWorkedCalculationRequest = (SimpleTimeWorkedCalculationRequest) obj;
        reverseProtoWriter.getClass();
        simpleTimeWorkedCalculationRequest.getClass();
        reverseProtoWriter.writeBytes(simpleTimeWorkedCalculationRequest.unknownFields());
        FeatureContextKt featureContextKt = simpleTimeWorkedCalculationRequest.time_range;
        if (featureContextKt instanceof SimpleTimeWorkedCalculationRequest$TimeRange$LocalDateRange) {
            LocalDateRange.ADAPTER.encodeWithTag(reverseProtoWriter, 8, ((SimpleTimeWorkedCalculationRequest$TimeRange$LocalDateRange) featureContextKt).value);
        } else if (featureContextKt instanceof SimpleTimeWorkedCalculationRequest$TimeRange$LocalDateTimeRange) {
            LocalDateTimeRange.ADAPTER.encodeWithTag(reverseProtoWriter, 9, ((SimpleTimeWorkedCalculationRequest$TimeRange$LocalDateTimeRange) featureContextKt).value);
        } else if (featureContextKt instanceof SimpleTimeWorkedCalculationRequest$TimeRange$InstantRange) {
            InstantRange.ADAPTER.encodeWithTag(reverseProtoWriter, 10, ((SimpleTimeWorkedCalculationRequest$TimeRange$InstantRange) featureContextKt).value);
        } else if (featureContextKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 19, simpleTimeWorkedCalculationRequest.exclude_future_shifts);
        protoAdapter.encodeWithTag(reverseProtoWriter, 18, simpleTimeWorkedCalculationRequest.exclude_shift_data);
        protoAdapter.encodeWithTag(reverseProtoWriter, 17, simpleTimeWorkedCalculationRequest.calculate_salary);
        protoAdapter.encodeWithTag(reverseProtoWriter, 14, simpleTimeWorkedCalculationRequest.include_tips);
        ShiftOptions.ADAPTER.encodeWithTag(reverseProtoWriter, 13, simpleTimeWorkedCalculationRequest.shift_options);
        protoAdapter.encodeWithTag(reverseProtoWriter, 12, simpleTimeWorkedCalculationRequest.shift_local_date_range_to_start_of_workday);
        protoAdapter.encodeWithTag(reverseProtoWriter, 11, simpleTimeWorkedCalculationRequest.trim_time_worked_outside_report_range);
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, simpleTimeWorkedCalculationRequest.always_use_fallback_time_zone);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 6, simpleTimeWorkedCalculationRequest.fallback_time_zone_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, simpleTimeWorkedCalculationRequest.include_open_timecards);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 15, simpleTimeWorkedCalculationRequest.cursor);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, simpleTimeWorkedCalculationRequest.next_cursor);
        protoAdapter.encodeWithTag(reverseProtoWriter, 16, simpleTimeWorkedCalculationRequest.use_new_cursor);
        MerchantEmployeeRequestFilter.ADAPTER.encodeWithTag(reverseProtoWriter, 2, simpleTimeWorkedCalculationRequest.request_filter);
        DateTimeInterval.ADAPTER.encodeWithTag(reverseProtoWriter, 5, simpleTimeWorkedCalculationRequest.date_time_interval);
        DateRange.ADAPTER.encodeWithTag(reverseProtoWriter, 1, simpleTimeWorkedCalculationRequest.date_range);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        SimpleTimeWorkedCalculationRequest simpleTimeWorkedCalculationRequest = (SimpleTimeWorkedCalculationRequest) obj;
        simpleTimeWorkedCalculationRequest.getClass();
        int encodedSizeWithTag2 = MerchantEmployeeRequestFilter.ADAPTER.encodedSizeWithTag(2, simpleTimeWorkedCalculationRequest.request_filter) + DateTimeInterval.ADAPTER.encodedSizeWithTag(5, simpleTimeWorkedCalculationRequest.date_time_interval) + DateRange.ADAPTER.encodedSizeWithTag(1, simpleTimeWorkedCalculationRequest.date_range) + simpleTimeWorkedCalculationRequest.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        int encodedSizeWithTag3 = protoAdapter.encodedSizeWithTag(16, simpleTimeWorkedCalculationRequest.use_new_cursor) + encodedSizeWithTag2;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        int encodedSizeWithTag4 = protoAdapter.encodedSizeWithTag(7, simpleTimeWorkedCalculationRequest.always_use_fallback_time_zone) + protoAdapter2.encodedSizeWithTag(6, simpleTimeWorkedCalculationRequest.fallback_time_zone_id) + protoAdapter.encodedSizeWithTag(4, simpleTimeWorkedCalculationRequest.include_open_timecards) + protoAdapter2.encodedSizeWithTag(15, simpleTimeWorkedCalculationRequest.cursor) + protoAdapter2.encodedSizeWithTag(3, simpleTimeWorkedCalculationRequest.next_cursor) + encodedSizeWithTag3;
        FeatureContextKt featureContextKt = simpleTimeWorkedCalculationRequest.time_range;
        if (featureContextKt instanceof SimpleTimeWorkedCalculationRequest$TimeRange$LocalDateRange) {
            encodedSizeWithTag = LocalDateRange.ADAPTER.encodedSizeWithTag(8, ((SimpleTimeWorkedCalculationRequest$TimeRange$LocalDateRange) featureContextKt).value);
        } else if (featureContextKt instanceof SimpleTimeWorkedCalculationRequest$TimeRange$LocalDateTimeRange) {
            encodedSizeWithTag = LocalDateTimeRange.ADAPTER.encodedSizeWithTag(9, ((SimpleTimeWorkedCalculationRequest$TimeRange$LocalDateTimeRange) featureContextKt).value);
        } else {
            if (!(featureContextKt instanceof SimpleTimeWorkedCalculationRequest$TimeRange$InstantRange)) {
                if (featureContextKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return protoAdapter.encodedSizeWithTag(19, simpleTimeWorkedCalculationRequest.exclude_future_shifts) + protoAdapter.encodedSizeWithTag(18, simpleTimeWorkedCalculationRequest.exclude_shift_data) + protoAdapter.encodedSizeWithTag(17, simpleTimeWorkedCalculationRequest.calculate_salary) + protoAdapter.encodedSizeWithTag(14, simpleTimeWorkedCalculationRequest.include_tips) + ShiftOptions.ADAPTER.encodedSizeWithTag(13, simpleTimeWorkedCalculationRequest.shift_options) + protoAdapter.encodedSizeWithTag(12, simpleTimeWorkedCalculationRequest.shift_local_date_range_to_start_of_workday) + protoAdapter.encodedSizeWithTag(11, simpleTimeWorkedCalculationRequest.trim_time_worked_outside_report_range) + encodedSizeWithTag4;
            }
            encodedSizeWithTag = InstantRange.ADAPTER.encodedSizeWithTag(10, ((SimpleTimeWorkedCalculationRequest$TimeRange$InstantRange) featureContextKt).value);
        }
        encodedSizeWithTag4 += encodedSizeWithTag;
        return protoAdapter.encodedSizeWithTag(19, simpleTimeWorkedCalculationRequest.exclude_future_shifts) + protoAdapter.encodedSizeWithTag(18, simpleTimeWorkedCalculationRequest.exclude_shift_data) + protoAdapter.encodedSizeWithTag(17, simpleTimeWorkedCalculationRequest.calculate_salary) + protoAdapter.encodedSizeWithTag(14, simpleTimeWorkedCalculationRequest.include_tips) + ShiftOptions.ADAPTER.encodedSizeWithTag(13, simpleTimeWorkedCalculationRequest.shift_options) + protoAdapter.encodedSizeWithTag(12, simpleTimeWorkedCalculationRequest.shift_local_date_range_to_start_of_workday) + protoAdapter.encodedSizeWithTag(11, simpleTimeWorkedCalculationRequest.trim_time_worked_outside_report_range) + encodedSizeWithTag4;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SimpleTimeWorkedCalculationRequest simpleTimeWorkedCalculationRequest = (SimpleTimeWorkedCalculationRequest) obj;
        simpleTimeWorkedCalculationRequest.getClass();
        DateRange dateRange = simpleTimeWorkedCalculationRequest.date_range;
        DateRange dateRange2 = dateRange != null ? (DateRange) DateRange.ADAPTER.redact(dateRange) : null;
        DateTimeInterval dateTimeInterval = simpleTimeWorkedCalculationRequest.date_time_interval;
        DateTimeInterval dateTimeInterval2 = dateTimeInterval != null ? (DateTimeInterval) DateTimeInterval.ADAPTER.redact(dateTimeInterval) : null;
        MerchantEmployeeRequestFilter merchantEmployeeRequestFilter = simpleTimeWorkedCalculationRequest.request_filter;
        MerchantEmployeeRequestFilter merchantEmployeeRequestFilter2 = merchantEmployeeRequestFilter != null ? (MerchantEmployeeRequestFilter) MerchantEmployeeRequestFilter.ADAPTER.redact(merchantEmployeeRequestFilter) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = simpleTimeWorkedCalculationRequest.use_new_cursor;
        String str = simpleTimeWorkedCalculationRequest.next_cursor;
        String str2 = simpleTimeWorkedCalculationRequest.cursor;
        Boolean bool2 = simpleTimeWorkedCalculationRequest.include_open_timecards;
        String str3 = simpleTimeWorkedCalculationRequest.fallback_time_zone_id;
        Boolean bool3 = simpleTimeWorkedCalculationRequest.always_use_fallback_time_zone;
        FeatureContextKt featureContextKt = simpleTimeWorkedCalculationRequest.time_range;
        Boolean bool4 = simpleTimeWorkedCalculationRequest.trim_time_worked_outside_report_range;
        Boolean bool5 = simpleTimeWorkedCalculationRequest.shift_local_date_range_to_start_of_workday;
        ShiftOptions shiftOptions = simpleTimeWorkedCalculationRequest.shift_options;
        Boolean bool6 = simpleTimeWorkedCalculationRequest.include_tips;
        Boolean bool7 = simpleTimeWorkedCalculationRequest.calculate_salary;
        Boolean bool8 = simpleTimeWorkedCalculationRequest.exclude_shift_data;
        Boolean bool9 = simpleTimeWorkedCalculationRequest.exclude_future_shifts;
        byteString.getClass();
        return new SimpleTimeWorkedCalculationRequest(dateRange2, dateTimeInterval2, merchantEmployeeRequestFilter2, bool, str, str2, bool2, str3, bool3, featureContextKt, bool4, bool5, shiftOptions, bool6, bool7, bool8, bool9, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SimpleTimeWorkedCalculationRequest simpleTimeWorkedCalculationRequest = (SimpleTimeWorkedCalculationRequest) obj;
        simpleTimeWorkedCalculationRequest.getClass();
        DateRange.ADAPTER.encodeWithTag(protoWriter, 1, simpleTimeWorkedCalculationRequest.date_range);
        DateTimeInterval.ADAPTER.encodeWithTag(protoWriter, 5, simpleTimeWorkedCalculationRequest.date_time_interval);
        MerchantEmployeeRequestFilter.ADAPTER.encodeWithTag(protoWriter, 2, simpleTimeWorkedCalculationRequest.request_filter);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 16, simpleTimeWorkedCalculationRequest.use_new_cursor);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 3, simpleTimeWorkedCalculationRequest.next_cursor);
        protoAdapter2.encodeWithTag(protoWriter, 15, simpleTimeWorkedCalculationRequest.cursor);
        protoAdapter.encodeWithTag(protoWriter, 4, simpleTimeWorkedCalculationRequest.include_open_timecards);
        protoAdapter2.encodeWithTag(protoWriter, 6, simpleTimeWorkedCalculationRequest.fallback_time_zone_id);
        protoAdapter.encodeWithTag(protoWriter, 7, simpleTimeWorkedCalculationRequest.always_use_fallback_time_zone);
        protoAdapter.encodeWithTag(protoWriter, 11, simpleTimeWorkedCalculationRequest.trim_time_worked_outside_report_range);
        protoAdapter.encodeWithTag(protoWriter, 12, simpleTimeWorkedCalculationRequest.shift_local_date_range_to_start_of_workday);
        ShiftOptions.ADAPTER.encodeWithTag(protoWriter, 13, simpleTimeWorkedCalculationRequest.shift_options);
        protoAdapter.encodeWithTag(protoWriter, 14, simpleTimeWorkedCalculationRequest.include_tips);
        protoAdapter.encodeWithTag(protoWriter, 17, simpleTimeWorkedCalculationRequest.calculate_salary);
        protoAdapter.encodeWithTag(protoWriter, 18, simpleTimeWorkedCalculationRequest.exclude_shift_data);
        protoAdapter.encodeWithTag(protoWriter, 19, simpleTimeWorkedCalculationRequest.exclude_future_shifts);
        FeatureContextKt featureContextKt = simpleTimeWorkedCalculationRequest.time_range;
        if (featureContextKt instanceof SimpleTimeWorkedCalculationRequest$TimeRange$LocalDateRange) {
            LocalDateRange.ADAPTER.encodeWithTag(protoWriter, 8, ((SimpleTimeWorkedCalculationRequest$TimeRange$LocalDateRange) featureContextKt).value);
        } else if (featureContextKt instanceof SimpleTimeWorkedCalculationRequest$TimeRange$LocalDateTimeRange) {
            LocalDateTimeRange.ADAPTER.encodeWithTag(protoWriter, 9, ((SimpleTimeWorkedCalculationRequest$TimeRange$LocalDateTimeRange) featureContextKt).value);
        } else if (featureContextKt instanceof SimpleTimeWorkedCalculationRequest$TimeRange$InstantRange) {
            InstantRange.ADAPTER.encodeWithTag(protoWriter, 10, ((SimpleTimeWorkedCalculationRequest$TimeRange$InstantRange) featureContextKt).value);
        } else if (featureContextKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(simpleTimeWorkedCalculationRequest.unknownFields());
    }
}
