package com.squareup.protos.cash.ui.graphs;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.graphs.VerticalStackedBarGraph;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class VerticalStackedBarGraph$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VerticalStackedBarGraph(m, (VerticalStackedBarGraph.GraphLegend) obj, arrayList, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(VerticalStackedBarGraph.Bar.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(VerticalStackedBarGraph.GraphLegend.ADAPTER, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                arrayList.add(AxisLabel.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VerticalStackedBarGraph verticalStackedBarGraph = (VerticalStackedBarGraph) obj;
        reverseProtoWriter.getClass();
        verticalStackedBarGraph.getClass();
        reverseProtoWriter.writeBytes(verticalStackedBarGraph.unknownFields());
        AxisLabel.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 3, verticalStackedBarGraph.y_axis_labels);
        VerticalStackedBarGraph.GraphLegend.ADAPTER.encodeWithTag(reverseProtoWriter, 2, verticalStackedBarGraph.legend);
        VerticalStackedBarGraph.Bar.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, verticalStackedBarGraph.bars);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VerticalStackedBarGraph verticalStackedBarGraph = (VerticalStackedBarGraph) obj;
        verticalStackedBarGraph.getClass();
        return AxisLabel.ADAPTER.asRepeated().encodedSizeWithTag(3, verticalStackedBarGraph.y_axis_labels) + VerticalStackedBarGraph.GraphLegend.ADAPTER.encodedSizeWithTag(2, verticalStackedBarGraph.legend) + VerticalStackedBarGraph.Bar.ADAPTER.asRepeated().encodedSizeWithTag(1, verticalStackedBarGraph.bars) + verticalStackedBarGraph.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VerticalStackedBarGraph verticalStackedBarGraph = (VerticalStackedBarGraph) obj;
        verticalStackedBarGraph.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(verticalStackedBarGraph.bars, VerticalStackedBarGraph.Bar.ADAPTER);
        VerticalStackedBarGraph.GraphLegend graphLegend = verticalStackedBarGraph.legend;
        VerticalStackedBarGraph.GraphLegend graphLegend2 = graphLegend != null ? (VerticalStackedBarGraph.GraphLegend) VerticalStackedBarGraph.GraphLegend.ADAPTER.redact(graphLegend) : null;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(verticalStackedBarGraph.y_axis_labels, AxisLabel.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new VerticalStackedBarGraph(m1169redactElements, graphLegend2, m1169redactElements2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VerticalStackedBarGraph verticalStackedBarGraph = (VerticalStackedBarGraph) obj;
        verticalStackedBarGraph.getClass();
        VerticalStackedBarGraph.Bar.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, verticalStackedBarGraph.bars);
        VerticalStackedBarGraph.GraphLegend.ADAPTER.encodeWithTag(protoWriter, 2, verticalStackedBarGraph.legend);
        AxisLabel.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, verticalStackedBarGraph.y_axis_labels);
        protoWriter.writeBytes(verticalStackedBarGraph.unknownFields());
    }
}
