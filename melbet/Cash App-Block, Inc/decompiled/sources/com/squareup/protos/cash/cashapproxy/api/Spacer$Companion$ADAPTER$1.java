package com.squareup.protos.cash.cashapproxy.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class Spacer$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new Spacer((Integer) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.INT32.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        Spacer spacer = (Spacer) obj;
        reverseProtoWriter.getClass();
        spacer.getClass();
        reverseProtoWriter.writeBytes(spacer.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 1, spacer.size);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Spacer spacer = (Spacer) obj;
        spacer.getClass();
        return ProtoAdapter.INT32.encodedSizeWithTag(1, spacer.size) + spacer.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Spacer spacer = (Spacer) obj;
        spacer.getClass();
        ByteString byteString = ByteString.EMPTY;
        Integer num = spacer.size;
        byteString.getClass();
        return new Spacer(num, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        Spacer spacer = (Spacer) obj;
        spacer.getClass();
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, spacer.size);
        protoWriter.writeBytes(spacer.unknownFields());
    }
}
