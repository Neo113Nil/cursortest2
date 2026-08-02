package com.squareup.protos.roster.business_hours;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class SpecialBusinessHoursPeriod$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SpecialBusinessHoursPeriod((String) obj, (String) obj2, m, arrayList, (String) obj3, (Boolean) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 3:
                    m.add(TimePeriod.ADAPTER.decode(protoReader));
                    break;
                case 4:
                    try {
                        DayOfWeek.ADAPTER.tryDecode(protoReader, arrayList);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 5:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    obj4 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SpecialBusinessHoursPeriod specialBusinessHoursPeriod = (SpecialBusinessHoursPeriod) obj;
        reverseProtoWriter.getClass();
        specialBusinessHoursPeriod.getClass();
        reverseProtoWriter.writeBytes(specialBusinessHoursPeriod.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 6, specialBusinessHoursPeriod.is_closed);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, specialBusinessHoursPeriod.reason);
        DayOfWeek.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 4, specialBusinessHoursPeriod.days_of_week);
        TimePeriod.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, specialBusinessHoursPeriod.time_periods);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, specialBusinessHoursPeriod.end_date);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, specialBusinessHoursPeriod.start_date);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SpecialBusinessHoursPeriod specialBusinessHoursPeriod = (SpecialBusinessHoursPeriod) obj;
        specialBusinessHoursPeriod.getClass();
        int size$okio = specialBusinessHoursPeriod.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.BOOL.encodedSizeWithTag(6, specialBusinessHoursPeriod.is_closed) + protoAdapter.encodedSizeWithTag(5, specialBusinessHoursPeriod.reason) + DayOfWeek.ADAPTER.asRepeated().encodedSizeWithTag(4, specialBusinessHoursPeriod.days_of_week) + TimePeriod.ADAPTER.asRepeated().encodedSizeWithTag(3, specialBusinessHoursPeriod.time_periods) + protoAdapter.encodedSizeWithTag(2, specialBusinessHoursPeriod.end_date) + protoAdapter.encodedSizeWithTag(1, specialBusinessHoursPeriod.start_date) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SpecialBusinessHoursPeriod specialBusinessHoursPeriod = (SpecialBusinessHoursPeriod) obj;
        specialBusinessHoursPeriod.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(specialBusinessHoursPeriod.time_periods, TimePeriod.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        String str = specialBusinessHoursPeriod.start_date;
        String str2 = specialBusinessHoursPeriod.end_date;
        List list = specialBusinessHoursPeriod.days_of_week;
        String str3 = specialBusinessHoursPeriod.reason;
        Boolean bool = specialBusinessHoursPeriod.is_closed;
        list.getClass();
        byteString.getClass();
        return new SpecialBusinessHoursPeriod(str, str2, m1169redactElements, list, str3, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SpecialBusinessHoursPeriod specialBusinessHoursPeriod = (SpecialBusinessHoursPeriod) obj;
        specialBusinessHoursPeriod.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, specialBusinessHoursPeriod.start_date);
        protoAdapter.encodeWithTag(protoWriter, 2, specialBusinessHoursPeriod.end_date);
        TimePeriod.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, specialBusinessHoursPeriod.time_periods);
        DayOfWeek.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, specialBusinessHoursPeriod.days_of_week);
        protoAdapter.encodeWithTag(protoWriter, 5, specialBusinessHoursPeriod.reason);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, specialBusinessHoursPeriod.is_closed);
        protoWriter.writeBytes(specialBusinessHoursPeriod.unknownFields());
    }
}
