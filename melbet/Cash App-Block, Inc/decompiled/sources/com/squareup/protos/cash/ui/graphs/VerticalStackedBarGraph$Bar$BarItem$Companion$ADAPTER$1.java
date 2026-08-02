package com.squareup.protos.cash.ui.graphs;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.graphs.VerticalStackedBarGraph;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class VerticalStackedBarGraph$Bar$BarItem$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VerticalStackedBarGraph.Bar.BarItem((Color) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VerticalStackedBarGraph.Bar.BarItem barItem = (VerticalStackedBarGraph.Bar.BarItem) obj;
        reverseProtoWriter.getClass();
        barItem.getClass();
        reverseProtoWriter.writeBytes(barItem.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, barItem.value);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 1, barItem.color);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VerticalStackedBarGraph.Bar.BarItem barItem = (VerticalStackedBarGraph.Bar.BarItem) obj;
        barItem.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(2, barItem.value) + Color.ADAPTER.encodedSizeWithTag(1, barItem.color) + barItem.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VerticalStackedBarGraph.Bar.BarItem barItem = (VerticalStackedBarGraph.Bar.BarItem) obj;
        barItem.getClass();
        Color color = barItem.color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = barItem.value;
        byteString.getClass();
        return new VerticalStackedBarGraph.Bar.BarItem(color2, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VerticalStackedBarGraph.Bar.BarItem barItem = (VerticalStackedBarGraph.Bar.BarItem) obj;
        barItem.getClass();
        Color.ADAPTER.encodeWithTag(protoWriter, 1, barItem.color);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, barItem.value);
        protoWriter.writeBytes(barItem.unknownFields());
    }
}
