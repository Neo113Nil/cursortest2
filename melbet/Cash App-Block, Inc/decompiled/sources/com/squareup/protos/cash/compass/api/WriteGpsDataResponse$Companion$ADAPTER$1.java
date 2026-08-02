package com.squareup.protos.cash.compass.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class WriteGpsDataResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new WriteGpsDataResponse(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        WriteGpsDataResponse writeGpsDataResponse = (WriteGpsDataResponse) obj;
        reverseProtoWriter.getClass();
        writeGpsDataResponse.getClass();
        reverseProtoWriter.writeBytes(writeGpsDataResponse.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        WriteGpsDataResponse writeGpsDataResponse = (WriteGpsDataResponse) obj;
        writeGpsDataResponse.getClass();
        return writeGpsDataResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((WriteGpsDataResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new WriteGpsDataResponse(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        WriteGpsDataResponse writeGpsDataResponse = (WriteGpsDataResponse) obj;
        writeGpsDataResponse.getClass();
        protoWriter.writeBytes(writeGpsDataResponse.unknownFields());
    }
}
