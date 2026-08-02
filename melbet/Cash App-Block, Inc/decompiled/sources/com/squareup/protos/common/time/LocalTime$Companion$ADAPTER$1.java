package com.squareup.protos.common.time;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LocalTime$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalTime((Integer) obj, (Integer) obj2, (Integer) obj3, (Integer) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalTime localTime = (LocalTime) obj;
        reverseProtoWriter.getClass();
        localTime.getClass();
        reverseProtoWriter.writeBytes(localTime.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, localTime.millis_of_second);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, localTime.second_of_minute);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localTime.minute_of_hour);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localTime.hour_of_day);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalTime localTime = (LocalTime) obj;
        localTime.getClass();
        int size$okio = localTime.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return protoAdapter.encodedSizeWithTag(4, localTime.millis_of_second) + protoAdapter.encodedSizeWithTag(3, localTime.second_of_minute) + protoAdapter.encodedSizeWithTag(2, localTime.minute_of_hour) + protoAdapter.encodedSizeWithTag(1, localTime.hour_of_day) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalTime localTime = (LocalTime) obj;
        localTime.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = localTime.hour_of_day;
        Integer num2 = localTime.minute_of_hour;
        Integer num3 = localTime.second_of_minute;
        Integer num4 = localTime.millis_of_second;
        byteString.getClass();
        return new LocalTime(num, num2, num3, num4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalTime localTime = (LocalTime) obj;
        localTime.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, localTime.hour_of_day);
        protoAdapter.encodeWithTag(protoWriter, 2, localTime.minute_of_hour);
        protoAdapter.encodeWithTag(protoWriter, 3, localTime.second_of_minute);
        protoAdapter.encodeWithTag(protoWriter, 4, localTime.millis_of_second);
        protoWriter.writeBytes(localTime.unknownFields());
    }
}
