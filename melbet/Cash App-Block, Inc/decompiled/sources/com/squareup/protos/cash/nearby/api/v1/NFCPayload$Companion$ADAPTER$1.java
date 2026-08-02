package com.squareup.protos.cash.nearby.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class NFCPayload$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new NFCPayload((String) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        NFCPayload nFCPayload = (NFCPayload) obj;
        reverseProtoWriter.getClass();
        nFCPayload.getClass();
        reverseProtoWriter.writeBytes(nFCPayload.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, nFCPayload.payload_data);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        NFCPayload nFCPayload = (NFCPayload) obj;
        nFCPayload.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(1, nFCPayload.payload_data) + nFCPayload.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        NFCPayload nFCPayload = (NFCPayload) obj;
        nFCPayload.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = nFCPayload.payload_data;
        byteString.getClass();
        return new NFCPayload(str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        NFCPayload nFCPayload = (NFCPayload) obj;
        nFCPayload.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, nFCPayload.payload_data);
        protoWriter.writeBytes(nFCPayload.unknownFields());
    }
}
