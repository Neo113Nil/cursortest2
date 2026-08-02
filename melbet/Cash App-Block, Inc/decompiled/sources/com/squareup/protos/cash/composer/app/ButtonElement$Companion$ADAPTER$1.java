package com.squareup.protos.cash.composer.app;

import com.squareup.protos.cash.composer.app.ButtonElement;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ButtonElement$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ButtonElement((String) obj, (ButtonElement.ButtonStyle) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                try {
                    obj2 = ButtonElement.ButtonStyle.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ButtonElement buttonElement = (ButtonElement) obj;
        reverseProtoWriter.getClass();
        buttonElement.getClass();
        reverseProtoWriter.writeBytes(buttonElement.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, buttonElement.analytics_key);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, buttonElement.url);
        ButtonElement.ButtonStyle.ADAPTER.encodeWithTag(reverseProtoWriter, 2, buttonElement.style);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, buttonElement.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ButtonElement buttonElement = (ButtonElement) obj;
        buttonElement.getClass();
        int size$okio = buttonElement.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, buttonElement.analytics_key) + protoAdapter.encodedSizeWithTag(3, buttonElement.url) + ButtonElement.ButtonStyle.ADAPTER.encodedSizeWithTag(2, buttonElement.style) + protoAdapter.encodedSizeWithTag(1, buttonElement.text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ButtonElement buttonElement = (ButtonElement) obj;
        buttonElement.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = buttonElement.text;
        ButtonElement.ButtonStyle buttonStyle = buttonElement.style;
        String str2 = buttonElement.url;
        String str3 = buttonElement.analytics_key;
        byteString.getClass();
        return new ButtonElement(str, buttonStyle, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ButtonElement buttonElement = (ButtonElement) obj;
        buttonElement.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, buttonElement.text);
        ButtonElement.ButtonStyle.ADAPTER.encodeWithTag(protoWriter, 2, buttonElement.style);
        protoAdapter.encodeWithTag(protoWriter, 3, buttonElement.url);
        protoAdapter.encodeWithTag(protoWriter, 4, buttonElement.analytics_key);
        protoWriter.writeBytes(buttonElement.unknownFields());
    }
}
