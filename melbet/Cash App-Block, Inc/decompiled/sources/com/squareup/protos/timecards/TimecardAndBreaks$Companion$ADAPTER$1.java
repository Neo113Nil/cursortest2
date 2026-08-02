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
public final class TimecardAndBreaks$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TimecardAndBreaks((Timecard) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Timecard.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(TimecardBreak.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TimecardAndBreaks timecardAndBreaks = (TimecardAndBreaks) obj;
        reverseProtoWriter.getClass();
        timecardAndBreaks.getClass();
        reverseProtoWriter.writeBytes(timecardAndBreaks.unknownFields());
        TimecardBreak.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, timecardAndBreaks.breaks);
        Timecard.ADAPTER.encodeWithTag(reverseProtoWriter, 1, timecardAndBreaks.timecard);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TimecardAndBreaks timecardAndBreaks = (TimecardAndBreaks) obj;
        timecardAndBreaks.getClass();
        return TimecardBreak.ADAPTER.asRepeated().encodedSizeWithTag(2, timecardAndBreaks.breaks) + Timecard.ADAPTER.encodedSizeWithTag(1, timecardAndBreaks.timecard) + timecardAndBreaks.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TimecardAndBreaks timecardAndBreaks = (TimecardAndBreaks) obj;
        timecardAndBreaks.getClass();
        Timecard timecard = timecardAndBreaks.timecard;
        Timecard timecard2 = timecard != null ? (Timecard) Timecard.ADAPTER.redact(timecard) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(timecardAndBreaks.breaks, TimecardBreak.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new TimecardAndBreaks(timecard2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TimecardAndBreaks timecardAndBreaks = (TimecardAndBreaks) obj;
        timecardAndBreaks.getClass();
        Timecard.ADAPTER.encodeWithTag(protoWriter, 1, timecardAndBreaks.timecard);
        TimecardBreak.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, timecardAndBreaks.breaks);
        protoWriter.writeBytes(timecardAndBreaks.unknownFields());
    }
}
