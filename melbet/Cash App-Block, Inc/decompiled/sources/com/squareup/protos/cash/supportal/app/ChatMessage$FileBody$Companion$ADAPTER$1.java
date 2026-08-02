package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.ChatMessage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ChatMessage$FileBody$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ChatMessage.FileBody((String) obj, (String) obj2, (String) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        ChatMessage.FileBody fileBody = (ChatMessage.FileBody) obj;
        reverseProtoWriter.getClass();
        fileBody.getClass();
        reverseProtoWriter.writeBytes(fileBody.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, fileBody.file_name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, fileBody.mime_type);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, fileBody.file_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, fileBody.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ChatMessage.FileBody fileBody = (ChatMessage.FileBody) obj;
        fileBody.getClass();
        int size$okio = fileBody.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(4, fileBody.file_name) + protoAdapter.encodedSizeWithTag(3, fileBody.mime_type) + protoAdapter.encodedSizeWithTag(2, fileBody.file_token) + protoAdapter.encodedSizeWithTag(1, fileBody.text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ChatMessage.FileBody fileBody = (ChatMessage.FileBody) obj;
        fileBody.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = fileBody.text;
        String str2 = fileBody.file_token;
        String str3 = fileBody.mime_type;
        String str4 = fileBody.file_name;
        byteString.getClass();
        return new ChatMessage.FileBody(str, str2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ChatMessage.FileBody fileBody = (ChatMessage.FileBody) obj;
        fileBody.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, fileBody.text);
        protoAdapter.encodeWithTag(protoWriter, 2, fileBody.file_token);
        protoAdapter.encodeWithTag(protoWriter, 3, fileBody.mime_type);
        protoAdapter.encodeWithTag(protoWriter, 4, fileBody.file_name);
        protoWriter.writeBytes(fileBody.unknownFields());
    }
}
