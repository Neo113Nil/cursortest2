package com.squareup.protos.cash.messagingplatformcommon.app;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes.dex */
public final class AppMessageAction$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new AppMessageAction((String) obj, (String) obj2, (String) obj3, (Color) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, protoReader, obj4);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        AppMessageAction appMessageAction = (AppMessageAction) obj;
        reverseProtoWriter.getClass();
        appMessageAction.getClass();
        reverseProtoWriter.writeBytes(appMessageAction.unknownFields());
        Color.ADAPTER.encodeWithTag(reverseProtoWriter, 4, appMessageAction.text_color);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, appMessageAction.deprecated_text_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, appMessageAction.text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, appMessageAction.url_to_open);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        AppMessageAction appMessageAction = (AppMessageAction) obj;
        appMessageAction.getClass();
        int size$okio = appMessageAction.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return Color.ADAPTER.encodedSizeWithTag(4, appMessageAction.text_color) + protoAdapter.encodedSizeWithTag(3, appMessageAction.deprecated_text_color) + protoAdapter.encodedSizeWithTag(2, appMessageAction.text) + protoAdapter.encodedSizeWithTag(1, appMessageAction.url_to_open) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        AppMessageAction appMessageAction = (AppMessageAction) obj;
        appMessageAction.getClass();
        Color color = appMessageAction.text_color;
        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = appMessageAction.url_to_open;
        String str2 = appMessageAction.text;
        String str3 = appMessageAction.deprecated_text_color;
        byteString.getClass();
        return new AppMessageAction(str, str2, str3, color2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        AppMessageAction appMessageAction = (AppMessageAction) obj;
        appMessageAction.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, appMessageAction.url_to_open);
        protoAdapter.encodeWithTag(protoWriter, 2, appMessageAction.text);
        protoAdapter.encodeWithTag(protoWriter, 3, appMessageAction.deprecated_text_color);
        Color.ADAPTER.encodeWithTag(protoWriter, 4, appMessageAction.text_color);
        protoWriter.writeBytes(appMessageAction.unknownFields());
    }
}
