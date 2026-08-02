package com.squareup.protos.cash.peddle.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class UpdateAdvertiseIdResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new UpdateAdvertiseIdResponse(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        UpdateAdvertiseIdResponse updateAdvertiseIdResponse = (UpdateAdvertiseIdResponse) obj;
        reverseProtoWriter.getClass();
        updateAdvertiseIdResponse.getClass();
        reverseProtoWriter.writeBytes(updateAdvertiseIdResponse.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        UpdateAdvertiseIdResponse updateAdvertiseIdResponse = (UpdateAdvertiseIdResponse) obj;
        updateAdvertiseIdResponse.getClass();
        return updateAdvertiseIdResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((UpdateAdvertiseIdResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new UpdateAdvertiseIdResponse(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        UpdateAdvertiseIdResponse updateAdvertiseIdResponse = (UpdateAdvertiseIdResponse) obj;
        updateAdvertiseIdResponse.getClass();
        protoWriter.writeBytes(updateAdvertiseIdResponse.unknownFields());
    }
}
