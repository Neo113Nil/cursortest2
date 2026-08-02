package com.squareup.protos.cash.ui.graphs;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.graphs.LineGraph;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LineGraph$GraphLegend$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LineGraph.GraphLegend(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(LineGraph.GraphLegend.LegendItem.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LineGraph.GraphLegend graphLegend = (LineGraph.GraphLegend) obj;
        reverseProtoWriter.getClass();
        graphLegend.getClass();
        reverseProtoWriter.writeBytes(graphLegend.unknownFields());
        LineGraph.GraphLegend.LegendItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, graphLegend.items);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LineGraph.GraphLegend graphLegend = (LineGraph.GraphLegend) obj;
        graphLegend.getClass();
        return LineGraph.GraphLegend.LegendItem.ADAPTER.asRepeated().encodedSizeWithTag(1, graphLegend.items) + graphLegend.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LineGraph.GraphLegend graphLegend = (LineGraph.GraphLegend) obj;
        graphLegend.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(graphLegend.items, LineGraph.GraphLegend.LegendItem.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LineGraph.GraphLegend(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LineGraph.GraphLegend graphLegend = (LineGraph.GraphLegend) obj;
        graphLegend.getClass();
        LineGraph.GraphLegend.LegendItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, graphLegend.items);
        protoWriter.writeBytes(graphLegend.unknownFields());
    }
}
