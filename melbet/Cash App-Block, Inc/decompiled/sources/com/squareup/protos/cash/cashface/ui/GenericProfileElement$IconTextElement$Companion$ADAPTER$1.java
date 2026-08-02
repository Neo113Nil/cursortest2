package com.squareup.protos.cash.cashface.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenericProfileElement$IconTextElement$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericProfileElement.IconTextElement((Image) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GenericProfileElement.IconTextElement iconTextElement = (GenericProfileElement.IconTextElement) obj;
        reverseProtoWriter.getClass();
        iconTextElement.getClass();
        reverseProtoWriter.writeBytes(iconTextElement.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, iconTextElement.title);
        Image.ADAPTER.encodeWithTag(reverseProtoWriter, 1, iconTextElement.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericProfileElement.IconTextElement iconTextElement = (GenericProfileElement.IconTextElement) obj;
        iconTextElement.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, iconTextElement.title) + Image.ADAPTER.encodedSizeWithTag(1, iconTextElement.icon) + iconTextElement.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericProfileElement.IconTextElement iconTextElement = (GenericProfileElement.IconTextElement) obj;
        iconTextElement.getClass();
        Image image = iconTextElement.icon;
        Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GenericProfileElement.IconTextElement(image2, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericProfileElement.IconTextElement iconTextElement = (GenericProfileElement.IconTextElement) obj;
        iconTextElement.getClass();
        Image.ADAPTER.encodeWithTag(protoWriter, 1, iconTextElement.icon);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, iconTextElement.title);
        protoWriter.writeBytes(iconTextElement.unknownFields());
    }
}
