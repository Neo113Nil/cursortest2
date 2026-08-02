package com.squareup.protos.cash.cashface.ui;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.cashface.ui.GenericProfileElement;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class GenericProfileElement$ColorScheme$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GenericProfileElement.ColorScheme((Color) obj, (Color) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        GenericProfileElement.ColorScheme colorScheme = (GenericProfileElement.ColorScheme) obj;
        reverseProtoWriter.getClass();
        colorScheme.getClass();
        reverseProtoWriter.writeBytes(colorScheme.unknownFields());
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, colorScheme.secondary);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, colorScheme.primary);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GenericProfileElement.ColorScheme colorScheme = (GenericProfileElement.ColorScheme) obj;
        colorScheme.getClass();
        int size$okio = colorScheme.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Color.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, colorScheme.secondary) + protoAdapter.encodedSizeWithTag(1, colorScheme.primary) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        GenericProfileElement.ColorScheme colorScheme = (GenericProfileElement.ColorScheme) obj;
        colorScheme.getClass();
        Color color = colorScheme.primary;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        Color color3 = colorScheme.secondary;
        Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GenericProfileElement.ColorScheme(color2, color4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GenericProfileElement.ColorScheme colorScheme = (GenericProfileElement.ColorScheme) obj;
        colorScheme.getClass();
        ProtoAdapter protoAdapter = Color.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, colorScheme.primary);
        protoAdapter.encodeWithTag(protoWriter, 2, colorScheme.secondary);
        protoWriter.writeBytes(colorScheme.unknownFields());
    }
}
