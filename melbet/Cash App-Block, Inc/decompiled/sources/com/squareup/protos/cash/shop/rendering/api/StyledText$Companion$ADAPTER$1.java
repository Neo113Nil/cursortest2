package com.squareup.protos.cash.shop.rendering.api;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class StyledText$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StyledText((String) obj, (Color) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StyledText styledText = (StyledText) obj;
        reverseProtoWriter.getClass();
        styledText.getClass();
        reverseProtoWriter.writeBytes(styledText.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 2, styledText.text_color);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, styledText.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StyledText styledText = (StyledText) obj;
        styledText.getClass();
        return Color.ADAPTER.encodedSizeWithTag(2, styledText.text_color) + ProtoAdapter.STRING.encodedSizeWithTag(1, styledText.text) + styledText.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StyledText styledText = (StyledText) obj;
        styledText.getClass();
        Color color = styledText.text_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = styledText.text;
        byteString.getClass();
        return new StyledText(str, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StyledText styledText = (StyledText) obj;
        styledText.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, styledText.text);
        Color.ADAPTER.encodeWithTag(protoWriter, 2, styledText.text_color);
        protoWriter.writeBytes(styledText.unknownFields());
    }
}
