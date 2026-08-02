package com.squareup.protos.cash.cashliteflow.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CardProcessorDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CardProcessorDetails((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        CardProcessorDetails cardProcessorDetails = (CardProcessorDetails) obj;
        reverseProtoWriter.getClass();
        cardProcessorDetails.getClass();
        reverseProtoWriter.writeBytes(cardProcessorDetails.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cardProcessorDetails.time_based_secret);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, cardProcessorDetails.processor_card_id);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CardProcessorDetails cardProcessorDetails = (CardProcessorDetails) obj;
        cardProcessorDetails.getClass();
        int size$okio = cardProcessorDetails.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, cardProcessorDetails.time_based_secret) + protoAdapter.encodedSizeWithTag(1, cardProcessorDetails.processor_card_id) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CardProcessorDetails cardProcessorDetails = (CardProcessorDetails) obj;
        cardProcessorDetails.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = cardProcessorDetails.processor_card_id;
        byteString.getClass();
        return new CardProcessorDetails(str, null, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CardProcessorDetails cardProcessorDetails = (CardProcessorDetails) obj;
        cardProcessorDetails.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, cardProcessorDetails.processor_card_id);
        protoAdapter.encodeWithTag(protoWriter, 2, cardProcessorDetails.time_based_secret);
        protoWriter.writeBytes(cardProcessorDetails.unknownFields());
    }
}
