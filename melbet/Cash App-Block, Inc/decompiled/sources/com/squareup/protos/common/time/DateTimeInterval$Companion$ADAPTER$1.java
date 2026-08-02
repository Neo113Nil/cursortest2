package com.squareup.protos.common.time;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class DateTimeInterval$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new DateTimeInterval((DateTime) obj, (DateTime) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(DateTime.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(DateTime.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        DateTimeInterval dateTimeInterval = (DateTimeInterval) obj;
        reverseProtoWriter.getClass();
        dateTimeInterval.getClass();
        reverseProtoWriter.writeBytes(dateTimeInterval.unknownFields());
        ProtoAdapter protoAdapter = DateTime.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, dateTimeInterval.exclusive_end);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, dateTimeInterval.inclusive_start);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        DateTimeInterval dateTimeInterval = (DateTimeInterval) obj;
        dateTimeInterval.getClass();
        int size$okio = dateTimeInterval.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = DateTime.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, dateTimeInterval.exclusive_end) + protoAdapter.encodedSizeWithTag(1, dateTimeInterval.inclusive_start) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        DateTimeInterval dateTimeInterval = (DateTimeInterval) obj;
        dateTimeInterval.getClass();
        DateTime dateTime = dateTimeInterval.inclusive_start;
        DateTime dateTime2 = dateTime != null ? (DateTime) DateTime.ADAPTER.redact(dateTime) : null;
        DateTime dateTime3 = dateTimeInterval.exclusive_end;
        DateTime dateTime4 = dateTime3 != null ? (DateTime) DateTime.ADAPTER.redact(dateTime3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new DateTimeInterval(dateTime2, dateTime4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        DateTimeInterval dateTimeInterval = (DateTimeInterval) obj;
        dateTimeInterval.getClass();
        ProtoAdapter protoAdapter = DateTime.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, dateTimeInterval.inclusive_start);
        protoAdapter.encodeWithTag(protoWriter, 2, dateTimeInterval.exclusive_end);
        protoWriter.writeBytes(dateTimeInterval.unknownFields());
    }
}
