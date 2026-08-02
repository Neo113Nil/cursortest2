package com.squareup.protos.cash.ui.graphs;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.graphs.LineGraph;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LineGraph$Line$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LineGraph.Line(m, (Color) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(LineGraph.Line.DataPoint.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LineGraph.Line line = (LineGraph.Line) obj;
        reverseProtoWriter.getClass();
        line.getClass();
        reverseProtoWriter.writeBytes(line.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 2, line.color);
        LineGraph.Line.DataPoint.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, line.data_points);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LineGraph.Line line = (LineGraph.Line) obj;
        line.getClass();
        return Color.ADAPTER.encodedSizeWithTag(2, line.color) + LineGraph.Line.DataPoint.ADAPTER.asRepeated().encodedSizeWithTag(1, line.data_points) + line.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LineGraph.Line line = (LineGraph.Line) obj;
        line.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(line.data_points, LineGraph.Line.DataPoint.ADAPTER);
        Color color = line.color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LineGraph.Line(m1169redactElements, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LineGraph.Line line = (LineGraph.Line) obj;
        line.getClass();
        LineGraph.Line.DataPoint.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, line.data_points);
        Color.ADAPTER.encodeWithTag(protoWriter, 2, line.color);
        protoWriter.writeBytes(line.unknownFields());
    }
}
