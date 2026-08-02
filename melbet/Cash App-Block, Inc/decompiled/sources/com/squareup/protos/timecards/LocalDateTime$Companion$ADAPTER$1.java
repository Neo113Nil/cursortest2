package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.protos.common.time.LocalTime;
import com.squareup.protos.common.time.YearMonthDay;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LocalDateTime$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LocalDateTime((YearMonthDay) obj, (LocalTime) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(YearMonthDay.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalTime.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalDateTime localDateTime = (LocalDateTime) obj;
        reverseProtoWriter.getClass();
        localDateTime.getClass();
        reverseProtoWriter.writeBytes(localDateTime.unknownFields());
        LocalTime.ADAPTER.encodeWithTag(reverseProtoWriter, 2, localDateTime.local_time);
        YearMonthDay.ADAPTER.encodeWithTag(reverseProtoWriter, 1, localDateTime.local_date);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalDateTime localDateTime = (LocalDateTime) obj;
        localDateTime.getClass();
        return LocalTime.ADAPTER.encodedSizeWithTag(2, localDateTime.local_time) + YearMonthDay.ADAPTER.encodedSizeWithTag(1, localDateTime.local_date) + localDateTime.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalDateTime localDateTime = (LocalDateTime) obj;
        localDateTime.getClass();
        YearMonthDay yearMonthDay = localDateTime.local_date;
        YearMonthDay yearMonthDay2 = yearMonthDay != null ? (YearMonthDay) YearMonthDay.ADAPTER.redact(yearMonthDay) : null;
        LocalTime localTime = localDateTime.local_time;
        LocalTime localTime2 = localTime != null ? (LocalTime) LocalTime.ADAPTER.redact(localTime) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LocalDateTime(yearMonthDay2, localTime2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalDateTime localDateTime = (LocalDateTime) obj;
        localDateTime.getClass();
        YearMonthDay.ADAPTER.encodeWithTag(protoWriter, 1, localDateTime.local_date);
        LocalTime.ADAPTER.encodeWithTag(protoWriter, 2, localDateTime.local_time);
        protoWriter.writeBytes(localDateTime.unknownFields());
    }
}
