package com.squareup.protos.cash.shop.rendering.api;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class OfferMetadata$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new OfferMetadata((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        OfferMetadata offerMetadata = (OfferMetadata) obj;
        reverseProtoWriter.getClass();
        offerMetadata.getClass();
        reverseProtoWriter.writeBytes(offerMetadata.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, offerMetadata.offer_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, offerMetadata.boost_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        OfferMetadata offerMetadata = (OfferMetadata) obj;
        offerMetadata.getClass();
        int size$okio = offerMetadata.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, offerMetadata.offer_token) + protoAdapter.encodedSizeWithTag(1, offerMetadata.boost_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        OfferMetadata offerMetadata = (OfferMetadata) obj;
        offerMetadata.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = offerMetadata.boost_token;
        String str2 = offerMetadata.offer_token;
        byteString.getClass();
        return new OfferMetadata(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        OfferMetadata offerMetadata = (OfferMetadata) obj;
        offerMetadata.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, offerMetadata.boost_token);
        protoAdapter.encodeWithTag(protoWriter, 2, offerMetadata.offer_token);
        protoWriter.writeBytes(offerMetadata.unknownFields());
    }
}
