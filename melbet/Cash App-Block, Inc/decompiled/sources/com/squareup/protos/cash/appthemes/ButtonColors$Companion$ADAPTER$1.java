package com.squareup.protos.cash.appthemes;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ButtonColors$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ButtonColors((Color) obj, (Color) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ButtonColors buttonColors = (ButtonColors) obj;
        reverseProtoWriter.getClass();
        buttonColors.getClass();
        reverseProtoWriter.writeBytes(buttonColors.unknownFields());
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, buttonColors.payment_pad_main_buttons_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, buttonColors.currency_conversion_button_color);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ButtonColors buttonColors = (ButtonColors) obj;
        buttonColors.getClass();
        int size$okio = buttonColors.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Color.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, buttonColors.payment_pad_main_buttons_color) + protoAdapter.encodedSizeWithTag(1, buttonColors.currency_conversion_button_color) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ButtonColors buttonColors = (ButtonColors) obj;
        buttonColors.getClass();
        Color color = buttonColors.currency_conversion_button_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Color color3 = buttonColors.payment_pad_main_buttons_color;
        Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ButtonColors(color2, color4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ButtonColors buttonColors = (ButtonColors) obj;
        buttonColors.getClass();
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, buttonColors.currency_conversion_button_color);
        protoAdapter.encodeWithTag(protoWriter, 2, buttonColors.payment_pad_main_buttons_color);
        protoWriter.writeBytes(buttonColors.unknownFields());
    }
}
