package com.squareup.protos.franklin.common;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class ClientDisplayTheme$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ClientDisplayTheme((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        ClientDisplayTheme clientDisplayTheme = (ClientDisplayTheme) obj;
        reverseProtoWriter.getClass();
        clientDisplayTheme.getClass();
        reverseProtoWriter.writeBytes(clientDisplayTheme.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, clientDisplayTheme.accent_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, clientDisplayTheme.base_color);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ClientDisplayTheme clientDisplayTheme = (ClientDisplayTheme) obj;
        clientDisplayTheme.getClass();
        int size$okio = clientDisplayTheme.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, clientDisplayTheme.accent_color) + protoAdapter.encodedSizeWithTag(1, clientDisplayTheme.base_color) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ClientDisplayTheme clientDisplayTheme = (ClientDisplayTheme) obj;
        clientDisplayTheme.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = clientDisplayTheme.base_color;
        String str2 = clientDisplayTheme.accent_color;
        byteString.getClass();
        return new ClientDisplayTheme(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClientDisplayTheme clientDisplayTheme = (ClientDisplayTheme) obj;
        clientDisplayTheme.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, clientDisplayTheme.base_color);
        protoAdapter.encodeWithTag(protoWriter, 2, clientDisplayTheme.accent_color);
        protoWriter.writeBytes(clientDisplayTheme.unknownFields());
    }
}
