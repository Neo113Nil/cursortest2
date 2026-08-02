package com.squareup.protos.cash.ui.graphs;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.graphs.LineGraph;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class LineGraph$Line$DataPoint$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new LineGraph.Line.DataPoint((Long) obj, (Long) obj2, (LocalizedString) obj3, (LocalizedString) obj4, (LocalizedString) obj5, (Icon) obj6, (Color) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 2:
                    obj2 = ProtoAdapter.INT64.decode(protoReader);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj6);
                    break;
                case 7:
                    obj7 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj7);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LineGraph.Line.DataPoint dataPoint = (LineGraph.Line.DataPoint) obj;
        reverseProtoWriter.getClass();
        dataPoint.getClass();
        reverseProtoWriter.writeBytes(dataPoint.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 7, dataPoint.icon_tint_color);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 6, dataPoint.icon);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, dataPoint.description);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, dataPoint.headline);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, dataPoint.label);
        ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
        protoAdapter2.encodeWithTag(reverseProtoWriter, 2, dataPoint.y_value);
        protoAdapter2.encodeWithTag(reverseProtoWriter, 1, dataPoint.x_value);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LineGraph.Line.DataPoint dataPoint = (LineGraph.Line.DataPoint) obj;
        dataPoint.getClass();
        int size$okio = dataPoint.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        int encodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, dataPoint.y_value) + protoAdapter.encodedSizeWithTag(1, dataPoint.x_value) + size$okio;
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        return Color.ADAPTER.encodedSizeWithTag(7, dataPoint.icon_tint_color) + Icon.ADAPTER.encodedSizeWithTag(6, dataPoint.icon) + protoAdapter2.encodedSizeWithTag(5, dataPoint.description) + protoAdapter2.encodedSizeWithTag(4, dataPoint.headline) + protoAdapter2.encodedSizeWithTag(3, dataPoint.label) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LineGraph.Line.DataPoint dataPoint = (LineGraph.Line.DataPoint) obj;
        dataPoint.getClass();
        LocalizedString localizedString = dataPoint.label;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = dataPoint.headline;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = dataPoint.description;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        Icon icon = dataPoint.icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        Color color = dataPoint.icon_tint_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        Long l = dataPoint.x_value;
        Long l2 = dataPoint.y_value;
        byteString.getClass();
        return new LineGraph.Line.DataPoint(l, l2, localizedString2, localizedString4, localizedString6, icon2, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LineGraph.Line.DataPoint dataPoint = (LineGraph.Line.DataPoint) obj;
        dataPoint.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.INT64;
        protoAdapter.encodeWithTag(protoWriter, 1, dataPoint.x_value);
        protoAdapter.encodeWithTag(protoWriter, 2, dataPoint.y_value);
        ProtoAdapter protoAdapter2 = LocalizedString.ADAPTER;
        protoAdapter2.encodeWithTag(protoWriter, 3, dataPoint.label);
        protoAdapter2.encodeWithTag(protoWriter, 4, dataPoint.headline);
        protoAdapter2.encodeWithTag(protoWriter, 5, dataPoint.description);
        Icon.ADAPTER.encodeWithTag(protoWriter, 6, dataPoint.icon);
        Color.ADAPTER.encodeWithTag(protoWriter, 7, dataPoint.icon_tint_color);
        protoWriter.writeBytes(dataPoint.unknownFields());
    }
}
