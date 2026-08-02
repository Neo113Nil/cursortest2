package com.squareup.protos.cash.kgoose.api.v3;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.graphs.LineGraph;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import kotlin.Metadata;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/squareup/protos/cash/kgoose/api/v3/LineGraph$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/kgoose/api/v3/LineGraph;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LineGraph$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LineGraph((LineGraph.Line) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LineGraph.Line.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LineGraph lineGraph = (LineGraph) obj;
        reverseProtoWriter.getClass();
        lineGraph.getClass();
        reverseProtoWriter.writeBytes(lineGraph.unknownFields());
        LineGraph.Line.ADAPTER.encodeWithTag(reverseProtoWriter, 1, lineGraph.line);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LineGraph lineGraph = (LineGraph) obj;
        lineGraph.getClass();
        return LineGraph.Line.ADAPTER.encodedSizeWithTag(1, lineGraph.line) + lineGraph.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LineGraph lineGraph = (LineGraph) obj;
        lineGraph.getClass();
        LineGraph.Line line = lineGraph.line;
        LineGraph.Line line2 = line != null ? (LineGraph.Line) LineGraph.Line.ADAPTER.redact(line) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LineGraph(line2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LineGraph lineGraph = (LineGraph) obj;
        lineGraph.getClass();
        LineGraph.Line.ADAPTER.encodeWithTag(protoWriter, 1, lineGraph.line);
        protoWriter.writeBytes(lineGraph.unknownFields());
    }
}
