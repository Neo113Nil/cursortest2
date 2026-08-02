package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.genericelements.ui.TextElement;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class TextElement$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new TextElement((String) obj, (TextElement.Style) obj2, (Alignment) obj3, (Color) obj4, (Integer) obj5, (VerticalAlignment) obj6, (Boolean) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    try {
                        obj2 = TextElement.Style.ADAPTER.decode(protoReader);
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
                    obj5 = ProtoAdapter.INT32.decode(protoReader);
                    break;
                case 6:
                    try {
                        obj6 = VerticalAlignment.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                case 7:
                    obj7 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TextElement textElement = (TextElement) obj;
        reverseProtoWriter.getClass();
        textElement.getClass();
        reverseProtoWriter.writeBytes(textElement.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 7, textElement.selectable);
        VerticalAlignment.ADAPTER.encodeWithTag(reverseProtoWriter, 6, textElement.vertical_alignment);
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 5, textElement.max_line_number);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 4, textElement.text_color);
        Alignment.ADAPTER.encodeWithTag(reverseProtoWriter, 3, textElement.alignment);
        TextElement.Style.ADAPTER.encodeWithTag(reverseProtoWriter, 2, textElement.style);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, textElement.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TextElement textElement = (TextElement) obj;
        textElement.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(7, textElement.selectable) + VerticalAlignment.ADAPTER.encodedSizeWithTag(6, textElement.vertical_alignment) + ProtoAdapter.INT32.encodedSizeWithTag(5, textElement.max_line_number) + Color.ADAPTER.encodedSizeWithTag(4, textElement.text_color) + Alignment.ADAPTER.encodedSizeWithTag(3, textElement.alignment) + TextElement.Style.ADAPTER.encodedSizeWithTag(2, textElement.style) + ProtoAdapter.STRING.encodedSizeWithTag(1, textElement.text) + textElement.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TextElement textElement = (TextElement) obj;
        textElement.getClass();
        Color color = textElement.text_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        TextElement.Style style = textElement.style;
        Alignment alignment = textElement.alignment;
        Integer num = textElement.max_line_number;
        VerticalAlignment verticalAlignment = textElement.vertical_alignment;
        Boolean bool = textElement.selectable;
        byteString.getClass();
        return new TextElement(null, style, alignment, color2, num, verticalAlignment, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TextElement textElement = (TextElement) obj;
        textElement.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, textElement.text);
        TextElement.Style.ADAPTER.encodeWithTag(protoWriter, 2, textElement.style);
        Alignment.ADAPTER.encodeWithTag(protoWriter, 3, textElement.alignment);
        Color.ADAPTER.encodeWithTag(protoWriter, 4, textElement.text_color);
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, textElement.max_line_number);
        VerticalAlignment.ADAPTER.encodeWithTag(protoWriter, 6, textElement.vertical_alignment);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 7, textElement.selectable);
        protoWriter.writeBytes(textElement.unknownFields());
    }
}
