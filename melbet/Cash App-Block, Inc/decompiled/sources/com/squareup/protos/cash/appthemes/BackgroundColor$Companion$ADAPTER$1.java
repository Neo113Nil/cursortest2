package com.squareup.protos.cash.appthemes;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BackgroundColor$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BackgroundColor((Color) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BackgroundColor backgroundColor = (BackgroundColor) obj;
        reverseProtoWriter.getClass();
        backgroundColor.getClass();
        reverseProtoWriter.writeBytes(backgroundColor.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 1, backgroundColor.color);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BackgroundColor backgroundColor = (BackgroundColor) obj;
        backgroundColor.getClass();
        return Color.ADAPTER.encodedSizeWithTag(1, backgroundColor.color) + backgroundColor.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BackgroundColor backgroundColor = (BackgroundColor) obj;
        backgroundColor.getClass();
        Color color = backgroundColor.color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BackgroundColor(color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BackgroundColor backgroundColor = (BackgroundColor) obj;
        backgroundColor.getClass();
        Color.ADAPTER.encodeWithTag(protoWriter, 1, backgroundColor.color);
        protoWriter.writeBytes(backgroundColor.unknownFields());
    }
}
