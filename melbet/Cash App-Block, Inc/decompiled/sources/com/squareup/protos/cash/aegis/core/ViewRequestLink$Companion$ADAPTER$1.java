package com.squareup.protos.cash.aegis.core;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ViewRequestLink$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ViewRequestLink((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        ViewRequestLink viewRequestLink = (ViewRequestLink) obj;
        reverseProtoWriter.getClass();
        viewRequestLink.getClass();
        reverseProtoWriter.writeBytes(viewRequestLink.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, viewRequestLink.url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, viewRequestLink.text);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ViewRequestLink viewRequestLink = (ViewRequestLink) obj;
        viewRequestLink.getClass();
        int size$okio = viewRequestLink.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, viewRequestLink.url) + protoAdapter.encodedSizeWithTag(1, viewRequestLink.text) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ViewRequestLink viewRequestLink = (ViewRequestLink) obj;
        viewRequestLink.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = viewRequestLink.text;
        String str2 = viewRequestLink.url;
        byteString.getClass();
        return new ViewRequestLink(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ViewRequestLink viewRequestLink = (ViewRequestLink) obj;
        viewRequestLink.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, viewRequestLink.text);
        protoAdapter.encodeWithTag(protoWriter, 2, viewRequestLink.url);
        protoWriter.writeBytes(viewRequestLink.unknownFields());
    }
}
