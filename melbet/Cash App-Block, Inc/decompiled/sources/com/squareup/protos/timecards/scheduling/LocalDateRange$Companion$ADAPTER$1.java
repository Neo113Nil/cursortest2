package com.squareup.protos.timecards.scheduling;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LocalDateRange$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalDateRange((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        LocalDateRange localDateRange = (LocalDateRange) obj;
        reverseProtoWriter.getClass();
        localDateRange.getClass();
        reverseProtoWriter.writeBytes(localDateRange.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localDateRange.stop_datetime);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localDateRange.start_datetime);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalDateRange localDateRange = (LocalDateRange) obj;
        localDateRange.getClass();
        int size$okio = localDateRange.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, localDateRange.stop_datetime) + protoAdapter.encodedSizeWithTag(1, localDateRange.start_datetime) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalDateRange localDateRange = (LocalDateRange) obj;
        localDateRange.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = localDateRange.start_datetime;
        String str2 = localDateRange.stop_datetime;
        byteString.getClass();
        return new LocalDateRange(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalDateRange localDateRange = (LocalDateRange) obj;
        localDateRange.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, localDateRange.start_datetime);
        protoAdapter.encodeWithTag(protoWriter, 2, localDateRange.stop_datetime);
        protoWriter.writeBytes(localDateRange.unknownFields());
    }
}
