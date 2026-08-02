package squareup.cash.earnings;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class EarningStreamsData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EarningStreamsData(m, (Money) obj, (EarningsTimeFrame) obj2, (EarningsYearMonth) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(EarningStream.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, protoReader, obj);
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(EarningsTimeFrame.ADAPTER, protoReader, obj2);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(EarningsYearMonth.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarningStreamsData earningStreamsData = (EarningStreamsData) obj;
        reverseProtoWriter.getClass();
        earningStreamsData.getClass();
        reverseProtoWriter.writeBytes(earningStreamsData.unknownFields());
        EarningsYearMonth.ADAPTER.encodeWithTag(reverseProtoWriter, 4, earningStreamsData.year_month_period);
        EarningsTimeFrame.ADAPTER.encodeWithTag(reverseProtoWriter, 3, earningStreamsData.period);
        Money.ADAPTER.encodeWithTag(reverseProtoWriter, 2, earningStreamsData.monthly_total);
        EarningStream.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, earningStreamsData.streams);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EarningStreamsData earningStreamsData = (EarningStreamsData) obj;
        earningStreamsData.getClass();
        return EarningsYearMonth.ADAPTER.encodedSizeWithTag(4, earningStreamsData.year_month_period) + EarningsTimeFrame.ADAPTER.encodedSizeWithTag(3, earningStreamsData.period) + Money.ADAPTER.encodedSizeWithTag(2, earningStreamsData.monthly_total) + EarningStream.ADAPTER.asRepeated().encodedSizeWithTag(1, earningStreamsData.streams) + earningStreamsData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarningStreamsData earningStreamsData = (EarningStreamsData) obj;
        earningStreamsData.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(earningStreamsData.streams, EarningStream.ADAPTER);
        Money money = earningStreamsData.monthly_total;
        Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
        EarningsTimeFrame earningsTimeFrame = earningStreamsData.period;
        EarningsTimeFrame earningsTimeFrame2 = earningsTimeFrame != null ? (EarningsTimeFrame) EarningsTimeFrame.ADAPTER.redact(earningsTimeFrame) : null;
        EarningsYearMonth earningsYearMonth = earningStreamsData.year_month_period;
        EarningsYearMonth earningsYearMonth2 = earningsYearMonth != null ? (EarningsYearMonth) EarningsYearMonth.ADAPTER.redact(earningsYearMonth) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new EarningStreamsData(m1169redactElements, money2, earningsTimeFrame2, earningsYearMonth2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarningStreamsData earningStreamsData = (EarningStreamsData) obj;
        earningStreamsData.getClass();
        EarningStream.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, earningStreamsData.streams);
        Money.ADAPTER.encodeWithTag(protoWriter, 2, earningStreamsData.monthly_total);
        EarningsTimeFrame.ADAPTER.encodeWithTag(protoWriter, 3, earningStreamsData.period);
        EarningsYearMonth.ADAPTER.encodeWithTag(protoWriter, 4, earningStreamsData.year_month_period);
        protoWriter.writeBytes(earningStreamsData.unknownFields());
    }
}
