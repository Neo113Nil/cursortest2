package com.squareup.protos.timecards;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class GetClockinEssentialsRequest$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new GetClockinEssentialsRequest(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        GetClockinEssentialsRequest getClockinEssentialsRequest = (GetClockinEssentialsRequest) obj;
        reverseProtoWriter.getClass();
        getClockinEssentialsRequest.getClass();
        reverseProtoWriter.writeBytes(getClockinEssentialsRequest.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        GetClockinEssentialsRequest getClockinEssentialsRequest = (GetClockinEssentialsRequest) obj;
        getClockinEssentialsRequest.getClass();
        return getClockinEssentialsRequest.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((GetClockinEssentialsRequest) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new GetClockinEssentialsRequest(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        GetClockinEssentialsRequest getClockinEssentialsRequest = (GetClockinEssentialsRequest) obj;
        getClockinEssentialsRequest.getClass();
        protoWriter.writeBytes(getClockinEssentialsRequest.unknownFields());
    }
}
