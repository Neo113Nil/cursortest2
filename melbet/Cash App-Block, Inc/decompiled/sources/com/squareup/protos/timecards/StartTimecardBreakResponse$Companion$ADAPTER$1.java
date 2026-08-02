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
public final class StartTimecardBreakResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StartTimecardBreakResponse((Timecard) obj, (TimecardBreak) obj2, m, (Boolean) obj3, (Boolean) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Timecard.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(TimecardBreak.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                m.add(TimecardBreakDefinition.ADAPTER.decode(protoReader));
            } else if (nextTag == 4) {
                obj3 = ProtoAdapter.BOOL.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StartTimecardBreakResponse startTimecardBreakResponse = (StartTimecardBreakResponse) obj;
        reverseProtoWriter.getClass();
        startTimecardBreakResponse.getClass();
        reverseProtoWriter.writeBytes(startTimecardBreakResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, startTimecardBreakResponse.break_definition_outdated);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, startTimecardBreakResponse.valid);
        TimecardBreakDefinition.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, startTimecardBreakResponse.break_definitions);
        TimecardBreak.ADAPTER.encodeWithTag(reverseProtoWriter, 2, startTimecardBreakResponse.timecard_break);
        Timecard.ADAPTER.encodeWithTag(reverseProtoWriter, 1, startTimecardBreakResponse.timecard);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StartTimecardBreakResponse startTimecardBreakResponse = (StartTimecardBreakResponse) obj;
        startTimecardBreakResponse.getClass();
        int encodedSizeWithTag = TimecardBreakDefinition.ADAPTER.asRepeated().encodedSizeWithTag(3, startTimecardBreakResponse.break_definitions) + TimecardBreak.ADAPTER.encodedSizeWithTag(2, startTimecardBreakResponse.timecard_break) + Timecard.ADAPTER.encodedSizeWithTag(1, startTimecardBreakResponse.timecard) + startTimecardBreakResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        return protoAdapter.encodedSizeWithTag(5, startTimecardBreakResponse.break_definition_outdated) + protoAdapter.encodedSizeWithTag(4, startTimecardBreakResponse.valid) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StartTimecardBreakResponse startTimecardBreakResponse = (StartTimecardBreakResponse) obj;
        startTimecardBreakResponse.getClass();
        Timecard timecard = startTimecardBreakResponse.timecard;
        Timecard timecard2 = timecard != null ? (Timecard) Timecard.ADAPTER.redact(timecard) : null;
        TimecardBreak timecardBreak = startTimecardBreakResponse.timecard_break;
        TimecardBreak timecardBreak2 = timecardBreak != null ? (TimecardBreak) TimecardBreak.ADAPTER.redact(timecardBreak) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(startTimecardBreakResponse.break_definitions, TimecardBreakDefinition.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = startTimecardBreakResponse.valid;
        Boolean bool2 = startTimecardBreakResponse.break_definition_outdated;
        byteString.getClass();
        return new StartTimecardBreakResponse(timecard2, timecardBreak2, m1169redactElements, bool, bool2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StartTimecardBreakResponse startTimecardBreakResponse = (StartTimecardBreakResponse) obj;
        startTimecardBreakResponse.getClass();
        Timecard.ADAPTER.encodeWithTag(protoWriter, 1, startTimecardBreakResponse.timecard);
        TimecardBreak.ADAPTER.encodeWithTag(protoWriter, 2, startTimecardBreakResponse.timecard_break);
        TimecardBreakDefinition.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, startTimecardBreakResponse.break_definitions);
        ProtoAdapter protoAdapter = ProtoAdapter.BOOL;
        protoAdapter.encodeWithTag(protoWriter, 4, startTimecardBreakResponse.valid);
        protoAdapter.encodeWithTag(protoWriter, 5, startTimecardBreakResponse.break_definition_outdated);
        protoWriter.writeBytes(startTimecardBreakResponse.unknownFields());
    }
}
