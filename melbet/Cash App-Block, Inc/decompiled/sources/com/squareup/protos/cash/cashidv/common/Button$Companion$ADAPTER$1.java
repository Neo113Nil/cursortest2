package com.squareup.protos.cash.cashidv.common;

import com.squareup.protos.cash.cashidv.common.Button;
import com.squareup.wire.FieldEncoding;
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
                return new Button((String) obj, (Button.Action) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                try {
                    obj2 = Button.Action.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Button button = (Button) obj;
        reverseProtoWriter.getClass();
        button.getClass();
        reverseProtoWriter.writeBytes(button.unknownFields());
        Button.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 2, button.action);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, button.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Button button = (Button) obj;
        button.getClass();
        return Button.Action.ADAPTER.encodedSizeWithTag(2, button.action) + ProtoAdapter.STRING.encodedSizeWithTag(1, button.text) + button.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Button button = (Button) obj;
        button.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = button.text;
        Button.Action action = button.action;
        byteString.getClass();
        return new Button(str, action, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Button button = (Button) obj;
        button.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, button.text);
        Button.Action.ADAPTER.encodeWithTag(protoWriter, 2, button.action);
        protoWriter.writeBytes(button.unknownFields());
    }
}
