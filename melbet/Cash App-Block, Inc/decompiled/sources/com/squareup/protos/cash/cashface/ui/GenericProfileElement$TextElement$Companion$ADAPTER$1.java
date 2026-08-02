package com.squareup.protos.cash.cashface.ui;

import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenericProfileElement$TextElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericProfileElement.TextElement((String) obj, (GenericProfileElement.TextElement.Style) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = GenericProfileElement.TextElement.Style.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericProfileElement.TextElement textElement = (GenericProfileElement.TextElement) obj;
        reverseProtoWriter.getClass();
        textElement.getClass();
        reverseProtoWriter.writeBytes(textElement.unknownFields());
        GenericProfileElement.TextElement.Style.ADAPTER.encodeWithTag(reverseProtoWriter, 2, textElement.style);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, textElement.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericProfileElement.TextElement textElement = (GenericProfileElement.TextElement) obj;
        textElement.getClass();
        return GenericProfileElement.TextElement.Style.ADAPTER.encodedSizeWithTag(2, textElement.style) + ProtoAdapter.STRING.encodedSizeWithTag(1, textElement.text) + textElement.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericProfileElement.TextElement textElement = (GenericProfileElement.TextElement) obj;
        textElement.getClass();
        ByteString byteString = ByteString.EMPTY;
        GenericProfileElement.TextElement.Style style = textElement.style;
        byteString.getClass();
        return new GenericProfileElement.TextElement(null, style, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericProfileElement.TextElement textElement = (GenericProfileElement.TextElement) obj;
        textElement.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, textElement.text);
        GenericProfileElement.TextElement.Style.ADAPTER.encodeWithTag(protoWriter, 2, textElement.style);
        protoWriter.writeBytes(textElement.unknownFields());
    }
}
