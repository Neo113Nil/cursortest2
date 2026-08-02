package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LocalDateTimeRange$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalDateTimeRange((LocalDateTime) obj, (LocalDateTime) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalDateTime.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalDateTime.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalDateTimeRange localDateTimeRange = (LocalDateTimeRange) obj;
        reverseProtoWriter.getClass();
        localDateTimeRange.getClass();
        reverseProtoWriter.writeBytes(localDateTimeRange.unknownFields());
        ProtoAdapter protoAdapter = LocalDateTime.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localDateTimeRange.stop);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localDateTimeRange.start);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalDateTimeRange localDateTimeRange = (LocalDateTimeRange) obj;
        localDateTimeRange.getClass();
        int size$okio = localDateTimeRange.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalDateTime.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, localDateTimeRange.stop) + protoAdapter.encodedSizeWithTag(1, localDateTimeRange.start) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalDateTimeRange localDateTimeRange = (LocalDateTimeRange) obj;
        localDateTimeRange.getClass();
        LocalDateTime localDateTime = localDateTimeRange.start;
        LocalDateTime localDateTime2 = localDateTime != null ? (LocalDateTime) LocalDateTime.ADAPTER.redact(localDateTime) : null;
        LocalDateTime localDateTime3 = localDateTimeRange.stop;
        LocalDateTime localDateTime4 = localDateTime3 != null ? (LocalDateTime) LocalDateTime.ADAPTER.redact(localDateTime3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LocalDateTimeRange(localDateTime2, localDateTime4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalDateTimeRange localDateTimeRange = (LocalDateTimeRange) obj;
        localDateTimeRange.getClass();
        ProtoAdapter protoAdapter = LocalDateTime.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, localDateTimeRange.start);
        protoAdapter.encodeWithTag(protoWriter, 2, localDateTimeRange.stop);
        protoWriter.writeBytes(localDateTimeRange.unknownFields());
    }
}
