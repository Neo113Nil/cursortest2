package com.squareup.protos.roster.business_hours;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TimePeriod$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TimePeriod((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        TimePeriod timePeriod = (TimePeriod) obj;
        reverseProtoWriter.getClass();
        timePeriod.getClass();
        reverseProtoWriter.writeBytes(timePeriod.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, timePeriod.end_local_time);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, timePeriod.start_local_time);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TimePeriod timePeriod = (TimePeriod) obj;
        timePeriod.getClass();
        int size$okio = timePeriod.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, timePeriod.end_local_time) + protoAdapter.encodedSizeWithTag(1, timePeriod.start_local_time) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TimePeriod timePeriod = (TimePeriod) obj;
        timePeriod.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = timePeriod.start_local_time;
        String str2 = timePeriod.end_local_time;
        byteString.getClass();
        return new TimePeriod(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TimePeriod timePeriod = (TimePeriod) obj;
        timePeriod.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, timePeriod.start_local_time);
        protoAdapter.encodeWithTag(protoWriter, 2, timePeriod.end_local_time);
        protoWriter.writeBytes(timePeriod.unknownFields());
    }
}
