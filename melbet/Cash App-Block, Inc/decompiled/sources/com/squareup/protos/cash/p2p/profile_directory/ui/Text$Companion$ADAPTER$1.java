package com.squareup.protos.cash.p2p.profile_directory.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
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
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Text((String) obj, (TextStyle) obj2, (TextDecoration) obj3, (Color) obj4, (Image) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 2) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                try {
                    obj2 = TextStyle.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 4) {
                obj4 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj4);
            } else if (nextTag == 5) {
                obj5 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj5);
            } else if (nextTag != 6) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj3 = TextDecoration.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
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
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 5, text.icon);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 4, text.text_color);
        TextDecoration.ADAPTER.encodeWithTag(reverseProtoWriter, 6, text.text_decoration);
        TextStyle.ADAPTER.encodeWithTag(reverseProtoWriter, 3, text.text_style);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, text.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Text text = (Text) obj;
        text.getClass();
        return Image.ADAPTER.encodedSizeWithTag(5, text.icon) + Color.ADAPTER.encodedSizeWithTag(4, text.text_color) + TextDecoration.ADAPTER.encodedSizeWithTag(6, text.text_decoration) + TextStyle.ADAPTER.encodedSizeWithTag(3, text.text_style) + ProtoAdapter.STRING.encodedSizeWithTag(2, text.text) + text.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Text text = (Text) obj;
        text.getClass();
        Color color = text.text_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Image image = text.icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        TextStyle textStyle = text.text_style;
        TextDecoration textDecoration = text.text_decoration;
        byteString.getClass();
        return new Text(null, textStyle, textDecoration, color2, image2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Text text = (Text) obj;
        text.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, text.text);
        TextStyle.ADAPTER.encodeWithTag(protoWriter, 3, text.text_style);
        TextDecoration.ADAPTER.encodeWithTag(protoWriter, 6, text.text_decoration);
        Color.ADAPTER.encodeWithTag(protoWriter, 4, text.text_color);
        Image.ADAPTER.encodeWithTag(protoWriter, 5, text.icon);
        protoWriter.writeBytes(text.unknownFields());
    }
}
