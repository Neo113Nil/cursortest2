package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ChatMessage$SunshineFileBody$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ChatMessage.SunshineFileBody((String) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ChatMessage.SunshineFileBody sunshineFileBody = (ChatMessage.SunshineFileBody) obj;
        reverseProtoWriter.getClass();
        sunshineFileBody.getClass();
        reverseProtoWriter.writeBytes(sunshineFileBody.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, sunshineFileBody.file_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, sunshineFileBody.media_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, sunshineFileBody.media_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, sunshineFileBody.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ChatMessage.SunshineFileBody sunshineFileBody = (ChatMessage.SunshineFileBody) obj;
        sunshineFileBody.getClass();
        int size$okio = sunshineFileBody.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, sunshineFileBody.file_name) + protoAdapter.encodedSizeWithTag(3, sunshineFileBody.media_type) + protoAdapter.encodedSizeWithTag(2, sunshineFileBody.media_url) + protoAdapter.encodedSizeWithTag(1, sunshineFileBody.text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ChatMessage.SunshineFileBody sunshineFileBody = (ChatMessage.SunshineFileBody) obj;
        sunshineFileBody.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = sunshineFileBody.text;
        String str2 = sunshineFileBody.media_url;
        String str3 = sunshineFileBody.media_type;
        String str4 = sunshineFileBody.file_name;
        byteString.getClass();
        return new ChatMessage.SunshineFileBody(str, str2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ChatMessage.SunshineFileBody sunshineFileBody = (ChatMessage.SunshineFileBody) obj;
        sunshineFileBody.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, sunshineFileBody.text);
        protoAdapter.encodeWithTag(protoWriter, 2, sunshineFileBody.media_url);
        protoAdapter.encodeWithTag(protoWriter, 3, sunshineFileBody.media_type);
        protoAdapter.encodeWithTag(protoWriter, 4, sunshineFileBody.file_name);
        protoWriter.writeBytes(sunshineFileBody.unknownFields());
    }
}
