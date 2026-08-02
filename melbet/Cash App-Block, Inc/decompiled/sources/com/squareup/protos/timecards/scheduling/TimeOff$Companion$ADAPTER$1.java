package com.squareup.protos.timecards.scheduling;

import com.google.android.gms.internal.mlkit_vision_face.zzkn;
import com.squareup.protos.timecards.scheduling.TimeOff;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TimeOff$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        zzkn timeOff$DateRange$LocalDateRange;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        zzkn zzknVar = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TimeOff((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, zzknVar, (TimeOff.State) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 4:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 6:
                    timeOff$DateRange$LocalDateRange = new TimeOff$DateRange$LocalDateRange((LocalDateRange) LocalDateRange.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    timeOff$DateRange$LocalDateRange = new TimeOff$DateRange$ZonedDateRange((ZonedDateRange) ZonedDateRange.ADAPTER.decode(protoReader));
                    break;
                case 8:
                    try {
                        obj6 = TimeOff.State.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
            }
            zzknVar = timeOff$DateRange$LocalDateRange;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TimeOff timeOff = (TimeOff) obj;
        reverseProtoWriter.getClass();
        timeOff.getClass();
        reverseProtoWriter.writeBytes(timeOff.unknownFields());
        zzkn zzknVar = timeOff.date_range;
        if (zzknVar instanceof TimeOff$DateRange$LocalDateRange) {
            LocalDateRange.ADAPTER.encodeWithTag(reverseProtoWriter, 6, ((TimeOff$DateRange$LocalDateRange) zzknVar).value);
        } else if (zzknVar instanceof TimeOff$DateRange$ZonedDateRange) {
            ZonedDateRange.ADAPTER.encodeWithTag(reverseProtoWriter, 7, ((TimeOff$DateRange$ZonedDateRange) zzknVar).value);
        } else if (zzknVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        TimeOff.State.ADAPTER.encodeWithTag(reverseProtoWriter, 8, timeOff.state);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, timeOff.note);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, timeOff.stop_datetime);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, timeOff.start_datetime);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, timeOff.team_member_id);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, timeOff.id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        TimeOff timeOff = (TimeOff) obj;
        timeOff.getClass();
        int size$okio = timeOff.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(5, timeOff.note) + protoAdapter.encodedSizeWithTag(4, timeOff.stop_datetime) + protoAdapter.encodedSizeWithTag(3, timeOff.start_datetime) + protoAdapter.encodedSizeWithTag(2, timeOff.team_member_id) + protoAdapter.encodedSizeWithTag(1, timeOff.id) + size$okio;
        zzkn zzknVar = timeOff.date_range;
        if (zzknVar instanceof TimeOff$DateRange$LocalDateRange) {
            encodedSizeWithTag = LocalDateRange.ADAPTER.encodedSizeWithTag(6, ((TimeOff$DateRange$LocalDateRange) zzknVar).value);
        } else {
            if (!(zzknVar instanceof TimeOff$DateRange$ZonedDateRange)) {
                if (zzknVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return TimeOff.State.ADAPTER.encodedSizeWithTag(8, timeOff.state) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = ZonedDateRange.ADAPTER.encodedSizeWithTag(7, ((TimeOff$DateRange$ZonedDateRange) zzknVar).value);
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        return TimeOff.State.ADAPTER.encodedSizeWithTag(8, timeOff.state) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TimeOff timeOff = (TimeOff) obj;
        timeOff.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = timeOff.id;
        String str2 = timeOff.team_member_id;
        String str3 = timeOff.start_datetime;
        String str4 = timeOff.stop_datetime;
        zzkn zzknVar = timeOff.date_range;
        TimeOff.State state = timeOff.state;
        byteString.getClass();
        return new TimeOff(str, str2, str3, str4, null, zzknVar, state, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TimeOff timeOff = (TimeOff) obj;
        timeOff.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, timeOff.id);
        protoAdapter.encodeWithTag(protoWriter, 2, timeOff.team_member_id);
        protoAdapter.encodeWithTag(protoWriter, 3, timeOff.start_datetime);
        protoAdapter.encodeWithTag(protoWriter, 4, timeOff.stop_datetime);
        protoAdapter.encodeWithTag(protoWriter, 5, timeOff.note);
        TimeOff.State.ADAPTER.encodeWithTag(protoWriter, 8, timeOff.state);
        zzkn zzknVar = timeOff.date_range;
        if (zzknVar instanceof TimeOff$DateRange$LocalDateRange) {
            LocalDateRange.ADAPTER.encodeWithTag(protoWriter, 6, ((TimeOff$DateRange$LocalDateRange) zzknVar).value);
        } else if (zzknVar instanceof TimeOff$DateRange$ZonedDateRange) {
            ZonedDateRange.ADAPTER.encodeWithTag(protoWriter, 7, ((TimeOff$DateRange$ZonedDateRange) zzknVar).value);
        } else if (zzknVar != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(timeOff.unknownFields());
    }
}
