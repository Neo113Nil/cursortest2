package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.protos.timecards.TimecardEvent;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TimecardEvent$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new TimecardEvent((String) obj, (String) obj2, (String) obj3, (TimecardEvent.EventType) obj4, (Timecard) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                try {
                    obj4 = TimecardEvent.EventType.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 5) {
                obj5 = TransactorKt.decodeMessageOrMerge(Timecard.ADAPTER, protoReader, obj5);
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TimecardEvent timecardEvent = (TimecardEvent) obj;
        reverseProtoWriter.getClass();
        timecardEvent.getClass();
        reverseProtoWriter.writeBytes(timecardEvent.unknownFields());
        Timecard.ADAPTER.encodeWithTag(reverseProtoWriter, 5, timecardEvent.point_in_time_timecard);
        TimecardEvent.EventType.ADAPTER.encodeWithTag(reverseProtoWriter, 4, timecardEvent.event_type);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, timecardEvent.creator_employee_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, timecardEvent.transaction_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, timecardEvent.token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TimecardEvent timecardEvent = (TimecardEvent) obj;
        timecardEvent.getClass();
        int size$okio = timecardEvent.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Timecard.ADAPTER.encodedSizeWithTag(5, timecardEvent.point_in_time_timecard) + TimecardEvent.EventType.ADAPTER.encodedSizeWithTag(4, timecardEvent.event_type) + protoAdapter.encodedSizeWithTag(3, timecardEvent.creator_employee_token) + protoAdapter.encodedSizeWithTag(6, timecardEvent.transaction_token) + protoAdapter.encodedSizeWithTag(1, timecardEvent.token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TimecardEvent timecardEvent = (TimecardEvent) obj;
        timecardEvent.getClass();
        Timecard timecard = timecardEvent.point_in_time_timecard;
        Timecard timecard2 = timecard != null ? (Timecard) Timecard.ADAPTER.redact(timecard) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = timecardEvent.token;
        String str2 = timecardEvent.transaction_token;
        String str3 = timecardEvent.creator_employee_token;
        TimecardEvent.EventType eventType = timecardEvent.event_type;
        byteString.getClass();
        return new TimecardEvent(str, str2, str3, eventType, timecard2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TimecardEvent timecardEvent = (TimecardEvent) obj;
        timecardEvent.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, timecardEvent.token);
        protoAdapter.encodeWithTag(protoWriter, 6, timecardEvent.transaction_token);
        protoAdapter.encodeWithTag(protoWriter, 3, timecardEvent.creator_employee_token);
        TimecardEvent.EventType.ADAPTER.encodeWithTag(protoWriter, 4, timecardEvent.event_type);
        Timecard.ADAPTER.encodeWithTag(protoWriter, 5, timecardEvent.point_in_time_timecard);
        protoWriter.writeBytes(timecardEvent.unknownFields());
    }
}
