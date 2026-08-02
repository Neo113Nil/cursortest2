package squareup.cash.earnings;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.earnings.EarningsHomeUIState;

/* loaded from: classes10.dex */
public final class EarningsHomeUIState$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new EarningsHomeUIState((EarningStreamsData) obj, (EarningsTimeFrame) obj2, (EarningsHomeUIState.EarningsHomeConfiguration) obj3, (EarningsChartData) obj4, (Boolean) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(EarningStreamsData.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(EarningsTimeFrame.ADAPTER, protoReader, obj2);
            } else if (nextTag == 4) {
                obj3 = TransactorKt.decodeMessageOrMerge(EarningsHomeUIState.EarningsHomeConfiguration.ADAPTER, protoReader, obj3);
            } else if (nextTag == 6) {
                obj4 = TransactorKt.decodeMessageOrMerge(EarningsChartData.ADAPTER, protoReader, obj4);
            } else if (nextTag != 7) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        EarningsHomeUIState earningsHomeUIState = (EarningsHomeUIState) obj;
        reverseProtoWriter.getClass();
        earningsHomeUIState.getClass();
        reverseProtoWriter.writeBytes(earningsHomeUIState.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 7, earningsHomeUIState.should_show_chart);
        EarningsChartData.ADAPTER.encodeWithTag(reverseProtoWriter, 6, earningsHomeUIState.current_month_chart);
        EarningsHomeUIState.EarningsHomeConfiguration.ADAPTER.encodeWithTag(reverseProtoWriter, 4, earningsHomeUIState.earnings_home_configuration);
        EarningsTimeFrame.ADAPTER.encodeWithTag(reverseProtoWriter, 2, earningsHomeUIState.earliest_period);
        EarningStreamsData.ADAPTER.encodeWithTag(reverseProtoWriter, 1, earningsHomeUIState.current_month_earnings);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        EarningsHomeUIState earningsHomeUIState = (EarningsHomeUIState) obj;
        earningsHomeUIState.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(7, earningsHomeUIState.should_show_chart) + EarningsChartData.ADAPTER.encodedSizeWithTag(6, earningsHomeUIState.current_month_chart) + EarningsHomeUIState.EarningsHomeConfiguration.ADAPTER.encodedSizeWithTag(4, earningsHomeUIState.earnings_home_configuration) + EarningsTimeFrame.ADAPTER.encodedSizeWithTag(2, earningsHomeUIState.earliest_period) + EarningStreamsData.ADAPTER.encodedSizeWithTag(1, earningsHomeUIState.current_month_earnings) + earningsHomeUIState.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        EarningsHomeUIState earningsHomeUIState = (EarningsHomeUIState) obj;
        earningsHomeUIState.getClass();
        EarningStreamsData earningStreamsData = earningsHomeUIState.current_month_earnings;
        EarningStreamsData earningStreamsData2 = earningStreamsData != null ? (EarningStreamsData) EarningStreamsData.ADAPTER.redact(earningStreamsData) : null;
        EarningsTimeFrame earningsTimeFrame = earningsHomeUIState.earliest_period;
        EarningsTimeFrame earningsTimeFrame2 = earningsTimeFrame != null ? (EarningsTimeFrame) EarningsTimeFrame.ADAPTER.redact(earningsTimeFrame) : null;
        EarningsHomeUIState.EarningsHomeConfiguration earningsHomeConfiguration = earningsHomeUIState.earnings_home_configuration;
        EarningsHomeUIState.EarningsHomeConfiguration earningsHomeConfiguration2 = earningsHomeConfiguration != null ? (EarningsHomeUIState.EarningsHomeConfiguration) EarningsHomeUIState.EarningsHomeConfiguration.ADAPTER.redact(earningsHomeConfiguration) : null;
        EarningsChartData earningsChartData = earningsHomeUIState.current_month_chart;
        EarningsChartData earningsChartData2 = earningsChartData != null ? (EarningsChartData) EarningsChartData.ADAPTER.redact(earningsChartData) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = earningsHomeUIState.should_show_chart;
        byteString.getClass();
        return new EarningsHomeUIState(earningStreamsData2, earningsTimeFrame2, earningsHomeConfiguration2, earningsChartData2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        EarningsHomeUIState earningsHomeUIState = (EarningsHomeUIState) obj;
        earningsHomeUIState.getClass();
        EarningStreamsData.ADAPTER.encodeWithTag(protoWriter, 1, earningsHomeUIState.current_month_earnings);
        EarningsTimeFrame.ADAPTER.encodeWithTag(protoWriter, 2, earningsHomeUIState.earliest_period);
        EarningsHomeUIState.EarningsHomeConfiguration.ADAPTER.encodeWithTag(protoWriter, 4, earningsHomeUIState.earnings_home_configuration);
        EarningsChartData.ADAPTER.encodeWithTag(protoWriter, 6, earningsHomeUIState.current_month_chart);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, earningsHomeUIState.should_show_chart);
        protoWriter.writeBytes(earningsHomeUIState.unknownFields());
    }
}
