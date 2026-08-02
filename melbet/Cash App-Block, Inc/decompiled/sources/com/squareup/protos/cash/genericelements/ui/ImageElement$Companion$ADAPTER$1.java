package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.genericelements.ui.ImageElement;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ImageElement$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ImageElement((Image) obj, (Color) obj2, (Alignment) obj3, (ImageElement.Size) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                try {
                    obj3 = Alignment.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 4) {
                try {
                    obj4 = ImageElement.Size.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                }
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ImageElement imageElement = (ImageElement) obj;
        reverseProtoWriter.getClass();
        imageElement.getClass();
        reverseProtoWriter.writeBytes(imageElement.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 5, imageElement.accessibility_label);
        ImageElement.Size.ADAPTER.encodeWithTag(reverseProtoWriter, 4, imageElement.size);
        Alignment.ADAPTER.encodeWithTag(reverseProtoWriter, 3, imageElement.alignment);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 2, imageElement.color);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, imageElement.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ImageElement imageElement = (ImageElement) obj;
        imageElement.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(5, imageElement.accessibility_label) + ImageElement.Size.ADAPTER.encodedSizeWithTag(4, imageElement.size) + Alignment.ADAPTER.encodedSizeWithTag(3, imageElement.alignment) + Color.ADAPTER.encodedSizeWithTag(2, imageElement.color) + Image.ADAPTER.encodedSizeWithTag(1, imageElement.icon) + imageElement.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ImageElement imageElement = (ImageElement) obj;
        imageElement.getClass();
        Image image = imageElement.icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        Color color = imageElement.color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        Alignment alignment = imageElement.alignment;
        ImageElement.Size size = imageElement.size;
        String str = imageElement.accessibility_label;
        byteString.getClass();
        return new ImageElement(image2, color2, alignment, size, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ImageElement imageElement = (ImageElement) obj;
        imageElement.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, imageElement.icon);
        Color.ADAPTER.encodeWithTag(protoWriter, 2, imageElement.color);
        Alignment.ADAPTER.encodeWithTag(protoWriter, 3, imageElement.alignment);
        ImageElement.Size.ADAPTER.encodeWithTag(protoWriter, 4, imageElement.size);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, imageElement.accessibility_label);
        protoWriter.writeBytes(imageElement.unknownFields());
    }
}
