package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class StopTimecardBreakResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StopTimecardBreakResponse((Timecard) obj, (TimecardBreak) obj2, (Boolean) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Timecard.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(TimecardBreak.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StopTimecardBreakResponse stopTimecardBreakResponse = (StopTimecardBreakResponse) obj;
        reverseProtoWriter.getClass();
        stopTimecardBreakResponse.getClass();
        reverseProtoWriter.writeBytes(stopTimecardBreakResponse.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 3, stopTimecardBreakResponse.valid);
        TimecardBreak.ADAPTER.encodeWithTag(reverseProtoWriter, 2, stopTimecardBreakResponse.timecard_break);
        Timecard.ADAPTER.encodeWithTag(reverseProtoWriter, 1, stopTimecardBreakResponse.timecard);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StopTimecardBreakResponse stopTimecardBreakResponse = (StopTimecardBreakResponse) obj;
        stopTimecardBreakResponse.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(3, stopTimecardBreakResponse.valid) + TimecardBreak.ADAPTER.encodedSizeWithTag(2, stopTimecardBreakResponse.timecard_break) + Timecard.ADAPTER.encodedSizeWithTag(1, stopTimecardBreakResponse.timecard) + stopTimecardBreakResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StopTimecardBreakResponse stopTimecardBreakResponse = (StopTimecardBreakResponse) obj;
        stopTimecardBreakResponse.getClass();
        Timecard timecard = stopTimecardBreakResponse.timecard;
        Timecard timecard2 = timecard != null ? (Timecard) Timecard.ADAPTER.redact(timecard) : null;
        TimecardBreak timecardBreak = stopTimecardBreakResponse.timecard_break;
        TimecardBreak timecardBreak2 = timecardBreak != null ? (TimecardBreak) TimecardBreak.ADAPTER.redact(timecardBreak) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = stopTimecardBreakResponse.valid;
        byteString.getClass();
        return new StopTimecardBreakResponse(timecard2, timecardBreak2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StopTimecardBreakResponse stopTimecardBreakResponse = (StopTimecardBreakResponse) obj;
        stopTimecardBreakResponse.getClass();
        Timecard.ADAPTER.encodeWithTag(protoWriter, 1, stopTimecardBreakResponse.timecard);
        TimecardBreak.ADAPTER.encodeWithTag(protoWriter, 2, stopTimecardBreakResponse.timecard_break);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, stopTimecardBreakResponse.valid);
        protoWriter.writeBytes(stopTimecardBreakResponse.unknownFields());
    }
}
