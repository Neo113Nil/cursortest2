package com.squareup.protos.timecards.scheduling;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.timecards.Timecard;
import com.squareup.protos.timecards.TimecardBreak;
import com.squareup.protos.timecards.scheduling.Shift;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class Shift$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Shift((String) obj, (ShiftSchedule) obj2, (Timecard) obj3, m, (Shift.Traits) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(ShiftSchedule.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Timecard.ADAPTER, protoReader, obj3);
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(Shift.Traits.ADAPTER, protoReader, obj4);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(TimecardBreak.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Shift shift = (Shift) obj;
        reverseProtoWriter.getClass();
        shift.getClass();
        reverseProtoWriter.writeBytes(shift.unknownFields());
        Shift.Traits.ADAPTER.encodeWithTag(reverseProtoWriter, 4, shift.traits);
        TimecardBreak.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, shift.timecard_breaks);
        Timecard.ADAPTER.encodeWithTag(reverseProtoWriter, 3, shift.timecard);
        ShiftSchedule.ADAPTER.encodeWithTag(reverseProtoWriter, 2, shift.shift_schedule);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, shift.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Shift shift = (Shift) obj;
        shift.getClass();
        return Shift.Traits.ADAPTER.encodedSizeWithTag(4, shift.traits) + TimecardBreak.ADAPTER.asRepeated().encodedSizeWithTag(5, shift.timecard_breaks) + Timecard.ADAPTER.encodedSizeWithTag(3, shift.timecard) + ShiftSchedule.ADAPTER.encodedSizeWithTag(2, shift.shift_schedule) + ProtoAdapter.STRING.encodedSizeWithTag(1, shift.id) + shift.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Shift shift = (Shift) obj;
        shift.getClass();
        ShiftSchedule shiftSchedule = shift.shift_schedule;
        ShiftSchedule shiftSchedule2 = shiftSchedule != null ? (ShiftSchedule) ShiftSchedule.ADAPTER.redact(shiftSchedule) : null;
        Timecard timecard = shift.timecard;
        Timecard timecard2 = timecard != null ? (Timecard) Timecard.ADAPTER.redact(timecard) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(shift.timecard_breaks, TimecardBreak.ADAPTER);
        Shift.Traits traits = shift.traits;
        Shift.Traits traits2 = traits != null ? (Shift.Traits) Shift.Traits.ADAPTER.redact(traits) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = shift.id;
        byteString.getClass();
        return new Shift(str, shiftSchedule2, timecard2, m1169redactElements, traits2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Shift shift = (Shift) obj;
        shift.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, shift.id);
        ShiftSchedule.ADAPTER.encodeWithTag(protoWriter, 2, shift.shift_schedule);
        Timecard.ADAPTER.encodeWithTag(protoWriter, 3, shift.timecard);
        TimecardBreak.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, shift.timecard_breaks);
        Shift.Traits.ADAPTER.encodeWithTag(protoWriter, 4, shift.traits);
        protoWriter.writeBytes(shift.unknownFields());
    }
}
