package com.squareup.protos.cash.local.client.app.internal;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ClearAllCheckInsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ClearAllCheckInsResponse(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ClearAllCheckInsResponse clearAllCheckInsResponse = (ClearAllCheckInsResponse) obj;
        reverseProtoWriter.getClass();
        clearAllCheckInsResponse.getClass();
        reverseProtoWriter.writeBytes(clearAllCheckInsResponse.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ClearAllCheckInsResponse clearAllCheckInsResponse = (ClearAllCheckInsResponse) obj;
        clearAllCheckInsResponse.getClass();
        return clearAllCheckInsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((ClearAllCheckInsResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ClearAllCheckInsResponse(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ClearAllCheckInsResponse clearAllCheckInsResponse = (ClearAllCheckInsResponse) obj;
        clearAllCheckInsResponse.getClass();
        protoWriter.writeBytes(clearAllCheckInsResponse.unknownFields());
    }
}
