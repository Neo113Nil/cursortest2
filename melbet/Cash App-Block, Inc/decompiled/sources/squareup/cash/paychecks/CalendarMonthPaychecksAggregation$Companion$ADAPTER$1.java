package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class CalendarMonthPaychecksAggregation$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new CalendarMonthPaychecksAggregation((Long) obj, (Long) obj2, (TimeBoundedPaychecksAggregation) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(TimeBoundedPaychecksAggregation.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation = (CalendarMonthPaychecksAggregation) obj;
        reverseProtoWriter.getClass();
        calendarMonthPaychecksAggregation.getClass();
        reverseProtoWriter.writeBytes(calendarMonthPaychecksAggregation.unknownFields());
        TimeBoundedPaychecksAggregation.ADAPTER.encodeWithTag(reverseProtoWriter, 3, calendarMonthPaychecksAggregation.aggregation);
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, calendarMonthPaychecksAggregation.year);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, calendarMonthPaychecksAggregation.month_in_year);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation = (CalendarMonthPaychecksAggregation) obj;
        calendarMonthPaychecksAggregation.getClass();
        int size$okio = calendarMonthPaychecksAggregation.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        return TimeBoundedPaychecksAggregation.ADAPTER.encodedSizeWithTag(3, calendarMonthPaychecksAggregation.aggregation) + protoAdapter.encodedSizeWithTag(2, calendarMonthPaychecksAggregation.year) + protoAdapter.encodedSizeWithTag(1, calendarMonthPaychecksAggregation.month_in_year) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation = (CalendarMonthPaychecksAggregation) obj;
        calendarMonthPaychecksAggregation.getClass();
        TimeBoundedPaychecksAggregation timeBoundedPaychecksAggregation = calendarMonthPaychecksAggregation.aggregation;
        TimeBoundedPaychecksAggregation timeBoundedPaychecksAggregation2 = timeBoundedPaychecksAggregation != null ? (TimeBoundedPaychecksAggregation) TimeBoundedPaychecksAggregation.ADAPTER.redact(timeBoundedPaychecksAggregation) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = calendarMonthPaychecksAggregation.month_in_year;
        Long l2 = calendarMonthPaychecksAggregation.year;
        byteString.getClass();
        return new CalendarMonthPaychecksAggregation(l, l2, timeBoundedPaychecksAggregation2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation = (CalendarMonthPaychecksAggregation) obj;
        calendarMonthPaychecksAggregation.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, calendarMonthPaychecksAggregation.month_in_year);
        protoAdapter.encodeWithTag(protoWriter, 2, calendarMonthPaychecksAggregation.year);
        TimeBoundedPaychecksAggregation.ADAPTER.encodeWithTag(protoWriter, 3, calendarMonthPaychecksAggregation.aggregation);
        protoWriter.writeBytes(calendarMonthPaychecksAggregation.unknownFields());
    }
}
