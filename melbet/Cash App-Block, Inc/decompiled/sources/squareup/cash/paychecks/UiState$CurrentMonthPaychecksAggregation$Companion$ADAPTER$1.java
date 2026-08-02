package squareup.cash.paychecks;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.paychecks.UiState;

/* loaded from: classes10.dex */
public final class UiState$CurrentMonthPaychecksAggregation$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UiState.CurrentMonthPaychecksAggregation((CalendarMonthPaychecksAggregation) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(CalendarMonthPaychecksAggregation.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UiState.CurrentMonthPaychecksAggregation currentMonthPaychecksAggregation = (UiState.CurrentMonthPaychecksAggregation) obj;
        reverseProtoWriter.getClass();
        currentMonthPaychecksAggregation.getClass();
        reverseProtoWriter.writeBytes(currentMonthPaychecksAggregation.unknownFields());
        CalendarMonthPaychecksAggregation.ADAPTER.encodeWithTag(reverseProtoWriter, 1, currentMonthPaychecksAggregation.calendar_month_aggregation);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UiState.CurrentMonthPaychecksAggregation currentMonthPaychecksAggregation = (UiState.CurrentMonthPaychecksAggregation) obj;
        currentMonthPaychecksAggregation.getClass();
        return CalendarMonthPaychecksAggregation.ADAPTER.encodedSizeWithTag(1, currentMonthPaychecksAggregation.calendar_month_aggregation) + currentMonthPaychecksAggregation.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        UiState.CurrentMonthPaychecksAggregation currentMonthPaychecksAggregation = (UiState.CurrentMonthPaychecksAggregation) obj;
        currentMonthPaychecksAggregation.getClass();
        CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation = currentMonthPaychecksAggregation.calendar_month_aggregation;
        CalendarMonthPaychecksAggregation calendarMonthPaychecksAggregation2 = calendarMonthPaychecksAggregation != null ? (CalendarMonthPaychecksAggregation) CalendarMonthPaychecksAggregation.ADAPTER.redact(calendarMonthPaychecksAggregation) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UiState.CurrentMonthPaychecksAggregation(calendarMonthPaychecksAggregation2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UiState.CurrentMonthPaychecksAggregation currentMonthPaychecksAggregation = (UiState.CurrentMonthPaychecksAggregation) obj;
        currentMonthPaychecksAggregation.getClass();
        CalendarMonthPaychecksAggregation.ADAPTER.encodeWithTag(protoWriter, 1, currentMonthPaychecksAggregation.calendar_month_aggregation);
        protoWriter.writeBytes(currentMonthPaychecksAggregation.unknownFields());
    }
}
