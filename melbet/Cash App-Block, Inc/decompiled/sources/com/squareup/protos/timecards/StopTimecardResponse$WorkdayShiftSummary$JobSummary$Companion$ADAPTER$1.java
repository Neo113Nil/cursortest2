package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.protos.common.time.DateTime;
import com.squareup.protos.timecards.StopTimecardResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class StopTimecardResponse$WorkdayShiftSummary$JobSummary$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StopTimecardResponse.WorkdayShiftSummary.JobSummary((EmployeeJobInfo) obj, (DateTime) obj2, (DateTime) obj3, (Long) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(EmployeeJobInfo.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(DateTime.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(DateTime.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.UINT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StopTimecardResponse.WorkdayShiftSummary.JobSummary jobSummary = (StopTimecardResponse.WorkdayShiftSummary.JobSummary) obj;
        reverseProtoWriter.getClass();
        jobSummary.getClass();
        reverseProtoWriter.writeBytes(jobSummary.unknownFields());
        ProtoAdapter.UINT64.encodeWithTag(reverseProtoWriter, 4, jobSummary.paid_seconds);
        ProtoAdapter protoAdapter = DateTime.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, jobSummary.stop_zoned_date_time);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, jobSummary.start_zoned_date_time);
        EmployeeJobInfo.ADAPTER.encodeWithTag(reverseProtoWriter, 1, jobSummary.job_info);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StopTimecardResponse.WorkdayShiftSummary.JobSummary jobSummary = (StopTimecardResponse.WorkdayShiftSummary.JobSummary) obj;
        jobSummary.getClass();
        int encodedSizeWithTag = EmployeeJobInfo.ADAPTER.encodedSizeWithTag(1, jobSummary.job_info) + jobSummary.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = DateTime.ADAPTER;
        return ProtoAdapter.UINT64.encodedSizeWithTag(4, jobSummary.paid_seconds) + protoAdapter.encodedSizeWithTag(3, jobSummary.stop_zoned_date_time) + protoAdapter.encodedSizeWithTag(2, jobSummary.start_zoned_date_time) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StopTimecardResponse.WorkdayShiftSummary.JobSummary jobSummary = (StopTimecardResponse.WorkdayShiftSummary.JobSummary) obj;
        jobSummary.getClass();
        EmployeeJobInfo employeeJobInfo = jobSummary.job_info;
        EmployeeJobInfo employeeJobInfo2 = employeeJobInfo != null ? (EmployeeJobInfo) EmployeeJobInfo.ADAPTER.redact(employeeJobInfo) : null;
        DateTime dateTime = jobSummary.start_zoned_date_time;
        DateTime dateTime2 = dateTime != null ? (DateTime) DateTime.ADAPTER.redact(dateTime) : null;
        DateTime dateTime3 = jobSummary.stop_zoned_date_time;
        DateTime dateTime4 = dateTime3 != null ? (DateTime) DateTime.ADAPTER.redact(dateTime3) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = jobSummary.paid_seconds;
        byteString.getClass();
        return new StopTimecardResponse.WorkdayShiftSummary.JobSummary(employeeJobInfo2, dateTime2, dateTime4, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StopTimecardResponse.WorkdayShiftSummary.JobSummary jobSummary = (StopTimecardResponse.WorkdayShiftSummary.JobSummary) obj;
        jobSummary.getClass();
        EmployeeJobInfo.ADAPTER.encodeWithTag(protoWriter, 1, jobSummary.job_info);
        ProtoAdapter protoAdapter = DateTime.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, jobSummary.start_zoned_date_time);
        protoAdapter.encodeWithTag(protoWriter, 3, jobSummary.stop_zoned_date_time);
        ProtoAdapter.UINT64.encodeWithTag(protoWriter, 4, jobSummary.paid_seconds);
        protoWriter.writeBytes(jobSummary.unknownFields());
    }
}
