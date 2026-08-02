package com.squareup.protos.cash.ui.graphs;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.graphs.HorizontalBarGraph;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class HorizontalBarGraph$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new HorizontalBarGraph((LocalizedString) obj, m, (Color) obj2, (Color) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                m.add(HorizontalBarGraph.BarItem.ADAPTER.decode(protoReader));
            } else if (nextTag == 3) {
                obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        HorizontalBarGraph horizontalBarGraph = (HorizontalBarGraph) obj;
        reverseProtoWriter.getClass();
        horizontalBarGraph.getClass();
        reverseProtoWriter.writeBytes(horizontalBarGraph.unknownFields());
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, horizontalBarGraph.bar_item_text_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, horizontalBarGraph.bar_item_color);
        HorizontalBarGraph.BarItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 2, horizontalBarGraph.bar_items);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, horizontalBarGraph.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        HorizontalBarGraph horizontalBarGraph = (HorizontalBarGraph) obj;
        horizontalBarGraph.getClass();
        int encodedSizeWithTag = HorizontalBarGraph.BarItem.ADAPTER.asRepeated().encodedSizeWithTag(2, horizontalBarGraph.bar_items) + LocalizedString.ADAPTER.encodedSizeWithTag(1, horizontalBarGraph.title) + horizontalBarGraph.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Color.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, horizontalBarGraph.bar_item_text_color) + protoAdapter.encodedSizeWithTag(3, horizontalBarGraph.bar_item_color) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        HorizontalBarGraph horizontalBarGraph = (HorizontalBarGraph) obj;
        horizontalBarGraph.getClass();
        LocalizedString localizedString = horizontalBarGraph.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(horizontalBarGraph.bar_items, HorizontalBarGraph.BarItem.ADAPTER);
        Color color = horizontalBarGraph.bar_item_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Color color3 = horizontalBarGraph.bar_item_text_color;
        Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new HorizontalBarGraph(localizedString2, m1169redactElements, color2, color4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        HorizontalBarGraph horizontalBarGraph = (HorizontalBarGraph) obj;
        horizontalBarGraph.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, horizontalBarGraph.title);
        HorizontalBarGraph.BarItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, horizontalBarGraph.bar_items);
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 3, horizontalBarGraph.bar_item_color);
        protoAdapter.encodeWithTag(protoWriter, 4, horizontalBarGraph.bar_item_text_color);
        protoWriter.writeBytes(horizontalBarGraph.unknownFields());
    }
}
