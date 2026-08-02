package com.squareup.protos.cash.ui.graphs;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.graphs.LineGraph;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LineGraph$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LineGraph(m, arrayList, arrayList2, (LineGraph.GraphLegend) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(LineGraph.Line.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                arrayList.add(AxisLabel.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                arrayList2.add(AxisLabel.ADAPTER.decode(protoReader));
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(LineGraph.GraphLegend.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LineGraph lineGraph = (LineGraph) obj;
        reverseProtoWriter.getClass();
        lineGraph.getClass();
        reverseProtoWriter.writeBytes(lineGraph.unknownFields());
        LineGraph.GraphLegend.ADAPTER.encodeWithTag(reverseProtoWriter, 4, lineGraph.legend);
        ProtoAdapter protoAdapter = AxisLabel.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 3, lineGraph.x_axis_labels);
        protoAdapter.asRepeated().encodeWithTag(reverseProtoWriter, 2, lineGraph.y_axis_labels);
        LineGraph.Line.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, lineGraph.lines);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LineGraph lineGraph = (LineGraph) obj;
        lineGraph.getClass();
        int encodedSizeWithTag = LineGraph.Line.ADAPTER.asRepeated().encodedSizeWithTag(1, lineGraph.lines) + lineGraph.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = AxisLabel.ADAPTER;
        return LineGraph.GraphLegend.ADAPTER.encodedSizeWithTag(4, lineGraph.legend) + protoAdapter.asRepeated().encodedSizeWithTag(3, lineGraph.x_axis_labels) + protoAdapter.asRepeated().encodedSizeWithTag(2, lineGraph.y_axis_labels) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LineGraph lineGraph = (LineGraph) obj;
        lineGraph.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(lineGraph.lines, LineGraph.Line.ADAPTER);
        List list = lineGraph.y_axis_labels;
        ProtoAdapter protoAdapter = AxisLabel.ADAPTER;
        ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(list, protoAdapter);
        ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(lineGraph.x_axis_labels, protoAdapter);
        LineGraph.GraphLegend graphLegend = lineGraph.legend;
        LineGraph.GraphLegend graphLegend2 = graphLegend != null ? (LineGraph.GraphLegend) LineGraph.GraphLegend.ADAPTER.redact(graphLegend) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LineGraph(m1169redactElements, m1169redactElements2, m1169redactElements3, graphLegend2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LineGraph lineGraph = (LineGraph) obj;
        lineGraph.getClass();
        LineGraph.Line.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, lineGraph.lines);
        ProtoAdapter protoAdapter = AxisLabel.ADAPTER;
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, lineGraph.y_axis_labels);
        protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, lineGraph.x_axis_labels);
        LineGraph.GraphLegend.ADAPTER.encodeWithTag(protoWriter, 4, lineGraph.legend);
        protoWriter.writeBytes(lineGraph.unknownFields());
    }
}
