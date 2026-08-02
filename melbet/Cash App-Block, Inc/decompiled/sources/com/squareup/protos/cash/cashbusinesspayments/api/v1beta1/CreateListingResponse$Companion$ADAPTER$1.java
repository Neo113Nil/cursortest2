package com.squareup.protos.cash.cashbusinesspayments.api.v1beta1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CreateListingResponse$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CreateListingResponse((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        CreateListingResponse createListingResponse = (CreateListingResponse) obj;
        reverseProtoWriter.getClass();
        createListingResponse.getClass();
        reverseProtoWriter.writeBytes(createListingResponse.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, createListingResponse.listing_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, createListingResponse.listing_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CreateListingResponse createListingResponse = (CreateListingResponse) obj;
        createListingResponse.getClass();
        int size$okio = createListingResponse.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, createListingResponse.listing_url) + protoAdapter.encodedSizeWithTag(1, createListingResponse.listing_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CreateListingResponse createListingResponse = (CreateListingResponse) obj;
        createListingResponse.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = createListingResponse.listing_token;
        String str2 = createListingResponse.listing_url;
        byteString.getClass();
        return new CreateListingResponse(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CreateListingResponse createListingResponse = (CreateListingResponse) obj;
        createListingResponse.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, createListingResponse.listing_token);
        protoAdapter.encodeWithTag(protoWriter, 2, createListingResponse.listing_url);
        protoWriter.writeBytes(createListingResponse.unknownFields());
    }
}
