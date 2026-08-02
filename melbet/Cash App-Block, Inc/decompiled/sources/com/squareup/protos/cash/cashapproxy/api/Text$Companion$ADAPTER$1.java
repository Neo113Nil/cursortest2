package com.squareup.protos.cash.cashapproxy.api;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Text$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new Text((String) obj, (SemanticColor) obj2, (TextStyle) obj3, (TextAlignment) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = SemanticColor.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                try {
                    obj3 = TextStyle.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = TextAlignment.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Text text = (Text) obj;
        reverseProtoWriter.getClass();
        text.getClass();
        reverseProtoWriter.writeBytes(text.unknownFields());
        TextAlignment.ADAPTER.encodeWithTag(reverseProtoWriter, 4, text.alignment);
        TextStyle.ADAPTER.encodeWithTag(reverseProtoWriter, 3, text.style);
        SemanticColor.ADAPTER.encodeWithTag(reverseProtoWriter, 2, text.text_color);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, text.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Text text = (Text) obj;
        text.getClass();
        return TextAlignment.ADAPTER.encodedSizeWithTag(4, text.alignment) + TextStyle.ADAPTER.encodedSizeWithTag(3, text.style) + SemanticColor.ADAPTER.encodedSizeWithTag(2, text.text_color) + ProtoAdapter.STRING.encodedSizeWithTag(1, text.text) + text.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Text text = (Text) obj;
        text.getClass();
        ByteString byteString = ByteString.EMPTY;
        SemanticColor semanticColor = text.text_color;
        TextStyle textStyle = text.style;
        TextAlignment textAlignment = text.alignment;
        byteString.getClass();
        return new Text(null, semanticColor, textStyle, textAlignment, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Text text = (Text) obj;
        text.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, text.text);
        SemanticColor.ADAPTER.encodeWithTag(protoWriter, 2, text.text_color);
        TextStyle.ADAPTER.encodeWithTag(protoWriter, 3, text.style);
        TextAlignment.ADAPTER.encodeWithTag(protoWriter, 4, text.alignment);
        protoWriter.writeBytes(text.unknownFields());
    }
}
