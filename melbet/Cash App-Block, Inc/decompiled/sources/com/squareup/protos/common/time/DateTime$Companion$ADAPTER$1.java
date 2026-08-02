package com.squareup.protos.common.time;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DateTime$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new DateTime((Long) obj, (Integer) obj2, (String) obj3, m, (Long) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.SINT32.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DateTime dateTime = (DateTime) obj;
        reverseProtoWriter.getClass();
        dateTime.getClass();
        reverseProtoWriter.writeBytes(dateTime.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, dateTime.ordinal);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 4, dateTime.tz_name);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 3, dateTime.posix_tz);
        ProtoAdapter.SINT32.encodeWithTag(reverseProtoWriter, 2, dateTime.timezone_offset_min);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, dateTime.instant_usec);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DateTime dateTime = (DateTime) obj;
        dateTime.getClass();
        int size$okio = dateTime.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = ProtoAdapter.SINT32.encodedSizeWithTag(2, dateTime.timezone_offset_min) + protoAdapter.encodedSizeWithTag(1, dateTime.instant_usec) + size$okio;
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, dateTime.ordinal) + protoAdapter2.asRepeated().encodedSizeWithTag(4, dateTime.tz_name) + protoAdapter2.encodedSizeWithTag(3, dateTime.posix_tz) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DateTime dateTime = (DateTime) obj;
        dateTime.getClass();
        ByteString byteString = ByteString.EMPTY;
        Long l = dateTime.instant_usec;
        Integer num = dateTime.timezone_offset_min;
        String str = dateTime.posix_tz;
        List list = dateTime.tz_name;
        Long l2 = dateTime.ordinal;
        list.getClass();
        byteString.getClass();
        return new DateTime(l, num, str, list, l2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DateTime dateTime = (DateTime) obj;
        dateTime.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, dateTime.instant_usec);
        ProtoAdapter.SINT32.encodeWithTag(protoWriter, 2, dateTime.timezone_offset_min);
        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
        protoAdapter2.encodeWithTag(protoWriter, 3, dateTime.posix_tz);
        protoAdapter2.asRepeated().encodeWithTag(protoWriter, 4, dateTime.tz_name);
        protoAdapter.encodeWithTag(protoWriter, 5, dateTime.ordinal);
        protoWriter.writeBytes(dateTime.unknownFields());
    }
}
