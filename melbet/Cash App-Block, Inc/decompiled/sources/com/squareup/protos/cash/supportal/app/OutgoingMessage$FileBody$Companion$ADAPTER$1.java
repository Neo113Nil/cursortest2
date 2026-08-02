package com.squareup.protos.cash.supportal.app;

import com.squareup.protos.cash.supportal.app.OutgoingMessage;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OutgoingMessage$FileBody$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OutgoingMessage.FileBody((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OutgoingMessage.FileBody fileBody = (OutgoingMessage.FileBody) obj;
        reverseProtoWriter.getClass();
        fileBody.getClass();
        reverseProtoWriter.writeBytes(fileBody.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, fileBody.file_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, fileBody.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OutgoingMessage.FileBody fileBody = (OutgoingMessage.FileBody) obj;
        fileBody.getClass();
        int size$okio = fileBody.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, fileBody.file_token) + protoAdapter.encodedSizeWithTag(1, fileBody.text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OutgoingMessage.FileBody fileBody = (OutgoingMessage.FileBody) obj;
        fileBody.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = fileBody.text;
        String str2 = fileBody.file_token;
        byteString.getClass();
        return new OutgoingMessage.FileBody(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OutgoingMessage.FileBody fileBody = (OutgoingMessage.FileBody) obj;
        fileBody.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, fileBody.text);
        protoAdapter.encodeWithTag(protoWriter, 2, fileBody.file_token);
        protoWriter.writeBytes(fileBody.unknownFields());
    }
}
