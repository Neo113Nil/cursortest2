package com.squareup.protos.cash.aliases;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Cashtag$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Cashtag((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        Cashtag cashtag = (Cashtag) obj;
        reverseProtoWriter.getClass();
        cashtag.getClass();
        reverseProtoWriter.writeBytes(cashtag.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cashtag.name);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cashtag.prefix);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Cashtag cashtag = (Cashtag) obj;
        cashtag.getClass();
        int size$okio = cashtag.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, cashtag.name) + protoAdapter.encodedSizeWithTag(1, cashtag.prefix) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Cashtag cashtag = (Cashtag) obj;
        cashtag.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = cashtag.prefix;
        byteString.getClass();
        return new Cashtag(str, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Cashtag cashtag = (Cashtag) obj;
        cashtag.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cashtag.prefix);
        protoAdapter.encodeWithTag(protoWriter, 2, cashtag.name);
        protoWriter.writeBytes(cashtag.unknownFields());
    }
}
