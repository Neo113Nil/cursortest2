package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.genericelements.ui.ArcadeTextElement;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ArcadeTextElement$Companion$ADAPTER$1 extends ProtoAdapter {
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
        Object obj8 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ArcadeTextElement((String) obj, (ArcadeTextElement.Style) obj2, (Alignment) obj3, (Color) obj4, (ArcadeTextElement.SemanticTextColor) obj5, (Integer) obj6, (VerticalAlignment) obj7, (Boolean) obj8, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    try {
                        obj2 = ArcadeTextElement.Style.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    try {
                        obj3 = Alignment.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 4:
                    obj4 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj4);
                    break;
                case 5:
                    try {
                        obj5 = ArcadeTextElement.SemanticTextColor.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 6:
                    obj6 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 7:
                    try {
                        obj7 = VerticalAlignment.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                        break;
                    }
                case 8:
                    obj8 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ArcadeTextElement arcadeTextElement = (ArcadeTextElement) obj;
        reverseProtoWriter.getClass();
        arcadeTextElement.getClass();
        reverseProtoWriter.writeBytes(arcadeTextElement.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 8, arcadeTextElement.selectable);
        VerticalAlignment.ADAPTER.encodeWithTag(reverseProtoWriter, 7, arcadeTextElement.vertical_alignment);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 6, arcadeTextElement.max_lines);
        ArcadeTextElement.SemanticTextColor.ADAPTER.encodeWithTag(reverseProtoWriter, 5, arcadeTextElement.semantic_text_color);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 4, arcadeTextElement.text_color);
        Alignment.ADAPTER.encodeWithTag(reverseProtoWriter, 3, arcadeTextElement.alignment);
        ArcadeTextElement.Style.ADAPTER.encodeWithTag(reverseProtoWriter, 2, arcadeTextElement.style);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, arcadeTextElement.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ArcadeTextElement arcadeTextElement = (ArcadeTextElement) obj;
        arcadeTextElement.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(8, arcadeTextElement.selectable) + VerticalAlignment.ADAPTER.encodedSizeWithTag(7, arcadeTextElement.vertical_alignment) + ProtoAdapter.INT32.encodedSizeWithTag(6, arcadeTextElement.max_lines) + ArcadeTextElement.SemanticTextColor.ADAPTER.encodedSizeWithTag(5, arcadeTextElement.semantic_text_color) + Color.ADAPTER.encodedSizeWithTag(4, arcadeTextElement.text_color) + Alignment.ADAPTER.encodedSizeWithTag(3, arcadeTextElement.alignment) + ArcadeTextElement.Style.ADAPTER.encodedSizeWithTag(2, arcadeTextElement.style) + ProtoAdapter.STRING.encodedSizeWithTag(1, arcadeTextElement.text) + arcadeTextElement.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ArcadeTextElement arcadeTextElement = (ArcadeTextElement) obj;
        arcadeTextElement.getClass();
        Color color = arcadeTextElement.text_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        ArcadeTextElement.Style style = arcadeTextElement.style;
        Alignment alignment = arcadeTextElement.alignment;
        ArcadeTextElement.SemanticTextColor semanticTextColor = arcadeTextElement.semantic_text_color;
        Integer num = arcadeTextElement.max_lines;
        VerticalAlignment verticalAlignment = arcadeTextElement.vertical_alignment;
        Boolean bool = arcadeTextElement.selectable;
        byteString.getClass();
        return new ArcadeTextElement(null, style, alignment, color2, semanticTextColor, num, verticalAlignment, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ArcadeTextElement arcadeTextElement = (ArcadeTextElement) obj;
        arcadeTextElement.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, arcadeTextElement.text);
        ArcadeTextElement.Style.ADAPTER.encodeWithTag(protoWriter, 2, arcadeTextElement.style);
        Alignment.ADAPTER.encodeWithTag(protoWriter, 3, arcadeTextElement.alignment);
        Color.ADAPTER.encodeWithTag(protoWriter, 4, arcadeTextElement.text_color);
        ArcadeTextElement.SemanticTextColor.ADAPTER.encodeWithTag(protoWriter, 5, arcadeTextElement.semantic_text_color);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, arcadeTextElement.max_lines);
        VerticalAlignment.ADAPTER.encodeWithTag(protoWriter, 7, arcadeTextElement.vertical_alignment);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, arcadeTextElement.selectable);
        protoWriter.writeBytes(arcadeTextElement.unknownFields());
    }
}
