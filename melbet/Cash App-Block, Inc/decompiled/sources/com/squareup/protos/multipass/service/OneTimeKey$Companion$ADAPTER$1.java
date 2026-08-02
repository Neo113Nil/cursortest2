package com.squareup.protos.multipass.service;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OneTimeKey$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OneTimeKey((ByteString) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.BYTES.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        OneTimeKey oneTimeKey = (OneTimeKey) obj;
        reverseProtoWriter.getClass();
        oneTimeKey.getClass();
        reverseProtoWriter.writeBytes(oneTimeKey.unknownFields());
        ProtoAdapter.BYTES.encodeWithTag(reverseProtoWriter, 1, oneTimeKey.value);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OneTimeKey oneTimeKey = (OneTimeKey) obj;
        oneTimeKey.getClass();
        return ProtoAdapter.BYTES.encodedSizeWithTag(1, oneTimeKey.value) + oneTimeKey.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((OneTimeKey) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new OneTimeKey(null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OneTimeKey oneTimeKey = (OneTimeKey) obj;
        oneTimeKey.getClass();
        ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, oneTimeKey.value);
        protoWriter.writeBytes(oneTimeKey.unknownFields());
    }
}
