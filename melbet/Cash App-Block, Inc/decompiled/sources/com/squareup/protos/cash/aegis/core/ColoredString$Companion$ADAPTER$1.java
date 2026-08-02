package com.squareup.protos.cash.aegis.core;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ColoredString$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ColoredString((LocalizedString) obj, (Color) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ColoredString coloredString = (ColoredString) obj;
        reverseProtoWriter.getClass();
        coloredString.getClass();
        reverseProtoWriter.writeBytes(coloredString.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 2, coloredString.color);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 1, coloredString.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ColoredString coloredString = (ColoredString) obj;
        coloredString.getClass();
        return Color.ADAPTER.encodedSizeWithTag(2, coloredString.color) + LocalizedString.ADAPTER.encodedSizeWithTag(1, coloredString.text) + coloredString.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ColoredString coloredString = (ColoredString) obj;
        coloredString.getClass();
        LocalizedString localizedString = coloredString.text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        Color color = coloredString.color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ColoredString(localizedString2, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ColoredString coloredString = (ColoredString) obj;
        coloredString.getClass();
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 1, coloredString.text);
        Color.ADAPTER.encodeWithTag(protoWriter, 2, coloredString.color);
        protoWriter.writeBytes(coloredString.unknownFields());
    }
}
