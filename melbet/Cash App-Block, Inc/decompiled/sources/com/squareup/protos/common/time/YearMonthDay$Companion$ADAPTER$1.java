package com.squareup.protos.common.time;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class YearMonthDay$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new YearMonthDay((Integer) obj, (Integer) obj2, (Integer) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT32.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        YearMonthDay yearMonthDay = (YearMonthDay) obj;
        reverseProtoWriter.getClass();
        yearMonthDay.getClass();
        reverseProtoWriter.writeBytes(yearMonthDay.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, yearMonthDay.day_of_month);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, yearMonthDay.month_of_year);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, yearMonthDay.year);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        YearMonthDay yearMonthDay = (YearMonthDay) obj;
        yearMonthDay.getClass();
        int size$okio = yearMonthDay.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        return protoAdapter.encodedSizeWithTag(3, yearMonthDay.day_of_month) + protoAdapter.encodedSizeWithTag(2, yearMonthDay.month_of_year) + protoAdapter.encodedSizeWithTag(1, yearMonthDay.year) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        YearMonthDay yearMonthDay = (YearMonthDay) obj;
        yearMonthDay.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = yearMonthDay.year;
        Integer num2 = yearMonthDay.month_of_year;
        Integer num3 = yearMonthDay.day_of_month;
        byteString.getClass();
        return new YearMonthDay(num, num2, num3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        YearMonthDay yearMonthDay = (YearMonthDay) obj;
        yearMonthDay.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT32;
        protoAdapter.encodeWithTag(protoWriter, 1, yearMonthDay.year);
        protoAdapter.encodeWithTag(protoWriter, 2, yearMonthDay.month_of_year);
        protoAdapter.encodeWithTag(protoWriter, 3, yearMonthDay.day_of_month);
        protoWriter.writeBytes(yearMonthDay.unknownFields());
    }
}
