package com.squareup.protos.cash.cardspendinginsights;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cardspendinginsights.CardSpendingInsightsHome;
import com.squareup.protos.cash.ui.graphs.VerticalStackedBarGraph;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardSpendingInsightsHome$OverviewSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardSpendingInsightsHome.OverviewSection((VerticalStackedBarGraph) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(VerticalStackedBarGraph.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardSpendingInsightsHome.OverviewSection overviewSection = (CardSpendingInsightsHome.OverviewSection) obj;
        reverseProtoWriter.getClass();
        overviewSection.getClass();
        reverseProtoWriter.writeBytes(overviewSection.unknownFields());
        VerticalStackedBarGraph.ADAPTER.encodeWithTag(reverseProtoWriter, 1, overviewSection.vertical_stacked_bar_graph);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardSpendingInsightsHome.OverviewSection overviewSection = (CardSpendingInsightsHome.OverviewSection) obj;
        overviewSection.getClass();
        return VerticalStackedBarGraph.ADAPTER.encodedSizeWithTag(1, overviewSection.vertical_stacked_bar_graph) + overviewSection.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardSpendingInsightsHome.OverviewSection overviewSection = (CardSpendingInsightsHome.OverviewSection) obj;
        overviewSection.getClass();
        VerticalStackedBarGraph verticalStackedBarGraph = overviewSection.vertical_stacked_bar_graph;
        VerticalStackedBarGraph verticalStackedBarGraph2 = verticalStackedBarGraph != null ? (VerticalStackedBarGraph) VerticalStackedBarGraph.ADAPTER.redact(verticalStackedBarGraph) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardSpendingInsightsHome.OverviewSection(verticalStackedBarGraph2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardSpendingInsightsHome.OverviewSection overviewSection = (CardSpendingInsightsHome.OverviewSection) obj;
        overviewSection.getClass();
        VerticalStackedBarGraph.ADAPTER.encodeWithTag(protoWriter, 1, overviewSection.vertical_stacked_bar_graph);
        protoWriter.writeBytes(overviewSection.unknownFields());
    }
}
