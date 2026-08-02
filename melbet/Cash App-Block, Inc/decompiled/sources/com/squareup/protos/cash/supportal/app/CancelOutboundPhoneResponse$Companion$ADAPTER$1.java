package com.squareup.protos.cash.supportal.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class CancelOutboundPhoneResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CancelOutboundPhoneResponse((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        CancelOutboundPhoneResponse cancelOutboundPhoneResponse = (CancelOutboundPhoneResponse) obj;
        reverseProtoWriter.getClass();
        cancelOutboundPhoneResponse.getClass();
        reverseProtoWriter.writeBytes(cancelOutboundPhoneResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cancelOutboundPhoneResponse.message);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cancelOutboundPhoneResponse.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CancelOutboundPhoneResponse cancelOutboundPhoneResponse = (CancelOutboundPhoneResponse) obj;
        cancelOutboundPhoneResponse.getClass();
        int size$okio = cancelOutboundPhoneResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, cancelOutboundPhoneResponse.message) + protoAdapter.encodedSizeWithTag(1, cancelOutboundPhoneResponse.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CancelOutboundPhoneResponse cancelOutboundPhoneResponse = (CancelOutboundPhoneResponse) obj;
        cancelOutboundPhoneResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = cancelOutboundPhoneResponse.title;
        String str2 = cancelOutboundPhoneResponse.message;
        byteString.getClass();
        return new CancelOutboundPhoneResponse(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CancelOutboundPhoneResponse cancelOutboundPhoneResponse = (CancelOutboundPhoneResponse) obj;
        cancelOutboundPhoneResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cancelOutboundPhoneResponse.title);
        protoAdapter.encodeWithTag(protoWriter, 2, cancelOutboundPhoneResponse.message);
        protoWriter.writeBytes(cancelOutboundPhoneResponse.unknownFields());
    }
}
