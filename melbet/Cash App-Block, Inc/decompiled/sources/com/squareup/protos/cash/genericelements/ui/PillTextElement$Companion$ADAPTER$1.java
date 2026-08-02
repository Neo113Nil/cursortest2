package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PillTextElement$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new PillTextElement((String) obj, (Color) obj2, (Color) obj3, (Alignment) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj4 = Alignment.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PillTextElement pillTextElement = (PillTextElement) obj;
        reverseProtoWriter.getClass();
        pillTextElement.getClass();
        reverseProtoWriter.writeBytes(pillTextElement.unknownFields());
        Alignment.ADAPTER.encodeWithTag(reverseProtoWriter, 4, pillTextElement.alignment);
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, pillTextElement.background_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, pillTextElement.text_color);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, pillTextElement.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PillTextElement pillTextElement = (PillTextElement) obj;
        pillTextElement.getClass();
        int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, pillTextElement.text) + pillTextElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Color.ADAPTER;
        return Alignment.ADAPTER.encodedSizeWithTag(4, pillTextElement.alignment) + protoAdapter.encodedSizeWithTag(3, pillTextElement.background_color) + protoAdapter.encodedSizeWithTag(2, pillTextElement.text_color) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        PillTextElement pillTextElement = (PillTextElement) obj;
        pillTextElement.getClass();
        Color color = pillTextElement.text_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Color color3 = pillTextElement.background_color;
        Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
        ByteString byteString = ByteString.EMPTY;
        Alignment alignment = pillTextElement.alignment;
        byteString.getClass();
        return new PillTextElement(null, color2, color4, alignment, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PillTextElement pillTextElement = (PillTextElement) obj;
        pillTextElement.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, pillTextElement.text);
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, pillTextElement.text_color);
        protoAdapter.encodeWithTag(protoWriter, 3, pillTextElement.background_color);
        Alignment.ADAPTER.encodeWithTag(protoWriter, 4, pillTextElement.alignment);
        protoWriter.writeBytes(pillTextElement.unknownFields());
    }
}
