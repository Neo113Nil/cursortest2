package com.squareup.protos.cash.genericelements.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class StyleAttributes$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new StyleAttributes((Color) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        StyleAttributes styleAttributes = (StyleAttributes) obj;
        reverseProtoWriter.getClass();
        styleAttributes.getClass();
        reverseProtoWriter.writeBytes(styleAttributes.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, styleAttributes.show_drop_shadow);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 1, styleAttributes.background_color);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        StyleAttributes styleAttributes = (StyleAttributes) obj;
        styleAttributes.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(2, styleAttributes.show_drop_shadow) + Color.ADAPTER.encodedSizeWithTag(1, styleAttributes.background_color) + styleAttributes.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        StyleAttributes styleAttributes = (StyleAttributes) obj;
        styleAttributes.getClass();
        Color color = styleAttributes.background_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        Boolean bool = styleAttributes.show_drop_shadow;
        byteString.getClass();
        return new StyleAttributes(color2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        StyleAttributes styleAttributes = (StyleAttributes) obj;
        styleAttributes.getClass();
        Color.ADAPTER.encodeWithTag(protoWriter, 1, styleAttributes.background_color);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, styleAttributes.show_drop_shadow);
        protoWriter.writeBytes(styleAttributes.unknownFields());
    }
}
