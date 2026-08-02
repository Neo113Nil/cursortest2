package com.squareup.protos.cash.local.client.app.v1.card;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.local.client.app.v1.card.LocalCard;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalCard$ColorPalette$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new LocalCard.ColorPalette((Color) obj, (Color) obj2, (Color) obj3, (Color) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
            } else if (nextTag == 3) {
                obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj3);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        LocalCard.ColorPalette colorPalette = (LocalCard.ColorPalette) obj;
        reverseProtoWriter.getClass();
        colorPalette.getClass();
        reverseProtoWriter.writeBytes(colorPalette.unknownFields());
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, colorPalette.action_button_foreground_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, colorPalette.action_button_background_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, colorPalette.foreground_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, colorPalette.background_color);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        LocalCard.ColorPalette colorPalette = (LocalCard.ColorPalette) obj;
        colorPalette.getClass();
        int size$okio = colorPalette.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Color.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, colorPalette.action_button_foreground_color) + protoAdapter.encodedSizeWithTag(3, colorPalette.action_button_background_color) + protoAdapter.encodedSizeWithTag(2, colorPalette.foreground_color) + protoAdapter.encodedSizeWithTag(1, colorPalette.background_color) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        LocalCard.ColorPalette colorPalette = (LocalCard.ColorPalette) obj;
        colorPalette.getClass();
        Color color = colorPalette.background_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Color color3 = colorPalette.foreground_color;
        Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
        Color color5 = colorPalette.action_button_background_color;
        Color color6 = color5 != null ? (Color) Color.ADAPTER.redact(color5) : null;
        Color color7 = colorPalette.action_button_foreground_color;
        Color color8 = color7 != null ? (Color) Color.ADAPTER.redact(color7) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new LocalCard.ColorPalette(color2, color4, color6, color8, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        LocalCard.ColorPalette colorPalette = (LocalCard.ColorPalette) obj;
        colorPalette.getClass();
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, colorPalette.background_color);
        protoAdapter.encodeWithTag(protoWriter, 2, colorPalette.foreground_color);
        protoAdapter.encodeWithTag(protoWriter, 3, colorPalette.action_button_background_color);
        protoAdapter.encodeWithTag(protoWriter, 4, colorPalette.action_button_foreground_color);
        protoWriter.writeBytes(colorPalette.unknownFields());
    }
}
