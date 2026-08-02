package com.squareup.protos.timecards.scheduling;

import androidx.room.TransactorKt;
import com.squareup.protos.common.calendar.CalendarEvent;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ShiftSchedule$Version$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ShiftSchedule.Version((String) obj, (String) obj2, (String) obj3, (String) obj4, (CalendarEvent) obj5, (String) obj6, (Boolean) obj7, (Boolean) obj8, (String) obj9, (String) obj10, (ShiftCover) obj11, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    obj5 = TransactorKt.decodeMessageOrMerge(CalendarEvent.ADAPTER, protoReader, obj5);
                    break;
                case 5:
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 6:
                    obj9 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 7:
                    obj10 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 8:
                    obj6 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 9:
                    obj8 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                case 10:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 11:
                    obj11 = TransactorKt.decodeMessageOrMerge(ShiftCover.ADAPTER, protoReader, obj11);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ShiftSchedule.Version version = (ShiftSchedule.Version) obj;
        reverseProtoWriter.getClass();
        version.getClass();
        reverseProtoWriter.writeBytes(version.unknownFields());
        ShiftCover.ADAPTER.encodeWithTag(reverseProtoWriter, 11, version.shift_cover);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 7, version.updated_at);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, version.created_at);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 9, version.deleted);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 5, version.published);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, version.notes);
        CalendarEvent.ADAPTER.encodeWithTag(reverseProtoWriter, 4, version.calendar_event);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, version.team_member_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, version.location_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, version.job_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, version.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ShiftSchedule.Version version = (ShiftSchedule.Version) obj;
        version.getClass();
        int size$okio = version.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(8, version.notes) + CalendarEvent.ADAPTER.encodedSizeWithTag(4, version.calendar_event) + protoAdapter.encodedSizeWithTag(3, version.team_member_id) + protoAdapter.encodedSizeWithTag(2, version.location_id) + protoAdapter.encodedSizeWithTag(1, version.job_id) + protoAdapter.encodedSizeWithTag(10, version.id) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        return ShiftCover.ADAPTER.encodedSizeWithTag(11, version.shift_cover) + protoAdapter.encodedSizeWithTag(7, version.updated_at) + protoAdapter.encodedSizeWithTag(6, version.created_at) + protoAdapter2.encodedSizeWithTag(9, version.deleted) + protoAdapter2.encodedSizeWithTag(5, version.published) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ShiftSchedule.Version version = (ShiftSchedule.Version) obj;
        version.getClass();
        CalendarEvent calendarEvent = version.calendar_event;
        CalendarEvent calendarEvent2 = calendarEvent != null ? (CalendarEvent) CalendarEvent.ADAPTER.redact(calendarEvent) : null;
        ShiftCover shiftCover = version.shift_cover;
        ShiftCover shiftCover2 = shiftCover != null ? (ShiftCover) ShiftCover.ADAPTER.redact(shiftCover) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = version.id;
        String str2 = version.job_id;
        String str3 = version.location_id;
        String str4 = version.team_member_id;
        Boolean bool = version.published;
        Boolean bool2 = version.deleted;
        String str5 = version.created_at;
        String str6 = version.updated_at;
        byteString.getClass();
        return new ShiftSchedule.Version(str, str2, str3, str4, calendarEvent2, null, bool, bool2, str5, str6, shiftCover2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ShiftSchedule.Version version = (ShiftSchedule.Version) obj;
        version.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 10, version.id);
        protoAdapter.encodeWithTag(protoWriter, 1, version.job_id);
        protoAdapter.encodeWithTag(protoWriter, 2, version.location_id);
        protoAdapter.encodeWithTag(protoWriter, 3, version.team_member_id);
        CalendarEvent.ADAPTER.encodeWithTag(protoWriter, 4, version.calendar_event);
        protoAdapter.encodeWithTag(protoWriter, 8, version.notes);
        ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
        protoAdapter2.encodeWithTag(protoWriter, 5, version.published);
        protoAdapter2.encodeWithTag(protoWriter, 9, version.deleted);
        protoAdapter.encodeWithTag(protoWriter, 6, version.created_at);
        protoAdapter.encodeWithTag(protoWriter, 7, version.updated_at);
        ShiftCover.ADAPTER.encodeWithTag(protoWriter, 11, version.shift_cover);
        protoWriter.writeBytes(version.unknownFields());
    }
}
