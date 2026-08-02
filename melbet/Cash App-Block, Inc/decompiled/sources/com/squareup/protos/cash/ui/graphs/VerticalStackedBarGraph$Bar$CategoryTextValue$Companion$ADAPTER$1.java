package com.squareup.protos.cash.ui.graphs;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.graphs.VerticalStackedBarGraph;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class VerticalStackedBarGraph$Bar$CategoryTextValue$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new VerticalStackedBarGraph.Bar.CategoryTextValue((Color) obj, (LocalizedString) obj2, (LocalizedString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj);
            } else if (nextTag == 4) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        VerticalStackedBarGraph.Bar.CategoryTextValue categoryTextValue = (VerticalStackedBarGraph.Bar.CategoryTextValue) obj;
        reverseProtoWriter.getClass();
        categoryTextValue.getClass();
        reverseProtoWriter.writeBytes(categoryTextValue.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, categoryTextValue.value);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, categoryTextValue.text);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 1, categoryTextValue.color);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        VerticalStackedBarGraph.Bar.CategoryTextValue categoryTextValue = (VerticalStackedBarGraph.Bar.CategoryTextValue) obj;
        categoryTextValue.getClass();
        int encodedSizeWithTag = Color.ADAPTER.encodedSizeWithTag(1, categoryTextValue.color) + categoryTextValue.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(5, categoryTextValue.value) + protoAdapter.encodedSizeWithTag(4, categoryTextValue.text) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        VerticalStackedBarGraph.Bar.CategoryTextValue categoryTextValue = (VerticalStackedBarGraph.Bar.CategoryTextValue) obj;
        categoryTextValue.getClass();
        Color color = categoryTextValue.color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        LocalizedString localizedString = categoryTextValue.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = categoryTextValue.value;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new VerticalStackedBarGraph.Bar.CategoryTextValue(color2, localizedString2, localizedString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        VerticalStackedBarGraph.Bar.CategoryTextValue categoryTextValue = (VerticalStackedBarGraph.Bar.CategoryTextValue) obj;
        categoryTextValue.getClass();
        Color.ADAPTER.encodeWithTag(protoWriter, 1, categoryTextValue.color);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 4, categoryTextValue.text);
        protoAdapter.encodeWithTag(protoWriter, 5, categoryTextValue.value);
        protoWriter.writeBytes(categoryTextValue.unknownFields());
    }
}
