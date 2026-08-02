package com.squareup.protos.cash.ui.graphs;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.graphs.VerticalStackedBarGraph;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class VerticalStackedBarGraph$Bar$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
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
                return new VerticalStackedBarGraph.Bar((LocalizedString) obj, (LocalizedString) obj2, (LocalizedString) obj3, m, (VerticalStackedBarGraph.Bar.CategoryTextValue) obj4, (LocalizedString) obj5, (LocalizedString) obj6, (LocalizedString) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                case 5:
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
                case 6:
                    m.add(VerticalStackedBarGraph.Bar.BarItem.ADAPTER.decode(protoReader));
                    break;
                case 7:
                    obj4 = TransactorKt.decodeMessageOrMerge(VerticalStackedBarGraph.Bar.CategoryTextValue.ADAPTER, protoReader, obj4);
                    break;
                case 8:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    break;
                case 9:
                    obj6 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj6);
                    break;
                case 10:
                    obj7 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj7);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VerticalStackedBarGraph.Bar bar = (VerticalStackedBarGraph.Bar) obj;
        reverseProtoWriter.getClass();
        bar.getClass();
        reverseProtoWriter.writeBytes(bar.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 10, bar.category_focus_label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 9, bar.category_value);
        protoAdapter.encodeWithTag(reverseProtoWriter, 8, bar.category_text);
        VerticalStackedBarGraph.Bar.CategoryTextValue.ADAPTER.encodeWithTag(reverseProtoWriter, 7, bar.category_text_and_value);
        VerticalStackedBarGraph.Bar.BarItem.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, bar.bar_items);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, bar.accessibility_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, bar.subtitle_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, bar.header_text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VerticalStackedBarGraph.Bar bar = (VerticalStackedBarGraph.Bar) obj;
        bar.getClass();
        int size$okio = bar.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(10, bar.category_focus_label) + protoAdapter.encodedSizeWithTag(9, bar.category_value) + protoAdapter.encodedSizeWithTag(8, bar.category_text) + VerticalStackedBarGraph.Bar.CategoryTextValue.ADAPTER.encodedSizeWithTag(7, bar.category_text_and_value) + VerticalStackedBarGraph.Bar.BarItem.ADAPTER.asRepeated().encodedSizeWithTag(6, bar.bar_items) + protoAdapter.encodedSizeWithTag(3, bar.accessibility_text) + protoAdapter.encodedSizeWithTag(2, bar.subtitle_text) + protoAdapter.encodedSizeWithTag(1, bar.header_text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VerticalStackedBarGraph.Bar bar = (VerticalStackedBarGraph.Bar) obj;
        bar.getClass();
        LocalizedString localizedString = bar.header_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = bar.subtitle_text;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        LocalizedString localizedString5 = bar.accessibility_text;
        LocalizedString localizedString6 = localizedString5 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString5) : null;
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(bar.bar_items, VerticalStackedBarGraph.Bar.BarItem.ADAPTER);
        VerticalStackedBarGraph.Bar.CategoryTextValue categoryTextValue = bar.category_text_and_value;
        VerticalStackedBarGraph.Bar.CategoryTextValue categoryTextValue2 = categoryTextValue != null ? (VerticalStackedBarGraph.Bar.CategoryTextValue) VerticalStackedBarGraph.Bar.CategoryTextValue.ADAPTER.redact(categoryTextValue) : null;
        LocalizedString localizedString7 = bar.category_text;
        LocalizedString localizedString8 = localizedString7 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString7) : null;
        LocalizedString localizedString9 = bar.category_value;
        LocalizedString localizedString10 = localizedString9 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString9) : null;
        LocalizedString localizedString11 = bar.category_focus_label;
        LocalizedString localizedString12 = localizedString11 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString11) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new VerticalStackedBarGraph.Bar(localizedString2, localizedString4, localizedString6, m1169redactElements, categoryTextValue2, localizedString8, localizedString10, localizedString12, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VerticalStackedBarGraph.Bar bar = (VerticalStackedBarGraph.Bar) obj;
        bar.getClass();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, bar.header_text);
        protoAdapter.encodeWithTag(protoWriter, 2, bar.subtitle_text);
        protoAdapter.encodeWithTag(protoWriter, 3, bar.accessibility_text);
        VerticalStackedBarGraph.Bar.BarItem.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, bar.bar_items);
        VerticalStackedBarGraph.Bar.CategoryTextValue.ADAPTER.encodeWithTag(protoWriter, 7, bar.category_text_and_value);
        protoAdapter.encodeWithTag(protoWriter, 8, bar.category_text);
        protoAdapter.encodeWithTag(protoWriter, 9, bar.category_value);
        protoAdapter.encodeWithTag(protoWriter, 10, bar.category_focus_label);
        protoWriter.writeBytes(bar.unknownFields());
    }
}
