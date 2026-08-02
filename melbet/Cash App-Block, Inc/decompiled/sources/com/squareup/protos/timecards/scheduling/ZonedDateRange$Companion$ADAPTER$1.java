package com.squareup.protos.timecards.scheduling;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ZonedDateRange$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ZonedDateRange((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
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
        ZonedDateRange zonedDateRange = (ZonedDateRange) obj;
        reverseProtoWriter.getClass();
        zonedDateRange.getClass();
        reverseProtoWriter.writeBytes(zonedDateRange.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, zonedDateRange.stop_time);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, zonedDateRange.start_time);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, zonedDateRange.timezone);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ZonedDateRange zonedDateRange = (ZonedDateRange) obj;
        zonedDateRange.getClass();
        int size$okio = zonedDateRange.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, zonedDateRange.stop_time) + protoAdapter.encodedSizeWithTag(2, zonedDateRange.start_time) + protoAdapter.encodedSizeWithTag(1, zonedDateRange.timezone) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ZonedDateRange zonedDateRange = (ZonedDateRange) obj;
        zonedDateRange.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = zonedDateRange.timezone;
        String str2 = zonedDateRange.start_time;
        String str3 = zonedDateRange.stop_time;
        byteString.getClass();
        return new ZonedDateRange(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ZonedDateRange zonedDateRange = (ZonedDateRange) obj;
        zonedDateRange.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, zonedDateRange.timezone);
        protoAdapter.encodeWithTag(protoWriter, 2, zonedDateRange.start_time);
        protoAdapter.encodeWithTag(protoWriter, 3, zonedDateRange.stop_time);
        protoWriter.writeBytes(zonedDateRange.unknownFields());
    }
}
