package squareup.cash.earnings;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class EarningsChartData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EarningsChartData((EarningsTimeFrame) obj, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(EarningsTimeFrame.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                m.add(Earning.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarningsChartData earningsChartData = (EarningsChartData) obj;
        reverseProtoWriter.getClass();
        earningsChartData.getClass();
        reverseProtoWriter.writeBytes(earningsChartData.unknownFields());
        Earning.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, earningsChartData.earnings);
        EarningsTimeFrame.ADAPTER.encodeWithTag(reverseProtoWriter, 1, earningsChartData.period);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EarningsChartData earningsChartData = (EarningsChartData) obj;
        earningsChartData.getClass();
        return Earning.ADAPTER.asRepeated().encodedSizeWithTag(2, earningsChartData.earnings) + EarningsTimeFrame.ADAPTER.encodedSizeWithTag(1, earningsChartData.period) + earningsChartData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarningsChartData earningsChartData = (EarningsChartData) obj;
        earningsChartData.getClass();
        EarningsTimeFrame earningsTimeFrame = earningsChartData.period;
        EarningsTimeFrame earningsTimeFrame2 = earningsTimeFrame != null ? (EarningsTimeFrame) EarningsTimeFrame.ADAPTER.redact(earningsTimeFrame) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(earningsChartData.earnings, Earning.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new EarningsChartData(earningsTimeFrame2, m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarningsChartData earningsChartData = (EarningsChartData) obj;
        earningsChartData.getClass();
        EarningsTimeFrame.ADAPTER.encodeWithTag(protoWriter, 1, earningsChartData.period);
        Earning.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, earningsChartData.earnings);
        protoWriter.writeBytes(earningsChartData.unknownFields());
    }
}
