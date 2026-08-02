package com.squareup.protos.cash.messagingplatformcommon.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class NavigationIcon$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new NavigationIcon((Color) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        NavigationIcon navigationIcon = (NavigationIcon) obj;
        reverseProtoWriter.getClass();
        navigationIcon.getClass();
        reverseProtoWriter.writeBytes(navigationIcon.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 1, navigationIcon.color);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        NavigationIcon navigationIcon = (NavigationIcon) obj;
        navigationIcon.getClass();
        return Color.ADAPTER.encodedSizeWithTag(1, navigationIcon.color) + navigationIcon.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NavigationIcon navigationIcon = (NavigationIcon) obj;
        navigationIcon.getClass();
        Color color = navigationIcon.color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new NavigationIcon(color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        NavigationIcon navigationIcon = (NavigationIcon) obj;
        navigationIcon.getClass();
        Color.ADAPTER.encodeWithTag(protoWriter, 1, navigationIcon.color);
        protoWriter.writeBytes(navigationIcon.unknownFields());
    }
}
