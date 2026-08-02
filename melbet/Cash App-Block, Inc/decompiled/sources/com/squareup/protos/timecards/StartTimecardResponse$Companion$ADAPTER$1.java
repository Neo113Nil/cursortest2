package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class StartTimecardResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StartTimecardResponse((Timecard) obj, (TimecardBreak) obj2, (Boolean) obj3, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Timecard.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(TimecardBreak.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(EmployeeJobInfo.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StartTimecardResponse startTimecardResponse = (StartTimecardResponse) obj;
        reverseProtoWriter.getClass();
        startTimecardResponse.getClass();
        reverseProtoWriter.writeBytes(startTimecardResponse.unknownFields());
        EmployeeJobInfo.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, startTimecardResponse.employee_job_infos);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, startTimecardResponse.valid);
        TimecardBreak.ADAPTER.encodeWithTag(reverseProtoWriter, 2, startTimecardResponse.timecard_break);
        Timecard.ADAPTER.encodeWithTag(reverseProtoWriter, 1, startTimecardResponse.timecard);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StartTimecardResponse startTimecardResponse = (StartTimecardResponse) obj;
        startTimecardResponse.getClass();
        return EmployeeJobInfo.ADAPTER.asRepeated().encodedSizeWithTag(4, startTimecardResponse.employee_job_infos) + ProtoAdapter.BOOL.encodedSizeWithTag(3, startTimecardResponse.valid) + TimecardBreak.ADAPTER.encodedSizeWithTag(2, startTimecardResponse.timecard_break) + Timecard.ADAPTER.encodedSizeWithTag(1, startTimecardResponse.timecard) + startTimecardResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StartTimecardResponse startTimecardResponse = (StartTimecardResponse) obj;
        startTimecardResponse.getClass();
        Timecard timecard = startTimecardResponse.timecard;
        Timecard timecard2 = timecard != null ? (Timecard) Timecard.ADAPTER.redact(timecard) : null;
        TimecardBreak timecardBreak = startTimecardResponse.timecard_break;
        TimecardBreak timecardBreak2 = timecardBreak != null ? (TimecardBreak) TimecardBreak.ADAPTER.redact(timecardBreak) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(startTimecardResponse.employee_job_infos, EmployeeJobInfo.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = startTimecardResponse.valid;
        byteString.getClass();
        return new StartTimecardResponse(timecard2, timecardBreak2, bool, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StartTimecardResponse startTimecardResponse = (StartTimecardResponse) obj;
        startTimecardResponse.getClass();
        Timecard.ADAPTER.encodeWithTag(protoWriter, 1, startTimecardResponse.timecard);
        TimecardBreak.ADAPTER.encodeWithTag(protoWriter, 2, startTimecardResponse.timecard_break);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, startTimecardResponse.valid);
        EmployeeJobInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, startTimecardResponse.employee_job_infos);
        protoWriter.writeBytes(startTimecardResponse.unknownFields());
    }
}
