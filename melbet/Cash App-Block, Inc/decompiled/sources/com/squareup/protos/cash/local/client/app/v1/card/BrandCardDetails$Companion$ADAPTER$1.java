package com.squareup.protos.cash.local.client.app.v1.card;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BrandCardDetails$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new BrandCardDetails((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
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
        BrandCardDetails brandCardDetails = (BrandCardDetails) obj;
        reverseProtoWriter.getClass();
        brandCardDetails.getClass();
        reverseProtoWriter.writeBytes(brandCardDetails.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, brandCardDetails.attribution_key);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, brandCardDetails.location_token);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, brandCardDetails.brand_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BrandCardDetails brandCardDetails = (BrandCardDetails) obj;
        brandCardDetails.getClass();
        int size$okio = brandCardDetails.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, brandCardDetails.attribution_key) + protoAdapter.encodedSizeWithTag(2, brandCardDetails.location_token) + protoAdapter.encodedSizeWithTag(1, brandCardDetails.brand_token) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BrandCardDetails brandCardDetails = (BrandCardDetails) obj;
        brandCardDetails.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = brandCardDetails.brand_token;
        String str2 = brandCardDetails.location_token;
        String str3 = brandCardDetails.attribution_key;
        byteString.getClass();
        return new BrandCardDetails(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BrandCardDetails brandCardDetails = (BrandCardDetails) obj;
        brandCardDetails.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, brandCardDetails.brand_token);
        protoAdapter.encodeWithTag(protoWriter, 2, brandCardDetails.location_token);
        protoAdapter.encodeWithTag(protoWriter, 3, brandCardDetails.attribution_key);
        protoWriter.writeBytes(brandCardDetails.unknownFields());
    }
}
