package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.timecards.StopTimecardResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class StopTimecardResponse$WorkdayShiftSummary$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StopTimecardResponse.WorkdayShiftSummary((Long) obj, (Long) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.UINT64.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.UINT64.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(StopTimecardResponse.WorkdayShiftSummary.JobSummary.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StopTimecardResponse.WorkdayShiftSummary workdayShiftSummary = (StopTimecardResponse.WorkdayShiftSummary) obj;
        reverseProtoWriter.getClass();
        workdayShiftSummary.getClass();
        reverseProtoWriter.writeBytes(workdayShiftSummary.unknownFields());
        StopTimecardResponse.WorkdayShiftSummary.JobSummary.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, workdayShiftSummary.job_summaries);
        ProtoAdapter protoAdapter = ProtoAdapter.UINT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, workdayShiftSummary.total_seconds);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, workdayShiftSummary.paid_seconds);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StopTimecardResponse.WorkdayShiftSummary workdayShiftSummary = (StopTimecardResponse.WorkdayShiftSummary) obj;
        workdayShiftSummary.getClass();
        int size$okio = workdayShiftSummary.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.UINT64;
        return StopTimecardResponse.WorkdayShiftSummary.JobSummary.ADAPTER.asRepeated().encodedSizeWithTag(3, workdayShiftSummary.job_summaries) + protoAdapter.encodedSizeWithTag(2, workdayShiftSummary.total_seconds) + protoAdapter.encodedSizeWithTag(1, workdayShiftSummary.paid_seconds) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StopTimecardResponse.WorkdayShiftSummary workdayShiftSummary = (StopTimecardResponse.WorkdayShiftSummary) obj;
        workdayShiftSummary.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(workdayShiftSummary.job_summaries, StopTimecardResponse.WorkdayShiftSummary.JobSummary.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Long l = workdayShiftSummary.paid_seconds;
        Long l2 = workdayShiftSummary.total_seconds;
        byteString.getClass();
        return new StopTimecardResponse.WorkdayShiftSummary(l, l2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StopTimecardResponse.WorkdayShiftSummary workdayShiftSummary = (StopTimecardResponse.WorkdayShiftSummary) obj;
        workdayShiftSummary.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.UINT64;
        protoAdapter.encodeWithTag(protoWriter, 1, workdayShiftSummary.paid_seconds);
        protoAdapter.encodeWithTag(protoWriter, 2, workdayShiftSummary.total_seconds);
        StopTimecardResponse.WorkdayShiftSummary.JobSummary.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, workdayShiftSummary.job_summaries);
        protoWriter.writeBytes(workdayShiftSummary.unknownFields());
    }
}
