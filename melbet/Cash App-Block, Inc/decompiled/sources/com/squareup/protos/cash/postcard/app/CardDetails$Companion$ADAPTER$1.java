package com.squareup.protos.cash.postcard.app;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardDetails((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CardDetails cardDetails = (CardDetails) obj;
        reverseProtoWriter.getClass();
        cardDetails.getClass();
        reverseProtoWriter.writeBytes(cardDetails.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, cardDetails.expiration);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cardDetails.security_code);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cardDetails.pan);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardDetails cardDetails = (CardDetails) obj;
        cardDetails.getClass();
        int size$okio = cardDetails.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, cardDetails.expiration) + protoAdapter.encodedSizeWithTag(2, cardDetails.security_code) + protoAdapter.encodedSizeWithTag(1, cardDetails.pan) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((CardDetails) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CardDetails(null, null, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardDetails cardDetails = (CardDetails) obj;
        cardDetails.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cardDetails.pan);
        protoAdapter.encodeWithTag(protoWriter, 2, cardDetails.security_code);
        protoAdapter.encodeWithTag(protoWriter, 3, cardDetails.expiration);
        protoWriter.writeBytes(cardDetails.unknownFields());
    }
}
