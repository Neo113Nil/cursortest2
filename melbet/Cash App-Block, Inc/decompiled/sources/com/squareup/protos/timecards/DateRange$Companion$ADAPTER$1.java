package com.squareup.protos.timecards;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DateRange$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DateRange((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        DateRange dateRange = (DateRange) obj;
        reverseProtoWriter.getClass();
        dateRange.getClass();
        reverseProtoWriter.writeBytes(dateRange.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, dateRange.stop_date);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, dateRange.start_date);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DateRange dateRange = (DateRange) obj;
        dateRange.getClass();
        int size$okio = dateRange.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, dateRange.stop_date) + protoAdapter.encodedSizeWithTag(1, dateRange.start_date) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DateRange dateRange = (DateRange) obj;
        dateRange.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = dateRange.start_date;
        String str2 = dateRange.stop_date;
        byteString.getClass();
        return new DateRange(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DateRange dateRange = (DateRange) obj;
        dateRange.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, dateRange.start_date);
        protoAdapter.encodeWithTag(protoWriter, 2, dateRange.stop_date);
        protoWriter.writeBytes(dateRange.unknownFields());
    }
}
