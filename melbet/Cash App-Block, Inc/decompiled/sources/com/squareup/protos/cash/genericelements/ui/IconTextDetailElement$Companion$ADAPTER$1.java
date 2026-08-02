package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class IconTextDetailElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new IconTextDetailElement((ImageElement) obj, (TextElement) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ImageElement.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(TextElement.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        IconTextDetailElement iconTextDetailElement = (IconTextDetailElement) obj;
        reverseProtoWriter.getClass();
        iconTextDetailElement.getClass();
        reverseProtoWriter.writeBytes(iconTextDetailElement.unknownFields());
        TextElement.ADAPTER.encodeWithTag(reverseProtoWriter, 2, iconTextDetailElement.text);
        ImageElement.ADAPTER.encodeWithTag(reverseProtoWriter, 1, iconTextDetailElement.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        IconTextDetailElement iconTextDetailElement = (IconTextDetailElement) obj;
        iconTextDetailElement.getClass();
        return TextElement.ADAPTER.encodedSizeWithTag(2, iconTextDetailElement.text) + ImageElement.ADAPTER.encodedSizeWithTag(1, iconTextDetailElement.icon) + iconTextDetailElement.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        IconTextDetailElement iconTextDetailElement = (IconTextDetailElement) obj;
        iconTextDetailElement.getClass();
        ImageElement imageElement = iconTextDetailElement.icon;
        ImageElement imageElement2 = imageElement != null ? (ImageElement) ImageElement.ADAPTER.redact(imageElement) : null;
        TextElement textElement = iconTextDetailElement.text;
        TextElement textElement2 = textElement != null ? (TextElement) TextElement.ADAPTER.redact(textElement) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new IconTextDetailElement(imageElement2, textElement2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        IconTextDetailElement iconTextDetailElement = (IconTextDetailElement) obj;
        iconTextDetailElement.getClass();
        ImageElement.ADAPTER.encodeWithTag(protoWriter, 1, iconTextDetailElement.icon);
        TextElement.ADAPTER.encodeWithTag(protoWriter, 2, iconTextDetailElement.text);
        protoWriter.writeBytes(iconTextDetailElement.unknownFields());
    }
}
