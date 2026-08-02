package com.squareup.protos.timecards;

import androidx.room.TransactorKt;
import com.squareup.protos.common.time.YearMonthDay;
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
                return new LocalDateRange((YearMonthDay) obj, (YearMonthDay) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(YearMonthDay.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(YearMonthDay.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalDateRange localDateRange = (LocalDateRange) obj;
        reverseProtoWriter.getClass();
        localDateRange.getClass();
        reverseProtoWriter.writeBytes(localDateRange.unknownFields());
        ProtoAdapter protoAdapter = YearMonthDay.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, localDateRange.stop);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, localDateRange.start);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalDateRange localDateRange = (LocalDateRange) obj;
        localDateRange.getClass();
        int size$okio = localDateRange.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = YearMonthDay.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, localDateRange.stop) + protoAdapter.encodedSizeWithTag(1, localDateRange.start) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalDateRange localDateRange = (LocalDateRange) obj;
        localDateRange.getClass();
        YearMonthDay yearMonthDay = localDateRange.start;
        YearMonthDay yearMonthDay2 = yearMonthDay != null ? (YearMonthDay) YearMonthDay.ADAPTER.redact(yearMonthDay) : null;
        YearMonthDay yearMonthDay3 = localDateRange.stop;
        YearMonthDay yearMonthDay4 = yearMonthDay3 != null ? (YearMonthDay) YearMonthDay.ADAPTER.redact(yearMonthDay3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LocalDateRange(yearMonthDay2, yearMonthDay4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalDateRange localDateRange = (LocalDateRange) obj;
        localDateRange.getClass();
        ProtoAdapter protoAdapter = YearMonthDay.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, localDateRange.start);
        protoAdapter.encodeWithTag(protoWriter, 2, localDateRange.stop);
        protoWriter.writeBytes(localDateRange.unknownFields());
    }
}
