package com.squareup.protos.cash.ui.graphs;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.graphs.LineGraph;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LineGraph$GraphLegend$LegendItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LineGraph.GraphLegend.LegendItem((LocalizedString) obj, (Color) obj2, (LocalizedString) obj3, (Integer) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LineGraph.GraphLegend.LegendItem legendItem = (LineGraph.GraphLegend.LegendItem) obj;
        reverseProtoWriter.getClass();
        legendItem.getClass();
        reverseProtoWriter.writeBytes(legendItem.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 4, legendItem.line_index);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, legendItem.summary);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 2, legendItem.color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, legendItem.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LineGraph.GraphLegend.LegendItem legendItem = (LineGraph.GraphLegend.LegendItem) obj;
        legendItem.getClass();
        int size$okio = legendItem.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return ProtoAdapter.INT32.encodedSizeWithTag(4, legendItem.line_index) + protoAdapter.encodedSizeWithTag(3, legendItem.summary) + Color.ADAPTER.encodedSizeWithTag(2, legendItem.color) + protoAdapter.encodedSizeWithTag(1, legendItem.label) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LineGraph.GraphLegend.LegendItem legendItem = (LineGraph.GraphLegend.LegendItem) obj;
        legendItem.getClass();
        LocalizedString localizedString = legendItem.label;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        Color color = legendItem.color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        LocalizedString localizedString3 = legendItem.summary;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        Integer num = legendItem.line_index;
        byteString.getClass();
        return new LineGraph.GraphLegend.LegendItem(localizedString2, color2, localizedString4, num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LineGraph.GraphLegend.LegendItem legendItem = (LineGraph.GraphLegend.LegendItem) obj;
        legendItem.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, legendItem.label);
        Color.ADAPTER.encodeWithTag(protoWriter, 2, legendItem.color);
        protoAdapter.encodeWithTag(protoWriter, 3, legendItem.summary);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, legendItem.line_index);
        protoWriter.writeBytes(legendItem.unknownFields());
    }
}
