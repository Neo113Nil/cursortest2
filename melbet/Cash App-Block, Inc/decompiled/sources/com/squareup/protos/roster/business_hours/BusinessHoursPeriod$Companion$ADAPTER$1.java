package com.squareup.protos.roster.business_hours;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class BusinessHoursPeriod$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BusinessHoursPeriod((DayOfWeek) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = DayOfWeek.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BusinessHoursPeriod businessHoursPeriod = (BusinessHoursPeriod) obj;
        reverseProtoWriter.getClass();
        businessHoursPeriod.getClass();
        reverseProtoWriter.writeBytes(businessHoursPeriod.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, businessHoursPeriod.end_local_time);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, businessHoursPeriod.start_local_time);
        DayOfWeek.ADAPTER.encodeWithTag(reverseProtoWriter, 1, businessHoursPeriod.day_of_week);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BusinessHoursPeriod businessHoursPeriod = (BusinessHoursPeriod) obj;
        businessHoursPeriod.getClass();
        int encodedSizeWithTag = DayOfWeek.ADAPTER.encodedSizeWithTag(1, businessHoursPeriod.day_of_week) + businessHoursPeriod.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, businessHoursPeriod.end_local_time) + protoAdapter.encodedSizeWithTag(2, businessHoursPeriod.start_local_time) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BusinessHoursPeriod businessHoursPeriod = (BusinessHoursPeriod) obj;
        businessHoursPeriod.getClass();
        ByteString byteString = ByteString.EMPTY;
        DayOfWeek dayOfWeek = businessHoursPeriod.day_of_week;
        String str = businessHoursPeriod.start_local_time;
        String str2 = businessHoursPeriod.end_local_time;
        byteString.getClass();
        return new BusinessHoursPeriod(dayOfWeek, str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BusinessHoursPeriod businessHoursPeriod = (BusinessHoursPeriod) obj;
        businessHoursPeriod.getClass();
        DayOfWeek.ADAPTER.encodeWithTag(protoWriter, 1, businessHoursPeriod.day_of_week);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, businessHoursPeriod.start_local_time);
        protoAdapter.encodeWithTag(protoWriter, 3, businessHoursPeriod.end_local_time);
        protoWriter.writeBytes(businessHoursPeriod.unknownFields());
    }
}
