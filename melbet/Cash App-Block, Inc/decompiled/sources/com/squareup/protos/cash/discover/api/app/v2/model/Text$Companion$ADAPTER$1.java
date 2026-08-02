package com.squareup.protos.cash.discover.api.app.v2.model;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Text$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Text((String) obj, (Color) obj2, (Icon) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj2);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Text text = (Text) obj;
        reverseProtoWriter.getClass();
        text.getClass();
        reverseProtoWriter.writeBytes(text.unknownFields());
        Icon.ADAPTER.encodeWithTag(reverseProtoWriter, 4, text.icon);
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 2, text.text_color);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, text.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Text text = (Text) obj;
        text.getClass();
        return Icon.ADAPTER.encodedSizeWithTag(4, text.icon) + Color.ADAPTER.encodedSizeWithTag(2, text.text_color) + ProtoAdapter.STRING.encodedSizeWithTag(1, text.text) + text.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Text text = (Text) obj;
        text.getClass();
        Color color = text.text_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Icon icon = text.icon;
        Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Text(null, color2, icon2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Text text = (Text) obj;
        text.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, text.text);
        Color.ADAPTER.encodeWithTag(protoWriter, 2, text.text_color);
        Icon.ADAPTER.encodeWithTag(protoWriter, 4, text.icon);
        protoWriter.writeBytes(text.unknownFields());
    }
}
