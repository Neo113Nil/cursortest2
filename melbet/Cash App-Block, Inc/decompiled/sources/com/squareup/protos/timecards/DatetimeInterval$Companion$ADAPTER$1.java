package com.squareup.protos.timecards;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DatetimeInterval$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DatetimeInterval((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        DatetimeInterval datetimeInterval = (DatetimeInterval) obj;
        reverseProtoWriter.getClass();
        datetimeInterval.getClass();
        reverseProtoWriter.writeBytes(datetimeInterval.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, datetimeInterval.end);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, datetimeInterval.start);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DatetimeInterval datetimeInterval = (DatetimeInterval) obj;
        datetimeInterval.getClass();
        int size$okio = datetimeInterval.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, datetimeInterval.end) + protoAdapter.encodedSizeWithTag(1, datetimeInterval.start) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DatetimeInterval datetimeInterval = (DatetimeInterval) obj;
        datetimeInterval.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = datetimeInterval.start;
        String str2 = datetimeInterval.end;
        byteString.getClass();
        return new DatetimeInterval(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DatetimeInterval datetimeInterval = (DatetimeInterval) obj;
        datetimeInterval.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, datetimeInterval.start);
        protoAdapter.encodeWithTag(protoWriter, 2, datetimeInterval.end);
        protoWriter.writeBytes(datetimeInterval.unknownFields());
    }
}
