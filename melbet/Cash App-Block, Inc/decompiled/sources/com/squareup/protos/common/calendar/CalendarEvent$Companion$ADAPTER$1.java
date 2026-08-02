package com.squareup.protos.common.calendar;

import androidx.room.TransactorKt;
import com.squareup.protos.common.calendar.CalendarEvent;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CalendarEvent$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CalendarEvent((String) obj, (String) obj2, (String) obj3, (String) obj4, (CalendarEvent.Recurrence) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(CalendarEvent.Recurrence.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CalendarEvent calendarEvent = (CalendarEvent) obj;
        reverseProtoWriter.getClass();
        calendarEvent.getClass();
        reverseProtoWriter.writeBytes(calendarEvent.unknownFields());
        CalendarEvent.Recurrence.ADAPTER.encodeWithTag(reverseProtoWriter, 5, calendarEvent.recurrence_info);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, calendarEvent.time_zone);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, calendarEvent.stop_datetime);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, calendarEvent.start_datetime);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, calendarEvent.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CalendarEvent calendarEvent = (CalendarEvent) obj;
        calendarEvent.getClass();
        int size$okio = calendarEvent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return CalendarEvent.Recurrence.ADAPTER.encodedSizeWithTag(5, calendarEvent.recurrence_info) + protoAdapter.encodedSizeWithTag(4, calendarEvent.time_zone) + protoAdapter.encodedSizeWithTag(3, calendarEvent.stop_datetime) + protoAdapter.encodedSizeWithTag(2, calendarEvent.start_datetime) + protoAdapter.encodedSizeWithTag(1, calendarEvent.id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CalendarEvent calendarEvent = (CalendarEvent) obj;
        calendarEvent.getClass();
        CalendarEvent.Recurrence recurrence = calendarEvent.recurrence_info;
        CalendarEvent.Recurrence recurrence2 = recurrence != null ? (CalendarEvent.Recurrence) CalendarEvent.Recurrence.ADAPTER.redact(recurrence) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = calendarEvent.id;
        String str2 = calendarEvent.start_datetime;
        String str3 = calendarEvent.stop_datetime;
        String str4 = calendarEvent.time_zone;
        byteString.getClass();
        return new CalendarEvent(str, str2, str3, str4, recurrence2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CalendarEvent calendarEvent = (CalendarEvent) obj;
        calendarEvent.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, calendarEvent.id);
        protoAdapter.encodeWithTag(protoWriter, 2, calendarEvent.start_datetime);
        protoAdapter.encodeWithTag(protoWriter, 3, calendarEvent.stop_datetime);
        protoAdapter.encodeWithTag(protoWriter, 4, calendarEvent.time_zone);
        CalendarEvent.Recurrence.ADAPTER.encodeWithTag(protoWriter, 5, calendarEvent.recurrence_info);
        protoWriter.writeBytes(calendarEvent.unknownFields());
    }
}
