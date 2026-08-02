package com.squareup.protos.common.calendar;

import com.squareup.protos.common.calendar.CalendarEvent;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CalendarEvent$Recurrence$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CalendarEvent.Recurrence((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CalendarEvent.Recurrence recurrence = (CalendarEvent.Recurrence) obj;
        reverseProtoWriter.getClass();
        recurrence.getClass();
        reverseProtoWriter.writeBytes(recurrence.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, recurrence.exdate);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, recurrence.rrule);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CalendarEvent.Recurrence recurrence = (CalendarEvent.Recurrence) obj;
        recurrence.getClass();
        int size$okio = recurrence.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, recurrence.exdate) + protoAdapter.encodedSizeWithTag(1, recurrence.rrule) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CalendarEvent.Recurrence recurrence = (CalendarEvent.Recurrence) obj;
        recurrence.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = recurrence.rrule;
        String str2 = recurrence.exdate;
        byteString.getClass();
        return new CalendarEvent.Recurrence(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CalendarEvent.Recurrence recurrence = (CalendarEvent.Recurrence) obj;
        recurrence.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, recurrence.rrule);
        protoAdapter.encodeWithTag(protoWriter, 2, recurrence.exdate);
        protoWriter.writeBytes(recurrence.unknownFields());
    }
}
