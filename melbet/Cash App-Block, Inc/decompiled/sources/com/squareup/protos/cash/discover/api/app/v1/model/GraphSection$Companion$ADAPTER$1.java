package com.squareup.protos.cash.discover.api.app.v1.model;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.discover.api.app.v1.model.GraphSection;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GraphSection$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GraphSection(m, (Color) obj, (Color) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(GraphSection.Point.ADAPTER.decode(protoReader));
            } else if (nextTag == 2) {
                obj = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GraphSection graphSection = (GraphSection) obj;
        reverseProtoWriter.getClass();
        graphSection.getClass();
        reverseProtoWriter.writeBytes(graphSection.unknownFields());
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, graphSection.background_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, graphSection.line_color);
        GraphSection.Point.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, graphSection.points);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GraphSection graphSection = (GraphSection) obj;
        graphSection.getClass();
        int encodedSizeWithTag = GraphSection.Point.ADAPTER.asRepeated().encodedSizeWithTag(1, graphSection.points) + graphSection.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Color.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, graphSection.background_color) + protoAdapter.encodedSizeWithTag(2, graphSection.line_color) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GraphSection graphSection = (GraphSection) obj;
        graphSection.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(graphSection.points, GraphSection.Point.ADAPTER);
        Color color = graphSection.line_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Color color3 = graphSection.background_color;
        Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GraphSection(m1169redactElements, color2, color4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GraphSection graphSection = (GraphSection) obj;
        graphSection.getClass();
        GraphSection.Point.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, graphSection.points);
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, graphSection.line_color);
        protoAdapter.encodeWithTag(protoWriter, 3, graphSection.background_color);
        protoWriter.writeBytes(graphSection.unknownFields());
    }
}
