package com.squareup.protos.cash.composer.app;

import com.squareup.protos.cash.composer.app.TextElement;
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
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TextElement((String) obj, (TextElement.TextStyle) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = TextElement.TextStyle.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TextElement textElement = (TextElement) obj;
        reverseProtoWriter.getClass();
        textElement.getClass();
        reverseProtoWriter.writeBytes(textElement.unknownFields());
        TextElement.TextStyle.ADAPTER.encodeWithTag(reverseProtoWriter, 2, textElement.style);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, textElement.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TextElement textElement = (TextElement) obj;
        textElement.getClass();
        return TextElement.TextStyle.ADAPTER.encodedSizeWithTag(2, textElement.style) + ProtoAdapter.STRING.encodedSizeWithTag(1, textElement.text) + textElement.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TextElement textElement = (TextElement) obj;
        textElement.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = textElement.text;
        TextElement.TextStyle textStyle = textElement.style;
        byteString.getClass();
        return new TextElement(str, textStyle, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TextElement textElement = (TextElement) obj;
        textElement.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, textElement.text);
        TextElement.TextStyle.ADAPTER.encodeWithTag(protoWriter, 2, textElement.style);
        protoWriter.writeBytes(textElement.unknownFields());
    }
}
