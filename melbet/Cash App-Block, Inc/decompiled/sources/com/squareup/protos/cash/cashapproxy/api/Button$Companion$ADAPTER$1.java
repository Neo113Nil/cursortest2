package com.squareup.protos.cash.cashapproxy.api;

import androidx.room.TransactorKt;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Button$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Button((Text) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(Text.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Button button = (Button) obj;
        reverseProtoWriter.getClass();
        button.getClass();
        reverseProtoWriter.writeBytes(button.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, button.action_url);
        Text.ADAPTER.encodeWithTag(reverseProtoWriter, 1, button.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Button button = (Button) obj;
        button.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, button.action_url) + Text.ADAPTER.encodedSizeWithTag(1, button.title) + button.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Button button = (Button) obj;
        button.getClass();
        Text text = button.title;
        Text text2 = text != null ? (Text) Text.ADAPTER.redact(text) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new Button(text2, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Button button = (Button) obj;
        button.getClass();
        Text.ADAPTER.encodeWithTag(protoWriter, 1, button.title);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, button.action_url);
        protoWriter.writeBytes(button.unknownFields());
    }
}
