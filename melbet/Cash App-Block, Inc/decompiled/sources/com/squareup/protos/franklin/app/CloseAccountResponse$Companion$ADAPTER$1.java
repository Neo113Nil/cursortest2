package com.squareup.protos.franklin.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CloseAccountResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CloseAccountResponse(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CloseAccountResponse closeAccountResponse = (CloseAccountResponse) obj;
        reverseProtoWriter.getClass();
        closeAccountResponse.getClass();
        reverseProtoWriter.writeBytes(closeAccountResponse.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CloseAccountResponse closeAccountResponse = (CloseAccountResponse) obj;
        closeAccountResponse.getClass();
        return closeAccountResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((CloseAccountResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CloseAccountResponse(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CloseAccountResponse closeAccountResponse = (CloseAccountResponse) obj;
        closeAccountResponse.getClass();
        protoWriter.writeBytes(closeAccountResponse.unknownFields());
    }
}
