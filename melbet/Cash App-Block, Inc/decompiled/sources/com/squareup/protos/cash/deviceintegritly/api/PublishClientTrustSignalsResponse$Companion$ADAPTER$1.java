package com.squareup.protos.cash.deviceintegritly.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class PublishClientTrustSignalsResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new PublishClientTrustSignalsResponse(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        PublishClientTrustSignalsResponse publishClientTrustSignalsResponse = (PublishClientTrustSignalsResponse) obj;
        reverseProtoWriter.getClass();
        publishClientTrustSignalsResponse.getClass();
        reverseProtoWriter.writeBytes(publishClientTrustSignalsResponse.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        PublishClientTrustSignalsResponse publishClientTrustSignalsResponse = (PublishClientTrustSignalsResponse) obj;
        publishClientTrustSignalsResponse.getClass();
        return publishClientTrustSignalsResponse.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((PublishClientTrustSignalsResponse) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new PublishClientTrustSignalsResponse(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        PublishClientTrustSignalsResponse publishClientTrustSignalsResponse = (PublishClientTrustSignalsResponse) obj;
        publishClientTrustSignalsResponse.getClass();
        protoWriter.writeBytes(publishClientTrustSignalsResponse.unknownFields());
    }
}
