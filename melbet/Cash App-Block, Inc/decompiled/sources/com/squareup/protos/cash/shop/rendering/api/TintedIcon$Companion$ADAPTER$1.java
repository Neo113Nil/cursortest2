package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class TintedIcon$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new TintedIcon((Icon) obj, (Color) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        TintedIcon tintedIcon = (TintedIcon) obj;
        reverseProtoWriter.getClass();
        tintedIcon.getClass();
        reverseProtoWriter.writeBytes(tintedIcon.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 2, tintedIcon.icon_color);
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, tintedIcon.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        TintedIcon tintedIcon = (TintedIcon) obj;
        tintedIcon.getClass();
        return Color.ADAPTER.encodedSizeWithTag(2, tintedIcon.icon_color) + Icon.ADAPTER.encodedSizeWithTag(1, tintedIcon.icon) + tintedIcon.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        TintedIcon tintedIcon = (TintedIcon) obj;
        tintedIcon.getClass();
        Icon icon = tintedIcon.icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        Color color = tintedIcon.icon_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new TintedIcon(icon2, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        TintedIcon tintedIcon = (TintedIcon) obj;
        tintedIcon.getClass();
        Icon.ADAPTER.encodeWithTag(protoWriter, 1, tintedIcon.icon);
        Color.ADAPTER.encodeWithTag(protoWriter, 2, tintedIcon.icon_color);
        protoWriter.writeBytes(tintedIcon.unknownFields());
    }
}
