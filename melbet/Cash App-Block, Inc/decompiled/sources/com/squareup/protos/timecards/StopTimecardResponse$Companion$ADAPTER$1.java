package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.protos.timecards.StopTimecardResponse;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class StopTimecardResponse$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new StopTimecardResponse((Timecard) obj, (TimecardBreak) obj2, (Boolean) obj3, (StopTimecardResponse.WorkdayShiftSummary) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                obj4 = TransactorKt.decodeMessageOrMerge(StopTimecardResponse.WorkdayShiftSummary.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StopTimecardResponse stopTimecardResponse = (StopTimecardResponse) obj;
        reverseProtoWriter.getClass();
        stopTimecardResponse.getClass();
        reverseProtoWriter.writeBytes(stopTimecardResponse.unknownFields());
        StopTimecardResponse.WorkdayShiftSummary.ADAPTER.encodeWithTag(reverseProtoWriter, 4, stopTimecardResponse.workday_shift_summary);
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, stopTimecardResponse.valid);
        TimecardBreak.ADAPTER.encodeWithTag(reverseProtoWriter, 2, stopTimecardResponse.timecard_break);
        Timecard.ADAPTER.encodeWithTag(reverseProtoWriter, 1, stopTimecardResponse.timecard);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StopTimecardResponse stopTimecardResponse = (StopTimecardResponse) obj;
        stopTimecardResponse.getClass();
        return StopTimecardResponse.WorkdayShiftSummary.ADAPTER.encodedSizeWithTag(4, stopTimecardResponse.workday_shift_summary) + ProtoAdapter.BOOL.encodedSizeWithTag(3, stopTimecardResponse.valid) + TimecardBreak.ADAPTER.encodedSizeWithTag(2, stopTimecardResponse.timecard_break) + Timecard.ADAPTER.encodedSizeWithTag(1, stopTimecardResponse.timecard) + stopTimecardResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StopTimecardResponse stopTimecardResponse = (StopTimecardResponse) obj;
        stopTimecardResponse.getClass();
        Timecard timecard = stopTimecardResponse.timecard;
        Timecard timecard2 = timecard != null ? (Timecard) Timecard.ADAPTER.redact(timecard) : null;
        TimecardBreak timecardBreak = stopTimecardResponse.timecard_break;
        TimecardBreak timecardBreak2 = timecardBreak != null ? (TimecardBreak) TimecardBreak.ADAPTER.redact(timecardBreak) : null;
        StopTimecardResponse.WorkdayShiftSummary workdayShiftSummary = stopTimecardResponse.workday_shift_summary;
        StopTimecardResponse.WorkdayShiftSummary workdayShiftSummary2 = workdayShiftSummary != null ? (StopTimecardResponse.WorkdayShiftSummary) StopTimecardResponse.WorkdayShiftSummary.ADAPTER.redact(workdayShiftSummary) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = stopTimecardResponse.valid;
        byteString.getClass();
        return new StopTimecardResponse(timecard2, timecardBreak2, bool, workdayShiftSummary2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StopTimecardResponse stopTimecardResponse = (StopTimecardResponse) obj;
        stopTimecardResponse.getClass();
        Timecard.ADAPTER.encodeWithTag(protoWriter, 1, stopTimecardResponse.timecard);
        TimecardBreak.ADAPTER.encodeWithTag(protoWriter, 2, stopTimecardResponse.timecard_break);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, stopTimecardResponse.valid);
        StopTimecardResponse.WorkdayShiftSummary.ADAPTER.encodeWithTag(protoWriter, 4, stopTimecardResponse.workday_shift_summary);
        protoWriter.writeBytes(stopTimecardResponse.unknownFields());
    }
}
