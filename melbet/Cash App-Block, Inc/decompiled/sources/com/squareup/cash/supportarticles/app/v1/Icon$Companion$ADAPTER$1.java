package com.squareup.cash.supportarticles.app.v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Icon$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Icon((Glyph) obj, (Color) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = Glyph.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = Color.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Icon icon = (Icon) obj;
        reverseProtoWriter.getClass();
        icon.getClass();
        reverseProtoWriter.writeBytes(icon.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 2, icon.color);
        Glyph.ADAPTER.encodeWithTag(reverseProtoWriter, 1, icon.glyph);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Icon icon = (Icon) obj;
        icon.getClass();
        return Color.ADAPTER.encodedSizeWithTag(2, icon.color) + Glyph.ADAPTER.encodedSizeWithTag(1, icon.glyph) + icon.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Icon icon = (Icon) obj;
        icon.getClass();
        ByteString byteString = ByteString.EMPTY;
        Glyph glyph = icon.glyph;
        Color color = icon.color;
        byteString.getClass();
        return new Icon(glyph, color, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Icon icon = (Icon) obj;
        icon.getClass();
        Glyph.ADAPTER.encodeWithTag(protoWriter, 1, icon.glyph);
        Color.ADAPTER.encodeWithTag(protoWriter, 2, icon.color);
        protoWriter.writeBytes(icon.unknownFields());
    }
}
